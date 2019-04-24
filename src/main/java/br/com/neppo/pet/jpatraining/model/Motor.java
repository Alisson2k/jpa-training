package br.com.neppo.pet.jpatraining.model;

import javax.persistence.*;

import java.io.Serializable;

@Entity
@Table( name = "MOTOR" )
public class Motor implements Serializable {

    @Id
    @Column( name = "ID" )
    private Long id;

    @Column( name = "POWER", length = 20, nullable = false )
    private String power;

    @OneToOne( mappedBy = "motor" )
    private Car car;
}
