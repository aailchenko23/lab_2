package Airplans;

public class AirplaneOne {
    //змінні екземпляра класу
    public double speed;
    public int passenger;
    public String model;

    //генерований конструктор
    public AirplaneOne(double speed, int passenger, String model) {
        this.speed = speed;
        this.passenger = passenger;
        this.model = model;
    }
    //виводить інформацію на консоль і не повертає жодного значення (void)
    public void Information() {
        System.out.println("AirplaneOne - Model: " + model + ", Speed: " + speed + " km/h, Passengers: " + passenger);
    }
    //типізований метод що повертає значення  результату  відстані
    public double calculateDistance(double time) {
        return speed * time;
    }

    //типізований метод що повертає значення результату часу в дорозі
    public double calculateTravelTime(double distance) {
        return distance / speed;
    }

    public void callMethod(AirplaneOne anotherAirplane) {
        anotherAirplane.method(); // Виклик методу на переданому екземплярі класу
    }

    public void method() {
        System.out.println("Method викликано в класі AirplaneOne.");
    }
    //призначений для виклику і виводу значення пасажирів іншого літака.
    public void callVariable(AirplaneOne anotherAirplane) {
        // Виклик змінної екземпляра класу, який передано в якості параметру
        int anotherPassenger = anotherAirplane.passenger;
        System.out.println("Змінна passenger іншого об'єкта: " + anotherPassenger);
    }
    //новий об'єкт класу з новими значеннями
    public AirplaneOne createNew(int newSpeed, int newPassenger, String newModel) {
        // Створення нового об'єкта класу AirplaneOne з новими значеннями
        AirplaneOne newAirplane = new AirplaneOne(newSpeed, newPassenger, newModel);
        return newAirplane;
    }
}
