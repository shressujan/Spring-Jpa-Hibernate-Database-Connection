package com.database.connection.repository;

import com.database.connection.domain.ZipCode;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface ZipCodeRepository extends CrudRepository<ZipCode, Integer> {

  @Query(name = "createZipCode", nativeQuery = true)
  ZipCode createZipCode(@Param("idZipCode") int idZipCode,@Param("city") String city, @Param("state") String state);

  @Query(name = "findZipCode")
  ZipCode findZipCode(@Param("idZipCode") int idZipCode);

  @Query(name = "findAllZipCodes")
  List<ZipCode> findAllZipCodes();

  @Query(name = "updateZipCode")
  ZipCode updateZipCode(@Param("idZipCode") int idZipCode);

  @Query(name = "deleteZipCode")
  ZipCode deleteZipCode(@Param("idZipCode") int idZipCode);
}
