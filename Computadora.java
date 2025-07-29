/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author leayi
 */
public class Computadora {
    private Pantalla pantalla;
    private Teclado teclado;

    public Computadora(Pantalla pantalla, Teclado teclado) {
        this.pantalla = pantalla;
        this.teclado = teclado;
    }

    public void encender(String tecla) {
        teclado.escribir("Encendiendo el equipo");
        teclado.presionarTecla(tecla);
        String teclaPresionada = teclado.getTeclapresionada(tecla);

        if (teclaPresionada.equalsIgnoreCase("F1")) {
            pantalla.encender();
        } else {
            System.out.println("No presionó F1");
        }
    }
}
