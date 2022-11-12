package cpawCtfPPC;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Q14 {
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)){
			
			String targetString = sc.next();
			String[] a_targetString = targetString.split(",");
				
			List<Integer> target = new ArrayList<Integer>();
			
			for (String temp : a_targetString) {
				target.add(Integer.parseInt(temp));
			}

			target.sort(Comparator.reverseOrder());
			
			for (Integer temp : target ) {
				System.out.print(temp.intValue());
			}

		}
	}

}
