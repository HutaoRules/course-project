import java.util.Scanner;

public class NumofDaysofMonth {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int month = 0, year = 0;
        while (true) {
            System.out.print("Enter month : ");
            String smonth = scanner.next();
            if (smonth.equals("January") || smonth.equals("Jan.") || smonth.equals("Jan") || smonth.equals("1")) {
                month = 1;
            } else if (smonth.equals("February") || smonth.equals("Feb.") || smonth.equals("Feb") || smonth.equals("2")) {
                month = 2;
            } else if (smonth.equals("March") || smonth.equals("Mar.") || smonth.equals("Mar") || smonth.equals("3")) {
                month = 3;
            } else if (smonth.equals("April") || smonth.equals("Apr.") || smonth.equals("Apr") || smonth.equals("4")) {
                month = 4;
            } else if (smonth.equals("May") || smonth.equals("5")) {
                month = 5;
            } else if (smonth.equals("June") || smonth.equals("Jun.") || smonth.equals("Jun") || smonth.equals("6")) {
                month = 6;
            } else if (smonth.equals("July") || smonth.equals("Jul.") || smonth.equals("Jul") || smonth.equals("7")) {
                month = 7;
            } else if (smonth.equals("August") || smonth.equals("Aug.") || smonth.equals("Aug") || smonth.equals("8")) {
                month = 8;
            } else if (smonth.equals("September") || smonth.equals("Sep.") || smonth.equals("Sep") || smonth.equals("9")) {
                month = 9;
            } else if (smonth.equals("October") || smonth.equals("Oct.") || smonth.equals("Oct") || smonth.equals("10")) {
                month = 10;
            } else if (smonth.equals("November") || smonth.equals("Nov.") || smonth.equals("Nov") || smonth.equals("11")) {
                month = 11;
            } else if (smonth.equals("December") || smonth.equals("Dec.") || smonth.equals("Dec") || smonth.equals("12")) {
                month = 12;
            } else {
                System.out.println("Invalid month input. Please try again.");
                continue;
            }
            System.out.print("Enter year: ");
            String stryear = scanner.next();
            try {
                year = Integer.parseInt(stryear);
                if (year >0){
                    break;
                }else{
                    System.out.println("Invalid  year input. Plese try again");}
            }catch (Exception ex){
                System.out.println("Invalid  year input. Plese try again");
            }
        }
        int days;
        if (month==2) {
            if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
                days = 29;
            } else {
                days = 28;
            }
        } else if (month == 4 || month == 6 || month ==9 || month ==11) {
            days = 30;
        }else{
            days = 31;
        }
        System.out.println("The number of days is " +  days);
    }
}