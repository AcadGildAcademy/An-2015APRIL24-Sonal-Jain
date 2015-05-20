/**
* program to print RateOfInterest of banks
* @version 1.0 19-05-2015
* @author Sonal Jain
*/
package methodoverriding;

public class Test {

	public static void main(String[] args) {
		Bank SBI = new SBI();
		Bank ICICI = new ICICI();
		Bank AXIS = new AXIS();
		//RateOfInterest in usual format
		System.out.println(SBI.getRateOfInterest());
		System.out.println(ICICI.getRateOfInterest());
		System.out.println(AXIS.getRateOfInterest());
        //RateOfInterest in percent format
		System.out.println(SBI.getRateOfInterestAsString());
		System.out.println(ICICI.getRateOfInterestAsString());
		System.out.println(AXIS.getRateOfInterestAsString());
	}

}
