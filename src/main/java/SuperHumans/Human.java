package SuperHumans;

/**
 * Created by mattwu on 5/2/17.
 */
public class Human{

    private String name;
    private int age;
    private boolean isMale;
    private String occupation;
    private String address;

    public Human (){}


    public Human (String name, int age, boolean isMale, String occupation, String address){
        this.name = name;
        this.age = age;
        this.isMale = isMale;
        this.occupation = occupation;
        this.address = address;
    }


    public String getName() { return this.name; }

    public int getAge() { return this.age; }

    public boolean getIsMale() { return this.isMale; }

    public String getOccupation() { return this.occupation; }

    public String getAddress() { return this.address; }


    public void getInfo(){
        System.out.println( "Name: " + getName() + "\n" +
                            "Age: " + getAge() + "\n" +
                            "IsMale: " + getIsMale() + "\n" +
                            "Occupation: "+ getOccupation() + "\n" +
                            "Address: "+ getAddress()
        );
    }


}
