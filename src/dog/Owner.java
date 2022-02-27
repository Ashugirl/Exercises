package dog;

import java.util.Scanner;

public class Owner {
    static Scanner kbd = new Scanner(System.in);
    private String fname;
    private String lname;
    private int numDogs;
    private String[] adoptees = {"Fluffy", "Spot", "Ginger", "Red", "General Sherman", "Gunther", "Tuna", "Dave", "Daisy", "Irma"};


    //constructors
    public Owner() {

    }

    public Owner(String fname, String lname, int numDogs){
       this.fname= fname;
       this.setLname(lname);
        this.setNumDogs(numDogs);
    }


//getters and setters



    public String getFname() {
        return fname;
    }

    public void setFname(String fname1) {
        this.fname = fname1;
    }

    public String getLname() {
        return lname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    public int getNumDogs() {
        return numDogs;
    }

    public void setNumDogs(int numDogs) {
        this.numDogs = numDogs;
    }

    public String[] getAdoptees() {
        return adoptees;
    }

    public void setAdoptees(String[] adoptees) {
        this.adoptees = adoptees;
    }

    public static String askFname(){
        System.out.println("Please enter your first name: ");
        return kbd.next();}

    public static String askLName(Scanner kbd){

        System.out.println("Please enter your last name: ");
        String lname = (kbd.next());
         return lname;}

    public static int askNumDogs(Scanner kbd){
        System.out.println("How many dogs would you like to adopt? ");
        int numDogs =(kbd.nextInt());
        return numDogs;
    }
}