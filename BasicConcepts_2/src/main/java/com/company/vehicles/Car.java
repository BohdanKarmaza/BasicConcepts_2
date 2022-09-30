package com.company.vehicles;

import com.company.details.Engine;
import com.company.professions.Driver;

public class Car {
    public static String carBrand;
    public static String carClass;
    public static Driver driver;
    public static Engine engine;
    public static void start(){
        System.out.println("Let's go!");
    }
    public static void stop(){
        System.out.println("Stopping!");
    }
    public static void turnRight(){
        System.out.println("Turning right!");
    }
    public static void turnLeft(){
        System.out.println("Turning left!");
    }
    public static void getInfo(){
        System.out.println ("Car brand is " + Car.carBrand);
        System.out.println("Car class is " + Car.carClass);
        System.out.println("Car driver's full name is " + Car.driver.fullName);
        System.out.println("Car driver's age is " + Car.driver.age);
        System.out.println("Car driver's sex is " + Car.driver.sex);
        System.out.println("Car driver's driving experience is " + Car.driver.drivingExperience);
        System.out.println("Car engine's manufacturer is " + Car.engine.manufacturer);
        System.out.println("Car engine's capacity is " + Car.engine.capacity);
    }
}
