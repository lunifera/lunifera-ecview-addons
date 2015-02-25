package org.lunifera.ecview.dsl.jvmmodel;

import com.google.inject.Inject;
import java.util.Arrays;
import java.util.Locale;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtend2.lib.StringConcatenationClient;
import org.eclipse.xtext.common.types.JvmField;
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
import org.lunifera.ecview.core.common.context.II18nService;
import org.lunifera.ecview.core.common.disposal.AbstractDisposable;
import org.lunifera.ecview.core.common.validation.IStatus;
import org.lunifera.ecview.core.common.validation.IValidator;
import org.lunifera.ecview.core.common.visibility.IVisibilityHandler;
import org.lunifera.ecview.core.common.visibility.IVisibilityManager;
import org.lunifera.ecview.core.common.visibility.IVisibilityProcessor;
import org.lunifera.ecview.dsl.extensions.BindableTypeResolver;
import org.lunifera.ecview.semantic.uimodel.UiBindingEndpointAlias;
import org.lunifera.ecview.semantic.uimodel.UiBindingExpression;
import org.lunifera.ecview.semantic.uimodel.UiChangeTrigger;
import org.lunifera.ecview.semantic.uimodel.UiErrorCode;
import org.lunifera.ecview.semantic.uimodel.UiTypedBindableRawType;
import org.lunifera.ecview.semantic.uimodel.UiTypedBindableRawTypeAlias;
import org.lunifera.ecview.semantic.uimodel.UiVisibilityProcessor;
import org.lunifera.ecview.semantic.uimodel.UiVisibilityRule;
import org.lunifera.ecview.semantic.uimodel.UiXbaseValidator;
import org.lunifera.ecview.semantic.uimodel.UiXbaseVisibilityRule;

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
    String _validatorName = this.getValidatorName(element);
    JvmGenericType _class = this._jvmTypesBuilder.toClass(element, _validatorName);
    IJvmDeclaredTypeAcceptor.IPostIndexingInitializing<JvmGenericType> _accept = acceptor.<JvmGenericType>accept(_class);
    final Procedure1<JvmGenericType> _function = new Procedure1<JvmGenericType>() {
      public void apply(final JvmGenericType it) {
        UIGrammarJvmModelInferrer.this.associator.associatePrimary(element, it);
        EList<JvmTypeReference> _superTypes = it.getSuperTypes();
        JvmTypeReference _newTypeRef = UIGrammarJvmModelInferrer.this._jvmTypesBuilder.newTypeRef(element, AbstractDisposable.class, null);
        UIGrammarJvmModelInferrer.this._jvmTypesBuilder.<JvmTypeReference>operator_add(_superTypes, _newTypeRef);
        EList<JvmTypeReference> _superTypes_1 = it.getSuperTypes();
        JvmTypeReference _newTypeRef_1 = UIGrammarJvmModelInferrer.this._jvmTypesBuilder.newTypeRef(element, IValidator.class, null);
        UIGrammarJvmModelInferrer.this._jvmTypesBuilder.<JvmTypeReference>operator_add(_superTypes_1, _newTypeRef_1);
        EList<JvmMember> _members = it.getMembers();
        JvmTypeReference _newTypeRef_2 = UIGrammarJvmModelInferrer.this._jvmTypesBuilder.newTypeRef(element, II18nService.class);
        JvmField _field = UIGrammarJvmModelInferrer.this._jvmTypesBuilder.toField(element, "i18nService", _newTypeRef_2);
        UIGrammarJvmModelInferrer.this._jvmTypesBuilder.<JvmField>operator_add(_members, _field);
        EList<JvmMember> _members_1 = it.getMembers();
        JvmTypeReference _newTypeRef_3 = UIGrammarJvmModelInferrer.this._jvmTypesBuilder.newTypeRef(element, Locale.class);
        JvmField _field_1 = UIGrammarJvmModelInferrer.this._jvmTypesBuilder.toField(element, "locale", _newTypeRef_3);
        UIGrammarJvmModelInferrer.this._jvmTypesBuilder.<JvmField>operator_add(_members_1, _field_1);
        EList<JvmMember> _members_2 = it.getMembers();
        JvmTypeReference _newTypeRef_4 = UIGrammarJvmModelInferrer.this._jvmTypesBuilder.newTypeRef(element, Void.TYPE);
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
        JvmOperation _method = UIGrammarJvmModelInferrer.this._jvmTypesBuilder.toMethod(element, "updateParameter", _newTypeRef_4, _function);
        UIGrammarJvmModelInferrer.this._jvmTypesBuilder.<JvmOperation>operator_add(_members_2, _method);
        EList<JvmMember> _members_3 = it.getMembers();
        JvmTypeReference _newTypeRef_5 = UIGrammarJvmModelInferrer.this._jvmTypesBuilder.newTypeRef(element, Class.class);
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
        JvmOperation _method_1 = UIGrammarJvmModelInferrer.this._jvmTypesBuilder.toMethod(element, "getType", _newTypeRef_5, _function_1);
        UIGrammarJvmModelInferrer.this._jvmTypesBuilder.<JvmOperation>operator_add(_members_3, _method_1);
        EList<JvmMember> _members_4 = it.getMembers();
        JvmTypeReference _newTypeRef_6 = UIGrammarJvmModelInferrer.this._jvmTypesBuilder.newTypeRef(element, II18nService.class);
        JvmOperation _setter = UIGrammarJvmModelInferrer.this._jvmTypesBuilder.toSetter(element, "i18nService", _newTypeRef_6);
        UIGrammarJvmModelInferrer.this._jvmTypesBuilder.<JvmOperation>operator_add(_members_4, _setter);
        EList<JvmMember> _members_5 = it.getMembers();
        JvmTypeReference _newTypeRef_7 = UIGrammarJvmModelInferrer.this._jvmTypesBuilder.newTypeRef(element, Locale.class);
        JvmOperation _setter_1 = UIGrammarJvmModelInferrer.this._jvmTypesBuilder.toSetter(element, "locale", _newTypeRef_7);
        UIGrammarJvmModelInferrer.this._jvmTypesBuilder.<JvmOperation>operator_add(_members_5, _setter_1);
        EList<UiErrorCode> _errorCodes = element.getErrorCodes();
        for (final UiErrorCode errorCode : _errorCodes) {
          EList<JvmMember> _members_6 = it.getMembers();
          String _name = errorCode.getName();
          String _firstUpper = null;
          if (_name!=null) {
            _firstUpper=StringExtensions.toFirstUpper(_name);
          }
          String _plus = ("get" + _firstUpper);
          JvmTypeReference _newTypeRef_8 = UIGrammarJvmModelInferrer.this._jvmTypesBuilder.newTypeRef(element, String.class);
          final Procedure1<JvmOperation> _function_2 = new Procedure1<JvmOperation>() {
            public void apply(final JvmOperation it) {
              it.setVisibility(JvmVisibility.PRIVATE);
              StringConcatenationClient _client = new StringConcatenationClient() {
                @Override
                protected void appendTo(StringConcatenationClient.TargetStringConcatenation _builder) {
                  _builder.append("String result = i18nService.getValue(\"");
                  QualifiedName _fullyQualifiedName = UIGrammarJvmModelInferrer.this._iQualifiedNameProvider.getFullyQualifiedName(errorCode);
                  String _string = _fullyQualifiedName.toString();
                  _builder.append(_string, "");
                  _builder.append("\", locale);");
                  _builder.newLineIfNotEmpty();
                  _builder.append("if(result == null || result.equals(\"\")) {");
                  _builder.newLine();
                  _builder.append("\t");
                  _builder.append("result = \"");
                  String _defaultMessage = errorCode.getDefaultMessage();
                  _builder.append(_defaultMessage, "\t");
                  _builder.append("\";");
                  _builder.newLineIfNotEmpty();
                  _builder.append("}");
                  _builder.newLine();
                  _builder.append("return result;");
                  _builder.newLine();
                }
              };
              UIGrammarJvmModelInferrer.this._jvmTypesBuilder.setBody(it, _client);
            }
          };
          JvmOperation _method_2 = UIGrammarJvmModelInferrer.this._jvmTypesBuilder.toMethod(element, _plus, _newTypeRef_8, _function_2);
          UIGrammarJvmModelInferrer.this._jvmTypesBuilder.<JvmOperation>operator_add(_members_6, _method_2);
        }
        EList<JvmMember> _members_7 = it.getMembers();
        JvmTypeReference _newTypeRef_9 = UIGrammarJvmModelInferrer.this._jvmTypesBuilder.newTypeRef(element, IStatus.class);
        final Procedure1<JvmOperation> _function_3 = new Procedure1<JvmOperation>() {
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
        JvmOperation _method_3 = UIGrammarJvmModelInferrer.this._jvmTypesBuilder.toMethod(element, "validateValue", _newTypeRef_9, _function_3);
        UIGrammarJvmModelInferrer.this._jvmTypesBuilder.<JvmOperation>operator_add(_members_7, _method_3);
        EList<JvmMember> _members_8 = it.getMembers();
        JvmTypeReference _newTypeRef_10 = UIGrammarJvmModelInferrer.this._jvmTypesBuilder.newTypeRef(element, IStatus.class);
        final Procedure1<JvmOperation> _function_4 = new Procedure1<JvmOperation>() {
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
        JvmOperation _method_4 = UIGrammarJvmModelInferrer.this._jvmTypesBuilder.toMethod(element, "doValidateValue", _newTypeRef_10, _function_4);
        UIGrammarJvmModelInferrer.this._jvmTypesBuilder.<JvmOperation>operator_add(_members_8, _method_4);
        EList<JvmMember> _members_9 = it.getMembers();
        JvmTypeReference _newTypeRef_11 = UIGrammarJvmModelInferrer.this._jvmTypesBuilder.newTypeRef(element, IStatus.class);
        final Procedure1<JvmOperation> _function_5 = new Procedure1<JvmOperation>() {
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
        JvmOperation _method_5 = UIGrammarJvmModelInferrer.this._jvmTypesBuilder.toMethod(element, "error", _newTypeRef_11, _function_5);
        UIGrammarJvmModelInferrer.this._jvmTypesBuilder.<JvmOperation>operator_add(_members_9, _method_5);
        EList<JvmMember> _members_10 = it.getMembers();
        JvmTypeReference _newTypeRef_12 = UIGrammarJvmModelInferrer.this._jvmTypesBuilder.newTypeRef(element, IStatus.class);
        final Procedure1<JvmOperation> _function_6 = new Procedure1<JvmOperation>() {
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
        JvmOperation _method_6 = UIGrammarJvmModelInferrer.this._jvmTypesBuilder.toMethod(element, "warning", _newTypeRef_12, _function_6);
        UIGrammarJvmModelInferrer.this._jvmTypesBuilder.<JvmOperation>operator_add(_members_10, _method_6);
        EList<JvmMember> _members_11 = it.getMembers();
        JvmTypeReference _newTypeRef_13 = UIGrammarJvmModelInferrer.this._jvmTypesBuilder.newTypeRef(element, Void.TYPE);
        final Procedure1<JvmOperation> _function_7 = new Procedure1<JvmOperation>() {
          public void apply(final JvmOperation it) {
            it.setVisibility(JvmVisibility.PROTECTED);
            StringConcatenationClient _client = new StringConcatenationClient() {
              @Override
              protected void appendTo(StringConcatenationClient.TargetStringConcatenation _builder) {
              }
            };
            UIGrammarJvmModelInferrer.this._jvmTypesBuilder.setBody(it, _client);
          }
        };
        JvmOperation _method_7 = UIGrammarJvmModelInferrer.this._jvmTypesBuilder.toMethod(element, "internalDispose", _newTypeRef_13, _function_7);
        UIGrammarJvmModelInferrer.this._jvmTypesBuilder.<JvmOperation>operator_add(_members_11, _method_7);
      }
    };
    _accept.initializeLater(_function);
  }
  
  protected void _infer(final UiVisibilityProcessor element, final IJvmDeclaredTypeAcceptor acceptor, final boolean isPreIndexingPhase) {
    String _processorName = this.getProcessorName(element);
    JvmGenericType _class = this._jvmTypesBuilder.toClass(element, _processorName);
    IJvmDeclaredTypeAcceptor.IPostIndexingInitializing<JvmGenericType> _accept = acceptor.<JvmGenericType>accept(_class);
    final Procedure1<JvmGenericType> _function = new Procedure1<JvmGenericType>() {
      public void apply(final JvmGenericType it) {
        UIGrammarJvmModelInferrer.this.associator.associatePrimary(element, it);
        EList<JvmTypeReference> _superTypes = it.getSuperTypes();
        JvmTypeReference _newTypeRef = UIGrammarJvmModelInferrer.this._jvmTypesBuilder.newTypeRef(element, IVisibilityProcessor.class, null);
        UIGrammarJvmModelInferrer.this._jvmTypesBuilder.<JvmTypeReference>operator_add(_superTypes, _newTypeRef);
        EList<UiBindingExpression> _importedElements = element.getImportedElements();
        for (final UiBindingExpression uiInclude : _importedElements) {
          {
            final UiTypedBindableRawTypeAlias temp = ((UiTypedBindableRawTypeAlias) uiInclude);
            EList<JvmMember> _members = it.getMembers();
            String _alias = temp.getAlias();
            JvmTypeReference _newTypeRef_1 = UIGrammarJvmModelInferrer.this._jvmTypesBuilder.newTypeRef(element, IVisibilityHandler.class);
            JvmField _field = UIGrammarJvmModelInferrer.this._jvmTypesBuilder.toField(uiInclude, _alias, _newTypeRef_1);
            UIGrammarJvmModelInferrer.this._jvmTypesBuilder.<JvmField>operator_add(_members, _field);
          }
        }
        EList<UiBindingEndpointAlias> _dataUsed = element.getDataUsed();
        for (final UiBindingEndpointAlias dataUsed : _dataUsed) {
          {
            final UiBindingEndpointAlias temp = ((UiBindingEndpointAlias) dataUsed);
            EList<JvmMember> _members = it.getMembers();
            String _alias = temp.getAlias();
            JvmTypeReference _resolveTypeReference = UIGrammarJvmModelInferrer.this.typeResolver.resolveTypeReference(temp);
            JvmField _field = UIGrammarJvmModelInferrer.this._jvmTypesBuilder.toField(dataUsed, _alias, _resolveTypeReference);
            UIGrammarJvmModelInferrer.this._jvmTypesBuilder.<JvmField>operator_add(_members, _field);
          }
        }
        EList<UiChangeTrigger> _changeTriggers = element.getChangeTriggers();
        for (final UiChangeTrigger dataUsed_1 : _changeTriggers) {
          {
            final UiChangeTrigger temp = ((UiChangeTrigger) dataUsed_1);
            EList<JvmMember> _members = it.getMembers();
            String _alias = temp.getAlias();
            UiBindingExpression _endpoint = temp.getEndpoint();
            JvmTypeReference _resolveTypeReference = UIGrammarJvmModelInferrer.this.typeResolver.resolveTypeReference(_endpoint);
            JvmField _field = UIGrammarJvmModelInferrer.this._jvmTypesBuilder.toField(dataUsed_1, _alias, _resolveTypeReference);
            UIGrammarJvmModelInferrer.this._jvmTypesBuilder.<JvmField>operator_add(_members, _field);
          }
        }
        EList<JvmMember> _members = it.getMembers();
        JvmTypeReference _newTypeRef_1 = UIGrammarJvmModelInferrer.this._jvmTypesBuilder.newTypeRef(element, Void.TYPE);
        final Procedure1<JvmOperation> _function = new Procedure1<JvmOperation>() {
          public void apply(final JvmOperation it) {
            EList<JvmFormalParameter> _parameters = it.getParameters();
            JvmTypeReference _newTypeRef = UIGrammarJvmModelInferrer.this._jvmTypesBuilder.newTypeRef(element, IVisibilityManager.class);
            JvmFormalParameter _parameter = UIGrammarJvmModelInferrer.this._jvmTypesBuilder.toParameter(element, "manager", _newTypeRef);
            UIGrammarJvmModelInferrer.this._jvmTypesBuilder.<JvmFormalParameter>operator_add(_parameters, _parameter);
            StringConcatenationClient _client = new StringConcatenationClient() {
              @Override
              protected void appendTo(StringConcatenationClient.TargetStringConcatenation _builder) {
                {
                  EList<UiBindingExpression> _importedElements = element.getImportedElements();
                  for(final UiBindingExpression uiInclude : _importedElements) {
                    final UiTypedBindableRawTypeAlias temp = ((UiTypedBindableRawTypeAlias) uiInclude);
                    _builder.newLineIfNotEmpty();
                    String _alias = temp.getAlias();
                    _builder.append(_alias, "");
                    _builder.append(" = manager.getById(\"");
                    String _pathString = UIGrammarJvmModelInferrer.this.toPathString(temp);
                    _builder.append(_pathString, "");
                    _builder.append("\");");
                    _builder.newLineIfNotEmpty();
                  }
                }
              }
            };
            UIGrammarJvmModelInferrer.this._jvmTypesBuilder.setBody(it, _client);
          }
        };
        JvmOperation _method = UIGrammarJvmModelInferrer.this._jvmTypesBuilder.toMethod(element, "init", _newTypeRef_1, _function);
        UIGrammarJvmModelInferrer.this._jvmTypesBuilder.<JvmOperation>operator_add(_members, _method);
        EList<JvmMember> _members_1 = it.getMembers();
        JvmTypeReference _newTypeRef_2 = UIGrammarJvmModelInferrer.this._jvmTypesBuilder.newTypeRef(element, Void.TYPE);
        final Procedure1<JvmOperation> _function_1 = new Procedure1<JvmOperation>() {
          public void apply(final JvmOperation it) {
            StringConcatenationClient _client = new StringConcatenationClient() {
              @Override
              protected void appendTo(StringConcatenationClient.TargetStringConcatenation _builder) {
                _builder.append("doFire();");
                _builder.newLine();
                _builder.newLine();
                {
                  EList<UiBindingExpression> _importedElements = element.getImportedElements();
                  for(final UiBindingExpression uiInclude : _importedElements) {
                    final UiTypedBindableRawTypeAlias temp = ((UiTypedBindableRawTypeAlias) uiInclude);
                    _builder.newLineIfNotEmpty();
                    String _alias = temp.getAlias();
                    _builder.append(_alias, "");
                    _builder.append(".apply();");
                    _builder.newLineIfNotEmpty();
                  }
                }
              }
            };
            UIGrammarJvmModelInferrer.this._jvmTypesBuilder.setBody(it, _client);
          }
        };
        JvmOperation _method_1 = UIGrammarJvmModelInferrer.this._jvmTypesBuilder.toMethod(element, "fire", _newTypeRef_2, _function_1);
        UIGrammarJvmModelInferrer.this._jvmTypesBuilder.<JvmOperation>operator_add(_members_1, _method_1);
        EList<JvmMember> _members_2 = it.getMembers();
        JvmTypeReference _newTypeRef_3 = UIGrammarJvmModelInferrer.this._jvmTypesBuilder.newTypeRef(element, Void.TYPE);
        final Procedure1<JvmOperation> _function_2 = new Procedure1<JvmOperation>() {
          public void apply(final JvmOperation it) {
            UiVisibilityRule _rule = element.getRule();
            final UiXbaseVisibilityRule rule = ((UiXbaseVisibilityRule) _rule);
            XExpression _expression = rule.getExpression();
            UIGrammarJvmModelInferrer.this._jvmTypesBuilder.setBody(it, _expression);
          }
        };
        JvmOperation _method_2 = UIGrammarJvmModelInferrer.this._jvmTypesBuilder.toMethod(element, "doFire", _newTypeRef_3, _function_2);
        UIGrammarJvmModelInferrer.this._jvmTypesBuilder.<JvmOperation>operator_add(_members_2, _method_2);
        EList<UiBindingEndpointAlias> _dataUsed_1 = element.getDataUsed();
        for (final UiBindingEndpointAlias dataUsed_2 : _dataUsed_1) {
          {
            final UiBindingEndpointAlias temp = ((UiBindingEndpointAlias) dataUsed_2);
            EList<JvmMember> _members_3 = it.getMembers();
            String _alias = temp.getAlias();
            JvmTypeReference _resolveTypeReference = UIGrammarJvmModelInferrer.this.typeResolver.resolveTypeReference(temp);
            JvmOperation _getter = UIGrammarJvmModelInferrer.this._jvmTypesBuilder.toGetter(dataUsed_2, _alias, _resolveTypeReference);
            UIGrammarJvmModelInferrer.this._jvmTypesBuilder.<JvmOperation>operator_add(_members_3, _getter);
            EList<JvmMember> _members_4 = it.getMembers();
            String _alias_1 = temp.getAlias();
            JvmTypeReference _resolveTypeReference_1 = UIGrammarJvmModelInferrer.this.typeResolver.resolveTypeReference(temp);
            JvmOperation _setter = UIGrammarJvmModelInferrer.this._jvmTypesBuilder.toSetter(dataUsed_2, _alias_1, _resolveTypeReference_1);
            UIGrammarJvmModelInferrer.this._jvmTypesBuilder.<JvmOperation>operator_add(_members_4, _setter);
          }
        }
        EList<UiChangeTrigger> _changeTriggers_1 = element.getChangeTriggers();
        for (final UiChangeTrigger changeTrigger : _changeTriggers_1) {
          {
            final UiChangeTrigger temp = ((UiChangeTrigger) changeTrigger);
            EList<JvmMember> _members_3 = it.getMembers();
            String _alias = temp.getAlias();
            UiBindingExpression _endpoint = temp.getEndpoint();
            JvmTypeReference _resolveTypeReference = UIGrammarJvmModelInferrer.this.typeResolver.resolveTypeReference(_endpoint);
            JvmOperation _getter = UIGrammarJvmModelInferrer.this._jvmTypesBuilder.toGetter(changeTrigger, _alias, _resolveTypeReference);
            UIGrammarJvmModelInferrer.this._jvmTypesBuilder.<JvmOperation>operator_add(_members_3, _getter);
            EList<JvmMember> _members_4 = it.getMembers();
            String _alias_1 = temp.getAlias();
            JvmTypeReference _newTypeRef_4 = UIGrammarJvmModelInferrer.this._jvmTypesBuilder.newTypeRef(element, Void.TYPE);
            final Procedure1<JvmOperation> _function_3 = new Procedure1<JvmOperation>() {
              public void apply(final JvmOperation it) {
                it.setVisibility(JvmVisibility.PUBLIC);
                String _alias = temp.getAlias();
                String _firstUpper = null;
                if (_alias!=null) {
                  _firstUpper=StringExtensions.toFirstUpper(_alias);
                }
                String _plus = ("set" + _firstUpper);
                it.setSimpleName(_plus);
                EList<JvmFormalParameter> _parameters = it.getParameters();
                String _alias_1 = temp.getAlias();
                UiBindingExpression _endpoint = temp.getEndpoint();
                JvmTypeReference _resolveTypeReference = UIGrammarJvmModelInferrer.this.typeResolver.resolveTypeReference(_endpoint);
                JvmFormalParameter _parameter = UIGrammarJvmModelInferrer.this._jvmTypesBuilder.toParameter(element, _alias_1, _resolveTypeReference);
                UIGrammarJvmModelInferrer.this._jvmTypesBuilder.<JvmFormalParameter>operator_add(_parameters, _parameter);
                StringConcatenationClient _client = new StringConcatenationClient() {
                  @Override
                  protected void appendTo(StringConcatenationClient.TargetStringConcatenation _builder) {
                    _builder.append("this.");
                    String _alias = temp.getAlias();
                    _builder.append(_alias, "");
                    _builder.append("=");
                    String _alias_1 = temp.getAlias();
                    _builder.append(_alias_1, "");
                    _builder.append(";");
                    _builder.newLineIfNotEmpty();
                    _builder.newLine();
                    _builder.append("fire();");
                    _builder.newLine();
                  }
                };
                UIGrammarJvmModelInferrer.this._jvmTypesBuilder.setBody(it, _client);
              }
            };
            JvmOperation _method_3 = UIGrammarJvmModelInferrer.this._jvmTypesBuilder.toMethod(changeTrigger, _alias_1, _newTypeRef_4, _function_3);
            UIGrammarJvmModelInferrer.this._jvmTypesBuilder.<JvmOperation>operator_add(_members_4, _method_3);
          }
        }
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
