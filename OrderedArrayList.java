public class OrderedArrayList<T extends Comparable<T>> extends NoNullArrayList<T>{
  public OrderedArrayList(){}
  public OrderedArrayList(int initialCapacity){
    super(initialCapacity);
  }

  public T set(int index, T element){
    T temp = super.remove(index);
    for(int i = 0; i < super.size(); i++){
      if(super.get(i).compareTo(element) > 0) super.add(i, element);
    }
    return temp;
  }

  public boolean add(T element){
    return true;
  }
  public void add(int index, T element){

  }
}
