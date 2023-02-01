package Model;

import java.util.ArrayList;

public class Cliente {
    
    private String idCliente;
    private String nombre;
    private ArrayList<Cuenta> cuentas = new ArrayList<Cuenta>();

    public Cliente ( String idCliente, String nombre, Cuenta cuenta) {
        setNombre(nombre);
        setIdCliente(idCliente);
        this.cuentas.add(cuenta);
    }

    //Funciones 
    public String imprimirCliente( ) {
        String clienteDatos = "ID: " + idCliente + "\tNombre: " + nombre + "\n";
        int contadorCuentas = 0;

        while( contadorCuentas < cuentas.size() ){
            clienteDatos += "Cuenta: " + cuentas.get(contadorCuentas).getIdCuenta() + "\t\tSaldo: " + cuentas.get(contadorCuentas).getSaldo() + "\n";

            contadorCuentas++;
        }

        return clienteDatos;
    }


    //Getters and Setters

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(String idCliente) {
        this.idCliente = idCliente;
    }

    public Cuenta ultimaCuentaAgregada( ) {
        return cuentas.get(cuentas.size()-1);
    }

    public ArrayList<Cuenta> getCuentas() {
        return cuentas;
    }

    public void setCuentas(ArrayList<Cuenta> cuentas) {
        this.cuentas = cuentas;
    }

    

    


}