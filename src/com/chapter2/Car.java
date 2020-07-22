package com.chapter2;
/*Create a class called Clock that includes three instance variables - a model (type string), a year (type String),
and a price (double). Provide a constructor that initializes the three instance variables. provide a set and a get
method for each instance variable. if the price is not positive, do not set its value. Write a test application named
CarTest that demonstrate class car's capabilities. Create two  Car objects and display each object's price.
Then apply 5% discount on the price of the car and a 7% on the price of the second. display each Car's price again.

 */

public class Car {
    private String carModel;
    private String carYear;
    private double carPrice;

    public Car(String carModel, String carYear, double carPrice) {
        this.carModel = carModel;
        this.carYear = carYear;

        if(carPrice<0){
            carPrice =0;
        }
        else {
            this.carPrice = carPrice;
        }
    }

    public Car() {
    }

    public String getCarModel() {
        return carModel;
    }

    public void setCarModel(String carModel) {
        this.carModel = carModel;
    }

    public String getCarYear() {
        return carYear;
    }

    public void setCarYear(String carYear) {
        this.carYear = carYear;
    }

    public double getCarPrice() {
        return carPrice;
    }

    public void setCarPrice(double carPrice) {
        if(carPrice<0){
            carPrice =0;
        }
        else {
            this.carPrice = carPrice;
        }
    }

    public double discountedPrice(int discount) {
        return carPrice - (carPrice * discount/100);
    }
}
