/**
 * SpinCAD Builder - DSP Development Tool for the Spin FV-1
 * SpinCADGenerator.xtend
 * This file is triggered by code generation and calls the SpinCADBlock,
 * SpinCADControlPanel, and SpinCADTest generator files as needed.
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

import com.holycityaudio.spincad.generator.SpinCADBlockGenerator;
import com.holycityaudio.spincad.generator.SpinCADControlPanelGenerator;
import com.holycityaudio.spincad.generator.SpinCADTestGenerator;
import com.holycityaudio.spincad.spinCAD.Program;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.generator.IFileSystemAccess;
import org.eclipse.xtext.generator.IGenerator;
import org.eclipse.xtext.xbase.lib.IterableExtensions;

@SuppressWarnings("all")
public class SpinCADGenerator implements IGenerator {
  @Override
  public void doGenerate(final Resource resource, final IFileSystemAccess fsa) {
    String pkage = "/com/holycityaudio/SpinCAD/CADBlocks/";
    String _className = this.className(resource);
    String _plus = (pkage + _className);
    String _plus_1 = (_plus + "CADBlock.java");
    EObject _head = IterableExtensions.<EObject>head(resource.getContents());
    fsa.generateFile(_plus_1, this.toCADBlockCode(((Program) _head)));
    pkage = "/com/holycityaudio/SpinCAD/ControlPanel/";
    String _className_1 = this.className(resource);
    String _plus_2 = (pkage + _className_1);
    String _plus_3 = (_plus_2 + "ControlPanel.java");
    EObject _head_1 = IterableExtensions.<EObject>head(resource.getContents());
    fsa.generateFile(_plus_3, this.toControlPanelCode(((Program) _head_1)));
  }
  
  public String className(final Resource res) {
    String name = res.getURI().lastSegment();
    return name.substring(0, name.indexOf("."));
  }
  
  public CharSequence toCADBlockCode(final Program pr) {
    CharSequence _xblockexpression = null;
    {
      final String blockName = this.className(pr.eResource());
      SpinCADBlockGenerator boop = new SpinCADBlockGenerator();
      StringConcatenation _builder = new StringConcatenation();
      CharSequence _codeGenerate = boop.codeGenerate(blockName, pr);
      _builder.append(_codeGenerate);
      _builder.newLineIfNotEmpty();
      _xblockexpression = _builder;
    }
    return _xblockexpression;
  }
  
  public CharSequence toControlPanelCode(final Program pr) {
    CharSequence _xblockexpression = null;
    {
      final String blockName = this.className(pr.eResource());
      SpinCADControlPanelGenerator boop = new SpinCADControlPanelGenerator();
      StringConcatenation _builder = new StringConcatenation();
      CharSequence _genControlPanelCode = boop.genControlPanelCode(blockName, pr);
      _builder.append(_genControlPanelCode);
      _builder.newLineIfNotEmpty();
      _xblockexpression = _builder;
    }
    return _xblockexpression;
  }
  
  public CharSequence toTestCode(final Program pr) {
    CharSequence _xblockexpression = null;
    {
      final String blockName = this.className(pr.eResource());
      SpinCADTestGenerator boop = new SpinCADTestGenerator();
      StringConcatenation _builder = new StringConcatenation();
      CharSequence _genTestHeader = boop.genTestHeader(blockName);
      _builder.append(_genTestHeader);
      _builder.newLineIfNotEmpty();
      CharSequence _testNoConnections = boop.testNoConnections(blockName);
      _builder.append(_testNoConnections);
      _builder.newLineIfNotEmpty();
      CharSequence _testAllConnections = boop.testAllConnections(blockName, pr);
      _builder.append(_testAllConnections);
      _builder.newLineIfNotEmpty();
      CharSequence _genTestCloser = boop.genTestCloser(blockName);
      _builder.append(_genTestCloser);
      _builder.newLineIfNotEmpty();
      _xblockexpression = _builder;
    }
    return _xblockexpression;
  }
}
