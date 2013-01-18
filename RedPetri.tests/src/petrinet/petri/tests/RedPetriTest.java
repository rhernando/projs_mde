/**
 */
package petrinet.petri.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import petrinet.petri.PetriFactory;
import petrinet.petri.RedPetri;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Red Petri</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class RedPetriTest extends TestCase {

	/**
	 * The fixture for this Red Petri test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RedPetri fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(RedPetriTest.class);
	}

	/**
	 * Constructs a new Red Petri test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RedPetriTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Red Petri test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(RedPetri fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Red Petri test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RedPetri getFixture() {
		return fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(PetriFactory.eINSTANCE.createRedPetri());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#tearDown()
	 * @generated
	 */
	@Override
	protected void tearDown() throws Exception {
		setFixture(null);
	}

} //RedPetriTest
