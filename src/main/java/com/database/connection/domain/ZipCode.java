package com.database.connection.domain;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "ZipCode")
public class ZipCode {

  @NotNull
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "idZipCode")
  private int zipCode;

  @NotNull
  @Column(name = "city")
  private String city;

  @NotNull
  @Column(name = "state")
  private String state;

  @OneToMany(mappedBy = "ZipCode",
      cascade = {CascadeType.PERSIST, CascadeType.MERGE, CascadeType.DETACH, CascadeType.REFRESH})
  private List<Address> addressList;

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

  public List<Address> getAddressList() {
    return addressList;
  }

  /*Add convenience methods for bidirectional relation*/
  public void addAddress(Address address) {
    if(addressList == null) {
      addressList = new ArrayList<>();
    }
    addressList.add(address);
  }
}
