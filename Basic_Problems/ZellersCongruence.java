package Basic_Problems;
import java.util.*;

public class ZellersCongruence {
    public static int day(int date, int month, int year){
        int[] monthCode = {0,3,2,5,0,3,5,1,4,6,2,4};
        if(month < 3){
            year--;
        }
        return (year + year / 4 - year / 100 + year / 400 + monthCode[month - 1] + date) % 7;
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Date, Month, Year");
        int date = scan.nextInt();
        int month = scan.nextInt();
        int year = scan.nextInt();
        System.out.println("The day on "+date+"/"+month+"/"+year+" : "+day(date, month,year));
        scan.close();
    }
}
