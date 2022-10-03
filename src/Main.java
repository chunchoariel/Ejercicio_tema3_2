public class Main {
    public static void main(String[] args) {
        Coche miCoche = new Coche(); //Creando Objeto
        miCoche.AgregarPuerta();
        System.out.println(miCoche.puerta);
    }
}
class Coche { //Propiedades de Objeto
    public int puerta = 4;

    public void AgregarPuerta() { //Funcion
        this.puerta++;
    }
}