//˳�������࣬����˳���
public class Test{
	public static void main(String[] args){										
		SeqList list=new SeqList(30);
		list.initSeqList(30);
		
		try{
			for(int i=0;i<=10;i++){
				list.addSeqList(i);
			}
			for(int i=1;i<list.last+1;i++){
				System.out.println("���Ա��е�"+i+"��Ԫ��Ϊ��"+list.selectSeqList(i));
			}
		
			System.out.println("���Ա�ĳ���Ϊ��"+list.lengthSeqList());
			System.out.println("���Ա�ĵ�4��Ԫ��Ϊ��"+list.selectSeqList(4));
			System.out.println("8�����Ա�ĵ�"+list.locateSeqList(8)+"��Ԫ��");
			list.insertSeqList(1,100);
			System.out.println("�����Ա�ĵ�һ��λ��ִ�в���������Ԫ��Ϊ"+list.selectSeqList(1));
			list.deleteSeqList(1);
			System.out.println("�����Ա�ĵ�һ��λ��ִ��ɾ���������Ԫ��Ϊ"+list.selectSeqList(1));
			
			
		}catch(Exception e){
			e.printStackTrace();
		}
	}
}
