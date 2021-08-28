package view;

//import controller.ThreadId;
import controller.ThreadCalc;


public class Principal {
	
	public static void main(String[] args) {

//        for (int idTread = 0; idTread < 5; idTread++){
//        // ThreadController metodos = new ThreadController();
//            Thread threadId = new ThreadId(idTread);
//            threadId.start();
//        }
		
		int a = 10;
        int b = 2;

        for (int op = 0; op < 4; op++){
            Thread tCalc = new ThreadCalc(a, b, op);
            tCalc.start();
        }

    }

}
