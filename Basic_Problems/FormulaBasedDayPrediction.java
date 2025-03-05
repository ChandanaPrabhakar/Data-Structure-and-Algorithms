package Basic_Problems;
import java.util.*;

public class FormulaBasedDayPrediction {
    public static int day(int date, int month, int year){
        int[] monthCode = {6,2,2,5,0,3,5,1,4,6,2,4};
        if(month < 3){
            year -= 1;
        }
        int lastTwoDigits = year % 100;
        int yearCode = (lastTwoDigits + lastTwoDigits / 4) % 7;
        int centuryCode = (year / 100) / 4 - 2 * (year / 100);
        yearCode = (yearCode + centuryCode) % 7;

        return (date + monthCode[month - 1] + yearCode) % 7;
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter date, month, year");
        int date = scan.nextInt();
        int month = scan.nextInt();
        int year = scan.nextInt();
        int result = day(date, month, year);
        System.out.println("The day based on given date of month of year: "+ result);
        scan.close();
    }
}
