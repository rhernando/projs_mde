package graphitipetri.features;

import org.eclipse.graphiti.features.ICreateFeature;
import org.eclipse.graphiti.features.IFeatureProvider;
import org.eclipse.graphiti.features.context.ICreateContext;
import org.eclipse.graphiti.features.impl.AbstractCreateFeature;
import org.eclipse.graphiti.mm.pictograms.Diagram;

import petrinet.petri.PetriFactory;
import petrinet.petri.Place;

public class CreatePlaceFeature extends AbstractCreateFeature implements
		ICreateFeature {

	public CreatePlaceFeature(IFeatureProvider fp) {
		super(fp, "Place", "Creates a new Place");
	}

	@Override
	public boolean canCreate(ICreateContext context) {
		return context.getTargetContainer() instanceof Diagram;
	}

	@Override
	public Object[] create(ICreateContext context) {
		//  create the domain object here
		//Object newRedPetri = null;
		Place place = PetriFactory.eINSTANCE.createPlace();
		
		// TODO: in case of an EMF object add the new object to a suitable resource
		getDiagram().eResource().getContents().add(place);

		addGraphicalRepresentation(context, place);
		return new Object[] { place };
	}
}
