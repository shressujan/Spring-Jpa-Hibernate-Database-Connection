package com.database.connection.repository;

import com.database.connection.domain.User;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface UserRepository extends CrudRepository<User, Integer> {

  @Query(nativeQuery = true, name = "createUser")
  User createUser(@Param("username") String username, @Param("email") String email, @Param("contact") int contact, @Param("idAddress") int idAddress);

  @Query(name = "findAllUsers")
  List<User> findAllUsers();

  @Query(name= "findUserById")
  User findUserById(@Param("userId") int userId);

  @Query(name= "findAllUsersByUserName")
  List<User> findUsersByUserName(@Param("username") String username);

  @Query(name= "findAllUsersByAddress")
  List<User> findUsersByAddress(@Param("idAddress") int idAddress);

  @Query(name= "updateUser")
  User updateUser(@Param("userId") int userId);

  @Query(name= "deleteUser")
  void deleteUser(@Param("userId") int userId);
}
