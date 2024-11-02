package com.pe.platform.vehicle.domain.model.aggregates;

import com.pe.platform.vehicle.domain.model.commands.CreateVehicleCommand;
import com.pe.platform.vehicle.domain.model.commands.UpdateVehicleCommand;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import java.time.LocalDateTime;

@Getter
@Setter
@Entity
@EntityListeners(AuditingEntityListener.class)
public class Vehicle {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private String phone;

    @Column(nullable = false)
    private String email;

    @Column(nullable = false)
    private String brand;

    @Column(nullable = false)
    private String model;

    @Column(nullable = false)
    private String color;

    @Column(nullable = false)
    private String year;

    @Column(nullable = false)
    private double price;

    @Column(nullable = false)
    private String transmission;

    @Column(nullable = false)
    private String engine;

    @Column(nullable = false)
    private double mileage;

    @Column(nullable = false)
    private String doors;

    @Column(nullable = false)
    private String plate;

    @Column(nullable = false)
    private String location;

    @Column(nullable = false)
    private String description;

    @Column(nullable = false, columnDefinition = "LONGTEXT")
    private String image;

    @Column(nullable = false)
    private String fuel;

    @Column(nullable = false)
    private int speed;

    @Column(nullable = false)
    private long profileId;

    @CreatedDate
    @Column(updatable = false)
    private LocalDateTime createdDate;

    @LastModifiedDate
    private LocalDateTime lastModifiedDate;

    protected Vehicle() {}


    public Vehicle(CreateVehicleCommand command) {
        this.name = command.name();
        this.phone = command.phone();
        this.email = command.email();
        this.brand = command.brand();
        this.model = command.model();
        this.color = command.color();
        this.year = command.year();
        this.price = command.price();
        this.transmission = command.transmission();
        this.engine =  command.engine();
        this.mileage = command.mileage();
        this.doors =   command.doors();
        this.plate =   command.plate();
        this.location = command.location();
        this.description = command.description();
        this.image = command.image();
        this.fuel = command.fuel();
        this.speed = command.speed();
    }


    public Vehicle updateVehicleInfo(UpdateVehicleCommand command) {
        this.name = command.name();
        this.phone = command.phone();
        this.email = command.email();
        this.brand = command.brand();
        this.model = command.model();
        this.color = command.color();
        this.year = command.year();
        this.price = command.price();
        this.transmission = command.transmission();
        this.engine =  command.engine();
        this.mileage = command.mileage();
        this.doors =   command.doors();
        this.plate =   command.plate();
        this.location = command.location();
        this.description = command.description();
        this.image = command.image();
        this.fuel = command.fuel();
        this.speed = command.speed();

        return null;
    }

    public void setProfileId(long profileId) {
        this.profileId = profileId;
    }


    public long getUserId() {
        return profileId;
    }

    public int getId() {
        return id;
    }
}