package ar.charlycimino.ejemplos.sobrecarga.constructores;

/**
 *
 * @author Charly Cimino Aprendé más Java en mi canal:
 * https://www.youtube.com/c/CharlyCimino Encontrá más código en mi repo de
 * GitHub: https://github.com/CharlyCimino
 */
public class CuentaBancaria {

    private String CBU;
    private String alias;
    private double saldo;
    private String moneda;
    private String tipo;

    // CONSTRUCTOR
    public CuentaBancaria(String alias, String moneda, String tipo) {
        this.CBU = generarCBU();
        setAlias(alias);
        setMoneda(moneda);
        setTipo(tipo);
    }

    // CONSTRUCTOR
    public CuentaBancaria(String moneda, String tipo) {
        this("ALIAS.POR.DEFECTO", moneda, tipo);
    }

    private String generarCBU() {
        return "12345678"; // PENDIENTE
    }

    public void mostrarDatos() {
        System.out.println(CBU + " " + alias + " " + saldo + " " + moneda + " " + tipo);
    }

    public void setAlias(String alias) {
        if (alias != null) {
            this.alias = alias;
        }
    }

    public void setMoneda(String moneda) {
        if (moneda != null) {
            this.moneda = moneda;
        }
    }

    public void setTipo(String tipo) {
        if (tipo != null) {
            this.tipo = tipo;
        }
    }

    public double getSaldo() {
        return saldo;
    }

    public void depositar(double monto) {
        if (monto > 0) {
            saldo = saldo + monto; // saldo += monto
        }
    }

    private boolean saldoDisponible(double monto) {
        return saldo >= monto;
    }

    public void extraer(double monto) {
        if (saldoDisponible(monto)) {
            saldo = saldo - monto; // saldo -= monto
        }
    }

}
