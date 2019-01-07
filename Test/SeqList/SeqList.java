//实现顺序表接口

public class SeqList implements List{
	private static final int MAXSIZE=50;						//设置顺序表最大长度
	public int last;															//指向最后一个元素
	private Object[] data;										//定义一个数组表示顺序存储空间
	
	
	public SeqList(){														//构造函数调用顺序表初始化函数，建立空表
		initSeqList(MAXSIZE);
	}
	
	public SeqList(int size){
		initSeqList(size);													//无参构造函数
	}
	
	public void initSeqList(int size){							//初始化实现
		data=new Object[size];
		last=-1;
	}
	
	public int lengthSeqList(){							//取表长度实现
		return last+1;
	}
	
	public boolean addSeqList(Object x){
		//int i=0;			//指向最后一个元素
		data[last+1]=x;
		last++;
		return true;
	}
	
	public Object selectSeqList(int index) throws Exception{			//按位置查找实现
		if(index<0||index>last+1){
			throw new Exception("位置参数错误");
		}
		return data[index-1];
	}
	
	public int locateSeqList(Object x) throws Exception{					//按值查找，返回位置
		int i=0;
		while(i<=last&&data[i]!=x){
			i++;
		}
		if(i>last+1){
			throw new Exception("位置参数错误，查找失败");
		}
		return i+1;										//查找成功，返回位置。
	}
	
	
	public void insertSeqList(int index,Object x) throws Exception{				//把元素插入指定位置
		if(last+1==MAXSIZE){
			throw new Exception("顺序表已满，无法插入");
		}
		if(index<0||index>last+1){
			throw new Exception("位置参数错误");
		}
		for(int j=last;j>=index-1;j--){
			data[j+1]=data[j];
		}
		data[index-1]=x;
		last++;
	}
	
	public void deleteSeqList(int index) throws Exception{											//删除指定位置数据
		if(index<1||index>last+1){
			throw new Exception("参数位置错误，不存在第index个元素");
		}
		for(int j=index;j<last+1;j++){
			data[j-1]=data[j];
			last--;
		}
	}
	
	
}