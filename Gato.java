package juego;

public class Gato extends Animal{
    int numVidas;
    //CONSTRUCTOR
    public Gato(String nombre, int edad, String color) {
        super(nombre, edad, color);
        this.numVidas = 7;
    }

    //MEtodos abstractos Animal
    @Override
    void hacerSonido() {
        System.out.println("MIAU MIAU!");
    }

    @Override
    void reproducir() {
        System.out.println("REPRODUCIR GATO");
    }
    //GETTER - SETTER
    public int getNumVidas() {
        return numVidas;
    }
    public void setNumVidas(int numVidas) {
        this.numVidas = numVidas;
    }


    //Metodos propios
    public void aranyar(){
        System.out.println("TE ARAÑO!");
    }
    public void restarVidas(){
        this.numVidas--;
    }
}
