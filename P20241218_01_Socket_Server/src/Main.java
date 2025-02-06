import java.rmi.server.ServerCloneException;

public class Main {

	public static void main(String[] args) {
		SocketServer srv = new SocketServer();

//		while (true) {
			srv.Server(32456);
//		}
	}

}