//java��װEncapsulation
class Encapsulation{
	private String name;
	private String id;
	private int age;
	
	
	//����public�������ⲿ�����Encapsulation���Ա��������ڡ�
	public int getAge(){
		return age;
	}
	
	public String getName(){
		return name;
	}
	
	public String getId(){
		return id;
	}
	
	public void setAge(int newAge){
		age=newAge;
	}
	
	public void setName(String newName){
		name=newName;
	}
	
	public void setId(String newId){
		id=newId;
	}
}

public class EncapsulationTest{
	public static void main(String[] args){
		Encapsulation encapsulation=new Encapsulation();
		
		encapsulation.setName("��˹������");
		encapsulation.setAge(21);
		encapsulation.setId("100001");
		
		System.out.println("������"+encapsulation.getName()+"���䣺"+encapsulation.getAge()+"ѧ�ţ�"+encapsulation.getId());
	}
}