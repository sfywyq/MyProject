package com.ywang.module.callback.impl;

import com.ywang.module.callback.CSCallBack;

public class Client implements CSCallBack {

	private Server server;

	public Client(Server server) {
		this.server = server;
	}

	public void sendMsg(final String msg) {
		System.out.println("客户端：发送的消息为：" + msg);
		new Thread(new Runnable() {
			public void run() {
				server.getClientMsg(Client.this, msg);
			}
		}).start();
		System.out.println("客户端：异步发送成功");
	}

	@Override
	public void process(String status) {
		System.out.println("客户端：服务端回调状态为：" + status);
	}

}
