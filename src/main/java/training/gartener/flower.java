package training.gartener;

public class flower {
    private static int numberOfFlowersPlanted = 0;

    String name;
    int numberOfPetal;
    String color;
    String height;

    flower(String name, String color, String height, int numberOfPetal){
        this.name = name;
        this.color = color;
        this.height = height;
        this.numberOfPetal = numberOfPetal;
        numberOfFlowersPlanted++;
    }

    public static int getNumberOfFlowersPlanted() {
        return numberOfFlowersPlanted;
    }
}
