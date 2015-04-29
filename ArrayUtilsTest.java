package day01_static;

public class ArrayUtilsTest {

	public static void main(String[] args) {
		
		int[] intArr = {10, 20, 30, 40, 50};
		double[] doubleArr = ArrayUtils.intToDouble(intArr);
		for (double d : doubleArr) {
			System.out.print(d+"\t");
		}
		System.out.println();
		
		double[] doubleArray = {10.1, 10.4, 55.444, 246.78, 45.66};
		int[] intArray = ArrayUtils.doubleToInt(doubleArray);
		for (int i : intArray) {
			System.out.print(i+"\t");
		}
		System.out.println();
		
		int[] arr1 = {1, 2, 3, 4, 5, 6};
		int[] arr2 = {10, 20, 30, 40, 50, 60, 70};
		int[] concatArr = ArrayUtils.concat(arr1, arr2);
		for (int i : concatArr) {
			System.out.print(i+"\t");
		}
		
	}
	
}
