package com.translogistics.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import java.time.LocalDate;

/**
 * Entity class representing a Driver.
 */
@Entity
@Getter
@Setter
@Table(name = "drivers")
public class Driver {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id; // Unique identifier

    @Column(nullable = false)
    private String fullName; // Full name of the driver

    @Column(nullable = false)
    private String idType; // Identification type (C.C or C.E)

    @Column(nullable = false, unique = true)
    private String idNumber; // Unique identification number

    @Column(nullable = false, unique = true)
    private String licenseNumber; // Unique driver’s license number

    @Column(nullable = false)
    private LocalDate licenseExpiration; // Expiration date of the license

    @Column(nullable = false)
    private Integer yearsExperience; // Years of driving experience

    @Lob
    private byte[] licensePhoto; // Optional license photo (JPEG/PNG)
}
