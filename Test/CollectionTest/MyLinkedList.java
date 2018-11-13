//�Լ�ʵ��˫������


public class MyLinkedList{
	private Node first;
	private Node last;
	
	private int size;
	
	public int size(){
		return size;
	}
	
	private void rangeCheck(int index){
		if(index<0||index>=size){
			try{
					throw new Exception();
			}catch(Exception e){
			e.printStackTrace();
				}
		}
	}
	public Object get(int index){
		
		//indexԽ�紦��
		rangeCheck(index);
		
		Node temp=node(index);
		if(temp!=null){
			return temp.object;
		}
		return null;
	}
	
	public Node node(int index){
		Node temp=null;
		if(first!=null){
			temp=first;
			for(int i=0;i<index;i++){
				temp=temp.next;
			}
		}
		return temp;
	}
	
	public void remove(int index){
		Node temp=node(index);
		
		if(temp!=null){
			Node up=temp.previous;
			Node down=temp.next;
			up.next=down;
			down.previous= up;
			size--;
		}
		
	}
	
	
	public void add(Object object){
		Node n=new Node();
		if(first==null){
			n.setPrevious(null);
			n.setObject(object);
			n.setNext(null);
			
			first=n;
			last=n;
		}
		else{
			n.setPrevious(last);
			n.setObject(object);
			n.setNext(null);
			
			last.setNext(n);
			last=n;
		}
		size++;
	}
	
	public void add(int index,Object object){
		//��������λ�ò���
		Node temp=node(index); 
		Node newNode=new Node();
		newNode.object=object;
		
		if(temp!=null){
			Node up=temp.previous;
			up.next=newNode;
			newNode.previous=up;
			
			newNode.next=temp;
			temp.previous=newNode;
			
			size++;
		}
	}
	
	public static void main(String[] args){
		MyLinkedList list=new MyLinkedList();
		list.add("Ϊ��Ҫ���������");
		list.add("��ˤ��ͷ���п�֪·;����");
		list.add("���綼��������");
		list.add(1,"������������Ҫ���ȳ�");
		System.out.println(list.get(1));
	}
	
}