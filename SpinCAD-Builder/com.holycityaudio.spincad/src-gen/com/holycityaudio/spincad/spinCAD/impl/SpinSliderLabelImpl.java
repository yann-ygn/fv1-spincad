/**
 */
package com.holycityaudio.spincad.spinCAD.impl;

import com.holycityaudio.spincad.spinCAD.SpinCADPackage;
import com.holycityaudio.spincad.spinCAD.SpinSliderLabel;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Spin Slider Label</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.holycityaudio.spincad.spinCAD.impl.SpinSliderLabelImpl#getControlName <em>Control Name</em>}</li>
 *   <li>{@link com.holycityaudio.spincad.spinCAD.impl.SpinSliderLabelImpl#getMinVal <em>Min Val</em>}</li>
 *   <li>{@link com.holycityaudio.spincad.spinCAD.impl.SpinSliderLabelImpl#getMaxVal <em>Max Val</em>}</li>
 *   <li>{@link com.holycityaudio.spincad.spinCAD.impl.SpinSliderLabelImpl#getInitVal <em>Init Val</em>}</li>
 *   <li>{@link com.holycityaudio.spincad.spinCAD.impl.SpinSliderLabelImpl#getMultiplier <em>Multiplier</em>}</li>
 *   <li>{@link com.holycityaudio.spincad.spinCAD.impl.SpinSliderLabelImpl#getPrecision <em>Precision</em>}</li>
 *   <li>{@link com.holycityaudio.spincad.spinCAD.impl.SpinSliderLabelImpl#getOption <em>Option</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SpinSliderLabelImpl extends ControlImpl implements SpinSliderLabel
{
  /**
   * The default value of the '{@link #getControlName() <em>Control Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getControlName()
   * @generated
   * @ordered
   */
  protected static final String CONTROL_NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getControlName() <em>Control Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getControlName()
   * @generated
   * @ordered
   */
  protected String controlName = CONTROL_NAME_EDEFAULT;

  /**
   * The default value of the '{@link #getMinVal() <em>Min Val</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMinVal()
   * @generated
   * @ordered
   */
  protected static final String MIN_VAL_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getMinVal() <em>Min Val</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMinVal()
   * @generated
   * @ordered
   */
  protected String minVal = MIN_VAL_EDEFAULT;

  /**
   * The default value of the '{@link #getMaxVal() <em>Max Val</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMaxVal()
   * @generated
   * @ordered
   */
  protected static final String MAX_VAL_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getMaxVal() <em>Max Val</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMaxVal()
   * @generated
   * @ordered
   */
  protected String maxVal = MAX_VAL_EDEFAULT;

  /**
   * The default value of the '{@link #getInitVal() <em>Init Val</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getInitVal()
   * @generated
   * @ordered
   */
  protected static final String INIT_VAL_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getInitVal() <em>Init Val</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getInitVal()
   * @generated
   * @ordered
   */
  protected String initVal = INIT_VAL_EDEFAULT;

  /**
   * The default value of the '{@link #getMultiplier() <em>Multiplier</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMultiplier()
   * @generated
   * @ordered
   */
  protected static final String MULTIPLIER_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getMultiplier() <em>Multiplier</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMultiplier()
   * @generated
   * @ordered
   */
  protected String multiplier = MULTIPLIER_EDEFAULT;

  /**
   * The default value of the '{@link #getPrecision() <em>Precision</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPrecision()
   * @generated
   * @ordered
   */
  protected static final int PRECISION_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getPrecision() <em>Precision</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPrecision()
   * @generated
   * @ordered
   */
  protected int precision = PRECISION_EDEFAULT;

  /**
   * The default value of the '{@link #getOption() <em>Option</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOption()
   * @generated
   * @ordered
   */
  protected static final String OPTION_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getOption() <em>Option</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOption()
   * @generated
   * @ordered
   */
  protected String option = OPTION_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected SpinSliderLabelImpl()
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
    return SpinCADPackage.Literals.SPIN_SLIDER_LABEL;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getControlName()
  {
    return controlName;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setControlName(String newControlName)
  {
    String oldControlName = controlName;
    controlName = newControlName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SpinCADPackage.SPIN_SLIDER_LABEL__CONTROL_NAME, oldControlName, controlName));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getMinVal()
  {
    return minVal;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setMinVal(String newMinVal)
  {
    String oldMinVal = minVal;
    minVal = newMinVal;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SpinCADPackage.SPIN_SLIDER_LABEL__MIN_VAL, oldMinVal, minVal));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getMaxVal()
  {
    return maxVal;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setMaxVal(String newMaxVal)
  {
    String oldMaxVal = maxVal;
    maxVal = newMaxVal;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SpinCADPackage.SPIN_SLIDER_LABEL__MAX_VAL, oldMaxVal, maxVal));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getInitVal()
  {
    return initVal;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setInitVal(String newInitVal)
  {
    String oldInitVal = initVal;
    initVal = newInitVal;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SpinCADPackage.SPIN_SLIDER_LABEL__INIT_VAL, oldInitVal, initVal));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getMultiplier()
  {
    return multiplier;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setMultiplier(String newMultiplier)
  {
    String oldMultiplier = multiplier;
    multiplier = newMultiplier;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SpinCADPackage.SPIN_SLIDER_LABEL__MULTIPLIER, oldMultiplier, multiplier));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public int getPrecision()
  {
    return precision;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setPrecision(int newPrecision)
  {
    int oldPrecision = precision;
    precision = newPrecision;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SpinCADPackage.SPIN_SLIDER_LABEL__PRECISION, oldPrecision, precision));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getOption()
  {
    return option;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setOption(String newOption)
  {
    String oldOption = option;
    option = newOption;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SpinCADPackage.SPIN_SLIDER_LABEL__OPTION, oldOption, option));
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
      case SpinCADPackage.SPIN_SLIDER_LABEL__CONTROL_NAME:
        return getControlName();
      case SpinCADPackage.SPIN_SLIDER_LABEL__MIN_VAL:
        return getMinVal();
      case SpinCADPackage.SPIN_SLIDER_LABEL__MAX_VAL:
        return getMaxVal();
      case SpinCADPackage.SPIN_SLIDER_LABEL__INIT_VAL:
        return getInitVal();
      case SpinCADPackage.SPIN_SLIDER_LABEL__MULTIPLIER:
        return getMultiplier();
      case SpinCADPackage.SPIN_SLIDER_LABEL__PRECISION:
        return getPrecision();
      case SpinCADPackage.SPIN_SLIDER_LABEL__OPTION:
        return getOption();
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
      case SpinCADPackage.SPIN_SLIDER_LABEL__CONTROL_NAME:
        setControlName((String)newValue);
        return;
      case SpinCADPackage.SPIN_SLIDER_LABEL__MIN_VAL:
        setMinVal((String)newValue);
        return;
      case SpinCADPackage.SPIN_SLIDER_LABEL__MAX_VAL:
        setMaxVal((String)newValue);
        return;
      case SpinCADPackage.SPIN_SLIDER_LABEL__INIT_VAL:
        setInitVal((String)newValue);
        return;
      case SpinCADPackage.SPIN_SLIDER_LABEL__MULTIPLIER:
        setMultiplier((String)newValue);
        return;
      case SpinCADPackage.SPIN_SLIDER_LABEL__PRECISION:
        setPrecision((Integer)newValue);
        return;
      case SpinCADPackage.SPIN_SLIDER_LABEL__OPTION:
        setOption((String)newValue);
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
      case SpinCADPackage.SPIN_SLIDER_LABEL__CONTROL_NAME:
        setControlName(CONTROL_NAME_EDEFAULT);
        return;
      case SpinCADPackage.SPIN_SLIDER_LABEL__MIN_VAL:
        setMinVal(MIN_VAL_EDEFAULT);
        return;
      case SpinCADPackage.SPIN_SLIDER_LABEL__MAX_VAL:
        setMaxVal(MAX_VAL_EDEFAULT);
        return;
      case SpinCADPackage.SPIN_SLIDER_LABEL__INIT_VAL:
        setInitVal(INIT_VAL_EDEFAULT);
        return;
      case SpinCADPackage.SPIN_SLIDER_LABEL__MULTIPLIER:
        setMultiplier(MULTIPLIER_EDEFAULT);
        return;
      case SpinCADPackage.SPIN_SLIDER_LABEL__PRECISION:
        setPrecision(PRECISION_EDEFAULT);
        return;
      case SpinCADPackage.SPIN_SLIDER_LABEL__OPTION:
        setOption(OPTION_EDEFAULT);
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
      case SpinCADPackage.SPIN_SLIDER_LABEL__CONTROL_NAME:
        return CONTROL_NAME_EDEFAULT == null ? controlName != null : !CONTROL_NAME_EDEFAULT.equals(controlName);
      case SpinCADPackage.SPIN_SLIDER_LABEL__MIN_VAL:
        return MIN_VAL_EDEFAULT == null ? minVal != null : !MIN_VAL_EDEFAULT.equals(minVal);
      case SpinCADPackage.SPIN_SLIDER_LABEL__MAX_VAL:
        return MAX_VAL_EDEFAULT == null ? maxVal != null : !MAX_VAL_EDEFAULT.equals(maxVal);
      case SpinCADPackage.SPIN_SLIDER_LABEL__INIT_VAL:
        return INIT_VAL_EDEFAULT == null ? initVal != null : !INIT_VAL_EDEFAULT.equals(initVal);
      case SpinCADPackage.SPIN_SLIDER_LABEL__MULTIPLIER:
        return MULTIPLIER_EDEFAULT == null ? multiplier != null : !MULTIPLIER_EDEFAULT.equals(multiplier);
      case SpinCADPackage.SPIN_SLIDER_LABEL__PRECISION:
        return precision != PRECISION_EDEFAULT;
      case SpinCADPackage.SPIN_SLIDER_LABEL__OPTION:
        return OPTION_EDEFAULT == null ? option != null : !OPTION_EDEFAULT.equals(option);
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
    result.append(" (controlName: ");
    result.append(controlName);
    result.append(", minVal: ");
    result.append(minVal);
    result.append(", maxVal: ");
    result.append(maxVal);
    result.append(", initVal: ");
    result.append(initVal);
    result.append(", multiplier: ");
    result.append(multiplier);
    result.append(", precision: ");
    result.append(precision);
    result.append(", option: ");
    result.append(option);
    result.append(')');
    return result.toString();
  }

} //SpinSliderLabelImpl
