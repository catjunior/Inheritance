package Polymorphsim;

/**
 * Created by mattwu on 5/19/17.
 */
public class Cats extends Pets {

    private String name;

    public Cats () {}

    public Cats (String name){

        super(name);

    }

    @Override
    public String speak() {
        String sound = "Meeooow";
        return sound;
    }


}
