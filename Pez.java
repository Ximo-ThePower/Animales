package juego;

public class Pez extends Animal {

    public Pez(String nombre, int edad, String color) {
        super(nombre, edad, color);
    }

    @Override
    void hacerSonido() {
        System.out.println("GLU GLU");
    }

    @Override
    void reproducir() {
        System.out.println("Reproducir como pez");
    }
}
