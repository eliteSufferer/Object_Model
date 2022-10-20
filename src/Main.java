import characters.Crister;
import characters.Govnilla;
import characters.Karlson;
import characters.Malysh;
import com.sun.source.doctree.StartElementTree;
import objects.TypeOfObject;
import position.Box;
import position.CornerOfSheet;
import quallity.QualityOfAction;

public class Main {
    public static void main(String[] args) {
        Malysh char1 = new Malysh("Малыш", "1");
        Govnilla char2 = new Govnilla("Гунилла", "2");
        Crister char3 = new Crister("Кристер", "3");
        Karlson char4 = new Karlson("Карлсон", "4");
        System.out.println();
        char1.toCommunicate();
        char2.toCommunicate();
        char3.toCommunicate();
        char1.doThings(QualityOfAction.HAPPILY);
        char2.doThings(QualityOfAction.HAPPILY);
        char3.doThings(QualityOfAction.HAPPILY);
        System.out.println();

        char1.toSay();
        System.out.println();
        Box box1 = new Box("Ящик письменного стола");
        char4.takeObject(TypeOfObject.CRAYONS);
        CornerOfSheet corner = new CornerOfSheet("Угол простыни");
        char4.Draw();
        char4.takeObject(TypeOfObject.SCISSORS);
        char1.toWarn();
        char4.toCut();
        char4.doThings(QualityOfAction.QUICKLY);
        System.out.println();

        System.out.println(char1);
        System.out.println(char2);
        System.out.println(char3);
        System.out.println(char4);
    }
}