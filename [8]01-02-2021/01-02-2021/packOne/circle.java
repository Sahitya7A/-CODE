package packOne;

public class circle {
  float radius;

  public circle(float rad) {
    radius = rad;
  }

  public float getRadius() {	
	System.out.println("packOne getRadius()");
    return radius;
  }

  public void setRadius(float rad) {
    radius = rad;
  }
}
