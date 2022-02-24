package plantage;

import java.util.Scanner;

public class WaterThePlants {

    public static void main(String[] args) {


        int plants = 20;
        int rounds = 0;
        int totalGlasses = 0;

        while(rounds < 4)
        {
            rounds++;
            totalGlasses = rounds * plants;

        }
        System.out.println("The plants have been given a total of " + totalGlasses + " glasses of water.");
        System.out.println("Each plant had " + rounds + " glasses of water.");

        int schepjes = 0;
        int ton = 200;
        int split = 0;
        int hours = 0;
        for(int i = schepjes;i <= ton; i++){
             split = i / plants;
        }
        System.out.println("Each plant got " + split + " scoops of water from the barrel.");


        //automatic watering:
        //String season = "";
        Scanner kbd = new Scanner(System.in);
        System.out.println("Please enter a number to indicate the season.");
        System.out.println("Spring is 1: ");
        System.out.println("Summer is 2: ");
        System.out.println("Fall is 3: ");
        System.out.println("Winter is 4: ");
        int season = kbd.nextInt();

       // if (season > 0 && season <=4){
        while (season <= 0 || season > 4){
            System.out.println("Invalid input. Please enter a number between 1 and 4");
        season = kbd.nextInt();}

        switch (season) {
            case 1:
                schepjes = 2;
                break;
            case 2:
                schepjes = 3;
                break;
            case 3:

                schepjes = 2;
                break;
            case 4:
                schepjes = 1;
                break;

        }
            System.out.println("Each plant will get " + schepjes + " scoops of water per day.");
        System.out.println();

        // a summer's day
        if (season == 2){
            System.out.println("Today's watering schedule: ");
            for(int i = hours; i < 24; i++){
                if ((i > 0 && i < 6) || (i > 6 && i < 12) || (i > 12 && i < 18) || (i > 18 && i <= 23)){
                    System.out.println("It's " + i + " o'clock. No water right now.");
                } else
                    System.out.println("It's " + i + " o'clock. Please give the plants some water.");
                }
            }
        }
        }



