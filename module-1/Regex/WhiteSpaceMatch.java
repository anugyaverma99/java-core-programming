
class WhiteSpaceMatch{
	public static void main(String[] args) {
		// System.out.println(" ".matches("\\s"));
		// System.out.println("\t".matches("\\s"));
		// System.out.println("\n".matches("\\s"));
		// System.out.println("s".matches("\\s"));
		// System.out.println("1".matches("\\s"));

		String pattern="[A-Z]+[a-z]*[0-9]*\\s[A-Z]*[a-z]*[0-9]*";
		System.out.println("Hello World".matches(pattern));
			System.out.println("Java 8".matches(pattern));
			System.out.println("User1 Name".matches(pattern));
			System.out.println("Suraj Kumar".matches(pattern));
			System.out.println("A B".matches(pattern));
			System.out.println("Test Case".matches(pattern));
			System.out.println("Hello".matches(pattern));
			System.out.println("Java8".matches(pattern));
			System.out.println("123".matches(pattern));
			System.out.println("HelloWorld".matches(pattern));
			System.out.println(" Hello World".matches(pattern));
			System.out.println("Hello  World".matches(pattern));


	}
}