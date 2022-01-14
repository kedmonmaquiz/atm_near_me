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
		int number_of_ATMs = 4; //Assuming we want to return only 4 nearest ATMs
		double current_location = 0.00;

		Map<String,Double> allATMLocations = new HashMap<String,Double>();

        //Map of ATM names and their distance coordinates
		allATMLocations.put("atm1",56.8);
		allATMLocations.put("atm2",42.4);
		allATMLocations.put("atm3",35.7);
		allATMLocations.put("atm4",61.5);
		allATMLocations.put("atm5",57.0);
		allATMLocations.put("atm6",32.2);
		allATMLocations.put("atm7",35.1);
		allATMLocations.put("atm8",5.3);
		
		allATMLocations.forEach((atm,distance) ->{
		    if(pq.size() < number_of_ATMs){
			pq.add(aL.getLocation(current_location,distance));}
		else{
			if(	pq.peek() > aL.getLocation(current_location,distance)){
				pq.poll();
				pq.add(aL.getLocation(current_location,distance));
			   }
	      	}
		});

		pq.forEach(atmLocation -> System.out.println(atmLocation));	

	}
	
}