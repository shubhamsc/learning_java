/**
 * Vehicle
 *
 */ 
 class Vehicle {

}

class Bike extends Vehicle{

}
class Car extends Vehicle{

}

class VehicleTest{
  public static void main(String[] args) {
    Vehicle v= new Bike();
    Car c = (Car) v;
  }
}