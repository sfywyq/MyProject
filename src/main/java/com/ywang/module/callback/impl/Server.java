package com.ywang.module.callback.impl;

import com.ywang.module.callback.CSCallBack;

public class Server {

	public void getClientMsg(CSCallBack csCallBack, String msg) {
		System.out.println("����ˣ�����˽��յ��ͻ��˷��͵���ϢΪ:" + msg);

		// ģ��������Ҫ�����ݴ���
		try {
			Thread.sleep(5 * 1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("�����:���ݴ���ɹ������سɹ�״̬ 200");
		String status = "200";
		csCallBack.process(status);
	}
}
