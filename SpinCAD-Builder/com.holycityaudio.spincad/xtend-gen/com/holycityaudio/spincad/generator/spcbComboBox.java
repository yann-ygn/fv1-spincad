/**
 * SpinCAD Builder - DSP Development Tool for the Spin FV-1
 * spcbComboBox.xtend
 * This file supplies template code generation for the ComboBox data type.
 * This turns into a Java Swing ComboBox in a Control Panel.
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
import com.holycityaudio.spincad.spinCAD.SpinComboBox;
import org.eclipse.xtend2.lib.StringConcatenation;

@SuppressWarnings("all")
public class spcbComboBox extends ControlPanel {
  public static CharSequence declareVar(final SpinComboBox e) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("private JComboBox <String> ");
    String _ename = e.getEname();
    _builder.append(_ename);
    _builder.append("ComboBox; ");
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  public static CharSequence genSetterGetter(final SpinComboBox b) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("public void set");
    String _ename = b.getEname();
    _builder.append(_ename);
    _builder.append("(int __param) {");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    String _ename_1 = b.getEname();
    _builder.append(_ename_1, "\t");
    _builder.append(" = (double) __param;\t");
    _builder.newLineIfNotEmpty();
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    _builder.append("public int get");
    String _ename_2 = b.getEname();
    _builder.append(_ename_2);
    _builder.append("() {");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("return (int) ");
    String _ename_3 = b.getEname();
    _builder.append(_ename_3, "\t");
    _builder.append(";");
    _builder.newLineIfNotEmpty();
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }
  
  public static CharSequence genActionListener(final SpinComboBox b) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("if(arg0.getSource() == ");
    String _ename = b.getEname();
    _builder.append(_ename);
    _builder.append("ComboBox) {");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("gCB.set");
    String _ename_1 = b.getEname();
    _builder.append(_ename_1, "\t");
    _builder.append("((");
    String _ename_2 = b.getEname();
    _builder.append(_ename_2, "\t");
    _builder.append("ComboBox.getSelectedIndex()));");
    _builder.newLineIfNotEmpty();
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }
  
  public static CharSequence initialize(final String blockName, final SpinComboBox b) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("\t");
    String _ename = b.getEname();
    _builder.append(_ename, "\t");
    _builder.append("ComboBox = new JComboBox <String> ();");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    String _ename_1 = b.getEname();
    _builder.append(_ename_1, "\t");
    _builder.append("ComboBox.addItem(\"");
    String _optiona = b.getOptiona();
    _builder.append(_optiona, "\t");
    _builder.append("\");");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    String _ename_2 = b.getEname();
    _builder.append(_ename_2, "\t");
    _builder.append("ComboBox.addItem(\"");
    String _optionb = b.getOptionb();
    _builder.append(_optionb, "\t");
    _builder.append("\");");
    _builder.newLineIfNotEmpty();
    {
      String _optionc = b.getOptionc();
      boolean _notEquals = (!Objects.equal(_optionc, null));
      if (_notEquals) {
        String _ename_3 = b.getEname();
        _builder.append(_ename_3);
        _builder.append("ComboBox.addItem(\"");
        String _optionc_1 = b.getOptionc();
        _builder.append(_optionc_1);
        _builder.append("\");");
        _builder.newLineIfNotEmpty();
      }
    }
    {
      String _optiond = b.getOptiond();
      boolean _notEquals_1 = (!Objects.equal(_optiond, null));
      if (_notEquals_1) {
        String _ename_4 = b.getEname();
        _builder.append(_ename_4);
        _builder.append("ComboBox.addItem(\"");
        String _optiond_1 = b.getOptiond();
        _builder.append(_optiond_1);
        _builder.append("\");");
        _builder.newLineIfNotEmpty();
      }
    }
    {
      String _optione = b.getOptione();
      boolean _notEquals_2 = (!Objects.equal(_optione, null));
      if (_notEquals_2) {
        String _ename_5 = b.getEname();
        _builder.append(_ename_5);
        _builder.append("ComboBox.addItem(\"");
        String _optione_1 = b.getOptione();
        _builder.append(_optione_1);
        _builder.append("\");");
        _builder.newLineIfNotEmpty();
      }
    }
    {
      String _optionf = b.getOptionf();
      boolean _notEquals_3 = (!Objects.equal(_optionf, null));
      if (_notEquals_3) {
        String _ename_6 = b.getEname();
        _builder.append(_ename_6);
        _builder.append("ComboBox.addItem(\"");
        String _optionf_1 = b.getOptionf();
        _builder.append(_optionf_1);
        _builder.append("\");");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("\t");
    String _ename_7 = b.getEname();
    _builder.append(_ename_7, "\t");
    _builder.append("ComboBox.setSelectedIndex(gCB.get");
    String _ename_8 = b.getEname();
    _builder.append(_ename_8, "\t");
    _builder.append("());");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("frame.add(Box.createRigidArea(new Dimension(5,8)));\t\t\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("frame.getContentPane().add(");
    String _ename_9 = b.getEname();
    _builder.append(_ename_9, "\t");
    _builder.append("ComboBox);");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    String _ename_10 = b.getEname();
    _builder.append(_ename_10, "\t");
    _builder.append("ComboBox.addActionListener(new ");
    _builder.append(blockName, "\t");
    _builder.append("ActionListener());");
    _builder.newLineIfNotEmpty();
    return _builder;
  }
}
