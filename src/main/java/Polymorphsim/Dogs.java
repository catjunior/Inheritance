package Polymorphsim;

/**
 * Created by mattwu on 5/19/17.
 */
public class Dogs extends Pets{

    private String name;

    public Dogs () {}

    public Dogs (String name){

        super(name);
    }

    @Override
    public String speak() {
        String sound = "Woof";
        return sound;
    }

}
