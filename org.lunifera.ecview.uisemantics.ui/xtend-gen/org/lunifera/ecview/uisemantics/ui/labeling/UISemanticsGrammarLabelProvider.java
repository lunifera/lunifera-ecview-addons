/**
 * generated by Xtext
 */
package org.lunifera.ecview.uisemantics.ui.labeling;

import com.google.inject.Inject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider;
import org.eclipse.xtext.xbase.ui.labeling.XbaseLabelProvider;

/**
 * Provides labels for a EObjects.
 * 
 * see http://www.eclipse.org/Xtext/documentation.html#labelProvider
 */
@SuppressWarnings("all")
public class UISemanticsGrammarLabelProvider extends XbaseLabelProvider {
  @Inject
  public UISemanticsGrammarLabelProvider(final AdapterFactoryLabelProvider delegate) {
    super(delegate);
  }
  
  public String text(final EPackage ele) {
    return ele.getNsURI();
  }
}