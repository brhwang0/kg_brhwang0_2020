/**

   Determine whether a one-to-one character mapping 
   exists from one string, s1, to another string, s2.
   For example, given ​s1 = abc​ and ​s2 = bcd​, print 
   "​true" into stdout​ since we can map each character 
   in "abc" to a character in "bcd".Given ​s1 = foo​ and ​
   s2 = bar​, print "​false"​ since the character ‘o’ cannot 
   map to two characters.But given ​s1 = bar ​and ​s2 = foo​, 
   print "true​"​ since each character in "bar" can be mapped 
   o acharacter in "foo".

**/

class Main {

	public static boolean check(String s1, String s2) {
		
		if (s1.length() > s2.length()) {
			return false;
		}
		if (s1.length() < s2.length()) {
			return true;
		}
		
		String distinctS1 = "";
		String distinctS2 = "";
		
		for (int i = 0; i < s1.length(); i++) {
			if (distinctS1.indexOf(s1.charAt(i)) == -1) {
				distinctS1 += s1.charAt(i);
			}
		}
		
		for (int i = 0; i < s1.length(); i++) {
			if (distinctS2.indexOf(s2.charAt(i)) == -1) {
				distinctS2 += s2.charAt(i);
			}
		}
		
		System.out.println("Distinct string 1 = " + distinctS1);
		System.out.println("Distinct string 1 = " + distinctS1);
		
		return distinctS1.length() < distinctS2.length();
		
	}

	public static void main(String[] args) {
		System.out.println(check("123", "321"));
	}
	
	
}