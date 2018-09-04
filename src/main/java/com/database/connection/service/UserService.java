package com.database.connection.service;

import com.database.connection.dao.UserDao;
import com.database.connection.domain.User;
import org.springframework.stereotype.Service;

import javax.validation.constraints.NotNull;
import java.util.List;

@Service
public interface UserService {
  void createUser(@NotNull UserDao user);
  List<User> findAllUsers();
  User findUser(@NotNull int userId);
  List<User> findUsersByUsername(@NotNull String username);
  void updateUser(@NotNull int userId);
  void deleteUser(@NotNull int userId);

}
