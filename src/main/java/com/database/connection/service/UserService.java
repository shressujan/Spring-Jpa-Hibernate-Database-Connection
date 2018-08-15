package com.database.connection.service;

import com.database.connection.dao.UserDao;
import com.database.connection.domain.User;

import javax.validation.constraints.NotNull;
import java.util.List;
import java.util.Optional;

public interface UserService {
  void createUser(@NotNull UserDao user);
  Optional<List<User>> findAllUsers();
  User findUser(@NotNull int userId);
  Optional<List<User>> findUsersByUsername(@NotNull String username);
  Optional<List<User>> findUsersByAddress(@NotNull int idAddress);
  void updateUser(@NotNull int userId);
  void deleteUser(@NotNull int userId);

}
