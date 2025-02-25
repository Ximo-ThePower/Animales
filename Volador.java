package juego;

public interface Volador {
    int ALTURA_MAXIMA_VUELO = 1000; //CONSTANTE
    //Interfaz para animales que vuelan
    void volar();
    void aterrizar();
    void caerse();
}
