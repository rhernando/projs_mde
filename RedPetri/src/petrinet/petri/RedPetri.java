/**
 */
package petrinet.petri;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Red Petri</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link petrinet.petri.RedPetri#getIniPlace <em>Ini Place</em>}</li>
 *   <li>{@link petrinet.petri.RedPetri#getIniTrans <em>Ini Trans</em>}</li>
 * </ul>
 * </p>
 *
 * @see petrinet.petri.PetriPackage#getRedPetri()
 * @model
 * @generated
 */
public interface RedPetri extends EObject {
	/**
	 * Returns the value of the '<em><b>Ini Place</b></em>' containment reference list.
	 * The list contents are of type {@link petrinet.petri.Place}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ini Place</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ini Place</em>' containment reference list.
	 * @see petrinet.petri.PetriPackage#getRedPetri_IniPlace()
	 * @model containment="true"
	 * @generated
	 */
	EList<Place> getIniPlace();

	/**
	 * Returns the value of the '<em><b>Ini Trans</b></em>' containment reference list.
	 * The list contents are of type {@link petrinet.petri.Transition}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ini Trans</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ini Trans</em>' containment reference list.
	 * @see petrinet.petri.PetriPackage#getRedPetri_IniTrans()
	 * @model containment="true"
	 * @generated
	 */
	EList<Transition> getIniTrans();

} // RedPetri
