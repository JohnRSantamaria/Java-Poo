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
        diego.setNombre("Diego");
        diego.setDocumento("1231321");
        diego.setTelefono("1231231");       
        
        Cuenta cuentaDeDiego = new Cuenta(1);
        
        cuentaDeDiego.setAgencia(1);
        cuentaDeDiego.setNumero(1);
        cuentaDeDiego.setTitular(diego);        
        
        System.out.println(cuentaDeDiego.getTitular().getDocumento());
        
        System.out.println(cuentaDeDiego.getTitular());
        System.out.println(diego);
            
    }
}
