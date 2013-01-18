package graphitipetri.features;

import org.eclipse.graphiti.features.ICreateConnectionFeature;
import org.eclipse.graphiti.features.IFeatureProvider;
import org.eclipse.graphiti.features.context.ICreateConnectionContext;
import org.eclipse.graphiti.features.context.impl.AddConnectionContext;
import org.eclipse.graphiti.features.impl.AbstractCreateConnectionFeature;
import org.eclipse.graphiti.mm.pictograms.Anchor;
import org.eclipse.graphiti.mm.pictograms.Connection;
import org.eclipse.graphiti.mm.pictograms.PictogramElement;

import petrinet.petri.Place;
import petrinet.petri.Transition;

public class CreatePlaceTransitionConnectionFeature extends
		AbstractCreateConnectionFeature implements ICreateConnectionFeature {

	public CreatePlaceTransitionConnectionFeature(IFeatureProvider fp) {
		super(fp, "DomainObjectConnection p2t",
				"Creates a new DomainObjectConnection between two RedPetris");
	}

	@Override
	public boolean canStartConnection(ICreateConnectionContext context) {
		Anchor source = context.getSourceAnchor();
		return source != null
				&& (getBusinessObjectForPictogramElement(source.getParent()) instanceof Place || getBusinessObjectForPictogramElement(source
						.getParent()) instanceof Transition);
		// TODO: check for right domain object instance below
		// return
		// getBusinessObjectForPictogramElement(context.getSourcePictogramElement())
		// instanceof <DomainObject>;

	}

	@Override
	public boolean canCreate(ICreateConnectionContext context) {
		PictogramElement sourcePictogramElement = context
				.getSourcePictogramElement();
		PictogramElement targetPictogramElement = context
				.getTargetPictogramElement();

		if (sourcePictogramElement != null && targetPictogramElement != null) {
			// : check for right domain object instance below
			if (getBusinessObjectForPictogramElement(sourcePictogramElement) instanceof Place
					&& getBusinessObjectForPictogramElement(targetPictogramElement) instanceof Transition) {
				return true;
			}
			if (getBusinessObjectForPictogramElement(sourcePictogramElement) instanceof Transition
					&& getBusinessObjectForPictogramElement(targetPictogramElement) instanceof Place) {
				return true;
			}
		}
		return sourcePictogramElement != null && targetPictogramElement != null;
	}

	@Override
	public Connection create(ICreateConnectionContext context) {
		Connection newConnection = null;

		PictogramElement sourcePictogramElement = context
				.getSourcePictogramElement();
		PictogramElement targetPictogramElement = context
				.getTargetPictogramElement();

		if (getBusinessObjectForPictogramElement(sourcePictogramElement) instanceof Place){
			Place place = (Place)getBusinessObjectForPictogramElement(sourcePictogramElement);
			Transition transition = (Transition)getBusinessObjectForPictogramElement(targetPictogramElement);
			place.getConnection().add(transition);
		}
		if (getBusinessObjectForPictogramElement(sourcePictogramElement) instanceof Transition){
			Place place = (Place)getBusinessObjectForPictogramElement(targetPictogramElement);
			Transition transition = (Transition)getBusinessObjectForPictogramElement(sourcePictogramElement);
			transition.getConnection().add(place);
		}
		// TODO: create the domain object connection here
		Object newDomainObjectConnetion = null;

		AddConnectionContext addContext = new AddConnectionContext(
				context.getSourceAnchor(), context.getTargetAnchor());
		addContext.setNewObject(newDomainObjectConnetion);
		newConnection = (Connection) getFeatureProvider().addIfPossible(
				addContext);

		return newConnection;
	}
}
