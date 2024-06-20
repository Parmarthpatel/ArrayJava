package Inheritance;

import javax.imageio.plugins.bmp.BMPImageWriteParam;

public class Runtest {
    public static void main(String[] args) {
        System.out.println("Parent Class- Car");
        Car car= new Car();
        car.openCar();
        car.startEngine();
        car.driveCar();
        car.stopCar();
        car.lockCar();

        System.out.println("Child Class BMW");
        BMW bmw= new BMW();
        bmw.openCar();
        bmw.startEngine();
        bmw.driveCar();
        bmw.stopCar();
        bmw.lockCar();
        System.out.println("Child Class Honda");
        Honda honda= new Honda();
        honda.openCar();
        honda.startEngine();
        honda.driveCar();
        honda.stopCar();
        honda.lockCar();

        System.out.println("Child Class Tesla");
        Tesla tesla= new Tesla();
        tesla.openCar();
        tesla.startEngine();
        tesla.driveCar();
        tesla.stopCar();
        tesla.lockCar();

        System.out.println("Grand Parent Class Vehicle");
        Vehicle vehicle= new Vehicle();
        vehicle.numbersOfWheels();
        vehicle.speedOfVehicle();
        vehicle.parkingCharge();

        System.out.println("Parent Class Bike");
        Bike bike=new Bike();
        bike.numbersOfWheels();
        bike.speedOfVehicle();
        bike.parkingCharge();
    }
}
