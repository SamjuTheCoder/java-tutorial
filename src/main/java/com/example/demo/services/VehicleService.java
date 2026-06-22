package com.example.demo.services;

import com.example.demo.model.Vehicle;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class VehicleService {

    private List<Vehicle> vehicles = new ArrayList<Vehicle>();

    public VehicleService() {
        vehicles.add(
                new Vehicle(
                        1,
                        "Toyota",
                        "Green",
                        "Camry"
                )
        );
        vehicles.add(
                new Vehicle(
                    1,
                    "Mercedes",
                    "White",
                    "GLK"
                )
        );
    }

    public List<Vehicle> getVehicles() {
        return vehicles;
    }

    public String vehicleUpdate(int id, Vehicle vehicle) {
        for (Vehicle vehicle1 : vehicles) {
            if (vehicle1.getId() == id) {
                vehicle1.setName(vehicle1.getName());
                vehicle1.setColor(vehicle1.getColor());
                vehicle1.setMake(vehicle1.getMake());

                return "Vehicle updated";
            }
        }

        return "Vehicle not found!";
    }

}
