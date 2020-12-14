import java.util.*;
public class NoNullArrayList<T> extends ArrayList<T>{
  private ArrayList<T> data;

  public NoNullArrayList(){}
  public NoNullArrayList(int initialCapacity){
    super(initialCapacity);
  }

  public String set(int index, String element){
    return"";
  }

  public boolean add(String element){
    return true;
  }

  public void add(int index, String element){
  }
}
