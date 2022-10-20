package characters;

import actions.Communicate;
import quallity.QualityOfAction;
import quallity.HowDoThings;
public class Govnilla extends AbstractCharacter implements HowDoThings, Communicate {

    public Govnilla(String name, String id){
        super(name, id);
        System.out.println("Создан персонаж " + name);
    }

    @Override
    public void doThings(QualityOfAction type) {
        System.out.println(this.getName() + " совершает действие " + type);
    }

    @Override
    public void toCommunicate() {
        System.out.println(this.getName() + " соглашается играть");
    }
}
