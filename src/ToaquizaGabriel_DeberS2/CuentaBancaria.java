package ToaquizaGabriel_DeberS2;

import java.util.Scanner;
public class CuentaBancaria {
    private String nombreTitular;
    private double saldo;
    public double monto;
    public CuentaBancaria(String nombreTitular,double saldo){
        this.nombreTitular=nombreTitular;
        this.saldo=saldo;
    }
    private void mostraInformacion(){
        System.out.println("\nNombre del titular: "+nombreTitular+"\nSaldo actual: "+saldo);
    }
    public void depositar(){
        Scanner dinero = new Scanner(System.in);
        System.out.println("Ingresa el monto a depositar: ");
        double monto = dinero.nextDouble();
        saldo+=monto;

    }
    public void retirar(){
        Scanner dinero = new Scanner(System.in);
        System.out.println("Ingresa el monto a retirar: ");
        double monto = dinero.nextDouble();
        if(monto<=saldo){
            saldo-=monto;
        }else{
            System.out.println("El monto supera a el saldo de la cuenta.");
        }
    }

    public static void main(String[] args) {
        CuentaBancaria nuevaCuenta = new CuentaBancaria("Gabriel Toaquiza",50.0);
        nuevaCuenta.mostraInformacion();
        nuevaCuenta.depositar();
        nuevaCuenta.mostraInformacion();
        nuevaCuenta.retirar();
        nuevaCuenta.mostraInformacion();
    }

}
