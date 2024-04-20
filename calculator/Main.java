package calculator;

public class Main {

    public static void main(String[] args) {
        ICalculableFactory calculableFactory = new CalculableFactory();
        VewiCalculator view = new VewiCalculator(calculableFactory);
        view.run();
    }
}