package dog;

import java.util.Arrays;

public class IrishTerrier extends Dog {
    private String[] commands = {"Sit!", "Stay!", "Heel!"};
  


  //constructors
   // public IrishTerrier(){}

    //public IrishTerrier(String[] commands){




    //getter and setters


    public String[] getCommands() {
        return commands;
    }

    public void setCommands(String[] commands) {
        this.commands = commands;
    }

    public static void stealsFood(){
        System.out.println("This breed has a tendency to steal food.");
    }

    public static void hateDogs(){
        System.out.println("The breed does not get along with other dogs.");
    }

    public static void familyDog(){
        System.out.println("This dog is very loyal to their family.");
    }








   @Override
    public String toString() {
        return "IrishTerrier{" +
                "commands=" + Arrays.toString(commands) +  
                '}';
    }
}
