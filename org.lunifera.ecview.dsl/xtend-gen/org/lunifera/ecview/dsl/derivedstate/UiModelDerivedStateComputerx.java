package org.lunifera.ecview.dsl.derivedstate;

import com.google.common.base.Objects;
import java.util.Arrays;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecp.ecview.common.model.core.YBeanSlot;
import org.eclipse.emf.ecp.ecview.common.model.core.YEmbeddable;
import org.eclipse.xtext.common.types.JvmTypeReference;
import org.eclipse.xtext.resource.DerivedStateAwareResource;
import org.eclipse.xtext.resource.IDerivedStateComputer;
import org.eclipse.xtext.xbase.lib.InputOutput;
import org.eclipse.xtext.xbase.lib.IteratorExtensions;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;
import org.lunifera.ecview.semantic.uimodel.UiBeanSlot;
import org.lunifera.ecview.semantic.uimodel.UiIDEView;
import org.lunifera.ecview.semantic.uimodel.uiextension.UiGridLayout;
import org.lunifera.ecview.semantic.uimodel.uiextension.UiGridLayoutAssigment;
import org.lunifera.ecview.semantic.uimodel.uiextension.UiTextField;

@SuppressWarnings("all")
public class UiModelDerivedStateComputerx implements IDerivedStateComputer {
  private volatile boolean setup;
  
  public void installDerivedState(final DerivedStateAwareResource resource, final boolean preLinkingPhase) {
    EList<EObject> _contents = resource.getContents();
    boolean _isEmpty = _contents.isEmpty();
    if (_isEmpty) {
      return;
    }
    if ((!preLinkingPhase)) {
      TreeIterator<EObject> _allContents = resource.getAllContents();
      final Procedure1<EObject> _function = new Procedure1<EObject>() {
        public void apply(final EObject it) {
          UiModelDerivedStateComputerx.this.complete(it);
        }
      };
      IteratorExtensions.<EObject>forEach(_allContents, _function);
    }
  }
  
  protected void _complete(final EObject eObject) {
  }
  
  protected void _complete(final UiIDEView eObject) {
  }
  
  protected void _complete(final UiTextField eObject) {
    String _name = eObject.getName();
    eObject.setLabel(_name);
  }
  
  protected void _complete(final UiGridLayout eObject) {
    eObject.setColumns(4);
    EList<UiGridLayoutAssigment> _contents = eObject.getContents();
    for (final UiGridLayoutAssigment assignment : _contents) {
      YEmbeddable _element = assignment.getElement();
      eObject.addElement(_element);
    }
  }
  
  protected void _complete(final YBeanSlot yBeanSlot) {
    final UiBeanSlot gSlot = ((UiBeanSlot) yBeanSlot);
    final JvmTypeReference typeReference = gSlot.getJvmType();
    boolean _notEquals = (!Objects.equal(typeReference, null));
    if (_notEquals) {
      String _qualifiedName = typeReference.getQualifiedName();
      yBeanSlot.setValueTypeQualifiedName(_qualifiedName);
    }
  }
  
  public void discardDerivedState(final DerivedStateAwareResource resource) {
    InputOutput.<String>print("");
  }
  
  public void complete(final EObject eObject) {
    if (eObject instanceof UiTextField) {
      _complete((UiTextField)eObject);
      return;
    } else if (eObject instanceof UiGridLayout) {
      _complete((UiGridLayout)eObject);
      return;
    } else if (eObject instanceof UiIDEView) {
      _complete((UiIDEView)eObject);
      return;
    } else if (eObject instanceof YBeanSlot) {
      _complete((YBeanSlot)eObject);
      return;
    } else if (eObject != null) {
      _complete(eObject);
      return;
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(eObject).toString());
    }
  }
}
