class test {  
  public static void main(String [] args) 
  { 
    final String[] names = new String[3];
    names[0] = "Ravi";
    names[1] = "Gautam";
    names[2] = "Mohan";
    for(String name : names) 
      System.out.print(name + ", ");

    System.out.println();
    java.util.List<String> values = new java.util.ArrayList<String>();
    values.add("Ramesh");
    values.add("Keerti");
    values.add("Shankar");
    for(String value : values)
      System.out.print(value + ", ");

    String name = "Ram";
    for(String s : name)  
      System.out.print(s + " ");

    String[] data = new String[3];
    for(String str : data) 
      System.out.print(str + " ");
  }
}

