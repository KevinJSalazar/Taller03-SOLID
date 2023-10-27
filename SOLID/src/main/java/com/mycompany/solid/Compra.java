/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.solid;

import java.util.List;

/**
 *
 * @author agome
 */
public class Compra {
    private List articulos;
    private Shoppable pago;
    
    public Compra (Shoppable pago){
        this.pago = pago;
    }
    public void agregarArticulos (Articulo articulo){
        //agregar un articulo a la compra
    }
    
    public void removerArticulos (Articulo articulo){
        //remover un articulo a la compra
    }

    
   
    
    
    
    
    
    
    
    private static class Articulo {

        public Articulo() {
        }
    }
}
