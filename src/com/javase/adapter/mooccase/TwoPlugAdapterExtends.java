package com.javase.adapter.mooccase;

/*
 * ���ü̳з�ʽ�Ĳ���������
 */
public class TwoPlugAdapterExtends extends GBTwoPlug implements ThreePlugIf {

	public void powerWithThree() {
		System.out.print("�����̳�������");
		this.powerWithTwo();

	}

}
