package com.translogistics.service;

import com.translogistics.model.Driver;
import java.util.List;
import java.util.Optional;

/**
 * Service interface for handling driver-related operations.
 */
public interface DriverService {
    List<Driver> getAllDrivers();
    Optional<Driver> getDriverById(Long id);
    Driver createDriver(Driver driver);
    void deleteDriver(Long id);
}
