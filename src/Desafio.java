import java.util.Scanner;

public class Desafio {
    public static void main(String[] args) {
        String nombre = "Stark";
        String tipoCuenta = "corriente";
        double  saldo = 1599.99;
        int opcion = 0;

        System.out.println("*****************");
        System.out.println("\nNombre del cliente: " +nombre);
        System.out.println("El tipo de cuenta es: " + tipoCuenta);
        System.out.println("Saldo disponible es: " + saldo);
        System.out.println("\n*****************");

        String menu = """
                *** Escriba el  numero de opcion deseada***
                1 - Consultar saldo
                2 -Retirar
                3 -Depositar
                9 -Salir
                """;
        Scanner teclado = new Scanner(System.in);
        while  (opcion !=9){
            System.out.println(menu);
            opcion = teclado.nextInt();

            switch (opcion){
                case 1:
                    System.out.println("EL saldo acutalizado es: " +saldo+"$");
                    break;
                case 2:
                    System.out.println("Cual es el valor que desea retirar");
                    double valorARetirar = teclado.nextDouble();
                    if (saldo < valorARetirar){
                        System.out.println("Saldo insuficiente");
                    }else{
                        saldo -= valorARetirar;
                        System.out.println("El saldo actializado es: "+saldo);
                    }
                    break;
                case 3:
                    System.out.println("Cual es el valor a depositar");
                    double valorADepositar = teclado.nextDouble();
                    if (valorADepositar >=0){
                        saldo += valorADepositar;
                        System.out.println("El saldo actualizado es: "+ saldo);

                    }else{
                        System.out.println("El valor a depositar debe ser mayor o igual a 0");
                    }
                    break;
                case 9:
                    System.out.println("Saliendo del programa, gracias por usar nuestros servcios");
                    break;
                default:
                    System.out.println("opcion no valida");



            }
        }
    }
}
