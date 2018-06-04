
public class PrintJob {
	private int numberOfPages;
	private int numberofColouredPages;
	private boolean doubleSided;
	private int numberofBWPages;
	private double cost;
	 
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
	

	public PrintJob(int numberofPages, int numberofColouredPages, boolean doubleSided) {
		 this.numberOfPages = numberofPages;
		 this.numberofColouredPages = numberofColouredPages;
		 this.numberofBWPages = numberofPages - numberofColouredPages;
		 this.doubleSided = doubleSided;
		 this.cost = 0;
	 }
}
