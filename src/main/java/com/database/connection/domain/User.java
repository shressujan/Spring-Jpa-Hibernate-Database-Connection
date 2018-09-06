package com.database.connection.domain;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import java.math.BigInteger;

@Entity
@Table(name = "User_temp")
public class User {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY) /*always use IDENTITY because it will use the database resource to assign primary key*/
  @Column(name = "idUser")
  private int userId;

  @NotNull
  @Column(name = "username")
  private String username;

  @NotNull
  @Email
  @Column(name = "email")
  private String email;

  private BigInteger contact;

  private String address1;

  private String address2;

  private String city;

  private String state;

  @Column(name = "zipcode")
  private int zipCode;

  public User() {
  }

  public User(@NotNull String username, @NotNull @Email String email, BigInteger contact, String address1, String address2, String city, String state, int zipCode) {
    this.username = username;
    this.email = email;
    this.contact = contact;
    this.address1 = address1;
    this.address2 = address2;
    this.city = city;
    this.state = state;
    this.zipCode = zipCode;
  }

  public int getUserId() {
    return userId;
  }

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

  public void setContact(BigInteger contact) {
    this.contact = contact;
  }

  public BigInteger getContact() {
    return contact;
  }

  public String getAddress1() {
    return address1;
  }

  public void setAddress1(String address1) {
    this.address1 = address1;
  }

  public String getAddress2() {
    return address2;
  }

  public void setAddress2(String address2) {
    this.address2 = address2;
  }

  public String getCity() {
    return city;
  }

  public void setCity(String city) {
    this.city = city;
  }

  public String getState() {
    return state;
  }

  public void setState(String state) {
    this.state = state;
  }

  public int getZipCode() {
    return zipCode;
  }

  public void setZipCode(int zipCode) {
    this.zipCode = zipCode;
  }

  @Override
  public String toString() {
    return ReflectionToStringBuilder.toString(this, ToStringStyle.SHORT_PREFIX_STYLE);
  }
}
