package tree;

import java.util.Scanner;

public class ManejoArbol {
    
    public static void main(String[] args) {
       //
        Scanner sc = new Scanner(System.in); 
        Nodo raiz = null;
        int opc=0;
        do {
            System.out.println("1) Agregar");
            System.out.println("2) Preorden");
            System.out.println("3) Inorden");
            System.out.println("4) Postorden");
            System.out.println("5) Salir");
            opc = sc.nextInt();
            switch(opc){
                case 1: 
                    Nodo nuevo = new Nodo(); 
                    System.out.println("Num:");
                    nuevo.numero = sc.nextInt();
                    if(raiz==null)
                        raiz=nuevo;
                    else 
                        acomdarNodo(raiz, nuevo);
                    break;
                case 2: 
                    preorden(raiz);
                    System.out.println();
                    break; 
                case 3:
                    inorden(raiz);
                    System.out.println();
            }
        }while(opc!=5);
   
    }
    
    public static void inorden(Nodo nodo){
        if(nodo!=null){
            inorden(nodo.izq);
            System.out.print(" " + nodo.numero);
            inorden(nodo.der);
        }
    }
    
    public static void preorden(Nodo nodo)
    {
        if(nodo!=null){
            System.out.print(" " + nodo.numero);
            preorden(nodo.izq);
            preorden(nodo.der);
        }
    }
    
    public static void acomdarNodo(Nodo pad
            , Nodo nuevo){
        if(nuevo.numero<pad.numero)
        {
            if(pad.izq==null)
                pad.izq = nuevo;
            else 
                acomdarNodo(pad.izq, nuevo);
        }else 
        {
            if(pad.der==null)
                pad.der=nuevo; 
            else 
                acomdarNodo(pad.der, nuevo);
        }
    }
    
}
