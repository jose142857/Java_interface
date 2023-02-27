public class SelectSort implements SortInterface{
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
