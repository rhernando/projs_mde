package graphitipetri.diagram;

import org.eclipse.graphiti.dt.AbstractDiagramTypeProvider;

public class GraphitiPetriDiagramTypeProvider extends AbstractDiagramTypeProvider {

	public GraphitiPetriDiagramTypeProvider() {
		super();
		setFeatureProvider(new GraphitiPetriFeatureProvider(this));
	}
}
