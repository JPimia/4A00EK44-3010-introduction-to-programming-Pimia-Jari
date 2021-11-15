
class Car {
    private String brand;
    private Motor motor;

    public Car(String brand) {
        this.brand = brand;
        this.motor = new Motor();
    }

    public Motor getMotor() {
        return this.motor;
    } 

    class Motor {
        public void printCarBrand() {
            System.out.println(brand);
        }
    }
}
class Main {
    public static void main(String [] args) {
        Car datsun = new Car("datsun 100 a");
        datsun.getMotor().printCarBrand();
    }
}