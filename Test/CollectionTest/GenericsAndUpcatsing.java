/**
向上转型也可以作用于其他类型一样作用于泛型
*/

import java.util.*;

class GrannySmith extends Apple{}
class Gala extends Apple{}
class Fuji extends Apple{}
class Braeburn extends Apple{}

public class GenericsAndUpcatsing{
	public static void main(String[] args){
		ArrayList<Apple> apples=new ArrayList<Apple>();
		apples.add(new GrannySmith());
		apples.add(new Gala());
		apples.add(new Fuji());
		apples.add(new Braeburn());
		for(Apple a:apples)
			System.out.println(a);
		
	}
}