package Airplans;

public class AirplaneTwo extends AirplaneOne {
    // Оголошуємо приватні поля класу AirplaneTwo для швидкості, пасажирів і моделі літака
    public double speed;
    public int passenger;
    public String model;
    // Конструктор класу
    public AirplaneTwo(double speed, int passenger, String model) {
        // Викликаємо конструктор  класу AirplaneOne
        super(speed, passenger, model);
    }
    @Override //перевизначення
    public void Information() {
        System.out.println("AirplaneTwo - Model: " + model + ", Speed: " + speed + " km/h, Passengers: " + passenger);
    }
    // Метод для обчислення витрат пального на певну відстань
    public double calculateFuelConsumption(double distance) {
        return distance / (double) speed;
    }
    // Метод для обчислення часу подорожі на певну відстань
    public double calculateTravelTime(double distance) {
        return distance / (speed * 1.2);
    }
    // Рекурсивний метод для виводу рядка
        public void Recursively(int count){
            if (count <= 0) {
                return;
            }
            Information();
            Recursively(count - 1);// Рекурсивний виклик методу зі зменшеним значенням count
    }
}
