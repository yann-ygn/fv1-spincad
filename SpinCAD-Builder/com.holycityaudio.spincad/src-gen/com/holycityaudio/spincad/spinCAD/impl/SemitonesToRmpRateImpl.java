/**
 */
package com.holycityaudio.spincad.spinCAD.impl;

import com.holycityaudio.spincad.spinCAD.SemitonesToRmpRate;
import com.holycityaudio.spincad.spinCAD.SpinCADPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Semitones To Rmp Rate</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.holycityaudio.spincad.spinCAD.impl.SemitonesToRmpRateImpl#getVariable <em>Variable</em>}</li>
 *   <li>{@link com.holycityaudio.spincad.spinCAD.impl.SemitonesToRmpRateImpl#getSemitones <em>Semitones</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SemitonesToRmpRateImpl extends MacroImpl implements SemitonesToRmpRate
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
   * The default value of the '{@link #getSemitones() <em>Semitones</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSemitones()
   * @generated
   * @ordered
   */
  protected static final String SEMITONES_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getSemitones() <em>Semitones</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSemitones()
   * @generated
   * @ordered
   */
  protected String semitones = SEMITONES_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected SemitonesToRmpRateImpl()
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
    return SpinCADPackage.Literals.SEMITONES_TO_RMP_RATE;
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
      eNotify(new ENotificationImpl(this, Notification.SET, SpinCADPackage.SEMITONES_TO_RMP_RATE__VARIABLE, oldVariable, variable));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getSemitones()
  {
    return semitones;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setSemitones(String newSemitones)
  {
    String oldSemitones = semitones;
    semitones = newSemitones;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SpinCADPackage.SEMITONES_TO_RMP_RATE__SEMITONES, oldSemitones, semitones));
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
      case SpinCADPackage.SEMITONES_TO_RMP_RATE__VARIABLE:
        return getVariable();
      case SpinCADPackage.SEMITONES_TO_RMP_RATE__SEMITONES:
        return getSemitones();
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
      case SpinCADPackage.SEMITONES_TO_RMP_RATE__VARIABLE:
        setVariable((String)newValue);
        return;
      case SpinCADPackage.SEMITONES_TO_RMP_RATE__SEMITONES:
        setSemitones((String)newValue);
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
      case SpinCADPackage.SEMITONES_TO_RMP_RATE__VARIABLE:
        setVariable(VARIABLE_EDEFAULT);
        return;
      case SpinCADPackage.SEMITONES_TO_RMP_RATE__SEMITONES:
        setSemitones(SEMITONES_EDEFAULT);
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
      case SpinCADPackage.SEMITONES_TO_RMP_RATE__VARIABLE:
        return VARIABLE_EDEFAULT == null ? variable != null : !VARIABLE_EDEFAULT.equals(variable);
      case SpinCADPackage.SEMITONES_TO_RMP_RATE__SEMITONES:
        return SEMITONES_EDEFAULT == null ? semitones != null : !SEMITONES_EDEFAULT.equals(semitones);
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
    result.append(", semitones: ");
    result.append(semitones);
    result.append(')');
    return result.toString();
  }

} //SemitonesToRmpRateImpl
