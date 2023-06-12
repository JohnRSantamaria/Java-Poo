/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ResetStoreX
 */
public class PuevaEncapsulamiento {
    public static void main(String[] args) {
        Cuenta cuenta = new Cuenta(1);
        Cliente cliente = new Cliente();
        
        cliente.setNombre("Diego");
        cliente.setDocumento("12313123sfasf");
        
        cuenta.setTitular(cliente);
        
        System.out.println(cliente.getNombre());
        System.out.println(cuenta.getTitular().getNombre());
               
    }
}
 