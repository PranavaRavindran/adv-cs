import java.util.*;
import java.util.HashMap;
import java.util.Arrays;

public class WelcomeBack {
	
	public String getMiddle(String str) {
		if(str.length()%2==0) {
			return str.substring((str.length()/2)-1, str.length()/2+1);
		}
		return str.substring((str.length()-1)/2, str.length()-1);
	}
	
	public int[] sumNumbers(int n) {
		int[] sN = new int[Math.abs(n)+1];
		int x = 0;
		for(int i=1; i<n; i++) {
			x+=i;
			sN[i-1] = x;
			
		}
		return sN;
	}
	public int sumDigits(int num) {
		int r = 0;
		int i =0;
		int n = num;
		while(i<String.valueOf(num).length()) {
			r+=n%10;
			n/=10;
			i++;
		}
		return r;
	}
	public int keepSummingDigits(int num) {
		int r = 0;
		int n = num;
		while(Math.abs(r)<10) {
			r = sumDigits(n);
		}
		return r;
	}
	public String getIntersection(int[] a, int[] b) {
		String inter = "";
		for(int i=0; i<a.length; i++) {
			for(int j=0; j<b.length; j++) {
				if(a[i]==b[i]) {
					inter+=a[i];
				}
				
			}
		}
		return inter;
	}
	public Map<Integer, Integer> mapLengths(String[] words){
		HashMap<Integer, Integer> difLengths = new HashMap<Integer, Integer>();
		for(int i=0; i<words.length; i++) {
			if(difLengths.containsKey(words[i])){
				difLengths.put(words[i].length(), 1);
			}
			else {
				difLengths.put(words[i].length(), difLengths.get(words[i])+1);
			}
		}
		return difLengths;
	}
	public int sumWithoutCarry(int a, int b) {
		int sum = 0;
		int placeValue = 10;
		int i = 0;
		int d = 0;
		while(a!=0) {
			if(i>0) {
				d = (a%10)+(b%10);
				sum+=(d%10)*placeValue;
			}
			else {
				d = (a%10)+(b%10);
				sum += d%10;
			}
			a = a%10;
			b = b%10;
			placeValue*=10;
			
		}
		return sum;
		
	}
	
}
