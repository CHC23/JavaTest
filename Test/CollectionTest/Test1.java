/**
java编程思想第十一章练习题一
*/

import java.util.*;

class Gerbil{
	private static int counter;
	private final int gerbilNumber=counter++;
	public int hop(){return gerbilNumber;}
}

public class Test1{
	public static void main(String[] args){
		ArrayList<Gerbil> gerbils=new ArrayList<Gerbil>();
		for(int i=0;i<3;i++)
			gerbils.add(new Gerbil());
		for(Gerbil g:gerbils)
			System.out.println(g.hop());
		for(int i=0;i<gerbils.size();i++)
			System.out.println(gerbils.get(i).hop());
	}
}