package SuperHumans;

/**
 * Created by mattwu on 5/3/17.
 */
public class MainHumanLab {

    public static void main(String[] args) {

        Human matt = new Human ("Matt Wu", 32, true, "student", "King of Prussia");
        matt.getInfo();


        SuperHuman paul = new SuperHuman("Paul", 10, true, "cooker", "NY", true, "Mr.X", "invisible" );
        paul.getInfo();

    }

}
