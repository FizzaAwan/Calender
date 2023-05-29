
    import java.util.Scanner;
    public class Calender{
        public static void main(String[] args){
        Scanner in = new  Scanner(System.in);
    boolean redo=true;
do{      
        System.out.print("Enter year,month: ");
        
        int year = in.nextInt();
        int month = in.nextInt();
        int maxdays = 0;
        
      boolean isLeap = false;
      if ( (year%400 == 0) || ( year%4 == 0 && !(year%100 == 0) ) ) {
        isLeap = true;
        }
 //Determine the maximum days of a month for a given year and month.
//i.e., if the month is 1,3,5,7,8,10,12 then maximumdays = 31
//if the month is 4,6,9,11 then maximumdays = 30
//if the month is 2 and it is leapyear then maximumdays = 29
 //if the month is 2 and it is not a leapyear then maximumdays = 28
    
    if(month==1||month==3||month==5||month==7||month==8||month==10||month==12){
    maxdays=31;
    }
    if(month==4||month==6||month==9||month==11){
    maxdays=30;
    }
    if(isLeap == true && month==2){
        maxdays=29;    
    }
    if(isLeap == false && month==2){
        maxdays=28;    
    }

int day=1;
int t[] = { 0, 3, 2, 5, 0, 3, 5, 1, 4, 6, 2, 4 };
int y = year -(14-month)/12;
int dayOfWeek =( y + y/4 - y/100 + y/400 + t[month-1] + day) % 7;
System.out.println();
System.out.println("       " + month + "/" + year );
System.out.println("Su Mo Tu We Th Fr Sa ");

for(int i=0; i<dayOfWeek; i++){
    System.out.print("   ");
}
for(int i=1; i<= maxdays; i++){
    System.out.printf("%2d ",i);
    if((i+ dayOfWeek)%7==0|| i==maxdays){
    System.out.println();
    }
}
System.out.print("try it again(y/n)?");
String repeat=in.next();
redo = repeat.equals("y");
}while(redo==true);
}
}