/**
 */
package org.lunifera.ecview.semantic.uisemantics.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.lunifera.ecview.semantic.uisemantics.UiSemanticsPackage;
import org.lunifera.ecview.semantic.uisemantics.UxAvailableBindings;
import org.lunifera.ecview.semantic.uisemantics.UxAvailableValidatorProperties;
import org.lunifera.ecview.semantic.uisemantics.UxAvailableVisibilityOptions;
import org.lunifera.ecview.semantic.uisemantics.UxElementDefinition;
import org.lunifera.ecview.semantic.uisemantics.UxElementURI;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ux Element Definition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.lunifera.ecview.semantic.uisemantics.impl.UxElementDefinitionImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.lunifera.ecview.semantic.uisemantics.impl.UxElementDefinitionImpl#getUri <em>Uri</em>}</li>
 *   <li>{@link org.lunifera.ecview.semantic.uisemantics.impl.UxElementDefinitionImpl#getBindingContainer <em>Binding Container</em>}</li>
 *   <li>{@link org.lunifera.ecview.semantic.uisemantics.impl.UxElementDefinitionImpl#getVisibilityContainer <em>Visibility Container</em>}</li>
 *   <li>{@link org.lunifera.ecview.semantic.uisemantics.impl.UxElementDefinitionImpl#getValidatorContainer <em>Validator Container</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class UxElementDefinitionImpl extends MinimalEObjectImpl.Container implements UxElementDefinition {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getUri() <em>Uri</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUri()
	 * @generated
	 * @ordered
	 */
	protected UxElementURI uri;

	/**
	 * The cached value of the '{@link #getBindingContainer() <em>Binding Container</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBindingContainer()
	 * @generated
	 * @ordered
	 */
	protected UxAvailableBindings bindingContainer;

	/**
	 * The cached value of the '{@link #getVisibilityContainer() <em>Visibility Container</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVisibilityContainer()
	 * @generated
	 * @ordered
	 */
	protected UxAvailableVisibilityOptions visibilityContainer;

	/**
	 * The cached value of the '{@link #getValidatorContainer() <em>Validator Container</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValidatorContainer()
	 * @generated
	 * @ordered
	 */
	protected UxAvailableValidatorProperties validatorContainer;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UxElementDefinitionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UiSemanticsPackage.Literals.UX_ELEMENT_DEFINITION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UiSemanticsPackage.UX_ELEMENT_DEFINITION__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UxElementURI getUri() {
		return uri;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetUri(UxElementURI newUri, NotificationChain msgs) {
		UxElementURI oldUri = uri;
		uri = newUri;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, UiSemanticsPackage.UX_ELEMENT_DEFINITION__URI, oldUri, newUri);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUri(UxElementURI newUri) {
		if (newUri != uri) {
			NotificationChain msgs = null;
			if (uri != null)
				msgs = ((InternalEObject)uri).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - UiSemanticsPackage.UX_ELEMENT_DEFINITION__URI, null, msgs);
			if (newUri != null)
				msgs = ((InternalEObject)newUri).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - UiSemanticsPackage.UX_ELEMENT_DEFINITION__URI, null, msgs);
			msgs = basicSetUri(newUri, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UiSemanticsPackage.UX_ELEMENT_DEFINITION__URI, newUri, newUri));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UxAvailableBindings getBindingContainer() {
		return bindingContainer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBindingContainer(UxAvailableBindings newBindingContainer, NotificationChain msgs) {
		UxAvailableBindings oldBindingContainer = bindingContainer;
		bindingContainer = newBindingContainer;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, UiSemanticsPackage.UX_ELEMENT_DEFINITION__BINDING_CONTAINER, oldBindingContainer, newBindingContainer);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBindingContainer(UxAvailableBindings newBindingContainer) {
		if (newBindingContainer != bindingContainer) {
			NotificationChain msgs = null;
			if (bindingContainer != null)
				msgs = ((InternalEObject)bindingContainer).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - UiSemanticsPackage.UX_ELEMENT_DEFINITION__BINDING_CONTAINER, null, msgs);
			if (newBindingContainer != null)
				msgs = ((InternalEObject)newBindingContainer).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - UiSemanticsPackage.UX_ELEMENT_DEFINITION__BINDING_CONTAINER, null, msgs);
			msgs = basicSetBindingContainer(newBindingContainer, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UiSemanticsPackage.UX_ELEMENT_DEFINITION__BINDING_CONTAINER, newBindingContainer, newBindingContainer));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UxAvailableVisibilityOptions getVisibilityContainer() {
		return visibilityContainer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetVisibilityContainer(UxAvailableVisibilityOptions newVisibilityContainer, NotificationChain msgs) {
		UxAvailableVisibilityOptions oldVisibilityContainer = visibilityContainer;
		visibilityContainer = newVisibilityContainer;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, UiSemanticsPackage.UX_ELEMENT_DEFINITION__VISIBILITY_CONTAINER, oldVisibilityContainer, newVisibilityContainer);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVisibilityContainer(UxAvailableVisibilityOptions newVisibilityContainer) {
		if (newVisibilityContainer != visibilityContainer) {
			NotificationChain msgs = null;
			if (visibilityContainer != null)
				msgs = ((InternalEObject)visibilityContainer).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - UiSemanticsPackage.UX_ELEMENT_DEFINITION__VISIBILITY_CONTAINER, null, msgs);
			if (newVisibilityContainer != null)
				msgs = ((InternalEObject)newVisibilityContainer).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - UiSemanticsPackage.UX_ELEMENT_DEFINITION__VISIBILITY_CONTAINER, null, msgs);
			msgs = basicSetVisibilityContainer(newVisibilityContainer, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UiSemanticsPackage.UX_ELEMENT_DEFINITION__VISIBILITY_CONTAINER, newVisibilityContainer, newVisibilityContainer));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UxAvailableValidatorProperties getValidatorContainer() {
		return validatorContainer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetValidatorContainer(UxAvailableValidatorProperties newValidatorContainer, NotificationChain msgs) {
		UxAvailableValidatorProperties oldValidatorContainer = validatorContainer;
		validatorContainer = newValidatorContainer;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, UiSemanticsPackage.UX_ELEMENT_DEFINITION__VALIDATOR_CONTAINER, oldValidatorContainer, newValidatorContainer);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValidatorContainer(UxAvailableValidatorProperties newValidatorContainer) {
		if (newValidatorContainer != validatorContainer) {
			NotificationChain msgs = null;
			if (validatorContainer != null)
				msgs = ((InternalEObject)validatorContainer).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - UiSemanticsPackage.UX_ELEMENT_DEFINITION__VALIDATOR_CONTAINER, null, msgs);
			if (newValidatorContainer != null)
				msgs = ((InternalEObject)newValidatorContainer).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - UiSemanticsPackage.UX_ELEMENT_DEFINITION__VALIDATOR_CONTAINER, null, msgs);
			msgs = basicSetValidatorContainer(newValidatorContainer, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UiSemanticsPackage.UX_ELEMENT_DEFINITION__VALIDATOR_CONTAINER, newValidatorContainer, newValidatorContainer));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case UiSemanticsPackage.UX_ELEMENT_DEFINITION__URI:
				return basicSetUri(null, msgs);
			case UiSemanticsPackage.UX_ELEMENT_DEFINITION__BINDING_CONTAINER:
				return basicSetBindingContainer(null, msgs);
			case UiSemanticsPackage.UX_ELEMENT_DEFINITION__VISIBILITY_CONTAINER:
				return basicSetVisibilityContainer(null, msgs);
			case UiSemanticsPackage.UX_ELEMENT_DEFINITION__VALIDATOR_CONTAINER:
				return basicSetValidatorContainer(null, msgs);
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
			case UiSemanticsPackage.UX_ELEMENT_DEFINITION__NAME:
				return getName();
			case UiSemanticsPackage.UX_ELEMENT_DEFINITION__URI:
				return getUri();
			case UiSemanticsPackage.UX_ELEMENT_DEFINITION__BINDING_CONTAINER:
				return getBindingContainer();
			case UiSemanticsPackage.UX_ELEMENT_DEFINITION__VISIBILITY_CONTAINER:
				return getVisibilityContainer();
			case UiSemanticsPackage.UX_ELEMENT_DEFINITION__VALIDATOR_CONTAINER:
				return getValidatorContainer();
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
			case UiSemanticsPackage.UX_ELEMENT_DEFINITION__NAME:
				setName((String)newValue);
				return;
			case UiSemanticsPackage.UX_ELEMENT_DEFINITION__URI:
				setUri((UxElementURI)newValue);
				return;
			case UiSemanticsPackage.UX_ELEMENT_DEFINITION__BINDING_CONTAINER:
				setBindingContainer((UxAvailableBindings)newValue);
				return;
			case UiSemanticsPackage.UX_ELEMENT_DEFINITION__VISIBILITY_CONTAINER:
				setVisibilityContainer((UxAvailableVisibilityOptions)newValue);
				return;
			case UiSemanticsPackage.UX_ELEMENT_DEFINITION__VALIDATOR_CONTAINER:
				setValidatorContainer((UxAvailableValidatorProperties)newValue);
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
			case UiSemanticsPackage.UX_ELEMENT_DEFINITION__NAME:
				setName(NAME_EDEFAULT);
				return;
			case UiSemanticsPackage.UX_ELEMENT_DEFINITION__URI:
				setUri((UxElementURI)null);
				return;
			case UiSemanticsPackage.UX_ELEMENT_DEFINITION__BINDING_CONTAINER:
				setBindingContainer((UxAvailableBindings)null);
				return;
			case UiSemanticsPackage.UX_ELEMENT_DEFINITION__VISIBILITY_CONTAINER:
				setVisibilityContainer((UxAvailableVisibilityOptions)null);
				return;
			case UiSemanticsPackage.UX_ELEMENT_DEFINITION__VALIDATOR_CONTAINER:
				setValidatorContainer((UxAvailableValidatorProperties)null);
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
			case UiSemanticsPackage.UX_ELEMENT_DEFINITION__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case UiSemanticsPackage.UX_ELEMENT_DEFINITION__URI:
				return uri != null;
			case UiSemanticsPackage.UX_ELEMENT_DEFINITION__BINDING_CONTAINER:
				return bindingContainer != null;
			case UiSemanticsPackage.UX_ELEMENT_DEFINITION__VISIBILITY_CONTAINER:
				return visibilityContainer != null;
			case UiSemanticsPackage.UX_ELEMENT_DEFINITION__VALIDATOR_CONTAINER:
				return validatorContainer != null;
		}
		return super.eIsSet(featureID);
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
		result.append(" (name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //UxElementDefinitionImpl
