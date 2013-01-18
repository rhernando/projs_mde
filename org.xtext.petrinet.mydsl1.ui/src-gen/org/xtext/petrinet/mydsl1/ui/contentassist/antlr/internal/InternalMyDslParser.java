package org.xtext.petrinet.mydsl1.ui.contentassist.antlr.internal; 

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.DFA;
import org.xtext.petrinet.mydsl1.services.MyDslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalMyDslParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'RedPetri'", "'{'", "'}'", "'Place'", "'tokens'", "'connection'", "'('", "')'", "','", "'-'", "'Transition'"
    };
    public static final int RULE_ID=5;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__21=21;
    public static final int T__20=20;
    public static final int RULE_SL_COMMENT=8;
    public static final int EOF=-1;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__19=19;
    public static final int RULE_STRING=4;
    public static final int T__16=16;
    public static final int T__15=15;
    public static final int T__18=18;
    public static final int T__17=17;
    public static final int T__12=12;
    public static final int T__11=11;
    public static final int T__14=14;
    public static final int T__13=13;
    public static final int RULE_INT=6;
    public static final int RULE_WS=9;

    // delegates
    // delegators


        public InternalMyDslParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalMyDslParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalMyDslParser.tokenNames; }
    public String getGrammarFileName() { return "../org.xtext.petrinet.mydsl1.ui/src-gen/org/xtext/petrinet/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g"; }


     
     	private MyDslGrammarAccess grammarAccess;
     	
        public void setGrammarAccess(MyDslGrammarAccess grammarAccess) {
        	this.grammarAccess = grammarAccess;
        }
        
        @Override
        protected Grammar getGrammar() {
        	return grammarAccess.getGrammar();
        }
        
        @Override
        protected String getValueForTokenName(String tokenName) {
        	return tokenName;
        }




    // $ANTLR start "entryRuleRedPetri"
    // ../org.xtext.petrinet.mydsl1.ui/src-gen/org/xtext/petrinet/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:60:1: entryRuleRedPetri : ruleRedPetri EOF ;
    public final void entryRuleRedPetri() throws RecognitionException {
        try {
            // ../org.xtext.petrinet.mydsl1.ui/src-gen/org/xtext/petrinet/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:61:1: ( ruleRedPetri EOF )
            // ../org.xtext.petrinet.mydsl1.ui/src-gen/org/xtext/petrinet/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:62:1: ruleRedPetri EOF
            {
             before(grammarAccess.getRedPetriRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleRedPetri_in_entryRuleRedPetri61);
            ruleRedPetri();

            state._fsp--;

             after(grammarAccess.getRedPetriRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleRedPetri68); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleRedPetri"


    // $ANTLR start "ruleRedPetri"
    // ../org.xtext.petrinet.mydsl1.ui/src-gen/org/xtext/petrinet/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:69:1: ruleRedPetri : ( ( rule__RedPetri__Group__0 ) ) ;
    public final void ruleRedPetri() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.petrinet.mydsl1.ui/src-gen/org/xtext/petrinet/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:73:2: ( ( ( rule__RedPetri__Group__0 ) ) )
            // ../org.xtext.petrinet.mydsl1.ui/src-gen/org/xtext/petrinet/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:74:1: ( ( rule__RedPetri__Group__0 ) )
            {
            // ../org.xtext.petrinet.mydsl1.ui/src-gen/org/xtext/petrinet/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:74:1: ( ( rule__RedPetri__Group__0 ) )
            // ../org.xtext.petrinet.mydsl1.ui/src-gen/org/xtext/petrinet/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:75:1: ( rule__RedPetri__Group__0 )
            {
             before(grammarAccess.getRedPetriAccess().getGroup()); 
            // ../org.xtext.petrinet.mydsl1.ui/src-gen/org/xtext/petrinet/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:76:1: ( rule__RedPetri__Group__0 )
            // ../org.xtext.petrinet.mydsl1.ui/src-gen/org/xtext/petrinet/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:76:2: rule__RedPetri__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__RedPetri__Group__0_in_ruleRedPetri94);
            rule__RedPetri__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getRedPetriAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleRedPetri"


    // $ANTLR start "entryRulePlace"
    // ../org.xtext.petrinet.mydsl1.ui/src-gen/org/xtext/petrinet/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:88:1: entryRulePlace : rulePlace EOF ;
    public final void entryRulePlace() throws RecognitionException {
        try {
            // ../org.xtext.petrinet.mydsl1.ui/src-gen/org/xtext/petrinet/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:89:1: ( rulePlace EOF )
            // ../org.xtext.petrinet.mydsl1.ui/src-gen/org/xtext/petrinet/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:90:1: rulePlace EOF
            {
             before(grammarAccess.getPlaceRule()); 
            pushFollow(FollowSets000.FOLLOW_rulePlace_in_entryRulePlace121);
            rulePlace();

            state._fsp--;

             after(grammarAccess.getPlaceRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRulePlace128); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulePlace"


    // $ANTLR start "rulePlace"
    // ../org.xtext.petrinet.mydsl1.ui/src-gen/org/xtext/petrinet/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:97:1: rulePlace : ( ( rule__Place__Group__0 ) ) ;
    public final void rulePlace() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.petrinet.mydsl1.ui/src-gen/org/xtext/petrinet/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:101:2: ( ( ( rule__Place__Group__0 ) ) )
            // ../org.xtext.petrinet.mydsl1.ui/src-gen/org/xtext/petrinet/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:102:1: ( ( rule__Place__Group__0 ) )
            {
            // ../org.xtext.petrinet.mydsl1.ui/src-gen/org/xtext/petrinet/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:102:1: ( ( rule__Place__Group__0 ) )
            // ../org.xtext.petrinet.mydsl1.ui/src-gen/org/xtext/petrinet/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:103:1: ( rule__Place__Group__0 )
            {
             before(grammarAccess.getPlaceAccess().getGroup()); 
            // ../org.xtext.petrinet.mydsl1.ui/src-gen/org/xtext/petrinet/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:104:1: ( rule__Place__Group__0 )
            // ../org.xtext.petrinet.mydsl1.ui/src-gen/org/xtext/petrinet/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:104:2: rule__Place__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__Place__Group__0_in_rulePlace154);
            rule__Place__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPlaceAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePlace"


    // $ANTLR start "entryRuleEString"
    // ../org.xtext.petrinet.mydsl1.ui/src-gen/org/xtext/petrinet/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:116:1: entryRuleEString : ruleEString EOF ;
    public final void entryRuleEString() throws RecognitionException {
        try {
            // ../org.xtext.petrinet.mydsl1.ui/src-gen/org/xtext/petrinet/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:117:1: ( ruleEString EOF )
            // ../org.xtext.petrinet.mydsl1.ui/src-gen/org/xtext/petrinet/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:118:1: ruleEString EOF
            {
             before(grammarAccess.getEStringRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_entryRuleEString181);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getEStringRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEString188); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleEString"


    // $ANTLR start "ruleEString"
    // ../org.xtext.petrinet.mydsl1.ui/src-gen/org/xtext/petrinet/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:125:1: ruleEString : ( ( rule__EString__Alternatives ) ) ;
    public final void ruleEString() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.petrinet.mydsl1.ui/src-gen/org/xtext/petrinet/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:129:2: ( ( ( rule__EString__Alternatives ) ) )
            // ../org.xtext.petrinet.mydsl1.ui/src-gen/org/xtext/petrinet/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:130:1: ( ( rule__EString__Alternatives ) )
            {
            // ../org.xtext.petrinet.mydsl1.ui/src-gen/org/xtext/petrinet/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:130:1: ( ( rule__EString__Alternatives ) )
            // ../org.xtext.petrinet.mydsl1.ui/src-gen/org/xtext/petrinet/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:131:1: ( rule__EString__Alternatives )
            {
             before(grammarAccess.getEStringAccess().getAlternatives()); 
            // ../org.xtext.petrinet.mydsl1.ui/src-gen/org/xtext/petrinet/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:132:1: ( rule__EString__Alternatives )
            // ../org.xtext.petrinet.mydsl1.ui/src-gen/org/xtext/petrinet/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:132:2: rule__EString__Alternatives
            {
            pushFollow(FollowSets000.FOLLOW_rule__EString__Alternatives_in_ruleEString214);
            rule__EString__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getEStringAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEString"


    // $ANTLR start "entryRuleEInt"
    // ../org.xtext.petrinet.mydsl1.ui/src-gen/org/xtext/petrinet/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:144:1: entryRuleEInt : ruleEInt EOF ;
    public final void entryRuleEInt() throws RecognitionException {
        try {
            // ../org.xtext.petrinet.mydsl1.ui/src-gen/org/xtext/petrinet/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:145:1: ( ruleEInt EOF )
            // ../org.xtext.petrinet.mydsl1.ui/src-gen/org/xtext/petrinet/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:146:1: ruleEInt EOF
            {
             before(grammarAccess.getEIntRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleEInt_in_entryRuleEInt241);
            ruleEInt();

            state._fsp--;

             after(grammarAccess.getEIntRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEInt248); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleEInt"


    // $ANTLR start "ruleEInt"
    // ../org.xtext.petrinet.mydsl1.ui/src-gen/org/xtext/petrinet/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:153:1: ruleEInt : ( ( rule__EInt__Group__0 ) ) ;
    public final void ruleEInt() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.petrinet.mydsl1.ui/src-gen/org/xtext/petrinet/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:157:2: ( ( ( rule__EInt__Group__0 ) ) )
            // ../org.xtext.petrinet.mydsl1.ui/src-gen/org/xtext/petrinet/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:158:1: ( ( rule__EInt__Group__0 ) )
            {
            // ../org.xtext.petrinet.mydsl1.ui/src-gen/org/xtext/petrinet/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:158:1: ( ( rule__EInt__Group__0 ) )
            // ../org.xtext.petrinet.mydsl1.ui/src-gen/org/xtext/petrinet/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:159:1: ( rule__EInt__Group__0 )
            {
             before(grammarAccess.getEIntAccess().getGroup()); 
            // ../org.xtext.petrinet.mydsl1.ui/src-gen/org/xtext/petrinet/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:160:1: ( rule__EInt__Group__0 )
            // ../org.xtext.petrinet.mydsl1.ui/src-gen/org/xtext/petrinet/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:160:2: rule__EInt__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__EInt__Group__0_in_ruleEInt274);
            rule__EInt__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getEIntAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEInt"


    // $ANTLR start "entryRuleTransition"
    // ../org.xtext.petrinet.mydsl1.ui/src-gen/org/xtext/petrinet/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:172:1: entryRuleTransition : ruleTransition EOF ;
    public final void entryRuleTransition() throws RecognitionException {
        try {
            // ../org.xtext.petrinet.mydsl1.ui/src-gen/org/xtext/petrinet/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:173:1: ( ruleTransition EOF )
            // ../org.xtext.petrinet.mydsl1.ui/src-gen/org/xtext/petrinet/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:174:1: ruleTransition EOF
            {
             before(grammarAccess.getTransitionRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleTransition_in_entryRuleTransition301);
            ruleTransition();

            state._fsp--;

             after(grammarAccess.getTransitionRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleTransition308); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleTransition"


    // $ANTLR start "ruleTransition"
    // ../org.xtext.petrinet.mydsl1.ui/src-gen/org/xtext/petrinet/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:181:1: ruleTransition : ( ( rule__Transition__Group__0 ) ) ;
    public final void ruleTransition() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.petrinet.mydsl1.ui/src-gen/org/xtext/petrinet/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:185:2: ( ( ( rule__Transition__Group__0 ) ) )
            // ../org.xtext.petrinet.mydsl1.ui/src-gen/org/xtext/petrinet/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:186:1: ( ( rule__Transition__Group__0 ) )
            {
            // ../org.xtext.petrinet.mydsl1.ui/src-gen/org/xtext/petrinet/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:186:1: ( ( rule__Transition__Group__0 ) )
            // ../org.xtext.petrinet.mydsl1.ui/src-gen/org/xtext/petrinet/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:187:1: ( rule__Transition__Group__0 )
            {
             before(grammarAccess.getTransitionAccess().getGroup()); 
            // ../org.xtext.petrinet.mydsl1.ui/src-gen/org/xtext/petrinet/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:188:1: ( rule__Transition__Group__0 )
            // ../org.xtext.petrinet.mydsl1.ui/src-gen/org/xtext/petrinet/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:188:2: rule__Transition__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__Transition__Group__0_in_ruleTransition334);
            rule__Transition__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getTransitionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTransition"


    // $ANTLR start "rule__EString__Alternatives"
    // ../org.xtext.petrinet.mydsl1.ui/src-gen/org/xtext/petrinet/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:200:1: rule__EString__Alternatives : ( ( RULE_STRING ) | ( RULE_ID ) );
    public final void rule__EString__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.petrinet.mydsl1.ui/src-gen/org/xtext/petrinet/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:204:1: ( ( RULE_STRING ) | ( RULE_ID ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==RULE_STRING) ) {
                alt1=1;
            }
            else if ( (LA1_0==RULE_ID) ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // ../org.xtext.petrinet.mydsl1.ui/src-gen/org/xtext/petrinet/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:205:1: ( RULE_STRING )
                    {
                    // ../org.xtext.petrinet.mydsl1.ui/src-gen/org/xtext/petrinet/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:205:1: ( RULE_STRING )
                    // ../org.xtext.petrinet.mydsl1.ui/src-gen/org/xtext/petrinet/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:206:1: RULE_STRING
                    {
                     before(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 
                    match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_rule__EString__Alternatives370); 
                     after(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.petrinet.mydsl1.ui/src-gen/org/xtext/petrinet/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:211:6: ( RULE_ID )
                    {
                    // ../org.xtext.petrinet.mydsl1.ui/src-gen/org/xtext/petrinet/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:211:6: ( RULE_ID )
                    // ../org.xtext.petrinet.mydsl1.ui/src-gen/org/xtext/petrinet/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:212:1: RULE_ID
                    {
                     before(grammarAccess.getEStringAccess().getIDTerminalRuleCall_1()); 
                    match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rule__EString__Alternatives387); 
                     after(grammarAccess.getEStringAccess().getIDTerminalRuleCall_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EString__Alternatives"


    // $ANTLR start "rule__RedPetri__Group__0"
    // ../org.xtext.petrinet.mydsl1.ui/src-gen/org/xtext/petrinet/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:224:1: rule__RedPetri__Group__0 : rule__RedPetri__Group__0__Impl rule__RedPetri__Group__1 ;
    public final void rule__RedPetri__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.petrinet.mydsl1.ui/src-gen/org/xtext/petrinet/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:228:1: ( rule__RedPetri__Group__0__Impl rule__RedPetri__Group__1 )
            // ../org.xtext.petrinet.mydsl1.ui/src-gen/org/xtext/petrinet/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:229:2: rule__RedPetri__Group__0__Impl rule__RedPetri__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__RedPetri__Group__0__Impl_in_rule__RedPetri__Group__0417);
            rule__RedPetri__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__RedPetri__Group__1_in_rule__RedPetri__Group__0420);
            rule__RedPetri__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RedPetri__Group__0"


    // $ANTLR start "rule__RedPetri__Group__0__Impl"
    // ../org.xtext.petrinet.mydsl1.ui/src-gen/org/xtext/petrinet/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:236:1: rule__RedPetri__Group__0__Impl : ( () ) ;
    public final void rule__RedPetri__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.petrinet.mydsl1.ui/src-gen/org/xtext/petrinet/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:240:1: ( ( () ) )
            // ../org.xtext.petrinet.mydsl1.ui/src-gen/org/xtext/petrinet/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:241:1: ( () )
            {
            // ../org.xtext.petrinet.mydsl1.ui/src-gen/org/xtext/petrinet/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:241:1: ( () )
            // ../org.xtext.petrinet.mydsl1.ui/src-gen/org/xtext/petrinet/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:242:1: ()
            {
             before(grammarAccess.getRedPetriAccess().getRedPetriAction_0()); 
            // ../org.xtext.petrinet.mydsl1.ui/src-gen/org/xtext/petrinet/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:243:1: ()
            // ../org.xtext.petrinet.mydsl1.ui/src-gen/org/xtext/petrinet/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:245:1: 
            {
            }

             after(grammarAccess.getRedPetriAccess().getRedPetriAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RedPetri__Group__0__Impl"


    // $ANTLR start "rule__RedPetri__Group__1"
    // ../org.xtext.petrinet.mydsl1.ui/src-gen/org/xtext/petrinet/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:255:1: rule__RedPetri__Group__1 : rule__RedPetri__Group__1__Impl rule__RedPetri__Group__2 ;
    public final void rule__RedPetri__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.petrinet.mydsl1.ui/src-gen/org/xtext/petrinet/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:259:1: ( rule__RedPetri__Group__1__Impl rule__RedPetri__Group__2 )
            // ../org.xtext.petrinet.mydsl1.ui/src-gen/org/xtext/petrinet/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:260:2: rule__RedPetri__Group__1__Impl rule__RedPetri__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__RedPetri__Group__1__Impl_in_rule__RedPetri__Group__1478);
            rule__RedPetri__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__RedPetri__Group__2_in_rule__RedPetri__Group__1481);
            rule__RedPetri__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RedPetri__Group__1"


    // $ANTLR start "rule__RedPetri__Group__1__Impl"
    // ../org.xtext.petrinet.mydsl1.ui/src-gen/org/xtext/petrinet/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:267:1: rule__RedPetri__Group__1__Impl : ( 'RedPetri' ) ;
    public final void rule__RedPetri__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.petrinet.mydsl1.ui/src-gen/org/xtext/petrinet/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:271:1: ( ( 'RedPetri' ) )
            // ../org.xtext.petrinet.mydsl1.ui/src-gen/org/xtext/petrinet/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:272:1: ( 'RedPetri' )
            {
            // ../org.xtext.petrinet.mydsl1.ui/src-gen/org/xtext/petrinet/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:272:1: ( 'RedPetri' )
            // ../org.xtext.petrinet.mydsl1.ui/src-gen/org/xtext/petrinet/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:273:1: 'RedPetri'
            {
             before(grammarAccess.getRedPetriAccess().getRedPetriKeyword_1()); 
            match(input,11,FollowSets000.FOLLOW_11_in_rule__RedPetri__Group__1__Impl509); 
             after(grammarAccess.getRedPetriAccess().getRedPetriKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RedPetri__Group__1__Impl"


    // $ANTLR start "rule__RedPetri__Group__2"
    // ../org.xtext.petrinet.mydsl1.ui/src-gen/org/xtext/petrinet/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:286:1: rule__RedPetri__Group__2 : rule__RedPetri__Group__2__Impl rule__RedPetri__Group__3 ;
    public final void rule__RedPetri__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.petrinet.mydsl1.ui/src-gen/org/xtext/petrinet/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:290:1: ( rule__RedPetri__Group__2__Impl rule__RedPetri__Group__3 )
            // ../org.xtext.petrinet.mydsl1.ui/src-gen/org/xtext/petrinet/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:291:2: rule__RedPetri__Group__2__Impl rule__RedPetri__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__RedPetri__Group__2__Impl_in_rule__RedPetri__Group__2540);
            rule__RedPetri__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__RedPetri__Group__3_in_rule__RedPetri__Group__2543);
            rule__RedPetri__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RedPetri__Group__2"


    // $ANTLR start "rule__RedPetri__Group__2__Impl"
    // ../org.xtext.petrinet.mydsl1.ui/src-gen/org/xtext/petrinet/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:298:1: rule__RedPetri__Group__2__Impl : ( '{' ) ;
    public final void rule__RedPetri__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.petrinet.mydsl1.ui/src-gen/org/xtext/petrinet/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:302:1: ( ( '{' ) )
            // ../org.xtext.petrinet.mydsl1.ui/src-gen/org/xtext/petrinet/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:303:1: ( '{' )
            {
            // ../org.xtext.petrinet.mydsl1.ui/src-gen/org/xtext/petrinet/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:303:1: ( '{' )
            // ../org.xtext.petrinet.mydsl1.ui/src-gen/org/xtext/petrinet/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:304:1: '{'
            {
             before(grammarAccess.getRedPetriAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,12,FollowSets000.FOLLOW_12_in_rule__RedPetri__Group__2__Impl571); 
             after(grammarAccess.getRedPetriAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RedPetri__Group__2__Impl"


    // $ANTLR start "rule__RedPetri__Group__3"
    // ../org.xtext.petrinet.mydsl1.ui/src-gen/org/xtext/petrinet/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:317:1: rule__RedPetri__Group__3 : rule__RedPetri__Group__3__Impl rule__RedPetri__Group__4 ;
    public final void rule__RedPetri__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.petrinet.mydsl1.ui/src-gen/org/xtext/petrinet/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:321:1: ( rule__RedPetri__Group__3__Impl rule__RedPetri__Group__4 )
            // ../org.xtext.petrinet.mydsl1.ui/src-gen/org/xtext/petrinet/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:322:2: rule__RedPetri__Group__3__Impl rule__RedPetri__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__RedPetri__Group__3__Impl_in_rule__RedPetri__Group__3602);
            rule__RedPetri__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__RedPetri__Group__4_in_rule__RedPetri__Group__3605);
            rule__RedPetri__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RedPetri__Group__3"


    // $ANTLR start "rule__RedPetri__Group__3__Impl"
    // ../org.xtext.petrinet.mydsl1.ui/src-gen/org/xtext/petrinet/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:329:1: rule__RedPetri__Group__3__Impl : ( ( rule__RedPetri__IniTransAssignment_3 )? ) ;
    public final void rule__RedPetri__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.petrinet.mydsl1.ui/src-gen/org/xtext/petrinet/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:333:1: ( ( ( rule__RedPetri__IniTransAssignment_3 )? ) )
            // ../org.xtext.petrinet.mydsl1.ui/src-gen/org/xtext/petrinet/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:334:1: ( ( rule__RedPetri__IniTransAssignment_3 )? )
            {
            // ../org.xtext.petrinet.mydsl1.ui/src-gen/org/xtext/petrinet/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:334:1: ( ( rule__RedPetri__IniTransAssignment_3 )? )
            // ../org.xtext.petrinet.mydsl1.ui/src-gen/org/xtext/petrinet/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:335:1: ( rule__RedPetri__IniTransAssignment_3 )?
            {
             before(grammarAccess.getRedPetriAccess().getIniTransAssignment_3()); 
            // ../org.xtext.petrinet.mydsl1.ui/src-gen/org/xtext/petrinet/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:336:1: ( rule__RedPetri__IniTransAssignment_3 )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==21) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // ../org.xtext.petrinet.mydsl1.ui/src-gen/org/xtext/petrinet/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:336:2: rule__RedPetri__IniTransAssignment_3
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__RedPetri__IniTransAssignment_3_in_rule__RedPetri__Group__3__Impl632);
                    rule__RedPetri__IniTransAssignment_3();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getRedPetriAccess().getIniTransAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RedPetri__Group__3__Impl"


    // $ANTLR start "rule__RedPetri__Group__4"
    // ../org.xtext.petrinet.mydsl1.ui/src-gen/org/xtext/petrinet/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:346:1: rule__RedPetri__Group__4 : rule__RedPetri__Group__4__Impl rule__RedPetri__Group__5 ;
    public final void rule__RedPetri__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.petrinet.mydsl1.ui/src-gen/org/xtext/petrinet/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:350:1: ( rule__RedPetri__Group__4__Impl rule__RedPetri__Group__5 )
            // ../org.xtext.petrinet.mydsl1.ui/src-gen/org/xtext/petrinet/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:351:2: rule__RedPetri__Group__4__Impl rule__RedPetri__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_rule__RedPetri__Group__4__Impl_in_rule__RedPetri__Group__4663);
            rule__RedPetri__Group__4__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__RedPetri__Group__5_in_rule__RedPetri__Group__4666);
            rule__RedPetri__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RedPetri__Group__4"


    // $ANTLR start "rule__RedPetri__Group__4__Impl"
    // ../org.xtext.petrinet.mydsl1.ui/src-gen/org/xtext/petrinet/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:358:1: rule__RedPetri__Group__4__Impl : ( ( rule__RedPetri__IniPlaceAssignment_4 )? ) ;
    public final void rule__RedPetri__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.petrinet.mydsl1.ui/src-gen/org/xtext/petrinet/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:362:1: ( ( ( rule__RedPetri__IniPlaceAssignment_4 )? ) )
            // ../org.xtext.petrinet.mydsl1.ui/src-gen/org/xtext/petrinet/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:363:1: ( ( rule__RedPetri__IniPlaceAssignment_4 )? )
            {
            // ../org.xtext.petrinet.mydsl1.ui/src-gen/org/xtext/petrinet/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:363:1: ( ( rule__RedPetri__IniPlaceAssignment_4 )? )
            // ../org.xtext.petrinet.mydsl1.ui/src-gen/org/xtext/petrinet/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:364:1: ( rule__RedPetri__IniPlaceAssignment_4 )?
            {
             before(grammarAccess.getRedPetriAccess().getIniPlaceAssignment_4()); 
            // ../org.xtext.petrinet.mydsl1.ui/src-gen/org/xtext/petrinet/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:365:1: ( rule__RedPetri__IniPlaceAssignment_4 )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==14) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // ../org.xtext.petrinet.mydsl1.ui/src-gen/org/xtext/petrinet/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:365:2: rule__RedPetri__IniPlaceAssignment_4
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__RedPetri__IniPlaceAssignment_4_in_rule__RedPetri__Group__4__Impl693);
                    rule__RedPetri__IniPlaceAssignment_4();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getRedPetriAccess().getIniPlaceAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RedPetri__Group__4__Impl"


    // $ANTLR start "rule__RedPetri__Group__5"
    // ../org.xtext.petrinet.mydsl1.ui/src-gen/org/xtext/petrinet/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:375:1: rule__RedPetri__Group__5 : rule__RedPetri__Group__5__Impl ;
    public final void rule__RedPetri__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.petrinet.mydsl1.ui/src-gen/org/xtext/petrinet/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:379:1: ( rule__RedPetri__Group__5__Impl )
            // ../org.xtext.petrinet.mydsl1.ui/src-gen/org/xtext/petrinet/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:380:2: rule__RedPetri__Group__5__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__RedPetri__Group__5__Impl_in_rule__RedPetri__Group__5724);
            rule__RedPetri__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RedPetri__Group__5"


    // $ANTLR start "rule__RedPetri__Group__5__Impl"
    // ../org.xtext.petrinet.mydsl1.ui/src-gen/org/xtext/petrinet/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:386:1: rule__RedPetri__Group__5__Impl : ( '}' ) ;
    public final void rule__RedPetri__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.petrinet.mydsl1.ui/src-gen/org/xtext/petrinet/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:390:1: ( ( '}' ) )
            // ../org.xtext.petrinet.mydsl1.ui/src-gen/org/xtext/petrinet/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:391:1: ( '}' )
            {
            // ../org.xtext.petrinet.mydsl1.ui/src-gen/org/xtext/petrinet/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:391:1: ( '}' )
            // ../org.xtext.petrinet.mydsl1.ui/src-gen/org/xtext/petrinet/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:392:1: '}'
            {
             before(grammarAccess.getRedPetriAccess().getRightCurlyBracketKeyword_5()); 
            match(input,13,FollowSets000.FOLLOW_13_in_rule__RedPetri__Group__5__Impl752); 
             after(grammarAccess.getRedPetriAccess().getRightCurlyBracketKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RedPetri__Group__5__Impl"


    // $ANTLR start "rule__Place__Group__0"
    // ../org.xtext.petrinet.mydsl1.ui/src-gen/org/xtext/petrinet/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:417:1: rule__Place__Group__0 : rule__Place__Group__0__Impl rule__Place__Group__1 ;
    public final void rule__Place__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.petrinet.mydsl1.ui/src-gen/org/xtext/petrinet/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:421:1: ( rule__Place__Group__0__Impl rule__Place__Group__1 )
            // ../org.xtext.petrinet.mydsl1.ui/src-gen/org/xtext/petrinet/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:422:2: rule__Place__Group__0__Impl rule__Place__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Place__Group__0__Impl_in_rule__Place__Group__0795);
            rule__Place__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Place__Group__1_in_rule__Place__Group__0798);
            rule__Place__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Place__Group__0"


    // $ANTLR start "rule__Place__Group__0__Impl"
    // ../org.xtext.petrinet.mydsl1.ui/src-gen/org/xtext/petrinet/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:429:1: rule__Place__Group__0__Impl : ( () ) ;
    public final void rule__Place__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.petrinet.mydsl1.ui/src-gen/org/xtext/petrinet/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:433:1: ( ( () ) )
            // ../org.xtext.petrinet.mydsl1.ui/src-gen/org/xtext/petrinet/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:434:1: ( () )
            {
            // ../org.xtext.petrinet.mydsl1.ui/src-gen/org/xtext/petrinet/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:434:1: ( () )
            // ../org.xtext.petrinet.mydsl1.ui/src-gen/org/xtext/petrinet/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:435:1: ()
            {
             before(grammarAccess.getPlaceAccess().getPlaceAction_0()); 
            // ../org.xtext.petrinet.mydsl1.ui/src-gen/org/xtext/petrinet/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:436:1: ()
            // ../org.xtext.petrinet.mydsl1.ui/src-gen/org/xtext/petrinet/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:438:1: 
            {
            }

             after(grammarAccess.getPlaceAccess().getPlaceAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Place__Group__0__Impl"


    // $ANTLR start "rule__Place__Group__1"
    // ../org.xtext.petrinet.mydsl1.ui/src-gen/org/xtext/petrinet/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:448:1: rule__Place__Group__1 : rule__Place__Group__1__Impl rule__Place__Group__2 ;
    public final void rule__Place__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.petrinet.mydsl1.ui/src-gen/org/xtext/petrinet/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:452:1: ( rule__Place__Group__1__Impl rule__Place__Group__2 )
            // ../org.xtext.petrinet.mydsl1.ui/src-gen/org/xtext/petrinet/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:453:2: rule__Place__Group__1__Impl rule__Place__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Place__Group__1__Impl_in_rule__Place__Group__1856);
            rule__Place__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Place__Group__2_in_rule__Place__Group__1859);
            rule__Place__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Place__Group__1"


    // $ANTLR start "rule__Place__Group__1__Impl"
    // ../org.xtext.petrinet.mydsl1.ui/src-gen/org/xtext/petrinet/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:460:1: rule__Place__Group__1__Impl : ( 'Place' ) ;
    public final void rule__Place__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.petrinet.mydsl1.ui/src-gen/org/xtext/petrinet/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:464:1: ( ( 'Place' ) )
            // ../org.xtext.petrinet.mydsl1.ui/src-gen/org/xtext/petrinet/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:465:1: ( 'Place' )
            {
            // ../org.xtext.petrinet.mydsl1.ui/src-gen/org/xtext/petrinet/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:465:1: ( 'Place' )
            // ../org.xtext.petrinet.mydsl1.ui/src-gen/org/xtext/petrinet/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:466:1: 'Place'
            {
             before(grammarAccess.getPlaceAccess().getPlaceKeyword_1()); 
            match(input,14,FollowSets000.FOLLOW_14_in_rule__Place__Group__1__Impl887); 
             after(grammarAccess.getPlaceAccess().getPlaceKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Place__Group__1__Impl"


    // $ANTLR start "rule__Place__Group__2"
    // ../org.xtext.petrinet.mydsl1.ui/src-gen/org/xtext/petrinet/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:479:1: rule__Place__Group__2 : rule__Place__Group__2__Impl rule__Place__Group__3 ;
    public final void rule__Place__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.petrinet.mydsl1.ui/src-gen/org/xtext/petrinet/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:483:1: ( rule__Place__Group__2__Impl rule__Place__Group__3 )
            // ../org.xtext.petrinet.mydsl1.ui/src-gen/org/xtext/petrinet/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:484:2: rule__Place__Group__2__Impl rule__Place__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Place__Group__2__Impl_in_rule__Place__Group__2918);
            rule__Place__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Place__Group__3_in_rule__Place__Group__2921);
            rule__Place__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Place__Group__2"


    // $ANTLR start "rule__Place__Group__2__Impl"
    // ../org.xtext.petrinet.mydsl1.ui/src-gen/org/xtext/petrinet/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:491:1: rule__Place__Group__2__Impl : ( ( rule__Place__NameAssignment_2 ) ) ;
    public final void rule__Place__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.petrinet.mydsl1.ui/src-gen/org/xtext/petrinet/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:495:1: ( ( ( rule__Place__NameAssignment_2 ) ) )
            // ../org.xtext.petrinet.mydsl1.ui/src-gen/org/xtext/petrinet/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:496:1: ( ( rule__Place__NameAssignment_2 ) )
            {
            // ../org.xtext.petrinet.mydsl1.ui/src-gen/org/xtext/petrinet/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:496:1: ( ( rule__Place__NameAssignment_2 ) )
            // ../org.xtext.petrinet.mydsl1.ui/src-gen/org/xtext/petrinet/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:497:1: ( rule__Place__NameAssignment_2 )
            {
             before(grammarAccess.getPlaceAccess().getNameAssignment_2()); 
            // ../org.xtext.petrinet.mydsl1.ui/src-gen/org/xtext/petrinet/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:498:1: ( rule__Place__NameAssignment_2 )
            // ../org.xtext.petrinet.mydsl1.ui/src-gen/org/xtext/petrinet/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:498:2: rule__Place__NameAssignment_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Place__NameAssignment_2_in_rule__Place__Group__2__Impl948);
            rule__Place__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getPlaceAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Place__Group__2__Impl"


    // $ANTLR start "rule__Place__Group__3"
    // ../org.xtext.petrinet.mydsl1.ui/src-gen/org/xtext/petrinet/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:508:1: rule__Place__Group__3 : rule__Place__Group__3__Impl rule__Place__Group__4 ;
    public final void rule__Place__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.petrinet.mydsl1.ui/src-gen/org/xtext/petrinet/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:512:1: ( rule__Place__Group__3__Impl rule__Place__Group__4 )
            // ../org.xtext.petrinet.mydsl1.ui/src-gen/org/xtext/petrinet/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:513:2: rule__Place__Group__3__Impl rule__Place__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__Place__Group__3__Impl_in_rule__Place__Group__3978);
            rule__Place__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Place__Group__4_in_rule__Place__Group__3981);
            rule__Place__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Place__Group__3"


    // $ANTLR start "rule__Place__Group__3__Impl"
    // ../org.xtext.petrinet.mydsl1.ui/src-gen/org/xtext/petrinet/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:520:1: rule__Place__Group__3__Impl : ( '{' ) ;
    public final void rule__Place__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.petrinet.mydsl1.ui/src-gen/org/xtext/petrinet/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:524:1: ( ( '{' ) )
            // ../org.xtext.petrinet.mydsl1.ui/src-gen/org/xtext/petrinet/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:525:1: ( '{' )
            {
            // ../org.xtext.petrinet.mydsl1.ui/src-gen/org/xtext/petrinet/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:525:1: ( '{' )
            // ../org.xtext.petrinet.mydsl1.ui/src-gen/org/xtext/petrinet/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:526:1: '{'
            {
             before(grammarAccess.getPlaceAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,12,FollowSets000.FOLLOW_12_in_rule__Place__Group__3__Impl1009); 
             after(grammarAccess.getPlaceAccess().getLeftCurlyBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Place__Group__3__Impl"


    // $ANTLR start "rule__Place__Group__4"
    // ../org.xtext.petrinet.mydsl1.ui/src-gen/org/xtext/petrinet/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:539:1: rule__Place__Group__4 : rule__Place__Group__4__Impl rule__Place__Group__5 ;
    public final void rule__Place__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.petrinet.mydsl1.ui/src-gen/org/xtext/petrinet/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:543:1: ( rule__Place__Group__4__Impl rule__Place__Group__5 )
            // ../org.xtext.petrinet.mydsl1.ui/src-gen/org/xtext/petrinet/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:544:2: rule__Place__Group__4__Impl rule__Place__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_rule__Place__Group__4__Impl_in_rule__Place__Group__41040);
            rule__Place__Group__4__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Place__Group__5_in_rule__Place__Group__41043);
            rule__Place__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Place__Group__4"


    // $ANTLR start "rule__Place__Group__4__Impl"
    // ../org.xtext.petrinet.mydsl1.ui/src-gen/org/xtext/petrinet/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:551:1: rule__Place__Group__4__Impl : ( ( rule__Place__Group_4__0 )? ) ;
    public final void rule__Place__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.petrinet.mydsl1.ui/src-gen/org/xtext/petrinet/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:555:1: ( ( ( rule__Place__Group_4__0 )? ) )
            // ../org.xtext.petrinet.mydsl1.ui/src-gen/org/xtext/petrinet/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:556:1: ( ( rule__Place__Group_4__0 )? )
            {
            // ../org.xtext.petrinet.mydsl1.ui/src-gen/org/xtext/petrinet/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:556:1: ( ( rule__Place__Group_4__0 )? )
            // ../org.xtext.petrinet.mydsl1.ui/src-gen/org/xtext/petrinet/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:557:1: ( rule__Place__Group_4__0 )?
            {
             before(grammarAccess.getPlaceAccess().getGroup_4()); 
            // ../org.xtext.petrinet.mydsl1.ui/src-gen/org/xtext/petrinet/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:558:1: ( rule__Place__Group_4__0 )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==15) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // ../org.xtext.petrinet.mydsl1.ui/src-gen/org/xtext/petrinet/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:558:2: rule__Place__Group_4__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Place__Group_4__0_in_rule__Place__Group__4__Impl1070);
                    rule__Place__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getPlaceAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Place__Group__4__Impl"


    // $ANTLR start "rule__Place__Group__5"
    // ../org.xtext.petrinet.mydsl1.ui/src-gen/org/xtext/petrinet/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:568:1: rule__Place__Group__5 : rule__Place__Group__5__Impl rule__Place__Group__6 ;
    public final void rule__Place__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.petrinet.mydsl1.ui/src-gen/org/xtext/petrinet/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:572:1: ( rule__Place__Group__5__Impl rule__Place__Group__6 )
            // ../org.xtext.petrinet.mydsl1.ui/src-gen/org/xtext/petrinet/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:573:2: rule__Place__Group__5__Impl rule__Place__Group__6
            {
            pushFollow(FollowSets000.FOLLOW_rule__Place__Group__5__Impl_in_rule__Place__Group__51101);
            rule__Place__Group__5__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Place__Group__6_in_rule__Place__Group__51104);
            rule__Place__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Place__Group__5"


    // $ANTLR start "rule__Place__Group__5__Impl"
    // ../org.xtext.petrinet.mydsl1.ui/src-gen/org/xtext/petrinet/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:580:1: rule__Place__Group__5__Impl : ( ( rule__Place__Group_5__0 )? ) ;
    public final void rule__Place__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.petrinet.mydsl1.ui/src-gen/org/xtext/petrinet/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:584:1: ( ( ( rule__Place__Group_5__0 )? ) )
            // ../org.xtext.petrinet.mydsl1.ui/src-gen/org/xtext/petrinet/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:585:1: ( ( rule__Place__Group_5__0 )? )
            {
            // ../org.xtext.petrinet.mydsl1.ui/src-gen/org/xtext/petrinet/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:585:1: ( ( rule__Place__Group_5__0 )? )
            // ../org.xtext.petrinet.mydsl1.ui/src-gen/org/xtext/petrinet/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:586:1: ( rule__Place__Group_5__0 )?
            {
             before(grammarAccess.getPlaceAccess().getGroup_5()); 
            // ../org.xtext.petrinet.mydsl1.ui/src-gen/org/xtext/petrinet/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:587:1: ( rule__Place__Group_5__0 )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==16) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // ../org.xtext.petrinet.mydsl1.ui/src-gen/org/xtext/petrinet/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:587:2: rule__Place__Group_5__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Place__Group_5__0_in_rule__Place__Group__5__Impl1131);
                    rule__Place__Group_5__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getPlaceAccess().getGroup_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Place__Group__5__Impl"


    // $ANTLR start "rule__Place__Group__6"
    // ../org.xtext.petrinet.mydsl1.ui/src-gen/org/xtext/petrinet/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:597:1: rule__Place__Group__6 : rule__Place__Group__6__Impl ;
    public final void rule__Place__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.petrinet.mydsl1.ui/src-gen/org/xtext/petrinet/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:601:1: ( rule__Place__Group__6__Impl )
            // ../org.xtext.petrinet.mydsl1.ui/src-gen/org/xtext/petrinet/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:602:2: rule__Place__Group__6__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Place__Group__6__Impl_in_rule__Place__Group__61162);
            rule__Place__Group__6__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Place__Group__6"


    // $ANTLR start "rule__Place__Group__6__Impl"
    // ../org.xtext.petrinet.mydsl1.ui/src-gen/org/xtext/petrinet/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:608:1: rule__Place__Group__6__Impl : ( '}' ) ;
    public final void rule__Place__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.petrinet.mydsl1.ui/src-gen/org/xtext/petrinet/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:612:1: ( ( '}' ) )
            // ../org.xtext.petrinet.mydsl1.ui/src-gen/org/xtext/petrinet/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:613:1: ( '}' )
            {
            // ../org.xtext.petrinet.mydsl1.ui/src-gen/org/xtext/petrinet/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:613:1: ( '}' )
            // ../org.xtext.petrinet.mydsl1.ui/src-gen/org/xtext/petrinet/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:614:1: '}'
            {
             before(grammarAccess.getPlaceAccess().getRightCurlyBracketKeyword_6()); 
            match(input,13,FollowSets000.FOLLOW_13_in_rule__Place__Group__6__Impl1190); 
             after(grammarAccess.getPlaceAccess().getRightCurlyBracketKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Place__Group__6__Impl"


    // $ANTLR start "rule__Place__Group_4__0"
    // ../org.xtext.petrinet.mydsl1.ui/src-gen/org/xtext/petrinet/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:641:1: rule__Place__Group_4__0 : rule__Place__Group_4__0__Impl rule__Place__Group_4__1 ;
    public final void rule__Place__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.petrinet.mydsl1.ui/src-gen/org/xtext/petrinet/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:645:1: ( rule__Place__Group_4__0__Impl rule__Place__Group_4__1 )
            // ../org.xtext.petrinet.mydsl1.ui/src-gen/org/xtext/petrinet/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:646:2: rule__Place__Group_4__0__Impl rule__Place__Group_4__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Place__Group_4__0__Impl_in_rule__Place__Group_4__01235);
            rule__Place__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Place__Group_4__1_in_rule__Place__Group_4__01238);
            rule__Place__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Place__Group_4__0"


    // $ANTLR start "rule__Place__Group_4__0__Impl"
    // ../org.xtext.petrinet.mydsl1.ui/src-gen/org/xtext/petrinet/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:653:1: rule__Place__Group_4__0__Impl : ( 'tokens' ) ;
    public final void rule__Place__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.petrinet.mydsl1.ui/src-gen/org/xtext/petrinet/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:657:1: ( ( 'tokens' ) )
            // ../org.xtext.petrinet.mydsl1.ui/src-gen/org/xtext/petrinet/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:658:1: ( 'tokens' )
            {
            // ../org.xtext.petrinet.mydsl1.ui/src-gen/org/xtext/petrinet/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:658:1: ( 'tokens' )
            // ../org.xtext.petrinet.mydsl1.ui/src-gen/org/xtext/petrinet/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:659:1: 'tokens'
            {
             before(grammarAccess.getPlaceAccess().getTokensKeyword_4_0()); 
            match(input,15,FollowSets000.FOLLOW_15_in_rule__Place__Group_4__0__Impl1266); 
             after(grammarAccess.getPlaceAccess().getTokensKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Place__Group_4__0__Impl"


    // $ANTLR start "rule__Place__Group_4__1"
    // ../org.xtext.petrinet.mydsl1.ui/src-gen/org/xtext/petrinet/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:672:1: rule__Place__Group_4__1 : rule__Place__Group_4__1__Impl ;
    public final void rule__Place__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.petrinet.mydsl1.ui/src-gen/org/xtext/petrinet/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:676:1: ( rule__Place__Group_4__1__Impl )
            // ../org.xtext.petrinet.mydsl1.ui/src-gen/org/xtext/petrinet/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:677:2: rule__Place__Group_4__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Place__Group_4__1__Impl_in_rule__Place__Group_4__11297);
            rule__Place__Group_4__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Place__Group_4__1"


    // $ANTLR start "rule__Place__Group_4__1__Impl"
    // ../org.xtext.petrinet.mydsl1.ui/src-gen/org/xtext/petrinet/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:683:1: rule__Place__Group_4__1__Impl : ( ( rule__Place__TokensAssignment_4_1 ) ) ;
    public final void rule__Place__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.petrinet.mydsl1.ui/src-gen/org/xtext/petrinet/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:687:1: ( ( ( rule__Place__TokensAssignment_4_1 ) ) )
            // ../org.xtext.petrinet.mydsl1.ui/src-gen/org/xtext/petrinet/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:688:1: ( ( rule__Place__TokensAssignment_4_1 ) )
            {
            // ../org.xtext.petrinet.mydsl1.ui/src-gen/org/xtext/petrinet/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:688:1: ( ( rule__Place__TokensAssignment_4_1 ) )
            // ../org.xtext.petrinet.mydsl1.ui/src-gen/org/xtext/petrinet/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:689:1: ( rule__Place__TokensAssignment_4_1 )
            {
             before(grammarAccess.getPlaceAccess().getTokensAssignment_4_1()); 
            // ../org.xtext.petrinet.mydsl1.ui/src-gen/org/xtext/petrinet/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:690:1: ( rule__Place__TokensAssignment_4_1 )
            // ../org.xtext.petrinet.mydsl1.ui/src-gen/org/xtext/petrinet/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:690:2: rule__Place__TokensAssignment_4_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Place__TokensAssignment_4_1_in_rule__Place__Group_4__1__Impl1324);
            rule__Place__TokensAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getPlaceAccess().getTokensAssignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Place__Group_4__1__Impl"


    // $ANTLR start "rule__Place__Group_5__0"
    // ../org.xtext.petrinet.mydsl1.ui/src-gen/org/xtext/petrinet/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:704:1: rule__Place__Group_5__0 : rule__Place__Group_5__0__Impl rule__Place__Group_5__1 ;
    public final void rule__Place__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.petrinet.mydsl1.ui/src-gen/org/xtext/petrinet/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:708:1: ( rule__Place__Group_5__0__Impl rule__Place__Group_5__1 )
            // ../org.xtext.petrinet.mydsl1.ui/src-gen/org/xtext/petrinet/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:709:2: rule__Place__Group_5__0__Impl rule__Place__Group_5__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Place__Group_5__0__Impl_in_rule__Place__Group_5__01358);
            rule__Place__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Place__Group_5__1_in_rule__Place__Group_5__01361);
            rule__Place__Group_5__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Place__Group_5__0"


    // $ANTLR start "rule__Place__Group_5__0__Impl"
    // ../org.xtext.petrinet.mydsl1.ui/src-gen/org/xtext/petrinet/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:716:1: rule__Place__Group_5__0__Impl : ( 'connection' ) ;
    public final void rule__Place__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.petrinet.mydsl1.ui/src-gen/org/xtext/petrinet/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:720:1: ( ( 'connection' ) )
            // ../org.xtext.petrinet.mydsl1.ui/src-gen/org/xtext/petrinet/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:721:1: ( 'connection' )
            {
            // ../org.xtext.petrinet.mydsl1.ui/src-gen/org/xtext/petrinet/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:721:1: ( 'connection' )
            // ../org.xtext.petrinet.mydsl1.ui/src-gen/org/xtext/petrinet/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:722:1: 'connection'
            {
             before(grammarAccess.getPlaceAccess().getConnectionKeyword_5_0()); 
            match(input,16,FollowSets000.FOLLOW_16_in_rule__Place__Group_5__0__Impl1389); 
             after(grammarAccess.getPlaceAccess().getConnectionKeyword_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Place__Group_5__0__Impl"


    // $ANTLR start "rule__Place__Group_5__1"
    // ../org.xtext.petrinet.mydsl1.ui/src-gen/org/xtext/petrinet/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:735:1: rule__Place__Group_5__1 : rule__Place__Group_5__1__Impl rule__Place__Group_5__2 ;
    public final void rule__Place__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.petrinet.mydsl1.ui/src-gen/org/xtext/petrinet/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:739:1: ( rule__Place__Group_5__1__Impl rule__Place__Group_5__2 )
            // ../org.xtext.petrinet.mydsl1.ui/src-gen/org/xtext/petrinet/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:740:2: rule__Place__Group_5__1__Impl rule__Place__Group_5__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Place__Group_5__1__Impl_in_rule__Place__Group_5__11420);
            rule__Place__Group_5__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Place__Group_5__2_in_rule__Place__Group_5__11423);
            rule__Place__Group_5__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Place__Group_5__1"


    // $ANTLR start "rule__Place__Group_5__1__Impl"
    // ../org.xtext.petrinet.mydsl1.ui/src-gen/org/xtext/petrinet/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:747:1: rule__Place__Group_5__1__Impl : ( '(' ) ;
    public final void rule__Place__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.petrinet.mydsl1.ui/src-gen/org/xtext/petrinet/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:751:1: ( ( '(' ) )
            // ../org.xtext.petrinet.mydsl1.ui/src-gen/org/xtext/petrinet/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:752:1: ( '(' )
            {
            // ../org.xtext.petrinet.mydsl1.ui/src-gen/org/xtext/petrinet/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:752:1: ( '(' )
            // ../org.xtext.petrinet.mydsl1.ui/src-gen/org/xtext/petrinet/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:753:1: '('
            {
             before(grammarAccess.getPlaceAccess().getLeftParenthesisKeyword_5_1()); 
            match(input,17,FollowSets000.FOLLOW_17_in_rule__Place__Group_5__1__Impl1451); 
             after(grammarAccess.getPlaceAccess().getLeftParenthesisKeyword_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Place__Group_5__1__Impl"


    // $ANTLR start "rule__Place__Group_5__2"
    // ../org.xtext.petrinet.mydsl1.ui/src-gen/org/xtext/petrinet/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:766:1: rule__Place__Group_5__2 : rule__Place__Group_5__2__Impl rule__Place__Group_5__3 ;
    public final void rule__Place__Group_5__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.petrinet.mydsl1.ui/src-gen/org/xtext/petrinet/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:770:1: ( rule__Place__Group_5__2__Impl rule__Place__Group_5__3 )
            // ../org.xtext.petrinet.mydsl1.ui/src-gen/org/xtext/petrinet/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:771:2: rule__Place__Group_5__2__Impl rule__Place__Group_5__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Place__Group_5__2__Impl_in_rule__Place__Group_5__21482);
            rule__Place__Group_5__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Place__Group_5__3_in_rule__Place__Group_5__21485);
            rule__Place__Group_5__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Place__Group_5__2"


    // $ANTLR start "rule__Place__Group_5__2__Impl"
    // ../org.xtext.petrinet.mydsl1.ui/src-gen/org/xtext/petrinet/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:778:1: rule__Place__Group_5__2__Impl : ( ( rule__Place__ConnectionAssignment_5_2 ) ) ;
    public final void rule__Place__Group_5__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.petrinet.mydsl1.ui/src-gen/org/xtext/petrinet/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:782:1: ( ( ( rule__Place__ConnectionAssignment_5_2 ) ) )
            // ../org.xtext.petrinet.mydsl1.ui/src-gen/org/xtext/petrinet/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:783:1: ( ( rule__Place__ConnectionAssignment_5_2 ) )
            {
            // ../org.xtext.petrinet.mydsl1.ui/src-gen/org/xtext/petrinet/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:783:1: ( ( rule__Place__ConnectionAssignment_5_2 ) )
            // ../org.xtext.petrinet.mydsl1.ui/src-gen/org/xtext/petrinet/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:784:1: ( rule__Place__ConnectionAssignment_5_2 )
            {
             before(grammarAccess.getPlaceAccess().getConnectionAssignment_5_2()); 
            // ../org.xtext.petrinet.mydsl1.ui/src-gen/org/xtext/petrinet/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:785:1: ( rule__Place__ConnectionAssignment_5_2 )
            // ../org.xtext.petrinet.mydsl1.ui/src-gen/org/xtext/petrinet/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:785:2: rule__Place__ConnectionAssignment_5_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Place__ConnectionAssignment_5_2_in_rule__Place__Group_5__2__Impl1512);
            rule__Place__ConnectionAssignment_5_2();

            state._fsp--;


            }

             after(grammarAccess.getPlaceAccess().getConnectionAssignment_5_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Place__Group_5__2__Impl"


    // $ANTLR start "rule__Place__Group_5__3"
    // ../org.xtext.petrinet.mydsl1.ui/src-gen/org/xtext/petrinet/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:795:1: rule__Place__Group_5__3 : rule__Place__Group_5__3__Impl rule__Place__Group_5__4 ;
    public final void rule__Place__Group_5__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.petrinet.mydsl1.ui/src-gen/org/xtext/petrinet/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:799:1: ( rule__Place__Group_5__3__Impl rule__Place__Group_5__4 )
            // ../org.xtext.petrinet.mydsl1.ui/src-gen/org/xtext/petrinet/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:800:2: rule__Place__Group_5__3__Impl rule__Place__Group_5__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__Place__Group_5__3__Impl_in_rule__Place__Group_5__31542);
            rule__Place__Group_5__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Place__Group_5__4_in_rule__Place__Group_5__31545);
            rule__Place__Group_5__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Place__Group_5__3"


    // $ANTLR start "rule__Place__Group_5__3__Impl"
    // ../org.xtext.petrinet.mydsl1.ui/src-gen/org/xtext/petrinet/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:807:1: rule__Place__Group_5__3__Impl : ( ( rule__Place__Group_5_3__0 )* ) ;
    public final void rule__Place__Group_5__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.petrinet.mydsl1.ui/src-gen/org/xtext/petrinet/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:811:1: ( ( ( rule__Place__Group_5_3__0 )* ) )
            // ../org.xtext.petrinet.mydsl1.ui/src-gen/org/xtext/petrinet/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:812:1: ( ( rule__Place__Group_5_3__0 )* )
            {
            // ../org.xtext.petrinet.mydsl1.ui/src-gen/org/xtext/petrinet/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:812:1: ( ( rule__Place__Group_5_3__0 )* )
            // ../org.xtext.petrinet.mydsl1.ui/src-gen/org/xtext/petrinet/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:813:1: ( rule__Place__Group_5_3__0 )*
            {
             before(grammarAccess.getPlaceAccess().getGroup_5_3()); 
            // ../org.xtext.petrinet.mydsl1.ui/src-gen/org/xtext/petrinet/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:814:1: ( rule__Place__Group_5_3__0 )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==19) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // ../org.xtext.petrinet.mydsl1.ui/src-gen/org/xtext/petrinet/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:814:2: rule__Place__Group_5_3__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__Place__Group_5_3__0_in_rule__Place__Group_5__3__Impl1572);
            	    rule__Place__Group_5_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

             after(grammarAccess.getPlaceAccess().getGroup_5_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Place__Group_5__3__Impl"


    // $ANTLR start "rule__Place__Group_5__4"
    // ../org.xtext.petrinet.mydsl1.ui/src-gen/org/xtext/petrinet/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:824:1: rule__Place__Group_5__4 : rule__Place__Group_5__4__Impl ;
    public final void rule__Place__Group_5__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.petrinet.mydsl1.ui/src-gen/org/xtext/petrinet/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:828:1: ( rule__Place__Group_5__4__Impl )
            // ../org.xtext.petrinet.mydsl1.ui/src-gen/org/xtext/petrinet/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:829:2: rule__Place__Group_5__4__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Place__Group_5__4__Impl_in_rule__Place__Group_5__41603);
            rule__Place__Group_5__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Place__Group_5__4"


    // $ANTLR start "rule__Place__Group_5__4__Impl"
    // ../org.xtext.petrinet.mydsl1.ui/src-gen/org/xtext/petrinet/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:835:1: rule__Place__Group_5__4__Impl : ( ')' ) ;
    public final void rule__Place__Group_5__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.petrinet.mydsl1.ui/src-gen/org/xtext/petrinet/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:839:1: ( ( ')' ) )
            // ../org.xtext.petrinet.mydsl1.ui/src-gen/org/xtext/petrinet/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:840:1: ( ')' )
            {
            // ../org.xtext.petrinet.mydsl1.ui/src-gen/org/xtext/petrinet/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:840:1: ( ')' )
            // ../org.xtext.petrinet.mydsl1.ui/src-gen/org/xtext/petrinet/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:841:1: ')'
            {
             before(grammarAccess.getPlaceAccess().getRightParenthesisKeyword_5_4()); 
            match(input,18,FollowSets000.FOLLOW_18_in_rule__Place__Group_5__4__Impl1631); 
             after(grammarAccess.getPlaceAccess().getRightParenthesisKeyword_5_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Place__Group_5__4__Impl"


    // $ANTLR start "rule__Place__Group_5_3__0"
    // ../org.xtext.petrinet.mydsl1.ui/src-gen/org/xtext/petrinet/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:864:1: rule__Place__Group_5_3__0 : rule__Place__Group_5_3__0__Impl rule__Place__Group_5_3__1 ;
    public final void rule__Place__Group_5_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.petrinet.mydsl1.ui/src-gen/org/xtext/petrinet/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:868:1: ( rule__Place__Group_5_3__0__Impl rule__Place__Group_5_3__1 )
            // ../org.xtext.petrinet.mydsl1.ui/src-gen/org/xtext/petrinet/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:869:2: rule__Place__Group_5_3__0__Impl rule__Place__Group_5_3__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Place__Group_5_3__0__Impl_in_rule__Place__Group_5_3__01672);
            rule__Place__Group_5_3__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Place__Group_5_3__1_in_rule__Place__Group_5_3__01675);
            rule__Place__Group_5_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Place__Group_5_3__0"


    // $ANTLR start "rule__Place__Group_5_3__0__Impl"
    // ../org.xtext.petrinet.mydsl1.ui/src-gen/org/xtext/petrinet/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:876:1: rule__Place__Group_5_3__0__Impl : ( ',' ) ;
    public final void rule__Place__Group_5_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.petrinet.mydsl1.ui/src-gen/org/xtext/petrinet/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:880:1: ( ( ',' ) )
            // ../org.xtext.petrinet.mydsl1.ui/src-gen/org/xtext/petrinet/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:881:1: ( ',' )
            {
            // ../org.xtext.petrinet.mydsl1.ui/src-gen/org/xtext/petrinet/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:881:1: ( ',' )
            // ../org.xtext.petrinet.mydsl1.ui/src-gen/org/xtext/petrinet/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:882:1: ','
            {
             before(grammarAccess.getPlaceAccess().getCommaKeyword_5_3_0()); 
            match(input,19,FollowSets000.FOLLOW_19_in_rule__Place__Group_5_3__0__Impl1703); 
             after(grammarAccess.getPlaceAccess().getCommaKeyword_5_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Place__Group_5_3__0__Impl"


    // $ANTLR start "rule__Place__Group_5_3__1"
    // ../org.xtext.petrinet.mydsl1.ui/src-gen/org/xtext/petrinet/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:895:1: rule__Place__Group_5_3__1 : rule__Place__Group_5_3__1__Impl ;
    public final void rule__Place__Group_5_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.petrinet.mydsl1.ui/src-gen/org/xtext/petrinet/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:899:1: ( rule__Place__Group_5_3__1__Impl )
            // ../org.xtext.petrinet.mydsl1.ui/src-gen/org/xtext/petrinet/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:900:2: rule__Place__Group_5_3__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Place__Group_5_3__1__Impl_in_rule__Place__Group_5_3__11734);
            rule__Place__Group_5_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Place__Group_5_3__1"


    // $ANTLR start "rule__Place__Group_5_3__1__Impl"
    // ../org.xtext.petrinet.mydsl1.ui/src-gen/org/xtext/petrinet/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:906:1: rule__Place__Group_5_3__1__Impl : ( ( rule__Place__ConnectionAssignment_5_3_1 ) ) ;
    public final void rule__Place__Group_5_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.petrinet.mydsl1.ui/src-gen/org/xtext/petrinet/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:910:1: ( ( ( rule__Place__ConnectionAssignment_5_3_1 ) ) )
            // ../org.xtext.petrinet.mydsl1.ui/src-gen/org/xtext/petrinet/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:911:1: ( ( rule__Place__ConnectionAssignment_5_3_1 ) )
            {
            // ../org.xtext.petrinet.mydsl1.ui/src-gen/org/xtext/petrinet/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:911:1: ( ( rule__Place__ConnectionAssignment_5_3_1 ) )
            // ../org.xtext.petrinet.mydsl1.ui/src-gen/org/xtext/petrinet/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:912:1: ( rule__Place__ConnectionAssignment_5_3_1 )
            {
             before(grammarAccess.getPlaceAccess().getConnectionAssignment_5_3_1()); 
            // ../org.xtext.petrinet.mydsl1.ui/src-gen/org/xtext/petrinet/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:913:1: ( rule__Place__ConnectionAssignment_5_3_1 )
            // ../org.xtext.petrinet.mydsl1.ui/src-gen/org/xtext/petrinet/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:913:2: rule__Place__ConnectionAssignment_5_3_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Place__ConnectionAssignment_5_3_1_in_rule__Place__Group_5_3__1__Impl1761);
            rule__Place__ConnectionAssignment_5_3_1();

            state._fsp--;


            }

             after(grammarAccess.getPlaceAccess().getConnectionAssignment_5_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Place__Group_5_3__1__Impl"


    // $ANTLR start "rule__EInt__Group__0"
    // ../org.xtext.petrinet.mydsl1.ui/src-gen/org/xtext/petrinet/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:927:1: rule__EInt__Group__0 : rule__EInt__Group__0__Impl rule__EInt__Group__1 ;
    public final void rule__EInt__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.petrinet.mydsl1.ui/src-gen/org/xtext/petrinet/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:931:1: ( rule__EInt__Group__0__Impl rule__EInt__Group__1 )
            // ../org.xtext.petrinet.mydsl1.ui/src-gen/org/xtext/petrinet/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:932:2: rule__EInt__Group__0__Impl rule__EInt__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__EInt__Group__0__Impl_in_rule__EInt__Group__01795);
            rule__EInt__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__EInt__Group__1_in_rule__EInt__Group__01798);
            rule__EInt__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EInt__Group__0"


    // $ANTLR start "rule__EInt__Group__0__Impl"
    // ../org.xtext.petrinet.mydsl1.ui/src-gen/org/xtext/petrinet/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:939:1: rule__EInt__Group__0__Impl : ( ( '-' )? ) ;
    public final void rule__EInt__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.petrinet.mydsl1.ui/src-gen/org/xtext/petrinet/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:943:1: ( ( ( '-' )? ) )
            // ../org.xtext.petrinet.mydsl1.ui/src-gen/org/xtext/petrinet/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:944:1: ( ( '-' )? )
            {
            // ../org.xtext.petrinet.mydsl1.ui/src-gen/org/xtext/petrinet/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:944:1: ( ( '-' )? )
            // ../org.xtext.petrinet.mydsl1.ui/src-gen/org/xtext/petrinet/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:945:1: ( '-' )?
            {
             before(grammarAccess.getEIntAccess().getHyphenMinusKeyword_0()); 
            // ../org.xtext.petrinet.mydsl1.ui/src-gen/org/xtext/petrinet/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:946:1: ( '-' )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==20) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // ../org.xtext.petrinet.mydsl1.ui/src-gen/org/xtext/petrinet/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:947:2: '-'
                    {
                    match(input,20,FollowSets000.FOLLOW_20_in_rule__EInt__Group__0__Impl1827); 

                    }
                    break;

            }

             after(grammarAccess.getEIntAccess().getHyphenMinusKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EInt__Group__0__Impl"


    // $ANTLR start "rule__EInt__Group__1"
    // ../org.xtext.petrinet.mydsl1.ui/src-gen/org/xtext/petrinet/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:958:1: rule__EInt__Group__1 : rule__EInt__Group__1__Impl ;
    public final void rule__EInt__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.petrinet.mydsl1.ui/src-gen/org/xtext/petrinet/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:962:1: ( rule__EInt__Group__1__Impl )
            // ../org.xtext.petrinet.mydsl1.ui/src-gen/org/xtext/petrinet/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:963:2: rule__EInt__Group__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__EInt__Group__1__Impl_in_rule__EInt__Group__11860);
            rule__EInt__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EInt__Group__1"


    // $ANTLR start "rule__EInt__Group__1__Impl"
    // ../org.xtext.petrinet.mydsl1.ui/src-gen/org/xtext/petrinet/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:969:1: rule__EInt__Group__1__Impl : ( RULE_INT ) ;
    public final void rule__EInt__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.petrinet.mydsl1.ui/src-gen/org/xtext/petrinet/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:973:1: ( ( RULE_INT ) )
            // ../org.xtext.petrinet.mydsl1.ui/src-gen/org/xtext/petrinet/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:974:1: ( RULE_INT )
            {
            // ../org.xtext.petrinet.mydsl1.ui/src-gen/org/xtext/petrinet/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:974:1: ( RULE_INT )
            // ../org.xtext.petrinet.mydsl1.ui/src-gen/org/xtext/petrinet/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:975:1: RULE_INT
            {
             before(grammarAccess.getEIntAccess().getINTTerminalRuleCall_1()); 
            match(input,RULE_INT,FollowSets000.FOLLOW_RULE_INT_in_rule__EInt__Group__1__Impl1887); 
             after(grammarAccess.getEIntAccess().getINTTerminalRuleCall_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EInt__Group__1__Impl"


    // $ANTLR start "rule__Transition__Group__0"
    // ../org.xtext.petrinet.mydsl1.ui/src-gen/org/xtext/petrinet/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:990:1: rule__Transition__Group__0 : rule__Transition__Group__0__Impl rule__Transition__Group__1 ;
    public final void rule__Transition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.petrinet.mydsl1.ui/src-gen/org/xtext/petrinet/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:994:1: ( rule__Transition__Group__0__Impl rule__Transition__Group__1 )
            // ../org.xtext.petrinet.mydsl1.ui/src-gen/org/xtext/petrinet/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:995:2: rule__Transition__Group__0__Impl rule__Transition__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Transition__Group__0__Impl_in_rule__Transition__Group__01920);
            rule__Transition__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Transition__Group__1_in_rule__Transition__Group__01923);
            rule__Transition__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group__0"


    // $ANTLR start "rule__Transition__Group__0__Impl"
    // ../org.xtext.petrinet.mydsl1.ui/src-gen/org/xtext/petrinet/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1002:1: rule__Transition__Group__0__Impl : ( () ) ;
    public final void rule__Transition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.petrinet.mydsl1.ui/src-gen/org/xtext/petrinet/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1006:1: ( ( () ) )
            // ../org.xtext.petrinet.mydsl1.ui/src-gen/org/xtext/petrinet/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1007:1: ( () )
            {
            // ../org.xtext.petrinet.mydsl1.ui/src-gen/org/xtext/petrinet/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1007:1: ( () )
            // ../org.xtext.petrinet.mydsl1.ui/src-gen/org/xtext/petrinet/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1008:1: ()
            {
             before(grammarAccess.getTransitionAccess().getTransitionAction_0()); 
            // ../org.xtext.petrinet.mydsl1.ui/src-gen/org/xtext/petrinet/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1009:1: ()
            // ../org.xtext.petrinet.mydsl1.ui/src-gen/org/xtext/petrinet/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1011:1: 
            {
            }

             after(grammarAccess.getTransitionAccess().getTransitionAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group__0__Impl"


    // $ANTLR start "rule__Transition__Group__1"
    // ../org.xtext.petrinet.mydsl1.ui/src-gen/org/xtext/petrinet/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1021:1: rule__Transition__Group__1 : rule__Transition__Group__1__Impl rule__Transition__Group__2 ;
    public final void rule__Transition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.petrinet.mydsl1.ui/src-gen/org/xtext/petrinet/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1025:1: ( rule__Transition__Group__1__Impl rule__Transition__Group__2 )
            // ../org.xtext.petrinet.mydsl1.ui/src-gen/org/xtext/petrinet/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1026:2: rule__Transition__Group__1__Impl rule__Transition__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Transition__Group__1__Impl_in_rule__Transition__Group__11981);
            rule__Transition__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Transition__Group__2_in_rule__Transition__Group__11984);
            rule__Transition__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group__1"


    // $ANTLR start "rule__Transition__Group__1__Impl"
    // ../org.xtext.petrinet.mydsl1.ui/src-gen/org/xtext/petrinet/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1033:1: rule__Transition__Group__1__Impl : ( 'Transition' ) ;
    public final void rule__Transition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.petrinet.mydsl1.ui/src-gen/org/xtext/petrinet/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1037:1: ( ( 'Transition' ) )
            // ../org.xtext.petrinet.mydsl1.ui/src-gen/org/xtext/petrinet/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1038:1: ( 'Transition' )
            {
            // ../org.xtext.petrinet.mydsl1.ui/src-gen/org/xtext/petrinet/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1038:1: ( 'Transition' )
            // ../org.xtext.petrinet.mydsl1.ui/src-gen/org/xtext/petrinet/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1039:1: 'Transition'
            {
             before(grammarAccess.getTransitionAccess().getTransitionKeyword_1()); 
            match(input,21,FollowSets000.FOLLOW_21_in_rule__Transition__Group__1__Impl2012); 
             after(grammarAccess.getTransitionAccess().getTransitionKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group__1__Impl"


    // $ANTLR start "rule__Transition__Group__2"
    // ../org.xtext.petrinet.mydsl1.ui/src-gen/org/xtext/petrinet/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1052:1: rule__Transition__Group__2 : rule__Transition__Group__2__Impl rule__Transition__Group__3 ;
    public final void rule__Transition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.petrinet.mydsl1.ui/src-gen/org/xtext/petrinet/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1056:1: ( rule__Transition__Group__2__Impl rule__Transition__Group__3 )
            // ../org.xtext.petrinet.mydsl1.ui/src-gen/org/xtext/petrinet/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1057:2: rule__Transition__Group__2__Impl rule__Transition__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Transition__Group__2__Impl_in_rule__Transition__Group__22043);
            rule__Transition__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Transition__Group__3_in_rule__Transition__Group__22046);
            rule__Transition__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group__2"


    // $ANTLR start "rule__Transition__Group__2__Impl"
    // ../org.xtext.petrinet.mydsl1.ui/src-gen/org/xtext/petrinet/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1064:1: rule__Transition__Group__2__Impl : ( ( rule__Transition__NameAssignment_2 ) ) ;
    public final void rule__Transition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.petrinet.mydsl1.ui/src-gen/org/xtext/petrinet/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1068:1: ( ( ( rule__Transition__NameAssignment_2 ) ) )
            // ../org.xtext.petrinet.mydsl1.ui/src-gen/org/xtext/petrinet/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1069:1: ( ( rule__Transition__NameAssignment_2 ) )
            {
            // ../org.xtext.petrinet.mydsl1.ui/src-gen/org/xtext/petrinet/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1069:1: ( ( rule__Transition__NameAssignment_2 ) )
            // ../org.xtext.petrinet.mydsl1.ui/src-gen/org/xtext/petrinet/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1070:1: ( rule__Transition__NameAssignment_2 )
            {
             before(grammarAccess.getTransitionAccess().getNameAssignment_2()); 
            // ../org.xtext.petrinet.mydsl1.ui/src-gen/org/xtext/petrinet/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1071:1: ( rule__Transition__NameAssignment_2 )
            // ../org.xtext.petrinet.mydsl1.ui/src-gen/org/xtext/petrinet/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1071:2: rule__Transition__NameAssignment_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Transition__NameAssignment_2_in_rule__Transition__Group__2__Impl2073);
            rule__Transition__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getTransitionAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group__2__Impl"


    // $ANTLR start "rule__Transition__Group__3"
    // ../org.xtext.petrinet.mydsl1.ui/src-gen/org/xtext/petrinet/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1081:1: rule__Transition__Group__3 : rule__Transition__Group__3__Impl rule__Transition__Group__4 ;
    public final void rule__Transition__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.petrinet.mydsl1.ui/src-gen/org/xtext/petrinet/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1085:1: ( rule__Transition__Group__3__Impl rule__Transition__Group__4 )
            // ../org.xtext.petrinet.mydsl1.ui/src-gen/org/xtext/petrinet/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1086:2: rule__Transition__Group__3__Impl rule__Transition__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__Transition__Group__3__Impl_in_rule__Transition__Group__32103);
            rule__Transition__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Transition__Group__4_in_rule__Transition__Group__32106);
            rule__Transition__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group__3"


    // $ANTLR start "rule__Transition__Group__3__Impl"
    // ../org.xtext.petrinet.mydsl1.ui/src-gen/org/xtext/petrinet/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1093:1: rule__Transition__Group__3__Impl : ( '{' ) ;
    public final void rule__Transition__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.petrinet.mydsl1.ui/src-gen/org/xtext/petrinet/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1097:1: ( ( '{' ) )
            // ../org.xtext.petrinet.mydsl1.ui/src-gen/org/xtext/petrinet/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1098:1: ( '{' )
            {
            // ../org.xtext.petrinet.mydsl1.ui/src-gen/org/xtext/petrinet/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1098:1: ( '{' )
            // ../org.xtext.petrinet.mydsl1.ui/src-gen/org/xtext/petrinet/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1099:1: '{'
            {
             before(grammarAccess.getTransitionAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,12,FollowSets000.FOLLOW_12_in_rule__Transition__Group__3__Impl2134); 
             after(grammarAccess.getTransitionAccess().getLeftCurlyBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group__3__Impl"


    // $ANTLR start "rule__Transition__Group__4"
    // ../org.xtext.petrinet.mydsl1.ui/src-gen/org/xtext/petrinet/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1112:1: rule__Transition__Group__4 : rule__Transition__Group__4__Impl rule__Transition__Group__5 ;
    public final void rule__Transition__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.petrinet.mydsl1.ui/src-gen/org/xtext/petrinet/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1116:1: ( rule__Transition__Group__4__Impl rule__Transition__Group__5 )
            // ../org.xtext.petrinet.mydsl1.ui/src-gen/org/xtext/petrinet/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1117:2: rule__Transition__Group__4__Impl rule__Transition__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_rule__Transition__Group__4__Impl_in_rule__Transition__Group__42165);
            rule__Transition__Group__4__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Transition__Group__5_in_rule__Transition__Group__42168);
            rule__Transition__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group__4"


    // $ANTLR start "rule__Transition__Group__4__Impl"
    // ../org.xtext.petrinet.mydsl1.ui/src-gen/org/xtext/petrinet/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1124:1: rule__Transition__Group__4__Impl : ( ( rule__Transition__Group_4__0 )? ) ;
    public final void rule__Transition__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.petrinet.mydsl1.ui/src-gen/org/xtext/petrinet/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1128:1: ( ( ( rule__Transition__Group_4__0 )? ) )
            // ../org.xtext.petrinet.mydsl1.ui/src-gen/org/xtext/petrinet/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1129:1: ( ( rule__Transition__Group_4__0 )? )
            {
            // ../org.xtext.petrinet.mydsl1.ui/src-gen/org/xtext/petrinet/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1129:1: ( ( rule__Transition__Group_4__0 )? )
            // ../org.xtext.petrinet.mydsl1.ui/src-gen/org/xtext/petrinet/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1130:1: ( rule__Transition__Group_4__0 )?
            {
             before(grammarAccess.getTransitionAccess().getGroup_4()); 
            // ../org.xtext.petrinet.mydsl1.ui/src-gen/org/xtext/petrinet/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1131:1: ( rule__Transition__Group_4__0 )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==16) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // ../org.xtext.petrinet.mydsl1.ui/src-gen/org/xtext/petrinet/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1131:2: rule__Transition__Group_4__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Transition__Group_4__0_in_rule__Transition__Group__4__Impl2195);
                    rule__Transition__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getTransitionAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group__4__Impl"


    // $ANTLR start "rule__Transition__Group__5"
    // ../org.xtext.petrinet.mydsl1.ui/src-gen/org/xtext/petrinet/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1141:1: rule__Transition__Group__5 : rule__Transition__Group__5__Impl ;
    public final void rule__Transition__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.petrinet.mydsl1.ui/src-gen/org/xtext/petrinet/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1145:1: ( rule__Transition__Group__5__Impl )
            // ../org.xtext.petrinet.mydsl1.ui/src-gen/org/xtext/petrinet/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1146:2: rule__Transition__Group__5__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Transition__Group__5__Impl_in_rule__Transition__Group__52226);
            rule__Transition__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group__5"


    // $ANTLR start "rule__Transition__Group__5__Impl"
    // ../org.xtext.petrinet.mydsl1.ui/src-gen/org/xtext/petrinet/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1152:1: rule__Transition__Group__5__Impl : ( '}' ) ;
    public final void rule__Transition__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.petrinet.mydsl1.ui/src-gen/org/xtext/petrinet/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1156:1: ( ( '}' ) )
            // ../org.xtext.petrinet.mydsl1.ui/src-gen/org/xtext/petrinet/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1157:1: ( '}' )
            {
            // ../org.xtext.petrinet.mydsl1.ui/src-gen/org/xtext/petrinet/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1157:1: ( '}' )
            // ../org.xtext.petrinet.mydsl1.ui/src-gen/org/xtext/petrinet/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1158:1: '}'
            {
             before(grammarAccess.getTransitionAccess().getRightCurlyBracketKeyword_5()); 
            match(input,13,FollowSets000.FOLLOW_13_in_rule__Transition__Group__5__Impl2254); 
             after(grammarAccess.getTransitionAccess().getRightCurlyBracketKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group__5__Impl"


    // $ANTLR start "rule__Transition__Group_4__0"
    // ../org.xtext.petrinet.mydsl1.ui/src-gen/org/xtext/petrinet/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1183:1: rule__Transition__Group_4__0 : rule__Transition__Group_4__0__Impl rule__Transition__Group_4__1 ;
    public final void rule__Transition__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.petrinet.mydsl1.ui/src-gen/org/xtext/petrinet/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1187:1: ( rule__Transition__Group_4__0__Impl rule__Transition__Group_4__1 )
            // ../org.xtext.petrinet.mydsl1.ui/src-gen/org/xtext/petrinet/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1188:2: rule__Transition__Group_4__0__Impl rule__Transition__Group_4__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Transition__Group_4__0__Impl_in_rule__Transition__Group_4__02297);
            rule__Transition__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Transition__Group_4__1_in_rule__Transition__Group_4__02300);
            rule__Transition__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group_4__0"


    // $ANTLR start "rule__Transition__Group_4__0__Impl"
    // ../org.xtext.petrinet.mydsl1.ui/src-gen/org/xtext/petrinet/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1195:1: rule__Transition__Group_4__0__Impl : ( 'connection' ) ;
    public final void rule__Transition__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.petrinet.mydsl1.ui/src-gen/org/xtext/petrinet/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1199:1: ( ( 'connection' ) )
            // ../org.xtext.petrinet.mydsl1.ui/src-gen/org/xtext/petrinet/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1200:1: ( 'connection' )
            {
            // ../org.xtext.petrinet.mydsl1.ui/src-gen/org/xtext/petrinet/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1200:1: ( 'connection' )
            // ../org.xtext.petrinet.mydsl1.ui/src-gen/org/xtext/petrinet/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1201:1: 'connection'
            {
             before(grammarAccess.getTransitionAccess().getConnectionKeyword_4_0()); 
            match(input,16,FollowSets000.FOLLOW_16_in_rule__Transition__Group_4__0__Impl2328); 
             after(grammarAccess.getTransitionAccess().getConnectionKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group_4__0__Impl"


    // $ANTLR start "rule__Transition__Group_4__1"
    // ../org.xtext.petrinet.mydsl1.ui/src-gen/org/xtext/petrinet/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1214:1: rule__Transition__Group_4__1 : rule__Transition__Group_4__1__Impl rule__Transition__Group_4__2 ;
    public final void rule__Transition__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.petrinet.mydsl1.ui/src-gen/org/xtext/petrinet/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1218:1: ( rule__Transition__Group_4__1__Impl rule__Transition__Group_4__2 )
            // ../org.xtext.petrinet.mydsl1.ui/src-gen/org/xtext/petrinet/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1219:2: rule__Transition__Group_4__1__Impl rule__Transition__Group_4__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Transition__Group_4__1__Impl_in_rule__Transition__Group_4__12359);
            rule__Transition__Group_4__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Transition__Group_4__2_in_rule__Transition__Group_4__12362);
            rule__Transition__Group_4__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group_4__1"


    // $ANTLR start "rule__Transition__Group_4__1__Impl"
    // ../org.xtext.petrinet.mydsl1.ui/src-gen/org/xtext/petrinet/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1226:1: rule__Transition__Group_4__1__Impl : ( '(' ) ;
    public final void rule__Transition__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.petrinet.mydsl1.ui/src-gen/org/xtext/petrinet/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1230:1: ( ( '(' ) )
            // ../org.xtext.petrinet.mydsl1.ui/src-gen/org/xtext/petrinet/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1231:1: ( '(' )
            {
            // ../org.xtext.petrinet.mydsl1.ui/src-gen/org/xtext/petrinet/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1231:1: ( '(' )
            // ../org.xtext.petrinet.mydsl1.ui/src-gen/org/xtext/petrinet/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1232:1: '('
            {
             before(grammarAccess.getTransitionAccess().getLeftParenthesisKeyword_4_1()); 
            match(input,17,FollowSets000.FOLLOW_17_in_rule__Transition__Group_4__1__Impl2390); 
             after(grammarAccess.getTransitionAccess().getLeftParenthesisKeyword_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group_4__1__Impl"


    // $ANTLR start "rule__Transition__Group_4__2"
    // ../org.xtext.petrinet.mydsl1.ui/src-gen/org/xtext/petrinet/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1245:1: rule__Transition__Group_4__2 : rule__Transition__Group_4__2__Impl rule__Transition__Group_4__3 ;
    public final void rule__Transition__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.petrinet.mydsl1.ui/src-gen/org/xtext/petrinet/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1249:1: ( rule__Transition__Group_4__2__Impl rule__Transition__Group_4__3 )
            // ../org.xtext.petrinet.mydsl1.ui/src-gen/org/xtext/petrinet/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1250:2: rule__Transition__Group_4__2__Impl rule__Transition__Group_4__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Transition__Group_4__2__Impl_in_rule__Transition__Group_4__22421);
            rule__Transition__Group_4__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Transition__Group_4__3_in_rule__Transition__Group_4__22424);
            rule__Transition__Group_4__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group_4__2"


    // $ANTLR start "rule__Transition__Group_4__2__Impl"
    // ../org.xtext.petrinet.mydsl1.ui/src-gen/org/xtext/petrinet/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1257:1: rule__Transition__Group_4__2__Impl : ( ( rule__Transition__ConnectionAssignment_4_2 ) ) ;
    public final void rule__Transition__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.petrinet.mydsl1.ui/src-gen/org/xtext/petrinet/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1261:1: ( ( ( rule__Transition__ConnectionAssignment_4_2 ) ) )
            // ../org.xtext.petrinet.mydsl1.ui/src-gen/org/xtext/petrinet/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1262:1: ( ( rule__Transition__ConnectionAssignment_4_2 ) )
            {
            // ../org.xtext.petrinet.mydsl1.ui/src-gen/org/xtext/petrinet/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1262:1: ( ( rule__Transition__ConnectionAssignment_4_2 ) )
            // ../org.xtext.petrinet.mydsl1.ui/src-gen/org/xtext/petrinet/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1263:1: ( rule__Transition__ConnectionAssignment_4_2 )
            {
             before(grammarAccess.getTransitionAccess().getConnectionAssignment_4_2()); 
            // ../org.xtext.petrinet.mydsl1.ui/src-gen/org/xtext/petrinet/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1264:1: ( rule__Transition__ConnectionAssignment_4_2 )
            // ../org.xtext.petrinet.mydsl1.ui/src-gen/org/xtext/petrinet/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1264:2: rule__Transition__ConnectionAssignment_4_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Transition__ConnectionAssignment_4_2_in_rule__Transition__Group_4__2__Impl2451);
            rule__Transition__ConnectionAssignment_4_2();

            state._fsp--;


            }

             after(grammarAccess.getTransitionAccess().getConnectionAssignment_4_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group_4__2__Impl"


    // $ANTLR start "rule__Transition__Group_4__3"
    // ../org.xtext.petrinet.mydsl1.ui/src-gen/org/xtext/petrinet/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1274:1: rule__Transition__Group_4__3 : rule__Transition__Group_4__3__Impl rule__Transition__Group_4__4 ;
    public final void rule__Transition__Group_4__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.petrinet.mydsl1.ui/src-gen/org/xtext/petrinet/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1278:1: ( rule__Transition__Group_4__3__Impl rule__Transition__Group_4__4 )
            // ../org.xtext.petrinet.mydsl1.ui/src-gen/org/xtext/petrinet/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1279:2: rule__Transition__Group_4__3__Impl rule__Transition__Group_4__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__Transition__Group_4__3__Impl_in_rule__Transition__Group_4__32481);
            rule__Transition__Group_4__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Transition__Group_4__4_in_rule__Transition__Group_4__32484);
            rule__Transition__Group_4__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group_4__3"


    // $ANTLR start "rule__Transition__Group_4__3__Impl"
    // ../org.xtext.petrinet.mydsl1.ui/src-gen/org/xtext/petrinet/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1286:1: rule__Transition__Group_4__3__Impl : ( ( rule__Transition__Group_4_3__0 )* ) ;
    public final void rule__Transition__Group_4__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.petrinet.mydsl1.ui/src-gen/org/xtext/petrinet/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1290:1: ( ( ( rule__Transition__Group_4_3__0 )* ) )
            // ../org.xtext.petrinet.mydsl1.ui/src-gen/org/xtext/petrinet/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1291:1: ( ( rule__Transition__Group_4_3__0 )* )
            {
            // ../org.xtext.petrinet.mydsl1.ui/src-gen/org/xtext/petrinet/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1291:1: ( ( rule__Transition__Group_4_3__0 )* )
            // ../org.xtext.petrinet.mydsl1.ui/src-gen/org/xtext/petrinet/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1292:1: ( rule__Transition__Group_4_3__0 )*
            {
             before(grammarAccess.getTransitionAccess().getGroup_4_3()); 
            // ../org.xtext.petrinet.mydsl1.ui/src-gen/org/xtext/petrinet/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1293:1: ( rule__Transition__Group_4_3__0 )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==19) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // ../org.xtext.petrinet.mydsl1.ui/src-gen/org/xtext/petrinet/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1293:2: rule__Transition__Group_4_3__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__Transition__Group_4_3__0_in_rule__Transition__Group_4__3__Impl2511);
            	    rule__Transition__Group_4_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

             after(grammarAccess.getTransitionAccess().getGroup_4_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group_4__3__Impl"


    // $ANTLR start "rule__Transition__Group_4__4"
    // ../org.xtext.petrinet.mydsl1.ui/src-gen/org/xtext/petrinet/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1303:1: rule__Transition__Group_4__4 : rule__Transition__Group_4__4__Impl ;
    public final void rule__Transition__Group_4__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.petrinet.mydsl1.ui/src-gen/org/xtext/petrinet/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1307:1: ( rule__Transition__Group_4__4__Impl )
            // ../org.xtext.petrinet.mydsl1.ui/src-gen/org/xtext/petrinet/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1308:2: rule__Transition__Group_4__4__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Transition__Group_4__4__Impl_in_rule__Transition__Group_4__42542);
            rule__Transition__Group_4__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group_4__4"


    // $ANTLR start "rule__Transition__Group_4__4__Impl"
    // ../org.xtext.petrinet.mydsl1.ui/src-gen/org/xtext/petrinet/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1314:1: rule__Transition__Group_4__4__Impl : ( ')' ) ;
    public final void rule__Transition__Group_4__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.petrinet.mydsl1.ui/src-gen/org/xtext/petrinet/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1318:1: ( ( ')' ) )
            // ../org.xtext.petrinet.mydsl1.ui/src-gen/org/xtext/petrinet/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1319:1: ( ')' )
            {
            // ../org.xtext.petrinet.mydsl1.ui/src-gen/org/xtext/petrinet/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1319:1: ( ')' )
            // ../org.xtext.petrinet.mydsl1.ui/src-gen/org/xtext/petrinet/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1320:1: ')'
            {
             before(grammarAccess.getTransitionAccess().getRightParenthesisKeyword_4_4()); 
            match(input,18,FollowSets000.FOLLOW_18_in_rule__Transition__Group_4__4__Impl2570); 
             after(grammarAccess.getTransitionAccess().getRightParenthesisKeyword_4_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group_4__4__Impl"


    // $ANTLR start "rule__Transition__Group_4_3__0"
    // ../org.xtext.petrinet.mydsl1.ui/src-gen/org/xtext/petrinet/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1343:1: rule__Transition__Group_4_3__0 : rule__Transition__Group_4_3__0__Impl rule__Transition__Group_4_3__1 ;
    public final void rule__Transition__Group_4_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.petrinet.mydsl1.ui/src-gen/org/xtext/petrinet/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1347:1: ( rule__Transition__Group_4_3__0__Impl rule__Transition__Group_4_3__1 )
            // ../org.xtext.petrinet.mydsl1.ui/src-gen/org/xtext/petrinet/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1348:2: rule__Transition__Group_4_3__0__Impl rule__Transition__Group_4_3__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Transition__Group_4_3__0__Impl_in_rule__Transition__Group_4_3__02611);
            rule__Transition__Group_4_3__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Transition__Group_4_3__1_in_rule__Transition__Group_4_3__02614);
            rule__Transition__Group_4_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group_4_3__0"


    // $ANTLR start "rule__Transition__Group_4_3__0__Impl"
    // ../org.xtext.petrinet.mydsl1.ui/src-gen/org/xtext/petrinet/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1355:1: rule__Transition__Group_4_3__0__Impl : ( ',' ) ;
    public final void rule__Transition__Group_4_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.petrinet.mydsl1.ui/src-gen/org/xtext/petrinet/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1359:1: ( ( ',' ) )
            // ../org.xtext.petrinet.mydsl1.ui/src-gen/org/xtext/petrinet/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1360:1: ( ',' )
            {
            // ../org.xtext.petrinet.mydsl1.ui/src-gen/org/xtext/petrinet/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1360:1: ( ',' )
            // ../org.xtext.petrinet.mydsl1.ui/src-gen/org/xtext/petrinet/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1361:1: ','
            {
             before(grammarAccess.getTransitionAccess().getCommaKeyword_4_3_0()); 
            match(input,19,FollowSets000.FOLLOW_19_in_rule__Transition__Group_4_3__0__Impl2642); 
             after(grammarAccess.getTransitionAccess().getCommaKeyword_4_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group_4_3__0__Impl"


    // $ANTLR start "rule__Transition__Group_4_3__1"
    // ../org.xtext.petrinet.mydsl1.ui/src-gen/org/xtext/petrinet/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1374:1: rule__Transition__Group_4_3__1 : rule__Transition__Group_4_3__1__Impl ;
    public final void rule__Transition__Group_4_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.petrinet.mydsl1.ui/src-gen/org/xtext/petrinet/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1378:1: ( rule__Transition__Group_4_3__1__Impl )
            // ../org.xtext.petrinet.mydsl1.ui/src-gen/org/xtext/petrinet/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1379:2: rule__Transition__Group_4_3__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Transition__Group_4_3__1__Impl_in_rule__Transition__Group_4_3__12673);
            rule__Transition__Group_4_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group_4_3__1"


    // $ANTLR start "rule__Transition__Group_4_3__1__Impl"
    // ../org.xtext.petrinet.mydsl1.ui/src-gen/org/xtext/petrinet/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1385:1: rule__Transition__Group_4_3__1__Impl : ( ( rule__Transition__ConnectionAssignment_4_3_1 ) ) ;
    public final void rule__Transition__Group_4_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.petrinet.mydsl1.ui/src-gen/org/xtext/petrinet/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1389:1: ( ( ( rule__Transition__ConnectionAssignment_4_3_1 ) ) )
            // ../org.xtext.petrinet.mydsl1.ui/src-gen/org/xtext/petrinet/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1390:1: ( ( rule__Transition__ConnectionAssignment_4_3_1 ) )
            {
            // ../org.xtext.petrinet.mydsl1.ui/src-gen/org/xtext/petrinet/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1390:1: ( ( rule__Transition__ConnectionAssignment_4_3_1 ) )
            // ../org.xtext.petrinet.mydsl1.ui/src-gen/org/xtext/petrinet/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1391:1: ( rule__Transition__ConnectionAssignment_4_3_1 )
            {
             before(grammarAccess.getTransitionAccess().getConnectionAssignment_4_3_1()); 
            // ../org.xtext.petrinet.mydsl1.ui/src-gen/org/xtext/petrinet/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1392:1: ( rule__Transition__ConnectionAssignment_4_3_1 )
            // ../org.xtext.petrinet.mydsl1.ui/src-gen/org/xtext/petrinet/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1392:2: rule__Transition__ConnectionAssignment_4_3_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Transition__ConnectionAssignment_4_3_1_in_rule__Transition__Group_4_3__1__Impl2700);
            rule__Transition__ConnectionAssignment_4_3_1();

            state._fsp--;


            }

             after(grammarAccess.getTransitionAccess().getConnectionAssignment_4_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group_4_3__1__Impl"


    // $ANTLR start "rule__RedPetri__IniTransAssignment_3"
    // ../org.xtext.petrinet.mydsl1.ui/src-gen/org/xtext/petrinet/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1407:1: rule__RedPetri__IniTransAssignment_3 : ( ruleTransition ) ;
    public final void rule__RedPetri__IniTransAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.petrinet.mydsl1.ui/src-gen/org/xtext/petrinet/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1411:1: ( ( ruleTransition ) )
            // ../org.xtext.petrinet.mydsl1.ui/src-gen/org/xtext/petrinet/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1412:1: ( ruleTransition )
            {
            // ../org.xtext.petrinet.mydsl1.ui/src-gen/org/xtext/petrinet/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1412:1: ( ruleTransition )
            // ../org.xtext.petrinet.mydsl1.ui/src-gen/org/xtext/petrinet/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1413:1: ruleTransition
            {
             before(grammarAccess.getRedPetriAccess().getIniTransTransitionParserRuleCall_3_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleTransition_in_rule__RedPetri__IniTransAssignment_32739);
            ruleTransition();

            state._fsp--;

             after(grammarAccess.getRedPetriAccess().getIniTransTransitionParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RedPetri__IniTransAssignment_3"


    // $ANTLR start "rule__RedPetri__IniPlaceAssignment_4"
    // ../org.xtext.petrinet.mydsl1.ui/src-gen/org/xtext/petrinet/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1422:1: rule__RedPetri__IniPlaceAssignment_4 : ( rulePlace ) ;
    public final void rule__RedPetri__IniPlaceAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.petrinet.mydsl1.ui/src-gen/org/xtext/petrinet/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1426:1: ( ( rulePlace ) )
            // ../org.xtext.petrinet.mydsl1.ui/src-gen/org/xtext/petrinet/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1427:1: ( rulePlace )
            {
            // ../org.xtext.petrinet.mydsl1.ui/src-gen/org/xtext/petrinet/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1427:1: ( rulePlace )
            // ../org.xtext.petrinet.mydsl1.ui/src-gen/org/xtext/petrinet/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1428:1: rulePlace
            {
             before(grammarAccess.getRedPetriAccess().getIniPlacePlaceParserRuleCall_4_0()); 
            pushFollow(FollowSets000.FOLLOW_rulePlace_in_rule__RedPetri__IniPlaceAssignment_42770);
            rulePlace();

            state._fsp--;

             after(grammarAccess.getRedPetriAccess().getIniPlacePlaceParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RedPetri__IniPlaceAssignment_4"


    // $ANTLR start "rule__Place__NameAssignment_2"
    // ../org.xtext.petrinet.mydsl1.ui/src-gen/org/xtext/petrinet/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1437:1: rule__Place__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__Place__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.petrinet.mydsl1.ui/src-gen/org/xtext/petrinet/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1441:1: ( ( ruleEString ) )
            // ../org.xtext.petrinet.mydsl1.ui/src-gen/org/xtext/petrinet/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1442:1: ( ruleEString )
            {
            // ../org.xtext.petrinet.mydsl1.ui/src-gen/org/xtext/petrinet/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1442:1: ( ruleEString )
            // ../org.xtext.petrinet.mydsl1.ui/src-gen/org/xtext/petrinet/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1443:1: ruleEString
            {
             before(grammarAccess.getPlaceAccess().getNameEStringParserRuleCall_2_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__Place__NameAssignment_22801);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getPlaceAccess().getNameEStringParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Place__NameAssignment_2"


    // $ANTLR start "rule__Place__TokensAssignment_4_1"
    // ../org.xtext.petrinet.mydsl1.ui/src-gen/org/xtext/petrinet/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1452:1: rule__Place__TokensAssignment_4_1 : ( ruleEInt ) ;
    public final void rule__Place__TokensAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.petrinet.mydsl1.ui/src-gen/org/xtext/petrinet/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1456:1: ( ( ruleEInt ) )
            // ../org.xtext.petrinet.mydsl1.ui/src-gen/org/xtext/petrinet/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1457:1: ( ruleEInt )
            {
            // ../org.xtext.petrinet.mydsl1.ui/src-gen/org/xtext/petrinet/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1457:1: ( ruleEInt )
            // ../org.xtext.petrinet.mydsl1.ui/src-gen/org/xtext/petrinet/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1458:1: ruleEInt
            {
             before(grammarAccess.getPlaceAccess().getTokensEIntParserRuleCall_4_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEInt_in_rule__Place__TokensAssignment_4_12832);
            ruleEInt();

            state._fsp--;

             after(grammarAccess.getPlaceAccess().getTokensEIntParserRuleCall_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Place__TokensAssignment_4_1"


    // $ANTLR start "rule__Place__ConnectionAssignment_5_2"
    // ../org.xtext.petrinet.mydsl1.ui/src-gen/org/xtext/petrinet/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1467:1: rule__Place__ConnectionAssignment_5_2 : ( ( ruleEString ) ) ;
    public final void rule__Place__ConnectionAssignment_5_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.petrinet.mydsl1.ui/src-gen/org/xtext/petrinet/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1471:1: ( ( ( ruleEString ) ) )
            // ../org.xtext.petrinet.mydsl1.ui/src-gen/org/xtext/petrinet/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1472:1: ( ( ruleEString ) )
            {
            // ../org.xtext.petrinet.mydsl1.ui/src-gen/org/xtext/petrinet/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1472:1: ( ( ruleEString ) )
            // ../org.xtext.petrinet.mydsl1.ui/src-gen/org/xtext/petrinet/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1473:1: ( ruleEString )
            {
             before(grammarAccess.getPlaceAccess().getConnectionTransitionCrossReference_5_2_0()); 
            // ../org.xtext.petrinet.mydsl1.ui/src-gen/org/xtext/petrinet/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1474:1: ( ruleEString )
            // ../org.xtext.petrinet.mydsl1.ui/src-gen/org/xtext/petrinet/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1475:1: ruleEString
            {
             before(grammarAccess.getPlaceAccess().getConnectionTransitionEStringParserRuleCall_5_2_0_1()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__Place__ConnectionAssignment_5_22867);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getPlaceAccess().getConnectionTransitionEStringParserRuleCall_5_2_0_1()); 

            }

             after(grammarAccess.getPlaceAccess().getConnectionTransitionCrossReference_5_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Place__ConnectionAssignment_5_2"


    // $ANTLR start "rule__Place__ConnectionAssignment_5_3_1"
    // ../org.xtext.petrinet.mydsl1.ui/src-gen/org/xtext/petrinet/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1486:1: rule__Place__ConnectionAssignment_5_3_1 : ( ( ruleEString ) ) ;
    public final void rule__Place__ConnectionAssignment_5_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.petrinet.mydsl1.ui/src-gen/org/xtext/petrinet/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1490:1: ( ( ( ruleEString ) ) )
            // ../org.xtext.petrinet.mydsl1.ui/src-gen/org/xtext/petrinet/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1491:1: ( ( ruleEString ) )
            {
            // ../org.xtext.petrinet.mydsl1.ui/src-gen/org/xtext/petrinet/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1491:1: ( ( ruleEString ) )
            // ../org.xtext.petrinet.mydsl1.ui/src-gen/org/xtext/petrinet/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1492:1: ( ruleEString )
            {
             before(grammarAccess.getPlaceAccess().getConnectionTransitionCrossReference_5_3_1_0()); 
            // ../org.xtext.petrinet.mydsl1.ui/src-gen/org/xtext/petrinet/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1493:1: ( ruleEString )
            // ../org.xtext.petrinet.mydsl1.ui/src-gen/org/xtext/petrinet/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1494:1: ruleEString
            {
             before(grammarAccess.getPlaceAccess().getConnectionTransitionEStringParserRuleCall_5_3_1_0_1()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__Place__ConnectionAssignment_5_3_12906);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getPlaceAccess().getConnectionTransitionEStringParserRuleCall_5_3_1_0_1()); 

            }

             after(grammarAccess.getPlaceAccess().getConnectionTransitionCrossReference_5_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Place__ConnectionAssignment_5_3_1"


    // $ANTLR start "rule__Transition__NameAssignment_2"
    // ../org.xtext.petrinet.mydsl1.ui/src-gen/org/xtext/petrinet/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1505:1: rule__Transition__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__Transition__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.petrinet.mydsl1.ui/src-gen/org/xtext/petrinet/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1509:1: ( ( ruleEString ) )
            // ../org.xtext.petrinet.mydsl1.ui/src-gen/org/xtext/petrinet/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1510:1: ( ruleEString )
            {
            // ../org.xtext.petrinet.mydsl1.ui/src-gen/org/xtext/petrinet/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1510:1: ( ruleEString )
            // ../org.xtext.petrinet.mydsl1.ui/src-gen/org/xtext/petrinet/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1511:1: ruleEString
            {
             before(grammarAccess.getTransitionAccess().getNameEStringParserRuleCall_2_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__Transition__NameAssignment_22941);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getTransitionAccess().getNameEStringParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__NameAssignment_2"


    // $ANTLR start "rule__Transition__ConnectionAssignment_4_2"
    // ../org.xtext.petrinet.mydsl1.ui/src-gen/org/xtext/petrinet/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1520:1: rule__Transition__ConnectionAssignment_4_2 : ( ( ruleEString ) ) ;
    public final void rule__Transition__ConnectionAssignment_4_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.petrinet.mydsl1.ui/src-gen/org/xtext/petrinet/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1524:1: ( ( ( ruleEString ) ) )
            // ../org.xtext.petrinet.mydsl1.ui/src-gen/org/xtext/petrinet/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1525:1: ( ( ruleEString ) )
            {
            // ../org.xtext.petrinet.mydsl1.ui/src-gen/org/xtext/petrinet/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1525:1: ( ( ruleEString ) )
            // ../org.xtext.petrinet.mydsl1.ui/src-gen/org/xtext/petrinet/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1526:1: ( ruleEString )
            {
             before(grammarAccess.getTransitionAccess().getConnectionPlaceCrossReference_4_2_0()); 
            // ../org.xtext.petrinet.mydsl1.ui/src-gen/org/xtext/petrinet/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1527:1: ( ruleEString )
            // ../org.xtext.petrinet.mydsl1.ui/src-gen/org/xtext/petrinet/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1528:1: ruleEString
            {
             before(grammarAccess.getTransitionAccess().getConnectionPlaceEStringParserRuleCall_4_2_0_1()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__Transition__ConnectionAssignment_4_22976);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getTransitionAccess().getConnectionPlaceEStringParserRuleCall_4_2_0_1()); 

            }

             after(grammarAccess.getTransitionAccess().getConnectionPlaceCrossReference_4_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__ConnectionAssignment_4_2"


    // $ANTLR start "rule__Transition__ConnectionAssignment_4_3_1"
    // ../org.xtext.petrinet.mydsl1.ui/src-gen/org/xtext/petrinet/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1539:1: rule__Transition__ConnectionAssignment_4_3_1 : ( ( ruleEString ) ) ;
    public final void rule__Transition__ConnectionAssignment_4_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.petrinet.mydsl1.ui/src-gen/org/xtext/petrinet/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1543:1: ( ( ( ruleEString ) ) )
            // ../org.xtext.petrinet.mydsl1.ui/src-gen/org/xtext/petrinet/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1544:1: ( ( ruleEString ) )
            {
            // ../org.xtext.petrinet.mydsl1.ui/src-gen/org/xtext/petrinet/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1544:1: ( ( ruleEString ) )
            // ../org.xtext.petrinet.mydsl1.ui/src-gen/org/xtext/petrinet/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1545:1: ( ruleEString )
            {
             before(grammarAccess.getTransitionAccess().getConnectionPlaceCrossReference_4_3_1_0()); 
            // ../org.xtext.petrinet.mydsl1.ui/src-gen/org/xtext/petrinet/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1546:1: ( ruleEString )
            // ../org.xtext.petrinet.mydsl1.ui/src-gen/org/xtext/petrinet/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1547:1: ruleEString
            {
             before(grammarAccess.getTransitionAccess().getConnectionPlaceEStringParserRuleCall_4_3_1_0_1()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__Transition__ConnectionAssignment_4_3_13015);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getTransitionAccess().getConnectionPlaceEStringParserRuleCall_4_3_1_0_1()); 

            }

             after(grammarAccess.getTransitionAccess().getConnectionPlaceCrossReference_4_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__ConnectionAssignment_4_3_1"

    // Delegated rules


 

    
    private static class FollowSets000 {
        public static final BitSet FOLLOW_ruleRedPetri_in_entryRuleRedPetri61 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleRedPetri68 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__RedPetri__Group__0_in_ruleRedPetri94 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulePlace_in_entryRulePlace121 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRulePlace128 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Place__Group__0_in_rulePlace154 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_entryRuleEString181 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEString188 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EString__Alternatives_in_ruleEString214 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEInt_in_entryRuleEInt241 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEInt248 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EInt__Group__0_in_ruleEInt274 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTransition_in_entryRuleTransition301 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleTransition308 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Transition__Group__0_in_ruleTransition334 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_STRING_in_rule__EString__Alternatives370 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rule__EString__Alternatives387 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__RedPetri__Group__0__Impl_in_rule__RedPetri__Group__0417 = new BitSet(new long[]{0x0000000000000800L});
        public static final BitSet FOLLOW_rule__RedPetri__Group__1_in_rule__RedPetri__Group__0420 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__RedPetri__Group__1__Impl_in_rule__RedPetri__Group__1478 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_rule__RedPetri__Group__2_in_rule__RedPetri__Group__1481 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_11_in_rule__RedPetri__Group__1__Impl509 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__RedPetri__Group__2__Impl_in_rule__RedPetri__Group__2540 = new BitSet(new long[]{0x0000000000206000L});
        public static final BitSet FOLLOW_rule__RedPetri__Group__3_in_rule__RedPetri__Group__2543 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_12_in_rule__RedPetri__Group__2__Impl571 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__RedPetri__Group__3__Impl_in_rule__RedPetri__Group__3602 = new BitSet(new long[]{0x0000000000206000L});
        public static final BitSet FOLLOW_rule__RedPetri__Group__4_in_rule__RedPetri__Group__3605 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__RedPetri__IniTransAssignment_3_in_rule__RedPetri__Group__3__Impl632 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__RedPetri__Group__4__Impl_in_rule__RedPetri__Group__4663 = new BitSet(new long[]{0x0000000000206000L});
        public static final BitSet FOLLOW_rule__RedPetri__Group__5_in_rule__RedPetri__Group__4666 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__RedPetri__IniPlaceAssignment_4_in_rule__RedPetri__Group__4__Impl693 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__RedPetri__Group__5__Impl_in_rule__RedPetri__Group__5724 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_13_in_rule__RedPetri__Group__5__Impl752 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Place__Group__0__Impl_in_rule__Place__Group__0795 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_rule__Place__Group__1_in_rule__Place__Group__0798 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Place__Group__1__Impl_in_rule__Place__Group__1856 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__Place__Group__2_in_rule__Place__Group__1859 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_14_in_rule__Place__Group__1__Impl887 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Place__Group__2__Impl_in_rule__Place__Group__2918 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_rule__Place__Group__3_in_rule__Place__Group__2921 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Place__NameAssignment_2_in_rule__Place__Group__2__Impl948 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Place__Group__3__Impl_in_rule__Place__Group__3978 = new BitSet(new long[]{0x000000000001A000L});
        public static final BitSet FOLLOW_rule__Place__Group__4_in_rule__Place__Group__3981 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_12_in_rule__Place__Group__3__Impl1009 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Place__Group__4__Impl_in_rule__Place__Group__41040 = new BitSet(new long[]{0x000000000001A000L});
        public static final BitSet FOLLOW_rule__Place__Group__5_in_rule__Place__Group__41043 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Place__Group_4__0_in_rule__Place__Group__4__Impl1070 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Place__Group__5__Impl_in_rule__Place__Group__51101 = new BitSet(new long[]{0x000000000001A000L});
        public static final BitSet FOLLOW_rule__Place__Group__6_in_rule__Place__Group__51104 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Place__Group_5__0_in_rule__Place__Group__5__Impl1131 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Place__Group__6__Impl_in_rule__Place__Group__61162 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_13_in_rule__Place__Group__6__Impl1190 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Place__Group_4__0__Impl_in_rule__Place__Group_4__01235 = new BitSet(new long[]{0x0000000000100040L});
        public static final BitSet FOLLOW_rule__Place__Group_4__1_in_rule__Place__Group_4__01238 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_15_in_rule__Place__Group_4__0__Impl1266 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Place__Group_4__1__Impl_in_rule__Place__Group_4__11297 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Place__TokensAssignment_4_1_in_rule__Place__Group_4__1__Impl1324 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Place__Group_5__0__Impl_in_rule__Place__Group_5__01358 = new BitSet(new long[]{0x0000000000020000L});
        public static final BitSet FOLLOW_rule__Place__Group_5__1_in_rule__Place__Group_5__01361 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_16_in_rule__Place__Group_5__0__Impl1389 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Place__Group_5__1__Impl_in_rule__Place__Group_5__11420 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__Place__Group_5__2_in_rule__Place__Group_5__11423 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_17_in_rule__Place__Group_5__1__Impl1451 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Place__Group_5__2__Impl_in_rule__Place__Group_5__21482 = new BitSet(new long[]{0x00000000000C0000L});
        public static final BitSet FOLLOW_rule__Place__Group_5__3_in_rule__Place__Group_5__21485 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Place__ConnectionAssignment_5_2_in_rule__Place__Group_5__2__Impl1512 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Place__Group_5__3__Impl_in_rule__Place__Group_5__31542 = new BitSet(new long[]{0x00000000000C0000L});
        public static final BitSet FOLLOW_rule__Place__Group_5__4_in_rule__Place__Group_5__31545 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Place__Group_5_3__0_in_rule__Place__Group_5__3__Impl1572 = new BitSet(new long[]{0x0000000000080002L});
        public static final BitSet FOLLOW_rule__Place__Group_5__4__Impl_in_rule__Place__Group_5__41603 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_18_in_rule__Place__Group_5__4__Impl1631 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Place__Group_5_3__0__Impl_in_rule__Place__Group_5_3__01672 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__Place__Group_5_3__1_in_rule__Place__Group_5_3__01675 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_19_in_rule__Place__Group_5_3__0__Impl1703 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Place__Group_5_3__1__Impl_in_rule__Place__Group_5_3__11734 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Place__ConnectionAssignment_5_3_1_in_rule__Place__Group_5_3__1__Impl1761 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EInt__Group__0__Impl_in_rule__EInt__Group__01795 = new BitSet(new long[]{0x0000000000100040L});
        public static final BitSet FOLLOW_rule__EInt__Group__1_in_rule__EInt__Group__01798 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_20_in_rule__EInt__Group__0__Impl1827 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EInt__Group__1__Impl_in_rule__EInt__Group__11860 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_INT_in_rule__EInt__Group__1__Impl1887 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Transition__Group__0__Impl_in_rule__Transition__Group__01920 = new BitSet(new long[]{0x0000000000200000L});
        public static final BitSet FOLLOW_rule__Transition__Group__1_in_rule__Transition__Group__01923 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Transition__Group__1__Impl_in_rule__Transition__Group__11981 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__Transition__Group__2_in_rule__Transition__Group__11984 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_21_in_rule__Transition__Group__1__Impl2012 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Transition__Group__2__Impl_in_rule__Transition__Group__22043 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_rule__Transition__Group__3_in_rule__Transition__Group__22046 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Transition__NameAssignment_2_in_rule__Transition__Group__2__Impl2073 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Transition__Group__3__Impl_in_rule__Transition__Group__32103 = new BitSet(new long[]{0x0000000000012000L});
        public static final BitSet FOLLOW_rule__Transition__Group__4_in_rule__Transition__Group__32106 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_12_in_rule__Transition__Group__3__Impl2134 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Transition__Group__4__Impl_in_rule__Transition__Group__42165 = new BitSet(new long[]{0x0000000000012000L});
        public static final BitSet FOLLOW_rule__Transition__Group__5_in_rule__Transition__Group__42168 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Transition__Group_4__0_in_rule__Transition__Group__4__Impl2195 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Transition__Group__5__Impl_in_rule__Transition__Group__52226 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_13_in_rule__Transition__Group__5__Impl2254 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Transition__Group_4__0__Impl_in_rule__Transition__Group_4__02297 = new BitSet(new long[]{0x0000000000020000L});
        public static final BitSet FOLLOW_rule__Transition__Group_4__1_in_rule__Transition__Group_4__02300 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_16_in_rule__Transition__Group_4__0__Impl2328 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Transition__Group_4__1__Impl_in_rule__Transition__Group_4__12359 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__Transition__Group_4__2_in_rule__Transition__Group_4__12362 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_17_in_rule__Transition__Group_4__1__Impl2390 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Transition__Group_4__2__Impl_in_rule__Transition__Group_4__22421 = new BitSet(new long[]{0x00000000000C0000L});
        public static final BitSet FOLLOW_rule__Transition__Group_4__3_in_rule__Transition__Group_4__22424 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Transition__ConnectionAssignment_4_2_in_rule__Transition__Group_4__2__Impl2451 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Transition__Group_4__3__Impl_in_rule__Transition__Group_4__32481 = new BitSet(new long[]{0x00000000000C0000L});
        public static final BitSet FOLLOW_rule__Transition__Group_4__4_in_rule__Transition__Group_4__32484 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Transition__Group_4_3__0_in_rule__Transition__Group_4__3__Impl2511 = new BitSet(new long[]{0x0000000000080002L});
        public static final BitSet FOLLOW_rule__Transition__Group_4__4__Impl_in_rule__Transition__Group_4__42542 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_18_in_rule__Transition__Group_4__4__Impl2570 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Transition__Group_4_3__0__Impl_in_rule__Transition__Group_4_3__02611 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__Transition__Group_4_3__1_in_rule__Transition__Group_4_3__02614 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_19_in_rule__Transition__Group_4_3__0__Impl2642 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Transition__Group_4_3__1__Impl_in_rule__Transition__Group_4_3__12673 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Transition__ConnectionAssignment_4_3_1_in_rule__Transition__Group_4_3__1__Impl2700 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTransition_in_rule__RedPetri__IniTransAssignment_32739 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulePlace_in_rule__RedPetri__IniPlaceAssignment_42770 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__Place__NameAssignment_22801 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEInt_in_rule__Place__TokensAssignment_4_12832 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__Place__ConnectionAssignment_5_22867 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__Place__ConnectionAssignment_5_3_12906 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__Transition__NameAssignment_22941 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__Transition__ConnectionAssignment_4_22976 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__Transition__ConnectionAssignment_4_3_13015 = new BitSet(new long[]{0x0000000000000002L});
    }


}