import java.util.Scanner;

public class AbsoluteValueNumber {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number: ");
        double number = scanner.nextDouble();

        //לחשב ערך מוחלט של מספר
        double absoluteValue = Math.abs(number);

        //מדפיס על המסך את התוצאה של הערך המוחלט
        System.out.println("Absolute value: " + absoluteValue);

    }
}