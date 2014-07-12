package org.lunifera.ecview.dsl.jvmmodel;

import com.google.inject.Inject;
import java.util.Arrays;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecp.ecview.common.validation.IStatus;
import org.eclipse.emf.ecp.ecview.common.validation.IValidator;
import org.eclipse.xtend2.lib.StringConcatenationClient;
import org.eclipse.xtext.common.types.JvmFormalParameter;
import org.eclipse.xtext.common.types.JvmGenericType;
import org.eclipse.xtext.common.types.JvmMember;
import org.eclipse.xtext.common.types.JvmOperation;
import org.eclipse.xtext.common.types.JvmTypeReference;
import org.eclipse.xtext.common.types.util.TypeReferences;
import org.eclipse.xtext.naming.IQualifiedNameProvider;
import org.eclipse.xtext.naming.QualifiedName;
import org.eclipse.xtext.xbase.XExpression;
import org.eclipse.xtext.xbase.jvmmodel.AbstractModelInferrer;
import org.eclipse.xtext.xbase.jvmmodel.IJvmDeclaredTypeAcceptor;
import org.eclipse.xtext.xbase.jvmmodel.IJvmModelAssociator;
import org.eclipse.xtext.xbase.jvmmodel.JvmTypesBuilder;
import org.eclipse.xtext.xbase.lib.Extension;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;
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
  
  protected void _infer(final UiXbaseValidator element, final IJvmDeclaredTypeAcceptor acceptor, final boolean isPreIndexingPhase) {
    QualifiedName _fullyQualifiedName = this._iQualifiedNameProvider.getFullyQualifiedName(element);
    String _string = _fullyQualifiedName.toString();
    String _plus = (_string + "Validator");
    JvmGenericType _class = this._jvmTypesBuilder.toClass(element, _plus);
    IJvmDeclaredTypeAcceptor.IPostIndexingInitializing<JvmGenericType> _accept = acceptor.<JvmGenericType>accept(_class);
    final Procedure1<JvmGenericType> _function = new Procedure1<JvmGenericType>() {
      public void apply(final JvmGenericType it) {
        EList<JvmTypeReference> _superTypes = it.getSuperTypes();
        JvmTypeReference _newTypeRef = UIGrammarJvmModelInferrer.this._jvmTypesBuilder.newTypeRef(element, IValidator.class, null);
        UIGrammarJvmModelInferrer.this._jvmTypesBuilder.<JvmTypeReference>operator_add(_superTypes, _newTypeRef);
        EList<JvmMember> _members = it.getMembers();
        JvmTypeReference _newTypeRef_1 = UIGrammarJvmModelInferrer.this._jvmTypesBuilder.newTypeRef(element, Void.TYPE);
        final Procedure1<JvmOperation> _function = new Procedure1<JvmOperation>() {
          public void apply(final JvmOperation it) {
            EList<JvmFormalParameter> _parameters = it.getParameters();
            JvmTypeReference _newTypeRef = UIGrammarJvmModelInferrer.this._jvmTypesBuilder.newTypeRef(element, Object.class);
            JvmFormalParameter _parameter = UIGrammarJvmModelInferrer.this._jvmTypesBuilder.toParameter(element, "param", _newTypeRef);
            UIGrammarJvmModelInferrer.this._jvmTypesBuilder.<JvmFormalParameter>operator_add(_parameters, _parameter);
            StringConcatenationClient _client = new StringConcatenationClient() {
              @Override
              protected void appendTo(StringConcatenationClient.TargetStringConcatenation _builder) {
                _builder.append("// Nothing to do here");
              }
            };
            UIGrammarJvmModelInferrer.this._jvmTypesBuilder.setBody(it, _client);
          }
        };
        JvmOperation _method = UIGrammarJvmModelInferrer.this._jvmTypesBuilder.toMethod(element, "updateParameter", _newTypeRef_1, _function);
        UIGrammarJvmModelInferrer.this._jvmTypesBuilder.<JvmOperation>operator_add(_members, _method);
        EList<JvmMember> _members_1 = it.getMembers();
        JvmTypeReference _newTypeRef_2 = UIGrammarJvmModelInferrer.this._jvmTypesBuilder.newTypeRef(element, Class.class);
        final Procedure1<JvmOperation> _function_1 = new Procedure1<JvmOperation>() {
          public void apply(final JvmOperation it) {
            StringConcatenationClient _client = new StringConcatenationClient() {
              @Override
              protected void appendTo(StringConcatenationClient.TargetStringConcatenation _builder) {
                _builder.append("return Class.class;");
              }
            };
            UIGrammarJvmModelInferrer.this._jvmTypesBuilder.setBody(it, _client);
          }
        };
        JvmOperation _method_1 = UIGrammarJvmModelInferrer.this._jvmTypesBuilder.toMethod(element, "getType", _newTypeRef_2, _function_1);
        UIGrammarJvmModelInferrer.this._jvmTypesBuilder.<JvmOperation>operator_add(_members_1, _method_1);
        JvmTypeReference _newTypeRef_3 = UIGrammarJvmModelInferrer.this._jvmTypesBuilder.newTypeRef(element, IStatus.class);
        final Procedure1<JvmOperation> _function_2 = new Procedure1<JvmOperation>() {
          public void apply(final JvmOperation it) {
            EList<JvmFormalParameter> _parameters = it.getParameters();
            JvmTypeReference _newTypeRef = UIGrammarJvmModelInferrer.this._jvmTypesBuilder.newTypeRef(element, Object.class);
            JvmFormalParameter _parameter = UIGrammarJvmModelInferrer.this._jvmTypesBuilder.toParameter(element, "param", _newTypeRef);
            UIGrammarJvmModelInferrer.this._jvmTypesBuilder.<JvmFormalParameter>operator_add(_parameters, _parameter);
            XExpression _expression = element.getExpression();
            UIGrammarJvmModelInferrer.this._jvmTypesBuilder.setBody(it, _expression);
          }
        };
        final JvmOperation implMethod = UIGrammarJvmModelInferrer.this._jvmTypesBuilder.toMethod(element, "validateValue", _newTypeRef_3, _function_2);
        EList<JvmMember> _members_2 = it.getMembers();
        UIGrammarJvmModelInferrer.this._jvmTypesBuilder.<JvmOperation>operator_add(_members_2, implMethod);
        UIGrammarJvmModelInferrer.this.associator.associatePrimary(element, implMethod);
      }
    };
    _accept.initializeLater(_function);
  }
  
  public void infer(final EObject element, final IJvmDeclaredTypeAcceptor acceptor, final boolean isPreIndexingPhase) {
    if (element instanceof UiXbaseValidator) {
      _infer((UiXbaseValidator)element, acceptor, isPreIndexingPhase);
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
