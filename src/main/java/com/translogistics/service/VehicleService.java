package com.translogistics.service;

import com.translogistics.model.Vehicle;
import com.translogistics.repository.VehicleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

/**
 * Service class for handling vehicle-related business logic.
 */
@Service
public class VehicleService {

    @Autowired
    private VehicleRepository vehicleRepository;

    /**
     * Creates a new vehicle.
     * @param vehicle The vehicle to be created.
     * @return The saved vehicle.
     */
    public Vehicle createVehicle(Vehicle vehicle) {
        return vehicleRepository.save(vehicle);
    }

    /**
     * Retrieves all vehicles.
     * @return A list of vehicles.
     */
    public List<Vehicle> getAllVehicles() {
        return vehicleRepository.findAll();
    }

    /**
     * Retrieves a vehicle by its ID.
     * @param id The ID of the vehicle.
     * @return An Optional containing the vehicle if found.
     */
    public Optional<Vehicle> getVehicleById(Long id) {
        return vehicleRepository.findById(id);
    }

    /**
     * Updates an existing vehicle.
     * @param id The ID of the vehicle to update.
     * @param updatedVehicle The updated vehicle details.
     * @return The updated vehicle.
     */
    public Vehicle updateVehicle(Long id, Vehicle updatedVehicle) {
        return vehicleRepository.findById(id).map(vehicle -> {
            vehicle.setPlate(updatedVehicle.getPlate());
            vehicle.setModel(updatedVehicle.getModel());
            vehicle.setYear(updatedVehicle.getYear());
            vehicle.setType(updatedVehicle.getType());
            vehicle.setStatus(updatedVehicle.getStatus());
            return vehicleRepository.save(vehicle);
        }).orElseThrow(() -> new RuntimeException("Vehicle not found"));
    }

    /**
     * Deletes a vehicle by its ID.
     * @param id The ID of the vehicle to delete.
     */
    public void deleteVehicle(Long id) {
        vehicleRepository.deleteById(id);
    }
}
