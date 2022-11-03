import characters.Crister;
import characters.Gunilla;
import characters.Karlson;
import characters.Malysh;
import objects.TypeOfObject;
import position.Box;
import position.CornerOfSheet;
import quallity.QualityOfAction;

public class Main {
    public static void main(String[] args) {
        Malysh char1 = new Malysh("Малыш", "1");
        Gunilla char2 = new Gunilla("Гунилла", "2");
        Crister char3 = new Crister("Кристер", "3");
        Karlson char4 = new Karlson("Карлсон", "4");
        System.out.println();
        char1.toCommunicate();
        char2.toCommunicate();
        char3.toCommunicate();
        char1.doThings(QualityOfAction.HAPPILY, "радостно");
        char2.doThings(QualityOfAction.HAPPILY, "радостно");
        char3.doThings(QualityOfAction.HAPPILY, "радостно");
        System.out.println();

        char1.toSay();
        System.out.println();
        Box box1 = new Box("Ящик письменного стола");
        char4.takeObject(TypeOfObject.CRAYONS, "мелки");
        CornerOfSheet corner = new CornerOfSheet("Угол простыни");
        char4.Draw();
        char4.takeObject(TypeOfObject.SCISSORS, "ножницы");
        char1.toWarn();
        char4.toCut();
        char4.doThings(QualityOfAction.QUICKLY, "быстро");
        System.out.println();

        System.out.println(char1);
        System.out.println(char2);
        System.out.println(char3);
        System.out.println(char4);
    }
}