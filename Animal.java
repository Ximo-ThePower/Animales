package juego;

abstract public class Animal {
    private String nombre;
    private int edad;
    private String color;

    //CONSTRUCTORES
    public Animal(String nombre, int edad, String color) {
        this.nombre = nombre;
        this.edad = edad;
        this.color = color;
    }
    public Animal(){}

    //SETTERS Y GETTERS
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    // METODOS PROPIOS DE LA CLASE
    public void respirar(){
        System.out.println("El animal esta respirando");
    }

    public void comer(){
        System.out.println("El animal esta comiendo");
    }
    public void presentarse(){
        System.out.println("Mi nombre es " + nombre + " | " +  "edad es " + edad + " | " + "color es " + color);
    }

    //METODOS ABSTRACTOS
    abstract void reproducir();
    abstract void hacerSonido();
}
