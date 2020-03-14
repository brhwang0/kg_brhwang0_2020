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
		
		// Create two strings of distinct characters in s1, s2
		String distinctS1 = "";
		for (int i = 0; i < s1.length(); i++) {
			if (distinctS1.indexOf(s1.charAt(i)) == -1) {
				distinctS1 += s1.charAt(i);
			} else {
				return false;   // return false if s1 contains duplicate character
			}
		}
		
		return distinctS1.length() <= s2.length();
	}

	public static void main(String[] args) {
		try {
			
			// Catch input error
			if (args.length != 2) {
				System.out.println("Input error. Please enter only two strings.");
			} else {
				String in1 = args[0];
				String in2 = args[1];
				System.out.println(check(in1, in2));
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
	
}