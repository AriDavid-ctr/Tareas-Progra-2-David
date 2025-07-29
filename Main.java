/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author leayi
 */
public class Main {
    public static void main(String[] args) {
        Teclado teclado = new Teclado("Logit", "Negro", 85);
        Pantalla pantalla = new Pantalla();
        Computadora compu = new Computadora(pantalla, teclado);

        compu.encender("A");
        System.out.println("---");
        compu.encender("F1");
    }
}
