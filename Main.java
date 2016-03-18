package GA_TSP;
import java.io.FileNotFoundException;

import GA_TSP.GeneticTSP;

public class Main {
	public static void main(String[] args) throws FileNotFoundException {
		GeneticTSP GT = new GeneticTSP();
		GT.processData();
		GT.initialization();
		GT.evolution();
		GT.test();
		
	}
}
