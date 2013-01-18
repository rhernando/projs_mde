package graphitipetri.features;

import org.eclipse.graphiti.features.ICreateFeature;
import org.eclipse.graphiti.features.IFeatureProvider;
import org.eclipse.graphiti.features.context.ICreateContext;
import org.eclipse.graphiti.features.impl.AbstractCreateFeature;
import org.eclipse.graphiti.mm.pictograms.Diagram;

import petrinet.petri.PetriFactory;
import petrinet.petri.Place;
import petrinet.petri.Transition;

public class CreateTransitionFeature extends AbstractCreateFeature implements
		ICreateFeature {

	public CreateTransitionFeature(IFeatureProvider fp) {
		super(fp, "Transition", "Creates a new Transition");
	}

	@Override
	public boolean canCreate(ICreateContext context) {
		return context.getTargetContainer() instanceof Diagram;
	}

	@Override
	public Object[] create(ICreateContext context) {
		//  create the domain object here
		//Object newRedPetri = null;
		Transition trans = PetriFactory.eINSTANCE.createTransition();
		
		// TODO: in case of an EMF object add the new object to a suitable resource
		getDiagram().eResource().getContents().add(trans);

		addGraphicalRepresentation(context, trans);
		return new Object[] { trans };
	}
}
