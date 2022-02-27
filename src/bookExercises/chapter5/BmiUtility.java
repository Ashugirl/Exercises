package bookExercises.chapter5;

public class BmiUtility {
   public static float calculateBmi(int height, int weight){
       //float bmi = KeyboardUtility.readInt();

       float bmi = (weight/height/height) * 10000;
return bmi;

   }

   public static void printDiagnosis(float bmi){


       System.out.println(bmi);
        /*int category = 0;
        if(bmi <= 18.5){
            category = 1;
        }
        if(bmi > 18.5 && bmi <=24.9){
           category = 2;
       }
        if(bmi >= 25 && bmi <= 29.9){
            category = 3;
        }
        if(bmi >= 30){
            category = 4;
        }
        switch(category){
            case 1:
                System.out.printf("Your bmi is %.2f. You are underweight.", bmi);
                break;
            case 2:
                System.out.printf("Your bmi is %.2f. You have a normal weight.", bmi);
                break;
            case 3:
                System.out.printf("Your bmi is %.2f. You are overweight.", bmi);
                break;
            case 4:
                System.out.printf("Your bmi is %.2f. You are obese.", bmi);
                break;

        }

   return category;*/}
}
