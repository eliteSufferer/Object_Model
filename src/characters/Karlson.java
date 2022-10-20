package characters;

import actions.Cut;
import actions.Draw;
import objects.TakenObject;
import objects.TypeOfObject;
import quallity.QualityOfAction;
import quallity.HowDoThings;

public class Karlson extends AbstractCharacter implements HowDoThings, Draw, Cut, TakenObject {
    public Karlson(String name){
        super(name);
        System.out.println("Создан персонаж " + name);
    }

    @Override
    public void toCut() {
        System.out.println(this.getName() + " прорезал 2 дырки для глаз в простыне");
        this.addInfo("режет простыню");
    }

    @Override
    public void Draw() {
        System.out.println(this.getName() + " нарисовал страшную рожу");
        this.addInfo("рисует рожу");
    }

    @Override
    public void doThings(QualityOfAction type) {
        System.out.println(this.getName() + " совершает действие " + type);
        this.addInfo("совершает действия как-то");
    }

    @Override
    public void takeObject(TypeOfObject type) {
        System.out.println(this.getName() + " взял предмет " + type);
        this.addInfo("берет предметы");
    }

}
