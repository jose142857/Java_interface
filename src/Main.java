public class Main {
    public static void main(String[] args) {
        CalculatorInterface c1 = new CasioFX500();
        System.out.println( c1.plus(10,5));
        System.out.println( c1.devide(10,0));

    }
}