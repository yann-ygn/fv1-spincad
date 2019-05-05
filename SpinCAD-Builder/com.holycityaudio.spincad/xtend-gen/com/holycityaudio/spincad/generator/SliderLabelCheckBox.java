/**
 * SpinCAD Builder - DSP Development Tool for the Spin FV-1
 * SliderLabelCheckBox
 * This file supplies template code generation for the SliderLabelCheckBox data type.
 * This turns into a Java Swing JSlider with an associated JLabel.
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

import com.google.common.base.Objects;
import com.holycityaudio.spincad.generator.ControlPanel;
import org.eclipse.xtend2.lib.StringConcatenation;

@SuppressWarnings("all")
public class SliderLabelCheckBox extends ControlPanel {
  public static CharSequence declareVar(final SliderLabelCheckBox e) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("JSlider ");
    _builder.append(e.ename);
    _builder.append("Slider;");
    _builder.newLineIfNotEmpty();
    _builder.append("JLabel  ");
    _builder.append(e.ename);
    _builder.append("Label;\t");
    _builder.newLineIfNotEmpty();
    _builder.append("JCheckBox  ");
    _builder.append(e.ename);
    _builder.append("CheckBox;\t");
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  public static CharSequence initialize(final String blockName, final SliderLabelCheckBox e) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.newLine();
    {
      boolean _notEquals = (!Objects.equal(e.option, null));
      if (_notEquals) {
        {
          boolean _equals = Objects.equal(e.option, "LENGTHTOTIME");
          if (_equals) {
            _builder.append(e.ename);
            _builder.append("Slider = new JSlider(JSlider.HORIZONTAL, (int)(");
            _builder.append(e.minVal);
            _builder.append(" * ");
            _builder.append(e.multiplier);
            _builder.append("),(int) (");
            _builder.append(e.maxVal);
            _builder.append(" * ");
            _builder.append(e.multiplier);
            _builder.append("), (int) (gCB.get");
            _builder.append(e.ename);
            _builder.append("() * ");
            _builder.append(e.multiplier);
            _builder.append("));");
            _builder.newLineIfNotEmpty();
          }
        }
        {
          boolean _equals_1 = Objects.equal(e.option, "LOGFREQ");
          if (_equals_1) {
            _builder.append(e.ename);
            _builder.append("Slider = new JSlider(JSlider.HORIZONTAL, (int)(Math.log10(");
            _builder.append(e.minVal);
            _builder.append(") * 100.0),(int) (Math.log10(");
            _builder.append(e.maxVal);
            _builder.append(") * 100.0), (int) (Math.log10(gCB.get");
            _builder.append(e.ename);
            _builder.append("()) * 100));");
            _builder.newLineIfNotEmpty();
          }
        }
        {
          boolean _equals_2 = Objects.equal(e.option, "LINEAR");
          if (_equals_2) {
            _builder.append(e.ename);
            _builder.append("Slider = new JSlider(JSlider.HORIZONTAL, (int)(int)(");
            _builder.append(e.minVal);
            _builder.append(" * ");
            _builder.append(e.multiplier);
            _builder.append("),(int) (");
            _builder.append(e.maxVal);
            _builder.append(" * ");
            _builder.append(e.multiplier);
            _builder.append("), (int) ((gCB.get");
            _builder.append(e.ename);
            _builder.append("()) * ");
            _builder.append(e.multiplier);
            _builder.append(")));");
            _builder.newLineIfNotEmpty();
          }
        }
        {
          boolean _equals_3 = Objects.equal(e.option, "SINLFOFREQ");
          if (_equals_3) {
            _builder.append(e.ename);
            _builder.append("Slider = new JSlider(JSlider.HORIZONTAL, (int)(int)(");
            _builder.append(e.minVal);
            _builder.append(" * ");
            _builder.append(e.multiplier);
            _builder.append("),(int) (");
            _builder.append(e.maxVal);
            _builder.append(" * ");
            _builder.append(e.multiplier);
            _builder.append("), (int) ((gCB.get");
            _builder.append(e.ename);
            _builder.append("()) * ");
            _builder.append(e.multiplier);
            _builder.append(")));");
            _builder.newLineIfNotEmpty();
          }
        }
        {
          boolean _equals_4 = Objects.equal(e.option, "RAMPLFOFREQ");
          if (_equals_4) {
            _builder.append(e.ename);
            _builder.append("Slider = new JSlider(JSlider.HORIZONTAL, (int)(int)(");
            _builder.append(e.minVal);
            _builder.append(" * ");
            _builder.append(e.multiplier);
            _builder.append("),(int) (");
            _builder.append(e.maxVal);
            _builder.append(" * ");
            _builder.append(e.multiplier);
            _builder.append("), (int) ((gCB.get");
            _builder.append(e.ename);
            _builder.append("()) * ");
            _builder.append(e.multiplier);
            _builder.append(")));");
            _builder.newLineIfNotEmpty();
          }
        }
        {
          boolean _equals_5 = Objects.equal(e.option, "BOOSTCUT");
          if (_equals_5) {
            _builder.append(e.ename);
            _builder.append("Slider = new JSlider(JSlider.HORIZONTAL, (int)(int)(");
            _builder.append(e.minVal);
            _builder.append(" * ");
            _builder.append(e.multiplier);
            _builder.append("),(int) (");
            _builder.append(e.maxVal);
            _builder.append(" * ");
            _builder.append(e.multiplier);
            _builder.append("), (int) ((gCB.get");
            _builder.append(e.ename);
            _builder.append("()) * ");
            _builder.append(e.multiplier);
            _builder.append(")));");
            _builder.newLineIfNotEmpty();
          }
        }
      } else {
        _builder.append(e.ename);
        _builder.append("Slider = new JSlider(JSlider.HORIZONTAL, (int)(");
        _builder.append(e.minVal);
        _builder.append(" * ");
        _builder.append(e.multiplier);
        _builder.append("),(int) (");
        _builder.append(e.maxVal);
        _builder.append(" * ");
        _builder.append(e.multiplier);
        _builder.append("), (int) (gCB.get");
        _builder.append(e.ename);
        _builder.append("() * ");
        _builder.append(e.multiplier);
        _builder.append("));");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append(e.ename);
    _builder.append("Slider.addChangeListener(new ");
    _builder.append(blockName);
    _builder.append("SliderListener());");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append(e.ename);
    _builder.append("Label = new JLabel();");
    _builder.newLineIfNotEmpty();
    _builder.append("update");
    _builder.append(e.ename);
    _builder.append("Label();");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append(e.ename);
    _builder.append("CheckBox = new JCheckBox();");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("frame.getContentPane().add(");
    _builder.append(e.ename);
    _builder.append("Label);");
    _builder.newLineIfNotEmpty();
    _builder.append("frame.getContentPane().add(");
    _builder.append(e.ename);
    _builder.append("Slider);\t\t");
    _builder.newLineIfNotEmpty();
    _builder.append("frame.getContentPane().add(");
    _builder.append(e.ename);
    _builder.append("CheckBox);\t\t");
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  public static CharSequence genSetterGetter(final SliderLabelCheckBox e) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("public void set");
    _builder.append(e.ename);
    _builder.append("(double __param) {");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append(e.ename, "\t");
    _builder.append(" = __param;\t");
    _builder.newLineIfNotEmpty();
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    _builder.append("public double get");
    _builder.append(e.ename);
    _builder.append("() {");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("return ");
    _builder.append(e.ename, "\t");
    _builder.append(";");
    _builder.newLineIfNotEmpty();
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    _builder.append("public void set");
    _builder.append(e.ename);
    _builder.append("Enabled(boolean __param) {");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append(e.ename, "\t");
    _builder.append("Enabled = __param;\t");
    _builder.newLineIfNotEmpty();
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    _builder.append("public boolean get");
    _builder.append(e.ename);
    _builder.append("Enabled() {");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("return ");
    _builder.append(e.ename, "\t");
    _builder.append("Enabled;");
    _builder.newLineIfNotEmpty();
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }
  
  public static CharSequence genChangeListener(final SliderLabelCheckBox e) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("if(ce.getSource() == ");
    _builder.append(e.ename);
    _builder.append("Slider) {");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("gCB.set");
    _builder.append(e.ename, "\t");
    _builder.append("((double) (");
    _builder.append(e.ename, "\t");
    _builder.append("Slider.getValue()/");
    _builder.append(e.multiplier, "\t");
    _builder.append("));");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("update");
    _builder.append(e.ename, "\t");
    _builder.append("Label();");
    _builder.newLineIfNotEmpty();
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }
  
  public static CharSequence genLabelUpdater(final SliderLabelCheckBox e) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("private void update");
    _builder.append(e.ename);
    _builder.append("Label() {");
    _builder.newLineIfNotEmpty();
    {
      boolean _notEquals = (!Objects.equal(e.option, null));
      if (_notEquals) {
        {
          boolean _equals = Objects.equal(e.option, "LENGTHTOTIME");
          if (_equals) {
            _builder.append(e.ename);
            _builder.append("Label.setText(\"");
            _builder.append(e.controlName);
            _builder.append(" \" + String.format(\"%4.");
            _builder.append(e.precision);
            _builder.append("f\", (1000 * gCB.get");
            _builder.append(e.ename);
            _builder.append("())/gCB.getSamplerate()));\t\t");
            _builder.newLineIfNotEmpty();
          }
        }
        {
          boolean _equals_1 = Objects.equal(e.option, "LOGFREQ");
          if (_equals_1) {
            _builder.append(e.ename);
            _builder.append("Label.setText(\"");
            _builder.append(e.controlName);
            _builder.append(" \" + String.format(\"%4.");
            _builder.append(e.precision);
            _builder.append("f\", Math.pow(10.0, gCB.get");
            _builder.append(e.ename);
            _builder.append("())) + \" Hz\");\t\t");
            _builder.newLineIfNotEmpty();
          }
        }
      } else {
        _builder.append(e.ename);
        _builder.append("Label.setText(\"");
        _builder.append(e.controlName);
        _builder.append(" \" + String.format(\"%4.");
        _builder.append(e.precision);
        _builder.append("f\", gCB.get");
        _builder.append(e.ename);
        _builder.append("()));\t\t");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("}\t\t");
    _builder.newLine();
    return _builder;
  }
}
