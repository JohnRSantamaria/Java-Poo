/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ResetStoreX
 */
public class PruebaConstructor {
    public static void main(String[] args) {
        Cuenta cuenta = new Cuenta(50);       
        Cuenta cuenta2 = new Cuenta(50);  
        Cuenta cuenta3 = new Cuenta(50);         
        
        System.out.println(Cuenta.getTotal());
    }
}
