interface InterfaceA{						//����һ���ӿ�A
	public static final String A="�ӿ�A";	//ȫ�ֱ�������	
	public abstract void print();			//������󷽷�
}

interface InterfaceB{						//����ӿ�B
	public abstract void get();				//���󷽷�
}

class ClassC implements InterfaceA,InterfaceB{				//ClassC��ʵ�����������ӿ�
	public void print(){
		System.out.println("ʵ��InterfaceA�ĳ��󷽷�print()");
	}

	public void get(){
		System.out.println("ʵ��InterfaceB�ĳ��󷽷�get()");
	} 	
}

public class InterfaceTest{
	public static void main(String[] args){
		ClassC classc=new ClassC();
		InterfaceA A=classc;		//����ת��
		InterfaceB B=classc;		//����ת��	
		
		A.print();
		B.get();
	}
}