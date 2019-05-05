/**
 */
package com.holycityaudio.spincad.spinCAD.impl;

import com.holycityaudio.spincad.spinCAD.GetSamplesFromRatio;
import com.holycityaudio.spincad.spinCAD.SpinCADPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Get Samples From Ratio</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.holycityaudio.spincad.spinCAD.impl.GetSamplesFromRatioImpl#getVariable <em>Variable</em>}</li>
 *   <li>{@link com.holycityaudio.spincad.spinCAD.impl.GetSamplesFromRatioImpl#getRatio <em>Ratio</em>}</li>
 *   <li>{@link com.holycityaudio.spincad.spinCAD.impl.GetSamplesFromRatioImpl#getLength <em>Length</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GetSamplesFromRatioImpl extends MacroImpl implements GetSamplesFromRatio
{
  /**
   * The default value of the '{@link #getVariable() <em>Variable</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getVariable()
   * @generated
   * @ordered
   */
  protected static final String VARIABLE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getVariable() <em>Variable</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getVariable()
   * @generated
   * @ordered
   */
  protected String variable = VARIABLE_EDEFAULT;

  /**
   * The default value of the '{@link #getRatio() <em>Ratio</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRatio()
   * @generated
   * @ordered
   */
  protected static final String RATIO_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getRatio() <em>Ratio</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRatio()
   * @generated
   * @ordered
   */
  protected String ratio = RATIO_EDEFAULT;

  /**
   * The default value of the '{@link #getLength() <em>Length</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLength()
   * @generated
   * @ordered
   */
  protected static final String LENGTH_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getLength() <em>Length</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLength()
   * @generated
   * @ordered
   */
  protected String length = LENGTH_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected GetSamplesFromRatioImpl()
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
    return SpinCADPackage.Literals.GET_SAMPLES_FROM_RATIO;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getVariable()
  {
    return variable;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setVariable(String newVariable)
  {
    String oldVariable = variable;
    variable = newVariable;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SpinCADPackage.GET_SAMPLES_FROM_RATIO__VARIABLE, oldVariable, variable));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getRatio()
  {
    return ratio;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setRatio(String newRatio)
  {
    String oldRatio = ratio;
    ratio = newRatio;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SpinCADPackage.GET_SAMPLES_FROM_RATIO__RATIO, oldRatio, ratio));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getLength()
  {
    return length;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setLength(String newLength)
  {
    String oldLength = length;
    length = newLength;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SpinCADPackage.GET_SAMPLES_FROM_RATIO__LENGTH, oldLength, length));
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
      case SpinCADPackage.GET_SAMPLES_FROM_RATIO__VARIABLE:
        return getVariable();
      case SpinCADPackage.GET_SAMPLES_FROM_RATIO__RATIO:
        return getRatio();
      case SpinCADPackage.GET_SAMPLES_FROM_RATIO__LENGTH:
        return getLength();
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
      case SpinCADPackage.GET_SAMPLES_FROM_RATIO__VARIABLE:
        setVariable((String)newValue);
        return;
      case SpinCADPackage.GET_SAMPLES_FROM_RATIO__RATIO:
        setRatio((String)newValue);
        return;
      case SpinCADPackage.GET_SAMPLES_FROM_RATIO__LENGTH:
        setLength((String)newValue);
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
      case SpinCADPackage.GET_SAMPLES_FROM_RATIO__VARIABLE:
        setVariable(VARIABLE_EDEFAULT);
        return;
      case SpinCADPackage.GET_SAMPLES_FROM_RATIO__RATIO:
        setRatio(RATIO_EDEFAULT);
        return;
      case SpinCADPackage.GET_SAMPLES_FROM_RATIO__LENGTH:
        setLength(LENGTH_EDEFAULT);
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
      case SpinCADPackage.GET_SAMPLES_FROM_RATIO__VARIABLE:
        return VARIABLE_EDEFAULT == null ? variable != null : !VARIABLE_EDEFAULT.equals(variable);
      case SpinCADPackage.GET_SAMPLES_FROM_RATIO__RATIO:
        return RATIO_EDEFAULT == null ? ratio != null : !RATIO_EDEFAULT.equals(ratio);
      case SpinCADPackage.GET_SAMPLES_FROM_RATIO__LENGTH:
        return LENGTH_EDEFAULT == null ? length != null : !LENGTH_EDEFAULT.equals(length);
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
    result.append(" (variable: ");
    result.append(variable);
    result.append(", ratio: ");
    result.append(ratio);
    result.append(", length: ");
    result.append(length);
    result.append(')');
    return result.toString();
  }

} //GetSamplesFromRatioImpl
