import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class PriceCalculator {

	public static void main(String args[]) {
		
		ArrayList<PrintJob> jobs = new ArrayList<PrintJob>();
		jobs = readFile();
		calculate(jobs);
		
	}
	
	public static ArrayList<PrintJob> readFile(){
		ArrayList<PrintJob> jobs = new ArrayList<PrintJob>();
		String filename = "E:\\Study material\\PaperCut\\sample (2).csv";
		String line = "";
        String cvsSplitBy = ",";
        PrintJob job;
        try (BufferedReader br = new BufferedReader(new FileReader(filename))) {
        	br.readLine();	
            while ((line = br.readLine()) != null) {

            	 String[] line1 = line.split(cvsSplitBy);
            	 job = new PrintJob(Integer.parseInt(line1[0]),Integer.parseInt(line1[1]), Boolean.parseBoolean(line1[2].trim()));
            	 jobs.add(job);

            }

        } catch (IOException e) {
            e.printStackTrace();
        }

    
		return jobs;
	}
	
	public static void calculate(ArrayList<PrintJob> jobs) {
		double cost;
		double totalCost=0;
		Prices price = new Prices(15, 25, 10, 20);
		for(PrintJob job : jobs) {
			if(job.doubleSided) {
				cost = (job.numberofColouredPages * price.doubleSidedColoured) + (job.numberofBWPages * price.doubleSidedBW);
			}
			else
			{
				cost = (job.numberofColouredPages * price.singleSidedColoured) + (job.numberofBWPages * price.singleSidedBW);
			}
			System.out.println(cost/100 + "$");
			totalCost += cost; 
		}
		System.out.println("Total Cost: " +totalCost);
	}
	
}
