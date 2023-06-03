package calculations;

import java.util.Locale;
import java.util.Random;

public class animalsCalcs {
    static Random random = new Random();

    public static float initialWeightGenerator(float minWeight, float maxWeight) {
        String formattedString = String.format(Locale.US, "%.2f", minWeight + random.nextFloat()
                * (maxWeight - minWeight));
        return Float.parseFloat(formattedString);
    }

    public static String randomGenderGenerator(){
        return random.nextBoolean() ? "Male" : "Female";
    }
}