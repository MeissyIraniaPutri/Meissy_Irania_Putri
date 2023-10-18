package matematika;

public class BingoSong {
    private String[] lyrics;

    public BingoSong() {
        lyrics = new String[]{
            "There was a farmer who had a dog,",
            "And Bingo was his name-o.",
            "B-I-N-G-O",
            "B-I-N-G-O",
            "B-I-N-G-O",
            "And Bingo was his name-o."
        };
    }

    public void sing() {
        for (String line : lyrics) {
            System.out.println(line);
        }
    }

    public void clapSing(int claps) {
        for (String line : lyrics) {
            StringBuilder result = new StringBuilder(line);
            for (int i = 0; i < claps; i++) {
                result.append("-(clap)");
            }
            System.out.println(result.toString());
        }
    }

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