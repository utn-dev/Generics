package Model;

public class GenericClass<T extends Comparable<T>> implements Comparable<GenericClass<T>> {

    T obj;


    public GenericClass(T object) {
        this.obj = object;
    }

    // Método que compara objetos basados en el atributo 'obj' de tipo T
    @Override
    public int compareTo(GenericClass<T> other) {
        return this.obj.compareTo(other.obj); // Compara los valores de T
    }

    public void classType() {
        System.out.println("El tipo T es " + obj.getClass());
    }

    @Override
    public String toString() {
        return "Model.GenericClass{" +
                "obj=" + obj +
                '}';
    }
}
