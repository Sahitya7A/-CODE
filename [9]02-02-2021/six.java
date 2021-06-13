class test {  
  public static void main(String [] args) 
  { 
    int x = 2;
    if(x) {
      System.out.println(x * x);
    } 

    if(x = 5) {
      System.out.println(x * x);
    } 

    int y = (x > 5) ? (2 * x) : (3 * x);
    System.out.println(y);

    y = 1;
    int z = 1;
    x = y < 10 ? y++ : z++;
    System.out.println(y + " " + z);
  }
}
