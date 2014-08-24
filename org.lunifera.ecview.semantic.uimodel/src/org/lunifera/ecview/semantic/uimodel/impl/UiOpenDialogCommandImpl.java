/**
 */
package org.lunifera.ecview.semantic.uimodel.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.lunifera.ecview.semantic.uimodel.UiDialog;
import org.lunifera.ecview.semantic.uimodel.UiModelPackage;
import org.lunifera.ecview.semantic.uimodel.UiOpenDialogCommand;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ui Open Dialog Command</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.lunifera.ecview.semantic.uimodel.impl.UiOpenDialogCommandImpl#getId <em>Id</em>}</li>
 *   <li>{@link org.lunifera.ecview.semantic.uimodel.impl.UiOpenDialogCommandImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.lunifera.ecview.semantic.uimodel.impl.UiOpenDialogCommandImpl#getDialog <em>Dialog</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class UiOpenDialogCommandImpl extends MinimalEObjectImpl.Container implements UiOpenDialogCommand {
	/**
	 * The default value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected static final String ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected String id = ID_EDEFAULT;

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
	 * The cached value of the '{@link #getDialog() <em>Dialog</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDialog()
	 * @generated
	 * @ordered
	 */
	protected UiDialog dialog;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UiOpenDialogCommandImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UiModelPackage.Literals.UI_OPEN_DIALOG_COMMAND;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getId() {
		return id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setId(String newId) {
		String oldId = id;
		id = newId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UiModelPackage.UI_OPEN_DIALOG_COMMAND__ID, oldId, id));
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
			eNotify(new ENotificationImpl(this, Notification.SET, UiModelPackage.UI_OPEN_DIALOG_COMMAND__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UiDialog getDialog() {
		if (dialog != null && dialog.eIsProxy()) {
			InternalEObject oldDialog = (InternalEObject)dialog;
			dialog = (UiDialog)eResolveProxy(oldDialog);
			if (dialog != oldDialog) {
				InternalEObject newDialog = (InternalEObject)dialog;
				NotificationChain msgs = oldDialog.eInverseRemove(this, EOPPOSITE_FEATURE_BASE - UiModelPackage.UI_OPEN_DIALOG_COMMAND__DIALOG, null, null);
				if (newDialog.eInternalContainer() == null) {
					msgs = newDialog.eInverseAdd(this, EOPPOSITE_FEATURE_BASE - UiModelPackage.UI_OPEN_DIALOG_COMMAND__DIALOG, null, msgs);
				}
				if (msgs != null) msgs.dispatch();
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, UiModelPackage.UI_OPEN_DIALOG_COMMAND__DIALOG, oldDialog, dialog));
			}
		}
		return dialog;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UiDialog basicGetDialog() {
		return dialog;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDialog(UiDialog newDialog, NotificationChain msgs) {
		UiDialog oldDialog = dialog;
		dialog = newDialog;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, UiModelPackage.UI_OPEN_DIALOG_COMMAND__DIALOG, oldDialog, newDialog);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDialog(UiDialog newDialog) {
		if (newDialog != dialog) {
			NotificationChain msgs = null;
			if (dialog != null)
				msgs = ((InternalEObject)dialog).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - UiModelPackage.UI_OPEN_DIALOG_COMMAND__DIALOG, null, msgs);
			if (newDialog != null)
				msgs = ((InternalEObject)newDialog).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - UiModelPackage.UI_OPEN_DIALOG_COMMAND__DIALOG, null, msgs);
			msgs = basicSetDialog(newDialog, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UiModelPackage.UI_OPEN_DIALOG_COMMAND__DIALOG, newDialog, newDialog));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case UiModelPackage.UI_OPEN_DIALOG_COMMAND__DIALOG:
				return basicSetDialog(null, msgs);
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
			case UiModelPackage.UI_OPEN_DIALOG_COMMAND__ID:
				return getId();
			case UiModelPackage.UI_OPEN_DIALOG_COMMAND__NAME:
				return getName();
			case UiModelPackage.UI_OPEN_DIALOG_COMMAND__DIALOG:
				if (resolve) return getDialog();
				return basicGetDialog();
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
			case UiModelPackage.UI_OPEN_DIALOG_COMMAND__ID:
				setId((String)newValue);
				return;
			case UiModelPackage.UI_OPEN_DIALOG_COMMAND__NAME:
				setName((String)newValue);
				return;
			case UiModelPackage.UI_OPEN_DIALOG_COMMAND__DIALOG:
				setDialog((UiDialog)newValue);
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
			case UiModelPackage.UI_OPEN_DIALOG_COMMAND__ID:
				setId(ID_EDEFAULT);
				return;
			case UiModelPackage.UI_OPEN_DIALOG_COMMAND__NAME:
				setName(NAME_EDEFAULT);
				return;
			case UiModelPackage.UI_OPEN_DIALOG_COMMAND__DIALOG:
				setDialog((UiDialog)null);
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
			case UiModelPackage.UI_OPEN_DIALOG_COMMAND__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case UiModelPackage.UI_OPEN_DIALOG_COMMAND__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case UiModelPackage.UI_OPEN_DIALOG_COMMAND__DIALOG:
				return dialog != null;
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
		result.append(" (id: ");
		result.append(id);
		result.append(", name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //UiOpenDialogCommandImpl
