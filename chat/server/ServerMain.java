package com.alex.chat.server;

public class ServerMain {

	private int port;
	private Server server;

	public ServerMain(int port) {
		this.port = port;
		server = new Server(port);
	}

	public static void main(String[] args) {
		int port = 4444;
		new ServerMain(port);
	}

}
