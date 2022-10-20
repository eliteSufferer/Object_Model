package characters;

import java.util.ArrayList;
public abstract class AbstractCharacter {
    private String name;

    private ArrayList<String> actions = new ArrayList<>();

    public AbstractCharacter(String name){
        this.name = name;
    }

    public String getName(){
        return this.name;
    }

    protected void addInfo(String name){
        this.actions.add(name);
    }

    @Override
    public String toString(){
        return "Character Data: {"
                +"fullName = '" + this.getName() + '\''
                + ", Actions = " + this.actions
                + '}';

    }
}


