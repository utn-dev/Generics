import Model.GenericClass;
import Service.GenericService;

public class Main {
    public static void main(String[] args) {

        // Crear objetos GenericClass<Integer>
        GenericClass<Integer> intObj = new GenericClass<>(22);
        GenericClass<Integer> intObj1 = new GenericClass<>(10);
        GenericClass<Integer> intObj2 = new GenericClass<>(23);

        intObj.classType();
        System.out.println(intObj);

        // Crear objetos GenericClass<String>
        GenericClass<String> strObj = new GenericClass<>("Z");
        GenericClass<String> strObj1 = new GenericClass<>("A");
        GenericClass<String> strObj2 = new GenericClass<>("F");

        strObj.classType();

        // Crear servicio para Integer
        GenericService<Integer> intService = new GenericService<>();
        intService.addElement(intObj);
        intService.addElement(intObj1);
        intService.addElement(intObj2);

        intService.sort();

        // Crear servicio para String
        GenericService<String> strService = new GenericService<>();
        strService.addElement(strObj);
        strService.addElement(strObj1);
        strService.addElement(strObj2);

        strService.sort();
        GenericClass<Integer> intObj4 = intService.get();
        System.out.println("Elemento obtenido: " + intObj4);

        // Imprimir los elementos Integer
        System.out.println("Elementos de la lista de Integers:");
        intService.printElement();

        // Imprimir los elementos String
        System.out.println("Elementos de la lista de Strings:");
        strService.printElement();

        // Uso del método genérico printArray para imprimir un array de Integer
        System.out.println("Imprimir un array de Integers:");
        strService.printArray(new Integer[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10});

    }
}