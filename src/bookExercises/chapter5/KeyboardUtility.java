package bookExercises.chapter5;

import java.util.Scanner;

public class KeyboardUtility {
    public static int readInt() {
        Scanner kbd = new Scanner(System.in);
        int number = kbd.nextInt();
        return number;
    }
}
