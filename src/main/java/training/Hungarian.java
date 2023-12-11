package training;

public abstract class Hungarian {

    public int howStrongItCanBe;

    public Hungarian(int howStrongItCanBe) {
        this.howStrongItCanBe = howStrongItCanBe;
    }

    abstract void singAnthem();

    public void drinkPalinka() {
        System.out.println("HÚZÓRA");
    }

}
