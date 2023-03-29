package test01;

//import java.util.Arrays;
//import java.util.Date;
//import java.util.Scanner;
import java.util.*;
import java.util.logging.*;

public class ImportTest {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Date d = new Date();
		int[] arr = {1, 2, 3, 4, 5};
		Arrays.toString(arr);
		
//		java.util.logging.Logger   
		// import java.util.logging.*; 없이 util import만으로는 사용 불가능
		Logger l = Logger.getGlobal();
	}

}
