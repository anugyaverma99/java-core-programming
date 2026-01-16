
public class strongHasA{
	public static void main(String[] args) {
		Car car=new Car();
		car.drive();
		car.park();
	}

}
class Engine{
	public void start(){
		System.out.println("Engine started");
	}
	public void stop(){
		System.out.println("Engine stopped");
	}

}
class Car{
	private Engine engine;
	Car(){
		engine=new Engine();
		}
	public void drive(){
		engine.start();
		System.out.println("Car running");
	}
	public void park(){
		engine.stop();
		System.out.println("car parked");
	}

}
