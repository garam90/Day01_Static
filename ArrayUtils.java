package day01_static;

public class ArrayUtils {

 // int 배열을 double 배열로 변환
    static double [] intToDouble( int[] source ){
    	double [] doubleArr = new double[source.length];
    	for (int i = 0; i < source.length; i++) {
    		doubleArr[i] = source[i];
		}
    	
    	return doubleArr;
    	
    }
    
    // double 배열을 int 배열로 변환
    static int [] doubleToInt( double[] source ){
    	int [] intArr = new int[source.length];
    	for (int i = 0; i < source.length; i++) {
			intArr[i] = (int) source[i];
		}
    	
    	return intArr;
    	
    }
        // int 배열 두 개를 연결한 새로운 배열 리턴
    static int [] concat( int[] s1, int[] s2 ){
    	int [] intArr = new int[s1.length+s2.length];
    	for (int i = 0; i < s1.length; i++) {
			intArr[i] = s1[i];
		}
    	for (int i = 0; i < s2.length; i++) {
			intArr[s1.length+i] = s2[i];
		}
    	
    	return intArr;
    }

}
