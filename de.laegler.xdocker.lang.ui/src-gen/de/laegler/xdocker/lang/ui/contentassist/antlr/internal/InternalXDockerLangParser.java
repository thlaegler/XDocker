package de.laegler.xdocker.lang.ui.contentassist.antlr.internal; 

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
import de.laegler.xdocker.lang.services.XDockerLangGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalXDockerLangParser extends AbstractInternalContentAssistParser {
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
    public String getGrammarFileName() { return "../de.laegler.xdocker.lang.ui/src-gen/de/laegler/xdocker/lang/ui/contentassist/antlr/internal/InternalXDockerLang.g"; }


     
     	private XDockerLangGrammarAccess grammarAccess;
     	
        public void setGrammarAccess(XDockerLangGrammarAccess grammarAccess) {
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




    // $ANTLR start "entryRuleXDockerModel"
    // ../de.laegler.xdocker.lang.ui/src-gen/de/laegler/xdocker/lang/ui/contentassist/antlr/internal/InternalXDockerLang.g:60:1: entryRuleXDockerModel : ruleXDockerModel EOF ;
    public final void entryRuleXDockerModel() throws RecognitionException {
        try {
            // ../de.laegler.xdocker.lang.ui/src-gen/de/laegler/xdocker/lang/ui/contentassist/antlr/internal/InternalXDockerLang.g:61:1: ( ruleXDockerModel EOF )
            // ../de.laegler.xdocker.lang.ui/src-gen/de/laegler/xdocker/lang/ui/contentassist/antlr/internal/InternalXDockerLang.g:62:1: ruleXDockerModel EOF
            {
             before(grammarAccess.getXDockerModelRule()); 
            pushFollow(FOLLOW_ruleXDockerModel_in_entryRuleXDockerModel61);
            ruleXDockerModel();

            state._fsp--;

             after(grammarAccess.getXDockerModelRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleXDockerModel68); 

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
    // $ANTLR end "entryRuleXDockerModel"


    // $ANTLR start "ruleXDockerModel"
    // ../de.laegler.xdocker.lang.ui/src-gen/de/laegler/xdocker/lang/ui/contentassist/antlr/internal/InternalXDockerLang.g:69:1: ruleXDockerModel : ( ( rule__XDockerModel__InstructionAssignment )* ) ;
    public final void ruleXDockerModel() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.laegler.xdocker.lang.ui/src-gen/de/laegler/xdocker/lang/ui/contentassist/antlr/internal/InternalXDockerLang.g:73:2: ( ( ( rule__XDockerModel__InstructionAssignment )* ) )
            // ../de.laegler.xdocker.lang.ui/src-gen/de/laegler/xdocker/lang/ui/contentassist/antlr/internal/InternalXDockerLang.g:74:1: ( ( rule__XDockerModel__InstructionAssignment )* )
            {
            // ../de.laegler.xdocker.lang.ui/src-gen/de/laegler/xdocker/lang/ui/contentassist/antlr/internal/InternalXDockerLang.g:74:1: ( ( rule__XDockerModel__InstructionAssignment )* )
            // ../de.laegler.xdocker.lang.ui/src-gen/de/laegler/xdocker/lang/ui/contentassist/antlr/internal/InternalXDockerLang.g:75:1: ( rule__XDockerModel__InstructionAssignment )*
            {
             before(grammarAccess.getXDockerModelAccess().getInstructionAssignment()); 
            // ../de.laegler.xdocker.lang.ui/src-gen/de/laegler/xdocker/lang/ui/contentassist/antlr/internal/InternalXDockerLang.g:76:1: ( rule__XDockerModel__InstructionAssignment )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>=RULE_FROM && LA1_0<=RULE_RUN)) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../de.laegler.xdocker.lang.ui/src-gen/de/laegler/xdocker/lang/ui/contentassist/antlr/internal/InternalXDockerLang.g:76:2: rule__XDockerModel__InstructionAssignment
            	    {
            	    pushFollow(FOLLOW_rule__XDockerModel__InstructionAssignment_in_ruleXDockerModel94);
            	    rule__XDockerModel__InstructionAssignment();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

             after(grammarAccess.getXDockerModelAccess().getInstructionAssignment()); 

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
    // $ANTLR end "ruleXDockerModel"


    // $ANTLR start "entryRuleXDockerInstruction"
    // ../de.laegler.xdocker.lang.ui/src-gen/de/laegler/xdocker/lang/ui/contentassist/antlr/internal/InternalXDockerLang.g:88:1: entryRuleXDockerInstruction : ruleXDockerInstruction EOF ;
    public final void entryRuleXDockerInstruction() throws RecognitionException {
        try {
            // ../de.laegler.xdocker.lang.ui/src-gen/de/laegler/xdocker/lang/ui/contentassist/antlr/internal/InternalXDockerLang.g:89:1: ( ruleXDockerInstruction EOF )
            // ../de.laegler.xdocker.lang.ui/src-gen/de/laegler/xdocker/lang/ui/contentassist/antlr/internal/InternalXDockerLang.g:90:1: ruleXDockerInstruction EOF
            {
             before(grammarAccess.getXDockerInstructionRule()); 
            pushFollow(FOLLOW_ruleXDockerInstruction_in_entryRuleXDockerInstruction122);
            ruleXDockerInstruction();

            state._fsp--;

             after(grammarAccess.getXDockerInstructionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleXDockerInstruction129); 

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
    // $ANTLR end "entryRuleXDockerInstruction"


    // $ANTLR start "ruleXDockerInstruction"
    // ../de.laegler.xdocker.lang.ui/src-gen/de/laegler/xdocker/lang/ui/contentassist/antlr/internal/InternalXDockerLang.g:97:1: ruleXDockerInstruction : ( ( rule__XDockerInstruction__Alternatives ) ) ;
    public final void ruleXDockerInstruction() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.laegler.xdocker.lang.ui/src-gen/de/laegler/xdocker/lang/ui/contentassist/antlr/internal/InternalXDockerLang.g:101:2: ( ( ( rule__XDockerInstruction__Alternatives ) ) )
            // ../de.laegler.xdocker.lang.ui/src-gen/de/laegler/xdocker/lang/ui/contentassist/antlr/internal/InternalXDockerLang.g:102:1: ( ( rule__XDockerInstruction__Alternatives ) )
            {
            // ../de.laegler.xdocker.lang.ui/src-gen/de/laegler/xdocker/lang/ui/contentassist/antlr/internal/InternalXDockerLang.g:102:1: ( ( rule__XDockerInstruction__Alternatives ) )
            // ../de.laegler.xdocker.lang.ui/src-gen/de/laegler/xdocker/lang/ui/contentassist/antlr/internal/InternalXDockerLang.g:103:1: ( rule__XDockerInstruction__Alternatives )
            {
             before(grammarAccess.getXDockerInstructionAccess().getAlternatives()); 
            // ../de.laegler.xdocker.lang.ui/src-gen/de/laegler/xdocker/lang/ui/contentassist/antlr/internal/InternalXDockerLang.g:104:1: ( rule__XDockerInstruction__Alternatives )
            // ../de.laegler.xdocker.lang.ui/src-gen/de/laegler/xdocker/lang/ui/contentassist/antlr/internal/InternalXDockerLang.g:104:2: rule__XDockerInstruction__Alternatives
            {
            pushFollow(FOLLOW_rule__XDockerInstruction__Alternatives_in_ruleXDockerInstruction155);
            rule__XDockerInstruction__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getXDockerInstructionAccess().getAlternatives()); 

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
    // $ANTLR end "ruleXDockerInstruction"


    // $ANTLR start "entryRuleXDockerFrom"
    // ../de.laegler.xdocker.lang.ui/src-gen/de/laegler/xdocker/lang/ui/contentassist/antlr/internal/InternalXDockerLang.g:116:1: entryRuleXDockerFrom : ruleXDockerFrom EOF ;
    public final void entryRuleXDockerFrom() throws RecognitionException {
        try {
            // ../de.laegler.xdocker.lang.ui/src-gen/de/laegler/xdocker/lang/ui/contentassist/antlr/internal/InternalXDockerLang.g:117:1: ( ruleXDockerFrom EOF )
            // ../de.laegler.xdocker.lang.ui/src-gen/de/laegler/xdocker/lang/ui/contentassist/antlr/internal/InternalXDockerLang.g:118:1: ruleXDockerFrom EOF
            {
             before(grammarAccess.getXDockerFromRule()); 
            pushFollow(FOLLOW_ruleXDockerFrom_in_entryRuleXDockerFrom182);
            ruleXDockerFrom();

            state._fsp--;

             after(grammarAccess.getXDockerFromRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleXDockerFrom189); 

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
    // $ANTLR end "entryRuleXDockerFrom"


    // $ANTLR start "ruleXDockerFrom"
    // ../de.laegler.xdocker.lang.ui/src-gen/de/laegler/xdocker/lang/ui/contentassist/antlr/internal/InternalXDockerLang.g:125:1: ruleXDockerFrom : ( ( rule__XDockerFrom__NameAssignment ) ) ;
    public final void ruleXDockerFrom() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.laegler.xdocker.lang.ui/src-gen/de/laegler/xdocker/lang/ui/contentassist/antlr/internal/InternalXDockerLang.g:129:2: ( ( ( rule__XDockerFrom__NameAssignment ) ) )
            // ../de.laegler.xdocker.lang.ui/src-gen/de/laegler/xdocker/lang/ui/contentassist/antlr/internal/InternalXDockerLang.g:130:1: ( ( rule__XDockerFrom__NameAssignment ) )
            {
            // ../de.laegler.xdocker.lang.ui/src-gen/de/laegler/xdocker/lang/ui/contentassist/antlr/internal/InternalXDockerLang.g:130:1: ( ( rule__XDockerFrom__NameAssignment ) )
            // ../de.laegler.xdocker.lang.ui/src-gen/de/laegler/xdocker/lang/ui/contentassist/antlr/internal/InternalXDockerLang.g:131:1: ( rule__XDockerFrom__NameAssignment )
            {
             before(grammarAccess.getXDockerFromAccess().getNameAssignment()); 
            // ../de.laegler.xdocker.lang.ui/src-gen/de/laegler/xdocker/lang/ui/contentassist/antlr/internal/InternalXDockerLang.g:132:1: ( rule__XDockerFrom__NameAssignment )
            // ../de.laegler.xdocker.lang.ui/src-gen/de/laegler/xdocker/lang/ui/contentassist/antlr/internal/InternalXDockerLang.g:132:2: rule__XDockerFrom__NameAssignment
            {
            pushFollow(FOLLOW_rule__XDockerFrom__NameAssignment_in_ruleXDockerFrom215);
            rule__XDockerFrom__NameAssignment();

            state._fsp--;


            }

             after(grammarAccess.getXDockerFromAccess().getNameAssignment()); 

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
    // $ANTLR end "ruleXDockerFrom"


    // $ANTLR start "entryRuleXDockerMaintainer"
    // ../de.laegler.xdocker.lang.ui/src-gen/de/laegler/xdocker/lang/ui/contentassist/antlr/internal/InternalXDockerLang.g:144:1: entryRuleXDockerMaintainer : ruleXDockerMaintainer EOF ;
    public final void entryRuleXDockerMaintainer() throws RecognitionException {
        try {
            // ../de.laegler.xdocker.lang.ui/src-gen/de/laegler/xdocker/lang/ui/contentassist/antlr/internal/InternalXDockerLang.g:145:1: ( ruleXDockerMaintainer EOF )
            // ../de.laegler.xdocker.lang.ui/src-gen/de/laegler/xdocker/lang/ui/contentassist/antlr/internal/InternalXDockerLang.g:146:1: ruleXDockerMaintainer EOF
            {
             before(grammarAccess.getXDockerMaintainerRule()); 
            pushFollow(FOLLOW_ruleXDockerMaintainer_in_entryRuleXDockerMaintainer242);
            ruleXDockerMaintainer();

            state._fsp--;

             after(grammarAccess.getXDockerMaintainerRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleXDockerMaintainer249); 

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
    // $ANTLR end "entryRuleXDockerMaintainer"


    // $ANTLR start "ruleXDockerMaintainer"
    // ../de.laegler.xdocker.lang.ui/src-gen/de/laegler/xdocker/lang/ui/contentassist/antlr/internal/InternalXDockerLang.g:153:1: ruleXDockerMaintainer : ( ( rule__XDockerMaintainer__NameAssignment ) ) ;
    public final void ruleXDockerMaintainer() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.laegler.xdocker.lang.ui/src-gen/de/laegler/xdocker/lang/ui/contentassist/antlr/internal/InternalXDockerLang.g:157:2: ( ( ( rule__XDockerMaintainer__NameAssignment ) ) )
            // ../de.laegler.xdocker.lang.ui/src-gen/de/laegler/xdocker/lang/ui/contentassist/antlr/internal/InternalXDockerLang.g:158:1: ( ( rule__XDockerMaintainer__NameAssignment ) )
            {
            // ../de.laegler.xdocker.lang.ui/src-gen/de/laegler/xdocker/lang/ui/contentassist/antlr/internal/InternalXDockerLang.g:158:1: ( ( rule__XDockerMaintainer__NameAssignment ) )
            // ../de.laegler.xdocker.lang.ui/src-gen/de/laegler/xdocker/lang/ui/contentassist/antlr/internal/InternalXDockerLang.g:159:1: ( rule__XDockerMaintainer__NameAssignment )
            {
             before(grammarAccess.getXDockerMaintainerAccess().getNameAssignment()); 
            // ../de.laegler.xdocker.lang.ui/src-gen/de/laegler/xdocker/lang/ui/contentassist/antlr/internal/InternalXDockerLang.g:160:1: ( rule__XDockerMaintainer__NameAssignment )
            // ../de.laegler.xdocker.lang.ui/src-gen/de/laegler/xdocker/lang/ui/contentassist/antlr/internal/InternalXDockerLang.g:160:2: rule__XDockerMaintainer__NameAssignment
            {
            pushFollow(FOLLOW_rule__XDockerMaintainer__NameAssignment_in_ruleXDockerMaintainer275);
            rule__XDockerMaintainer__NameAssignment();

            state._fsp--;


            }

             after(grammarAccess.getXDockerMaintainerAccess().getNameAssignment()); 

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
    // $ANTLR end "ruleXDockerMaintainer"


    // $ANTLR start "entryRuleXDockerRun"
    // ../de.laegler.xdocker.lang.ui/src-gen/de/laegler/xdocker/lang/ui/contentassist/antlr/internal/InternalXDockerLang.g:172:1: entryRuleXDockerRun : ruleXDockerRun EOF ;
    public final void entryRuleXDockerRun() throws RecognitionException {
        try {
            // ../de.laegler.xdocker.lang.ui/src-gen/de/laegler/xdocker/lang/ui/contentassist/antlr/internal/InternalXDockerLang.g:173:1: ( ruleXDockerRun EOF )
            // ../de.laegler.xdocker.lang.ui/src-gen/de/laegler/xdocker/lang/ui/contentassist/antlr/internal/InternalXDockerLang.g:174:1: ruleXDockerRun EOF
            {
             before(grammarAccess.getXDockerRunRule()); 
            pushFollow(FOLLOW_ruleXDockerRun_in_entryRuleXDockerRun302);
            ruleXDockerRun();

            state._fsp--;

             after(grammarAccess.getXDockerRunRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleXDockerRun309); 

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
    // $ANTLR end "entryRuleXDockerRun"


    // $ANTLR start "ruleXDockerRun"
    // ../de.laegler.xdocker.lang.ui/src-gen/de/laegler/xdocker/lang/ui/contentassist/antlr/internal/InternalXDockerLang.g:181:1: ruleXDockerRun : ( ( rule__XDockerRun__NameAssignment ) ) ;
    public final void ruleXDockerRun() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.laegler.xdocker.lang.ui/src-gen/de/laegler/xdocker/lang/ui/contentassist/antlr/internal/InternalXDockerLang.g:185:2: ( ( ( rule__XDockerRun__NameAssignment ) ) )
            // ../de.laegler.xdocker.lang.ui/src-gen/de/laegler/xdocker/lang/ui/contentassist/antlr/internal/InternalXDockerLang.g:186:1: ( ( rule__XDockerRun__NameAssignment ) )
            {
            // ../de.laegler.xdocker.lang.ui/src-gen/de/laegler/xdocker/lang/ui/contentassist/antlr/internal/InternalXDockerLang.g:186:1: ( ( rule__XDockerRun__NameAssignment ) )
            // ../de.laegler.xdocker.lang.ui/src-gen/de/laegler/xdocker/lang/ui/contentassist/antlr/internal/InternalXDockerLang.g:187:1: ( rule__XDockerRun__NameAssignment )
            {
             before(grammarAccess.getXDockerRunAccess().getNameAssignment()); 
            // ../de.laegler.xdocker.lang.ui/src-gen/de/laegler/xdocker/lang/ui/contentassist/antlr/internal/InternalXDockerLang.g:188:1: ( rule__XDockerRun__NameAssignment )
            // ../de.laegler.xdocker.lang.ui/src-gen/de/laegler/xdocker/lang/ui/contentassist/antlr/internal/InternalXDockerLang.g:188:2: rule__XDockerRun__NameAssignment
            {
            pushFollow(FOLLOW_rule__XDockerRun__NameAssignment_in_ruleXDockerRun335);
            rule__XDockerRun__NameAssignment();

            state._fsp--;


            }

             after(grammarAccess.getXDockerRunAccess().getNameAssignment()); 

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
    // $ANTLR end "ruleXDockerRun"


    // $ANTLR start "rule__XDockerInstruction__Alternatives"
    // ../de.laegler.xdocker.lang.ui/src-gen/de/laegler/xdocker/lang/ui/contentassist/antlr/internal/InternalXDockerLang.g:202:1: rule__XDockerInstruction__Alternatives : ( ( ruleXDockerFrom ) | ( ruleXDockerMaintainer ) | ( ruleXDockerRun ) );
    public final void rule__XDockerInstruction__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.laegler.xdocker.lang.ui/src-gen/de/laegler/xdocker/lang/ui/contentassist/antlr/internal/InternalXDockerLang.g:206:1: ( ( ruleXDockerFrom ) | ( ruleXDockerMaintainer ) | ( ruleXDockerRun ) )
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
                    // ../de.laegler.xdocker.lang.ui/src-gen/de/laegler/xdocker/lang/ui/contentassist/antlr/internal/InternalXDockerLang.g:207:1: ( ruleXDockerFrom )
                    {
                    // ../de.laegler.xdocker.lang.ui/src-gen/de/laegler/xdocker/lang/ui/contentassist/antlr/internal/InternalXDockerLang.g:207:1: ( ruleXDockerFrom )
                    // ../de.laegler.xdocker.lang.ui/src-gen/de/laegler/xdocker/lang/ui/contentassist/antlr/internal/InternalXDockerLang.g:208:1: ruleXDockerFrom
                    {
                     before(grammarAccess.getXDockerInstructionAccess().getXDockerFromParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleXDockerFrom_in_rule__XDockerInstruction__Alternatives373);
                    ruleXDockerFrom();

                    state._fsp--;

                     after(grammarAccess.getXDockerInstructionAccess().getXDockerFromParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../de.laegler.xdocker.lang.ui/src-gen/de/laegler/xdocker/lang/ui/contentassist/antlr/internal/InternalXDockerLang.g:213:6: ( ruleXDockerMaintainer )
                    {
                    // ../de.laegler.xdocker.lang.ui/src-gen/de/laegler/xdocker/lang/ui/contentassist/antlr/internal/InternalXDockerLang.g:213:6: ( ruleXDockerMaintainer )
                    // ../de.laegler.xdocker.lang.ui/src-gen/de/laegler/xdocker/lang/ui/contentassist/antlr/internal/InternalXDockerLang.g:214:1: ruleXDockerMaintainer
                    {
                     before(grammarAccess.getXDockerInstructionAccess().getXDockerMaintainerParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleXDockerMaintainer_in_rule__XDockerInstruction__Alternatives390);
                    ruleXDockerMaintainer();

                    state._fsp--;

                     after(grammarAccess.getXDockerInstructionAccess().getXDockerMaintainerParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../de.laegler.xdocker.lang.ui/src-gen/de/laegler/xdocker/lang/ui/contentassist/antlr/internal/InternalXDockerLang.g:219:6: ( ruleXDockerRun )
                    {
                    // ../de.laegler.xdocker.lang.ui/src-gen/de/laegler/xdocker/lang/ui/contentassist/antlr/internal/InternalXDockerLang.g:219:6: ( ruleXDockerRun )
                    // ../de.laegler.xdocker.lang.ui/src-gen/de/laegler/xdocker/lang/ui/contentassist/antlr/internal/InternalXDockerLang.g:220:1: ruleXDockerRun
                    {
                     before(grammarAccess.getXDockerInstructionAccess().getXDockerRunParserRuleCall_2()); 
                    pushFollow(FOLLOW_ruleXDockerRun_in_rule__XDockerInstruction__Alternatives407);
                    ruleXDockerRun();

                    state._fsp--;

                     after(grammarAccess.getXDockerInstructionAccess().getXDockerRunParserRuleCall_2()); 

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
    // $ANTLR end "rule__XDockerInstruction__Alternatives"


    // $ANTLR start "rule__XDockerModel__InstructionAssignment"
    // ../de.laegler.xdocker.lang.ui/src-gen/de/laegler/xdocker/lang/ui/contentassist/antlr/internal/InternalXDockerLang.g:234:1: rule__XDockerModel__InstructionAssignment : ( ruleXDockerInstruction ) ;
    public final void rule__XDockerModel__InstructionAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.laegler.xdocker.lang.ui/src-gen/de/laegler/xdocker/lang/ui/contentassist/antlr/internal/InternalXDockerLang.g:238:1: ( ( ruleXDockerInstruction ) )
            // ../de.laegler.xdocker.lang.ui/src-gen/de/laegler/xdocker/lang/ui/contentassist/antlr/internal/InternalXDockerLang.g:239:1: ( ruleXDockerInstruction )
            {
            // ../de.laegler.xdocker.lang.ui/src-gen/de/laegler/xdocker/lang/ui/contentassist/antlr/internal/InternalXDockerLang.g:239:1: ( ruleXDockerInstruction )
            // ../de.laegler.xdocker.lang.ui/src-gen/de/laegler/xdocker/lang/ui/contentassist/antlr/internal/InternalXDockerLang.g:240:1: ruleXDockerInstruction
            {
             before(grammarAccess.getXDockerModelAccess().getInstructionXDockerInstructionParserRuleCall_0()); 
            pushFollow(FOLLOW_ruleXDockerInstruction_in_rule__XDockerModel__InstructionAssignment443);
            ruleXDockerInstruction();

            state._fsp--;

             after(grammarAccess.getXDockerModelAccess().getInstructionXDockerInstructionParserRuleCall_0()); 

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
    // $ANTLR end "rule__XDockerModel__InstructionAssignment"


    // $ANTLR start "rule__XDockerFrom__NameAssignment"
    // ../de.laegler.xdocker.lang.ui/src-gen/de/laegler/xdocker/lang/ui/contentassist/antlr/internal/InternalXDockerLang.g:249:1: rule__XDockerFrom__NameAssignment : ( RULE_FROM ) ;
    public final void rule__XDockerFrom__NameAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.laegler.xdocker.lang.ui/src-gen/de/laegler/xdocker/lang/ui/contentassist/antlr/internal/InternalXDockerLang.g:253:1: ( ( RULE_FROM ) )
            // ../de.laegler.xdocker.lang.ui/src-gen/de/laegler/xdocker/lang/ui/contentassist/antlr/internal/InternalXDockerLang.g:254:1: ( RULE_FROM )
            {
            // ../de.laegler.xdocker.lang.ui/src-gen/de/laegler/xdocker/lang/ui/contentassist/antlr/internal/InternalXDockerLang.g:254:1: ( RULE_FROM )
            // ../de.laegler.xdocker.lang.ui/src-gen/de/laegler/xdocker/lang/ui/contentassist/antlr/internal/InternalXDockerLang.g:255:1: RULE_FROM
            {
             before(grammarAccess.getXDockerFromAccess().getNameFROMTerminalRuleCall_0()); 
            match(input,RULE_FROM,FOLLOW_RULE_FROM_in_rule__XDockerFrom__NameAssignment474); 
             after(grammarAccess.getXDockerFromAccess().getNameFROMTerminalRuleCall_0()); 

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
    // $ANTLR end "rule__XDockerFrom__NameAssignment"


    // $ANTLR start "rule__XDockerMaintainer__NameAssignment"
    // ../de.laegler.xdocker.lang.ui/src-gen/de/laegler/xdocker/lang/ui/contentassist/antlr/internal/InternalXDockerLang.g:264:1: rule__XDockerMaintainer__NameAssignment : ( RULE_MAINTAINER ) ;
    public final void rule__XDockerMaintainer__NameAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.laegler.xdocker.lang.ui/src-gen/de/laegler/xdocker/lang/ui/contentassist/antlr/internal/InternalXDockerLang.g:268:1: ( ( RULE_MAINTAINER ) )
            // ../de.laegler.xdocker.lang.ui/src-gen/de/laegler/xdocker/lang/ui/contentassist/antlr/internal/InternalXDockerLang.g:269:1: ( RULE_MAINTAINER )
            {
            // ../de.laegler.xdocker.lang.ui/src-gen/de/laegler/xdocker/lang/ui/contentassist/antlr/internal/InternalXDockerLang.g:269:1: ( RULE_MAINTAINER )
            // ../de.laegler.xdocker.lang.ui/src-gen/de/laegler/xdocker/lang/ui/contentassist/antlr/internal/InternalXDockerLang.g:270:1: RULE_MAINTAINER
            {
             before(grammarAccess.getXDockerMaintainerAccess().getNameMAINTAINERTerminalRuleCall_0()); 
            match(input,RULE_MAINTAINER,FOLLOW_RULE_MAINTAINER_in_rule__XDockerMaintainer__NameAssignment505); 
             after(grammarAccess.getXDockerMaintainerAccess().getNameMAINTAINERTerminalRuleCall_0()); 

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
    // $ANTLR end "rule__XDockerMaintainer__NameAssignment"


    // $ANTLR start "rule__XDockerRun__NameAssignment"
    // ../de.laegler.xdocker.lang.ui/src-gen/de/laegler/xdocker/lang/ui/contentassist/antlr/internal/InternalXDockerLang.g:279:1: rule__XDockerRun__NameAssignment : ( RULE_RUN ) ;
    public final void rule__XDockerRun__NameAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.laegler.xdocker.lang.ui/src-gen/de/laegler/xdocker/lang/ui/contentassist/antlr/internal/InternalXDockerLang.g:283:1: ( ( RULE_RUN ) )
            // ../de.laegler.xdocker.lang.ui/src-gen/de/laegler/xdocker/lang/ui/contentassist/antlr/internal/InternalXDockerLang.g:284:1: ( RULE_RUN )
            {
            // ../de.laegler.xdocker.lang.ui/src-gen/de/laegler/xdocker/lang/ui/contentassist/antlr/internal/InternalXDockerLang.g:284:1: ( RULE_RUN )
            // ../de.laegler.xdocker.lang.ui/src-gen/de/laegler/xdocker/lang/ui/contentassist/antlr/internal/InternalXDockerLang.g:285:1: RULE_RUN
            {
             before(grammarAccess.getXDockerRunAccess().getNameRUNTerminalRuleCall_0()); 
            match(input,RULE_RUN,FOLLOW_RULE_RUN_in_rule__XDockerRun__NameAssignment536); 
             after(grammarAccess.getXDockerRunAccess().getNameRUNTerminalRuleCall_0()); 

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
    // $ANTLR end "rule__XDockerRun__NameAssignment"

    // Delegated rules


 

    public static final BitSet FOLLOW_ruleXDockerModel_in_entryRuleXDockerModel61 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXDockerModel68 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__XDockerModel__InstructionAssignment_in_ruleXDockerModel94 = new BitSet(new long[]{0x0000000000000072L});
    public static final BitSet FOLLOW_ruleXDockerInstruction_in_entryRuleXDockerInstruction122 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXDockerInstruction129 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__XDockerInstruction__Alternatives_in_ruleXDockerInstruction155 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXDockerFrom_in_entryRuleXDockerFrom182 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXDockerFrom189 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__XDockerFrom__NameAssignment_in_ruleXDockerFrom215 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXDockerMaintainer_in_entryRuleXDockerMaintainer242 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXDockerMaintainer249 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__XDockerMaintainer__NameAssignment_in_ruleXDockerMaintainer275 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXDockerRun_in_entryRuleXDockerRun302 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXDockerRun309 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__XDockerRun__NameAssignment_in_ruleXDockerRun335 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXDockerFrom_in_rule__XDockerInstruction__Alternatives373 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXDockerMaintainer_in_rule__XDockerInstruction__Alternatives390 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXDockerRun_in_rule__XDockerInstruction__Alternatives407 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXDockerInstruction_in_rule__XDockerModel__InstructionAssignment443 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_FROM_in_rule__XDockerFrom__NameAssignment474 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_MAINTAINER_in_rule__XDockerMaintainer__NameAssignment505 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_RUN_in_rule__XDockerRun__NameAssignment536 = new BitSet(new long[]{0x0000000000000002L});

}