package Hash;

import java.util.Scanner;

public class EstudianteITZ {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        /*System.out.println("¿De que tamaño es la tabla?");
        int n=leer.nextInt();*/
        //PUSE 5 POR EL EJEMPLO EN LA OTRA CLASE SOLO PUSE 5 NOMBRES 
        int n=5;
        TablaHash tabla = new TablaHash(n);
        /*String datos="12 6 61 1 3";
        String[] elementos =datos.split(" ");*/
        String[] elementos= new String[n];
        System.out.println("LA POSICION 0 ES PARA LENNON, POSICION 1 STAR, POSICION 2 RINGO,"
                + "POSICION 3 WINSTON, POSICION 4 ONO");
        tabla.generaValores(elementos, n);
        tabla.funcionHash(elementos);
        tabla.mostrar(n);
        //tabla.nombre(n,elementos);
        System.out.println("Que informacion busca");
        String elemento = leer.next();
        tabla.buscarClave(elemento,n,elementos);
    }

}

