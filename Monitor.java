package constructorCompositionProject;

public class Monitor {	
	private String color;
	private Resolution xyPixel;
	
	public Monitor(String color, Resolution xyPixel) {
		super();
		this.color = color;
		this.xyPixel = xyPixel;
	}
	
	public void drawPixel(int x, int y) {
		System.out.println(x + " -> " + y);
	}

	public String getcolor() {
		return color;
	}

	public Resolution getXyPixel() {
		return xyPixel;
	}
}
