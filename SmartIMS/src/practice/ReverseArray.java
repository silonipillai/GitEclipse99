package practice;

import java.util.Arrays;
import java.util.Collections;

public class ReverseArray {
	void reverse(Integer a[])
    {
		
        Collections.reverse(Arrays.asList(a));
        System.out.println(Arrays.asList(a));
    }
  
    public static void main(String[] args)
    {
        ReverseArray ra=new ReverseArray();
        Integer[] arr  = {10, 20, 30, 40, 50};
		ra.reverse(arr);
    }
}
