public static void main(String[] args) {
	System.out.println(palindrome("nurses run"));
}

public static boolean palindrome(String s) {
	String lower = s.toLowerCase();
	String newStr = "";
	for (int i = 0; i < lower.length(); i++) {
		if (Character.isLetterOrDigit(lower.charAt(i))) {
			newStr += lower.charAt(i);
		}
	}

	if (newStr.length() <= 1) {
		return true;
	}

	int right = 0;
	int left = newStr.length() - 1 - right;
	while (right != left) {
		if (newStr.charAt(right) != newStr.charAt(left)) {
			return false;
		}
		right++;
		left = newStr.length() - 1 - right;
	}

	return true;
}
