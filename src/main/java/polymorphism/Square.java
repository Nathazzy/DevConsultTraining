package polymorphism;

public class Square extends Shape {

    @Override
    public void draw() {
        System.out.println("Drawing a square");
    }

    public String giveMeTheExactShape() {
        return "this is the shape";
    }

}
