package constructorCompositionProject;

public class Main {

	public static void main(String[] args) {
		
		Dimension dimension = new Dimension(21);
		Case theCase = new Case("Mac", "Apple", dimension);
		Resolution pixel = new Resolution(850);
		Monitor monitor = new Monitor("Black", pixel);
		
		CompositionPC pc = new CompositionPC(theCase, 
							dimension, monitor, pixel);
		
		//monitor.drawPixel(500, 800);
		//theCase.caseDesign();
		//System.out.println("-----------------------");
		pc.getMonitor().drawPixel(500, 800);
		pc.getTheCase().caseDesign();
	}

}
