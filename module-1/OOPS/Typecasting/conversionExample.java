// CANDY CRUSH GAME: can only access only current level and level above that , level prior to the current level will be not accessible.
class Level1{
	int a=10;
	Level1(){
	System.out.println("Access to level 1");
}
}
class Level2 extends Level1{
	int b=20;
	Level2(){
	System.out.println("Access to level 2");
}
}
class Level3 extends Level2{
	int c=30;
	Level3(){
	System.out.println("Access to level 3");
}
}
class Level4 extends Level3{
	int d=40;
	Level4(){

	System.out.println("Access to level 4");
}
}

public class conversionExample{
	public static void main(String[] args) {
		System.out.println("---UPCASTING---");
		Level1 ref=new Level4();
		System.out.println(ref.a);
		System.out.println(ref.b);


	}

}