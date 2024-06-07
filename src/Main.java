public class Main {
    public static void main(String[] args) {
        Car car = new Car("car1", 4);
        Car car2 = new Car("car2", 4);

        Truck truck = new Truck("truck1", 6);
        Truck truck2 = new Truck("truck2", 8);

        Bicycle bicycle = new Bicycle("bicycle1", 2);
        Bicycle bicycle2 = new Bicycle("bicycle2", 2);

        ServiceStation service = new ServiceStation();
        service.check(car);
        service.check(car2);

        service.check(truck);
        service.check(truck2);

        service.check(bicycle);
        service.check(bicycle2);
    }
}