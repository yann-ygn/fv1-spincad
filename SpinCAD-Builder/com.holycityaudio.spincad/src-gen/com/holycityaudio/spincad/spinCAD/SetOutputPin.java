/**
 */
package com.holycityaudio.spincad.spinCAD;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Set Output Pin</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.holycityaudio.spincad.spinCAD.SetOutputPin#getPinName <em>Pin Name</em>}</li>
 *   <li>{@link com.holycityaudio.spincad.spinCAD.SetOutputPin#getVarName <em>Var Name</em>}</li>
 * </ul>
 *
 * @see com.holycityaudio.spincad.spinCAD.SpinCADPackage#getSetOutputPin()
 * @model
 * @generated
 */
public interface SetOutputPin extends Macro
{
  /**
   * Returns the value of the '<em><b>Pin Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Pin Name</em>' attribute.
   * @see #setPinName(String)
   * @see com.holycityaudio.spincad.spinCAD.SpinCADPackage#getSetOutputPin_PinName()
   * @model
   * @generated
   */
  String getPinName();

  /**
   * Sets the value of the '{@link com.holycityaudio.spincad.spinCAD.SetOutputPin#getPinName <em>Pin Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Pin Name</em>' attribute.
   * @see #getPinName()
   * @generated
   */
  void setPinName(String value);

  /**
   * Returns the value of the '<em><b>Var Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Var Name</em>' attribute.
   * @see #setVarName(String)
   * @see com.holycityaudio.spincad.spinCAD.SpinCADPackage#getSetOutputPin_VarName()
   * @model
   * @generated
   */
  String getVarName();

  /**
   * Sets the value of the '{@link com.holycityaudio.spincad.spinCAD.SetOutputPin#getVarName <em>Var Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Var Name</em>' attribute.
   * @see #getVarName()
   * @generated
   */
  void setVarName(String value);

} // SetOutputPin
