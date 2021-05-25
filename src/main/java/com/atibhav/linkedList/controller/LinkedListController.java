package com.atibhav.linkedList.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LinkedListController {

    @GetMapping("/count")
    int countNodes(){
        return 0;
    }
}
