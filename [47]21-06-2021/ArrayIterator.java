import java.util.Iterator;
import java.lang.reflect.Array;

public class ArrayIterator implements Iterator 
{
  	private final int size;
  	private int cursor;
  	private final Object array;
    
 	public ArrayIterator(Object obj) 
  {
    	Class type = obj.getClass();
    
    	if (!type.isArray()) {
      	throw new IllegalArgumentException("Invalid type: " + type);
    	}
    	size = Array.getLength(obj);
    	array = obj;
  	}

  	public boolean hasNext() {
    	return (cursor < size);
  	}

  	public Object next() {
    	return Array.get(array, cursor++);
  	}

  	public void remove() { }

  	public static void main(String args[]) {
    	Iterator itr = new ArrayIterator(args);

    	while (itr.hasNext()) {
      	System.out.println(itr.next());
    	}
    
    
}
