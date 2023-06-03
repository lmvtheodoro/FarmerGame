package farmProduction.producers.animals;

import calculations.animalsCalcs;

public class cow extends animal {
    float initialMinWeight = 20.0f;
    float initialMaxWeight = 35.0f;

    public cow(String name) {
        setSpecie("Cow");
        setName(name);
        setAge(0);
        setLifeExpectancy(4);
        setWeight(animalsCalcs.initialWeightGenerator(initialMinWeight, initialMaxWeight));
        setGender(animalsCalcs.randomGenderGenerator());
    }
}