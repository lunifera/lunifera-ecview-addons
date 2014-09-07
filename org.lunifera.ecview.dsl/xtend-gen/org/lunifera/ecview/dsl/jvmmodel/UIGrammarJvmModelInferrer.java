package org.lunifera.ecview.dsl.jvmmodel;

import com.google.inject.Inject;
import java.util.Arrays;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtend2.lib.StringConcatenationClient;
import org.eclipse.xtext.common.types.JvmFormalParameter;
import org.eclipse.xtext.common.types.JvmGenericType;
import org.eclipse.xtext.common.types.JvmMember;
import org.eclipse.xtext.common.types.JvmOperation;
import org.eclipse.xtext.common.types.JvmTypeReference;
import org.eclipse.xtext.common.types.JvmVisibility;
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
import org.eclipse.xtext.xbase.lib.StringExtensions;
import org.lunifera.ecview.core.common.validation.IStatus;
import org.lunifera.ecview.core.common.validation.IValidator;
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
    String _validatorName = this.getValidatorName(element);
    JvmGenericType _class = this._jvmTypesBuilder.toClass(element, _validatorName);
    IJvmDeclaredTypeAcceptor.IPostIndexingInitializing<JvmGenericType> _accept = acceptor.<JvmGenericType>accept(_class);
    final Procedure1<JvmGenericType> _function = new Procedure1<JvmGenericType>() {
      public void apply(final JvmGenericType it) {
        UIGrammarJvmModelInferrer.this.associator.associatePrimary(element, it);
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
                _builder.append("return ");
                JvmTypeReference _jvmType = element.getJvmType();
                String _simpleName = _jvmType.getSimpleName();
                _builder.append(_simpleName, "");
                _builder.append(".class;");
              }
            };
            UIGrammarJvmModelInferrer.this._jvmTypesBuilder.setBody(it, _client);
          }
        };
        JvmOperation _method_1 = UIGrammarJvmModelInferrer.this._jvmTypesBuilder.toMethod(element, "getType", _newTypeRef_2, _function_1);
        UIGrammarJvmModelInferrer.this._jvmTypesBuilder.<JvmOperation>operator_add(_members_1, _method_1);
        EList<JvmMember> _members_2 = it.getMembers();
        JvmTypeReference _newTypeRef_3 = UIGrammarJvmModelInferrer.this._jvmTypesBuilder.newTypeRef(element, IStatus.class);
        final Procedure1<JvmOperation> _function_2 = new Procedure1<JvmOperation>() {
          public void apply(final JvmOperation it) {
            EList<JvmFormalParameter> _parameters = it.getParameters();
            JvmTypeReference _newTypeRef = UIGrammarJvmModelInferrer.this._jvmTypesBuilder.newTypeRef(element, Object.class);
            JvmFormalParameter _parameter = UIGrammarJvmModelInferrer.this._jvmTypesBuilder.toParameter(element, "param", _newTypeRef);
            UIGrammarJvmModelInferrer.this._jvmTypesBuilder.<JvmFormalParameter>operator_add(_parameters, _parameter);
            StringConcatenationClient _client = new StringConcatenationClient() {
              @Override
              protected void appendTo(StringConcatenationClient.TargetStringConcatenation _builder) {
                _builder.append("IStatus status = doValidateValue((");
                JvmTypeReference _jvmType = element.getJvmType();
                String _simpleName = _jvmType.getSimpleName();
                _builder.append(_simpleName, "");
                _builder.append(") param);");
                _builder.newLineIfNotEmpty();
                _builder.append("if(status == null) {");
                _builder.newLine();
                _builder.append("\t");
                _builder.append("return IStatus.OK;");
                _builder.newLine();
                _builder.append("}");
                _builder.newLine();
                _builder.append("return status;");
                _builder.newLine();
              }
            };
            UIGrammarJvmModelInferrer.this._jvmTypesBuilder.setBody(it, _client);
          }
        };
        JvmOperation _method_2 = UIGrammarJvmModelInferrer.this._jvmTypesBuilder.toMethod(element, "validateValue", _newTypeRef_3, _function_2);
        UIGrammarJvmModelInferrer.this._jvmTypesBuilder.<JvmOperation>operator_add(_members_2, _method_2);
        EList<JvmMember> _members_3 = it.getMembers();
        JvmTypeReference _newTypeRef_4 = UIGrammarJvmModelInferrer.this._jvmTypesBuilder.newTypeRef(element, IStatus.class);
        final Procedure1<JvmOperation> _function_3 = new Procedure1<JvmOperation>() {
          public void apply(final JvmOperation it) {
            it.setVisibility(JvmVisibility.PRIVATE);
            EList<JvmFormalParameter> _parameters = it.getParameters();
            JvmTypeReference _jvmType = element.getJvmType();
            JvmTypeReference _cloneWithProxies = UIGrammarJvmModelInferrer.this._jvmTypesBuilder.cloneWithProxies(_jvmType);
            JvmFormalParameter _parameter = UIGrammarJvmModelInferrer.this._jvmTypesBuilder.toParameter(element, "input", _cloneWithProxies);
            UIGrammarJvmModelInferrer.this._jvmTypesBuilder.<JvmFormalParameter>operator_add(_parameters, _parameter);
            XExpression _expression = element.getExpression();
            UIGrammarJvmModelInferrer.this._jvmTypesBuilder.setBody(it, _expression);
          }
        };
        JvmOperation _method_3 = UIGrammarJvmModelInferrer.this._jvmTypesBuilder.toMethod(element, "doValidateValue", _newTypeRef_4, _function_3);
        UIGrammarJvmModelInferrer.this._jvmTypesBuilder.<JvmOperation>operator_add(_members_3, _method_3);
        EList<JvmMember> _members_4 = it.getMembers();
        JvmTypeReference _newTypeRef_5 = UIGrammarJvmModelInferrer.this._jvmTypesBuilder.newTypeRef(element, IStatus.class);
        final Procedure1<JvmOperation> _function_4 = new Procedure1<JvmOperation>() {
          public void apply(final JvmOperation it) {
            StringConcatenation _builder = new StringConcatenation();
            _builder.append("Returns an IStatus with serverity ERROR.");
            _builder.newLine();
            _builder.newLine();
            _builder.append("@param errorCode - The error code to identify the error");
            _builder.newLine();
            _builder.append("@param message - The error message to display");
            _builder.newLine();
            _builder.append("@return");
            UIGrammarJvmModelInferrer.this._jvmTypesBuilder.setDocumentation(it, _builder.toString());
            it.setVisibility(JvmVisibility.PRIVATE);
            EList<JvmFormalParameter> _parameters = it.getParameters();
            JvmTypeReference _newTypeRef = UIGrammarJvmModelInferrer.this._jvmTypesBuilder.newTypeRef(element, String.class);
            JvmFormalParameter _parameter = UIGrammarJvmModelInferrer.this._jvmTypesBuilder.toParameter(element, "errorCode", _newTypeRef);
            UIGrammarJvmModelInferrer.this._jvmTypesBuilder.<JvmFormalParameter>operator_add(_parameters, _parameter);
            EList<JvmFormalParameter> _parameters_1 = it.getParameters();
            JvmTypeReference _newTypeRef_1 = UIGrammarJvmModelInferrer.this._jvmTypesBuilder.newTypeRef(element, String.class);
            JvmFormalParameter _parameter_1 = UIGrammarJvmModelInferrer.this._jvmTypesBuilder.toParameter(element, "message", _newTypeRef_1);
            UIGrammarJvmModelInferrer.this._jvmTypesBuilder.<JvmFormalParameter>operator_add(_parameters_1, _parameter_1);
            StringConcatenationClient _client = new StringConcatenationClient() {
              @Override
              protected void appendTo(StringConcatenationClient.TargetStringConcatenation _builder) {
                _builder.append("return org.lunifera.ecview.core.common.validation.Status.createStatus(errorCode, getClass(), IStatus.Severity.ERROR, message);");
                _builder.newLine();
              }
            };
            UIGrammarJvmModelInferrer.this._jvmTypesBuilder.setBody(it, _client);
          }
        };
        JvmOperation _method_4 = UIGrammarJvmModelInferrer.this._jvmTypesBuilder.toMethod(element, "error", _newTypeRef_5, _function_4);
        UIGrammarJvmModelInferrer.this._jvmTypesBuilder.<JvmOperation>operator_add(_members_4, _method_4);
        EList<JvmMember> _members_5 = it.getMembers();
        JvmTypeReference _newTypeRef_6 = UIGrammarJvmModelInferrer.this._jvmTypesBuilder.newTypeRef(element, IStatus.class);
        final Procedure1<JvmOperation> _function_5 = new Procedure1<JvmOperation>() {
          public void apply(final JvmOperation it) {
            StringConcatenation _builder = new StringConcatenation();
            _builder.append("Returns an IStatus with serverity WARNING.");
            _builder.newLine();
            _builder.newLine();
            _builder.append("@param errorCode - The error code to identify the error");
            _builder.newLine();
            _builder.append("@param message - The error message to display");
            _builder.newLine();
            _builder.append("@return");
            UIGrammarJvmModelInferrer.this._jvmTypesBuilder.setDocumentation(it, _builder.toString());
            it.setVisibility(JvmVisibility.PRIVATE);
            EList<JvmFormalParameter> _parameters = it.getParameters();
            JvmTypeReference _newTypeRef = UIGrammarJvmModelInferrer.this._jvmTypesBuilder.newTypeRef(element, String.class);
            JvmFormalParameter _parameter = UIGrammarJvmModelInferrer.this._jvmTypesBuilder.toParameter(element, "errorCode", _newTypeRef);
            UIGrammarJvmModelInferrer.this._jvmTypesBuilder.<JvmFormalParameter>operator_add(_parameters, _parameter);
            EList<JvmFormalParameter> _parameters_1 = it.getParameters();
            JvmTypeReference _newTypeRef_1 = UIGrammarJvmModelInferrer.this._jvmTypesBuilder.newTypeRef(element, String.class);
            JvmFormalParameter _parameter_1 = UIGrammarJvmModelInferrer.this._jvmTypesBuilder.toParameter(element, "message", _newTypeRef_1);
            UIGrammarJvmModelInferrer.this._jvmTypesBuilder.<JvmFormalParameter>operator_add(_parameters_1, _parameter_1);
            StringConcatenationClient _client = new StringConcatenationClient() {
              @Override
              protected void appendTo(StringConcatenationClient.TargetStringConcatenation _builder) {
                _builder.append("return org.lunifera.ecview.core.common.validation.Status.createStatus(errorCode, getClass(), IStatus.Severity.WARNING, message);");
                _builder.newLine();
              }
            };
            UIGrammarJvmModelInferrer.this._jvmTypesBuilder.setBody(it, _client);
          }
        };
        JvmOperation _method_5 = UIGrammarJvmModelInferrer.this._jvmTypesBuilder.toMethod(element, "warning", _newTypeRef_6, _function_5);
        UIGrammarJvmModelInferrer.this._jvmTypesBuilder.<JvmOperation>operator_add(_members_5, _method_5);
      }
    };
    _accept.initializeLater(_function);
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
