package de.laegler.xdocker.lang.ui.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalXDockerLangLexer extends Lexer {
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

    public InternalXDockerLangLexer() {;} 
    public InternalXDockerLangLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public InternalXDockerLangLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "../de.laegler.xdocker.lang.ui/src-gen/de/laegler/xdocker/lang/ui/contentassist/antlr/internal/InternalXDockerLang.g"; }

    // $ANTLR start "RULE_FROM"
    public final void mRULE_FROM() throws RecognitionException {
        try {
            int _type = RULE_FROM;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../de.laegler.xdocker.lang.ui/src-gen/de/laegler/xdocker/lang/ui/contentassist/antlr/internal/InternalXDockerLang.g:295:11: ( 'FROM' ( RULE_NNL )* RULE_NL )
            // ../de.laegler.xdocker.lang.ui/src-gen/de/laegler/xdocker/lang/ui/contentassist/antlr/internal/InternalXDockerLang.g:295:13: 'FROM' ( RULE_NNL )* RULE_NL
            {
            match("FROM"); 

            // ../de.laegler.xdocker.lang.ui/src-gen/de/laegler/xdocker/lang/ui/contentassist/antlr/internal/InternalXDockerLang.g:295:20: ( RULE_NNL )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>='\u0000' && LA1_0<='\t')||(LA1_0>='\u000B' && LA1_0<='\f')||(LA1_0>='\u000E' && LA1_0<='\uFFFF')) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../de.laegler.xdocker.lang.ui/src-gen/de/laegler/xdocker/lang/ui/contentassist/antlr/internal/InternalXDockerLang.g:295:20: RULE_NNL
            	    {
            	    mRULE_NNL(); 

            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            mRULE_NL(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_FROM"

    // $ANTLR start "RULE_MAINTAINER"
    public final void mRULE_MAINTAINER() throws RecognitionException {
        try {
            int _type = RULE_MAINTAINER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../de.laegler.xdocker.lang.ui/src-gen/de/laegler/xdocker/lang/ui/contentassist/antlr/internal/InternalXDockerLang.g:297:17: ( 'MAINTAINER' ( RULE_NNL )* RULE_NL )
            // ../de.laegler.xdocker.lang.ui/src-gen/de/laegler/xdocker/lang/ui/contentassist/antlr/internal/InternalXDockerLang.g:297:19: 'MAINTAINER' ( RULE_NNL )* RULE_NL
            {
            match("MAINTAINER"); 

            // ../de.laegler.xdocker.lang.ui/src-gen/de/laegler/xdocker/lang/ui/contentassist/antlr/internal/InternalXDockerLang.g:297:32: ( RULE_NNL )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0>='\u0000' && LA2_0<='\t')||(LA2_0>='\u000B' && LA2_0<='\f')||(LA2_0>='\u000E' && LA2_0<='\uFFFF')) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../de.laegler.xdocker.lang.ui/src-gen/de/laegler/xdocker/lang/ui/contentassist/antlr/internal/InternalXDockerLang.g:297:32: RULE_NNL
            	    {
            	    mRULE_NNL(); 

            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            mRULE_NL(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_MAINTAINER"

    // $ANTLR start "RULE_RUN"
    public final void mRULE_RUN() throws RecognitionException {
        try {
            int _type = RULE_RUN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../de.laegler.xdocker.lang.ui/src-gen/de/laegler/xdocker/lang/ui/contentassist/antlr/internal/InternalXDockerLang.g:299:10: ( 'RUN' ( RULE_NNL )* RULE_NL )
            // ../de.laegler.xdocker.lang.ui/src-gen/de/laegler/xdocker/lang/ui/contentassist/antlr/internal/InternalXDockerLang.g:299:12: 'RUN' ( RULE_NNL )* RULE_NL
            {
            match("RUN"); 

            // ../de.laegler.xdocker.lang.ui/src-gen/de/laegler/xdocker/lang/ui/contentassist/antlr/internal/InternalXDockerLang.g:299:18: ( RULE_NNL )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( ((LA3_0>='\u0000' && LA3_0<='\t')||(LA3_0>='\u000B' && LA3_0<='\f')||(LA3_0>='\u000E' && LA3_0<='\uFFFF')) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // ../de.laegler.xdocker.lang.ui/src-gen/de/laegler/xdocker/lang/ui/contentassist/antlr/internal/InternalXDockerLang.g:299:18: RULE_NNL
            	    {
            	    mRULE_NNL(); 

            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

            mRULE_NL(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_RUN"

    // $ANTLR start "RULE_EXAMPLE_HEADING"
    public final void mRULE_EXAMPLE_HEADING() throws RecognitionException {
        try {
            int _type = RULE_EXAMPLE_HEADING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../de.laegler.xdocker.lang.ui/src-gen/de/laegler/xdocker/lang/ui/contentassist/antlr/internal/InternalXDockerLang.g:301:22: ( 'Examples' RULE_SPACES ':' RULE_SPACES ( '\\r' )? '\\n' )
            // ../de.laegler.xdocker.lang.ui/src-gen/de/laegler/xdocker/lang/ui/contentassist/antlr/internal/InternalXDockerLang.g:301:24: 'Examples' RULE_SPACES ':' RULE_SPACES ( '\\r' )? '\\n'
            {
            match("Examples"); 

            mRULE_SPACES(); 
            match(':'); 
            mRULE_SPACES(); 
            // ../de.laegler.xdocker.lang.ui/src-gen/de/laegler/xdocker/lang/ui/contentassist/antlr/internal/InternalXDockerLang.g:301:63: ( '\\r' )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0=='\r') ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // ../de.laegler.xdocker.lang.ui/src-gen/de/laegler/xdocker/lang/ui/contentassist/antlr/internal/InternalXDockerLang.g:301:63: '\\r'
                    {
                    match('\r'); 

                    }
                    break;

            }

            match('\n'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_EXAMPLE_HEADING"

    // $ANTLR start "RULE_NNL"
    public final void mRULE_NNL() throws RecognitionException {
        try {
            // ../de.laegler.xdocker.lang.ui/src-gen/de/laegler/xdocker/lang/ui/contentassist/antlr/internal/InternalXDockerLang.g:303:19: (~ ( ( '\\r' | '\\n' ) ) )
            // ../de.laegler.xdocker.lang.ui/src-gen/de/laegler/xdocker/lang/ui/contentassist/antlr/internal/InternalXDockerLang.g:303:21: ~ ( ( '\\r' | '\\n' ) )
            {
            if ( (input.LA(1)>='\u0000' && input.LA(1)<='\t')||(input.LA(1)>='\u000B' && input.LA(1)<='\f')||(input.LA(1)>='\u000E' && input.LA(1)<='\uFFFF') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

        }
        finally {
        }
    }
    // $ANTLR end "RULE_NNL"

    // $ANTLR start "RULE_NL"
    public final void mRULE_NL() throws RecognitionException {
        try {
            // ../de.laegler.xdocker.lang.ui/src-gen/de/laegler/xdocker/lang/ui/contentassist/antlr/internal/InternalXDockerLang.g:305:18: ( ( '\\r' )? ( '\\n' )? )
            // ../de.laegler.xdocker.lang.ui/src-gen/de/laegler/xdocker/lang/ui/contentassist/antlr/internal/InternalXDockerLang.g:305:20: ( '\\r' )? ( '\\n' )?
            {
            // ../de.laegler.xdocker.lang.ui/src-gen/de/laegler/xdocker/lang/ui/contentassist/antlr/internal/InternalXDockerLang.g:305:20: ( '\\r' )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0=='\r') ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // ../de.laegler.xdocker.lang.ui/src-gen/de/laegler/xdocker/lang/ui/contentassist/antlr/internal/InternalXDockerLang.g:305:20: '\\r'
                    {
                    match('\r'); 

                    }
                    break;

            }

            // ../de.laegler.xdocker.lang.ui/src-gen/de/laegler/xdocker/lang/ui/contentassist/antlr/internal/InternalXDockerLang.g:305:26: ( '\\n' )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0=='\n') ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // ../de.laegler.xdocker.lang.ui/src-gen/de/laegler/xdocker/lang/ui/contentassist/antlr/internal/InternalXDockerLang.g:305:26: '\\n'
                    {
                    match('\n'); 

                    }
                    break;

            }


            }

        }
        finally {
        }
    }
    // $ANTLR end "RULE_NL"

    // $ANTLR start "RULE_SPACES"
    public final void mRULE_SPACES() throws RecognitionException {
        try {
            // ../de.laegler.xdocker.lang.ui/src-gen/de/laegler/xdocker/lang/ui/contentassist/antlr/internal/InternalXDockerLang.g:307:22: ( ( ' ' | '\\t' )* )
            // ../de.laegler.xdocker.lang.ui/src-gen/de/laegler/xdocker/lang/ui/contentassist/antlr/internal/InternalXDockerLang.g:307:24: ( ' ' | '\\t' )*
            {
            // ../de.laegler.xdocker.lang.ui/src-gen/de/laegler/xdocker/lang/ui/contentassist/antlr/internal/InternalXDockerLang.g:307:24: ( ' ' | '\\t' )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0=='\t'||LA7_0==' ') ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // ../de.laegler.xdocker.lang.ui/src-gen/de/laegler/xdocker/lang/ui/contentassist/antlr/internal/InternalXDockerLang.g:
            	    {
            	    if ( input.LA(1)=='\t'||input.LA(1)==' ' ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);


            }

        }
        finally {
        }
    }
    // $ANTLR end "RULE_SPACES"

    // $ANTLR start "RULE_FEATURE_TEXT"
    public final void mRULE_FEATURE_TEXT() throws RecognitionException {
        try {
            int _type = RULE_FEATURE_TEXT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../de.laegler.xdocker.lang.ui/src-gen/de/laegler/xdocker/lang/ui/contentassist/antlr/internal/InternalXDockerLang.g:309:19: ( ( 'Narrative:' | 'Feature:' ) ( RULE_NNL )* RULE_NL )
            // ../de.laegler.xdocker.lang.ui/src-gen/de/laegler/xdocker/lang/ui/contentassist/antlr/internal/InternalXDockerLang.g:309:21: ( 'Narrative:' | 'Feature:' ) ( RULE_NNL )* RULE_NL
            {
            // ../de.laegler.xdocker.lang.ui/src-gen/de/laegler/xdocker/lang/ui/contentassist/antlr/internal/InternalXDockerLang.g:309:21: ( 'Narrative:' | 'Feature:' )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0=='N') ) {
                alt8=1;
            }
            else if ( (LA8_0=='F') ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // ../de.laegler.xdocker.lang.ui/src-gen/de/laegler/xdocker/lang/ui/contentassist/antlr/internal/InternalXDockerLang.g:309:22: 'Narrative:'
                    {
                    match("Narrative:"); 


                    }
                    break;
                case 2 :
                    // ../de.laegler.xdocker.lang.ui/src-gen/de/laegler/xdocker/lang/ui/contentassist/antlr/internal/InternalXDockerLang.g:309:35: 'Feature:'
                    {
                    match("Feature:"); 


                    }
                    break;

            }

            // ../de.laegler.xdocker.lang.ui/src-gen/de/laegler/xdocker/lang/ui/contentassist/antlr/internal/InternalXDockerLang.g:309:47: ( RULE_NNL )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( ((LA9_0>='\u0000' && LA9_0<='\t')||(LA9_0>='\u000B' && LA9_0<='\f')||(LA9_0>='\u000E' && LA9_0<='\uFFFF')) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // ../de.laegler.xdocker.lang.ui/src-gen/de/laegler/xdocker/lang/ui/contentassist/antlr/internal/InternalXDockerLang.g:309:47: RULE_NNL
            	    {
            	    mRULE_NNL(); 

            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

            mRULE_NL(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_FEATURE_TEXT"

    // $ANTLR start "RULE_IN_ORDER_TO"
    public final void mRULE_IN_ORDER_TO() throws RecognitionException {
        try {
            int _type = RULE_IN_ORDER_TO;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../de.laegler.xdocker.lang.ui/src-gen/de/laegler/xdocker/lang/ui/contentassist/antlr/internal/InternalXDockerLang.g:311:18: ( 'In order to' ( RULE_NNL )* RULE_NL )
            // ../de.laegler.xdocker.lang.ui/src-gen/de/laegler/xdocker/lang/ui/contentassist/antlr/internal/InternalXDockerLang.g:311:20: 'In order to' ( RULE_NNL )* RULE_NL
            {
            match("In order to"); 

            // ../de.laegler.xdocker.lang.ui/src-gen/de/laegler/xdocker/lang/ui/contentassist/antlr/internal/InternalXDockerLang.g:311:34: ( RULE_NNL )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( ((LA10_0>='\u0000' && LA10_0<='\t')||(LA10_0>='\u000B' && LA10_0<='\f')||(LA10_0>='\u000E' && LA10_0<='\uFFFF')) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // ../de.laegler.xdocker.lang.ui/src-gen/de/laegler/xdocker/lang/ui/contentassist/antlr/internal/InternalXDockerLang.g:311:34: RULE_NNL
            	    {
            	    mRULE_NNL(); 

            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

            mRULE_NL(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_IN_ORDER_TO"

    // $ANTLR start "RULE_AS_A"
    public final void mRULE_AS_A() throws RecognitionException {
        try {
            int _type = RULE_AS_A;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../de.laegler.xdocker.lang.ui/src-gen/de/laegler/xdocker/lang/ui/contentassist/antlr/internal/InternalXDockerLang.g:313:11: ( 'As a' ( RULE_NNL )* RULE_NL )
            // ../de.laegler.xdocker.lang.ui/src-gen/de/laegler/xdocker/lang/ui/contentassist/antlr/internal/InternalXDockerLang.g:313:13: 'As a' ( RULE_NNL )* RULE_NL
            {
            match("As a"); 

            // ../de.laegler.xdocker.lang.ui/src-gen/de/laegler/xdocker/lang/ui/contentassist/antlr/internal/InternalXDockerLang.g:313:20: ( RULE_NNL )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( ((LA11_0>='\u0000' && LA11_0<='\t')||(LA11_0>='\u000B' && LA11_0<='\f')||(LA11_0>='\u000E' && LA11_0<='\uFFFF')) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // ../de.laegler.xdocker.lang.ui/src-gen/de/laegler/xdocker/lang/ui/contentassist/antlr/internal/InternalXDockerLang.g:313:20: RULE_NNL
            	    {
            	    mRULE_NNL(); 

            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

            mRULE_NL(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_AS_A"

    // $ANTLR start "RULE_I_WANT_TO"
    public final void mRULE_I_WANT_TO() throws RecognitionException {
        try {
            int _type = RULE_I_WANT_TO;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../de.laegler.xdocker.lang.ui/src-gen/de/laegler/xdocker/lang/ui/contentassist/antlr/internal/InternalXDockerLang.g:315:16: ( 'I want to ' ( RULE_NNL )* RULE_NL )
            // ../de.laegler.xdocker.lang.ui/src-gen/de/laegler/xdocker/lang/ui/contentassist/antlr/internal/InternalXDockerLang.g:315:18: 'I want to ' ( RULE_NNL )* RULE_NL
            {
            match("I want to "); 

            // ../de.laegler.xdocker.lang.ui/src-gen/de/laegler/xdocker/lang/ui/contentassist/antlr/internal/InternalXDockerLang.g:315:31: ( RULE_NNL )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( ((LA12_0>='\u0000' && LA12_0<='\t')||(LA12_0>='\u000B' && LA12_0<='\f')||(LA12_0>='\u000E' && LA12_0<='\uFFFF')) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // ../de.laegler.xdocker.lang.ui/src-gen/de/laegler/xdocker/lang/ui/contentassist/antlr/internal/InternalXDockerLang.g:315:31: RULE_NNL
            	    {
            	    mRULE_NNL(); 

            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

            mRULE_NL(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_I_WANT_TO"

    // $ANTLR start "RULE_SCENARIO_TEXT"
    public final void mRULE_SCENARIO_TEXT() throws RecognitionException {
        try {
            int _type = RULE_SCENARIO_TEXT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../de.laegler.xdocker.lang.ui/src-gen/de/laegler/xdocker/lang/ui/contentassist/antlr/internal/InternalXDockerLang.g:317:20: ( 'Scenario' RULE_SPACES ':' ( RULE_NNL )* RULE_NL )
            // ../de.laegler.xdocker.lang.ui/src-gen/de/laegler/xdocker/lang/ui/contentassist/antlr/internal/InternalXDockerLang.g:317:22: 'Scenario' RULE_SPACES ':' ( RULE_NNL )* RULE_NL
            {
            match("Scenario"); 

            mRULE_SPACES(); 
            match(':'); 
            // ../de.laegler.xdocker.lang.ui/src-gen/de/laegler/xdocker/lang/ui/contentassist/antlr/internal/InternalXDockerLang.g:317:49: ( RULE_NNL )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( ((LA13_0>='\u0000' && LA13_0<='\t')||(LA13_0>='\u000B' && LA13_0<='\f')||(LA13_0>='\u000E' && LA13_0<='\uFFFF')) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // ../de.laegler.xdocker.lang.ui/src-gen/de/laegler/xdocker/lang/ui/contentassist/antlr/internal/InternalXDockerLang.g:317:49: RULE_NNL
            	    {
            	    mRULE_NNL(); 

            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);

            mRULE_NL(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_SCENARIO_TEXT"

    // $ANTLR start "RULE_SCENARIO_OUTLINE_TEXT"
    public final void mRULE_SCENARIO_OUTLINE_TEXT() throws RecognitionException {
        try {
            int _type = RULE_SCENARIO_OUTLINE_TEXT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../de.laegler.xdocker.lang.ui/src-gen/de/laegler/xdocker/lang/ui/contentassist/antlr/internal/InternalXDockerLang.g:319:28: ( 'Scenario' RULE_SPACES 'Outline' RULE_SPACES ':' ( RULE_NNL )* RULE_NL )
            // ../de.laegler.xdocker.lang.ui/src-gen/de/laegler/xdocker/lang/ui/contentassist/antlr/internal/InternalXDockerLang.g:319:30: 'Scenario' RULE_SPACES 'Outline' RULE_SPACES ':' ( RULE_NNL )* RULE_NL
            {
            match("Scenario"); 

            mRULE_SPACES(); 
            match("Outline"); 

            mRULE_SPACES(); 
            match(':'); 
            // ../de.laegler.xdocker.lang.ui/src-gen/de/laegler/xdocker/lang/ui/contentassist/antlr/internal/InternalXDockerLang.g:319:79: ( RULE_NNL )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( ((LA14_0>='\u0000' && LA14_0<='\t')||(LA14_0>='\u000B' && LA14_0<='\f')||(LA14_0>='\u000E' && LA14_0<='\uFFFF')) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // ../de.laegler.xdocker.lang.ui/src-gen/de/laegler/xdocker/lang/ui/contentassist/antlr/internal/InternalXDockerLang.g:319:79: RULE_NNL
            	    {
            	    mRULE_NNL(); 

            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);

            mRULE_NL(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_SCENARIO_OUTLINE_TEXT"

    // $ANTLR start "RULE_BACKGROUND_TEXT"
    public final void mRULE_BACKGROUND_TEXT() throws RecognitionException {
        try {
            int _type = RULE_BACKGROUND_TEXT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../de.laegler.xdocker.lang.ui/src-gen/de/laegler/xdocker/lang/ui/contentassist/antlr/internal/InternalXDockerLang.g:321:22: ( 'Background' RULE_SPACES ':' ( RULE_NNL )* RULE_NL )
            // ../de.laegler.xdocker.lang.ui/src-gen/de/laegler/xdocker/lang/ui/contentassist/antlr/internal/InternalXDockerLang.g:321:24: 'Background' RULE_SPACES ':' ( RULE_NNL )* RULE_NL
            {
            match("Background"); 

            mRULE_SPACES(); 
            match(':'); 
            // ../de.laegler.xdocker.lang.ui/src-gen/de/laegler/xdocker/lang/ui/contentassist/antlr/internal/InternalXDockerLang.g:321:53: ( RULE_NNL )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( ((LA15_0>='\u0000' && LA15_0<='\t')||(LA15_0>='\u000B' && LA15_0<='\f')||(LA15_0>='\u000E' && LA15_0<='\uFFFF')) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // ../de.laegler.xdocker.lang.ui/src-gen/de/laegler/xdocker/lang/ui/contentassist/antlr/internal/InternalXDockerLang.g:321:53: RULE_NNL
            	    {
            	    mRULE_NNL(); 

            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);

            mRULE_NL(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_BACKGROUND_TEXT"

    // $ANTLR start "RULE_WHEN_TEXT"
    public final void mRULE_WHEN_TEXT() throws RecognitionException {
        try {
            int _type = RULE_WHEN_TEXT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../de.laegler.xdocker.lang.ui/src-gen/de/laegler/xdocker/lang/ui/contentassist/antlr/internal/InternalXDockerLang.g:323:16: ( 'When ' ( RULE_NNL )* RULE_NL )
            // ../de.laegler.xdocker.lang.ui/src-gen/de/laegler/xdocker/lang/ui/contentassist/antlr/internal/InternalXDockerLang.g:323:18: 'When ' ( RULE_NNL )* RULE_NL
            {
            match("When "); 

            // ../de.laegler.xdocker.lang.ui/src-gen/de/laegler/xdocker/lang/ui/contentassist/antlr/internal/InternalXDockerLang.g:323:26: ( RULE_NNL )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( ((LA16_0>='\u0000' && LA16_0<='\t')||(LA16_0>='\u000B' && LA16_0<='\f')||(LA16_0>='\u000E' && LA16_0<='\uFFFF')) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // ../de.laegler.xdocker.lang.ui/src-gen/de/laegler/xdocker/lang/ui/contentassist/antlr/internal/InternalXDockerLang.g:323:26: RULE_NNL
            	    {
            	    mRULE_NNL(); 

            	    }
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);

            mRULE_NL(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_WHEN_TEXT"

    // $ANTLR start "RULE_THEN_TEXT"
    public final void mRULE_THEN_TEXT() throws RecognitionException {
        try {
            int _type = RULE_THEN_TEXT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../de.laegler.xdocker.lang.ui/src-gen/de/laegler/xdocker/lang/ui/contentassist/antlr/internal/InternalXDockerLang.g:325:16: ( 'Then ' ( RULE_NNL )* RULE_NL )
            // ../de.laegler.xdocker.lang.ui/src-gen/de/laegler/xdocker/lang/ui/contentassist/antlr/internal/InternalXDockerLang.g:325:18: 'Then ' ( RULE_NNL )* RULE_NL
            {
            match("Then "); 

            // ../de.laegler.xdocker.lang.ui/src-gen/de/laegler/xdocker/lang/ui/contentassist/antlr/internal/InternalXDockerLang.g:325:26: ( RULE_NNL )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( ((LA17_0>='\u0000' && LA17_0<='\t')||(LA17_0>='\u000B' && LA17_0<='\f')||(LA17_0>='\u000E' && LA17_0<='\uFFFF')) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // ../de.laegler.xdocker.lang.ui/src-gen/de/laegler/xdocker/lang/ui/contentassist/antlr/internal/InternalXDockerLang.g:325:26: RULE_NNL
            	    {
            	    mRULE_NNL(); 

            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);

            mRULE_NL(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_THEN_TEXT"

    // $ANTLR start "RULE_GIVEN_TEXT"
    public final void mRULE_GIVEN_TEXT() throws RecognitionException {
        try {
            int _type = RULE_GIVEN_TEXT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../de.laegler.xdocker.lang.ui/src-gen/de/laegler/xdocker/lang/ui/contentassist/antlr/internal/InternalXDockerLang.g:327:17: ( 'Given ' ( RULE_NNL )* RULE_NL )
            // ../de.laegler.xdocker.lang.ui/src-gen/de/laegler/xdocker/lang/ui/contentassist/antlr/internal/InternalXDockerLang.g:327:19: 'Given ' ( RULE_NNL )* RULE_NL
            {
            match("Given "); 

            // ../de.laegler.xdocker.lang.ui/src-gen/de/laegler/xdocker/lang/ui/contentassist/antlr/internal/InternalXDockerLang.g:327:28: ( RULE_NNL )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( ((LA18_0>='\u0000' && LA18_0<='\t')||(LA18_0>='\u000B' && LA18_0<='\f')||(LA18_0>='\u000E' && LA18_0<='\uFFFF')) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // ../de.laegler.xdocker.lang.ui/src-gen/de/laegler/xdocker/lang/ui/contentassist/antlr/internal/InternalXDockerLang.g:327:28: RULE_NNL
            	    {
            	    mRULE_NNL(); 

            	    }
            	    break;

            	default :
            	    break loop18;
                }
            } while (true);

            mRULE_NL(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_GIVEN_TEXT"

    // $ANTLR start "RULE_AND_TEXT"
    public final void mRULE_AND_TEXT() throws RecognitionException {
        try {
            int _type = RULE_AND_TEXT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../de.laegler.xdocker.lang.ui/src-gen/de/laegler/xdocker/lang/ui/contentassist/antlr/internal/InternalXDockerLang.g:329:15: ( 'And ' ( RULE_NNL )* RULE_NL )
            // ../de.laegler.xdocker.lang.ui/src-gen/de/laegler/xdocker/lang/ui/contentassist/antlr/internal/InternalXDockerLang.g:329:17: 'And ' ( RULE_NNL )* RULE_NL
            {
            match("And "); 

            // ../de.laegler.xdocker.lang.ui/src-gen/de/laegler/xdocker/lang/ui/contentassist/antlr/internal/InternalXDockerLang.g:329:24: ( RULE_NNL )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( ((LA19_0>='\u0000' && LA19_0<='\t')||(LA19_0>='\u000B' && LA19_0<='\f')||(LA19_0>='\u000E' && LA19_0<='\uFFFF')) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // ../de.laegler.xdocker.lang.ui/src-gen/de/laegler/xdocker/lang/ui/contentassist/antlr/internal/InternalXDockerLang.g:329:24: RULE_NNL
            	    {
            	    mRULE_NNL(); 

            	    }
            	    break;

            	default :
            	    break loop19;
                }
            } while (true);

            mRULE_NL(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_AND_TEXT"

    // $ANTLR start "RULE_EXAMPLE_ROW_END"
    public final void mRULE_EXAMPLE_ROW_END() throws RecognitionException {
        try {
            int _type = RULE_EXAMPLE_ROW_END;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../de.laegler.xdocker.lang.ui/src-gen/de/laegler/xdocker/lang/ui/contentassist/antlr/internal/InternalXDockerLang.g:331:22: ( '|' RULE_SPACES RULE_NL )
            // ../de.laegler.xdocker.lang.ui/src-gen/de/laegler/xdocker/lang/ui/contentassist/antlr/internal/InternalXDockerLang.g:331:24: '|' RULE_SPACES RULE_NL
            {
            match('|'); 
            mRULE_SPACES(); 
            mRULE_NL(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_EXAMPLE_ROW_END"

    // $ANTLR start "RULE_EXAMPLE_CELL"
    public final void mRULE_EXAMPLE_CELL() throws RecognitionException {
        try {
            int _type = RULE_EXAMPLE_CELL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../de.laegler.xdocker.lang.ui/src-gen/de/laegler/xdocker/lang/ui/contentassist/antlr/internal/InternalXDockerLang.g:333:19: ( '|' (~ ( ( '\\r' | '\\n' | '|' ) ) )+ )
            // ../de.laegler.xdocker.lang.ui/src-gen/de/laegler/xdocker/lang/ui/contentassist/antlr/internal/InternalXDockerLang.g:333:21: '|' (~ ( ( '\\r' | '\\n' | '|' ) ) )+
            {
            match('|'); 
            // ../de.laegler.xdocker.lang.ui/src-gen/de/laegler/xdocker/lang/ui/contentassist/antlr/internal/InternalXDockerLang.g:333:25: (~ ( ( '\\r' | '\\n' | '|' ) ) )+
            int cnt20=0;
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( ((LA20_0>='\u0000' && LA20_0<='\t')||(LA20_0>='\u000B' && LA20_0<='\f')||(LA20_0>='\u000E' && LA20_0<='{')||(LA20_0>='}' && LA20_0<='\uFFFF')) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // ../de.laegler.xdocker.lang.ui/src-gen/de/laegler/xdocker/lang/ui/contentassist/antlr/internal/InternalXDockerLang.g:333:25: ~ ( ( '\\r' | '\\n' | '|' ) )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='\t')||(input.LA(1)>='\u000B' && input.LA(1)<='\f')||(input.LA(1)>='\u000E' && input.LA(1)<='{')||(input.LA(1)>='}' && input.LA(1)<='\uFFFF') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    if ( cnt20 >= 1 ) break loop20;
                        EarlyExitException eee =
                            new EarlyExitException(20, input);
                        throw eee;
                }
                cnt20++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_EXAMPLE_CELL"

    // $ANTLR start "RULE_CODE"
    public final void mRULE_CODE() throws RecognitionException {
        try {
            int _type = RULE_CODE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../de.laegler.xdocker.lang.ui/src-gen/de/laegler/xdocker/lang/ui/contentassist/antlr/internal/InternalXDockerLang.g:335:11: ( ( '\"\"\"' ( options {greedy=false; } : . )* '\"\"\"' | '\\'\\'\\'' ( options {greedy=false; } : . )* '\\'\\'\\'' ) )
            // ../de.laegler.xdocker.lang.ui/src-gen/de/laegler/xdocker/lang/ui/contentassist/antlr/internal/InternalXDockerLang.g:335:13: ( '\"\"\"' ( options {greedy=false; } : . )* '\"\"\"' | '\\'\\'\\'' ( options {greedy=false; } : . )* '\\'\\'\\'' )
            {
            // ../de.laegler.xdocker.lang.ui/src-gen/de/laegler/xdocker/lang/ui/contentassist/antlr/internal/InternalXDockerLang.g:335:13: ( '\"\"\"' ( options {greedy=false; } : . )* '\"\"\"' | '\\'\\'\\'' ( options {greedy=false; } : . )* '\\'\\'\\'' )
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0=='\"') ) {
                alt23=1;
            }
            else if ( (LA23_0=='\'') ) {
                alt23=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 23, 0, input);

                throw nvae;
            }
            switch (alt23) {
                case 1 :
                    // ../de.laegler.xdocker.lang.ui/src-gen/de/laegler/xdocker/lang/ui/contentassist/antlr/internal/InternalXDockerLang.g:335:14: '\"\"\"' ( options {greedy=false; } : . )* '\"\"\"'
                    {
                    match("\"\"\""); 

                    // ../de.laegler.xdocker.lang.ui/src-gen/de/laegler/xdocker/lang/ui/contentassist/antlr/internal/InternalXDockerLang.g:335:20: ( options {greedy=false; } : . )*
                    loop21:
                    do {
                        int alt21=2;
                        int LA21_0 = input.LA(1);

                        if ( (LA21_0=='\"') ) {
                            int LA21_1 = input.LA(2);

                            if ( (LA21_1=='\"') ) {
                                int LA21_3 = input.LA(3);

                                if ( (LA21_3=='\"') ) {
                                    alt21=2;
                                }
                                else if ( ((LA21_3>='\u0000' && LA21_3<='!')||(LA21_3>='#' && LA21_3<='\uFFFF')) ) {
                                    alt21=1;
                                }


                            }
                            else if ( ((LA21_1>='\u0000' && LA21_1<='!')||(LA21_1>='#' && LA21_1<='\uFFFF')) ) {
                                alt21=1;
                            }


                        }
                        else if ( ((LA21_0>='\u0000' && LA21_0<='!')||(LA21_0>='#' && LA21_0<='\uFFFF')) ) {
                            alt21=1;
                        }


                        switch (alt21) {
                    	case 1 :
                    	    // ../de.laegler.xdocker.lang.ui/src-gen/de/laegler/xdocker/lang/ui/contentassist/antlr/internal/InternalXDockerLang.g:335:48: .
                    	    {
                    	    matchAny(); 

                    	    }
                    	    break;

                    	default :
                    	    break loop21;
                        }
                    } while (true);

                    match("\"\"\""); 


                    }
                    break;
                case 2 :
                    // ../de.laegler.xdocker.lang.ui/src-gen/de/laegler/xdocker/lang/ui/contentassist/antlr/internal/InternalXDockerLang.g:335:58: '\\'\\'\\'' ( options {greedy=false; } : . )* '\\'\\'\\''
                    {
                    match("'''"); 

                    // ../de.laegler.xdocker.lang.ui/src-gen/de/laegler/xdocker/lang/ui/contentassist/antlr/internal/InternalXDockerLang.g:335:67: ( options {greedy=false; } : . )*
                    loop22:
                    do {
                        int alt22=2;
                        int LA22_0 = input.LA(1);

                        if ( (LA22_0=='\'') ) {
                            int LA22_1 = input.LA(2);

                            if ( (LA22_1=='\'') ) {
                                int LA22_3 = input.LA(3);

                                if ( (LA22_3=='\'') ) {
                                    alt22=2;
                                }
                                else if ( ((LA22_3>='\u0000' && LA22_3<='&')||(LA22_3>='(' && LA22_3<='\uFFFF')) ) {
                                    alt22=1;
                                }


                            }
                            else if ( ((LA22_1>='\u0000' && LA22_1<='&')||(LA22_1>='(' && LA22_1<='\uFFFF')) ) {
                                alt22=1;
                            }


                        }
                        else if ( ((LA22_0>='\u0000' && LA22_0<='&')||(LA22_0>='(' && LA22_0<='\uFFFF')) ) {
                            alt22=1;
                        }


                        switch (alt22) {
                    	case 1 :
                    	    // ../de.laegler.xdocker.lang.ui/src-gen/de/laegler/xdocker/lang/ui/contentassist/antlr/internal/InternalXDockerLang.g:335:95: .
                    	    {
                    	    matchAny(); 

                    	    }
                    	    break;

                    	default :
                    	    break loop22;
                        }
                    } while (true);

                    match("'''"); 


                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_CODE"

    // $ANTLR start "RULE_TAG"
    public final void mRULE_TAG() throws RecognitionException {
        try {
            int _type = RULE_TAG;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../de.laegler.xdocker.lang.ui/src-gen/de/laegler/xdocker/lang/ui/contentassist/antlr/internal/InternalXDockerLang.g:337:10: ( '@' ( RULE_NNL )+ RULE_NL )
            // ../de.laegler.xdocker.lang.ui/src-gen/de/laegler/xdocker/lang/ui/contentassist/antlr/internal/InternalXDockerLang.g:337:12: '@' ( RULE_NNL )+ RULE_NL
            {
            match('@'); 
            // ../de.laegler.xdocker.lang.ui/src-gen/de/laegler/xdocker/lang/ui/contentassist/antlr/internal/InternalXDockerLang.g:337:16: ( RULE_NNL )+
            int cnt24=0;
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( ((LA24_0>='\u0000' && LA24_0<='\t')||(LA24_0>='\u000B' && LA24_0<='\f')||(LA24_0>='\u000E' && LA24_0<='\uFFFF')) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // ../de.laegler.xdocker.lang.ui/src-gen/de/laegler/xdocker/lang/ui/contentassist/antlr/internal/InternalXDockerLang.g:337:16: RULE_NNL
            	    {
            	    mRULE_NNL(); 

            	    }
            	    break;

            	default :
            	    if ( cnt24 >= 1 ) break loop24;
                        EarlyExitException eee =
                            new EarlyExitException(24, input);
                        throw eee;
                }
                cnt24++;
            } while (true);

            mRULE_NL(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_TAG"

    // $ANTLR start "RULE_SL_COMMENT"
    public final void mRULE_SL_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_SL_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../de.laegler.xdocker.lang.ui/src-gen/de/laegler/xdocker/lang/ui/contentassist/antlr/internal/InternalXDockerLang.g:339:17: ( '#' ( RULE_NNL )+ RULE_NL )
            // ../de.laegler.xdocker.lang.ui/src-gen/de/laegler/xdocker/lang/ui/contentassist/antlr/internal/InternalXDockerLang.g:339:19: '#' ( RULE_NNL )+ RULE_NL
            {
            match('#'); 
            // ../de.laegler.xdocker.lang.ui/src-gen/de/laegler/xdocker/lang/ui/contentassist/antlr/internal/InternalXDockerLang.g:339:23: ( RULE_NNL )+
            int cnt25=0;
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( ((LA25_0>='\u0000' && LA25_0<='\t')||(LA25_0>='\u000B' && LA25_0<='\f')||(LA25_0>='\u000E' && LA25_0<='\uFFFF')) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // ../de.laegler.xdocker.lang.ui/src-gen/de/laegler/xdocker/lang/ui/contentassist/antlr/internal/InternalXDockerLang.g:339:23: RULE_NNL
            	    {
            	    mRULE_NNL(); 

            	    }
            	    break;

            	default :
            	    if ( cnt25 >= 1 ) break loop25;
                        EarlyExitException eee =
                            new EarlyExitException(25, input);
                        throw eee;
                }
                cnt25++;
            } while (true);

            mRULE_NL(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_SL_COMMENT"

    // $ANTLR start "RULE_TEXT"
    public final void mRULE_TEXT() throws RecognitionException {
        try {
            int _type = RULE_TEXT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../de.laegler.xdocker.lang.ui/src-gen/de/laegler/xdocker/lang/ui/contentassist/antlr/internal/InternalXDockerLang.g:341:11: (~ ( ( '|' | ' ' | '\\t' | '\\r' | '\\n' | '@' ) ) ( RULE_NNL )* RULE_NL )
            // ../de.laegler.xdocker.lang.ui/src-gen/de/laegler/xdocker/lang/ui/contentassist/antlr/internal/InternalXDockerLang.g:341:13: ~ ( ( '|' | ' ' | '\\t' | '\\r' | '\\n' | '@' ) ) ( RULE_NNL )* RULE_NL
            {
            if ( (input.LA(1)>='\u0000' && input.LA(1)<='\b')||(input.LA(1)>='\u000B' && input.LA(1)<='\f')||(input.LA(1)>='\u000E' && input.LA(1)<='\u001F')||(input.LA(1)>='!' && input.LA(1)<='?')||(input.LA(1)>='A' && input.LA(1)<='{')||(input.LA(1)>='}' && input.LA(1)<='\uFFFF') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // ../de.laegler.xdocker.lang.ui/src-gen/de/laegler/xdocker/lang/ui/contentassist/antlr/internal/InternalXDockerLang.g:341:45: ( RULE_NNL )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( ((LA26_0>='\u0000' && LA26_0<='\t')||(LA26_0>='\u000B' && LA26_0<='\f')||(LA26_0>='\u000E' && LA26_0<='\uFFFF')) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // ../de.laegler.xdocker.lang.ui/src-gen/de/laegler/xdocker/lang/ui/contentassist/antlr/internal/InternalXDockerLang.g:341:45: RULE_NNL
            	    {
            	    mRULE_NNL(); 

            	    }
            	    break;

            	default :
            	    break loop26;
                }
            } while (true);

            mRULE_NL(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_TEXT"

    // $ANTLR start "RULE_WS"
    public final void mRULE_WS() throws RecognitionException {
        try {
            int _type = RULE_WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../de.laegler.xdocker.lang.ui/src-gen/de/laegler/xdocker/lang/ui/contentassist/antlr/internal/InternalXDockerLang.g:343:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // ../de.laegler.xdocker.lang.ui/src-gen/de/laegler/xdocker/lang/ui/contentassist/antlr/internal/InternalXDockerLang.g:343:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // ../de.laegler.xdocker.lang.ui/src-gen/de/laegler/xdocker/lang/ui/contentassist/antlr/internal/InternalXDockerLang.g:343:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            int cnt27=0;
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( ((LA27_0>='\t' && LA27_0<='\n')||LA27_0=='\r'||LA27_0==' ') ) {
                    alt27=1;
                }


                switch (alt27) {
            	case 1 :
            	    // ../de.laegler.xdocker.lang.ui/src-gen/de/laegler/xdocker/lang/ui/contentassist/antlr/internal/InternalXDockerLang.g:
            	    {
            	    if ( (input.LA(1)>='\t' && input.LA(1)<='\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    if ( cnt27 >= 1 ) break loop27;
                        EarlyExitException eee =
                            new EarlyExitException(27, input);
                        throw eee;
                }
                cnt27++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_WS"

    // $ANTLR start "RULE_ID"
    public final void mRULE_ID() throws RecognitionException {
        try {
            int _type = RULE_ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../de.laegler.xdocker.lang.ui/src-gen/de/laegler/xdocker/lang/ui/contentassist/antlr/internal/InternalXDockerLang.g:345:9: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // ../de.laegler.xdocker.lang.ui/src-gen/de/laegler/xdocker/lang/ui/contentassist/antlr/internal/InternalXDockerLang.g:345:11: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            // ../de.laegler.xdocker.lang.ui/src-gen/de/laegler/xdocker/lang/ui/contentassist/antlr/internal/InternalXDockerLang.g:345:11: ( '^' )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0=='^') ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // ../de.laegler.xdocker.lang.ui/src-gen/de/laegler/xdocker/lang/ui/contentassist/antlr/internal/InternalXDockerLang.g:345:11: '^'
                    {
                    match('^'); 

                    }
                    break;

            }

            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // ../de.laegler.xdocker.lang.ui/src-gen/de/laegler/xdocker/lang/ui/contentassist/antlr/internal/InternalXDockerLang.g:345:40: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            loop29:
            do {
                int alt29=2;
                int LA29_0 = input.LA(1);

                if ( ((LA29_0>='0' && LA29_0<='9')||(LA29_0>='A' && LA29_0<='Z')||LA29_0=='_'||(LA29_0>='a' && LA29_0<='z')) ) {
                    alt29=1;
                }


                switch (alt29) {
            	case 1 :
            	    // ../de.laegler.xdocker.lang.ui/src-gen/de/laegler/xdocker/lang/ui/contentassist/antlr/internal/InternalXDockerLang.g:
            	    {
            	    if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop29;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ID"

    // $ANTLR start "RULE_INT"
    public final void mRULE_INT() throws RecognitionException {
        try {
            int _type = RULE_INT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../de.laegler.xdocker.lang.ui/src-gen/de/laegler/xdocker/lang/ui/contentassist/antlr/internal/InternalXDockerLang.g:347:10: ( ( '0' .. '9' )+ )
            // ../de.laegler.xdocker.lang.ui/src-gen/de/laegler/xdocker/lang/ui/contentassist/antlr/internal/InternalXDockerLang.g:347:12: ( '0' .. '9' )+
            {
            // ../de.laegler.xdocker.lang.ui/src-gen/de/laegler/xdocker/lang/ui/contentassist/antlr/internal/InternalXDockerLang.g:347:12: ( '0' .. '9' )+
            int cnt30=0;
            loop30:
            do {
                int alt30=2;
                int LA30_0 = input.LA(1);

                if ( ((LA30_0>='0' && LA30_0<='9')) ) {
                    alt30=1;
                }


                switch (alt30) {
            	case 1 :
            	    // ../de.laegler.xdocker.lang.ui/src-gen/de/laegler/xdocker/lang/ui/contentassist/antlr/internal/InternalXDockerLang.g:347:13: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    if ( cnt30 >= 1 ) break loop30;
                        EarlyExitException eee =
                            new EarlyExitException(30, input);
                        throw eee;
                }
                cnt30++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_INT"

    // $ANTLR start "RULE_STRING"
    public final void mRULE_STRING() throws RecognitionException {
        try {
            int _type = RULE_STRING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../de.laegler.xdocker.lang.ui/src-gen/de/laegler/xdocker/lang/ui/contentassist/antlr/internal/InternalXDockerLang.g:349:13: ( ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' ) )
            // ../de.laegler.xdocker.lang.ui/src-gen/de/laegler/xdocker/lang/ui/contentassist/antlr/internal/InternalXDockerLang.g:349:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            {
            // ../de.laegler.xdocker.lang.ui/src-gen/de/laegler/xdocker/lang/ui/contentassist/antlr/internal/InternalXDockerLang.g:349:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0=='\"') ) {
                alt33=1;
            }
            else if ( (LA33_0=='\'') ) {
                alt33=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 33, 0, input);

                throw nvae;
            }
            switch (alt33) {
                case 1 :
                    // ../de.laegler.xdocker.lang.ui/src-gen/de/laegler/xdocker/lang/ui/contentassist/antlr/internal/InternalXDockerLang.g:349:16: '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    {
                    match('\"'); 
                    // ../de.laegler.xdocker.lang.ui/src-gen/de/laegler/xdocker/lang/ui/contentassist/antlr/internal/InternalXDockerLang.g:349:20: ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )*
                    loop31:
                    do {
                        int alt31=3;
                        int LA31_0 = input.LA(1);

                        if ( (LA31_0=='\\') ) {
                            alt31=1;
                        }
                        else if ( ((LA31_0>='\u0000' && LA31_0<='!')||(LA31_0>='#' && LA31_0<='[')||(LA31_0>=']' && LA31_0<='\uFFFF')) ) {
                            alt31=2;
                        }


                        switch (alt31) {
                    	case 1 :
                    	    // ../de.laegler.xdocker.lang.ui/src-gen/de/laegler/xdocker/lang/ui/contentassist/antlr/internal/InternalXDockerLang.g:349:21: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // ../de.laegler.xdocker.lang.ui/src-gen/de/laegler/xdocker/lang/ui/contentassist/antlr/internal/InternalXDockerLang.g:349:28: ~ ( ( '\\\\' | '\"' ) )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='!')||(input.LA(1)>='#' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop31;
                        }
                    } while (true);

                    match('\"'); 

                    }
                    break;
                case 2 :
                    // ../de.laegler.xdocker.lang.ui/src-gen/de/laegler/xdocker/lang/ui/contentassist/antlr/internal/InternalXDockerLang.g:349:48: '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
                    {
                    match('\''); 
                    // ../de.laegler.xdocker.lang.ui/src-gen/de/laegler/xdocker/lang/ui/contentassist/antlr/internal/InternalXDockerLang.g:349:53: ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )*
                    loop32:
                    do {
                        int alt32=3;
                        int LA32_0 = input.LA(1);

                        if ( (LA32_0=='\\') ) {
                            alt32=1;
                        }
                        else if ( ((LA32_0>='\u0000' && LA32_0<='&')||(LA32_0>='(' && LA32_0<='[')||(LA32_0>=']' && LA32_0<='\uFFFF')) ) {
                            alt32=2;
                        }


                        switch (alt32) {
                    	case 1 :
                    	    // ../de.laegler.xdocker.lang.ui/src-gen/de/laegler/xdocker/lang/ui/contentassist/antlr/internal/InternalXDockerLang.g:349:54: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // ../de.laegler.xdocker.lang.ui/src-gen/de/laegler/xdocker/lang/ui/contentassist/antlr/internal/InternalXDockerLang.g:349:61: ~ ( ( '\\\\' | '\\'' ) )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='&')||(input.LA(1)>='(' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop32;
                        }
                    } while (true);

                    match('\''); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_STRING"

    // $ANTLR start "RULE_ML_COMMENT"
    public final void mRULE_ML_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_ML_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../de.laegler.xdocker.lang.ui/src-gen/de/laegler/xdocker/lang/ui/contentassist/antlr/internal/InternalXDockerLang.g:351:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // ../de.laegler.xdocker.lang.ui/src-gen/de/laegler/xdocker/lang/ui/contentassist/antlr/internal/InternalXDockerLang.g:351:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // ../de.laegler.xdocker.lang.ui/src-gen/de/laegler/xdocker/lang/ui/contentassist/antlr/internal/InternalXDockerLang.g:351:24: ( options {greedy=false; } : . )*
            loop34:
            do {
                int alt34=2;
                int LA34_0 = input.LA(1);

                if ( (LA34_0=='*') ) {
                    int LA34_1 = input.LA(2);

                    if ( (LA34_1=='/') ) {
                        alt34=2;
                    }
                    else if ( ((LA34_1>='\u0000' && LA34_1<='.')||(LA34_1>='0' && LA34_1<='\uFFFF')) ) {
                        alt34=1;
                    }


                }
                else if ( ((LA34_0>='\u0000' && LA34_0<=')')||(LA34_0>='+' && LA34_0<='\uFFFF')) ) {
                    alt34=1;
                }


                switch (alt34) {
            	case 1 :
            	    // ../de.laegler.xdocker.lang.ui/src-gen/de/laegler/xdocker/lang/ui/contentassist/antlr/internal/InternalXDockerLang.g:351:52: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop34;
                }
            } while (true);

            match("*/"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ML_COMMENT"

    // $ANTLR start "RULE_ANY_OTHER"
    public final void mRULE_ANY_OTHER() throws RecognitionException {
        try {
            int _type = RULE_ANY_OTHER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../de.laegler.xdocker.lang.ui/src-gen/de/laegler/xdocker/lang/ui/contentassist/antlr/internal/InternalXDockerLang.g:353:16: ( . )
            // ../de.laegler.xdocker.lang.ui/src-gen/de/laegler/xdocker/lang/ui/contentassist/antlr/internal/InternalXDockerLang.g:353:18: .
            {
            matchAny(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ANY_OTHER"

    public void mTokens() throws RecognitionException {
        // ../de.laegler.xdocker.lang.ui/src-gen/de/laegler/xdocker/lang/ui/contentassist/antlr/internal/InternalXDockerLang.g:1:8: ( RULE_FROM | RULE_MAINTAINER | RULE_RUN | RULE_EXAMPLE_HEADING | RULE_FEATURE_TEXT | RULE_IN_ORDER_TO | RULE_AS_A | RULE_I_WANT_TO | RULE_SCENARIO_TEXT | RULE_SCENARIO_OUTLINE_TEXT | RULE_BACKGROUND_TEXT | RULE_WHEN_TEXT | RULE_THEN_TEXT | RULE_GIVEN_TEXT | RULE_AND_TEXT | RULE_EXAMPLE_ROW_END | RULE_EXAMPLE_CELL | RULE_CODE | RULE_TAG | RULE_SL_COMMENT | RULE_TEXT | RULE_WS | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_ANY_OTHER )
        int alt35=27;
        alt35 = dfa35.predict(input);
        switch (alt35) {
            case 1 :
                // ../de.laegler.xdocker.lang.ui/src-gen/de/laegler/xdocker/lang/ui/contentassist/antlr/internal/InternalXDockerLang.g:1:10: RULE_FROM
                {
                mRULE_FROM(); 

                }
                break;
            case 2 :
                // ../de.laegler.xdocker.lang.ui/src-gen/de/laegler/xdocker/lang/ui/contentassist/antlr/internal/InternalXDockerLang.g:1:20: RULE_MAINTAINER
                {
                mRULE_MAINTAINER(); 

                }
                break;
            case 3 :
                // ../de.laegler.xdocker.lang.ui/src-gen/de/laegler/xdocker/lang/ui/contentassist/antlr/internal/InternalXDockerLang.g:1:36: RULE_RUN
                {
                mRULE_RUN(); 

                }
                break;
            case 4 :
                // ../de.laegler.xdocker.lang.ui/src-gen/de/laegler/xdocker/lang/ui/contentassist/antlr/internal/InternalXDockerLang.g:1:45: RULE_EXAMPLE_HEADING
                {
                mRULE_EXAMPLE_HEADING(); 

                }
                break;
            case 5 :
                // ../de.laegler.xdocker.lang.ui/src-gen/de/laegler/xdocker/lang/ui/contentassist/antlr/internal/InternalXDockerLang.g:1:66: RULE_FEATURE_TEXT
                {
                mRULE_FEATURE_TEXT(); 

                }
                break;
            case 6 :
                // ../de.laegler.xdocker.lang.ui/src-gen/de/laegler/xdocker/lang/ui/contentassist/antlr/internal/InternalXDockerLang.g:1:84: RULE_IN_ORDER_TO
                {
                mRULE_IN_ORDER_TO(); 

                }
                break;
            case 7 :
                // ../de.laegler.xdocker.lang.ui/src-gen/de/laegler/xdocker/lang/ui/contentassist/antlr/internal/InternalXDockerLang.g:1:101: RULE_AS_A
                {
                mRULE_AS_A(); 

                }
                break;
            case 8 :
                // ../de.laegler.xdocker.lang.ui/src-gen/de/laegler/xdocker/lang/ui/contentassist/antlr/internal/InternalXDockerLang.g:1:111: RULE_I_WANT_TO
                {
                mRULE_I_WANT_TO(); 

                }
                break;
            case 9 :
                // ../de.laegler.xdocker.lang.ui/src-gen/de/laegler/xdocker/lang/ui/contentassist/antlr/internal/InternalXDockerLang.g:1:126: RULE_SCENARIO_TEXT
                {
                mRULE_SCENARIO_TEXT(); 

                }
                break;
            case 10 :
                // ../de.laegler.xdocker.lang.ui/src-gen/de/laegler/xdocker/lang/ui/contentassist/antlr/internal/InternalXDockerLang.g:1:145: RULE_SCENARIO_OUTLINE_TEXT
                {
                mRULE_SCENARIO_OUTLINE_TEXT(); 

                }
                break;
            case 11 :
                // ../de.laegler.xdocker.lang.ui/src-gen/de/laegler/xdocker/lang/ui/contentassist/antlr/internal/InternalXDockerLang.g:1:172: RULE_BACKGROUND_TEXT
                {
                mRULE_BACKGROUND_TEXT(); 

                }
                break;
            case 12 :
                // ../de.laegler.xdocker.lang.ui/src-gen/de/laegler/xdocker/lang/ui/contentassist/antlr/internal/InternalXDockerLang.g:1:193: RULE_WHEN_TEXT
                {
                mRULE_WHEN_TEXT(); 

                }
                break;
            case 13 :
                // ../de.laegler.xdocker.lang.ui/src-gen/de/laegler/xdocker/lang/ui/contentassist/antlr/internal/InternalXDockerLang.g:1:208: RULE_THEN_TEXT
                {
                mRULE_THEN_TEXT(); 

                }
                break;
            case 14 :
                // ../de.laegler.xdocker.lang.ui/src-gen/de/laegler/xdocker/lang/ui/contentassist/antlr/internal/InternalXDockerLang.g:1:223: RULE_GIVEN_TEXT
                {
                mRULE_GIVEN_TEXT(); 

                }
                break;
            case 15 :
                // ../de.laegler.xdocker.lang.ui/src-gen/de/laegler/xdocker/lang/ui/contentassist/antlr/internal/InternalXDockerLang.g:1:239: RULE_AND_TEXT
                {
                mRULE_AND_TEXT(); 

                }
                break;
            case 16 :
                // ../de.laegler.xdocker.lang.ui/src-gen/de/laegler/xdocker/lang/ui/contentassist/antlr/internal/InternalXDockerLang.g:1:253: RULE_EXAMPLE_ROW_END
                {
                mRULE_EXAMPLE_ROW_END(); 

                }
                break;
            case 17 :
                // ../de.laegler.xdocker.lang.ui/src-gen/de/laegler/xdocker/lang/ui/contentassist/antlr/internal/InternalXDockerLang.g:1:274: RULE_EXAMPLE_CELL
                {
                mRULE_EXAMPLE_CELL(); 

                }
                break;
            case 18 :
                // ../de.laegler.xdocker.lang.ui/src-gen/de/laegler/xdocker/lang/ui/contentassist/antlr/internal/InternalXDockerLang.g:1:292: RULE_CODE
                {
                mRULE_CODE(); 

                }
                break;
            case 19 :
                // ../de.laegler.xdocker.lang.ui/src-gen/de/laegler/xdocker/lang/ui/contentassist/antlr/internal/InternalXDockerLang.g:1:302: RULE_TAG
                {
                mRULE_TAG(); 

                }
                break;
            case 20 :
                // ../de.laegler.xdocker.lang.ui/src-gen/de/laegler/xdocker/lang/ui/contentassist/antlr/internal/InternalXDockerLang.g:1:311: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 21 :
                // ../de.laegler.xdocker.lang.ui/src-gen/de/laegler/xdocker/lang/ui/contentassist/antlr/internal/InternalXDockerLang.g:1:327: RULE_TEXT
                {
                mRULE_TEXT(); 

                }
                break;
            case 22 :
                // ../de.laegler.xdocker.lang.ui/src-gen/de/laegler/xdocker/lang/ui/contentassist/antlr/internal/InternalXDockerLang.g:1:337: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 23 :
                // ../de.laegler.xdocker.lang.ui/src-gen/de/laegler/xdocker/lang/ui/contentassist/antlr/internal/InternalXDockerLang.g:1:345: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 24 :
                // ../de.laegler.xdocker.lang.ui/src-gen/de/laegler/xdocker/lang/ui/contentassist/antlr/internal/InternalXDockerLang.g:1:353: RULE_INT
                {
                mRULE_INT(); 

                }
                break;
            case 25 :
                // ../de.laegler.xdocker.lang.ui/src-gen/de/laegler/xdocker/lang/ui/contentassist/antlr/internal/InternalXDockerLang.g:1:362: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 26 :
                // ../de.laegler.xdocker.lang.ui/src-gen/de/laegler/xdocker/lang/ui/contentassist/antlr/internal/InternalXDockerLang.g:1:374: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 27 :
                // ../de.laegler.xdocker.lang.ui/src-gen/de/laegler/xdocker/lang/ui/contentassist/antlr/internal/InternalXDockerLang.g:1:390: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


    protected DFA35 dfa35 = new DFA35(this);
    static final String DFA35_eotS =
        "\1\uffff\14\33\1\52\2\33\1\66\2\33\1\uffff\3\33\1\uffff\3\33\1"+
        "\uffff\15\33\1\52\2\uffff\12\33\2\uffff\1\127\1\33\1\uffff\5\33"+
        "\1\144\17\33\2\uffff\4\33\2\uffff\1\127\1\uffff\4\33\1\173\2\33"+
        "\2\144\2\uffff\1\144\4\33\1\u0089\1\u008d\16\33\2\uffff\1\173\1"+
        "\uffff\2\173\6\33\2\u0089\2\uffff\2\u008d\2\uffff\2\33\1\u00a1\1"+
        "\u00a5\2\33\1\uffff\11\33\2\u00a1\2\uffff\2\u00a5\2\uffff\1\u00b4"+
        "\2\u0094\10\33\2\u00b4\2\uffff\1\u00c0\7\33\2\u00c0\2\uffff\10\33"+
        "\1\u00d7\1\33\1\u00dc\1\33\1\uffff\1\33\1\u00c0\1\33\1\u00e3\2\33"+
        "\2\u00d7\2\uffff\1\33\2\u00dc\2\uffff\1\u00dc\1\uffff\1\u00eb\2"+
        "\u00e3\2\uffff\3\33\1\u00f1\2\u00eb\2\uffff\2\33\2\u00f1\2\uffff"+
        "\10\33\3\u00fe\2\uffff";
    static final String DFA35_eofS =
        "\u00ff\uffff";
    static final String DFA35_minS =
        "\1\0\5\60\1\40\6\60\5\0\1\101\1\uffff\2\60\1\52\1\uffff\3\60\1"+
        "\uffff\4\60\1\40\1\167\1\40\6\60\1\0\2\uffff\1\42\4\0\1\47\4\0\2"+
        "\uffff\1\0\1\60\1\uffff\1\60\1\0\3\60\1\0\2\60\1\157\2\141\1\40"+
        "\5\60\4\0\2\uffff\4\0\2\uffff\1\12\1\uffff\5\0\2\60\1\0\1\12\2\uffff"+
        "\1\0\2\60\1\162\1\156\2\0\2\60\2\40\1\60\11\0\2\uffff\1\12\1\uffff"+
        "\2\0\4\60\1\144\1\164\1\0\1\12\2\uffff\1\0\1\12\2\uffff\2\60\2\0"+
        "\1\40\1\0\1\uffff\1\0\4\60\1\145\1\40\2\60\1\0\1\12\2\uffff\1\0"+
        "\1\12\2\uffff\3\0\4\60\1\162\1\164\2\60\1\0\1\12\2\uffff\1\0\1\60"+
        "\1\11\1\60\1\40\1\157\1\11\1\60\1\0\1\12\2\uffff\1\60\2\11\1\60"+
        "\1\164\1\40\1\11\1\60\1\0\1\60\1\0\1\12\1\uffff\1\11\1\0\1\157\1"+
        "\0\1\165\1\60\1\0\1\12\2\uffff\1\11\1\0\1\12\2\uffff\1\0\1\uffff"+
        "\2\0\1\12\2\uffff\1\164\1\60\1\11\2\0\1\12\2\uffff\1\154\1\60\1"+
        "\0\1\12\2\uffff\1\151\1\60\1\156\1\60\1\145\3\11\2\0\1\12\2\uffff";
    static final String DFA35_maxS =
        "\1\uffff\14\172\5\uffff\1\172\1\uffff\1\172\1\71\1\52\1\uffff\3"+
        "\172\1\uffff\5\172\1\167\7\172\1\uffff\2\uffff\1\42\4\uffff\1\47"+
        "\4\uffff\2\uffff\1\uffff\1\172\1\uffff\1\71\1\uffff\3\172\1\uffff"+
        "\2\172\1\157\2\141\6\172\4\uffff\2\uffff\4\uffff\2\uffff\1\12\1"+
        "\uffff\5\uffff\2\172\1\uffff\1\12\2\uffff\1\uffff\2\172\1\162\1"+
        "\156\2\uffff\5\172\11\uffff\2\uffff\1\12\1\uffff\2\uffff\4\172\1"+
        "\144\1\164\1\uffff\1\12\2\uffff\1\uffff\1\12\2\uffff\2\172\2\uffff"+
        "\1\172\1\uffff\1\uffff\1\uffff\4\172\1\145\1\40\2\172\1\uffff\1"+
        "\12\2\uffff\1\uffff\1\12\2\uffff\3\uffff\4\172\1\162\1\164\2\172"+
        "\1\uffff\1\12\2\uffff\1\uffff\3\172\1\40\1\157\2\172\1\uffff\1\12"+
        "\2\uffff\1\172\1\72\1\40\1\172\1\164\1\40\1\117\1\172\1\uffff\1"+
        "\172\1\uffff\1\12\1\uffff\1\40\1\uffff\1\157\1\uffff\1\165\1\172"+
        "\1\uffff\1\12\2\uffff\1\172\1\uffff\1\12\2\uffff\1\uffff\1\uffff"+
        "\2\uffff\1\12\2\uffff\1\164\1\172\1\72\2\uffff\1\12\2\uffff\1\154"+
        "\1\172\1\uffff\1\12\2\uffff\1\151\1\172\1\156\1\172\1\145\1\172"+
        "\2\72\2\uffff\1\12\2\uffff";
    static final String DFA35_acceptS =
        "\23\uffff\1\26\3\uffff\1\25\3\uffff\1\25\16\uffff\1\20\1\21\12"+
        "\uffff\1\33\1\23\2\uffff\1\26\25\uffff\1\31\1\25\4\uffff\1\25\1"+
        "\24\1\uffff\1\24\11\uffff\2\3\25\uffff\1\32\1\1\1\uffff\1\1\12\uffff"+
        "\2\7\2\uffff\2\17\6\uffff\1\22\13\uffff\2\14\2\uffff\2\15\15\uffff"+
        "\2\16\12\uffff\2\5\14\uffff\1\4\10\uffff\2\11\3\uffff\2\2\1\uffff"+
        "\1\4\3\uffff\2\10\6\uffff\2\6\4\uffff\2\13\13\uffff\2\12";
    static final String DFA35_specialS =
        "\1\30\14\uffff\1\34\1\11\1\42\1\31\1\36\27\uffff\1\40\3\uffff\1"+
        "\50\1\106\1\54\1\70\1\uffff\1\51\1\25\1\104\1\5\2\uffff\1\74\3\uffff"+
        "\1\22\3\uffff\1\33\13\uffff\1\45\1\105\1\53\1\66\2\uffff\1\57\1"+
        "\23\1\102\1\2\4\uffff\1\10\1\16\1\76\1\110\1\65\2\uffff\1\24\3\uffff"+
        "\1\44\4\uffff\1\41\1\3\5\uffff\1\60\1\0\1\62\1\75\1\72\1\15\1\73"+
        "\1\107\1\101\4\uffff\1\67\1\6\6\uffff\1\100\3\uffff\1\77\5\uffff"+
        "\1\27\1\46\1\uffff\1\47\1\uffff\1\61\10\uffff\1\26\3\uffff\1\43"+
        "\3\uffff\1\71\1\103\1\12\10\uffff\1\55\3\uffff\1\21\7\uffff\1\37"+
        "\13\uffff\1\13\1\uffff\1\7\3\uffff\1\17\1\uffff\1\64\2\uffff\1\35"+
        "\4\uffff\1\1\3\uffff\1\32\1\uffff\1\20\1\14\6\uffff\1\111\1\56\5"+
        "\uffff\1\4\13\uffff\1\52\1\63\3\uffff}>";
    static final String[] DFA35_transitionS = {
            "\11\27\2\23\2\27\1\23\22\27\1\23\1\27\1\16\1\21\3\27\1\17\7"+
            "\27\1\26\12\25\6\27\1\20\1\7\1\11\2\24\1\4\1\1\1\14\1\24\1\6"+
            "\3\24\1\2\1\5\3\24\1\3\1\10\1\13\2\24\1\12\3\24\3\27\1\22\1"+
            "\24\1\27\32\24\1\27\1\15\uff83\27",
            "\12\32\7\uffff\21\32\1\30\10\32\4\uffff\1\32\1\uffff\4\32"+
            "\1\31\25\32",
            "\12\32\7\uffff\1\34\31\32\4\uffff\1\32\1\uffff\32\32",
            "\12\32\7\uffff\24\32\1\35\5\32\4\uffff\1\32\1\uffff\32\32",
            "\12\32\7\uffff\32\32\4\uffff\1\32\1\uffff\27\32\1\36\2\32",
            "\12\32\7\uffff\32\32\4\uffff\1\32\1\uffff\1\37\31\32",
            "\1\41\17\uffff\12\32\7\uffff\32\32\4\uffff\1\32\1\uffff\15"+
            "\32\1\40\14\32",
            "\12\32\7\uffff\32\32\4\uffff\1\32\1\uffff\15\32\1\43\4\32"+
            "\1\42\7\32",
            "\12\32\7\uffff\32\32\4\uffff\1\32\1\uffff\2\32\1\44\27\32",
            "\12\32\7\uffff\32\32\4\uffff\1\32\1\uffff\1\45\31\32",
            "\12\32\7\uffff\32\32\4\uffff\1\32\1\uffff\7\32\1\46\22\32",
            "\12\32\7\uffff\32\32\4\uffff\1\32\1\uffff\7\32\1\47\22\32",
            "\12\32\7\uffff\32\32\4\uffff\1\32\1\uffff\10\32\1\50\21\32",
            "\11\53\1\51\1\uffff\2\53\1\uffff\22\53\1\51\133\53\1\uffff"+
            "\uff83\53",
            "\12\60\1\57\2\60\1\56\24\60\1\54\71\60\1\55\uffa3\60",
            "\12\65\1\64\2\65\1\63\31\65\1\61\64\65\1\62\uffa3\65",
            "\12\67\1\uffff\2\67\1\uffff\ufff2\67",
            "\12\70\1\uffff\2\70\1\uffff\ufff2\70",
            "\32\71\4\uffff\1\71\1\uffff\32\71",
            "",
            "\12\32\7\uffff\32\32\4\uffff\1\32\1\uffff\32\32",
            "\12\73",
            "\1\74",
            "",
            "\12\32\7\uffff\16\32\1\75\13\32\4\uffff\1\32\1\uffff\32\32",
            "\12\32\7\uffff\32\32\4\uffff\1\32\1\uffff\1\76\31\32",
            "\12\32\7\uffff\32\32\4\uffff\1\32\1\uffff\32\32",
            "",
            "\12\32\7\uffff\10\32\1\77\21\32\4\uffff\1\32\1\uffff\32\32",
            "\12\32\7\uffff\15\32\1\100\14\32\4\uffff\1\32\1\uffff\32\32",
            "\12\32\7\uffff\32\32\4\uffff\1\32\1\uffff\1\101\31\32",
            "\12\32\7\uffff\32\32\4\uffff\1\32\1\uffff\21\32\1\102\10\32",
            "\1\103\17\uffff\12\32\7\uffff\32\32\4\uffff\1\32\1\uffff\32"+
            "\32",
            "\1\104",
            "\1\105\17\uffff\12\32\7\uffff\32\32\4\uffff\1\32\1\uffff\32"+
            "\32",
            "\12\32\7\uffff\32\32\4\uffff\1\32\1\uffff\3\32\1\106\26\32",
            "\12\32\7\uffff\32\32\4\uffff\1\32\1\uffff\4\32\1\107\25\32",
            "\12\32\7\uffff\32\32\4\uffff\1\32\1\uffff\2\32\1\110\27\32",
            "\12\32\7\uffff\32\32\4\uffff\1\32\1\uffff\4\32\1\111\25\32",
            "\12\32\7\uffff\32\32\4\uffff\1\32\1\uffff\4\32\1\112\25\32",
            "\12\32\7\uffff\32\32\4\uffff\1\32\1\uffff\25\32\1\113\4\32",
            "\11\53\1\51\1\uffff\2\53\1\uffff\22\53\1\51\133\53\1\uffff"+
            "\uff83\53",
            "",
            "",
            "\1\114",
            "\12\117\1\116\2\117\1\115\ufff2\117",
            "\12\120\1\57\ufff5\120",
            "\0\120",
            "\12\60\1\57\2\60\1\56\24\60\1\121\71\60\1\55\uffa3\60",
            "\1\122",
            "\12\125\1\124\2\125\1\123\ufff2\125",
            "\12\120\1\64\ufff5\120",
            "\0\120",
            "\12\65\1\64\2\65\1\63\31\65\1\126\64\65\1\62\uffa3\65",
            "",
            "",
            "\12\70\1\131\2\70\1\130\ufff2\70",
            "\12\32\7\uffff\32\32\4\uffff\1\32\1\uffff\32\32",
            "",
            "\12\73",
            "\12\135\1\134\2\135\1\133\34\135\1\132\uffd5\135",
            "\12\32\7\uffff\14\32\1\136\15\32\4\uffff\1\32\1\uffff\32\32",
            "\12\32\7\uffff\32\32\4\uffff\1\32\1\uffff\23\32\1\137\6\32",
            "\12\32\7\uffff\15\32\1\140\14\32\4\uffff\1\32\1\uffff\32\32",
            "\12\145\1\143\2\145\1\142\42\145\12\141\7\145\32\141\4\145"+
            "\1\141\1\145\32\141\uff85\145",
            "\12\32\7\uffff\32\32\4\uffff\1\32\1\uffff\14\32\1\146\15\32",
            "\12\32\7\uffff\32\32\4\uffff\1\32\1\uffff\21\32\1\147\10\32",
            "\1\150",
            "\1\151",
            "\1\152",
            "\1\153\17\uffff\12\32\7\uffff\32\32\4\uffff\1\32\1\uffff\32"+
            "\32",
            "\12\32\7\uffff\32\32\4\uffff\1\32\1\uffff\15\32\1\154\14\32",
            "\12\32\7\uffff\32\32\4\uffff\1\32\1\uffff\12\32\1\155\17\32",
            "\12\32\7\uffff\32\32\4\uffff\1\32\1\uffff\15\32\1\156\14\32",
            "\12\32\7\uffff\32\32\4\uffff\1\32\1\uffff\15\32\1\157\14\32",
            "\12\32\7\uffff\32\32\4\uffff\1\32\1\uffff\4\32\1\160\25\32",
            "\12\164\1\163\2\164\1\162\24\164\1\161\uffdd\164",
            "\12\120\1\57\ufff5\120",
            "\0\120",
            "\12\60\1\57\2\60\1\56\24\60\1\121\71\60\1\55\uffa3\60",
            "",
            "",
            "\12\170\1\167\2\170\1\166\31\170\1\165\uffd8\170",
            "\12\120\1\64\ufff5\120",
            "\0\120",
            "\12\65\1\64\2\65\1\63\31\65\1\126\64\65\1\62\uffa3\65",
            "",
            "",
            "\1\131",
            "",
            "\12\135\1\134\2\135\1\133\34\135\1\132\4\135\1\171\uffd0\135",
            "\12\172\1\134\ufff5\172",
            "\0\172",
            "\12\135\1\134\2\135\1\133\34\135\1\132\uffd5\135",
            "\12\177\1\175\2\177\1\174\42\177\12\176\7\177\32\176\4\177"+
            "\1\176\1\177\32\176\uff85\177",
            "\12\32\7\uffff\32\32\4\uffff\1\32\1\uffff\24\32\1\u0080\5"+
            "\32",
            "\12\32\7\uffff\23\32\1\u0081\6\32\4\uffff\1\32\1\uffff\32"+
            "\32",
            "\12\145\1\143\2\145\1\142\42\145\12\141\7\145\32\141\4\145"+
            "\1\141\1\145\32\141\uff85\145",
            "\1\143",
            "",
            "",
            "\12\145\1\143\2\145\1\142\ufff2\145",
            "\12\32\7\uffff\32\32\4\uffff\1\32\1\uffff\17\32\1\u0082\12"+
            "\32",
            "\12\32\7\uffff\32\32\4\uffff\1\32\1\uffff\1\u0083\31\32",
            "\1\u0084",
            "\1\u0085",
            "\12\u0086\1\u0088\2\u0086\1\u0087\ufff2\u0086",
            "\12\u008a\1\u008c\2\u008a\1\u008b\ufff2\u008a",
            "\12\32\7\uffff\32\32\4\uffff\1\32\1\uffff\1\u008e\31\32",
            "\12\32\7\uffff\32\32\4\uffff\1\32\1\uffff\6\32\1\u008f\23"+
            "\32",
            "\1\u0090\17\uffff\12\32\7\uffff\32\32\4\uffff\1\32\1\uffff"+
            "\32\32",
            "\1\u0091\17\uffff\12\32\7\uffff\32\32\4\uffff\1\32\1\uffff"+
            "\32\32",
            "\12\32\7\uffff\32\32\4\uffff\1\32\1\uffff\15\32\1\u0092\14"+
            "\32",
            "\12\164\1\163\2\164\1\162\24\164\1\u0093\uffdd\164",
            "\12\u0094\1\163\ufff5\u0094",
            "\0\u0094",
            "\12\164\1\163\2\164\1\162\24\164\1\161\uffdd\164",
            "\12\170\1\167\2\170\1\166\31\170\1\u0095\uffd8\170",
            "\12\u0094\1\167\ufff5\u0094",
            "\0\u0094",
            "\12\170\1\167\2\170\1\166\31\170\1\165\uffd8\170",
            "\12\135\1\134\2\135\1\133\34\135\1\132\uffd5\135",
            "",
            "",
            "\1\175",
            "",
            "\12\177\1\175\2\177\1\174\42\177\12\176\7\177\32\176\4\177"+
            "\1\176\1\177\32\176\uff85\177",
            "\12\177\1\175\2\177\1\174\ufff2\177",
            "\12\32\7\uffff\32\32\4\uffff\1\32\1\uffff\21\32\1\u0096\10"+
            "\32",
            "\12\32\7\uffff\1\u0097\31\32\4\uffff\1\32\1\uffff\32\32",
            "\12\32\7\uffff\32\32\4\uffff\1\32\1\uffff\13\32\1\u0098\16"+
            "\32",
            "\12\32\7\uffff\32\32\4\uffff\1\32\1\uffff\23\32\1\u0099\6"+
            "\32",
            "\1\u009a",
            "\1\u009b",
            "\12\u0086\1\u0088\2\u0086\1\u0087\ufff2\u0086",
            "\1\u0088",
            "",
            "",
            "\12\u008a\1\u008c\2\u008a\1\u008b\ufff2\u008a",
            "\1\u008c",
            "",
            "",
            "\12\32\7\uffff\32\32\4\uffff\1\32\1\uffff\21\32\1\u009c\10"+
            "\32",
            "\12\32\7\uffff\32\32\4\uffff\1\32\1\uffff\21\32\1\u009d\10"+
            "\32",
            "\12\u009e\1\u00a0\2\u009e\1\u009f\ufff2\u009e",
            "\12\u00a2\1\u00a4\2\u00a2\1\u00a3\ufff2\u00a2",
            "\1\u00a6\17\uffff\12\32\7\uffff\32\32\4\uffff\1\32\1\uffff"+
            "\32\32",
            "\12\164\1\163\2\164\1\162\24\164\1\u00a7\uffdd\164",
            "",
            "\12\170\1\167\2\170\1\166\31\170\1\u00a8\uffd8\170",
            "\12\32\7\uffff\32\32\4\uffff\1\32\1\uffff\4\32\1\u00a9\25"+
            "\32",
            "\12\32\7\uffff\10\32\1\u00aa\21\32\4\uffff\1\32\1\uffff\32"+
            "\32",
            "\12\32\7\uffff\32\32\4\uffff\1\32\1\uffff\4\32\1\u00ab\25"+
            "\32",
            "\12\32\7\uffff\32\32\4\uffff\1\32\1\uffff\10\32\1\u00ac\21"+
            "\32",
            "\1\u00ad",
            "\1\u00ae",
            "\12\32\7\uffff\32\32\4\uffff\1\32\1\uffff\10\32\1\u00af\21"+
            "\32",
            "\12\32\7\uffff\32\32\4\uffff\1\32\1\uffff\16\32\1\u00b0\13"+
            "\32",
            "\12\u009e\1\u00a0\2\u009e\1\u009f\ufff2\u009e",
            "\1\u00a0",
            "",
            "",
            "\12\u00a2\1\u00a4\2\u00a2\1\u00a3\ufff2\u00a2",
            "\1\u00a4",
            "",
            "",
            "\12\u00b1\1\u00b3\2\u00b1\1\u00b2\ufff2\u00b1",
            "\12\164\1\163\2\164\1\162\24\164\1\u00a7\uffdd\164",
            "\12\170\1\167\2\170\1\166\31\170\1\u00a8\uffd8\170",
            "\12\32\1\u00b5\6\uffff\32\32\4\uffff\1\32\1\uffff\32\32",
            "\12\32\7\uffff\15\32\1\u00b6\14\32\4\uffff\1\32\1\uffff\32"+
            "\32",
            "\12\32\7\uffff\32\32\4\uffff\1\32\1\uffff\22\32\1\u00b7\7"+
            "\32",
            "\12\32\7\uffff\32\32\4\uffff\1\32\1\uffff\25\32\1\u00b8\4"+
            "\32",
            "\1\u00b9",
            "\1\u00ba",
            "\12\32\7\uffff\32\32\4\uffff\1\32\1\uffff\16\32\1\u00bb\13"+
            "\32",
            "\12\32\7\uffff\32\32\4\uffff\1\32\1\uffff\24\32\1\u00bc\5"+
            "\32",
            "\12\u00b1\1\u00b3\2\u00b1\1\u00b2\ufff2\u00b1",
            "\1\u00b3",
            "",
            "",
            "\12\u00bd\1\u00bf\2\u00bd\1\u00be\ufff2\u00bd",
            "\12\32\7\uffff\4\32\1\u00c1\25\32\4\uffff\1\32\1\uffff\32"+
            "\32",
            "\1\u00c2\26\uffff\1\u00c2\17\uffff\12\32\1\u00c3\6\uffff\32"+
            "\32\4\uffff\1\32\1\uffff\32\32",
            "\12\32\7\uffff\32\32\4\uffff\1\32\1\uffff\4\32\1\u00c4\25"+
            "\32",
            "\1\u00c5",
            "\1\u00c6",
            "\1\u00c7\26\uffff\1\u00c7\17\uffff\12\32\1\u00c9\6\uffff\16"+
            "\32\1\u00c8\13\32\4\uffff\1\32\1\uffff\32\32",
            "\12\32\7\uffff\32\32\4\uffff\1\32\1\uffff\15\32\1\u00ca\14"+
            "\32",
            "\12\u00bd\1\u00bf\2\u00bd\1\u00be\ufff2\u00bd",
            "\1\u00bf",
            "",
            "",
            "\12\32\7\uffff\21\32\1\u00cb\10\32\4\uffff\1\32\1\uffff\32"+
            "\32",
            "\1\u00c2\26\uffff\1\u00c2\31\uffff\1\u00c3",
            "\1\u00ce\1\u00cd\2\uffff\1\u00cc\22\uffff\1\u00ce",
            "\12\32\1\u00cf\6\uffff\32\32\4\uffff\1\32\1\uffff\32\32",
            "\1\u00d0",
            "\1\u00d1",
            "\1\u00c7\26\uffff\1\u00c7\31\uffff\1\u00c9\24\uffff\1\u00d2",
            "\12\32\7\uffff\32\32\4\uffff\1\32\1\uffff\24\32\1\u00d3\5"+
            "\32",
            "\12\u00d4\1\u00d6\2\u00d4\1\u00d5\ufff2\u00d4",
            "\12\32\7\uffff\32\32\4\uffff\1\32\1\uffff\3\32\1\u00d8\26"+
            "\32",
            "\12\u00dd\1\u00db\2\u00dd\1\u00da\42\u00dd\12\u00d9\7\u00dd"+
            "\32\u00d9\4\u00dd\1\u00d9\1\u00dd\32\u00d9\uff85\u00dd",
            "\1\u00cd",
            "",
            "\1\u00ce\1\u00cd\2\uffff\1\u00cc\22\uffff\1\u00ce",
            "\12\u00bd\1\u00bf\2\u00bd\1\u00be\ufff2\u00bd",
            "\1\u00df",
            "\12\u00e0\1\u00e2\2\u00e0\1\u00e1\ufff2\u00e0",
            "\1\u00e4",
            "\12\32\7\uffff\32\32\4\uffff\1\32\1\uffff\23\32\1\u00e5\6"+
            "\32",
            "\12\u00d4\1\u00d6\2\u00d4\1\u00d5\ufff2\u00d4",
            "\1\u00d6",
            "",
            "",
            "\1\u00e6\26\uffff\1\u00e6\17\uffff\12\32\1\u00e7\6\uffff\32"+
            "\32\4\uffff\1\32\1\uffff\32\32",
            "\12\u00dd\1\u00db\2\u00dd\1\u00da\42\u00dd\12\u00d9\7\u00dd"+
            "\32\u00d9\4\u00dd\1\u00d9\1\u00dd\32\u00d9\uff85\u00dd",
            "\1\u00db",
            "",
            "",
            "\12\u00dd\1\u00db\2\u00dd\1\u00da\ufff2\u00dd",
            "",
            "\12\u00e8\1\u00ea\2\u00e8\1\u00e9\ufff2\u00e8",
            "\12\u00e0\1\u00e2\2\u00e0\1\u00e1\ufff2\u00e0",
            "\1\u00e2",
            "",
            "",
            "\1\u00ec",
            "\12\32\7\uffff\32\32\4\uffff\1\32\1\uffff\13\32\1\u00ed\16"+
            "\32",
            "\1\u00e6\26\uffff\1\u00e6\31\uffff\1\u00e7",
            "\12\u00ee\1\u00f0\2\u00ee\1\u00ef\ufff2\u00ee",
            "\12\u00e8\1\u00ea\2\u00e8\1\u00e9\ufff2\u00e8",
            "\1\u00ea",
            "",
            "",
            "\1\u00f2",
            "\12\32\7\uffff\32\32\4\uffff\1\32\1\uffff\10\32\1\u00f3\21"+
            "\32",
            "\12\u00ee\1\u00f0\2\u00ee\1\u00ef\ufff2\u00ee",
            "\1\u00f0",
            "",
            "",
            "\1\u00f4",
            "\12\32\7\uffff\32\32\4\uffff\1\32\1\uffff\15\32\1\u00f5\14"+
            "\32",
            "\1\u00f6",
            "\12\32\7\uffff\32\32\4\uffff\1\32\1\uffff\4\32\1\u00f7\25"+
            "\32",
            "\1\u00f8",
            "\1\u00f9\26\uffff\1\u00f9\17\uffff\12\32\1\u00fa\6\uffff\32"+
            "\32\4\uffff\1\32\1\uffff\32\32",
            "\1\u00f9\26\uffff\1\u00f9\31\uffff\1\u00fa",
            "\1\u00f9\26\uffff\1\u00f9\31\uffff\1\u00fa",
            "\12\u00fb\1\u00fd\2\u00fb\1\u00fc\ufff2\u00fb",
            "\12\u00fb\1\u00fd\2\u00fb\1\u00fc\ufff2\u00fb",
            "\1\u00fd",
            "",
            ""
    };

    static final short[] DFA35_eot = DFA.unpackEncodedString(DFA35_eotS);
    static final short[] DFA35_eof = DFA.unpackEncodedString(DFA35_eofS);
    static final char[] DFA35_min = DFA.unpackEncodedStringToUnsignedChars(DFA35_minS);
    static final char[] DFA35_max = DFA.unpackEncodedStringToUnsignedChars(DFA35_maxS);
    static final short[] DFA35_accept = DFA.unpackEncodedString(DFA35_acceptS);
    static final short[] DFA35_special = DFA.unpackEncodedString(DFA35_specialS);
    static final short[][] DFA35_transition;

    static {
        int numStates = DFA35_transitionS.length;
        DFA35_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA35_transition[i] = DFA.unpackEncodedString(DFA35_transitionS[i]);
        }
    }

    class DFA35 extends DFA {

        public DFA35(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 35;
            this.eot = DFA35_eot;
            this.eof = DFA35_eof;
            this.min = DFA35_min;
            this.max = DFA35_max;
            this.accept = DFA35_accept;
            this.special = DFA35_special;
            this.transition = DFA35_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( RULE_FROM | RULE_MAINTAINER | RULE_RUN | RULE_EXAMPLE_HEADING | RULE_FEATURE_TEXT | RULE_IN_ORDER_TO | RULE_AS_A | RULE_I_WANT_TO | RULE_SCENARIO_TEXT | RULE_SCENARIO_OUTLINE_TEXT | RULE_BACKGROUND_TEXT | RULE_WHEN_TEXT | RULE_THEN_TEXT | RULE_GIVEN_TEXT | RULE_AND_TEXT | RULE_EXAMPLE_ROW_END | RULE_EXAMPLE_CELL | RULE_CODE | RULE_TAG | RULE_SL_COMMENT | RULE_TEXT | RULE_WS | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_ANY_OTHER );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA35_114 = input.LA(1);

                        s = -1;
                        if ( (LA35_114=='\n') ) {s = 115;}

                        else if ( ((LA35_114>='\u0000' && LA35_114<='\t')||(LA35_114>='\u000B' && LA35_114<='\uFFFF')) ) {s = 148;}

                        else s = 27;

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA35_217 = input.LA(1);

                        s = -1;
                        if ( (LA35_217=='\r') ) {s = 218;}

                        else if ( (LA35_217=='\n') ) {s = 219;}

                        else if ( ((LA35_217>='0' && LA35_217<='9')||(LA35_217>='A' && LA35_217<='Z')||LA35_217=='_'||(LA35_217>='a' && LA35_217<='z')) ) {s = 217;}

                        else if ( ((LA35_217>='\u0000' && LA35_217<='\t')||(LA35_217>='\u000B' && LA35_217<='\f')||(LA35_217>='\u000E' && LA35_217<='/')||(LA35_217>=':' && LA35_217<='@')||(LA35_217>='[' && LA35_217<='^')||LA35_217=='`'||(LA35_217>='{' && LA35_217<='\uFFFF')) ) {s = 221;}

                        else s = 220;

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA35_85 = input.LA(1);

                        s = -1;
                        if ( (LA35_85=='\'') ) {s = 86;}

                        else if ( (LA35_85=='\\') ) {s = 50;}

                        else if ( (LA35_85=='\r') ) {s = 51;}

                        else if ( (LA35_85=='\n') ) {s = 52;}

                        else if ( ((LA35_85>='\u0000' && LA35_85<='\t')||(LA35_85>='\u000B' && LA35_85<='\f')||(LA35_85>='\u000E' && LA35_85<='&')||(LA35_85>='(' && LA35_85<='[')||(LA35_85>=']' && LA35_85<='\uFFFF')) ) {s = 53;}

                        else s = 27;

                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA35_107 = input.LA(1);

                        s = -1;
                        if ( ((LA35_107>='\u0000' && LA35_107<='\t')||(LA35_107>='\u000B' && LA35_107<='\f')||(LA35_107>='\u000E' && LA35_107<='\uFFFF')) ) {s = 138;}

                        else if ( (LA35_107=='\r') ) {s = 139;}

                        else if ( (LA35_107=='\n') ) {s = 140;}

                        else s = 141;

                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA35_238 = input.LA(1);

                        s = -1;
                        if ( (LA35_238=='\r') ) {s = 239;}

                        else if ( (LA35_238=='\n') ) {s = 240;}

                        else if ( ((LA35_238>='\u0000' && LA35_238<='\t')||(LA35_238>='\u000B' && LA35_238<='\f')||(LA35_238>='\u000E' && LA35_238<='\uFFFF')) ) {s = 238;}

                        else s = 241;

                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA35_53 = input.LA(1);

                        s = -1;
                        if ( (LA35_53=='\'') ) {s = 86;}

                        else if ( (LA35_53=='\\') ) {s = 50;}

                        else if ( (LA35_53=='\r') ) {s = 51;}

                        else if ( (LA35_53=='\n') ) {s = 52;}

                        else if ( ((LA35_53>='\u0000' && LA35_53<='\t')||(LA35_53>='\u000B' && LA35_53<='\f')||(LA35_53>='\u000E' && LA35_53<='&')||(LA35_53>='(' && LA35_53<='[')||(LA35_53>=']' && LA35_53<='\uFFFF')) ) {s = 53;}

                        else s = 27;

                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA35_127 = input.LA(1);

                        s = -1;
                        if ( (LA35_127=='\r') ) {s = 124;}

                        else if ( (LA35_127=='\n') ) {s = 125;}

                        else if ( ((LA35_127>='\u0000' && LA35_127<='\t')||(LA35_127>='\u000B' && LA35_127<='\f')||(LA35_127>='\u000E' && LA35_127<='\uFFFF')) ) {s = 127;}

                        else s = 123;

                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA35_203 = input.LA(1);

                        s = -1;
                        if ( ((LA35_203>='0' && LA35_203<='9')||(LA35_203>='A' && LA35_203<='Z')||LA35_203=='_'||(LA35_203>='a' && LA35_203<='z')) ) {s = 217;}

                        else if ( (LA35_203=='\r') ) {s = 218;}

                        else if ( (LA35_203=='\n') ) {s = 219;}

                        else if ( ((LA35_203>='\u0000' && LA35_203<='\t')||(LA35_203>='\u000B' && LA35_203<='\f')||(LA35_203>='\u000E' && LA35_203<='/')||(LA35_203>=':' && LA35_203<='@')||(LA35_203>='[' && LA35_203<='^')||LA35_203=='`'||(LA35_203>='{' && LA35_203<='\uFFFF')) ) {s = 221;}

                        else s = 220;

                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA35_90 = input.LA(1);

                        s = -1;
                        if ( (LA35_90=='/') ) {s = 121;}

                        else if ( (LA35_90=='*') ) {s = 90;}

                        else if ( (LA35_90=='\r') ) {s = 91;}

                        else if ( (LA35_90=='\n') ) {s = 92;}

                        else if ( ((LA35_90>='\u0000' && LA35_90<='\t')||(LA35_90>='\u000B' && LA35_90<='\f')||(LA35_90>='\u000E' && LA35_90<=')')||(LA35_90>='+' && LA35_90<='.')||(LA35_90>='0' && LA35_90<='\uFFFF')) ) {s = 93;}

                        else s = 27;

                        if ( s>=0 ) return s;
                        break;
                    case 9 : 
                        int LA35_14 = input.LA(1);

                        s = -1;
                        if ( (LA35_14=='\"') ) {s = 44;}

                        else if ( (LA35_14=='\\') ) {s = 45;}

                        else if ( (LA35_14=='\r') ) {s = 46;}

                        else if ( (LA35_14=='\n') ) {s = 47;}

                        else if ( ((LA35_14>='\u0000' && LA35_14<='\t')||(LA35_14>='\u000B' && LA35_14<='\f')||(LA35_14>='\u000E' && LA35_14<='!')||(LA35_14>='#' && LA35_14<='[')||(LA35_14>=']' && LA35_14<='\uFFFF')) ) {s = 48;}

                        else s = 27;

                        if ( s>=0 ) return s;
                        break;
                    case 10 : 
                        int LA35_168 = input.LA(1);

                        s = -1;
                        if ( (LA35_168=='\'') ) {s = 168;}

                        else if ( (LA35_168=='\r') ) {s = 118;}

                        else if ( (LA35_168=='\n') ) {s = 119;}

                        else if ( ((LA35_168>='\u0000' && LA35_168<='\t')||(LA35_168>='\u000B' && LA35_168<='\f')||(LA35_168>='\u000E' && LA35_168<='&')||(LA35_168>='(' && LA35_168<='\uFFFF')) ) {s = 120;}

                        else s = 148;

                        if ( s>=0 ) return s;
                        break;
                    case 11 : 
                        int LA35_201 = input.LA(1);

                        s = -1;
                        if ( ((LA35_201>='\u0000' && LA35_201<='\t')||(LA35_201>='\u000B' && LA35_201<='\f')||(LA35_201>='\u000E' && LA35_201<='\uFFFF')) ) {s = 212;}

                        else if ( (LA35_201=='\r') ) {s = 213;}

                        else if ( (LA35_201=='\n') ) {s = 214;}

                        else s = 215;

                        if ( s>=0 ) return s;
                        break;
                    case 12 : 
                        int LA35_224 = input.LA(1);

                        s = -1;
                        if ( (LA35_224=='\r') ) {s = 225;}

                        else if ( (LA35_224=='\n') ) {s = 226;}

                        else if ( ((LA35_224>='\u0000' && LA35_224<='\t')||(LA35_224>='\u000B' && LA35_224<='\f')||(LA35_224>='\u000E' && LA35_224<='\uFFFF')) ) {s = 224;}

                        else s = 227;

                        if ( s>=0 ) return s;
                        break;
                    case 13 : 
                        int LA35_118 = input.LA(1);

                        s = -1;
                        if ( ((LA35_118>='\u0000' && LA35_118<='\t')||(LA35_118>='\u000B' && LA35_118<='\uFFFF')) ) {s = 148;}

                        else if ( (LA35_118=='\n') ) {s = 119;}

                        else s = 27;

                        if ( s>=0 ) return s;
                        break;
                    case 14 : 
                        int LA35_91 = input.LA(1);

                        s = -1;
                        if ( (LA35_91=='\n') ) {s = 92;}

                        else if ( ((LA35_91>='\u0000' && LA35_91<='\t')||(LA35_91>='\u000B' && LA35_91<='\uFFFF')) ) {s = 122;}

                        else s = 27;

                        if ( s>=0 ) return s;
                        break;
                    case 15 : 
                        int LA35_207 = input.LA(1);

                        s = -1;
                        if ( (LA35_207=='\r') ) {s = 190;}

                        else if ( (LA35_207=='\n') ) {s = 191;}

                        else if ( ((LA35_207>='\u0000' && LA35_207<='\t')||(LA35_207>='\u000B' && LA35_207<='\f')||(LA35_207>='\u000E' && LA35_207<='\uFFFF')) ) {s = 189;}

                        else s = 192;

                        if ( s>=0 ) return s;
                        break;
                    case 16 : 
                        int LA35_223 = input.LA(1);

                        s = -1;
                        if ( ((LA35_223>='\u0000' && LA35_223<='\t')||(LA35_223>='\u000B' && LA35_223<='\f')||(LA35_223>='\u000E' && LA35_223<='\uFFFF')) ) {s = 232;}

                        else if ( (LA35_223=='\r') ) {s = 233;}

                        else if ( (LA35_223=='\n') ) {s = 234;}

                        else s = 235;

                        if ( s>=0 ) return s;
                        break;
                    case 17 : 
                        int LA35_181 = input.LA(1);

                        s = -1;
                        if ( ((LA35_181>='\u0000' && LA35_181<='\t')||(LA35_181>='\u000B' && LA35_181<='\f')||(LA35_181>='\u000E' && LA35_181<='\uFFFF')) ) {s = 189;}

                        else if ( (LA35_181=='\r') ) {s = 190;}

                        else if ( (LA35_181=='\n') ) {s = 191;}

                        else s = 192;

                        if ( s>=0 ) return s;
                        break;
                    case 18 : 
                        int LA35_60 = input.LA(1);

                        s = -1;
                        if ( (LA35_60=='*') ) {s = 90;}

                        else if ( (LA35_60=='\r') ) {s = 91;}

                        else if ( (LA35_60=='\n') ) {s = 92;}

                        else if ( ((LA35_60>='\u0000' && LA35_60<='\t')||(LA35_60>='\u000B' && LA35_60<='\f')||(LA35_60>='\u000E' && LA35_60<=')')||(LA35_60>='+' && LA35_60<='\uFFFF')) ) {s = 93;}

                        else s = 27;

                        if ( s>=0 ) return s;
                        break;
                    case 19 : 
                        int LA35_83 = input.LA(1);

                        s = -1;
                        if ( (LA35_83=='\n') ) {s = 52;}

                        else if ( ((LA35_83>='\u0000' && LA35_83<='\t')||(LA35_83>='\u000B' && LA35_83<='\uFFFF')) ) {s = 80;}

                        else s = 27;

                        if ( s>=0 ) return s;
                        break;
                    case 20 : 
                        int LA35_97 = input.LA(1);

                        s = -1;
                        if ( (LA35_97=='\r') ) {s = 98;}

                        else if ( (LA35_97=='\n') ) {s = 99;}

                        else if ( ((LA35_97>='0' && LA35_97<='9')||(LA35_97>='A' && LA35_97<='Z')||LA35_97=='_'||(LA35_97>='a' && LA35_97<='z')) ) {s = 97;}

                        else if ( ((LA35_97>='\u0000' && LA35_97<='\t')||(LA35_97>='\u000B' && LA35_97<='\f')||(LA35_97>='\u000E' && LA35_97<='/')||(LA35_97>=':' && LA35_97<='@')||(LA35_97>='[' && LA35_97<='^')||LA35_97=='`'||(LA35_97>='{' && LA35_97<='\uFFFF')) ) {s = 101;}

                        else s = 100;

                        if ( s>=0 ) return s;
                        break;
                    case 21 : 
                        int LA35_51 = input.LA(1);

                        s = -1;
                        if ( ((LA35_51>='\u0000' && LA35_51<='\t')||(LA35_51>='\u000B' && LA35_51<='\uFFFF')) ) {s = 80;}

                        else if ( (LA35_51=='\n') ) {s = 52;}

                        else s = 27;

                        if ( s>=0 ) return s;
                        break;
                    case 22 : 
                        int LA35_158 = input.LA(1);

                        s = -1;
                        if ( (LA35_158=='\r') ) {s = 159;}

                        else if ( (LA35_158=='\n') ) {s = 160;}

                        else if ( ((LA35_158>='\u0000' && LA35_158<='\t')||(LA35_158>='\u000B' && LA35_158<='\f')||(LA35_158>='\u000E' && LA35_158<='\uFFFF')) ) {s = 158;}

                        else s = 161;

                        if ( s>=0 ) return s;
                        break;
                    case 23 : 
                        int LA35_144 = input.LA(1);

                        s = -1;
                        if ( ((LA35_144>='\u0000' && LA35_144<='\t')||(LA35_144>='\u000B' && LA35_144<='\f')||(LA35_144>='\u000E' && LA35_144<='\uFFFF')) ) {s = 158;}

                        else if ( (LA35_144=='\r') ) {s = 159;}

                        else if ( (LA35_144=='\n') ) {s = 160;}

                        else s = 161;

                        if ( s>=0 ) return s;
                        break;
                    case 24 : 
                        int LA35_0 = input.LA(1);

                        s = -1;
                        if ( (LA35_0=='F') ) {s = 1;}

                        else if ( (LA35_0=='M') ) {s = 2;}

                        else if ( (LA35_0=='R') ) {s = 3;}

                        else if ( (LA35_0=='E') ) {s = 4;}

                        else if ( (LA35_0=='N') ) {s = 5;}

                        else if ( (LA35_0=='I') ) {s = 6;}

                        else if ( (LA35_0=='A') ) {s = 7;}

                        else if ( (LA35_0=='S') ) {s = 8;}

                        else if ( (LA35_0=='B') ) {s = 9;}

                        else if ( (LA35_0=='W') ) {s = 10;}

                        else if ( (LA35_0=='T') ) {s = 11;}

                        else if ( (LA35_0=='G') ) {s = 12;}

                        else if ( (LA35_0=='|') ) {s = 13;}

                        else if ( (LA35_0=='\"') ) {s = 14;}

                        else if ( (LA35_0=='\'') ) {s = 15;}

                        else if ( (LA35_0=='@') ) {s = 16;}

                        else if ( (LA35_0=='#') ) {s = 17;}

                        else if ( (LA35_0=='^') ) {s = 18;}

                        else if ( ((LA35_0>='\t' && LA35_0<='\n')||LA35_0=='\r'||LA35_0==' ') ) {s = 19;}

                        else if ( ((LA35_0>='C' && LA35_0<='D')||LA35_0=='H'||(LA35_0>='J' && LA35_0<='L')||(LA35_0>='O' && LA35_0<='Q')||(LA35_0>='U' && LA35_0<='V')||(LA35_0>='X' && LA35_0<='Z')||LA35_0=='_'||(LA35_0>='a' && LA35_0<='z')) ) {s = 20;}

                        else if ( ((LA35_0>='0' && LA35_0<='9')) ) {s = 21;}

                        else if ( (LA35_0=='/') ) {s = 22;}

                        else if ( ((LA35_0>='\u0000' && LA35_0<='\b')||(LA35_0>='\u000B' && LA35_0<='\f')||(LA35_0>='\u000E' && LA35_0<='\u001F')||LA35_0=='!'||(LA35_0>='$' && LA35_0<='&')||(LA35_0>='(' && LA35_0<='.')||(LA35_0>=':' && LA35_0<='?')||(LA35_0>='[' && LA35_0<=']')||LA35_0=='`'||LA35_0=='{'||(LA35_0>='}' && LA35_0<='\uFFFF')) ) {s = 23;}

                        if ( s>=0 ) return s;
                        break;
                    case 25 : 
                        int LA35_16 = input.LA(1);

                        s = -1;
                        if ( ((LA35_16>='\u0000' && LA35_16<='\t')||(LA35_16>='\u000B' && LA35_16<='\f')||(LA35_16>='\u000E' && LA35_16<='\uFFFF')) ) {s = 55;}

                        else s = 54;

                        if ( s>=0 ) return s;
                        break;
                    case 26 : 
                        int LA35_221 = input.LA(1);

                        s = -1;
                        if ( (LA35_221=='\r') ) {s = 218;}

                        else if ( (LA35_221=='\n') ) {s = 219;}

                        else if ( ((LA35_221>='\u0000' && LA35_221<='\t')||(LA35_221>='\u000B' && LA35_221<='\f')||(LA35_221>='\u000E' && LA35_221<='\uFFFF')) ) {s = 221;}

                        else s = 220;

                        if ( s>=0 ) return s;
                        break;
                    case 27 : 
                        int LA35_64 = input.LA(1);

                        s = -1;
                        if ( ((LA35_64>='0' && LA35_64<='9')||(LA35_64>='A' && LA35_64<='Z')||LA35_64=='_'||(LA35_64>='a' && LA35_64<='z')) ) {s = 97;}

                        else if ( (LA35_64=='\r') ) {s = 98;}

                        else if ( (LA35_64=='\n') ) {s = 99;}

                        else if ( ((LA35_64>='\u0000' && LA35_64<='\t')||(LA35_64>='\u000B' && LA35_64<='\f')||(LA35_64>='\u000E' && LA35_64<='/')||(LA35_64>=':' && LA35_64<='@')||(LA35_64>='[' && LA35_64<='^')||LA35_64=='`'||(LA35_64>='{' && LA35_64<='\uFFFF')) ) {s = 101;}

                        else s = 100;

                        if ( s>=0 ) return s;
                        break;
                    case 28 : 
                        int LA35_13 = input.LA(1);

                        s = -1;
                        if ( (LA35_13=='\t'||LA35_13==' ') ) {s = 41;}

                        else if ( ((LA35_13>='\u0000' && LA35_13<='\b')||(LA35_13>='\u000B' && LA35_13<='\f')||(LA35_13>='\u000E' && LA35_13<='\u001F')||(LA35_13>='!' && LA35_13<='{')||(LA35_13>='}' && LA35_13<='\uFFFF')) ) {s = 43;}

                        else s = 42;

                        if ( s>=0 ) return s;
                        break;
                    case 29 : 
                        int LA35_212 = input.LA(1);

                        s = -1;
                        if ( (LA35_212=='\r') ) {s = 213;}

                        else if ( (LA35_212=='\n') ) {s = 214;}

                        else if ( ((LA35_212>='\u0000' && LA35_212<='\t')||(LA35_212>='\u000B' && LA35_212<='\f')||(LA35_212>='\u000E' && LA35_212<='\uFFFF')) ) {s = 212;}

                        else s = 215;

                        if ( s>=0 ) return s;
                        break;
                    case 30 : 
                        int LA35_17 = input.LA(1);

                        s = -1;
                        if ( ((LA35_17>='\u0000' && LA35_17<='\t')||(LA35_17>='\u000B' && LA35_17<='\f')||(LA35_17>='\u000E' && LA35_17<='\uFFFF')) ) {s = 56;}

                        else s = 27;

                        if ( s>=0 ) return s;
                        break;
                    case 31 : 
                        int LA35_189 = input.LA(1);

                        s = -1;
                        if ( (LA35_189=='\r') ) {s = 190;}

                        else if ( (LA35_189=='\n') ) {s = 191;}

                        else if ( ((LA35_189>='\u0000' && LA35_189<='\t')||(LA35_189>='\u000B' && LA35_189<='\f')||(LA35_189>='\u000E' && LA35_189<='\uFFFF')) ) {s = 189;}

                        else s = 192;

                        if ( s>=0 ) return s;
                        break;
                    case 32 : 
                        int LA35_41 = input.LA(1);

                        s = -1;
                        if ( (LA35_41=='\t'||LA35_41==' ') ) {s = 41;}

                        else if ( ((LA35_41>='\u0000' && LA35_41<='\b')||(LA35_41>='\u000B' && LA35_41<='\f')||(LA35_41>='\u000E' && LA35_41<='\u001F')||(LA35_41>='!' && LA35_41<='{')||(LA35_41>='}' && LA35_41<='\uFFFF')) ) {s = 43;}

                        else s = 42;

                        if ( s>=0 ) return s;
                        break;
                    case 33 : 
                        int LA35_106 = input.LA(1);

                        s = -1;
                        if ( ((LA35_106>='\u0000' && LA35_106<='\t')||(LA35_106>='\u000B' && LA35_106<='\f')||(LA35_106>='\u000E' && LA35_106<='\uFFFF')) ) {s = 134;}

                        else if ( (LA35_106=='\r') ) {s = 135;}

                        else if ( (LA35_106=='\n') ) {s = 136;}

                        else s = 137;

                        if ( s>=0 ) return s;
                        break;
                    case 34 : 
                        int LA35_15 = input.LA(1);

                        s = -1;
                        if ( (LA35_15=='\'') ) {s = 49;}

                        else if ( (LA35_15=='\\') ) {s = 50;}

                        else if ( (LA35_15=='\r') ) {s = 51;}

                        else if ( (LA35_15=='\n') ) {s = 52;}

                        else if ( ((LA35_15>='\u0000' && LA35_15<='\t')||(LA35_15>='\u000B' && LA35_15<='\f')||(LA35_15>='\u000E' && LA35_15<='&')||(LA35_15>='(' && LA35_15<='[')||(LA35_15>=']' && LA35_15<='\uFFFF')) ) {s = 53;}

                        else s = 27;

                        if ( s>=0 ) return s;
                        break;
                    case 35 : 
                        int LA35_162 = input.LA(1);

                        s = -1;
                        if ( (LA35_162=='\r') ) {s = 163;}

                        else if ( (LA35_162=='\n') ) {s = 164;}

                        else if ( ((LA35_162>='\u0000' && LA35_162<='\t')||(LA35_162>='\u000B' && LA35_162<='\f')||(LA35_162>='\u000E' && LA35_162<='\uFFFF')) ) {s = 162;}

                        else s = 165;

                        if ( s>=0 ) return s;
                        break;
                    case 36 : 
                        int LA35_101 = input.LA(1);

                        s = -1;
                        if ( (LA35_101=='\r') ) {s = 98;}

                        else if ( (LA35_101=='\n') ) {s = 99;}

                        else if ( ((LA35_101>='\u0000' && LA35_101<='\t')||(LA35_101>='\u000B' && LA35_101<='\f')||(LA35_101>='\u000E' && LA35_101<='\uFFFF')) ) {s = 101;}

                        else s = 100;

                        if ( s>=0 ) return s;
                        break;
                    case 37 : 
                        int LA35_76 = input.LA(1);

                        s = -1;
                        if ( (LA35_76=='\"') ) {s = 113;}

                        else if ( (LA35_76=='\r') ) {s = 114;}

                        else if ( (LA35_76=='\n') ) {s = 115;}

                        else if ( ((LA35_76>='\u0000' && LA35_76<='\t')||(LA35_76>='\u000B' && LA35_76<='\f')||(LA35_76>='\u000E' && LA35_76<='!')||(LA35_76>='#' && LA35_76<='\uFFFF')) ) {s = 116;}

                        else s = 27;

                        if ( s>=0 ) return s;
                        break;
                    case 38 : 
                        int LA35_145 = input.LA(1);

                        s = -1;
                        if ( ((LA35_145>='\u0000' && LA35_145<='\t')||(LA35_145>='\u000B' && LA35_145<='\f')||(LA35_145>='\u000E' && LA35_145<='\uFFFF')) ) {s = 162;}

                        else if ( (LA35_145=='\r') ) {s = 163;}

                        else if ( (LA35_145=='\n') ) {s = 164;}

                        else s = 165;

                        if ( s>=0 ) return s;
                        break;
                    case 39 : 
                        int LA35_147 = input.LA(1);

                        s = -1;
                        if ( (LA35_147=='\"') ) {s = 167;}

                        else if ( (LA35_147=='\r') ) {s = 114;}

                        else if ( (LA35_147=='\n') ) {s = 115;}

                        else if ( ((LA35_147>='\u0000' && LA35_147<='\t')||(LA35_147>='\u000B' && LA35_147<='\f')||(LA35_147>='\u000E' && LA35_147<='!')||(LA35_147>='#' && LA35_147<='\uFFFF')) ) {s = 116;}

                        else s = 27;

                        if ( s>=0 ) return s;
                        break;
                    case 40 : 
                        int LA35_45 = input.LA(1);

                        s = -1;
                        if ( (LA35_45=='\r') ) {s = 77;}

                        else if ( (LA35_45=='\n') ) {s = 78;}

                        else if ( ((LA35_45>='\u0000' && LA35_45<='\t')||(LA35_45>='\u000B' && LA35_45<='\f')||(LA35_45>='\u000E' && LA35_45<='\uFFFF')) ) {s = 79;}

                        else s = 27;

                        if ( s>=0 ) return s;
                        break;
                    case 41 : 
                        int LA35_50 = input.LA(1);

                        s = -1;
                        if ( (LA35_50=='\r') ) {s = 83;}

                        else if ( (LA35_50=='\n') ) {s = 84;}

                        else if ( ((LA35_50>='\u0000' && LA35_50<='\t')||(LA35_50>='\u000B' && LA35_50<='\f')||(LA35_50>='\u000E' && LA35_50<='\uFFFF')) ) {s = 85;}

                        else s = 27;

                        if ( s>=0 ) return s;
                        break;
                    case 42 : 
                        int LA35_250 = input.LA(1);

                        s = -1;
                        if ( ((LA35_250>='\u0000' && LA35_250<='\t')||(LA35_250>='\u000B' && LA35_250<='\f')||(LA35_250>='\u000E' && LA35_250<='\uFFFF')) ) {s = 251;}

                        else if ( (LA35_250=='\r') ) {s = 252;}

                        else if ( (LA35_250=='\n') ) {s = 253;}

                        else s = 254;

                        if ( s>=0 ) return s;
                        break;
                    case 43 : 
                        int LA35_78 = input.LA(1);

                        s = -1;
                        if ( ((LA35_78>='\u0000' && LA35_78<='\uFFFF')) ) {s = 80;}

                        else s = 27;

                        if ( s>=0 ) return s;
                        break;
                    case 44 : 
                        int LA35_47 = input.LA(1);

                        s = -1;
                        if ( ((LA35_47>='\u0000' && LA35_47<='\uFFFF')) ) {s = 80;}

                        else s = 27;

                        if ( s>=0 ) return s;
                        break;
                    case 45 : 
                        int LA35_177 = input.LA(1);

                        s = -1;
                        if ( (LA35_177=='\r') ) {s = 178;}

                        else if ( (LA35_177=='\n') ) {s = 179;}

                        else if ( ((LA35_177>='\u0000' && LA35_177<='\t')||(LA35_177>='\u000B' && LA35_177<='\f')||(LA35_177>='\u000E' && LA35_177<='\uFFFF')) ) {s = 177;}

                        else s = 180;

                        if ( s>=0 ) return s;
                        break;
                    case 46 : 
                        int LA35_232 = input.LA(1);

                        s = -1;
                        if ( (LA35_232=='\r') ) {s = 233;}

                        else if ( (LA35_232=='\n') ) {s = 234;}

                        else if ( ((LA35_232>='\u0000' && LA35_232<='\t')||(LA35_232>='\u000B' && LA35_232<='\f')||(LA35_232>='\u000E' && LA35_232<='\uFFFF')) ) {s = 232;}

                        else s = 235;

                        if ( s>=0 ) return s;
                        break;
                    case 47 : 
                        int LA35_82 = input.LA(1);

                        s = -1;
                        if ( (LA35_82=='\'') ) {s = 117;}

                        else if ( (LA35_82=='\r') ) {s = 118;}

                        else if ( (LA35_82=='\n') ) {s = 119;}

                        else if ( ((LA35_82>='\u0000' && LA35_82<='\t')||(LA35_82>='\u000B' && LA35_82<='\f')||(LA35_82>='\u000E' && LA35_82<='&')||(LA35_82>='(' && LA35_82<='\uFFFF')) ) {s = 120;}

                        else s = 27;

                        if ( s>=0 ) return s;
                        break;
                    case 48 : 
                        int LA35_113 = input.LA(1);

                        s = -1;
                        if ( (LA35_113=='\"') ) {s = 147;}

                        else if ( (LA35_113=='\r') ) {s = 114;}

                        else if ( (LA35_113=='\n') ) {s = 115;}

                        else if ( ((LA35_113>='\u0000' && LA35_113<='\t')||(LA35_113>='\u000B' && LA35_113<='\f')||(LA35_113>='\u000E' && LA35_113<='!')||(LA35_113>='#' && LA35_113<='\uFFFF')) ) {s = 116;}

                        else s = 27;

                        if ( s>=0 ) return s;
                        break;
                    case 49 : 
                        int LA35_149 = input.LA(1);

                        s = -1;
                        if ( (LA35_149=='\'') ) {s = 168;}

                        else if ( (LA35_149=='\r') ) {s = 118;}

                        else if ( (LA35_149=='\n') ) {s = 119;}

                        else if ( ((LA35_149>='\u0000' && LA35_149<='\t')||(LA35_149>='\u000B' && LA35_149<='\f')||(LA35_149>='\u000E' && LA35_149<='&')||(LA35_149>='(' && LA35_149<='\uFFFF')) ) {s = 120;}

                        else s = 27;

                        if ( s>=0 ) return s;
                        break;
                    case 50 : 
                        int LA35_115 = input.LA(1);

                        s = -1;
                        if ( ((LA35_115>='\u0000' && LA35_115<='\uFFFF')) ) {s = 148;}

                        else s = 27;

                        if ( s>=0 ) return s;
                        break;
                    case 51 : 
                        int LA35_251 = input.LA(1);

                        s = -1;
                        if ( (LA35_251=='\r') ) {s = 252;}

                        else if ( (LA35_251=='\n') ) {s = 253;}

                        else if ( ((LA35_251>='\u0000' && LA35_251<='\t')||(LA35_251>='\u000B' && LA35_251<='\f')||(LA35_251>='\u000E' && LA35_251<='\uFFFF')) ) {s = 251;}

                        else s = 254;

                        if ( s>=0 ) return s;
                        break;
                    case 52 : 
                        int LA35_209 = input.LA(1);

                        s = -1;
                        if ( ((LA35_209>='\u0000' && LA35_209<='\t')||(LA35_209>='\u000B' && LA35_209<='\f')||(LA35_209>='\u000E' && LA35_209<='\uFFFF')) ) {s = 224;}

                        else if ( (LA35_209=='\r') ) {s = 225;}

                        else if ( (LA35_209=='\n') ) {s = 226;}

                        else s = 227;

                        if ( s>=0 ) return s;
                        break;
                    case 53 : 
                        int LA35_94 = input.LA(1);

                        s = -1;
                        if ( (LA35_94=='\r') ) {s = 124;}

                        else if ( (LA35_94=='\n') ) {s = 125;}

                        else if ( ((LA35_94>='0' && LA35_94<='9')||(LA35_94>='A' && LA35_94<='Z')||LA35_94=='_'||(LA35_94>='a' && LA35_94<='z')) ) {s = 126;}

                        else if ( ((LA35_94>='\u0000' && LA35_94<='\t')||(LA35_94>='\u000B' && LA35_94<='\f')||(LA35_94>='\u000E' && LA35_94<='/')||(LA35_94>=':' && LA35_94<='@')||(LA35_94>='[' && LA35_94<='^')||LA35_94=='`'||(LA35_94>='{' && LA35_94<='\uFFFF')) ) {s = 127;}

                        else s = 123;

                        if ( s>=0 ) return s;
                        break;
                    case 54 : 
                        int LA35_79 = input.LA(1);

                        s = -1;
                        if ( (LA35_79=='\"') ) {s = 81;}

                        else if ( (LA35_79=='\\') ) {s = 45;}

                        else if ( (LA35_79=='\r') ) {s = 46;}

                        else if ( (LA35_79=='\n') ) {s = 47;}

                        else if ( ((LA35_79>='\u0000' && LA35_79<='\t')||(LA35_79>='\u000B' && LA35_79<='\f')||(LA35_79>='\u000E' && LA35_79<='!')||(LA35_79>='#' && LA35_79<='[')||(LA35_79>=']' && LA35_79<='\uFFFF')) ) {s = 48;}

                        else s = 27;

                        if ( s>=0 ) return s;
                        break;
                    case 55 : 
                        int LA35_126 = input.LA(1);

                        s = -1;
                        if ( (LA35_126=='\r') ) {s = 124;}

                        else if ( (LA35_126=='\n') ) {s = 125;}

                        else if ( ((LA35_126>='0' && LA35_126<='9')||(LA35_126>='A' && LA35_126<='Z')||LA35_126=='_'||(LA35_126>='a' && LA35_126<='z')) ) {s = 126;}

                        else if ( ((LA35_126>='\u0000' && LA35_126<='\t')||(LA35_126>='\u000B' && LA35_126<='\f')||(LA35_126>='\u000E' && LA35_126<='/')||(LA35_126>=':' && LA35_126<='@')||(LA35_126>='[' && LA35_126<='^')||LA35_126=='`'||(LA35_126>='{' && LA35_126<='\uFFFF')) ) {s = 127;}

                        else s = 123;

                        if ( s>=0 ) return s;
                        break;
                    case 56 : 
                        int LA35_48 = input.LA(1);

                        s = -1;
                        if ( (LA35_48=='\r') ) {s = 46;}

                        else if ( (LA35_48=='\n') ) {s = 47;}

                        else if ( (LA35_48=='\"') ) {s = 81;}

                        else if ( (LA35_48=='\\') ) {s = 45;}

                        else if ( ((LA35_48>='\u0000' && LA35_48<='\t')||(LA35_48>='\u000B' && LA35_48<='\f')||(LA35_48>='\u000E' && LA35_48<='!')||(LA35_48>='#' && LA35_48<='[')||(LA35_48>=']' && LA35_48<='\uFFFF')) ) {s = 48;}

                        else s = 27;

                        if ( s>=0 ) return s;
                        break;
                    case 57 : 
                        int LA35_166 = input.LA(1);

                        s = -1;
                        if ( ((LA35_166>='\u0000' && LA35_166<='\t')||(LA35_166>='\u000B' && LA35_166<='\f')||(LA35_166>='\u000E' && LA35_166<='\uFFFF')) ) {s = 177;}

                        else if ( (LA35_166=='\r') ) {s = 178;}

                        else if ( (LA35_166=='\n') ) {s = 179;}

                        else s = 180;

                        if ( s>=0 ) return s;
                        break;
                    case 58 : 
                        int LA35_117 = input.LA(1);

                        s = -1;
                        if ( (LA35_117=='\'') ) {s = 149;}

                        else if ( (LA35_117=='\r') ) {s = 118;}

                        else if ( (LA35_117=='\n') ) {s = 119;}

                        else if ( ((LA35_117>='\u0000' && LA35_117<='\t')||(LA35_117>='\u000B' && LA35_117<='\f')||(LA35_117>='\u000E' && LA35_117<='&')||(LA35_117>='(' && LA35_117<='\uFFFF')) ) {s = 120;}

                        else s = 27;

                        if ( s>=0 ) return s;
                        break;
                    case 59 : 
                        int LA35_119 = input.LA(1);

                        s = -1;
                        if ( ((LA35_119>='\u0000' && LA35_119<='\uFFFF')) ) {s = 148;}

                        else s = 27;

                        if ( s>=0 ) return s;
                        break;
                    case 60 : 
                        int LA35_56 = input.LA(1);

                        s = -1;
                        if ( (LA35_56=='\r') ) {s = 88;}

                        else if ( (LA35_56=='\n') ) {s = 89;}

                        else if ( ((LA35_56>='\u0000' && LA35_56<='\t')||(LA35_56>='\u000B' && LA35_56<='\f')||(LA35_56>='\u000E' && LA35_56<='\uFFFF')) ) {s = 56;}

                        else s = 87;

                        if ( s>=0 ) return s;
                        break;
                    case 61 : 
                        int LA35_116 = input.LA(1);

                        s = -1;
                        if ( (LA35_116=='\"') ) {s = 113;}

                        else if ( (LA35_116=='\r') ) {s = 114;}

                        else if ( (LA35_116=='\n') ) {s = 115;}

                        else if ( ((LA35_116>='\u0000' && LA35_116<='\t')||(LA35_116>='\u000B' && LA35_116<='\f')||(LA35_116>='\u000E' && LA35_116<='!')||(LA35_116>='#' && LA35_116<='\uFFFF')) ) {s = 116;}

                        else s = 27;

                        if ( s>=0 ) return s;
                        break;
                    case 62 : 
                        int LA35_92 = input.LA(1);

                        s = -1;
                        if ( ((LA35_92>='\u0000' && LA35_92<='\uFFFF')) ) {s = 122;}

                        else s = 27;

                        if ( s>=0 ) return s;
                        break;
                    case 63 : 
                        int LA35_138 = input.LA(1);

                        s = -1;
                        if ( (LA35_138=='\r') ) {s = 139;}

                        else if ( (LA35_138=='\n') ) {s = 140;}

                        else if ( ((LA35_138>='\u0000' && LA35_138<='\t')||(LA35_138>='\u000B' && LA35_138<='\f')||(LA35_138>='\u000E' && LA35_138<='\uFFFF')) ) {s = 138;}

                        else s = 141;

                        if ( s>=0 ) return s;
                        break;
                    case 64 : 
                        int LA35_134 = input.LA(1);

                        s = -1;
                        if ( (LA35_134=='\r') ) {s = 135;}

                        else if ( (LA35_134=='\n') ) {s = 136;}

                        else if ( ((LA35_134>='\u0000' && LA35_134<='\t')||(LA35_134>='\u000B' && LA35_134<='\f')||(LA35_134>='\u000E' && LA35_134<='\uFFFF')) ) {s = 134;}

                        else s = 137;

                        if ( s>=0 ) return s;
                        break;
                    case 65 : 
                        int LA35_121 = input.LA(1);

                        s = -1;
                        if ( (LA35_121=='*') ) {s = 90;}

                        else if ( (LA35_121=='\r') ) {s = 91;}

                        else if ( (LA35_121=='\n') ) {s = 92;}

                        else if ( ((LA35_121>='\u0000' && LA35_121<='\t')||(LA35_121>='\u000B' && LA35_121<='\f')||(LA35_121>='\u000E' && LA35_121<=')')||(LA35_121>='+' && LA35_121<='\uFFFF')) ) {s = 93;}

                        else s = 27;

                        if ( s>=0 ) return s;
                        break;
                    case 66 : 
                        int LA35_84 = input.LA(1);

                        s = -1;
                        if ( ((LA35_84>='\u0000' && LA35_84<='\uFFFF')) ) {s = 80;}

                        else s = 27;

                        if ( s>=0 ) return s;
                        break;
                    case 67 : 
                        int LA35_167 = input.LA(1);

                        s = -1;
                        if ( (LA35_167=='\"') ) {s = 167;}

                        else if ( (LA35_167=='\r') ) {s = 114;}

                        else if ( (LA35_167=='\n') ) {s = 115;}

                        else if ( ((LA35_167>='\u0000' && LA35_167<='\t')||(LA35_167>='\u000B' && LA35_167<='\f')||(LA35_167>='\u000E' && LA35_167<='!')||(LA35_167>='#' && LA35_167<='\uFFFF')) ) {s = 116;}

                        else s = 148;

                        if ( s>=0 ) return s;
                        break;
                    case 68 : 
                        int LA35_52 = input.LA(1);

                        s = -1;
                        if ( ((LA35_52>='\u0000' && LA35_52<='\uFFFF')) ) {s = 80;}

                        else s = 27;

                        if ( s>=0 ) return s;
                        break;
                    case 69 : 
                        int LA35_77 = input.LA(1);

                        s = -1;
                        if ( (LA35_77=='\n') ) {s = 47;}

                        else if ( ((LA35_77>='\u0000' && LA35_77<='\t')||(LA35_77>='\u000B' && LA35_77<='\uFFFF')) ) {s = 80;}

                        else s = 27;

                        if ( s>=0 ) return s;
                        break;
                    case 70 : 
                        int LA35_46 = input.LA(1);

                        s = -1;
                        if ( (LA35_46=='\n') ) {s = 47;}

                        else if ( ((LA35_46>='\u0000' && LA35_46<='\t')||(LA35_46>='\u000B' && LA35_46<='\uFFFF')) ) {s = 80;}

                        else s = 27;

                        if ( s>=0 ) return s;
                        break;
                    case 71 : 
                        int LA35_120 = input.LA(1);

                        s = -1;
                        if ( (LA35_120=='\'') ) {s = 117;}

                        else if ( (LA35_120=='\r') ) {s = 118;}

                        else if ( (LA35_120=='\n') ) {s = 119;}

                        else if ( ((LA35_120>='\u0000' && LA35_120<='\t')||(LA35_120>='\u000B' && LA35_120<='\f')||(LA35_120>='\u000E' && LA35_120<='&')||(LA35_120>='(' && LA35_120<='\uFFFF')) ) {s = 120;}

                        else s = 27;

                        if ( s>=0 ) return s;
                        break;
                    case 72 : 
                        int LA35_93 = input.LA(1);

                        s = -1;
                        if ( (LA35_93=='*') ) {s = 90;}

                        else if ( (LA35_93=='\r') ) {s = 91;}

                        else if ( (LA35_93=='\n') ) {s = 92;}

                        else if ( ((LA35_93>='\u0000' && LA35_93<='\t')||(LA35_93>='\u000B' && LA35_93<='\f')||(LA35_93>='\u000E' && LA35_93<=')')||(LA35_93>='+' && LA35_93<='\uFFFF')) ) {s = 93;}

                        else s = 27;

                        if ( s>=0 ) return s;
                        break;
                    case 73 : 
                        int LA35_231 = input.LA(1);

                        s = -1;
                        if ( ((LA35_231>='\u0000' && LA35_231<='\t')||(LA35_231>='\u000B' && LA35_231<='\f')||(LA35_231>='\u000E' && LA35_231<='\uFFFF')) ) {s = 238;}

                        else if ( (LA35_231=='\r') ) {s = 239;}

                        else if ( (LA35_231=='\n') ) {s = 240;}

                        else s = 241;

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 35, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

}