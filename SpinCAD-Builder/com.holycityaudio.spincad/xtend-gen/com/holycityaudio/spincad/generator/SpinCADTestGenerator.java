/**
 * SpinCAD Builder - DSP Development Tool for the Spin FV-1
 * SpinCADTestGenerator.xtend
 * This file supplies template code generation for the Bool data type.
 * This turns into a Java boolean.
 * 
 * Copyright (C) 2015 - Gary Worsham
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

import com.holycityaudio.spincad.spinCAD.AudioInput;
import com.holycityaudio.spincad.spinCAD.AudioOutput;
import com.holycityaudio.spincad.spinCAD.ControlInput;
import com.holycityaudio.spincad.spinCAD.Pin;
import com.holycityaudio.spincad.spinCAD.Program;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtend2.lib.StringConcatenation;

@SuppressWarnings("all")
public class SpinCADTestGenerator {
  public CharSequence genTestHeader(final String blockName) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("/* SpinCAD Designer - DSP Development Tool for the Spin FV-1 ");
    _builder.newLine();
    _builder.append(" ");
    _builder.append("* ");
    _builder.append((blockName + "Test"), " ");
    _builder.append(".java");
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
    _builder.append("*   MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the ");
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
    _builder.append(" ");
    _builder.newLine();
    _builder.append("package com.holycityaudio.SpinCAD.test;");
    _builder.newLine();
    _builder.newLine();
    _builder.append("import com.holycityaudio.SpinCAD.SpinCADFrame;");
    _builder.newLine();
    _builder.append("import com.holycityaudio.SpinCAD.SpinCADPanel;");
    _builder.newLine();
    _builder.append("import com.holycityaudio.SpinCAD.SpinCADPin;");
    _builder.newLine();
    _builder.append("import com.holycityaudio.SpinCAD.CADBlocks.*;");
    _builder.newLine();
    _builder.newLine();
    _builder.append("public class ");
    _builder.append((blockName + "Test"));
    _builder.append(" {");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("public ");
    _builder.append((blockName + "Test"), "\t");
    _builder.append("(SpinCADFrame f) {");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t");
    _builder.append("System.out.println(\"Start of ");
    _builder.append(blockName, "\t\t");
    _builder.append("CADBlock unit test...\" + \"\\n\");");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("SpinCADPanel p = new SpinCADPanel(f);");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("InputCADBlock i = new InputCADBlock(225, 10);");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("OutputCADBlock o = new OutputCADBlock(225, 290);");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append(blockName, "\t\t");
    _builder.append("CADBlock m = new ");
    _builder.append(blockName, "\t\t");
    _builder.append("CADBlock(225, 210);");
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  public CharSequence genTestCloser(final String blockName) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("// end of test code");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("System.out.println(\"End of ");
    _builder.append(blockName, "\t");
    _builder.append("CADBlock unit test\" + \"\\n\");");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }
  
  public CharSequence testAllConnections(final String blockName, final Program pr) {
    CharSequence _xblockexpression = null;
    {
      int Ins = 0;
      int Outs = 0;
      int ControlIns = 0;
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("f.getModel().newModel();");
      _builder.newLine();
      _builder.append("// now do \"all control connections\"");
      _builder.newLine();
      _builder.append("f.dropBlock(p, i);\t");
      _builder.newLine();
      _builder.append("f.dropBlock(p, m);\t");
      _builder.newLine();
      _builder.append("f.dropBlock(p, o);\t");
      _builder.newLine();
      {
        EList<Pin> _pins = pr.getPins();
        for(final Pin p : _pins) {
          CharSequence _switchResult = null;
          boolean _matched = false;
          if (p instanceof AudioInput) {
            _matched=true;
            CharSequence _xblockexpression_1 = null;
            {
              Ins = (Ins + 1);
              _xblockexpression_1 = this.conAudioInput(p, Ins);
            }
            _switchResult = _xblockexpression_1;
          }
          if (!_matched) {
            if (p instanceof AudioOutput) {
              _matched=true;
              CharSequence _xblockexpression_1 = null;
              {
                Outs = (Outs + 1);
                _xblockexpression_1 = this.conAudioOutput(p, Outs);
              }
              _switchResult = _xblockexpression_1;
            }
          }
          if (!_matched) {
            if (p instanceof ControlInput) {
              _matched=true;
              CharSequence _xblockexpression_1 = null;
              {
                ControlIns = (ControlIns + 1);
                _xblockexpression_1 = this.conControlInput(p, ControlIns);
              }
              _switchResult = _xblockexpression_1;
            }
          }
          _builder.append(_switchResult);
          _builder.newLineIfNotEmpty();
        }
      }
      _builder.append("f.getModel().sortAlignGen();");
      _builder.newLine();
      _builder.append("System.out.println(\"");
      _builder.append(blockName);
      _builder.append("CADBlock test passed with all control connections!\");");
      _builder.newLineIfNotEmpty();
      _builder.newLine();
      _builder.append("f.getModel().newModel();\t");
      _builder.newLine();
      _builder.newLine();
      _xblockexpression = _builder;
    }
    return _xblockexpression;
  }
  
  public CharSequence testNoConnections(final String blockName) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("f.dropBlock(p, m);\t");
    _builder.newLine();
    _builder.newLine();
    _builder.append("f.getModel().sortAlignGen();");
    _builder.newLine();
    _builder.append("System.out.println(\"");
    _builder.append(blockName);
    _builder.append("CADBlock test passed with no connections!\");");
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  public CharSequence conAudioInput(final Pin p, final int i) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("{");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("SpinCADPin p1 = i.getPin(\"Output ");
    _builder.append(i, "\t");
    _builder.append("\");");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("SpinCADPin p2 = m.getPin(\"");
    String _label = p.getLabel();
    _builder.append(_label, "\t");
    _builder.append("\");");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("p2.setConnection(i, p1);");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }
  
  public CharSequence conAudioOutput(final Pin p, final int i) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("{");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("SpinCADPin p1 = o.getPin(\"Input ");
    _builder.append(i, "\t");
    _builder.append("\");");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("SpinCADPin p2 = m.getPin(\"");
    String _label = p.getLabel();
    _builder.append(_label, "\t");
    _builder.append("\");");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("p2.setConnection(o, p1);");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }
  
  public CharSequence conControlInput(final Pin p, final int i) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("{");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("Pot");
    _builder.append((i - 1), "\t");
    _builder.append("CADBlock pot");
    _builder.append((i - 1), "\t");
    _builder.append(" = new Pot");
    _builder.append((i - 1), "\t");
    _builder.append("CADBlock(25, 150 + 40 * ");
    _builder.append(i, "\t");
    _builder.append(");");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("f.dropBlock(p, pot");
    _builder.append((i - 1), "\t");
    _builder.append(");");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("SpinCADPin p1 = pot");
    _builder.append((i - 1), "\t");
    _builder.append(".getPin(\"Output 1\");");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("SpinCADPin p2 = m.getPin(\"");
    String _label = p.getLabel();
    _builder.append(_label, "\t");
    _builder.append("\");");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("p2.setConnection(pot");
    _builder.append((i - 1), "\t");
    _builder.append(", p1);");
    _builder.newLineIfNotEmpty();
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }
}
