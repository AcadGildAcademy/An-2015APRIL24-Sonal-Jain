/**
* program to print RateOfInterest of banks
* @version 1.0 19-05-2015
* @author Sonal Jain
*/
package methodoverriding;

import java.text.NumberFormat;

public abstract class Bank {
	//implementation in inherited classes
	public abstract float getRateOfInterest();
    //getting o/p in percent format
	public String getRateOfInterestAsString() {
		NumberFormat percent = NumberFormat.getPercentInstance();
		return percent.format(getRateOfInterest());
	}
}
