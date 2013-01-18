/**
 */
package petrinet.petri;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Place</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link petrinet.petri.Place#getName <em>Name</em>}</li>
 *   <li>{@link petrinet.petri.Place#getTokens <em>Tokens</em>}</li>
 *   <li>{@link petrinet.petri.Place#getConnection <em>Connection</em>}</li>
 * </ul>
 * </p>
 *
 * @see petrinet.petri.PetriPackage#getPlace()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='nameExists nameUnique tokPositive notUnconnected'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot nameExists='name <> null' nameUnique='Place.allInstances()->isUnique(name)' tokPositive='tokens >= 0' notUnconnected='connection->isEmpty() implies Transition.allInstances()->select(p : Transition | p.connection->exists(t : Place | t.name = self.name))->notEmpty()'"
 * @generated
 */
public interface Place extends EObject {
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
	 * @see petrinet.petri.PetriPackage#getPlace_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link petrinet.petri.Place#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Tokens</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tokens</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tokens</em>' attribute.
	 * @see #setTokens(int)
	 * @see petrinet.petri.PetriPackage#getPlace_Tokens()
	 * @model
	 * @generated
	 */
	int getTokens();

	/**
	 * Sets the value of the '{@link petrinet.petri.Place#getTokens <em>Tokens</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tokens</em>' attribute.
	 * @see #getTokens()
	 * @generated
	 */
	void setTokens(int value);

	/**
	 * Returns the value of the '<em><b>Connection</b></em>' reference list.
	 * The list contents are of type {@link petrinet.petri.Transition}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Connection</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Connection</em>' reference list.
	 * @see petrinet.petri.PetriPackage#getPlace_Connection()
	 * @model
	 * @generated
	 */
	EList<Transition> getConnection();

} // Place
