package com.translogistics.service;

import com.translogistics.model.Vehicle;
import java.util.List;
import java.util.Optional;

/**
 * Interface that defines the business logic for Vehicle operations.
 */
public interface VehicleService {
    Vehicle saveVehicle(Vehicle vehicle); // Save a new vehicle
    List<Vehicle> getAllVehicles(); // Retrieve all vehicles
    Optional<Vehicle> getVehicleById(Long id); // Find a vehicle by ID
    Vehicle updateVehicle(Long id, Vehicle vehicle); // Update vehicle details
    void deleteVehicle(Long id); // Delete a vehicle
}
