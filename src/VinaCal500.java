public class VinaCal500 implements CalculatorInterface{
    @Override
    public double plus(double a, double b) {
        return a+b;
    }

    @Override
    public double minus(double a, double b) {
        return a-b;
    }

    @Override
    public double multiply(double a, double b) {
        return a*b;
    }

    @Override
    public double devide(double a, double b) {
        return a/b;
    }
}
