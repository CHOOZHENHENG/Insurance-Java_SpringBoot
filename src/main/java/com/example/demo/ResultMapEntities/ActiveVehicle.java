package com.example.demo.ResultMapEntities;

import lombok.Data;

@Data
public class ActiveVehicle {
    private String vehicleNumberPlate;
    private int year;
    private String make;
    private String model;
    private String color;
    private int mileage;
    private String active;
}
