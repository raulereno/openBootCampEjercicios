public class Main {
    public static void main(String[] args) {
        System.out.println(suma(1,2,3));

        Coche miCoche = new Coche();
        miCoche.incrementarPuertas();
        System.out.println(miCoche.puertas);
    }

    public static int suma (int a,int b,int c){
        return a+b+c;
    }


}
class Coche{
    public int puertas = 0;

    public void incrementarPuertas(){
        this.puertas++;
    }
}