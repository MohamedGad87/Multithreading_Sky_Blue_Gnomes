package finall_project;
import java.util.Random;
public class gnomes extends Thread {
	
	public static long time = System.currentTimeMillis();
	private int name;
	int num_gnomes=11;
	int table_size;
	int num=0;
	Object sky_blue;
	private Object monitor;
	//private int id;
// object from monitor
Random rand = new Random();
monitor mon =new monitor (num_gnomes,table_size);

public gnomes (int string, Object mon ){// monitor temp
	this.name=string;
	this.monitor= mon;
	//System.out.println(name);
	
	
}
public int getname(String s){
	return this.name;
}



@Override
public void run(){
	try {
		sleep(rand.nextInt(1000));
	msg("im here waiting for the key!!");
	mon.count(name);
//	mon.notifyskyblue();
//	System.out.println("entering the house, waking her up"+(this.getName()));
	mon.waitinggnomes();
	//mon.dinner();
	
	sleep(rand.nextInt(100));
	
	synchronized (this) {
		if(mon.iseatting){
		mon.iseatting(false);
		//System.out.println("gnomes2.run()");
		mon.notifyskyblue();
		}
		mon.movietime();
		msg("watching a movie");
		
		}
	sleep(rand.nextInt(15000));
	mon.kiss.addElement(this);
	msg("all added to vector");
	sleep(5000);
	mon.kisses();
	//mon.notifyskyblue();
	//sleep(1000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	
}

public void msg(String s){
	System.out.println("[" + (System.currentTimeMillis() - time) + "]" + getName() +" gnomes: " + s);
}

}
