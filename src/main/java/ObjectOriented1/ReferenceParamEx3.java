package ObjectOriented1;

public class ReferenceParamEx3 {
    static void sortArr(int[] arr) {    //3 2 1 6 5 4
        for(int i=0; i<arr.length-1; i++) {
            for(int j=0; j<arr.length-i-1; j++) {
                if(arr[j] > arr[j+1]) {
                    int tmp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = tmp;
                }
            }
        }
    }

    static void printAll(int[] arr) {
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int[] arr = new int[] { 3, 2, 1, 6, 5, 4 };

        printAll(arr);
        sortArr(arr);
        printAll(arr);
    }
}
