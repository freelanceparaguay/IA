package estructurasarboles;

import java.util.Scanner;

/**
 *
 * @author usuario
 */
public class EstructurasArboles {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int valoresIngreso=0;
        int total=0;
        
        int arregloEnteros[]={17, 54, 3, 30, 95, 69, 85, 88, 16, 30};
        
        Arbol arbol=new Arbol();
        
  //      Scanner entrada=new Scanner(System.in);        

        System.out.println("-> Ingrese total entradas = ");        
 //       total=entrada.nextInt();
/*        for(int i=0; i<total; i++){
            System.out.println("%d -> Ingrese valor = "+i);
            valoresIngreso=entrada.nextInt();
            //System.out.println("Entrada %d = "+valoresIngreso);
            arbol.InsertarNodoArbol(valoresIngreso);
            
        }//for
*/
//        17, 54, 3, 30, 95, 69, 85, 88, 16, 30
 
          for(int i=0; i<arregloEnteros.length; i++){
//              System.out.println("cargando -> "+arregloEnteros[i]+"/"+arregloEnteros.length);
              arbol.InsertarNodoArbol(arregloEnteros[i]);              
          }//for
           
        System.out.println("Recorrer arboles \n");
//        arbol.recorrerArbolPreOrden();
        arbol.recorrerArbolPostOrden();        
               
    } //main
    
}//fin Estructuras de árboles
