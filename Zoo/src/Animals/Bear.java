package Animals;

public class Bear extends Carnivorous implements Running , Speaking {

    @Override
    public void Run() {
        System.out.println("Медведь бегает!");
    }

    @Override
    public String Voice() {
        return "РРР-РРР";
    }
}
