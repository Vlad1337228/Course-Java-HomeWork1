package Animals;

public class Wolf extends Carnivorous implements  Running, Speaking {
    @Override
    public void Run() {
        System.out.println("Волк бегает!");
    }

    @Override
    public String Voice() {
        return "АУУУУУ";
    }
}
