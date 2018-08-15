package com.database.connection.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/")
public class Home {

  public Home() {
  }

  @GetMapping("/list")
  public String list(Model model) {

    return "list";
  }

  @GetMapping("/get-user/{id}")
  public String getUser(@PathVariable(value = "id") String userId, Model model) {
    return "user";
  }

  @GetMapping("/add-user")
  public String addUserForm() {
    return "user";
  }

  @PostMapping("/add-user/{id}")
  public String addUserSubmit() {
    return "redirect:/list";
  }

  @PutMapping("delete-user/{id}")
  public String deleteUser(@PathVariable(value = "id") String userId) {
    return "redirect:/list";
  }

  @PutMapping("edit-user/{id}")
  public String editUser(@PathVariable(value = "id") String userId) {
    return "getUser";
  }



}
