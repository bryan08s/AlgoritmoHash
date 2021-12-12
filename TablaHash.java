package Hash;
import java.util.Arrays;
public class TablaHash {
    String [] arreglo;
    int tamaño,contador,indiceArreglo;

    public TablaHash(int tam) {
        tamaño = tam;
        arreglo=new String[tam];
        Arrays.fill(arreglo,"-1");
    }
    public void funcionHash(String []cadenaArreglo){
        for(int i=0;i< cadenaArreglo.length;i++){
            String elemento= cadenaArreglo[i];
            indiceArreglo=Integer.parseInt(elemento)%(tamaño-1);
            System.out.println("El indice es "+indiceArreglo+" Para el elemento "+ elemento);
            //colisiones 
            while(Integer.parseInt(arreglo[indiceArreglo])!=-1){
                indiceArreglo++;
                System.out.println("Ocurrio una colision en el indice "+(indiceArreglo-1)+" Cambiar el indice "+ indiceArreglo);
                indiceArreglo%=tamaño;
            }
            arreglo[indiceArreglo]=elemento;
        }
    }
    
    public void mostrar(int n){
        int incremento=0,i,j;
        for( i=0;i<1;i++){
            incremento+=n;
            for( j=0;j<71;j++){
                System.out.print("-");
            }
            System.out.println();
            for(j=incremento-n;j<incremento;j++){
                System.out.format(" |    %3s"+"     ",j);
            }
            System.out.println("|");
            for(int x=0;x<71;x++){
                System.out.print("-");
            }
            System.out.println();
            for(j=incremento-n;j<incremento;j++){
                if(arreglo[j].equals("-1")){
                    System.out.print("|");
                }else{
                    System.out.print(String.format(" | %3s"+" ",arreglo[j]));
                }
            }
            System.out.println("|");
            for(j=0;j<71;j++){
                System.out.print("-");
            }
            System.out.println();
        }
    }
    
    public void nombre(int n,String elementos[]){
        String[] nombre=new String[n];
        nombre[0]="Lennon";
        nombre[1]="Star";
        nombre[2]="Ringo";
        nombre[3]="Winston";
        nombre[4]="Ono";
        for(int i=0;i<n;i++){
            elementos[i]=String.format(" |%3s"+" ",arreglo[i])+" "+nombre[i];
        }
        for(int i=0;i<n;i++){
            System.out.println(elementos[i]);
        }
    }
    
    public void generaValores(String [] elementos,int n){
        for (int i = 0; i <n; i++) {
            int aleatorio = (int) (Math.random()*(-9999999)+20000000);
            elementos[i] = ""+20+aleatorio;
        }
        System.out.println("Elementos:");
        for(String e: elementos){
            System.out.print(e+" ");
        }
        System.out.println();
    }
        
    public String buscarClave(String elemento,int n,String elementos[]){
        String[] nombre=new String[n];
        nombre[0]="Lennon";
        nombre[1]="Star";
        nombre[2]="Ringo";
        nombre[3]="Winston";
        nombre[4]="Ono";
        for(int i=0;i<n;i++){
            elementos[i]=String.format(" |%3s"+" ",arreglo[i])+" "+nombre[i];
        }
        for(int i=0;i<n;i++){
            System.out.println(elementos[i]);
        }
        indiceArreglo=Integer.parseInt(elemento) % (tamaño-1);
        contador=0;
        while(Integer.parseInt(arreglo[indiceArreglo])!=-1){
            if(arreglo[indiceArreglo].equals(elemento)){
               System.out.println("La cuenta ( "+elemento+" ) a nombre de "+nombre[indiceArreglo]);
            }
            indiceArreglo++;
            indiceArreglo%=tamaño;
            contador++;
            if(contador>(tamaño-1)){
                break;
            }
        }
        String cadena="La clave "+elemento+" No fue encontrada ";
        return  cadena;
    }

}


