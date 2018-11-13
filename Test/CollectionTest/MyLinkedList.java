//自己实现双向链表


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
		
		//index越界处理
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
		//链表任意位置插入
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
		list.add("为何要活的像条狗");
		list.add("不摔跟头怎有可知路途艰险");
		list.add("公社都是向阳花");
		list.add(1,"如果你的理想需要急救车");
		System.out.println(list.get(1));
	}
	
}