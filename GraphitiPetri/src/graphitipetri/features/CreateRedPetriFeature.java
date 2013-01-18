package graphitipetri.features;

import org.eclipse.graphiti.features.ICreateFeature;
import org.eclipse.graphiti.features.IFeatureProvider;
import org.eclipse.graphiti.features.context.ICreateContext;
import org.eclipse.graphiti.features.impl.AbstractCreateFeature;
import org.eclipse.graphiti.mm.pictograms.Diagram;

import petrinet.petri.PetriFactory;
import petrinet.petri.RedPetri;

public class CreateRedPetriFeature extends AbstractCreateFeature implements
		ICreateFeature {

	public CreateRedPetriFeature(IFeatureProvider fp) {
		super(fp, "RedPetri", "Creates a new RedPetri");
	}

	@Override
	public boolean canCreate(ICreateContext context) {
		return context.getTargetContainer() instanceof Diagram;
	}

	@Override
	public Object[] create(ICreateContext context) {
		//  create the domain object here
		//Object newRedPetri = null;
		RedPetri red = PetriFactory.eINSTANCE.createRedPetri();
		
		// TODO: in case of an EMF object add the new object to a suitable resource
		getDiagram().eResource().getContents().add(red);

		addGraphicalRepresentation(context, red);
		return new Object[] { red };
	}
}
