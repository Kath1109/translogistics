package com.translogistics.service;

import com.translogistics.model.Vehicle;
import com.translogistics.repository.VehicleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

/**
 * Implementation of the VehicleService interface.
 */
@Service
public class VehicleServiceImpl implements VehicleService {

    @Autowired
    private VehicleRepository vehicleRepository;

    @Override
    public Vehicle saveVehicle(Vehicle vehicle) {
        vehicle.setStatus("Disponible"); // Set initial status to "Disponible"
        return vehicleRepository.save(vehicle);
    }

    @Override
    public List<Vehicle> getAllVehicles() {
        return vehicleRepository.findAll();
    }

    @Override
    public Optional<Vehicle> getVehicleById(Long id) {
        return vehicleRepository.findById(id);
    }

    @Override
    public Vehicle updateVehicle(Long id, Vehicle updatedVehicle) {
        return vehicleRepository.findById(id).map(vehicle -> {
            vehicle.setPlate(updatedVehicle.getPlate());
            vehicle.setModel(updatedVehicle.getModel());
            vehicle.setYear(updatedVehicle.getYear());
            vehicle.setType(updatedVehicle.getType());
            return vehicleRepository.save(vehicle);
        }).orElseThrow(() -> new RuntimeException("Vehicle not found"));
    }

    @Override
    public void deleteVehicle(Long id) {
        vehicleRepository.deleteById(id);
    }
}
