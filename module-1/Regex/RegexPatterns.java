class RegexPatterns{
	public static void main(String[] args) {
		// System.out.println("j".matches("S*j"));
		// System.out.println("Sj".matches("S*j"));
		// System.out.println("SSj".matches("S*j"));
		// System.out.println("SSSj".matches("S*j"));
		// System.out.println("Sabcj".matches("S*j"));
		// System.out.println("sSj".matches("S*j"));
		// System.out.println("jj".matches("S*j"));

		// System.out.println();
		// System.out.println("colr".matches("colo?r"));
		// System.out.println("color".matches("colo?r"));
		// System.out.println("coloor".matches("colo?r"));
		// System.out.println("ab".matches("ab(cd)*"));
		// System.out.println("ab".matches("ab(c)?"));
		// System.out.println("SurajSuraj".matches("(S...j)+"));

		// System.out.println();
		// System.out.println("a".matches("[a-z]"));
		// System.out.println("z".matches("[a-z]"));
		// System.out.println("A".matches("[a-z]"));
		// System.out.println("aa".matches("[a-z]"));
		// System.out.println("1".matches("[a-z]"));
		// System.out.println("#".matches("[a-z]"));

		// System.out.println();
		// System.out.println("A".matches("[A-Z]"));
		// System.out.println("Z".matches("[A-Z]"));
		// System.out.println(" ".matches("[A-Z]"));
		// System.out.println("AA".matches("[A-Z]"));
		// System.out.println("@".matches("[A-Z]"));
		// System.out.println("1".matches("[A-Z]"));

		// System.out.println();
		// System.out.println("abc".matches("abc"));
		// System.out.println("ab".matches("abc"));
		// System.out.println("abcd".matches("abc"));
		// System.out.println("aBc".matches("abc"));
		// System.out.println("ABC".matches("abc"));
		// System.out.println(" abc".matches("abc"));

		System.out.println();
		System.out.println("aaa".matches("a{3}"));
		System.out.println("aa".matches("a{3}"));
		System.out.println("aaaa".matches("a{3}"));

		System.out.println();
		System.out.println("aaa".matches("a{2,4}"));
		System.out.println("aa".matches("a{2,4}"));
		System.out.println("aaaa".matches("a{2,4}"));
		System.out.println("aaaaa".matches("a{2,4}"));
		System.out.println("a".matches("a{2,4}"));

		System.out.println();
		System.out.println("cat".matches("cat|dog"));
		System.out.println("dog".matches("cat|dog"));
		System.out.println("cow".matches("cat|dog"));

	}
}