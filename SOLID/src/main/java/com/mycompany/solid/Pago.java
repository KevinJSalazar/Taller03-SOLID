/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.solid;

/**
 *
 * @author agome
 */
public class Pago implements Shoppable{
    
    @Override
    public void realizarCobro(double monto) {
        //cargar el monto de compra al medio de pago
    }

    @Override
    public void calcularImpuestosFactura() {
        //calcula los impuestos asociados a la compra
    }

    @Override
    public void generarFactura() {
        //generar una nueva factura
    }

}
