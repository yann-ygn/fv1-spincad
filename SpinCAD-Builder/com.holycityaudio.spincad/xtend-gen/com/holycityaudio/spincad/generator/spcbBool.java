/**
 * SpinCAD Builder - DSP Development Tool for the Spin FV-1
 * Bool.xtend
 * This file supplies template code generation for the Bool data type.
 * This turns into a Java boolean.
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

import com.holycityaudio.spincad.generator.BlockVariable;
import com.holycityaudio.spincad.spinCAD.SpinBool;
import org.eclipse.xtend2.lib.StringConcatenation;

@SuppressWarnings("all")
public class spcbBool extends BlockVariable {
  public static CharSequence declareVar(final SpinBool e) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("boolean ");
    String _label = e.getLabel();
    _builder.append(_label);
    _builder.append(" = ");
    String _value = e.getValue();
    _builder.append(_value);
    _builder.append(";");
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  public static CharSequence initialize(final SpinBool e) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("//\t\t");
    String _label = e.getLabel();
    _builder.append(_label);
    _builder.append(" = ");
    String _value = e.getValue();
    _builder.append(_value);
    _builder.append(";");
    _builder.newLineIfNotEmpty();
    return _builder;
  }
}
