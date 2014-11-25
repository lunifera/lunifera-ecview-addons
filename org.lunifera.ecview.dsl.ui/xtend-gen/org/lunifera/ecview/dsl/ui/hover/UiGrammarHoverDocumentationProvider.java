package org.lunifera.ecview.dsl.ui.hover;

import com.google.common.base.Objects;
import com.google.inject.Inject;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import org.eclipse.core.resources.IProject;
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
import org.lunifera.ide.core.api.i18n.II18nRegistry;
import org.lunifera.ide.core.ui.util.CoreUiUtil;

@SuppressWarnings("all")
public class UiGrammarHoverDocumentationProvider extends XbaseHoverDocumentationProvider {
  @Inject
  private XbaseDeclarativeHoverSignatureProvider hoverSignatureProvider;
  
  @Inject
  private IEObjectDocumentationProvider documentationProvider;
  
  @Inject
  private BindableTypeProvider typeProvider;
  
  @Inject
  private II18nRegistry i18nRegistry;
  
  @Inject
  private CoreUiUtil util;
  
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
    final StringBuilder sb = new StringBuilder();
    String _computeDocumentation = super.computeDocumentation(object);
    sb.append(_computeDocumentation);
    sb.append("<h3>I18n Info</h3>");
    final String i18nKey = this._i18nKeyProvider.toI18nKey(object);
    sb.append((("Key: " + i18nKey) + "<p>"));
    String packageName = this.findPackage(object);
    IProject javaProject = this.util.getProject(object);
    IProject _project = javaProject.getProject();
    Locale _locale = this.util.getLocale();
    final List<II18nRegistry.Proposal> proposals = this.i18nRegistry.findStrictKeyMatchingProposals(_project, _locale, packageName, i18nKey);
    CharSequence _i18nLocaleDocumentation = this.getI18nLocaleDocumentation(proposals);
    String _string = _i18nLocaleDocumentation.toString();
    sb.append(_string);
    return sb.toString();
  }
  
  /**
   * Returns the default i18n docu for an named element.
   */
  public String getI18nDefaultDocumentation(final UiNamedElement model) {
    IProject javaProject = this.util.getProject(model);
    final String i18nKey = this._i18nKeyProvider.toI18nKey(model);
    String packageName = this.findPackage(model);
    IProject _project = javaProject.getProject();
    Locale _locale = this.util.getLocale();
    final List<II18nRegistry.Proposal> proposals = this.i18nRegistry.findStrictKeyMatchingProposals(_project, _locale, packageName, i18nKey);
    String result = (("Key: " + i18nKey) + "<p>");
    CharSequence _i18nLocaleDocumentation = this.getI18nLocaleDocumentation(proposals);
    String _string = _i18nLocaleDocumentation.toString();
    return (result + _string);
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
    IProject javaProject = this.util.getProject(model);
    String _xifexpression = null;
    String _key = model.getKey();
    boolean _startsWith = _key.startsWith(".");
    if (_startsWith) {
      _xifexpression = this.findPackage(model);
    } else {
      _xifexpression = null;
    }
    String packageName = _xifexpression;
    IProject _project = javaProject.getProject();
    Locale _locale = this.util.getLocale();
    String _key_1 = model.getKey();
    final List<II18nRegistry.Proposal> proposals = this.i18nRegistry.findStrictKeyMatchingProposals(_project, _locale, packageName, _key_1);
    CharSequence _i18nLocaleDocumentation = this.getI18nLocaleDocumentation(proposals);
    return _i18nLocaleDocumentation.toString();
  }
  
  /**
   * Iterates the containment tree up to the UiModel and returns the package.
   */
  public String findPackage(final EObject model) {
    EObject temp = model;
    while (((!Objects.equal(temp, null)) && (!Objects.equal(temp.eContainer(), null)))) {
      {
        if ((temp instanceof UiModel)) {
          final UiModel uiModel = ((UiModel) temp);
          return uiModel.getPackageName();
        }
        EObject _eContainer = temp.eContainer();
        temp = _eContainer;
        if ((temp instanceof UiModel)) {
          final UiModel uiModel_1 = ((UiModel) temp);
          return uiModel_1.getPackageName();
        }
      }
    }
    return "";
  }
  
  public CharSequence getI18nLocaleDocumentation(final List<II18nRegistry.Proposal> proposals) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("<table width=\"100%\">");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("<colgroup>");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("<col width=\"1*\">");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("<col width=\"3*\">");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("<col width=\"6*\">");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("</colgroup>");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("<tr>");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("<th align=\"left\">Locale</th>");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("<th align=\"left\">Value</th>");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("<th align=\"left\">I18n Key</th>");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("</tr>");
    _builder.newLine();
    {
      for(final II18nRegistry.Proposal proposal : proposals) {
        _builder.append("\t");
        _builder.append("<tr>");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("\t");
        _builder.append("<td>");
        Locale _locale = proposal.getLocale();
        String _languageTag = _locale.toLanguageTag();
        _builder.append(_languageTag, "\t\t");
        _builder.append("</td> ");
        _builder.newLineIfNotEmpty();
        _builder.append("\t");
        _builder.append("\t");
        _builder.append("<td>");
        String _i18nValue = proposal.getI18nValue();
        _builder.append(_i18nValue, "\t\t");
        _builder.append("</td>");
        _builder.newLineIfNotEmpty();
        _builder.append("\t");
        _builder.append("\t");
        _builder.append("<td>");
        String _i18nKey = proposal.getI18nKey();
        _builder.append(_i18nKey, "\t\t");
        _builder.append("</td>");
        _builder.newLineIfNotEmpty();
        _builder.append("\t");
        _builder.append("</tr>");
        _builder.newLine();
      }
    }
    _builder.append("</table>");
    _builder.newLine();
    return _builder;
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
