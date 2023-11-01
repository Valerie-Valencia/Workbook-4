package org.example;

import java.util.ArrayList;
import java.util.List;

public class Dealership {
    String name;
    String address;
    String phone;
    ArrayList<Vehicle> inventory;

    // constructor
    public Dealership(String name, String address, String phone){
        this.name = name;
        this.address = address;
        this.phone = phone;
        this.inventory = new ArrayList<>();
    }

    // setters
    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    // getters


    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public String getPhone() {
        return phone;
    }

    // methods

    public List<Vehicle> getVehiclesByPrice(int min, int max){
        return null;
    }
    public List<Vehicle> getVehiclesByMakeModel(String make, String model){
        return null;
    }
    public List<Vehicle> getVehiclesByYear(int min, int max){
        return null;
    }
    public List<Vehicle> getVehicleByColor(String color){
        return null;
    }
    public List<Vehicle> getVehicleByMileage(int min, int max){
        return null;
    }
    public List<Vehicle> getVehicleByType(String vehicleType){
        return null;
    }
    public List<Vehicle> getAllVehicles(){
        return null;
    }
    public Vehicle addVehicle(Object vehicle){
        return null;
    }
    public void removeVehicle(Object vehicle){}

}
