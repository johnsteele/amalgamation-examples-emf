/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package droid.impl;

import droid.DroidPackage;
import droid.ResourceAccess;
import droid.StringRA;
import droid.StringResource;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>String RA</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link droid.impl.StringRAImpl#getPackage <em>Package</em>}</li>
 *   <li>{@link droid.impl.StringRAImpl#getExternalResource <em>External Resource</em>}</li>
 *   <li>{@link droid.impl.StringRAImpl#getResource <em>Resource</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class StringRAImpl extends StringVAImpl implements StringRA {
	/**
	 * The default value of the '{@link #getPackage() <em>Package</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPackage()
	 * @generated
	 * @ordered
	 */
	protected static final String PACKAGE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPackage() <em>Package</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPackage()
	 * @generated
	 * @ordered
	 */
	protected String package_ = PACKAGE_EDEFAULT;

	/**
	 * The default value of the '{@link #getExternalResource() <em>External Resource</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExternalResource()
	 * @generated
	 * @ordered
	 */
	protected static final String EXTERNAL_RESOURCE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getExternalResource() <em>External Resource</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExternalResource()
	 * @generated
	 * @ordered
	 */
	protected String externalResource = EXTERNAL_RESOURCE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getResource() <em>Resource</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResource()
	 * @generated
	 * @ordered
	 */
	protected StringResource resource;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StringRAImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DroidPackage.Literals.STRING_RA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPackage() {
		return package_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPackage(String newPackage) {
		String oldPackage = package_;
		package_ = newPackage;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DroidPackage.STRING_RA__PACKAGE, oldPackage, package_));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getExternalResource() {
		return externalResource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExternalResource(String newExternalResource) {
		String oldExternalResource = externalResource;
		externalResource = newExternalResource;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DroidPackage.STRING_RA__EXTERNAL_RESOURCE, oldExternalResource, externalResource));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StringResource getResource() {
		if (resource != null && resource.eIsProxy()) {
			InternalEObject oldResource = (InternalEObject)resource;
			resource = (StringResource)eResolveProxy(oldResource);
			if (resource != oldResource) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DroidPackage.STRING_RA__RESOURCE, oldResource, resource));
			}
		}
		return resource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StringResource basicGetResource() {
		return resource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setResource(StringResource newResource) {
		StringResource oldResource = resource;
		resource = newResource;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DroidPackage.STRING_RA__RESOURCE, oldResource, resource));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case DroidPackage.STRING_RA__PACKAGE:
				return getPackage();
			case DroidPackage.STRING_RA__EXTERNAL_RESOURCE:
				return getExternalResource();
			case DroidPackage.STRING_RA__RESOURCE:
				if (resolve) return getResource();
				return basicGetResource();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case DroidPackage.STRING_RA__PACKAGE:
				setPackage((String)newValue);
				return;
			case DroidPackage.STRING_RA__EXTERNAL_RESOURCE:
				setExternalResource((String)newValue);
				return;
			case DroidPackage.STRING_RA__RESOURCE:
				setResource((StringResource)newValue);
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
			case DroidPackage.STRING_RA__PACKAGE:
				setPackage(PACKAGE_EDEFAULT);
				return;
			case DroidPackage.STRING_RA__EXTERNAL_RESOURCE:
				setExternalResource(EXTERNAL_RESOURCE_EDEFAULT);
				return;
			case DroidPackage.STRING_RA__RESOURCE:
				setResource((StringResource)null);
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
			case DroidPackage.STRING_RA__PACKAGE:
				return PACKAGE_EDEFAULT == null ? package_ != null : !PACKAGE_EDEFAULT.equals(package_);
			case DroidPackage.STRING_RA__EXTERNAL_RESOURCE:
				return EXTERNAL_RESOURCE_EDEFAULT == null ? externalResource != null : !EXTERNAL_RESOURCE_EDEFAULT.equals(externalResource);
			case DroidPackage.STRING_RA__RESOURCE:
				return resource != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == ResourceAccess.class) {
			switch (derivedFeatureID) {
				case DroidPackage.STRING_RA__PACKAGE: return DroidPackage.RESOURCE_ACCESS__PACKAGE;
				case DroidPackage.STRING_RA__EXTERNAL_RESOURCE: return DroidPackage.RESOURCE_ACCESS__EXTERNAL_RESOURCE;
				default: return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == ResourceAccess.class) {
			switch (baseFeatureID) {
				case DroidPackage.RESOURCE_ACCESS__PACKAGE: return DroidPackage.STRING_RA__PACKAGE;
				case DroidPackage.RESOURCE_ACCESS__EXTERNAL_RESOURCE: return DroidPackage.STRING_RA__EXTERNAL_RESOURCE;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (package: ");
		result.append(package_);
		result.append(", externalResource: ");
		result.append(externalResource);
		result.append(')');
		return result.toString();
	}

} //StringRAImpl
