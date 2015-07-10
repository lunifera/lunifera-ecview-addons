/**
 * Copyright (c) 2011 - 2015, Lunifera GmbH (Gross Enzersdorf), Loetz KG (Heidelberg)
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *         Florian Pirchner - Initial implementation
 */
package org.lunifera.ecview.uisemantics.services;

import com.google.inject.Singleton;
import com.google.inject.Inject;

import java.util.List;

import org.eclipse.xtext.*;
import org.eclipse.xtext.service.GrammarProvider;
import org.eclipse.xtext.service.AbstractElementFinder.*;

import org.eclipse.xtext.xbase.services.XbaseGrammarAccess;
import org.eclipse.xtext.xbase.services.XtypeGrammarAccess;

@Singleton
public class UISemanticsGrammarGrammarAccess extends AbstractGrammarElementFinder {
	
	
	public class UxModelElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "UxModel");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cUxModelAction_0 = (Action)cGroup.eContents().get(0);
		private final Assignment cImportSectionAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cImportSectionXImportSectionParserRuleCall_1_0 = (RuleCall)cImportSectionAssignment_1.eContents().get(0);
		private final Group cGroup_2 = (Group)cGroup.eContents().get(2);
		private final Keyword cActionsKeyword_2_0 = (Keyword)cGroup_2.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_2_1 = (Keyword)cGroup_2.eContents().get(1);
		private final Assignment cViewActionsAssignment_2_2 = (Assignment)cGroup_2.eContents().get(2);
		private final RuleCall cViewActionsUxActionParserRuleCall_2_2_0 = (RuleCall)cViewActionsAssignment_2_2.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_2_3 = (Keyword)cGroup_2.eContents().get(3);
		private final Group cGroup_3 = (Group)cGroup.eContents().get(3);
		private final Keyword cCategoriesKeyword_3_0 = (Keyword)cGroup_3.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_3_1 = (Keyword)cGroup_3.eContents().get(1);
		private final Assignment cCategoriesAssignment_3_2 = (Assignment)cGroup_3.eContents().get(2);
		private final RuleCall cCategoriesUxViewCategoryParserRuleCall_3_2_0 = (RuleCall)cCategoriesAssignment_3_2.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_3_3 = (Keyword)cGroup_3.eContents().get(3);
		private final Assignment cElementDefinitionsAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final RuleCall cElementDefinitionsUxElementDefinitionParserRuleCall_4_0 = (RuleCall)cElementDefinitionsAssignment_4.eContents().get(0);
		
		//UxModel returns semantic::UxModel:
		//	{semantic::UxModel} importSection=XImportSection? ("actions" "{" viewActions+=UxAction* "}")? ("categories" "{"
		//	categories+=UxViewCategory* "}")? elementDefinitions+=UxElementDefinition*;
		public ParserRule getRule() { return rule; }

		//{semantic::UxModel} importSection=XImportSection? ("actions" "{" viewActions+=UxAction* "}")? ("categories" "{"
		//categories+=UxViewCategory* "}")? elementDefinitions+=UxElementDefinition*
		public Group getGroup() { return cGroup; }

		//{semantic::UxModel}
		public Action getUxModelAction_0() { return cUxModelAction_0; }

		//importSection=XImportSection?
		public Assignment getImportSectionAssignment_1() { return cImportSectionAssignment_1; }

		//XImportSection
		public RuleCall getImportSectionXImportSectionParserRuleCall_1_0() { return cImportSectionXImportSectionParserRuleCall_1_0; }

		//("actions" "{" viewActions+=UxAction* "}")?
		public Group getGroup_2() { return cGroup_2; }

		//"actions"
		public Keyword getActionsKeyword_2_0() { return cActionsKeyword_2_0; }

		//"{"
		public Keyword getLeftCurlyBracketKeyword_2_1() { return cLeftCurlyBracketKeyword_2_1; }

		//viewActions+=UxAction*
		public Assignment getViewActionsAssignment_2_2() { return cViewActionsAssignment_2_2; }

		//UxAction
		public RuleCall getViewActionsUxActionParserRuleCall_2_2_0() { return cViewActionsUxActionParserRuleCall_2_2_0; }

		//"}"
		public Keyword getRightCurlyBracketKeyword_2_3() { return cRightCurlyBracketKeyword_2_3; }

		//("categories" "{" categories+=UxViewCategory* "}")?
		public Group getGroup_3() { return cGroup_3; }

		//"categories"
		public Keyword getCategoriesKeyword_3_0() { return cCategoriesKeyword_3_0; }

		//"{"
		public Keyword getLeftCurlyBracketKeyword_3_1() { return cLeftCurlyBracketKeyword_3_1; }

		//categories+=UxViewCategory*
		public Assignment getCategoriesAssignment_3_2() { return cCategoriesAssignment_3_2; }

		//UxViewCategory
		public RuleCall getCategoriesUxViewCategoryParserRuleCall_3_2_0() { return cCategoriesUxViewCategoryParserRuleCall_3_2_0; }

		//"}"
		public Keyword getRightCurlyBracketKeyword_3_3() { return cRightCurlyBracketKeyword_3_3; }

		//elementDefinitions+=UxElementDefinition*
		public Assignment getElementDefinitionsAssignment_4() { return cElementDefinitionsAssignment_4; }

		//UxElementDefinition
		public RuleCall getElementDefinitionsUxElementDefinitionParserRuleCall_4_0() { return cElementDefinitionsUxElementDefinitionParserRuleCall_4_0; }
	}

	public class UxActionElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "UxAction");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cNameAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final RuleCall cNameQualifiedNameParserRuleCall_0_0 = (RuleCall)cNameAssignment_0.eContents().get(0);
		private final Group cGroup_1 = (Group)cGroup.eContents().get(1);
		private final Keyword cExternalCommandKeyword_1_0 = (Keyword)cGroup_1.eContents().get(0);
		private final Assignment cExternalCommandIdAssignment_1_1 = (Assignment)cGroup_1.eContents().get(1);
		private final RuleCall cExternalCommandIdSTRINGTerminalRuleCall_1_1_0 = (RuleCall)cExternalCommandIdAssignment_1_1.eContents().get(0);
		private final Assignment cInitialDisabledAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final Keyword cInitialDisabledDisabledKeyword_2_0 = (Keyword)cInitialDisabledAssignment_2.eContents().get(0);
		
		//UxAction returns semantic::UxAction:
		//	name=QualifiedName ("externalCommand" externalCommandId=STRING)? initialDisabled?="disabled"?;
		public ParserRule getRule() { return rule; }

		//name=QualifiedName ("externalCommand" externalCommandId=STRING)? initialDisabled?="disabled"?
		public Group getGroup() { return cGroup; }

		//name=QualifiedName
		public Assignment getNameAssignment_0() { return cNameAssignment_0; }

		//QualifiedName
		public RuleCall getNameQualifiedNameParserRuleCall_0_0() { return cNameQualifiedNameParserRuleCall_0_0; }

		//("externalCommand" externalCommandId=STRING)?
		public Group getGroup_1() { return cGroup_1; }

		//"externalCommand"
		public Keyword getExternalCommandKeyword_1_0() { return cExternalCommandKeyword_1_0; }

		//externalCommandId=STRING
		public Assignment getExternalCommandIdAssignment_1_1() { return cExternalCommandIdAssignment_1_1; }

		//STRING
		public RuleCall getExternalCommandIdSTRINGTerminalRuleCall_1_1_0() { return cExternalCommandIdSTRINGTerminalRuleCall_1_1_0; }

		//initialDisabled?="disabled"?
		public Assignment getInitialDisabledAssignment_2() { return cInitialDisabledAssignment_2; }

		//"disabled"
		public Keyword getInitialDisabledDisabledKeyword_2_0() { return cInitialDisabledDisabledKeyword_2_0; }
	}

	public class UxViewCategoryElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "UxViewCategory");
		private final Assignment cNameAssignment = (Assignment)rule.eContents().get(1);
		private final RuleCall cNameQualifiedNameParserRuleCall_0 = (RuleCall)cNameAssignment.eContents().get(0);
		
		//UxViewCategory returns semantic::UxViewCategory:
		//	name=QualifiedName;
		public ParserRule getRule() { return rule; }

		//name=QualifiedName
		public Assignment getNameAssignment() { return cNameAssignment; }

		//QualifiedName
		public RuleCall getNameQualifiedNameParserRuleCall_0() { return cNameQualifiedNameParserRuleCall_0; }
	}

	public class XImportDeclarationElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "XImportDeclaration");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final Group cGroup_0 = (Group)cAlternatives.eContents().get(0);
		private final Action cUxImportSectionDeclarationAction_0_0 = (Action)cGroup_0.eContents().get(0);
		private final Group cGroup_0_1 = (Group)cGroup_0.eContents().get(1);
		private final Keyword cImportKeyword_0_1_0 = (Keyword)cGroup_0_1.eContents().get(0);
		private final Alternatives cAlternatives_0_1_1 = (Alternatives)cGroup_0_1.eContents().get(1);
		private final Group cGroup_0_1_1_0 = (Group)cAlternatives_0_1_1.eContents().get(0);
		private final Assignment cStaticAssignment_0_1_1_0_0 = (Assignment)cGroup_0_1_1_0.eContents().get(0);
		private final Keyword cStaticStaticKeyword_0_1_1_0_0_0 = (Keyword)cStaticAssignment_0_1_1_0_0.eContents().get(0);
		private final Assignment cExtensionAssignment_0_1_1_0_1 = (Assignment)cGroup_0_1_1_0.eContents().get(1);
		private final Keyword cExtensionExtensionKeyword_0_1_1_0_1_0 = (Keyword)cExtensionAssignment_0_1_1_0_1.eContents().get(0);
		private final Assignment cImportedTypeAssignment_0_1_1_0_2 = (Assignment)cGroup_0_1_1_0.eContents().get(2);
		private final CrossReference cImportedTypeJvmDeclaredTypeCrossReference_0_1_1_0_2_0 = (CrossReference)cImportedTypeAssignment_0_1_1_0_2.eContents().get(0);
		private final RuleCall cImportedTypeJvmDeclaredTypeQualifiedNameInStaticImportParserRuleCall_0_1_1_0_2_0_1 = (RuleCall)cImportedTypeJvmDeclaredTypeCrossReference_0_1_1_0_2_0.eContents().get(1);
		private final Alternatives cAlternatives_0_1_1_0_3 = (Alternatives)cGroup_0_1_1_0.eContents().get(3);
		private final Assignment cWildcardAssignment_0_1_1_0_3_0 = (Assignment)cAlternatives_0_1_1_0_3.eContents().get(0);
		private final Keyword cWildcardAsteriskKeyword_0_1_1_0_3_0_0 = (Keyword)cWildcardAssignment_0_1_1_0_3_0.eContents().get(0);
		private final Assignment cMemberNameAssignment_0_1_1_0_3_1 = (Assignment)cAlternatives_0_1_1_0_3.eContents().get(1);
		private final RuleCall cMemberNameValidIDParserRuleCall_0_1_1_0_3_1_0 = (RuleCall)cMemberNameAssignment_0_1_1_0_3_1.eContents().get(0);
		private final Assignment cImportedTypeAssignment_0_1_1_1 = (Assignment)cAlternatives_0_1_1.eContents().get(1);
		private final CrossReference cImportedTypeJvmDeclaredTypeCrossReference_0_1_1_1_0 = (CrossReference)cImportedTypeAssignment_0_1_1_1.eContents().get(0);
		private final RuleCall cImportedTypeJvmDeclaredTypeQualifiedNameParserRuleCall_0_1_1_1_0_1 = (RuleCall)cImportedTypeJvmDeclaredTypeCrossReference_0_1_1_1_0.eContents().get(1);
		private final Assignment cImportedNamespaceAssignment_0_1_1_2 = (Assignment)cAlternatives_0_1_1.eContents().get(2);
		private final RuleCall cImportedNamespaceQualifiedNameWithWildcardParserRuleCall_0_1_1_2_0 = (RuleCall)cImportedNamespaceAssignment_0_1_1_2.eContents().get(0);
		private final Group cGroup_1 = (Group)cAlternatives.eContents().get(1);
		private final Group cGroup_1_0 = (Group)cGroup_1.eContents().get(0);
		private final Keyword cEPackageKeyword_1_0_0 = (Keyword)cGroup_1_0.eContents().get(0);
		private final Assignment cImportedEPackageAssignment_1_0_1 = (Assignment)cGroup_1_0.eContents().get(1);
		private final RuleCall cImportedEPackageUxEPackageImportParserRuleCall_1_0_1_0 = (RuleCall)cImportedEPackageAssignment_1_0_1.eContents().get(0);
		private final Keyword cSemicolonKeyword_1_1 = (Keyword)cGroup_1.eContents().get(1);
		
		//XImportDeclaration returns semantic::UxImportSectionDeclaration:
		//	{semantic::UxImportSectionDeclaration} ("import" (static?="static" extension?="extension"?
		//	importedType=[JvmDeclaredType|QualifiedNameInStaticImport] (wildcard?="*" | memberName=ValidID) |
		//	importedType=[JvmDeclaredType|QualifiedName] | importedNamespace=QualifiedNameWithWildcard)) | ("ePackage"
		//	importedEPackage=UxEPackageImport) ";"?;
		public ParserRule getRule() { return rule; }

		//{semantic::UxImportSectionDeclaration} ("import" (static?="static" extension?="extension"?
		//importedType=[JvmDeclaredType|QualifiedNameInStaticImport] (wildcard?="*" | memberName=ValidID) |
		//importedType=[JvmDeclaredType|QualifiedName] | importedNamespace=QualifiedNameWithWildcard)) | ("ePackage"
		//importedEPackage=UxEPackageImport) ";"?
		public Alternatives getAlternatives() { return cAlternatives; }

		//{semantic::UxImportSectionDeclaration} ("import" (static?="static" extension?="extension"?
		//importedType=[JvmDeclaredType|QualifiedNameInStaticImport] (wildcard?="*" | memberName=ValidID) |
		//importedType=[JvmDeclaredType|QualifiedName] | importedNamespace=QualifiedNameWithWildcard))
		public Group getGroup_0() { return cGroup_0; }

		//{semantic::UxImportSectionDeclaration}
		public Action getUxImportSectionDeclarationAction_0_0() { return cUxImportSectionDeclarationAction_0_0; }

		//"import" (static?="static" extension?="extension"? importedType=[JvmDeclaredType|QualifiedNameInStaticImport]
		//(wildcard?="*" | memberName=ValidID) | importedType=[JvmDeclaredType|QualifiedName] |
		//importedNamespace=QualifiedNameWithWildcard)
		public Group getGroup_0_1() { return cGroup_0_1; }

		//"import"
		public Keyword getImportKeyword_0_1_0() { return cImportKeyword_0_1_0; }

		//static?="static" extension?="extension"? importedType=[JvmDeclaredType|QualifiedNameInStaticImport] (wildcard?="*" |
		//memberName=ValidID) | importedType=[JvmDeclaredType|QualifiedName] | importedNamespace=QualifiedNameWithWildcard
		public Alternatives getAlternatives_0_1_1() { return cAlternatives_0_1_1; }

		//static?="static" extension?="extension"? importedType=[JvmDeclaredType|QualifiedNameInStaticImport] (wildcard?="*" |
		//memberName=ValidID)
		public Group getGroup_0_1_1_0() { return cGroup_0_1_1_0; }

		//static?="static"
		public Assignment getStaticAssignment_0_1_1_0_0() { return cStaticAssignment_0_1_1_0_0; }

		//"static"
		public Keyword getStaticStaticKeyword_0_1_1_0_0_0() { return cStaticStaticKeyword_0_1_1_0_0_0; }

		//extension?="extension"?
		public Assignment getExtensionAssignment_0_1_1_0_1() { return cExtensionAssignment_0_1_1_0_1; }

		//"extension"
		public Keyword getExtensionExtensionKeyword_0_1_1_0_1_0() { return cExtensionExtensionKeyword_0_1_1_0_1_0; }

		//importedType=[JvmDeclaredType|QualifiedNameInStaticImport]
		public Assignment getImportedTypeAssignment_0_1_1_0_2() { return cImportedTypeAssignment_0_1_1_0_2; }

		//[JvmDeclaredType|QualifiedNameInStaticImport]
		public CrossReference getImportedTypeJvmDeclaredTypeCrossReference_0_1_1_0_2_0() { return cImportedTypeJvmDeclaredTypeCrossReference_0_1_1_0_2_0; }

		//QualifiedNameInStaticImport
		public RuleCall getImportedTypeJvmDeclaredTypeQualifiedNameInStaticImportParserRuleCall_0_1_1_0_2_0_1() { return cImportedTypeJvmDeclaredTypeQualifiedNameInStaticImportParserRuleCall_0_1_1_0_2_0_1; }

		//wildcard?="*" | memberName=ValidID
		public Alternatives getAlternatives_0_1_1_0_3() { return cAlternatives_0_1_1_0_3; }

		//wildcard?="*"
		public Assignment getWildcardAssignment_0_1_1_0_3_0() { return cWildcardAssignment_0_1_1_0_3_0; }

		//"*"
		public Keyword getWildcardAsteriskKeyword_0_1_1_0_3_0_0() { return cWildcardAsteriskKeyword_0_1_1_0_3_0_0; }

		//memberName=ValidID
		public Assignment getMemberNameAssignment_0_1_1_0_3_1() { return cMemberNameAssignment_0_1_1_0_3_1; }

		//ValidID
		public RuleCall getMemberNameValidIDParserRuleCall_0_1_1_0_3_1_0() { return cMemberNameValidIDParserRuleCall_0_1_1_0_3_1_0; }

		//importedType=[JvmDeclaredType|QualifiedName]
		public Assignment getImportedTypeAssignment_0_1_1_1() { return cImportedTypeAssignment_0_1_1_1; }

		//[JvmDeclaredType|QualifiedName]
		public CrossReference getImportedTypeJvmDeclaredTypeCrossReference_0_1_1_1_0() { return cImportedTypeJvmDeclaredTypeCrossReference_0_1_1_1_0; }

		//QualifiedName
		public RuleCall getImportedTypeJvmDeclaredTypeQualifiedNameParserRuleCall_0_1_1_1_0_1() { return cImportedTypeJvmDeclaredTypeQualifiedNameParserRuleCall_0_1_1_1_0_1; }

		//importedNamespace=QualifiedNameWithWildcard
		public Assignment getImportedNamespaceAssignment_0_1_1_2() { return cImportedNamespaceAssignment_0_1_1_2; }

		//QualifiedNameWithWildcard
		public RuleCall getImportedNamespaceQualifiedNameWithWildcardParserRuleCall_0_1_1_2_0() { return cImportedNamespaceQualifiedNameWithWildcardParserRuleCall_0_1_1_2_0; }

		//("ePackage" importedEPackage=UxEPackageImport) ";"?
		public Group getGroup_1() { return cGroup_1; }

		//"ePackage" importedEPackage=UxEPackageImport
		public Group getGroup_1_0() { return cGroup_1_0; }

		//"ePackage"
		public Keyword getEPackageKeyword_1_0_0() { return cEPackageKeyword_1_0_0; }

		//importedEPackage=UxEPackageImport
		public Assignment getImportedEPackageAssignment_1_0_1() { return cImportedEPackageAssignment_1_0_1; }

		//UxEPackageImport
		public RuleCall getImportedEPackageUxEPackageImportParserRuleCall_1_0_1_0() { return cImportedEPackageUxEPackageImportParserRuleCall_1_0_1_0; }

		//";"?
		public Keyword getSemicolonKeyword_1_1() { return cSemicolonKeyword_1_1; }
	}

	public class UxEPackageImportElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "UxEPackageImport");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cEPackageAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final CrossReference cEPackageEPackageCrossReference_0_0 = (CrossReference)cEPackageAssignment_0.eContents().get(0);
		private final RuleCall cEPackageEPackageSTRINGTerminalRuleCall_0_0_1 = (RuleCall)cEPackageEPackageCrossReference_0_0.eContents().get(1);
		private final Keyword cAsKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cAliasAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cAliasIDTerminalRuleCall_2_0 = (RuleCall)cAliasAssignment_2.eContents().get(0);
		
		//UxEPackageImport returns semantic::UxEPackageImport:
		//	ePackage=[ecore::EPackage|STRING] "as" alias=ID;
		public ParserRule getRule() { return rule; }

		//ePackage=[ecore::EPackage|STRING] "as" alias=ID
		public Group getGroup() { return cGroup; }

		//ePackage=[ecore::EPackage|STRING]
		public Assignment getEPackageAssignment_0() { return cEPackageAssignment_0; }

		//[ecore::EPackage|STRING]
		public CrossReference getEPackageEPackageCrossReference_0_0() { return cEPackageEPackageCrossReference_0_0; }

		//STRING
		public RuleCall getEPackageEPackageSTRINGTerminalRuleCall_0_0_1() { return cEPackageEPackageSTRINGTerminalRuleCall_0_0_1; }

		//"as"
		public Keyword getAsKeyword_1() { return cAsKeyword_1; }

		//alias=ID
		public Assignment getAliasAssignment_2() { return cAliasAssignment_2; }

		//ID
		public RuleCall getAliasIDTerminalRuleCall_2_0() { return cAliasIDTerminalRuleCall_2_0; }
	}

	public class UxElementDefinitionElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "UxElementDefinition");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cElementKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameIDTerminalRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Assignment cUriAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cUriUxElementURIParserRuleCall_3_0 = (RuleCall)cUriAssignment_3.eContents().get(0);
		private final Group cGroup_4 = (Group)cGroup.eContents().get(4);
		private final Keyword cBindingsKeyword_4_0 = (Keyword)cGroup_4.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_4_1 = (Keyword)cGroup_4.eContents().get(1);
		private final Assignment cBindingContainerAssignment_4_2 = (Assignment)cGroup_4.eContents().get(2);
		private final RuleCall cBindingContainerUxAvailableBindingsParserRuleCall_4_2_0 = (RuleCall)cBindingContainerAssignment_4_2.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_4_3 = (Keyword)cGroup_4.eContents().get(3);
		private final Group cGroup_5 = (Group)cGroup.eContents().get(5);
		private final Keyword cVisibilityKeyword_5_0 = (Keyword)cGroup_5.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_5_1 = (Keyword)cGroup_5.eContents().get(1);
		private final Assignment cVisibilityContainerAssignment_5_2 = (Assignment)cGroup_5.eContents().get(2);
		private final RuleCall cVisibilityContainerUxAvailableVisibilityOptionsParserRuleCall_5_2_0 = (RuleCall)cVisibilityContainerAssignment_5_2.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_5_3 = (Keyword)cGroup_5.eContents().get(3);
		private final Group cGroup_6 = (Group)cGroup.eContents().get(6);
		private final Keyword cValidatorKeyword_6_0 = (Keyword)cGroup_6.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_6_1 = (Keyword)cGroup_6.eContents().get(1);
		private final Assignment cValidatorContainerAssignment_6_2 = (Assignment)cGroup_6.eContents().get(2);
		private final RuleCall cValidatorContainerUxAvailableValidatorPropertiesParserRuleCall_6_2_0 = (RuleCall)cValidatorContainerAssignment_6_2.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_6_3 = (Keyword)cGroup_6.eContents().get(3);
		private final Keyword cRightCurlyBracketKeyword_7 = (Keyword)cGroup.eContents().get(7);
		
		//UxElementDefinition returns semantic::UxElementDefinition:
		//	"element" name=ID "{" uri=UxElementURI? ("bindings" "{" bindingContainer=UxAvailableBindings "}")? ("visibility" "{"
		//	visibilityContainer=UxAvailableVisibilityOptions "}")? ("validator" "{"
		//	validatorContainer=UxAvailableValidatorProperties "}")? "}";
		public ParserRule getRule() { return rule; }

		//"element" name=ID "{" uri=UxElementURI? ("bindings" "{" bindingContainer=UxAvailableBindings "}")? ("visibility" "{"
		//visibilityContainer=UxAvailableVisibilityOptions "}")? ("validator" "{"
		//validatorContainer=UxAvailableValidatorProperties "}")? "}"
		public Group getGroup() { return cGroup; }

		//"element"
		public Keyword getElementKeyword_0() { return cElementKeyword_0; }

		//name=ID
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }

		//ID
		public RuleCall getNameIDTerminalRuleCall_1_0() { return cNameIDTerminalRuleCall_1_0; }

		//"{"
		public Keyword getLeftCurlyBracketKeyword_2() { return cLeftCurlyBracketKeyword_2; }

		//uri=UxElementURI?
		public Assignment getUriAssignment_3() { return cUriAssignment_3; }

		//UxElementURI
		public RuleCall getUriUxElementURIParserRuleCall_3_0() { return cUriUxElementURIParserRuleCall_3_0; }

		//("bindings" "{" bindingContainer=UxAvailableBindings "}")?
		public Group getGroup_4() { return cGroup_4; }

		//"bindings"
		public Keyword getBindingsKeyword_4_0() { return cBindingsKeyword_4_0; }

		//"{"
		public Keyword getLeftCurlyBracketKeyword_4_1() { return cLeftCurlyBracketKeyword_4_1; }

		//bindingContainer=UxAvailableBindings
		public Assignment getBindingContainerAssignment_4_2() { return cBindingContainerAssignment_4_2; }

		//UxAvailableBindings
		public RuleCall getBindingContainerUxAvailableBindingsParserRuleCall_4_2_0() { return cBindingContainerUxAvailableBindingsParserRuleCall_4_2_0; }

		//"}"
		public Keyword getRightCurlyBracketKeyword_4_3() { return cRightCurlyBracketKeyword_4_3; }

		//("visibility" "{" visibilityContainer=UxAvailableVisibilityOptions "}")?
		public Group getGroup_5() { return cGroup_5; }

		//"visibility"
		public Keyword getVisibilityKeyword_5_0() { return cVisibilityKeyword_5_0; }

		//"{"
		public Keyword getLeftCurlyBracketKeyword_5_1() { return cLeftCurlyBracketKeyword_5_1; }

		//visibilityContainer=UxAvailableVisibilityOptions
		public Assignment getVisibilityContainerAssignment_5_2() { return cVisibilityContainerAssignment_5_2; }

		//UxAvailableVisibilityOptions
		public RuleCall getVisibilityContainerUxAvailableVisibilityOptionsParserRuleCall_5_2_0() { return cVisibilityContainerUxAvailableVisibilityOptionsParserRuleCall_5_2_0; }

		//"}"
		public Keyword getRightCurlyBracketKeyword_5_3() { return cRightCurlyBracketKeyword_5_3; }

		//("validator" "{" validatorContainer=UxAvailableValidatorProperties "}")?
		public Group getGroup_6() { return cGroup_6; }

		//"validator"
		public Keyword getValidatorKeyword_6_0() { return cValidatorKeyword_6_0; }

		//"{"
		public Keyword getLeftCurlyBracketKeyword_6_1() { return cLeftCurlyBracketKeyword_6_1; }

		//validatorContainer=UxAvailableValidatorProperties
		public Assignment getValidatorContainerAssignment_6_2() { return cValidatorContainerAssignment_6_2; }

		//UxAvailableValidatorProperties
		public RuleCall getValidatorContainerUxAvailableValidatorPropertiesParserRuleCall_6_2_0() { return cValidatorContainerUxAvailableValidatorPropertiesParserRuleCall_6_2_0; }

		//"}"
		public Keyword getRightCurlyBracketKeyword_6_3() { return cRightCurlyBracketKeyword_6_3; }

		//"}"
		public Keyword getRightCurlyBracketKeyword_7() { return cRightCurlyBracketKeyword_7; }
	}

	public class UxAvailableValidatorPropertiesElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "UxAvailableValidatorProperties");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cUxAvailableValidatorPropertiesAction_0 = (Action)cGroup.eContents().get(0);
		private final Assignment cPropertiesAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cPropertiesUxValidatorPropertyParserRuleCall_1_0 = (RuleCall)cPropertiesAssignment_1.eContents().get(0);
		
		//UxAvailableValidatorProperties returns semantic::UxAvailableValidatorProperties:
		//	{semantic::UxAvailableValidatorProperties} properties+=UxValidatorProperty*;
		public ParserRule getRule() { return rule; }

		//{semantic::UxAvailableValidatorProperties} properties+=UxValidatorProperty*
		public Group getGroup() { return cGroup; }

		//{semantic::UxAvailableValidatorProperties}
		public Action getUxAvailableValidatorPropertiesAction_0() { return cUxAvailableValidatorPropertiesAction_0; }

		//properties+=UxValidatorProperty*
		public Assignment getPropertiesAssignment_1() { return cPropertiesAssignment_1; }

		//UxValidatorProperty
		public RuleCall getPropertiesUxValidatorPropertyParserRuleCall_1_0() { return cPropertiesUxValidatorPropertyParserRuleCall_1_0; }
	}

	public class UxValidatorPropertyElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "UxValidatorProperty");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cPropertyKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameIDTerminalRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		
		//UxValidatorProperty returns semantic::UxValidatorProperty:
		//	"property" name=ID;
		public ParserRule getRule() { return rule; }

		//"property" name=ID
		public Group getGroup() { return cGroup; }

		//"property"
		public Keyword getPropertyKeyword_0() { return cPropertyKeyword_0; }

		//name=ID
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }

		//ID
		public RuleCall getNameIDTerminalRuleCall_1_0() { return cNameIDTerminalRuleCall_1_0; }
	}

	public class UxElementURIElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "UxElementURI");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cUriKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cEPackageAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final CrossReference cEPackageUxEPackageImportCrossReference_1_0 = (CrossReference)cEPackageAssignment_1.eContents().get(0);
		private final RuleCall cEPackageUxEPackageImportIDTerminalRuleCall_1_0_1 = (RuleCall)cEPackageUxEPackageImportCrossReference_1_0.eContents().get(1);
		private final Keyword cColonKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Assignment cEClassAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final CrossReference cEClassEClassCrossReference_3_0 = (CrossReference)cEClassAssignment_3.eContents().get(0);
		private final RuleCall cEClassEClassIDTerminalRuleCall_3_0_1 = (RuleCall)cEClassEClassCrossReference_3_0.eContents().get(1);
		
		//UxElementURI returns semantic::UxElementURI:
		//	"uri" ePackage=[semantic::UxEPackageImport] ":" eClass=[ecore::EClass];
		public ParserRule getRule() { return rule; }

		//"uri" ePackage=[semantic::UxEPackageImport] ":" eClass=[ecore::EClass]
		public Group getGroup() { return cGroup; }

		//"uri"
		public Keyword getUriKeyword_0() { return cUriKeyword_0; }

		//ePackage=[semantic::UxEPackageImport]
		public Assignment getEPackageAssignment_1() { return cEPackageAssignment_1; }

		//[semantic::UxEPackageImport]
		public CrossReference getEPackageUxEPackageImportCrossReference_1_0() { return cEPackageUxEPackageImportCrossReference_1_0; }

		//ID
		public RuleCall getEPackageUxEPackageImportIDTerminalRuleCall_1_0_1() { return cEPackageUxEPackageImportIDTerminalRuleCall_1_0_1; }

		//":"
		public Keyword getColonKeyword_2() { return cColonKeyword_2; }

		//eClass=[ecore::EClass]
		public Assignment getEClassAssignment_3() { return cEClassAssignment_3; }

		//[ecore::EClass]
		public CrossReference getEClassEClassCrossReference_3_0() { return cEClassEClassCrossReference_3_0; }

		//ID
		public RuleCall getEClassEClassIDTerminalRuleCall_3_0_1() { return cEClassEClassIDTerminalRuleCall_3_0_1; }
	}

	public class UxAvailableBindingsElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "UxAvailableBindings");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cUxAvailableBindingsAction_0 = (Action)cGroup.eContents().get(0);
		private final Assignment cBindingsAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cBindingsUxBindingableOptionParserRuleCall_1_0 = (RuleCall)cBindingsAssignment_1.eContents().get(0);
		
		//UxAvailableBindings returns semantic::UxAvailableBindings:
		//	{semantic::UxAvailableBindings} bindings+=UxBindingableOption*;
		public ParserRule getRule() { return rule; }

		//{semantic::UxAvailableBindings} bindings+=UxBindingableOption*
		public Group getGroup() { return cGroup; }

		//{semantic::UxAvailableBindings}
		public Action getUxAvailableBindingsAction_0() { return cUxAvailableBindingsAction_0; }

		//bindings+=UxBindingableOption*
		public Assignment getBindingsAssignment_1() { return cBindingsAssignment_1; }

		//UxBindingableOption
		public RuleCall getBindingsUxBindingableOptionParserRuleCall_1_0() { return cBindingsUxBindingableOptionParserRuleCall_1_0; }
	}

	public class UxAvailableVisibilityOptionsElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "UxAvailableVisibilityOptions");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cUxAvailableVisibilityOptionsAction_0 = (Action)cGroup.eContents().get(0);
		private final Assignment cBindingsAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cBindingsUxVisibleableOptionParserRuleCall_1_0 = (RuleCall)cBindingsAssignment_1.eContents().get(0);
		
		//UxAvailableVisibilityOptions returns semantic::UxAvailableVisibilityOptions:
		//	{semantic::UxAvailableVisibilityOptions} bindings+=UxVisibleableOption*;
		public ParserRule getRule() { return rule; }

		//{semantic::UxAvailableVisibilityOptions} bindings+=UxVisibleableOption*
		public Group getGroup() { return cGroup; }

		//{semantic::UxAvailableVisibilityOptions}
		public Action getUxAvailableVisibilityOptionsAction_0() { return cUxAvailableVisibilityOptionsAction_0; }

		//bindings+=UxVisibleableOption*
		public Assignment getBindingsAssignment_1() { return cBindingsAssignment_1; }

		//UxVisibleableOption
		public RuleCall getBindingsUxVisibleableOptionParserRuleCall_1_0() { return cBindingsUxVisibleableOptionParserRuleCall_1_0; }
	}

	public class UxBindingableOptionElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "UxBindingableOption");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cFinalAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final Keyword cFinalFinalKeyword_0_0 = (Keyword)cFinalAssignment_0.eContents().get(0);
		private final Assignment cListbindingAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final Keyword cListbindingListKeyword_1_0 = (Keyword)cListbindingAssignment_1.eContents().get(0);
		private final Keyword cEndpointKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Assignment cNameAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cNameIDTerminalRuleCall_3_0 = (RuleCall)cNameAssignment_3.eContents().get(0);
		private final Assignment cJvmTypeAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final RuleCall cJvmTypeJvmTypeReferenceParserRuleCall_4_0 = (RuleCall)cJvmTypeAssignment_4.eContents().get(0);
		private final Group cGroup_5 = (Group)cGroup.eContents().get(5);
		private final Keyword cTargetKeyword_5_0 = (Keyword)cGroup_5.eContents().get(0);
		private final Assignment cTargetNameAssignment_5_1 = (Assignment)cGroup_5.eContents().get(1);
		private final RuleCall cTargetNameIDTerminalRuleCall_5_1_0 = (RuleCall)cTargetNameAssignment_5_1.eContents().get(0);
		
		//UxBindingableOption returns semantic::UxBindingableOption:
		//	final?="final"? listbinding?="list"? "endpoint" name=ID jvmType=JvmTypeReference ("target" targetName=ID)?;
		public ParserRule getRule() { return rule; }

		//final?="final"? listbinding?="list"? "endpoint" name=ID jvmType=JvmTypeReference ("target" targetName=ID)?
		public Group getGroup() { return cGroup; }

		//final?="final"?
		public Assignment getFinalAssignment_0() { return cFinalAssignment_0; }

		//"final"
		public Keyword getFinalFinalKeyword_0_0() { return cFinalFinalKeyword_0_0; }

		//listbinding?="list"?
		public Assignment getListbindingAssignment_1() { return cListbindingAssignment_1; }

		//"list"
		public Keyword getListbindingListKeyword_1_0() { return cListbindingListKeyword_1_0; }

		//"endpoint"
		public Keyword getEndpointKeyword_2() { return cEndpointKeyword_2; }

		//name=ID
		public Assignment getNameAssignment_3() { return cNameAssignment_3; }

		//ID
		public RuleCall getNameIDTerminalRuleCall_3_0() { return cNameIDTerminalRuleCall_3_0; }

		//jvmType=JvmTypeReference
		public Assignment getJvmTypeAssignment_4() { return cJvmTypeAssignment_4; }

		//JvmTypeReference
		public RuleCall getJvmTypeJvmTypeReferenceParserRuleCall_4_0() { return cJvmTypeJvmTypeReferenceParserRuleCall_4_0; }

		//("target" targetName=ID)?
		public Group getGroup_5() { return cGroup_5; }

		//"target"
		public Keyword getTargetKeyword_5_0() { return cTargetKeyword_5_0; }

		//targetName=ID
		public Assignment getTargetNameAssignment_5_1() { return cTargetNameAssignment_5_1; }

		//ID
		public RuleCall getTargetNameIDTerminalRuleCall_5_1_0() { return cTargetNameIDTerminalRuleCall_5_1_0; }
	}

	public class UxVisibleableOptionElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "UxVisibleableOption");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cEndpointKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameIDTerminalRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		private final Assignment cJvmTypeAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cJvmTypeJvmTypeReferenceParserRuleCall_2_0 = (RuleCall)cJvmTypeAssignment_2.eContents().get(0);
		
		//UxVisibleableOption returns semantic::UxVisibleableOption:
		//	"endpoint" name=ID jvmType=JvmTypeReference;
		public ParserRule getRule() { return rule; }

		//"endpoint" name=ID jvmType=JvmTypeReference
		public Group getGroup() { return cGroup; }

		//"endpoint"
		public Keyword getEndpointKeyword_0() { return cEndpointKeyword_0; }

		//name=ID
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }

		//ID
		public RuleCall getNameIDTerminalRuleCall_1_0() { return cNameIDTerminalRuleCall_1_0; }

		//jvmType=JvmTypeReference
		public Assignment getJvmTypeAssignment_2() { return cJvmTypeAssignment_2; }

		//JvmTypeReference
		public RuleCall getJvmTypeJvmTypeReferenceParserRuleCall_2_0() { return cJvmTypeJvmTypeReferenceParserRuleCall_2_0; }
	}
	
	
	private final UxModelElements pUxModel;
	private final UxActionElements pUxAction;
	private final UxViewCategoryElements pUxViewCategory;
	private final XImportDeclarationElements pXImportDeclaration;
	private final UxEPackageImportElements pUxEPackageImport;
	private final UxElementDefinitionElements pUxElementDefinition;
	private final UxAvailableValidatorPropertiesElements pUxAvailableValidatorProperties;
	private final UxValidatorPropertyElements pUxValidatorProperty;
	private final UxElementURIElements pUxElementURI;
	private final UxAvailableBindingsElements pUxAvailableBindings;
	private final UxAvailableVisibilityOptionsElements pUxAvailableVisibilityOptions;
	private final UxBindingableOptionElements pUxBindingableOption;
	private final UxVisibleableOptionElements pUxVisibleableOption;
	
	private final Grammar grammar;

	private final XbaseGrammarAccess gaXbase;

	@Inject
	public UISemanticsGrammarGrammarAccess(GrammarProvider grammarProvider,
		XbaseGrammarAccess gaXbase) {
		this.grammar = internalFindGrammar(grammarProvider);
		this.gaXbase = gaXbase;
		this.pUxModel = new UxModelElements();
		this.pUxAction = new UxActionElements();
		this.pUxViewCategory = new UxViewCategoryElements();
		this.pXImportDeclaration = new XImportDeclarationElements();
		this.pUxEPackageImport = new UxEPackageImportElements();
		this.pUxElementDefinition = new UxElementDefinitionElements();
		this.pUxAvailableValidatorProperties = new UxAvailableValidatorPropertiesElements();
		this.pUxValidatorProperty = new UxValidatorPropertyElements();
		this.pUxElementURI = new UxElementURIElements();
		this.pUxAvailableBindings = new UxAvailableBindingsElements();
		this.pUxAvailableVisibilityOptions = new UxAvailableVisibilityOptionsElements();
		this.pUxBindingableOption = new UxBindingableOptionElements();
		this.pUxVisibleableOption = new UxVisibleableOptionElements();
	}
	
	protected Grammar internalFindGrammar(GrammarProvider grammarProvider) {
		Grammar grammar = grammarProvider.getGrammar(this);
		while (grammar != null) {
			if ("org.lunifera.ecview.uisemantics.UISemanticsGrammar".equals(grammar.getName())) {
				return grammar;
			}
			List<Grammar> grammars = grammar.getUsedGrammars();
			if (!grammars.isEmpty()) {
				grammar = grammars.iterator().next();
			} else {
				return null;
			}
		}
		return grammar;
	}
	
	
	public Grammar getGrammar() {
		return grammar;
	}
	

	public XbaseGrammarAccess getXbaseGrammarAccess() {
		return gaXbase;
	}

	
	//UxModel returns semantic::UxModel:
	//	{semantic::UxModel} importSection=XImportSection? ("actions" "{" viewActions+=UxAction* "}")? ("categories" "{"
	//	categories+=UxViewCategory* "}")? elementDefinitions+=UxElementDefinition*;
	public UxModelElements getUxModelAccess() {
		return pUxModel;
	}
	
	public ParserRule getUxModelRule() {
		return getUxModelAccess().getRule();
	}

	//UxAction returns semantic::UxAction:
	//	name=QualifiedName ("externalCommand" externalCommandId=STRING)? initialDisabled?="disabled"?;
	public UxActionElements getUxActionAccess() {
		return pUxAction;
	}
	
	public ParserRule getUxActionRule() {
		return getUxActionAccess().getRule();
	}

	//UxViewCategory returns semantic::UxViewCategory:
	//	name=QualifiedName;
	public UxViewCategoryElements getUxViewCategoryAccess() {
		return pUxViewCategory;
	}
	
	public ParserRule getUxViewCategoryRule() {
		return getUxViewCategoryAccess().getRule();
	}

	//XImportDeclaration returns semantic::UxImportSectionDeclaration:
	//	{semantic::UxImportSectionDeclaration} ("import" (static?="static" extension?="extension"?
	//	importedType=[JvmDeclaredType|QualifiedNameInStaticImport] (wildcard?="*" | memberName=ValidID) |
	//	importedType=[JvmDeclaredType|QualifiedName] | importedNamespace=QualifiedNameWithWildcard)) | ("ePackage"
	//	importedEPackage=UxEPackageImport) ";"?;
	public XImportDeclarationElements getXImportDeclarationAccess() {
		return pXImportDeclaration;
	}
	
	public ParserRule getXImportDeclarationRule() {
		return getXImportDeclarationAccess().getRule();
	}

	//UxEPackageImport returns semantic::UxEPackageImport:
	//	ePackage=[ecore::EPackage|STRING] "as" alias=ID;
	public UxEPackageImportElements getUxEPackageImportAccess() {
		return pUxEPackageImport;
	}
	
	public ParserRule getUxEPackageImportRule() {
		return getUxEPackageImportAccess().getRule();
	}

	//UxElementDefinition returns semantic::UxElementDefinition:
	//	"element" name=ID "{" uri=UxElementURI? ("bindings" "{" bindingContainer=UxAvailableBindings "}")? ("visibility" "{"
	//	visibilityContainer=UxAvailableVisibilityOptions "}")? ("validator" "{"
	//	validatorContainer=UxAvailableValidatorProperties "}")? "}";
	public UxElementDefinitionElements getUxElementDefinitionAccess() {
		return pUxElementDefinition;
	}
	
	public ParserRule getUxElementDefinitionRule() {
		return getUxElementDefinitionAccess().getRule();
	}

	//UxAvailableValidatorProperties returns semantic::UxAvailableValidatorProperties:
	//	{semantic::UxAvailableValidatorProperties} properties+=UxValidatorProperty*;
	public UxAvailableValidatorPropertiesElements getUxAvailableValidatorPropertiesAccess() {
		return pUxAvailableValidatorProperties;
	}
	
	public ParserRule getUxAvailableValidatorPropertiesRule() {
		return getUxAvailableValidatorPropertiesAccess().getRule();
	}

	//UxValidatorProperty returns semantic::UxValidatorProperty:
	//	"property" name=ID;
	public UxValidatorPropertyElements getUxValidatorPropertyAccess() {
		return pUxValidatorProperty;
	}
	
	public ParserRule getUxValidatorPropertyRule() {
		return getUxValidatorPropertyAccess().getRule();
	}

	//UxElementURI returns semantic::UxElementURI:
	//	"uri" ePackage=[semantic::UxEPackageImport] ":" eClass=[ecore::EClass];
	public UxElementURIElements getUxElementURIAccess() {
		return pUxElementURI;
	}
	
	public ParserRule getUxElementURIRule() {
		return getUxElementURIAccess().getRule();
	}

	//UxAvailableBindings returns semantic::UxAvailableBindings:
	//	{semantic::UxAvailableBindings} bindings+=UxBindingableOption*;
	public UxAvailableBindingsElements getUxAvailableBindingsAccess() {
		return pUxAvailableBindings;
	}
	
	public ParserRule getUxAvailableBindingsRule() {
		return getUxAvailableBindingsAccess().getRule();
	}

	//UxAvailableVisibilityOptions returns semantic::UxAvailableVisibilityOptions:
	//	{semantic::UxAvailableVisibilityOptions} bindings+=UxVisibleableOption*;
	public UxAvailableVisibilityOptionsElements getUxAvailableVisibilityOptionsAccess() {
		return pUxAvailableVisibilityOptions;
	}
	
	public ParserRule getUxAvailableVisibilityOptionsRule() {
		return getUxAvailableVisibilityOptionsAccess().getRule();
	}

	//UxBindingableOption returns semantic::UxBindingableOption:
	//	final?="final"? listbinding?="list"? "endpoint" name=ID jvmType=JvmTypeReference ("target" targetName=ID)?;
	public UxBindingableOptionElements getUxBindingableOptionAccess() {
		return pUxBindingableOption;
	}
	
	public ParserRule getUxBindingableOptionRule() {
		return getUxBindingableOptionAccess().getRule();
	}

	//UxVisibleableOption returns semantic::UxVisibleableOption:
	//	"endpoint" name=ID jvmType=JvmTypeReference;
	public UxVisibleableOptionElements getUxVisibleableOptionAccess() {
		return pUxVisibleableOption;
	}
	
	public ParserRule getUxVisibleableOptionRule() {
		return getUxVisibleableOptionAccess().getRule();
	}

	//XExpression:
	//	XAssignment;
	public XbaseGrammarAccess.XExpressionElements getXExpressionAccess() {
		return gaXbase.getXExpressionAccess();
	}
	
	public ParserRule getXExpressionRule() {
		return getXExpressionAccess().getRule();
	}

	//XAssignment returns XExpression:
	//	{XAssignment} feature=[types::JvmIdentifiableElement|FeatureCallID] OpSingleAssign value=XAssignment | XOrExpression
	//	(=> ({XBinaryOperation.leftOperand=current} feature=[types::JvmIdentifiableElement|OpMultiAssign])
	//	rightOperand=XAssignment)?;
	public XbaseGrammarAccess.XAssignmentElements getXAssignmentAccess() {
		return gaXbase.getXAssignmentAccess();
	}
	
	public ParserRule getXAssignmentRule() {
		return getXAssignmentAccess().getRule();
	}

	//OpSingleAssign:
	//	"=";
	public XbaseGrammarAccess.OpSingleAssignElements getOpSingleAssignAccess() {
		return gaXbase.getOpSingleAssignAccess();
	}
	
	public ParserRule getOpSingleAssignRule() {
		return getOpSingleAssignAccess().getRule();
	}

	//OpMultiAssign:
	//	"+=" | "-=" | "*=" | "/=" | "%=" | "<" "<" "=" | ">" ">"? ">=";
	public XbaseGrammarAccess.OpMultiAssignElements getOpMultiAssignAccess() {
		return gaXbase.getOpMultiAssignAccess();
	}
	
	public ParserRule getOpMultiAssignRule() {
		return getOpMultiAssignAccess().getRule();
	}

	//XOrExpression returns XExpression:
	//	XAndExpression (=> ({XBinaryOperation.leftOperand=current} feature=[types::JvmIdentifiableElement|OpOr])
	//	rightOperand=XAndExpression)*;
	public XbaseGrammarAccess.XOrExpressionElements getXOrExpressionAccess() {
		return gaXbase.getXOrExpressionAccess();
	}
	
	public ParserRule getXOrExpressionRule() {
		return getXOrExpressionAccess().getRule();
	}

	//OpOr:
	//	"||";
	public XbaseGrammarAccess.OpOrElements getOpOrAccess() {
		return gaXbase.getOpOrAccess();
	}
	
	public ParserRule getOpOrRule() {
		return getOpOrAccess().getRule();
	}

	//XAndExpression returns XExpression:
	//	XEqualityExpression (=> ({XBinaryOperation.leftOperand=current} feature=[types::JvmIdentifiableElement|OpAnd])
	//	rightOperand=XEqualityExpression)*;
	public XbaseGrammarAccess.XAndExpressionElements getXAndExpressionAccess() {
		return gaXbase.getXAndExpressionAccess();
	}
	
	public ParserRule getXAndExpressionRule() {
		return getXAndExpressionAccess().getRule();
	}

	//OpAnd:
	//	"&&";
	public XbaseGrammarAccess.OpAndElements getOpAndAccess() {
		return gaXbase.getOpAndAccess();
	}
	
	public ParserRule getOpAndRule() {
		return getOpAndAccess().getRule();
	}

	//XEqualityExpression returns XExpression:
	//	XRelationalExpression (=> ({XBinaryOperation.leftOperand=current} feature=[types::JvmIdentifiableElement|OpEquality])
	//	rightOperand=XRelationalExpression)*;
	public XbaseGrammarAccess.XEqualityExpressionElements getXEqualityExpressionAccess() {
		return gaXbase.getXEqualityExpressionAccess();
	}
	
	public ParserRule getXEqualityExpressionRule() {
		return getXEqualityExpressionAccess().getRule();
	}

	//OpEquality:
	//	"==" | "!=" | "===" | "!==";
	public XbaseGrammarAccess.OpEqualityElements getOpEqualityAccess() {
		return gaXbase.getOpEqualityAccess();
	}
	
	public ParserRule getOpEqualityRule() {
		return getOpEqualityAccess().getRule();
	}

	//XRelationalExpression returns XExpression:
	//	XOtherOperatorExpression (=> ({XInstanceOfExpression.expression=current} "instanceof") type=JvmTypeReference | =>
	//	({XBinaryOperation.leftOperand=current} feature=[types::JvmIdentifiableElement|OpCompare])
	//	rightOperand=XOtherOperatorExpression)*;
	public XbaseGrammarAccess.XRelationalExpressionElements getXRelationalExpressionAccess() {
		return gaXbase.getXRelationalExpressionAccess();
	}
	
	public ParserRule getXRelationalExpressionRule() {
		return getXRelationalExpressionAccess().getRule();
	}

	//OpCompare:
	//	">=" | "<" "=" | ">" | "<";
	public XbaseGrammarAccess.OpCompareElements getOpCompareAccess() {
		return gaXbase.getOpCompareAccess();
	}
	
	public ParserRule getOpCompareRule() {
		return getOpCompareAccess().getRule();
	}

	//XOtherOperatorExpression returns XExpression:
	//	XAdditiveExpression (=> ({XBinaryOperation.leftOperand=current} feature=[types::JvmIdentifiableElement|OpOther])
	//	rightOperand=XAdditiveExpression)*;
	public XbaseGrammarAccess.XOtherOperatorExpressionElements getXOtherOperatorExpressionAccess() {
		return gaXbase.getXOtherOperatorExpressionAccess();
	}
	
	public ParserRule getXOtherOperatorExpressionRule() {
		return getXOtherOperatorExpressionAccess().getRule();
	}

	//OpOther:
	//	"->" | "..<" | ">" ".." | ".." | "=>" | ">" (=> (">" ">") | ">") | "<" (=> ("<" "<") | "<" | "=>") | "<>" | "?:";
	public XbaseGrammarAccess.OpOtherElements getOpOtherAccess() {
		return gaXbase.getOpOtherAccess();
	}
	
	public ParserRule getOpOtherRule() {
		return getOpOtherAccess().getRule();
	}

	//XAdditiveExpression returns XExpression:
	//	XMultiplicativeExpression (=> ({XBinaryOperation.leftOperand=current} feature=[types::JvmIdentifiableElement|OpAdd])
	//	rightOperand=XMultiplicativeExpression)*;
	public XbaseGrammarAccess.XAdditiveExpressionElements getXAdditiveExpressionAccess() {
		return gaXbase.getXAdditiveExpressionAccess();
	}
	
	public ParserRule getXAdditiveExpressionRule() {
		return getXAdditiveExpressionAccess().getRule();
	}

	//OpAdd:
	//	"+" | "-";
	public XbaseGrammarAccess.OpAddElements getOpAddAccess() {
		return gaXbase.getOpAddAccess();
	}
	
	public ParserRule getOpAddRule() {
		return getOpAddAccess().getRule();
	}

	//XMultiplicativeExpression returns XExpression:
	//	XUnaryOperation (=> ({XBinaryOperation.leftOperand=current} feature=[types::JvmIdentifiableElement|OpMulti])
	//	rightOperand=XUnaryOperation)*;
	public XbaseGrammarAccess.XMultiplicativeExpressionElements getXMultiplicativeExpressionAccess() {
		return gaXbase.getXMultiplicativeExpressionAccess();
	}
	
	public ParserRule getXMultiplicativeExpressionRule() {
		return getXMultiplicativeExpressionAccess().getRule();
	}

	//OpMulti:
	//	"*" | "**" | "/" | "%";
	public XbaseGrammarAccess.OpMultiElements getOpMultiAccess() {
		return gaXbase.getOpMultiAccess();
	}
	
	public ParserRule getOpMultiRule() {
		return getOpMultiAccess().getRule();
	}

	//XUnaryOperation returns XExpression:
	//	{XUnaryOperation} feature=[types::JvmIdentifiableElement|OpUnary] operand=XUnaryOperation | XCastedExpression;
	public XbaseGrammarAccess.XUnaryOperationElements getXUnaryOperationAccess() {
		return gaXbase.getXUnaryOperationAccess();
	}
	
	public ParserRule getXUnaryOperationRule() {
		return getXUnaryOperationAccess().getRule();
	}

	//OpUnary:
	//	"!" | "-" | "+";
	public XbaseGrammarAccess.OpUnaryElements getOpUnaryAccess() {
		return gaXbase.getOpUnaryAccess();
	}
	
	public ParserRule getOpUnaryRule() {
		return getOpUnaryAccess().getRule();
	}

	//XCastedExpression returns XExpression:
	//	XPostfixOperation (=> ({XCastedExpression.target=current} "as") type=JvmTypeReference)*;
	public XbaseGrammarAccess.XCastedExpressionElements getXCastedExpressionAccess() {
		return gaXbase.getXCastedExpressionAccess();
	}
	
	public ParserRule getXCastedExpressionRule() {
		return getXCastedExpressionAccess().getRule();
	}

	//XPostfixOperation returns XExpression:
	//	XMemberFeatureCall => ({XPostfixOperation.operand=current} feature=[types::JvmIdentifiableElement|OpPostfix])?;
	public XbaseGrammarAccess.XPostfixOperationElements getXPostfixOperationAccess() {
		return gaXbase.getXPostfixOperationAccess();
	}
	
	public ParserRule getXPostfixOperationRule() {
		return getXPostfixOperationAccess().getRule();
	}

	//OpPostfix:
	//	"++" | "--";
	public XbaseGrammarAccess.OpPostfixElements getOpPostfixAccess() {
		return gaXbase.getOpPostfixAccess();
	}
	
	public ParserRule getOpPostfixRule() {
		return getOpPostfixAccess().getRule();
	}

	//XMemberFeatureCall returns XExpression:
	//	XPrimaryExpression (=> ({XAssignment.assignable=current} ("." | explicitStatic?="::")
	//	feature=[types::JvmIdentifiableElement|FeatureCallID] OpSingleAssign) value=XAssignment | =>
	//	({XMemberFeatureCall.memberCallTarget=current} ("." | nullSafe?="?." | explicitStatic?="::")) ("<"
	//	typeArguments+=JvmArgumentTypeReference ("," typeArguments+=JvmArgumentTypeReference)* ">")?
	//	feature=[types::JvmIdentifiableElement|IdOrSuper] (=> explicitOperationCall?="(" (memberCallArguments+=XShortClosure |
	//	memberCallArguments+=XExpression ("," memberCallArguments+=XExpression)*)? ")")? memberCallArguments+=XClosure?)*;
	public XbaseGrammarAccess.XMemberFeatureCallElements getXMemberFeatureCallAccess() {
		return gaXbase.getXMemberFeatureCallAccess();
	}
	
	public ParserRule getXMemberFeatureCallRule() {
		return getXMemberFeatureCallAccess().getRule();
	}

	//XPrimaryExpression returns XExpression:
	//	XConstructorCall | XBlockExpression | XSwitchExpression | XSynchronizedExpression | XFeatureCall | XLiteral |
	//	XIfExpression | XForLoopExpression | XBasicForLoopExpression | XWhileExpression | XDoWhileExpression |
	//	XThrowExpression | XReturnExpression | XTryCatchFinallyExpression | XParenthesizedExpression;
	public XbaseGrammarAccess.XPrimaryExpressionElements getXPrimaryExpressionAccess() {
		return gaXbase.getXPrimaryExpressionAccess();
	}
	
	public ParserRule getXPrimaryExpressionRule() {
		return getXPrimaryExpressionAccess().getRule();
	}

	//XLiteral returns XExpression:
	//	XCollectionLiteral | XClosure | XBooleanLiteral | XNumberLiteral | XNullLiteral | XStringLiteral | XTypeLiteral;
	public XbaseGrammarAccess.XLiteralElements getXLiteralAccess() {
		return gaXbase.getXLiteralAccess();
	}
	
	public ParserRule getXLiteralRule() {
		return getXLiteralAccess().getRule();
	}

	//XCollectionLiteral:
	//	XSetLiteral | XListLiteral;
	public XbaseGrammarAccess.XCollectionLiteralElements getXCollectionLiteralAccess() {
		return gaXbase.getXCollectionLiteralAccess();
	}
	
	public ParserRule getXCollectionLiteralRule() {
		return getXCollectionLiteralAccess().getRule();
	}

	//XSetLiteral:
	//	{XSetLiteral} "#" "{" (elements+=XExpression ("," elements+=XExpression)*)? "}";
	public XbaseGrammarAccess.XSetLiteralElements getXSetLiteralAccess() {
		return gaXbase.getXSetLiteralAccess();
	}
	
	public ParserRule getXSetLiteralRule() {
		return getXSetLiteralAccess().getRule();
	}

	//XListLiteral:
	//	{XListLiteral} "#" "[" (elements+=XExpression ("," elements+=XExpression)*)? "]";
	public XbaseGrammarAccess.XListLiteralElements getXListLiteralAccess() {
		return gaXbase.getXListLiteralAccess();
	}
	
	public ParserRule getXListLiteralRule() {
		return getXListLiteralAccess().getRule();
	}

	//XClosure returns XExpression:
	//	=> ({XClosure} "[") => ((declaredFormalParameters+=JvmFormalParameter (","
	//	declaredFormalParameters+=JvmFormalParameter)*)? explicitSyntax?="|")? expression=XExpressionInClosure "]";
	public XbaseGrammarAccess.XClosureElements getXClosureAccess() {
		return gaXbase.getXClosureAccess();
	}
	
	public ParserRule getXClosureRule() {
		return getXClosureAccess().getRule();
	}

	//XExpressionInClosure returns XExpression:
	//	{XBlockExpression} (expressions+=XExpressionOrVarDeclaration ";"?)*;
	public XbaseGrammarAccess.XExpressionInClosureElements getXExpressionInClosureAccess() {
		return gaXbase.getXExpressionInClosureAccess();
	}
	
	public ParserRule getXExpressionInClosureRule() {
		return getXExpressionInClosureAccess().getRule();
	}

	//XShortClosure returns XExpression:
	//	=> ({XClosure} (declaredFormalParameters+=JvmFormalParameter ("," declaredFormalParameters+=JvmFormalParameter)*)?
	//	explicitSyntax?="|") expression=XExpression;
	public XbaseGrammarAccess.XShortClosureElements getXShortClosureAccess() {
		return gaXbase.getXShortClosureAccess();
	}
	
	public ParserRule getXShortClosureRule() {
		return getXShortClosureAccess().getRule();
	}

	//XParenthesizedExpression returns XExpression:
	//	"(" XExpression ")";
	public XbaseGrammarAccess.XParenthesizedExpressionElements getXParenthesizedExpressionAccess() {
		return gaXbase.getXParenthesizedExpressionAccess();
	}
	
	public ParserRule getXParenthesizedExpressionRule() {
		return getXParenthesizedExpressionAccess().getRule();
	}

	//XIfExpression returns XExpression:
	//	{XIfExpression} "if" "(" if=XExpression ")" then=XExpression ("else" else=XExpression)?;
	public XbaseGrammarAccess.XIfExpressionElements getXIfExpressionAccess() {
		return gaXbase.getXIfExpressionAccess();
	}
	
	public ParserRule getXIfExpressionRule() {
		return getXIfExpressionAccess().getRule();
	}

	//XSwitchExpression returns XExpression:
	//	{XSwitchExpression} "switch" (=> ("(" declaredParam=JvmFormalParameter ":") switch=XExpression ")" | =>
	//	(declaredParam=JvmFormalParameter ":")? switch=XExpression) "{" cases+=XCasePart* ("default" ":" default=XExpression)?
	//	"}";
	public XbaseGrammarAccess.XSwitchExpressionElements getXSwitchExpressionAccess() {
		return gaXbase.getXSwitchExpressionAccess();
	}
	
	public ParserRule getXSwitchExpressionRule() {
		return getXSwitchExpressionAccess().getRule();
	}

	//XCasePart:
	//	{XCasePart} typeGuard=JvmTypeReference? ("case" case=XExpression)? (":" then=XExpression | fallThrough?=",");
	public XbaseGrammarAccess.XCasePartElements getXCasePartAccess() {
		return gaXbase.getXCasePartAccess();
	}
	
	public ParserRule getXCasePartRule() {
		return getXCasePartAccess().getRule();
	}

	//XForLoopExpression returns XExpression:
	//	=> ({XForLoopExpression} "for" "(" declaredParam=JvmFormalParameter ":") forExpression=XExpression ")"
	//	eachExpression=XExpression;
	public XbaseGrammarAccess.XForLoopExpressionElements getXForLoopExpressionAccess() {
		return gaXbase.getXForLoopExpressionAccess();
	}
	
	public ParserRule getXForLoopExpressionRule() {
		return getXForLoopExpressionAccess().getRule();
	}

	//XBasicForLoopExpression returns XExpression:
	//	{XBasicForLoopExpression} "for" "(" (initExpressions+=XExpressionOrVarDeclaration (","
	//	initExpressions+=XExpressionOrVarDeclaration)*)? ";" expression=XExpression? ";" (updateExpressions+=XExpression (","
	//	updateExpressions+=XExpression)*)? ")" eachExpression=XExpression;
	public XbaseGrammarAccess.XBasicForLoopExpressionElements getXBasicForLoopExpressionAccess() {
		return gaXbase.getXBasicForLoopExpressionAccess();
	}
	
	public ParserRule getXBasicForLoopExpressionRule() {
		return getXBasicForLoopExpressionAccess().getRule();
	}

	//XWhileExpression returns XExpression:
	//	{XWhileExpression} "while" "(" predicate=XExpression ")" body=XExpression;
	public XbaseGrammarAccess.XWhileExpressionElements getXWhileExpressionAccess() {
		return gaXbase.getXWhileExpressionAccess();
	}
	
	public ParserRule getXWhileExpressionRule() {
		return getXWhileExpressionAccess().getRule();
	}

	//XDoWhileExpression returns XExpression:
	//	{XDoWhileExpression} "do" body=XExpression "while" "(" predicate=XExpression ")";
	public XbaseGrammarAccess.XDoWhileExpressionElements getXDoWhileExpressionAccess() {
		return gaXbase.getXDoWhileExpressionAccess();
	}
	
	public ParserRule getXDoWhileExpressionRule() {
		return getXDoWhileExpressionAccess().getRule();
	}

	//XBlockExpression returns XExpression:
	//	{XBlockExpression} "{" (expressions+=XExpressionOrVarDeclaration ";"?)* "}";
	public XbaseGrammarAccess.XBlockExpressionElements getXBlockExpressionAccess() {
		return gaXbase.getXBlockExpressionAccess();
	}
	
	public ParserRule getXBlockExpressionRule() {
		return getXBlockExpressionAccess().getRule();
	}

	//XExpressionOrVarDeclaration returns XExpression:
	//	XVariableDeclaration | XExpression;
	public XbaseGrammarAccess.XExpressionOrVarDeclarationElements getXExpressionOrVarDeclarationAccess() {
		return gaXbase.getXExpressionOrVarDeclarationAccess();
	}
	
	public ParserRule getXExpressionOrVarDeclarationRule() {
		return getXExpressionOrVarDeclarationAccess().getRule();
	}

	//XVariableDeclaration returns XExpression:
	//	{XVariableDeclaration} (writeable?="var" | "val") (=> (type=JvmTypeReference name=ValidID) | name=ValidID) ("="
	//	right=XExpression)?;
	public XbaseGrammarAccess.XVariableDeclarationElements getXVariableDeclarationAccess() {
		return gaXbase.getXVariableDeclarationAccess();
	}
	
	public ParserRule getXVariableDeclarationRule() {
		return getXVariableDeclarationAccess().getRule();
	}

	//JvmFormalParameter returns types::JvmFormalParameter:
	//	parameterType=JvmTypeReference? name=ValidID;
	public XbaseGrammarAccess.JvmFormalParameterElements getJvmFormalParameterAccess() {
		return gaXbase.getJvmFormalParameterAccess();
	}
	
	public ParserRule getJvmFormalParameterRule() {
		return getJvmFormalParameterAccess().getRule();
	}

	//FullJvmFormalParameter returns types::JvmFormalParameter:
	//	parameterType=JvmTypeReference name=ValidID;
	public XbaseGrammarAccess.FullJvmFormalParameterElements getFullJvmFormalParameterAccess() {
		return gaXbase.getFullJvmFormalParameterAccess();
	}
	
	public ParserRule getFullJvmFormalParameterRule() {
		return getFullJvmFormalParameterAccess().getRule();
	}

	//XFeatureCall returns XExpression:
	//	{XFeatureCall} ("<" typeArguments+=JvmArgumentTypeReference ("," typeArguments+=JvmArgumentTypeReference)* ">")?
	//	feature=[types::JvmIdentifiableElement|IdOrSuper] (=> explicitOperationCall?="(" (featureCallArguments+=XShortClosure
	//	| featureCallArguments+=XExpression ("," featureCallArguments+=XExpression)*)? ")")? featureCallArguments+=XClosure?;
	public XbaseGrammarAccess.XFeatureCallElements getXFeatureCallAccess() {
		return gaXbase.getXFeatureCallAccess();
	}
	
	public ParserRule getXFeatureCallRule() {
		return getXFeatureCallAccess().getRule();
	}

	//FeatureCallID:
	//	ValidID | "extends" | "static" | "import" | "extension";
	public XbaseGrammarAccess.FeatureCallIDElements getFeatureCallIDAccess() {
		return gaXbase.getFeatureCallIDAccess();
	}
	
	public ParserRule getFeatureCallIDRule() {
		return getFeatureCallIDAccess().getRule();
	}

	//IdOrSuper:
	//	FeatureCallID | "super";
	public XbaseGrammarAccess.IdOrSuperElements getIdOrSuperAccess() {
		return gaXbase.getIdOrSuperAccess();
	}
	
	public ParserRule getIdOrSuperRule() {
		return getIdOrSuperAccess().getRule();
	}

	//XConstructorCall returns XExpression:
	//	{XConstructorCall} "new" constructor=[types::JvmConstructor|QualifiedName] ("<"
	//	typeArguments+=JvmArgumentTypeReference ("," typeArguments+=JvmArgumentTypeReference)* ">")? (=>
	//	explicitConstructorCall?="(" (arguments+=XShortClosure | arguments+=XExpression ("," arguments+=XExpression)*)? ")")?
	//	arguments+=XClosure?;
	public XbaseGrammarAccess.XConstructorCallElements getXConstructorCallAccess() {
		return gaXbase.getXConstructorCallAccess();
	}
	
	public ParserRule getXConstructorCallRule() {
		return getXConstructorCallAccess().getRule();
	}

	//XBooleanLiteral returns XExpression:
	//	{XBooleanLiteral} ("false" | isTrue?="true");
	public XbaseGrammarAccess.XBooleanLiteralElements getXBooleanLiteralAccess() {
		return gaXbase.getXBooleanLiteralAccess();
	}
	
	public ParserRule getXBooleanLiteralRule() {
		return getXBooleanLiteralAccess().getRule();
	}

	//XNullLiteral returns XExpression:
	//	{XNullLiteral} "null";
	public XbaseGrammarAccess.XNullLiteralElements getXNullLiteralAccess() {
		return gaXbase.getXNullLiteralAccess();
	}
	
	public ParserRule getXNullLiteralRule() {
		return getXNullLiteralAccess().getRule();
	}

	//XNumberLiteral returns XExpression:
	//	{XNumberLiteral} value=Number;
	public XbaseGrammarAccess.XNumberLiteralElements getXNumberLiteralAccess() {
		return gaXbase.getXNumberLiteralAccess();
	}
	
	public ParserRule getXNumberLiteralRule() {
		return getXNumberLiteralAccess().getRule();
	}

	//XStringLiteral returns XExpression:
	//	{XStringLiteral} value=STRING;
	public XbaseGrammarAccess.XStringLiteralElements getXStringLiteralAccess() {
		return gaXbase.getXStringLiteralAccess();
	}
	
	public ParserRule getXStringLiteralRule() {
		return getXStringLiteralAccess().getRule();
	}

	//XTypeLiteral returns XExpression:
	//	{XTypeLiteral} "typeof" "(" type=[types::JvmType|QualifiedName] arrayDimensions+=ArrayBrackets* ")";
	public XbaseGrammarAccess.XTypeLiteralElements getXTypeLiteralAccess() {
		return gaXbase.getXTypeLiteralAccess();
	}
	
	public ParserRule getXTypeLiteralRule() {
		return getXTypeLiteralAccess().getRule();
	}

	//XThrowExpression returns XExpression:
	//	{XThrowExpression} "throw" expression=XExpression;
	public XbaseGrammarAccess.XThrowExpressionElements getXThrowExpressionAccess() {
		return gaXbase.getXThrowExpressionAccess();
	}
	
	public ParserRule getXThrowExpressionRule() {
		return getXThrowExpressionAccess().getRule();
	}

	//XReturnExpression returns XExpression:
	//	{XReturnExpression} "return" -> expression=XExpression?;
	public XbaseGrammarAccess.XReturnExpressionElements getXReturnExpressionAccess() {
		return gaXbase.getXReturnExpressionAccess();
	}
	
	public ParserRule getXReturnExpressionRule() {
		return getXReturnExpressionAccess().getRule();
	}

	//XTryCatchFinallyExpression returns XExpression:
	//	{XTryCatchFinallyExpression} "try" expression=XExpression (catchClauses+=XCatchClause+ ("finally"
	//	finallyExpression=XExpression)? | "finally" finallyExpression=XExpression);
	public XbaseGrammarAccess.XTryCatchFinallyExpressionElements getXTryCatchFinallyExpressionAccess() {
		return gaXbase.getXTryCatchFinallyExpressionAccess();
	}
	
	public ParserRule getXTryCatchFinallyExpressionRule() {
		return getXTryCatchFinallyExpressionAccess().getRule();
	}

	//XSynchronizedExpression returns XExpression:
	//	=> ({XSynchronizedExpression} "synchronized" "(") param=XExpression ")" expression=XExpression;
	public XbaseGrammarAccess.XSynchronizedExpressionElements getXSynchronizedExpressionAccess() {
		return gaXbase.getXSynchronizedExpressionAccess();
	}
	
	public ParserRule getXSynchronizedExpressionRule() {
		return getXSynchronizedExpressionAccess().getRule();
	}

	//XCatchClause:
	//	"catch" "(" declaredParam=FullJvmFormalParameter ")" expression=XExpression;
	public XbaseGrammarAccess.XCatchClauseElements getXCatchClauseAccess() {
		return gaXbase.getXCatchClauseAccess();
	}
	
	public ParserRule getXCatchClauseRule() {
		return getXCatchClauseAccess().getRule();
	}

	//QualifiedName:
	//	ValidID ("." ValidID)*;
	public XbaseGrammarAccess.QualifiedNameElements getQualifiedNameAccess() {
		return gaXbase.getQualifiedNameAccess();
	}
	
	public ParserRule getQualifiedNameRule() {
		return getQualifiedNameAccess().getRule();
	}

	//Number hidden():
	//	HEX | (INT | DECIMAL) ("." (INT | DECIMAL))?;
	public XbaseGrammarAccess.NumberElements getNumberAccess() {
		return gaXbase.getNumberAccess();
	}
	
	public ParserRule getNumberRule() {
		return getNumberAccess().getRule();
	}

	/// **
	// * Dummy rule, for "better" downwards compatibility, since GrammarAccess generates non-static inner classes, 
	// * which makes downstream grammars break on classloading, when a rule is removed.
	// * / StaticQualifier:
	//	(ValidID "::")+;
	public XbaseGrammarAccess.StaticQualifierElements getStaticQualifierAccess() {
		return gaXbase.getStaticQualifierAccess();
	}
	
	public ParserRule getStaticQualifierRule() {
		return getStaticQualifierAccess().getRule();
	}

	//terminal HEX:
	//	("0x" | "0X") ("0".."9" | "a".."f" | "A".."F" | "_")+ ("#" (("b" | "B") ("i" | "I") | ("l" | "L")))?;
	public TerminalRule getHEXRule() {
		return gaXbase.getHEXRule();
	} 

	//terminal INT returns ecore::EInt:
	//	"0".."9" ("0".."9" | "_")*;
	public TerminalRule getINTRule() {
		return gaXbase.getINTRule();
	} 

	//terminal DECIMAL:
	//	INT (("e" | "E") ("+" | "-")? INT)? (("b" | "B") ("i" | "I" | "d" | "D") | ("l" | "L" | "d" | "D" | "f" | "F"))?;
	public TerminalRule getDECIMALRule() {
		return gaXbase.getDECIMALRule();
	} 

	//JvmTypeReference:
	//	JvmParameterizedTypeReference => ({JvmGenericArrayTypeReference.componentType=current} ArrayBrackets)* |
	//	XFunctionTypeRef;
	public XtypeGrammarAccess.JvmTypeReferenceElements getJvmTypeReferenceAccess() {
		return gaXbase.getJvmTypeReferenceAccess();
	}
	
	public ParserRule getJvmTypeReferenceRule() {
		return getJvmTypeReferenceAccess().getRule();
	}

	//ArrayBrackets:
	//	"[" "]";
	public XtypeGrammarAccess.ArrayBracketsElements getArrayBracketsAccess() {
		return gaXbase.getArrayBracketsAccess();
	}
	
	public ParserRule getArrayBracketsRule() {
		return getArrayBracketsAccess().getRule();
	}

	//XFunctionTypeRef:
	//	("(" (paramTypes+=JvmTypeReference ("," paramTypes+=JvmTypeReference)*)? ")")? "=>" returnType=JvmTypeReference;
	public XtypeGrammarAccess.XFunctionTypeRefElements getXFunctionTypeRefAccess() {
		return gaXbase.getXFunctionTypeRefAccess();
	}
	
	public ParserRule getXFunctionTypeRefRule() {
		return getXFunctionTypeRefAccess().getRule();
	}

	//JvmParameterizedTypeReference:
	//	type=[JvmType|QualifiedName] ("<" arguments+=JvmArgumentTypeReference ("," arguments+=JvmArgumentTypeReference)* ">"
	//	(=> ({JvmInnerTypeReference.outer=current} ".") type=[JvmType|ValidID] ("<" arguments+=JvmArgumentTypeReference (","
	//	arguments+=JvmArgumentTypeReference)* ">")?)*)?;
	public XtypeGrammarAccess.JvmParameterizedTypeReferenceElements getJvmParameterizedTypeReferenceAccess() {
		return gaXbase.getJvmParameterizedTypeReferenceAccess();
	}
	
	public ParserRule getJvmParameterizedTypeReferenceRule() {
		return getJvmParameterizedTypeReferenceAccess().getRule();
	}

	//JvmArgumentTypeReference returns JvmTypeReference:
	//	JvmTypeReference | JvmWildcardTypeReference;
	public XtypeGrammarAccess.JvmArgumentTypeReferenceElements getJvmArgumentTypeReferenceAccess() {
		return gaXbase.getJvmArgumentTypeReferenceAccess();
	}
	
	public ParserRule getJvmArgumentTypeReferenceRule() {
		return getJvmArgumentTypeReferenceAccess().getRule();
	}

	//JvmWildcardTypeReference:
	//	{JvmWildcardTypeReference} "?" (constraints+=JvmUpperBound constraints+=JvmUpperBoundAnded* |
	//	constraints+=JvmLowerBound constraints+=JvmLowerBoundAnded*)?;
	public XtypeGrammarAccess.JvmWildcardTypeReferenceElements getJvmWildcardTypeReferenceAccess() {
		return gaXbase.getJvmWildcardTypeReferenceAccess();
	}
	
	public ParserRule getJvmWildcardTypeReferenceRule() {
		return getJvmWildcardTypeReferenceAccess().getRule();
	}

	//JvmUpperBound:
	//	"extends" typeReference=JvmTypeReference;
	public XtypeGrammarAccess.JvmUpperBoundElements getJvmUpperBoundAccess() {
		return gaXbase.getJvmUpperBoundAccess();
	}
	
	public ParserRule getJvmUpperBoundRule() {
		return getJvmUpperBoundAccess().getRule();
	}

	//JvmUpperBoundAnded returns JvmUpperBound:
	//	"&" typeReference=JvmTypeReference;
	public XtypeGrammarAccess.JvmUpperBoundAndedElements getJvmUpperBoundAndedAccess() {
		return gaXbase.getJvmUpperBoundAndedAccess();
	}
	
	public ParserRule getJvmUpperBoundAndedRule() {
		return getJvmUpperBoundAndedAccess().getRule();
	}

	//JvmLowerBound:
	//	"super" typeReference=JvmTypeReference;
	public XtypeGrammarAccess.JvmLowerBoundElements getJvmLowerBoundAccess() {
		return gaXbase.getJvmLowerBoundAccess();
	}
	
	public ParserRule getJvmLowerBoundRule() {
		return getJvmLowerBoundAccess().getRule();
	}

	//JvmLowerBoundAnded returns JvmLowerBound:
	//	"&" typeReference=JvmTypeReference;
	public XtypeGrammarAccess.JvmLowerBoundAndedElements getJvmLowerBoundAndedAccess() {
		return gaXbase.getJvmLowerBoundAndedAccess();
	}
	
	public ParserRule getJvmLowerBoundAndedRule() {
		return getJvmLowerBoundAndedAccess().getRule();
	}

	//JvmTypeParameter:
	//	name=ValidID (constraints+=JvmUpperBound constraints+=JvmUpperBoundAnded*)?;
	public XtypeGrammarAccess.JvmTypeParameterElements getJvmTypeParameterAccess() {
		return gaXbase.getJvmTypeParameterAccess();
	}
	
	public ParserRule getJvmTypeParameterRule() {
		return getJvmTypeParameterAccess().getRule();
	}

	//QualifiedNameWithWildcard:
	//	QualifiedName "." "*";
	public XtypeGrammarAccess.QualifiedNameWithWildcardElements getQualifiedNameWithWildcardAccess() {
		return gaXbase.getQualifiedNameWithWildcardAccess();
	}
	
	public ParserRule getQualifiedNameWithWildcardRule() {
		return getQualifiedNameWithWildcardAccess().getRule();
	}

	//ValidID:
	//	ID;
	public XtypeGrammarAccess.ValidIDElements getValidIDAccess() {
		return gaXbase.getValidIDAccess();
	}
	
	public ParserRule getValidIDRule() {
		return getValidIDAccess().getRule();
	}

	//XImportSection:
	//	importDeclarations+=XImportDeclaration+;
	public XtypeGrammarAccess.XImportSectionElements getXImportSectionAccess() {
		return gaXbase.getXImportSectionAccess();
	}
	
	public ParserRule getXImportSectionRule() {
		return getXImportSectionAccess().getRule();
	}

	//QualifiedNameInStaticImport:
	//	(ValidID ".")+;
	public XtypeGrammarAccess.QualifiedNameInStaticImportElements getQualifiedNameInStaticImportAccess() {
		return gaXbase.getQualifiedNameInStaticImportAccess();
	}
	
	public ParserRule getQualifiedNameInStaticImportRule() {
		return getQualifiedNameInStaticImportAccess().getRule();
	}

	//terminal ID:
	//	"^"? ("a".."z" | "A".."Z" | "$" | "_") ("a".."z" | "A".."Z" | "$" | "_" | "0".."9")*;
	public TerminalRule getIDRule() {
		return gaXbase.getIDRule();
	} 

	//terminal STRING:
	//	"\"" ("\\" . / * ('b'|'t'|'n'|'f'|'r'|'u'|'"'|"'"|'\\') * / | !("\\" | "\""))* "\""? | "\'" ("\\" .
	//	/ * ('b'|'t'|'n'|'f'|'r'|'u'|'"'|"'"|'\\') * / | !("\\" | "\'"))* "\'"?;
	public TerminalRule getSTRINGRule() {
		return gaXbase.getSTRINGRule();
	} 

	//terminal ML_COMMENT:
	//	"/ *"->"* /";
	public TerminalRule getML_COMMENTRule() {
		return gaXbase.getML_COMMENTRule();
	} 

	//terminal SL_COMMENT:
	//	"//" !("\n" | "\r")* ("\r"? "\n")?;
	public TerminalRule getSL_COMMENTRule() {
		return gaXbase.getSL_COMMENTRule();
	} 

	//terminal WS:
	//	(" " | "\t" | "\r" | "\n")+;
	public TerminalRule getWSRule() {
		return gaXbase.getWSRule();
	} 

	//terminal ANY_OTHER:
	//	.;
	public TerminalRule getANY_OTHERRule() {
		return gaXbase.getANY_OTHERRule();
	} 
}
