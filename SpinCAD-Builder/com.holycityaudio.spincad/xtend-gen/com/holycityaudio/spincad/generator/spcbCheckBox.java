/**
 * SpinCAD Builder - DSP Development Tool for the Spin FV-1
 * spcbCheckBox.xtend
 * This file supplies template code generation for the CheckBox data type.
 * This turns into a Java Swing Checkbox in a Control Panel.
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

import com.holycityaudio.spincad.generator.ControlPanel;
import com.holycityaudio.spincad.spinCAD.SpinCheckBox;
import org.eclipse.xtend2.lib.StringConcatenation;

@SuppressWarnings("all")
public class spcbCheckBox extends ControlPanel {
  public static CharSequence declareVar(final SpinCheckBox e) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("JCheckBox ");
    String _ename = e.getEname();
    _builder.append(_ename);
    _builder.append("CheckBox;");
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  public static CharSequence genSetterGetter(final SpinCheckBox b) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("public void set");
    String _ename = b.getEname();
    _builder.append(_ename);
    _builder.append("(boolean __param) {");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    String _ename_1 = b.getEname();
    _builder.append(_ename_1, "\t");
    _builder.append(" = __param;\t");
    _builder.newLineIfNotEmpty();
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    _builder.append("public boolean get");
    String _ename_2 = b.getEname();
    _builder.append(_ename_2);
    _builder.append("() {");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("return ");
    String _ename_3 = b.getEname();
    _builder.append(_ename_3, "\t");
    _builder.append(";");
    _builder.newLineIfNotEmpty();
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }
  
  public static CharSequence genItemListener(final SpinCheckBox b) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("if(arg0.getSource() == ");
    String _ename = b.getEname();
    _builder.append(_ename);
    _builder.append("CheckBox) {");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("gCB.set");
    String _ename_1 = b.getEname();
    _builder.append(_ename_1, "\t");
    _builder.append("((boolean) (");
    String _ename_2 = b.getEname();
    _builder.append(_ename_2, "\t");
    _builder.append("CheckBox.isSelected()));");
    _builder.newLineIfNotEmpty();
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }
  
  public static CharSequence initialize(final String blockName, final SpinCheckBox b) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.newLine();
    String _ename = b.getEname();
    _builder.append(_ename);
    _builder.append("CheckBox = new JCheckBox(\"");
    String _controlName = b.getControlName();
    _builder.append(_controlName);
    _builder.append("\", gCB.get");
    String _ename_1 = b.getEname();
    _builder.append(_ename_1);
    _builder.append("());");
    _builder.newLineIfNotEmpty();
    String _ename_2 = b.getEname();
    _builder.append(_ename_2);
    _builder.append("CheckBox.addItemListener(new ");
    _builder.append(blockName);
    _builder.append("ItemListener());");
    _builder.newLineIfNotEmpty();
    _builder.append("frame.getContentPane().add(");
    String _ename_3 = b.getEname();
    _builder.append(_ename_3);
    _builder.append("CheckBox);\t\t");
    _builder.newLineIfNotEmpty();
    return _builder;
  }
}
