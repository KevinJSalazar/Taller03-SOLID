/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package classes_interfaces;

/**
 *
 * @author CltControl
 */
public interface LoginSession {
    void verifySession();
    void tellInvalidUser(); 
    void tellInvalidPassword();
}
