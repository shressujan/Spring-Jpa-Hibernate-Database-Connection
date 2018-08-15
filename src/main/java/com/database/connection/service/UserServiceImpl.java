package com.database.connection.service;

import com.database.connection.dao.UserDao;
import com.database.connection.domain.User;
import com.database.connection.repository.UserRepository;

import javax.validation.constraints.NotNull;
import java.util.List;
import java.util.Optional;

public class UserServiceImpl implements UserService{

  private UserRepository userRepository;

  public UserServiceImpl(UserRepository userRepository) {
    this.userRepository = userRepository;
  }


  @Override
  public void createUser(@NotNull UserDao user) {

  }

  @Override
  public Optional<List<User>> findAllUsers() {
    return Optional.empty();
  }

  @Override
  public User findUser(@NotNull int userId) {
    return null;
  }

  @Override
  public Optional<List<User>> findUsersByUsername(@NotNull String username) {
    return Optional.empty();
  }

  @Override
  public Optional<List<User>> findUsersByAddress(@NotNull int idAddress) {
    return Optional.empty();
  }

  @Override
  public void updateUser(@NotNull int userId) {

  }

  @Override
  public void deleteUser(@NotNull int userId) {

  }
}
