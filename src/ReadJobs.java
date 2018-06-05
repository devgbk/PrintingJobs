/*
 * Class ReadJobs read the list of jobs, to be printed, from a csv file.
 * 
 */

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class ReadJobs {
	
	
	/*
	 * This method inputs the filename from the user and then reads the
	 *  jobs from the csv file and converts the data into PrintJob object.
	 */
	
	public static ArrayList<PrintJob> readFile(){
		ArrayList<PrintJob> jobs = new ArrayList<PrintJob>();
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the file name :" );
		String filename = sc.nextLine();
		//String filename = "E:\\Study material\\PaperCut\\sample (2).csv";
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
	
}
