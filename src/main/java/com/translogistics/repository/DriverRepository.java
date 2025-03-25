package com.translogistics.repository;

import com.translogistics.model.Driver;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.Optional;

@Repository
public interface DriverRepository extends JpaRepository<Driver, Long> {

    // Find a driver by ID number
    Optional<Driver> findByIdNumber(String idNumber);

    // Check if a driver exists by ID number
    boolean existsByIdNumber(String idNumber);

    // Check if a driver exists by license number
    boolean existsByLicenseNumber(String licenseNumber);
}
