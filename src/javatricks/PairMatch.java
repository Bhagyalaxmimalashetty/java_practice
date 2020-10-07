package javatricks;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class PairMatch {

	public static void main(String[] args) {

		int n = 9;
		int ar[] = { 10, 20, 20, 10, 50, 30, 20, 60, 50 };
		Set<Integer> colors = new HashSet<>();
		int pairs = 0;

		for (int i = 0; i < n; i++) {
			if (!colors.contains(ar[i])) {
				colors.add(ar[i]);
			} else {
				pairs++;
				colors.remove(ar[i]);
			}

		}
		//System.out.println(pairs);
		
		 Scanner sc = new Scanner(System.in);
	        int n1 = sc.nextInt();
	        String s = sc.next();
	        
	        int v = 0;     // # of valleys
	        int lvl = 0;   // current level
	        for(char c : s.toCharArray()){
	            if(c == 'U') ++lvl;
	            if(c == 'D') --lvl;
	            
	            // if we just came UP to sea level
	            if(lvl == 0 && c == 'U')
	                ++v;
	        }
	        System.out.print(v);

	}
}
