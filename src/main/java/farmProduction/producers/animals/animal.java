package farmProduction.producers.animals;

import lombok.Getter;
import lombok.Setter;

public abstract class animal {
    @Getter @Setter protected String specie;
    @Getter @Setter protected String name;
    @Getter @Setter protected int age;
    @Getter @Setter protected int lifeExpectancy;
    @Getter @Setter protected String gender;
    @Getter @Setter private float weight;
    @Getter @Setter private String situation;

    protected animal() {
        // Protected constructor to avoid instantiation
    }

    public float meatProduction() {
        if (specie.equals("Cow")) {
            return (weight / 100) * 70;
        }
        if (specie.equals("Chicken")) {
            return (weight / 100) * 20;
        }
        if (specie.equals("Pig")) {
            return (weight / 100) * 12.5f;
        } else {
            return 0;
        }
    }
}