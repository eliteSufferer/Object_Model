import characters.Crister;
import characters.Govnilla;
import characters.Karlson;
import characters.Malysh;
import com.sun.source.doctree.StartElementTree;
import objects.TypeOfObject;
import quallity.QualityOfAction;

public class Main {
    public static void main(String[] args) {

        Malysh char1 = new Malysh("Малыш");
        Govnilla char2 = new Govnilla("Говнилла");
        Crister char3 = new Crister("Кристер");
        Karlson char4 = new Karlson("Карлсон");
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
        char4.takeObject(TypeOfObject.CRAYONS);
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