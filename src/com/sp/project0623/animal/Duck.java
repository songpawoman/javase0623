package com.sp.project0623.animal;

//������ �����Ѵ�
public class Duck extends Bird{
	String name="����";
	int wingCount=2;
	
	//��Ӱ��迡��, �θ��� �����ڰ� �μ��ִ� �� �Ű������� �ִ� �������� ���
	//�ڽ� �����ڿ����� �ڵ����� ȣ���ϴ� super() �� ���̻� ����ϸ� �ȵǰ�
	//�����ڰ� �����ڸ� ���� �����Ͽ� ó������!!
	public Duck(){
		int x=3;
		super(true);
	}
	
	public void fly(){
		System.out.println(name+"�� �޴��ŷ���");
	}

	public static void main(String[] args) {
		//������ ������ ��, ������ ���� �����ϰ� ���� ���� 
		//������ ����غ���  

		//��Ӱ��迡�� �ڽ��� �ν��Ͻ��� �����ϴ� ������, �� �ڽ��� �����ڸ� ȣ���Ҷ�
		//���� ��, �θ� ���� �ν��Ͻ��� �����Ǿ�� �ϹǷ�, sun��� �θ��� �����ڸ�
		//�ڵ����� ȣ���Ѵ�!! super();
		Duck d = new Duck();
		//System.out.println(d.hasFeather);
	}
}
