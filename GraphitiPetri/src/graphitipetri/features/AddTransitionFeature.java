package graphitipetri.features;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

import org.eclipse.graphiti.features.IAddFeature;
import org.eclipse.graphiti.features.IFeatureProvider;
import org.eclipse.graphiti.features.context.IAddContext;
import org.eclipse.graphiti.features.impl.AbstractAddFeature;
import org.eclipse.graphiti.mm.algorithms.Ellipse;
import org.eclipse.graphiti.mm.algorithms.Rectangle;
import org.eclipse.graphiti.mm.algorithms.Text;
import org.eclipse.graphiti.mm.algorithms.styles.Orientation;
import org.eclipse.graphiti.mm.pictograms.ContainerShape;
import org.eclipse.graphiti.mm.pictograms.Diagram;
import org.eclipse.graphiti.mm.pictograms.PictogramElement;
import org.eclipse.graphiti.mm.pictograms.Shape;
import org.eclipse.graphiti.services.Graphiti;
import org.eclipse.graphiti.services.IGaService;
import org.eclipse.graphiti.services.IPeCreateService;

import petrinet.petri.Place;
import petrinet.petri.Transition;

public class AddTransitionFeature extends AbstractAddFeature implements IAddFeature {

	public AddTransitionFeature(IFeatureProvider fp) {
		super(fp);
	}

	@Override
	public boolean canAdd(IAddContext context) {
		// TODO: check for right domain object instance below
		return context.getNewObject() instanceof Transition
				&& context.getTargetContainer() instanceof Diagram;
	}

	@Override
	public PictogramElement add(IAddContext context) {

		Transition newTransition = (Transition) context.getNewObject();

		Diagram targetDiagram = (Diagram) context.getTargetContainer();
		IPeCreateService peCreateService = Graphiti.getPeCreateService();
		IGaService gaService = Graphiti.getGaService();

		ContainerShape containerShape = peCreateService.createContainerShape(
				targetDiagram, true);
		Rectangle rectangle = gaService.createRectangle(containerShape);
		gaService.setLocationAndSize(rectangle, context.getX(),
				context.getY(), context.getWidth(), context.getHeight());
		rectangle.setFilled(false);

		String name = "nombre transicion " + Math.random();//(String) JOptionPane				.showInputDialog(new JFrame(), "Name");
		newTransition.setName(name);

		Shape shape = peCreateService.createShape(containerShape, false);

		Text textName = gaService.createText(shape, newTransition.getName());
		textName.setHorizontalAlignment(Orientation.ALIGNMENT_RIGHT);
		textName.setVerticalAlignment(Orientation.ALIGNMENT_TOP);
		gaService.setLocationAndSize(textName, 0, 0, context.getWidth(),
				context.getHeight());

		peCreateService.createChopboxAnchor(containerShape);

		// enable the link to the domain object
		// Object addedDomainObject = context.getNewObject();
		link(containerShape, newTransition);

		return containerShape;
	}
}
