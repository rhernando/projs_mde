/*
* generated by Xtext
*/
package org.xtext.petrinet.mydsl1.ui.contentassist.antlr;

import java.util.Collection;
import java.util.Map;
import java.util.HashMap;

import org.antlr.runtime.RecognitionException;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ui.editor.contentassist.antlr.AbstractContentAssistParser;
import org.eclipse.xtext.ui.editor.contentassist.antlr.FollowElement;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;

import com.google.inject.Inject;

import org.xtext.petrinet.mydsl1.services.MyDslGrammarAccess;

public class MyDslParser extends AbstractContentAssistParser {
	
	@Inject
	private MyDslGrammarAccess grammarAccess;
	
	private Map<AbstractElement, String> nameMappings;
	
	@Override
	protected org.xtext.petrinet.mydsl1.ui.contentassist.antlr.internal.InternalMyDslParser createParser() {
		org.xtext.petrinet.mydsl1.ui.contentassist.antlr.internal.InternalMyDslParser result = new org.xtext.petrinet.mydsl1.ui.contentassist.antlr.internal.InternalMyDslParser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}
	
	@Override
	protected String getRuleName(AbstractElement element) {
		if (nameMappings == null) {
			nameMappings = new HashMap<AbstractElement, String>() {
				private static final long serialVersionUID = 1L;
				{
					put(grammarAccess.getEStringAccess().getAlternatives(), "rule__EString__Alternatives");
					put(grammarAccess.getRedPetriAccess().getGroup(), "rule__RedPetri__Group__0");
					put(grammarAccess.getPlaceAccess().getGroup(), "rule__Place__Group__0");
					put(grammarAccess.getPlaceAccess().getGroup_4(), "rule__Place__Group_4__0");
					put(grammarAccess.getPlaceAccess().getGroup_5(), "rule__Place__Group_5__0");
					put(grammarAccess.getPlaceAccess().getGroup_5_3(), "rule__Place__Group_5_3__0");
					put(grammarAccess.getEIntAccess().getGroup(), "rule__EInt__Group__0");
					put(grammarAccess.getTransitionAccess().getGroup(), "rule__Transition__Group__0");
					put(grammarAccess.getTransitionAccess().getGroup_4(), "rule__Transition__Group_4__0");
					put(grammarAccess.getTransitionAccess().getGroup_4_3(), "rule__Transition__Group_4_3__0");
					put(grammarAccess.getRedPetriAccess().getIniTransAssignment_3(), "rule__RedPetri__IniTransAssignment_3");
					put(grammarAccess.getRedPetriAccess().getIniPlaceAssignment_4(), "rule__RedPetri__IniPlaceAssignment_4");
					put(grammarAccess.getPlaceAccess().getNameAssignment_2(), "rule__Place__NameAssignment_2");
					put(grammarAccess.getPlaceAccess().getTokensAssignment_4_1(), "rule__Place__TokensAssignment_4_1");
					put(grammarAccess.getPlaceAccess().getConnectionAssignment_5_2(), "rule__Place__ConnectionAssignment_5_2");
					put(grammarAccess.getPlaceAccess().getConnectionAssignment_5_3_1(), "rule__Place__ConnectionAssignment_5_3_1");
					put(grammarAccess.getTransitionAccess().getNameAssignment_2(), "rule__Transition__NameAssignment_2");
					put(grammarAccess.getTransitionAccess().getConnectionAssignment_4_2(), "rule__Transition__ConnectionAssignment_4_2");
					put(grammarAccess.getTransitionAccess().getConnectionAssignment_4_3_1(), "rule__Transition__ConnectionAssignment_4_3_1");
				}
			};
		}
		return nameMappings.get(element);
	}
	
	@Override
	protected Collection<FollowElement> getFollowElements(AbstractInternalContentAssistParser parser) {
		try {
			org.xtext.petrinet.mydsl1.ui.contentassist.antlr.internal.InternalMyDslParser typedParser = (org.xtext.petrinet.mydsl1.ui.contentassist.antlr.internal.InternalMyDslParser) parser;
			typedParser.entryRuleRedPetri();
			return typedParser.getFollowElements();
		} catch(RecognitionException ex) {
			throw new RuntimeException(ex);
		}		
	}
	
	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] { "RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT" };
	}
	
	public MyDslGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}
	
	public void setGrammarAccess(MyDslGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}
