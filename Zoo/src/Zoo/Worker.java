package Zoo;
import java.io.IOException;
import java.lang.reflect.Method;

import Animals.*;
import Food.Food;

public class Worker extends Carnivorous { // работник
    public void Feed(Animal animal, Food food)
    {
        animal.Eat(food);
    }
    public void Voice(Animal animal)
    {
        Ducks duck=new Ducks();
        Bear bear=new Bear();
        Horce horce =new Horce();
        Tiger tiger =new Tiger();
        Wolf wolf=new Wolf();
        boolean hasMethod = false;

        try{
                Method[] methods = ((Ducks) animal).getClass().getMethods();
                for (Method m : methods) {
                    if (m.getName().equals("Voice")) {
                        hasMethod = true;
                        break;
                    }
                }
                if (hasMethod)
                    System.out.println(((Ducks) animal).Voice());
        }
        catch (ClassCastException e)
        {

        }
        try{
                Method[] methods =((Bear) animal).getClass().getMethods();
                for (Method m : methods) {
                    if (m.getName().equals("Voice")) {
                        hasMethod = true;
                        break;
                    }
                }
                if(hasMethod)
                    System.out.println(((Bear)animal).Voice());

        }
        catch (ClassCastException e)
        {

        }
        try{
                Method[] methods =((Horce) animal).getClass().getMethods();
                for (Method m : methods) {
                    if (m.getName().equals("Voice")) {
                        hasMethod = true;
                        break;
                    }
                }
                if(hasMethod)
                    System.out.println(((Horce)animal).Voice());


        }
        catch (ClassCastException e)
        {

        }

        try{
                Method[] methods =((Tiger) animal).getClass().getMethods();
                for (Method m : methods) {
                    if (m.getName().equals("Voice")) {
                        hasMethod = true;
                        break;
                    }
                }
                if(hasMethod)
                    System.out.println(((Tiger)animal).Voice());
        }
        catch (ClassCastException e)
        {

        }
        try{
            Method[] methods =((Wolf) animal).getClass().getMethods();
                for (Method m : methods) {
                    if (m.getName().equals("Voice")) {
                        hasMethod = true;
                        break;
                    }
                }
                if(hasMethod)
                    System.out.println(((Wolf)animal).Voice());
        }
        catch (ClassCastException e)
        {

        }
        if(!hasMethod)
            System.out.println("Животное не разговаривает");

    }
}
