package com.database.connection.domain;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "User")
public class User {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "idUser")
  private int userId;

  @NotNull
  @Column(name = "username")
  private String username;

  @NotNull
  @Email
  @Column(name = "email")
  private String email;

  @Column(name = "contact")
  private int contact;

  @ManyToOne
  @JoinColumn(name = "Address_idAddress")
  private Address address;

  public String getUsername() {
    return username;
  }

  public void setUsername(String username) {
    this.username = username;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public int getContact() {
    return contact;
  }

  public void setContact(int contact) {
    this.contact = contact;
  }

  public Address getAddress() {
    return address;
  }

  public void setAddress(Address address) {
    this.address = address;
  }

  @Override
  public String toString() {
    return "User{" +
        "userId=" + userId +
        ", username='" + username + '\'' +
        ", email=" + email +
        ", contact=" + contact +
        ", address=" + address +
        '}';
  }
}
