//顺序表测试类，测试顺序表
public class Test{
	public static void main(String[] args){										
		SeqList list=new SeqList(30);
		list.initSeqList(30);
		
		try{
			for(int i=0;i<=10;i++){
				list.addSeqList(i);
			}
			for(int i=1;i<list.last+1;i++){
				System.out.println("线性表中第"+i+"个元素为："+list.selectSeqList(i));
			}
		
			System.out.println("线性表的长度为："+list.lengthSeqList());
			System.out.println("线性表的第4个元素为："+list.selectSeqList(4));
			System.out.println("8是线性表的第"+list.locateSeqList(8)+"个元素");
			list.insertSeqList(1,100);
			System.out.println("在线性表的第一个位置执行插入操作后的元素为"+list.selectSeqList(1));
			list.deleteSeqList(1);
			System.out.println("在线性表的第一个位置执行删除操作后的元素为"+list.selectSeqList(1));
			
			
		}catch(Exception e){
			e.printStackTrace();
		}
	}
}
