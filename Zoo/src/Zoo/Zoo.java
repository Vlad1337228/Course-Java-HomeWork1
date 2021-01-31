package Zoo;

import Animals.*;
import Food.Grass;
import Food.Meat;

public class Zoo {
    public static void main(String[] args) {

        Ducks duck=new Ducks();
        duck.setWeight(10);
        Fish fish=new Fish();
        fish.setWeight(10);
        Bear bear=new Bear();
        bear.setWeight(10);
        Horce horce=new Horce();
        horce.setWeight(10);
        Tiger tiger=new Tiger();
        tiger.setWeight(10);
        Wolf wolf=new Wolf();
        wolf.setWeight(10);


        Worker worker=new Worker();
        System.out.println("Голос у 5 животных");
        for(int i=0;i<5;i++) {
            switch (i)
            {
                case(0): {
                    worker.Voice(duck);
                    break;
                }
                case(1): {
                    worker.Voice(wolf);
                    break;
                }
                case(2): {
                    worker.Voice(fish);
                    break;
                }
                case(3): {
                    worker.Voice(horce);
                    break;
                }
                case(4): {
                    worker.Voice(bear);
                    break;
                }
            }

        }

        var pryd=new Animal[]{duck,duck,fish,fish,fish};
        for (int i = 0; i < 5; i++) {
            if( pryd[i]==duck )
                ((Ducks)pryd[i]).Swim();
            if( pryd[i]==fish )
                ((Fish)pryd[i]).Swim();
        }

        // НАКОРМИМ ЖИВОТНЫХ ТЕМ, ЧТО ОНИ ЕДЯТ
        duck.Eat(new Grass());

        fish.Eat(new Grass());

        horce.Eat(new Grass());

        wolf.Eat(new Meat());

        tiger.Eat(new Meat());

        bear.Eat(new Meat());

        // НАКОРМИМ ЖИВОТНЫХ ТЕМ , ЧТО ОНИ НЕ ЕДЯТ
        duck.Eat(new Meat());

        fish.Eat(new Meat());

        horce.Eat(new Meat());

        wolf.Eat(new Grass());

        tiger.Eat(new Grass());

        bear.Eat(new Grass());
    }
}
