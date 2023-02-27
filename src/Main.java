public class Main {
    public static void main(String[] args) {
//        CalculatorInterface c1 = new CasioFX500();

//        TEST SORT
        double arr [] = new double[] {9,4,5,3,7,6};
        SortInterface s1 = new SelectSort();
        s1.decreaseSort(arr);

        for (int i = 0;i<arr.length;i++){
            System.out.printf("%.0f ",arr[i]);
        }

        System.out.println("\n");

        s1.increaseSort(arr);

        for (int i = 0;i<arr.length;i++){
            System.out.printf("%.0f ",arr[i]);
        }

        System.out.println("\n");

//        TEST MYSOFTWARE
        MySoftware m1 = new MySoftware();
        System.out.println("Sum of 3 + 6 is: " + m1.plus(3,6));

        m1.increaseSort(arr);
        System.out.println("Sort array arr by increase order");
        for (int i = 0;i<arr.length;i++){
            System.out.printf("%.0f ",arr[i]);
        }







    }
}