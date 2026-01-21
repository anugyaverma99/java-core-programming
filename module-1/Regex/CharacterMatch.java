class CharacterMatch{
	public static void main(String[] args) {
		System.out.println("a".matches("\\w"));
		System.out.println("Z".matches("\\w"));
		System.out.println("5".matches("\\w"));
		System.out.println("_".matches("\\w"));
		System.out.println("@".matches("\\w")); //false
		System.out.println(" ".matches("\\w")); //false because in case of special character it can only match with _ (no whitespaces or any other speacial character will be valid)
		

	}
}