package bookExercises.chapter5;

public class ForLoops {
    public static void main(String[] args) {
       /* int x = 350;
        int y = 400;

        for(y = 400; y > x; y--){
            System.out.println(y);
        }

        for(int a = 7; a < 200; a+=7){
            System.out.println(a);
        }*/

        /*for(int power = 1; power < 500; power++){
            power *= 11;
            System.out.println(power);
        }*/


        /*for(int i = 'z'; i >= 'a'; i--){
            System.out.printf("%c", i);
            System.out.println();
        }

        for (int j = -10; j <= 0; j++){
            System.out.println(j);}
            for (int k = 1; k <= 10; k++){
               System.out.println("+" + k);
            }*/

        int x = 5;
        int y = 10;

        String result = x > y?  "x is greater than y" : "y is greater than x";
        System.out.println(result);

        for(int i = 1; i < 10000; i++){
            if(i % 6 == 0 && i % 28 == 0){
                System.out.println(i);

            }
        }



    }


    }

