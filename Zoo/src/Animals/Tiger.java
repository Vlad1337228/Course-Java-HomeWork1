package Animals;

public class Tiger extends Carnivorous implements  Running, Speaking{
    @Override
    public void Run() {
        System.out.println("Тигр бегает!");
    }

    @Override
    public String Voice() {
        return "АРРРРР";
    }
}
