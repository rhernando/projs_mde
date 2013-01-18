package graphitipetri.features;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

import org.eclipse.graphiti.features.IAddFeature;
import org.eclipse.graphiti.features.IFeatureProvider;
import org.eclipse.graphiti.features.context.IAddContext;
import org.eclipse.graphiti.features.impl.AbstractAddFeature;
import org.eclipse.graphiti.mm.algorithms.Ellipse;
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

public class AddPlaceFeature extends AbstractAddFeature implements IAddFeature {

	public AddPlaceFeature(IFeatureProvider fp) {
		super(fp);
	}

	@Override
	public boolean canAdd(IAddContext context) {
		// TODO: check for right domain object instance below
		return context.getNewObject() instanceof Place
				&& context.getTargetContainer() instanceof Diagram;
	}

	@Override
	public PictogramElement add(IAddContext context) {

		Place newPlace = (Place) context.getNewObject();

		Diagram targetDiagram = (Diagram) context.getTargetContainer();
		IPeCreateService peCreateService = Graphiti.getPeCreateService();
		IGaService gaService = Graphiti.getGaService();

		ContainerShape containerShape = peCreateService.createContainerShape(
				targetDiagram, true);
		Ellipse roundedRectangle = gaService.createEllipse(containerShape);
		gaService.setLocationAndSize(roundedRectangle, context.getX(),
				context.getY(), context.getWidth(), context.getHeight());
		roundedRectangle.setFilled(false);

		String name = "nombre place " + Math.random();//(String) JOptionPane				.showInputDialog(new JFrame(), "Name");
		newPlace.setName(name);

		String tokens = "1";// (String) JOptionPane				.showInputDialog(new JFrame(), "Tokens");
		try {
			newPlace.setTokens(Integer.parseInt(tokens));
		} catch (NumberFormatException e) {
			newPlace.setTokens(0);
		}

		Shape shape = peCreateService.createShape(containerShape, false);
		Text text = gaService.createText(shape, String.valueOf(newPlace.getTokens()));
		text.setHorizontalAlignment(Orientation.ALIGNMENT_CENTER);
		text.setVerticalAlignment(Orientation.ALIGNMENT_CENTER);
		gaService.setLocationAndSize(text, 0, 0, context.getWidth(),
				context.getHeight());

		Text textName = gaService.createText(text, newPlace.getName());
		textName.setHorizontalAlignment(Orientation.ALIGNMENT_RIGHT);
		textName.setVerticalAlignment(Orientation.ALIGNMENT_TOP);
		gaService.setLocationAndSize(textName, 10, 10, context.getWidth(),
				context.getHeight());

		peCreateService.createChopboxAnchor(containerShape);

		// enable the link to the domain object
		// Object addedDomainObject = context.getNewObject();
		link(containerShape, newPlace);

		return containerShape;
	}
}
