public class OrderedArrayList<T extends Comparable<T>> extends NoNullArrayList<T>{
  public OrderedArrayList(){}
  public OrderedArrayList(int initialCapacity){
    super(initialCapacity);
  }

  public T set(int index, T element){
    T temp = super.get(index);
    super.remove(index);
    super.add(findIndex(element), element);
    return temp;
  }

  public boolean add(T element){
    super.add(findIndex(element), element);
    return true;
  }
  public void add(int index, T element){
    super.add(findIndex(element), element);
  }

  private int findIndex(T element){
    if(element == null){
      throw new IllegalArgumentException("There should be no Nulls >:^(");
    }
    if(super.size() == 0) return 0;
    for(int i = 0; i < super.size(); i++){
      if(element.compareTo(super.get(i)) < 0) return i;
    }
    return super.size();
  }

}
