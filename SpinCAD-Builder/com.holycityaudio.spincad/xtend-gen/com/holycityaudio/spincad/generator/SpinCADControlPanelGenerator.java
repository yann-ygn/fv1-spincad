/**
 * SpinCAD Builder - DSP Development Tool for the Spin FV-1
 * SpinCADControlPanelGenerator.xtend
 * This file supplies template code generation for the SpinCAD Control Panels.
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

import com.holycityaudio.spincad.generator.SliderLabelCheckBox;
import com.holycityaudio.spincad.generator.spcbCheckBox;
import com.holycityaudio.spincad.generator.spcbComboBox;
import com.holycityaudio.spincad.generator.spcbRadioButton;
import com.holycityaudio.spincad.generator.spcbSliderLabel;
import com.holycityaudio.spincad.generator.spcbSliderLabelSpinner;
import com.holycityaudio.spincad.spinCAD.Program;
import com.holycityaudio.spincad.spinCAD.SliderLabelSpinner;
import com.holycityaudio.spincad.spinCAD.SpinCheckBox;
import com.holycityaudio.spincad.spinCAD.SpinComboBox;
import com.holycityaudio.spincad.spinCAD.SpinElement;
import com.holycityaudio.spincad.spinCAD.SpinRadioButton;
import com.holycityaudio.spincad.spinCAD.SpinSliderLabel;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtend2.lib.StringConcatenation;

@SuppressWarnings("all")
public class SpinCADControlPanelGenerator {
  public CharSequence genControlPanelCode(final String blockName, final Program pr) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("/* SpinCAD Designer - DSP Development Tool for the Spin FV-1 ");
    _builder.newLine();
    _builder.append(" ");
    _builder.append("* ");
    _builder.append(blockName, " ");
    _builder.append("ControlPanel.java");
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
    _builder.append("package com.holycityaudio.SpinCAD.ControlPanel;");
    _builder.newLine();
    _builder.newLine();
    _builder.append("import org.andrewkilpatrick.elmGen.ElmProgram;");
    _builder.newLine();
    _builder.append("import javax.swing.JFrame;");
    _builder.newLine();
    _builder.append("import javax.swing.SwingUtilities;");
    _builder.newLine();
    _builder.append("import javax.swing.event.ChangeEvent;");
    _builder.newLine();
    _builder.append("import javax.swing.event.ChangeListener;");
    _builder.newLine();
    _builder.append("import java.awt.event.ActionEvent;");
    _builder.newLine();
    _builder.append("import java.awt.event.WindowEvent;");
    _builder.newLine();
    _builder.append("import java.awt.event.WindowListener;");
    _builder.newLine();
    _builder.append("import java.awt.event.ItemEvent;");
    _builder.newLine();
    _builder.append("import javax.swing.BoxLayout;");
    _builder.newLine();
    _builder.append("import javax.swing.JSlider;");
    _builder.newLine();
    _builder.append("import javax.swing.JPanel;");
    _builder.newLine();
    _builder.append("import javax.swing.JSpinner;");
    _builder.newLine();
    _builder.append("import javax.swing.JLabel;");
    _builder.newLine();
    _builder.append("import javax.swing.JCheckBox;");
    _builder.newLine();
    _builder.append("import javax.swing.JComboBox;");
    _builder.newLine();
    _builder.append("import javax.swing.Box;");
    _builder.newLine();
    _builder.append("import javax.swing.SpinnerNumberModel;");
    _builder.newLine();
    _builder.append("import javax.swing.SwingConstants;");
    _builder.newLine();
    _builder.append("import javax.swing.BorderFactory;");
    _builder.newLine();
    _builder.append("import javax.swing.border.BevelBorder;");
    _builder.newLine();
    _builder.append("import javax.swing.border.Border;");
    _builder.newLine();
    _builder.append("import java.awt.Dimension;");
    _builder.newLine();
    _builder.append("import java.text.DecimalFormat;");
    _builder.newLine();
    _builder.append("import com.holycityaudio.SpinCAD.SpinCADBlock;");
    _builder.newLine();
    _builder.append("import com.holycityaudio.SpinCAD.spinCADControlPanel;");
    _builder.newLine();
    _builder.append("import com.holycityaudio.SpinCAD.CADBlocks.");
    _builder.append((blockName + "CADBlock"));
    _builder.append(";");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("@SuppressWarnings(\"unused\")");
    _builder.newLine();
    _builder.append("public class ");
    _builder.append((blockName + "ControlPanel"));
    _builder.append(" extends spinCADControlPanel {");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("private JFrame frame;");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("private ");
    _builder.append((blockName + "CADBlock"), "\t");
    _builder.append(" gCB;");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("// declare the controls");
    _builder.newLine();
    {
      EList<SpinElement> _elements = pr.getElements();
      for(final SpinElement e : _elements) {
        _builder.append("\t");
        CharSequence _switchResult = null;
        boolean _matched = false;
        if (e instanceof SpinSliderLabel) {
          _matched=true;
          _switchResult = spcbSliderLabel.declareVar(((SpinSliderLabel)e));
        }
        if (!_matched) {
          if (e instanceof SliderLabelSpinner) {
            _matched=true;
            _switchResult = spcbSliderLabelSpinner.declareVar(((SliderLabelSpinner)e));
          }
        }
        if (!_matched) {
          if (e instanceof SpinCheckBox) {
            _matched=true;
            _switchResult = spcbCheckBox.declareVar(((SpinCheckBox)e));
          }
        }
        if (!_matched) {
          if (e instanceof SpinComboBox) {
            _matched=true;
            _switchResult = spcbComboBox.declareVar(((SpinComboBox)e));
          }
        }
        if (!_matched) {
          if (e instanceof SpinRadioButton) {
            _matched=true;
            _switchResult = spcbRadioButton.declareVar(((SpinRadioButton)e));
          }
        }
        _builder.append(_switchResult, "\t");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.newLine();
    _builder.append("public ");
    _builder.append((blockName + "ControlPanel"));
    _builder.append("(");
    _builder.append((blockName + "CADBlock"));
    _builder.append(" genericCADBlock) {");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("gCB = genericCADBlock;");
    _builder.newLine();
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("SwingUtilities.invokeLater(new Runnable() {");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("public void run() {");
    _builder.newLine();
    _builder.newLine();
    _builder.append("\t\t\t\t");
    _builder.append("frame = new JFrame();");
    _builder.newLine();
    _builder.append("\t\t\t\t");
    _builder.append("frame.setTitle(\"");
    String _name = pr.getName();
    _builder.append(_name, "\t\t\t\t");
    _builder.append("\");");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t\t\t");
    _builder.append("frame.setLayout(new BoxLayout(frame.getContentPane(), BoxLayout.Y_AXIS));");
    _builder.newLine();
    _builder.newLine();
    {
      EList<SpinElement> _elements_1 = pr.getElements();
      for(final SpinElement e_1 : _elements_1) {
        _builder.append("\t\t\t");
        CharSequence _switchResult_1 = null;
        boolean _matched_1 = false;
        if (e_1 instanceof SpinCheckBox) {
          _matched_1=true;
          _switchResult_1 = spcbCheckBox.initialize(blockName, ((SpinCheckBox)e_1));
        }
        if (!_matched_1) {
          if (e_1 instanceof SpinComboBox) {
            _matched_1=true;
            _switchResult_1 = spcbComboBox.initialize(blockName, ((SpinComboBox)e_1));
          }
        }
        if (!_matched_1) {
          if (e_1 instanceof SpinSliderLabel) {
            _matched_1=true;
            _switchResult_1 = spcbSliderLabel.initialize(blockName, ((SpinSliderLabel)e_1));
          }
        }
        if (!_matched_1) {
          if (e_1 instanceof SliderLabelSpinner) {
            _matched_1=true;
            _switchResult_1 = spcbSliderLabelSpinner.initialize(blockName, ((SliderLabelSpinner)e_1));
          }
        }
        if (!_matched_1) {
          if (e_1 instanceof SliderLabelCheckBox) {
            _matched_1=true;
            _switchResult_1 = SliderLabelCheckBox.initialize(blockName, ((SliderLabelCheckBox)e_1));
          }
        }
        if (!_matched_1) {
          if (e_1 instanceof SpinRadioButton) {
            _matched_1=true;
            _switchResult_1 = spcbRadioButton.initialize(blockName, ((SpinRadioButton)e_1));
          }
        }
        _builder.append(_switchResult_1, "\t\t\t");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("\t\t\t\t");
    _builder.append("frame.addWindowListener(new MyWindowListener());");
    _builder.newLine();
    _builder.append("\t\t\t\t");
    _builder.append("frame.pack();");
    _builder.newLine();
    _builder.append("\t\t\t\t");
    _builder.append("frame.setResizable(false);");
    _builder.newLine();
    _builder.append("\t\t\t\t");
    _builder.append("frame.setLocation(gCB.getX() + 100, gCB.getY() + 100);");
    _builder.newLine();
    _builder.append("\t\t\t\t");
    _builder.append("frame.setAlwaysOnTop(true);");
    _builder.newLine();
    _builder.append("\t\t\t\t");
    _builder.append("frame.setVisible(true);\t\t");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("});");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("// add change listener for Sliders, Spinners ");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("class ");
    _builder.append(blockName, "\t\t");
    _builder.append("Listener implements ChangeListener { ");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t");
    _builder.append("public void stateChanged(ChangeEvent ce) {");
    _builder.newLine();
    {
      EList<SpinElement> _elements_2 = pr.getElements();
      for(final SpinElement e_2 : _elements_2) {
        _builder.append("\t\t\t");
        CharSequence _switchResult_2 = null;
        boolean _matched_2 = false;
        if (e_2 instanceof SpinSliderLabel) {
          _matched_2=true;
          _switchResult_2 = spcbSliderLabel.genChangeListener(((SpinSliderLabel)e_2));
        }
        if (!_matched_2) {
          if (e_2 instanceof SliderLabelSpinner) {
            _matched_2=true;
            _switchResult_2 = spcbSliderLabelSpinner.genChangeListener(((SliderLabelSpinner)e_2));
          }
        }
        if (!_matched_2) {
          if (e_2 instanceof SliderLabelCheckBox) {
            _matched_2=true;
            _switchResult_2 = SliderLabelCheckBox.genChangeListener(((SliderLabelCheckBox)e_2));
          }
        }
        _builder.append(_switchResult_2, "\t\t\t");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("\t\t\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("// add item state changed listener for Checkbox");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("class ");
    _builder.append(blockName, "\t\t");
    _builder.append("ItemListener implements java.awt.event.ItemListener { ");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t\t");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("@Override");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("public void itemStateChanged(ItemEvent arg0) {");
    _builder.newLine();
    {
      EList<SpinElement> _elements_3 = pr.getElements();
      for(final SpinElement e_3 : _elements_3) {
        _builder.append("\t\t\t");
        CharSequence _switchResult_3 = null;
        boolean _matched_3 = false;
        if (e_3 instanceof SpinCheckBox) {
          _matched_3=true;
          _switchResult_3 = spcbCheckBox.genItemListener(((SpinCheckBox)e_3));
        }
        _builder.append(_switchResult_3, "\t\t\t");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("\t\t\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("// add action listener for Combo Box");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("class ");
    _builder.append(blockName, "\t\t");
    _builder.append("ActionListener implements java.awt.event.ActionListener { ");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t\t");
    _builder.append("@Override");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("public void actionPerformed(ActionEvent arg0) {");
    _builder.newLine();
    {
      EList<SpinElement> _elements_4 = pr.getElements();
      for(final SpinElement e_4 : _elements_4) {
        _builder.append("\t\t\t");
        CharSequence _switchResult_4 = null;
        boolean _matched_4 = false;
        if (e_4 instanceof SpinComboBox) {
          _matched_4=true;
          _switchResult_4 = spcbComboBox.genActionListener(((SpinComboBox)e_4));
        }
        _builder.append(_switchResult_4, "\t\t\t");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("\t\t\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("}");
    _builder.newLine();
    {
      EList<SpinElement> _elements_5 = pr.getElements();
      for(final SpinElement e_5 : _elements_5) {
        _builder.append("\t\t");
        CharSequence _switchResult_5 = null;
        boolean _matched_5 = false;
        if (e_5 instanceof SpinSliderLabel) {
          _matched_5=true;
          _switchResult_5 = spcbSliderLabel.genLabelUpdater(((SpinSliderLabel)e_5));
        }
        if (!_matched_5) {
          if (e_5 instanceof SliderLabelSpinner) {
            _matched_5=true;
            _switchResult_5 = spcbSliderLabelSpinner.genSpinnerSliderUpdaterA(((SliderLabelSpinner)e_5));
          }
        }
        _builder.append(_switchResult_5, "\t\t");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("\t\t");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("class MyWindowListener implements WindowListener");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("{");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("@Override");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("public void windowActivated(WindowEvent arg0) {");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("@Override");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("public void windowClosed(WindowEvent arg0) {");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("@Override");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("public void windowClosing(WindowEvent arg0) {");
    _builder.newLine();
    _builder.append("\t\t\t\t");
    _builder.append("gCB.clearCP();");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("@Override");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("public void windowDeactivated(WindowEvent arg0) {");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("@Override");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("public void windowDeiconified(WindowEvent arg0) {");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("@Override");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("public void windowIconified(WindowEvent arg0) {");
    _builder.newLine();
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("@Override");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("public void windowOpened(WindowEvent arg0) {");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }
}
