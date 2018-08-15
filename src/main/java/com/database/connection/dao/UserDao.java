package com.database.connection.dao;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;

public class UserDao {

  @NotNull
  private String username;

  @NotNull
  private Email email;

  private int contact;

  @NotNull
  private AddressDao addressDao;

  public String getUsername() {
    return username;
  }

  public void setUsername(String username) {
    this.username = username;
  }

  public Email getEmail() {
    return email;
  }

  public void setEmail(Email email) {
    this.email = email;
  }

  public int getContact() {
    return contact;
  }

  public void setContact(int contact) {
    this.contact = contact;
  }

  public AddressDao getAddress() {
    return addressDao;
  }

  public void setAddress(AddressDao address) {
    this.addressDao= addressDao;
  }

  @Override
  public String toString() {
    return "UserDao{" +
        "username='" + username + '\'' +
        ", email=" + email +
        ", contact=" + contact +
        ", addressDao=" + addressDao +
        '}';
  }
}
