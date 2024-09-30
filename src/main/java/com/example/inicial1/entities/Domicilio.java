package com.example.inicial1.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.envers.Audited;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Audited

public class Domicilio extends Base{
    private String calle;
    private int numero;

    @ManyToOne(optional = false) //la relacion no puede ser nula
    @JoinColumn(name = "fk_localidad")
    private Localidad localidad;
}
