package Service;

import Interface.MyCollection;
import Model.GenericClass;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class GenericService<T extends Comparable<T>> implements MyCollection<T> {
    private List<GenericClass<T>> elements;

    public GenericService() {
        this.elements = new ArrayList<>();
    }

    @Override
    public void addElement(GenericClass<T> object) {
        elements.add(object);
    }

    @Override
    public GenericClass<T> get() {
        if (!elements.isEmpty()) {
            return elements.get(0);
        }
        return null;
    }

    @Override
    public void sort() {
        Collections.sort(elements); // Esto usará el método compareTo() de GenericClass<T>
    }

    public void printElement() {
        for (GenericClass<T> element : elements) {
            System.out.println(element);
        }
    }

    public <E> void printArray(E[] array) {
        for (E element : array) {
            System.out.println(element);
        }
    }

    public List<GenericClass<T>> getElements() {
        return elements;
    }
}
