package juego;

import javax.swing.*;

public class Mosquito extends Animal implements Volador, Picotear {
    @Override
    void reproducir() {
        System.out.println("OTRO Mosquito");
    }

    public Mosquito(String nombre, int edad, String color) {
        super(nombre, edad, color);
    }

    @Override
    void hacerSonido() {
        System.out.println("BZZZZZZ");
    }

    @Override
    public void picoteo() {
        System.out.println("Te saco sangre");
    }

    @Override
    public void volar() {
        System.out.println("Vuelo a tu alrededor y no te dejo dormir");
    }

    @Override
    public void aterrizar() {
        System.out.println("Aterrizo. Mosquito");
    }

    @Override
    public void caerse() {
        System.out.println("Me caigo");
    }

    public void matarMosquito(){
        System.out.println("Matar Mosquito");
    }

}
