/**
 * SpinCAD Builder - DSP Development Tool for the Spin FV-1
 * SpinCADBlockGenerator.xtend
 * This file supplies template code generation for the SpinCADBlock data type.
 * This turns into a Java boolean.
 * 
 * Copyright (C) 2015-2019 - Gary Worsham
 * 
 *   This program is free software: you can redistribute it and/or modify
 *   it under the terms of the GNU General Public License as published by
 *   the Free Software Foundation, either version 3 of the License, or
 *   (at your option) any later version.
 * 
 *   This program is distributed in the hope that it will be useful,
 *   but WITHOUT ANY WARRANTY; without even the implied warranty of
 *   MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *   GNU General Public License for more details.
 * 
 *   You should have received a copy of the GNU General Public License
 *   along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package com.holycityaudio.spincad.generator;

import com.google.common.base.Objects;
import com.holycityaudio.spincad.generator.UtilSC;
import com.holycityaudio.spincad.generator.spcbBool;
import com.holycityaudio.spincad.generator.spcbCheckBox;
import com.holycityaudio.spincad.generator.spcbComboBox;
import com.holycityaudio.spincad.generator.spcbEquate;
import com.holycityaudio.spincad.generator.spcbSliderLabel;
import com.holycityaudio.spincad.generator.spcbSliderLabelSpinner;
import com.holycityaudio.spincad.spinCAD.Absa;
import com.holycityaudio.spincad.spinCAD.And;
import com.holycityaudio.spincad.spinCAD.AudioInput;
import com.holycityaudio.spincad.spinCAD.AudioOutput;
import com.holycityaudio.spincad.spinCAD.ChorusReadDelay;
import com.holycityaudio.spincad.spinCAD.ChorusReadValue;
import com.holycityaudio.spincad.spinCAD.ChorusScaleOffset;
import com.holycityaudio.spincad.spinCAD.Clr;
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
import com.holycityaudio.spincad.spinCAD.Ldax;
import com.holycityaudio.spincad.spinCAD.LoadRampLFO;
import com.holycityaudio.spincad.spinCAD.LoadSinLFO;
import com.holycityaudio.spincad.spinCAD.Log;
import com.holycityaudio.spincad.spinCAD.Macro;
import com.holycityaudio.spincad.spinCAD.Maxx;
import com.holycityaudio.spincad.spinCAD.Mem;
import com.holycityaudio.spincad.spinCAD.MinusDouble;
import com.holycityaudio.spincad.spinCAD.MultiplyDouble;
import com.holycityaudio.spincad.spinCAD.Mulx;
import com.holycityaudio.spincad.spinCAD.Not;
import com.holycityaudio.spincad.spinCAD.Offset;
import com.holycityaudio.spincad.spinCAD.Or;
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
import com.holycityaudio.spincad.spinCAD.SliderLabelSpinner;
import com.holycityaudio.spincad.spinCAD.SpinBool;
import com.holycityaudio.spincad.spinCAD.SpinCheckBox;
import com.holycityaudio.spincad.spinCAD.SpinComboBox;
import com.holycityaudio.spincad.spinCAD.SpinElement;
import com.holycityaudio.spincad.spinCAD.SpinEquate;
import com.holycityaudio.spincad.spinCAD.SpinSliderLabel;
import com.holycityaudio.spincad.spinCAD.WriteAllpass;
import com.holycityaudio.spincad.spinCAD.WriteDelay;
import com.holycityaudio.spincad.spinCAD.WriteRegister;
import com.holycityaudio.spincad.spinCAD.WriteRegisterHighshelf;
import com.holycityaudio.spincad.spinCAD.WriteRegisterLowshelf;
import com.holycityaudio.spincad.spinCAD.Xor;
import java.awt.Label;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtend2.lib.StringConcatenation;

@SuppressWarnings("all")
public class SpinCADBlockGenerator {
  public CharSequence codeGenerate(final String blockName, final Program pr) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("/* SpinCAD Designer - DSP Development Tool for the Spin FV-1 ");
    _builder.newLine();
    _builder.append(" ");
    _builder.append("* ");
    _builder.append(blockName, " ");
    _builder.append("CADBlock.java");
    _builder.newLineIfNotEmpty();
    _builder.append(" ");
    _builder.append("* Copyright (C) 2015 - Gary Worsham ");
    _builder.newLine();
    _builder.append(" ");
    _builder.append("* Based on ElmGen by Andrew Kilpatrick ");
    _builder.newLine();
    _builder.append(" ");
    _builder.append("* ");
    _builder.newLine();
    _builder.append(" ");
    _builder.append("*   This program is free software: you can redistribute it and/or modify ");
    _builder.newLine();
    _builder.append(" ");
    _builder.append("*   it under the terms of the GNU General Public License as published by ");
    _builder.newLine();
    _builder.append(" ");
    _builder.append("*   the Free Software Foundation, either version 3 of the License, or ");
    _builder.newLine();
    _builder.append(" ");
    _builder.append("*   (at your option) any later version. ");
    _builder.newLine();
    _builder.append(" ");
    _builder.append("* ");
    _builder.newLine();
    _builder.append(" ");
    _builder.append("*   This program is distributed in the hope that it will be useful, ");
    _builder.newLine();
    _builder.append(" ");
    _builder.append("*   but WITHOUT ANY WARRANTY; without even the implied warranty of ");
    _builder.newLine();
    _builder.append(" ");
    _builder.append("*   MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the ");
    _builder.newLine();
    _builder.append(" ");
    _builder.append("*   GNU General Public License for more details. ");
    _builder.newLine();
    _builder.append(" ");
    _builder.append("* ");
    _builder.newLine();
    _builder.append(" ");
    _builder.append("*   You should have received a copy of the GNU General Public License ");
    _builder.newLine();
    _builder.append(" ");
    _builder.append("*   along with this program.  If not, see <http://www.gnu.org/licenses/>. ");
    _builder.newLine();
    _builder.append(" ");
    _builder.append("*     ");
    _builder.newLine();
    _builder.append(" ");
    _builder.append("*/ ");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("package com.holycityaudio.SpinCAD.CADBlocks;");
    _builder.newLine();
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("import java.awt.Color;");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("import com.holycityaudio.SpinCAD.SpinCADBlock;");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("import com.holycityaudio.SpinCAD.SpinCADPin;");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("import com.holycityaudio.SpinCAD.SpinFXBlock;");
    _builder.newLine();
    _builder.append(" \t\t");
    _builder.append("import com.holycityaudio.SpinCAD.ControlPanel.");
    _builder.append((blockName + "ControlPanel"), " \t\t");
    _builder.append(";");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t");
    _builder.newLine();
    _builder.append("\t    ");
    _builder.append("@SuppressWarnings(\"unused\")");
    _builder.newLine();
    _builder.append("\t    ");
    _builder.append("public class ");
    _builder.append((blockName + "CADBlock"), "\t    ");
    _builder.append(" extends SpinCADBlock {");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t\t");
    _builder.append("private static final long serialVersionUID = 1L;");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("private ");
    _builder.append((blockName + "ControlPanel"), "\t\t\t");
    _builder.append(" cp = null;");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t\t");
    _builder.newLine();
    {
      EList<SpinElement> _elements = pr.getElements();
      for(final SpinElement e : _elements) {
        _builder.append("\t\t\t");
        CharSequence _switchResult = null;
        boolean _matched = false;
        if (e instanceof SpinEquate) {
          _matched=true;
          _switchResult = spcbEquate.declareVar(((SpinEquate)e));
        }
        if (!_matched) {
          if (e instanceof SpinBool) {
            _matched=true;
            _switchResult = spcbBool.declareVar(((SpinBool)e));
          }
        }
        _builder.append(_switchResult, "\t\t\t");
        _builder.append(" ");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("public ");
    _builder.append((blockName + "CADBlock"), "\t\t\t");
    _builder.append("(int x, int y) {");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t\t\t");
    _builder.append("super(x, y);");
    _builder.newLine();
    _builder.append("\t\t\t\t");
    _builder.append("setName(\"");
    String _name = pr.getName();
    _builder.append(_name, "\t\t\t\t");
    _builder.append("\");\t\t\t\t\t");
    _builder.newLineIfNotEmpty();
    {
      String _color = pr.getColor();
      boolean _notEquals = (!Objects.equal(_color, null));
      if (_notEquals) {
        _builder.append("\t\t\t");
        _builder.append("setBorderColor(new Color(");
        String _color_1 = pr.getColor();
        _builder.append(_color_1, "\t\t\t");
        _builder.append("));");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("\t\t\t\t");
    _builder.append("// Iterate through pin definitions and allocate or assign as needed");
    _builder.newLine();
    {
      EList<Pin> _pins = pr.getPins();
      for(final Pin p : _pins) {
        _builder.append("\t\t\t\t");
        CharSequence _switchResult_1 = null;
        boolean _matched_1 = false;
        if (p instanceof AudioInput) {
          _matched_1=true;
          _switchResult_1 = this.genAudioInput(p);
        }
        if (!_matched_1) {
          if (p instanceof AudioOutput) {
            _matched_1=true;
            _switchResult_1 = this.genAudioOutput(p);
          }
        }
        if (!_matched_1) {
          if (p instanceof ControlOutput) {
            _matched_1=true;
            _switchResult_1 = this.genControlOutput(p);
          }
        }
        if (!_matched_1) {
          if (p instanceof ControlInput) {
            _matched_1=true;
            _switchResult_1 = this.genControlInput(p);
          }
        }
        _builder.append(_switchResult_1, "\t\t\t\t");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("\t\t\t");
    _builder.append("// if any control panel elements declared, set hasControlPanel to true");
    _builder.newLine();
    {
      EList<SpinElement> _elements_1 = pr.getElements();
      for(final SpinElement e_1 : _elements_1) {
        _builder.append("\t\t\t");
        CharSequence _switchResult_2 = null;
        boolean _matched_2 = false;
        if (e_1 instanceof SpinCheckBox) {
          _matched_2=true;
          _switchResult_2 = this.setHasControlPanel();
        }
        if (!_matched_2) {
          if (e_1 instanceof SpinComboBox) {
            _matched_2=true;
            _switchResult_2 = this.setHasControlPanel();
          }
        }
        if (!_matched_2) {
          if (e_1 instanceof SpinSliderLabel) {
            _matched_2=true;
            _switchResult_2 = this.setHasControlPanel();
          }
        }
        if (!_matched_2) {
          if (e_1 instanceof SliderLabelSpinner) {
            _matched_2=true;
            _switchResult_2 = this.setHasControlPanel();
          }
        }
        _builder.append(_switchResult_2, "\t\t\t");
        _builder.newLineIfNotEmpty();
        _builder.append("\t\t\t");
      }
    }
    _builder.append("\t\t\t}");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("// In the event there are parameters editable by control panel");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("public void editBlock(){ ");
    _builder.newLine();
    _builder.append("\t\t\t\t");
    _builder.append("if(cp == null) {");
    _builder.newLine();
    _builder.append("\t\t\t\t\t");
    _builder.append("if(hasControlPanel == true) {");
    _builder.newLine();
    _builder.append("\t\t\t\t\t\t");
    _builder.append("cp = new ");
    _builder.append((blockName + "ControlPanel"), "\t\t\t\t\t\t");
    _builder.append("(this);");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t\t\t\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("\t\t\t\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("public void clearCP() {");
    _builder.newLine();
    _builder.append("\t\t\t\t");
    _builder.append("cp = null;");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("}\t");
    _builder.newLine();
    _builder.append("\t\t\t\t");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("public void generateCode(SpinFXBlock sfxb) {");
    _builder.newLine();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("// Iterate through mem and equ statements, allocate accordingly");
    _builder.newLine();
    {
      EList<SpinElement> _elements_2 = pr.getElements();
      for(final SpinElement e_2 : _elements_2) {
        _builder.append("\t\t\t");
        CharSequence _switchResult_3 = null;
        boolean _matched_3 = false;
        if (e_2 instanceof SpinBool) {
          _matched_3=true;
          _switchResult_3 = spcbBool.initialize(((SpinBool)e_2));
        }
        _builder.append(_switchResult_3, "\t\t\t");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.newLine();
    {
      EList<SpinElement> _elements_3 = pr.getElements();
      for(final SpinElement e_3 : _elements_3) {
        _builder.append("\t\t\t");
        CharSequence _switchResult_4 = null;
        boolean _matched_4 = false;
        if (e_3 instanceof Offset) {
          _matched_4=true;
          _switchResult_4 = this.genOffset(((Offset)e_3));
        }
        _builder.append(_switchResult_4, "\t\t\t");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("\t\t\t");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("sfxb.comment(getName());");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("SpinCADPin sp = null;");
    _builder.newLine();
    _builder.append("\t\t\t\t\t");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("// Iterate through pin definitions and connect or assign as needed");
    _builder.newLine();
    {
      EList<Pin> _pins_1 = pr.getPins();
      for(final Pin p_1 : _pins_1) {
        _builder.append("\t\t\t");
        CharSequence _switchResult_5 = null;
        boolean _matched_5 = false;
        if (p_1 instanceof InputPin) {
          _matched_5=true;
          _switchResult_5 = this.connect(p_1);
        }
        _builder.append(_switchResult_5, "\t\t\t");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("\t\t\t");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("// finally, generate the instructions");
    _builder.newLine();
    {
      EList<SpinElement> _elements_4 = pr.getElements();
      for(final SpinElement e_4 : _elements_4) {
        _builder.append("\t\t\t");
        CharSequence _switchResult_6 = null;
        boolean _matched_6 = false;
        if (e_4 instanceof Instruction) {
          _matched_6=true;
          _switchResult_6 = this.genInstruction(((Instruction)e_4));
        }
        if (!_matched_6) {
          if (e_4 instanceof SpinEquate) {
            _matched_6=true;
            _switchResult_6 = this.setEquateReg(((SpinEquate)e_4));
          }
        }
        if (!_matched_6) {
          if (e_4 instanceof Mem) {
            _matched_6=true;
            _switchResult_6 = this.genMem(((Mem)e_4));
          }
        }
        if (!_matched_6) {
          if (e_4 instanceof Macro) {
            _matched_6=true;
            _switchResult_6 = this.genMacro(((Macro)e_4));
          }
        }
        _builder.append(_switchResult_6, "\t\t\t");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("// create setters and getter for control panel variables");
    _builder.newLine();
    {
      EList<SpinElement> _elements_5 = pr.getElements();
      for(final SpinElement e_5 : _elements_5) {
        _builder.append("\t\t\t");
        CharSequence _switchResult_7 = null;
        boolean _matched_7 = false;
        if (e_5 instanceof SpinSliderLabel) {
          _matched_7=true;
          _switchResult_7 = spcbSliderLabel.genSetterGetter(((SpinSliderLabel)e_5));
        }
        if (!_matched_7) {
          if (e_5 instanceof SliderLabelSpinner) {
            _matched_7=true;
            _switchResult_7 = spcbSliderLabelSpinner.genSetterGetter(((SliderLabelSpinner)e_5));
          }
        }
        if (!_matched_7) {
          if (e_5 instanceof SpinCheckBox) {
            _matched_7=true;
            _switchResult_7 = spcbCheckBox.genSetterGetter(((SpinCheckBox)e_5));
          }
        }
        if (!_matched_7) {
          if (e_5 instanceof SpinComboBox) {
            _matched_7=true;
            _switchResult_7 = spcbComboBox.genSetterGetter(((SpinComboBox)e_5));
          }
        }
        _builder.append(_switchResult_7, "\t\t\t");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("\t\t");
    _builder.append("}\t");
    _builder.newLine();
    return _builder;
  }
  
  public CharSequence setHasControlPanel() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("hasControlPanel = true;");
    _builder.newLine();
    return _builder;
  }
  
  public CharSequence genAudioInput(final Pin p) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("addInputPin(this, \"");
    String _label = p.getLabel();
    _builder.append(_label);
    _builder.append("\");");
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  public CharSequence genAudioOutput(final Pin p) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("addOutputPin(this, \"");
    String _label = p.getLabel();
    _builder.append(_label);
    _builder.append("\");");
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  public CharSequence genControlInput(final Pin p) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("addControlInputPin(this, \"");
    String _label = p.getLabel();
    _builder.append(_label);
    _builder.append("\");");
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  public CharSequence genControlOutput(final Pin p) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("addControlOutputPin(this, \"");
    String _label = p.getLabel();
    _builder.append(_label);
    _builder.append("\");");
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  public CharSequence connect(final Pin p) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("sp = this.getPin(\"");
    String _label = p.getLabel();
    _builder.append(_label);
    _builder.append("\").getPinConnection();");
    _builder.newLineIfNotEmpty();
    _builder.append("int ");
    String _varName = p.getVarName();
    _builder.append(_varName);
    _builder.append(" = -1;");
    _builder.newLineIfNotEmpty();
    _builder.append("if(sp != null) {");
    _builder.newLine();
    _builder.append("\t");
    String _varName_1 = p.getVarName();
    _builder.append(_varName_1, "\t");
    _builder.append(" = sp.getRegister();");
    _builder.newLineIfNotEmpty();
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }
  
  public CharSequence setOutput(final Pin p) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("this.getPin(\"");
    String _label = p.getLabel();
    _builder.append(_label);
    _builder.append("\").setRegister(");
    String _varName = p.getVarName();
    _builder.append(_varName);
    _builder.append(");");
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  public CharSequence genIsPinConnected(final IsPinConnected p) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("if(this.getPin(\"");
    String _arg1 = p.getArg1();
    _builder.append(_arg1);
    _builder.append("\").isConnected() == true) {");
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  public CharSequence genIsTrue(final IsTrue p) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("if(");
    String _variable = p.getVariable();
    _builder.append(_variable);
    _builder.append(" == true) {");
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  public CharSequence genIsGreaterThan(final IsGreaterThan p) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("if(");
    String _variable = p.getVariable();
    _builder.append(_variable);
    _builder.append(" > ");
    int _value = p.getValue();
    _builder.append(_value);
    _builder.append(") {");
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  public CharSequence genIsLessThan(final IsLessThan p) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("if(");
    String _variable = p.getVariable();
    _builder.append(_variable);
    _builder.append(" < ");
    int _value = p.getValue();
    _builder.append(_value);
    _builder.append(") {");
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  public CharSequence genIsOr(final IsOr p) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("if(");
    String _var1 = p.getVar1();
    _builder.append(_var1);
    _builder.append(" || ");
    String _var2 = p.getVar2();
    _builder.append(_var2);
    _builder.append(" == ");
    String _value = p.getValue();
    _builder.append(_value);
    _builder.append(") {");
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  public CharSequence genIsEqualTo(final IsEqualTo p) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("if(");
    String _variable = p.getVariable();
    _builder.append(_variable);
    _builder.append(" == ");
    int _value = p.getValue();
    _builder.append(_value);
    _builder.append(") {");
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  public CharSequence genElse(final IsElse e) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("} else {");
    _builder.newLine();
    return _builder;
  }
  
  public CharSequence genEndif(final IsEndif e) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    return _builder;
  }
  
  public CharSequence genGetInputDefault(final GetInputDefault g) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("if(");
    String _variable = g.getVariable();
    _builder.append(_variable);
    _builder.append(" != -1) {");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("System.out.println(\"Pin is Connected! \" + \"");
    String _label = g.getLabel();
    _builder.append(_label, "\t");
    _builder.append("\"); ");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("sfxb.readRegister(");
    String _variable_1 = g.getVariable();
    _builder.append(_variable_1, "\t");
    _builder.append(", ");
    String _scale = g.getScale();
    _builder.append(_scale, "\t");
    _builder.append(");");
    _builder.newLineIfNotEmpty();
    _builder.append("}");
    _builder.newLine();
    _builder.append("else");
    _builder.newLine();
    _builder.append("{");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("System.out.println(\"Assigning default value! \" + \"");
    String _defaultVal = g.getDefaultVal();
    _builder.append(_defaultVal, "\t");
    _builder.append("\"); ");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("sfxb.scaleOffset(0.0, ");
    String _defaultVal_1 = g.getDefaultVal();
    _builder.append(_defaultVal_1, "\t");
    _builder.append(");");
    _builder.newLineIfNotEmpty();
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }
  
  public CharSequence genMacro(final Macro inst) {
    StringConcatenation _builder = new StringConcatenation();
    CharSequence _switchResult = null;
    boolean _matched = false;
    if (inst instanceof IsTrue) {
      _matched=true;
      _switchResult = this.genIsTrue(((IsTrue)inst));
    }
    if (!_matched) {
      if (inst instanceof IsPinConnected) {
        _matched=true;
        _switchResult = this.genIsPinConnected(((IsPinConnected)inst));
      }
    }
    if (!_matched) {
      if (inst instanceof IsGreaterThan) {
        _matched=true;
        _switchResult = this.genIsGreaterThan(((IsGreaterThan)inst));
      }
    }
    if (!_matched) {
      if (inst instanceof IsLessThan) {
        _matched=true;
        _switchResult = this.genIsLessThan(((IsLessThan)inst));
      }
    }
    if (!_matched) {
      if (inst instanceof IsEqualTo) {
        _matched=true;
        _switchResult = this.genIsEqualTo(((IsEqualTo)inst));
      }
    }
    if (!_matched) {
      if (inst instanceof IsElse) {
        _matched=true;
        _switchResult = this.genElse(((IsElse)inst));
      }
    }
    if (!_matched) {
      if (inst instanceof IsEndif) {
        _matched=true;
        _switchResult = this.genEndif(((IsEndif)inst));
      }
    }
    if (!_matched) {
      if (inst instanceof IsOr) {
        _matched=true;
        _switchResult = this.genIsOr(((IsOr)inst));
      }
    }
    if (!_matched) {
      if (inst instanceof GetInputDefault) {
        _matched=true;
        _switchResult = this.genGetInputDefault(((GetInputDefault)inst));
      }
    }
    if (!_matched) {
      if (inst instanceof SetOutputPin) {
        _matched=true;
        _switchResult = this.genSetOutputPin(((SetOutputPin)inst));
      }
    }
    if (!_matched) {
      if (inst instanceof GetBaseAddress) {
        _matched=true;
        _switchResult = this.genGetBaseAddress(((GetBaseAddress)inst));
      }
    }
    if (!_matched) {
      if (inst instanceof GetDelayScaleControl) {
        _matched=true;
        _switchResult = this.genGetDelayScaleControl(((GetDelayScaleControl)inst));
      }
    }
    if (!_matched) {
      if (inst instanceof ReadChorusTap) {
        _matched=true;
        _switchResult = this.genReadChorusTap(((ReadChorusTap)inst));
      }
    }
    if (!_matched) {
      if (inst instanceof GetSamplesFromRatio) {
        _matched=true;
        _switchResult = this.genGetSamplesFromRatio(((GetSamplesFromRatio)inst));
      }
    }
    if (!_matched) {
      if (inst instanceof SemitonesToRmpRate) {
        _matched=true;
        _switchResult = this.genSemitonesToRmpRate(((SemitonesToRmpRate)inst));
      }
    }
    if (!_matched) {
      if (inst instanceof MinusDouble) {
        _matched=true;
        _switchResult = this.genMinusDouble(((MinusDouble)inst));
      }
    }
    if (!_matched) {
      if (inst instanceof DivideDouble) {
        _matched=true;
        _switchResult = this.genDivideDouble(((DivideDouble)inst));
      }
    }
    if (!_matched) {
      if (inst instanceof Equals) {
        _matched=true;
        _switchResult = this.genEquals(((Equals)inst));
      }
    }
    if (!_matched) {
      if (inst instanceof EqualsBool) {
        _matched=true;
        _switchResult = this.genEqualsBool(((EqualsBool)inst));
      }
    }
    if (!_matched) {
      if (inst instanceof DivideInt) {
        _matched=true;
        _switchResult = this.genDivideInt(((DivideInt)inst));
      }
    }
    if (!_matched) {
      if (inst instanceof MultiplyDouble) {
        _matched=true;
        _switchResult = this.genMultiplyDouble(((MultiplyDouble)inst));
      }
    }
    _builder.append(_switchResult);
    _builder.append("\t");
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  public CharSequence genGetDelayScaleControl(final GetDelayScaleControl g) {
    StringConcatenation _builder = new StringConcatenation();
    {
      String _control = g.getControl();
      boolean _notEquals = (!Objects.equal(_control, null));
      if (_notEquals) {
        _builder.append("sfxb.mulx(");
        String _control_1 = g.getControl();
        _builder.append(_control_1);
        _builder.append(");");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("sfxb.scaleOffset((0.95 * ");
    String _ratio = g.getRatio();
    _builder.append(_ratio);
    _builder.append(" * ");
    String _length = g.getLength();
    _builder.append(_length);
    _builder.append(")/32768.0, (");
    String _offset = g.getOffset();
    _builder.append(_offset);
    _builder.append(" + (0.05 * ");
    String _ratio_1 = g.getRatio();
    _builder.append(_ratio_1);
    _builder.append(" * ");
    String _length_1 = g.getLength();
    _builder.append(_length_1);
    _builder.append("))/32768.0);");
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  public CharSequence genReadChorusTap(final ReadChorusTap g) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("{");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("// careful to not put center point too close to the end or beginning");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("int chorusCenter = (int) (");
    String _offset = g.getOffset();
    _builder.append(_offset, "\t");
    _builder.append(" + (0.9 * ");
    String _ratio = g.getRatio();
    _builder.append(_ratio, "\t");
    _builder.append(" * ");
    String _length = g.getLength();
    _builder.append(_length, "\t");
    _builder.append(") +  0.05 * ");
    String _length_1 = g.getLength();
    _builder.append(_length_1, "\t");
    _builder.append("); ");
    _builder.newLineIfNotEmpty();
    _builder.append("// need to allow 4 phases of LFO");
    _builder.newLine();
    {
      int _phase = g.getPhase();
      boolean _equals = (_phase == 0);
      if (_equals) {
        _builder.append("sfxb.chorusReadDelay((int)");
        String _lfo = g.getLfo();
        _builder.append(_lfo);
        _builder.append(", SIN|REG|COMPC, chorusCenter );");
        _builder.newLineIfNotEmpty();
        _builder.append("sfxb.chorusReadDelay((int)");
        String _lfo_1 = g.getLfo();
        _builder.append(_lfo_1);
        _builder.append(", SIN, chorusCenter + 1);");
        _builder.newLineIfNotEmpty();
      }
    }
    {
      int _phase_1 = g.getPhase();
      boolean _equals_1 = (_phase_1 == 1);
      if (_equals_1) {
        _builder.append("sfxb.chorusReadDelay((int)");
        String _lfo_2 = g.getLfo();
        _builder.append(_lfo_2);
        _builder.append(", SIN|REG|COMPA, chorusCenter );");
        _builder.newLineIfNotEmpty();
        _builder.append("sfxb.chorusReadDelay((int)");
        String _lfo_3 = g.getLfo();
        _builder.append(_lfo_3);
        _builder.append(", SIN|COMPC|COMPA, chorusCenter + 1);");
        _builder.newLineIfNotEmpty();
      }
    }
    {
      int _phase_2 = g.getPhase();
      boolean _equals_2 = (_phase_2 == 2);
      if (_equals_2) {
        _builder.append("sfxb.chorusReadDelay((int)");
        String _lfo_4 = g.getLfo();
        _builder.append(_lfo_4);
        _builder.append(", COS|REG|COMPC, chorusCenter );");
        _builder.newLineIfNotEmpty();
        _builder.append("sfxb.chorusReadDelay((int)");
        String _lfo_5 = g.getLfo();
        _builder.append(_lfo_5);
        _builder.append(", COS, chorusCenter + 1);");
        _builder.newLineIfNotEmpty();
      }
    }
    {
      int _phase_3 = g.getPhase();
      boolean _equals_3 = (_phase_3 == 3);
      if (_equals_3) {
        _builder.append("sfxb.chorusReadDelay((int)");
        String _lfo_6 = g.getLfo();
        _builder.append(_lfo_6);
        _builder.append(", COS|REG|COMPA, chorusCenter );");
        _builder.newLineIfNotEmpty();
        _builder.append("sfxb.chorusReadDelay((int)");
        String _lfo_7 = g.getLfo();
        _builder.append(_lfo_7);
        _builder.append(", COS|COMPC|COMPA, chorusCenter + 1);");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }
  
  public CharSequence genSetChorusWidth(final SetChorusWidth g) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("{");
    _builder.newLine();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }
  
  public CharSequence genMinusDouble(final MinusDouble mp) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("double ");
    String _varName = mp.getVarName();
    _builder.append(_varName);
    _builder.append(" = ");
    String _high = mp.getHigh();
    _builder.append(_high);
    _builder.append(" - ");
    String _low = mp.getLow();
    _builder.append(_low);
    _builder.append(";");
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  public CharSequence genDivideDouble(final DivideDouble mp) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("double ");
    String _varName = mp.getVarName();
    _builder.append(_varName);
    _builder.append(" = ");
    String _high = mp.getHigh();
    _builder.append(_high);
    _builder.append(" / ");
    String _low = mp.getLow();
    _builder.append(_low);
    _builder.append(";");
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  public CharSequence genDivideInt(final DivideInt mp) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("int ");
    String _varName = mp.getVarName();
    _builder.append(_varName);
    _builder.append(" = (int)(");
    String _high = mp.getHigh();
    _builder.append(_high);
    _builder.append(" / ");
    int _low = mp.getLow();
    _builder.append(_low);
    _builder.append(");");
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  public CharSequence genSemitonesToRmpRate(final SemitonesToRmpRate mp) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("double ");
    String _variable = mp.getVariable();
    _builder.append(_variable);
    _builder.append(" = 0.0;");
    _builder.newLineIfNotEmpty();
    _builder.append("if(");
    String _semitones = mp.getSemitones();
    _builder.append(_semitones);
    _builder.append(" > 0) {");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    String _variable_1 = mp.getVariable();
    _builder.append(_variable_1, "\t");
    _builder.append(" = (16384.0 * Math.pow(2.0, (");
    String _semitones_1 = mp.getSemitones();
    _builder.append(_semitones_1, "\t");
    _builder.append("/12.0) - 1))/32768.0;");
    _builder.newLineIfNotEmpty();
    _builder.append("}");
    _builder.newLine();
    _builder.append("else");
    _builder.newLine();
    _builder.append("{");
    _builder.newLine();
    _builder.append("\t");
    String _variable_2 = mp.getVariable();
    _builder.append(_variable_2, "\t");
    _builder.append(" = (-32.0 * Math.pow(2.0, (-");
    String _semitones_2 = mp.getSemitones();
    _builder.append(_semitones_2, "\t");
    _builder.append("/12.0) - 1))/32768.0;");
    _builder.newLineIfNotEmpty();
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }
  
  public CharSequence genMultiplyDouble(final MultiplyDouble mp) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("double ");
    String _varName = mp.getVarName();
    _builder.append(_varName);
    _builder.append(" = ");
    String _high = mp.getHigh();
    _builder.append(_high);
    _builder.append(" * ");
    String _low = mp.getLow();
    _builder.append(_low);
    _builder.append(";");
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  public CharSequence genEquals(final Equals mp) {
    StringConcatenation _builder = new StringConcatenation();
    String _varName = mp.getVarName();
    _builder.append(_varName);
    _builder.append(" = ");
    String _value = mp.getValue();
    _builder.append(_value);
    _builder.append(";");
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  public CharSequence genEqualsBool(final EqualsBool mp) {
    StringConcatenation _builder = new StringConcatenation();
    String _varName = mp.getVarName();
    _builder.append(_varName);
    _builder.append(" = ");
    String _value = mp.getValue();
    _builder.append(_value);
    _builder.append(";");
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  public CharSequence genGetSamplesFromRatio(final GetSamplesFromRatio g) {
    StringConcatenation _builder = new StringConcatenation();
    String _variable = g.getVariable();
    _builder.append(_variable);
    _builder.append(" = (int) (");
    String _ratio = g.getRatio();
    _builder.append(_ratio);
    _builder.append(" * ");
    String _length = g.getLength();
    _builder.append(_length);
    _builder.append(");");
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  public CharSequence genGetBaseAddress(final GetBaseAddress g) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("int\tdelayOffset = sfxb.getDelayMemAllocated() + 1;");
    _builder.newLine();
    return _builder;
  }
  
  public CharSequence genSetOutputPin(final SetOutputPin p) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("this.getPin(\"");
    String _pinName = p.getPinName();
    _builder.append(_pinName);
    _builder.append("\").setRegister(");
    String _varName = p.getVarName();
    _builder.append(_varName);
    _builder.append(");");
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  public CharSequence genEquate(final SpinEquate e) {
    StringConcatenation _builder = new StringConcatenation();
    {
      boolean _startsWith = e.getValue().toUpperCase().startsWith("REG", 0);
      if (_startsWith) {
        _builder.append("private int ");
        String _ename = e.getEname();
        _builder.append(_ename);
        _builder.append(";");
        _builder.newLineIfNotEmpty();
      } else {
        _builder.append("private double ");
        String _ename_1 = e.getEname();
        _builder.append(_ename_1);
        _builder.append(";");
        _builder.newLineIfNotEmpty();
      }
    }
    return _builder;
  }
  
  public CharSequence setEquateReg(final SpinEquate e) {
    StringConcatenation _builder = new StringConcatenation();
    {
      boolean _startsWith = e.getValue().toUpperCase().startsWith("REG", 0);
      if (_startsWith) {
        String _ename = e.getEname();
        _builder.append(_ename);
        _builder.append(" = sfxb.allocateReg();");
        _builder.newLineIfNotEmpty();
      }
    }
    return _builder;
  }
  
  public CharSequence setEquateVar(final SpinEquate e) {
    StringConcatenation _builder = new StringConcatenation();
    {
      boolean _startsWith = e.getValue().toUpperCase().startsWith("REG", 0);
      if (_startsWith) {
      } else {
        String _ename = e.getEname();
        _builder.append(_ename);
        _builder.append(" = ");
        String _value = e.getValue();
        _builder.append(_value);
        _builder.append(";");
        _builder.newLineIfNotEmpty();
      }
    }
    return _builder;
  }
  
  public CharSequence genOffset(final Offset e) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("int ");
    String _name = e.getName();
    _builder.append(_name);
    _builder.append(" = ");
    int _length = e.getLength();
    _builder.append(_length);
    _builder.append(";");
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  public CharSequence genMem(final Mem m) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("sfxb.FXallocDelayMem(\"");
    String _buffer = m.getBuffer();
    _builder.append(_buffer);
    _builder.append("\", ");
    String _length = m.getLength();
    _builder.append(_length);
    _builder.append("); ");
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  public CharSequence genLabel(final Label l) {
    StringConcatenation _builder = new StringConcatenation();
    String _name = l.getName();
    _builder.append(_name);
    _builder.append(" ");
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  public CharSequence genInstruction(final Instruction inst) {
    StringConcatenation _builder = new StringConcatenation();
    CharSequence _switchResult = null;
    boolean _matched = false;
    if (inst instanceof Absa) {
      _matched=true;
      _switchResult = this.genAbsa(((Absa)inst));
    }
    if (!_matched) {
      if (inst instanceof And) {
        _matched=true;
        _switchResult = this.genAnd(((And)inst));
      }
    }
    if (!_matched) {
      if (inst instanceof ChorusReadDelay) {
        _matched=true;
        _switchResult = this.genChorusReadDelay(((ChorusReadDelay)inst));
      }
    }
    if (!_matched) {
      if (inst instanceof ChorusReadValue) {
        _matched=true;
        _switchResult = this.genChorusReadValue(((ChorusReadValue)inst));
      }
    }
    if (!_matched) {
      if (inst instanceof ChorusScaleOffset) {
        _matched=true;
        _switchResult = this.genChorusScaleOffset(((ChorusScaleOffset)inst));
      }
    }
    if (!_matched) {
      if (inst instanceof Clr) {
        _matched=true;
        _switchResult = this.genClr(((Clr)inst));
      }
    }
    if (!_matched) {
      if (inst instanceof Exp) {
        _matched=true;
        _switchResult = this.genExp(((Exp)inst));
      }
    }
    if (!_matched) {
      if (inst instanceof Jam) {
        _matched=true;
        _switchResult = this.genJam(((Jam)inst));
      }
    }
    if (!_matched) {
      if (inst instanceof Ldax) {
        _matched=true;
        _switchResult = this.genLdax(((Ldax)inst));
      }
    }
    if (!_matched) {
      if (inst instanceof LoadRampLFO) {
        _matched=true;
        _switchResult = this.genWldr(((LoadRampLFO)inst));
      }
    }
    if (!_matched) {
      if (inst instanceof LoadSinLFO) {
        _matched=true;
        _switchResult = this.genWlds(((LoadSinLFO)inst));
      }
    }
    if (!_matched) {
      if (inst instanceof Log) {
        _matched=true;
        _switchResult = this.genLog(((Log)inst));
      }
    }
    if (!_matched) {
      if (inst instanceof Maxx) {
        _matched=true;
        _switchResult = this.genMaxx(((Maxx)inst));
      }
    }
    if (!_matched) {
      if (inst instanceof Mulx) {
        _matched=true;
        _switchResult = this.genMulx(((Mulx)inst));
      }
    }
    if (!_matched) {
      if (inst instanceof Not) {
        _matched=true;
        _switchResult = this.genNot(((Not)inst));
      }
    }
    if (!_matched) {
      if (inst instanceof Or) {
        _matched=true;
        _switchResult = this.genOr(((Or)inst));
      }
    }
    if (!_matched) {
      if (inst instanceof ReadDelayPointer) {
        _matched=true;
        _switchResult = this.genReadDelayPointer(((ReadDelayPointer)inst));
      }
    }
    if (!_matched) {
      if (inst instanceof ReadDelay) {
        _matched=true;
        _switchResult = this.genReadDelay(((ReadDelay)inst));
      }
    }
    if (!_matched) {
      if (inst instanceof ReadRegister) {
        _matched=true;
        _switchResult = this.genReadRegister(((ReadRegister)inst));
      }
    }
    if (!_matched) {
      if (inst instanceof ReadRegisterFilter) {
        _matched=true;
        _switchResult = this.genReadRegisterFilter(((ReadRegisterFilter)inst));
      }
    }
    if (!_matched) {
      if (inst instanceof ScaleOffset) {
        _matched=true;
        _switchResult = this.genScaleOffset(((ScaleOffset)inst));
      }
    }
    if (!_matched) {
      if (inst instanceof Skip) {
        _matched=true;
        _switchResult = this.genSkip(((Skip)inst));
      }
    }
    if (!_matched) {
      if (inst instanceof WriteAllpass) {
        _matched=true;
        _switchResult = this.genWriteAllpass(((WriteAllpass)inst));
      }
    }
    if (!_matched) {
      if (inst instanceof WriteDelay) {
        _matched=true;
        _switchResult = this.genWriteDelay(((WriteDelay)inst));
      }
    }
    if (!_matched) {
      if (inst instanceof WriteRegister) {
        _matched=true;
        _switchResult = this.genWriteRegister(((WriteRegister)inst));
      }
    }
    if (!_matched) {
      if (inst instanceof WriteRegisterLowshelf) {
        _matched=true;
        _switchResult = this.genWriteRegisterLowshelf(((WriteRegisterLowshelf)inst));
      }
    }
    if (!_matched) {
      if (inst instanceof WriteRegisterHighshelf) {
        _matched=true;
        _switchResult = this.genWriteRegisterHighshelf(((WriteRegisterHighshelf)inst));
      }
    }
    if (!_matched) {
      if (inst instanceof Xor) {
        _matched=true;
        _switchResult = this.genXor(((Xor)inst));
      }
    }
    _builder.append(_switchResult);
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  public CharSequence genAbsa(final Absa inst) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("sfxb.absa();");
    _builder.newLine();
    return _builder;
  }
  
  public CharSequence genNot(final Not inst) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("sfxb.not();");
    _builder.newLine();
    return _builder;
  }
  
  public CharSequence genClr(final Clr inst) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("sfxb.clear();");
    _builder.newLine();
    return _builder;
  }
  
  public CharSequence genLog(final Log inst) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("sfxb.log(");
    String _arg1 = inst.getArg1();
    _builder.append(_arg1);
    _builder.append(", ");
    String _arg2 = inst.getArg2();
    _builder.append(_arg2);
    _builder.append(");");
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  public CharSequence genExp(final Exp inst) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("sfxb.exp(");
    String _arg1 = inst.getArg1();
    _builder.append(_arg1);
    _builder.append(", ");
    String _arg2 = inst.getArg2();
    _builder.append(_arg2);
    _builder.append(");");
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  public CharSequence genSkip(final Skip inst) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("sfxb.skip(");
    String _upperCase = inst.getFlags().toUpperCase();
    _builder.append(_upperCase);
    _builder.append(", ");
    int _diff = UtilSC.getDiff(inst);
    _builder.append(_diff);
    _builder.append(");");
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  public CharSequence genJam(final Jam inst) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("sfxb.jam(");
    String _arg1 = inst.getArg1();
    _builder.append(_arg1);
    _builder.append(");");
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  public CharSequence genScaleOffset(final ScaleOffset inst) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("sfxb.scaleOffset(");
    String _arg1 = inst.getArg1();
    _builder.append(_arg1);
    _builder.append(", ");
    String _arg2 = inst.getArg2();
    _builder.append(_arg2);
    _builder.append(");");
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  public CharSequence genOr(final Or inst) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("sfxb.or(");
    String _javaBinary = this.toJavaBinary(inst.getArg1());
    _builder.append(_javaBinary);
    _builder.append(");");
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  public CharSequence genAnd(final And inst) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("sfxb.and(");
    String _javaBinary = this.toJavaBinary(inst.getArg1());
    _builder.append(_javaBinary);
    _builder.append(");");
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  public CharSequence genXor(final Xor inst) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("sfxb.xor(");
    String _javaBinary = this.toJavaBinary(inst.getArg1());
    _builder.append(_javaBinary);
    _builder.append(");");
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  public CharSequence genWldr(final LoadRampLFO inst) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("sfxb.loadRampLFO((int) ");
    String _spinRegs = this.spinRegs(inst.getArg1());
    _builder.append(_spinRegs);
    _builder.append(", (int) ");
    String _arg2 = inst.getArg2();
    _builder.append(_arg2);
    _builder.append(", (int) ");
    String _arg3 = inst.getArg3();
    _builder.append(_arg3);
    _builder.append(");");
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  public CharSequence genWlds(final LoadSinLFO inst) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("sfxb.loadSinLFO((int) ");
    String _spinRegs = this.spinRegs(inst.getArg1());
    _builder.append(_spinRegs);
    _builder.append(",(int) ");
    String _arg2 = inst.getArg2();
    _builder.append(_arg2);
    _builder.append(", (int) ");
    String _arg3 = inst.getArg3();
    _builder.append(_arg3);
    _builder.append(");");
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  public CharSequence genReadDelay(final ReadDelay inst) {
    return this.genDelayInst(inst, "FXreadDelay");
  }
  
  public CharSequence genWriteDelay(final WriteDelay inst) {
    return this.genDelayInst(inst, "FXwriteDelay");
  }
  
  public CharSequence genWriteAllpass(final WriteAllpass inst) {
    return this.genDelayInst(inst, "FXwriteAllpass");
  }
  
  public CharSequence genDelayInst(final Inst_B15_S1_9 inst, final String className) {
    CharSequence _xblockexpression = null;
    {
      String scale = "1.0";
      String _scale = inst.getArg1().getScale();
      boolean _notEquals = (!Objects.equal(_scale, null));
      if (_notEquals) {
        scale = inst.getArg1().getScale();
      }
      CharSequence _xifexpression = null;
      if ((inst.getArg1().getBuffer().endsWith("+") || inst.getArg1().getBuffer().endsWith("-"))) {
        CharSequence _xifexpression_1 = null;
        int _value = inst.getArg1().getValue();
        boolean _notEquals_1 = (_value != 0);
        if (_notEquals_1) {
          StringConcatenation _builder = new StringConcatenation();
          _builder.append("sfxb.");
          _builder.append(className);
          _builder.append("(\"");
          String _buffer = inst.getArg1().getBuffer();
          _builder.append(_buffer);
          _builder.append("\", (int)(");
          int _value_1 = inst.getArg1().getValue();
          _builder.append(_value_1);
          _builder.append(" * ");
          _builder.append(scale);
          _builder.append("), ");
          String _arg2 = inst.getArg2();
          _builder.append(_arg2);
          _builder.append(");");
          _builder.newLineIfNotEmpty();
          _xifexpression_1 = _builder;
        } else {
          StringConcatenation _builder_1 = new StringConcatenation();
          _builder_1.append("sfxb.");
          _builder_1.append(className);
          _builder_1.append("(\"");
          String _buffer_1 = inst.getArg1().getBuffer();
          _builder_1.append(_buffer_1);
          _builder_1.append("\", ");
          String _name = inst.getArg1().getOffset().getName();
          _builder_1.append(_name);
          _builder_1.append(", ");
          String _arg2_1 = inst.getArg2();
          _builder_1.append(_arg2_1);
          _builder_1.append(");");
          _builder_1.newLineIfNotEmpty();
          _xifexpression_1 = _builder_1;
        }
        _xifexpression = _xifexpression_1;
      } else {
        StringConcatenation _builder_2 = new StringConcatenation();
        _builder_2.append("sfxb.");
        _builder_2.append(className);
        _builder_2.append("(\"");
        String _buffer_2 = inst.getArg1().getBuffer();
        _builder_2.append(_buffer_2);
        _builder_2.append("\", 0, ");
        String _arg2_2 = inst.getArg2();
        _builder_2.append(_arg2_2);
        _builder_2.append(");");
        _builder_2.newLineIfNotEmpty();
        _xifexpression = _builder_2;
      }
      _xblockexpression = _xifexpression;
    }
    return _xblockexpression;
  }
  
  public CharSequence genChorusReadDelay(final ChorusReadDelay inst) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("sfxb.FXchorusReadDelay(");
    String _upperCase = inst.getArg1().toUpperCase();
    _builder.append(_upperCase);
    _builder.append(", ");
    String _upperCase_1 = inst.getArg2().toUpperCase();
    _builder.append(_upperCase_1);
    _builder.append(", \"");
    String _buffer = inst.getArg3().getBuffer();
    _builder.append(_buffer);
    _builder.append("\", ");
    int _value = inst.getArg3().getValue();
    _builder.append(_value);
    _builder.append(");");
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  public CharSequence genChorusScaleOffset(final ChorusScaleOffset inst) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("sfxb.chorusScaleOffset(");
    String _upperCase = inst.getArg1().toUpperCase();
    _builder.append(_upperCase);
    _builder.append(", ");
    String _arg2 = inst.getArg2();
    _builder.append(_arg2);
    _builder.append(", ");
    String _arg3 = inst.getArg3();
    _builder.append(_arg3);
    _builder.append(");");
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  public CharSequence genReadDelayPointer(final ReadDelayPointer inst) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("sfxb.readDelayPointer(");
    String _spinRegs = this.spinRegs(inst.getArg1());
    _builder.append(_spinRegs);
    _builder.append(");");
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  public CharSequence genReadRegisterFilter(final ReadRegisterFilter inst) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("sfxb.readRegisterFilter(");
    String _arg1 = inst.getArg1();
    _builder.append(_arg1);
    _builder.append(", ");
    String _arg2 = inst.getArg2();
    _builder.append(_arg2);
    _builder.append(");");
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  public CharSequence genReadRegister(final ReadRegister inst) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("sfxb.readRegister(");
    String _spinRegs = this.spinRegs(inst.getArg1());
    _builder.append(_spinRegs);
    _builder.append(", ");
    String _arg2 = inst.getArg2();
    _builder.append(_arg2);
    _builder.append(");");
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  public CharSequence genMaxx(final Maxx inst) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("sfxb.maxx(");
    String _spinRegs = this.spinRegs(inst.getArg1());
    _builder.append(_spinRegs);
    _builder.append(", ");
    String _arg2 = inst.getArg2();
    _builder.append(_arg2);
    _builder.append(");");
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  public CharSequence genWriteRegister(final WriteRegister inst) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("sfxb.writeRegister(");
    String _spinRegs = this.spinRegs(inst.getArg1());
    _builder.append(_spinRegs);
    _builder.append(", ");
    String _arg2 = inst.getArg2();
    _builder.append(_arg2);
    _builder.append(");");
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  public CharSequence genWriteRegisterHighshelf(final WriteRegisterHighshelf inst) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("sfxb.writeRegisterHighshelf(");
    String _arg1 = inst.getArg1();
    _builder.append(_arg1);
    _builder.append(", ");
    String _arg2 = inst.getArg2();
    _builder.append(_arg2);
    _builder.append(");");
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  public CharSequence genWriteRegisterLowshelf(final WriteRegisterLowshelf inst) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("sfxb.writeRegisterLowshelf(");
    String _arg1 = inst.getArg1();
    _builder.append(_arg1);
    _builder.append(", ");
    String _arg2 = inst.getArg2();
    _builder.append(_arg2);
    _builder.append(");");
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  public CharSequence genMulx(final Mulx inst) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("sfxb.mulx(");
    String _spinRegs = this.spinRegs(inst.getArg1());
    _builder.append(_spinRegs);
    _builder.append(");");
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  public CharSequence genLdax(final Ldax inst) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("sfxb.loadAccumulator(");
    String _arg1 = inst.getArg1();
    _builder.append(_arg1);
    _builder.append(");");
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  public CharSequence genChorusReadValue(final ChorusReadValue inst) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("sfxb.chorusReadValue(");
    String _spinRegs = this.spinRegs(inst.getArg1());
    _builder.append(_spinRegs);
    _builder.append(");");
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  public String toJavaBinary(final String spinBinary) {
    String _xifexpression = null;
    boolean _startsWith = spinBinary.startsWith("%");
    if (_startsWith) {
      _xifexpression = spinBinary.replace("%", "0b");
    } else {
      String _xifexpression_1 = null;
      boolean _startsWith_1 = spinBinary.startsWith("$");
      if (_startsWith_1) {
        _xifexpression_1 = spinBinary.replace("$", "0x");
      } else {
        _xifexpression_1 = spinBinary;
      }
      _xifexpression = _xifexpression_1;
    }
    return _xifexpression;
  }
  
  public String spinRegs(final String reg) {
    boolean _equals = Objects.equal(reg, "pot0");
    if (_equals) {
      return "input0";
    }
    boolean _equals_1 = Objects.equal(reg, "pot1");
    if (_equals_1) {
      return "input1";
    }
    boolean _equals_2 = Objects.equal(reg, "pot2");
    if (_equals_2) {
      return "input2";
    }
    boolean _equals_3 = Objects.equal(reg, "sin0");
    if (_equals_3) {
      return "SIN0";
    }
    boolean _equals_4 = Objects.equal(reg, "sin1");
    if (_equals_4) {
      return "SIN1";
    }
    boolean _equals_5 = Objects.equal(reg, "rmp0");
    if (_equals_5) {
      return "RMP0";
    }
    boolean _equals_6 = Objects.equal(reg, "rmp1");
    if (_equals_6) {
      return "RMP1";
    }
    boolean _equals_7 = Objects.equal(reg, "sin0_rate");
    if (_equals_7) {
      return "SIN0_RATE";
    }
    boolean _equals_8 = Objects.equal(reg, "sin1_rate");
    if (_equals_8) {
      return "SIN1_RATE";
    }
    boolean _equals_9 = Objects.equal(reg, "rmp0_rate");
    if (_equals_9) {
      return "RMP0_RATE";
    }
    boolean _equals_10 = Objects.equal(reg, "rmp1_rate");
    if (_equals_10) {
      return "RMP1_RATE";
    }
    boolean _equals_11 = Objects.equal(reg, "sin0_range");
    if (_equals_11) {
      return "SIN0_RANGE";
    }
    boolean _equals_12 = Objects.equal(reg, "sin1_range");
    if (_equals_12) {
      return "SIN1_RANGE";
    }
    boolean _equals_13 = Objects.equal(reg, "cos0");
    if (_equals_13) {
      return "COS0";
    }
    boolean _equals_14 = Objects.equal(reg, "cos1");
    if (_equals_14) {
      return "COS1";
    }
    boolean _equals_15 = Objects.equal(reg, "neg");
    if (_equals_15) {
      return "NEG";
    }
    boolean _equals_16 = Objects.equal(reg, "zrc");
    if (_equals_16) {
      return "ZRC";
    }
    boolean _equals_17 = Objects.equal(reg, "run");
    if (_equals_17) {
      return "RUN";
    }
    boolean _equals_18 = Objects.equal(reg, "gez");
    if (_equals_18) {
      return "GEZ";
    }
    boolean _equals_19 = Objects.equal(reg, "addr_ptr");
    if (_equals_19) {
      return "ADDR_PTR";
    }
    return reg;
  }
}
