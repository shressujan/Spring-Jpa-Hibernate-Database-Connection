package com.database.connection.service;

import com.database.connection.domain.User;
import com.database.connection.repository.UserRepository;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.Mockito;

import java.util.Optional;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.*;
import static org.mockito.MockitoAnnotations.initMocks;

public class DeleteUserTest {

  @Mock
  private UserRepository userRepository;

  private UserServiceImpl userService;

  @Before
  public void creatMock() {
    initMocks(this);
    userService = spy(new UserServiceImpl(userRepository));
  }

  public User defaultUser() {
    User user = Mockito.mock(User.class);
    user.setUsername("sujan");
    user.setEmail("something@yahoo.com");
    user.setContact(1112325467);
    user.setAddress1("somewhere dr");
    user.setAddress2("some apt");
    user.setCity("city");
    user.setState("State");
    user.setZipCode(34231);

    return user;
  }

  @Test
  public void deleteUserTest_Valid() {
    Optional<User> optionalUser = Optional.ofNullable(defaultUser());
    User user = optionalUser.get();

    when(userRepository.findById(any())).thenReturn(optionalUser);

    userService.deleteUser(user.getUserId());

    verify(userRepository).delete(user);


  }
}
