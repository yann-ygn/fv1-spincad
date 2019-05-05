/**
 */
package com.holycityaudio.spincad.spinCAD;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Pin</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.holycityaudio.spincad.spinCAD.Pin#getVarName <em>Var Name</em>}</li>
 *   <li>{@link com.holycityaudio.spincad.spinCAD.Pin#getLabel <em>Label</em>}</li>
 * </ul>
 *
 * @see com.holycityaudio.spincad.spinCAD.SpinCADPackage#getPin()
 * @model
 * @generated
 */
public interface Pin extends EObject
{
  /**
   * Returns the value of the '<em><b>Var Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Var Name</em>' attribute.
   * @see #setVarName(String)
   * @see com.holycityaudio.spincad.spinCAD.SpinCADPackage#getPin_VarName()
   * @model
   * @generated
   */
  String getVarName();

  /**
   * Sets the value of the '{@link com.holycityaudio.spincad.spinCAD.Pin#getVarName <em>Var Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Var Name</em>' attribute.
   * @see #getVarName()
   * @generated
   */
  void setVarName(String value);

  /**
   * Returns the value of the '<em><b>Label</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Label</em>' attribute.
   * @see #setLabel(String)
   * @see com.holycityaudio.spincad.spinCAD.SpinCADPackage#getPin_Label()
   * @model
   * @generated
   */
  String getLabel();

  /**
   * Sets the value of the '{@link com.holycityaudio.spincad.spinCAD.Pin#getLabel <em>Label</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Label</em>' attribute.
   * @see #getLabel()
   * @generated
   */
  void setLabel(String value);

} // Pin
