package com.ywang.module.callback.main;

import com.ywang.module.callback.impl.Client;
import com.ywang.module.callback.impl.Server;

public class CallBackTest {

	public static void main(String[] args) {
		Server server = new Server();
        Client client = new Client(server);

        client.sendMsg("Server,Hello~");
	}

}
