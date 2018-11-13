//自己实现ArrayList

public class MyArrayList{
	
	private Object[] elementData;
	
	private int size;
	
	public int size(){
		return size;
	}
	public boolean isEmpty(){
		return size==0;
	}
	
	public Object get(int index){
		//get方法
		if(index<0||index>=size){
			try{
					throw new Exception();
			}catch(Exception e){
			e.printStackTrace();
				}
		}
		return elementData[index];
	} 
	
	public void remove(int index){
		//移除指定位置对象
		rangeCheck(index);
		int numMoved=size-index-1;
		if(numMoved>0){
			System.arraycopy(elementData,index+1,elementData,index,numMoved);
		}
		elementData[--size]=null;
		
	}
	
	public void remove(Object object){
		for(int i=0;i<=size;i++){
			if(get(i).equals(object)){				//底层调用的equals   不是==
				remove(0);
			}
		}
	}
	
	public Object set(int index,Object object){
		rangeCheck(index);
		Object oldValue=elementData[index];
		elementData[index]=object;
		return oldValue;
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
	
	public MyArrayList(){
		this(10);
	}

	public MyArrayList(int initalCapacity){
		if(initalCapacity<0){
			try{
				throw new Exception();
			}
			catch(Exception e){
				e.printStackTrace();
			}
			
		}
		elementData=new Object[initalCapacity];
	}
	
	
	public void add(Object object){
		//ArrayList添加对象
		
		if(size==elementData.length){
			Object[] newArray=new Object[size*2+1];				//扩容
			System.arraycopy(elementData,0,newArray,0,elementData.length);
			elementData=newArray;
		}
		
		elementData[size++]=object;
	}
	
	public static void main(String[] args){
		MyArrayList list=new MyArrayList();
		list.add("1");
		list.add("hello java");
		
		
		System.out.println(list.size());
		
		//list.remove(1);
		System.out.println(list.size());
		
		list.set(0,"hello world");
		for(int i=0;i<list.size();i++){
			System.out.println(list.get(i));
		}
	}
}