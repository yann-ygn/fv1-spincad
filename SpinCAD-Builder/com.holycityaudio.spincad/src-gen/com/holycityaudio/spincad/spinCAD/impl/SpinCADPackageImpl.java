/**
 */
package com.holycityaudio.spincad.spinCAD.impl;

import com.holycityaudio.spincad.spinCAD.Absa;
import com.holycityaudio.spincad.spinCAD.And;
import com.holycityaudio.spincad.spinCAD.AudioInput;
import com.holycityaudio.spincad.spinCAD.AudioOutput;
import com.holycityaudio.spincad.spinCAD.ChorusReadDelay;
import com.holycityaudio.spincad.spinCAD.ChorusReadValue;
import com.holycityaudio.spincad.spinCAD.ChorusScaleOffset;
import com.holycityaudio.spincad.spinCAD.Clr;
import com.holycityaudio.spincad.spinCAD.Comment;
import com.holycityaudio.spincad.spinCAD.Control;
import com.holycityaudio.spincad.spinCAD.ControlInput;
import com.holycityaudio.spincad.spinCAD.ControlOutput;
import com.holycityaudio.spincad.spinCAD.DivideDouble;
import com.holycityaudio.spincad.spinCAD.DivideInt;
import com.holycityaudio.spincad.spinCAD.Equals;
import com.holycityaudio.spincad.spinCAD.EqualsBool;
import com.holycityaudio.spincad.spinCAD.Exp;
import com.holycityaudio.spincad.spinCAD.GetBaseAddress;
import com.holycityaudio.spincad.spinCAD.GetDelayScaleControl;
import com.holycityaudio.spincad.spinCAD.GetInputDefault;
import com.holycityaudio.spincad.spinCAD.GetSamplesFromRatio;
import com.holycityaudio.spincad.spinCAD.InputPin;
import com.holycityaudio.spincad.spinCAD.Inst_B15_S1_9;
import com.holycityaudio.spincad.spinCAD.Inst_B24;
import com.holycityaudio.spincad.spinCAD.Inst_B6;
import com.holycityaudio.spincad.spinCAD.Inst_B6_S1_14;
import com.holycityaudio.spincad.spinCAD.Inst_S1_14_S1_10;
import com.holycityaudio.spincad.spinCAD.Inst_X0;
import com.holycityaudio.spincad.spinCAD.Instruction;
import com.holycityaudio.spincad.spinCAD.IsElse;
import com.holycityaudio.spincad.spinCAD.IsEndif;
import com.holycityaudio.spincad.spinCAD.IsEqualTo;
import com.holycityaudio.spincad.spinCAD.IsGreaterThan;
import com.holycityaudio.spincad.spinCAD.IsLessThan;
import com.holycityaudio.spincad.spinCAD.IsOr;
import com.holycityaudio.spincad.spinCAD.IsPinConnected;
import com.holycityaudio.spincad.spinCAD.IsTrue;
import com.holycityaudio.spincad.spinCAD.Jam;
import com.holycityaudio.spincad.spinCAD.Label;
import com.holycityaudio.spincad.spinCAD.Ldax;
import com.holycityaudio.spincad.spinCAD.LoadRampLFO;
import com.holycityaudio.spincad.spinCAD.LoadSinLFO;
import com.holycityaudio.spincad.spinCAD.Log;
import com.holycityaudio.spincad.spinCAD.LogFreq2SliderLabel;
import com.holycityaudio.spincad.spinCAD.LogFreqSliderLabel;
import com.holycityaudio.spincad.spinCAD.Macro;
import com.holycityaudio.spincad.spinCAD.Maxx;
import com.holycityaudio.spincad.spinCAD.Mem;
import com.holycityaudio.spincad.spinCAD.MinusDouble;
import com.holycityaudio.spincad.spinCAD.MultiplyDouble;
import com.holycityaudio.spincad.spinCAD.Mulx;
import com.holycityaudio.spincad.spinCAD.Not;
import com.holycityaudio.spincad.spinCAD.Offset;
import com.holycityaudio.spincad.spinCAD.Or;
import com.holycityaudio.spincad.spinCAD.OutputPin;
import com.holycityaudio.spincad.spinCAD.Pin;
import com.holycityaudio.spincad.spinCAD.Program;
import com.holycityaudio.spincad.spinCAD.ReadChorusTap;
import com.holycityaudio.spincad.spinCAD.ReadDelay;
import com.holycityaudio.spincad.spinCAD.ReadDelayPointer;
import com.holycityaudio.spincad.spinCAD.ReadRegister;
import com.holycityaudio.spincad.spinCAD.ReadRegisterFilter;
import com.holycityaudio.spincad.spinCAD.ScaleOffset;
import com.holycityaudio.spincad.spinCAD.SemitonesToRmpRate;
import com.holycityaudio.spincad.spinCAD.SetChorusWidth;
import com.holycityaudio.spincad.spinCAD.SetOutputPin;
import com.holycityaudio.spincad.spinCAD.Skip;
import com.holycityaudio.spincad.spinCAD.SliderLabelCheckBox;
import com.holycityaudio.spincad.spinCAD.SliderLabelSpinner;
import com.holycityaudio.spincad.spinCAD.SpinBool;
import com.holycityaudio.spincad.spinCAD.SpinCADFactory;
import com.holycityaudio.spincad.spinCAD.SpinCADPackage;
import com.holycityaudio.spincad.spinCAD.SpinCheckBox;
import com.holycityaudio.spincad.spinCAD.SpinComboBox;
import com.holycityaudio.spincad.spinCAD.SpinElement;
import com.holycityaudio.spincad.spinCAD.SpinEquate;
import com.holycityaudio.spincad.spinCAD.SpinInt;
import com.holycityaudio.spincad.spinCAD.SpinRadioButton;
import com.holycityaudio.spincad.spinCAD.SpinSliderLabel;
import com.holycityaudio.spincad.spinCAD.WriteAllpass;
import com.holycityaudio.spincad.spinCAD.WriteDelay;
import com.holycityaudio.spincad.spinCAD.WriteRegister;
import com.holycityaudio.spincad.spinCAD.WriteRegisterHighshelf;
import com.holycityaudio.spincad.spinCAD.WriteRegisterLowshelf;
import com.holycityaudio.spincad.spinCAD.Xor;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class SpinCADPackageImpl extends EPackageImpl implements SpinCADPackage
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass programEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass pinEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass inputPinEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass outputPinEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass audioInputEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass audioOutputEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass controlInputEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass controlOutputEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass spinElementEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass spinEquateEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass spinIntEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass memEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass offsetEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass spinBoolEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass controlEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass spinSliderLabelEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass sliderLabelSpinnerEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass sliderLabelCheckBoxEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass spinCheckBoxEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass logFreqSliderLabelEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass logFreq2SliderLabelEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass spinRadioButtonEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass spinComboBoxEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass commentEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass labelEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass macroEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass isPinConnectedEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass isGreaterThanEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass isLessThanEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass isEqualToEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass isTrueEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass isElseEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass isEndifEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass isOrEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass getInputDefaultEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass getDelayScaleControlEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass readChorusTapEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass getSamplesFromRatioEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass semitonesToRmpRateEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass getBaseAddressEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass setOutputPinEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass minusDoubleEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass divideDoubleEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass equalsEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass equalsBoolEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass divideIntEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass multiplyDoubleEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass setChorusWidthEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass instructionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass inst_B6_S1_14EClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass inst_B15_S1_9EClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass inst_B6EClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass inst_B24EClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass inst_X0EClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass inst_S1_14_S1_10EClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass readRegisterEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass writeRegisterLowshelfEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass writeRegisterHighshelfEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass writeRegisterEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass maxxEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass readRegisterFilterEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass mulxEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass ldaxEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass expEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass logEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass scaleOffsetEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass writeDelayEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass writeAllpassEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass readDelayEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass loadSinLFOEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass loadRampLFOEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass chorusReadDelayEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass chorusReadValueEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass chorusScaleOffsetEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass readDelayPointerEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass andEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass orEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass xorEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass jamEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass clrEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass notEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass absaEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass skipEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass spinmemEClass = null;

  /**
   * Creates an instance of the model <b>Package</b>, registered with
   * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
   * package URI value.
   * <p>Note: the correct way to create the package is via the static
   * factory method {@link #init init()}, which also performs
   * initialization of the package, or returns the registered package,
   * if one already exists.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.emf.ecore.EPackage.Registry
   * @see com.holycityaudio.spincad.spinCAD.SpinCADPackage#eNS_URI
   * @see #init()
   * @generated
   */
  private SpinCADPackageImpl()
  {
    super(eNS_URI, SpinCADFactory.eINSTANCE);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static boolean isInited = false;

  /**
   * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
   *
   * <p>This method is used to initialize {@link SpinCADPackage#eINSTANCE} when that field is accessed.
   * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #eNS_URI
   * @see #createPackageContents()
   * @see #initializePackageContents()
   * @generated
   */
  public static SpinCADPackage init()
  {
    if (isInited) return (SpinCADPackage)EPackage.Registry.INSTANCE.getEPackage(SpinCADPackage.eNS_URI);

    // Obtain or create and register package
    Object registeredSpinCADPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
    SpinCADPackageImpl theSpinCADPackage = registeredSpinCADPackage instanceof SpinCADPackageImpl ? (SpinCADPackageImpl)registeredSpinCADPackage : new SpinCADPackageImpl();

    isInited = true;

    // Create package meta-data objects
    theSpinCADPackage.createPackageContents();

    // Initialize created meta-data
    theSpinCADPackage.initializePackageContents();

    // Mark meta-data to indicate it can't be changed
    theSpinCADPackage.freeze();

    // Update the registry and return the package
    EPackage.Registry.INSTANCE.put(SpinCADPackage.eNS_URI, theSpinCADPackage);
    return theSpinCADPackage;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getProgram()
  {
    return programEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getProgram_Name()
  {
    return (EAttribute)programEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getProgram_Color()
  {
    return (EAttribute)programEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getProgram_Pins()
  {
    return (EReference)programEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getProgram_Elements()
  {
    return (EReference)programEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getPin()
  {
    return pinEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getPin_VarName()
  {
    return (EAttribute)pinEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getPin_Label()
  {
    return (EAttribute)pinEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getInputPin()
  {
    return inputPinEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getOutputPin()
  {
    return outputPinEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getAudioInput()
  {
    return audioInputEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getAudioOutput()
  {
    return audioOutputEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getControlInput()
  {
    return controlInputEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getControlOutput()
  {
    return controlOutputEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getSpinElement()
  {
    return spinElementEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getSpinEquate()
  {
    return spinEquateEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getSpinEquate_Ename()
  {
    return (EAttribute)spinEquateEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getSpinEquate_Value()
  {
    return (EAttribute)spinEquateEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getSpinInt()
  {
    return spinIntEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getSpinInt_Ename()
  {
    return (EAttribute)spinIntEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getSpinInt_Value()
  {
    return (EAttribute)spinIntEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getMem()
  {
    return memEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getMem_Buffer()
  {
    return (EAttribute)memEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getMem_Length()
  {
    return (EAttribute)memEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getOffset()
  {
    return offsetEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getOffset_Name()
  {
    return (EAttribute)offsetEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getOffset_Length()
  {
    return (EAttribute)offsetEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getSpinBool()
  {
    return spinBoolEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getSpinBool_Label()
  {
    return (EAttribute)spinBoolEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getSpinBool_Value()
  {
    return (EAttribute)spinBoolEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getControl()
  {
    return controlEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getControl_Ename()
  {
    return (EAttribute)controlEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getSpinSliderLabel()
  {
    return spinSliderLabelEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getSpinSliderLabel_ControlName()
  {
    return (EAttribute)spinSliderLabelEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getSpinSliderLabel_MinVal()
  {
    return (EAttribute)spinSliderLabelEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getSpinSliderLabel_MaxVal()
  {
    return (EAttribute)spinSliderLabelEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getSpinSliderLabel_InitVal()
  {
    return (EAttribute)spinSliderLabelEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getSpinSliderLabel_Multiplier()
  {
    return (EAttribute)spinSliderLabelEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getSpinSliderLabel_Precision()
  {
    return (EAttribute)spinSliderLabelEClass.getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getSpinSliderLabel_Option()
  {
    return (EAttribute)spinSliderLabelEClass.getEStructuralFeatures().get(6);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getSliderLabelSpinner()
  {
    return sliderLabelSpinnerEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getSliderLabelSpinner_ControlName()
  {
    return (EAttribute)sliderLabelSpinnerEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getSliderLabelSpinner_MinVal()
  {
    return (EAttribute)sliderLabelSpinnerEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getSliderLabelSpinner_MaxVal()
  {
    return (EAttribute)sliderLabelSpinnerEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getSliderLabelSpinner_InitVal()
  {
    return (EAttribute)sliderLabelSpinnerEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getSliderLabelSpinner_Multiplier()
  {
    return (EAttribute)sliderLabelSpinnerEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getSliderLabelSpinner_Precision()
  {
    return (EAttribute)sliderLabelSpinnerEClass.getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getSliderLabelSpinner_Option()
  {
    return (EAttribute)sliderLabelSpinnerEClass.getEStructuralFeatures().get(6);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getSliderLabelCheckBox()
  {
    return sliderLabelCheckBoxEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getSliderLabelCheckBox_ControlName()
  {
    return (EAttribute)sliderLabelCheckBoxEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getSliderLabelCheckBox_MinVal()
  {
    return (EAttribute)sliderLabelCheckBoxEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getSliderLabelCheckBox_MaxVal()
  {
    return (EAttribute)sliderLabelCheckBoxEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getSliderLabelCheckBox_InitVal()
  {
    return (EAttribute)sliderLabelCheckBoxEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getSliderLabelCheckBox_Multiplier()
  {
    return (EAttribute)sliderLabelCheckBoxEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getSliderLabelCheckBox_Precision()
  {
    return (EAttribute)sliderLabelCheckBoxEClass.getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getSliderLabelCheckBox_Option()
  {
    return (EAttribute)sliderLabelCheckBoxEClass.getEStructuralFeatures().get(6);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getSpinCheckBox()
  {
    return spinCheckBoxEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getSpinCheckBox_ControlName()
  {
    return (EAttribute)spinCheckBoxEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getLogFreqSliderLabel()
  {
    return logFreqSliderLabelEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getLogFreqSliderLabel_ControlName()
  {
    return (EAttribute)logFreqSliderLabelEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getLogFreqSliderLabel_MinVal()
  {
    return (EAttribute)logFreqSliderLabelEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getLogFreqSliderLabel_MaxVal()
  {
    return (EAttribute)logFreqSliderLabelEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getLogFreqSliderLabel_InitVal()
  {
    return (EAttribute)logFreqSliderLabelEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getLogFreqSliderLabel_Multiplier()
  {
    return (EAttribute)logFreqSliderLabelEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getLogFreqSliderLabel_Precision()
  {
    return (EAttribute)logFreqSliderLabelEClass.getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getLogFreqSliderLabel_Option()
  {
    return (EAttribute)logFreqSliderLabelEClass.getEStructuralFeatures().get(6);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getLogFreq2SliderLabel()
  {
    return logFreq2SliderLabelEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getLogFreq2SliderLabel_ControlName()
  {
    return (EAttribute)logFreq2SliderLabelEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getLogFreq2SliderLabel_MinVal()
  {
    return (EAttribute)logFreq2SliderLabelEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getLogFreq2SliderLabel_MaxVal()
  {
    return (EAttribute)logFreq2SliderLabelEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getLogFreq2SliderLabel_InitVal()
  {
    return (EAttribute)logFreq2SliderLabelEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getLogFreq2SliderLabel_Multiplier()
  {
    return (EAttribute)logFreq2SliderLabelEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getLogFreq2SliderLabel_Precision()
  {
    return (EAttribute)logFreq2SliderLabelEClass.getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getLogFreq2SliderLabel_Option()
  {
    return (EAttribute)logFreq2SliderLabelEClass.getEStructuralFeatures().get(6);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getSpinRadioButton()
  {
    return spinRadioButtonEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getSpinRadioButton_ControlName()
  {
    return (EAttribute)spinRadioButtonEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getSpinComboBox()
  {
    return spinComboBoxEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getSpinComboBox_Optiona()
  {
    return (EAttribute)spinComboBoxEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getSpinComboBox_Optionb()
  {
    return (EAttribute)spinComboBoxEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getSpinComboBox_Optionc()
  {
    return (EAttribute)spinComboBoxEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getSpinComboBox_Optiond()
  {
    return (EAttribute)spinComboBoxEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getSpinComboBox_Optione()
  {
    return (EAttribute)spinComboBoxEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getSpinComboBox_Optionf()
  {
    return (EAttribute)spinComboBoxEClass.getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getComment()
  {
    return commentEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getComment_Remark()
  {
    return (EAttribute)commentEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getLabel()
  {
    return labelEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getLabel_Name()
  {
    return (EAttribute)labelEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getMacro()
  {
    return macroEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getIsPinConnected()
  {
    return isPinConnectedEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getIsPinConnected_Arg1()
  {
    return (EAttribute)isPinConnectedEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getIsGreaterThan()
  {
    return isGreaterThanEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getIsGreaterThan_Variable()
  {
    return (EAttribute)isGreaterThanEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getIsGreaterThan_Value()
  {
    return (EAttribute)isGreaterThanEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getIsLessThan()
  {
    return isLessThanEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getIsLessThan_Variable()
  {
    return (EAttribute)isLessThanEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getIsLessThan_Value()
  {
    return (EAttribute)isLessThanEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getIsEqualTo()
  {
    return isEqualToEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getIsEqualTo_Variable()
  {
    return (EAttribute)isEqualToEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getIsEqualTo_Value()
  {
    return (EAttribute)isEqualToEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getIsTrue()
  {
    return isTrueEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getIsTrue_Variable()
  {
    return (EAttribute)isTrueEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getIsElse()
  {
    return isElseEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getIsEndif()
  {
    return isEndifEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getIsOr()
  {
    return isOrEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getIsOr_Var1()
  {
    return (EAttribute)isOrEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getIsOr_Var2()
  {
    return (EAttribute)isOrEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getIsOr_Value()
  {
    return (EAttribute)isOrEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getGetInputDefault()
  {
    return getInputDefaultEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getGetInputDefault_Label()
  {
    return (EAttribute)getInputDefaultEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getGetInputDefault_Variable()
  {
    return (EAttribute)getInputDefaultEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getGetInputDefault_Scale()
  {
    return (EAttribute)getInputDefaultEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getGetInputDefault_DefaultVal()
  {
    return (EAttribute)getInputDefaultEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getGetDelayScaleControl()
  {
    return getDelayScaleControlEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getGetDelayScaleControl_Ratio()
  {
    return (EAttribute)getDelayScaleControlEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getGetDelayScaleControl_Length()
  {
    return (EAttribute)getDelayScaleControlEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getGetDelayScaleControl_Offset()
  {
    return (EAttribute)getDelayScaleControlEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getGetDelayScaleControl_Control()
  {
    return (EAttribute)getDelayScaleControlEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getReadChorusTap()
  {
    return readChorusTapEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getReadChorusTap_Lfo()
  {
    return (EAttribute)readChorusTapEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getReadChorusTap_Phase()
  {
    return (EAttribute)readChorusTapEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getReadChorusTap_Ratio()
  {
    return (EAttribute)readChorusTapEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getReadChorusTap_Length()
  {
    return (EAttribute)readChorusTapEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getReadChorusTap_Offset()
  {
    return (EAttribute)readChorusTapEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getGetSamplesFromRatio()
  {
    return getSamplesFromRatioEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getGetSamplesFromRatio_Variable()
  {
    return (EAttribute)getSamplesFromRatioEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getGetSamplesFromRatio_Ratio()
  {
    return (EAttribute)getSamplesFromRatioEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getGetSamplesFromRatio_Length()
  {
    return (EAttribute)getSamplesFromRatioEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getSemitonesToRmpRate()
  {
    return semitonesToRmpRateEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getSemitonesToRmpRate_Variable()
  {
    return (EAttribute)semitonesToRmpRateEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getSemitonesToRmpRate_Semitones()
  {
    return (EAttribute)semitonesToRmpRateEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getGetBaseAddress()
  {
    return getBaseAddressEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getSetOutputPin()
  {
    return setOutputPinEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getSetOutputPin_PinName()
  {
    return (EAttribute)setOutputPinEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getSetOutputPin_VarName()
  {
    return (EAttribute)setOutputPinEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getMinusDouble()
  {
    return minusDoubleEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getMinusDouble_VarName()
  {
    return (EAttribute)minusDoubleEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getMinusDouble_High()
  {
    return (EAttribute)minusDoubleEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getMinusDouble_Low()
  {
    return (EAttribute)minusDoubleEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getDivideDouble()
  {
    return divideDoubleEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getDivideDouble_VarName()
  {
    return (EAttribute)divideDoubleEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getDivideDouble_High()
  {
    return (EAttribute)divideDoubleEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getDivideDouble_Low()
  {
    return (EAttribute)divideDoubleEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getEquals()
  {
    return equalsEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getEquals_VarName()
  {
    return (EAttribute)equalsEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getEquals_Value()
  {
    return (EAttribute)equalsEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getEqualsBool()
  {
    return equalsBoolEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getEqualsBool_VarName()
  {
    return (EAttribute)equalsBoolEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getEqualsBool_Value()
  {
    return (EAttribute)equalsBoolEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getDivideInt()
  {
    return divideIntEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getDivideInt_VarName()
  {
    return (EAttribute)divideIntEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getDivideInt_High()
  {
    return (EAttribute)divideIntEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getDivideInt_Low()
  {
    return (EAttribute)divideIntEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getMultiplyDouble()
  {
    return multiplyDoubleEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getMultiplyDouble_VarName()
  {
    return (EAttribute)multiplyDoubleEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getMultiplyDouble_High()
  {
    return (EAttribute)multiplyDoubleEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getMultiplyDouble_Low()
  {
    return (EAttribute)multiplyDoubleEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getSetChorusWidth()
  {
    return setChorusWidthEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getSetChorusWidth_VarName()
  {
    return (EAttribute)setChorusWidthEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getSetChorusWidth_Length()
  {
    return (EAttribute)setChorusWidthEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getSetChorusWidth_Scale()
  {
    return (EAttribute)setChorusWidthEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getInstruction()
  {
    return instructionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getInst_B6_S1_14()
  {
    return inst_B6_S1_14EClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getInst_B6_S1_14_Arg1()
  {
    return (EAttribute)inst_B6_S1_14EClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getInst_B6_S1_14_Arg2()
  {
    return (EAttribute)inst_B6_S1_14EClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getInst_B15_S1_9()
  {
    return inst_B15_S1_9EClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getInst_B15_S1_9_Arg1()
  {
    return (EReference)inst_B15_S1_9EClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getInst_B15_S1_9_Arg2()
  {
    return (EAttribute)inst_B15_S1_9EClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getInst_B6()
  {
    return inst_B6EClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getInst_B6_Arg1()
  {
    return (EAttribute)inst_B6EClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getInst_B24()
  {
    return inst_B24EClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getInst_B24_Arg1()
  {
    return (EAttribute)inst_B24EClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getInst_X0()
  {
    return inst_X0EClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getInst_S1_14_S1_10()
  {
    return inst_S1_14_S1_10EClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getInst_S1_14_S1_10_Arg1()
  {
    return (EAttribute)inst_S1_14_S1_10EClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getInst_S1_14_S1_10_Arg2()
  {
    return (EAttribute)inst_S1_14_S1_10EClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getReadRegister()
  {
    return readRegisterEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getWriteRegisterLowshelf()
  {
    return writeRegisterLowshelfEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getWriteRegisterHighshelf()
  {
    return writeRegisterHighshelfEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getWriteRegister()
  {
    return writeRegisterEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getMaxx()
  {
    return maxxEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getReadRegisterFilter()
  {
    return readRegisterFilterEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getMulx()
  {
    return mulxEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getLdax()
  {
    return ldaxEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getExp()
  {
    return expEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getLog()
  {
    return logEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getLog_Arg1()
  {
    return (EAttribute)logEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getLog_Arg2()
  {
    return (EAttribute)logEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getScaleOffset()
  {
    return scaleOffsetEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getWriteDelay()
  {
    return writeDelayEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getWriteAllpass()
  {
    return writeAllpassEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getReadDelay()
  {
    return readDelayEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getLoadSinLFO()
  {
    return loadSinLFOEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getLoadSinLFO_Arg1()
  {
    return (EAttribute)loadSinLFOEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getLoadSinLFO_Arg2()
  {
    return (EAttribute)loadSinLFOEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getLoadSinLFO_Arg3()
  {
    return (EAttribute)loadSinLFOEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getLoadRampLFO()
  {
    return loadRampLFOEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getLoadRampLFO_Arg1()
  {
    return (EAttribute)loadRampLFOEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getLoadRampLFO_Arg2()
  {
    return (EAttribute)loadRampLFOEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getLoadRampLFO_Arg3()
  {
    return (EAttribute)loadRampLFOEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getChorusReadDelay()
  {
    return chorusReadDelayEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getChorusReadDelay_Arg1()
  {
    return (EAttribute)chorusReadDelayEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getChorusReadDelay_Arg2()
  {
    return (EAttribute)chorusReadDelayEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getChorusReadDelay_Arg3()
  {
    return (EReference)chorusReadDelayEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getChorusReadValue()
  {
    return chorusReadValueEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getChorusReadValue_Arg1()
  {
    return (EAttribute)chorusReadValueEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getChorusScaleOffset()
  {
    return chorusScaleOffsetEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getChorusScaleOffset_Arg1()
  {
    return (EAttribute)chorusScaleOffsetEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getChorusScaleOffset_Arg2()
  {
    return (EAttribute)chorusScaleOffsetEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getChorusScaleOffset_Arg3()
  {
    return (EAttribute)chorusScaleOffsetEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getReadDelayPointer()
  {
    return readDelayPointerEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getReadDelayPointer_Arg1()
  {
    return (EAttribute)readDelayPointerEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getAnd()
  {
    return andEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getOr()
  {
    return orEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getXor()
  {
    return xorEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getJam()
  {
    return jamEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getJam_Arg1()
  {
    return (EAttribute)jamEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getClr()
  {
    return clrEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getNot()
  {
    return notEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getAbsa()
  {
    return absaEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getSkip()
  {
    return skipEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getSkip_Flags()
  {
    return (EAttribute)skipEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getSkip_Label()
  {
    return (EReference)skipEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getSPINMEM()
  {
    return spinmemEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getSPINMEM_Buffer()
  {
    return (EAttribute)spinmemEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getSPINMEM_Value()
  {
    return (EAttribute)spinmemEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getSPINMEM_Scale()
  {
    return (EAttribute)spinmemEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getSPINMEM_Offset()
  {
    return (EReference)spinmemEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public SpinCADFactory getSpinCADFactory()
  {
    return (SpinCADFactory)getEFactoryInstance();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isCreated = false;

  /**
   * Creates the meta-model objects for the package.  This method is
   * guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void createPackageContents()
  {
    if (isCreated) return;
    isCreated = true;

    // Create classes and their features
    programEClass = createEClass(PROGRAM);
    createEAttribute(programEClass, PROGRAM__NAME);
    createEAttribute(programEClass, PROGRAM__COLOR);
    createEReference(programEClass, PROGRAM__PINS);
    createEReference(programEClass, PROGRAM__ELEMENTS);

    pinEClass = createEClass(PIN);
    createEAttribute(pinEClass, PIN__VAR_NAME);
    createEAttribute(pinEClass, PIN__LABEL);

    inputPinEClass = createEClass(INPUT_PIN);

    outputPinEClass = createEClass(OUTPUT_PIN);

    audioInputEClass = createEClass(AUDIO_INPUT);

    audioOutputEClass = createEClass(AUDIO_OUTPUT);

    controlInputEClass = createEClass(CONTROL_INPUT);

    controlOutputEClass = createEClass(CONTROL_OUTPUT);

    spinElementEClass = createEClass(SPIN_ELEMENT);

    spinEquateEClass = createEClass(SPIN_EQUATE);
    createEAttribute(spinEquateEClass, SPIN_EQUATE__ENAME);
    createEAttribute(spinEquateEClass, SPIN_EQUATE__VALUE);

    spinIntEClass = createEClass(SPIN_INT);
    createEAttribute(spinIntEClass, SPIN_INT__ENAME);
    createEAttribute(spinIntEClass, SPIN_INT__VALUE);

    memEClass = createEClass(MEM);
    createEAttribute(memEClass, MEM__BUFFER);
    createEAttribute(memEClass, MEM__LENGTH);

    offsetEClass = createEClass(OFFSET);
    createEAttribute(offsetEClass, OFFSET__NAME);
    createEAttribute(offsetEClass, OFFSET__LENGTH);

    spinBoolEClass = createEClass(SPIN_BOOL);
    createEAttribute(spinBoolEClass, SPIN_BOOL__LABEL);
    createEAttribute(spinBoolEClass, SPIN_BOOL__VALUE);

    controlEClass = createEClass(CONTROL);
    createEAttribute(controlEClass, CONTROL__ENAME);

    spinSliderLabelEClass = createEClass(SPIN_SLIDER_LABEL);
    createEAttribute(spinSliderLabelEClass, SPIN_SLIDER_LABEL__CONTROL_NAME);
    createEAttribute(spinSliderLabelEClass, SPIN_SLIDER_LABEL__MIN_VAL);
    createEAttribute(spinSliderLabelEClass, SPIN_SLIDER_LABEL__MAX_VAL);
    createEAttribute(spinSliderLabelEClass, SPIN_SLIDER_LABEL__INIT_VAL);
    createEAttribute(spinSliderLabelEClass, SPIN_SLIDER_LABEL__MULTIPLIER);
    createEAttribute(spinSliderLabelEClass, SPIN_SLIDER_LABEL__PRECISION);
    createEAttribute(spinSliderLabelEClass, SPIN_SLIDER_LABEL__OPTION);

    sliderLabelSpinnerEClass = createEClass(SLIDER_LABEL_SPINNER);
    createEAttribute(sliderLabelSpinnerEClass, SLIDER_LABEL_SPINNER__CONTROL_NAME);
    createEAttribute(sliderLabelSpinnerEClass, SLIDER_LABEL_SPINNER__MIN_VAL);
    createEAttribute(sliderLabelSpinnerEClass, SLIDER_LABEL_SPINNER__MAX_VAL);
    createEAttribute(sliderLabelSpinnerEClass, SLIDER_LABEL_SPINNER__INIT_VAL);
    createEAttribute(sliderLabelSpinnerEClass, SLIDER_LABEL_SPINNER__MULTIPLIER);
    createEAttribute(sliderLabelSpinnerEClass, SLIDER_LABEL_SPINNER__PRECISION);
    createEAttribute(sliderLabelSpinnerEClass, SLIDER_LABEL_SPINNER__OPTION);

    sliderLabelCheckBoxEClass = createEClass(SLIDER_LABEL_CHECK_BOX);
    createEAttribute(sliderLabelCheckBoxEClass, SLIDER_LABEL_CHECK_BOX__CONTROL_NAME);
    createEAttribute(sliderLabelCheckBoxEClass, SLIDER_LABEL_CHECK_BOX__MIN_VAL);
    createEAttribute(sliderLabelCheckBoxEClass, SLIDER_LABEL_CHECK_BOX__MAX_VAL);
    createEAttribute(sliderLabelCheckBoxEClass, SLIDER_LABEL_CHECK_BOX__INIT_VAL);
    createEAttribute(sliderLabelCheckBoxEClass, SLIDER_LABEL_CHECK_BOX__MULTIPLIER);
    createEAttribute(sliderLabelCheckBoxEClass, SLIDER_LABEL_CHECK_BOX__PRECISION);
    createEAttribute(sliderLabelCheckBoxEClass, SLIDER_LABEL_CHECK_BOX__OPTION);

    spinCheckBoxEClass = createEClass(SPIN_CHECK_BOX);
    createEAttribute(spinCheckBoxEClass, SPIN_CHECK_BOX__CONTROL_NAME);

    logFreqSliderLabelEClass = createEClass(LOG_FREQ_SLIDER_LABEL);
    createEAttribute(logFreqSliderLabelEClass, LOG_FREQ_SLIDER_LABEL__CONTROL_NAME);
    createEAttribute(logFreqSliderLabelEClass, LOG_FREQ_SLIDER_LABEL__MIN_VAL);
    createEAttribute(logFreqSliderLabelEClass, LOG_FREQ_SLIDER_LABEL__MAX_VAL);
    createEAttribute(logFreqSliderLabelEClass, LOG_FREQ_SLIDER_LABEL__INIT_VAL);
    createEAttribute(logFreqSliderLabelEClass, LOG_FREQ_SLIDER_LABEL__MULTIPLIER);
    createEAttribute(logFreqSliderLabelEClass, LOG_FREQ_SLIDER_LABEL__PRECISION);
    createEAttribute(logFreqSliderLabelEClass, LOG_FREQ_SLIDER_LABEL__OPTION);

    logFreq2SliderLabelEClass = createEClass(LOG_FREQ2_SLIDER_LABEL);
    createEAttribute(logFreq2SliderLabelEClass, LOG_FREQ2_SLIDER_LABEL__CONTROL_NAME);
    createEAttribute(logFreq2SliderLabelEClass, LOG_FREQ2_SLIDER_LABEL__MIN_VAL);
    createEAttribute(logFreq2SliderLabelEClass, LOG_FREQ2_SLIDER_LABEL__MAX_VAL);
    createEAttribute(logFreq2SliderLabelEClass, LOG_FREQ2_SLIDER_LABEL__INIT_VAL);
    createEAttribute(logFreq2SliderLabelEClass, LOG_FREQ2_SLIDER_LABEL__MULTIPLIER);
    createEAttribute(logFreq2SliderLabelEClass, LOG_FREQ2_SLIDER_LABEL__PRECISION);
    createEAttribute(logFreq2SliderLabelEClass, LOG_FREQ2_SLIDER_LABEL__OPTION);

    spinRadioButtonEClass = createEClass(SPIN_RADIO_BUTTON);
    createEAttribute(spinRadioButtonEClass, SPIN_RADIO_BUTTON__CONTROL_NAME);

    spinComboBoxEClass = createEClass(SPIN_COMBO_BOX);
    createEAttribute(spinComboBoxEClass, SPIN_COMBO_BOX__OPTIONA);
    createEAttribute(spinComboBoxEClass, SPIN_COMBO_BOX__OPTIONB);
    createEAttribute(spinComboBoxEClass, SPIN_COMBO_BOX__OPTIONC);
    createEAttribute(spinComboBoxEClass, SPIN_COMBO_BOX__OPTIOND);
    createEAttribute(spinComboBoxEClass, SPIN_COMBO_BOX__OPTIONE);
    createEAttribute(spinComboBoxEClass, SPIN_COMBO_BOX__OPTIONF);

    commentEClass = createEClass(COMMENT);
    createEAttribute(commentEClass, COMMENT__REMARK);

    labelEClass = createEClass(LABEL);
    createEAttribute(labelEClass, LABEL__NAME);

    macroEClass = createEClass(MACRO);

    isPinConnectedEClass = createEClass(IS_PIN_CONNECTED);
    createEAttribute(isPinConnectedEClass, IS_PIN_CONNECTED__ARG1);

    isGreaterThanEClass = createEClass(IS_GREATER_THAN);
    createEAttribute(isGreaterThanEClass, IS_GREATER_THAN__VARIABLE);
    createEAttribute(isGreaterThanEClass, IS_GREATER_THAN__VALUE);

    isLessThanEClass = createEClass(IS_LESS_THAN);
    createEAttribute(isLessThanEClass, IS_LESS_THAN__VARIABLE);
    createEAttribute(isLessThanEClass, IS_LESS_THAN__VALUE);

    isEqualToEClass = createEClass(IS_EQUAL_TO);
    createEAttribute(isEqualToEClass, IS_EQUAL_TO__VARIABLE);
    createEAttribute(isEqualToEClass, IS_EQUAL_TO__VALUE);

    isTrueEClass = createEClass(IS_TRUE);
    createEAttribute(isTrueEClass, IS_TRUE__VARIABLE);

    isElseEClass = createEClass(IS_ELSE);

    isEndifEClass = createEClass(IS_ENDIF);

    isOrEClass = createEClass(IS_OR);
    createEAttribute(isOrEClass, IS_OR__VAR1);
    createEAttribute(isOrEClass, IS_OR__VAR2);
    createEAttribute(isOrEClass, IS_OR__VALUE);

    getInputDefaultEClass = createEClass(GET_INPUT_DEFAULT);
    createEAttribute(getInputDefaultEClass, GET_INPUT_DEFAULT__LABEL);
    createEAttribute(getInputDefaultEClass, GET_INPUT_DEFAULT__VARIABLE);
    createEAttribute(getInputDefaultEClass, GET_INPUT_DEFAULT__SCALE);
    createEAttribute(getInputDefaultEClass, GET_INPUT_DEFAULT__DEFAULT_VAL);

    getDelayScaleControlEClass = createEClass(GET_DELAY_SCALE_CONTROL);
    createEAttribute(getDelayScaleControlEClass, GET_DELAY_SCALE_CONTROL__RATIO);
    createEAttribute(getDelayScaleControlEClass, GET_DELAY_SCALE_CONTROL__LENGTH);
    createEAttribute(getDelayScaleControlEClass, GET_DELAY_SCALE_CONTROL__OFFSET);
    createEAttribute(getDelayScaleControlEClass, GET_DELAY_SCALE_CONTROL__CONTROL);

    readChorusTapEClass = createEClass(READ_CHORUS_TAP);
    createEAttribute(readChorusTapEClass, READ_CHORUS_TAP__LFO);
    createEAttribute(readChorusTapEClass, READ_CHORUS_TAP__PHASE);
    createEAttribute(readChorusTapEClass, READ_CHORUS_TAP__RATIO);
    createEAttribute(readChorusTapEClass, READ_CHORUS_TAP__LENGTH);
    createEAttribute(readChorusTapEClass, READ_CHORUS_TAP__OFFSET);

    getSamplesFromRatioEClass = createEClass(GET_SAMPLES_FROM_RATIO);
    createEAttribute(getSamplesFromRatioEClass, GET_SAMPLES_FROM_RATIO__VARIABLE);
    createEAttribute(getSamplesFromRatioEClass, GET_SAMPLES_FROM_RATIO__RATIO);
    createEAttribute(getSamplesFromRatioEClass, GET_SAMPLES_FROM_RATIO__LENGTH);

    semitonesToRmpRateEClass = createEClass(SEMITONES_TO_RMP_RATE);
    createEAttribute(semitonesToRmpRateEClass, SEMITONES_TO_RMP_RATE__VARIABLE);
    createEAttribute(semitonesToRmpRateEClass, SEMITONES_TO_RMP_RATE__SEMITONES);

    getBaseAddressEClass = createEClass(GET_BASE_ADDRESS);

    setOutputPinEClass = createEClass(SET_OUTPUT_PIN);
    createEAttribute(setOutputPinEClass, SET_OUTPUT_PIN__PIN_NAME);
    createEAttribute(setOutputPinEClass, SET_OUTPUT_PIN__VAR_NAME);

    minusDoubleEClass = createEClass(MINUS_DOUBLE);
    createEAttribute(minusDoubleEClass, MINUS_DOUBLE__VAR_NAME);
    createEAttribute(minusDoubleEClass, MINUS_DOUBLE__HIGH);
    createEAttribute(minusDoubleEClass, MINUS_DOUBLE__LOW);

    divideDoubleEClass = createEClass(DIVIDE_DOUBLE);
    createEAttribute(divideDoubleEClass, DIVIDE_DOUBLE__VAR_NAME);
    createEAttribute(divideDoubleEClass, DIVIDE_DOUBLE__HIGH);
    createEAttribute(divideDoubleEClass, DIVIDE_DOUBLE__LOW);

    equalsEClass = createEClass(EQUALS);
    createEAttribute(equalsEClass, EQUALS__VAR_NAME);
    createEAttribute(equalsEClass, EQUALS__VALUE);

    equalsBoolEClass = createEClass(EQUALS_BOOL);
    createEAttribute(equalsBoolEClass, EQUALS_BOOL__VAR_NAME);
    createEAttribute(equalsBoolEClass, EQUALS_BOOL__VALUE);

    divideIntEClass = createEClass(DIVIDE_INT);
    createEAttribute(divideIntEClass, DIVIDE_INT__VAR_NAME);
    createEAttribute(divideIntEClass, DIVIDE_INT__HIGH);
    createEAttribute(divideIntEClass, DIVIDE_INT__LOW);

    multiplyDoubleEClass = createEClass(MULTIPLY_DOUBLE);
    createEAttribute(multiplyDoubleEClass, MULTIPLY_DOUBLE__VAR_NAME);
    createEAttribute(multiplyDoubleEClass, MULTIPLY_DOUBLE__HIGH);
    createEAttribute(multiplyDoubleEClass, MULTIPLY_DOUBLE__LOW);

    setChorusWidthEClass = createEClass(SET_CHORUS_WIDTH);
    createEAttribute(setChorusWidthEClass, SET_CHORUS_WIDTH__VAR_NAME);
    createEAttribute(setChorusWidthEClass, SET_CHORUS_WIDTH__LENGTH);
    createEAttribute(setChorusWidthEClass, SET_CHORUS_WIDTH__SCALE);

    instructionEClass = createEClass(INSTRUCTION);

    inst_B6_S1_14EClass = createEClass(INST_B6_S1_14);
    createEAttribute(inst_B6_S1_14EClass, INST_B6_S1_14__ARG1);
    createEAttribute(inst_B6_S1_14EClass, INST_B6_S1_14__ARG2);

    inst_B15_S1_9EClass = createEClass(INST_B15_S1_9);
    createEReference(inst_B15_S1_9EClass, INST_B15_S1_9__ARG1);
    createEAttribute(inst_B15_S1_9EClass, INST_B15_S1_9__ARG2);

    inst_B6EClass = createEClass(INST_B6);
    createEAttribute(inst_B6EClass, INST_B6__ARG1);

    inst_B24EClass = createEClass(INST_B24);
    createEAttribute(inst_B24EClass, INST_B24__ARG1);

    inst_X0EClass = createEClass(INST_X0);

    inst_S1_14_S1_10EClass = createEClass(INST_S1_14_S1_10);
    createEAttribute(inst_S1_14_S1_10EClass, INST_S1_14_S1_10__ARG1);
    createEAttribute(inst_S1_14_S1_10EClass, INST_S1_14_S1_10__ARG2);

    readRegisterEClass = createEClass(READ_REGISTER);

    writeRegisterLowshelfEClass = createEClass(WRITE_REGISTER_LOWSHELF);

    writeRegisterHighshelfEClass = createEClass(WRITE_REGISTER_HIGHSHELF);

    writeRegisterEClass = createEClass(WRITE_REGISTER);

    maxxEClass = createEClass(MAXX);

    readRegisterFilterEClass = createEClass(READ_REGISTER_FILTER);

    mulxEClass = createEClass(MULX);

    ldaxEClass = createEClass(LDAX);

    expEClass = createEClass(EXP);

    logEClass = createEClass(LOG);
    createEAttribute(logEClass, LOG__ARG1);
    createEAttribute(logEClass, LOG__ARG2);

    scaleOffsetEClass = createEClass(SCALE_OFFSET);

    writeDelayEClass = createEClass(WRITE_DELAY);

    writeAllpassEClass = createEClass(WRITE_ALLPASS);

    readDelayEClass = createEClass(READ_DELAY);

    loadSinLFOEClass = createEClass(LOAD_SIN_LFO);
    createEAttribute(loadSinLFOEClass, LOAD_SIN_LFO__ARG1);
    createEAttribute(loadSinLFOEClass, LOAD_SIN_LFO__ARG2);
    createEAttribute(loadSinLFOEClass, LOAD_SIN_LFO__ARG3);

    loadRampLFOEClass = createEClass(LOAD_RAMP_LFO);
    createEAttribute(loadRampLFOEClass, LOAD_RAMP_LFO__ARG1);
    createEAttribute(loadRampLFOEClass, LOAD_RAMP_LFO__ARG2);
    createEAttribute(loadRampLFOEClass, LOAD_RAMP_LFO__ARG3);

    chorusReadDelayEClass = createEClass(CHORUS_READ_DELAY);
    createEAttribute(chorusReadDelayEClass, CHORUS_READ_DELAY__ARG1);
    createEAttribute(chorusReadDelayEClass, CHORUS_READ_DELAY__ARG2);
    createEReference(chorusReadDelayEClass, CHORUS_READ_DELAY__ARG3);

    chorusReadValueEClass = createEClass(CHORUS_READ_VALUE);
    createEAttribute(chorusReadValueEClass, CHORUS_READ_VALUE__ARG1);

    chorusScaleOffsetEClass = createEClass(CHORUS_SCALE_OFFSET);
    createEAttribute(chorusScaleOffsetEClass, CHORUS_SCALE_OFFSET__ARG1);
    createEAttribute(chorusScaleOffsetEClass, CHORUS_SCALE_OFFSET__ARG2);
    createEAttribute(chorusScaleOffsetEClass, CHORUS_SCALE_OFFSET__ARG3);

    readDelayPointerEClass = createEClass(READ_DELAY_POINTER);
    createEAttribute(readDelayPointerEClass, READ_DELAY_POINTER__ARG1);

    andEClass = createEClass(AND);

    orEClass = createEClass(OR);

    xorEClass = createEClass(XOR);

    jamEClass = createEClass(JAM);
    createEAttribute(jamEClass, JAM__ARG1);

    clrEClass = createEClass(CLR);

    notEClass = createEClass(NOT);

    absaEClass = createEClass(ABSA);

    skipEClass = createEClass(SKIP);
    createEAttribute(skipEClass, SKIP__FLAGS);
    createEReference(skipEClass, SKIP__LABEL);

    spinmemEClass = createEClass(SPINMEM);
    createEAttribute(spinmemEClass, SPINMEM__BUFFER);
    createEAttribute(spinmemEClass, SPINMEM__VALUE);
    createEAttribute(spinmemEClass, SPINMEM__SCALE);
    createEReference(spinmemEClass, SPINMEM__OFFSET);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isInitialized = false;

  /**
   * Complete the initialization of the package and its meta-model.  This
   * method is guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void initializePackageContents()
  {
    if (isInitialized) return;
    isInitialized = true;

    // Initialize package
    setName(eNAME);
    setNsPrefix(eNS_PREFIX);
    setNsURI(eNS_URI);

    // Create type parameters

    // Set bounds for type parameters

    // Add supertypes to classes
    inputPinEClass.getESuperTypes().add(this.getPin());
    outputPinEClass.getESuperTypes().add(this.getPin());
    audioInputEClass.getESuperTypes().add(this.getInputPin());
    audioOutputEClass.getESuperTypes().add(this.getOutputPin());
    controlInputEClass.getESuperTypes().add(this.getInputPin());
    controlOutputEClass.getESuperTypes().add(this.getOutputPin());
    spinEquateEClass.getESuperTypes().add(this.getSpinElement());
    spinIntEClass.getESuperTypes().add(this.getSpinElement());
    memEClass.getESuperTypes().add(this.getSpinElement());
    offsetEClass.getESuperTypes().add(this.getSpinElement());
    spinBoolEClass.getESuperTypes().add(this.getSpinElement());
    controlEClass.getESuperTypes().add(this.getSpinElement());
    spinSliderLabelEClass.getESuperTypes().add(this.getControl());
    sliderLabelSpinnerEClass.getESuperTypes().add(this.getControl());
    sliderLabelCheckBoxEClass.getESuperTypes().add(this.getControl());
    spinCheckBoxEClass.getESuperTypes().add(this.getControl());
    logFreqSliderLabelEClass.getESuperTypes().add(this.getControl());
    logFreq2SliderLabelEClass.getESuperTypes().add(this.getControl());
    spinRadioButtonEClass.getESuperTypes().add(this.getControl());
    spinComboBoxEClass.getESuperTypes().add(this.getControl());
    commentEClass.getESuperTypes().add(this.getSpinElement());
    labelEClass.getESuperTypes().add(this.getSpinElement());
    macroEClass.getESuperTypes().add(this.getSpinElement());
    isPinConnectedEClass.getESuperTypes().add(this.getMacro());
    isGreaterThanEClass.getESuperTypes().add(this.getMacro());
    isLessThanEClass.getESuperTypes().add(this.getMacro());
    isEqualToEClass.getESuperTypes().add(this.getMacro());
    isTrueEClass.getESuperTypes().add(this.getMacro());
    isElseEClass.getESuperTypes().add(this.getMacro());
    isEndifEClass.getESuperTypes().add(this.getMacro());
    isOrEClass.getESuperTypes().add(this.getMacro());
    getInputDefaultEClass.getESuperTypes().add(this.getMacro());
    getDelayScaleControlEClass.getESuperTypes().add(this.getMacro());
    readChorusTapEClass.getESuperTypes().add(this.getMacro());
    getSamplesFromRatioEClass.getESuperTypes().add(this.getMacro());
    semitonesToRmpRateEClass.getESuperTypes().add(this.getMacro());
    getBaseAddressEClass.getESuperTypes().add(this.getMacro());
    setOutputPinEClass.getESuperTypes().add(this.getMacro());
    minusDoubleEClass.getESuperTypes().add(this.getMacro());
    divideDoubleEClass.getESuperTypes().add(this.getMacro());
    equalsEClass.getESuperTypes().add(this.getMacro());
    equalsBoolEClass.getESuperTypes().add(this.getMacro());
    divideIntEClass.getESuperTypes().add(this.getMacro());
    multiplyDoubleEClass.getESuperTypes().add(this.getMacro());
    setChorusWidthEClass.getESuperTypes().add(this.getMacro());
    instructionEClass.getESuperTypes().add(this.getSpinElement());
    inst_B6_S1_14EClass.getESuperTypes().add(this.getInstruction());
    inst_B15_S1_9EClass.getESuperTypes().add(this.getInstruction());
    inst_B6EClass.getESuperTypes().add(this.getInstruction());
    inst_B24EClass.getESuperTypes().add(this.getInstruction());
    inst_X0EClass.getESuperTypes().add(this.getInstruction());
    inst_S1_14_S1_10EClass.getESuperTypes().add(this.getInstruction());
    readRegisterEClass.getESuperTypes().add(this.getInst_B6_S1_14());
    writeRegisterLowshelfEClass.getESuperTypes().add(this.getInst_B6_S1_14());
    writeRegisterHighshelfEClass.getESuperTypes().add(this.getInst_B6_S1_14());
    writeRegisterEClass.getESuperTypes().add(this.getInst_B6_S1_14());
    maxxEClass.getESuperTypes().add(this.getInst_B6_S1_14());
    readRegisterFilterEClass.getESuperTypes().add(this.getInst_B6_S1_14());
    mulxEClass.getESuperTypes().add(this.getInst_B6());
    ldaxEClass.getESuperTypes().add(this.getInst_B6());
    expEClass.getESuperTypes().add(this.getInst_S1_14_S1_10());
    logEClass.getESuperTypes().add(this.getInstruction());
    scaleOffsetEClass.getESuperTypes().add(this.getInst_S1_14_S1_10());
    writeDelayEClass.getESuperTypes().add(this.getInst_B15_S1_9());
    writeAllpassEClass.getESuperTypes().add(this.getInst_B15_S1_9());
    readDelayEClass.getESuperTypes().add(this.getInst_B15_S1_9());
    loadSinLFOEClass.getESuperTypes().add(this.getInstruction());
    loadRampLFOEClass.getESuperTypes().add(this.getInstruction());
    chorusReadDelayEClass.getESuperTypes().add(this.getInstruction());
    chorusReadValueEClass.getESuperTypes().add(this.getInstruction());
    chorusScaleOffsetEClass.getESuperTypes().add(this.getInstruction());
    readDelayPointerEClass.getESuperTypes().add(this.getInstruction());
    andEClass.getESuperTypes().add(this.getInst_B24());
    orEClass.getESuperTypes().add(this.getInst_B24());
    xorEClass.getESuperTypes().add(this.getInst_B24());
    jamEClass.getESuperTypes().add(this.getInstruction());
    clrEClass.getESuperTypes().add(this.getInst_X0());
    notEClass.getESuperTypes().add(this.getInst_X0());
    absaEClass.getESuperTypes().add(this.getInst_X0());
    skipEClass.getESuperTypes().add(this.getInstruction());

    // Initialize classes and features; add operations and parameters
    initEClass(programEClass, Program.class, "Program", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getProgram_Name(), ecorePackage.getEString(), "name", null, 0, 1, Program.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getProgram_Color(), ecorePackage.getEString(), "color", null, 0, 1, Program.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getProgram_Pins(), this.getPin(), null, "pins", null, 0, -1, Program.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getProgram_Elements(), this.getSpinElement(), null, "elements", null, 0, -1, Program.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(pinEClass, Pin.class, "Pin", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getPin_VarName(), ecorePackage.getEString(), "varName", null, 0, 1, Pin.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getPin_Label(), ecorePackage.getEString(), "label", null, 0, 1, Pin.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(inputPinEClass, InputPin.class, "InputPin", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(outputPinEClass, OutputPin.class, "OutputPin", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(audioInputEClass, AudioInput.class, "AudioInput", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(audioOutputEClass, AudioOutput.class, "AudioOutput", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(controlInputEClass, ControlInput.class, "ControlInput", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(controlOutputEClass, ControlOutput.class, "ControlOutput", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(spinElementEClass, SpinElement.class, "SpinElement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(spinEquateEClass, SpinEquate.class, "SpinEquate", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getSpinEquate_Ename(), ecorePackage.getEString(), "ename", null, 0, 1, SpinEquate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getSpinEquate_Value(), ecorePackage.getEString(), "value", null, 0, 1, SpinEquate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(spinIntEClass, SpinInt.class, "SpinInt", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getSpinInt_Ename(), ecorePackage.getEString(), "ename", null, 0, 1, SpinInt.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getSpinInt_Value(), ecorePackage.getEInt(), "value", null, 0, 1, SpinInt.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(memEClass, Mem.class, "Mem", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getMem_Buffer(), ecorePackage.getEString(), "buffer", null, 0, 1, Mem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getMem_Length(), ecorePackage.getEString(), "length", null, 0, 1, Mem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(offsetEClass, Offset.class, "Offset", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getOffset_Name(), ecorePackage.getEString(), "name", null, 0, 1, Offset.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getOffset_Length(), ecorePackage.getEInt(), "length", null, 0, 1, Offset.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(spinBoolEClass, SpinBool.class, "SpinBool", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getSpinBool_Label(), ecorePackage.getEString(), "label", null, 0, 1, SpinBool.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getSpinBool_Value(), ecorePackage.getEString(), "value", null, 0, 1, SpinBool.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(controlEClass, Control.class, "Control", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getControl_Ename(), ecorePackage.getEString(), "ename", null, 0, 1, Control.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(spinSliderLabelEClass, SpinSliderLabel.class, "SpinSliderLabel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getSpinSliderLabel_ControlName(), ecorePackage.getEString(), "controlName", null, 0, 1, SpinSliderLabel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getSpinSliderLabel_MinVal(), ecorePackage.getEString(), "minVal", null, 0, 1, SpinSliderLabel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getSpinSliderLabel_MaxVal(), ecorePackage.getEString(), "maxVal", null, 0, 1, SpinSliderLabel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getSpinSliderLabel_InitVal(), ecorePackage.getEString(), "initVal", null, 0, 1, SpinSliderLabel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getSpinSliderLabel_Multiplier(), ecorePackage.getEString(), "multiplier", null, 0, 1, SpinSliderLabel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getSpinSliderLabel_Precision(), ecorePackage.getEInt(), "precision", null, 0, 1, SpinSliderLabel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getSpinSliderLabel_Option(), ecorePackage.getEString(), "option", null, 0, 1, SpinSliderLabel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(sliderLabelSpinnerEClass, SliderLabelSpinner.class, "SliderLabelSpinner", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getSliderLabelSpinner_ControlName(), ecorePackage.getEString(), "controlName", null, 0, 1, SliderLabelSpinner.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getSliderLabelSpinner_MinVal(), ecorePackage.getEString(), "minVal", null, 0, 1, SliderLabelSpinner.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getSliderLabelSpinner_MaxVal(), ecorePackage.getEString(), "maxVal", null, 0, 1, SliderLabelSpinner.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getSliderLabelSpinner_InitVal(), ecorePackage.getEString(), "initVal", null, 0, 1, SliderLabelSpinner.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getSliderLabelSpinner_Multiplier(), ecorePackage.getEString(), "multiplier", null, 0, 1, SliderLabelSpinner.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getSliderLabelSpinner_Precision(), ecorePackage.getEInt(), "precision", null, 0, 1, SliderLabelSpinner.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getSliderLabelSpinner_Option(), ecorePackage.getEString(), "option", null, 0, 1, SliderLabelSpinner.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(sliderLabelCheckBoxEClass, SliderLabelCheckBox.class, "SliderLabelCheckBox", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getSliderLabelCheckBox_ControlName(), ecorePackage.getEString(), "controlName", null, 0, 1, SliderLabelCheckBox.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getSliderLabelCheckBox_MinVal(), ecorePackage.getEString(), "minVal", null, 0, 1, SliderLabelCheckBox.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getSliderLabelCheckBox_MaxVal(), ecorePackage.getEString(), "maxVal", null, 0, 1, SliderLabelCheckBox.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getSliderLabelCheckBox_InitVal(), ecorePackage.getEString(), "initVal", null, 0, 1, SliderLabelCheckBox.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getSliderLabelCheckBox_Multiplier(), ecorePackage.getEString(), "multiplier", null, 0, 1, SliderLabelCheckBox.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getSliderLabelCheckBox_Precision(), ecorePackage.getEInt(), "precision", null, 0, 1, SliderLabelCheckBox.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getSliderLabelCheckBox_Option(), ecorePackage.getEString(), "option", null, 0, 1, SliderLabelCheckBox.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(spinCheckBoxEClass, SpinCheckBox.class, "SpinCheckBox", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getSpinCheckBox_ControlName(), ecorePackage.getEString(), "controlName", null, 0, 1, SpinCheckBox.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(logFreqSliderLabelEClass, LogFreqSliderLabel.class, "LogFreqSliderLabel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getLogFreqSliderLabel_ControlName(), ecorePackage.getEString(), "controlName", null, 0, 1, LogFreqSliderLabel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getLogFreqSliderLabel_MinVal(), ecorePackage.getEString(), "minVal", null, 0, 1, LogFreqSliderLabel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getLogFreqSliderLabel_MaxVal(), ecorePackage.getEString(), "maxVal", null, 0, 1, LogFreqSliderLabel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getLogFreqSliderLabel_InitVal(), ecorePackage.getEString(), "initVal", null, 0, 1, LogFreqSliderLabel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getLogFreqSliderLabel_Multiplier(), ecorePackage.getEString(), "multiplier", null, 0, 1, LogFreqSliderLabel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getLogFreqSliderLabel_Precision(), ecorePackage.getEInt(), "precision", null, 0, 1, LogFreqSliderLabel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getLogFreqSliderLabel_Option(), ecorePackage.getEString(), "option", null, 0, 1, LogFreqSliderLabel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(logFreq2SliderLabelEClass, LogFreq2SliderLabel.class, "LogFreq2SliderLabel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getLogFreq2SliderLabel_ControlName(), ecorePackage.getEString(), "controlName", null, 0, 1, LogFreq2SliderLabel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getLogFreq2SliderLabel_MinVal(), ecorePackage.getEString(), "minVal", null, 0, 1, LogFreq2SliderLabel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getLogFreq2SliderLabel_MaxVal(), ecorePackage.getEString(), "maxVal", null, 0, 1, LogFreq2SliderLabel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getLogFreq2SliderLabel_InitVal(), ecorePackage.getEString(), "initVal", null, 0, 1, LogFreq2SliderLabel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getLogFreq2SliderLabel_Multiplier(), ecorePackage.getEString(), "multiplier", null, 0, 1, LogFreq2SliderLabel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getLogFreq2SliderLabel_Precision(), ecorePackage.getEInt(), "precision", null, 0, 1, LogFreq2SliderLabel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getLogFreq2SliderLabel_Option(), ecorePackage.getEString(), "option", null, 0, 1, LogFreq2SliderLabel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(spinRadioButtonEClass, SpinRadioButton.class, "SpinRadioButton", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getSpinRadioButton_ControlName(), ecorePackage.getEString(), "controlName", null, 0, 1, SpinRadioButton.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(spinComboBoxEClass, SpinComboBox.class, "SpinComboBox", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getSpinComboBox_Optiona(), ecorePackage.getEString(), "optiona", null, 0, 1, SpinComboBox.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getSpinComboBox_Optionb(), ecorePackage.getEString(), "optionb", null, 0, 1, SpinComboBox.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getSpinComboBox_Optionc(), ecorePackage.getEString(), "optionc", null, 0, 1, SpinComboBox.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getSpinComboBox_Optiond(), ecorePackage.getEString(), "optiond", null, 0, 1, SpinComboBox.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getSpinComboBox_Optione(), ecorePackage.getEString(), "optione", null, 0, 1, SpinComboBox.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getSpinComboBox_Optionf(), ecorePackage.getEString(), "optionf", null, 0, 1, SpinComboBox.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(commentEClass, Comment.class, "Comment", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getComment_Remark(), ecorePackage.getEString(), "remark", null, 0, 1, Comment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(labelEClass, Label.class, "Label", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getLabel_Name(), ecorePackage.getEString(), "name", null, 0, 1, Label.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(macroEClass, Macro.class, "Macro", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(isPinConnectedEClass, IsPinConnected.class, "IsPinConnected", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getIsPinConnected_Arg1(), ecorePackage.getEString(), "arg1", null, 0, 1, IsPinConnected.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(isGreaterThanEClass, IsGreaterThan.class, "IsGreaterThan", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getIsGreaterThan_Variable(), ecorePackage.getEString(), "variable", null, 0, 1, IsGreaterThan.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getIsGreaterThan_Value(), ecorePackage.getEInt(), "value", null, 0, 1, IsGreaterThan.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(isLessThanEClass, IsLessThan.class, "IsLessThan", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getIsLessThan_Variable(), ecorePackage.getEString(), "variable", null, 0, 1, IsLessThan.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getIsLessThan_Value(), ecorePackage.getEInt(), "value", null, 0, 1, IsLessThan.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(isEqualToEClass, IsEqualTo.class, "IsEqualTo", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getIsEqualTo_Variable(), ecorePackage.getEString(), "variable", null, 0, 1, IsEqualTo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getIsEqualTo_Value(), ecorePackage.getEInt(), "value", null, 0, 1, IsEqualTo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(isTrueEClass, IsTrue.class, "IsTrue", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getIsTrue_Variable(), ecorePackage.getEString(), "variable", null, 0, 1, IsTrue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(isElseEClass, IsElse.class, "IsElse", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(isEndifEClass, IsEndif.class, "IsEndif", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(isOrEClass, IsOr.class, "IsOr", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getIsOr_Var1(), ecorePackage.getEString(), "var1", null, 0, 1, IsOr.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getIsOr_Var2(), ecorePackage.getEString(), "var2", null, 0, 1, IsOr.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getIsOr_Value(), ecorePackage.getEString(), "value", null, 0, 1, IsOr.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(getInputDefaultEClass, GetInputDefault.class, "GetInputDefault", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getGetInputDefault_Label(), ecorePackage.getEString(), "label", null, 0, 1, GetInputDefault.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getGetInputDefault_Variable(), ecorePackage.getEString(), "variable", null, 0, 1, GetInputDefault.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getGetInputDefault_Scale(), ecorePackage.getEString(), "scale", null, 0, 1, GetInputDefault.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getGetInputDefault_DefaultVal(), ecorePackage.getEString(), "defaultVal", null, 0, 1, GetInputDefault.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(getDelayScaleControlEClass, GetDelayScaleControl.class, "GetDelayScaleControl", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getGetDelayScaleControl_Ratio(), ecorePackage.getEString(), "ratio", null, 0, 1, GetDelayScaleControl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getGetDelayScaleControl_Length(), ecorePackage.getEString(), "length", null, 0, 1, GetDelayScaleControl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getGetDelayScaleControl_Offset(), ecorePackage.getEString(), "offset", null, 0, 1, GetDelayScaleControl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getGetDelayScaleControl_Control(), ecorePackage.getEString(), "control", null, 0, 1, GetDelayScaleControl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(readChorusTapEClass, ReadChorusTap.class, "ReadChorusTap", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getReadChorusTap_Lfo(), ecorePackage.getEString(), "lfo", null, 0, 1, ReadChorusTap.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getReadChorusTap_Phase(), ecorePackage.getEInt(), "phase", null, 0, 1, ReadChorusTap.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getReadChorusTap_Ratio(), ecorePackage.getEString(), "ratio", null, 0, 1, ReadChorusTap.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getReadChorusTap_Length(), ecorePackage.getEString(), "length", null, 0, 1, ReadChorusTap.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getReadChorusTap_Offset(), ecorePackage.getEString(), "offset", null, 0, 1, ReadChorusTap.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(getSamplesFromRatioEClass, GetSamplesFromRatio.class, "GetSamplesFromRatio", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getGetSamplesFromRatio_Variable(), ecorePackage.getEString(), "variable", null, 0, 1, GetSamplesFromRatio.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getGetSamplesFromRatio_Ratio(), ecorePackage.getEString(), "ratio", null, 0, 1, GetSamplesFromRatio.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getGetSamplesFromRatio_Length(), ecorePackage.getEString(), "length", null, 0, 1, GetSamplesFromRatio.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(semitonesToRmpRateEClass, SemitonesToRmpRate.class, "SemitonesToRmpRate", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getSemitonesToRmpRate_Variable(), ecorePackage.getEString(), "variable", null, 0, 1, SemitonesToRmpRate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getSemitonesToRmpRate_Semitones(), ecorePackage.getEString(), "semitones", null, 0, 1, SemitonesToRmpRate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(getBaseAddressEClass, GetBaseAddress.class, "GetBaseAddress", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(setOutputPinEClass, SetOutputPin.class, "SetOutputPin", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getSetOutputPin_PinName(), ecorePackage.getEString(), "pinName", null, 0, 1, SetOutputPin.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getSetOutputPin_VarName(), ecorePackage.getEString(), "varName", null, 0, 1, SetOutputPin.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(minusDoubleEClass, MinusDouble.class, "MinusDouble", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getMinusDouble_VarName(), ecorePackage.getEString(), "varName", null, 0, 1, MinusDouble.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getMinusDouble_High(), ecorePackage.getEString(), "high", null, 0, 1, MinusDouble.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getMinusDouble_Low(), ecorePackage.getEString(), "low", null, 0, 1, MinusDouble.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(divideDoubleEClass, DivideDouble.class, "DivideDouble", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getDivideDouble_VarName(), ecorePackage.getEString(), "varName", null, 0, 1, DivideDouble.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getDivideDouble_High(), ecorePackage.getEString(), "high", null, 0, 1, DivideDouble.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getDivideDouble_Low(), ecorePackage.getEString(), "low", null, 0, 1, DivideDouble.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(equalsEClass, Equals.class, "Equals", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getEquals_VarName(), ecorePackage.getEString(), "varName", null, 0, 1, Equals.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getEquals_Value(), ecorePackage.getEString(), "value", null, 0, 1, Equals.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(equalsBoolEClass, EqualsBool.class, "EqualsBool", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getEqualsBool_VarName(), ecorePackage.getEString(), "varName", null, 0, 1, EqualsBool.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getEqualsBool_Value(), ecorePackage.getEString(), "value", null, 0, 1, EqualsBool.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(divideIntEClass, DivideInt.class, "DivideInt", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getDivideInt_VarName(), ecorePackage.getEString(), "varName", null, 0, 1, DivideInt.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getDivideInt_High(), ecorePackage.getEString(), "high", null, 0, 1, DivideInt.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getDivideInt_Low(), ecorePackage.getEInt(), "low", null, 0, 1, DivideInt.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(multiplyDoubleEClass, MultiplyDouble.class, "MultiplyDouble", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getMultiplyDouble_VarName(), ecorePackage.getEString(), "varName", null, 0, 1, MultiplyDouble.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getMultiplyDouble_High(), ecorePackage.getEString(), "high", null, 0, 1, MultiplyDouble.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getMultiplyDouble_Low(), ecorePackage.getEString(), "low", null, 0, 1, MultiplyDouble.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(setChorusWidthEClass, SetChorusWidth.class, "SetChorusWidth", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getSetChorusWidth_VarName(), ecorePackage.getEString(), "varName", null, 0, 1, SetChorusWidth.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getSetChorusWidth_Length(), ecorePackage.getEString(), "length", null, 0, 1, SetChorusWidth.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getSetChorusWidth_Scale(), ecorePackage.getEString(), "scale", null, 0, 1, SetChorusWidth.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(instructionEClass, Instruction.class, "Instruction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(inst_B6_S1_14EClass, Inst_B6_S1_14.class, "Inst_B6_S1_14", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getInst_B6_S1_14_Arg1(), ecorePackage.getEString(), "arg1", null, 0, 1, Inst_B6_S1_14.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getInst_B6_S1_14_Arg2(), ecorePackage.getEString(), "arg2", null, 0, 1, Inst_B6_S1_14.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(inst_B15_S1_9EClass, Inst_B15_S1_9.class, "Inst_B15_S1_9", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getInst_B15_S1_9_Arg1(), this.getSPINMEM(), null, "arg1", null, 0, 1, Inst_B15_S1_9.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getInst_B15_S1_9_Arg2(), ecorePackage.getEString(), "arg2", null, 0, 1, Inst_B15_S1_9.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(inst_B6EClass, Inst_B6.class, "Inst_B6", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getInst_B6_Arg1(), ecorePackage.getEString(), "arg1", null, 0, 1, Inst_B6.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(inst_B24EClass, Inst_B24.class, "Inst_B24", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getInst_B24_Arg1(), ecorePackage.getEString(), "arg1", null, 0, 1, Inst_B24.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(inst_X0EClass, Inst_X0.class, "Inst_X0", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(inst_S1_14_S1_10EClass, Inst_S1_14_S1_10.class, "Inst_S1_14_S1_10", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getInst_S1_14_S1_10_Arg1(), ecorePackage.getEString(), "arg1", null, 0, 1, Inst_S1_14_S1_10.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getInst_S1_14_S1_10_Arg2(), ecorePackage.getEString(), "arg2", null, 0, 1, Inst_S1_14_S1_10.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(readRegisterEClass, ReadRegister.class, "ReadRegister", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(writeRegisterLowshelfEClass, WriteRegisterLowshelf.class, "WriteRegisterLowshelf", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(writeRegisterHighshelfEClass, WriteRegisterHighshelf.class, "WriteRegisterHighshelf", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(writeRegisterEClass, WriteRegister.class, "WriteRegister", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(maxxEClass, Maxx.class, "Maxx", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(readRegisterFilterEClass, ReadRegisterFilter.class, "ReadRegisterFilter", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(mulxEClass, Mulx.class, "Mulx", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(ldaxEClass, Ldax.class, "Ldax", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(expEClass, Exp.class, "Exp", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(logEClass, Log.class, "Log", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getLog_Arg1(), ecorePackage.getEString(), "arg1", null, 0, 1, Log.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getLog_Arg2(), ecorePackage.getEString(), "arg2", null, 0, 1, Log.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(scaleOffsetEClass, ScaleOffset.class, "ScaleOffset", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(writeDelayEClass, WriteDelay.class, "WriteDelay", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(writeAllpassEClass, WriteAllpass.class, "WriteAllpass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(readDelayEClass, ReadDelay.class, "ReadDelay", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(loadSinLFOEClass, LoadSinLFO.class, "LoadSinLFO", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getLoadSinLFO_Arg1(), ecorePackage.getEString(), "arg1", null, 0, 1, LoadSinLFO.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getLoadSinLFO_Arg2(), ecorePackage.getEString(), "arg2", null, 0, 1, LoadSinLFO.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getLoadSinLFO_Arg3(), ecorePackage.getEString(), "arg3", null, 0, 1, LoadSinLFO.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(loadRampLFOEClass, LoadRampLFO.class, "LoadRampLFO", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getLoadRampLFO_Arg1(), ecorePackage.getEString(), "arg1", null, 0, 1, LoadRampLFO.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getLoadRampLFO_Arg2(), ecorePackage.getEString(), "arg2", null, 0, 1, LoadRampLFO.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getLoadRampLFO_Arg3(), ecorePackage.getEString(), "arg3", null, 0, 1, LoadRampLFO.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(chorusReadDelayEClass, ChorusReadDelay.class, "ChorusReadDelay", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getChorusReadDelay_Arg1(), ecorePackage.getEString(), "arg1", null, 0, 1, ChorusReadDelay.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getChorusReadDelay_Arg2(), ecorePackage.getEString(), "arg2", null, 0, 1, ChorusReadDelay.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getChorusReadDelay_Arg3(), this.getSPINMEM(), null, "arg3", null, 0, 1, ChorusReadDelay.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(chorusReadValueEClass, ChorusReadValue.class, "ChorusReadValue", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getChorusReadValue_Arg1(), ecorePackage.getEString(), "arg1", null, 0, 1, ChorusReadValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(chorusScaleOffsetEClass, ChorusScaleOffset.class, "ChorusScaleOffset", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getChorusScaleOffset_Arg1(), ecorePackage.getEString(), "arg1", null, 0, 1, ChorusScaleOffset.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getChorusScaleOffset_Arg2(), ecorePackage.getEString(), "arg2", null, 0, 1, ChorusScaleOffset.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getChorusScaleOffset_Arg3(), ecorePackage.getEString(), "arg3", null, 0, 1, ChorusScaleOffset.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(readDelayPointerEClass, ReadDelayPointer.class, "ReadDelayPointer", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getReadDelayPointer_Arg1(), ecorePackage.getEString(), "arg1", null, 0, 1, ReadDelayPointer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(andEClass, And.class, "And", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(orEClass, Or.class, "Or", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(xorEClass, Xor.class, "Xor", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(jamEClass, Jam.class, "Jam", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getJam_Arg1(), ecorePackage.getEString(), "arg1", null, 0, 1, Jam.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(clrEClass, Clr.class, "Clr", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(notEClass, Not.class, "Not", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(absaEClass, Absa.class, "Absa", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(skipEClass, Skip.class, "Skip", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getSkip_Flags(), ecorePackage.getEString(), "flags", null, 0, 1, Skip.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getSkip_Label(), this.getLabel(), null, "label", null, 0, 1, Skip.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(spinmemEClass, com.holycityaudio.spincad.spinCAD.SPINMEM.class, "SPINMEM", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getSPINMEM_Buffer(), ecorePackage.getEString(), "buffer", null, 0, 1, com.holycityaudio.spincad.spinCAD.SPINMEM.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getSPINMEM_Value(), ecorePackage.getEInt(), "value", null, 0, 1, com.holycityaudio.spincad.spinCAD.SPINMEM.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getSPINMEM_Scale(), ecorePackage.getEString(), "scale", null, 0, 1, com.holycityaudio.spincad.spinCAD.SPINMEM.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getSPINMEM_Offset(), this.getOffset(), null, "offset", null, 0, 1, com.holycityaudio.spincad.spinCAD.SPINMEM.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    // Create resource
    createResource(eNS_URI);
  }

} //SpinCADPackageImpl
