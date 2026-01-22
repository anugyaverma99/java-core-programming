class ThreadRun extends Thread{
	public void run(){
		System.out.println("Thread running");
	}
	public static void main(String[] args) {
		ThreadRun tc=new ThreadRun();
		tc.start();		
	}
}



