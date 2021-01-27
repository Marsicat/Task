package JavaFundamentals.MainTask1;

public class Random {
    public static void main (String [] args){
        int length = 3;
        int [] arr = new int[length];
        for (int i =0; i < arr.length;i++) {
            arr[i] = (int) (Math.random() *20);
            System.out.println(arr[i]+" ");
                    }
        for (int i =0; i < arr.length;i++) {
            arr[i] = (int) (Math.random() * 20);
            System.out.print(arr[i]+" ");
        }

    }
}

