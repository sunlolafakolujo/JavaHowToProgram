package com.chapter2;
/*Create a class called PetrolPurchase to represent information about the petrol you purchase.
 The class should include five pieces of information in the form of instance variables - the station's location
 (type String), the type of petrol (type String), the quantity (type int) of the purchase in litres, the price per litre
 (double), the percentage discount. Your class should have a constructor that initializes the five instance variables. Provide a set and get method
 for each  instance variable. In addition, provide a method named getPurchaseAmount that calculate the net purchase amount
 (i.e., multiplies the quantity by the price per litre) minus the discount, then returns the net amount you had to pay as a double
 value. write an application class named petrol that demonstrates the capabilities of class PetrolPurchase.
 */

public class PetrolPurchase {
    private String petrolStationLocation;
    private String typeOfPetrol;
    private int petrolQuantity;
    private double petrolPrice;
    private double percentageDiscount;

    public PetrolPurchase(String petrolStationLocation, String typeOfPetrol, int petrolQuantity, double petrolPrice, double percentageDiscount) {
        this.petrolStationLocation = petrolStationLocation;
        this.typeOfPetrol = typeOfPetrol;
        if(petrolQuantity >0) {
            this.petrolQuantity = petrolQuantity;
        }
        if(petrolPrice > 0) {
            this.petrolPrice = petrolPrice;
        }
        this.percentageDiscount =percentageDiscount;
    }

    public PetrolPurchase() {

    }

    public String getPetrolStationLocation() {
        return petrolStationLocation;
    }

    public void setPetrolStationLocation(String petrolStationLocation) {
        this.petrolStationLocation = petrolStationLocation;
    }

    public String getTypeOfPetrol() {
        return typeOfPetrol;
    }

    public void setTypeOfPetrol(String typeOfPetrol) {
        this.typeOfPetrol = typeOfPetrol;
    }

    public int getPetrolQuantity() {
        return petrolQuantity;
    }

    public void setPetrolQuantity(int petrolQuantity) {
        if(petrolQuantity >0)
        this.petrolQuantity = petrolQuantity;
    }

    public double getPetrolPrice() {
        return petrolPrice;
    }

    public void setPetrolPrice(double petrolPrice) {

        if(petrolPrice >0)
        this.petrolPrice = petrolPrice;
    }

    public double getPercentageDiscount() {
        return percentageDiscount;
    }

    public void setPercentageDiscount(double percentageDiscount) {
        this.percentageDiscount = percentageDiscount;
    }

    public double getPurchasedAmount() {

        return (petrolQuantity * petrolPrice)-(petrolQuantity * petrolPrice * percentageDiscount/100);
    }


}
