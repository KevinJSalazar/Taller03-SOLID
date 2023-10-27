/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.solid;

/**
 *
 * @author agome
 */
public class PagoPaypal implements Shoppable {
    
    private boolean loggedIn; //conexión a cuenta Paypal
    
    @Override
    public void realizarCobro(double monto) {
        if (!loggedIn){
            return;
        }
        //cargar el monto de compra al medio de pago
    }  

    @Override
    public void calcularImpuestosFactura() {
    }

    @Override
    public void generarFactura() {
    }

}
