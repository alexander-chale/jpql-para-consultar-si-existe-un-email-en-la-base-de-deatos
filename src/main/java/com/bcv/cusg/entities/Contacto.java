package com.bcv.cusg.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(schema = "cusg", name = "contacto")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Contacto extends Base {

    private static final long serialVersionUID = 1L;

    @Id
    @Column(nullable = false, updatable = false)

    @GeneratedValue(strategy = GenerationType.SEQUENCE

    )
    private Long coContacto;

    @Column(nullable = false)
    private String inTpContacto;

    @Column(nullable = false, length = 100)
    private String txContacto;

}
