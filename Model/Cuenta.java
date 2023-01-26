package Model;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import Exceptions.SaldoIncorrecto;
import Exceptions.NumeroCuentaError;

public class Cuenta {
    private String idCuenta;
    private double saldo;


    public Cuenta ( String  idCuenta, String saldo) throws NumeroCuentaError, SaldoIncorrecto {
        setIdCuenta(idCuenta);
        setSaldo(saldo);
    }


    public String getIdCuenta() {
        return idCuenta;
    }


    public void setIdCuenta(String idCuenta) throws NumeroCuentaError {
        
        Pattern p = Pattern.compile("^[0-9]{16}$");
        Matcher m = p.matcher(idCuenta);
        if(m.matches()) {
            this.idCuenta = idCuenta;
        } else {
            throw new NumeroCuentaError("El número de cuenta debe contener exactamente 16 digítos");
        }
        
    }


    public double getSaldo() {
        return saldo;
    }


    public void setSaldo(String saldo) throws SaldoIncorrecto {
        Pattern p = Pattern.compile("^[0-9]+([\\.,][0-9]+)?$");
        Matcher m = p.matcher(saldo);
        if(m.matches()) {
         this.saldo = Double.parseDouble(saldo);
        } else {
            throw new SaldoIncorrecto("Por favor ingrese un número");
        }
        
    }


    

}
