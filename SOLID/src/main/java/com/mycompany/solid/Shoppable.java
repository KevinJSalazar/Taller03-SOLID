/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mycompany.solid;

/**
 *
 * @author agome
 */
public interface Shoppable {
    
    public default void realizarCobro(double monto){}
    //cargar el monto de compra al medio de pago
    
    
    public default void calcularImpuestosFactura(){
    //calcula los impuestos asociados a la compra
    }
    
    public default void generarFactura(){
    //generar una nueva factura
    }
}
