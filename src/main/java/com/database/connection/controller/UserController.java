package com.database.connection.controller;

import com.database.connection.dao.UserDao;
import com.database.connection.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/")
public class UserController {

  private final UserService userService;

  @Autowired
  public UserController(UserService userService) {
    this.userService = userService;
  }

  @GetMapping("/list")
  public String list(Model model) {
    model.addAttribute("users", userService.findAllUsers());
    return "list";
  }

  @GetMapping("/get-user/{id}")
  public String getUser(@PathVariable(value = "id") int userId, Model model) {
    model.addAttribute("user", userService.findUser(userId));
    return "user";
  }

  @GetMapping("/add-user")
  public String addUserForm() {
    return "user";
  }

  @PostMapping("/add-user")
  public String addUserSubmit(@ModelAttribute UserDao userDao) {

    userService.createUser(userDao);
    return "redirect:/list";
  }

  @PostMapping("/search")
  public String searchUsersByUsername(@RequestParam(value = "username") String username, Model model) {
    System.out.println(username);
    System.out.println(userService.findUsersByUsername(username));
    model.addAttribute("users", userService.findUsersByUsername(username));
    return "list";
  }

  @PostMapping("delete-user/{id}")
  public String deleteUser(@PathVariable(value = "id") int userId) {
    userService.deleteUser(userId);
    return "redirect:/list";
  }

  @PostMapping("edit-user/{id}")
  public String editUser(UserDao userDao, @PathVariable(value = "id") int userId ) {
    userService.updateUser(userDao, userId);
    return "redirect:/list";
  }



}
