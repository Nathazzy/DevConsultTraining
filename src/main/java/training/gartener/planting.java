package training.gartener;

public class planting {
    public static void main(String[] args){
        flower myFirstFlower = new flower("Rózsa","Piros", "134 cm", 30);
        flower mySecondFlower = new flower("Rózsa","Fehér", "200 cm", 34);
        flower myThirdFlower = new flower("Levendula","Lila", "405 cm", 60);
        flower myFourthFlower = new flower("Százszorszép","Fehér", "20 cm", 52);
        flower myFifthFlower = new flower("Liliom","Rózsaszín", "43 cm", 5);
        flower mysixthFlower = new flower("Tulipán","Fekete", "50 cm", 23);
        flower mySeventhFlower = new flower("Pipacs","Piros", "26 cm", 4);

        System.out.println(flower.getNumberOfFlowersPlanted());
        System.out.print(mySecondFlower.color);
    }
}
