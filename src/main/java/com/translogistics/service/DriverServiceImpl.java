package com.translogistics.service;

import com.translogistics.model.Driver;
import com.translogistics.repository.DriverRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

/**
 * Implementation of the DriverService interface.
 */
@Service
public class DriverServiceImpl implements DriverService {

    @Autowired
    private DriverRepository driverRepository;

    @Override
    public Driver saveDriver(Driver driver) {
        return driverRepository.save(driver);
    }

    @Override
    public List<Driver> getAllDrivers() {
        return driverRepository.findAll();
    }

    @Override
    public Optional<Driver> getDriverById(Long id) {
        return driverRepository.findById(id);
    }

    @Override
    public Driver updateDriver(Long id, Driver updatedDriver) {
        return driverRepository.findById(id).map(driver -> {
            driver.setFullName(updatedDriver.getFullName());
            driver.setIdType(updatedDriver.getIdType());
            driver.setIdNumber(updatedDriver.getIdNumber());
            driver.setLicenseNumber(updatedDriver.getLicenseNumber());
            driver.setLicenseExpiration(updatedDriver.getLicenseExpiration());
            driver.setYearsExperience(updatedDriver.getYearsExperience());
            return driverRepository.save(driver);
        }).orElseThrow(() -> new RuntimeException("Driver not found"));
    }

    @Override
    public void deleteDriver(Long id) {
        driverRepository.deleteById(id);
    }
}
