public class OrderedArrayList<T extends Comparable<T>> extends NoNullArrayList<T>{
  public OrderedArrayList(){}
  public OrderedArrayList(int initialCapacity){
    super(initialCapacity);
  }

  public T set(int index, T element){
    return element;
  }

  public boolean add(T element){
    return true;
  }
  public void add(int index, T element){
    
  }
}
