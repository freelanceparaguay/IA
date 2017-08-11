package estructurasarboles;


import estructurasarboles.NodoArbol;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author usuario
 */
public class Arbol {
    NodoArbol raiz;

    public Arbol() {
        raiz=null;
    }//consructor
    
    public void InsertarNodoArbol(int nuevoValor){
        if(raiz==null){
            raiz=new NodoArbol(nuevoValor);
        }else{
            raiz.insertarValor(nuevoValor);
        }//fin if
    }//InsertarNodoArbol
           
    private void recorrerPreOrden(NodoArbol hijo){
        if(hijo==null){
            System.out.println(" es hoja;");         
            return;
        }
        
        System.out.print("\n nodo="+hijo.getDatos()+",");
        System.out.print("a la I de "+hijo.getDatos()+"->");
        recorrerPreOrden(hijo.nodoIzq);
        System.out.print("a la D de "+hijo.getDatos()+"->");        
        recorrerPreOrden(hijo.nodoDer);        
    }//recorrer
    

    private void recorrerPostOrden(NodoArbol hijo){
        if(hijo==null){
 //           System.out.println(" es hoja;");         
            return;
        }        
//        System.out.print("a la I de "+hijo.getDatos()+"->");
        recorrerPostOrden(hijo.nodoIzq);
//        System.out.print("a la D de "+hijo.getDatos()+"->");        
        recorrerPostOrden(hijo.nodoDer);                
        System.out.print("\n nodo="+hijo.getDatos()+",");
    }//recorrer


    
    public void recorrerArbolPreOrden(){
//        recorrerPreOrden(raiz);
    }//recorrer
    
    public void recorrerArbolPostOrden(){
        recorrerPostOrden(raiz);
    }//recorrer

    
}//fin Arbol
