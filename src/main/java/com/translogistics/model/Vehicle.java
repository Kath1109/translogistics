package com.translogistics.model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "vehiculos")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Vehicle {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, unique = true)
    private String placa; // Formato: ABC-1234

    @Column(nullable = false)
    private String modelo;

    @Column(nullable = false)
    private int año; // Rango: 2000-2024

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private TipoVehiculo tipo; // Camión de carga / Vehículo de pasajeros

    @Column(nullable = false)
    private String estado = "Disponible"; // Valor por defecto
}
