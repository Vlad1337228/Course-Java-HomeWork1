package Animals;

import Food.Food;

public class Fish extends Herbivorous implements Swimmable  {

    @Override
    public void Swim() {
        System.out.println("Рыба плавает!");
    }

}
