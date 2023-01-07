import java.util.Arrays;
public class Main {
    public static void main(String[] args){
        double [] num = {12.5,15.8,13.7,4.4,-500.6,16.4,9.7,8.16,-12.0,-10.5,11.2,-18.18,17.6,19.8,-15.5};
        double average = 0.0;
        int count = 0;
        for (int i1 = 0; i1 < num.length; i1++){
            if (num[i1] < 0){
                for (int i2 = i1 + 1; i2 < num.length; i2++){
                    if (num[i2] > 0){
                        average = average + num[i2];
                        count++;
                    }
                }
                break;
            }
        }
        System.out.println("average  " + average);
        System.out.println("count  " + count);
        System.out.println("average/count " + average / count);

        int[] array = {10, 5, -2, 8, -5, -8, 9,-10, 7, -17};
        System.out.println(Arrays.toString(array));
        for (int left = 0; left < array.length; left++){
            int value = array[left];
            int i = left - 1;
            for (; i >= 0; i--){
                if (value < array[i]){
                    array[i + 1] = array[i];
                }else {
                    break;
                }
            }
            array[i + 1] = value;
        }
        System.out.println(Arrays.toString(array));

    }
}