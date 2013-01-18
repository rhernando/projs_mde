/**
 */
package petrinet.petri;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Transition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link petrinet.petri.Transition#getName <em>Name</em>}</li>
 *   <li>{@link petrinet.petri.Transition#getConnection <em>Connection</em>}</li>
 * </ul>
 * </p>
 *
 * @see petrinet.petri.PetriPackage#getTransition()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='nameExists nameUnique notUnconnected'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot nameExists='name <> null' nameUnique='Place.allInstances()->isUnique(name)' notUnconnected='connection->isEmpty() implies Place.allInstances()->select(p : Place | p.connection->exists(t : Transition | t.name = self.name))->notEmpty()'"
 * @generated
 */
public interface Transition extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see petrinet.petri.PetriPackage#getTransition_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link petrinet.petri.Transition#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Connection</b></em>' reference list.
	 * The list contents are of type {@link petrinet.petri.Place}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Connection</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Connection</em>' reference list.
	 * @see petrinet.petri.PetriPackage#getTransition_Connection()
	 * @model
	 * @generated
	 */
	EList<Place> getConnection();

} // Transition
