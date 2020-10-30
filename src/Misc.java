import java.util.Random;

public abstract class Misc {

    public static int getRandomInt(int max) {
        if (1 >= max) {
            throw new IllegalArgumentException("max must be greater than min");
        }

        Random r = new Random();
        return r.nextInt((max - 1) + 1) + 1;
    }
}
