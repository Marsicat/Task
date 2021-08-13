package JavaFundamentals.MainTask1;

public class Sum {
    public static void main (String [] args){
        int sum = 0;
        int [] arr= new int[args.length];
            for (int i=0; i<args.length;i++) {
            arr [i] = Integer.parseInt(args[i]);
                sum += arr [i];
        }

        System.out.println(sum);
    }
}
