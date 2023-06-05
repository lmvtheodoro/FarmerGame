package farmProduction.producers.animals;

import calculations.animalsCalcs;

public class pig extends animal{
    float initialMinWeight = 3.500f;
    float initialMaxWeight = 5.200f;

    public pig(String name) {
        setSpecie("Pig");
        setName(name);
        setAge(0);
        setLifeExpectancy(4);
        setWeight(animalsCalcs.initialWeightGenerator(initialMinWeight, initialMaxWeight));
        setGender(animalsCalcs.randomGenderGenerator());
        setSituation("Healthy");
        setPrice(150);
        setCostPerTurn(15);
    }

    @Override
    public float meatProduction(){
        return getWeight() * 14.5f;
    }
}