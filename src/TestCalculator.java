/*
 * TestCalculator is a class which implements the pricecalculator for all the jobs thats are read
 * from the csv file.
 * 
 * Similar to jobs, prices for other papersizes can be read from a file or database and added to 
 * the pricelist
 * 
 * In order the cost for multiple paper sizes, Class PrintJob will alos have a attribute to select
 * the papersize and then the cost will be calculated like wise. 
 * 
 */
import java.text.DecimalFormat;
import java.util.ArrayList;

public class TestCalculator {

public static void main(String args[]) {
		
		ArrayList<PrintJob> jobs = new ArrayList<PrintJob>();
		jobs = ReadJobs.readFile();
		
		ArrayList<Prices> PriceList = new ArrayList<Prices>();
		
		Prices price = new Prices(0.15, 0.25, 0.10, 0.20, "A4", "AUD");
		PriceList.add(price);
		
		double totalCost=0;
		
			for(PrintJob job : jobs) {
				job.getPaperSize();
				/*
				 * In case of multiple papersizes, the prices object can be selected in following way.
				 * 
				 * ALSO, if the PaperList exceeds a limited size, HashMaps can be used instead of 
				 * arrayList for time optimization.
				 * 
				 * for(Prices p: PriceList) {
					if(p.getPaperSize().equals(job.getPaperSize())) {
						price = p;
						break;
					}
						
				}*/
				
				
				PriceCalculator.calculatePrintingCost(job, price);
				System.out.println(job.toString());
				totalCost += job.getCost();
			}
			DecimalFormat df = new DecimalFormat(".00");
			System.out.println("Total Cost: " +df.format(totalCost));
		}
		

}
	
