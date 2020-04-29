
import java.util.Scanner;

class TimeOfDay{
    int minutesFromDayStart;
    int hour;
    int minute;
    public TimeOfDay(int minutesFromDayStart){
        hour = minutesFromDayStart/60; 
        if(hour>24){
          hour = hour%24;
        }

        minute = minutesFromDayStart%60;
    }

    public void getTime(){
      System.out.println(hour+":"+minute);
    }

    public boolean  isAM(){
        if(hour>=12){
            return false;
        }else {
            return true;
        }
    }
}

class Main{

    public static void main(String[] args) {
        Scanner S = new Scanner(System.in);
        int minutes = S.nextInt();
        TimeOfDay time = new TimeOfDay(minutes);
        if (time.isAM()){
            System.out.println("AM");
        }else {
            System.out.println("PM");
        }
        time.getTime();
    }
}