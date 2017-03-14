package permutation;

import java.util.ArrayList;

public class permutationString {
	
	static ArrayList<String> permutation(String str ) {
		ArrayList<String> nStr = new ArrayList<String>();
		
		if ( str.length() == 1 ) {
			nStr.add(str);
		} else {
			nStr = permutation(str.substring(1));
			//System.out.println("str : " + str);
			ArrayList<String> strTemp = new ArrayList<String>();
			for ( String allStr : nStr ) {
				for (int i = 0; i <= allStr.length(); i++) {
					StringBuffer newStr = new StringBuffer (allStr);
					newStr.insert(i, str.substring(0,1));
					strTemp.add(newStr.toString());
				}
			}
			nStr.clear();
			nStr.addAll(strTemp);
		}
		return nStr;
	}
	
	public static void main (String args[]) {
		String str = "puaz";
		ArrayList<String> test = permutation(str);
		for ( String arr : test ) {
			System.out.println("arr : " + arr);
		}
		
	}
}
