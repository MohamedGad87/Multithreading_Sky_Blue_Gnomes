
package finall_project;
import java.util.Random;
public class sky_blue extends Thread {
	public static long time = System.currentTimeMillis();
	private String name;
	private monitor monitor;
	static start_show show;
	//private int id;
	// object from monitor
         int num_gnomes=11 ; 
	     int table_size=3;
	//Object sky_blue = new Object();
	public sky_blue(start_show sh){
		show=sh;
	}
	
	monitor mon = new monitor (num_gnomes,table_size);
	
	public sky_blue (String string,monitor mon){
		this.name=string;
		this.monitor= mon;
		
		
		//System.out.println(name);
		
	}
	public sky_blue() {
		// TODO Auto-generated constructor stub
		//nothing after initizization
	}
	public String getname(String s){
		return this.name;
	}
public void msg(String s){
	System.out.println("[" + (System.currentTimeMillis() - time) + "]" + getName() +" princess: " + s);
}

Random rand = new Random();
@Override
public void run(){
	msg("i'm here");
	msg("cooking, cleaning");
	msg("faliing a sleep");
	try {
		mon.napping();
		System.out.println("princess is telling the story");
		//System.out.println("time for Dinner");
		mon.dinner();
		msg("time for a movie");
		//mon.waitskyblue();
		sleep(20000);
		//mon.kisses();
		msg("the story is now over");
		msg("all threads are terminating");
		
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
}
}




