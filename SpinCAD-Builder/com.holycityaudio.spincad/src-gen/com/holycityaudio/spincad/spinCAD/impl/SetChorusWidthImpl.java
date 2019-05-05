/**
 */
package com.holycityaudio.spincad.spinCAD.impl;

import com.holycityaudio.spincad.spinCAD.SetChorusWidth;
import com.holycityaudio.spincad.spinCAD.SpinCADPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Set Chorus Width</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.holycityaudio.spincad.spinCAD.impl.SetChorusWidthImpl#getVarName <em>Var Name</em>}</li>
 *   <li>{@link com.holycityaudio.spincad.spinCAD.impl.SetChorusWidthImpl#getLength <em>Length</em>}</li>
 *   <li>{@link com.holycityaudio.spincad.spinCAD.impl.SetChorusWidthImpl#getScale <em>Scale</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SetChorusWidthImpl extends MacroImpl implements SetChorusWidth
{
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
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected SetChorusWidthImpl()
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
    return SpinCADPackage.Literals.SET_CHORUS_WIDTH;
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
      eNotify(new ENotificationImpl(this, Notification.SET, SpinCADPackage.SET_CHORUS_WIDTH__VAR_NAME, oldVarName, varName));
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
      eNotify(new ENotificationImpl(this, Notification.SET, SpinCADPackage.SET_CHORUS_WIDTH__LENGTH, oldLength, length));
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
      eNotify(new ENotificationImpl(this, Notification.SET, SpinCADPackage.SET_CHORUS_WIDTH__SCALE, oldScale, scale));
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
      case SpinCADPackage.SET_CHORUS_WIDTH__VAR_NAME:
        return getVarName();
      case SpinCADPackage.SET_CHORUS_WIDTH__LENGTH:
        return getLength();
      case SpinCADPackage.SET_CHORUS_WIDTH__SCALE:
        return getScale();
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
      case SpinCADPackage.SET_CHORUS_WIDTH__VAR_NAME:
        setVarName((String)newValue);
        return;
      case SpinCADPackage.SET_CHORUS_WIDTH__LENGTH:
        setLength((String)newValue);
        return;
      case SpinCADPackage.SET_CHORUS_WIDTH__SCALE:
        setScale((String)newValue);
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
      case SpinCADPackage.SET_CHORUS_WIDTH__VAR_NAME:
        setVarName(VAR_NAME_EDEFAULT);
        return;
      case SpinCADPackage.SET_CHORUS_WIDTH__LENGTH:
        setLength(LENGTH_EDEFAULT);
        return;
      case SpinCADPackage.SET_CHORUS_WIDTH__SCALE:
        setScale(SCALE_EDEFAULT);
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
      case SpinCADPackage.SET_CHORUS_WIDTH__VAR_NAME:
        return VAR_NAME_EDEFAULT == null ? varName != null : !VAR_NAME_EDEFAULT.equals(varName);
      case SpinCADPackage.SET_CHORUS_WIDTH__LENGTH:
        return LENGTH_EDEFAULT == null ? length != null : !LENGTH_EDEFAULT.equals(length);
      case SpinCADPackage.SET_CHORUS_WIDTH__SCALE:
        return SCALE_EDEFAULT == null ? scale != null : !SCALE_EDEFAULT.equals(scale);
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
    result.append(" (varName: ");
    result.append(varName);
    result.append(", length: ");
    result.append(length);
    result.append(", scale: ");
    result.append(scale);
    result.append(')');
    return result.toString();
  }

} //SetChorusWidthImpl
