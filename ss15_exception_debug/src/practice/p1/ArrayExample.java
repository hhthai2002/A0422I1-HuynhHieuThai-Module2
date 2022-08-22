package practice.p1;

import java.util.Random;

public class ArrayExample {
    public Integer[] creatRandom(){
        Random random = new Random();
        Integer[] arr = new Integer[100];
        System.out.println("List element of array: ");
        for(int i = 0; i < 100; i++){
            arr[i] = random.nextInt(100);
            System.out.println(arr[i] + " ");
        }
        return arr;
    }
}
