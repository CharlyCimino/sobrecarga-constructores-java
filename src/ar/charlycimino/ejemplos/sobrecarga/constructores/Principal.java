package ar.charlycimino.ejemplos.sobrecarga.constructores;

/**
 *
 * @author Charly Cimino Aprendé más Java en mi canal:
 * https://www.youtube.com/c/CharlyCimino Encontrá más código en mi repo de
 * GitHub: https://github.com/CharlyCimino
 */
public class Principal {

    public static void main(String[] args) {

        CuentaBancaria cb = new CuentaBancaria("miAlias", "Pesos", "Caja de ahorros");
        CuentaBancaria cb3 = new CuentaBancaria("Dólares", "Caja de ahorros");

        cb.mostrarDatos();
        cb3.mostrarDatos();

    }

}
