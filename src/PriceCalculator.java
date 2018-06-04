/*
 * This class calculates the cost for a single job
 */
public class PriceCalculator {

	
	public static void calculatePrintingCost(PrintJob job, Prices price) {
		if(job.isDoubleSided()) {
			job.setCost(job.getNumberofColouredPages()*price.getDoubleSidedColoured()+job.getNumberofBWPages()*price.getDoubleSidedBW());			
		}
		
		else
		{
			job.setCost((job.getNumberofColouredPages() * price.getSingleSidedColoured()) + (job.getNumberofBWPages() * price.getSingleSidedBW()));
		}
	}
	
}
