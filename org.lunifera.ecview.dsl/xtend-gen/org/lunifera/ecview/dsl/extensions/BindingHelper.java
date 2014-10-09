package org.lunifera.ecview.dsl.extensions;

import com.google.common.base.Objects;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.xtext.xbase.lib.IteratorExtensions;
import org.lunifera.ecview.semantic.uimodel.UiBinding;
import org.lunifera.ecview.semantic.uimodel.UiEmbeddable;
import org.lunifera.ecview.semantic.uimodel.UiModel;
import org.lunifera.ecview.semantic.uimodel.UiRawBindable;
import org.lunifera.ecview.semantic.uimodel.UiTypedBindableDef;

@SuppressWarnings("all")
public class BindingHelper {
  protected UiBinding _findBinding(final UiEmbeddable embeddable) {
    final UiModel uiModel = this.getUiModel(embeddable);
    TreeIterator<EObject> _allContents = EcoreUtil.<EObject>getAllContents(uiModel, true);
    Iterable<EObject> _iterable = IteratorExtensions.<EObject>toIterable(_allContents);
    for (final EObject object : _iterable) {
      if ((object instanceof UiTypedBindableDef)) {
        UiRawBindable _rawBindable = ((UiTypedBindableDef)object).getRawBindable();
        boolean _equals = Objects.equal(_rawBindable, embeddable);
        if (_equals) {
        }
      }
    }
    return null;
  }
  
  /**
   * Returns the package name.
   * 
   * @param eObject
   * @return
   */
  public String getPackage(final EObject eObject) {
    boolean _equals = Objects.equal(eObject, null);
    if (_equals) {
      return "";
    }
    if ((eObject instanceof UiModel)) {
      return ((UiModel) eObject).getPackageName();
    } else {
      EObject _eContainer = eObject.eContainer();
      return this.getPackage(_eContainer);
    }
  }
  
  public UiModel getUiModel(final EObject eObject) {
    boolean _equals = Objects.equal(eObject, null);
    if (_equals) {
      return null;
    }
    if ((eObject instanceof UiModel)) {
      return ((UiModel) eObject);
    } else {
      EObject _eContainer = eObject.eContainer();
      return this.getUiModel(_eContainer);
    }
  }
  
  public UiBinding findBinding(final UiEmbeddable embeddable) {
    return _findBinding(embeddable);
  }
}
