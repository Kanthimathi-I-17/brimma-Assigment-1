/*19. You are given the following information, but you may prefer to do some research for
yourself
● 1 Jan 1900 was a Monday.
● Thirty days has September,
● April, June and November.
● All the rest have thirty-one,
● Saving February alone,
● Which has twenty-eight, rain or shine.
● And on leap years, twenty-nine.
● A leap year occurs on any year evenly divisible by 4, but not on a century
unless it is divisible by 400.
How many Sundays fell on the first of the month during the twentieth century (1 Jan
1901 to 31 Dec 2000)?
Ans: 171*/

public class Main
{
    public static void main(String args[]){
        int year=1901;
        boolean isLeapYear=false;
        int totalSundays=0;
        int currentDay=2;
        while(year<=2000){
            isLeapYear=false;
            if((year%4)==0){
                if((year%100)==0 && (year%400)==0){
                    isLeapYear=true;
                } else if((year%100)==0 && (year%400)!=0){
                    isLeapYear=false;
                } else {
                    isLeapYear=true;
                }
            }
            System.out.println("The Year Is: "+year);
            System.out.println("*******************************");
            for(int month=1;month<=12;month++){
                System.out.println("The Month is: "+month+" currentDay is :  "+currentDay);
                if(currentDay==7){
                    totalSundays++;
                }
                if(month==1 || month==3 || month==5 || month==7 || month==8 || month==10 || month==12){
                //January,March,May,July,August,October,December
                    currentDay+=3;
                } else if(month==4 || month==6 || month==9 || month==11){ 
                //April,June,September,November
                    currentDay+=2;              
                } else if(month==2 && isLeapYear){
                //February has 29 days in a Leap Year
                    currentDay+=1;
                } 
    
                if(currentDay>7){
                    currentDay=currentDay-7;
                }
                System.out.println("Updated Current Day Is :  "+currentDay);
            }
            System.out.println("*******************************");
            year++;
        }
        System.out.println("The total number of Sundays that fell in the first of the month is: "+totalSundays);
    }
}
