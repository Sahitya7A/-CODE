// Initialization blocks run when the class is first loaded (a static 
// initialization block) or when an instance is created (an instance 
// initialization block). A static initialization block runs once, when the 
// class is first loaded. An instance initialization block runs once every time 
// a new instance is created.


class base {
  static { System.out.println("1st static init base "); }
  { System.out.println("1st instance init base");  }
  { System.out.println("2nd instance init base");   }
  static { System.out.println("2nd static init base"); 
  }
}

class Init extends base {
  static { System.out.println("1st static init");   }
  { System.out.println("1st instance init");   }
  { System.out.println("2nd instance init");   
  }
  static { System.out.println("2nd static init");    }

  public static void main(String [] args) {
    Init obj = new Init();
  }
}