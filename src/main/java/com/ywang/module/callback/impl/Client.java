package com.ywang.module.callback.impl;

import com.ywang.module.callback.CSCallBack;

public class Client implements CSCallBack {

	private Server server;

	public Client(Server server) {
		this.server = server;
	}

	public void sendMsg(final String msg) {
		System.out.println("�ͻ��ˣ����͵���ϢΪ��" + msg);
		new Thread(new Runnable() {
			public void run() {
				server.getClientMsg(Client.this, msg);
			}
		}).start();
		System.out.println("�ͻ��ˣ��첽���ͳɹ�");
	}

	@Override
	public void process(String status) {
		System.out.println("�ͻ��ˣ�����˻ص�״̬Ϊ��" + status);
	}

}
