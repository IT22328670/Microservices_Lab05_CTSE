package com.example.item_service;

import org.springframework.http.*;
import org.springframework.web.bind.annotation.*;
import java.util.*;

@RestController
@RequestMapping("/items")

public class ItemController {
    private List<String> items = new ArrayList<>(List.of("Books","Laptop","Phone"));

    @GetMapping
    public List<String> getItems() {
        return items;
    }

    @PostMapping
    public ResponseEntity<String> addItem(@RequestBody String item) {
        items.add(item);
        return ResponseEntity.status(HttpStatus.CREATED)
                .body("Added "+item);
    }

    @GetMapping("/{id}")
    public ResponseEntity<?> getItem(@PathVariable int id) {
        if(id<0 ||id>=items.size())
            return ResponseEntity.notFound().build();

        return ResponseEntity.ok(items.get(id));
    }
}
