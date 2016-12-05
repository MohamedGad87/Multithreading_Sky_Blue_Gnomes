// this class has the main method and creats the threads

package finall_project;
import java.util.LinkedList;
import java.util.Random;


public class start_show {
	
	// object from monitor
	//sky object that takes name and monitor object
	//
	
	
	public static void main(String[] args) throws InterruptedException{
		int num_gnomes =11; 
		int table_size=3;
		//int num=0;
		 if (args.length==1) {
		      num_gnomes=Integer.parseInt(args[0]);
		    } else if (args.length==2) {
		      num_gnomes =  Integer.parseInt(args[0]);
		      table_size = Integer.parseInt(args[1]);
		    }
		Object sky_blue = new Object();
		 final monitor mon =new monitor (num_gnomes,table_size);
		sky_blue princess= new sky_blue("princess", mon);
		princess.start();
		
		for(int i=0;i<num_gnomes;i++){
		gnomes gnomes=new gnomes(i,mon);
        gnomes.start();
       }
		
		princess.join();
		
		
	}
	
}
