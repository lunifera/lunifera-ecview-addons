package org.lunifera.ecview.dsl.derivedstate;

import com.google.common.base.Objects;
import java.util.Arrays;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecp.ecview.common.model.core.YBeanSlot;
import org.eclipse.emf.ecp.ecview.extension.model.extension.YTable;
import org.eclipse.xtext.common.types.JvmTypeReference;
import org.eclipse.xtext.resource.DerivedStateAwareResource;
import org.eclipse.xtext.resource.IDerivedStateComputer;
import org.eclipse.xtext.xbase.lib.InputOutput;
import org.eclipse.xtext.xbase.lib.IteratorExtensions;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;
import org.lunifera.ecview.dsl.uIGrammar.GBeanSlot;
import org.lunifera.ecview.dsl.uIGrammar.GTable;

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
      if ((!this.setup)) {
      }
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
  
  protected void _complete(final YBeanSlot yBeanSlot) {
    final GBeanSlot gSlot = ((GBeanSlot) yBeanSlot);
    final JvmTypeReference typeReference = gSlot.getJvmType();
    boolean _notEquals = (!Objects.equal(typeReference, null));
    if (_notEquals) {
      String _qualifiedName = typeReference.getQualifiedName();
      yBeanSlot.setValueTypeQualifiedName(_qualifiedName);
    }
  }
  
  protected void _complete(final YTable yTable) {
    final GTable gTable = ((GTable) yTable);
    final JvmTypeReference typeReference = gTable.getJvmType();
    boolean _notEquals = (!Objects.equal(typeReference, null));
    if (_notEquals) {
      String _qualifiedName = typeReference.getQualifiedName();
      yTable.setTypeQualifiedName(_qualifiedName);
    }
  }
  
  public void discardDerivedState(final DerivedStateAwareResource resource) {
    InputOutput.<String>print("");
  }
  
  public void complete(final EObject yTable) {
    if (yTable instanceof YTable) {
      _complete((YTable)yTable);
      return;
    } else if (yTable instanceof YBeanSlot) {
      _complete((YBeanSlot)yTable);
      return;
    } else if (yTable != null) {
      _complete(yTable);
      return;
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(yTable).toString());
    }
  }
}
