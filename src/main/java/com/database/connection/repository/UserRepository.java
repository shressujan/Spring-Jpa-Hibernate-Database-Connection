package com.database.connection.repository;

import com.database.connection.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {
  @Query(nativeQuery = true, name = "findUsersByUsername")
  List<User> findUsersByUsername(@Param(value ="username") String username);
}
