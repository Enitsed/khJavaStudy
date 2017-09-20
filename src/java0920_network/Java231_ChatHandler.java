package java0920_network;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Enumeration;
import java.util.Vector;

public class Java231_ChatHandler implements Runnable {
	Socket socket;
	private DataInputStream dataIn;
	private DataOutputStream dataOut;
	private Thread th;
	private static Vector handlers = new Vector<>();

	public Java231_ChatHandler() {

	}

	public Java231_ChatHandler(Socket socket) {
		this.socket = socket;
	}

	synchronized public void initStart() {
		if (th == null) {
			InputStream is;
			OutputStream os;
			try {
				is = socket.getInputStream();
				os = socket.getOutputStream();
				dataIn = new DataInputStream(new BufferedInputStream(is));
				dataOut = new DataOutputStream(new BufferedOutputStream(os));
				th = new Thread(this);
				th.start();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

	@Override
	public void run() {
		handlers.addElement(this);

		while (!Thread.interrupted()) {
			try {
				String message = dataIn.readUTF();
				broadcast(message);
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

	public void broadcast(String message) {
		Enumeration enu = handlers.elements();
		while (enu.hasMoreElements()) {
			Java231_ChatHandler handler = (Java231_ChatHandler) enu.nextElement();
			try {
				handler.dataOut.writeUTF(message);
				handler.dataOut.flush();
			} catch (IOException e) {
				handler.stop();
			}
		}
	}

	synchronized public void stop() {
		if (th != null) {
			if (th != Thread.currentThread()) {
				th.interrupt();
				th = null;
				try {
					dataOut.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}
}