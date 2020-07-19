package constructorCompositionProject;

public class Case {

	private String model;
	private String manufacturer;
	private Dimension dimension;
	
	public Case(String model, String manufacturer, Dimension dimension) {
		super();
		this.model = model;
		this.manufacturer = manufacturer;
		this.dimension = dimension;
	}
	
	public void caseDesign() {
		System.out.println("Model: "+model +", manufacture: " + manufacturer);
	}
	
	public String getModel() {
		return model;
	}
	public String getManufacturer() {
		return manufacturer;
	}
	public Dimension getDimension() {
		return dimension;
	}
	
	
}
