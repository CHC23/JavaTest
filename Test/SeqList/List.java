//javaʵ��˳���

public interface List{
	//��ƽӿ�
    public void initSeqList(int size);     //��ʼ�����Ա�

    public int lengthSeqList();    //��ȡ����
    public Object selectSeqList(int index) throws Exception;               //���ұ�ĵ�i��Ԫ��
    public int locateSeqList(Object x) throws Exception;                    //���Ҹ���Ԫ��m��λ��
    public void insertSeqList(int index,Object x) throws Exception;        //����Ԫ��
    public void deleteSeqList(int index) throws Exception;                   //ɾ��Ԫ��
}

