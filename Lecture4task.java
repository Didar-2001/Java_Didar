import java.util.Scanner;
import java.lang.Math; 
class Point{
   double p1;
   double p2;
  Point(double p1, double p2){
    this.p1 = p1;
    this.p2 = p2;
  }

  public void SetPoint1(){
    Scanner myObj = new Scanner(System.in);
    this.p1 = myObj.nextDouble();
  }

  public void SetPoint2(){
    Scanner myObj = new Scanner(System.in);
     this.p2 = myObj.nextDouble();
  }
  
} 

  class Main {
  public static void main(String[] args) {
    Point X = new Point(0,0);
    Point Y = new Point(0,0);
    X.SetPoint1();
    X.SetPoint2();
    Y.SetPoint1();
    Y.SetPoint2();
    double distance = Math.sqrt(((X.p2-X.p1)*(X.p2-X.p1))+((Y.p2-Y.p1)*(Y.p2-Y.p1)));
    System.out.print(distance); 
  }
}

© 2020 GitHub, In