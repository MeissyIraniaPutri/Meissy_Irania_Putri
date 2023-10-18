
package matematika;

public class Matematika2 implements OperasiMatematika {
    @Override
    public int pertambahan(int a, int b) {
        return a + b;
    }

    @Override
    public int pengurangan(int a, int b) {
        return a - b;
    }

    @Override
    public int perkalian(int a, int b) {
        return a * b;
    }

    @Override
    public int pembagian(int a, int b) {
        if (b == 0) {
            System.out.println("Tidak dapat membagi dengan nol.");
            return 0; 
        }
        return a / b;
    }
}

