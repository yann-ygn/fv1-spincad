/**
 */
package com.holycityaudio.spincad.spinCAD.impl;

import com.holycityaudio.spincad.spinCAD.SetOutputPin;
import com.holycityaudio.spincad.spinCAD.SpinCADPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Set Output Pin</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.holycityaudio.spincad.spinCAD.impl.SetOutputPinImpl#getPinName <em>Pin Name</em>}</li>
 *   <li>{@link com.holycityaudio.spincad.spinCAD.impl.SetOutputPinImpl#getVarName <em>Var Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SetOutputPinImpl extends MacroImpl implements SetOutputPin
{
  /**
   * The default value of the '{@link #getPinName() <em>Pin Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPinName()
   * @generated
   * @ordered
   */
  protected static final String PIN_NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getPinName() <em>Pin Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPinName()
   * @generated
   * @ordered
   */
  protected String pinName = PIN_NAME_EDEFAULT;

  /**
   * The default value of the '{@link #getVarName() <em>Var Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getVarName()
   * @generated
   * @ordered
   */
  protected static final String VAR_NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getVarName() <em>Var Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getVarName()
   * @generated
   * @ordered
   */
  protected String varName = VAR_NAME_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected SetOutputPinImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return SpinCADPackage.Literals.SET_OUTPUT_PIN;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getPinName()
  {
    return pinName;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setPinName(String newPinName)
  {
    String oldPinName = pinName;
    pinName = newPinName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SpinCADPackage.SET_OUTPUT_PIN__PIN_NAME, oldPinName, pinName));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getVarName()
  {
    return varName;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setVarName(String newVarName)
  {
    String oldVarName = varName;
    varName = newVarName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SpinCADPackage.SET_OUTPUT_PIN__VAR_NAME, oldVarName, varName));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case SpinCADPackage.SET_OUTPUT_PIN__PIN_NAME:
        return getPinName();
      case SpinCADPackage.SET_OUTPUT_PIN__VAR_NAME:
        return getVarName();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case SpinCADPackage.SET_OUTPUT_PIN__PIN_NAME:
        setPinName((String)newValue);
        return;
      case SpinCADPackage.SET_OUTPUT_PIN__VAR_NAME:
        setVarName((String)newValue);
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
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case SpinCADPackage.SET_OUTPUT_PIN__PIN_NAME:
        setPinName(PIN_NAME_EDEFAULT);
        return;
      case SpinCADPackage.SET_OUTPUT_PIN__VAR_NAME:
        setVarName(VAR_NAME_EDEFAULT);
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
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case SpinCADPackage.SET_OUTPUT_PIN__PIN_NAME:
        return PIN_NAME_EDEFAULT == null ? pinName != null : !PIN_NAME_EDEFAULT.equals(pinName);
      case SpinCADPackage.SET_OUTPUT_PIN__VAR_NAME:
        return VAR_NAME_EDEFAULT == null ? varName != null : !VAR_NAME_EDEFAULT.equals(varName);
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuilder result = new StringBuilder(super.toString());
    result.append(" (pinName: ");
    result.append(pinName);
    result.append(", varName: ");
    result.append(varName);
    result.append(')');
    return result.toString();
  }

} //SetOutputPinImpl
