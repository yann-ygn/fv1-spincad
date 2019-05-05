/**
 * SpinCAD Builder - DSP Development Tool for the Spin FV-1
 * Bool.xtend
 * This file supplies template code generation for the SliderLabel data type.
 * This turns into a Java Swing JSlider with an associated JLabel.
 * 
 * Copyright (C)2015 - Gary Worsham
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
import com.holycityaudio.spincad.spinCAD.SpinSliderLabel;
import org.eclipse.xtend2.lib.StringConcatenation;

@SuppressWarnings("all")
public class spcbSliderLabel extends ControlPanel {
  public static CharSequence declareVar(final SpinSliderLabel e) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("JSlider ");
    String _ename = e.getEname();
    _builder.append(_ename);
    _builder.append("Slider;");
    _builder.newLineIfNotEmpty();
    _builder.append("JLabel  ");
    String _ename_1 = e.getEname();
    _builder.append(_ename_1);
    _builder.append("Label;\t");
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  public static CharSequence initialize(final String blockName, final SpinSliderLabel e) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("//");
    _builder.newLine();
    _builder.append("// these functions translate between slider values, which have to be integers, to whatever in program value you wish.");
    _builder.newLine();
    _builder.append("//");
    _builder.newLine();
    {
      String _option = e.getOption();
      boolean _notEquals = (!Objects.equal(_option, null));
      if (_notEquals) {
        {
          String _option_1 = e.getOption();
          boolean _equals = Objects.equal(_option_1, "LENGTHTOTIME");
          if (_equals) {
            _builder.append("\t\t");
            String _ename = e.getEname();
            _builder.append(_ename, "\t\t");
            _builder.append("Slider = new JSlider(JSlider.HORIZONTAL, (int)(");
            String _minVal = e.getMinVal();
            _builder.append(_minVal, "\t\t");
            _builder.append(" * ");
            String _multiplier = e.getMultiplier();
            _builder.append(_multiplier, "\t\t");
            _builder.append("),(int) (");
            String _maxVal = e.getMaxVal();
            _builder.append(_maxVal, "\t\t");
            _builder.append(" * ");
            String _multiplier_1 = e.getMultiplier();
            _builder.append(_multiplier_1, "\t\t");
            _builder.append("), (int) (gCB.get");
            String _ename_1 = e.getEname();
            _builder.append(_ename_1, "\t\t");
            _builder.append("() * ");
            String _multiplier_2 = e.getMultiplier();
            _builder.append(_multiplier_2, "\t\t");
            _builder.append("));");
            _builder.newLineIfNotEmpty();
          }
        }
        {
          String _option_2 = e.getOption();
          boolean _equals_1 = Objects.equal(_option_2, "FILTTOTIME");
          if (_equals_1) {
            _builder.append("\t\t");
            String _ename_2 = e.getEname();
            _builder.append(_ename_2, "\t\t");
            _builder.append("Slider = new JSlider(JSlider.HORIZONTAL, (int)(");
            String _minVal_1 = e.getMinVal();
            _builder.append(_minVal_1, "\t\t");
            _builder.append(" * ");
            String _multiplier_3 = e.getMultiplier();
            _builder.append(_multiplier_3, "\t\t");
            _builder.append("),(int) (");
            String _maxVal_1 = e.getMaxVal();
            _builder.append(_maxVal_1, "\t\t");
            _builder.append(" * ");
            String _multiplier_4 = e.getMultiplier();
            _builder.append(_multiplier_4, "\t\t");
            _builder.append("), (int) SpinCADBlock.filtToTime(gCB.get");
            String _ename_3 = e.getEname();
            _builder.append(_ename_3, "\t\t");
            _builder.append("() * ");
            String _multiplier_5 = e.getMultiplier();
            _builder.append(_multiplier_5, "\t\t");
            _builder.append("));");
            _builder.newLineIfNotEmpty();
          }
        }
        _builder.append("\t\t");
        _builder.append("//---------------------------------------------");
        _builder.newLine();
        _builder.append("\t\t");
        _builder.append("// LOGFREQ is used for single pole filters");
        _builder.newLine();
        {
          String _option_3 = e.getOption();
          boolean _equals_2 = Objects.equal(_option_3, "LOGFREQ");
          if (_equals_2) {
            _builder.append("\t\t");
            _builder.append("// multiplier is points per decade here");
            _builder.newLine();
            _builder.append("\t\t");
            _builder.append("\t");
            String _ename_4 = e.getEname();
            _builder.append(_ename_4, "\t\t\t");
            _builder.append("Slider = SpinCADBlock.LogSlider(");
            String _minVal_2 = e.getMinVal();
            _builder.append(_minVal_2, "\t\t\t");
            _builder.append(",");
            String _maxVal_2 = e.getMaxVal();
            _builder.append(_maxVal_2, "\t\t\t");
            _builder.append(",gCB.get");
            String _ename_5 = e.getEname();
            _builder.append(_ename_5, "\t\t\t");
            _builder.append("(), \"");
            String _option_4 = e.getOption();
            _builder.append(_option_4, "\t\t\t");
            _builder.append("\", ");
            String _multiplier_6 = e.getMultiplier();
            _builder.append(_multiplier_6, "\t\t\t");
            _builder.append(");");
            _builder.newLineIfNotEmpty();
          }
        }
        _builder.append("\t\t");
        _builder.append("//---------------------------------------------");
        _builder.newLine();
        _builder.append("\t\t");
        _builder.append("// LOGFREQ2 is used for 2-pole SVF");
        _builder.newLine();
        {
          String _option_5 = e.getOption();
          boolean _equals_3 = Objects.equal(_option_5, "LOGFREQ2");
          if (_equals_3) {
            _builder.append("\t\t");
            _builder.append("// multiplier is points per decade here");
            _builder.newLine();
            _builder.append("\t\t");
            _builder.append("\t");
            String _ename_6 = e.getEname();
            _builder.append(_ename_6, "\t\t\t");
            _builder.append("Slider = SpinCADBlock.LogSlider(");
            String _minVal_3 = e.getMinVal();
            _builder.append(_minVal_3, "\t\t\t");
            _builder.append(",");
            String _maxVal_3 = e.getMaxVal();
            _builder.append(_maxVal_3, "\t\t\t");
            _builder.append(",gCB.get");
            String _ename_7 = e.getEname();
            _builder.append(_ename_7, "\t\t\t");
            _builder.append("(), \"");
            String _option_6 = e.getOption();
            _builder.append(_option_6, "\t\t\t");
            _builder.append("\", ");
            String _multiplier_7 = e.getMultiplier();
            _builder.append(_multiplier_7, "\t\t\t");
            _builder.append(");");
            _builder.newLineIfNotEmpty();
          }
        }
        _builder.append("\t\t");
        _builder.append("// ---------------------------------------------\t\t\t\t\t\t");
        _builder.newLine();
        {
          String _option_7 = e.getOption();
          boolean _equals_4 = Objects.equal(_option_7, "DBLEVEL");
          if (_equals_4) {
            _builder.append("\t\t");
            _builder.append("// dB level slider goes in steps of 1 dB");
            _builder.newLine();
            _builder.append("\t\t");
            _builder.append("\t");
            String _ename_8 = e.getEname();
            _builder.append(_ename_8, "\t\t\t");
            _builder.append("Slider = new JSlider(JSlider.HORIZONTAL, (int)(");
            String _minVal_4 = e.getMinVal();
            _builder.append(_minVal_4, "\t\t\t");
            _builder.append("),(int) (");
            String _maxVal_4 = e.getMaxVal();
            _builder.append(_maxVal_4, "\t\t\t");
            _builder.append("), (int) (20 * Math.log10(gCB.get");
            String _ename_9 = e.getEname();
            _builder.append(_ename_9, "\t\t\t");
            _builder.append("())));");
            _builder.newLineIfNotEmpty();
          }
        }
        {
          String _option_8 = e.getOption();
          boolean _equals_5 = Objects.equal(_option_8, "LINEAR");
          if (_equals_5) {
            _builder.append("\t\t");
            String _ename_10 = e.getEname();
            _builder.append(_ename_10, "\t\t");
            _builder.append("Slider = new JSlider(JSlider.HORIZONTAL, (int)(");
            String _minVal_5 = e.getMinVal();
            _builder.append(_minVal_5, "\t\t");
            _builder.append(" * ");
            String _multiplier_8 = e.getMultiplier();
            _builder.append(_multiplier_8, "\t\t");
            _builder.append("),(int) (");
            String _maxVal_5 = e.getMaxVal();
            _builder.append(_maxVal_5, "\t\t");
            _builder.append(" * ");
            String _multiplier_9 = e.getMultiplier();
            _builder.append(_multiplier_9, "\t\t");
            _builder.append("), (int) ((gCB.get");
            String _ename_11 = e.getEname();
            _builder.append(_ename_11, "\t\t");
            _builder.append("()) * ");
            String _multiplier_10 = e.getMultiplier();
            _builder.append(_multiplier_10, "\t\t");
            _builder.append("));");
            _builder.newLineIfNotEmpty();
          }
        }
        {
          String _option_9 = e.getOption();
          boolean _equals_6 = Objects.equal(_option_9, "SINLFOFREQ");
          if (_equals_6) {
            _builder.append("\t\t");
            String _ename_12 = e.getEname();
            _builder.append(_ename_12, "\t\t");
            _builder.append("Slider = new JSlider(JSlider.HORIZONTAL, (int)(");
            String _minVal_6 = e.getMinVal();
            _builder.append(_minVal_6, "\t\t");
            _builder.append(" * ");
            String _multiplier_11 = e.getMultiplier();
            _builder.append(_multiplier_11, "\t\t");
            _builder.append("),(int) (");
            String _maxVal_6 = e.getMaxVal();
            _builder.append(_maxVal_6, "\t\t");
            _builder.append(" * ");
            String _multiplier_12 = e.getMultiplier();
            _builder.append(_multiplier_12, "\t\t");
            _builder.append("), (int) ((gCB.get");
            String _ename_13 = e.getEname();
            _builder.append(_ename_13, "\t\t");
            _builder.append("()) * ");
            String _multiplier_13 = e.getMultiplier();
            _builder.append(_multiplier_13, "\t\t");
            _builder.append("));");
            _builder.newLineIfNotEmpty();
          }
        }
        {
          String _option_10 = e.getOption();
          boolean _equals_7 = Objects.equal(_option_10, "RAMPLFOFREQ");
          if (_equals_7) {
            _builder.append("\t\t");
            String _ename_14 = e.getEname();
            _builder.append(_ename_14, "\t\t");
            _builder.append("Slider = new JSlider(JSlider.HORIZONTAL, (int)(");
            String _minVal_7 = e.getMinVal();
            _builder.append(_minVal_7, "\t\t");
            _builder.append(" * ");
            String _multiplier_14 = e.getMultiplier();
            _builder.append(_multiplier_14, "\t\t");
            _builder.append("),(int) (");
            String _maxVal_7 = e.getMaxVal();
            _builder.append(_maxVal_7, "\t\t");
            _builder.append(" * ");
            String _multiplier_15 = e.getMultiplier();
            _builder.append(_multiplier_15, "\t\t");
            _builder.append("), (int) ((gCB.get");
            String _ename_15 = e.getEname();
            _builder.append(_ename_15, "\t\t");
            _builder.append("()) * ");
            String _multiplier_16 = e.getMultiplier();
            _builder.append(_multiplier_16, "\t\t");
            _builder.append("));");
            _builder.newLineIfNotEmpty();
          }
        }
        {
          String _option_11 = e.getOption();
          boolean _equals_8 = Objects.equal(_option_11, "BOOSTCUT");
          if (_equals_8) {
            _builder.append("\t\t");
            String _ename_16 = e.getEname();
            _builder.append(_ename_16, "\t\t");
            _builder.append("Slider = new JSlider(JSlider.HORIZONTAL, (int)(");
            String _minVal_8 = e.getMinVal();
            _builder.append(_minVal_8, "\t\t");
            _builder.append(" * ");
            String _multiplier_17 = e.getMultiplier();
            _builder.append(_multiplier_17, "\t\t");
            _builder.append("),(int) (");
            String _maxVal_8 = e.getMaxVal();
            _builder.append(_maxVal_8, "\t\t");
            _builder.append(" * ");
            String _multiplier_18 = e.getMultiplier();
            _builder.append(_multiplier_18, "\t\t");
            _builder.append("), (int) ((gCB.get");
            String _ename_17 = e.getEname();
            _builder.append(_ename_17, "\t\t");
            _builder.append("()) * ");
            String _multiplier_19 = e.getMultiplier();
            _builder.append(_multiplier_19, "\t\t");
            _builder.append("));");
            _builder.newLineIfNotEmpty();
          }
        }
      } else {
        _builder.append("\t\t");
        String _ename_18 = e.getEname();
        _builder.append(_ename_18, "\t\t");
        _builder.append("Slider = new JSlider(JSlider.HORIZONTAL, (int)(");
        String _minVal_9 = e.getMinVal();
        _builder.append(_minVal_9, "\t\t");
        _builder.append(" * ");
        String _multiplier_20 = e.getMultiplier();
        _builder.append(_multiplier_20, "\t\t");
        _builder.append("),(int) (");
        String _maxVal_9 = e.getMaxVal();
        _builder.append(_maxVal_9, "\t\t");
        _builder.append(" * ");
        String _multiplier_21 = e.getMultiplier();
        _builder.append(_multiplier_21, "\t\t");
        _builder.append("), (int) (gCB.get");
        String _ename_19 = e.getEname();
        _builder.append(_ename_19, "\t\t");
        _builder.append("() * ");
        String _multiplier_22 = e.getMultiplier();
        _builder.append(_multiplier_22, "\t\t");
        _builder.append("));");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("\t\t\t");
    String _ename_20 = e.getEname();
    _builder.append(_ename_20, "\t\t\t");
    _builder.append("Slider.addChangeListener(new ");
    _builder.append(blockName, "\t\t\t");
    _builder.append("Listener());");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t\t");
    String _ename_21 = e.getEname();
    _builder.append(_ename_21, "\t\t\t");
    _builder.append("Label = new JLabel();");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t\t");
    _builder.append("Border ");
    String _ename_22 = e.getEname();
    _builder.append(_ename_22, "\t\t\t");
    _builder.append("Border1 = BorderFactory.createBevelBorder(BevelBorder.LOWERED);");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t\t");
    String _ename_23 = e.getEname();
    _builder.append(_ename_23, "\t\t\t");
    _builder.append("Label.setBorder(");
    String _ename_24 = e.getEname();
    _builder.append(_ename_24, "\t\t\t");
    _builder.append("Border1);");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t\t");
    _builder.append("update");
    String _ename_25 = e.getEname();
    _builder.append(_ename_25, "\t\t\t");
    _builder.append("Label();");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t\t");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("Border ");
    String _ename_26 = e.getEname();
    _builder.append(_ename_26, "\t\t\t");
    _builder.append("border2 = BorderFactory.createBevelBorder(BevelBorder.RAISED);");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t\t");
    _builder.append("JPanel ");
    String _ename_27 = e.getEname();
    _builder.append(_ename_27, "\t\t\t");
    _builder.append("innerPanel = new JPanel();");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t\t\t");
    _builder.newLine();
    _builder.append("\t\t\t");
    String _ename_28 = e.getEname();
    _builder.append(_ename_28, "\t\t\t");
    _builder.append("innerPanel.setLayout(new BoxLayout(");
    String _ename_29 = e.getEname();
    _builder.append(_ename_29, "\t\t\t");
    _builder.append("innerPanel, BoxLayout.Y_AXIS));");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t\t");
    String _ename_30 = e.getEname();
    _builder.append(_ename_30, "\t\t\t");
    _builder.append("innerPanel.add(Box.createRigidArea(new Dimension(5,4)));\t\t\t");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t\t");
    String _ename_31 = e.getEname();
    _builder.append(_ename_31, "\t\t\t");
    _builder.append("innerPanel.add(");
    String _ename_32 = e.getEname();
    _builder.append(_ename_32, "\t\t\t");
    _builder.append("Label);");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t\t");
    String _ename_33 = e.getEname();
    _builder.append(_ename_33, "\t\t\t");
    _builder.append("innerPanel.add(Box.createRigidArea(new Dimension(5,4)));\t\t\t");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t\t");
    String _ename_34 = e.getEname();
    _builder.append(_ename_34, "\t\t\t");
    _builder.append("innerPanel.add(");
    String _ename_35 = e.getEname();
    _builder.append(_ename_35, "\t\t\t");
    _builder.append("Slider);\t\t");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t\t");
    String _ename_36 = e.getEname();
    _builder.append(_ename_36, "\t\t\t");
    _builder.append("innerPanel.setBorder(");
    String _ename_37 = e.getEname();
    _builder.append(_ename_37, "\t\t\t");
    _builder.append("border2);");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("frame.add(");
    String _ename_38 = e.getEname();
    _builder.append(_ename_38, "\t\t\t");
    _builder.append("innerPanel);");
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  public static CharSequence genSetterGetter(final SpinSliderLabel e) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("public void set");
    String _ename = e.getEname();
    _builder.append(_ename);
    _builder.append("(double __param) {");
    _builder.newLineIfNotEmpty();
    {
      String _option = e.getOption();
      boolean _equals = Objects.equal(_option, "DBLEVEL");
      if (_equals) {
        _builder.append("\t");
        String _ename_1 = e.getEname();
        _builder.append(_ename_1, "\t");
        _builder.append(" = Math.pow(10.0, __param/20.0);\t");
        _builder.newLineIfNotEmpty();
      } else {
        _builder.append("\t");
        String _ename_2 = e.getEname();
        _builder.append(_ename_2, "\t");
        _builder.append(" = __param;\t");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    _builder.append("public double get");
    String _ename_3 = e.getEname();
    _builder.append(_ename_3);
    _builder.append("() {");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("return ");
    String _ename_4 = e.getEname();
    _builder.append(_ename_4, "\t");
    _builder.append(";");
    _builder.newLineIfNotEmpty();
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }
  
  public static CharSequence genChangeListener(final SpinSliderLabel e) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("if(ce.getSource() == ");
    String _ename = e.getEname();
    _builder.append(_ename);
    _builder.append("Slider) {");
    _builder.newLineIfNotEmpty();
    {
      String _option = e.getOption();
      boolean _notEquals = (!Objects.equal(_option, null));
      if (_notEquals) {
        {
          String _option_1 = e.getOption();
          boolean _equals = Objects.equal(_option_1, "LOGFREQ");
          if (_equals) {
            _builder.append("gCB.set");
            String _ename_1 = e.getEname();
            _builder.append(_ename_1);
            _builder.append("((double) SpinCADBlock.freqToFilt(SpinCADBlock.sliderToLogval((int)(");
            String _ename_2 = e.getEname();
            _builder.append(_ename_2);
            _builder.append("Slider.getValue()), ");
            String _multiplier = e.getMultiplier();
            _builder.append(_multiplier);
            _builder.append(")));");
            _builder.newLineIfNotEmpty();
          } else {
            {
              String _option_2 = e.getOption();
              boolean _equals_1 = Objects.equal(_option_2, "LOGFREQ2");
              if (_equals_1) {
                _builder.append("gCB.set");
                String _ename_3 = e.getEname();
                _builder.append(_ename_3);
                _builder.append("((double) SpinCADBlock.freqToFiltSVF(SpinCADBlock.sliderToLogval((int)(");
                String _ename_4 = e.getEname();
                _builder.append(_ename_4);
                _builder.append("Slider.getValue()), ");
                String _multiplier_1 = e.getMultiplier();
                _builder.append(_multiplier_1);
                _builder.append(")));");
                _builder.newLineIfNotEmpty();
              } else {
                {
                  String _option_3 = e.getOption();
                  boolean _equals_2 = Objects.equal(_option_3, "FILTTOTIME");
                  if (_equals_2) {
                    _builder.append("gCB.set");
                    String _ename_5 = e.getEname();
                    _builder.append(_ename_5);
                    _builder.append("((double) SpinCADBlock.timeToFilt(");
                    String _ename_6 = e.getEname();
                    _builder.append(_ename_6);
                    _builder.append("Slider.getValue()/");
                    String _multiplier_2 = e.getMultiplier();
                    _builder.append(_multiplier_2);
                    _builder.append("));");
                    _builder.newLineIfNotEmpty();
                  } else {
                    _builder.append("gCB.set");
                    String _ename_7 = e.getEname();
                    _builder.append(_ename_7);
                    _builder.append("((double) (");
                    String _ename_8 = e.getEname();
                    _builder.append(_ename_8);
                    _builder.append("Slider.getValue()/");
                    String _multiplier_3 = e.getMultiplier();
                    _builder.append(_multiplier_3);
                    _builder.append("));\t\t\t    \t\t\t\t\t");
                    _builder.newLineIfNotEmpty();
                  }
                }
              }
            }
          }
        }
      } else {
        _builder.append("gCB.set");
        String _ename_9 = e.getEname();
        _builder.append(_ename_9);
        _builder.append("((double) (");
        String _ename_10 = e.getEname();
        _builder.append(_ename_10);
        _builder.append("Slider.getValue()/");
        String _multiplier_4 = e.getMultiplier();
        _builder.append(_multiplier_4);
        _builder.append("));");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("\t");
    _builder.append("update");
    String _ename_11 = e.getEname();
    _builder.append(_ename_11, "\t");
    _builder.append("Label();");
    _builder.newLineIfNotEmpty();
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }
  
  public static CharSequence genLabelUpdater(final SpinSliderLabel e) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("private void update");
    String _ename = e.getEname();
    _builder.append(_ename);
    _builder.append("Label() {");
    _builder.newLineIfNotEmpty();
    {
      String _option = e.getOption();
      boolean _notEquals = (!Objects.equal(_option, null));
      if (_notEquals) {
        {
          String _option_1 = e.getOption();
          boolean _equals = Objects.equal(_option_1, "LENGTHTOTIME");
          if (_equals) {
            String _ename_1 = e.getEname();
            _builder.append(_ename_1);
            _builder.append("Label.setText(\"");
            String _controlName = e.getControlName();
            _builder.append(_controlName);
            _builder.append(" \" + String.format(\"%4.");
            int _precision = e.getPrecision();
            _builder.append(_precision);
            _builder.append("f\", (1000 * gCB.get");
            String _ename_2 = e.getEname();
            _builder.append(_ename_2);
            _builder.append("())/ElmProgram.getSamplerate()));\t\t");
            _builder.newLineIfNotEmpty();
          }
        }
        {
          String _option_2 = e.getOption();
          boolean _equals_1 = Objects.equal(_option_2, "FILTTOTIME");
          if (_equals_1) {
            String _ename_3 = e.getEname();
            _builder.append(_ename_3);
            _builder.append("Label.setText(\"");
            String _controlName_1 = e.getControlName();
            _builder.append(_controlName_1);
            _builder.append(" \" + String.format(\"%4.");
            int _precision_1 = e.getPrecision();
            _builder.append(_precision_1);
            _builder.append("f\", SpinCADBlock.filtToTime(gCB.get");
            String _ename_4 = e.getEname();
            _builder.append(_ename_4);
            _builder.append("())) + \" ms\");\t\t");
            _builder.newLineIfNotEmpty();
          }
        }
        {
          String _option_3 = e.getOption();
          boolean _equals_2 = Objects.equal(_option_3, "LOGFREQ");
          if (_equals_2) {
            String _ename_5 = e.getEname();
            _builder.append(_ename_5);
            _builder.append("Label.setText(\"");
            String _controlName_2 = e.getControlName();
            _builder.append(_controlName_2);
            _builder.append(" \" + String.format(\"%4.");
            int _precision_2 = e.getPrecision();
            _builder.append(_precision_2);
            _builder.append("f\", SpinCADBlock.filtToFreq(gCB.get");
            String _ename_6 = e.getEname();
            _builder.append(_ename_6);
            _builder.append("())) + \" Hz\");\t\t");
            _builder.newLineIfNotEmpty();
          }
        }
        {
          String _option_4 = e.getOption();
          boolean _equals_3 = Objects.equal(_option_4, "LOGFREQ2");
          if (_equals_3) {
            String _ename_7 = e.getEname();
            _builder.append(_ename_7);
            _builder.append("Label.setText(\"");
            String _controlName_3 = e.getControlName();
            _builder.append(_controlName_3);
            _builder.append(" \" + String.format(\"%4.");
            int _precision_3 = e.getPrecision();
            _builder.append(_precision_3);
            _builder.append("f\", SpinCADBlock.filtToFreqSVF(gCB.get");
            String _ename_8 = e.getEname();
            _builder.append(_ename_8);
            _builder.append("())) + \" Hz\");\t\t");
            _builder.newLineIfNotEmpty();
          }
        }
        {
          String _option_5 = e.getOption();
          boolean _equals_4 = Objects.equal(_option_5, "SINLFOFREQ");
          if (_equals_4) {
            String _ename_9 = e.getEname();
            _builder.append(_ename_9);
            _builder.append("Label.setText(\"");
            String _controlName_4 = e.getControlName();
            _builder.append(_controlName_4);
            _builder.append(" \" + String.format(\"%4.");
            int _precision_4 = e.getPrecision();
            _builder.append(_precision_4);
            _builder.append("f\", coeffToLFORate(gCB.get");
            String _ename_10 = e.getEname();
            _builder.append(_ename_10);
            _builder.append("())));\t\t");
            _builder.newLineIfNotEmpty();
          }
        }
        {
          String _option_6 = e.getOption();
          boolean _equals_5 = Objects.equal(_option_6, "DBLEVEL");
          if (_equals_5) {
            String _ename_11 = e.getEname();
            _builder.append(_ename_11);
            _builder.append("Label.setText(\"");
            String _controlName_5 = e.getControlName();
            _builder.append(_controlName_5);
            _builder.append(" \" + String.format(\"%4.");
            int _precision_5 = e.getPrecision();
            _builder.append(_precision_5);
            _builder.append("f dB\", (20 * Math.log10(gCB.get");
            String _ename_12 = e.getEname();
            _builder.append(_ename_12);
            _builder.append("()))));\t\t");
            _builder.newLineIfNotEmpty();
          }
        }
      } else {
        String _ename_13 = e.getEname();
        _builder.append(_ename_13);
        _builder.append("Label.setText(\"");
        String _controlName_6 = e.getControlName();
        _builder.append(_controlName_6);
        _builder.append(" \" + String.format(\"%4.");
        int _precision_6 = e.getPrecision();
        _builder.append(_precision_6);
        _builder.append("f\", gCB.get");
        String _ename_14 = e.getEname();
        _builder.append(_ename_14);
        _builder.append("()));\t\t");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("}\t\t");
    _builder.newLine();
    return _builder;
  }
}
