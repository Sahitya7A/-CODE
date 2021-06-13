class base {
  public static void main(String [] args) 
  { 
    int num = 200;
    System.out.println(num + " in Hexadecimal is " + String.format("%x", num));
    System.out.println(num + " in Hexadecimal is " + String.format("%X", num));
    System.out.println(num + " in Hexadecimal is " + String.format("%h", num));
    System.out.println(num + " in Hexadecimal is " + Integer.toHexString(num));
    System.out.println(num + " in Hexadecimal is " + String.format("%H", num));
    System.out.println(num + " in base 10 is " + String.format("%d", num));
    System.out.println(num + " in octal is " + String.format("%o", num));
    System.out.println(num + " in binary is " + Integer.toBinaryString(num)); 
	System.out.println(Integer.parseInt("123KMIT")); 
  }
}
