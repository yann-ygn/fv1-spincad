/**
 */
package com.holycityaudio.spincad.spinCAD;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see com.holycityaudio.spincad.spinCAD.SpinCADFactory
 * @model kind="package"
 * @generated
 */
public interface SpinCADPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "spinCAD";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.holycityaudio.com/spincad/SpinCAD";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "spinCAD";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  SpinCADPackage eINSTANCE = com.holycityaudio.spincad.spinCAD.impl.SpinCADPackageImpl.init();

  /**
   * The meta object id for the '{@link com.holycityaudio.spincad.spinCAD.impl.ProgramImpl <em>Program</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.holycityaudio.spincad.spinCAD.impl.ProgramImpl
   * @see com.holycityaudio.spincad.spinCAD.impl.SpinCADPackageImpl#getProgram()
   * @generated
   */
  int PROGRAM = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROGRAM__NAME = 0;

  /**
   * The feature id for the '<em><b>Color</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROGRAM__COLOR = 1;

  /**
   * The feature id for the '<em><b>Pins</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROGRAM__PINS = 2;

  /**
   * The feature id for the '<em><b>Elements</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROGRAM__ELEMENTS = 3;

  /**
   * The number of structural features of the '<em>Program</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROGRAM_FEATURE_COUNT = 4;

  /**
   * The meta object id for the '{@link com.holycityaudio.spincad.spinCAD.impl.PinImpl <em>Pin</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.holycityaudio.spincad.spinCAD.impl.PinImpl
   * @see com.holycityaudio.spincad.spinCAD.impl.SpinCADPackageImpl#getPin()
   * @generated
   */
  int PIN = 1;

  /**
   * The feature id for the '<em><b>Var Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PIN__VAR_NAME = 0;

  /**
   * The feature id for the '<em><b>Label</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PIN__LABEL = 1;

  /**
   * The number of structural features of the '<em>Pin</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PIN_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link com.holycityaudio.spincad.spinCAD.impl.InputPinImpl <em>Input Pin</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.holycityaudio.spincad.spinCAD.impl.InputPinImpl
   * @see com.holycityaudio.spincad.spinCAD.impl.SpinCADPackageImpl#getInputPin()
   * @generated
   */
  int INPUT_PIN = 2;

  /**
   * The feature id for the '<em><b>Var Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INPUT_PIN__VAR_NAME = PIN__VAR_NAME;

  /**
   * The feature id for the '<em><b>Label</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INPUT_PIN__LABEL = PIN__LABEL;

  /**
   * The number of structural features of the '<em>Input Pin</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INPUT_PIN_FEATURE_COUNT = PIN_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link com.holycityaudio.spincad.spinCAD.impl.OutputPinImpl <em>Output Pin</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.holycityaudio.spincad.spinCAD.impl.OutputPinImpl
   * @see com.holycityaudio.spincad.spinCAD.impl.SpinCADPackageImpl#getOutputPin()
   * @generated
   */
  int OUTPUT_PIN = 3;

  /**
   * The feature id for the '<em><b>Var Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OUTPUT_PIN__VAR_NAME = PIN__VAR_NAME;

  /**
   * The feature id for the '<em><b>Label</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OUTPUT_PIN__LABEL = PIN__LABEL;

  /**
   * The number of structural features of the '<em>Output Pin</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OUTPUT_PIN_FEATURE_COUNT = PIN_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link com.holycityaudio.spincad.spinCAD.impl.AudioInputImpl <em>Audio Input</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.holycityaudio.spincad.spinCAD.impl.AudioInputImpl
   * @see com.holycityaudio.spincad.spinCAD.impl.SpinCADPackageImpl#getAudioInput()
   * @generated
   */
  int AUDIO_INPUT = 4;

  /**
   * The feature id for the '<em><b>Var Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AUDIO_INPUT__VAR_NAME = INPUT_PIN__VAR_NAME;

  /**
   * The feature id for the '<em><b>Label</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AUDIO_INPUT__LABEL = INPUT_PIN__LABEL;

  /**
   * The number of structural features of the '<em>Audio Input</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AUDIO_INPUT_FEATURE_COUNT = INPUT_PIN_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link com.holycityaudio.spincad.spinCAD.impl.AudioOutputImpl <em>Audio Output</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.holycityaudio.spincad.spinCAD.impl.AudioOutputImpl
   * @see com.holycityaudio.spincad.spinCAD.impl.SpinCADPackageImpl#getAudioOutput()
   * @generated
   */
  int AUDIO_OUTPUT = 5;

  /**
   * The feature id for the '<em><b>Var Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AUDIO_OUTPUT__VAR_NAME = OUTPUT_PIN__VAR_NAME;

  /**
   * The feature id for the '<em><b>Label</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AUDIO_OUTPUT__LABEL = OUTPUT_PIN__LABEL;

  /**
   * The number of structural features of the '<em>Audio Output</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AUDIO_OUTPUT_FEATURE_COUNT = OUTPUT_PIN_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link com.holycityaudio.spincad.spinCAD.impl.ControlInputImpl <em>Control Input</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.holycityaudio.spincad.spinCAD.impl.ControlInputImpl
   * @see com.holycityaudio.spincad.spinCAD.impl.SpinCADPackageImpl#getControlInput()
   * @generated
   */
  int CONTROL_INPUT = 6;

  /**
   * The feature id for the '<em><b>Var Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTROL_INPUT__VAR_NAME = INPUT_PIN__VAR_NAME;

  /**
   * The feature id for the '<em><b>Label</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTROL_INPUT__LABEL = INPUT_PIN__LABEL;

  /**
   * The number of structural features of the '<em>Control Input</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTROL_INPUT_FEATURE_COUNT = INPUT_PIN_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link com.holycityaudio.spincad.spinCAD.impl.ControlOutputImpl <em>Control Output</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.holycityaudio.spincad.spinCAD.impl.ControlOutputImpl
   * @see com.holycityaudio.spincad.spinCAD.impl.SpinCADPackageImpl#getControlOutput()
   * @generated
   */
  int CONTROL_OUTPUT = 7;

  /**
   * The feature id for the '<em><b>Var Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTROL_OUTPUT__VAR_NAME = OUTPUT_PIN__VAR_NAME;

  /**
   * The feature id for the '<em><b>Label</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTROL_OUTPUT__LABEL = OUTPUT_PIN__LABEL;

  /**
   * The number of structural features of the '<em>Control Output</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTROL_OUTPUT_FEATURE_COUNT = OUTPUT_PIN_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link com.holycityaudio.spincad.spinCAD.impl.SpinElementImpl <em>Spin Element</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.holycityaudio.spincad.spinCAD.impl.SpinElementImpl
   * @see com.holycityaudio.spincad.spinCAD.impl.SpinCADPackageImpl#getSpinElement()
   * @generated
   */
  int SPIN_ELEMENT = 8;

  /**
   * The number of structural features of the '<em>Spin Element</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SPIN_ELEMENT_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link com.holycityaudio.spincad.spinCAD.impl.SpinEquateImpl <em>Spin Equate</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.holycityaudio.spincad.spinCAD.impl.SpinEquateImpl
   * @see com.holycityaudio.spincad.spinCAD.impl.SpinCADPackageImpl#getSpinEquate()
   * @generated
   */
  int SPIN_EQUATE = 9;

  /**
   * The feature id for the '<em><b>Ename</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SPIN_EQUATE__ENAME = SPIN_ELEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SPIN_EQUATE__VALUE = SPIN_ELEMENT_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Spin Equate</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SPIN_EQUATE_FEATURE_COUNT = SPIN_ELEMENT_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link com.holycityaudio.spincad.spinCAD.impl.SpinIntImpl <em>Spin Int</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.holycityaudio.spincad.spinCAD.impl.SpinIntImpl
   * @see com.holycityaudio.spincad.spinCAD.impl.SpinCADPackageImpl#getSpinInt()
   * @generated
   */
  int SPIN_INT = 10;

  /**
   * The feature id for the '<em><b>Ename</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SPIN_INT__ENAME = SPIN_ELEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SPIN_INT__VALUE = SPIN_ELEMENT_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Spin Int</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SPIN_INT_FEATURE_COUNT = SPIN_ELEMENT_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link com.holycityaudio.spincad.spinCAD.impl.MemImpl <em>Mem</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.holycityaudio.spincad.spinCAD.impl.MemImpl
   * @see com.holycityaudio.spincad.spinCAD.impl.SpinCADPackageImpl#getMem()
   * @generated
   */
  int MEM = 11;

  /**
   * The feature id for the '<em><b>Buffer</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MEM__BUFFER = SPIN_ELEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Length</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MEM__LENGTH = SPIN_ELEMENT_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Mem</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MEM_FEATURE_COUNT = SPIN_ELEMENT_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link com.holycityaudio.spincad.spinCAD.impl.OffsetImpl <em>Offset</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.holycityaudio.spincad.spinCAD.impl.OffsetImpl
   * @see com.holycityaudio.spincad.spinCAD.impl.SpinCADPackageImpl#getOffset()
   * @generated
   */
  int OFFSET = 12;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OFFSET__NAME = SPIN_ELEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Length</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OFFSET__LENGTH = SPIN_ELEMENT_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Offset</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OFFSET_FEATURE_COUNT = SPIN_ELEMENT_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link com.holycityaudio.spincad.spinCAD.impl.SpinBoolImpl <em>Spin Bool</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.holycityaudio.spincad.spinCAD.impl.SpinBoolImpl
   * @see com.holycityaudio.spincad.spinCAD.impl.SpinCADPackageImpl#getSpinBool()
   * @generated
   */
  int SPIN_BOOL = 13;

  /**
   * The feature id for the '<em><b>Label</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SPIN_BOOL__LABEL = SPIN_ELEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SPIN_BOOL__VALUE = SPIN_ELEMENT_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Spin Bool</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SPIN_BOOL_FEATURE_COUNT = SPIN_ELEMENT_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link com.holycityaudio.spincad.spinCAD.impl.ControlImpl <em>Control</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.holycityaudio.spincad.spinCAD.impl.ControlImpl
   * @see com.holycityaudio.spincad.spinCAD.impl.SpinCADPackageImpl#getControl()
   * @generated
   */
  int CONTROL = 14;

  /**
   * The feature id for the '<em><b>Ename</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTROL__ENAME = SPIN_ELEMENT_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Control</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTROL_FEATURE_COUNT = SPIN_ELEMENT_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link com.holycityaudio.spincad.spinCAD.impl.SpinSliderLabelImpl <em>Spin Slider Label</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.holycityaudio.spincad.spinCAD.impl.SpinSliderLabelImpl
   * @see com.holycityaudio.spincad.spinCAD.impl.SpinCADPackageImpl#getSpinSliderLabel()
   * @generated
   */
  int SPIN_SLIDER_LABEL = 15;

  /**
   * The feature id for the '<em><b>Ename</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SPIN_SLIDER_LABEL__ENAME = CONTROL__ENAME;

  /**
   * The feature id for the '<em><b>Control Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SPIN_SLIDER_LABEL__CONTROL_NAME = CONTROL_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Min Val</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SPIN_SLIDER_LABEL__MIN_VAL = CONTROL_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Max Val</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SPIN_SLIDER_LABEL__MAX_VAL = CONTROL_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Init Val</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SPIN_SLIDER_LABEL__INIT_VAL = CONTROL_FEATURE_COUNT + 3;

  /**
   * The feature id for the '<em><b>Multiplier</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SPIN_SLIDER_LABEL__MULTIPLIER = CONTROL_FEATURE_COUNT + 4;

  /**
   * The feature id for the '<em><b>Precision</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SPIN_SLIDER_LABEL__PRECISION = CONTROL_FEATURE_COUNT + 5;

  /**
   * The feature id for the '<em><b>Option</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SPIN_SLIDER_LABEL__OPTION = CONTROL_FEATURE_COUNT + 6;

  /**
   * The number of structural features of the '<em>Spin Slider Label</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SPIN_SLIDER_LABEL_FEATURE_COUNT = CONTROL_FEATURE_COUNT + 7;

  /**
   * The meta object id for the '{@link com.holycityaudio.spincad.spinCAD.impl.SliderLabelSpinnerImpl <em>Slider Label Spinner</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.holycityaudio.spincad.spinCAD.impl.SliderLabelSpinnerImpl
   * @see com.holycityaudio.spincad.spinCAD.impl.SpinCADPackageImpl#getSliderLabelSpinner()
   * @generated
   */
  int SLIDER_LABEL_SPINNER = 16;

  /**
   * The feature id for the '<em><b>Ename</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SLIDER_LABEL_SPINNER__ENAME = CONTROL__ENAME;

  /**
   * The feature id for the '<em><b>Control Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SLIDER_LABEL_SPINNER__CONTROL_NAME = CONTROL_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Min Val</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SLIDER_LABEL_SPINNER__MIN_VAL = CONTROL_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Max Val</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SLIDER_LABEL_SPINNER__MAX_VAL = CONTROL_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Init Val</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SLIDER_LABEL_SPINNER__INIT_VAL = CONTROL_FEATURE_COUNT + 3;

  /**
   * The feature id for the '<em><b>Multiplier</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SLIDER_LABEL_SPINNER__MULTIPLIER = CONTROL_FEATURE_COUNT + 4;

  /**
   * The feature id for the '<em><b>Precision</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SLIDER_LABEL_SPINNER__PRECISION = CONTROL_FEATURE_COUNT + 5;

  /**
   * The feature id for the '<em><b>Option</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SLIDER_LABEL_SPINNER__OPTION = CONTROL_FEATURE_COUNT + 6;

  /**
   * The number of structural features of the '<em>Slider Label Spinner</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SLIDER_LABEL_SPINNER_FEATURE_COUNT = CONTROL_FEATURE_COUNT + 7;

  /**
   * The meta object id for the '{@link com.holycityaudio.spincad.spinCAD.impl.SliderLabelCheckBoxImpl <em>Slider Label Check Box</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.holycityaudio.spincad.spinCAD.impl.SliderLabelCheckBoxImpl
   * @see com.holycityaudio.spincad.spinCAD.impl.SpinCADPackageImpl#getSliderLabelCheckBox()
   * @generated
   */
  int SLIDER_LABEL_CHECK_BOX = 17;

  /**
   * The feature id for the '<em><b>Ename</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SLIDER_LABEL_CHECK_BOX__ENAME = CONTROL__ENAME;

  /**
   * The feature id for the '<em><b>Control Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SLIDER_LABEL_CHECK_BOX__CONTROL_NAME = CONTROL_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Min Val</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SLIDER_LABEL_CHECK_BOX__MIN_VAL = CONTROL_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Max Val</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SLIDER_LABEL_CHECK_BOX__MAX_VAL = CONTROL_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Init Val</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SLIDER_LABEL_CHECK_BOX__INIT_VAL = CONTROL_FEATURE_COUNT + 3;

  /**
   * The feature id for the '<em><b>Multiplier</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SLIDER_LABEL_CHECK_BOX__MULTIPLIER = CONTROL_FEATURE_COUNT + 4;

  /**
   * The feature id for the '<em><b>Precision</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SLIDER_LABEL_CHECK_BOX__PRECISION = CONTROL_FEATURE_COUNT + 5;

  /**
   * The feature id for the '<em><b>Option</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SLIDER_LABEL_CHECK_BOX__OPTION = CONTROL_FEATURE_COUNT + 6;

  /**
   * The number of structural features of the '<em>Slider Label Check Box</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SLIDER_LABEL_CHECK_BOX_FEATURE_COUNT = CONTROL_FEATURE_COUNT + 7;

  /**
   * The meta object id for the '{@link com.holycityaudio.spincad.spinCAD.impl.SpinCheckBoxImpl <em>Spin Check Box</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.holycityaudio.spincad.spinCAD.impl.SpinCheckBoxImpl
   * @see com.holycityaudio.spincad.spinCAD.impl.SpinCADPackageImpl#getSpinCheckBox()
   * @generated
   */
  int SPIN_CHECK_BOX = 18;

  /**
   * The feature id for the '<em><b>Ename</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SPIN_CHECK_BOX__ENAME = CONTROL__ENAME;

  /**
   * The feature id for the '<em><b>Control Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SPIN_CHECK_BOX__CONTROL_NAME = CONTROL_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Spin Check Box</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SPIN_CHECK_BOX_FEATURE_COUNT = CONTROL_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link com.holycityaudio.spincad.spinCAD.impl.LogFreqSliderLabelImpl <em>Log Freq Slider Label</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.holycityaudio.spincad.spinCAD.impl.LogFreqSliderLabelImpl
   * @see com.holycityaudio.spincad.spinCAD.impl.SpinCADPackageImpl#getLogFreqSliderLabel()
   * @generated
   */
  int LOG_FREQ_SLIDER_LABEL = 19;

  /**
   * The feature id for the '<em><b>Ename</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOG_FREQ_SLIDER_LABEL__ENAME = CONTROL__ENAME;

  /**
   * The feature id for the '<em><b>Control Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOG_FREQ_SLIDER_LABEL__CONTROL_NAME = CONTROL_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Min Val</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOG_FREQ_SLIDER_LABEL__MIN_VAL = CONTROL_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Max Val</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOG_FREQ_SLIDER_LABEL__MAX_VAL = CONTROL_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Init Val</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOG_FREQ_SLIDER_LABEL__INIT_VAL = CONTROL_FEATURE_COUNT + 3;

  /**
   * The feature id for the '<em><b>Multiplier</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOG_FREQ_SLIDER_LABEL__MULTIPLIER = CONTROL_FEATURE_COUNT + 4;

  /**
   * The feature id for the '<em><b>Precision</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOG_FREQ_SLIDER_LABEL__PRECISION = CONTROL_FEATURE_COUNT + 5;

  /**
   * The feature id for the '<em><b>Option</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOG_FREQ_SLIDER_LABEL__OPTION = CONTROL_FEATURE_COUNT + 6;

  /**
   * The number of structural features of the '<em>Log Freq Slider Label</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOG_FREQ_SLIDER_LABEL_FEATURE_COUNT = CONTROL_FEATURE_COUNT + 7;

  /**
   * The meta object id for the '{@link com.holycityaudio.spincad.spinCAD.impl.LogFreq2SliderLabelImpl <em>Log Freq2 Slider Label</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.holycityaudio.spincad.spinCAD.impl.LogFreq2SliderLabelImpl
   * @see com.holycityaudio.spincad.spinCAD.impl.SpinCADPackageImpl#getLogFreq2SliderLabel()
   * @generated
   */
  int LOG_FREQ2_SLIDER_LABEL = 20;

  /**
   * The feature id for the '<em><b>Ename</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOG_FREQ2_SLIDER_LABEL__ENAME = CONTROL__ENAME;

  /**
   * The feature id for the '<em><b>Control Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOG_FREQ2_SLIDER_LABEL__CONTROL_NAME = CONTROL_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Min Val</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOG_FREQ2_SLIDER_LABEL__MIN_VAL = CONTROL_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Max Val</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOG_FREQ2_SLIDER_LABEL__MAX_VAL = CONTROL_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Init Val</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOG_FREQ2_SLIDER_LABEL__INIT_VAL = CONTROL_FEATURE_COUNT + 3;

  /**
   * The feature id for the '<em><b>Multiplier</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOG_FREQ2_SLIDER_LABEL__MULTIPLIER = CONTROL_FEATURE_COUNT + 4;

  /**
   * The feature id for the '<em><b>Precision</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOG_FREQ2_SLIDER_LABEL__PRECISION = CONTROL_FEATURE_COUNT + 5;

  /**
   * The feature id for the '<em><b>Option</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOG_FREQ2_SLIDER_LABEL__OPTION = CONTROL_FEATURE_COUNT + 6;

  /**
   * The number of structural features of the '<em>Log Freq2 Slider Label</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOG_FREQ2_SLIDER_LABEL_FEATURE_COUNT = CONTROL_FEATURE_COUNT + 7;

  /**
   * The meta object id for the '{@link com.holycityaudio.spincad.spinCAD.impl.SpinRadioButtonImpl <em>Spin Radio Button</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.holycityaudio.spincad.spinCAD.impl.SpinRadioButtonImpl
   * @see com.holycityaudio.spincad.spinCAD.impl.SpinCADPackageImpl#getSpinRadioButton()
   * @generated
   */
  int SPIN_RADIO_BUTTON = 21;

  /**
   * The feature id for the '<em><b>Ename</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SPIN_RADIO_BUTTON__ENAME = CONTROL__ENAME;

  /**
   * The feature id for the '<em><b>Control Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SPIN_RADIO_BUTTON__CONTROL_NAME = CONTROL_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Spin Radio Button</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SPIN_RADIO_BUTTON_FEATURE_COUNT = CONTROL_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link com.holycityaudio.spincad.spinCAD.impl.SpinComboBoxImpl <em>Spin Combo Box</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.holycityaudio.spincad.spinCAD.impl.SpinComboBoxImpl
   * @see com.holycityaudio.spincad.spinCAD.impl.SpinCADPackageImpl#getSpinComboBox()
   * @generated
   */
  int SPIN_COMBO_BOX = 22;

  /**
   * The feature id for the '<em><b>Ename</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SPIN_COMBO_BOX__ENAME = CONTROL__ENAME;

  /**
   * The feature id for the '<em><b>Optiona</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SPIN_COMBO_BOX__OPTIONA = CONTROL_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Optionb</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SPIN_COMBO_BOX__OPTIONB = CONTROL_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Optionc</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SPIN_COMBO_BOX__OPTIONC = CONTROL_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Optiond</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SPIN_COMBO_BOX__OPTIOND = CONTROL_FEATURE_COUNT + 3;

  /**
   * The feature id for the '<em><b>Optione</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SPIN_COMBO_BOX__OPTIONE = CONTROL_FEATURE_COUNT + 4;

  /**
   * The feature id for the '<em><b>Optionf</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SPIN_COMBO_BOX__OPTIONF = CONTROL_FEATURE_COUNT + 5;

  /**
   * The number of structural features of the '<em>Spin Combo Box</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SPIN_COMBO_BOX_FEATURE_COUNT = CONTROL_FEATURE_COUNT + 6;

  /**
   * The meta object id for the '{@link com.holycityaudio.spincad.spinCAD.impl.CommentImpl <em>Comment</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.holycityaudio.spincad.spinCAD.impl.CommentImpl
   * @see com.holycityaudio.spincad.spinCAD.impl.SpinCADPackageImpl#getComment()
   * @generated
   */
  int COMMENT = 23;

  /**
   * The feature id for the '<em><b>Remark</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMMENT__REMARK = SPIN_ELEMENT_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Comment</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMMENT_FEATURE_COUNT = SPIN_ELEMENT_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link com.holycityaudio.spincad.spinCAD.impl.LabelImpl <em>Label</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.holycityaudio.spincad.spinCAD.impl.LabelImpl
   * @see com.holycityaudio.spincad.spinCAD.impl.SpinCADPackageImpl#getLabel()
   * @generated
   */
  int LABEL = 24;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LABEL__NAME = SPIN_ELEMENT_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Label</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LABEL_FEATURE_COUNT = SPIN_ELEMENT_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link com.holycityaudio.spincad.spinCAD.impl.MacroImpl <em>Macro</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.holycityaudio.spincad.spinCAD.impl.MacroImpl
   * @see com.holycityaudio.spincad.spinCAD.impl.SpinCADPackageImpl#getMacro()
   * @generated
   */
  int MACRO = 25;

  /**
   * The number of structural features of the '<em>Macro</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MACRO_FEATURE_COUNT = SPIN_ELEMENT_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link com.holycityaudio.spincad.spinCAD.impl.IsPinConnectedImpl <em>Is Pin Connected</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.holycityaudio.spincad.spinCAD.impl.IsPinConnectedImpl
   * @see com.holycityaudio.spincad.spinCAD.impl.SpinCADPackageImpl#getIsPinConnected()
   * @generated
   */
  int IS_PIN_CONNECTED = 26;

  /**
   * The feature id for the '<em><b>Arg1</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IS_PIN_CONNECTED__ARG1 = MACRO_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Is Pin Connected</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IS_PIN_CONNECTED_FEATURE_COUNT = MACRO_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link com.holycityaudio.spincad.spinCAD.impl.IsGreaterThanImpl <em>Is Greater Than</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.holycityaudio.spincad.spinCAD.impl.IsGreaterThanImpl
   * @see com.holycityaudio.spincad.spinCAD.impl.SpinCADPackageImpl#getIsGreaterThan()
   * @generated
   */
  int IS_GREATER_THAN = 27;

  /**
   * The feature id for the '<em><b>Variable</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IS_GREATER_THAN__VARIABLE = MACRO_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IS_GREATER_THAN__VALUE = MACRO_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Is Greater Than</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IS_GREATER_THAN_FEATURE_COUNT = MACRO_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link com.holycityaudio.spincad.spinCAD.impl.IsLessThanImpl <em>Is Less Than</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.holycityaudio.spincad.spinCAD.impl.IsLessThanImpl
   * @see com.holycityaudio.spincad.spinCAD.impl.SpinCADPackageImpl#getIsLessThan()
   * @generated
   */
  int IS_LESS_THAN = 28;

  /**
   * The feature id for the '<em><b>Variable</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IS_LESS_THAN__VARIABLE = MACRO_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IS_LESS_THAN__VALUE = MACRO_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Is Less Than</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IS_LESS_THAN_FEATURE_COUNT = MACRO_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link com.holycityaudio.spincad.spinCAD.impl.IsEqualToImpl <em>Is Equal To</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.holycityaudio.spincad.spinCAD.impl.IsEqualToImpl
   * @see com.holycityaudio.spincad.spinCAD.impl.SpinCADPackageImpl#getIsEqualTo()
   * @generated
   */
  int IS_EQUAL_TO = 29;

  /**
   * The feature id for the '<em><b>Variable</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IS_EQUAL_TO__VARIABLE = MACRO_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IS_EQUAL_TO__VALUE = MACRO_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Is Equal To</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IS_EQUAL_TO_FEATURE_COUNT = MACRO_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link com.holycityaudio.spincad.spinCAD.impl.IsTrueImpl <em>Is True</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.holycityaudio.spincad.spinCAD.impl.IsTrueImpl
   * @see com.holycityaudio.spincad.spinCAD.impl.SpinCADPackageImpl#getIsTrue()
   * @generated
   */
  int IS_TRUE = 30;

  /**
   * The feature id for the '<em><b>Variable</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IS_TRUE__VARIABLE = MACRO_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Is True</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IS_TRUE_FEATURE_COUNT = MACRO_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link com.holycityaudio.spincad.spinCAD.impl.IsElseImpl <em>Is Else</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.holycityaudio.spincad.spinCAD.impl.IsElseImpl
   * @see com.holycityaudio.spincad.spinCAD.impl.SpinCADPackageImpl#getIsElse()
   * @generated
   */
  int IS_ELSE = 31;

  /**
   * The number of structural features of the '<em>Is Else</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IS_ELSE_FEATURE_COUNT = MACRO_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link com.holycityaudio.spincad.spinCAD.impl.IsEndifImpl <em>Is Endif</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.holycityaudio.spincad.spinCAD.impl.IsEndifImpl
   * @see com.holycityaudio.spincad.spinCAD.impl.SpinCADPackageImpl#getIsEndif()
   * @generated
   */
  int IS_ENDIF = 32;

  /**
   * The number of structural features of the '<em>Is Endif</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IS_ENDIF_FEATURE_COUNT = MACRO_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link com.holycityaudio.spincad.spinCAD.impl.IsOrImpl <em>Is Or</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.holycityaudio.spincad.spinCAD.impl.IsOrImpl
   * @see com.holycityaudio.spincad.spinCAD.impl.SpinCADPackageImpl#getIsOr()
   * @generated
   */
  int IS_OR = 33;

  /**
   * The feature id for the '<em><b>Var1</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IS_OR__VAR1 = MACRO_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Var2</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IS_OR__VAR2 = MACRO_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IS_OR__VALUE = MACRO_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Is Or</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IS_OR_FEATURE_COUNT = MACRO_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link com.holycityaudio.spincad.spinCAD.impl.GetInputDefaultImpl <em>Get Input Default</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.holycityaudio.spincad.spinCAD.impl.GetInputDefaultImpl
   * @see com.holycityaudio.spincad.spinCAD.impl.SpinCADPackageImpl#getGetInputDefault()
   * @generated
   */
  int GET_INPUT_DEFAULT = 34;

  /**
   * The feature id for the '<em><b>Label</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GET_INPUT_DEFAULT__LABEL = MACRO_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Variable</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GET_INPUT_DEFAULT__VARIABLE = MACRO_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Scale</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GET_INPUT_DEFAULT__SCALE = MACRO_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Default Val</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GET_INPUT_DEFAULT__DEFAULT_VAL = MACRO_FEATURE_COUNT + 3;

  /**
   * The number of structural features of the '<em>Get Input Default</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GET_INPUT_DEFAULT_FEATURE_COUNT = MACRO_FEATURE_COUNT + 4;

  /**
   * The meta object id for the '{@link com.holycityaudio.spincad.spinCAD.impl.GetDelayScaleControlImpl <em>Get Delay Scale Control</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.holycityaudio.spincad.spinCAD.impl.GetDelayScaleControlImpl
   * @see com.holycityaudio.spincad.spinCAD.impl.SpinCADPackageImpl#getGetDelayScaleControl()
   * @generated
   */
  int GET_DELAY_SCALE_CONTROL = 35;

  /**
   * The feature id for the '<em><b>Ratio</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GET_DELAY_SCALE_CONTROL__RATIO = MACRO_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Length</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GET_DELAY_SCALE_CONTROL__LENGTH = MACRO_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Offset</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GET_DELAY_SCALE_CONTROL__OFFSET = MACRO_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Control</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GET_DELAY_SCALE_CONTROL__CONTROL = MACRO_FEATURE_COUNT + 3;

  /**
   * The number of structural features of the '<em>Get Delay Scale Control</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GET_DELAY_SCALE_CONTROL_FEATURE_COUNT = MACRO_FEATURE_COUNT + 4;

  /**
   * The meta object id for the '{@link com.holycityaudio.spincad.spinCAD.impl.ReadChorusTapImpl <em>Read Chorus Tap</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.holycityaudio.spincad.spinCAD.impl.ReadChorusTapImpl
   * @see com.holycityaudio.spincad.spinCAD.impl.SpinCADPackageImpl#getReadChorusTap()
   * @generated
   */
  int READ_CHORUS_TAP = 36;

  /**
   * The feature id for the '<em><b>Lfo</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int READ_CHORUS_TAP__LFO = MACRO_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Phase</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int READ_CHORUS_TAP__PHASE = MACRO_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Ratio</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int READ_CHORUS_TAP__RATIO = MACRO_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Length</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int READ_CHORUS_TAP__LENGTH = MACRO_FEATURE_COUNT + 3;

  /**
   * The feature id for the '<em><b>Offset</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int READ_CHORUS_TAP__OFFSET = MACRO_FEATURE_COUNT + 4;

  /**
   * The number of structural features of the '<em>Read Chorus Tap</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int READ_CHORUS_TAP_FEATURE_COUNT = MACRO_FEATURE_COUNT + 5;

  /**
   * The meta object id for the '{@link com.holycityaudio.spincad.spinCAD.impl.GetSamplesFromRatioImpl <em>Get Samples From Ratio</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.holycityaudio.spincad.spinCAD.impl.GetSamplesFromRatioImpl
   * @see com.holycityaudio.spincad.spinCAD.impl.SpinCADPackageImpl#getGetSamplesFromRatio()
   * @generated
   */
  int GET_SAMPLES_FROM_RATIO = 37;

  /**
   * The feature id for the '<em><b>Variable</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GET_SAMPLES_FROM_RATIO__VARIABLE = MACRO_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Ratio</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GET_SAMPLES_FROM_RATIO__RATIO = MACRO_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Length</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GET_SAMPLES_FROM_RATIO__LENGTH = MACRO_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Get Samples From Ratio</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GET_SAMPLES_FROM_RATIO_FEATURE_COUNT = MACRO_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link com.holycityaudio.spincad.spinCAD.impl.SemitonesToRmpRateImpl <em>Semitones To Rmp Rate</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.holycityaudio.spincad.spinCAD.impl.SemitonesToRmpRateImpl
   * @see com.holycityaudio.spincad.spinCAD.impl.SpinCADPackageImpl#getSemitonesToRmpRate()
   * @generated
   */
  int SEMITONES_TO_RMP_RATE = 38;

  /**
   * The feature id for the '<em><b>Variable</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SEMITONES_TO_RMP_RATE__VARIABLE = MACRO_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Semitones</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SEMITONES_TO_RMP_RATE__SEMITONES = MACRO_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Semitones To Rmp Rate</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SEMITONES_TO_RMP_RATE_FEATURE_COUNT = MACRO_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link com.holycityaudio.spincad.spinCAD.impl.GetBaseAddressImpl <em>Get Base Address</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.holycityaudio.spincad.spinCAD.impl.GetBaseAddressImpl
   * @see com.holycityaudio.spincad.spinCAD.impl.SpinCADPackageImpl#getGetBaseAddress()
   * @generated
   */
  int GET_BASE_ADDRESS = 39;

  /**
   * The number of structural features of the '<em>Get Base Address</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GET_BASE_ADDRESS_FEATURE_COUNT = MACRO_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link com.holycityaudio.spincad.spinCAD.impl.SetOutputPinImpl <em>Set Output Pin</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.holycityaudio.spincad.spinCAD.impl.SetOutputPinImpl
   * @see com.holycityaudio.spincad.spinCAD.impl.SpinCADPackageImpl#getSetOutputPin()
   * @generated
   */
  int SET_OUTPUT_PIN = 40;

  /**
   * The feature id for the '<em><b>Pin Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SET_OUTPUT_PIN__PIN_NAME = MACRO_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Var Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SET_OUTPUT_PIN__VAR_NAME = MACRO_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Set Output Pin</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SET_OUTPUT_PIN_FEATURE_COUNT = MACRO_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link com.holycityaudio.spincad.spinCAD.impl.MinusDoubleImpl <em>Minus Double</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.holycityaudio.spincad.spinCAD.impl.MinusDoubleImpl
   * @see com.holycityaudio.spincad.spinCAD.impl.SpinCADPackageImpl#getMinusDouble()
   * @generated
   */
  int MINUS_DOUBLE = 41;

  /**
   * The feature id for the '<em><b>Var Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MINUS_DOUBLE__VAR_NAME = MACRO_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>High</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MINUS_DOUBLE__HIGH = MACRO_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Low</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MINUS_DOUBLE__LOW = MACRO_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Minus Double</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MINUS_DOUBLE_FEATURE_COUNT = MACRO_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link com.holycityaudio.spincad.spinCAD.impl.DivideDoubleImpl <em>Divide Double</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.holycityaudio.spincad.spinCAD.impl.DivideDoubleImpl
   * @see com.holycityaudio.spincad.spinCAD.impl.SpinCADPackageImpl#getDivideDouble()
   * @generated
   */
  int DIVIDE_DOUBLE = 42;

  /**
   * The feature id for the '<em><b>Var Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DIVIDE_DOUBLE__VAR_NAME = MACRO_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>High</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DIVIDE_DOUBLE__HIGH = MACRO_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Low</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DIVIDE_DOUBLE__LOW = MACRO_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Divide Double</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DIVIDE_DOUBLE_FEATURE_COUNT = MACRO_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link com.holycityaudio.spincad.spinCAD.impl.EqualsImpl <em>Equals</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.holycityaudio.spincad.spinCAD.impl.EqualsImpl
   * @see com.holycityaudio.spincad.spinCAD.impl.SpinCADPackageImpl#getEquals()
   * @generated
   */
  int EQUALS = 43;

  /**
   * The feature id for the '<em><b>Var Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EQUALS__VAR_NAME = MACRO_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EQUALS__VALUE = MACRO_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Equals</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EQUALS_FEATURE_COUNT = MACRO_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link com.holycityaudio.spincad.spinCAD.impl.EqualsBoolImpl <em>Equals Bool</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.holycityaudio.spincad.spinCAD.impl.EqualsBoolImpl
   * @see com.holycityaudio.spincad.spinCAD.impl.SpinCADPackageImpl#getEqualsBool()
   * @generated
   */
  int EQUALS_BOOL = 44;

  /**
   * The feature id for the '<em><b>Var Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EQUALS_BOOL__VAR_NAME = MACRO_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EQUALS_BOOL__VALUE = MACRO_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Equals Bool</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EQUALS_BOOL_FEATURE_COUNT = MACRO_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link com.holycityaudio.spincad.spinCAD.impl.DivideIntImpl <em>Divide Int</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.holycityaudio.spincad.spinCAD.impl.DivideIntImpl
   * @see com.holycityaudio.spincad.spinCAD.impl.SpinCADPackageImpl#getDivideInt()
   * @generated
   */
  int DIVIDE_INT = 45;

  /**
   * The feature id for the '<em><b>Var Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DIVIDE_INT__VAR_NAME = MACRO_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>High</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DIVIDE_INT__HIGH = MACRO_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Low</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DIVIDE_INT__LOW = MACRO_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Divide Int</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DIVIDE_INT_FEATURE_COUNT = MACRO_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link com.holycityaudio.spincad.spinCAD.impl.MultiplyDoubleImpl <em>Multiply Double</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.holycityaudio.spincad.spinCAD.impl.MultiplyDoubleImpl
   * @see com.holycityaudio.spincad.spinCAD.impl.SpinCADPackageImpl#getMultiplyDouble()
   * @generated
   */
  int MULTIPLY_DOUBLE = 46;

  /**
   * The feature id for the '<em><b>Var Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MULTIPLY_DOUBLE__VAR_NAME = MACRO_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>High</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MULTIPLY_DOUBLE__HIGH = MACRO_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Low</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MULTIPLY_DOUBLE__LOW = MACRO_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Multiply Double</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MULTIPLY_DOUBLE_FEATURE_COUNT = MACRO_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link com.holycityaudio.spincad.spinCAD.impl.SetChorusWidthImpl <em>Set Chorus Width</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.holycityaudio.spincad.spinCAD.impl.SetChorusWidthImpl
   * @see com.holycityaudio.spincad.spinCAD.impl.SpinCADPackageImpl#getSetChorusWidth()
   * @generated
   */
  int SET_CHORUS_WIDTH = 47;

  /**
   * The feature id for the '<em><b>Var Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SET_CHORUS_WIDTH__VAR_NAME = MACRO_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Length</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SET_CHORUS_WIDTH__LENGTH = MACRO_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Scale</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SET_CHORUS_WIDTH__SCALE = MACRO_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Set Chorus Width</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SET_CHORUS_WIDTH_FEATURE_COUNT = MACRO_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link com.holycityaudio.spincad.spinCAD.impl.InstructionImpl <em>Instruction</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.holycityaudio.spincad.spinCAD.impl.InstructionImpl
   * @see com.holycityaudio.spincad.spinCAD.impl.SpinCADPackageImpl#getInstruction()
   * @generated
   */
  int INSTRUCTION = 48;

  /**
   * The number of structural features of the '<em>Instruction</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INSTRUCTION_FEATURE_COUNT = SPIN_ELEMENT_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link com.holycityaudio.spincad.spinCAD.impl.Inst_B6_S1_14Impl <em>Inst B6 S1 14</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.holycityaudio.spincad.spinCAD.impl.Inst_B6_S1_14Impl
   * @see com.holycityaudio.spincad.spinCAD.impl.SpinCADPackageImpl#getInst_B6_S1_14()
   * @generated
   */
  int INST_B6_S1_14 = 49;

  /**
   * The feature id for the '<em><b>Arg1</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INST_B6_S1_14__ARG1 = INSTRUCTION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Arg2</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INST_B6_S1_14__ARG2 = INSTRUCTION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Inst B6 S1 14</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INST_B6_S1_14_FEATURE_COUNT = INSTRUCTION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link com.holycityaudio.spincad.spinCAD.impl.Inst_B15_S1_9Impl <em>Inst B15 S1 9</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.holycityaudio.spincad.spinCAD.impl.Inst_B15_S1_9Impl
   * @see com.holycityaudio.spincad.spinCAD.impl.SpinCADPackageImpl#getInst_B15_S1_9()
   * @generated
   */
  int INST_B15_S1_9 = 50;

  /**
   * The feature id for the '<em><b>Arg1</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INST_B15_S1_9__ARG1 = INSTRUCTION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Arg2</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INST_B15_S1_9__ARG2 = INSTRUCTION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Inst B15 S1 9</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INST_B15_S1_9_FEATURE_COUNT = INSTRUCTION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link com.holycityaudio.spincad.spinCAD.impl.Inst_B6Impl <em>Inst B6</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.holycityaudio.spincad.spinCAD.impl.Inst_B6Impl
   * @see com.holycityaudio.spincad.spinCAD.impl.SpinCADPackageImpl#getInst_B6()
   * @generated
   */
  int INST_B6 = 51;

  /**
   * The feature id for the '<em><b>Arg1</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INST_B6__ARG1 = INSTRUCTION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Inst B6</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INST_B6_FEATURE_COUNT = INSTRUCTION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link com.holycityaudio.spincad.spinCAD.impl.Inst_B24Impl <em>Inst B24</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.holycityaudio.spincad.spinCAD.impl.Inst_B24Impl
   * @see com.holycityaudio.spincad.spinCAD.impl.SpinCADPackageImpl#getInst_B24()
   * @generated
   */
  int INST_B24 = 52;

  /**
   * The feature id for the '<em><b>Arg1</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INST_B24__ARG1 = INSTRUCTION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Inst B24</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INST_B24_FEATURE_COUNT = INSTRUCTION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link com.holycityaudio.spincad.spinCAD.impl.Inst_X0Impl <em>Inst X0</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.holycityaudio.spincad.spinCAD.impl.Inst_X0Impl
   * @see com.holycityaudio.spincad.spinCAD.impl.SpinCADPackageImpl#getInst_X0()
   * @generated
   */
  int INST_X0 = 53;

  /**
   * The number of structural features of the '<em>Inst X0</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INST_X0_FEATURE_COUNT = INSTRUCTION_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link com.holycityaudio.spincad.spinCAD.impl.Inst_S1_14_S1_10Impl <em>Inst S1 14 S1 10</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.holycityaudio.spincad.spinCAD.impl.Inst_S1_14_S1_10Impl
   * @see com.holycityaudio.spincad.spinCAD.impl.SpinCADPackageImpl#getInst_S1_14_S1_10()
   * @generated
   */
  int INST_S1_14_S1_10 = 54;

  /**
   * The feature id for the '<em><b>Arg1</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INST_S1_14_S1_10__ARG1 = INSTRUCTION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Arg2</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INST_S1_14_S1_10__ARG2 = INSTRUCTION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Inst S1 14 S1 10</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INST_S1_14_S1_10_FEATURE_COUNT = INSTRUCTION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link com.holycityaudio.spincad.spinCAD.impl.ReadRegisterImpl <em>Read Register</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.holycityaudio.spincad.spinCAD.impl.ReadRegisterImpl
   * @see com.holycityaudio.spincad.spinCAD.impl.SpinCADPackageImpl#getReadRegister()
   * @generated
   */
  int READ_REGISTER = 55;

  /**
   * The feature id for the '<em><b>Arg1</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int READ_REGISTER__ARG1 = INST_B6_S1_14__ARG1;

  /**
   * The feature id for the '<em><b>Arg2</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int READ_REGISTER__ARG2 = INST_B6_S1_14__ARG2;

  /**
   * The number of structural features of the '<em>Read Register</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int READ_REGISTER_FEATURE_COUNT = INST_B6_S1_14_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link com.holycityaudio.spincad.spinCAD.impl.WriteRegisterLowshelfImpl <em>Write Register Lowshelf</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.holycityaudio.spincad.spinCAD.impl.WriteRegisterLowshelfImpl
   * @see com.holycityaudio.spincad.spinCAD.impl.SpinCADPackageImpl#getWriteRegisterLowshelf()
   * @generated
   */
  int WRITE_REGISTER_LOWSHELF = 56;

  /**
   * The feature id for the '<em><b>Arg1</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WRITE_REGISTER_LOWSHELF__ARG1 = INST_B6_S1_14__ARG1;

  /**
   * The feature id for the '<em><b>Arg2</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WRITE_REGISTER_LOWSHELF__ARG2 = INST_B6_S1_14__ARG2;

  /**
   * The number of structural features of the '<em>Write Register Lowshelf</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WRITE_REGISTER_LOWSHELF_FEATURE_COUNT = INST_B6_S1_14_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link com.holycityaudio.spincad.spinCAD.impl.WriteRegisterHighshelfImpl <em>Write Register Highshelf</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.holycityaudio.spincad.spinCAD.impl.WriteRegisterHighshelfImpl
   * @see com.holycityaudio.spincad.spinCAD.impl.SpinCADPackageImpl#getWriteRegisterHighshelf()
   * @generated
   */
  int WRITE_REGISTER_HIGHSHELF = 57;

  /**
   * The feature id for the '<em><b>Arg1</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WRITE_REGISTER_HIGHSHELF__ARG1 = INST_B6_S1_14__ARG1;

  /**
   * The feature id for the '<em><b>Arg2</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WRITE_REGISTER_HIGHSHELF__ARG2 = INST_B6_S1_14__ARG2;

  /**
   * The number of structural features of the '<em>Write Register Highshelf</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WRITE_REGISTER_HIGHSHELF_FEATURE_COUNT = INST_B6_S1_14_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link com.holycityaudio.spincad.spinCAD.impl.WriteRegisterImpl <em>Write Register</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.holycityaudio.spincad.spinCAD.impl.WriteRegisterImpl
   * @see com.holycityaudio.spincad.spinCAD.impl.SpinCADPackageImpl#getWriteRegister()
   * @generated
   */
  int WRITE_REGISTER = 58;

  /**
   * The feature id for the '<em><b>Arg1</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WRITE_REGISTER__ARG1 = INST_B6_S1_14__ARG1;

  /**
   * The feature id for the '<em><b>Arg2</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WRITE_REGISTER__ARG2 = INST_B6_S1_14__ARG2;

  /**
   * The number of structural features of the '<em>Write Register</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WRITE_REGISTER_FEATURE_COUNT = INST_B6_S1_14_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link com.holycityaudio.spincad.spinCAD.impl.MaxxImpl <em>Maxx</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.holycityaudio.spincad.spinCAD.impl.MaxxImpl
   * @see com.holycityaudio.spincad.spinCAD.impl.SpinCADPackageImpl#getMaxx()
   * @generated
   */
  int MAXX = 59;

  /**
   * The feature id for the '<em><b>Arg1</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MAXX__ARG1 = INST_B6_S1_14__ARG1;

  /**
   * The feature id for the '<em><b>Arg2</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MAXX__ARG2 = INST_B6_S1_14__ARG2;

  /**
   * The number of structural features of the '<em>Maxx</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MAXX_FEATURE_COUNT = INST_B6_S1_14_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link com.holycityaudio.spincad.spinCAD.impl.ReadRegisterFilterImpl <em>Read Register Filter</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.holycityaudio.spincad.spinCAD.impl.ReadRegisterFilterImpl
   * @see com.holycityaudio.spincad.spinCAD.impl.SpinCADPackageImpl#getReadRegisterFilter()
   * @generated
   */
  int READ_REGISTER_FILTER = 60;

  /**
   * The feature id for the '<em><b>Arg1</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int READ_REGISTER_FILTER__ARG1 = INST_B6_S1_14__ARG1;

  /**
   * The feature id for the '<em><b>Arg2</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int READ_REGISTER_FILTER__ARG2 = INST_B6_S1_14__ARG2;

  /**
   * The number of structural features of the '<em>Read Register Filter</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int READ_REGISTER_FILTER_FEATURE_COUNT = INST_B6_S1_14_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link com.holycityaudio.spincad.spinCAD.impl.MulxImpl <em>Mulx</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.holycityaudio.spincad.spinCAD.impl.MulxImpl
   * @see com.holycityaudio.spincad.spinCAD.impl.SpinCADPackageImpl#getMulx()
   * @generated
   */
  int MULX = 61;

  /**
   * The feature id for the '<em><b>Arg1</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MULX__ARG1 = INST_B6__ARG1;

  /**
   * The number of structural features of the '<em>Mulx</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MULX_FEATURE_COUNT = INST_B6_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link com.holycityaudio.spincad.spinCAD.impl.LdaxImpl <em>Ldax</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.holycityaudio.spincad.spinCAD.impl.LdaxImpl
   * @see com.holycityaudio.spincad.spinCAD.impl.SpinCADPackageImpl#getLdax()
   * @generated
   */
  int LDAX = 62;

  /**
   * The feature id for the '<em><b>Arg1</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LDAX__ARG1 = INST_B6__ARG1;

  /**
   * The number of structural features of the '<em>Ldax</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LDAX_FEATURE_COUNT = INST_B6_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link com.holycityaudio.spincad.spinCAD.impl.ExpImpl <em>Exp</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.holycityaudio.spincad.spinCAD.impl.ExpImpl
   * @see com.holycityaudio.spincad.spinCAD.impl.SpinCADPackageImpl#getExp()
   * @generated
   */
  int EXP = 63;

  /**
   * The feature id for the '<em><b>Arg1</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXP__ARG1 = INST_S1_14_S1_10__ARG1;

  /**
   * The feature id for the '<em><b>Arg2</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXP__ARG2 = INST_S1_14_S1_10__ARG2;

  /**
   * The number of structural features of the '<em>Exp</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXP_FEATURE_COUNT = INST_S1_14_S1_10_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link com.holycityaudio.spincad.spinCAD.impl.LogImpl <em>Log</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.holycityaudio.spincad.spinCAD.impl.LogImpl
   * @see com.holycityaudio.spincad.spinCAD.impl.SpinCADPackageImpl#getLog()
   * @generated
   */
  int LOG = 64;

  /**
   * The feature id for the '<em><b>Arg1</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOG__ARG1 = INSTRUCTION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Arg2</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOG__ARG2 = INSTRUCTION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Log</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOG_FEATURE_COUNT = INSTRUCTION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link com.holycityaudio.spincad.spinCAD.impl.ScaleOffsetImpl <em>Scale Offset</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.holycityaudio.spincad.spinCAD.impl.ScaleOffsetImpl
   * @see com.holycityaudio.spincad.spinCAD.impl.SpinCADPackageImpl#getScaleOffset()
   * @generated
   */
  int SCALE_OFFSET = 65;

  /**
   * The feature id for the '<em><b>Arg1</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SCALE_OFFSET__ARG1 = INST_S1_14_S1_10__ARG1;

  /**
   * The feature id for the '<em><b>Arg2</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SCALE_OFFSET__ARG2 = INST_S1_14_S1_10__ARG2;

  /**
   * The number of structural features of the '<em>Scale Offset</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SCALE_OFFSET_FEATURE_COUNT = INST_S1_14_S1_10_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link com.holycityaudio.spincad.spinCAD.impl.WriteDelayImpl <em>Write Delay</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.holycityaudio.spincad.spinCAD.impl.WriteDelayImpl
   * @see com.holycityaudio.spincad.spinCAD.impl.SpinCADPackageImpl#getWriteDelay()
   * @generated
   */
  int WRITE_DELAY = 66;

  /**
   * The feature id for the '<em><b>Arg1</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WRITE_DELAY__ARG1 = INST_B15_S1_9__ARG1;

  /**
   * The feature id for the '<em><b>Arg2</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WRITE_DELAY__ARG2 = INST_B15_S1_9__ARG2;

  /**
   * The number of structural features of the '<em>Write Delay</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WRITE_DELAY_FEATURE_COUNT = INST_B15_S1_9_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link com.holycityaudio.spincad.spinCAD.impl.WriteAllpassImpl <em>Write Allpass</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.holycityaudio.spincad.spinCAD.impl.WriteAllpassImpl
   * @see com.holycityaudio.spincad.spinCAD.impl.SpinCADPackageImpl#getWriteAllpass()
   * @generated
   */
  int WRITE_ALLPASS = 67;

  /**
   * The feature id for the '<em><b>Arg1</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WRITE_ALLPASS__ARG1 = INST_B15_S1_9__ARG1;

  /**
   * The feature id for the '<em><b>Arg2</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WRITE_ALLPASS__ARG2 = INST_B15_S1_9__ARG2;

  /**
   * The number of structural features of the '<em>Write Allpass</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WRITE_ALLPASS_FEATURE_COUNT = INST_B15_S1_9_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link com.holycityaudio.spincad.spinCAD.impl.ReadDelayImpl <em>Read Delay</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.holycityaudio.spincad.spinCAD.impl.ReadDelayImpl
   * @see com.holycityaudio.spincad.spinCAD.impl.SpinCADPackageImpl#getReadDelay()
   * @generated
   */
  int READ_DELAY = 68;

  /**
   * The feature id for the '<em><b>Arg1</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int READ_DELAY__ARG1 = INST_B15_S1_9__ARG1;

  /**
   * The feature id for the '<em><b>Arg2</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int READ_DELAY__ARG2 = INST_B15_S1_9__ARG2;

  /**
   * The number of structural features of the '<em>Read Delay</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int READ_DELAY_FEATURE_COUNT = INST_B15_S1_9_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link com.holycityaudio.spincad.spinCAD.impl.LoadSinLFOImpl <em>Load Sin LFO</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.holycityaudio.spincad.spinCAD.impl.LoadSinLFOImpl
   * @see com.holycityaudio.spincad.spinCAD.impl.SpinCADPackageImpl#getLoadSinLFO()
   * @generated
   */
  int LOAD_SIN_LFO = 69;

  /**
   * The feature id for the '<em><b>Arg1</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOAD_SIN_LFO__ARG1 = INSTRUCTION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Arg2</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOAD_SIN_LFO__ARG2 = INSTRUCTION_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Arg3</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOAD_SIN_LFO__ARG3 = INSTRUCTION_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Load Sin LFO</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOAD_SIN_LFO_FEATURE_COUNT = INSTRUCTION_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link com.holycityaudio.spincad.spinCAD.impl.LoadRampLFOImpl <em>Load Ramp LFO</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.holycityaudio.spincad.spinCAD.impl.LoadRampLFOImpl
   * @see com.holycityaudio.spincad.spinCAD.impl.SpinCADPackageImpl#getLoadRampLFO()
   * @generated
   */
  int LOAD_RAMP_LFO = 70;

  /**
   * The feature id for the '<em><b>Arg1</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOAD_RAMP_LFO__ARG1 = INSTRUCTION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Arg2</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOAD_RAMP_LFO__ARG2 = INSTRUCTION_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Arg3</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOAD_RAMP_LFO__ARG3 = INSTRUCTION_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Load Ramp LFO</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOAD_RAMP_LFO_FEATURE_COUNT = INSTRUCTION_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link com.holycityaudio.spincad.spinCAD.impl.ChorusReadDelayImpl <em>Chorus Read Delay</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.holycityaudio.spincad.spinCAD.impl.ChorusReadDelayImpl
   * @see com.holycityaudio.spincad.spinCAD.impl.SpinCADPackageImpl#getChorusReadDelay()
   * @generated
   */
  int CHORUS_READ_DELAY = 71;

  /**
   * The feature id for the '<em><b>Arg1</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CHORUS_READ_DELAY__ARG1 = INSTRUCTION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Arg2</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CHORUS_READ_DELAY__ARG2 = INSTRUCTION_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Arg3</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CHORUS_READ_DELAY__ARG3 = INSTRUCTION_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Chorus Read Delay</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CHORUS_READ_DELAY_FEATURE_COUNT = INSTRUCTION_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link com.holycityaudio.spincad.spinCAD.impl.ChorusReadValueImpl <em>Chorus Read Value</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.holycityaudio.spincad.spinCAD.impl.ChorusReadValueImpl
   * @see com.holycityaudio.spincad.spinCAD.impl.SpinCADPackageImpl#getChorusReadValue()
   * @generated
   */
  int CHORUS_READ_VALUE = 72;

  /**
   * The feature id for the '<em><b>Arg1</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CHORUS_READ_VALUE__ARG1 = INSTRUCTION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Chorus Read Value</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CHORUS_READ_VALUE_FEATURE_COUNT = INSTRUCTION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link com.holycityaudio.spincad.spinCAD.impl.ChorusScaleOffsetImpl <em>Chorus Scale Offset</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.holycityaudio.spincad.spinCAD.impl.ChorusScaleOffsetImpl
   * @see com.holycityaudio.spincad.spinCAD.impl.SpinCADPackageImpl#getChorusScaleOffset()
   * @generated
   */
  int CHORUS_SCALE_OFFSET = 73;

  /**
   * The feature id for the '<em><b>Arg1</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CHORUS_SCALE_OFFSET__ARG1 = INSTRUCTION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Arg2</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CHORUS_SCALE_OFFSET__ARG2 = INSTRUCTION_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Arg3</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CHORUS_SCALE_OFFSET__ARG3 = INSTRUCTION_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Chorus Scale Offset</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CHORUS_SCALE_OFFSET_FEATURE_COUNT = INSTRUCTION_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link com.holycityaudio.spincad.spinCAD.impl.ReadDelayPointerImpl <em>Read Delay Pointer</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.holycityaudio.spincad.spinCAD.impl.ReadDelayPointerImpl
   * @see com.holycityaudio.spincad.spinCAD.impl.SpinCADPackageImpl#getReadDelayPointer()
   * @generated
   */
  int READ_DELAY_POINTER = 74;

  /**
   * The feature id for the '<em><b>Arg1</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int READ_DELAY_POINTER__ARG1 = INSTRUCTION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Read Delay Pointer</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int READ_DELAY_POINTER_FEATURE_COUNT = INSTRUCTION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link com.holycityaudio.spincad.spinCAD.impl.AndImpl <em>And</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.holycityaudio.spincad.spinCAD.impl.AndImpl
   * @see com.holycityaudio.spincad.spinCAD.impl.SpinCADPackageImpl#getAnd()
   * @generated
   */
  int AND = 75;

  /**
   * The feature id for the '<em><b>Arg1</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AND__ARG1 = INST_B24__ARG1;

  /**
   * The number of structural features of the '<em>And</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AND_FEATURE_COUNT = INST_B24_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link com.holycityaudio.spincad.spinCAD.impl.OrImpl <em>Or</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.holycityaudio.spincad.spinCAD.impl.OrImpl
   * @see com.holycityaudio.spincad.spinCAD.impl.SpinCADPackageImpl#getOr()
   * @generated
   */
  int OR = 76;

  /**
   * The feature id for the '<em><b>Arg1</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OR__ARG1 = INST_B24__ARG1;

  /**
   * The number of structural features of the '<em>Or</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OR_FEATURE_COUNT = INST_B24_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link com.holycityaudio.spincad.spinCAD.impl.XorImpl <em>Xor</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.holycityaudio.spincad.spinCAD.impl.XorImpl
   * @see com.holycityaudio.spincad.spinCAD.impl.SpinCADPackageImpl#getXor()
   * @generated
   */
  int XOR = 77;

  /**
   * The feature id for the '<em><b>Arg1</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int XOR__ARG1 = INST_B24__ARG1;

  /**
   * The number of structural features of the '<em>Xor</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int XOR_FEATURE_COUNT = INST_B24_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link com.holycityaudio.spincad.spinCAD.impl.JamImpl <em>Jam</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.holycityaudio.spincad.spinCAD.impl.JamImpl
   * @see com.holycityaudio.spincad.spinCAD.impl.SpinCADPackageImpl#getJam()
   * @generated
   */
  int JAM = 78;

  /**
   * The feature id for the '<em><b>Arg1</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int JAM__ARG1 = INSTRUCTION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Jam</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int JAM_FEATURE_COUNT = INSTRUCTION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link com.holycityaudio.spincad.spinCAD.impl.ClrImpl <em>Clr</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.holycityaudio.spincad.spinCAD.impl.ClrImpl
   * @see com.holycityaudio.spincad.spinCAD.impl.SpinCADPackageImpl#getClr()
   * @generated
   */
  int CLR = 79;

  /**
   * The number of structural features of the '<em>Clr</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLR_FEATURE_COUNT = INST_X0_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link com.holycityaudio.spincad.spinCAD.impl.NotImpl <em>Not</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.holycityaudio.spincad.spinCAD.impl.NotImpl
   * @see com.holycityaudio.spincad.spinCAD.impl.SpinCADPackageImpl#getNot()
   * @generated
   */
  int NOT = 80;

  /**
   * The number of structural features of the '<em>Not</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NOT_FEATURE_COUNT = INST_X0_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link com.holycityaudio.spincad.spinCAD.impl.AbsaImpl <em>Absa</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.holycityaudio.spincad.spinCAD.impl.AbsaImpl
   * @see com.holycityaudio.spincad.spinCAD.impl.SpinCADPackageImpl#getAbsa()
   * @generated
   */
  int ABSA = 81;

  /**
   * The number of structural features of the '<em>Absa</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ABSA_FEATURE_COUNT = INST_X0_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link com.holycityaudio.spincad.spinCAD.impl.SkipImpl <em>Skip</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.holycityaudio.spincad.spinCAD.impl.SkipImpl
   * @see com.holycityaudio.spincad.spinCAD.impl.SpinCADPackageImpl#getSkip()
   * @generated
   */
  int SKIP = 82;

  /**
   * The feature id for the '<em><b>Flags</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SKIP__FLAGS = INSTRUCTION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Label</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SKIP__LABEL = INSTRUCTION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Skip</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SKIP_FEATURE_COUNT = INSTRUCTION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link com.holycityaudio.spincad.spinCAD.impl.SPINMEMImpl <em>SPINMEM</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.holycityaudio.spincad.spinCAD.impl.SPINMEMImpl
   * @see com.holycityaudio.spincad.spinCAD.impl.SpinCADPackageImpl#getSPINMEM()
   * @generated
   */
  int SPINMEM = 83;

  /**
   * The feature id for the '<em><b>Buffer</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SPINMEM__BUFFER = 0;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SPINMEM__VALUE = 1;

  /**
   * The feature id for the '<em><b>Scale</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SPINMEM__SCALE = 2;

  /**
   * The feature id for the '<em><b>Offset</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SPINMEM__OFFSET = 3;

  /**
   * The number of structural features of the '<em>SPINMEM</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SPINMEM_FEATURE_COUNT = 4;


  /**
   * Returns the meta object for class '{@link com.holycityaudio.spincad.spinCAD.Program <em>Program</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Program</em>'.
   * @see com.holycityaudio.spincad.spinCAD.Program
   * @generated
   */
  EClass getProgram();

  /**
   * Returns the meta object for the attribute '{@link com.holycityaudio.spincad.spinCAD.Program#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see com.holycityaudio.spincad.spinCAD.Program#getName()
   * @see #getProgram()
   * @generated
   */
  EAttribute getProgram_Name();

  /**
   * Returns the meta object for the attribute '{@link com.holycityaudio.spincad.spinCAD.Program#getColor <em>Color</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Color</em>'.
   * @see com.holycityaudio.spincad.spinCAD.Program#getColor()
   * @see #getProgram()
   * @generated
   */
  EAttribute getProgram_Color();

  /**
   * Returns the meta object for the containment reference list '{@link com.holycityaudio.spincad.spinCAD.Program#getPins <em>Pins</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Pins</em>'.
   * @see com.holycityaudio.spincad.spinCAD.Program#getPins()
   * @see #getProgram()
   * @generated
   */
  EReference getProgram_Pins();

  /**
   * Returns the meta object for the containment reference list '{@link com.holycityaudio.spincad.spinCAD.Program#getElements <em>Elements</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Elements</em>'.
   * @see com.holycityaudio.spincad.spinCAD.Program#getElements()
   * @see #getProgram()
   * @generated
   */
  EReference getProgram_Elements();

  /**
   * Returns the meta object for class '{@link com.holycityaudio.spincad.spinCAD.Pin <em>Pin</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Pin</em>'.
   * @see com.holycityaudio.spincad.spinCAD.Pin
   * @generated
   */
  EClass getPin();

  /**
   * Returns the meta object for the attribute '{@link com.holycityaudio.spincad.spinCAD.Pin#getVarName <em>Var Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Var Name</em>'.
   * @see com.holycityaudio.spincad.spinCAD.Pin#getVarName()
   * @see #getPin()
   * @generated
   */
  EAttribute getPin_VarName();

  /**
   * Returns the meta object for the attribute '{@link com.holycityaudio.spincad.spinCAD.Pin#getLabel <em>Label</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Label</em>'.
   * @see com.holycityaudio.spincad.spinCAD.Pin#getLabel()
   * @see #getPin()
   * @generated
   */
  EAttribute getPin_Label();

  /**
   * Returns the meta object for class '{@link com.holycityaudio.spincad.spinCAD.InputPin <em>Input Pin</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Input Pin</em>'.
   * @see com.holycityaudio.spincad.spinCAD.InputPin
   * @generated
   */
  EClass getInputPin();

  /**
   * Returns the meta object for class '{@link com.holycityaudio.spincad.spinCAD.OutputPin <em>Output Pin</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Output Pin</em>'.
   * @see com.holycityaudio.spincad.spinCAD.OutputPin
   * @generated
   */
  EClass getOutputPin();

  /**
   * Returns the meta object for class '{@link com.holycityaudio.spincad.spinCAD.AudioInput <em>Audio Input</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Audio Input</em>'.
   * @see com.holycityaudio.spincad.spinCAD.AudioInput
   * @generated
   */
  EClass getAudioInput();

  /**
   * Returns the meta object for class '{@link com.holycityaudio.spincad.spinCAD.AudioOutput <em>Audio Output</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Audio Output</em>'.
   * @see com.holycityaudio.spincad.spinCAD.AudioOutput
   * @generated
   */
  EClass getAudioOutput();

  /**
   * Returns the meta object for class '{@link com.holycityaudio.spincad.spinCAD.ControlInput <em>Control Input</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Control Input</em>'.
   * @see com.holycityaudio.spincad.spinCAD.ControlInput
   * @generated
   */
  EClass getControlInput();

  /**
   * Returns the meta object for class '{@link com.holycityaudio.spincad.spinCAD.ControlOutput <em>Control Output</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Control Output</em>'.
   * @see com.holycityaudio.spincad.spinCAD.ControlOutput
   * @generated
   */
  EClass getControlOutput();

  /**
   * Returns the meta object for class '{@link com.holycityaudio.spincad.spinCAD.SpinElement <em>Spin Element</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Spin Element</em>'.
   * @see com.holycityaudio.spincad.spinCAD.SpinElement
   * @generated
   */
  EClass getSpinElement();

  /**
   * Returns the meta object for class '{@link com.holycityaudio.spincad.spinCAD.SpinEquate <em>Spin Equate</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Spin Equate</em>'.
   * @see com.holycityaudio.spincad.spinCAD.SpinEquate
   * @generated
   */
  EClass getSpinEquate();

  /**
   * Returns the meta object for the attribute '{@link com.holycityaudio.spincad.spinCAD.SpinEquate#getEname <em>Ename</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Ename</em>'.
   * @see com.holycityaudio.spincad.spinCAD.SpinEquate#getEname()
   * @see #getSpinEquate()
   * @generated
   */
  EAttribute getSpinEquate_Ename();

  /**
   * Returns the meta object for the attribute '{@link com.holycityaudio.spincad.spinCAD.SpinEquate#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see com.holycityaudio.spincad.spinCAD.SpinEquate#getValue()
   * @see #getSpinEquate()
   * @generated
   */
  EAttribute getSpinEquate_Value();

  /**
   * Returns the meta object for class '{@link com.holycityaudio.spincad.spinCAD.SpinInt <em>Spin Int</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Spin Int</em>'.
   * @see com.holycityaudio.spincad.spinCAD.SpinInt
   * @generated
   */
  EClass getSpinInt();

  /**
   * Returns the meta object for the attribute '{@link com.holycityaudio.spincad.spinCAD.SpinInt#getEname <em>Ename</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Ename</em>'.
   * @see com.holycityaudio.spincad.spinCAD.SpinInt#getEname()
   * @see #getSpinInt()
   * @generated
   */
  EAttribute getSpinInt_Ename();

  /**
   * Returns the meta object for the attribute '{@link com.holycityaudio.spincad.spinCAD.SpinInt#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see com.holycityaudio.spincad.spinCAD.SpinInt#getValue()
   * @see #getSpinInt()
   * @generated
   */
  EAttribute getSpinInt_Value();

  /**
   * Returns the meta object for class '{@link com.holycityaudio.spincad.spinCAD.Mem <em>Mem</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Mem</em>'.
   * @see com.holycityaudio.spincad.spinCAD.Mem
   * @generated
   */
  EClass getMem();

  /**
   * Returns the meta object for the attribute '{@link com.holycityaudio.spincad.spinCAD.Mem#getBuffer <em>Buffer</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Buffer</em>'.
   * @see com.holycityaudio.spincad.spinCAD.Mem#getBuffer()
   * @see #getMem()
   * @generated
   */
  EAttribute getMem_Buffer();

  /**
   * Returns the meta object for the attribute '{@link com.holycityaudio.spincad.spinCAD.Mem#getLength <em>Length</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Length</em>'.
   * @see com.holycityaudio.spincad.spinCAD.Mem#getLength()
   * @see #getMem()
   * @generated
   */
  EAttribute getMem_Length();

  /**
   * Returns the meta object for class '{@link com.holycityaudio.spincad.spinCAD.Offset <em>Offset</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Offset</em>'.
   * @see com.holycityaudio.spincad.spinCAD.Offset
   * @generated
   */
  EClass getOffset();

  /**
   * Returns the meta object for the attribute '{@link com.holycityaudio.spincad.spinCAD.Offset#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see com.holycityaudio.spincad.spinCAD.Offset#getName()
   * @see #getOffset()
   * @generated
   */
  EAttribute getOffset_Name();

  /**
   * Returns the meta object for the attribute '{@link com.holycityaudio.spincad.spinCAD.Offset#getLength <em>Length</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Length</em>'.
   * @see com.holycityaudio.spincad.spinCAD.Offset#getLength()
   * @see #getOffset()
   * @generated
   */
  EAttribute getOffset_Length();

  /**
   * Returns the meta object for class '{@link com.holycityaudio.spincad.spinCAD.SpinBool <em>Spin Bool</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Spin Bool</em>'.
   * @see com.holycityaudio.spincad.spinCAD.SpinBool
   * @generated
   */
  EClass getSpinBool();

  /**
   * Returns the meta object for the attribute '{@link com.holycityaudio.spincad.spinCAD.SpinBool#getLabel <em>Label</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Label</em>'.
   * @see com.holycityaudio.spincad.spinCAD.SpinBool#getLabel()
   * @see #getSpinBool()
   * @generated
   */
  EAttribute getSpinBool_Label();

  /**
   * Returns the meta object for the attribute '{@link com.holycityaudio.spincad.spinCAD.SpinBool#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see com.holycityaudio.spincad.spinCAD.SpinBool#getValue()
   * @see #getSpinBool()
   * @generated
   */
  EAttribute getSpinBool_Value();

  /**
   * Returns the meta object for class '{@link com.holycityaudio.spincad.spinCAD.Control <em>Control</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Control</em>'.
   * @see com.holycityaudio.spincad.spinCAD.Control
   * @generated
   */
  EClass getControl();

  /**
   * Returns the meta object for the attribute '{@link com.holycityaudio.spincad.spinCAD.Control#getEname <em>Ename</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Ename</em>'.
   * @see com.holycityaudio.spincad.spinCAD.Control#getEname()
   * @see #getControl()
   * @generated
   */
  EAttribute getControl_Ename();

  /**
   * Returns the meta object for class '{@link com.holycityaudio.spincad.spinCAD.SpinSliderLabel <em>Spin Slider Label</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Spin Slider Label</em>'.
   * @see com.holycityaudio.spincad.spinCAD.SpinSliderLabel
   * @generated
   */
  EClass getSpinSliderLabel();

  /**
   * Returns the meta object for the attribute '{@link com.holycityaudio.spincad.spinCAD.SpinSliderLabel#getControlName <em>Control Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Control Name</em>'.
   * @see com.holycityaudio.spincad.spinCAD.SpinSliderLabel#getControlName()
   * @see #getSpinSliderLabel()
   * @generated
   */
  EAttribute getSpinSliderLabel_ControlName();

  /**
   * Returns the meta object for the attribute '{@link com.holycityaudio.spincad.spinCAD.SpinSliderLabel#getMinVal <em>Min Val</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Min Val</em>'.
   * @see com.holycityaudio.spincad.spinCAD.SpinSliderLabel#getMinVal()
   * @see #getSpinSliderLabel()
   * @generated
   */
  EAttribute getSpinSliderLabel_MinVal();

  /**
   * Returns the meta object for the attribute '{@link com.holycityaudio.spincad.spinCAD.SpinSliderLabel#getMaxVal <em>Max Val</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Max Val</em>'.
   * @see com.holycityaudio.spincad.spinCAD.SpinSliderLabel#getMaxVal()
   * @see #getSpinSliderLabel()
   * @generated
   */
  EAttribute getSpinSliderLabel_MaxVal();

  /**
   * Returns the meta object for the attribute '{@link com.holycityaudio.spincad.spinCAD.SpinSliderLabel#getInitVal <em>Init Val</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Init Val</em>'.
   * @see com.holycityaudio.spincad.spinCAD.SpinSliderLabel#getInitVal()
   * @see #getSpinSliderLabel()
   * @generated
   */
  EAttribute getSpinSliderLabel_InitVal();

  /**
   * Returns the meta object for the attribute '{@link com.holycityaudio.spincad.spinCAD.SpinSliderLabel#getMultiplier <em>Multiplier</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Multiplier</em>'.
   * @see com.holycityaudio.spincad.spinCAD.SpinSliderLabel#getMultiplier()
   * @see #getSpinSliderLabel()
   * @generated
   */
  EAttribute getSpinSliderLabel_Multiplier();

  /**
   * Returns the meta object for the attribute '{@link com.holycityaudio.spincad.spinCAD.SpinSliderLabel#getPrecision <em>Precision</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Precision</em>'.
   * @see com.holycityaudio.spincad.spinCAD.SpinSliderLabel#getPrecision()
   * @see #getSpinSliderLabel()
   * @generated
   */
  EAttribute getSpinSliderLabel_Precision();

  /**
   * Returns the meta object for the attribute '{@link com.holycityaudio.spincad.spinCAD.SpinSliderLabel#getOption <em>Option</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Option</em>'.
   * @see com.holycityaudio.spincad.spinCAD.SpinSliderLabel#getOption()
   * @see #getSpinSliderLabel()
   * @generated
   */
  EAttribute getSpinSliderLabel_Option();

  /**
   * Returns the meta object for class '{@link com.holycityaudio.spincad.spinCAD.SliderLabelSpinner <em>Slider Label Spinner</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Slider Label Spinner</em>'.
   * @see com.holycityaudio.spincad.spinCAD.SliderLabelSpinner
   * @generated
   */
  EClass getSliderLabelSpinner();

  /**
   * Returns the meta object for the attribute '{@link com.holycityaudio.spincad.spinCAD.SliderLabelSpinner#getControlName <em>Control Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Control Name</em>'.
   * @see com.holycityaudio.spincad.spinCAD.SliderLabelSpinner#getControlName()
   * @see #getSliderLabelSpinner()
   * @generated
   */
  EAttribute getSliderLabelSpinner_ControlName();

  /**
   * Returns the meta object for the attribute '{@link com.holycityaudio.spincad.spinCAD.SliderLabelSpinner#getMinVal <em>Min Val</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Min Val</em>'.
   * @see com.holycityaudio.spincad.spinCAD.SliderLabelSpinner#getMinVal()
   * @see #getSliderLabelSpinner()
   * @generated
   */
  EAttribute getSliderLabelSpinner_MinVal();

  /**
   * Returns the meta object for the attribute '{@link com.holycityaudio.spincad.spinCAD.SliderLabelSpinner#getMaxVal <em>Max Val</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Max Val</em>'.
   * @see com.holycityaudio.spincad.spinCAD.SliderLabelSpinner#getMaxVal()
   * @see #getSliderLabelSpinner()
   * @generated
   */
  EAttribute getSliderLabelSpinner_MaxVal();

  /**
   * Returns the meta object for the attribute '{@link com.holycityaudio.spincad.spinCAD.SliderLabelSpinner#getInitVal <em>Init Val</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Init Val</em>'.
   * @see com.holycityaudio.spincad.spinCAD.SliderLabelSpinner#getInitVal()
   * @see #getSliderLabelSpinner()
   * @generated
   */
  EAttribute getSliderLabelSpinner_InitVal();

  /**
   * Returns the meta object for the attribute '{@link com.holycityaudio.spincad.spinCAD.SliderLabelSpinner#getMultiplier <em>Multiplier</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Multiplier</em>'.
   * @see com.holycityaudio.spincad.spinCAD.SliderLabelSpinner#getMultiplier()
   * @see #getSliderLabelSpinner()
   * @generated
   */
  EAttribute getSliderLabelSpinner_Multiplier();

  /**
   * Returns the meta object for the attribute '{@link com.holycityaudio.spincad.spinCAD.SliderLabelSpinner#getPrecision <em>Precision</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Precision</em>'.
   * @see com.holycityaudio.spincad.spinCAD.SliderLabelSpinner#getPrecision()
   * @see #getSliderLabelSpinner()
   * @generated
   */
  EAttribute getSliderLabelSpinner_Precision();

  /**
   * Returns the meta object for the attribute '{@link com.holycityaudio.spincad.spinCAD.SliderLabelSpinner#getOption <em>Option</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Option</em>'.
   * @see com.holycityaudio.spincad.spinCAD.SliderLabelSpinner#getOption()
   * @see #getSliderLabelSpinner()
   * @generated
   */
  EAttribute getSliderLabelSpinner_Option();

  /**
   * Returns the meta object for class '{@link com.holycityaudio.spincad.spinCAD.SliderLabelCheckBox <em>Slider Label Check Box</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Slider Label Check Box</em>'.
   * @see com.holycityaudio.spincad.spinCAD.SliderLabelCheckBox
   * @generated
   */
  EClass getSliderLabelCheckBox();

  /**
   * Returns the meta object for the attribute '{@link com.holycityaudio.spincad.spinCAD.SliderLabelCheckBox#getControlName <em>Control Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Control Name</em>'.
   * @see com.holycityaudio.spincad.spinCAD.SliderLabelCheckBox#getControlName()
   * @see #getSliderLabelCheckBox()
   * @generated
   */
  EAttribute getSliderLabelCheckBox_ControlName();

  /**
   * Returns the meta object for the attribute '{@link com.holycityaudio.spincad.spinCAD.SliderLabelCheckBox#getMinVal <em>Min Val</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Min Val</em>'.
   * @see com.holycityaudio.spincad.spinCAD.SliderLabelCheckBox#getMinVal()
   * @see #getSliderLabelCheckBox()
   * @generated
   */
  EAttribute getSliderLabelCheckBox_MinVal();

  /**
   * Returns the meta object for the attribute '{@link com.holycityaudio.spincad.spinCAD.SliderLabelCheckBox#getMaxVal <em>Max Val</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Max Val</em>'.
   * @see com.holycityaudio.spincad.spinCAD.SliderLabelCheckBox#getMaxVal()
   * @see #getSliderLabelCheckBox()
   * @generated
   */
  EAttribute getSliderLabelCheckBox_MaxVal();

  /**
   * Returns the meta object for the attribute '{@link com.holycityaudio.spincad.spinCAD.SliderLabelCheckBox#getInitVal <em>Init Val</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Init Val</em>'.
   * @see com.holycityaudio.spincad.spinCAD.SliderLabelCheckBox#getInitVal()
   * @see #getSliderLabelCheckBox()
   * @generated
   */
  EAttribute getSliderLabelCheckBox_InitVal();

  /**
   * Returns the meta object for the attribute '{@link com.holycityaudio.spincad.spinCAD.SliderLabelCheckBox#getMultiplier <em>Multiplier</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Multiplier</em>'.
   * @see com.holycityaudio.spincad.spinCAD.SliderLabelCheckBox#getMultiplier()
   * @see #getSliderLabelCheckBox()
   * @generated
   */
  EAttribute getSliderLabelCheckBox_Multiplier();

  /**
   * Returns the meta object for the attribute '{@link com.holycityaudio.spincad.spinCAD.SliderLabelCheckBox#getPrecision <em>Precision</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Precision</em>'.
   * @see com.holycityaudio.spincad.spinCAD.SliderLabelCheckBox#getPrecision()
   * @see #getSliderLabelCheckBox()
   * @generated
   */
  EAttribute getSliderLabelCheckBox_Precision();

  /**
   * Returns the meta object for the attribute '{@link com.holycityaudio.spincad.spinCAD.SliderLabelCheckBox#getOption <em>Option</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Option</em>'.
   * @see com.holycityaudio.spincad.spinCAD.SliderLabelCheckBox#getOption()
   * @see #getSliderLabelCheckBox()
   * @generated
   */
  EAttribute getSliderLabelCheckBox_Option();

  /**
   * Returns the meta object for class '{@link com.holycityaudio.spincad.spinCAD.SpinCheckBox <em>Spin Check Box</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Spin Check Box</em>'.
   * @see com.holycityaudio.spincad.spinCAD.SpinCheckBox
   * @generated
   */
  EClass getSpinCheckBox();

  /**
   * Returns the meta object for the attribute '{@link com.holycityaudio.spincad.spinCAD.SpinCheckBox#getControlName <em>Control Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Control Name</em>'.
   * @see com.holycityaudio.spincad.spinCAD.SpinCheckBox#getControlName()
   * @see #getSpinCheckBox()
   * @generated
   */
  EAttribute getSpinCheckBox_ControlName();

  /**
   * Returns the meta object for class '{@link com.holycityaudio.spincad.spinCAD.LogFreqSliderLabel <em>Log Freq Slider Label</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Log Freq Slider Label</em>'.
   * @see com.holycityaudio.spincad.spinCAD.LogFreqSliderLabel
   * @generated
   */
  EClass getLogFreqSliderLabel();

  /**
   * Returns the meta object for the attribute '{@link com.holycityaudio.spincad.spinCAD.LogFreqSliderLabel#getControlName <em>Control Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Control Name</em>'.
   * @see com.holycityaudio.spincad.spinCAD.LogFreqSliderLabel#getControlName()
   * @see #getLogFreqSliderLabel()
   * @generated
   */
  EAttribute getLogFreqSliderLabel_ControlName();

  /**
   * Returns the meta object for the attribute '{@link com.holycityaudio.spincad.spinCAD.LogFreqSliderLabel#getMinVal <em>Min Val</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Min Val</em>'.
   * @see com.holycityaudio.spincad.spinCAD.LogFreqSliderLabel#getMinVal()
   * @see #getLogFreqSliderLabel()
   * @generated
   */
  EAttribute getLogFreqSliderLabel_MinVal();

  /**
   * Returns the meta object for the attribute '{@link com.holycityaudio.spincad.spinCAD.LogFreqSliderLabel#getMaxVal <em>Max Val</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Max Val</em>'.
   * @see com.holycityaudio.spincad.spinCAD.LogFreqSliderLabel#getMaxVal()
   * @see #getLogFreqSliderLabel()
   * @generated
   */
  EAttribute getLogFreqSliderLabel_MaxVal();

  /**
   * Returns the meta object for the attribute '{@link com.holycityaudio.spincad.spinCAD.LogFreqSliderLabel#getInitVal <em>Init Val</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Init Val</em>'.
   * @see com.holycityaudio.spincad.spinCAD.LogFreqSliderLabel#getInitVal()
   * @see #getLogFreqSliderLabel()
   * @generated
   */
  EAttribute getLogFreqSliderLabel_InitVal();

  /**
   * Returns the meta object for the attribute '{@link com.holycityaudio.spincad.spinCAD.LogFreqSliderLabel#getMultiplier <em>Multiplier</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Multiplier</em>'.
   * @see com.holycityaudio.spincad.spinCAD.LogFreqSliderLabel#getMultiplier()
   * @see #getLogFreqSliderLabel()
   * @generated
   */
  EAttribute getLogFreqSliderLabel_Multiplier();

  /**
   * Returns the meta object for the attribute '{@link com.holycityaudio.spincad.spinCAD.LogFreqSliderLabel#getPrecision <em>Precision</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Precision</em>'.
   * @see com.holycityaudio.spincad.spinCAD.LogFreqSliderLabel#getPrecision()
   * @see #getLogFreqSliderLabel()
   * @generated
   */
  EAttribute getLogFreqSliderLabel_Precision();

  /**
   * Returns the meta object for the attribute '{@link com.holycityaudio.spincad.spinCAD.LogFreqSliderLabel#getOption <em>Option</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Option</em>'.
   * @see com.holycityaudio.spincad.spinCAD.LogFreqSliderLabel#getOption()
   * @see #getLogFreqSliderLabel()
   * @generated
   */
  EAttribute getLogFreqSliderLabel_Option();

  /**
   * Returns the meta object for class '{@link com.holycityaudio.spincad.spinCAD.LogFreq2SliderLabel <em>Log Freq2 Slider Label</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Log Freq2 Slider Label</em>'.
   * @see com.holycityaudio.spincad.spinCAD.LogFreq2SliderLabel
   * @generated
   */
  EClass getLogFreq2SliderLabel();

  /**
   * Returns the meta object for the attribute '{@link com.holycityaudio.spincad.spinCAD.LogFreq2SliderLabel#getControlName <em>Control Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Control Name</em>'.
   * @see com.holycityaudio.spincad.spinCAD.LogFreq2SliderLabel#getControlName()
   * @see #getLogFreq2SliderLabel()
   * @generated
   */
  EAttribute getLogFreq2SliderLabel_ControlName();

  /**
   * Returns the meta object for the attribute '{@link com.holycityaudio.spincad.spinCAD.LogFreq2SliderLabel#getMinVal <em>Min Val</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Min Val</em>'.
   * @see com.holycityaudio.spincad.spinCAD.LogFreq2SliderLabel#getMinVal()
   * @see #getLogFreq2SliderLabel()
   * @generated
   */
  EAttribute getLogFreq2SliderLabel_MinVal();

  /**
   * Returns the meta object for the attribute '{@link com.holycityaudio.spincad.spinCAD.LogFreq2SliderLabel#getMaxVal <em>Max Val</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Max Val</em>'.
   * @see com.holycityaudio.spincad.spinCAD.LogFreq2SliderLabel#getMaxVal()
   * @see #getLogFreq2SliderLabel()
   * @generated
   */
  EAttribute getLogFreq2SliderLabel_MaxVal();

  /**
   * Returns the meta object for the attribute '{@link com.holycityaudio.spincad.spinCAD.LogFreq2SliderLabel#getInitVal <em>Init Val</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Init Val</em>'.
   * @see com.holycityaudio.spincad.spinCAD.LogFreq2SliderLabel#getInitVal()
   * @see #getLogFreq2SliderLabel()
   * @generated
   */
  EAttribute getLogFreq2SliderLabel_InitVal();

  /**
   * Returns the meta object for the attribute '{@link com.holycityaudio.spincad.spinCAD.LogFreq2SliderLabel#getMultiplier <em>Multiplier</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Multiplier</em>'.
   * @see com.holycityaudio.spincad.spinCAD.LogFreq2SliderLabel#getMultiplier()
   * @see #getLogFreq2SliderLabel()
   * @generated
   */
  EAttribute getLogFreq2SliderLabel_Multiplier();

  /**
   * Returns the meta object for the attribute '{@link com.holycityaudio.spincad.spinCAD.LogFreq2SliderLabel#getPrecision <em>Precision</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Precision</em>'.
   * @see com.holycityaudio.spincad.spinCAD.LogFreq2SliderLabel#getPrecision()
   * @see #getLogFreq2SliderLabel()
   * @generated
   */
  EAttribute getLogFreq2SliderLabel_Precision();

  /**
   * Returns the meta object for the attribute '{@link com.holycityaudio.spincad.spinCAD.LogFreq2SliderLabel#getOption <em>Option</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Option</em>'.
   * @see com.holycityaudio.spincad.spinCAD.LogFreq2SliderLabel#getOption()
   * @see #getLogFreq2SliderLabel()
   * @generated
   */
  EAttribute getLogFreq2SliderLabel_Option();

  /**
   * Returns the meta object for class '{@link com.holycityaudio.spincad.spinCAD.SpinRadioButton <em>Spin Radio Button</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Spin Radio Button</em>'.
   * @see com.holycityaudio.spincad.spinCAD.SpinRadioButton
   * @generated
   */
  EClass getSpinRadioButton();

  /**
   * Returns the meta object for the attribute '{@link com.holycityaudio.spincad.spinCAD.SpinRadioButton#getControlName <em>Control Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Control Name</em>'.
   * @see com.holycityaudio.spincad.spinCAD.SpinRadioButton#getControlName()
   * @see #getSpinRadioButton()
   * @generated
   */
  EAttribute getSpinRadioButton_ControlName();

  /**
   * Returns the meta object for class '{@link com.holycityaudio.spincad.spinCAD.SpinComboBox <em>Spin Combo Box</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Spin Combo Box</em>'.
   * @see com.holycityaudio.spincad.spinCAD.SpinComboBox
   * @generated
   */
  EClass getSpinComboBox();

  /**
   * Returns the meta object for the attribute '{@link com.holycityaudio.spincad.spinCAD.SpinComboBox#getOptiona <em>Optiona</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Optiona</em>'.
   * @see com.holycityaudio.spincad.spinCAD.SpinComboBox#getOptiona()
   * @see #getSpinComboBox()
   * @generated
   */
  EAttribute getSpinComboBox_Optiona();

  /**
   * Returns the meta object for the attribute '{@link com.holycityaudio.spincad.spinCAD.SpinComboBox#getOptionb <em>Optionb</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Optionb</em>'.
   * @see com.holycityaudio.spincad.spinCAD.SpinComboBox#getOptionb()
   * @see #getSpinComboBox()
   * @generated
   */
  EAttribute getSpinComboBox_Optionb();

  /**
   * Returns the meta object for the attribute '{@link com.holycityaudio.spincad.spinCAD.SpinComboBox#getOptionc <em>Optionc</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Optionc</em>'.
   * @see com.holycityaudio.spincad.spinCAD.SpinComboBox#getOptionc()
   * @see #getSpinComboBox()
   * @generated
   */
  EAttribute getSpinComboBox_Optionc();

  /**
   * Returns the meta object for the attribute '{@link com.holycityaudio.spincad.spinCAD.SpinComboBox#getOptiond <em>Optiond</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Optiond</em>'.
   * @see com.holycityaudio.spincad.spinCAD.SpinComboBox#getOptiond()
   * @see #getSpinComboBox()
   * @generated
   */
  EAttribute getSpinComboBox_Optiond();

  /**
   * Returns the meta object for the attribute '{@link com.holycityaudio.spincad.spinCAD.SpinComboBox#getOptione <em>Optione</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Optione</em>'.
   * @see com.holycityaudio.spincad.spinCAD.SpinComboBox#getOptione()
   * @see #getSpinComboBox()
   * @generated
   */
  EAttribute getSpinComboBox_Optione();

  /**
   * Returns the meta object for the attribute '{@link com.holycityaudio.spincad.spinCAD.SpinComboBox#getOptionf <em>Optionf</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Optionf</em>'.
   * @see com.holycityaudio.spincad.spinCAD.SpinComboBox#getOptionf()
   * @see #getSpinComboBox()
   * @generated
   */
  EAttribute getSpinComboBox_Optionf();

  /**
   * Returns the meta object for class '{@link com.holycityaudio.spincad.spinCAD.Comment <em>Comment</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Comment</em>'.
   * @see com.holycityaudio.spincad.spinCAD.Comment
   * @generated
   */
  EClass getComment();

  /**
   * Returns the meta object for the attribute '{@link com.holycityaudio.spincad.spinCAD.Comment#getRemark <em>Remark</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Remark</em>'.
   * @see com.holycityaudio.spincad.spinCAD.Comment#getRemark()
   * @see #getComment()
   * @generated
   */
  EAttribute getComment_Remark();

  /**
   * Returns the meta object for class '{@link com.holycityaudio.spincad.spinCAD.Label <em>Label</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Label</em>'.
   * @see com.holycityaudio.spincad.spinCAD.Label
   * @generated
   */
  EClass getLabel();

  /**
   * Returns the meta object for the attribute '{@link com.holycityaudio.spincad.spinCAD.Label#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see com.holycityaudio.spincad.spinCAD.Label#getName()
   * @see #getLabel()
   * @generated
   */
  EAttribute getLabel_Name();

  /**
   * Returns the meta object for class '{@link com.holycityaudio.spincad.spinCAD.Macro <em>Macro</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Macro</em>'.
   * @see com.holycityaudio.spincad.spinCAD.Macro
   * @generated
   */
  EClass getMacro();

  /**
   * Returns the meta object for class '{@link com.holycityaudio.spincad.spinCAD.IsPinConnected <em>Is Pin Connected</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Is Pin Connected</em>'.
   * @see com.holycityaudio.spincad.spinCAD.IsPinConnected
   * @generated
   */
  EClass getIsPinConnected();

  /**
   * Returns the meta object for the attribute '{@link com.holycityaudio.spincad.spinCAD.IsPinConnected#getArg1 <em>Arg1</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Arg1</em>'.
   * @see com.holycityaudio.spincad.spinCAD.IsPinConnected#getArg1()
   * @see #getIsPinConnected()
   * @generated
   */
  EAttribute getIsPinConnected_Arg1();

  /**
   * Returns the meta object for class '{@link com.holycityaudio.spincad.spinCAD.IsGreaterThan <em>Is Greater Than</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Is Greater Than</em>'.
   * @see com.holycityaudio.spincad.spinCAD.IsGreaterThan
   * @generated
   */
  EClass getIsGreaterThan();

  /**
   * Returns the meta object for the attribute '{@link com.holycityaudio.spincad.spinCAD.IsGreaterThan#getVariable <em>Variable</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Variable</em>'.
   * @see com.holycityaudio.spincad.spinCAD.IsGreaterThan#getVariable()
   * @see #getIsGreaterThan()
   * @generated
   */
  EAttribute getIsGreaterThan_Variable();

  /**
   * Returns the meta object for the attribute '{@link com.holycityaudio.spincad.spinCAD.IsGreaterThan#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see com.holycityaudio.spincad.spinCAD.IsGreaterThan#getValue()
   * @see #getIsGreaterThan()
   * @generated
   */
  EAttribute getIsGreaterThan_Value();

  /**
   * Returns the meta object for class '{@link com.holycityaudio.spincad.spinCAD.IsLessThan <em>Is Less Than</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Is Less Than</em>'.
   * @see com.holycityaudio.spincad.spinCAD.IsLessThan
   * @generated
   */
  EClass getIsLessThan();

  /**
   * Returns the meta object for the attribute '{@link com.holycityaudio.spincad.spinCAD.IsLessThan#getVariable <em>Variable</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Variable</em>'.
   * @see com.holycityaudio.spincad.spinCAD.IsLessThan#getVariable()
   * @see #getIsLessThan()
   * @generated
   */
  EAttribute getIsLessThan_Variable();

  /**
   * Returns the meta object for the attribute '{@link com.holycityaudio.spincad.spinCAD.IsLessThan#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see com.holycityaudio.spincad.spinCAD.IsLessThan#getValue()
   * @see #getIsLessThan()
   * @generated
   */
  EAttribute getIsLessThan_Value();

  /**
   * Returns the meta object for class '{@link com.holycityaudio.spincad.spinCAD.IsEqualTo <em>Is Equal To</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Is Equal To</em>'.
   * @see com.holycityaudio.spincad.spinCAD.IsEqualTo
   * @generated
   */
  EClass getIsEqualTo();

  /**
   * Returns the meta object for the attribute '{@link com.holycityaudio.spincad.spinCAD.IsEqualTo#getVariable <em>Variable</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Variable</em>'.
   * @see com.holycityaudio.spincad.spinCAD.IsEqualTo#getVariable()
   * @see #getIsEqualTo()
   * @generated
   */
  EAttribute getIsEqualTo_Variable();

  /**
   * Returns the meta object for the attribute '{@link com.holycityaudio.spincad.spinCAD.IsEqualTo#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see com.holycityaudio.spincad.spinCAD.IsEqualTo#getValue()
   * @see #getIsEqualTo()
   * @generated
   */
  EAttribute getIsEqualTo_Value();

  /**
   * Returns the meta object for class '{@link com.holycityaudio.spincad.spinCAD.IsTrue <em>Is True</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Is True</em>'.
   * @see com.holycityaudio.spincad.spinCAD.IsTrue
   * @generated
   */
  EClass getIsTrue();

  /**
   * Returns the meta object for the attribute '{@link com.holycityaudio.spincad.spinCAD.IsTrue#getVariable <em>Variable</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Variable</em>'.
   * @see com.holycityaudio.spincad.spinCAD.IsTrue#getVariable()
   * @see #getIsTrue()
   * @generated
   */
  EAttribute getIsTrue_Variable();

  /**
   * Returns the meta object for class '{@link com.holycityaudio.spincad.spinCAD.IsElse <em>Is Else</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Is Else</em>'.
   * @see com.holycityaudio.spincad.spinCAD.IsElse
   * @generated
   */
  EClass getIsElse();

  /**
   * Returns the meta object for class '{@link com.holycityaudio.spincad.spinCAD.IsEndif <em>Is Endif</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Is Endif</em>'.
   * @see com.holycityaudio.spincad.spinCAD.IsEndif
   * @generated
   */
  EClass getIsEndif();

  /**
   * Returns the meta object for class '{@link com.holycityaudio.spincad.spinCAD.IsOr <em>Is Or</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Is Or</em>'.
   * @see com.holycityaudio.spincad.spinCAD.IsOr
   * @generated
   */
  EClass getIsOr();

  /**
   * Returns the meta object for the attribute '{@link com.holycityaudio.spincad.spinCAD.IsOr#getVar1 <em>Var1</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Var1</em>'.
   * @see com.holycityaudio.spincad.spinCAD.IsOr#getVar1()
   * @see #getIsOr()
   * @generated
   */
  EAttribute getIsOr_Var1();

  /**
   * Returns the meta object for the attribute '{@link com.holycityaudio.spincad.spinCAD.IsOr#getVar2 <em>Var2</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Var2</em>'.
   * @see com.holycityaudio.spincad.spinCAD.IsOr#getVar2()
   * @see #getIsOr()
   * @generated
   */
  EAttribute getIsOr_Var2();

  /**
   * Returns the meta object for the attribute '{@link com.holycityaudio.spincad.spinCAD.IsOr#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see com.holycityaudio.spincad.spinCAD.IsOr#getValue()
   * @see #getIsOr()
   * @generated
   */
  EAttribute getIsOr_Value();

  /**
   * Returns the meta object for class '{@link com.holycityaudio.spincad.spinCAD.GetInputDefault <em>Get Input Default</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Get Input Default</em>'.
   * @see com.holycityaudio.spincad.spinCAD.GetInputDefault
   * @generated
   */
  EClass getGetInputDefault();

  /**
   * Returns the meta object for the attribute '{@link com.holycityaudio.spincad.spinCAD.GetInputDefault#getLabel <em>Label</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Label</em>'.
   * @see com.holycityaudio.spincad.spinCAD.GetInputDefault#getLabel()
   * @see #getGetInputDefault()
   * @generated
   */
  EAttribute getGetInputDefault_Label();

  /**
   * Returns the meta object for the attribute '{@link com.holycityaudio.spincad.spinCAD.GetInputDefault#getVariable <em>Variable</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Variable</em>'.
   * @see com.holycityaudio.spincad.spinCAD.GetInputDefault#getVariable()
   * @see #getGetInputDefault()
   * @generated
   */
  EAttribute getGetInputDefault_Variable();

  /**
   * Returns the meta object for the attribute '{@link com.holycityaudio.spincad.spinCAD.GetInputDefault#getScale <em>Scale</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Scale</em>'.
   * @see com.holycityaudio.spincad.spinCAD.GetInputDefault#getScale()
   * @see #getGetInputDefault()
   * @generated
   */
  EAttribute getGetInputDefault_Scale();

  /**
   * Returns the meta object for the attribute '{@link com.holycityaudio.spincad.spinCAD.GetInputDefault#getDefaultVal <em>Default Val</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Default Val</em>'.
   * @see com.holycityaudio.spincad.spinCAD.GetInputDefault#getDefaultVal()
   * @see #getGetInputDefault()
   * @generated
   */
  EAttribute getGetInputDefault_DefaultVal();

  /**
   * Returns the meta object for class '{@link com.holycityaudio.spincad.spinCAD.GetDelayScaleControl <em>Get Delay Scale Control</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Get Delay Scale Control</em>'.
   * @see com.holycityaudio.spincad.spinCAD.GetDelayScaleControl
   * @generated
   */
  EClass getGetDelayScaleControl();

  /**
   * Returns the meta object for the attribute '{@link com.holycityaudio.spincad.spinCAD.GetDelayScaleControl#getRatio <em>Ratio</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Ratio</em>'.
   * @see com.holycityaudio.spincad.spinCAD.GetDelayScaleControl#getRatio()
   * @see #getGetDelayScaleControl()
   * @generated
   */
  EAttribute getGetDelayScaleControl_Ratio();

  /**
   * Returns the meta object for the attribute '{@link com.holycityaudio.spincad.spinCAD.GetDelayScaleControl#getLength <em>Length</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Length</em>'.
   * @see com.holycityaudio.spincad.spinCAD.GetDelayScaleControl#getLength()
   * @see #getGetDelayScaleControl()
   * @generated
   */
  EAttribute getGetDelayScaleControl_Length();

  /**
   * Returns the meta object for the attribute '{@link com.holycityaudio.spincad.spinCAD.GetDelayScaleControl#getOffset <em>Offset</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Offset</em>'.
   * @see com.holycityaudio.spincad.spinCAD.GetDelayScaleControl#getOffset()
   * @see #getGetDelayScaleControl()
   * @generated
   */
  EAttribute getGetDelayScaleControl_Offset();

  /**
   * Returns the meta object for the attribute '{@link com.holycityaudio.spincad.spinCAD.GetDelayScaleControl#getControl <em>Control</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Control</em>'.
   * @see com.holycityaudio.spincad.spinCAD.GetDelayScaleControl#getControl()
   * @see #getGetDelayScaleControl()
   * @generated
   */
  EAttribute getGetDelayScaleControl_Control();

  /**
   * Returns the meta object for class '{@link com.holycityaudio.spincad.spinCAD.ReadChorusTap <em>Read Chorus Tap</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Read Chorus Tap</em>'.
   * @see com.holycityaudio.spincad.spinCAD.ReadChorusTap
   * @generated
   */
  EClass getReadChorusTap();

  /**
   * Returns the meta object for the attribute '{@link com.holycityaudio.spincad.spinCAD.ReadChorusTap#getLfo <em>Lfo</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Lfo</em>'.
   * @see com.holycityaudio.spincad.spinCAD.ReadChorusTap#getLfo()
   * @see #getReadChorusTap()
   * @generated
   */
  EAttribute getReadChorusTap_Lfo();

  /**
   * Returns the meta object for the attribute '{@link com.holycityaudio.spincad.spinCAD.ReadChorusTap#getPhase <em>Phase</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Phase</em>'.
   * @see com.holycityaudio.spincad.spinCAD.ReadChorusTap#getPhase()
   * @see #getReadChorusTap()
   * @generated
   */
  EAttribute getReadChorusTap_Phase();

  /**
   * Returns the meta object for the attribute '{@link com.holycityaudio.spincad.spinCAD.ReadChorusTap#getRatio <em>Ratio</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Ratio</em>'.
   * @see com.holycityaudio.spincad.spinCAD.ReadChorusTap#getRatio()
   * @see #getReadChorusTap()
   * @generated
   */
  EAttribute getReadChorusTap_Ratio();

  /**
   * Returns the meta object for the attribute '{@link com.holycityaudio.spincad.spinCAD.ReadChorusTap#getLength <em>Length</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Length</em>'.
   * @see com.holycityaudio.spincad.spinCAD.ReadChorusTap#getLength()
   * @see #getReadChorusTap()
   * @generated
   */
  EAttribute getReadChorusTap_Length();

  /**
   * Returns the meta object for the attribute '{@link com.holycityaudio.spincad.spinCAD.ReadChorusTap#getOffset <em>Offset</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Offset</em>'.
   * @see com.holycityaudio.spincad.spinCAD.ReadChorusTap#getOffset()
   * @see #getReadChorusTap()
   * @generated
   */
  EAttribute getReadChorusTap_Offset();

  /**
   * Returns the meta object for class '{@link com.holycityaudio.spincad.spinCAD.GetSamplesFromRatio <em>Get Samples From Ratio</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Get Samples From Ratio</em>'.
   * @see com.holycityaudio.spincad.spinCAD.GetSamplesFromRatio
   * @generated
   */
  EClass getGetSamplesFromRatio();

  /**
   * Returns the meta object for the attribute '{@link com.holycityaudio.spincad.spinCAD.GetSamplesFromRatio#getVariable <em>Variable</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Variable</em>'.
   * @see com.holycityaudio.spincad.spinCAD.GetSamplesFromRatio#getVariable()
   * @see #getGetSamplesFromRatio()
   * @generated
   */
  EAttribute getGetSamplesFromRatio_Variable();

  /**
   * Returns the meta object for the attribute '{@link com.holycityaudio.spincad.spinCAD.GetSamplesFromRatio#getRatio <em>Ratio</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Ratio</em>'.
   * @see com.holycityaudio.spincad.spinCAD.GetSamplesFromRatio#getRatio()
   * @see #getGetSamplesFromRatio()
   * @generated
   */
  EAttribute getGetSamplesFromRatio_Ratio();

  /**
   * Returns the meta object for the attribute '{@link com.holycityaudio.spincad.spinCAD.GetSamplesFromRatio#getLength <em>Length</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Length</em>'.
   * @see com.holycityaudio.spincad.spinCAD.GetSamplesFromRatio#getLength()
   * @see #getGetSamplesFromRatio()
   * @generated
   */
  EAttribute getGetSamplesFromRatio_Length();

  /**
   * Returns the meta object for class '{@link com.holycityaudio.spincad.spinCAD.SemitonesToRmpRate <em>Semitones To Rmp Rate</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Semitones To Rmp Rate</em>'.
   * @see com.holycityaudio.spincad.spinCAD.SemitonesToRmpRate
   * @generated
   */
  EClass getSemitonesToRmpRate();

  /**
   * Returns the meta object for the attribute '{@link com.holycityaudio.spincad.spinCAD.SemitonesToRmpRate#getVariable <em>Variable</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Variable</em>'.
   * @see com.holycityaudio.spincad.spinCAD.SemitonesToRmpRate#getVariable()
   * @see #getSemitonesToRmpRate()
   * @generated
   */
  EAttribute getSemitonesToRmpRate_Variable();

  /**
   * Returns the meta object for the attribute '{@link com.holycityaudio.spincad.spinCAD.SemitonesToRmpRate#getSemitones <em>Semitones</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Semitones</em>'.
   * @see com.holycityaudio.spincad.spinCAD.SemitonesToRmpRate#getSemitones()
   * @see #getSemitonesToRmpRate()
   * @generated
   */
  EAttribute getSemitonesToRmpRate_Semitones();

  /**
   * Returns the meta object for class '{@link com.holycityaudio.spincad.spinCAD.GetBaseAddress <em>Get Base Address</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Get Base Address</em>'.
   * @see com.holycityaudio.spincad.spinCAD.GetBaseAddress
   * @generated
   */
  EClass getGetBaseAddress();

  /**
   * Returns the meta object for class '{@link com.holycityaudio.spincad.spinCAD.SetOutputPin <em>Set Output Pin</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Set Output Pin</em>'.
   * @see com.holycityaudio.spincad.spinCAD.SetOutputPin
   * @generated
   */
  EClass getSetOutputPin();

  /**
   * Returns the meta object for the attribute '{@link com.holycityaudio.spincad.spinCAD.SetOutputPin#getPinName <em>Pin Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Pin Name</em>'.
   * @see com.holycityaudio.spincad.spinCAD.SetOutputPin#getPinName()
   * @see #getSetOutputPin()
   * @generated
   */
  EAttribute getSetOutputPin_PinName();

  /**
   * Returns the meta object for the attribute '{@link com.holycityaudio.spincad.spinCAD.SetOutputPin#getVarName <em>Var Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Var Name</em>'.
   * @see com.holycityaudio.spincad.spinCAD.SetOutputPin#getVarName()
   * @see #getSetOutputPin()
   * @generated
   */
  EAttribute getSetOutputPin_VarName();

  /**
   * Returns the meta object for class '{@link com.holycityaudio.spincad.spinCAD.MinusDouble <em>Minus Double</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Minus Double</em>'.
   * @see com.holycityaudio.spincad.spinCAD.MinusDouble
   * @generated
   */
  EClass getMinusDouble();

  /**
   * Returns the meta object for the attribute '{@link com.holycityaudio.spincad.spinCAD.MinusDouble#getVarName <em>Var Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Var Name</em>'.
   * @see com.holycityaudio.spincad.spinCAD.MinusDouble#getVarName()
   * @see #getMinusDouble()
   * @generated
   */
  EAttribute getMinusDouble_VarName();

  /**
   * Returns the meta object for the attribute '{@link com.holycityaudio.spincad.spinCAD.MinusDouble#getHigh <em>High</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>High</em>'.
   * @see com.holycityaudio.spincad.spinCAD.MinusDouble#getHigh()
   * @see #getMinusDouble()
   * @generated
   */
  EAttribute getMinusDouble_High();

  /**
   * Returns the meta object for the attribute '{@link com.holycityaudio.spincad.spinCAD.MinusDouble#getLow <em>Low</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Low</em>'.
   * @see com.holycityaudio.spincad.spinCAD.MinusDouble#getLow()
   * @see #getMinusDouble()
   * @generated
   */
  EAttribute getMinusDouble_Low();

  /**
   * Returns the meta object for class '{@link com.holycityaudio.spincad.spinCAD.DivideDouble <em>Divide Double</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Divide Double</em>'.
   * @see com.holycityaudio.spincad.spinCAD.DivideDouble
   * @generated
   */
  EClass getDivideDouble();

  /**
   * Returns the meta object for the attribute '{@link com.holycityaudio.spincad.spinCAD.DivideDouble#getVarName <em>Var Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Var Name</em>'.
   * @see com.holycityaudio.spincad.spinCAD.DivideDouble#getVarName()
   * @see #getDivideDouble()
   * @generated
   */
  EAttribute getDivideDouble_VarName();

  /**
   * Returns the meta object for the attribute '{@link com.holycityaudio.spincad.spinCAD.DivideDouble#getHigh <em>High</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>High</em>'.
   * @see com.holycityaudio.spincad.spinCAD.DivideDouble#getHigh()
   * @see #getDivideDouble()
   * @generated
   */
  EAttribute getDivideDouble_High();

  /**
   * Returns the meta object for the attribute '{@link com.holycityaudio.spincad.spinCAD.DivideDouble#getLow <em>Low</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Low</em>'.
   * @see com.holycityaudio.spincad.spinCAD.DivideDouble#getLow()
   * @see #getDivideDouble()
   * @generated
   */
  EAttribute getDivideDouble_Low();

  /**
   * Returns the meta object for class '{@link com.holycityaudio.spincad.spinCAD.Equals <em>Equals</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Equals</em>'.
   * @see com.holycityaudio.spincad.spinCAD.Equals
   * @generated
   */
  EClass getEquals();

  /**
   * Returns the meta object for the attribute '{@link com.holycityaudio.spincad.spinCAD.Equals#getVarName <em>Var Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Var Name</em>'.
   * @see com.holycityaudio.spincad.spinCAD.Equals#getVarName()
   * @see #getEquals()
   * @generated
   */
  EAttribute getEquals_VarName();

  /**
   * Returns the meta object for the attribute '{@link com.holycityaudio.spincad.spinCAD.Equals#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see com.holycityaudio.spincad.spinCAD.Equals#getValue()
   * @see #getEquals()
   * @generated
   */
  EAttribute getEquals_Value();

  /**
   * Returns the meta object for class '{@link com.holycityaudio.spincad.spinCAD.EqualsBool <em>Equals Bool</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Equals Bool</em>'.
   * @see com.holycityaudio.spincad.spinCAD.EqualsBool
   * @generated
   */
  EClass getEqualsBool();

  /**
   * Returns the meta object for the attribute '{@link com.holycityaudio.spincad.spinCAD.EqualsBool#getVarName <em>Var Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Var Name</em>'.
   * @see com.holycityaudio.spincad.spinCAD.EqualsBool#getVarName()
   * @see #getEqualsBool()
   * @generated
   */
  EAttribute getEqualsBool_VarName();

  /**
   * Returns the meta object for the attribute '{@link com.holycityaudio.spincad.spinCAD.EqualsBool#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see com.holycityaudio.spincad.spinCAD.EqualsBool#getValue()
   * @see #getEqualsBool()
   * @generated
   */
  EAttribute getEqualsBool_Value();

  /**
   * Returns the meta object for class '{@link com.holycityaudio.spincad.spinCAD.DivideInt <em>Divide Int</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Divide Int</em>'.
   * @see com.holycityaudio.spincad.spinCAD.DivideInt
   * @generated
   */
  EClass getDivideInt();

  /**
   * Returns the meta object for the attribute '{@link com.holycityaudio.spincad.spinCAD.DivideInt#getVarName <em>Var Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Var Name</em>'.
   * @see com.holycityaudio.spincad.spinCAD.DivideInt#getVarName()
   * @see #getDivideInt()
   * @generated
   */
  EAttribute getDivideInt_VarName();

  /**
   * Returns the meta object for the attribute '{@link com.holycityaudio.spincad.spinCAD.DivideInt#getHigh <em>High</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>High</em>'.
   * @see com.holycityaudio.spincad.spinCAD.DivideInt#getHigh()
   * @see #getDivideInt()
   * @generated
   */
  EAttribute getDivideInt_High();

  /**
   * Returns the meta object for the attribute '{@link com.holycityaudio.spincad.spinCAD.DivideInt#getLow <em>Low</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Low</em>'.
   * @see com.holycityaudio.spincad.spinCAD.DivideInt#getLow()
   * @see #getDivideInt()
   * @generated
   */
  EAttribute getDivideInt_Low();

  /**
   * Returns the meta object for class '{@link com.holycityaudio.spincad.spinCAD.MultiplyDouble <em>Multiply Double</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Multiply Double</em>'.
   * @see com.holycityaudio.spincad.spinCAD.MultiplyDouble
   * @generated
   */
  EClass getMultiplyDouble();

  /**
   * Returns the meta object for the attribute '{@link com.holycityaudio.spincad.spinCAD.MultiplyDouble#getVarName <em>Var Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Var Name</em>'.
   * @see com.holycityaudio.spincad.spinCAD.MultiplyDouble#getVarName()
   * @see #getMultiplyDouble()
   * @generated
   */
  EAttribute getMultiplyDouble_VarName();

  /**
   * Returns the meta object for the attribute '{@link com.holycityaudio.spincad.spinCAD.MultiplyDouble#getHigh <em>High</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>High</em>'.
   * @see com.holycityaudio.spincad.spinCAD.MultiplyDouble#getHigh()
   * @see #getMultiplyDouble()
   * @generated
   */
  EAttribute getMultiplyDouble_High();

  /**
   * Returns the meta object for the attribute '{@link com.holycityaudio.spincad.spinCAD.MultiplyDouble#getLow <em>Low</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Low</em>'.
   * @see com.holycityaudio.spincad.spinCAD.MultiplyDouble#getLow()
   * @see #getMultiplyDouble()
   * @generated
   */
  EAttribute getMultiplyDouble_Low();

  /**
   * Returns the meta object for class '{@link com.holycityaudio.spincad.spinCAD.SetChorusWidth <em>Set Chorus Width</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Set Chorus Width</em>'.
   * @see com.holycityaudio.spincad.spinCAD.SetChorusWidth
   * @generated
   */
  EClass getSetChorusWidth();

  /**
   * Returns the meta object for the attribute '{@link com.holycityaudio.spincad.spinCAD.SetChorusWidth#getVarName <em>Var Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Var Name</em>'.
   * @see com.holycityaudio.spincad.spinCAD.SetChorusWidth#getVarName()
   * @see #getSetChorusWidth()
   * @generated
   */
  EAttribute getSetChorusWidth_VarName();

  /**
   * Returns the meta object for the attribute '{@link com.holycityaudio.spincad.spinCAD.SetChorusWidth#getLength <em>Length</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Length</em>'.
   * @see com.holycityaudio.spincad.spinCAD.SetChorusWidth#getLength()
   * @see #getSetChorusWidth()
   * @generated
   */
  EAttribute getSetChorusWidth_Length();

  /**
   * Returns the meta object for the attribute '{@link com.holycityaudio.spincad.spinCAD.SetChorusWidth#getScale <em>Scale</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Scale</em>'.
   * @see com.holycityaudio.spincad.spinCAD.SetChorusWidth#getScale()
   * @see #getSetChorusWidth()
   * @generated
   */
  EAttribute getSetChorusWidth_Scale();

  /**
   * Returns the meta object for class '{@link com.holycityaudio.spincad.spinCAD.Instruction <em>Instruction</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Instruction</em>'.
   * @see com.holycityaudio.spincad.spinCAD.Instruction
   * @generated
   */
  EClass getInstruction();

  /**
   * Returns the meta object for class '{@link com.holycityaudio.spincad.spinCAD.Inst_B6_S1_14 <em>Inst B6 S1 14</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Inst B6 S1 14</em>'.
   * @see com.holycityaudio.spincad.spinCAD.Inst_B6_S1_14
   * @generated
   */
  EClass getInst_B6_S1_14();

  /**
   * Returns the meta object for the attribute '{@link com.holycityaudio.spincad.spinCAD.Inst_B6_S1_14#getArg1 <em>Arg1</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Arg1</em>'.
   * @see com.holycityaudio.spincad.spinCAD.Inst_B6_S1_14#getArg1()
   * @see #getInst_B6_S1_14()
   * @generated
   */
  EAttribute getInst_B6_S1_14_Arg1();

  /**
   * Returns the meta object for the attribute '{@link com.holycityaudio.spincad.spinCAD.Inst_B6_S1_14#getArg2 <em>Arg2</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Arg2</em>'.
   * @see com.holycityaudio.spincad.spinCAD.Inst_B6_S1_14#getArg2()
   * @see #getInst_B6_S1_14()
   * @generated
   */
  EAttribute getInst_B6_S1_14_Arg2();

  /**
   * Returns the meta object for class '{@link com.holycityaudio.spincad.spinCAD.Inst_B15_S1_9 <em>Inst B15 S1 9</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Inst B15 S1 9</em>'.
   * @see com.holycityaudio.spincad.spinCAD.Inst_B15_S1_9
   * @generated
   */
  EClass getInst_B15_S1_9();

  /**
   * Returns the meta object for the containment reference '{@link com.holycityaudio.spincad.spinCAD.Inst_B15_S1_9#getArg1 <em>Arg1</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Arg1</em>'.
   * @see com.holycityaudio.spincad.spinCAD.Inst_B15_S1_9#getArg1()
   * @see #getInst_B15_S1_9()
   * @generated
   */
  EReference getInst_B15_S1_9_Arg1();

  /**
   * Returns the meta object for the attribute '{@link com.holycityaudio.spincad.spinCAD.Inst_B15_S1_9#getArg2 <em>Arg2</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Arg2</em>'.
   * @see com.holycityaudio.spincad.spinCAD.Inst_B15_S1_9#getArg2()
   * @see #getInst_B15_S1_9()
   * @generated
   */
  EAttribute getInst_B15_S1_9_Arg2();

  /**
   * Returns the meta object for class '{@link com.holycityaudio.spincad.spinCAD.Inst_B6 <em>Inst B6</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Inst B6</em>'.
   * @see com.holycityaudio.spincad.spinCAD.Inst_B6
   * @generated
   */
  EClass getInst_B6();

  /**
   * Returns the meta object for the attribute '{@link com.holycityaudio.spincad.spinCAD.Inst_B6#getArg1 <em>Arg1</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Arg1</em>'.
   * @see com.holycityaudio.spincad.spinCAD.Inst_B6#getArg1()
   * @see #getInst_B6()
   * @generated
   */
  EAttribute getInst_B6_Arg1();

  /**
   * Returns the meta object for class '{@link com.holycityaudio.spincad.spinCAD.Inst_B24 <em>Inst B24</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Inst B24</em>'.
   * @see com.holycityaudio.spincad.spinCAD.Inst_B24
   * @generated
   */
  EClass getInst_B24();

  /**
   * Returns the meta object for the attribute '{@link com.holycityaudio.spincad.spinCAD.Inst_B24#getArg1 <em>Arg1</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Arg1</em>'.
   * @see com.holycityaudio.spincad.spinCAD.Inst_B24#getArg1()
   * @see #getInst_B24()
   * @generated
   */
  EAttribute getInst_B24_Arg1();

  /**
   * Returns the meta object for class '{@link com.holycityaudio.spincad.spinCAD.Inst_X0 <em>Inst X0</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Inst X0</em>'.
   * @see com.holycityaudio.spincad.spinCAD.Inst_X0
   * @generated
   */
  EClass getInst_X0();

  /**
   * Returns the meta object for class '{@link com.holycityaudio.spincad.spinCAD.Inst_S1_14_S1_10 <em>Inst S1 14 S1 10</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Inst S1 14 S1 10</em>'.
   * @see com.holycityaudio.spincad.spinCAD.Inst_S1_14_S1_10
   * @generated
   */
  EClass getInst_S1_14_S1_10();

  /**
   * Returns the meta object for the attribute '{@link com.holycityaudio.spincad.spinCAD.Inst_S1_14_S1_10#getArg1 <em>Arg1</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Arg1</em>'.
   * @see com.holycityaudio.spincad.spinCAD.Inst_S1_14_S1_10#getArg1()
   * @see #getInst_S1_14_S1_10()
   * @generated
   */
  EAttribute getInst_S1_14_S1_10_Arg1();

  /**
   * Returns the meta object for the attribute '{@link com.holycityaudio.spincad.spinCAD.Inst_S1_14_S1_10#getArg2 <em>Arg2</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Arg2</em>'.
   * @see com.holycityaudio.spincad.spinCAD.Inst_S1_14_S1_10#getArg2()
   * @see #getInst_S1_14_S1_10()
   * @generated
   */
  EAttribute getInst_S1_14_S1_10_Arg2();

  /**
   * Returns the meta object for class '{@link com.holycityaudio.spincad.spinCAD.ReadRegister <em>Read Register</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Read Register</em>'.
   * @see com.holycityaudio.spincad.spinCAD.ReadRegister
   * @generated
   */
  EClass getReadRegister();

  /**
   * Returns the meta object for class '{@link com.holycityaudio.spincad.spinCAD.WriteRegisterLowshelf <em>Write Register Lowshelf</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Write Register Lowshelf</em>'.
   * @see com.holycityaudio.spincad.spinCAD.WriteRegisterLowshelf
   * @generated
   */
  EClass getWriteRegisterLowshelf();

  /**
   * Returns the meta object for class '{@link com.holycityaudio.spincad.spinCAD.WriteRegisterHighshelf <em>Write Register Highshelf</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Write Register Highshelf</em>'.
   * @see com.holycityaudio.spincad.spinCAD.WriteRegisterHighshelf
   * @generated
   */
  EClass getWriteRegisterHighshelf();

  /**
   * Returns the meta object for class '{@link com.holycityaudio.spincad.spinCAD.WriteRegister <em>Write Register</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Write Register</em>'.
   * @see com.holycityaudio.spincad.spinCAD.WriteRegister
   * @generated
   */
  EClass getWriteRegister();

  /**
   * Returns the meta object for class '{@link com.holycityaudio.spincad.spinCAD.Maxx <em>Maxx</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Maxx</em>'.
   * @see com.holycityaudio.spincad.spinCAD.Maxx
   * @generated
   */
  EClass getMaxx();

  /**
   * Returns the meta object for class '{@link com.holycityaudio.spincad.spinCAD.ReadRegisterFilter <em>Read Register Filter</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Read Register Filter</em>'.
   * @see com.holycityaudio.spincad.spinCAD.ReadRegisterFilter
   * @generated
   */
  EClass getReadRegisterFilter();

  /**
   * Returns the meta object for class '{@link com.holycityaudio.spincad.spinCAD.Mulx <em>Mulx</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Mulx</em>'.
   * @see com.holycityaudio.spincad.spinCAD.Mulx
   * @generated
   */
  EClass getMulx();

  /**
   * Returns the meta object for class '{@link com.holycityaudio.spincad.spinCAD.Ldax <em>Ldax</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Ldax</em>'.
   * @see com.holycityaudio.spincad.spinCAD.Ldax
   * @generated
   */
  EClass getLdax();

  /**
   * Returns the meta object for class '{@link com.holycityaudio.spincad.spinCAD.Exp <em>Exp</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Exp</em>'.
   * @see com.holycityaudio.spincad.spinCAD.Exp
   * @generated
   */
  EClass getExp();

  /**
   * Returns the meta object for class '{@link com.holycityaudio.spincad.spinCAD.Log <em>Log</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Log</em>'.
   * @see com.holycityaudio.spincad.spinCAD.Log
   * @generated
   */
  EClass getLog();

  /**
   * Returns the meta object for the attribute '{@link com.holycityaudio.spincad.spinCAD.Log#getArg1 <em>Arg1</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Arg1</em>'.
   * @see com.holycityaudio.spincad.spinCAD.Log#getArg1()
   * @see #getLog()
   * @generated
   */
  EAttribute getLog_Arg1();

  /**
   * Returns the meta object for the attribute '{@link com.holycityaudio.spincad.spinCAD.Log#getArg2 <em>Arg2</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Arg2</em>'.
   * @see com.holycityaudio.spincad.spinCAD.Log#getArg2()
   * @see #getLog()
   * @generated
   */
  EAttribute getLog_Arg2();

  /**
   * Returns the meta object for class '{@link com.holycityaudio.spincad.spinCAD.ScaleOffset <em>Scale Offset</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Scale Offset</em>'.
   * @see com.holycityaudio.spincad.spinCAD.ScaleOffset
   * @generated
   */
  EClass getScaleOffset();

  /**
   * Returns the meta object for class '{@link com.holycityaudio.spincad.spinCAD.WriteDelay <em>Write Delay</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Write Delay</em>'.
   * @see com.holycityaudio.spincad.spinCAD.WriteDelay
   * @generated
   */
  EClass getWriteDelay();

  /**
   * Returns the meta object for class '{@link com.holycityaudio.spincad.spinCAD.WriteAllpass <em>Write Allpass</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Write Allpass</em>'.
   * @see com.holycityaudio.spincad.spinCAD.WriteAllpass
   * @generated
   */
  EClass getWriteAllpass();

  /**
   * Returns the meta object for class '{@link com.holycityaudio.spincad.spinCAD.ReadDelay <em>Read Delay</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Read Delay</em>'.
   * @see com.holycityaudio.spincad.spinCAD.ReadDelay
   * @generated
   */
  EClass getReadDelay();

  /**
   * Returns the meta object for class '{@link com.holycityaudio.spincad.spinCAD.LoadSinLFO <em>Load Sin LFO</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Load Sin LFO</em>'.
   * @see com.holycityaudio.spincad.spinCAD.LoadSinLFO
   * @generated
   */
  EClass getLoadSinLFO();

  /**
   * Returns the meta object for the attribute '{@link com.holycityaudio.spincad.spinCAD.LoadSinLFO#getArg1 <em>Arg1</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Arg1</em>'.
   * @see com.holycityaudio.spincad.spinCAD.LoadSinLFO#getArg1()
   * @see #getLoadSinLFO()
   * @generated
   */
  EAttribute getLoadSinLFO_Arg1();

  /**
   * Returns the meta object for the attribute '{@link com.holycityaudio.spincad.spinCAD.LoadSinLFO#getArg2 <em>Arg2</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Arg2</em>'.
   * @see com.holycityaudio.spincad.spinCAD.LoadSinLFO#getArg2()
   * @see #getLoadSinLFO()
   * @generated
   */
  EAttribute getLoadSinLFO_Arg2();

  /**
   * Returns the meta object for the attribute '{@link com.holycityaudio.spincad.spinCAD.LoadSinLFO#getArg3 <em>Arg3</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Arg3</em>'.
   * @see com.holycityaudio.spincad.spinCAD.LoadSinLFO#getArg3()
   * @see #getLoadSinLFO()
   * @generated
   */
  EAttribute getLoadSinLFO_Arg3();

  /**
   * Returns the meta object for class '{@link com.holycityaudio.spincad.spinCAD.LoadRampLFO <em>Load Ramp LFO</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Load Ramp LFO</em>'.
   * @see com.holycityaudio.spincad.spinCAD.LoadRampLFO
   * @generated
   */
  EClass getLoadRampLFO();

  /**
   * Returns the meta object for the attribute '{@link com.holycityaudio.spincad.spinCAD.LoadRampLFO#getArg1 <em>Arg1</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Arg1</em>'.
   * @see com.holycityaudio.spincad.spinCAD.LoadRampLFO#getArg1()
   * @see #getLoadRampLFO()
   * @generated
   */
  EAttribute getLoadRampLFO_Arg1();

  /**
   * Returns the meta object for the attribute '{@link com.holycityaudio.spincad.spinCAD.LoadRampLFO#getArg2 <em>Arg2</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Arg2</em>'.
   * @see com.holycityaudio.spincad.spinCAD.LoadRampLFO#getArg2()
   * @see #getLoadRampLFO()
   * @generated
   */
  EAttribute getLoadRampLFO_Arg2();

  /**
   * Returns the meta object for the attribute '{@link com.holycityaudio.spincad.spinCAD.LoadRampLFO#getArg3 <em>Arg3</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Arg3</em>'.
   * @see com.holycityaudio.spincad.spinCAD.LoadRampLFO#getArg3()
   * @see #getLoadRampLFO()
   * @generated
   */
  EAttribute getLoadRampLFO_Arg3();

  /**
   * Returns the meta object for class '{@link com.holycityaudio.spincad.spinCAD.ChorusReadDelay <em>Chorus Read Delay</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Chorus Read Delay</em>'.
   * @see com.holycityaudio.spincad.spinCAD.ChorusReadDelay
   * @generated
   */
  EClass getChorusReadDelay();

  /**
   * Returns the meta object for the attribute '{@link com.holycityaudio.spincad.spinCAD.ChorusReadDelay#getArg1 <em>Arg1</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Arg1</em>'.
   * @see com.holycityaudio.spincad.spinCAD.ChorusReadDelay#getArg1()
   * @see #getChorusReadDelay()
   * @generated
   */
  EAttribute getChorusReadDelay_Arg1();

  /**
   * Returns the meta object for the attribute '{@link com.holycityaudio.spincad.spinCAD.ChorusReadDelay#getArg2 <em>Arg2</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Arg2</em>'.
   * @see com.holycityaudio.spincad.spinCAD.ChorusReadDelay#getArg2()
   * @see #getChorusReadDelay()
   * @generated
   */
  EAttribute getChorusReadDelay_Arg2();

  /**
   * Returns the meta object for the containment reference '{@link com.holycityaudio.spincad.spinCAD.ChorusReadDelay#getArg3 <em>Arg3</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Arg3</em>'.
   * @see com.holycityaudio.spincad.spinCAD.ChorusReadDelay#getArg3()
   * @see #getChorusReadDelay()
   * @generated
   */
  EReference getChorusReadDelay_Arg3();

  /**
   * Returns the meta object for class '{@link com.holycityaudio.spincad.spinCAD.ChorusReadValue <em>Chorus Read Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Chorus Read Value</em>'.
   * @see com.holycityaudio.spincad.spinCAD.ChorusReadValue
   * @generated
   */
  EClass getChorusReadValue();

  /**
   * Returns the meta object for the attribute '{@link com.holycityaudio.spincad.spinCAD.ChorusReadValue#getArg1 <em>Arg1</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Arg1</em>'.
   * @see com.holycityaudio.spincad.spinCAD.ChorusReadValue#getArg1()
   * @see #getChorusReadValue()
   * @generated
   */
  EAttribute getChorusReadValue_Arg1();

  /**
   * Returns the meta object for class '{@link com.holycityaudio.spincad.spinCAD.ChorusScaleOffset <em>Chorus Scale Offset</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Chorus Scale Offset</em>'.
   * @see com.holycityaudio.spincad.spinCAD.ChorusScaleOffset
   * @generated
   */
  EClass getChorusScaleOffset();

  /**
   * Returns the meta object for the attribute '{@link com.holycityaudio.spincad.spinCAD.ChorusScaleOffset#getArg1 <em>Arg1</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Arg1</em>'.
   * @see com.holycityaudio.spincad.spinCAD.ChorusScaleOffset#getArg1()
   * @see #getChorusScaleOffset()
   * @generated
   */
  EAttribute getChorusScaleOffset_Arg1();

  /**
   * Returns the meta object for the attribute '{@link com.holycityaudio.spincad.spinCAD.ChorusScaleOffset#getArg2 <em>Arg2</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Arg2</em>'.
   * @see com.holycityaudio.spincad.spinCAD.ChorusScaleOffset#getArg2()
   * @see #getChorusScaleOffset()
   * @generated
   */
  EAttribute getChorusScaleOffset_Arg2();

  /**
   * Returns the meta object for the attribute '{@link com.holycityaudio.spincad.spinCAD.ChorusScaleOffset#getArg3 <em>Arg3</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Arg3</em>'.
   * @see com.holycityaudio.spincad.spinCAD.ChorusScaleOffset#getArg3()
   * @see #getChorusScaleOffset()
   * @generated
   */
  EAttribute getChorusScaleOffset_Arg3();

  /**
   * Returns the meta object for class '{@link com.holycityaudio.spincad.spinCAD.ReadDelayPointer <em>Read Delay Pointer</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Read Delay Pointer</em>'.
   * @see com.holycityaudio.spincad.spinCAD.ReadDelayPointer
   * @generated
   */
  EClass getReadDelayPointer();

  /**
   * Returns the meta object for the attribute '{@link com.holycityaudio.spincad.spinCAD.ReadDelayPointer#getArg1 <em>Arg1</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Arg1</em>'.
   * @see com.holycityaudio.spincad.spinCAD.ReadDelayPointer#getArg1()
   * @see #getReadDelayPointer()
   * @generated
   */
  EAttribute getReadDelayPointer_Arg1();

  /**
   * Returns the meta object for class '{@link com.holycityaudio.spincad.spinCAD.And <em>And</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>And</em>'.
   * @see com.holycityaudio.spincad.spinCAD.And
   * @generated
   */
  EClass getAnd();

  /**
   * Returns the meta object for class '{@link com.holycityaudio.spincad.spinCAD.Or <em>Or</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Or</em>'.
   * @see com.holycityaudio.spincad.spinCAD.Or
   * @generated
   */
  EClass getOr();

  /**
   * Returns the meta object for class '{@link com.holycityaudio.spincad.spinCAD.Xor <em>Xor</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Xor</em>'.
   * @see com.holycityaudio.spincad.spinCAD.Xor
   * @generated
   */
  EClass getXor();

  /**
   * Returns the meta object for class '{@link com.holycityaudio.spincad.spinCAD.Jam <em>Jam</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Jam</em>'.
   * @see com.holycityaudio.spincad.spinCAD.Jam
   * @generated
   */
  EClass getJam();

  /**
   * Returns the meta object for the attribute '{@link com.holycityaudio.spincad.spinCAD.Jam#getArg1 <em>Arg1</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Arg1</em>'.
   * @see com.holycityaudio.spincad.spinCAD.Jam#getArg1()
   * @see #getJam()
   * @generated
   */
  EAttribute getJam_Arg1();

  /**
   * Returns the meta object for class '{@link com.holycityaudio.spincad.spinCAD.Clr <em>Clr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Clr</em>'.
   * @see com.holycityaudio.spincad.spinCAD.Clr
   * @generated
   */
  EClass getClr();

  /**
   * Returns the meta object for class '{@link com.holycityaudio.spincad.spinCAD.Not <em>Not</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Not</em>'.
   * @see com.holycityaudio.spincad.spinCAD.Not
   * @generated
   */
  EClass getNot();

  /**
   * Returns the meta object for class '{@link com.holycityaudio.spincad.spinCAD.Absa <em>Absa</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Absa</em>'.
   * @see com.holycityaudio.spincad.spinCAD.Absa
   * @generated
   */
  EClass getAbsa();

  /**
   * Returns the meta object for class '{@link com.holycityaudio.spincad.spinCAD.Skip <em>Skip</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Skip</em>'.
   * @see com.holycityaudio.spincad.spinCAD.Skip
   * @generated
   */
  EClass getSkip();

  /**
   * Returns the meta object for the attribute '{@link com.holycityaudio.spincad.spinCAD.Skip#getFlags <em>Flags</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Flags</em>'.
   * @see com.holycityaudio.spincad.spinCAD.Skip#getFlags()
   * @see #getSkip()
   * @generated
   */
  EAttribute getSkip_Flags();

  /**
   * Returns the meta object for the reference '{@link com.holycityaudio.spincad.spinCAD.Skip#getLabel <em>Label</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Label</em>'.
   * @see com.holycityaudio.spincad.spinCAD.Skip#getLabel()
   * @see #getSkip()
   * @generated
   */
  EReference getSkip_Label();

  /**
   * Returns the meta object for class '{@link com.holycityaudio.spincad.spinCAD.SPINMEM <em>SPINMEM</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>SPINMEM</em>'.
   * @see com.holycityaudio.spincad.spinCAD.SPINMEM
   * @generated
   */
  EClass getSPINMEM();

  /**
   * Returns the meta object for the attribute '{@link com.holycityaudio.spincad.spinCAD.SPINMEM#getBuffer <em>Buffer</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Buffer</em>'.
   * @see com.holycityaudio.spincad.spinCAD.SPINMEM#getBuffer()
   * @see #getSPINMEM()
   * @generated
   */
  EAttribute getSPINMEM_Buffer();

  /**
   * Returns the meta object for the attribute '{@link com.holycityaudio.spincad.spinCAD.SPINMEM#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see com.holycityaudio.spincad.spinCAD.SPINMEM#getValue()
   * @see #getSPINMEM()
   * @generated
   */
  EAttribute getSPINMEM_Value();

  /**
   * Returns the meta object for the attribute '{@link com.holycityaudio.spincad.spinCAD.SPINMEM#getScale <em>Scale</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Scale</em>'.
   * @see com.holycityaudio.spincad.spinCAD.SPINMEM#getScale()
   * @see #getSPINMEM()
   * @generated
   */
  EAttribute getSPINMEM_Scale();

  /**
   * Returns the meta object for the reference '{@link com.holycityaudio.spincad.spinCAD.SPINMEM#getOffset <em>Offset</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Offset</em>'.
   * @see com.holycityaudio.spincad.spinCAD.SPINMEM#getOffset()
   * @see #getSPINMEM()
   * @generated
   */
  EReference getSPINMEM_Offset();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  SpinCADFactory getSpinCADFactory();

  /**
   * <!-- begin-user-doc -->
   * Defines literals for the meta objects that represent
   * <ul>
   *   <li>each class,</li>
   *   <li>each feature of each class,</li>
   *   <li>each enum,</li>
   *   <li>and each data type</li>
   * </ul>
   * <!-- end-user-doc -->
   * @generated
   */
  interface Literals
  {
    /**
     * The meta object literal for the '{@link com.holycityaudio.spincad.spinCAD.impl.ProgramImpl <em>Program</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.holycityaudio.spincad.spinCAD.impl.ProgramImpl
     * @see com.holycityaudio.spincad.spinCAD.impl.SpinCADPackageImpl#getProgram()
     * @generated
     */
    EClass PROGRAM = eINSTANCE.getProgram();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PROGRAM__NAME = eINSTANCE.getProgram_Name();

    /**
     * The meta object literal for the '<em><b>Color</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PROGRAM__COLOR = eINSTANCE.getProgram_Color();

    /**
     * The meta object literal for the '<em><b>Pins</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PROGRAM__PINS = eINSTANCE.getProgram_Pins();

    /**
     * The meta object literal for the '<em><b>Elements</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PROGRAM__ELEMENTS = eINSTANCE.getProgram_Elements();

    /**
     * The meta object literal for the '{@link com.holycityaudio.spincad.spinCAD.impl.PinImpl <em>Pin</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.holycityaudio.spincad.spinCAD.impl.PinImpl
     * @see com.holycityaudio.spincad.spinCAD.impl.SpinCADPackageImpl#getPin()
     * @generated
     */
    EClass PIN = eINSTANCE.getPin();

    /**
     * The meta object literal for the '<em><b>Var Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PIN__VAR_NAME = eINSTANCE.getPin_VarName();

    /**
     * The meta object literal for the '<em><b>Label</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PIN__LABEL = eINSTANCE.getPin_Label();

    /**
     * The meta object literal for the '{@link com.holycityaudio.spincad.spinCAD.impl.InputPinImpl <em>Input Pin</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.holycityaudio.spincad.spinCAD.impl.InputPinImpl
     * @see com.holycityaudio.spincad.spinCAD.impl.SpinCADPackageImpl#getInputPin()
     * @generated
     */
    EClass INPUT_PIN = eINSTANCE.getInputPin();

    /**
     * The meta object literal for the '{@link com.holycityaudio.spincad.spinCAD.impl.OutputPinImpl <em>Output Pin</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.holycityaudio.spincad.spinCAD.impl.OutputPinImpl
     * @see com.holycityaudio.spincad.spinCAD.impl.SpinCADPackageImpl#getOutputPin()
     * @generated
     */
    EClass OUTPUT_PIN = eINSTANCE.getOutputPin();

    /**
     * The meta object literal for the '{@link com.holycityaudio.spincad.spinCAD.impl.AudioInputImpl <em>Audio Input</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.holycityaudio.spincad.spinCAD.impl.AudioInputImpl
     * @see com.holycityaudio.spincad.spinCAD.impl.SpinCADPackageImpl#getAudioInput()
     * @generated
     */
    EClass AUDIO_INPUT = eINSTANCE.getAudioInput();

    /**
     * The meta object literal for the '{@link com.holycityaudio.spincad.spinCAD.impl.AudioOutputImpl <em>Audio Output</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.holycityaudio.spincad.spinCAD.impl.AudioOutputImpl
     * @see com.holycityaudio.spincad.spinCAD.impl.SpinCADPackageImpl#getAudioOutput()
     * @generated
     */
    EClass AUDIO_OUTPUT = eINSTANCE.getAudioOutput();

    /**
     * The meta object literal for the '{@link com.holycityaudio.spincad.spinCAD.impl.ControlInputImpl <em>Control Input</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.holycityaudio.spincad.spinCAD.impl.ControlInputImpl
     * @see com.holycityaudio.spincad.spinCAD.impl.SpinCADPackageImpl#getControlInput()
     * @generated
     */
    EClass CONTROL_INPUT = eINSTANCE.getControlInput();

    /**
     * The meta object literal for the '{@link com.holycityaudio.spincad.spinCAD.impl.ControlOutputImpl <em>Control Output</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.holycityaudio.spincad.spinCAD.impl.ControlOutputImpl
     * @see com.holycityaudio.spincad.spinCAD.impl.SpinCADPackageImpl#getControlOutput()
     * @generated
     */
    EClass CONTROL_OUTPUT = eINSTANCE.getControlOutput();

    /**
     * The meta object literal for the '{@link com.holycityaudio.spincad.spinCAD.impl.SpinElementImpl <em>Spin Element</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.holycityaudio.spincad.spinCAD.impl.SpinElementImpl
     * @see com.holycityaudio.spincad.spinCAD.impl.SpinCADPackageImpl#getSpinElement()
     * @generated
     */
    EClass SPIN_ELEMENT = eINSTANCE.getSpinElement();

    /**
     * The meta object literal for the '{@link com.holycityaudio.spincad.spinCAD.impl.SpinEquateImpl <em>Spin Equate</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.holycityaudio.spincad.spinCAD.impl.SpinEquateImpl
     * @see com.holycityaudio.spincad.spinCAD.impl.SpinCADPackageImpl#getSpinEquate()
     * @generated
     */
    EClass SPIN_EQUATE = eINSTANCE.getSpinEquate();

    /**
     * The meta object literal for the '<em><b>Ename</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SPIN_EQUATE__ENAME = eINSTANCE.getSpinEquate_Ename();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SPIN_EQUATE__VALUE = eINSTANCE.getSpinEquate_Value();

    /**
     * The meta object literal for the '{@link com.holycityaudio.spincad.spinCAD.impl.SpinIntImpl <em>Spin Int</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.holycityaudio.spincad.spinCAD.impl.SpinIntImpl
     * @see com.holycityaudio.spincad.spinCAD.impl.SpinCADPackageImpl#getSpinInt()
     * @generated
     */
    EClass SPIN_INT = eINSTANCE.getSpinInt();

    /**
     * The meta object literal for the '<em><b>Ename</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SPIN_INT__ENAME = eINSTANCE.getSpinInt_Ename();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SPIN_INT__VALUE = eINSTANCE.getSpinInt_Value();

    /**
     * The meta object literal for the '{@link com.holycityaudio.spincad.spinCAD.impl.MemImpl <em>Mem</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.holycityaudio.spincad.spinCAD.impl.MemImpl
     * @see com.holycityaudio.spincad.spinCAD.impl.SpinCADPackageImpl#getMem()
     * @generated
     */
    EClass MEM = eINSTANCE.getMem();

    /**
     * The meta object literal for the '<em><b>Buffer</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute MEM__BUFFER = eINSTANCE.getMem_Buffer();

    /**
     * The meta object literal for the '<em><b>Length</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute MEM__LENGTH = eINSTANCE.getMem_Length();

    /**
     * The meta object literal for the '{@link com.holycityaudio.spincad.spinCAD.impl.OffsetImpl <em>Offset</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.holycityaudio.spincad.spinCAD.impl.OffsetImpl
     * @see com.holycityaudio.spincad.spinCAD.impl.SpinCADPackageImpl#getOffset()
     * @generated
     */
    EClass OFFSET = eINSTANCE.getOffset();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute OFFSET__NAME = eINSTANCE.getOffset_Name();

    /**
     * The meta object literal for the '<em><b>Length</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute OFFSET__LENGTH = eINSTANCE.getOffset_Length();

    /**
     * The meta object literal for the '{@link com.holycityaudio.spincad.spinCAD.impl.SpinBoolImpl <em>Spin Bool</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.holycityaudio.spincad.spinCAD.impl.SpinBoolImpl
     * @see com.holycityaudio.spincad.spinCAD.impl.SpinCADPackageImpl#getSpinBool()
     * @generated
     */
    EClass SPIN_BOOL = eINSTANCE.getSpinBool();

    /**
     * The meta object literal for the '<em><b>Label</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SPIN_BOOL__LABEL = eINSTANCE.getSpinBool_Label();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SPIN_BOOL__VALUE = eINSTANCE.getSpinBool_Value();

    /**
     * The meta object literal for the '{@link com.holycityaudio.spincad.spinCAD.impl.ControlImpl <em>Control</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.holycityaudio.spincad.spinCAD.impl.ControlImpl
     * @see com.holycityaudio.spincad.spinCAD.impl.SpinCADPackageImpl#getControl()
     * @generated
     */
    EClass CONTROL = eINSTANCE.getControl();

    /**
     * The meta object literal for the '<em><b>Ename</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CONTROL__ENAME = eINSTANCE.getControl_Ename();

    /**
     * The meta object literal for the '{@link com.holycityaudio.spincad.spinCAD.impl.SpinSliderLabelImpl <em>Spin Slider Label</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.holycityaudio.spincad.spinCAD.impl.SpinSliderLabelImpl
     * @see com.holycityaudio.spincad.spinCAD.impl.SpinCADPackageImpl#getSpinSliderLabel()
     * @generated
     */
    EClass SPIN_SLIDER_LABEL = eINSTANCE.getSpinSliderLabel();

    /**
     * The meta object literal for the '<em><b>Control Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SPIN_SLIDER_LABEL__CONTROL_NAME = eINSTANCE.getSpinSliderLabel_ControlName();

    /**
     * The meta object literal for the '<em><b>Min Val</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SPIN_SLIDER_LABEL__MIN_VAL = eINSTANCE.getSpinSliderLabel_MinVal();

    /**
     * The meta object literal for the '<em><b>Max Val</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SPIN_SLIDER_LABEL__MAX_VAL = eINSTANCE.getSpinSliderLabel_MaxVal();

    /**
     * The meta object literal for the '<em><b>Init Val</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SPIN_SLIDER_LABEL__INIT_VAL = eINSTANCE.getSpinSliderLabel_InitVal();

    /**
     * The meta object literal for the '<em><b>Multiplier</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SPIN_SLIDER_LABEL__MULTIPLIER = eINSTANCE.getSpinSliderLabel_Multiplier();

    /**
     * The meta object literal for the '<em><b>Precision</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SPIN_SLIDER_LABEL__PRECISION = eINSTANCE.getSpinSliderLabel_Precision();

    /**
     * The meta object literal for the '<em><b>Option</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SPIN_SLIDER_LABEL__OPTION = eINSTANCE.getSpinSliderLabel_Option();

    /**
     * The meta object literal for the '{@link com.holycityaudio.spincad.spinCAD.impl.SliderLabelSpinnerImpl <em>Slider Label Spinner</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.holycityaudio.spincad.spinCAD.impl.SliderLabelSpinnerImpl
     * @see com.holycityaudio.spincad.spinCAD.impl.SpinCADPackageImpl#getSliderLabelSpinner()
     * @generated
     */
    EClass SLIDER_LABEL_SPINNER = eINSTANCE.getSliderLabelSpinner();

    /**
     * The meta object literal for the '<em><b>Control Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SLIDER_LABEL_SPINNER__CONTROL_NAME = eINSTANCE.getSliderLabelSpinner_ControlName();

    /**
     * The meta object literal for the '<em><b>Min Val</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SLIDER_LABEL_SPINNER__MIN_VAL = eINSTANCE.getSliderLabelSpinner_MinVal();

    /**
     * The meta object literal for the '<em><b>Max Val</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SLIDER_LABEL_SPINNER__MAX_VAL = eINSTANCE.getSliderLabelSpinner_MaxVal();

    /**
     * The meta object literal for the '<em><b>Init Val</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SLIDER_LABEL_SPINNER__INIT_VAL = eINSTANCE.getSliderLabelSpinner_InitVal();

    /**
     * The meta object literal for the '<em><b>Multiplier</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SLIDER_LABEL_SPINNER__MULTIPLIER = eINSTANCE.getSliderLabelSpinner_Multiplier();

    /**
     * The meta object literal for the '<em><b>Precision</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SLIDER_LABEL_SPINNER__PRECISION = eINSTANCE.getSliderLabelSpinner_Precision();

    /**
     * The meta object literal for the '<em><b>Option</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SLIDER_LABEL_SPINNER__OPTION = eINSTANCE.getSliderLabelSpinner_Option();

    /**
     * The meta object literal for the '{@link com.holycityaudio.spincad.spinCAD.impl.SliderLabelCheckBoxImpl <em>Slider Label Check Box</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.holycityaudio.spincad.spinCAD.impl.SliderLabelCheckBoxImpl
     * @see com.holycityaudio.spincad.spinCAD.impl.SpinCADPackageImpl#getSliderLabelCheckBox()
     * @generated
     */
    EClass SLIDER_LABEL_CHECK_BOX = eINSTANCE.getSliderLabelCheckBox();

    /**
     * The meta object literal for the '<em><b>Control Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SLIDER_LABEL_CHECK_BOX__CONTROL_NAME = eINSTANCE.getSliderLabelCheckBox_ControlName();

    /**
     * The meta object literal for the '<em><b>Min Val</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SLIDER_LABEL_CHECK_BOX__MIN_VAL = eINSTANCE.getSliderLabelCheckBox_MinVal();

    /**
     * The meta object literal for the '<em><b>Max Val</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SLIDER_LABEL_CHECK_BOX__MAX_VAL = eINSTANCE.getSliderLabelCheckBox_MaxVal();

    /**
     * The meta object literal for the '<em><b>Init Val</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SLIDER_LABEL_CHECK_BOX__INIT_VAL = eINSTANCE.getSliderLabelCheckBox_InitVal();

    /**
     * The meta object literal for the '<em><b>Multiplier</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SLIDER_LABEL_CHECK_BOX__MULTIPLIER = eINSTANCE.getSliderLabelCheckBox_Multiplier();

    /**
     * The meta object literal for the '<em><b>Precision</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SLIDER_LABEL_CHECK_BOX__PRECISION = eINSTANCE.getSliderLabelCheckBox_Precision();

    /**
     * The meta object literal for the '<em><b>Option</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SLIDER_LABEL_CHECK_BOX__OPTION = eINSTANCE.getSliderLabelCheckBox_Option();

    /**
     * The meta object literal for the '{@link com.holycityaudio.spincad.spinCAD.impl.SpinCheckBoxImpl <em>Spin Check Box</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.holycityaudio.spincad.spinCAD.impl.SpinCheckBoxImpl
     * @see com.holycityaudio.spincad.spinCAD.impl.SpinCADPackageImpl#getSpinCheckBox()
     * @generated
     */
    EClass SPIN_CHECK_BOX = eINSTANCE.getSpinCheckBox();

    /**
     * The meta object literal for the '<em><b>Control Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SPIN_CHECK_BOX__CONTROL_NAME = eINSTANCE.getSpinCheckBox_ControlName();

    /**
     * The meta object literal for the '{@link com.holycityaudio.spincad.spinCAD.impl.LogFreqSliderLabelImpl <em>Log Freq Slider Label</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.holycityaudio.spincad.spinCAD.impl.LogFreqSliderLabelImpl
     * @see com.holycityaudio.spincad.spinCAD.impl.SpinCADPackageImpl#getLogFreqSliderLabel()
     * @generated
     */
    EClass LOG_FREQ_SLIDER_LABEL = eINSTANCE.getLogFreqSliderLabel();

    /**
     * The meta object literal for the '<em><b>Control Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute LOG_FREQ_SLIDER_LABEL__CONTROL_NAME = eINSTANCE.getLogFreqSliderLabel_ControlName();

    /**
     * The meta object literal for the '<em><b>Min Val</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute LOG_FREQ_SLIDER_LABEL__MIN_VAL = eINSTANCE.getLogFreqSliderLabel_MinVal();

    /**
     * The meta object literal for the '<em><b>Max Val</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute LOG_FREQ_SLIDER_LABEL__MAX_VAL = eINSTANCE.getLogFreqSliderLabel_MaxVal();

    /**
     * The meta object literal for the '<em><b>Init Val</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute LOG_FREQ_SLIDER_LABEL__INIT_VAL = eINSTANCE.getLogFreqSliderLabel_InitVal();

    /**
     * The meta object literal for the '<em><b>Multiplier</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute LOG_FREQ_SLIDER_LABEL__MULTIPLIER = eINSTANCE.getLogFreqSliderLabel_Multiplier();

    /**
     * The meta object literal for the '<em><b>Precision</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute LOG_FREQ_SLIDER_LABEL__PRECISION = eINSTANCE.getLogFreqSliderLabel_Precision();

    /**
     * The meta object literal for the '<em><b>Option</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute LOG_FREQ_SLIDER_LABEL__OPTION = eINSTANCE.getLogFreqSliderLabel_Option();

    /**
     * The meta object literal for the '{@link com.holycityaudio.spincad.spinCAD.impl.LogFreq2SliderLabelImpl <em>Log Freq2 Slider Label</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.holycityaudio.spincad.spinCAD.impl.LogFreq2SliderLabelImpl
     * @see com.holycityaudio.spincad.spinCAD.impl.SpinCADPackageImpl#getLogFreq2SliderLabel()
     * @generated
     */
    EClass LOG_FREQ2_SLIDER_LABEL = eINSTANCE.getLogFreq2SliderLabel();

    /**
     * The meta object literal for the '<em><b>Control Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute LOG_FREQ2_SLIDER_LABEL__CONTROL_NAME = eINSTANCE.getLogFreq2SliderLabel_ControlName();

    /**
     * The meta object literal for the '<em><b>Min Val</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute LOG_FREQ2_SLIDER_LABEL__MIN_VAL = eINSTANCE.getLogFreq2SliderLabel_MinVal();

    /**
     * The meta object literal for the '<em><b>Max Val</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute LOG_FREQ2_SLIDER_LABEL__MAX_VAL = eINSTANCE.getLogFreq2SliderLabel_MaxVal();

    /**
     * The meta object literal for the '<em><b>Init Val</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute LOG_FREQ2_SLIDER_LABEL__INIT_VAL = eINSTANCE.getLogFreq2SliderLabel_InitVal();

    /**
     * The meta object literal for the '<em><b>Multiplier</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute LOG_FREQ2_SLIDER_LABEL__MULTIPLIER = eINSTANCE.getLogFreq2SliderLabel_Multiplier();

    /**
     * The meta object literal for the '<em><b>Precision</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute LOG_FREQ2_SLIDER_LABEL__PRECISION = eINSTANCE.getLogFreq2SliderLabel_Precision();

    /**
     * The meta object literal for the '<em><b>Option</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute LOG_FREQ2_SLIDER_LABEL__OPTION = eINSTANCE.getLogFreq2SliderLabel_Option();

    /**
     * The meta object literal for the '{@link com.holycityaudio.spincad.spinCAD.impl.SpinRadioButtonImpl <em>Spin Radio Button</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.holycityaudio.spincad.spinCAD.impl.SpinRadioButtonImpl
     * @see com.holycityaudio.spincad.spinCAD.impl.SpinCADPackageImpl#getSpinRadioButton()
     * @generated
     */
    EClass SPIN_RADIO_BUTTON = eINSTANCE.getSpinRadioButton();

    /**
     * The meta object literal for the '<em><b>Control Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SPIN_RADIO_BUTTON__CONTROL_NAME = eINSTANCE.getSpinRadioButton_ControlName();

    /**
     * The meta object literal for the '{@link com.holycityaudio.spincad.spinCAD.impl.SpinComboBoxImpl <em>Spin Combo Box</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.holycityaudio.spincad.spinCAD.impl.SpinComboBoxImpl
     * @see com.holycityaudio.spincad.spinCAD.impl.SpinCADPackageImpl#getSpinComboBox()
     * @generated
     */
    EClass SPIN_COMBO_BOX = eINSTANCE.getSpinComboBox();

    /**
     * The meta object literal for the '<em><b>Optiona</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SPIN_COMBO_BOX__OPTIONA = eINSTANCE.getSpinComboBox_Optiona();

    /**
     * The meta object literal for the '<em><b>Optionb</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SPIN_COMBO_BOX__OPTIONB = eINSTANCE.getSpinComboBox_Optionb();

    /**
     * The meta object literal for the '<em><b>Optionc</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SPIN_COMBO_BOX__OPTIONC = eINSTANCE.getSpinComboBox_Optionc();

    /**
     * The meta object literal for the '<em><b>Optiond</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SPIN_COMBO_BOX__OPTIOND = eINSTANCE.getSpinComboBox_Optiond();

    /**
     * The meta object literal for the '<em><b>Optione</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SPIN_COMBO_BOX__OPTIONE = eINSTANCE.getSpinComboBox_Optione();

    /**
     * The meta object literal for the '<em><b>Optionf</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SPIN_COMBO_BOX__OPTIONF = eINSTANCE.getSpinComboBox_Optionf();

    /**
     * The meta object literal for the '{@link com.holycityaudio.spincad.spinCAD.impl.CommentImpl <em>Comment</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.holycityaudio.spincad.spinCAD.impl.CommentImpl
     * @see com.holycityaudio.spincad.spinCAD.impl.SpinCADPackageImpl#getComment()
     * @generated
     */
    EClass COMMENT = eINSTANCE.getComment();

    /**
     * The meta object literal for the '<em><b>Remark</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute COMMENT__REMARK = eINSTANCE.getComment_Remark();

    /**
     * The meta object literal for the '{@link com.holycityaudio.spincad.spinCAD.impl.LabelImpl <em>Label</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.holycityaudio.spincad.spinCAD.impl.LabelImpl
     * @see com.holycityaudio.spincad.spinCAD.impl.SpinCADPackageImpl#getLabel()
     * @generated
     */
    EClass LABEL = eINSTANCE.getLabel();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute LABEL__NAME = eINSTANCE.getLabel_Name();

    /**
     * The meta object literal for the '{@link com.holycityaudio.spincad.spinCAD.impl.MacroImpl <em>Macro</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.holycityaudio.spincad.spinCAD.impl.MacroImpl
     * @see com.holycityaudio.spincad.spinCAD.impl.SpinCADPackageImpl#getMacro()
     * @generated
     */
    EClass MACRO = eINSTANCE.getMacro();

    /**
     * The meta object literal for the '{@link com.holycityaudio.spincad.spinCAD.impl.IsPinConnectedImpl <em>Is Pin Connected</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.holycityaudio.spincad.spinCAD.impl.IsPinConnectedImpl
     * @see com.holycityaudio.spincad.spinCAD.impl.SpinCADPackageImpl#getIsPinConnected()
     * @generated
     */
    EClass IS_PIN_CONNECTED = eINSTANCE.getIsPinConnected();

    /**
     * The meta object literal for the '<em><b>Arg1</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute IS_PIN_CONNECTED__ARG1 = eINSTANCE.getIsPinConnected_Arg1();

    /**
     * The meta object literal for the '{@link com.holycityaudio.spincad.spinCAD.impl.IsGreaterThanImpl <em>Is Greater Than</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.holycityaudio.spincad.spinCAD.impl.IsGreaterThanImpl
     * @see com.holycityaudio.spincad.spinCAD.impl.SpinCADPackageImpl#getIsGreaterThan()
     * @generated
     */
    EClass IS_GREATER_THAN = eINSTANCE.getIsGreaterThan();

    /**
     * The meta object literal for the '<em><b>Variable</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute IS_GREATER_THAN__VARIABLE = eINSTANCE.getIsGreaterThan_Variable();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute IS_GREATER_THAN__VALUE = eINSTANCE.getIsGreaterThan_Value();

    /**
     * The meta object literal for the '{@link com.holycityaudio.spincad.spinCAD.impl.IsLessThanImpl <em>Is Less Than</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.holycityaudio.spincad.spinCAD.impl.IsLessThanImpl
     * @see com.holycityaudio.spincad.spinCAD.impl.SpinCADPackageImpl#getIsLessThan()
     * @generated
     */
    EClass IS_LESS_THAN = eINSTANCE.getIsLessThan();

    /**
     * The meta object literal for the '<em><b>Variable</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute IS_LESS_THAN__VARIABLE = eINSTANCE.getIsLessThan_Variable();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute IS_LESS_THAN__VALUE = eINSTANCE.getIsLessThan_Value();

    /**
     * The meta object literal for the '{@link com.holycityaudio.spincad.spinCAD.impl.IsEqualToImpl <em>Is Equal To</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.holycityaudio.spincad.spinCAD.impl.IsEqualToImpl
     * @see com.holycityaudio.spincad.spinCAD.impl.SpinCADPackageImpl#getIsEqualTo()
     * @generated
     */
    EClass IS_EQUAL_TO = eINSTANCE.getIsEqualTo();

    /**
     * The meta object literal for the '<em><b>Variable</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute IS_EQUAL_TO__VARIABLE = eINSTANCE.getIsEqualTo_Variable();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute IS_EQUAL_TO__VALUE = eINSTANCE.getIsEqualTo_Value();

    /**
     * The meta object literal for the '{@link com.holycityaudio.spincad.spinCAD.impl.IsTrueImpl <em>Is True</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.holycityaudio.spincad.spinCAD.impl.IsTrueImpl
     * @see com.holycityaudio.spincad.spinCAD.impl.SpinCADPackageImpl#getIsTrue()
     * @generated
     */
    EClass IS_TRUE = eINSTANCE.getIsTrue();

    /**
     * The meta object literal for the '<em><b>Variable</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute IS_TRUE__VARIABLE = eINSTANCE.getIsTrue_Variable();

    /**
     * The meta object literal for the '{@link com.holycityaudio.spincad.spinCAD.impl.IsElseImpl <em>Is Else</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.holycityaudio.spincad.spinCAD.impl.IsElseImpl
     * @see com.holycityaudio.spincad.spinCAD.impl.SpinCADPackageImpl#getIsElse()
     * @generated
     */
    EClass IS_ELSE = eINSTANCE.getIsElse();

    /**
     * The meta object literal for the '{@link com.holycityaudio.spincad.spinCAD.impl.IsEndifImpl <em>Is Endif</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.holycityaudio.spincad.spinCAD.impl.IsEndifImpl
     * @see com.holycityaudio.spincad.spinCAD.impl.SpinCADPackageImpl#getIsEndif()
     * @generated
     */
    EClass IS_ENDIF = eINSTANCE.getIsEndif();

    /**
     * The meta object literal for the '{@link com.holycityaudio.spincad.spinCAD.impl.IsOrImpl <em>Is Or</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.holycityaudio.spincad.spinCAD.impl.IsOrImpl
     * @see com.holycityaudio.spincad.spinCAD.impl.SpinCADPackageImpl#getIsOr()
     * @generated
     */
    EClass IS_OR = eINSTANCE.getIsOr();

    /**
     * The meta object literal for the '<em><b>Var1</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute IS_OR__VAR1 = eINSTANCE.getIsOr_Var1();

    /**
     * The meta object literal for the '<em><b>Var2</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute IS_OR__VAR2 = eINSTANCE.getIsOr_Var2();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute IS_OR__VALUE = eINSTANCE.getIsOr_Value();

    /**
     * The meta object literal for the '{@link com.holycityaudio.spincad.spinCAD.impl.GetInputDefaultImpl <em>Get Input Default</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.holycityaudio.spincad.spinCAD.impl.GetInputDefaultImpl
     * @see com.holycityaudio.spincad.spinCAD.impl.SpinCADPackageImpl#getGetInputDefault()
     * @generated
     */
    EClass GET_INPUT_DEFAULT = eINSTANCE.getGetInputDefault();

    /**
     * The meta object literal for the '<em><b>Label</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute GET_INPUT_DEFAULT__LABEL = eINSTANCE.getGetInputDefault_Label();

    /**
     * The meta object literal for the '<em><b>Variable</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute GET_INPUT_DEFAULT__VARIABLE = eINSTANCE.getGetInputDefault_Variable();

    /**
     * The meta object literal for the '<em><b>Scale</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute GET_INPUT_DEFAULT__SCALE = eINSTANCE.getGetInputDefault_Scale();

    /**
     * The meta object literal for the '<em><b>Default Val</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute GET_INPUT_DEFAULT__DEFAULT_VAL = eINSTANCE.getGetInputDefault_DefaultVal();

    /**
     * The meta object literal for the '{@link com.holycityaudio.spincad.spinCAD.impl.GetDelayScaleControlImpl <em>Get Delay Scale Control</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.holycityaudio.spincad.spinCAD.impl.GetDelayScaleControlImpl
     * @see com.holycityaudio.spincad.spinCAD.impl.SpinCADPackageImpl#getGetDelayScaleControl()
     * @generated
     */
    EClass GET_DELAY_SCALE_CONTROL = eINSTANCE.getGetDelayScaleControl();

    /**
     * The meta object literal for the '<em><b>Ratio</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute GET_DELAY_SCALE_CONTROL__RATIO = eINSTANCE.getGetDelayScaleControl_Ratio();

    /**
     * The meta object literal for the '<em><b>Length</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute GET_DELAY_SCALE_CONTROL__LENGTH = eINSTANCE.getGetDelayScaleControl_Length();

    /**
     * The meta object literal for the '<em><b>Offset</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute GET_DELAY_SCALE_CONTROL__OFFSET = eINSTANCE.getGetDelayScaleControl_Offset();

    /**
     * The meta object literal for the '<em><b>Control</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute GET_DELAY_SCALE_CONTROL__CONTROL = eINSTANCE.getGetDelayScaleControl_Control();

    /**
     * The meta object literal for the '{@link com.holycityaudio.spincad.spinCAD.impl.ReadChorusTapImpl <em>Read Chorus Tap</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.holycityaudio.spincad.spinCAD.impl.ReadChorusTapImpl
     * @see com.holycityaudio.spincad.spinCAD.impl.SpinCADPackageImpl#getReadChorusTap()
     * @generated
     */
    EClass READ_CHORUS_TAP = eINSTANCE.getReadChorusTap();

    /**
     * The meta object literal for the '<em><b>Lfo</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute READ_CHORUS_TAP__LFO = eINSTANCE.getReadChorusTap_Lfo();

    /**
     * The meta object literal for the '<em><b>Phase</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute READ_CHORUS_TAP__PHASE = eINSTANCE.getReadChorusTap_Phase();

    /**
     * The meta object literal for the '<em><b>Ratio</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute READ_CHORUS_TAP__RATIO = eINSTANCE.getReadChorusTap_Ratio();

    /**
     * The meta object literal for the '<em><b>Length</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute READ_CHORUS_TAP__LENGTH = eINSTANCE.getReadChorusTap_Length();

    /**
     * The meta object literal for the '<em><b>Offset</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute READ_CHORUS_TAP__OFFSET = eINSTANCE.getReadChorusTap_Offset();

    /**
     * The meta object literal for the '{@link com.holycityaudio.spincad.spinCAD.impl.GetSamplesFromRatioImpl <em>Get Samples From Ratio</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.holycityaudio.spincad.spinCAD.impl.GetSamplesFromRatioImpl
     * @see com.holycityaudio.spincad.spinCAD.impl.SpinCADPackageImpl#getGetSamplesFromRatio()
     * @generated
     */
    EClass GET_SAMPLES_FROM_RATIO = eINSTANCE.getGetSamplesFromRatio();

    /**
     * The meta object literal for the '<em><b>Variable</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute GET_SAMPLES_FROM_RATIO__VARIABLE = eINSTANCE.getGetSamplesFromRatio_Variable();

    /**
     * The meta object literal for the '<em><b>Ratio</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute GET_SAMPLES_FROM_RATIO__RATIO = eINSTANCE.getGetSamplesFromRatio_Ratio();

    /**
     * The meta object literal for the '<em><b>Length</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute GET_SAMPLES_FROM_RATIO__LENGTH = eINSTANCE.getGetSamplesFromRatio_Length();

    /**
     * The meta object literal for the '{@link com.holycityaudio.spincad.spinCAD.impl.SemitonesToRmpRateImpl <em>Semitones To Rmp Rate</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.holycityaudio.spincad.spinCAD.impl.SemitonesToRmpRateImpl
     * @see com.holycityaudio.spincad.spinCAD.impl.SpinCADPackageImpl#getSemitonesToRmpRate()
     * @generated
     */
    EClass SEMITONES_TO_RMP_RATE = eINSTANCE.getSemitonesToRmpRate();

    /**
     * The meta object literal for the '<em><b>Variable</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SEMITONES_TO_RMP_RATE__VARIABLE = eINSTANCE.getSemitonesToRmpRate_Variable();

    /**
     * The meta object literal for the '<em><b>Semitones</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SEMITONES_TO_RMP_RATE__SEMITONES = eINSTANCE.getSemitonesToRmpRate_Semitones();

    /**
     * The meta object literal for the '{@link com.holycityaudio.spincad.spinCAD.impl.GetBaseAddressImpl <em>Get Base Address</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.holycityaudio.spincad.spinCAD.impl.GetBaseAddressImpl
     * @see com.holycityaudio.spincad.spinCAD.impl.SpinCADPackageImpl#getGetBaseAddress()
     * @generated
     */
    EClass GET_BASE_ADDRESS = eINSTANCE.getGetBaseAddress();

    /**
     * The meta object literal for the '{@link com.holycityaudio.spincad.spinCAD.impl.SetOutputPinImpl <em>Set Output Pin</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.holycityaudio.spincad.spinCAD.impl.SetOutputPinImpl
     * @see com.holycityaudio.spincad.spinCAD.impl.SpinCADPackageImpl#getSetOutputPin()
     * @generated
     */
    EClass SET_OUTPUT_PIN = eINSTANCE.getSetOutputPin();

    /**
     * The meta object literal for the '<em><b>Pin Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SET_OUTPUT_PIN__PIN_NAME = eINSTANCE.getSetOutputPin_PinName();

    /**
     * The meta object literal for the '<em><b>Var Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SET_OUTPUT_PIN__VAR_NAME = eINSTANCE.getSetOutputPin_VarName();

    /**
     * The meta object literal for the '{@link com.holycityaudio.spincad.spinCAD.impl.MinusDoubleImpl <em>Minus Double</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.holycityaudio.spincad.spinCAD.impl.MinusDoubleImpl
     * @see com.holycityaudio.spincad.spinCAD.impl.SpinCADPackageImpl#getMinusDouble()
     * @generated
     */
    EClass MINUS_DOUBLE = eINSTANCE.getMinusDouble();

    /**
     * The meta object literal for the '<em><b>Var Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute MINUS_DOUBLE__VAR_NAME = eINSTANCE.getMinusDouble_VarName();

    /**
     * The meta object literal for the '<em><b>High</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute MINUS_DOUBLE__HIGH = eINSTANCE.getMinusDouble_High();

    /**
     * The meta object literal for the '<em><b>Low</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute MINUS_DOUBLE__LOW = eINSTANCE.getMinusDouble_Low();

    /**
     * The meta object literal for the '{@link com.holycityaudio.spincad.spinCAD.impl.DivideDoubleImpl <em>Divide Double</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.holycityaudio.spincad.spinCAD.impl.DivideDoubleImpl
     * @see com.holycityaudio.spincad.spinCAD.impl.SpinCADPackageImpl#getDivideDouble()
     * @generated
     */
    EClass DIVIDE_DOUBLE = eINSTANCE.getDivideDouble();

    /**
     * The meta object literal for the '<em><b>Var Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DIVIDE_DOUBLE__VAR_NAME = eINSTANCE.getDivideDouble_VarName();

    /**
     * The meta object literal for the '<em><b>High</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DIVIDE_DOUBLE__HIGH = eINSTANCE.getDivideDouble_High();

    /**
     * The meta object literal for the '<em><b>Low</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DIVIDE_DOUBLE__LOW = eINSTANCE.getDivideDouble_Low();

    /**
     * The meta object literal for the '{@link com.holycityaudio.spincad.spinCAD.impl.EqualsImpl <em>Equals</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.holycityaudio.spincad.spinCAD.impl.EqualsImpl
     * @see com.holycityaudio.spincad.spinCAD.impl.SpinCADPackageImpl#getEquals()
     * @generated
     */
    EClass EQUALS = eINSTANCE.getEquals();

    /**
     * The meta object literal for the '<em><b>Var Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute EQUALS__VAR_NAME = eINSTANCE.getEquals_VarName();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute EQUALS__VALUE = eINSTANCE.getEquals_Value();

    /**
     * The meta object literal for the '{@link com.holycityaudio.spincad.spinCAD.impl.EqualsBoolImpl <em>Equals Bool</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.holycityaudio.spincad.spinCAD.impl.EqualsBoolImpl
     * @see com.holycityaudio.spincad.spinCAD.impl.SpinCADPackageImpl#getEqualsBool()
     * @generated
     */
    EClass EQUALS_BOOL = eINSTANCE.getEqualsBool();

    /**
     * The meta object literal for the '<em><b>Var Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute EQUALS_BOOL__VAR_NAME = eINSTANCE.getEqualsBool_VarName();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute EQUALS_BOOL__VALUE = eINSTANCE.getEqualsBool_Value();

    /**
     * The meta object literal for the '{@link com.holycityaudio.spincad.spinCAD.impl.DivideIntImpl <em>Divide Int</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.holycityaudio.spincad.spinCAD.impl.DivideIntImpl
     * @see com.holycityaudio.spincad.spinCAD.impl.SpinCADPackageImpl#getDivideInt()
     * @generated
     */
    EClass DIVIDE_INT = eINSTANCE.getDivideInt();

    /**
     * The meta object literal for the '<em><b>Var Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DIVIDE_INT__VAR_NAME = eINSTANCE.getDivideInt_VarName();

    /**
     * The meta object literal for the '<em><b>High</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DIVIDE_INT__HIGH = eINSTANCE.getDivideInt_High();

    /**
     * The meta object literal for the '<em><b>Low</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DIVIDE_INT__LOW = eINSTANCE.getDivideInt_Low();

    /**
     * The meta object literal for the '{@link com.holycityaudio.spincad.spinCAD.impl.MultiplyDoubleImpl <em>Multiply Double</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.holycityaudio.spincad.spinCAD.impl.MultiplyDoubleImpl
     * @see com.holycityaudio.spincad.spinCAD.impl.SpinCADPackageImpl#getMultiplyDouble()
     * @generated
     */
    EClass MULTIPLY_DOUBLE = eINSTANCE.getMultiplyDouble();

    /**
     * The meta object literal for the '<em><b>Var Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute MULTIPLY_DOUBLE__VAR_NAME = eINSTANCE.getMultiplyDouble_VarName();

    /**
     * The meta object literal for the '<em><b>High</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute MULTIPLY_DOUBLE__HIGH = eINSTANCE.getMultiplyDouble_High();

    /**
     * The meta object literal for the '<em><b>Low</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute MULTIPLY_DOUBLE__LOW = eINSTANCE.getMultiplyDouble_Low();

    /**
     * The meta object literal for the '{@link com.holycityaudio.spincad.spinCAD.impl.SetChorusWidthImpl <em>Set Chorus Width</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.holycityaudio.spincad.spinCAD.impl.SetChorusWidthImpl
     * @see com.holycityaudio.spincad.spinCAD.impl.SpinCADPackageImpl#getSetChorusWidth()
     * @generated
     */
    EClass SET_CHORUS_WIDTH = eINSTANCE.getSetChorusWidth();

    /**
     * The meta object literal for the '<em><b>Var Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SET_CHORUS_WIDTH__VAR_NAME = eINSTANCE.getSetChorusWidth_VarName();

    /**
     * The meta object literal for the '<em><b>Length</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SET_CHORUS_WIDTH__LENGTH = eINSTANCE.getSetChorusWidth_Length();

    /**
     * The meta object literal for the '<em><b>Scale</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SET_CHORUS_WIDTH__SCALE = eINSTANCE.getSetChorusWidth_Scale();

    /**
     * The meta object literal for the '{@link com.holycityaudio.spincad.spinCAD.impl.InstructionImpl <em>Instruction</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.holycityaudio.spincad.spinCAD.impl.InstructionImpl
     * @see com.holycityaudio.spincad.spinCAD.impl.SpinCADPackageImpl#getInstruction()
     * @generated
     */
    EClass INSTRUCTION = eINSTANCE.getInstruction();

    /**
     * The meta object literal for the '{@link com.holycityaudio.spincad.spinCAD.impl.Inst_B6_S1_14Impl <em>Inst B6 S1 14</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.holycityaudio.spincad.spinCAD.impl.Inst_B6_S1_14Impl
     * @see com.holycityaudio.spincad.spinCAD.impl.SpinCADPackageImpl#getInst_B6_S1_14()
     * @generated
     */
    EClass INST_B6_S1_14 = eINSTANCE.getInst_B6_S1_14();

    /**
     * The meta object literal for the '<em><b>Arg1</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute INST_B6_S1_14__ARG1 = eINSTANCE.getInst_B6_S1_14_Arg1();

    /**
     * The meta object literal for the '<em><b>Arg2</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute INST_B6_S1_14__ARG2 = eINSTANCE.getInst_B6_S1_14_Arg2();

    /**
     * The meta object literal for the '{@link com.holycityaudio.spincad.spinCAD.impl.Inst_B15_S1_9Impl <em>Inst B15 S1 9</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.holycityaudio.spincad.spinCAD.impl.Inst_B15_S1_9Impl
     * @see com.holycityaudio.spincad.spinCAD.impl.SpinCADPackageImpl#getInst_B15_S1_9()
     * @generated
     */
    EClass INST_B15_S1_9 = eINSTANCE.getInst_B15_S1_9();

    /**
     * The meta object literal for the '<em><b>Arg1</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference INST_B15_S1_9__ARG1 = eINSTANCE.getInst_B15_S1_9_Arg1();

    /**
     * The meta object literal for the '<em><b>Arg2</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute INST_B15_S1_9__ARG2 = eINSTANCE.getInst_B15_S1_9_Arg2();

    /**
     * The meta object literal for the '{@link com.holycityaudio.spincad.spinCAD.impl.Inst_B6Impl <em>Inst B6</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.holycityaudio.spincad.spinCAD.impl.Inst_B6Impl
     * @see com.holycityaudio.spincad.spinCAD.impl.SpinCADPackageImpl#getInst_B6()
     * @generated
     */
    EClass INST_B6 = eINSTANCE.getInst_B6();

    /**
     * The meta object literal for the '<em><b>Arg1</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute INST_B6__ARG1 = eINSTANCE.getInst_B6_Arg1();

    /**
     * The meta object literal for the '{@link com.holycityaudio.spincad.spinCAD.impl.Inst_B24Impl <em>Inst B24</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.holycityaudio.spincad.spinCAD.impl.Inst_B24Impl
     * @see com.holycityaudio.spincad.spinCAD.impl.SpinCADPackageImpl#getInst_B24()
     * @generated
     */
    EClass INST_B24 = eINSTANCE.getInst_B24();

    /**
     * The meta object literal for the '<em><b>Arg1</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute INST_B24__ARG1 = eINSTANCE.getInst_B24_Arg1();

    /**
     * The meta object literal for the '{@link com.holycityaudio.spincad.spinCAD.impl.Inst_X0Impl <em>Inst X0</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.holycityaudio.spincad.spinCAD.impl.Inst_X0Impl
     * @see com.holycityaudio.spincad.spinCAD.impl.SpinCADPackageImpl#getInst_X0()
     * @generated
     */
    EClass INST_X0 = eINSTANCE.getInst_X0();

    /**
     * The meta object literal for the '{@link com.holycityaudio.spincad.spinCAD.impl.Inst_S1_14_S1_10Impl <em>Inst S1 14 S1 10</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.holycityaudio.spincad.spinCAD.impl.Inst_S1_14_S1_10Impl
     * @see com.holycityaudio.spincad.spinCAD.impl.SpinCADPackageImpl#getInst_S1_14_S1_10()
     * @generated
     */
    EClass INST_S1_14_S1_10 = eINSTANCE.getInst_S1_14_S1_10();

    /**
     * The meta object literal for the '<em><b>Arg1</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute INST_S1_14_S1_10__ARG1 = eINSTANCE.getInst_S1_14_S1_10_Arg1();

    /**
     * The meta object literal for the '<em><b>Arg2</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute INST_S1_14_S1_10__ARG2 = eINSTANCE.getInst_S1_14_S1_10_Arg2();

    /**
     * The meta object literal for the '{@link com.holycityaudio.spincad.spinCAD.impl.ReadRegisterImpl <em>Read Register</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.holycityaudio.spincad.spinCAD.impl.ReadRegisterImpl
     * @see com.holycityaudio.spincad.spinCAD.impl.SpinCADPackageImpl#getReadRegister()
     * @generated
     */
    EClass READ_REGISTER = eINSTANCE.getReadRegister();

    /**
     * The meta object literal for the '{@link com.holycityaudio.spincad.spinCAD.impl.WriteRegisterLowshelfImpl <em>Write Register Lowshelf</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.holycityaudio.spincad.spinCAD.impl.WriteRegisterLowshelfImpl
     * @see com.holycityaudio.spincad.spinCAD.impl.SpinCADPackageImpl#getWriteRegisterLowshelf()
     * @generated
     */
    EClass WRITE_REGISTER_LOWSHELF = eINSTANCE.getWriteRegisterLowshelf();

    /**
     * The meta object literal for the '{@link com.holycityaudio.spincad.spinCAD.impl.WriteRegisterHighshelfImpl <em>Write Register Highshelf</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.holycityaudio.spincad.spinCAD.impl.WriteRegisterHighshelfImpl
     * @see com.holycityaudio.spincad.spinCAD.impl.SpinCADPackageImpl#getWriteRegisterHighshelf()
     * @generated
     */
    EClass WRITE_REGISTER_HIGHSHELF = eINSTANCE.getWriteRegisterHighshelf();

    /**
     * The meta object literal for the '{@link com.holycityaudio.spincad.spinCAD.impl.WriteRegisterImpl <em>Write Register</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.holycityaudio.spincad.spinCAD.impl.WriteRegisterImpl
     * @see com.holycityaudio.spincad.spinCAD.impl.SpinCADPackageImpl#getWriteRegister()
     * @generated
     */
    EClass WRITE_REGISTER = eINSTANCE.getWriteRegister();

    /**
     * The meta object literal for the '{@link com.holycityaudio.spincad.spinCAD.impl.MaxxImpl <em>Maxx</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.holycityaudio.spincad.spinCAD.impl.MaxxImpl
     * @see com.holycityaudio.spincad.spinCAD.impl.SpinCADPackageImpl#getMaxx()
     * @generated
     */
    EClass MAXX = eINSTANCE.getMaxx();

    /**
     * The meta object literal for the '{@link com.holycityaudio.spincad.spinCAD.impl.ReadRegisterFilterImpl <em>Read Register Filter</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.holycityaudio.spincad.spinCAD.impl.ReadRegisterFilterImpl
     * @see com.holycityaudio.spincad.spinCAD.impl.SpinCADPackageImpl#getReadRegisterFilter()
     * @generated
     */
    EClass READ_REGISTER_FILTER = eINSTANCE.getReadRegisterFilter();

    /**
     * The meta object literal for the '{@link com.holycityaudio.spincad.spinCAD.impl.MulxImpl <em>Mulx</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.holycityaudio.spincad.spinCAD.impl.MulxImpl
     * @see com.holycityaudio.spincad.spinCAD.impl.SpinCADPackageImpl#getMulx()
     * @generated
     */
    EClass MULX = eINSTANCE.getMulx();

    /**
     * The meta object literal for the '{@link com.holycityaudio.spincad.spinCAD.impl.LdaxImpl <em>Ldax</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.holycityaudio.spincad.spinCAD.impl.LdaxImpl
     * @see com.holycityaudio.spincad.spinCAD.impl.SpinCADPackageImpl#getLdax()
     * @generated
     */
    EClass LDAX = eINSTANCE.getLdax();

    /**
     * The meta object literal for the '{@link com.holycityaudio.spincad.spinCAD.impl.ExpImpl <em>Exp</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.holycityaudio.spincad.spinCAD.impl.ExpImpl
     * @see com.holycityaudio.spincad.spinCAD.impl.SpinCADPackageImpl#getExp()
     * @generated
     */
    EClass EXP = eINSTANCE.getExp();

    /**
     * The meta object literal for the '{@link com.holycityaudio.spincad.spinCAD.impl.LogImpl <em>Log</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.holycityaudio.spincad.spinCAD.impl.LogImpl
     * @see com.holycityaudio.spincad.spinCAD.impl.SpinCADPackageImpl#getLog()
     * @generated
     */
    EClass LOG = eINSTANCE.getLog();

    /**
     * The meta object literal for the '<em><b>Arg1</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute LOG__ARG1 = eINSTANCE.getLog_Arg1();

    /**
     * The meta object literal for the '<em><b>Arg2</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute LOG__ARG2 = eINSTANCE.getLog_Arg2();

    /**
     * The meta object literal for the '{@link com.holycityaudio.spincad.spinCAD.impl.ScaleOffsetImpl <em>Scale Offset</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.holycityaudio.spincad.spinCAD.impl.ScaleOffsetImpl
     * @see com.holycityaudio.spincad.spinCAD.impl.SpinCADPackageImpl#getScaleOffset()
     * @generated
     */
    EClass SCALE_OFFSET = eINSTANCE.getScaleOffset();

    /**
     * The meta object literal for the '{@link com.holycityaudio.spincad.spinCAD.impl.WriteDelayImpl <em>Write Delay</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.holycityaudio.spincad.spinCAD.impl.WriteDelayImpl
     * @see com.holycityaudio.spincad.spinCAD.impl.SpinCADPackageImpl#getWriteDelay()
     * @generated
     */
    EClass WRITE_DELAY = eINSTANCE.getWriteDelay();

    /**
     * The meta object literal for the '{@link com.holycityaudio.spincad.spinCAD.impl.WriteAllpassImpl <em>Write Allpass</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.holycityaudio.spincad.spinCAD.impl.WriteAllpassImpl
     * @see com.holycityaudio.spincad.spinCAD.impl.SpinCADPackageImpl#getWriteAllpass()
     * @generated
     */
    EClass WRITE_ALLPASS = eINSTANCE.getWriteAllpass();

    /**
     * The meta object literal for the '{@link com.holycityaudio.spincad.spinCAD.impl.ReadDelayImpl <em>Read Delay</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.holycityaudio.spincad.spinCAD.impl.ReadDelayImpl
     * @see com.holycityaudio.spincad.spinCAD.impl.SpinCADPackageImpl#getReadDelay()
     * @generated
     */
    EClass READ_DELAY = eINSTANCE.getReadDelay();

    /**
     * The meta object literal for the '{@link com.holycityaudio.spincad.spinCAD.impl.LoadSinLFOImpl <em>Load Sin LFO</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.holycityaudio.spincad.spinCAD.impl.LoadSinLFOImpl
     * @see com.holycityaudio.spincad.spinCAD.impl.SpinCADPackageImpl#getLoadSinLFO()
     * @generated
     */
    EClass LOAD_SIN_LFO = eINSTANCE.getLoadSinLFO();

    /**
     * The meta object literal for the '<em><b>Arg1</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute LOAD_SIN_LFO__ARG1 = eINSTANCE.getLoadSinLFO_Arg1();

    /**
     * The meta object literal for the '<em><b>Arg2</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute LOAD_SIN_LFO__ARG2 = eINSTANCE.getLoadSinLFO_Arg2();

    /**
     * The meta object literal for the '<em><b>Arg3</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute LOAD_SIN_LFO__ARG3 = eINSTANCE.getLoadSinLFO_Arg3();

    /**
     * The meta object literal for the '{@link com.holycityaudio.spincad.spinCAD.impl.LoadRampLFOImpl <em>Load Ramp LFO</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.holycityaudio.spincad.spinCAD.impl.LoadRampLFOImpl
     * @see com.holycityaudio.spincad.spinCAD.impl.SpinCADPackageImpl#getLoadRampLFO()
     * @generated
     */
    EClass LOAD_RAMP_LFO = eINSTANCE.getLoadRampLFO();

    /**
     * The meta object literal for the '<em><b>Arg1</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute LOAD_RAMP_LFO__ARG1 = eINSTANCE.getLoadRampLFO_Arg1();

    /**
     * The meta object literal for the '<em><b>Arg2</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute LOAD_RAMP_LFO__ARG2 = eINSTANCE.getLoadRampLFO_Arg2();

    /**
     * The meta object literal for the '<em><b>Arg3</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute LOAD_RAMP_LFO__ARG3 = eINSTANCE.getLoadRampLFO_Arg3();

    /**
     * The meta object literal for the '{@link com.holycityaudio.spincad.spinCAD.impl.ChorusReadDelayImpl <em>Chorus Read Delay</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.holycityaudio.spincad.spinCAD.impl.ChorusReadDelayImpl
     * @see com.holycityaudio.spincad.spinCAD.impl.SpinCADPackageImpl#getChorusReadDelay()
     * @generated
     */
    EClass CHORUS_READ_DELAY = eINSTANCE.getChorusReadDelay();

    /**
     * The meta object literal for the '<em><b>Arg1</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CHORUS_READ_DELAY__ARG1 = eINSTANCE.getChorusReadDelay_Arg1();

    /**
     * The meta object literal for the '<em><b>Arg2</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CHORUS_READ_DELAY__ARG2 = eINSTANCE.getChorusReadDelay_Arg2();

    /**
     * The meta object literal for the '<em><b>Arg3</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CHORUS_READ_DELAY__ARG3 = eINSTANCE.getChorusReadDelay_Arg3();

    /**
     * The meta object literal for the '{@link com.holycityaudio.spincad.spinCAD.impl.ChorusReadValueImpl <em>Chorus Read Value</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.holycityaudio.spincad.spinCAD.impl.ChorusReadValueImpl
     * @see com.holycityaudio.spincad.spinCAD.impl.SpinCADPackageImpl#getChorusReadValue()
     * @generated
     */
    EClass CHORUS_READ_VALUE = eINSTANCE.getChorusReadValue();

    /**
     * The meta object literal for the '<em><b>Arg1</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CHORUS_READ_VALUE__ARG1 = eINSTANCE.getChorusReadValue_Arg1();

    /**
     * The meta object literal for the '{@link com.holycityaudio.spincad.spinCAD.impl.ChorusScaleOffsetImpl <em>Chorus Scale Offset</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.holycityaudio.spincad.spinCAD.impl.ChorusScaleOffsetImpl
     * @see com.holycityaudio.spincad.spinCAD.impl.SpinCADPackageImpl#getChorusScaleOffset()
     * @generated
     */
    EClass CHORUS_SCALE_OFFSET = eINSTANCE.getChorusScaleOffset();

    /**
     * The meta object literal for the '<em><b>Arg1</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CHORUS_SCALE_OFFSET__ARG1 = eINSTANCE.getChorusScaleOffset_Arg1();

    /**
     * The meta object literal for the '<em><b>Arg2</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CHORUS_SCALE_OFFSET__ARG2 = eINSTANCE.getChorusScaleOffset_Arg2();

    /**
     * The meta object literal for the '<em><b>Arg3</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CHORUS_SCALE_OFFSET__ARG3 = eINSTANCE.getChorusScaleOffset_Arg3();

    /**
     * The meta object literal for the '{@link com.holycityaudio.spincad.spinCAD.impl.ReadDelayPointerImpl <em>Read Delay Pointer</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.holycityaudio.spincad.spinCAD.impl.ReadDelayPointerImpl
     * @see com.holycityaudio.spincad.spinCAD.impl.SpinCADPackageImpl#getReadDelayPointer()
     * @generated
     */
    EClass READ_DELAY_POINTER = eINSTANCE.getReadDelayPointer();

    /**
     * The meta object literal for the '<em><b>Arg1</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute READ_DELAY_POINTER__ARG1 = eINSTANCE.getReadDelayPointer_Arg1();

    /**
     * The meta object literal for the '{@link com.holycityaudio.spincad.spinCAD.impl.AndImpl <em>And</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.holycityaudio.spincad.spinCAD.impl.AndImpl
     * @see com.holycityaudio.spincad.spinCAD.impl.SpinCADPackageImpl#getAnd()
     * @generated
     */
    EClass AND = eINSTANCE.getAnd();

    /**
     * The meta object literal for the '{@link com.holycityaudio.spincad.spinCAD.impl.OrImpl <em>Or</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.holycityaudio.spincad.spinCAD.impl.OrImpl
     * @see com.holycityaudio.spincad.spinCAD.impl.SpinCADPackageImpl#getOr()
     * @generated
     */
    EClass OR = eINSTANCE.getOr();

    /**
     * The meta object literal for the '{@link com.holycityaudio.spincad.spinCAD.impl.XorImpl <em>Xor</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.holycityaudio.spincad.spinCAD.impl.XorImpl
     * @see com.holycityaudio.spincad.spinCAD.impl.SpinCADPackageImpl#getXor()
     * @generated
     */
    EClass XOR = eINSTANCE.getXor();

    /**
     * The meta object literal for the '{@link com.holycityaudio.spincad.spinCAD.impl.JamImpl <em>Jam</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.holycityaudio.spincad.spinCAD.impl.JamImpl
     * @see com.holycityaudio.spincad.spinCAD.impl.SpinCADPackageImpl#getJam()
     * @generated
     */
    EClass JAM = eINSTANCE.getJam();

    /**
     * The meta object literal for the '<em><b>Arg1</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute JAM__ARG1 = eINSTANCE.getJam_Arg1();

    /**
     * The meta object literal for the '{@link com.holycityaudio.spincad.spinCAD.impl.ClrImpl <em>Clr</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.holycityaudio.spincad.spinCAD.impl.ClrImpl
     * @see com.holycityaudio.spincad.spinCAD.impl.SpinCADPackageImpl#getClr()
     * @generated
     */
    EClass CLR = eINSTANCE.getClr();

    /**
     * The meta object literal for the '{@link com.holycityaudio.spincad.spinCAD.impl.NotImpl <em>Not</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.holycityaudio.spincad.spinCAD.impl.NotImpl
     * @see com.holycityaudio.spincad.spinCAD.impl.SpinCADPackageImpl#getNot()
     * @generated
     */
    EClass NOT = eINSTANCE.getNot();

    /**
     * The meta object literal for the '{@link com.holycityaudio.spincad.spinCAD.impl.AbsaImpl <em>Absa</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.holycityaudio.spincad.spinCAD.impl.AbsaImpl
     * @see com.holycityaudio.spincad.spinCAD.impl.SpinCADPackageImpl#getAbsa()
     * @generated
     */
    EClass ABSA = eINSTANCE.getAbsa();

    /**
     * The meta object literal for the '{@link com.holycityaudio.spincad.spinCAD.impl.SkipImpl <em>Skip</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.holycityaudio.spincad.spinCAD.impl.SkipImpl
     * @see com.holycityaudio.spincad.spinCAD.impl.SpinCADPackageImpl#getSkip()
     * @generated
     */
    EClass SKIP = eINSTANCE.getSkip();

    /**
     * The meta object literal for the '<em><b>Flags</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SKIP__FLAGS = eINSTANCE.getSkip_Flags();

    /**
     * The meta object literal for the '<em><b>Label</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SKIP__LABEL = eINSTANCE.getSkip_Label();

    /**
     * The meta object literal for the '{@link com.holycityaudio.spincad.spinCAD.impl.SPINMEMImpl <em>SPINMEM</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.holycityaudio.spincad.spinCAD.impl.SPINMEMImpl
     * @see com.holycityaudio.spincad.spinCAD.impl.SpinCADPackageImpl#getSPINMEM()
     * @generated
     */
    EClass SPINMEM = eINSTANCE.getSPINMEM();

    /**
     * The meta object literal for the '<em><b>Buffer</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SPINMEM__BUFFER = eINSTANCE.getSPINMEM_Buffer();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SPINMEM__VALUE = eINSTANCE.getSPINMEM_Value();

    /**
     * The meta object literal for the '<em><b>Scale</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SPINMEM__SCALE = eINSTANCE.getSPINMEM_Scale();

    /**
     * The meta object literal for the '<em><b>Offset</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SPINMEM__OFFSET = eINSTANCE.getSPINMEM_Offset();

  }

} //SpinCADPackage
