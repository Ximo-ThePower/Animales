package juego;

public class Pajaro extends Animal implements Volador, Picotear{
    @Override
    void reproducir() {
        System.out.println("Pajaro reproducir");
    }

    public Pajaro() {
    }

    @Override
    void hacerSonido() {
        System.out.println("PIO PIO PIO PIO PIO");
    }

    public Pajaro(String nombre, int edad, String especie) {
        super(nombre, edad, especie);
        System.out.println("Pajaro");
    }
    //Metodo Interfaz Picotear
    @Override
    public void picoteo() {
        System.out.println("Picoteo pan");
    }
    //Metodos Interfaz Volador
    @Override
    public void volar() {
        System.out.println("Vuelo muy alto");
    }
    @Override
    public void aterrizar() {
        System.out.println("Aterrizar");
    }
    @Override
    public void caerse() {
        System.out.println("Me pego una torta");
    }
}
