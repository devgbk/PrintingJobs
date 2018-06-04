import java.text.DecimalFormat;

/*
 * Class PrintJob contains the properties of a single job object.
 * 
 * */
public class PrintJob {
	
	//Total number of pages to be printed
	private int numberOfPages; 
	
	//Number of coloured pages
	private int numberofColouredPages;  
	
	//Whether the printing is to be single sided or double sided
	private boolean doubleSided; 		
	
	//Number of black and white pages to be printed
	private int numberofBWPages;		
	
	//Cost for printing this job
	private double cost;				
	
	//select the size of paper to be printed on
	private String paperSize;
	
	 
	 public int getNumberOfPages() {
		return numberOfPages;
	}


	public void setNumberOfPages(int numberOfPages) {
		this.numberOfPages = numberOfPages;
	}


	public int getNumberofColouredPages() {
		return numberofColouredPages;
	}


	public void setNumberofColouredPages(int numberofColouredPages) {
		this.numberofColouredPages = numberofColouredPages;
	}


	public boolean isDoubleSided() {
		return doubleSided;
	}


	public void setDoubleSided(boolean doubleSided) {
		this.doubleSided = doubleSided;
	}


	public int getNumberofBWPages() {
		return numberofBWPages;
	}


	public void setNumberofBWPages(int numberofBWPages) {
		this.numberofBWPages = numberofBWPages;
	}


	public double getCost() {
		return cost;
	}


	public void setCost(double cost) {
		this.cost = cost;
	}
	
	
	
public String getPaperSize() {
		return paperSize;
	}


	public void setPaperSize(String paperSize) {
		this.paperSize = paperSize;
	}


	//This method is the constructor of this class which initializes all its properties
	public PrintJob(int numberofPages, int numberofColouredPages, boolean doubleSided) {
		 this.numberOfPages = numberofPages;
		 this.numberofColouredPages = numberofColouredPages;
		 this.numberofBWPages = numberofPages - numberofColouredPages;
		 this.doubleSided = doubleSided;
		 this.cost = 0;
	 }
	
	public String toString() {
		
		return "Print Job :\nNumber of Pages" + numberOfPages + "\nNumber of Colored Pages:" + numberofColouredPages +
				"\nDouble Sided: " + doubleSided+ "\nCost: "+ cost +"\n\n"; 
	}
}
