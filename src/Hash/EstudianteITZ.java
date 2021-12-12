package Hash;

import java.util.Scanner;

/**
 *
 * @author Bryan Saim
 */
public class EstudianteITZ {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("¿De que tamaño es la tabla?");
        int n=leer.nextInt();
        TablaHash tabla = new TablaHash(10);
        String datos="99 91 53 20 89 12 87 36";
        String[] elementos =datos.split(" ");
      //  String[] elementos= new String[10];
         
        tabla.funcionHash(elementos);
        tabla.mostrar();
    }
    public static void generaValores(String [] elementos,int n){
        for(int i=0;i<n;i++){
            elementos[i]=""+(int)(Math.random()*100+1);
        }
        System.out.print("Elemento: ");
        for(String e: elementos){
            System.out.print(" "+e);
        }
        System.out.println();
    }
}
