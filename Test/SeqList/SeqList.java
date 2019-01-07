//ʵ��˳���ӿ�

public class SeqList implements List{
	private static final int MAXSIZE=50;						//����˳�����󳤶�
	public int last;															//ָ�����һ��Ԫ��
	private Object[] data;										//����һ�������ʾ˳��洢�ռ�
	
	
	public SeqList(){														//���캯������˳����ʼ�������������ձ�
		initSeqList(MAXSIZE);
	}
	
	public SeqList(int size){
		initSeqList(size);													//�޲ι��캯��
	}
	
	public void initSeqList(int size){							//��ʼ��ʵ��
		data=new Object[size];
		last=-1;
	}
	
	public int lengthSeqList(){							//ȡ����ʵ��
		return last+1;
	}
	
	public boolean addSeqList(Object x){
		//int i=0;			//ָ�����һ��Ԫ��
		data[last+1]=x;
		last++;
		return true;
	}
	
	public Object selectSeqList(int index) throws Exception{			//��λ�ò���ʵ��
		if(index<0||index>last+1){
			throw new Exception("λ�ò�������");
		}
		return data[index-1];
	}
	
	public int locateSeqList(Object x) throws Exception{					//��ֵ���ң�����λ��
		int i=0;
		while(i<=last&&data[i]!=x){
			i++;
		}
		if(i>last+1){
			throw new Exception("λ�ò������󣬲���ʧ��");
		}
		return i+1;										//���ҳɹ�������λ�á�
	}
	
	
	public void insertSeqList(int index,Object x) throws Exception{				//��Ԫ�ز���ָ��λ��
		if(last+1==MAXSIZE){
			throw new Exception("˳����������޷�����");
		}
		if(index<0||index>last+1){
			throw new Exception("λ�ò�������");
		}
		for(int j=last;j>=index-1;j--){
			data[j+1]=data[j];
		}
		data[index-1]=x;
		last++;
	}
	
	public void deleteSeqList(int index) throws Exception{											//ɾ��ָ��λ������
		if(index<1||index>last+1){
			throw new Exception("����λ�ô��󣬲����ڵ�index��Ԫ��");
		}
		for(int j=index;j<last+1;j++){
			data[j-1]=data[j];
			last--;
		}
	}
	
	
}