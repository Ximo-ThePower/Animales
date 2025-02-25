package juego;

public class Main {
    public static void main(String[] args) {

        Animal  [] misMascotas = new Animal[5];

        misMascotas[0] = new Gato("Camilo", 0, "Marron");
        misMascotas[1] = new Perro("Jandula",3,"negro","Pastor Aleman");
        misMascotas[2] = new Pez("Camilo", 0, "Marron");
        misMascotas[3] = new Mosquito("Pina",50,"Rojo");
        misMascotas[4]  = new Pajaro("Benita", 10, "Verde");

        for (int i = 0; i < misMascotas.length; i++) {

            if (misMascotas[i] instanceof Gato) {
                ( (Gato) misMascotas[i]).restarVidas();
                System.out.println("Vidas: " + ( (Gato) misMascotas[i]).getNumVidas());
            } else {
                if (misMascotas[i] instanceof Perro) {
                    ((Perro) misMascotas[i]).ladrar();
                    ((Perro) misMascotas[i]).hacerSonido();
                } else {
                    if (misMascotas[i] instanceof Pez) {
                        ((Pez) misMascotas[i]).reproducir();
                        ((Pez) misMascotas[i]).hacerSonido();

                    } else {
                        if (misMascotas[i] instanceof Mosquito) {
                            ((Mosquito) misMascotas[i]).volar();
                            ((Mosquito) misMascotas[i]).hacerSonido();
                        } else{
                            //Pajaro
                            ( (Pajaro) misMascotas[i]).presentarse();
                            ((Pajaro) misMascotas[i]).caerse();
                            ( (Pajaro) misMascotas[i]).picoteo();

                        }
                    }
                }
            }

        }

        for (Animal animal : misMascotas) {
           switch (animal.getClass().getSimpleName()){
               case "Gato":
                   System.out.println(animal.toString());
                   break;
               case "Perro":
                   System.out.println(animal.toString());
                   break;
               default:
                   System.out.println("Desconocido");
           }

        }

    }
}
