package com.database.connection.domain;

import org.hibernate.engine.internal.Cascade;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "Address")
public class Address {

  @NotNull
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "idAddress")
  private int addressId;

  @Column(name = "address1")
  private String address1;

  @Column(name = "address2")
  private String address2;

  @ManyToOne( cascade = {CascadeType.PERSIST, CascadeType.MERGE, CascadeType.DETACH, CascadeType.REFRESH})
  @JoinColumn(name = "ZipCode_idZipCode")
  private ZipCode zipCode;

  @OneToMany(mappedBy = "Address",
      cascade = {CascadeType.PERSIST, CascadeType.MERGE, CascadeType.DETACH, CascadeType.REFRESH})
  private List<User> userList;

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

  public ZipCode getZipCode() {
    return zipCode;
  }

  public void setZipCode(ZipCode zipCode) {
    this.zipCode = zipCode;
  }

  public List<User> getUserList() {
    return userList;
  }

  public void addUser(User user) {
    if(userList == null) {
      userList = new ArrayList<>();
    }
    userList.add(user);
  }

  @Override
  public String toString() {
    return "Address{" +
        "addressId=" + addressId +
        ", address1='" + address1 + '\'' +
        ", address2='" + address2 + '\'' +
        ", zipCode=" + zipCode +
        '}';
  }
}
