package polymorphism;

public class Main {

    public static void main(String[] args) {
        Shape obj1 = new Shape();
        obj1.draw();

        Shape obj2 = new Circle();
        Shape obj3 = new Square();

        obj2.draw();
        obj3.draw();
    }

}
