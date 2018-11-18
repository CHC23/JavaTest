//使用javabean和集合存储奥特曼的数据

import java.util.Date;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class UltramanDataTest{
	private int id;
	private String name;
	private String camp;
	private Date birthday;
	
	public UltramanDataTest(int id,String name,String camp,String birthday){
		super();
		this.id=id;
		this.name=name;
		this.camp=camp;

		
		DateFormat format=new SimpleDateFormat("yyyy-MM");			//字符串转换为时间对象
		try{
			this.birthday=format.parse(birthday);
		}catch(ParseException e){
			e.printStackTrace();
		}
	}
	
	public void setId(int id){
		this.id=id;
	}
	
	public int getId(){
		return id;
	}
	
	public void setName(String name){
		this.name=name;
	}
	
	public String getName(){
		return name;
	}
	
	public void setCamp(String camp){
		this.camp=camp;
	}
	
	public String getCamp(){
		return camp;
	}
	
	public void setBirthday(Date birthday){
		this.birthday=birthday;
	}
	
	public Date getBirthday(){
		return birthday;
	}
}
