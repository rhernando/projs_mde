/**
 */
package petrinet.petri.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import petrinet.petri.PetriPackage;
import petrinet.petri.Place;
import petrinet.petri.RedPetri;
import petrinet.petri.Transition;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Red Petri</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link petrinet.petri.impl.RedPetriImpl#getIniPlace <em>Ini Place</em>}</li>
 *   <li>{@link petrinet.petri.impl.RedPetriImpl#getIniTrans <em>Ini Trans</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RedPetriImpl extends EObjectImpl implements RedPetri {
	/**
	 * The cached value of the '{@link #getIniPlace() <em>Ini Place</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIniPlace()
	 * @generated
	 * @ordered
	 */
	protected EList<Place> iniPlace;

	/**
	 * The cached value of the '{@link #getIniTrans() <em>Ini Trans</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIniTrans()
	 * @generated
	 * @ordered
	 */
	protected EList<Transition> iniTrans;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RedPetriImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PetriPackage.Literals.RED_PETRI;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Place> getIniPlace() {
		if (iniPlace == null) {
			iniPlace = new EObjectContainmentEList<Place>(Place.class, this, PetriPackage.RED_PETRI__INI_PLACE);
		}
		return iniPlace;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Transition> getIniTrans() {
		if (iniTrans == null) {
			iniTrans = new EObjectContainmentEList<Transition>(Transition.class, this, PetriPackage.RED_PETRI__INI_TRANS);
		}
		return iniTrans;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case PetriPackage.RED_PETRI__INI_PLACE:
				return ((InternalEList<?>)getIniPlace()).basicRemove(otherEnd, msgs);
			case PetriPackage.RED_PETRI__INI_TRANS:
				return ((InternalEList<?>)getIniTrans()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case PetriPackage.RED_PETRI__INI_PLACE:
				return getIniPlace();
			case PetriPackage.RED_PETRI__INI_TRANS:
				return getIniTrans();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case PetriPackage.RED_PETRI__INI_PLACE:
				getIniPlace().clear();
				getIniPlace().addAll((Collection<? extends Place>)newValue);
				return;
			case PetriPackage.RED_PETRI__INI_TRANS:
				getIniTrans().clear();
				getIniTrans().addAll((Collection<? extends Transition>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case PetriPackage.RED_PETRI__INI_PLACE:
				getIniPlace().clear();
				return;
			case PetriPackage.RED_PETRI__INI_TRANS:
				getIniTrans().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case PetriPackage.RED_PETRI__INI_PLACE:
				return iniPlace != null && !iniPlace.isEmpty();
			case PetriPackage.RED_PETRI__INI_TRANS:
				return iniTrans != null && !iniTrans.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //RedPetriImpl
