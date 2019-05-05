/**
 * SpinCAD Builder - DSP Development Tool for the Spin FV-1
 * RadioButton.xtend
 * This file supplies template code generation for the RadioButton data type.
 * This turns into a Java Swing RadioButton in a Control Panel.
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
import com.holycityaudio.spincad.spinCAD.SpinRadioButton;
import org.eclipse.xtend2.lib.StringConcatenation;

@SuppressWarnings("all")
public class spcbRadioButton extends ControlPanel {
  public static CharSequence declareVar(final SpinRadioButton e) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("JRadioButton ");
    String _ename = e.getEname();
    _builder.append(_ename);
    _builder.append("RadioButton;");
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  public static CharSequence genSetterGetter(final SpinRadioButton b) {
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
  
  public static CharSequence genItemListener(final SpinRadioButton b) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("if(ce.getSource() == ");
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
  
  public static CharSequence initialize(final String blockName, final SpinRadioButton b) {
    StringConcatenation _builder = new StringConcatenation();
    String _ename = b.getEname();
    _builder.append(_ename);
    _builder.append("CheckBox = new JCheckBox();");
    _builder.newLineIfNotEmpty();
    String _ename_1 = b.getEname();
    _builder.append(_ename_1);
    _builder.append("CheckBox.setText(\"");
    String _controlName = b.getControlName();
    _builder.append(_controlName);
    _builder.append("\");");
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
    _builder.append("// add class code for RadioButton handler");
    _builder.newLine();
    _builder.append("class ");
    _builder.append(blockName);
    _builder.append(" extends JPanel implements ActionListener {");
    _builder.newLineIfNotEmpty();
    _builder.append("private static final long serialVersionUID = -507133930408340822L;");
    _builder.newLine();
    _builder.append("JRadioButton lfo0 = new JRadioButton(\"LFO 0\");");
    _builder.newLine();
    _builder.append("JRadioButton lfo1 = new JRadioButton(\"LFO 1\");");
    _builder.newLine();
    _builder.newLine();
    _builder.append("public LFORadioButtons() {");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("super(new BorderLayout());");
    _builder.newLine();
    _builder.newLine();
    _builder.append("\t");
    _builder.append("lfo0.setActionCommand(\"LFO 0\");");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("lfo1.setActionCommand(\"LFO 1\");");
    _builder.newLine();
    _builder.newLine();
    _builder.append("\t");
    _builder.append("if(pC.getLFOSel() == 0)");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("lfo0.setSelected(true);");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("else if(pC.getLFOSel() == 1)");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("lfo1.setSelected(true);");
    _builder.newLine();
    _builder.newLine();
    _builder.append("\t");
    _builder.append("//Group the radio buttons.");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("ButtonGroup group = new ButtonGroup();");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("group.add(lfo0);");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("group.add(lfo1);");
    _builder.newLine();
    _builder.newLine();
    _builder.append("\t");
    _builder.append("//Register a listener for the radio buttons.");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("lfo0.addActionListener(this);");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("lfo1.addActionListener(this);");
    _builder.newLine();
    _builder.newLine();
    _builder.append("\t");
    _builder.append("JPanel radioPanel = new JPanel(new GridLayout(1, 2));");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("radioPanel.add(lfo0);");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("radioPanel.add(lfo1);");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("lfo1.setAlignmentY(SwingConstants.CENTER);");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("add(radioPanel, BorderLayout.LINE_START);");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("@Override");
    _builder.newLine();
    _builder.append("public void itemStateChanged(ItemEvent arg0) {");
    _builder.newLine();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }
}
