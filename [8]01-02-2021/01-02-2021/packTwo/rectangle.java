package packTwo;

public class rectangle {
  float width, height;

  public rectangle(float w, float h) {
    width = w;
	height = h;
  }

  public float calArea() {
    return width * height;
  }
}