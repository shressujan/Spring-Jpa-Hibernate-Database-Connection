package com.database.connection.service;

import com.database.connection.dao.UserDao;
import com.database.connection.domain.User;
import com.database.connection.exception.UserNotFoundException;
import com.database.connection.repository.UserRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.validation.constraints.NotNull;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class UserServiceImpl implements UserService{

  private UserRepository userRepository;
  private Logger logger = LoggerFactory.getLogger(UserServiceImpl.class);

  @Autowired
  public UserServiceImpl(UserRepository userRepository) {
    this.userRepository = userRepository;
  }


  @Override
  public void createUser(@NotNull UserDao userDao) {
    logger.info("Attempting to create the user: {}", userDao);
    User user = new User(userDao.getUsername(), userDao.getEmail(), userDao.getContact(), userDao.getAddress1(), userDao.getAddress2(), userDao.getCity(), userDao.getState(), userDao.getZipCode());

    userRepository.save(user);
    logger.info("User with id: {} created", user.getUserId());
  }

  @Override
  public List<User> findAllUsers() {
    logger.info("Attempting to find the users");
    List<User> users = userRepository.findAll();
    if(users.isEmpty()) {
      users =new ArrayList<>();
    }
    return users;
  }

  @Override
  public User findUser(@NotNull int userId) {
    logger.info("Attempting to find the user with id: {}", userId);
    Optional<User> userOptional = userRepository.findById(userId);
    if(userOptional.isPresent()) {
      logger.info("User with id: {} found", userId);
      return userOptional.get();
    }
    throw new UserNotFoundException(String.format("User with userId: %d not found!!", userId));
  }

  @Override
  public List<User> findUsersByUsername(String username) {
    return userRepository.findUsersByUsername(username);
  }

  @Override
  public void updateUser(@NotNull UserDao userDao, @NotNull int userId) {
    logger.info("Attempting to update the user with id: {}", userId);
    User user = findUser(userId);
    user.setUsername(userDao.getUsername());
    user.setEmail(userDao.getEmail());
    user.setContact(userDao.getContact());
    user.setAddress1(userDao.getAddress1());
    user.setAddress2(userDao.getAddress2());
    user.setCity(userDao.getCity());
    user.setState(userDao.getState());
    user.setZipCode(userDao.getZipCode());

    userRepository.save(user);

    logger.info("User with id: {} updated", user.getUserId());
  }

  @Override
  public void deleteUser(@NotNull int userId) {
    User user = findUser(userId);
    logger.info("Attempting to delete the user with id: {}", userId);
    userRepository.delete(user);
    logger.info("User with id: {} deleted", userId);
  }
}
