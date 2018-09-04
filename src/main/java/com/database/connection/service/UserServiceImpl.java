package com.database.connection.service;

import com.database.connection.dao.UserDao;
import com.database.connection.domain.User;
import com.database.connection.exception.UserNotFoundException;
import com.database.connection.repository.UserRepository;

import javax.validation.constraints.NotNull;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class UserServiceImpl implements UserService{

  private UserRepository userRepository;

  public UserServiceImpl(UserRepository userRepository) {
    this.userRepository = userRepository;
  }


  @Override
  public void createUser(@NotNull UserDao userDao) {
    User user = new User();
    user.setUsername(userDao.getUsername());
    user.setEmail(userDao.getEmail());
    user.setContact(userDao.getContact());
    user.setAddress1(userDao.getAddress1());
    user.setAddress2(userDao.getAddress2());
    user.setCity(userDao.getCity());
    user.setState(userDao.getState());
    user.setZipCode(userDao.getZipCode());

    userRepository.save(user);
  }

  @Override
  public List<User> findAllUsers() {
    List<User> users = (List) userRepository.findAll();
    if(users.isEmpty()) {
      users =new ArrayList<>();
    }
    return users;
  }

  @Override
  public User findUser(@NotNull int userId) {
    Optional<User> userOptional = userRepository.findById(userId);
    if(userOptional.isPresent()) {
      return userOptional.get();
    }
    throw new UserNotFoundException(String.format("User with userId: %d not found!!", userId));
  }

  @Override
  public List<User> findUsersByUsername(@NotNull String username) {
    return null;
  }

  @Override
  public void updateUser(@NotNull int userId) {

  }

  @Override
  public void deleteUser(@NotNull int userId) {

  }
}
