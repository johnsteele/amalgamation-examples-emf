/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package droid;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Application</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link droid.Application#getName <em>Name</em>}</li>
 *   <li>{@link droid.Application#getPackageName <em>Package Name</em>}</li>
 *   <li>{@link droid.Application#getVersionCode <em>Version Code</em>}</li>
 *   <li>{@link droid.Application#getVersionName <em>Version Name</em>}</li>
 *   <li>{@link droid.Application#getSdkVersion <em>Sdk Version</em>}</li>
 *   <li>{@link droid.Application#getScreens <em>Screens</em>}</li>
 *   <li>{@link droid.Application#getLayouts <em>Layouts</em>}</li>
 *   <li>{@link droid.Application#getResources <em>Resources</em>}</li>
 * </ul>
 * </p>
 *
 * @see droid.DroidPackage#getApplication()
 * @model
 * @generated
 */
public interface Application extends EObject {
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
	 * @see droid.DroidPackage#getApplication_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link droid.Application#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Package Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Package Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Package Name</em>' attribute.
	 * @see #setPackageName(String)
	 * @see droid.DroidPackage#getApplication_PackageName()
	 * @model
	 * @generated
	 */
	String getPackageName();

	/**
	 * Sets the value of the '{@link droid.Application#getPackageName <em>Package Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Package Name</em>' attribute.
	 * @see #getPackageName()
	 * @generated
	 */
	void setPackageName(String value);

	/**
	 * Returns the value of the '<em><b>Version Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Version Code</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Version Code</em>' attribute.
	 * @see #setVersionCode(int)
	 * @see droid.DroidPackage#getApplication_VersionCode()
	 * @model
	 * @generated
	 */
	int getVersionCode();

	/**
	 * Sets the value of the '{@link droid.Application#getVersionCode <em>Version Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Version Code</em>' attribute.
	 * @see #getVersionCode()
	 * @generated
	 */
	void setVersionCode(int value);

	/**
	 * Returns the value of the '<em><b>Version Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Version Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Version Name</em>' attribute.
	 * @see #setVersionName(String)
	 * @see droid.DroidPackage#getApplication_VersionName()
	 * @model
	 * @generated
	 */
	String getVersionName();

	/**
	 * Sets the value of the '{@link droid.Application#getVersionName <em>Version Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Version Name</em>' attribute.
	 * @see #getVersionName()
	 * @generated
	 */
	void setVersionName(String value);

	/**
	 * Returns the value of the '<em><b>Sdk Version</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sdk Version</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sdk Version</em>' containment reference.
	 * @see #setSdkVersion(ApplicationUsesSDK)
	 * @see droid.DroidPackage#getApplication_SdkVersion()
	 * @model containment="true"
	 * @generated
	 */
	ApplicationUsesSDK getSdkVersion();

	/**
	 * Sets the value of the '{@link droid.Application#getSdkVersion <em>Sdk Version</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sdk Version</em>' containment reference.
	 * @see #getSdkVersion()
	 * @generated
	 */
	void setSdkVersion(ApplicationUsesSDK value);

	/**
	 * Returns the value of the '<em><b>Screens</b></em>' containment reference list.
	 * The list contents are of type {@link droid.Screen}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Screens</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Screens</em>' containment reference list.
	 * @see droid.DroidPackage#getApplication_Screens()
	 * @model containment="true"
	 * @generated
	 */
	EList<Screen> getScreens();

	/**
	 * Returns the value of the '<em><b>Layouts</b></em>' containment reference list.
	 * The list contents are of type {@link droid.Layout}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Layouts</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Layouts</em>' containment reference list.
	 * @see droid.DroidPackage#getApplication_Layouts()
	 * @model containment="true"
	 * @generated
	 */
	EList<Layout> getLayouts();

	/**
	 * Returns the value of the '<em><b>Resources</b></em>' containment reference list.
	 * The list contents are of type {@link droid.Resource}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Resources</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Resources</em>' containment reference list.
	 * @see droid.DroidPackage#getApplication_Resources()
	 * @model containment="true"
	 * @generated
	 */
	EList<Resource> getResources();

} // Application
