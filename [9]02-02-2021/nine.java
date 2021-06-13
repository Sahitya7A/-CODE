class test {  
  public static void main(String [] args) 
  { 
    int array[][] = {{1,2,3},{4,5,6},{7,8,9}};

    for(int [] one:array)
    {
      for (int i = 0; i < one.length; i++) {
        System.out.print(one[i] + "\t");
      }
      System.out.println();
    }

    int x = 10;
    while (x > 0) {
      do {
        x -= 3;
      } while (x > 5);
      x--;
      System.out.println(x + "\t");
    }
  }
}