package training;

public class CarShow {

    public static void main(String[] args) {
        Car myCar = new Car("Hyundai");
        Car mySecondCar = new Car("2.0 Diesel","Toyota");
        Car myElectricCar = new Car("64 kw Electric", "Tesla");

        System.out.println(mySecondCar.startMotor2());

        myElectricCar.setNumberOfCarsProduced(false, 15);

        Car myCar2 = new Car("Suzuki");

        System.out.println(myCar.getNumberOfCarsProduced());
        System.out.println(mySecondCar.getNumberOfCarsProduced());
        System.out.println(myElectricCar.getNumberOfCarsProduced());

        Car myCar3 = new Car("Suzuki");
        int myNumber = 12;
    }

}
