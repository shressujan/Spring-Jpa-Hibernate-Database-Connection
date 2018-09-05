package com.database.connection.service;

import com.database.connection.dao.UserDao;
import com.database.connection.domain.User;

import javax.validation.constraints.NotNull;
import java.util.List;

public interface UserService {
  void createUser(@NotNull UserDao userDao);
  List<User> findAllUsers();
  User findUser(@NotNull int userId);
  List<User> findUsersByUsername(@NotNull String username);
  void updateUser(@NotNull UserDao userDao, int userId);
  void deleteUser(@NotNull int userId);

}
