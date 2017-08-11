package estructurasarboles;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author usuario
 */
public class NodoArbol {
    NodoArbol nodoIzq;
    int datos;
    NodoArbol nodoDer;
    
    
    public NodoArbol(int datosNodo){
        datos=datosNodo;
        nodoIzq=null;
        nodoDer=null;
    }//fin constructor 
    
    public void insertarValor(int valor){                
        if(valor < this.datos){
            // se va a la izquierda
            if(nodoIzq==null){
                nodoIzq= new NodoArbol(valor);
            }else{
                nodoIzq.insertarValor(valor);
            }//nodoIzq                                    
        }else{
            if(nodoDer==null){
                nodoDer= new NodoArbol(valor);
            }else{
                nodoDer.insertarValor(valor);
            }//nodoIzq        
        }//fin valor 
    }//insertarValor

    public int getDatos(){
        return this.datos;
    }//getDatos
           
}//fin NodoArbol
