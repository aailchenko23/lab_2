package Airplans;

public class AirplaneThree {
    //змінні екземпляра класу
    public double speed;
    public int passenger;
    public String model;
    //генерований конструктор
    public AirplaneThree(double speed, int passenger, String model) {
        this.speed = speed;
        this.passenger = passenger;
        this.model = model;
    }
    //перевизначення конструктора 4-ма довільними варіантами
    // Конструктор, який приймає швидкість і кількість пасажирів, а модель задається за замовчуванням
    public AirplaneThree(double speed, int passenger) {
        this(speed, passenger, "Boeing 747");
    }

    public AirplaneThree(double speed) {
        this(speed, 400, "Airbus A380");
    }

    public AirplaneThree() {
        this(1000, 200, "Boeing 777");
    }
    // Метод для виведення інформації про літак
    public void Information() {
        System.out.println("AirplaneThree - Model: " + model + ", Speed: " + speed + " km/h, Passengers: " + passenger);
    }
    // Метод для розрахунку часу подорожі на певну відстань
    public double calculateTravelTime(double distance) {
        return distance / (speed * 0.8);
    }
}
