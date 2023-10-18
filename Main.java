package matematika;


public class Main {

    public static void main(String[] args) {
        BingoSong song = new BingoSong();
        song.sing();
        System.out.println();

        for (int i = 1; i <= 5; i++) {
            song.clapSing(i);
            System.out.println();
        }
    }
}