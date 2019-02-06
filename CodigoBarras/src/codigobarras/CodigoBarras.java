/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codigobarras;

import java.util.Scanner;

/**
 *
 * @author user
 */
public class CodigoBarras {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        boolean salir=false;
        Vacuna v = new Vacuna ("000900106055","RUBEOLA",0, "pZIFER", "23AO");
        
        Jeringa j = new Jeringa("7862100851905","IntraDermica",0,"BAyer", "5ml");
        
        Guantes g = new Guantes("7861081713370", 0, "Redox", "2345");
        
        
        while (salir==false){
           Scanner sn = new Scanner(System.in);
        
           System.out.println("1. Ingresar inventario");
           System.out.println("2. Descontar inventario");
           System.out.println("3. Mostrar inventario");
           System.out.println("4. Salir");
           
            
           System.out.println("Escribe una de las opciones");
            int opcion = sn.nextInt();
            
           switch(opcion){
               case 1:
                   String barra="";
                   System.out.println("Escanee el producto o presiona 4 para salir");
                   do{ 
                    barra= sn.next();
                    if(barra.equals("000900106055")){
                       v.existencia(barra);
                    }
                    if (barra.equals("7862100851905")){
                        j.existencia(barra);
                    
                    }
                    if(barra.equals("7861081713370")){
                    g.existencia(barra);
                    }
                    
                    
                        
                   }while(!barra.equals("4"));
                   break;
               case 2:
                   //String barra="";
                   System.out.println("Escanee el producto o presiona 4 para salir");
                   do{ 
                    barra= sn.next();
                    if(barra.equals("000900106055")){
                       v.reduccion(barra);
                    }
                    if (barra.equals("7862100851905")){
                        j.reduccion(barra);
                    
                    }
                    if(barra.equals("7861081713370")){
                    g.reduccion(barra);
                    }
                    
                    
                        
                   }while(!barra.equals("4"));
                   
                   break;
                case 3:
                   System.out.println("Vacunas: " +v.cantidad);
                   System.out.println("Jeringas: " +j.cantidad);
                   System.out.println("Guantes: "+g.cantidad);
                   
                    break;
                case 4:
                   salir=true;
                   break;
                default:
                   System.out.println("Solo números entre 1 y 4");
           }
            
       }
        
    }
     
static Vacuna IngresarProducto(Vacuna v){
    Scanner sn = new Scanner(System.in);
    System.out.println("Escanee el producto");
    String codigo= sn.next();
    System.out.println("Ingrese el nombre");
    String nombre= sn.next();
    System.out.println("Laboratorio");
    String Laboratorio= sn.next();
    System.out.println("Lote");
    String Lote= sn.next();
    
    v = new Vacuna(codigo, nombre, 1, Laboratorio, Lote);
    return v;
}
}
    

