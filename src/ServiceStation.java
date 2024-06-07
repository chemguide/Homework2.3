public class ServiceStation {
    public void check(Car car) {
        this.motorComplect(car);
    }

    public void check(Bicycle bicycle) {
        this.updateTyre(bicycle);
    }

    public void check(Truck truck) {
        this.motorComplect(truck);
        this.checkTrailer();
    }

    public void updateTyre(Transport transport) {
        System.out.println("Обслуживаем " + transport.getModelName());
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
