package characters;

import actions.Communicate;
import quallity.QualityOfAction;
import quallity.HowDoThings;
public class Gunilla extends AbstractCharacter implements HowDoThings, Communicate {

    public Gunilla(String name, String id){
        super(name, id);
        System.out.println("Создан персонаж " + name);
    }

    @Override
    public void doThings(QualityOfAction type, String quality) {
        System.out.println(this.getName() + " совершает действие " + quality);
    }

    @Override
    public void toCommunicate() {
        System.out.println(this.getName() + " соглашается играть");
    }
}
