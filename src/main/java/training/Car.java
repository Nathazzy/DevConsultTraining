package training;

public class Car {

    private static int numberOfCarsProduced = 0;
    String motorType;
    int numberOfWheels = 4;
    String model;

    Car(String motorType, String model) {
        this.motorType = motorType;
        this.model = model;
        numberOfCarsProduced++;
    }

    Car(String model) {
        this.motorType = "1.6 petrol";
        this.model = model;
        numberOfCarsProduced++;
    }

    public boolean startMotor() {
        if (motorType != null) {
            return true;
        } else {
            return false;
        }
    }

    public boolean startMotor2() {
        return motorType != null;
    }

    public static int getNumberOfCarsProduced() {
        return numberOfCarsProduced;
    }

    public static void setNumberOfCarsProduced(boolean access, int num) {
        if (access) {
            numberOfCarsProduced = num;
        } else {
            System.out.println("YOU HAVE NO PERMISSION TO DO THIS!!");
        }
    }

}
