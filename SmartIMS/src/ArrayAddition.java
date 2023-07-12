
public class ArrayAddition {
void sum() {
	int k=0;
	int array[]= {21,32,56,78};
	int array2[]= {77,66,55,22};
	for(int i=0;i<array.length;i++) {
		k=array2[i]+array[i];
		System.out.println("Sum of array elements:"+k);
	}
	
}
public static void main(String[] args) {
	ArrayAddition ad=new ArrayAddition();
	ad.sum();
}
}
