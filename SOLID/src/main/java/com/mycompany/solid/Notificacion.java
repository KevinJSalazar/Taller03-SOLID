/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.solid;

/**
 *
 * @author agome
 */

public class Email implements Notificable {
    public void notificar (Shoppable pago){
        //enviarEmail
    }
}

public class Sms implements Notificable {
    public void notificar (Shoppable pago){
        //enviarSms
    }
}

public class Signal implements Notificable {
    public void notificar (Shoppable pago){
        //enviarSignal
    }
}

