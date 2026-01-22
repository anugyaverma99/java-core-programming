class ThreadSleep extends Thread{
	public void run(){
		try{
		Thread.sleep(2000);

	}
	catch(InterruptedException e){
		System.out.println("Thread interupted");
	}
	}
	public static void main(String[] args) {
		ThreadSleep ts=new ThreadSleep();
		ts.start();
		System.out.println("Execution after sleep");
		
		
	}
}