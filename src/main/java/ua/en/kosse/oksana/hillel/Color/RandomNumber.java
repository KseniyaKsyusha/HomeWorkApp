package ua.en.kosse.oksana.hillel.Color;

import java.util.Random;

public class RandomNumber {

    public int getRandomNumberInt(int min, int max) {
        Random random = new Random();
        return random.nextInt(max - min) + min;
    }
}
