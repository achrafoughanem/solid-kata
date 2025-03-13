package com.codurance.lsp;

public class FillingStation {

    public void refuel(Vehicle vehicle) {
        if (vehicle instanceof FuelVehicle) {
            ((FuelVehicle) vehicle).fillUpWithFuel();
        }
    }

    public void charge(Vehicle vehicle) {
        if (vehicle instanceof ElectricCar) {
            ((ElectricCar) vehicle).chargeBattery();
        }
    }
}
