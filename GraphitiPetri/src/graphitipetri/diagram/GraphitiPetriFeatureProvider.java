package graphitipetri.diagram;

import org.eclipse.graphiti.dt.IDiagramTypeProvider;
import org.eclipse.graphiti.features.IAddFeature;
import org.eclipse.graphiti.features.ICreateConnectionFeature;
import org.eclipse.graphiti.features.ICreateFeature;
import org.eclipse.graphiti.features.ILayoutFeature;
import org.eclipse.graphiti.features.context.IAddConnectionContext;
import org.eclipse.graphiti.features.context.IAddContext;
import org.eclipse.graphiti.features.context.ILayoutContext;
import org.eclipse.graphiti.mm.pictograms.ContainerShape;
import org.eclipse.graphiti.ui.features.DefaultFeatureProvider;

import graphitipetri.features.AddDomainObjectConnectionConnectionFeature;
import graphitipetri.features.AddPlaceFeature;
import graphitipetri.features.AddPlaceTransitionConnectionFeature;
import graphitipetri.features.AddRedPetriFeature;
import graphitipetri.features.AddTransitionFeature;
import graphitipetri.features.CreateDomainObjectConnectionConnectionFeature;
import graphitipetri.features.CreatePlaceFeature;
import graphitipetri.features.CreatePlaceTransitionConnectionFeature;
import graphitipetri.features.CreateRedPetriFeature;
import graphitipetri.features.CreateTransitionFeature;
import graphitipetri.features.LayoutPlaceFeature;
import graphitipetri.features.LayoutRedPetriFeature;
import graphitipetri.features.LayoutTransitionFeature;

import petrinet.petri.Place;
import petrinet.petri.RedPetri;
import petrinet.petri.Transition;

public class GraphitiPetriFeatureProvider extends DefaultFeatureProvider {

	public GraphitiPetriFeatureProvider(IDiagramTypeProvider dtp) {
		super(dtp);
	}

	@Override
	public ICreateFeature[] getCreateFeatures() {
		return new ICreateFeature[] {new CreateRedPetriFeature(this), new CreatePlaceFeature(this), new CreateTransitionFeature(this)};
	}
	
	@Override
	public ICreateConnectionFeature[] getCreateConnectionFeatures() {
		return new ICreateConnectionFeature[] {new CreatePlaceTransitionConnectionFeature(this)};
	}
	
	@Override
	public IAddFeature getAddFeature(IAddContext context) {
		// : check for right domain object instances below
		if (context instanceof IAddConnectionContext) {
			return new AddPlaceTransitionConnectionFeature(this);
		} else if (context instanceof IAddContext /* && context.getNewObject() instanceof <DomainObject> */) {
			if (context.getNewObject() instanceof RedPetri) return new AddRedPetriFeature(this);
			if (context.getNewObject() instanceof Place) return new AddPlaceFeature(this);
			if (context.getNewObject() instanceof Transition) return new AddTransitionFeature(this);
		}

		return super.getAddFeature(context);
	}
	
	@Override
	public ILayoutFeature getLayoutFeature(ILayoutContext context) {
		// TODO: check for right domain object instances below
		if (context.getPictogramElement() instanceof ContainerShape) {
			Object obj = getBusinessObjectForPictogramElement(context.getPictogramElement()) ;
			if (obj instanceof RedPetri)
				return  new LayoutRedPetriFeature(this);
			if (obj instanceof Place)
				return  new LayoutPlaceFeature(this);
			if (obj instanceof Transition)
				return  new LayoutTransitionFeature(this);
		}
	
		return super.getLayoutFeature(context);
	}
}
