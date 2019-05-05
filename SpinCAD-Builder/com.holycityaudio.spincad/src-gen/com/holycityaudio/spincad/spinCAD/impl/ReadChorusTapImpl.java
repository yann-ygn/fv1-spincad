/**
 */
package com.holycityaudio.spincad.spinCAD.impl;

import com.holycityaudio.spincad.spinCAD.ReadChorusTap;
import com.holycityaudio.spincad.spinCAD.SpinCADPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Read Chorus Tap</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.holycityaudio.spincad.spinCAD.impl.ReadChorusTapImpl#getLfo <em>Lfo</em>}</li>
 *   <li>{@link com.holycityaudio.spincad.spinCAD.impl.ReadChorusTapImpl#getPhase <em>Phase</em>}</li>
 *   <li>{@link com.holycityaudio.spincad.spinCAD.impl.ReadChorusTapImpl#getRatio <em>Ratio</em>}</li>
 *   <li>{@link com.holycityaudio.spincad.spinCAD.impl.ReadChorusTapImpl#getLength <em>Length</em>}</li>
 *   <li>{@link com.holycityaudio.spincad.spinCAD.impl.ReadChorusTapImpl#getOffset <em>Offset</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ReadChorusTapImpl extends MacroImpl implements ReadChorusTap
{
  /**
   * The default value of the '{@link #getLfo() <em>Lfo</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLfo()
   * @generated
   * @ordered
   */
  protected static final String LFO_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getLfo() <em>Lfo</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLfo()
   * @generated
   * @ordered
   */
  protected String lfo = LFO_EDEFAULT;

  /**
   * The default value of the '{@link #getPhase() <em>Phase</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPhase()
   * @generated
   * @ordered
   */
  protected static final int PHASE_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getPhase() <em>Phase</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPhase()
   * @generated
   * @ordered
   */
  protected int phase = PHASE_EDEFAULT;

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
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ReadChorusTapImpl()
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
    return SpinCADPackage.Literals.READ_CHORUS_TAP;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getLfo()
  {
    return lfo;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setLfo(String newLfo)
  {
    String oldLfo = lfo;
    lfo = newLfo;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SpinCADPackage.READ_CHORUS_TAP__LFO, oldLfo, lfo));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public int getPhase()
  {
    return phase;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setPhase(int newPhase)
  {
    int oldPhase = phase;
    phase = newPhase;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SpinCADPackage.READ_CHORUS_TAP__PHASE, oldPhase, phase));
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
      eNotify(new ENotificationImpl(this, Notification.SET, SpinCADPackage.READ_CHORUS_TAP__RATIO, oldRatio, ratio));
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
      eNotify(new ENotificationImpl(this, Notification.SET, SpinCADPackage.READ_CHORUS_TAP__LENGTH, oldLength, length));
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
      eNotify(new ENotificationImpl(this, Notification.SET, SpinCADPackage.READ_CHORUS_TAP__OFFSET, oldOffset, offset));
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
      case SpinCADPackage.READ_CHORUS_TAP__LFO:
        return getLfo();
      case SpinCADPackage.READ_CHORUS_TAP__PHASE:
        return getPhase();
      case SpinCADPackage.READ_CHORUS_TAP__RATIO:
        return getRatio();
      case SpinCADPackage.READ_CHORUS_TAP__LENGTH:
        return getLength();
      case SpinCADPackage.READ_CHORUS_TAP__OFFSET:
        return getOffset();
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
      case SpinCADPackage.READ_CHORUS_TAP__LFO:
        setLfo((String)newValue);
        return;
      case SpinCADPackage.READ_CHORUS_TAP__PHASE:
        setPhase((Integer)newValue);
        return;
      case SpinCADPackage.READ_CHORUS_TAP__RATIO:
        setRatio((String)newValue);
        return;
      case SpinCADPackage.READ_CHORUS_TAP__LENGTH:
        setLength((String)newValue);
        return;
      case SpinCADPackage.READ_CHORUS_TAP__OFFSET:
        setOffset((String)newValue);
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
      case SpinCADPackage.READ_CHORUS_TAP__LFO:
        setLfo(LFO_EDEFAULT);
        return;
      case SpinCADPackage.READ_CHORUS_TAP__PHASE:
        setPhase(PHASE_EDEFAULT);
        return;
      case SpinCADPackage.READ_CHORUS_TAP__RATIO:
        setRatio(RATIO_EDEFAULT);
        return;
      case SpinCADPackage.READ_CHORUS_TAP__LENGTH:
        setLength(LENGTH_EDEFAULT);
        return;
      case SpinCADPackage.READ_CHORUS_TAP__OFFSET:
        setOffset(OFFSET_EDEFAULT);
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
      case SpinCADPackage.READ_CHORUS_TAP__LFO:
        return LFO_EDEFAULT == null ? lfo != null : !LFO_EDEFAULT.equals(lfo);
      case SpinCADPackage.READ_CHORUS_TAP__PHASE:
        return phase != PHASE_EDEFAULT;
      case SpinCADPackage.READ_CHORUS_TAP__RATIO:
        return RATIO_EDEFAULT == null ? ratio != null : !RATIO_EDEFAULT.equals(ratio);
      case SpinCADPackage.READ_CHORUS_TAP__LENGTH:
        return LENGTH_EDEFAULT == null ? length != null : !LENGTH_EDEFAULT.equals(length);
      case SpinCADPackage.READ_CHORUS_TAP__OFFSET:
        return OFFSET_EDEFAULT == null ? offset != null : !OFFSET_EDEFAULT.equals(offset);
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
    result.append(" (lfo: ");
    result.append(lfo);
    result.append(", phase: ");
    result.append(phase);
    result.append(", ratio: ");
    result.append(ratio);
    result.append(", length: ");
    result.append(length);
    result.append(", offset: ");
    result.append(offset);
    result.append(')');
    return result.toString();
  }

} //ReadChorusTapImpl
