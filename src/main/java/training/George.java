package training;

public class George extends Hungarian implements Human, Sportsman, Programmer {

    public George(int howStrongItCanBe) {
        super(howStrongItCanBe);
    }

    @Override
    public String tellMeYourName() {
        return "George";
    }

    @Override
    public int giveMeYourId() {
        return 1030201;
    }

    @Override
    public String giveMeYourAddress() {
        return "Kosár utca 12.";
    }

    @Override
    public void run() {
        System.out.println("Running as fast as the wind blows");
    }

    @Override
    public void writeMeAProgram() {
        System.out.println("Your program is a date tonight with me! :)");
    }

    @Override
    public void singAnthem() {
        System.out.println("Isten áld meg a Magyart");
    }

    @Override
    public String toString() {
        return "Hello, my name is: " + this.tellMeYourName() + ",\n"
                + "and my ID is: " + this.giveMeYourId();
    }

}
