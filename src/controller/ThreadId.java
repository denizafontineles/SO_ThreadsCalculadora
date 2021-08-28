package controller;

public class ThreadId extends Thread {
	
    private int idThread;
	
	public ThreadId(int idTread) {
		// TODO Auto-generated constructor stub
        this.idThread = idThread;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		super.run();
        System.out.println(idThread);
	}
	
}
