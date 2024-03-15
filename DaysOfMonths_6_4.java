import java.util.Scanner;
public class DaysOfMonths_6_4 {
    public static void main(String args[]){
        String[] monthList = {"January","February","March","April","May","June","July","August","September","October","November","December",
                "Jan","Feb","Mar","Apr","May","Jun","Aug","Sep","Oct","Nov","Dec",
                "Jan.","Feb.","Mar.","Apr.","May.","June.","July.","Aug.","Sep.","Oct.","Nov.","Dec."};

        int[] NormalYear = {31,28,31,30, 31, 30, 31,31,30,31,30,31};
        int[] LeapYear= {31,29,31,30, 31, 30, 31,31,30,31,30,31};
        Scanner keyboard = new Scanner(System.in);
        String month;
        boolean CheckMonth = false;
        int count =0;

        while (!CheckMonth)
        {
            System.out.println("Input the month: ");
            month =  keyboard.nextLine();
            count =-1;
            for (String element: monthList)
            {
                count ++;
                if (month.equals(element))
                {
                    CheckMonth = true;
                    break;
                }
            }
        }

        int year;
        boolean CheckYear =  false;
        while (!CheckYear){
            System.out.println("Input the year: ");
            year = keyboard.nextInt();
            if (year > 0)
            {
                CheckYear = true;
                if (year % 4 == 0)
                {
                    if ((year % 100 == 0) && (year % 400 != 0))
                    {
                        System.out.println("The day in that month is "+ NormalYear[count%12]);

                    }
                    else{
                        System.out.println("The day in that month is "+ LeapYear[count%12]);
                    }
                }
                else
                {
                    System.out.println("The day in that month is "+ NormalYear[count%12]);
                }
            }
        }
    }
}