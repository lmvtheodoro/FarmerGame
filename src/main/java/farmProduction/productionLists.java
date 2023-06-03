package farmProduction;

import lombok.Getter;
import farmProduction.producers.animals.cow;
import java.util.ArrayList;
import java.util.List;

public class productionLists {
    @Getter private static List<cow> cowList = new ArrayList<>();

    public static void addCows(int numberOfCows){
        for (int i = 0; i < numberOfCows; i++) {
            String cowName = "Baby Cow is still unnamed";
            cow cow = new cow(cowName);
            cowList.add(cow);
        }
    }
}