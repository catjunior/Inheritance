package Polymorphsim;

/**
 * Created by mattwu on 5/19/17.
 */
public class Pets {

    private String name;

    public Pets () {}

    public Pets (String name){

        this.name = name;
    }

    public void setName(String name) {

        this.name = name;
    }

    public String getName() {

        return name;
    }

    public String speak() {
        String sound = "I am a pet";
        return sound;
    }
}
