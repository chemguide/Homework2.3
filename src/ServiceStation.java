public class ServiceStation {
    public void check(Car car) {
        System.out.println("Обслуживаем " + car.getModelName());
        this.motorComplect(car);
    }

    public void check(Bicycle bicycle) {
        System.out.println("Обслуживаем " + bicycle.getModelName());
        this.updateTyre(bicycle);
    }

    public void check(Truck truck) {
        System.out.println("Обслуживаем " + truck.getModelName());
        this.motorComplect(truck);
        this.checkTrailer();
    }

    public void updateTyre(Transport transport) {
        for (int i = 0; i < transport.getWeelsCount(); i++) {
            System.out.println("Меняем покрышку");
        }
    }

    public void motorComplect(Transport transport) {
        updateTyre(transport);
        System.out.println("Проверяем двигатель");
    }

    public void checkTrailer() {
        System.out.println("Проверяем прицеп");
    }
}
