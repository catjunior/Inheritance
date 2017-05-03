package SuperHumans;

import com.sun.prism.shader.Solid_ImagePattern_Loader;

/**
 * Created by mattwu on 5/1/17.
 *  */

public class SuperHuman extends Human {

    private boolean isBad;
    private String heroName;
    private String superAbility;

    public SuperHuman () {}

    public SuperHuman (String name, int age, boolean isMale, String occupation, String address, boolean isBad, String heroName, String superAbility) {

        super(name, age, isMale, occupation, address);
        this.isBad = isBad;
        this.heroName = heroName;
        this.superAbility = superAbility;
    }


    public boolean getIsBad() { return this.isBad; }

    public String getHeroName() { return this.heroName; }

    public String getSuperAbility() { return this.superAbility; }


    public void getSuperInfo (){

        System.out.println( "Bad SuperHuman? " + getIsBad() + "\n" +
                            "SuperHero Name: " + getHeroName() + "\n" +
                            "SuperAbility: " + getSuperAbility() + "\n"

        );

    }

    public static void main(String[] args) {

        SuperHuman paul = new SuperHuman("Paul", 10, true, "cooker", "NY", true, "Mr.X", "invisible" );

        paul.getInfo();
        paul.getSuperInfo();

    }

}



