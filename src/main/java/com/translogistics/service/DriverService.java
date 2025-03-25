package com.translogistics.service;

import com.translogistics.model.Driver;
import java.util.List;
import java.util.Optional;

/**
 * Interface that defines the business logic for Driver operations.
 */
public interface DriverService {
    Driver saveDriver(Driver driver); // Save a new driver
    List<Driver> getAllDrivers(); // Retrieve all drivers
    Optional<Driver> getDriverById(Long id); // Find a driver by ID
    Driver updateDriver(Long id, Driver driver); // Update driver details
    void deleteDriver(Long id); // Delete a driver
}
