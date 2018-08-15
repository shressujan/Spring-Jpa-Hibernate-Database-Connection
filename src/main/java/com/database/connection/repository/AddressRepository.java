package com.database.connection.repository;

import com.database.connection.domain.Address;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface AddressRepository extends CrudRepository<Address, Integer> {

  @Query(name = "createAddress", nativeQuery = true)
  Address createAddress(@Param("idAddress") int idAddress, @Param("address1") String address1, @Param("address2") String address2, @Param("idZipCode") int idZipCode);

  @Query(name = "findAllAddresses")
  List<Address> findAllAddresses();

  @Query(name = "findAllAddressesByZipCode")
  List<Address> findAllAddressesByZipCode(@Param("idZipCode") int idZipCode);

  @Query(name = "findAddress")
  Address findAddress(@Param("idAddress") String idAddress);

  @Query(name = "updateAddress")
  Address updateAddress(@Param("idAddress") String idAddress);

  @Query(name = "deleteAddress")
  void delteAddress(@Param("idAddress") String idAddress);
}
