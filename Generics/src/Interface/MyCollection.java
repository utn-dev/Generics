package Interface;

import Model.GenericClass;

public interface MyCollection <T extends Comparable<T>>{
    void addElement(GenericClass<T> object);
    GenericClass<T> get();
    void sort();
}
