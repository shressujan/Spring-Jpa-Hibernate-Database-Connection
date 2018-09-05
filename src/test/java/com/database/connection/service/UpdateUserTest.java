package com.database.connection.service;

import com.database.connection.dao.UserDao;
import com.database.connection.domain.User;
import com.database.connection.repository.UserRepository;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.stubbing.Answer;

import java.util.Optional;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.spy;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import static org.mockito.MockitoAnnotations.initMocks;

public class UpdateUserTest {

  @Mock
  private UserRepository userRepository;

  private UserService userService;

  @Before
  public void creatMock() {
    initMocks(this);
    userService = spy(new UserServiceImpl(userRepository));
  }

  public User defaultUser() {
    User user = Mockito.mock(User.class);
    user.setUsername("sujan");
    user.setEmail("hello@yahoo.com");
    user.setContact(1112325467);
    user.setAddress1("somewhere dr");
    user.setAddress2("some apt");
    user.setCity("city");
    user.setState("State");
    user.setZipCode(34231);

    return user;
  }


  @Test
  public void updateUserTest_Valid() {
    UserDao userDao = new UserDao();
    userDao.setUsername("sujan");
    userDao.setEmail("snoop@yahoo.com");
    userDao.setContact(1112325467);
    userDao.setAddress1("somewhere dr");
    userDao.setAddress2("some apt");
    userDao.setCity("city");
    userDao.setState("State");
    userDao.setZipCode(34231);

    Optional<User> userOptional = Optional.ofNullable(defaultUser());
    User user = userOptional.get();

    when(userRepository.findById(any())).thenReturn(userOptional);

    user.setEmail(userDao.getEmail()); /*Updating the email address*/

    when(userRepository.save(user)).then((Answer<User>) invocation -> {
      Object[] args = invocation.getArguments();
      return (User) args[0];
    });

    userService.updateUser(userDao, user.getUserId());

    verify(userRepository).save(user);
  }
}
