package graphitipetri.features;

import org.eclipse.emf.common.util.EList;
import org.eclipse.graphiti.features.IFeatureProvider;
import org.eclipse.graphiti.features.ILayoutFeature;
import org.eclipse.graphiti.features.context.ILayoutContext;
import org.eclipse.graphiti.features.impl.AbstractLayoutFeature;
import org.eclipse.graphiti.mm.algorithms.Ellipse;
import org.eclipse.graphiti.mm.algorithms.GraphicsAlgorithm;
import org.eclipse.graphiti.mm.algorithms.Text;
import org.eclipse.graphiti.mm.pictograms.ContainerShape;
import org.eclipse.graphiti.mm.pictograms.PictogramElement;
import org.eclipse.graphiti.mm.pictograms.Shape;
import org.eclipse.graphiti.services.Graphiti;

import petrinet.petri.Place;

public class LayoutPlaceFeature extends AbstractLayoutFeature implements
		ILayoutFeature {

	public LayoutPlaceFeature(IFeatureProvider fp) {
		super(fp);
	}

	@Override
	public boolean canLayout(ILayoutContext context) {
		// : check for right domain object instances below
		return context.getPictogramElement() instanceof ContainerShape  && getBusinessObjectForPictogramElement(context.getPictogramElement()) instanceof Place;
	}

	@Override
	public boolean layout(ILayoutContext context) {
		PictogramElement pictogramElement = context.getPictogramElement();
		if (pictogramElement instanceof ContainerShape) {
			ContainerShape containerShape = (ContainerShape) pictogramElement;
			GraphicsAlgorithm outerGraphicsAlgorithm = containerShape.getGraphicsAlgorithm();
			if (outerGraphicsAlgorithm instanceof Ellipse) {
				Ellipse ellipse = (Ellipse) outerGraphicsAlgorithm;
				EList<Shape> children = containerShape.getChildren();
				if (children.size() > 0) {
					Text text = (Text)children.get(0).getGraphicsAlgorithm();
					Graphiti.getGaLayoutService().setLocationAndSize(text, 0, 0, ellipse.getWidth(), ellipse.getHeight());
					EList<GraphicsAlgorithm> chils = text.getGraphicsAlgorithmChildren();
					if (chils.size() > 0) {
						Text text2 = (Text)chils.get(0);
						Graphiti.getGaLayoutService().setLocationAndSize(text2, 1, 1, ellipse.getWidth(), ellipse.getHeight());
					}
					//					Shape shape = children.get(0);
//					GraphicsAlgorithm graphicsAlgorithm = shape.getGraphicsAlgorithm();
//					if (graphicsAlgorithm instanceof Text) {
//						Graphiti.getGaLayoutService().setLocationAndSize(graphicsAlgorithm, 0, 0, ellipse.getWidth(), ellipse.getHeight());
//						return true;
//					}
				}
			}
		}
		return false;
	}
}
