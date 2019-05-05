/**
 * SpinCAD Builder - DSP Development Tool for the Spin FV-1
 * Bool.xtend
 * This file supplies template code generation for the REG data type.
 * This turns into a Java int or double, depending on the context.
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
import com.holycityaudio.spincad.spinCAD.SpinEquate;
import org.eclipse.xtend2.lib.StringConcatenation;

@SuppressWarnings("all")
public class spcbEquate extends BlockVariable {
  public static CharSequence declareVar(final SpinEquate e) {
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
        _builder.append(" = ");
        String _value = e.getValue();
        _builder.append(_value);
        _builder.append(";");
        _builder.newLineIfNotEmpty();
      }
    }
    return _builder;
  }
  
  public static CharSequence initialize(final SpinEquate e) {
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
}
