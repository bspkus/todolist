package com.tw.todolistservice.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TodolistController {

  @GetMapping(value = "/heartbeat")
  public ResponseEntity<String> postTodo() {
    return ResponseEntity.ok().body("hello world!");
  }
}
