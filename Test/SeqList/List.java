//java实现顺序表

public interface List{
	//设计接口
    public void initSeqList(int size);     //初始化线性表

    public int lengthSeqList();    //获取表长度
    public Object selectSeqList(int index) throws Exception;               //查找表的第i个元素
    public int locateSeqList(Object x) throws Exception;                    //查找给定元素m的位置
    public void insertSeqList(int index,Object x) throws Exception;        //插入元素
    public void deleteSeqList(int index) throws Exception;                   //删除元素
}

