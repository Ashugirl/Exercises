package dog;

import static dog.Owner.askFname;
import static dog.Owner.kbd;

public class OwnerApp {
    public static void main(String[] args) {

        Owner owner = new Owner();
        String fname = askFname();
        //String lname = Owner.askLName();
        //int numDogs = Owner.askNumDogs();

        System.out.printf("This owner's name is %s ", fname);// + " " + owner.setLname(lname) + " and they would like to adopt " + owner.setNumDogs(numDogs) + " dogs.");
    }
}