package Polymorphsim;

/**
 * Created by mattwu on 5/19/17.
 */
public class Birds extends Pets {

    private String name;

    public Birds () {}

    public Birds (String name) {

        super (name);
    }

    @Override
    public String speak (){
        String sound = "EeeeHaaa";
        return sound;
    }

}
