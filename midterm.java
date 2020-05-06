import java.lang.Math; 

class SolidOfResolution extends Cylinder{
  double radius = 5;
}

class Cylinder extends Ball{
  double height = 20;
}

class Ball {
  double radBall=9;
}

class Pyramid extends SolidOfResolution{
  public double s = 10;
  public double h = 3;
}

class Shape extends Pyramid {
  double volume;

  public void setVolume(double volume){
    this.volume = volume;
  }

  public double addShapePyramid(){
    double vol = (s*s*h)/3;
    return vol;
  }

  public double addShapeCylinder(){
    double volCyl= height * radius * radius * 3.14;
    return volCyl;
  }

  public double addShapeBall(){
    double volBall = 4/3*3.14*(Math.pow(radBall, 3));
    return volBall;
  }
}


class Main {
  public static void main(String[] args) {
    Shape a = new Shape();
    a.setVolume(10000);
    double TotalVolume;
    TotalVolume = a.addShapePyramid() + a.addShapeCylinder() + a.addShapeBall();

    if(TotalVolume<a.volume){
      System.out.println("True");
    } else {
      System.out.println("False");
    }
    System.out.print(TotalVolume);


  }
}