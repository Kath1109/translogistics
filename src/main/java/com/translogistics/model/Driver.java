package com.translogistics.model;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;

@Entity
@Table(name = "conductores")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Driver {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String nombreCompleto;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private TipoIdentificacion tipoIdentificacion; // C.C / C.E

    @Column(nullable = false, unique = true)
    private String numeroIdentificacion;

    @Column(nullable = false, unique = true)
    private String numeroLicencia;

    @Column(nullable = false)
    private LocalDate fechaVencimientoLicencia;

    @Column(nullable = false)
    private int añosExperiencia;

    @Lob
    @Column(nullable = true)
    private byte[] fotoLicencia; // Formato JPEG/PNG (opcional)
}
