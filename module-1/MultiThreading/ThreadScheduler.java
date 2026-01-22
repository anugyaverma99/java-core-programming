class ThreadScheduler extends Thread{
	public void run(){
		System.out.println(Thread.currentThread().getName());
	}
	public static void main(String[] args) {
		ThreadScheduler ts1=new ThreadScheduler();
		ThreadScheduler ts2=new ThreadScheduler();
		ThreadScheduler ts3=new ThreadScheduler();
		ThreadScheduler ts4=new ThreadScheduler();
		ts1.start();
		ts2.start();
		ts3.start();
		ts4.start();

	}
	
}

// Thread Scheduler:
// thread scheduler in java is a part of JVM that decides which thread should run.
// there is no guarantee that which runnable thread will be choosen to run by the thread scheduler.
// only one thread at a time can run in a single process


