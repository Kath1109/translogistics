package com.translogistics.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

/**
 * Entity representing a vehicle in the transportation system.
 */
@Entity
@Getter
@Setter
@Table(name = "vehicles")
public class Vehicle {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(unique = true, nullable = false)
    private String plate; // License plate (format: ABC-1234)

    @Column(nullable = false)
    private String model; // Model of the vehicle

    @Column(nullable = false)
    private int year; // Year of manufacture (2000-2024)

    @Column(nullable = false)
    @Enumerated(EnumType.STRING)
    private VehicleType type; // Type: Cargo Truck or Passenger Vehicle

    @Column(nullable = false)
    private String status = "Disponible"; // Default status: "Disponible"

    // Constructors
    public Vehicle() {
    }

    public Vehicle(String plate, String model, int year, VehicleType type) {
        this.plate = plate;
        this.model = model;
        this.year = year;
        this.type = type;
        this.status = "Disponible"; // Default value
    }
}
