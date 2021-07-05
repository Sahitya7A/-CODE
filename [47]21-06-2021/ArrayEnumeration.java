import java.util.Enumeration;
import java.lang.reflect.Array;

public class ArrayEnumeration implements Enumeration 
{
  	private final int size;
  	private int cursor;
  	private final Object array;
  
  	public ArrayEnumeration(Object obj) 
	{
    	Class type = obj.getClass();
    
    	if (!type.isArray()) {
      		throw new IllegalArgumentException("Invalid type: " + type);
    	}
    	size = Array.getLength(obj);
    	array = obj;
  	}

  	public boolean hasMoreElements() {
    	return (cursor < size);
  	}

  	public Object nextElement() {
    	return Array.get(array, cursor++);
  	}

  	public static void main(String args[]) {
    	Enumeration enum1 = new ArrayEnumeration(args);

    	while (enum1.hasMoreElements()) {
      		System.out.println(enum1.nextElement());
    	}
    
    	Object obj = new int[] {2, 4, 8, 20, 50};
    	enum1 = new ArrayEnumeration(obj);

    	while (enum1.hasMoreElements()) {
      		System.out.println(enum1.nextElement());
    	}
  
    	try {
      		enum1 = new ArrayEnumeration(ArrayEnumeration.class);
    	} catch (IllegalArgumentException e) {
      		System.out.println("Oops: " + e.getMessage());
    	}
  	}
}