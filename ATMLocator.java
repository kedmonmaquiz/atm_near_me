import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class ATMLocator {
    
    private double getLocation(double c,double a){	
		return a - c;
	}

    //Main function begin
	public static void main(String[] args){

		PriorityQueue<Double> pq = new PriorityQueue<Double>((value1,value2)-> {
		    Double result = value2-value1; 
		    return result.intValue(); 
		});

		ATMLocator aL = new ATMLocator();
		
		//Number of near ATMs to return
		int number_of_ATMs = 4;
		double current_location = 0.00;

		Map<String,Double> allATMLocations = new HashMap<String,Double>();
        
	}
	
}