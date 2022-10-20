package characters;

import actions.Communicate;
import actions.Warn;
import actions.Say;
import quallity.QualityOfAction;
import quallity.HowDoThings;

public class Malysh extends AbstractCharacter implements HowDoThings, Communicate, Warn, Say {
    public Malysh(String name, String id){
        super(name, id);
        System.out.println("Создан персонаж " + name);
    }

    @Override
    public void toCommunicate() {
        System.out.println(this.getName() + " соглашается играть");
    }

    @Override
    public void doThings(QualityOfAction type) {
        System.out.println(this.getName() + " совершает действие " + type);
    }

    @Override
    public void toWarn() {
        System.out.println(this.getName() + " пытается остановить Карлсона");
    }

    @Override
    public void toSay() {
        System.out.println(this.getName() + " сказал");
    }
}
