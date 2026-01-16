interface Resizable{
	void resizeWidth(int width);
	void resizeHeight(int height);

}
class Rectangle implements Resizable{
	private int width;
	private int height;
	Rectangle(int width,int height){
		this.width=width;
		this.height=height;
	}
	public int getWidth(){
		return width;
	}
	public int getHeight(){
		return height;
	}
	
	public void resizeWidth(int width){
		this.width=width;

	}
	@Override
	public void resizeHeight(int height){
		this.height=height;
	}
	public void toPrint(){
		System.out.println("Width of rectangle is: "+width);
		System.out.println("Height of rectangle is: "+height);

	}

}
public class interfaceExample2{
	public static void main(String[] args) {
		Rectangle r=new Rectangle(2,4);
		r.toPrint();
		r.resizeWidth(5);
		r.resizeHeight(7);
		r.toPrint();
	}

}