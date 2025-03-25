package com.translogistics.repository;

import com.translogistics.models.*;.Vehicle;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.Optional;

@Repository
public interface VehicleRepository extends JpaRepository<Vehicle, Long> {
    
    // Find a vehicle by license plate
    Optional<Vehicle> findByLicensePlate(String licensePlate);
    
    // Check if a vehicle exists by license plate
    boolean existsByLicensePlate(String licensePlate);
}
