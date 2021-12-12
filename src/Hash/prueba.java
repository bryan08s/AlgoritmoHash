package Hash;

import javax.swing.JOptionPane;

/**
 *
 * @author Bryan Saim
 */
public class prueba {
    public static void main(String[] args) {
        TablaHash hash=new TablaHash(8);
        String datos="99 91 53 20 89 12 87 36";
        String[] elementos =datos.split(" ");
        
        System.out.println("Elementos= "+hash);
        hash.funcionHash(elementos);
        hash.mostrar();
        String clave;
        do{
            clave=JOptionPane.showInputDialog("Clave a buscar");
            String salida=hash.buscarClave(clave);
            System.out.println(salida);
        }while(clave.charAt(0)!='0');
        
    }
}
