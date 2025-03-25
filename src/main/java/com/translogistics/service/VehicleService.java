package com.translogistics.service;

import com.translogistics.model.Vehicle;
import java.util.List;
import java.util.Optional;

/**
 * Service interface for handling vehicle-related operations.
 */
public interface VehicleService {
    List<Vehicle> getAllVehicles();
    Optional<Vehicle> getVehicleById(Long id);
    Vehicle createVehicle(Vehicle vehicle);
    void deleteVehicle(Long id);
}
