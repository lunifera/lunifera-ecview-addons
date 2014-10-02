package org.lunifera.ecview.dsl.jvmmodel;

import com.google.inject.Inject;
import java.util.Arrays;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.common.types.util.TypeReferences;
import org.eclipse.xtext.naming.IQualifiedNameProvider;
import org.eclipse.xtext.naming.QualifiedName;
import org.eclipse.xtext.xbase.jvmmodel.AbstractModelInferrer;
import org.eclipse.xtext.xbase.jvmmodel.IJvmDeclaredTypeAcceptor;
import org.eclipse.xtext.xbase.jvmmodel.IJvmModelAssociator;
import org.eclipse.xtext.xbase.jvmmodel.JvmTypesBuilder;
import org.eclipse.xtext.xbase.lib.Extension;
import org.eclipse.xtext.xbase.lib.StringExtensions;
import org.lunifera.ecview.dsl.scope.BindableTypeResolver;
import org.lunifera.ecview.semantic.uimodel.UiBindingExpression;
import org.lunifera.ecview.semantic.uimodel.UiTypedBindableRawType;
import org.lunifera.ecview.semantic.uimodel.UiTypedBindableRawTypeAlias;
import org.lunifera.ecview.semantic.uimodel.UiVisibilityProcessor;
import org.lunifera.ecview.semantic.uimodel.UiXbaseValidator;

/**
 * <p>Infers a JVM model from the source model.</p>
 * 
 * <p>The JVM model should contain all elements that would appear in the Java code
 * which is generated from the source model. Other models link against the JVM model rather than the source model.</p>
 */
@SuppressWarnings("all")
public class UIGrammarJvmModelInferrer extends AbstractModelInferrer {
  /**
   * convenience API to build and initialize JVM types and their members.
   */
  @Inject
  @Extension
  private JvmTypesBuilder _jvmTypesBuilder;
  
  @Inject
  @Extension
  private IQualifiedNameProvider _iQualifiedNameProvider;
  
  @Inject
  private IJvmModelAssociator associator;
  
  @Inject
  private TypeReferences references;
  
  @Inject
  private BindableTypeResolver typeResolver;
  
  protected void _infer(final UiXbaseValidator element, final IJvmDeclaredTypeAcceptor acceptor, final boolean isPreIndexingPhase) {
    throw new Error("Unresolved compilation problems:"
      + "\nAbstractDisposable cannot be resolved to a type."
      + "\nIValidator cannot be resolved to a type."
      + "\nII18nService cannot be resolved to a type."
      + "\nII18nService cannot be resolved to a type."
      + "\nIStatus cannot be resolved to a type."
      + "\nIStatus cannot be resolved to a type."
      + "\nIStatus cannot be resolved to a type."
      + "\nIStatus cannot be resolved to a type.");
  }
  
  protected void _infer(final UiVisibilityProcessor element, final IJvmDeclaredTypeAcceptor acceptor, final boolean isPreIndexingPhase) {
    throw new Error("Unresolved compilation problems:"
      + "\nIVisibilityProcessor cannot be resolved to a type."
      + "\nIVisibilityHandler cannot be resolved to a type."
      + "\nIVisibilityManager cannot be resolved to a type.");
  }
  
  /**
   * Returns the name of the validator
   */
  public String getValidatorName(final UiXbaseValidator element) {
    final QualifiedName fqn = this._iQualifiedNameProvider.getFullyQualifiedName(element);
    boolean _isEmpty = fqn.isEmpty();
    if (_isEmpty) {
      return "UnderConstruction";
    }
    QualifiedName _skipLast = fqn.skipLast(1);
    String _lastSegment = fqn.getLastSegment();
    String _firstUpper = StringExtensions.toFirstUpper(_lastSegment);
    final QualifiedName newFqn = _skipLast.append(_firstUpper);
    return newFqn.toString();
  }
  
  /**
   * Returns the name of the validator
   */
  public String getProcessorName(final UiVisibilityProcessor element) {
    final QualifiedName fqn = this._iQualifiedNameProvider.getFullyQualifiedName(element);
    boolean _isEmpty = fqn.isEmpty();
    if (_isEmpty) {
      return "UnderConstruction";
    }
    QualifiedName _skipLast = fqn.skipLast(1);
    String _lastSegment = fqn.getLastSegment();
    String _firstUpper = StringExtensions.toFirstUpper(_lastSegment);
    final QualifiedName newFqn = _skipLast.append(_firstUpper);
    return newFqn.toString();
  }
  
  public String toPathString(final UiTypedBindableRawTypeAlias alias) {
    UiBindingExpression _type = alias.getType();
    final UiTypedBindableRawType type = ((UiTypedBindableRawType) _type);
    String _pathString = null;
    if (type!=null) {
      _pathString=type.toPathString();
    }
    return _pathString;
  }
  
  public void infer(final EObject element, final IJvmDeclaredTypeAcceptor acceptor, final boolean isPreIndexingPhase) {
    if (element instanceof UiXbaseValidator) {
      _infer((UiXbaseValidator)element, acceptor, isPreIndexingPhase);
      return;
    } else if (element instanceof UiVisibilityProcessor) {
      _infer((UiVisibilityProcessor)element, acceptor, isPreIndexingPhase);
      return;
    } else if (element != null) {
      _infer(element, acceptor, isPreIndexingPhase);
      return;
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(element, acceptor, isPreIndexingPhase).toString());
    }
  }
}
