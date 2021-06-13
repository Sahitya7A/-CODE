import packOne.*;
import packTwo.*;   

class test {
  public static void main(String [] args)
  { 
    packTwo.circle obj = new packTwo.circle(10);
    System.out.println(obj.getRadius());
    obj.setRadius(20);
    System.out.println(obj.getRadius());
	rectangle r = new rectangle(20, 30);
	System.out.println(r.calArea());
  }
}
