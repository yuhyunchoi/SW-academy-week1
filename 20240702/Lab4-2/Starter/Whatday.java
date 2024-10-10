import java.util.Scanner;

public class Whatday {
    static int[] daysInMonth  = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
    static int[] daysInLeapMonth  = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
    static String[] monthNames = {"January", "Feburary", "March", "April", "May", "June", "July", "August", "Sepetember", "October", "November", "December"};
    
    public static void main(String[] args) {
        try{
            System.out.print("Enter Year : ");
            Scanner scanner = new Scanner(System.in);
            String line = scanner.nextLine();
            int yearNum = Integer.parseInt(line);

            boolean isLeapYear = (yearNum % 4 == 0) &&
                                (yearNum % 100 != 0) || (yearNum % 400 == 0);

            int maxDayNum = isLeapYear ? 366 : 365;
            
            System.out.print("Enter a day number between 1 and " + maxDayNum + " :");
         
            String line2 = scanner.nextLine();
            int dayNum = Integer.parseInt(line2);
            
            int monthNum = 0; 
            if(isLeapYear){
            
                for (int days: daysInLeapMonth) {
                    if (dayNum <= days) {
                        break;
                    }
                    else {
                        dayNum -= days;
                        monthNum++;
                    }
                }

                String monthName = monthNames[monthNum];

                System.out.printf("%s, %d \n", monthName, dayNum);
            }
            else{
                for (int days: daysInMonth) {
                    if (dayNum <= days) {
                        break;
                    }
                    else {
                        dayNum -= days;
                        monthNum++;
                    }
                }

                String monthName = monthNames[monthNum];

                System.out.printf("%s, %d \n", monthName, dayNum);
            }

        }
        catch(IllegalArgumentException e){
            e.printStackTrace();
        }
        finally{
            scanner.close();
        }
    }
}