
public class Prices {
	 private double singleSidedBW;
	 private double singleSidedColoured;
	 private double doubleSidedBW;
	 private double doubleSidedColoured;
	 private String paperSize;
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

	public Prices(double singleSidedBW, double singleSidedColoured, double doubleSidedBW, double doubleSidedColoured) {
		 this.singleSidedBW = singleSidedBW;
		 this.singleSidedColoured = singleSidedColoured;
		 this.doubleSidedBW = doubleSidedBW;
		 this.doubleSidedColoured = doubleSidedColoured;
	 }
}
