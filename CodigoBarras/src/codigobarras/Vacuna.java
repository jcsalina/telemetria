/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codigobarras;

/**
 *
 * @author user
 */
public class Vacuna {
    String Codigo;
    String Nombre;
    int cantidad;
    String Laboratorio;
    String Lote;

    public Vacuna(String Codigo, String Nombre, int cantidad, String Laboratorio, String Lote) {
        this.Codigo = Codigo;
        this.Nombre = Nombre;
        this.cantidad = cantidad;
        this.Laboratorio = Laboratorio;
        this.Lote = Lote;
    }
    
    public void existencia (String barra){
    if (Codigo.equals(barra)){
    this.cantidad= cantidad+1;
        //System.out.println(cantidad);
    }
    else {
        System.out.println("otro");
    }
    }
    public void reduccion (String barra){
    if (Codigo.equals(barra)){
    this.cantidad= cantidad-1;
        //System.out.println(cantidad);
    }
    else {
        System.out.println("otro");
    }
    }
    
    
    
    
}
