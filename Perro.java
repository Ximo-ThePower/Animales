package juego;

public class Perro extends Animal {
    String raza;
    int numeroPatas;

    //CONSTRUCTOR
    public Perro(String nombre, int edad, String color) {
        super(nombre, edad, color);
        System.out.println("Perro Creado");
        this.raza = "Mestizo";
        this.numeroPatas = 4;
    }

    public Perro(String nombre, int edad, String color, String raza){
        super(nombre,edad,color);
        System.out.println("Perro Creado");
        this.raza = raza;
        this.numeroPatas = 4;
    }

    public Perro(){
        System.out.println("Perro Creado");
        super.setEdad(0);
        super.setNombre("Thor");
        super.setColor("Blue");
    }

    //Metodos de la clase
    public void ladrar(){
        System.out.println("GUAU");
    }

    //DESARROLLAMOS METODOS ABSTRACTOS
    @Override
    void reproducir() {
        System.out.println("Me reproduzco como un perro");
    }
    @Override
    void hacerSonido() {
        ladrar();
    }
}
