package org.xtext.petrinet.mydsl1.parser.antlr.internal; 

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.xtext.petrinet.mydsl1.services.MyDslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalMyDslParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'RedPetri'", "'{'", "'}'", "'Place'", "'tokens'", "'connection'", "'('", "','", "')'", "'-'", "'Transition'"
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
    public String getGrammarFileName() { return "../org.xtext.petrinet.mydsl1/src-gen/org/xtext/petrinet/mydsl1/parser/antlr/internal/InternalMyDsl.g"; }



     	private MyDslGrammarAccess grammarAccess;
     	
        public InternalMyDslParser(TokenStream input, MyDslGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "RedPetri";	
       	}
       	
       	@Override
       	protected MyDslGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start "entryRuleRedPetri"
    // ../org.xtext.petrinet.mydsl1/src-gen/org/xtext/petrinet/mydsl1/parser/antlr/internal/InternalMyDsl.g:67:1: entryRuleRedPetri returns [EObject current=null] : iv_ruleRedPetri= ruleRedPetri EOF ;
    public final EObject entryRuleRedPetri() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRedPetri = null;


        try {
            // ../org.xtext.petrinet.mydsl1/src-gen/org/xtext/petrinet/mydsl1/parser/antlr/internal/InternalMyDsl.g:68:2: (iv_ruleRedPetri= ruleRedPetri EOF )
            // ../org.xtext.petrinet.mydsl1/src-gen/org/xtext/petrinet/mydsl1/parser/antlr/internal/InternalMyDsl.g:69:2: iv_ruleRedPetri= ruleRedPetri EOF
            {
             newCompositeNode(grammarAccess.getRedPetriRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleRedPetri_in_entryRuleRedPetri75);
            iv_ruleRedPetri=ruleRedPetri();

            state._fsp--;

             current =iv_ruleRedPetri; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleRedPetri85); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleRedPetri"


    // $ANTLR start "ruleRedPetri"
    // ../org.xtext.petrinet.mydsl1/src-gen/org/xtext/petrinet/mydsl1/parser/antlr/internal/InternalMyDsl.g:76:1: ruleRedPetri returns [EObject current=null] : ( () otherlv_1= 'RedPetri' otherlv_2= '{' ( (lv_iniTrans_3_0= ruleTransition ) )? ( (lv_iniPlace_4_0= rulePlace ) )? otherlv_5= '}' ) ;
    public final EObject ruleRedPetri() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_5=null;
        EObject lv_iniTrans_3_0 = null;

        EObject lv_iniPlace_4_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.petrinet.mydsl1/src-gen/org/xtext/petrinet/mydsl1/parser/antlr/internal/InternalMyDsl.g:79:28: ( ( () otherlv_1= 'RedPetri' otherlv_2= '{' ( (lv_iniTrans_3_0= ruleTransition ) )? ( (lv_iniPlace_4_0= rulePlace ) )? otherlv_5= '}' ) )
            // ../org.xtext.petrinet.mydsl1/src-gen/org/xtext/petrinet/mydsl1/parser/antlr/internal/InternalMyDsl.g:80:1: ( () otherlv_1= 'RedPetri' otherlv_2= '{' ( (lv_iniTrans_3_0= ruleTransition ) )? ( (lv_iniPlace_4_0= rulePlace ) )? otherlv_5= '}' )
            {
            // ../org.xtext.petrinet.mydsl1/src-gen/org/xtext/petrinet/mydsl1/parser/antlr/internal/InternalMyDsl.g:80:1: ( () otherlv_1= 'RedPetri' otherlv_2= '{' ( (lv_iniTrans_3_0= ruleTransition ) )? ( (lv_iniPlace_4_0= rulePlace ) )? otherlv_5= '}' )
            // ../org.xtext.petrinet.mydsl1/src-gen/org/xtext/petrinet/mydsl1/parser/antlr/internal/InternalMyDsl.g:80:2: () otherlv_1= 'RedPetri' otherlv_2= '{' ( (lv_iniTrans_3_0= ruleTransition ) )? ( (lv_iniPlace_4_0= rulePlace ) )? otherlv_5= '}'
            {
            // ../org.xtext.petrinet.mydsl1/src-gen/org/xtext/petrinet/mydsl1/parser/antlr/internal/InternalMyDsl.g:80:2: ()
            // ../org.xtext.petrinet.mydsl1/src-gen/org/xtext/petrinet/mydsl1/parser/antlr/internal/InternalMyDsl.g:81:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getRedPetriAccess().getRedPetriAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,11,FollowSets000.FOLLOW_11_in_ruleRedPetri131); 

                	newLeafNode(otherlv_1, grammarAccess.getRedPetriAccess().getRedPetriKeyword_1());
                
            otherlv_2=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleRedPetri143); 

                	newLeafNode(otherlv_2, grammarAccess.getRedPetriAccess().getLeftCurlyBracketKeyword_2());
                
            // ../org.xtext.petrinet.mydsl1/src-gen/org/xtext/petrinet/mydsl1/parser/antlr/internal/InternalMyDsl.g:94:1: ( (lv_iniTrans_3_0= ruleTransition ) )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==21) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // ../org.xtext.petrinet.mydsl1/src-gen/org/xtext/petrinet/mydsl1/parser/antlr/internal/InternalMyDsl.g:95:1: (lv_iniTrans_3_0= ruleTransition )
                    {
                    // ../org.xtext.petrinet.mydsl1/src-gen/org/xtext/petrinet/mydsl1/parser/antlr/internal/InternalMyDsl.g:95:1: (lv_iniTrans_3_0= ruleTransition )
                    // ../org.xtext.petrinet.mydsl1/src-gen/org/xtext/petrinet/mydsl1/parser/antlr/internal/InternalMyDsl.g:96:3: lv_iniTrans_3_0= ruleTransition
                    {
                     
                    	        newCompositeNode(grammarAccess.getRedPetriAccess().getIniTransTransitionParserRuleCall_3_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleTransition_in_ruleRedPetri164);
                    lv_iniTrans_3_0=ruleTransition();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getRedPetriRule());
                    	        }
                           		add(
                           			current, 
                           			"iniTrans",
                            		lv_iniTrans_3_0, 
                            		"Transition");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }
                    break;

            }

            // ../org.xtext.petrinet.mydsl1/src-gen/org/xtext/petrinet/mydsl1/parser/antlr/internal/InternalMyDsl.g:112:3: ( (lv_iniPlace_4_0= rulePlace ) )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==14) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // ../org.xtext.petrinet.mydsl1/src-gen/org/xtext/petrinet/mydsl1/parser/antlr/internal/InternalMyDsl.g:113:1: (lv_iniPlace_4_0= rulePlace )
                    {
                    // ../org.xtext.petrinet.mydsl1/src-gen/org/xtext/petrinet/mydsl1/parser/antlr/internal/InternalMyDsl.g:113:1: (lv_iniPlace_4_0= rulePlace )
                    // ../org.xtext.petrinet.mydsl1/src-gen/org/xtext/petrinet/mydsl1/parser/antlr/internal/InternalMyDsl.g:114:3: lv_iniPlace_4_0= rulePlace
                    {
                     
                    	        newCompositeNode(grammarAccess.getRedPetriAccess().getIniPlacePlaceParserRuleCall_4_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_rulePlace_in_ruleRedPetri186);
                    lv_iniPlace_4_0=rulePlace();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getRedPetriRule());
                    	        }
                           		add(
                           			current, 
                           			"iniPlace",
                            		lv_iniPlace_4_0, 
                            		"Place");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }
                    break;

            }

            otherlv_5=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleRedPetri199); 

                	newLeafNode(otherlv_5, grammarAccess.getRedPetriAccess().getRightCurlyBracketKeyword_5());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRedPetri"


    // $ANTLR start "entryRulePlace"
    // ../org.xtext.petrinet.mydsl1/src-gen/org/xtext/petrinet/mydsl1/parser/antlr/internal/InternalMyDsl.g:142:1: entryRulePlace returns [EObject current=null] : iv_rulePlace= rulePlace EOF ;
    public final EObject entryRulePlace() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePlace = null;


        try {
            // ../org.xtext.petrinet.mydsl1/src-gen/org/xtext/petrinet/mydsl1/parser/antlr/internal/InternalMyDsl.g:143:2: (iv_rulePlace= rulePlace EOF )
            // ../org.xtext.petrinet.mydsl1/src-gen/org/xtext/petrinet/mydsl1/parser/antlr/internal/InternalMyDsl.g:144:2: iv_rulePlace= rulePlace EOF
            {
             newCompositeNode(grammarAccess.getPlaceRule()); 
            pushFollow(FollowSets000.FOLLOW_rulePlace_in_entryRulePlace235);
            iv_rulePlace=rulePlace();

            state._fsp--;

             current =iv_rulePlace; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRulePlace245); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePlace"


    // $ANTLR start "rulePlace"
    // ../org.xtext.petrinet.mydsl1/src-gen/org/xtext/petrinet/mydsl1/parser/antlr/internal/InternalMyDsl.g:151:1: rulePlace returns [EObject current=null] : ( () otherlv_1= 'Place' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'tokens' ( (lv_tokens_5_0= ruleEInt ) ) )? (otherlv_6= 'connection' otherlv_7= '(' ( ( ruleEString ) ) (otherlv_9= ',' ( ( ruleEString ) ) )* otherlv_11= ')' )? otherlv_12= '}' ) ;
    public final EObject rulePlace() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        AntlrDatatypeRuleToken lv_tokens_5_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.petrinet.mydsl1/src-gen/org/xtext/petrinet/mydsl1/parser/antlr/internal/InternalMyDsl.g:154:28: ( ( () otherlv_1= 'Place' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'tokens' ( (lv_tokens_5_0= ruleEInt ) ) )? (otherlv_6= 'connection' otherlv_7= '(' ( ( ruleEString ) ) (otherlv_9= ',' ( ( ruleEString ) ) )* otherlv_11= ')' )? otherlv_12= '}' ) )
            // ../org.xtext.petrinet.mydsl1/src-gen/org/xtext/petrinet/mydsl1/parser/antlr/internal/InternalMyDsl.g:155:1: ( () otherlv_1= 'Place' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'tokens' ( (lv_tokens_5_0= ruleEInt ) ) )? (otherlv_6= 'connection' otherlv_7= '(' ( ( ruleEString ) ) (otherlv_9= ',' ( ( ruleEString ) ) )* otherlv_11= ')' )? otherlv_12= '}' )
            {
            // ../org.xtext.petrinet.mydsl1/src-gen/org/xtext/petrinet/mydsl1/parser/antlr/internal/InternalMyDsl.g:155:1: ( () otherlv_1= 'Place' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'tokens' ( (lv_tokens_5_0= ruleEInt ) ) )? (otherlv_6= 'connection' otherlv_7= '(' ( ( ruleEString ) ) (otherlv_9= ',' ( ( ruleEString ) ) )* otherlv_11= ')' )? otherlv_12= '}' )
            // ../org.xtext.petrinet.mydsl1/src-gen/org/xtext/petrinet/mydsl1/parser/antlr/internal/InternalMyDsl.g:155:2: () otherlv_1= 'Place' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'tokens' ( (lv_tokens_5_0= ruleEInt ) ) )? (otherlv_6= 'connection' otherlv_7= '(' ( ( ruleEString ) ) (otherlv_9= ',' ( ( ruleEString ) ) )* otherlv_11= ')' )? otherlv_12= '}'
            {
            // ../org.xtext.petrinet.mydsl1/src-gen/org/xtext/petrinet/mydsl1/parser/antlr/internal/InternalMyDsl.g:155:2: ()
            // ../org.xtext.petrinet.mydsl1/src-gen/org/xtext/petrinet/mydsl1/parser/antlr/internal/InternalMyDsl.g:156:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getPlaceAccess().getPlaceAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,14,FollowSets000.FOLLOW_14_in_rulePlace291); 

                	newLeafNode(otherlv_1, grammarAccess.getPlaceAccess().getPlaceKeyword_1());
                
            // ../org.xtext.petrinet.mydsl1/src-gen/org/xtext/petrinet/mydsl1/parser/antlr/internal/InternalMyDsl.g:165:1: ( (lv_name_2_0= ruleEString ) )
            // ../org.xtext.petrinet.mydsl1/src-gen/org/xtext/petrinet/mydsl1/parser/antlr/internal/InternalMyDsl.g:166:1: (lv_name_2_0= ruleEString )
            {
            // ../org.xtext.petrinet.mydsl1/src-gen/org/xtext/petrinet/mydsl1/parser/antlr/internal/InternalMyDsl.g:166:1: (lv_name_2_0= ruleEString )
            // ../org.xtext.petrinet.mydsl1/src-gen/org/xtext/petrinet/mydsl1/parser/antlr/internal/InternalMyDsl.g:167:3: lv_name_2_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getPlaceAccess().getNameEStringParserRuleCall_2_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rulePlace312);
            lv_name_2_0=ruleEString();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getPlaceRule());
            	        }
                   		set(
                   			current, 
                   			"name",
                    		lv_name_2_0, 
                    		"EString");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_3=(Token)match(input,12,FollowSets000.FOLLOW_12_in_rulePlace324); 

                	newLeafNode(otherlv_3, grammarAccess.getPlaceAccess().getLeftCurlyBracketKeyword_3());
                
            // ../org.xtext.petrinet.mydsl1/src-gen/org/xtext/petrinet/mydsl1/parser/antlr/internal/InternalMyDsl.g:187:1: (otherlv_4= 'tokens' ( (lv_tokens_5_0= ruleEInt ) ) )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==15) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // ../org.xtext.petrinet.mydsl1/src-gen/org/xtext/petrinet/mydsl1/parser/antlr/internal/InternalMyDsl.g:187:3: otherlv_4= 'tokens' ( (lv_tokens_5_0= ruleEInt ) )
                    {
                    otherlv_4=(Token)match(input,15,FollowSets000.FOLLOW_15_in_rulePlace337); 

                        	newLeafNode(otherlv_4, grammarAccess.getPlaceAccess().getTokensKeyword_4_0());
                        
                    // ../org.xtext.petrinet.mydsl1/src-gen/org/xtext/petrinet/mydsl1/parser/antlr/internal/InternalMyDsl.g:191:1: ( (lv_tokens_5_0= ruleEInt ) )
                    // ../org.xtext.petrinet.mydsl1/src-gen/org/xtext/petrinet/mydsl1/parser/antlr/internal/InternalMyDsl.g:192:1: (lv_tokens_5_0= ruleEInt )
                    {
                    // ../org.xtext.petrinet.mydsl1/src-gen/org/xtext/petrinet/mydsl1/parser/antlr/internal/InternalMyDsl.g:192:1: (lv_tokens_5_0= ruleEInt )
                    // ../org.xtext.petrinet.mydsl1/src-gen/org/xtext/petrinet/mydsl1/parser/antlr/internal/InternalMyDsl.g:193:3: lv_tokens_5_0= ruleEInt
                    {
                     
                    	        newCompositeNode(grammarAccess.getPlaceAccess().getTokensEIntParserRuleCall_4_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEInt_in_rulePlace358);
                    lv_tokens_5_0=ruleEInt();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getPlaceRule());
                    	        }
                           		set(
                           			current, 
                           			"tokens",
                            		lv_tokens_5_0, 
                            		"EInt");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../org.xtext.petrinet.mydsl1/src-gen/org/xtext/petrinet/mydsl1/parser/antlr/internal/InternalMyDsl.g:209:4: (otherlv_6= 'connection' otherlv_7= '(' ( ( ruleEString ) ) (otherlv_9= ',' ( ( ruleEString ) ) )* otherlv_11= ')' )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==16) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // ../org.xtext.petrinet.mydsl1/src-gen/org/xtext/petrinet/mydsl1/parser/antlr/internal/InternalMyDsl.g:209:6: otherlv_6= 'connection' otherlv_7= '(' ( ( ruleEString ) ) (otherlv_9= ',' ( ( ruleEString ) ) )* otherlv_11= ')'
                    {
                    otherlv_6=(Token)match(input,16,FollowSets000.FOLLOW_16_in_rulePlace373); 

                        	newLeafNode(otherlv_6, grammarAccess.getPlaceAccess().getConnectionKeyword_5_0());
                        
                    otherlv_7=(Token)match(input,17,FollowSets000.FOLLOW_17_in_rulePlace385); 

                        	newLeafNode(otherlv_7, grammarAccess.getPlaceAccess().getLeftParenthesisKeyword_5_1());
                        
                    // ../org.xtext.petrinet.mydsl1/src-gen/org/xtext/petrinet/mydsl1/parser/antlr/internal/InternalMyDsl.g:217:1: ( ( ruleEString ) )
                    // ../org.xtext.petrinet.mydsl1/src-gen/org/xtext/petrinet/mydsl1/parser/antlr/internal/InternalMyDsl.g:218:1: ( ruleEString )
                    {
                    // ../org.xtext.petrinet.mydsl1/src-gen/org/xtext/petrinet/mydsl1/parser/antlr/internal/InternalMyDsl.g:218:1: ( ruleEString )
                    // ../org.xtext.petrinet.mydsl1/src-gen/org/xtext/petrinet/mydsl1/parser/antlr/internal/InternalMyDsl.g:219:3: ruleEString
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getPlaceRule());
                    	        }
                            
                     
                    	        newCompositeNode(grammarAccess.getPlaceAccess().getConnectionTransitionCrossReference_5_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_rulePlace408);
                    ruleEString();

                    state._fsp--;

                     
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../org.xtext.petrinet.mydsl1/src-gen/org/xtext/petrinet/mydsl1/parser/antlr/internal/InternalMyDsl.g:232:2: (otherlv_9= ',' ( ( ruleEString ) ) )*
                    loop4:
                    do {
                        int alt4=2;
                        int LA4_0 = input.LA(1);

                        if ( (LA4_0==18) ) {
                            alt4=1;
                        }


                        switch (alt4) {
                    	case 1 :
                    	    // ../org.xtext.petrinet.mydsl1/src-gen/org/xtext/petrinet/mydsl1/parser/antlr/internal/InternalMyDsl.g:232:4: otherlv_9= ',' ( ( ruleEString ) )
                    	    {
                    	    otherlv_9=(Token)match(input,18,FollowSets000.FOLLOW_18_in_rulePlace421); 

                    	        	newLeafNode(otherlv_9, grammarAccess.getPlaceAccess().getCommaKeyword_5_3_0());
                    	        
                    	    // ../org.xtext.petrinet.mydsl1/src-gen/org/xtext/petrinet/mydsl1/parser/antlr/internal/InternalMyDsl.g:236:1: ( ( ruleEString ) )
                    	    // ../org.xtext.petrinet.mydsl1/src-gen/org/xtext/petrinet/mydsl1/parser/antlr/internal/InternalMyDsl.g:237:1: ( ruleEString )
                    	    {
                    	    // ../org.xtext.petrinet.mydsl1/src-gen/org/xtext/petrinet/mydsl1/parser/antlr/internal/InternalMyDsl.g:237:1: ( ruleEString )
                    	    // ../org.xtext.petrinet.mydsl1/src-gen/org/xtext/petrinet/mydsl1/parser/antlr/internal/InternalMyDsl.g:238:3: ruleEString
                    	    {

                    	    			if (current==null) {
                    	    	            current = createModelElement(grammarAccess.getPlaceRule());
                    	    	        }
                    	            
                    	     
                    	    	        newCompositeNode(grammarAccess.getPlaceAccess().getConnectionTransitionCrossReference_5_3_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleEString_in_rulePlace444);
                    	    ruleEString();

                    	    state._fsp--;

                    	     
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop4;
                        }
                    } while (true);

                    otherlv_11=(Token)match(input,19,FollowSets000.FOLLOW_19_in_rulePlace458); 

                        	newLeafNode(otherlv_11, grammarAccess.getPlaceAccess().getRightParenthesisKeyword_5_4());
                        

                    }
                    break;

            }

            otherlv_12=(Token)match(input,13,FollowSets000.FOLLOW_13_in_rulePlace472); 

                	newLeafNode(otherlv_12, grammarAccess.getPlaceAccess().getRightCurlyBracketKeyword_6());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePlace"


    // $ANTLR start "entryRuleEString"
    // ../org.xtext.petrinet.mydsl1/src-gen/org/xtext/petrinet/mydsl1/parser/antlr/internal/InternalMyDsl.g:267:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // ../org.xtext.petrinet.mydsl1/src-gen/org/xtext/petrinet/mydsl1/parser/antlr/internal/InternalMyDsl.g:268:2: (iv_ruleEString= ruleEString EOF )
            // ../org.xtext.petrinet.mydsl1/src-gen/org/xtext/petrinet/mydsl1/parser/antlr/internal/InternalMyDsl.g:269:2: iv_ruleEString= ruleEString EOF
            {
             newCompositeNode(grammarAccess.getEStringRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_entryRuleEString509);
            iv_ruleEString=ruleEString();

            state._fsp--;

             current =iv_ruleEString.getText(); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEString520); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEString"


    // $ANTLR start "ruleEString"
    // ../org.xtext.petrinet.mydsl1/src-gen/org/xtext/petrinet/mydsl1/parser/antlr/internal/InternalMyDsl.g:276:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_ID_1=null;

         enterRule(); 
            
        try {
            // ../org.xtext.petrinet.mydsl1/src-gen/org/xtext/petrinet/mydsl1/parser/antlr/internal/InternalMyDsl.g:279:28: ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) )
            // ../org.xtext.petrinet.mydsl1/src-gen/org/xtext/petrinet/mydsl1/parser/antlr/internal/InternalMyDsl.g:280:1: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            {
            // ../org.xtext.petrinet.mydsl1/src-gen/org/xtext/petrinet/mydsl1/parser/antlr/internal/InternalMyDsl.g:280:1: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==RULE_STRING) ) {
                alt6=1;
            }
            else if ( (LA6_0==RULE_ID) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // ../org.xtext.petrinet.mydsl1/src-gen/org/xtext/petrinet/mydsl1/parser/antlr/internal/InternalMyDsl.g:280:6: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_ruleEString560); 

                    		current.merge(this_STRING_0);
                        
                     
                        newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../org.xtext.petrinet.mydsl1/src-gen/org/xtext/petrinet/mydsl1/parser/antlr/internal/InternalMyDsl.g:288:10: this_ID_1= RULE_ID
                    {
                    this_ID_1=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleEString586); 

                    		current.merge(this_ID_1);
                        
                     
                        newLeafNode(this_ID_1, grammarAccess.getEStringAccess().getIDTerminalRuleCall_1()); 
                        

                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEString"


    // $ANTLR start "entryRuleEInt"
    // ../org.xtext.petrinet.mydsl1/src-gen/org/xtext/petrinet/mydsl1/parser/antlr/internal/InternalMyDsl.g:303:1: entryRuleEInt returns [String current=null] : iv_ruleEInt= ruleEInt EOF ;
    public final String entryRuleEInt() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEInt = null;


        try {
            // ../org.xtext.petrinet.mydsl1/src-gen/org/xtext/petrinet/mydsl1/parser/antlr/internal/InternalMyDsl.g:304:2: (iv_ruleEInt= ruleEInt EOF )
            // ../org.xtext.petrinet.mydsl1/src-gen/org/xtext/petrinet/mydsl1/parser/antlr/internal/InternalMyDsl.g:305:2: iv_ruleEInt= ruleEInt EOF
            {
             newCompositeNode(grammarAccess.getEIntRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleEInt_in_entryRuleEInt632);
            iv_ruleEInt=ruleEInt();

            state._fsp--;

             current =iv_ruleEInt.getText(); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEInt643); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEInt"


    // $ANTLR start "ruleEInt"
    // ../org.xtext.petrinet.mydsl1/src-gen/org/xtext/petrinet/mydsl1/parser/antlr/internal/InternalMyDsl.g:312:1: ruleEInt returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '-' )? this_INT_1= RULE_INT ) ;
    public final AntlrDatatypeRuleToken ruleEInt() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_1=null;

         enterRule(); 
            
        try {
            // ../org.xtext.petrinet.mydsl1/src-gen/org/xtext/petrinet/mydsl1/parser/antlr/internal/InternalMyDsl.g:315:28: ( ( (kw= '-' )? this_INT_1= RULE_INT ) )
            // ../org.xtext.petrinet.mydsl1/src-gen/org/xtext/petrinet/mydsl1/parser/antlr/internal/InternalMyDsl.g:316:1: ( (kw= '-' )? this_INT_1= RULE_INT )
            {
            // ../org.xtext.petrinet.mydsl1/src-gen/org/xtext/petrinet/mydsl1/parser/antlr/internal/InternalMyDsl.g:316:1: ( (kw= '-' )? this_INT_1= RULE_INT )
            // ../org.xtext.petrinet.mydsl1/src-gen/org/xtext/petrinet/mydsl1/parser/antlr/internal/InternalMyDsl.g:316:2: (kw= '-' )? this_INT_1= RULE_INT
            {
            // ../org.xtext.petrinet.mydsl1/src-gen/org/xtext/petrinet/mydsl1/parser/antlr/internal/InternalMyDsl.g:316:2: (kw= '-' )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==20) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // ../org.xtext.petrinet.mydsl1/src-gen/org/xtext/petrinet/mydsl1/parser/antlr/internal/InternalMyDsl.g:317:2: kw= '-'
                    {
                    kw=(Token)match(input,20,FollowSets000.FOLLOW_20_in_ruleEInt682); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getEIntAccess().getHyphenMinusKeyword_0()); 
                        

                    }
                    break;

            }

            this_INT_1=(Token)match(input,RULE_INT,FollowSets000.FOLLOW_RULE_INT_in_ruleEInt699); 

            		current.merge(this_INT_1);
                
             
                newLeafNode(this_INT_1, grammarAccess.getEIntAccess().getINTTerminalRuleCall_1()); 
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEInt"


    // $ANTLR start "entryRuleTransition"
    // ../org.xtext.petrinet.mydsl1/src-gen/org/xtext/petrinet/mydsl1/parser/antlr/internal/InternalMyDsl.g:337:1: entryRuleTransition returns [EObject current=null] : iv_ruleTransition= ruleTransition EOF ;
    public final EObject entryRuleTransition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTransition = null;


        try {
            // ../org.xtext.petrinet.mydsl1/src-gen/org/xtext/petrinet/mydsl1/parser/antlr/internal/InternalMyDsl.g:338:2: (iv_ruleTransition= ruleTransition EOF )
            // ../org.xtext.petrinet.mydsl1/src-gen/org/xtext/petrinet/mydsl1/parser/antlr/internal/InternalMyDsl.g:339:2: iv_ruleTransition= ruleTransition EOF
            {
             newCompositeNode(grammarAccess.getTransitionRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleTransition_in_entryRuleTransition744);
            iv_ruleTransition=ruleTransition();

            state._fsp--;

             current =iv_ruleTransition; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleTransition754); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTransition"


    // $ANTLR start "ruleTransition"
    // ../org.xtext.petrinet.mydsl1/src-gen/org/xtext/petrinet/mydsl1/parser/antlr/internal/InternalMyDsl.g:346:1: ruleTransition returns [EObject current=null] : ( () otherlv_1= 'Transition' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'connection' otherlv_5= '(' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* otherlv_9= ')' )? otherlv_10= '}' ) ;
    public final EObject ruleTransition() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.petrinet.mydsl1/src-gen/org/xtext/petrinet/mydsl1/parser/antlr/internal/InternalMyDsl.g:349:28: ( ( () otherlv_1= 'Transition' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'connection' otherlv_5= '(' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* otherlv_9= ')' )? otherlv_10= '}' ) )
            // ../org.xtext.petrinet.mydsl1/src-gen/org/xtext/petrinet/mydsl1/parser/antlr/internal/InternalMyDsl.g:350:1: ( () otherlv_1= 'Transition' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'connection' otherlv_5= '(' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* otherlv_9= ')' )? otherlv_10= '}' )
            {
            // ../org.xtext.petrinet.mydsl1/src-gen/org/xtext/petrinet/mydsl1/parser/antlr/internal/InternalMyDsl.g:350:1: ( () otherlv_1= 'Transition' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'connection' otherlv_5= '(' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* otherlv_9= ')' )? otherlv_10= '}' )
            // ../org.xtext.petrinet.mydsl1/src-gen/org/xtext/petrinet/mydsl1/parser/antlr/internal/InternalMyDsl.g:350:2: () otherlv_1= 'Transition' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'connection' otherlv_5= '(' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* otherlv_9= ')' )? otherlv_10= '}'
            {
            // ../org.xtext.petrinet.mydsl1/src-gen/org/xtext/petrinet/mydsl1/parser/antlr/internal/InternalMyDsl.g:350:2: ()
            // ../org.xtext.petrinet.mydsl1/src-gen/org/xtext/petrinet/mydsl1/parser/antlr/internal/InternalMyDsl.g:351:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getTransitionAccess().getTransitionAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,21,FollowSets000.FOLLOW_21_in_ruleTransition800); 

                	newLeafNode(otherlv_1, grammarAccess.getTransitionAccess().getTransitionKeyword_1());
                
            // ../org.xtext.petrinet.mydsl1/src-gen/org/xtext/petrinet/mydsl1/parser/antlr/internal/InternalMyDsl.g:360:1: ( (lv_name_2_0= ruleEString ) )
            // ../org.xtext.petrinet.mydsl1/src-gen/org/xtext/petrinet/mydsl1/parser/antlr/internal/InternalMyDsl.g:361:1: (lv_name_2_0= ruleEString )
            {
            // ../org.xtext.petrinet.mydsl1/src-gen/org/xtext/petrinet/mydsl1/parser/antlr/internal/InternalMyDsl.g:361:1: (lv_name_2_0= ruleEString )
            // ../org.xtext.petrinet.mydsl1/src-gen/org/xtext/petrinet/mydsl1/parser/antlr/internal/InternalMyDsl.g:362:3: lv_name_2_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getTransitionAccess().getNameEStringParserRuleCall_2_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleTransition821);
            lv_name_2_0=ruleEString();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getTransitionRule());
            	        }
                   		set(
                   			current, 
                   			"name",
                    		lv_name_2_0, 
                    		"EString");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_3=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleTransition833); 

                	newLeafNode(otherlv_3, grammarAccess.getTransitionAccess().getLeftCurlyBracketKeyword_3());
                
            // ../org.xtext.petrinet.mydsl1/src-gen/org/xtext/petrinet/mydsl1/parser/antlr/internal/InternalMyDsl.g:382:1: (otherlv_4= 'connection' otherlv_5= '(' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* otherlv_9= ')' )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==16) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // ../org.xtext.petrinet.mydsl1/src-gen/org/xtext/petrinet/mydsl1/parser/antlr/internal/InternalMyDsl.g:382:3: otherlv_4= 'connection' otherlv_5= '(' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* otherlv_9= ')'
                    {
                    otherlv_4=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleTransition846); 

                        	newLeafNode(otherlv_4, grammarAccess.getTransitionAccess().getConnectionKeyword_4_0());
                        
                    otherlv_5=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleTransition858); 

                        	newLeafNode(otherlv_5, grammarAccess.getTransitionAccess().getLeftParenthesisKeyword_4_1());
                        
                    // ../org.xtext.petrinet.mydsl1/src-gen/org/xtext/petrinet/mydsl1/parser/antlr/internal/InternalMyDsl.g:390:1: ( ( ruleEString ) )
                    // ../org.xtext.petrinet.mydsl1/src-gen/org/xtext/petrinet/mydsl1/parser/antlr/internal/InternalMyDsl.g:391:1: ( ruleEString )
                    {
                    // ../org.xtext.petrinet.mydsl1/src-gen/org/xtext/petrinet/mydsl1/parser/antlr/internal/InternalMyDsl.g:391:1: ( ruleEString )
                    // ../org.xtext.petrinet.mydsl1/src-gen/org/xtext/petrinet/mydsl1/parser/antlr/internal/InternalMyDsl.g:392:3: ruleEString
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getTransitionRule());
                    	        }
                            
                     
                    	        newCompositeNode(grammarAccess.getTransitionAccess().getConnectionPlaceCrossReference_4_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleTransition881);
                    ruleEString();

                    state._fsp--;

                     
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../org.xtext.petrinet.mydsl1/src-gen/org/xtext/petrinet/mydsl1/parser/antlr/internal/InternalMyDsl.g:405:2: (otherlv_7= ',' ( ( ruleEString ) ) )*
                    loop8:
                    do {
                        int alt8=2;
                        int LA8_0 = input.LA(1);

                        if ( (LA8_0==18) ) {
                            alt8=1;
                        }


                        switch (alt8) {
                    	case 1 :
                    	    // ../org.xtext.petrinet.mydsl1/src-gen/org/xtext/petrinet/mydsl1/parser/antlr/internal/InternalMyDsl.g:405:4: otherlv_7= ',' ( ( ruleEString ) )
                    	    {
                    	    otherlv_7=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleTransition894); 

                    	        	newLeafNode(otherlv_7, grammarAccess.getTransitionAccess().getCommaKeyword_4_3_0());
                    	        
                    	    // ../org.xtext.petrinet.mydsl1/src-gen/org/xtext/petrinet/mydsl1/parser/antlr/internal/InternalMyDsl.g:409:1: ( ( ruleEString ) )
                    	    // ../org.xtext.petrinet.mydsl1/src-gen/org/xtext/petrinet/mydsl1/parser/antlr/internal/InternalMyDsl.g:410:1: ( ruleEString )
                    	    {
                    	    // ../org.xtext.petrinet.mydsl1/src-gen/org/xtext/petrinet/mydsl1/parser/antlr/internal/InternalMyDsl.g:410:1: ( ruleEString )
                    	    // ../org.xtext.petrinet.mydsl1/src-gen/org/xtext/petrinet/mydsl1/parser/antlr/internal/InternalMyDsl.g:411:3: ruleEString
                    	    {

                    	    			if (current==null) {
                    	    	            current = createModelElement(grammarAccess.getTransitionRule());
                    	    	        }
                    	            
                    	     
                    	    	        newCompositeNode(grammarAccess.getTransitionAccess().getConnectionPlaceCrossReference_4_3_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleTransition917);
                    	    ruleEString();

                    	    state._fsp--;

                    	     
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop8;
                        }
                    } while (true);

                    otherlv_9=(Token)match(input,19,FollowSets000.FOLLOW_19_in_ruleTransition931); 

                        	newLeafNode(otherlv_9, grammarAccess.getTransitionAccess().getRightParenthesisKeyword_4_4());
                        

                    }
                    break;

            }

            otherlv_10=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleTransition945); 

                	newLeafNode(otherlv_10, grammarAccess.getTransitionAccess().getRightCurlyBracketKeyword_5());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTransition"

    // Delegated rules


 

    
    private static class FollowSets000 {
        public static final BitSet FOLLOW_ruleRedPetri_in_entryRuleRedPetri75 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleRedPetri85 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_11_in_ruleRedPetri131 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleRedPetri143 = new BitSet(new long[]{0x0000000000206000L});
        public static final BitSet FOLLOW_ruleTransition_in_ruleRedPetri164 = new BitSet(new long[]{0x0000000000006000L});
        public static final BitSet FOLLOW_rulePlace_in_ruleRedPetri186 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_13_in_ruleRedPetri199 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulePlace_in_entryRulePlace235 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRulePlace245 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_14_in_rulePlace291 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_rulePlace312 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_rulePlace324 = new BitSet(new long[]{0x000000000001A000L});
        public static final BitSet FOLLOW_15_in_rulePlace337 = new BitSet(new long[]{0x0000000000100040L});
        public static final BitSet FOLLOW_ruleEInt_in_rulePlace358 = new BitSet(new long[]{0x0000000000012000L});
        public static final BitSet FOLLOW_16_in_rulePlace373 = new BitSet(new long[]{0x0000000000020000L});
        public static final BitSet FOLLOW_17_in_rulePlace385 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_rulePlace408 = new BitSet(new long[]{0x00000000000C0000L});
        public static final BitSet FOLLOW_18_in_rulePlace421 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_rulePlace444 = new BitSet(new long[]{0x00000000000C0000L});
        public static final BitSet FOLLOW_19_in_rulePlace458 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_13_in_rulePlace472 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_entryRuleEString509 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEString520 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_STRING_in_ruleEString560 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleEString586 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEInt_in_entryRuleEInt632 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEInt643 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_20_in_ruleEInt682 = new BitSet(new long[]{0x0000000000000040L});
        public static final BitSet FOLLOW_RULE_INT_in_ruleEInt699 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTransition_in_entryRuleTransition744 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleTransition754 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_21_in_ruleTransition800 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleTransition821 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleTransition833 = new BitSet(new long[]{0x0000000000012000L});
        public static final BitSet FOLLOW_16_in_ruleTransition846 = new BitSet(new long[]{0x0000000000020000L});
        public static final BitSet FOLLOW_17_in_ruleTransition858 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleTransition881 = new BitSet(new long[]{0x00000000000C0000L});
        public static final BitSet FOLLOW_18_in_ruleTransition894 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleTransition917 = new BitSet(new long[]{0x00000000000C0000L});
        public static final BitSet FOLLOW_19_in_ruleTransition931 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_13_in_ruleTransition945 = new BitSet(new long[]{0x0000000000000002L});
    }


}