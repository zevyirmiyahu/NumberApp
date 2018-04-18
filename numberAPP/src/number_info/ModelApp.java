package number_info;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ModelApp {
	
	protected static String getText() {
		String s = "";
		try {
			FileReader file = new FileReader("/home/zev/workspace/numberAPP/src/number_info/infoText");
			BufferedReader br = new BufferedReader(file);
			for(int i = 0; i < 10; i++) {
			s = s + "\n" + br.readLine();
			}
			br.close();
			file.close();
		} catch(IOException e) {
			e.printStackTrace();
		}
		return s;
	}
	
	protected static boolean isEven(int n) {
		if(n % 2 == 0) return true;
		else return false;
	}
	
	protected static boolean isPrime(int n) {
		boolean isPrime = true;
		if(n < 2) isPrime = false;
		if(n != 2 && n > 2) { //handles case where n = 2, since isPrime is already true
			for(int i = 2; i < n; i++) {
				if(n % i == 0) {
					isPrime = false;
					return isPrime;
				}
			}
		}
		return isPrime; //Handles n = 2 case
	}
	
	//Checks for Mersenne Prime, any Mersenne Prime greater is beyond valid input length thus simple if statements are used
	protected static boolean isMersenne(int n) {
		if(n == 3) return true;
		if(n == 7) return true;
		if(n == 31) return true;
		if(n == 127) return true;
		if(n == 8191) return true;
		if(n == 131071) return true;
		if(n == 524287) return true;
		if(n == 2147483647) return true;
		else return false;
	}
	
	protected static boolean happy(int n) {
		boolean isHappy = false;
		int happy = 0; 
		int counter = 0;
		int length = 0;
		
		while(counter < 11) { //Maximum of 10 cycles
			counter += 1;
			
			if(counter > 1) {
				n = happy;
				happy = 0; //reinitialize
			}
			
			
			length = (int)(Math.log10(n) + 1); //determines length of int n
			for(int i = 0; i < length; i++) {
				happy = happy + (n % 10) * (n % 10); // place into happy number
				n = n / 10;
			}
			if(happy == 1) {
				isHappy = true;
				return isHappy;
			} else continue;
		}
		return isHappy;
	}
	
	//Compute Fibbonacci numbers and determine if n is 
	protected static boolean fibb(int n) {
		
		if(n == 0) return true; //two if statements  safe guard program otherwise array error
		if(n < 0) return false;
		
		boolean isFibb = false;
		int f[] = new int[n + 1];
		f[0] = 0;
		f[1] = 1;
		if(n == 0) {
			isFibb = true;
		}
		else if(n == 1) {
			isFibb = true;
		}
		else {
			for(int i = 1; i < n; i++) {
				f[i + 1] = f[i] + f[i - 1];
				if(n == f[i + 1]) isFibb = true;
			}
		}
		return isFibb;
	}
}
