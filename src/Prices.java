/*
 * This class stores the prices of printing depending on various properties such as whether the 
 * print is single sided or double sided, etc.
 */
public class Prices {
	// price for printing single sided black white page
	 private double singleSidedBW;	
	 
	//price for printing single sided coloured page
	 private double singleSidedColoured;
	 
	//price for printing double sided black white page
	 private double doubleSidedBW; 
	 
	//price for printing double sided coloured page
	 private double doubleSidedColoured; 
	 
	 //size of the paper on which job needs to be printed
	 private String paperSize;
	 
	 //currency in which the prices are calculated
	 private String currency;
	 
	 
	 public double getSingleSidedBW() {
		return singleSidedBW;
	}

	public void setSingleSidedBW(double singleSidedBW) {
		this.singleSidedBW = singleSidedBW;
	}

	public double getSingleSidedColoured() {
		return singleSidedColoured;
	}

	public void setSingleSidedColoured(double singleSidedColoured) {
		this.singleSidedColoured = singleSidedColoured;
	}

	public double getDoubleSidedBW() {
		return doubleSidedBW;
	}

	public void setDoubleSidedBW(double doubleSidedBW) {
		this.doubleSidedBW = doubleSidedBW;
	}

	public double getDoubleSidedColoured() {
		return doubleSidedColoured;
	}

	public void setDoubleSidedColoured(double doubleSidedColoured) {
		this.doubleSidedColoured = doubleSidedColoured;
	}

	public String getPaperSize() {
		return paperSize;
	}

	public void setPaperSize(String paperSize) {
		this.paperSize = paperSize;
	}

	public String getCurrency() {
		return currency;
	}

	public void setCurrency(String currency) {
		this.currency = currency;
	}

	public Prices(double singleSidedBW, double singleSidedColoured, double doubleSidedBW, double doubleSidedColoured, String paperSize, String currency) {
		 this.singleSidedBW = singleSidedBW;
		 this.singleSidedColoured = singleSidedColoured;
		 this.doubleSidedBW = doubleSidedBW;
		 this.doubleSidedColoured = doubleSidedColoured;
		 this.paperSize = paperSize;
		 this.currency = currency;
	 }
}
