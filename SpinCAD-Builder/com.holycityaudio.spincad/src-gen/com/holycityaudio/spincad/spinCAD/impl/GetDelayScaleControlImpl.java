/**
 */
package com.holycityaudio.spincad.spinCAD.impl;

import com.holycityaudio.spincad.spinCAD.GetDelayScaleControl;
import com.holycityaudio.spincad.spinCAD.SpinCADPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Get Delay Scale Control</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.holycityaudio.spincad.spinCAD.impl.GetDelayScaleControlImpl#getRatio <em>Ratio</em>}</li>
 *   <li>{@link com.holycityaudio.spincad.spinCAD.impl.GetDelayScaleControlImpl#getLength <em>Length</em>}</li>
 *   <li>{@link com.holycityaudio.spincad.spinCAD.impl.GetDelayScaleControlImpl#getOffset <em>Offset</em>}</li>
 *   <li>{@link com.holycityaudio.spincad.spinCAD.impl.GetDelayScaleControlImpl#getControl <em>Control</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GetDelayScaleControlImpl extends MacroImpl implements GetDelayScaleControl
{
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
   * The default value of the '{@link #getOffset() <em>Offset</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOffset()
   * @generated
   * @ordered
   */
  protected static final String OFFSET_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getOffset() <em>Offset</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOffset()
   * @generated
   * @ordered
   */
  protected String offset = OFFSET_EDEFAULT;

  /**
   * The default value of the '{@link #getControl() <em>Control</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getControl()
   * @generated
   * @ordered
   */
  protected static final String CONTROL_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getControl() <em>Control</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getControl()
   * @generated
   * @ordered
   */
  protected String control = CONTROL_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected GetDelayScaleControlImpl()
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
    return SpinCADPackage.Literals.GET_DELAY_SCALE_CONTROL;
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
      eNotify(new ENotificationImpl(this, Notification.SET, SpinCADPackage.GET_DELAY_SCALE_CONTROL__RATIO, oldRatio, ratio));
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
      eNotify(new ENotificationImpl(this, Notification.SET, SpinCADPackage.GET_DELAY_SCALE_CONTROL__LENGTH, oldLength, length));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getOffset()
  {
    return offset;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setOffset(String newOffset)
  {
    String oldOffset = offset;
    offset = newOffset;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SpinCADPackage.GET_DELAY_SCALE_CONTROL__OFFSET, oldOffset, offset));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getControl()
  {
    return control;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setControl(String newControl)
  {
    String oldControl = control;
    control = newControl;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SpinCADPackage.GET_DELAY_SCALE_CONTROL__CONTROL, oldControl, control));
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
      case SpinCADPackage.GET_DELAY_SCALE_CONTROL__RATIO:
        return getRatio();
      case SpinCADPackage.GET_DELAY_SCALE_CONTROL__LENGTH:
        return getLength();
      case SpinCADPackage.GET_DELAY_SCALE_CONTROL__OFFSET:
        return getOffset();
      case SpinCADPackage.GET_DELAY_SCALE_CONTROL__CONTROL:
        return getControl();
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
      case SpinCADPackage.GET_DELAY_SCALE_CONTROL__RATIO:
        setRatio((String)newValue);
        return;
      case SpinCADPackage.GET_DELAY_SCALE_CONTROL__LENGTH:
        setLength((String)newValue);
        return;
      case SpinCADPackage.GET_DELAY_SCALE_CONTROL__OFFSET:
        setOffset((String)newValue);
        return;
      case SpinCADPackage.GET_DELAY_SCALE_CONTROL__CONTROL:
        setControl((String)newValue);
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
      case SpinCADPackage.GET_DELAY_SCALE_CONTROL__RATIO:
        setRatio(RATIO_EDEFAULT);
        return;
      case SpinCADPackage.GET_DELAY_SCALE_CONTROL__LENGTH:
        setLength(LENGTH_EDEFAULT);
        return;
      case SpinCADPackage.GET_DELAY_SCALE_CONTROL__OFFSET:
        setOffset(OFFSET_EDEFAULT);
        return;
      case SpinCADPackage.GET_DELAY_SCALE_CONTROL__CONTROL:
        setControl(CONTROL_EDEFAULT);
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
      case SpinCADPackage.GET_DELAY_SCALE_CONTROL__RATIO:
        return RATIO_EDEFAULT == null ? ratio != null : !RATIO_EDEFAULT.equals(ratio);
      case SpinCADPackage.GET_DELAY_SCALE_CONTROL__LENGTH:
        return LENGTH_EDEFAULT == null ? length != null : !LENGTH_EDEFAULT.equals(length);
      case SpinCADPackage.GET_DELAY_SCALE_CONTROL__OFFSET:
        return OFFSET_EDEFAULT == null ? offset != null : !OFFSET_EDEFAULT.equals(offset);
      case SpinCADPackage.GET_DELAY_SCALE_CONTROL__CONTROL:
        return CONTROL_EDEFAULT == null ? control != null : !CONTROL_EDEFAULT.equals(control);
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
    result.append(" (ratio: ");
    result.append(ratio);
    result.append(", length: ");
    result.append(length);
    result.append(", offset: ");
    result.append(offset);
    result.append(", control: ");
    result.append(control);
    result.append(')');
    return result.toString();
  }

} //GetDelayScaleControlImpl
