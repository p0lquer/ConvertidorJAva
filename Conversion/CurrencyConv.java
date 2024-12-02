import java.util.Scanner;

interface money{
    static void moneda(){
            System.out.println("Usted tiene:");
        }
}
public class CurrencyConv {

    public CurrencyConv() {
    }

    public static void main(String[] args){
        System.out.println("1 Dolar");
        System.out.println("2 Peso");
        System.out.println("3 Euro");

    try (Scanner m = new Scanner(System.in)) {
        System.out.println("Ingrese la moneda a convertir:" );

         int moneda = m.nextInt();
         System.out.println("Ingrese la cantidad:");
         float cantidad = m.nextFloat();

         switch (moneda) {
            case 1 -> Dolar_a_otra(cantidad);
            case 2 -> Peso_a_otra(cantidad);
            case 3 -> Euro_a_otra(cantidad);
          default -> System.out.println("Respuesta invalida");
                }
    }
               
            }
            
            public static void Dolar_a_otra(float  cantidad) {
                System.out.println("1 Dolar = " + 0.98 + " Euro");
                System.out.println();
        
                System.out.println(cantidad + " Dolar = " + (cantidad * 0.98) + "Euro");
                System.out.println();
        
                System.out.println("1 Dolar = " + 60.21 + "Peso");
                System.out.println();
        
                System.out.println(cantidad + " Dolar = " + (cantidad*60.21) + " Peso");
        
            }
        
            static void Peso_a_otra(float  cantidad) {
        System.out.println("1 Peso = " + 0.017 + " Dolar");
        System.out.println();

        System.out.println();
        System.out.println(cantidad + " Peso = " + (cantidad * 0.017) + " Dolar");
        System.out.println();

        System.out.println("1 Peso = " + 0.015 + " Euro");
        System.out.println();

        System.out.println(cantidad + " Peso = " + (cantidad * 0.015) + " Euro");

    }

   static  void Euro_a_otra(float  cantidad) {
        System.out.println("1 Euro = " + 65.00 + "Peso");
        System.out.println();
        System.out.println(cantidad + " Euro = " + (cantidad * 65.00) + "Peso");
        System.out.println();
        System.out.println("1 Euro = " + 1.08 + "Dolar");
        System.out.println();
        System.out.println(cantidad + " Euro = " + (cantidad * 1.08) + "Dolar");
    }
}
