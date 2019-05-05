/*
 * generated by Xtext
 */
package com.holycityaudio.spincadmenu.ui;

import org.eclipse.xtext.ui.guice.AbstractGuiceAwareExecutableExtensionFactory;
import org.osgi.framework.Bundle;

import com.google.inject.Injector;

import com.holycityaudio.spincadmenu.ui.internal.SpinCADMenuActivator;

/**
 * This class was generated. Customizations should only happen in a newly
 * introduced subclass. 
 */
public class SpinCADMenuExecutableExtensionFactory extends AbstractGuiceAwareExecutableExtensionFactory {

	@Override
	protected Bundle getBundle() {
		return SpinCADMenuActivator.getInstance().getBundle();
	}
	
	@Override
	protected Injector getInjector() {
		return SpinCADMenuActivator.getInstance().getInjector(SpinCADMenuActivator.COM_HOLYCITYAUDIO_SPINCADMENU_SPINCADMENU);
	}
	
}
