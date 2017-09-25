package data.common.domain.nosql;

public class Coordinate implements java.io.Serializable {
	private static final long serialVersionUID = 1364261159928948070L;
	private String type;
	private double[] coordinates;

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public double[] getCoordinates() {
		return coordinates;
	}

	public void setCoordinates(double[] coordinates) {
		this.coordinates = coordinates;
	}

}
