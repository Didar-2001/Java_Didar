public class Date {

private int month;
private int day;
private int year;
  
public Date(int m, int d, int y){
month=m;
day=d;
year=y;

}
  
public void setMonth(int Months){
if(Months>=0 && Months<=12)
  
month=Months;
  
else{
month=0; }
}
  
public int getMonth(){

return month;
}

  
public void setDay(int Days){
if(Days>=0 && Days<=30)
  
day=Days;
else{
day=0;
}
}
public int getDay(){
  
return day;
  
}
public void setYear(int Years){   
year=Years;

}
  
public int getYear(){
return year;
  
}
  
public void displayDate(){
  
System.out.printf("%d/%d/%d\n",getMonth(),getDay(),getYear());
  
}
}


import java.util.Scanner;
public class TestDate {
  
public static void main(String args[]){
  
Date date=new Date(0,0,0);
  
Scanner input=new Scanner(System.in);
  
  
System.out.println("Enter Month");
int m=input.nextInt();
date.setMonth(m);
  
System.out.println("Enter Day ");
int d=input.nextInt();
date.setDay(d);
  
System.out.println("Enter Year");
int y=input.nextInt();
date.setYear(y);

date.displayDate();

  
}

}