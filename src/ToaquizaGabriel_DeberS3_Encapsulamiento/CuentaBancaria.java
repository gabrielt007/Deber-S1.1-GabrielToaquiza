package ToaquizaGabriel_DeberS3_Encapsulamiento;

public class CuentaBancaria {
    private double saldo = 0;
    private String titular;

    void depositar(double monto){
        if(monto>0){
            saldo+=monto;
        }
    }
    void retirar(double monto){
        if(monto<=saldo){
            saldo-=monto;
        }
    }

    public double getSaldo() {
        return saldo;
    }

    public static void main(String[] args) {
        CuentaBancaria c = new CuentaBancaria();
        c.saldo = 500;
        System.out.println("Saldo inicial:"+c.getSaldo());
        c.depositar(50);
        System.out.println("Saldo despues de un deposito valido:"+c.getSaldo());
        c.retirar(50);
        System.out.println("Saldo despues de un retiro valido:"+c.getSaldo());
        c.retirar(1000);
        System.out.println("Saldo despues de un retiro invalido:"+c.getSaldo());

    }

}
