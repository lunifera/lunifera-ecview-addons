package org.lunifera.ecview.dsl.ui.hover;

import com.google.common.base.Objects;
import com.google.inject.Inject;
import java.util.Arrays;
import java.util.List;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.common.types.JvmType;
import org.eclipse.xtext.common.types.JvmTypeReference;
import org.eclipse.xtext.documentation.IEObjectDocumentationProvider;
import org.eclipse.xtext.naming.IQualifiedNameProvider;
import org.eclipse.xtext.resource.IEObjectDescription;
import org.eclipse.xtext.resource.IResourceDescriptions;
import org.eclipse.xtext.ui.editor.hover.html.XtextElementLinks;
import org.eclipse.xtext.xbase.lib.Extension;
import org.eclipse.xtext.xbase.ui.hover.HoverLinkHelper;
import org.eclipse.xtext.xbase.ui.hover.XbaseDeclarativeHoverSignatureProvider;
import org.eclipse.xtext.xbase.ui.hover.XbaseHoverDocumentationProvider;
import org.lunifera.ecview.dsl.extensions.BindableTypeProvider;
import org.lunifera.ecview.dsl.extensions.I18nKeyProvider;
import org.lunifera.ecview.semantic.uimodel.UiBeanSlot;
import org.lunifera.ecview.semantic.uimodel.UiEmbeddable;
import org.lunifera.ecview.semantic.uimodel.UiErrorCode;
import org.lunifera.ecview.semantic.uimodel.UiI18nInfo;
import org.lunifera.ecview.semantic.uimodel.UiMaxLengthValidator;
import org.lunifera.ecview.semantic.uimodel.UiMinLengthValidator;
import org.lunifera.ecview.semantic.uimodel.UiModel;
import org.lunifera.ecview.semantic.uimodel.UiNamedElement;
import org.lunifera.ecview.semantic.uimodel.UiRegexpValidator;
import org.lunifera.ecview.semantic.uimodel.UiTabAssignment;
import org.lunifera.ecview.semantic.uisemantics.UiSemanticsPackage;
import org.lunifera.ecview.semantic.uisemantics.UxBindingableOption;
import org.lunifera.ecview.semantic.uisemantics.UxElementDefinition;
import org.lunifera.ecview.semantic.uisemantics.UxElementURI;

@SuppressWarnings("all")
public class UiGrammarHoverDocumentationProvider extends XbaseHoverDocumentationProvider {
  @Inject
  private XbaseDeclarativeHoverSignatureProvider hoverSignatureProvider;
  
  @Inject
  private IEObjectDocumentationProvider documentationProvider;
  
  @Inject
  private BindableTypeProvider typeProvider;
  
  @Inject
  private /* II18nRegistry */Object i18nRegistry;
  
  @Inject
  private /* CoreUiUtil */Object util;
  
  @Inject
  private IResourceDescriptions descriptions;
  
  @Inject
  @Extension
  private IQualifiedNameProvider fqnProvider;
  
  @Inject
  @Extension
  private I18nKeyProvider _i18nKeyProvider;
  
  public String computeDocumentation(final EObject object) {
    final String superDocu = super.computeDocumentation(object);
    final String customDocu = this.getCustomDocumentation(object);
    final StringBuilder b = new StringBuilder();
    boolean _notEquals = (!Objects.equal(superDocu, null));
    if (_notEquals) {
      b.append(superDocu);
    }
    boolean _notEquals_1 = (!Objects.equal(customDocu, null));
    if (_notEquals_1) {
      b.append(customDocu);
    }
    return b.toString();
  }
  
  protected String _getCustomDocumentation(final EObject object) {
    return null;
  }
  
  protected String _getCustomDocumentation(final UiEmbeddable object) {
    final StringBuilder sb = new StringBuilder();
    String _computeDocumentation = super.computeDocumentation(object);
    sb.append(_computeDocumentation);
    final String semanticDocu = this.getSemanticElementDocumentation(object);
    boolean _notEquals = (!Objects.equal(semanticDocu, null));
    if (_notEquals) {
      sb.append(semanticDocu);
    }
    final JvmType type = this.typeProvider.getType(object);
    boolean _notEquals_1 = (!Objects.equal(type, null));
    if (_notEquals_1) {
      sb.append("<p>type: ");
      String _computeLinkToElement = this.computeLinkToElement(type);
      sb.append(_computeLinkToElement);
      sb.append("</p>");
    }
    sb.append("<h3>I18n Info</h3>");
    boolean _and = false;
    UiI18nInfo _i18nInfo = object.getI18nInfo();
    boolean _notEquals_2 = (!Objects.equal(_i18nInfo, null));
    if (!_notEquals_2) {
      _and = false;
    } else {
      UiI18nInfo _i18nInfo_1 = object.getI18nInfo();
      String _key = _i18nInfo_1.getKey();
      boolean _isEmpty = _key.isEmpty();
      boolean _not = (!_isEmpty);
      _and = _not;
    }
    if (_and) {
      UiI18nInfo _i18nInfo_2 = object.getI18nInfo();
      String _customDocumentation = this.getCustomDocumentation(_i18nInfo_2);
      sb.append(_customDocumentation);
    } else {
      String _i18nDefaultDocumentation = this.getI18nDefaultDocumentation(object);
      sb.append(_i18nDefaultDocumentation);
    }
    return sb.toString();
  }
  
  protected String _getCustomDocumentation(final UiTabAssignment object) {
    final StringBuilder sb = new StringBuilder();
    String _computeDocumentation = super.computeDocumentation(object);
    sb.append(_computeDocumentation);
    sb.append("<h3>I18n Info</h3>");
    boolean _and = false;
    UiI18nInfo _i18nInfo = object.getI18nInfo();
    boolean _notEquals = (!Objects.equal(_i18nInfo, null));
    if (!_notEquals) {
      _and = false;
    } else {
      UiI18nInfo _i18nInfo_1 = object.getI18nInfo();
      String _key = _i18nInfo_1.getKey();
      boolean _isEmpty = _key.isEmpty();
      boolean _not = (!_isEmpty);
      _and = _not;
    }
    if (_and) {
      UiI18nInfo _i18nInfo_2 = object.getI18nInfo();
      String _customDocumentation = this.getCustomDocumentation(_i18nInfo_2);
      sb.append(_customDocumentation);
    } else {
      String _i18nDefaultDocumentation = this.getI18nDefaultDocumentation(object);
      sb.append(_i18nDefaultDocumentation);
    }
    return sb.toString();
  }
  
  protected String _getCustomDocumentation(final UiErrorCode object) {
    throw new Error("Unresolved compilation problems:"
      + "\nProposal cannot be resolved to a type."
      + "\ngetProject cannot be resolved"
      + "\nfindStrictKeyMatchingProposals cannot be resolved"
      + "\nlocale cannot be resolved");
  }
  
  /**
   * Returns the default i18n docu for an named element.
   */
  public String getI18nDefaultDocumentation(final UiNamedElement model) {
    throw new Error("Unresolved compilation problems:"
      + "\nProposal cannot be resolved to a type."
      + "\ngetProject cannot be resolved"
      + "\nfindStrictKeyMatchingProposals cannot be resolved"
      + "\nlocale cannot be resolved");
  }
  
  protected String _getCustomDocumentation(final UiBeanSlot object) {
    JvmTypeReference _jvmType = object.getJvmType();
    JvmType _type = _jvmType.getType();
    String _computeLinkToElement = this.computeLinkToElement(_type);
    return ("<p><b>provides:</b> " + _computeLinkToElement);
  }
  
  protected String _getCustomDocumentation(final UiMinLengthValidator object) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("<p><b>Template variables for i18n: </b>");
    _builder.newLine();
    _builder.append("\t\t\t\t");
    _builder.append("<ul>");
    _builder.newLine();
    _builder.append("\t\t\t\t\t");
    _builder.append("<li><i>${value}</i> - the input of the validation</li>");
    _builder.newLine();
    _builder.append("\t\t\t\t\t");
    _builder.append("<li><i>${minLength}</i> - the defined min length</li>");
    _builder.newLine();
    _builder.append("\t\t\t\t\t");
    _builder.append("<li><i>${currentLength}</i> - the length of the input value</li>");
    _builder.newLine();
    _builder.append("\t\t\t\t");
    _builder.append("</ul>");
    _builder.newLine();
    _builder.append("\t\t\t\t");
    _builder.append("<br>");
    _builder.newLine();
    _builder.append("\t\t\t\t");
    _builder.append("Example: <i>\"The min length of ${minLength} is not reached by ${value} with a length of ${currentLength}\"</i>");
    _builder.newLine();
    return _builder.toString();
  }
  
  protected String _getCustomDocumentation(final UiMaxLengthValidator object) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("<p><b>Template variables for i18n: </b>");
    _builder.newLine();
    _builder.append("\t\t\t\t");
    _builder.append("<ul>");
    _builder.newLine();
    _builder.append("\t\t\t\t\t");
    _builder.append("<li><i>${value}</i> - the input of the validation</li>");
    _builder.newLine();
    _builder.append("\t\t\t\t\t");
    _builder.append("<li><i>${maxLength}</i> - the defined max length</li>");
    _builder.newLine();
    _builder.append("\t\t\t\t\t");
    _builder.append("<li><i>${currentLength}</i> - the length of the input value</li>");
    _builder.newLine();
    _builder.append("\t\t\t\t");
    _builder.append("</ul>");
    _builder.newLine();
    _builder.append("\t\t\t\t");
    _builder.append("<br>");
    _builder.newLine();
    _builder.append("\t\t\t\t");
    _builder.append("Example: <i>\"The max length of ${maxLength} is exceeded by ${value} with a length of ${currentLength}\"</i>");
    _builder.newLine();
    return _builder.toString();
  }
  
  protected String _getCustomDocumentation(final UiRegexpValidator object) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("<p><b>Template variables for i18n: </b>");
    _builder.newLine();
    _builder.append("\t\t\t\t");
    _builder.append("<ul>");
    _builder.newLine();
    _builder.append("\t\t\t\t\t");
    _builder.append("<li><i>${value}</i> - the input of the validation</li>");
    _builder.newLine();
    _builder.append("\t\t\t\t\t");
    _builder.append("<li><i>${regex}</i> - the defined regular expression</li>");
    _builder.newLine();
    _builder.append("\t\t\t\t");
    _builder.append("</ul>");
    _builder.newLine();
    _builder.append("\t\t\t\t");
    _builder.append("<br>");
    _builder.newLine();
    _builder.append("\t\t\t\t");
    _builder.append("Example: <i>\"The ${value} does not macht the pattern ${regex}\"</i>");
    _builder.newLine();
    return _builder.toString();
  }
  
  protected String _getCustomDocumentation(final UiI18nInfo model) {
    throw new Error("Unresolved compilation problems:"
      + "\nProposal cannot be resolved to a type."
      + "\ngetProject cannot be resolved"
      + "\nfindStrictKeyMatchingProposals cannot be resolved"
      + "\nlocale cannot be resolved");
  }
  
  /**
   * Iterates the containment tree up to the UiModel and returns the package.
   */
  public String findPackage(final EObject model) {
    EObject temp = model;
    boolean _and = false;
    boolean _notEquals = (!Objects.equal(temp, null));
    if (!_notEquals) {
      _and = false;
    } else {
      EObject _eContainer = temp.eContainer();
      boolean _notEquals_1 = (!Objects.equal(_eContainer, null));
      _and = _notEquals_1;
    }
    boolean _while = _and;
    while (_while) {
      {
        if ((temp instanceof UiModel)) {
          final UiModel uiModel = ((UiModel) temp);
          return uiModel.getPackageName();
        }
        EObject _eContainer_1 = temp.eContainer();
        temp = _eContainer_1;
        if ((temp instanceof UiModel)) {
          final UiModel uiModel_1 = ((UiModel) temp);
          return uiModel_1.getPackageName();
        }
      }
      boolean _and_1 = false;
      boolean _notEquals_2 = (!Objects.equal(temp, null));
      if (!_notEquals_2) {
        _and_1 = false;
      } else {
        EObject _eContainer_1 = temp.eContainer();
        boolean _notEquals_3 = (!Objects.equal(_eContainer_1, null));
        _and_1 = _notEquals_3;
      }
      _while = _and_1;
    }
    return "";
  }
  
  public CharSequence getI18nLocaleDocumentation(final /* List<Proposal> */Object proposals) {
    throw new Error("Unresolved compilation problems:"
      + "\nlocale cannot be resolved"
      + "\ntoLanguageTag cannot be resolved"
      + "\ni18nValue cannot be resolved"
      + "\ni18nKey cannot be resolved");
  }
  
  protected String _getCustomDocumentation(final UxBindingableOption object) {
    return this.documentationProvider.getDocumentation(object);
  }
  
  public String computeLinkToElement(final EObject jvmElement) {
    final String imageURL = this.hoverSignatureProvider.getImageTag(jvmElement);
    final String signature = this.hoverSignatureProvider.getDerivedOrSourceSignature(jvmElement);
    URI _uRI = EcoreUtil.getURI(jvmElement);
    String _createLinkWithLabel = HoverLinkHelper.createLinkWithLabel(XtextElementLinks.XTEXTDOC_SCHEME, _uRI, signature);
    return (imageURL + _createLinkWithLabel);
  }
  
  public String getSemanticElementDocumentation(final UiEmbeddable embeddable) {
    Iterable<IEObjectDescription> _exportedObjectsByType = this.descriptions.getExportedObjectsByType(UiSemanticsPackage.Literals.UX_ELEMENT_DEFINITION);
    for (final IEObjectDescription des : _exportedObjectsByType) {
      {
        EObject _eObjectOrProxy = des.getEObjectOrProxy();
        UxElementDefinition element = ((UxElementDefinition) _eObjectOrProxy);
        EObject _resolve = EcoreUtil.resolve(element, embeddable);
        element = ((UxElementDefinition) _resolve);
        UxElementURI _uri = element.getUri();
        EClass _eClass = _uri.getEClass();
        EClass _eClass_1 = embeddable.eClass();
        boolean _isSuperTypeOf = _eClass.isSuperTypeOf(_eClass_1);
        if (_isSuperTypeOf) {
          return this.documentationProvider.getDocumentation(element);
        }
      }
    }
    return null;
  }
  
  public String getCustomDocumentation(final EObject object) {
    if (object instanceof UiMaxLengthValidator) {
      return _getCustomDocumentation((UiMaxLengthValidator)object);
    } else if (object instanceof UiMinLengthValidator) {
      return _getCustomDocumentation((UiMinLengthValidator)object);
    } else if (object instanceof UiRegexpValidator) {
      return _getCustomDocumentation((UiRegexpValidator)object);
    } else if (object instanceof UiBeanSlot) {
      return _getCustomDocumentation((UiBeanSlot)object);
    } else if (object instanceof UiEmbeddable) {
      return _getCustomDocumentation((UiEmbeddable)object);
    } else if (object instanceof UiTabAssignment) {
      return _getCustomDocumentation((UiTabAssignment)object);
    } else if (object instanceof UiErrorCode) {
      return _getCustomDocumentation((UiErrorCode)object);
    } else if (object instanceof UxBindingableOption) {
      return _getCustomDocumentation((UxBindingableOption)object);
    } else if (object instanceof UiI18nInfo) {
      return _getCustomDocumentation((UiI18nInfo)object);
    } else if (object != null) {
      return _getCustomDocumentation(object);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(object).toString());
    }
  }
}
