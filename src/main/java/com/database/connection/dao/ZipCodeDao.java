package com.database.connection.dao;

import org.hibernate.validator.constraints.UniqueElements;

import javax.validation.constraints.NotNull;

public class ZipCodeDao {

  @NotNull
  @UniqueElements
  private int zipCode;

  @NotNull
  private String city;

  @NotNull
  private String state;

  public int getZipCode() {
    return zipCode;
  }

  public void setZipCode(int zipCode) {
    this.zipCode = zipCode;
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

  @Override
  public String toString() {
    return "ZipCodeDao{" +
        "zipCode=" + zipCode +
        ", city='" + city + '\'' +
        ", state='" + state + '\'' +
        '}';
  }
}
