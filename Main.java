package Airplans;

public class Main {
    public static void main(String[] args) {
        AirplaneOne airplaneOne = new AirplaneOne(800, 150, "Boeing 747");
        airplaneOne.callMethod(airplaneOne);
        airplaneOne.callVariable(airplaneOne);
        AirplaneOne newAirplane = airplaneOne.createNew(900, 200, "Airbus A380");
        AirplaneTwo airplaneTwo = new AirplaneTwo(900, 200, "Airbus A380");
        // Виклик рекурсивного методу для виводу рядка
        airplaneTwo.Recursively(3);
        // Створення об'єктів класу AirplaneThree з різними параметрами
        AirplaneThree airplaneThree = new AirplaneThree(1000, 180, "Boeing 777");
        AirplaneThree airplaneThree1 = new AirplaneThree(1000, 180, "Boeing 777");
        AirplaneThree airplaneThree2 = new AirplaneThree(1200, 200);
        AirplaneThree airplaneThree3 = new AirplaneThree(800);
        AirplaneThree airplaneThree4 = new AirplaneThree();
        //виклик всіх перевизначених та перевантажених методів
        airplaneOne.Information();
        System.out.println("Distance traveled: " + airplaneOne.calculateDistance(2) + " km");

        airplaneTwo.Information();
        System.out.println("Fuel consumption: " + airplaneTwo.calculateFuelConsumption(1000) + " liters");

        airplaneThree.Information();
        System.out.println("Travel time: " + airplaneThree.calculateTravelTime(1500) + " hours");
        airplaneOne.Information();
        System.out.println("Distance traveled: " + airplaneOne.calculateDistance(2) + " km");

        airplaneTwo.Information();
        System.out.println("Fuel consumption: " + airplaneTwo.calculateFuelConsumption(1000) + " liters");
        //Виклик конструктора 4-ма довільними варіантами
        airplaneThree1.Information();
        System.out.println("Travel time: " + airplaneThree1.calculateTravelTime(1500) + " hours");

        airplaneThree2.Information();
        System.out.println("Travel time: " + airplaneThree2.calculateTravelTime(1500) + " hours");

        airplaneThree3.Information();
        System.out.println("Travel time: " + airplaneThree3.calculateTravelTime(1500) + " hours");

        airplaneThree4.Information();
        System.out.println("Travel time: " + airplaneThree4.calculateTravelTime(1500) + " hours");

    }
}