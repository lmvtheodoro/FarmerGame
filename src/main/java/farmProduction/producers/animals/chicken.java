package farmProduction.producers.animals;

import calculations.animalsCalcs;

public class chicken extends animal{
    float initialMinWeight = 0.750f;
    float initialMaxWeight = 1.200f;

    public chicken(String name) {
        setSpecie("Chicken");
        setName(name);
        setAge(0);
        setLifeExpectancy(2);
        setWeight(animalsCalcs.initialWeightGenerator(initialMinWeight, initialMaxWeight));
        setGender(animalsCalcs.randomGenderGenerator());
        setSituation("Healthy");
        setPrice(100);
        setCostPerTurn(10);
    }

    @Override
    public float meatProduction(){ return getWeight() * 20; }
}