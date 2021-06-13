class test {  
  public static void main(String [] args) 
  { 
    boolean x = false;
    System.out.println(x + " " + !x);
    int y = 10;
    System.out.println(++y + " " + y++);
    System.out.println(y + " " + y-- + " " + ++y);

    int a = 3;
    int b = ++a * 5 / a-- + --a;
    System.out.println("a is " + a);
    System.out.println("b is " + b);

    String str = "Genesis";
    System.out.println(str instanceof String);
    System.out.println(str instanceof Object);
  }
}