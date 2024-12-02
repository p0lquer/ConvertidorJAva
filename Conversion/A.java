import java.util.*;

public class A {
    
    public static void main(String[] ars){
           try (Scanner obj = new Scanner (System.in)) {
            System.err.println("Ingrese un numero: ");

              int num = obj.nextInt();

               System.out.println("El numero es: " + num);
               
            ArrayList<Integer> list = new ArrayList<>();

            for (int i = num ; i >= 0; i--){
                list.add(i);
            } 

            System.out.println("Lista invertida: " + list);
        }
    }
}
