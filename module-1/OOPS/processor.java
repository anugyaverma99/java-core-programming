class processor{
	int x;
	int y;
	void initialize(){
		this.x=5;
		this.y=6;
	}
	void update(){
		this.initialize();
		int x=10;
		
		System.out.println("local value of x: "+x);
		this.x=45;
		this.y=55;

	}
	void display(){
		this.update();
		System.out.println("final value of x: "+x);
		System.out.println("final value of y: "+y);
	}
	public static void main(String[] args) {
		processor ref=new processor();
		ref.display();
	}
}