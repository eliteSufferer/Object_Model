package characters;

import actions.Cut;
import actions.Draw;
import objects.TakenObject;
import objects.TypeOfObject;
import quallity.QualityOfAction;
import quallity.HowDoThings;

public class Karlson extends AbstractCharacter implements HowDoThings, Draw, Cut, TakenObject {
    public Karlson(String name, String id){
        super(name, id);
        System.out.println("Создан персонаж " + name);
    }

    @Override
    public void toCut() {
        System.out.println(this.getName() + " прорезал 2 дырки для глаз в простыне");
    }

    @Override
    public void Draw() {
        System.out.println(this.getName() + " нарисовал страшную рожу");
    }

    @Override
    public void doThings(QualityOfAction type, String quality) {
        System.out.println(this.getName() + " совершает действие " + quality);
    }

    @Override
    public void takeObject(TypeOfObject type, String name) {
        System.out.println(this.getName() + " взял " + name);
    }

}
