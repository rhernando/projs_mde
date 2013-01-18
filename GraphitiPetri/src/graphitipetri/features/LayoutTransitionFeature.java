package graphitipetri.features;

import org.eclipse.emf.common.util.EList;
import org.eclipse.graphiti.features.IFeatureProvider;
import org.eclipse.graphiti.features.ILayoutFeature;
import org.eclipse.graphiti.features.context.ILayoutContext;
import org.eclipse.graphiti.features.impl.AbstractLayoutFeature;
import org.eclipse.graphiti.mm.algorithms.Ellipse;
import org.eclipse.graphiti.mm.algorithms.GraphicsAlgorithm;
import org.eclipse.graphiti.mm.algorithms.Rectangle;
import org.eclipse.graphiti.mm.algorithms.Text;
import org.eclipse.graphiti.mm.pictograms.ContainerShape;
import org.eclipse.graphiti.mm.pictograms.PictogramElement;
import org.eclipse.graphiti.mm.pictograms.Shape;
import org.eclipse.graphiti.services.Graphiti;

import petrinet.petri.Place;
import petrinet.petri.Transition;

public class LayoutTransitionFeature extends AbstractLayoutFeature implements
		ILayoutFeature {

	public LayoutTransitionFeature(IFeatureProvider fp) {
		super(fp);
	}

	@Override
	public boolean canLayout(ILayoutContext context) {
		// : check for right domain object instances below
		return context.getPictogramElement() instanceof ContainerShape  && getBusinessObjectForPictogramElement(context.getPictogramElement()) instanceof Transition;
	}

	@Override
	public boolean layout(ILayoutContext context) {
		PictogramElement pictogramElement = context.getPictogramElement();
		if (pictogramElement instanceof ContainerShape) {
			ContainerShape containerShape = (ContainerShape) pictogramElement;
			GraphicsAlgorithm outerGraphicsAlgorithm = containerShape.getGraphicsAlgorithm();
			if (outerGraphicsAlgorithm instanceof Rectangle) {
				Rectangle rect = (Rectangle) outerGraphicsAlgorithm;
				EList<Shape> children = containerShape.getChildren();
				if (children.size() > 0) {
					Text text = (Text)children.get(0).getGraphicsAlgorithm();
					Graphiti.getGaLayoutService().setLocationAndSize(text, 0, 0, rect.getWidth(), rect.getHeight());
				}
			}
		}
		return false;
	}
}
