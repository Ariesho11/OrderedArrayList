import java.util.*;
public class NoNullArrayList<T> extends ArrayList<T>{

  public NoNullArrayList(){}
  public NoNullArrayList(int initialCapacity){
    super(initialCapacity);
  }

  public T set(int index, T element){
    if(element == null){
      throw new IllegalArgumentException("Can't add a null");
    }
    return super.set(index, element);
  }

  public boolean add(T element){
    return true;
  }

  public void add(int index, T element){
  }
}
