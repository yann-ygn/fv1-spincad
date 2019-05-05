/**
 */
package com.holycityaudio.spincad.spinCAD.impl;

import com.holycityaudio.spincad.spinCAD.GetInputDefault;
import com.holycityaudio.spincad.spinCAD.SpinCADPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Get Input Default</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.holycityaudio.spincad.spinCAD.impl.GetInputDefaultImpl#getLabel <em>Label</em>}</li>
 *   <li>{@link com.holycityaudio.spincad.spinCAD.impl.GetInputDefaultImpl#getVariable <em>Variable</em>}</li>
 *   <li>{@link com.holycityaudio.spincad.spinCAD.impl.GetInputDefaultImpl#getScale <em>Scale</em>}</li>
 *   <li>{@link com.holycityaudio.spincad.spinCAD.impl.GetInputDefaultImpl#getDefaultVal <em>Default Val</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GetInputDefaultImpl extends MacroImpl implements GetInputDefault
{
  /**
   * The default value of the '{@link #getLabel() <em>Label</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLabel()
   * @generated
   * @ordered
   */
  protected static final String LABEL_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getLabel() <em>Label</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLabel()
   * @generated
   * @ordered
   */
  protected String label = LABEL_EDEFAULT;

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
   * The default value of the '{@link #getScale() <em>Scale</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getScale()
   * @generated
   * @ordered
   */
  protected static final String SCALE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getScale() <em>Scale</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getScale()
   * @generated
   * @ordered
   */
  protected String scale = SCALE_EDEFAULT;

  /**
   * The default value of the '{@link #getDefaultVal() <em>Default Val</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDefaultVal()
   * @generated
   * @ordered
   */
  protected static final String DEFAULT_VAL_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getDefaultVal() <em>Default Val</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDefaultVal()
   * @generated
   * @ordered
   */
  protected String defaultVal = DEFAULT_VAL_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected GetInputDefaultImpl()
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
    return SpinCADPackage.Literals.GET_INPUT_DEFAULT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getLabel()
  {
    return label;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setLabel(String newLabel)
  {
    String oldLabel = label;
    label = newLabel;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SpinCADPackage.GET_INPUT_DEFAULT__LABEL, oldLabel, label));
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
      eNotify(new ENotificationImpl(this, Notification.SET, SpinCADPackage.GET_INPUT_DEFAULT__VARIABLE, oldVariable, variable));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getScale()
  {
    return scale;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setScale(String newScale)
  {
    String oldScale = scale;
    scale = newScale;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SpinCADPackage.GET_INPUT_DEFAULT__SCALE, oldScale, scale));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getDefaultVal()
  {
    return defaultVal;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setDefaultVal(String newDefaultVal)
  {
    String oldDefaultVal = defaultVal;
    defaultVal = newDefaultVal;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SpinCADPackage.GET_INPUT_DEFAULT__DEFAULT_VAL, oldDefaultVal, defaultVal));
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
      case SpinCADPackage.GET_INPUT_DEFAULT__LABEL:
        return getLabel();
      case SpinCADPackage.GET_INPUT_DEFAULT__VARIABLE:
        return getVariable();
      case SpinCADPackage.GET_INPUT_DEFAULT__SCALE:
        return getScale();
      case SpinCADPackage.GET_INPUT_DEFAULT__DEFAULT_VAL:
        return getDefaultVal();
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
      case SpinCADPackage.GET_INPUT_DEFAULT__LABEL:
        setLabel((String)newValue);
        return;
      case SpinCADPackage.GET_INPUT_DEFAULT__VARIABLE:
        setVariable((String)newValue);
        return;
      case SpinCADPackage.GET_INPUT_DEFAULT__SCALE:
        setScale((String)newValue);
        return;
      case SpinCADPackage.GET_INPUT_DEFAULT__DEFAULT_VAL:
        setDefaultVal((String)newValue);
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
      case SpinCADPackage.GET_INPUT_DEFAULT__LABEL:
        setLabel(LABEL_EDEFAULT);
        return;
      case SpinCADPackage.GET_INPUT_DEFAULT__VARIABLE:
        setVariable(VARIABLE_EDEFAULT);
        return;
      case SpinCADPackage.GET_INPUT_DEFAULT__SCALE:
        setScale(SCALE_EDEFAULT);
        return;
      case SpinCADPackage.GET_INPUT_DEFAULT__DEFAULT_VAL:
        setDefaultVal(DEFAULT_VAL_EDEFAULT);
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
      case SpinCADPackage.GET_INPUT_DEFAULT__LABEL:
        return LABEL_EDEFAULT == null ? label != null : !LABEL_EDEFAULT.equals(label);
      case SpinCADPackage.GET_INPUT_DEFAULT__VARIABLE:
        return VARIABLE_EDEFAULT == null ? variable != null : !VARIABLE_EDEFAULT.equals(variable);
      case SpinCADPackage.GET_INPUT_DEFAULT__SCALE:
        return SCALE_EDEFAULT == null ? scale != null : !SCALE_EDEFAULT.equals(scale);
      case SpinCADPackage.GET_INPUT_DEFAULT__DEFAULT_VAL:
        return DEFAULT_VAL_EDEFAULT == null ? defaultVal != null : !DEFAULT_VAL_EDEFAULT.equals(defaultVal);
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
    result.append(" (label: ");
    result.append(label);
    result.append(", variable: ");
    result.append(variable);
    result.append(", scale: ");
    result.append(scale);
    result.append(", defaultVal: ");
    result.append(defaultVal);
    result.append(')');
    return result.toString();
  }

} //GetInputDefaultImpl
