public class MySoftware implements CalculatorInterface,SortInterface {
    @Override
    public double plus(double a, double b) {
        return a +b;
    }

    @Override
    public double minus(double a, double b) {
        return a-b ;
    }

    @Override
    public double multiply(double a, double b) {
        return a * b;
    }

    @Override
    public double devide(double a, double b) {
        try {
            return a/b;

        } catch(Exception e) {
            System.out.println("no devided by 0");

        }
        return a/b;
    }

    @Override
    public void increaseSort(double[] arr) {
        for(int i=0; i<arr.length;i++){
            for (int j = i +1;j<arr.length;j++){
                if(arr[i]>=arr[j]){
                    double temp =0;
                    temp = arr[i];
                    arr[i] =arr[j];
                    arr[j] =temp;
                }
            }

        }


    }

    @Override
    public void decreaseSort(double[] arr) {
        for(int i=0; i<arr.length;i++){
            for (int j = i +1;j<arr.length;j++){
                if(arr[i]<=arr[j]){
                    double temp =0;
                    temp = arr[i];
                    arr[i] =arr[j];
                    arr[j] =temp;
                }
            }

        }
    }
}
