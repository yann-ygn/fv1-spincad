/**
 */
package com.holycityaudio.spincad.spinCAD.impl;

import com.holycityaudio.spincad.spinCAD.SpinCADPackage;
import com.holycityaudio.spincad.spinCAD.SpinComboBox;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Spin Combo Box</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.holycityaudio.spincad.spinCAD.impl.SpinComboBoxImpl#getOptiona <em>Optiona</em>}</li>
 *   <li>{@link com.holycityaudio.spincad.spinCAD.impl.SpinComboBoxImpl#getOptionb <em>Optionb</em>}</li>
 *   <li>{@link com.holycityaudio.spincad.spinCAD.impl.SpinComboBoxImpl#getOptionc <em>Optionc</em>}</li>
 *   <li>{@link com.holycityaudio.spincad.spinCAD.impl.SpinComboBoxImpl#getOptiond <em>Optiond</em>}</li>
 *   <li>{@link com.holycityaudio.spincad.spinCAD.impl.SpinComboBoxImpl#getOptione <em>Optione</em>}</li>
 *   <li>{@link com.holycityaudio.spincad.spinCAD.impl.SpinComboBoxImpl#getOptionf <em>Optionf</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SpinComboBoxImpl extends ControlImpl implements SpinComboBox
{
  /**
   * The default value of the '{@link #getOptiona() <em>Optiona</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOptiona()
   * @generated
   * @ordered
   */
  protected static final String OPTIONA_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getOptiona() <em>Optiona</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOptiona()
   * @generated
   * @ordered
   */
  protected String optiona = OPTIONA_EDEFAULT;

  /**
   * The default value of the '{@link #getOptionb() <em>Optionb</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOptionb()
   * @generated
   * @ordered
   */
  protected static final String OPTIONB_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getOptionb() <em>Optionb</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOptionb()
   * @generated
   * @ordered
   */
  protected String optionb = OPTIONB_EDEFAULT;

  /**
   * The default value of the '{@link #getOptionc() <em>Optionc</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOptionc()
   * @generated
   * @ordered
   */
  protected static final String OPTIONC_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getOptionc() <em>Optionc</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOptionc()
   * @generated
   * @ordered
   */
  protected String optionc = OPTIONC_EDEFAULT;

  /**
   * The default value of the '{@link #getOptiond() <em>Optiond</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOptiond()
   * @generated
   * @ordered
   */
  protected static final String OPTIOND_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getOptiond() <em>Optiond</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOptiond()
   * @generated
   * @ordered
   */
  protected String optiond = OPTIOND_EDEFAULT;

  /**
   * The default value of the '{@link #getOptione() <em>Optione</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOptione()
   * @generated
   * @ordered
   */
  protected static final String OPTIONE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getOptione() <em>Optione</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOptione()
   * @generated
   * @ordered
   */
  protected String optione = OPTIONE_EDEFAULT;

  /**
   * The default value of the '{@link #getOptionf() <em>Optionf</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOptionf()
   * @generated
   * @ordered
   */
  protected static final String OPTIONF_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getOptionf() <em>Optionf</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOptionf()
   * @generated
   * @ordered
   */
  protected String optionf = OPTIONF_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected SpinComboBoxImpl()
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
    return SpinCADPackage.Literals.SPIN_COMBO_BOX;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getOptiona()
  {
    return optiona;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setOptiona(String newOptiona)
  {
    String oldOptiona = optiona;
    optiona = newOptiona;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SpinCADPackage.SPIN_COMBO_BOX__OPTIONA, oldOptiona, optiona));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getOptionb()
  {
    return optionb;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setOptionb(String newOptionb)
  {
    String oldOptionb = optionb;
    optionb = newOptionb;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SpinCADPackage.SPIN_COMBO_BOX__OPTIONB, oldOptionb, optionb));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getOptionc()
  {
    return optionc;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setOptionc(String newOptionc)
  {
    String oldOptionc = optionc;
    optionc = newOptionc;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SpinCADPackage.SPIN_COMBO_BOX__OPTIONC, oldOptionc, optionc));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getOptiond()
  {
    return optiond;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setOptiond(String newOptiond)
  {
    String oldOptiond = optiond;
    optiond = newOptiond;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SpinCADPackage.SPIN_COMBO_BOX__OPTIOND, oldOptiond, optiond));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getOptione()
  {
    return optione;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setOptione(String newOptione)
  {
    String oldOptione = optione;
    optione = newOptione;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SpinCADPackage.SPIN_COMBO_BOX__OPTIONE, oldOptione, optione));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getOptionf()
  {
    return optionf;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setOptionf(String newOptionf)
  {
    String oldOptionf = optionf;
    optionf = newOptionf;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SpinCADPackage.SPIN_COMBO_BOX__OPTIONF, oldOptionf, optionf));
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
      case SpinCADPackage.SPIN_COMBO_BOX__OPTIONA:
        return getOptiona();
      case SpinCADPackage.SPIN_COMBO_BOX__OPTIONB:
        return getOptionb();
      case SpinCADPackage.SPIN_COMBO_BOX__OPTIONC:
        return getOptionc();
      case SpinCADPackage.SPIN_COMBO_BOX__OPTIOND:
        return getOptiond();
      case SpinCADPackage.SPIN_COMBO_BOX__OPTIONE:
        return getOptione();
      case SpinCADPackage.SPIN_COMBO_BOX__OPTIONF:
        return getOptionf();
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
      case SpinCADPackage.SPIN_COMBO_BOX__OPTIONA:
        setOptiona((String)newValue);
        return;
      case SpinCADPackage.SPIN_COMBO_BOX__OPTIONB:
        setOptionb((String)newValue);
        return;
      case SpinCADPackage.SPIN_COMBO_BOX__OPTIONC:
        setOptionc((String)newValue);
        return;
      case SpinCADPackage.SPIN_COMBO_BOX__OPTIOND:
        setOptiond((String)newValue);
        return;
      case SpinCADPackage.SPIN_COMBO_BOX__OPTIONE:
        setOptione((String)newValue);
        return;
      case SpinCADPackage.SPIN_COMBO_BOX__OPTIONF:
        setOptionf((String)newValue);
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
      case SpinCADPackage.SPIN_COMBO_BOX__OPTIONA:
        setOptiona(OPTIONA_EDEFAULT);
        return;
      case SpinCADPackage.SPIN_COMBO_BOX__OPTIONB:
        setOptionb(OPTIONB_EDEFAULT);
        return;
      case SpinCADPackage.SPIN_COMBO_BOX__OPTIONC:
        setOptionc(OPTIONC_EDEFAULT);
        return;
      case SpinCADPackage.SPIN_COMBO_BOX__OPTIOND:
        setOptiond(OPTIOND_EDEFAULT);
        return;
      case SpinCADPackage.SPIN_COMBO_BOX__OPTIONE:
        setOptione(OPTIONE_EDEFAULT);
        return;
      case SpinCADPackage.SPIN_COMBO_BOX__OPTIONF:
        setOptionf(OPTIONF_EDEFAULT);
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
      case SpinCADPackage.SPIN_COMBO_BOX__OPTIONA:
        return OPTIONA_EDEFAULT == null ? optiona != null : !OPTIONA_EDEFAULT.equals(optiona);
      case SpinCADPackage.SPIN_COMBO_BOX__OPTIONB:
        return OPTIONB_EDEFAULT == null ? optionb != null : !OPTIONB_EDEFAULT.equals(optionb);
      case SpinCADPackage.SPIN_COMBO_BOX__OPTIONC:
        return OPTIONC_EDEFAULT == null ? optionc != null : !OPTIONC_EDEFAULT.equals(optionc);
      case SpinCADPackage.SPIN_COMBO_BOX__OPTIOND:
        return OPTIOND_EDEFAULT == null ? optiond != null : !OPTIOND_EDEFAULT.equals(optiond);
      case SpinCADPackage.SPIN_COMBO_BOX__OPTIONE:
        return OPTIONE_EDEFAULT == null ? optione != null : !OPTIONE_EDEFAULT.equals(optione);
      case SpinCADPackage.SPIN_COMBO_BOX__OPTIONF:
        return OPTIONF_EDEFAULT == null ? optionf != null : !OPTIONF_EDEFAULT.equals(optionf);
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
    result.append(" (optiona: ");
    result.append(optiona);
    result.append(", optionb: ");
    result.append(optionb);
    result.append(", optionc: ");
    result.append(optionc);
    result.append(", optiond: ");
    result.append(optiond);
    result.append(", optione: ");
    result.append(optione);
    result.append(", optionf: ");
    result.append(optionf);
    result.append(')');
    return result.toString();
  }

} //SpinComboBoxImpl
