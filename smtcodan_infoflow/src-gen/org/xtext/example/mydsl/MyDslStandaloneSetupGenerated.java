/*
* generated by Xtext
*/
package org.xtext.example.mydsl;

import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.ISetup;
import org.eclipse.emf.ecore.resource.Resource;

import com.google.inject.Guice;
import com.google.inject.Injector;

/**
 * Generated from StandaloneSetup.xpt!
 */
@SuppressWarnings("all")
public class MyDslStandaloneSetupGenerated implements ISetup {

	public Injector createInjectorAndDoEMFRegistration() {
		org.eclipse.xtext.common.TerminalsStandaloneSetup.doSetup();

		Injector injector = createInjector();
		register(injector);
		return injector;
	}
	
	public Injector createInjector() {
		return Guice.createInjector(new org.xtext.example.mydsl.MyDslRuntimeModule());
	}
	
	public void register(Injector injector) {
	if (!EPackage.Registry.INSTANCE.containsKey("http://www.xtext.org/example/mydsl/MyDsl")) {
		EPackage.Registry.INSTANCE.put("http://www.xtext.org/example/mydsl/MyDsl", org.xtext.example.mydsl.myDsl.MyDslPackage.eINSTANCE);
	}

		org.eclipse.xtext.resource.IResourceFactory resourceFactory = injector.getInstance(org.eclipse.xtext.resource.IResourceFactory.class);
		org.eclipse.xtext.resource.IResourceServiceProvider serviceProvider = injector.getInstance(org.eclipse.xtext.resource.IResourceServiceProvider.class);
		Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put("h", resourceFactory);
		org.eclipse.xtext.resource.IResourceServiceProvider.Registry.INSTANCE.getExtensionToFactoryMap().put("h", serviceProvider);
		Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put("hh", resourceFactory);
		org.eclipse.xtext.resource.IResourceServiceProvider.Registry.INSTANCE.getExtensionToFactoryMap().put("hh", serviceProvider);
		Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put("hhh", resourceFactory);
		org.eclipse.xtext.resource.IResourceServiceProvider.Registry.INSTANCE.getExtensionToFactoryMap().put("hhh", serviceProvider);
		Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put("hxx", resourceFactory);
		org.eclipse.xtext.resource.IResourceServiceProvider.Registry.INSTANCE.getExtensionToFactoryMap().put("hxx", serviceProvider);
		Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put("c", resourceFactory);
		org.eclipse.xtext.resource.IResourceServiceProvider.Registry.INSTANCE.getExtensionToFactoryMap().put("c", serviceProvider);
		Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put("cpp", resourceFactory);
		org.eclipse.xtext.resource.IResourceServiceProvider.Registry.INSTANCE.getExtensionToFactoryMap().put("cpp", serviceProvider);
		Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put("C", resourceFactory);
		org.eclipse.xtext.resource.IResourceServiceProvider.Registry.INSTANCE.getExtensionToFactoryMap().put("C", serviceProvider);
		Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put("Cpp", resourceFactory);
		org.eclipse.xtext.resource.IResourceServiceProvider.Registry.INSTANCE.getExtensionToFactoryMap().put("Cpp", serviceProvider);
		


	}
}