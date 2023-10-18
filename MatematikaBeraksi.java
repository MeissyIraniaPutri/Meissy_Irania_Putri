
package matematika;

public class MatematikaBeraksi {
    public static void main(String[] args) {
        Matematika matematika = new Matematika();
        Matematika2 matematikaA = new Matematika2();

        int a = 20;
        int b = 10;
        System.out.println("Pertambahan : " + a + " + " + b + " = " + matematikaA.pertambahan(a, b));
        System.out.println("Pertambahan : " + a + " + " + b + " = " + matematika.pertambahan(a, b));
        System.out.println("Pengurangan : " + a + " - " + b + " = " + matematika.pengurangan(a, b));
        System.out.println("Perkalian : " + a + " * " + b + " = " + matematika.perkalian(a, b));
        System.out.println("Pembagian : " + a + " / " + b + " = " + matematika.pembagian(a, b));
        
    }
}



