/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author leayi
 */
public class Teclado {
    private String marca;
    private String color;
    private int tamanio;

    public Teclado(String marca, String color, int tamanio) {
        this.color = color;
        this.marca = marca;
        this.tamanio = tamanio;
    }

    public void escribir(String texto) {
        System.out.println("Teclado funcionando: " + texto);
    }

    public void presionarTecla(String tecla) {
        System.out.println("Presionó la tecla: " + tecla);
    }

    public String getTeclapresionada(String tecla) {
        return tecla;
    }
}

