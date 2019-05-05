/**
 */
package com.holycityaudio.spincad.spinCAD.impl;

import com.holycityaudio.spincad.spinCAD.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class SpinCADFactoryImpl extends EFactoryImpl implements SpinCADFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static SpinCADFactory init()
  {
    try
    {
      SpinCADFactory theSpinCADFactory = (SpinCADFactory)EPackage.Registry.INSTANCE.getEFactory(SpinCADPackage.eNS_URI);
      if (theSpinCADFactory != null)
      {
        return theSpinCADFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new SpinCADFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SpinCADFactoryImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject create(EClass eClass)
  {
    switch (eClass.getClassifierID())
    {
      case SpinCADPackage.PROGRAM: return createProgram();
      case SpinCADPackage.PIN: return createPin();
      case SpinCADPackage.INPUT_PIN: return createInputPin();
      case SpinCADPackage.OUTPUT_PIN: return createOutputPin();
      case SpinCADPackage.AUDIO_INPUT: return createAudioInput();
      case SpinCADPackage.AUDIO_OUTPUT: return createAudioOutput();
      case SpinCADPackage.CONTROL_INPUT: return createControlInput();
      case SpinCADPackage.CONTROL_OUTPUT: return createControlOutput();
      case SpinCADPackage.SPIN_ELEMENT: return createSpinElement();
      case SpinCADPackage.SPIN_EQUATE: return createSpinEquate();
      case SpinCADPackage.SPIN_INT: return createSpinInt();
      case SpinCADPackage.MEM: return createMem();
      case SpinCADPackage.OFFSET: return createOffset();
      case SpinCADPackage.SPIN_BOOL: return createSpinBool();
      case SpinCADPackage.CONTROL: return createControl();
      case SpinCADPackage.SPIN_SLIDER_LABEL: return createSpinSliderLabel();
      case SpinCADPackage.SLIDER_LABEL_SPINNER: return createSliderLabelSpinner();
      case SpinCADPackage.SLIDER_LABEL_CHECK_BOX: return createSliderLabelCheckBox();
      case SpinCADPackage.SPIN_CHECK_BOX: return createSpinCheckBox();
      case SpinCADPackage.LOG_FREQ_SLIDER_LABEL: return createLogFreqSliderLabel();
      case SpinCADPackage.LOG_FREQ2_SLIDER_LABEL: return createLogFreq2SliderLabel();
      case SpinCADPackage.SPIN_RADIO_BUTTON: return createSpinRadioButton();
      case SpinCADPackage.SPIN_COMBO_BOX: return createSpinComboBox();
      case SpinCADPackage.COMMENT: return createComment();
      case SpinCADPackage.LABEL: return createLabel();
      case SpinCADPackage.MACRO: return createMacro();
      case SpinCADPackage.IS_PIN_CONNECTED: return createIsPinConnected();
      case SpinCADPackage.IS_GREATER_THAN: return createIsGreaterThan();
      case SpinCADPackage.IS_LESS_THAN: return createIsLessThan();
      case SpinCADPackage.IS_EQUAL_TO: return createIsEqualTo();
      case SpinCADPackage.IS_TRUE: return createIsTrue();
      case SpinCADPackage.IS_ELSE: return createIsElse();
      case SpinCADPackage.IS_ENDIF: return createIsEndif();
      case SpinCADPackage.IS_OR: return createIsOr();
      case SpinCADPackage.GET_INPUT_DEFAULT: return createGetInputDefault();
      case SpinCADPackage.GET_DELAY_SCALE_CONTROL: return createGetDelayScaleControl();
      case SpinCADPackage.READ_CHORUS_TAP: return createReadChorusTap();
      case SpinCADPackage.GET_SAMPLES_FROM_RATIO: return createGetSamplesFromRatio();
      case SpinCADPackage.SEMITONES_TO_RMP_RATE: return createSemitonesToRmpRate();
      case SpinCADPackage.GET_BASE_ADDRESS: return createGetBaseAddress();
      case SpinCADPackage.SET_OUTPUT_PIN: return createSetOutputPin();
      case SpinCADPackage.MINUS_DOUBLE: return createMinusDouble();
      case SpinCADPackage.DIVIDE_DOUBLE: return createDivideDouble();
      case SpinCADPackage.EQUALS: return createEquals();
      case SpinCADPackage.EQUALS_BOOL: return createEqualsBool();
      case SpinCADPackage.DIVIDE_INT: return createDivideInt();
      case SpinCADPackage.MULTIPLY_DOUBLE: return createMultiplyDouble();
      case SpinCADPackage.SET_CHORUS_WIDTH: return createSetChorusWidth();
      case SpinCADPackage.INSTRUCTION: return createInstruction();
      case SpinCADPackage.INST_B6_S1_14: return createInst_B6_S1_14();
      case SpinCADPackage.INST_B15_S1_9: return createInst_B15_S1_9();
      case SpinCADPackage.INST_B6: return createInst_B6();
      case SpinCADPackage.INST_B24: return createInst_B24();
      case SpinCADPackage.INST_X0: return createInst_X0();
      case SpinCADPackage.INST_S1_14_S1_10: return createInst_S1_14_S1_10();
      case SpinCADPackage.READ_REGISTER: return createReadRegister();
      case SpinCADPackage.WRITE_REGISTER_LOWSHELF: return createWriteRegisterLowshelf();
      case SpinCADPackage.WRITE_REGISTER_HIGHSHELF: return createWriteRegisterHighshelf();
      case SpinCADPackage.WRITE_REGISTER: return createWriteRegister();
      case SpinCADPackage.MAXX: return createMaxx();
      case SpinCADPackage.READ_REGISTER_FILTER: return createReadRegisterFilter();
      case SpinCADPackage.MULX: return createMulx();
      case SpinCADPackage.LDAX: return createLdax();
      case SpinCADPackage.EXP: return createExp();
      case SpinCADPackage.LOG: return createLog();
      case SpinCADPackage.SCALE_OFFSET: return createScaleOffset();
      case SpinCADPackage.WRITE_DELAY: return createWriteDelay();
      case SpinCADPackage.WRITE_ALLPASS: return createWriteAllpass();
      case SpinCADPackage.READ_DELAY: return createReadDelay();
      case SpinCADPackage.LOAD_SIN_LFO: return createLoadSinLFO();
      case SpinCADPackage.LOAD_RAMP_LFO: return createLoadRampLFO();
      case SpinCADPackage.CHORUS_READ_DELAY: return createChorusReadDelay();
      case SpinCADPackage.CHORUS_READ_VALUE: return createChorusReadValue();
      case SpinCADPackage.CHORUS_SCALE_OFFSET: return createChorusScaleOffset();
      case SpinCADPackage.READ_DELAY_POINTER: return createReadDelayPointer();
      case SpinCADPackage.AND: return createAnd();
      case SpinCADPackage.OR: return createOr();
      case SpinCADPackage.XOR: return createXor();
      case SpinCADPackage.JAM: return createJam();
      case SpinCADPackage.CLR: return createClr();
      case SpinCADPackage.NOT: return createNot();
      case SpinCADPackage.ABSA: return createAbsa();
      case SpinCADPackage.SKIP: return createSkip();
      case SpinCADPackage.SPINMEM: return createSPINMEM();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Program createProgram()
  {
    ProgramImpl program = new ProgramImpl();
    return program;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Pin createPin()
  {
    PinImpl pin = new PinImpl();
    return pin;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public InputPin createInputPin()
  {
    InputPinImpl inputPin = new InputPinImpl();
    return inputPin;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public OutputPin createOutputPin()
  {
    OutputPinImpl outputPin = new OutputPinImpl();
    return outputPin;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public AudioInput createAudioInput()
  {
    AudioInputImpl audioInput = new AudioInputImpl();
    return audioInput;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public AudioOutput createAudioOutput()
  {
    AudioOutputImpl audioOutput = new AudioOutputImpl();
    return audioOutput;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public ControlInput createControlInput()
  {
    ControlInputImpl controlInput = new ControlInputImpl();
    return controlInput;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public ControlOutput createControlOutput()
  {
    ControlOutputImpl controlOutput = new ControlOutputImpl();
    return controlOutput;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public SpinElement createSpinElement()
  {
    SpinElementImpl spinElement = new SpinElementImpl();
    return spinElement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public SpinEquate createSpinEquate()
  {
    SpinEquateImpl spinEquate = new SpinEquateImpl();
    return spinEquate;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public SpinInt createSpinInt()
  {
    SpinIntImpl spinInt = new SpinIntImpl();
    return spinInt;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Mem createMem()
  {
    MemImpl mem = new MemImpl();
    return mem;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Offset createOffset()
  {
    OffsetImpl offset = new OffsetImpl();
    return offset;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public SpinBool createSpinBool()
  {
    SpinBoolImpl spinBool = new SpinBoolImpl();
    return spinBool;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Control createControl()
  {
    ControlImpl control = new ControlImpl();
    return control;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public SpinSliderLabel createSpinSliderLabel()
  {
    SpinSliderLabelImpl spinSliderLabel = new SpinSliderLabelImpl();
    return spinSliderLabel;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public SliderLabelSpinner createSliderLabelSpinner()
  {
    SliderLabelSpinnerImpl sliderLabelSpinner = new SliderLabelSpinnerImpl();
    return sliderLabelSpinner;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public SliderLabelCheckBox createSliderLabelCheckBox()
  {
    SliderLabelCheckBoxImpl sliderLabelCheckBox = new SliderLabelCheckBoxImpl();
    return sliderLabelCheckBox;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public SpinCheckBox createSpinCheckBox()
  {
    SpinCheckBoxImpl spinCheckBox = new SpinCheckBoxImpl();
    return spinCheckBox;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public LogFreqSliderLabel createLogFreqSliderLabel()
  {
    LogFreqSliderLabelImpl logFreqSliderLabel = new LogFreqSliderLabelImpl();
    return logFreqSliderLabel;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public LogFreq2SliderLabel createLogFreq2SliderLabel()
  {
    LogFreq2SliderLabelImpl logFreq2SliderLabel = new LogFreq2SliderLabelImpl();
    return logFreq2SliderLabel;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public SpinRadioButton createSpinRadioButton()
  {
    SpinRadioButtonImpl spinRadioButton = new SpinRadioButtonImpl();
    return spinRadioButton;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public SpinComboBox createSpinComboBox()
  {
    SpinComboBoxImpl spinComboBox = new SpinComboBoxImpl();
    return spinComboBox;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Comment createComment()
  {
    CommentImpl comment = new CommentImpl();
    return comment;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Label createLabel()
  {
    LabelImpl label = new LabelImpl();
    return label;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Macro createMacro()
  {
    MacroImpl macro = new MacroImpl();
    return macro;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public IsPinConnected createIsPinConnected()
  {
    IsPinConnectedImpl isPinConnected = new IsPinConnectedImpl();
    return isPinConnected;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public IsGreaterThan createIsGreaterThan()
  {
    IsGreaterThanImpl isGreaterThan = new IsGreaterThanImpl();
    return isGreaterThan;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public IsLessThan createIsLessThan()
  {
    IsLessThanImpl isLessThan = new IsLessThanImpl();
    return isLessThan;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public IsEqualTo createIsEqualTo()
  {
    IsEqualToImpl isEqualTo = new IsEqualToImpl();
    return isEqualTo;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public IsTrue createIsTrue()
  {
    IsTrueImpl isTrue = new IsTrueImpl();
    return isTrue;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public IsElse createIsElse()
  {
    IsElseImpl isElse = new IsElseImpl();
    return isElse;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public IsEndif createIsEndif()
  {
    IsEndifImpl isEndif = new IsEndifImpl();
    return isEndif;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public IsOr createIsOr()
  {
    IsOrImpl isOr = new IsOrImpl();
    return isOr;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public GetInputDefault createGetInputDefault()
  {
    GetInputDefaultImpl getInputDefault = new GetInputDefaultImpl();
    return getInputDefault;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public GetDelayScaleControl createGetDelayScaleControl()
  {
    GetDelayScaleControlImpl getDelayScaleControl = new GetDelayScaleControlImpl();
    return getDelayScaleControl;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public ReadChorusTap createReadChorusTap()
  {
    ReadChorusTapImpl readChorusTap = new ReadChorusTapImpl();
    return readChorusTap;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public GetSamplesFromRatio createGetSamplesFromRatio()
  {
    GetSamplesFromRatioImpl getSamplesFromRatio = new GetSamplesFromRatioImpl();
    return getSamplesFromRatio;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public SemitonesToRmpRate createSemitonesToRmpRate()
  {
    SemitonesToRmpRateImpl semitonesToRmpRate = new SemitonesToRmpRateImpl();
    return semitonesToRmpRate;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public GetBaseAddress createGetBaseAddress()
  {
    GetBaseAddressImpl getBaseAddress = new GetBaseAddressImpl();
    return getBaseAddress;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public SetOutputPin createSetOutputPin()
  {
    SetOutputPinImpl setOutputPin = new SetOutputPinImpl();
    return setOutputPin;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public MinusDouble createMinusDouble()
  {
    MinusDoubleImpl minusDouble = new MinusDoubleImpl();
    return minusDouble;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public DivideDouble createDivideDouble()
  {
    DivideDoubleImpl divideDouble = new DivideDoubleImpl();
    return divideDouble;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Equals createEquals()
  {
    EqualsImpl equals = new EqualsImpl();
    return equals;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EqualsBool createEqualsBool()
  {
    EqualsBoolImpl equalsBool = new EqualsBoolImpl();
    return equalsBool;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public DivideInt createDivideInt()
  {
    DivideIntImpl divideInt = new DivideIntImpl();
    return divideInt;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public MultiplyDouble createMultiplyDouble()
  {
    MultiplyDoubleImpl multiplyDouble = new MultiplyDoubleImpl();
    return multiplyDouble;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public SetChorusWidth createSetChorusWidth()
  {
    SetChorusWidthImpl setChorusWidth = new SetChorusWidthImpl();
    return setChorusWidth;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Instruction createInstruction()
  {
    InstructionImpl instruction = new InstructionImpl();
    return instruction;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Inst_B6_S1_14 createInst_B6_S1_14()
  {
    Inst_B6_S1_14Impl inst_B6_S1_14 = new Inst_B6_S1_14Impl();
    return inst_B6_S1_14;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Inst_B15_S1_9 createInst_B15_S1_9()
  {
    Inst_B15_S1_9Impl inst_B15_S1_9 = new Inst_B15_S1_9Impl();
    return inst_B15_S1_9;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Inst_B6 createInst_B6()
  {
    Inst_B6Impl inst_B6 = new Inst_B6Impl();
    return inst_B6;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Inst_B24 createInst_B24()
  {
    Inst_B24Impl inst_B24 = new Inst_B24Impl();
    return inst_B24;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Inst_X0 createInst_X0()
  {
    Inst_X0Impl inst_X0 = new Inst_X0Impl();
    return inst_X0;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Inst_S1_14_S1_10 createInst_S1_14_S1_10()
  {
    Inst_S1_14_S1_10Impl inst_S1_14_S1_10 = new Inst_S1_14_S1_10Impl();
    return inst_S1_14_S1_10;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public ReadRegister createReadRegister()
  {
    ReadRegisterImpl readRegister = new ReadRegisterImpl();
    return readRegister;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public WriteRegisterLowshelf createWriteRegisterLowshelf()
  {
    WriteRegisterLowshelfImpl writeRegisterLowshelf = new WriteRegisterLowshelfImpl();
    return writeRegisterLowshelf;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public WriteRegisterHighshelf createWriteRegisterHighshelf()
  {
    WriteRegisterHighshelfImpl writeRegisterHighshelf = new WriteRegisterHighshelfImpl();
    return writeRegisterHighshelf;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public WriteRegister createWriteRegister()
  {
    WriteRegisterImpl writeRegister = new WriteRegisterImpl();
    return writeRegister;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Maxx createMaxx()
  {
    MaxxImpl maxx = new MaxxImpl();
    return maxx;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public ReadRegisterFilter createReadRegisterFilter()
  {
    ReadRegisterFilterImpl readRegisterFilter = new ReadRegisterFilterImpl();
    return readRegisterFilter;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Mulx createMulx()
  {
    MulxImpl mulx = new MulxImpl();
    return mulx;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Ldax createLdax()
  {
    LdaxImpl ldax = new LdaxImpl();
    return ldax;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Exp createExp()
  {
    ExpImpl exp = new ExpImpl();
    return exp;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Log createLog()
  {
    LogImpl log = new LogImpl();
    return log;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public ScaleOffset createScaleOffset()
  {
    ScaleOffsetImpl scaleOffset = new ScaleOffsetImpl();
    return scaleOffset;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public WriteDelay createWriteDelay()
  {
    WriteDelayImpl writeDelay = new WriteDelayImpl();
    return writeDelay;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public WriteAllpass createWriteAllpass()
  {
    WriteAllpassImpl writeAllpass = new WriteAllpassImpl();
    return writeAllpass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public ReadDelay createReadDelay()
  {
    ReadDelayImpl readDelay = new ReadDelayImpl();
    return readDelay;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public LoadSinLFO createLoadSinLFO()
  {
    LoadSinLFOImpl loadSinLFO = new LoadSinLFOImpl();
    return loadSinLFO;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public LoadRampLFO createLoadRampLFO()
  {
    LoadRampLFOImpl loadRampLFO = new LoadRampLFOImpl();
    return loadRampLFO;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public ChorusReadDelay createChorusReadDelay()
  {
    ChorusReadDelayImpl chorusReadDelay = new ChorusReadDelayImpl();
    return chorusReadDelay;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public ChorusReadValue createChorusReadValue()
  {
    ChorusReadValueImpl chorusReadValue = new ChorusReadValueImpl();
    return chorusReadValue;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public ChorusScaleOffset createChorusScaleOffset()
  {
    ChorusScaleOffsetImpl chorusScaleOffset = new ChorusScaleOffsetImpl();
    return chorusScaleOffset;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public ReadDelayPointer createReadDelayPointer()
  {
    ReadDelayPointerImpl readDelayPointer = new ReadDelayPointerImpl();
    return readDelayPointer;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public And createAnd()
  {
    AndImpl and = new AndImpl();
    return and;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Or createOr()
  {
    OrImpl or = new OrImpl();
    return or;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Xor createXor()
  {
    XorImpl xor = new XorImpl();
    return xor;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Jam createJam()
  {
    JamImpl jam = new JamImpl();
    return jam;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Clr createClr()
  {
    ClrImpl clr = new ClrImpl();
    return clr;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Not createNot()
  {
    NotImpl not = new NotImpl();
    return not;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Absa createAbsa()
  {
    AbsaImpl absa = new AbsaImpl();
    return absa;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Skip createSkip()
  {
    SkipImpl skip = new SkipImpl();
    return skip;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public SPINMEM createSPINMEM()
  {
    SPINMEMImpl spinmem = new SPINMEMImpl();
    return spinmem;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public SpinCADPackage getSpinCADPackage()
  {
    return (SpinCADPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static SpinCADPackage getPackage()
  {
    return SpinCADPackage.eINSTANCE;
  }

} //SpinCADFactoryImpl
