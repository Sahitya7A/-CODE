class test {  
  public static void main(String [] args) 
  { 
    boolean y = false;
    boolean x = (y == true);
    System.out.println(x);

    x = (y = true);
    System.out.println(x); 

    x = true == 3;
    System.out.println(x); 
  }
}