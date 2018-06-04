
public class PrintJob {
	 int numberOfPages;
	 int numberofColouredPages;
	 boolean doubleSided;
	 int numberofBWPages;
	 
	 public PrintJob(int numberofPages, int numberofColouredPages, boolean doubleSided) {
		 this.numberOfPages = numberofPages;
		 this.numberofColouredPages = numberofColouredPages;
		 this.numberofBWPages = numberofPages - numberofColouredPages;
		 this.doubleSided = doubleSided;
	 }
}
