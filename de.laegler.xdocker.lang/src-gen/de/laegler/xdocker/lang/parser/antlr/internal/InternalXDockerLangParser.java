package de.laegler.xdocker.lang.parser.antlr.internal; 

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import de.laegler.xdocker.lang.services.XDockerLangGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalXDockerLangParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_FROM", "RULE_MAINTAINER", "RULE_RUN", "RULE_NNL", "RULE_NL", "RULE_SPACES", "RULE_EXAMPLE_HEADING", "RULE_FEATURE_TEXT", "RULE_IN_ORDER_TO", "RULE_AS_A", "RULE_I_WANT_TO", "RULE_SCENARIO_TEXT", "RULE_SCENARIO_OUTLINE_TEXT", "RULE_BACKGROUND_TEXT", "RULE_WHEN_TEXT", "RULE_THEN_TEXT", "RULE_GIVEN_TEXT", "RULE_AND_TEXT", "RULE_EXAMPLE_ROW_END", "RULE_EXAMPLE_CELL", "RULE_CODE", "RULE_TAG", "RULE_SL_COMMENT", "RULE_TEXT", "RULE_WS", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_ANY_OTHER"
    };
    public static final int RULE_WHEN_TEXT=18;
    public static final int RULE_STRING=31;
    public static final int RULE_I_WANT_TO=14;
    public static final int RULE_THEN_TEXT=19;
    public static final int RULE_TAG=25;
    public static final int RULE_FEATURE_TEXT=11;
    public static final int RULE_SCENARIO_TEXT=15;
    public static final int RULE_SL_COMMENT=26;
    public static final int RULE_GIVEN_TEXT=20;
    public static final int RULE_RUN=6;
    public static final int RULE_EXAMPLE_HEADING=10;
    public static final int RULE_BACKGROUND_TEXT=17;
    public static final int EOF=-1;
    public static final int RULE_IN_ORDER_TO=12;
    public static final int RULE_AND_TEXT=21;
    public static final int RULE_ID=29;
    public static final int RULE_WS=28;
    public static final int RULE_SCENARIO_OUTLINE_TEXT=16;
    public static final int RULE_MAINTAINER=5;
    public static final int RULE_ANY_OTHER=33;
    public static final int RULE_SPACES=9;
    public static final int RULE_FROM=4;
    public static final int RULE_CODE=24;
    public static final int RULE_NNL=7;
    public static final int RULE_EXAMPLE_CELL=23;
    public static final int RULE_INT=30;
    public static final int RULE_AS_A=13;
    public static final int RULE_ML_COMMENT=32;
    public static final int RULE_TEXT=27;
    public static final int RULE_NL=8;
    public static final int RULE_EXAMPLE_ROW_END=22;

    // delegates
    // delegators


        public InternalXDockerLangParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalXDockerLangParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalXDockerLangParser.tokenNames; }
    public String getGrammarFileName() { return "../de.laegler.xdocker.lang/src-gen/de/laegler/xdocker/lang/parser/antlr/internal/InternalXDockerLang.g"; }



     	private XDockerLangGrammarAccess grammarAccess;
     	
        public InternalXDockerLangParser(TokenStream input, XDockerLangGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "XDockerModel";	
       	}
       	
       	@Override
       	protected XDockerLangGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start "entryRuleXDockerModel"
    // ../de.laegler.xdocker.lang/src-gen/de/laegler/xdocker/lang/parser/antlr/internal/InternalXDockerLang.g:67:1: entryRuleXDockerModel returns [EObject current=null] : iv_ruleXDockerModel= ruleXDockerModel EOF ;
    public final EObject entryRuleXDockerModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXDockerModel = null;


        try {
            // ../de.laegler.xdocker.lang/src-gen/de/laegler/xdocker/lang/parser/antlr/internal/InternalXDockerLang.g:68:2: (iv_ruleXDockerModel= ruleXDockerModel EOF )
            // ../de.laegler.xdocker.lang/src-gen/de/laegler/xdocker/lang/parser/antlr/internal/InternalXDockerLang.g:69:2: iv_ruleXDockerModel= ruleXDockerModel EOF
            {
             newCompositeNode(grammarAccess.getXDockerModelRule()); 
            pushFollow(FOLLOW_ruleXDockerModel_in_entryRuleXDockerModel75);
            iv_ruleXDockerModel=ruleXDockerModel();

            state._fsp--;

             current =iv_ruleXDockerModel; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleXDockerModel85); 

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
    // $ANTLR end "entryRuleXDockerModel"


    // $ANTLR start "ruleXDockerModel"
    // ../de.laegler.xdocker.lang/src-gen/de/laegler/xdocker/lang/parser/antlr/internal/InternalXDockerLang.g:76:1: ruleXDockerModel returns [EObject current=null] : ( (lv_instruction_0_0= ruleXDockerInstruction ) )* ;
    public final EObject ruleXDockerModel() throws RecognitionException {
        EObject current = null;

        EObject lv_instruction_0_0 = null;


         enterRule(); 
            
        try {
            // ../de.laegler.xdocker.lang/src-gen/de/laegler/xdocker/lang/parser/antlr/internal/InternalXDockerLang.g:79:28: ( ( (lv_instruction_0_0= ruleXDockerInstruction ) )* )
            // ../de.laegler.xdocker.lang/src-gen/de/laegler/xdocker/lang/parser/antlr/internal/InternalXDockerLang.g:80:1: ( (lv_instruction_0_0= ruleXDockerInstruction ) )*
            {
            // ../de.laegler.xdocker.lang/src-gen/de/laegler/xdocker/lang/parser/antlr/internal/InternalXDockerLang.g:80:1: ( (lv_instruction_0_0= ruleXDockerInstruction ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>=RULE_FROM && LA1_0<=RULE_RUN)) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../de.laegler.xdocker.lang/src-gen/de/laegler/xdocker/lang/parser/antlr/internal/InternalXDockerLang.g:81:1: (lv_instruction_0_0= ruleXDockerInstruction )
            	    {
            	    // ../de.laegler.xdocker.lang/src-gen/de/laegler/xdocker/lang/parser/antlr/internal/InternalXDockerLang.g:81:1: (lv_instruction_0_0= ruleXDockerInstruction )
            	    // ../de.laegler.xdocker.lang/src-gen/de/laegler/xdocker/lang/parser/antlr/internal/InternalXDockerLang.g:82:3: lv_instruction_0_0= ruleXDockerInstruction
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getXDockerModelAccess().getInstructionXDockerInstructionParserRuleCall_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleXDockerInstruction_in_ruleXDockerModel130);
            	    lv_instruction_0_0=ruleXDockerInstruction();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getXDockerModelRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"instruction",
            	            		lv_instruction_0_0, 
            	            		"XDockerInstruction");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


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
    // $ANTLR end "ruleXDockerModel"


    // $ANTLR start "entryRuleXDockerInstruction"
    // ../de.laegler.xdocker.lang/src-gen/de/laegler/xdocker/lang/parser/antlr/internal/InternalXDockerLang.g:106:1: entryRuleXDockerInstruction returns [EObject current=null] : iv_ruleXDockerInstruction= ruleXDockerInstruction EOF ;
    public final EObject entryRuleXDockerInstruction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXDockerInstruction = null;


        try {
            // ../de.laegler.xdocker.lang/src-gen/de/laegler/xdocker/lang/parser/antlr/internal/InternalXDockerLang.g:107:2: (iv_ruleXDockerInstruction= ruleXDockerInstruction EOF )
            // ../de.laegler.xdocker.lang/src-gen/de/laegler/xdocker/lang/parser/antlr/internal/InternalXDockerLang.g:108:2: iv_ruleXDockerInstruction= ruleXDockerInstruction EOF
            {
             newCompositeNode(grammarAccess.getXDockerInstructionRule()); 
            pushFollow(FOLLOW_ruleXDockerInstruction_in_entryRuleXDockerInstruction166);
            iv_ruleXDockerInstruction=ruleXDockerInstruction();

            state._fsp--;

             current =iv_ruleXDockerInstruction; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleXDockerInstruction176); 

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
    // $ANTLR end "entryRuleXDockerInstruction"


    // $ANTLR start "ruleXDockerInstruction"
    // ../de.laegler.xdocker.lang/src-gen/de/laegler/xdocker/lang/parser/antlr/internal/InternalXDockerLang.g:115:1: ruleXDockerInstruction returns [EObject current=null] : (this_XDockerFrom_0= ruleXDockerFrom | this_XDockerMaintainer_1= ruleXDockerMaintainer | this_XDockerRun_2= ruleXDockerRun ) ;
    public final EObject ruleXDockerInstruction() throws RecognitionException {
        EObject current = null;

        EObject this_XDockerFrom_0 = null;

        EObject this_XDockerMaintainer_1 = null;

        EObject this_XDockerRun_2 = null;


         enterRule(); 
            
        try {
            // ../de.laegler.xdocker.lang/src-gen/de/laegler/xdocker/lang/parser/antlr/internal/InternalXDockerLang.g:118:28: ( (this_XDockerFrom_0= ruleXDockerFrom | this_XDockerMaintainer_1= ruleXDockerMaintainer | this_XDockerRun_2= ruleXDockerRun ) )
            // ../de.laegler.xdocker.lang/src-gen/de/laegler/xdocker/lang/parser/antlr/internal/InternalXDockerLang.g:119:1: (this_XDockerFrom_0= ruleXDockerFrom | this_XDockerMaintainer_1= ruleXDockerMaintainer | this_XDockerRun_2= ruleXDockerRun )
            {
            // ../de.laegler.xdocker.lang/src-gen/de/laegler/xdocker/lang/parser/antlr/internal/InternalXDockerLang.g:119:1: (this_XDockerFrom_0= ruleXDockerFrom | this_XDockerMaintainer_1= ruleXDockerMaintainer | this_XDockerRun_2= ruleXDockerRun )
            int alt2=3;
            switch ( input.LA(1) ) {
            case RULE_FROM:
                {
                alt2=1;
                }
                break;
            case RULE_MAINTAINER:
                {
                alt2=2;
                }
                break;
            case RULE_RUN:
                {
                alt2=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // ../de.laegler.xdocker.lang/src-gen/de/laegler/xdocker/lang/parser/antlr/internal/InternalXDockerLang.g:120:5: this_XDockerFrom_0= ruleXDockerFrom
                    {
                     
                            newCompositeNode(grammarAccess.getXDockerInstructionAccess().getXDockerFromParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleXDockerFrom_in_ruleXDockerInstruction223);
                    this_XDockerFrom_0=ruleXDockerFrom();

                    state._fsp--;

                     
                            current = this_XDockerFrom_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../de.laegler.xdocker.lang/src-gen/de/laegler/xdocker/lang/parser/antlr/internal/InternalXDockerLang.g:130:5: this_XDockerMaintainer_1= ruleXDockerMaintainer
                    {
                     
                            newCompositeNode(grammarAccess.getXDockerInstructionAccess().getXDockerMaintainerParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleXDockerMaintainer_in_ruleXDockerInstruction250);
                    this_XDockerMaintainer_1=ruleXDockerMaintainer();

                    state._fsp--;

                     
                            current = this_XDockerMaintainer_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../de.laegler.xdocker.lang/src-gen/de/laegler/xdocker/lang/parser/antlr/internal/InternalXDockerLang.g:140:5: this_XDockerRun_2= ruleXDockerRun
                    {
                     
                            newCompositeNode(grammarAccess.getXDockerInstructionAccess().getXDockerRunParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_ruleXDockerRun_in_ruleXDockerInstruction277);
                    this_XDockerRun_2=ruleXDockerRun();

                    state._fsp--;

                     
                            current = this_XDockerRun_2; 
                            afterParserOrEnumRuleCall();
                        

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
    // $ANTLR end "ruleXDockerInstruction"


    // $ANTLR start "entryRuleXDockerFrom"
    // ../de.laegler.xdocker.lang/src-gen/de/laegler/xdocker/lang/parser/antlr/internal/InternalXDockerLang.g:156:1: entryRuleXDockerFrom returns [EObject current=null] : iv_ruleXDockerFrom= ruleXDockerFrom EOF ;
    public final EObject entryRuleXDockerFrom() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXDockerFrom = null;


        try {
            // ../de.laegler.xdocker.lang/src-gen/de/laegler/xdocker/lang/parser/antlr/internal/InternalXDockerLang.g:157:2: (iv_ruleXDockerFrom= ruleXDockerFrom EOF )
            // ../de.laegler.xdocker.lang/src-gen/de/laegler/xdocker/lang/parser/antlr/internal/InternalXDockerLang.g:158:2: iv_ruleXDockerFrom= ruleXDockerFrom EOF
            {
             newCompositeNode(grammarAccess.getXDockerFromRule()); 
            pushFollow(FOLLOW_ruleXDockerFrom_in_entryRuleXDockerFrom312);
            iv_ruleXDockerFrom=ruleXDockerFrom();

            state._fsp--;

             current =iv_ruleXDockerFrom; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleXDockerFrom322); 

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
    // $ANTLR end "entryRuleXDockerFrom"


    // $ANTLR start "ruleXDockerFrom"
    // ../de.laegler.xdocker.lang/src-gen/de/laegler/xdocker/lang/parser/antlr/internal/InternalXDockerLang.g:165:1: ruleXDockerFrom returns [EObject current=null] : ( (lv_name_0_0= RULE_FROM ) ) ;
    public final EObject ruleXDockerFrom() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;

         enterRule(); 
            
        try {
            // ../de.laegler.xdocker.lang/src-gen/de/laegler/xdocker/lang/parser/antlr/internal/InternalXDockerLang.g:168:28: ( ( (lv_name_0_0= RULE_FROM ) ) )
            // ../de.laegler.xdocker.lang/src-gen/de/laegler/xdocker/lang/parser/antlr/internal/InternalXDockerLang.g:169:1: ( (lv_name_0_0= RULE_FROM ) )
            {
            // ../de.laegler.xdocker.lang/src-gen/de/laegler/xdocker/lang/parser/antlr/internal/InternalXDockerLang.g:169:1: ( (lv_name_0_0= RULE_FROM ) )
            // ../de.laegler.xdocker.lang/src-gen/de/laegler/xdocker/lang/parser/antlr/internal/InternalXDockerLang.g:170:1: (lv_name_0_0= RULE_FROM )
            {
            // ../de.laegler.xdocker.lang/src-gen/de/laegler/xdocker/lang/parser/antlr/internal/InternalXDockerLang.g:170:1: (lv_name_0_0= RULE_FROM )
            // ../de.laegler.xdocker.lang/src-gen/de/laegler/xdocker/lang/parser/antlr/internal/InternalXDockerLang.g:171:3: lv_name_0_0= RULE_FROM
            {
            lv_name_0_0=(Token)match(input,RULE_FROM,FOLLOW_RULE_FROM_in_ruleXDockerFrom363); 

            			newLeafNode(lv_name_0_0, grammarAccess.getXDockerFromAccess().getNameFROMTerminalRuleCall_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getXDockerFromRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_0_0, 
                    		"FROM");
            	    

            }


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
    // $ANTLR end "ruleXDockerFrom"


    // $ANTLR start "entryRuleXDockerMaintainer"
    // ../de.laegler.xdocker.lang/src-gen/de/laegler/xdocker/lang/parser/antlr/internal/InternalXDockerLang.g:195:1: entryRuleXDockerMaintainer returns [EObject current=null] : iv_ruleXDockerMaintainer= ruleXDockerMaintainer EOF ;
    public final EObject entryRuleXDockerMaintainer() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXDockerMaintainer = null;


        try {
            // ../de.laegler.xdocker.lang/src-gen/de/laegler/xdocker/lang/parser/antlr/internal/InternalXDockerLang.g:196:2: (iv_ruleXDockerMaintainer= ruleXDockerMaintainer EOF )
            // ../de.laegler.xdocker.lang/src-gen/de/laegler/xdocker/lang/parser/antlr/internal/InternalXDockerLang.g:197:2: iv_ruleXDockerMaintainer= ruleXDockerMaintainer EOF
            {
             newCompositeNode(grammarAccess.getXDockerMaintainerRule()); 
            pushFollow(FOLLOW_ruleXDockerMaintainer_in_entryRuleXDockerMaintainer403);
            iv_ruleXDockerMaintainer=ruleXDockerMaintainer();

            state._fsp--;

             current =iv_ruleXDockerMaintainer; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleXDockerMaintainer413); 

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
    // $ANTLR end "entryRuleXDockerMaintainer"


    // $ANTLR start "ruleXDockerMaintainer"
    // ../de.laegler.xdocker.lang/src-gen/de/laegler/xdocker/lang/parser/antlr/internal/InternalXDockerLang.g:204:1: ruleXDockerMaintainer returns [EObject current=null] : ( (lv_name_0_0= RULE_MAINTAINER ) ) ;
    public final EObject ruleXDockerMaintainer() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;

         enterRule(); 
            
        try {
            // ../de.laegler.xdocker.lang/src-gen/de/laegler/xdocker/lang/parser/antlr/internal/InternalXDockerLang.g:207:28: ( ( (lv_name_0_0= RULE_MAINTAINER ) ) )
            // ../de.laegler.xdocker.lang/src-gen/de/laegler/xdocker/lang/parser/antlr/internal/InternalXDockerLang.g:208:1: ( (lv_name_0_0= RULE_MAINTAINER ) )
            {
            // ../de.laegler.xdocker.lang/src-gen/de/laegler/xdocker/lang/parser/antlr/internal/InternalXDockerLang.g:208:1: ( (lv_name_0_0= RULE_MAINTAINER ) )
            // ../de.laegler.xdocker.lang/src-gen/de/laegler/xdocker/lang/parser/antlr/internal/InternalXDockerLang.g:209:1: (lv_name_0_0= RULE_MAINTAINER )
            {
            // ../de.laegler.xdocker.lang/src-gen/de/laegler/xdocker/lang/parser/antlr/internal/InternalXDockerLang.g:209:1: (lv_name_0_0= RULE_MAINTAINER )
            // ../de.laegler.xdocker.lang/src-gen/de/laegler/xdocker/lang/parser/antlr/internal/InternalXDockerLang.g:210:3: lv_name_0_0= RULE_MAINTAINER
            {
            lv_name_0_0=(Token)match(input,RULE_MAINTAINER,FOLLOW_RULE_MAINTAINER_in_ruleXDockerMaintainer454); 

            			newLeafNode(lv_name_0_0, grammarAccess.getXDockerMaintainerAccess().getNameMAINTAINERTerminalRuleCall_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getXDockerMaintainerRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_0_0, 
                    		"MAINTAINER");
            	    

            }


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
    // $ANTLR end "ruleXDockerMaintainer"


    // $ANTLR start "entryRuleXDockerRun"
    // ../de.laegler.xdocker.lang/src-gen/de/laegler/xdocker/lang/parser/antlr/internal/InternalXDockerLang.g:234:1: entryRuleXDockerRun returns [EObject current=null] : iv_ruleXDockerRun= ruleXDockerRun EOF ;
    public final EObject entryRuleXDockerRun() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXDockerRun = null;


        try {
            // ../de.laegler.xdocker.lang/src-gen/de/laegler/xdocker/lang/parser/antlr/internal/InternalXDockerLang.g:235:2: (iv_ruleXDockerRun= ruleXDockerRun EOF )
            // ../de.laegler.xdocker.lang/src-gen/de/laegler/xdocker/lang/parser/antlr/internal/InternalXDockerLang.g:236:2: iv_ruleXDockerRun= ruleXDockerRun EOF
            {
             newCompositeNode(grammarAccess.getXDockerRunRule()); 
            pushFollow(FOLLOW_ruleXDockerRun_in_entryRuleXDockerRun494);
            iv_ruleXDockerRun=ruleXDockerRun();

            state._fsp--;

             current =iv_ruleXDockerRun; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleXDockerRun504); 

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
    // $ANTLR end "entryRuleXDockerRun"


    // $ANTLR start "ruleXDockerRun"
    // ../de.laegler.xdocker.lang/src-gen/de/laegler/xdocker/lang/parser/antlr/internal/InternalXDockerLang.g:243:1: ruleXDockerRun returns [EObject current=null] : ( (lv_name_0_0= RULE_RUN ) ) ;
    public final EObject ruleXDockerRun() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;

         enterRule(); 
            
        try {
            // ../de.laegler.xdocker.lang/src-gen/de/laegler/xdocker/lang/parser/antlr/internal/InternalXDockerLang.g:246:28: ( ( (lv_name_0_0= RULE_RUN ) ) )
            // ../de.laegler.xdocker.lang/src-gen/de/laegler/xdocker/lang/parser/antlr/internal/InternalXDockerLang.g:247:1: ( (lv_name_0_0= RULE_RUN ) )
            {
            // ../de.laegler.xdocker.lang/src-gen/de/laegler/xdocker/lang/parser/antlr/internal/InternalXDockerLang.g:247:1: ( (lv_name_0_0= RULE_RUN ) )
            // ../de.laegler.xdocker.lang/src-gen/de/laegler/xdocker/lang/parser/antlr/internal/InternalXDockerLang.g:248:1: (lv_name_0_0= RULE_RUN )
            {
            // ../de.laegler.xdocker.lang/src-gen/de/laegler/xdocker/lang/parser/antlr/internal/InternalXDockerLang.g:248:1: (lv_name_0_0= RULE_RUN )
            // ../de.laegler.xdocker.lang/src-gen/de/laegler/xdocker/lang/parser/antlr/internal/InternalXDockerLang.g:249:3: lv_name_0_0= RULE_RUN
            {
            lv_name_0_0=(Token)match(input,RULE_RUN,FOLLOW_RULE_RUN_in_ruleXDockerRun545); 

            			newLeafNode(lv_name_0_0, grammarAccess.getXDockerRunAccess().getNameRUNTerminalRuleCall_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getXDockerRunRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_0_0, 
                    		"RUN");
            	    

            }


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
    // $ANTLR end "ruleXDockerRun"

    // Delegated rules


 

    public static final BitSet FOLLOW_ruleXDockerModel_in_entryRuleXDockerModel75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXDockerModel85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXDockerInstruction_in_ruleXDockerModel130 = new BitSet(new long[]{0x0000000000000072L});
    public static final BitSet FOLLOW_ruleXDockerInstruction_in_entryRuleXDockerInstruction166 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXDockerInstruction176 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXDockerFrom_in_ruleXDockerInstruction223 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXDockerMaintainer_in_ruleXDockerInstruction250 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXDockerRun_in_ruleXDockerInstruction277 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXDockerFrom_in_entryRuleXDockerFrom312 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXDockerFrom322 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_FROM_in_ruleXDockerFrom363 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXDockerMaintainer_in_entryRuleXDockerMaintainer403 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXDockerMaintainer413 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_MAINTAINER_in_ruleXDockerMaintainer454 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXDockerRun_in_entryRuleXDockerRun494 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXDockerRun504 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_RUN_in_ruleXDockerRun545 = new BitSet(new long[]{0x0000000000000002L});

}