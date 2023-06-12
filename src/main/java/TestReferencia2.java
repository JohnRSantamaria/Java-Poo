/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ResetStoreX
 */
public class TestReferencia2 {
    public static void main(String[] args) {
        Cliente diego = new Cliente();
        diego.nombre = "Diego";
        diego.documento = "1231321";
        diego.telefono = "1232131231";              
        
        Cuenta cuentaDeDiego = new Cuenta();
        
        cuentaDeDiego.agencia = 1;
        cuentaDeDiego.numero = 1;
        cuentaDeDiego.titular = diego;
        
        System.out.println(cuentaDeDiego.titular.documento );
        
        System.out.println(cuentaDeDiego.titular);
        System.out.println(diego);
            
    }
}
