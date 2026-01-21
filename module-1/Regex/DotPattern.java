class DotPattern{
	public static void main(String[] args) {
		System.out.println("Suraj".matches("S...j"));
		System.out.println("Suraj".matches("S..j"));
		System.out.println("Sraj".matches("S...j"));
		System.out.println("suraj".matches("S...j"));
		System.out.println("Siraj".matches("S...j"));
		System.out.println("Sairaj".matches("S...j"));
		System.out.println("S123j".matches("S...j"));
	}
}