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
                    2,
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
                vehicle1.setName(vehicle.getName());
                vehicle1.setColor(vehicle.getColor());
                vehicle1.setMake(vehicle.getMake());

                return "Vehicle updated";
            }
        }

        return "Vehicle not found!";
    }

    public String vehiclePatchUpdate(int id, Vehicle vehicle) {
        for (Vehicle vehicle1 : vehicles) {
            if (vehicle1.getId() == id) {

                if(vehicle1.getName() != null) {
                    vehicle1.setName(vehicle.getName());
                }
                if(vehicle1.getColor() != null) {
                    vehicle1.setColor(vehicle.getColor());
                }
                if(vehicle1.getMake() != null) {
                    vehicle1.setMake(vehicle.getMake());
                }

                return "Vehicle patched successfully";
            }
        }

        return "Vehicle not found!";
    }

}
