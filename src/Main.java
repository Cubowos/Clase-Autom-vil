public class Main {
    public static void main(String[] args) {
    auto a1= new auto("zzzzz","plei",1999,1223,"automatico");
        System.out.println(a1);

        System.out.println(a1.avanzar(25));

        System.out.println("el auto esta detenido: "+ a1.frenar(25));
    }
}