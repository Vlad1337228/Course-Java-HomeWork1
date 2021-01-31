package Animals;

import Food.Food;

public abstract class Animal   {   // класс наследующий

    private int weight; // вес животного

    public void setWeight(int value)
    {
        weight=value;
    }
    public int setWeight()
    {
       return weight;
    }

    public void Eat(Food food) {

    }
}
