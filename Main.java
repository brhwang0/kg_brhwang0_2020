class Main {

	public static boolean check(String s1, String s2) {
		
		// Create string of distinct characters in s1
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