class GuessGame{
	Player p1;
	Player p2;
	Player p3;
	
	public void startGame(){
		p1=new Player();
		p2=new Player();
		p3=new Player();
		
		int guessp1=0;
		int guessp2=0;
		int guessp3=0;
		
		boolean p1isRight=false;
		boolean p2isRight=false;
		boolean p3isRight=false;
		
		int targetNumber=(int)(Math.random()*10);
		System.out.println("数字在1到9之间......");
		while(true){
			System.out.println("需要猜测的数字是"+targetNumber);
			
			p1.guess();
			p2.guess();
			p3.guess();
			
			guessp1=p1.number;
			System.out.println("猜测的第一个数字："+guessp1);
			
			guessp2=p2.number;
			System.out.println("猜测的第二个数字："+guessp2);
			
			guessp3=p3.number;
			System.out.println("猜测的第三个数字："+guessp3);
			
			if(guessp1==targetNumber){
				p1isRight=true;
			}
			if(guessp2==targetNumber){
				p2isRight=true;
			}
			if(guessp3==targetNumber){
				p3isRight=true;
			}
			
			if(p1isRight||p2isRight||p3isRight){
				System.out.println("我们有一个赢家");
				System.out.println("玩家一猜对了吗？"+p1isRight);
				System.out.println("玩家二猜对了吗？"+p2isRight);
				System.out.println("玩家三猜对了吗？"+p3isRight);
				break;
			}else{
				System.out.println("玩家们要重来一次");
			}
		}
	}
}

class Player{
	int number=0;
	public void guess(){
		number=(int)(Math.random()*10);
		System.out.println("这个数字是："+number);
	}
}

public class GameLauncher{
	public static void main(String[] args){
		GuessGame game=new GuessGame();
		game.startGame();
	}
}
