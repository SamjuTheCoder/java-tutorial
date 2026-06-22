package com.example.demo.controllers;

import com.example.demo.model.Vehicle;
import com.example.demo.services.VehicleService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1")
public class VehicleController {

    private final VehicleService vehicleService;

    public VehicleController(VehicleService vehicleService) {
        this.vehicleService = vehicleService;
    }

    // list all the vehicles
    @GetMapping("/list-vehicles")
    public List<Vehicle> getVehicleService() {
        return vehicleService.getVehicles();
    }

    // update vehicles
    @PutMapping("/update/{id}")
    public String updateVehicles(@PathVariable int id, @RequestBody Vehicle vehicle) {
        return vehicleService.vehicleUpdate(id, vehicle);
    }

    // patch vehicles
    @PatchMapping("/patch/{id}")
    public String patchVehicles(@PathVariable int id, @RequestBody Vehicle vehicle) {
        return vehicleService.vehiclePatchUpdate(id, vehicle);
    }
}
