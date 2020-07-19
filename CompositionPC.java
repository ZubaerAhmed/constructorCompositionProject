package constructorCompositionProject;

public class CompositionPC {

	private Case theCase;
	private Dimension dimension;
	private Monitor monitor;
	private Resolution pixel;
	
	public CompositionPC(Case theCase, 
			Dimension dimension, 
			Monitor monitor, Resolution pixel) {
		super();
		this.theCase = theCase;
		this.dimension = dimension;
		this.monitor = monitor;
		this.pixel = pixel;
	}
	
	public Case getTheCase() {
		return theCase;
	}
	public Dimension getDimension() {
		return dimension;
	}
	public Monitor getMonitor() {
		return monitor;
	}
	public Resolution getResolution() {
		return pixel;
	}

}
