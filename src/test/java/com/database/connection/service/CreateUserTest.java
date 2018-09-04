package com.database.connection.service;

import com.database.connection.dao.UserDao;
import com.database.connection.domain.User;
import com.database.connection.repository.UserRepository;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.stubbing.Answer;

import static org.mockito.Mockito.*;
import static org.mockito.MockitoAnnotations.initMocks;

public class CreateUserTest {

  @Mock
  private UserRepository userRepository;

  private UserService userService;

  @Before
  public void creatMocks() {
    initMocks(this);
    userService = spy(new UserServiceImpl(userRepository));
  }

  public User defaultUser() {
    User user = Mockito.mock(User.class);
    user.setUsername("sujan");
    user.setEmail("snoop@yahoo.com");
    user.setContact(1112325467);
    user.setAddress1("somewhere dr");
    user.setAddress2("some apt");
    user.setCity("city");
    user.setState("State");
    user.setZipCode(34231);

    return user;
  }

  @Test
  public void createUser_Valid() {

    UserDao userDao = new UserDao();
    userDao.setUsername("sujan");
    userDao.setEmail("snoop@yahoo.com");
    userDao.setContact(1112325467);
    userDao.setAddress1("somewhere dr");
    userDao.setAddress2("some apt");
    userDao.setCity("city");
    userDao.setState("State");
    userDao.setZipCode(34231);

    User user = defaultUser();
    when(userRepository.save(user)).then((Answer<User>) invocation -> {
      Object[] args = invocation.getArguments();
      return (User) args[0];
    });
    userService.createUser(userDao);

    verify(userRepository.save(user));
  }


}
