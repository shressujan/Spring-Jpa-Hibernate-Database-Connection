package com.database.connection.dao;

import javax.validation.constraints.NotNull;

public class AddressDao {


  @NotNull
  private String address1;

  private String address2;

  @NotNull
  private ZipCodeDao zipCodeDao;

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

  public ZipCodeDao getZipCodeDao() {
    return zipCodeDao;
  }

  public void setZipCodeDao(ZipCodeDao zipCodeDao) {
    this.zipCodeDao = zipCodeDao;
  }

  @Override
  public String toString() {
    return "AddressDao{" +
        "address1='" + address1 + '\'' +
        ", address2='" + address2 + '\'' +
        ", zipCodeDao=" + zipCodeDao +
        '}';
  }
}
