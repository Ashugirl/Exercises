package bookExercises.chapter5;


public class BmiApplication {
    public static void main(String[] args) {
        System.out.println("Enter your height in cms: ");
        int height = KeyboardUtility.readInt();
        System.out.println("Enter your weight in kgs: ");
        int weight = KeyboardUtility.readInt();
        float bmi = BmiUtility.calculateBmi(height,weight);
        BmiUtility.printDiagnosis(bmi);
    }
}
