package com.holycityaudio.spincad.parser.antlr.internal; 

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import com.holycityaudio.spincad.services.SpinCADGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalSpinCADParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_SC_COMMENT", "RULE_ESCAPED_CHAR", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'@name'", "'@color'", "'@audioInput'", "'@audioOutput'", "'@controlInput'", "'@controlOutput'", "'equ'", "'int'", "'mem'", "'offset'", "'bool'", "'@sliderLabel'", "'@sliderLabelSpinner'", "'@sliderLabelCheckBox'", "'@checkbox'", "'@logFreqSliderLabel'", "'@logFreq2SliderLabel'", "'@spinRadioButton'", "'@comboBox'", "':'", "'@isPinConnected'", "'@isGreaterThan'", "'@isLessThan'", "'@isEqualTo'", "'@isTrue'", "'@else'", "'@endif'", "'@isOr'", "'@getInputDefault'", "'@getDelayScaleControl'", "'@readChorusTap'", "'@getSamplesFromRatio'", "'@semitonesToRmpRate'", "'@getBaseAddress'", "'@setOutputPin'", "'@minusDouble'", "'@divideDouble'", "'@equals'", "'@equalsBool'", "'@divideInt'", "'@multiplyDouble'", "'@setChorusWidth'", "'rdax'", "','", "'wrlx'", "'wrhx'", "'wrax'", "'maxx'", "'rdfx'", "'mulx'", "'ldax'", "'exp'", "'log'", "'sof'", "'wra'", "'wrap'", "'rda'", "'wlds'", "'wldr'", "'cho rda'", "'cho rdal'", "'cho sof'", "'rmpa'", "'and'", "'or'", "'xor'", "'jam'", "'clr'", "'not'", "'absa'", "'skp'", "'|'", "'-'", "'.'", "'*'", "'#'", "'^'", "'+'", "'%'", "'$'", "'true'", "'false'"
    };
    public static final int T__50=50;
    public static final int T__59=59;
    public static final int T__55=55;
    public static final int T__56=56;
    public static final int T__57=57;
    public static final int T__58=58;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int T__54=54;
    public static final int T__60=60;
    public static final int T__61=61;
    public static final int RULE_ID=4;
    public static final int RULE_INT=6;
    public static final int T__66=66;
    public static final int RULE_SC_COMMENT=7;
    public static final int RULE_ML_COMMENT=9;
    public static final int T__67=67;
    public static final int T__68=68;
    public static final int T__69=69;
    public static final int T__62=62;
    public static final int T__63=63;
    public static final int T__64=64;
    public static final int T__65=65;
    public static final int RULE_ESCAPED_CHAR=8;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__42=42;
    public static final int T__43=43;
    public static final int T__91=91;
    public static final int T__92=92;
    public static final int T__93=93;
    public static final int T__94=94;
    public static final int T__90=90;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;
    public static final int T__70=70;
    public static final int T__71=71;
    public static final int T__72=72;
    public static final int RULE_STRING=5;
    public static final int RULE_SL_COMMENT=10;
    public static final int T__77=77;
    public static final int T__78=78;
    public static final int T__79=79;
    public static final int T__73=73;
    public static final int EOF=-1;
    public static final int T__74=74;
    public static final int T__75=75;
    public static final int T__76=76;
    public static final int T__80=80;
    public static final int T__81=81;
    public static final int T__82=82;
    public static final int T__83=83;
    public static final int RULE_WS=11;
    public static final int RULE_ANY_OTHER=12;
    public static final int T__88=88;
    public static final int T__89=89;
    public static final int T__84=84;
    public static final int T__85=85;
    public static final int T__86=86;
    public static final int T__87=87;

    // delegates
    // delegators


        public InternalSpinCADParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalSpinCADParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalSpinCADParser.tokenNames; }
    public String getGrammarFileName() { return "InternalSpinCAD.g"; }



     	private SpinCADGrammarAccess grammarAccess;
     	
        public InternalSpinCADParser(TokenStream input, SpinCADGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "Program";	
       	}
       	
       	@Override
       	protected SpinCADGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start "entryRuleProgram"
    // InternalSpinCAD.g:67:1: entryRuleProgram returns [EObject current=null] : iv_ruleProgram= ruleProgram EOF ;
    public final EObject entryRuleProgram() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProgram = null;


        try {
            // InternalSpinCAD.g:68:2: (iv_ruleProgram= ruleProgram EOF )
            // InternalSpinCAD.g:69:2: iv_ruleProgram= ruleProgram EOF
            {
             newCompositeNode(grammarAccess.getProgramRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleProgram=ruleProgram();

            state._fsp--;

             current =iv_ruleProgram; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleProgram"


    // $ANTLR start "ruleProgram"
    // InternalSpinCAD.g:76:1: ruleProgram returns [EObject current=null] : (otherlv_0= '@name' ( ( (lv_name_1_1= RULE_ID | lv_name_1_2= RULE_STRING ) ) ) (otherlv_2= '@color' ( (lv_color_3_0= RULE_STRING ) ) )? ( (lv_pins_4_0= rulePin ) )+ ( (lv_elements_5_0= ruleSpinElement ) )+ ) ;
    public final EObject ruleProgram() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_1=null;
        Token lv_name_1_2=null;
        Token otherlv_2=null;
        Token lv_color_3_0=null;
        EObject lv_pins_4_0 = null;

        EObject lv_elements_5_0 = null;


         enterRule(); 
            
        try {
            // InternalSpinCAD.g:79:28: ( (otherlv_0= '@name' ( ( (lv_name_1_1= RULE_ID | lv_name_1_2= RULE_STRING ) ) ) (otherlv_2= '@color' ( (lv_color_3_0= RULE_STRING ) ) )? ( (lv_pins_4_0= rulePin ) )+ ( (lv_elements_5_0= ruleSpinElement ) )+ ) )
            // InternalSpinCAD.g:80:1: (otherlv_0= '@name' ( ( (lv_name_1_1= RULE_ID | lv_name_1_2= RULE_STRING ) ) ) (otherlv_2= '@color' ( (lv_color_3_0= RULE_STRING ) ) )? ( (lv_pins_4_0= rulePin ) )+ ( (lv_elements_5_0= ruleSpinElement ) )+ )
            {
            // InternalSpinCAD.g:80:1: (otherlv_0= '@name' ( ( (lv_name_1_1= RULE_ID | lv_name_1_2= RULE_STRING ) ) ) (otherlv_2= '@color' ( (lv_color_3_0= RULE_STRING ) ) )? ( (lv_pins_4_0= rulePin ) )+ ( (lv_elements_5_0= ruleSpinElement ) )+ )
            // InternalSpinCAD.g:80:3: otherlv_0= '@name' ( ( (lv_name_1_1= RULE_ID | lv_name_1_2= RULE_STRING ) ) ) (otherlv_2= '@color' ( (lv_color_3_0= RULE_STRING ) ) )? ( (lv_pins_4_0= rulePin ) )+ ( (lv_elements_5_0= ruleSpinElement ) )+
            {
            otherlv_0=(Token)match(input,13,FOLLOW_3); 

                	newLeafNode(otherlv_0, grammarAccess.getProgramAccess().getNameKeyword_0());
                
            // InternalSpinCAD.g:84:1: ( ( (lv_name_1_1= RULE_ID | lv_name_1_2= RULE_STRING ) ) )
            // InternalSpinCAD.g:85:1: ( (lv_name_1_1= RULE_ID | lv_name_1_2= RULE_STRING ) )
            {
            // InternalSpinCAD.g:85:1: ( (lv_name_1_1= RULE_ID | lv_name_1_2= RULE_STRING ) )
            // InternalSpinCAD.g:86:1: (lv_name_1_1= RULE_ID | lv_name_1_2= RULE_STRING )
            {
            // InternalSpinCAD.g:86:1: (lv_name_1_1= RULE_ID | lv_name_1_2= RULE_STRING )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==RULE_ID) ) {
                alt1=1;
            }
            else if ( (LA1_0==RULE_STRING) ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // InternalSpinCAD.g:87:3: lv_name_1_1= RULE_ID
                    {
                    lv_name_1_1=(Token)match(input,RULE_ID,FOLLOW_4); 

                    			newLeafNode(lv_name_1_1, grammarAccess.getProgramAccess().getNameIDTerminalRuleCall_1_0_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getProgramRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"name",
                            		lv_name_1_1, 
                            		"org.eclipse.xtext.common.Terminals.ID");
                    	    

                    }
                    break;
                case 2 :
                    // InternalSpinCAD.g:102:8: lv_name_1_2= RULE_STRING
                    {
                    lv_name_1_2=(Token)match(input,RULE_STRING,FOLLOW_4); 

                    			newLeafNode(lv_name_1_2, grammarAccess.getProgramAccess().getNameSTRINGTerminalRuleCall_1_0_1()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getProgramRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"name",
                            		lv_name_1_2, 
                            		"com.holycityaudio.spincad.SpinCAD.STRING");
                    	    

                    }
                    break;

            }


            }


            }

            // InternalSpinCAD.g:120:2: (otherlv_2= '@color' ( (lv_color_3_0= RULE_STRING ) ) )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==14) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // InternalSpinCAD.g:120:4: otherlv_2= '@color' ( (lv_color_3_0= RULE_STRING ) )
                    {
                    otherlv_2=(Token)match(input,14,FOLLOW_5); 

                        	newLeafNode(otherlv_2, grammarAccess.getProgramAccess().getColorKeyword_2_0());
                        
                    // InternalSpinCAD.g:124:1: ( (lv_color_3_0= RULE_STRING ) )
                    // InternalSpinCAD.g:125:1: (lv_color_3_0= RULE_STRING )
                    {
                    // InternalSpinCAD.g:125:1: (lv_color_3_0= RULE_STRING )
                    // InternalSpinCAD.g:126:3: lv_color_3_0= RULE_STRING
                    {
                    lv_color_3_0=(Token)match(input,RULE_STRING,FOLLOW_4); 

                    			newLeafNode(lv_color_3_0, grammarAccess.getProgramAccess().getColorSTRINGTerminalRuleCall_2_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getProgramRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"color",
                            		lv_color_3_0, 
                            		"com.holycityaudio.spincad.SpinCAD.STRING");
                    	    

                    }


                    }


                    }
                    break;

            }

            // InternalSpinCAD.g:142:4: ( (lv_pins_4_0= rulePin ) )+
            int cnt3=0;
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( ((LA3_0>=15 && LA3_0<=18)) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalSpinCAD.g:143:1: (lv_pins_4_0= rulePin )
            	    {
            	    // InternalSpinCAD.g:143:1: (lv_pins_4_0= rulePin )
            	    // InternalSpinCAD.g:144:3: lv_pins_4_0= rulePin
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getProgramAccess().getPinsPinParserRuleCall_3_0()); 
            	    	    
            	    pushFollow(FOLLOW_6);
            	    lv_pins_4_0=rulePin();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getProgramRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"pins",
            	            		lv_pins_4_0, 
            	            		"com.holycityaudio.spincad.SpinCAD.Pin");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt3 >= 1 ) break loop3;
                        EarlyExitException eee =
                            new EarlyExitException(3, input);
                        throw eee;
                }
                cnt3++;
            } while (true);

            // InternalSpinCAD.g:160:3: ( (lv_elements_5_0= ruleSpinElement ) )+
            int cnt4=0;
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==RULE_ID||LA4_0==RULE_SC_COMMENT||(LA4_0>=19 && LA4_0<=31)||(LA4_0>=33 && LA4_0<=55)||(LA4_0>=57 && LA4_0<=83)) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalSpinCAD.g:161:1: (lv_elements_5_0= ruleSpinElement )
            	    {
            	    // InternalSpinCAD.g:161:1: (lv_elements_5_0= ruleSpinElement )
            	    // InternalSpinCAD.g:162:3: lv_elements_5_0= ruleSpinElement
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getProgramAccess().getElementsSpinElementParserRuleCall_4_0()); 
            	    	    
            	    pushFollow(FOLLOW_7);
            	    lv_elements_5_0=ruleSpinElement();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getProgramRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"elements",
            	            		lv_elements_5_0, 
            	            		"com.holycityaudio.spincad.SpinCAD.SpinElement");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt4 >= 1 ) break loop4;
                        EarlyExitException eee =
                            new EarlyExitException(4, input);
                        throw eee;
                }
                cnt4++;
            } while (true);


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
    // $ANTLR end "ruleProgram"


    // $ANTLR start "entryRulePin"
    // InternalSpinCAD.g:186:1: entryRulePin returns [EObject current=null] : iv_rulePin= rulePin EOF ;
    public final EObject entryRulePin() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePin = null;


        try {
            // InternalSpinCAD.g:187:2: (iv_rulePin= rulePin EOF )
            // InternalSpinCAD.g:188:2: iv_rulePin= rulePin EOF
            {
             newCompositeNode(grammarAccess.getPinRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePin=rulePin();

            state._fsp--;

             current =iv_rulePin; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRulePin"


    // $ANTLR start "rulePin"
    // InternalSpinCAD.g:195:1: rulePin returns [EObject current=null] : (this_InputPin_0= ruleInputPin | this_OutputPin_1= ruleOutputPin ) ;
    public final EObject rulePin() throws RecognitionException {
        EObject current = null;

        EObject this_InputPin_0 = null;

        EObject this_OutputPin_1 = null;


         enterRule(); 
            
        try {
            // InternalSpinCAD.g:198:28: ( (this_InputPin_0= ruleInputPin | this_OutputPin_1= ruleOutputPin ) )
            // InternalSpinCAD.g:199:1: (this_InputPin_0= ruleInputPin | this_OutputPin_1= ruleOutputPin )
            {
            // InternalSpinCAD.g:199:1: (this_InputPin_0= ruleInputPin | this_OutputPin_1= ruleOutputPin )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==15||LA5_0==17) ) {
                alt5=1;
            }
            else if ( (LA5_0==16||LA5_0==18) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // InternalSpinCAD.g:200:5: this_InputPin_0= ruleInputPin
                    {
                     
                            newCompositeNode(grammarAccess.getPinAccess().getInputPinParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_2);
                    this_InputPin_0=ruleInputPin();

                    state._fsp--;

                     
                            current = this_InputPin_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // InternalSpinCAD.g:210:5: this_OutputPin_1= ruleOutputPin
                    {
                     
                            newCompositeNode(grammarAccess.getPinAccess().getOutputPinParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_2);
                    this_OutputPin_1=ruleOutputPin();

                    state._fsp--;

                     
                            current = this_OutputPin_1; 
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
    // $ANTLR end "rulePin"


    // $ANTLR start "entryRuleInputPin"
    // InternalSpinCAD.g:226:1: entryRuleInputPin returns [EObject current=null] : iv_ruleInputPin= ruleInputPin EOF ;
    public final EObject entryRuleInputPin() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInputPin = null;


        try {
            // InternalSpinCAD.g:227:2: (iv_ruleInputPin= ruleInputPin EOF )
            // InternalSpinCAD.g:228:2: iv_ruleInputPin= ruleInputPin EOF
            {
             newCompositeNode(grammarAccess.getInputPinRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleInputPin=ruleInputPin();

            state._fsp--;

             current =iv_ruleInputPin; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleInputPin"


    // $ANTLR start "ruleInputPin"
    // InternalSpinCAD.g:235:1: ruleInputPin returns [EObject current=null] : (this_AudioInput_0= ruleAudioInput | this_ControlInput_1= ruleControlInput ) ;
    public final EObject ruleInputPin() throws RecognitionException {
        EObject current = null;

        EObject this_AudioInput_0 = null;

        EObject this_ControlInput_1 = null;


         enterRule(); 
            
        try {
            // InternalSpinCAD.g:238:28: ( (this_AudioInput_0= ruleAudioInput | this_ControlInput_1= ruleControlInput ) )
            // InternalSpinCAD.g:239:1: (this_AudioInput_0= ruleAudioInput | this_ControlInput_1= ruleControlInput )
            {
            // InternalSpinCAD.g:239:1: (this_AudioInput_0= ruleAudioInput | this_ControlInput_1= ruleControlInput )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==15) ) {
                alt6=1;
            }
            else if ( (LA6_0==17) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // InternalSpinCAD.g:240:5: this_AudioInput_0= ruleAudioInput
                    {
                     
                            newCompositeNode(grammarAccess.getInputPinAccess().getAudioInputParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_2);
                    this_AudioInput_0=ruleAudioInput();

                    state._fsp--;

                     
                            current = this_AudioInput_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // InternalSpinCAD.g:250:5: this_ControlInput_1= ruleControlInput
                    {
                     
                            newCompositeNode(grammarAccess.getInputPinAccess().getControlInputParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_2);
                    this_ControlInput_1=ruleControlInput();

                    state._fsp--;

                     
                            current = this_ControlInput_1; 
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
    // $ANTLR end "ruleInputPin"


    // $ANTLR start "entryRuleOutputPin"
    // InternalSpinCAD.g:266:1: entryRuleOutputPin returns [EObject current=null] : iv_ruleOutputPin= ruleOutputPin EOF ;
    public final EObject entryRuleOutputPin() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOutputPin = null;


        try {
            // InternalSpinCAD.g:267:2: (iv_ruleOutputPin= ruleOutputPin EOF )
            // InternalSpinCAD.g:268:2: iv_ruleOutputPin= ruleOutputPin EOF
            {
             newCompositeNode(grammarAccess.getOutputPinRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleOutputPin=ruleOutputPin();

            state._fsp--;

             current =iv_ruleOutputPin; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleOutputPin"


    // $ANTLR start "ruleOutputPin"
    // InternalSpinCAD.g:275:1: ruleOutputPin returns [EObject current=null] : (this_AudioOutput_0= ruleAudioOutput | this_ControlOutput_1= ruleControlOutput ) ;
    public final EObject ruleOutputPin() throws RecognitionException {
        EObject current = null;

        EObject this_AudioOutput_0 = null;

        EObject this_ControlOutput_1 = null;


         enterRule(); 
            
        try {
            // InternalSpinCAD.g:278:28: ( (this_AudioOutput_0= ruleAudioOutput | this_ControlOutput_1= ruleControlOutput ) )
            // InternalSpinCAD.g:279:1: (this_AudioOutput_0= ruleAudioOutput | this_ControlOutput_1= ruleControlOutput )
            {
            // InternalSpinCAD.g:279:1: (this_AudioOutput_0= ruleAudioOutput | this_ControlOutput_1= ruleControlOutput )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==16) ) {
                alt7=1;
            }
            else if ( (LA7_0==18) ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // InternalSpinCAD.g:280:5: this_AudioOutput_0= ruleAudioOutput
                    {
                     
                            newCompositeNode(grammarAccess.getOutputPinAccess().getAudioOutputParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_2);
                    this_AudioOutput_0=ruleAudioOutput();

                    state._fsp--;

                     
                            current = this_AudioOutput_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // InternalSpinCAD.g:290:5: this_ControlOutput_1= ruleControlOutput
                    {
                     
                            newCompositeNode(grammarAccess.getOutputPinAccess().getControlOutputParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_2);
                    this_ControlOutput_1=ruleControlOutput();

                    state._fsp--;

                     
                            current = this_ControlOutput_1; 
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
    // $ANTLR end "ruleOutputPin"


    // $ANTLR start "entryRuleAudioInput"
    // InternalSpinCAD.g:306:1: entryRuleAudioInput returns [EObject current=null] : iv_ruleAudioInput= ruleAudioInput EOF ;
    public final EObject entryRuleAudioInput() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAudioInput = null;


        try {
            // InternalSpinCAD.g:307:2: (iv_ruleAudioInput= ruleAudioInput EOF )
            // InternalSpinCAD.g:308:2: iv_ruleAudioInput= ruleAudioInput EOF
            {
             newCompositeNode(grammarAccess.getAudioInputRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAudioInput=ruleAudioInput();

            state._fsp--;

             current =iv_ruleAudioInput; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleAudioInput"


    // $ANTLR start "ruleAudioInput"
    // InternalSpinCAD.g:315:1: ruleAudioInput returns [EObject current=null] : (otherlv_0= '@audioInput' ( (lv_varName_1_0= RULE_ID ) ) ( ( (lv_label_2_1= RULE_ID | lv_label_2_2= RULE_STRING ) ) ) ) ;
    public final EObject ruleAudioInput() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_varName_1_0=null;
        Token lv_label_2_1=null;
        Token lv_label_2_2=null;

         enterRule(); 
            
        try {
            // InternalSpinCAD.g:318:28: ( (otherlv_0= '@audioInput' ( (lv_varName_1_0= RULE_ID ) ) ( ( (lv_label_2_1= RULE_ID | lv_label_2_2= RULE_STRING ) ) ) ) )
            // InternalSpinCAD.g:319:1: (otherlv_0= '@audioInput' ( (lv_varName_1_0= RULE_ID ) ) ( ( (lv_label_2_1= RULE_ID | lv_label_2_2= RULE_STRING ) ) ) )
            {
            // InternalSpinCAD.g:319:1: (otherlv_0= '@audioInput' ( (lv_varName_1_0= RULE_ID ) ) ( ( (lv_label_2_1= RULE_ID | lv_label_2_2= RULE_STRING ) ) ) )
            // InternalSpinCAD.g:319:3: otherlv_0= '@audioInput' ( (lv_varName_1_0= RULE_ID ) ) ( ( (lv_label_2_1= RULE_ID | lv_label_2_2= RULE_STRING ) ) )
            {
            otherlv_0=(Token)match(input,15,FOLLOW_8); 

                	newLeafNode(otherlv_0, grammarAccess.getAudioInputAccess().getAudioInputKeyword_0());
                
            // InternalSpinCAD.g:323:1: ( (lv_varName_1_0= RULE_ID ) )
            // InternalSpinCAD.g:324:1: (lv_varName_1_0= RULE_ID )
            {
            // InternalSpinCAD.g:324:1: (lv_varName_1_0= RULE_ID )
            // InternalSpinCAD.g:325:3: lv_varName_1_0= RULE_ID
            {
            lv_varName_1_0=(Token)match(input,RULE_ID,FOLLOW_3); 

            			newLeafNode(lv_varName_1_0, grammarAccess.getAudioInputAccess().getVarNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getAudioInputRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"varName",
                    		lv_varName_1_0, 
                    		"org.eclipse.xtext.common.Terminals.ID");
            	    

            }


            }

            // InternalSpinCAD.g:341:2: ( ( (lv_label_2_1= RULE_ID | lv_label_2_2= RULE_STRING ) ) )
            // InternalSpinCAD.g:342:1: ( (lv_label_2_1= RULE_ID | lv_label_2_2= RULE_STRING ) )
            {
            // InternalSpinCAD.g:342:1: ( (lv_label_2_1= RULE_ID | lv_label_2_2= RULE_STRING ) )
            // InternalSpinCAD.g:343:1: (lv_label_2_1= RULE_ID | lv_label_2_2= RULE_STRING )
            {
            // InternalSpinCAD.g:343:1: (lv_label_2_1= RULE_ID | lv_label_2_2= RULE_STRING )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==RULE_ID) ) {
                alt8=1;
            }
            else if ( (LA8_0==RULE_STRING) ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // InternalSpinCAD.g:344:3: lv_label_2_1= RULE_ID
                    {
                    lv_label_2_1=(Token)match(input,RULE_ID,FOLLOW_2); 

                    			newLeafNode(lv_label_2_1, grammarAccess.getAudioInputAccess().getLabelIDTerminalRuleCall_2_0_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getAudioInputRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"label",
                            		lv_label_2_1, 
                            		"org.eclipse.xtext.common.Terminals.ID");
                    	    

                    }
                    break;
                case 2 :
                    // InternalSpinCAD.g:359:8: lv_label_2_2= RULE_STRING
                    {
                    lv_label_2_2=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    			newLeafNode(lv_label_2_2, grammarAccess.getAudioInputAccess().getLabelSTRINGTerminalRuleCall_2_0_1()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getAudioInputRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"label",
                            		lv_label_2_2, 
                            		"com.holycityaudio.spincad.SpinCAD.STRING");
                    	    

                    }
                    break;

            }


            }


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
    // $ANTLR end "ruleAudioInput"


    // $ANTLR start "entryRuleAudioOutput"
    // InternalSpinCAD.g:385:1: entryRuleAudioOutput returns [EObject current=null] : iv_ruleAudioOutput= ruleAudioOutput EOF ;
    public final EObject entryRuleAudioOutput() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAudioOutput = null;


        try {
            // InternalSpinCAD.g:386:2: (iv_ruleAudioOutput= ruleAudioOutput EOF )
            // InternalSpinCAD.g:387:2: iv_ruleAudioOutput= ruleAudioOutput EOF
            {
             newCompositeNode(grammarAccess.getAudioOutputRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAudioOutput=ruleAudioOutput();

            state._fsp--;

             current =iv_ruleAudioOutput; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleAudioOutput"


    // $ANTLR start "ruleAudioOutput"
    // InternalSpinCAD.g:394:1: ruleAudioOutput returns [EObject current=null] : (otherlv_0= '@audioOutput' ( (lv_varName_1_0= RULE_ID ) ) ( ( (lv_label_2_1= RULE_ID | lv_label_2_2= RULE_STRING ) ) ) ) ;
    public final EObject ruleAudioOutput() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_varName_1_0=null;
        Token lv_label_2_1=null;
        Token lv_label_2_2=null;

         enterRule(); 
            
        try {
            // InternalSpinCAD.g:397:28: ( (otherlv_0= '@audioOutput' ( (lv_varName_1_0= RULE_ID ) ) ( ( (lv_label_2_1= RULE_ID | lv_label_2_2= RULE_STRING ) ) ) ) )
            // InternalSpinCAD.g:398:1: (otherlv_0= '@audioOutput' ( (lv_varName_1_0= RULE_ID ) ) ( ( (lv_label_2_1= RULE_ID | lv_label_2_2= RULE_STRING ) ) ) )
            {
            // InternalSpinCAD.g:398:1: (otherlv_0= '@audioOutput' ( (lv_varName_1_0= RULE_ID ) ) ( ( (lv_label_2_1= RULE_ID | lv_label_2_2= RULE_STRING ) ) ) )
            // InternalSpinCAD.g:398:3: otherlv_0= '@audioOutput' ( (lv_varName_1_0= RULE_ID ) ) ( ( (lv_label_2_1= RULE_ID | lv_label_2_2= RULE_STRING ) ) )
            {
            otherlv_0=(Token)match(input,16,FOLLOW_8); 

                	newLeafNode(otherlv_0, grammarAccess.getAudioOutputAccess().getAudioOutputKeyword_0());
                
            // InternalSpinCAD.g:402:1: ( (lv_varName_1_0= RULE_ID ) )
            // InternalSpinCAD.g:403:1: (lv_varName_1_0= RULE_ID )
            {
            // InternalSpinCAD.g:403:1: (lv_varName_1_0= RULE_ID )
            // InternalSpinCAD.g:404:3: lv_varName_1_0= RULE_ID
            {
            lv_varName_1_0=(Token)match(input,RULE_ID,FOLLOW_3); 

            			newLeafNode(lv_varName_1_0, grammarAccess.getAudioOutputAccess().getVarNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getAudioOutputRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"varName",
                    		lv_varName_1_0, 
                    		"org.eclipse.xtext.common.Terminals.ID");
            	    

            }


            }

            // InternalSpinCAD.g:420:2: ( ( (lv_label_2_1= RULE_ID | lv_label_2_2= RULE_STRING ) ) )
            // InternalSpinCAD.g:421:1: ( (lv_label_2_1= RULE_ID | lv_label_2_2= RULE_STRING ) )
            {
            // InternalSpinCAD.g:421:1: ( (lv_label_2_1= RULE_ID | lv_label_2_2= RULE_STRING ) )
            // InternalSpinCAD.g:422:1: (lv_label_2_1= RULE_ID | lv_label_2_2= RULE_STRING )
            {
            // InternalSpinCAD.g:422:1: (lv_label_2_1= RULE_ID | lv_label_2_2= RULE_STRING )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==RULE_ID) ) {
                alt9=1;
            }
            else if ( (LA9_0==RULE_STRING) ) {
                alt9=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // InternalSpinCAD.g:423:3: lv_label_2_1= RULE_ID
                    {
                    lv_label_2_1=(Token)match(input,RULE_ID,FOLLOW_2); 

                    			newLeafNode(lv_label_2_1, grammarAccess.getAudioOutputAccess().getLabelIDTerminalRuleCall_2_0_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getAudioOutputRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"label",
                            		lv_label_2_1, 
                            		"org.eclipse.xtext.common.Terminals.ID");
                    	    

                    }
                    break;
                case 2 :
                    // InternalSpinCAD.g:438:8: lv_label_2_2= RULE_STRING
                    {
                    lv_label_2_2=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    			newLeafNode(lv_label_2_2, grammarAccess.getAudioOutputAccess().getLabelSTRINGTerminalRuleCall_2_0_1()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getAudioOutputRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"label",
                            		lv_label_2_2, 
                            		"com.holycityaudio.spincad.SpinCAD.STRING");
                    	    

                    }
                    break;

            }


            }


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
    // $ANTLR end "ruleAudioOutput"


    // $ANTLR start "entryRuleControlInput"
    // InternalSpinCAD.g:464:1: entryRuleControlInput returns [EObject current=null] : iv_ruleControlInput= ruleControlInput EOF ;
    public final EObject entryRuleControlInput() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleControlInput = null;


        try {
            // InternalSpinCAD.g:465:2: (iv_ruleControlInput= ruleControlInput EOF )
            // InternalSpinCAD.g:466:2: iv_ruleControlInput= ruleControlInput EOF
            {
             newCompositeNode(grammarAccess.getControlInputRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleControlInput=ruleControlInput();

            state._fsp--;

             current =iv_ruleControlInput; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleControlInput"


    // $ANTLR start "ruleControlInput"
    // InternalSpinCAD.g:473:1: ruleControlInput returns [EObject current=null] : (otherlv_0= '@controlInput' ( (lv_varName_1_0= RULE_ID ) ) ( ( (lv_label_2_1= RULE_ID | lv_label_2_2= RULE_STRING ) ) ) ) ;
    public final EObject ruleControlInput() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_varName_1_0=null;
        Token lv_label_2_1=null;
        Token lv_label_2_2=null;

         enterRule(); 
            
        try {
            // InternalSpinCAD.g:476:28: ( (otherlv_0= '@controlInput' ( (lv_varName_1_0= RULE_ID ) ) ( ( (lv_label_2_1= RULE_ID | lv_label_2_2= RULE_STRING ) ) ) ) )
            // InternalSpinCAD.g:477:1: (otherlv_0= '@controlInput' ( (lv_varName_1_0= RULE_ID ) ) ( ( (lv_label_2_1= RULE_ID | lv_label_2_2= RULE_STRING ) ) ) )
            {
            // InternalSpinCAD.g:477:1: (otherlv_0= '@controlInput' ( (lv_varName_1_0= RULE_ID ) ) ( ( (lv_label_2_1= RULE_ID | lv_label_2_2= RULE_STRING ) ) ) )
            // InternalSpinCAD.g:477:3: otherlv_0= '@controlInput' ( (lv_varName_1_0= RULE_ID ) ) ( ( (lv_label_2_1= RULE_ID | lv_label_2_2= RULE_STRING ) ) )
            {
            otherlv_0=(Token)match(input,17,FOLLOW_8); 

                	newLeafNode(otherlv_0, grammarAccess.getControlInputAccess().getControlInputKeyword_0());
                
            // InternalSpinCAD.g:481:1: ( (lv_varName_1_0= RULE_ID ) )
            // InternalSpinCAD.g:482:1: (lv_varName_1_0= RULE_ID )
            {
            // InternalSpinCAD.g:482:1: (lv_varName_1_0= RULE_ID )
            // InternalSpinCAD.g:483:3: lv_varName_1_0= RULE_ID
            {
            lv_varName_1_0=(Token)match(input,RULE_ID,FOLLOW_3); 

            			newLeafNode(lv_varName_1_0, grammarAccess.getControlInputAccess().getVarNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getControlInputRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"varName",
                    		lv_varName_1_0, 
                    		"org.eclipse.xtext.common.Terminals.ID");
            	    

            }


            }

            // InternalSpinCAD.g:499:2: ( ( (lv_label_2_1= RULE_ID | lv_label_2_2= RULE_STRING ) ) )
            // InternalSpinCAD.g:500:1: ( (lv_label_2_1= RULE_ID | lv_label_2_2= RULE_STRING ) )
            {
            // InternalSpinCAD.g:500:1: ( (lv_label_2_1= RULE_ID | lv_label_2_2= RULE_STRING ) )
            // InternalSpinCAD.g:501:1: (lv_label_2_1= RULE_ID | lv_label_2_2= RULE_STRING )
            {
            // InternalSpinCAD.g:501:1: (lv_label_2_1= RULE_ID | lv_label_2_2= RULE_STRING )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==RULE_ID) ) {
                alt10=1;
            }
            else if ( (LA10_0==RULE_STRING) ) {
                alt10=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // InternalSpinCAD.g:502:3: lv_label_2_1= RULE_ID
                    {
                    lv_label_2_1=(Token)match(input,RULE_ID,FOLLOW_2); 

                    			newLeafNode(lv_label_2_1, grammarAccess.getControlInputAccess().getLabelIDTerminalRuleCall_2_0_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getControlInputRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"label",
                            		lv_label_2_1, 
                            		"org.eclipse.xtext.common.Terminals.ID");
                    	    

                    }
                    break;
                case 2 :
                    // InternalSpinCAD.g:517:8: lv_label_2_2= RULE_STRING
                    {
                    lv_label_2_2=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    			newLeafNode(lv_label_2_2, grammarAccess.getControlInputAccess().getLabelSTRINGTerminalRuleCall_2_0_1()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getControlInputRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"label",
                            		lv_label_2_2, 
                            		"com.holycityaudio.spincad.SpinCAD.STRING");
                    	    

                    }
                    break;

            }


            }


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
    // $ANTLR end "ruleControlInput"


    // $ANTLR start "entryRuleControlOutput"
    // InternalSpinCAD.g:543:1: entryRuleControlOutput returns [EObject current=null] : iv_ruleControlOutput= ruleControlOutput EOF ;
    public final EObject entryRuleControlOutput() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleControlOutput = null;


        try {
            // InternalSpinCAD.g:544:2: (iv_ruleControlOutput= ruleControlOutput EOF )
            // InternalSpinCAD.g:545:2: iv_ruleControlOutput= ruleControlOutput EOF
            {
             newCompositeNode(grammarAccess.getControlOutputRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleControlOutput=ruleControlOutput();

            state._fsp--;

             current =iv_ruleControlOutput; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleControlOutput"


    // $ANTLR start "ruleControlOutput"
    // InternalSpinCAD.g:552:1: ruleControlOutput returns [EObject current=null] : (otherlv_0= '@controlOutput' ( (lv_varName_1_0= RULE_ID ) ) ( ( (lv_label_2_1= RULE_ID | lv_label_2_2= RULE_STRING ) ) ) ) ;
    public final EObject ruleControlOutput() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_varName_1_0=null;
        Token lv_label_2_1=null;
        Token lv_label_2_2=null;

         enterRule(); 
            
        try {
            // InternalSpinCAD.g:555:28: ( (otherlv_0= '@controlOutput' ( (lv_varName_1_0= RULE_ID ) ) ( ( (lv_label_2_1= RULE_ID | lv_label_2_2= RULE_STRING ) ) ) ) )
            // InternalSpinCAD.g:556:1: (otherlv_0= '@controlOutput' ( (lv_varName_1_0= RULE_ID ) ) ( ( (lv_label_2_1= RULE_ID | lv_label_2_2= RULE_STRING ) ) ) )
            {
            // InternalSpinCAD.g:556:1: (otherlv_0= '@controlOutput' ( (lv_varName_1_0= RULE_ID ) ) ( ( (lv_label_2_1= RULE_ID | lv_label_2_2= RULE_STRING ) ) ) )
            // InternalSpinCAD.g:556:3: otherlv_0= '@controlOutput' ( (lv_varName_1_0= RULE_ID ) ) ( ( (lv_label_2_1= RULE_ID | lv_label_2_2= RULE_STRING ) ) )
            {
            otherlv_0=(Token)match(input,18,FOLLOW_8); 

                	newLeafNode(otherlv_0, grammarAccess.getControlOutputAccess().getControlOutputKeyword_0());
                
            // InternalSpinCAD.g:560:1: ( (lv_varName_1_0= RULE_ID ) )
            // InternalSpinCAD.g:561:1: (lv_varName_1_0= RULE_ID )
            {
            // InternalSpinCAD.g:561:1: (lv_varName_1_0= RULE_ID )
            // InternalSpinCAD.g:562:3: lv_varName_1_0= RULE_ID
            {
            lv_varName_1_0=(Token)match(input,RULE_ID,FOLLOW_3); 

            			newLeafNode(lv_varName_1_0, grammarAccess.getControlOutputAccess().getVarNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getControlOutputRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"varName",
                    		lv_varName_1_0, 
                    		"org.eclipse.xtext.common.Terminals.ID");
            	    

            }


            }

            // InternalSpinCAD.g:578:2: ( ( (lv_label_2_1= RULE_ID | lv_label_2_2= RULE_STRING ) ) )
            // InternalSpinCAD.g:579:1: ( (lv_label_2_1= RULE_ID | lv_label_2_2= RULE_STRING ) )
            {
            // InternalSpinCAD.g:579:1: ( (lv_label_2_1= RULE_ID | lv_label_2_2= RULE_STRING ) )
            // InternalSpinCAD.g:580:1: (lv_label_2_1= RULE_ID | lv_label_2_2= RULE_STRING )
            {
            // InternalSpinCAD.g:580:1: (lv_label_2_1= RULE_ID | lv_label_2_2= RULE_STRING )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==RULE_ID) ) {
                alt11=1;
            }
            else if ( (LA11_0==RULE_STRING) ) {
                alt11=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }
            switch (alt11) {
                case 1 :
                    // InternalSpinCAD.g:581:3: lv_label_2_1= RULE_ID
                    {
                    lv_label_2_1=(Token)match(input,RULE_ID,FOLLOW_2); 

                    			newLeafNode(lv_label_2_1, grammarAccess.getControlOutputAccess().getLabelIDTerminalRuleCall_2_0_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getControlOutputRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"label",
                            		lv_label_2_1, 
                            		"org.eclipse.xtext.common.Terminals.ID");
                    	    

                    }
                    break;
                case 2 :
                    // InternalSpinCAD.g:596:8: lv_label_2_2= RULE_STRING
                    {
                    lv_label_2_2=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    			newLeafNode(lv_label_2_2, grammarAccess.getControlOutputAccess().getLabelSTRINGTerminalRuleCall_2_0_1()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getControlOutputRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"label",
                            		lv_label_2_2, 
                            		"com.holycityaudio.spincad.SpinCAD.STRING");
                    	    

                    }
                    break;

            }


            }


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
    // $ANTLR end "ruleControlOutput"


    // $ANTLR start "entryRuleSpinElement"
    // InternalSpinCAD.g:622:1: entryRuleSpinElement returns [EObject current=null] : iv_ruleSpinElement= ruleSpinElement EOF ;
    public final EObject entryRuleSpinElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSpinElement = null;


        try {
            // InternalSpinCAD.g:623:2: (iv_ruleSpinElement= ruleSpinElement EOF )
            // InternalSpinCAD.g:624:2: iv_ruleSpinElement= ruleSpinElement EOF
            {
             newCompositeNode(grammarAccess.getSpinElementRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSpinElement=ruleSpinElement();

            state._fsp--;

             current =iv_ruleSpinElement; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleSpinElement"


    // $ANTLR start "ruleSpinElement"
    // InternalSpinCAD.g:631:1: ruleSpinElement returns [EObject current=null] : (this_SpinInt_0= ruleSpinInt | this_Control_1= ruleControl | this_SpinEquate_2= ruleSpinEquate | this_SpinBool_3= ruleSpinBool | this_Mem_4= ruleMem | this_Instruction_5= ruleInstruction | this_Label_6= ruleLabel | this_Comment_7= ruleComment | this_Macro_8= ruleMacro | this_Offset_9= ruleOffset ) ;
    public final EObject ruleSpinElement() throws RecognitionException {
        EObject current = null;

        EObject this_SpinInt_0 = null;

        EObject this_Control_1 = null;

        EObject this_SpinEquate_2 = null;

        EObject this_SpinBool_3 = null;

        EObject this_Mem_4 = null;

        EObject this_Instruction_5 = null;

        EObject this_Label_6 = null;

        EObject this_Comment_7 = null;

        EObject this_Macro_8 = null;

        EObject this_Offset_9 = null;


         enterRule(); 
            
        try {
            // InternalSpinCAD.g:634:28: ( (this_SpinInt_0= ruleSpinInt | this_Control_1= ruleControl | this_SpinEquate_2= ruleSpinEquate | this_SpinBool_3= ruleSpinBool | this_Mem_4= ruleMem | this_Instruction_5= ruleInstruction | this_Label_6= ruleLabel | this_Comment_7= ruleComment | this_Macro_8= ruleMacro | this_Offset_9= ruleOffset ) )
            // InternalSpinCAD.g:635:1: (this_SpinInt_0= ruleSpinInt | this_Control_1= ruleControl | this_SpinEquate_2= ruleSpinEquate | this_SpinBool_3= ruleSpinBool | this_Mem_4= ruleMem | this_Instruction_5= ruleInstruction | this_Label_6= ruleLabel | this_Comment_7= ruleComment | this_Macro_8= ruleMacro | this_Offset_9= ruleOffset )
            {
            // InternalSpinCAD.g:635:1: (this_SpinInt_0= ruleSpinInt | this_Control_1= ruleControl | this_SpinEquate_2= ruleSpinEquate | this_SpinBool_3= ruleSpinBool | this_Mem_4= ruleMem | this_Instruction_5= ruleInstruction | this_Label_6= ruleLabel | this_Comment_7= ruleComment | this_Macro_8= ruleMacro | this_Offset_9= ruleOffset )
            int alt12=10;
            switch ( input.LA(1) ) {
            case 20:
                {
                alt12=1;
                }
                break;
            case 24:
            case 25:
            case 26:
            case 27:
            case 28:
            case 29:
            case 30:
            case 31:
                {
                alt12=2;
                }
                break;
            case 19:
                {
                alt12=3;
                }
                break;
            case 23:
                {
                alt12=4;
                }
                break;
            case 21:
                {
                alt12=5;
                }
                break;
            case 55:
            case 57:
            case 58:
            case 59:
            case 60:
            case 61:
            case 62:
            case 63:
            case 64:
            case 65:
            case 66:
            case 67:
            case 68:
            case 69:
            case 70:
            case 71:
            case 72:
            case 73:
            case 74:
            case 75:
            case 76:
            case 77:
            case 78:
            case 79:
            case 80:
            case 81:
            case 82:
            case 83:
                {
                alt12=6;
                }
                break;
            case RULE_ID:
                {
                alt12=7;
                }
                break;
            case RULE_SC_COMMENT:
                {
                alt12=8;
                }
                break;
            case 33:
            case 34:
            case 35:
            case 36:
            case 37:
            case 38:
            case 39:
            case 40:
            case 41:
            case 42:
            case 43:
            case 44:
            case 45:
            case 46:
            case 47:
            case 48:
            case 49:
            case 50:
            case 51:
            case 52:
            case 53:
            case 54:
                {
                alt12=9;
                }
                break;
            case 22:
                {
                alt12=10;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }

            switch (alt12) {
                case 1 :
                    // InternalSpinCAD.g:636:5: this_SpinInt_0= ruleSpinInt
                    {
                     
                            newCompositeNode(grammarAccess.getSpinElementAccess().getSpinIntParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_2);
                    this_SpinInt_0=ruleSpinInt();

                    state._fsp--;

                     
                            current = this_SpinInt_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // InternalSpinCAD.g:646:5: this_Control_1= ruleControl
                    {
                     
                            newCompositeNode(grammarAccess.getSpinElementAccess().getControlParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_2);
                    this_Control_1=ruleControl();

                    state._fsp--;

                     
                            current = this_Control_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // InternalSpinCAD.g:656:5: this_SpinEquate_2= ruleSpinEquate
                    {
                     
                            newCompositeNode(grammarAccess.getSpinElementAccess().getSpinEquateParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_2);
                    this_SpinEquate_2=ruleSpinEquate();

                    state._fsp--;

                     
                            current = this_SpinEquate_2; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 4 :
                    // InternalSpinCAD.g:666:5: this_SpinBool_3= ruleSpinBool
                    {
                     
                            newCompositeNode(grammarAccess.getSpinElementAccess().getSpinBoolParserRuleCall_3()); 
                        
                    pushFollow(FOLLOW_2);
                    this_SpinBool_3=ruleSpinBool();

                    state._fsp--;

                     
                            current = this_SpinBool_3; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 5 :
                    // InternalSpinCAD.g:676:5: this_Mem_4= ruleMem
                    {
                     
                            newCompositeNode(grammarAccess.getSpinElementAccess().getMemParserRuleCall_4()); 
                        
                    pushFollow(FOLLOW_2);
                    this_Mem_4=ruleMem();

                    state._fsp--;

                     
                            current = this_Mem_4; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 6 :
                    // InternalSpinCAD.g:686:5: this_Instruction_5= ruleInstruction
                    {
                     
                            newCompositeNode(grammarAccess.getSpinElementAccess().getInstructionParserRuleCall_5()); 
                        
                    pushFollow(FOLLOW_2);
                    this_Instruction_5=ruleInstruction();

                    state._fsp--;

                     
                            current = this_Instruction_5; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 7 :
                    // InternalSpinCAD.g:696:5: this_Label_6= ruleLabel
                    {
                     
                            newCompositeNode(grammarAccess.getSpinElementAccess().getLabelParserRuleCall_6()); 
                        
                    pushFollow(FOLLOW_2);
                    this_Label_6=ruleLabel();

                    state._fsp--;

                     
                            current = this_Label_6; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 8 :
                    // InternalSpinCAD.g:706:5: this_Comment_7= ruleComment
                    {
                     
                            newCompositeNode(grammarAccess.getSpinElementAccess().getCommentParserRuleCall_7()); 
                        
                    pushFollow(FOLLOW_2);
                    this_Comment_7=ruleComment();

                    state._fsp--;

                     
                            current = this_Comment_7; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 9 :
                    // InternalSpinCAD.g:716:5: this_Macro_8= ruleMacro
                    {
                     
                            newCompositeNode(grammarAccess.getSpinElementAccess().getMacroParserRuleCall_8()); 
                        
                    pushFollow(FOLLOW_2);
                    this_Macro_8=ruleMacro();

                    state._fsp--;

                     
                            current = this_Macro_8; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 10 :
                    // InternalSpinCAD.g:726:5: this_Offset_9= ruleOffset
                    {
                     
                            newCompositeNode(grammarAccess.getSpinElementAccess().getOffsetParserRuleCall_9()); 
                        
                    pushFollow(FOLLOW_2);
                    this_Offset_9=ruleOffset();

                    state._fsp--;

                     
                            current = this_Offset_9; 
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
    // $ANTLR end "ruleSpinElement"


    // $ANTLR start "entryRuleSpinEquate"
    // InternalSpinCAD.g:742:1: entryRuleSpinEquate returns [EObject current=null] : iv_ruleSpinEquate= ruleSpinEquate EOF ;
    public final EObject entryRuleSpinEquate() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSpinEquate = null;


        try {
            // InternalSpinCAD.g:743:2: (iv_ruleSpinEquate= ruleSpinEquate EOF )
            // InternalSpinCAD.g:744:2: iv_ruleSpinEquate= ruleSpinEquate EOF
            {
             newCompositeNode(grammarAccess.getSpinEquateRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSpinEquate=ruleSpinEquate();

            state._fsp--;

             current =iv_ruleSpinEquate; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleSpinEquate"


    // $ANTLR start "ruleSpinEquate"
    // InternalSpinCAD.g:751:1: ruleSpinEquate returns [EObject current=null] : (otherlv_0= 'equ' ( (lv_ename_1_0= RULE_ID ) ) ( (lv_value_2_0= ruleSPINDOUBLE ) ) ) ;
    public final EObject ruleSpinEquate() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_ename_1_0=null;
        AntlrDatatypeRuleToken lv_value_2_0 = null;


         enterRule(); 
            
        try {
            // InternalSpinCAD.g:754:28: ( (otherlv_0= 'equ' ( (lv_ename_1_0= RULE_ID ) ) ( (lv_value_2_0= ruleSPINDOUBLE ) ) ) )
            // InternalSpinCAD.g:755:1: (otherlv_0= 'equ' ( (lv_ename_1_0= RULE_ID ) ) ( (lv_value_2_0= ruleSPINDOUBLE ) ) )
            {
            // InternalSpinCAD.g:755:1: (otherlv_0= 'equ' ( (lv_ename_1_0= RULE_ID ) ) ( (lv_value_2_0= ruleSPINDOUBLE ) ) )
            // InternalSpinCAD.g:755:3: otherlv_0= 'equ' ( (lv_ename_1_0= RULE_ID ) ) ( (lv_value_2_0= ruleSPINDOUBLE ) )
            {
            otherlv_0=(Token)match(input,19,FOLLOW_8); 

                	newLeafNode(otherlv_0, grammarAccess.getSpinEquateAccess().getEquKeyword_0());
                
            // InternalSpinCAD.g:759:1: ( (lv_ename_1_0= RULE_ID ) )
            // InternalSpinCAD.g:760:1: (lv_ename_1_0= RULE_ID )
            {
            // InternalSpinCAD.g:760:1: (lv_ename_1_0= RULE_ID )
            // InternalSpinCAD.g:761:3: lv_ename_1_0= RULE_ID
            {
            lv_ename_1_0=(Token)match(input,RULE_ID,FOLLOW_9); 

            			newLeafNode(lv_ename_1_0, grammarAccess.getSpinEquateAccess().getEnameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getSpinEquateRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"ename",
                    		lv_ename_1_0, 
                    		"org.eclipse.xtext.common.Terminals.ID");
            	    

            }


            }

            // InternalSpinCAD.g:777:2: ( (lv_value_2_0= ruleSPINDOUBLE ) )
            // InternalSpinCAD.g:778:1: (lv_value_2_0= ruleSPINDOUBLE )
            {
            // InternalSpinCAD.g:778:1: (lv_value_2_0= ruleSPINDOUBLE )
            // InternalSpinCAD.g:779:3: lv_value_2_0= ruleSPINDOUBLE
            {
             
            	        newCompositeNode(grammarAccess.getSpinEquateAccess().getValueSPINDOUBLEParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_2);
            lv_value_2_0=ruleSPINDOUBLE();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getSpinEquateRule());
            	        }
                   		set(
                   			current, 
                   			"value",
                    		lv_value_2_0, 
                    		"com.holycityaudio.spincad.SpinCAD.SPINDOUBLE");
            	        afterParserOrEnumRuleCall();
            	    

            }


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
    // $ANTLR end "ruleSpinEquate"


    // $ANTLR start "entryRuleSpinInt"
    // InternalSpinCAD.g:803:1: entryRuleSpinInt returns [EObject current=null] : iv_ruleSpinInt= ruleSpinInt EOF ;
    public final EObject entryRuleSpinInt() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSpinInt = null;


        try {
            // InternalSpinCAD.g:804:2: (iv_ruleSpinInt= ruleSpinInt EOF )
            // InternalSpinCAD.g:805:2: iv_ruleSpinInt= ruleSpinInt EOF
            {
             newCompositeNode(grammarAccess.getSpinIntRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSpinInt=ruleSpinInt();

            state._fsp--;

             current =iv_ruleSpinInt; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleSpinInt"


    // $ANTLR start "ruleSpinInt"
    // InternalSpinCAD.g:812:1: ruleSpinInt returns [EObject current=null] : (otherlv_0= 'int' ( (lv_ename_1_0= RULE_ID ) ) ( (lv_value_2_0= RULE_INT ) ) ) ;
    public final EObject ruleSpinInt() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_ename_1_0=null;
        Token lv_value_2_0=null;

         enterRule(); 
            
        try {
            // InternalSpinCAD.g:815:28: ( (otherlv_0= 'int' ( (lv_ename_1_0= RULE_ID ) ) ( (lv_value_2_0= RULE_INT ) ) ) )
            // InternalSpinCAD.g:816:1: (otherlv_0= 'int' ( (lv_ename_1_0= RULE_ID ) ) ( (lv_value_2_0= RULE_INT ) ) )
            {
            // InternalSpinCAD.g:816:1: (otherlv_0= 'int' ( (lv_ename_1_0= RULE_ID ) ) ( (lv_value_2_0= RULE_INT ) ) )
            // InternalSpinCAD.g:816:3: otherlv_0= 'int' ( (lv_ename_1_0= RULE_ID ) ) ( (lv_value_2_0= RULE_INT ) )
            {
            otherlv_0=(Token)match(input,20,FOLLOW_8); 

                	newLeafNode(otherlv_0, grammarAccess.getSpinIntAccess().getIntKeyword_0());
                
            // InternalSpinCAD.g:820:1: ( (lv_ename_1_0= RULE_ID ) )
            // InternalSpinCAD.g:821:1: (lv_ename_1_0= RULE_ID )
            {
            // InternalSpinCAD.g:821:1: (lv_ename_1_0= RULE_ID )
            // InternalSpinCAD.g:822:3: lv_ename_1_0= RULE_ID
            {
            lv_ename_1_0=(Token)match(input,RULE_ID,FOLLOW_10); 

            			newLeafNode(lv_ename_1_0, grammarAccess.getSpinIntAccess().getEnameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getSpinIntRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"ename",
                    		lv_ename_1_0, 
                    		"org.eclipse.xtext.common.Terminals.ID");
            	    

            }


            }

            // InternalSpinCAD.g:838:2: ( (lv_value_2_0= RULE_INT ) )
            // InternalSpinCAD.g:839:1: (lv_value_2_0= RULE_INT )
            {
            // InternalSpinCAD.g:839:1: (lv_value_2_0= RULE_INT )
            // InternalSpinCAD.g:840:3: lv_value_2_0= RULE_INT
            {
            lv_value_2_0=(Token)match(input,RULE_INT,FOLLOW_2); 

            			newLeafNode(lv_value_2_0, grammarAccess.getSpinIntAccess().getValueINTTerminalRuleCall_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getSpinIntRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"value",
                    		lv_value_2_0, 
                    		"org.eclipse.xtext.common.Terminals.INT");
            	    

            }


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
    // $ANTLR end "ruleSpinInt"


    // $ANTLR start "entryRuleMem"
    // InternalSpinCAD.g:864:1: entryRuleMem returns [EObject current=null] : iv_ruleMem= ruleMem EOF ;
    public final EObject entryRuleMem() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMem = null;


        try {
            // InternalSpinCAD.g:865:2: (iv_ruleMem= ruleMem EOF )
            // InternalSpinCAD.g:866:2: iv_ruleMem= ruleMem EOF
            {
             newCompositeNode(grammarAccess.getMemRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMem=ruleMem();

            state._fsp--;

             current =iv_ruleMem; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleMem"


    // $ANTLR start "ruleMem"
    // InternalSpinCAD.g:873:1: ruleMem returns [EObject current=null] : (otherlv_0= 'mem' ( (lv_buffer_1_0= RULE_ID ) ) ( (lv_length_2_0= ruleSPINREGISTER ) ) ) ;
    public final EObject ruleMem() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_buffer_1_0=null;
        AntlrDatatypeRuleToken lv_length_2_0 = null;


         enterRule(); 
            
        try {
            // InternalSpinCAD.g:876:28: ( (otherlv_0= 'mem' ( (lv_buffer_1_0= RULE_ID ) ) ( (lv_length_2_0= ruleSPINREGISTER ) ) ) )
            // InternalSpinCAD.g:877:1: (otherlv_0= 'mem' ( (lv_buffer_1_0= RULE_ID ) ) ( (lv_length_2_0= ruleSPINREGISTER ) ) )
            {
            // InternalSpinCAD.g:877:1: (otherlv_0= 'mem' ( (lv_buffer_1_0= RULE_ID ) ) ( (lv_length_2_0= ruleSPINREGISTER ) ) )
            // InternalSpinCAD.g:877:3: otherlv_0= 'mem' ( (lv_buffer_1_0= RULE_ID ) ) ( (lv_length_2_0= ruleSPINREGISTER ) )
            {
            otherlv_0=(Token)match(input,21,FOLLOW_8); 

                	newLeafNode(otherlv_0, grammarAccess.getMemAccess().getMemKeyword_0());
                
            // InternalSpinCAD.g:881:1: ( (lv_buffer_1_0= RULE_ID ) )
            // InternalSpinCAD.g:882:1: (lv_buffer_1_0= RULE_ID )
            {
            // InternalSpinCAD.g:882:1: (lv_buffer_1_0= RULE_ID )
            // InternalSpinCAD.g:883:3: lv_buffer_1_0= RULE_ID
            {
            lv_buffer_1_0=(Token)match(input,RULE_ID,FOLLOW_9); 

            			newLeafNode(lv_buffer_1_0, grammarAccess.getMemAccess().getBufferIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getMemRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"buffer",
                    		lv_buffer_1_0, 
                    		"org.eclipse.xtext.common.Terminals.ID");
            	    

            }


            }

            // InternalSpinCAD.g:899:2: ( (lv_length_2_0= ruleSPINREGISTER ) )
            // InternalSpinCAD.g:900:1: (lv_length_2_0= ruleSPINREGISTER )
            {
            // InternalSpinCAD.g:900:1: (lv_length_2_0= ruleSPINREGISTER )
            // InternalSpinCAD.g:901:3: lv_length_2_0= ruleSPINREGISTER
            {
             
            	        newCompositeNode(grammarAccess.getMemAccess().getLengthSPINREGISTERParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_2);
            lv_length_2_0=ruleSPINREGISTER();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getMemRule());
            	        }
                   		set(
                   			current, 
                   			"length",
                    		lv_length_2_0, 
                    		"com.holycityaudio.spincad.SpinCAD.SPINREGISTER");
            	        afterParserOrEnumRuleCall();
            	    

            }


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
    // $ANTLR end "ruleMem"


    // $ANTLR start "entryRuleOffset"
    // InternalSpinCAD.g:925:1: entryRuleOffset returns [EObject current=null] : iv_ruleOffset= ruleOffset EOF ;
    public final EObject entryRuleOffset() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOffset = null;


        try {
            // InternalSpinCAD.g:926:2: (iv_ruleOffset= ruleOffset EOF )
            // InternalSpinCAD.g:927:2: iv_ruleOffset= ruleOffset EOF
            {
             newCompositeNode(grammarAccess.getOffsetRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleOffset=ruleOffset();

            state._fsp--;

             current =iv_ruleOffset; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleOffset"


    // $ANTLR start "ruleOffset"
    // InternalSpinCAD.g:934:1: ruleOffset returns [EObject current=null] : (otherlv_0= 'offset' ( (lv_name_1_0= RULE_ID ) ) ( (lv_length_2_0= RULE_INT ) ) ) ;
    public final EObject ruleOffset() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token lv_length_2_0=null;

         enterRule(); 
            
        try {
            // InternalSpinCAD.g:937:28: ( (otherlv_0= 'offset' ( (lv_name_1_0= RULE_ID ) ) ( (lv_length_2_0= RULE_INT ) ) ) )
            // InternalSpinCAD.g:938:1: (otherlv_0= 'offset' ( (lv_name_1_0= RULE_ID ) ) ( (lv_length_2_0= RULE_INT ) ) )
            {
            // InternalSpinCAD.g:938:1: (otherlv_0= 'offset' ( (lv_name_1_0= RULE_ID ) ) ( (lv_length_2_0= RULE_INT ) ) )
            // InternalSpinCAD.g:938:3: otherlv_0= 'offset' ( (lv_name_1_0= RULE_ID ) ) ( (lv_length_2_0= RULE_INT ) )
            {
            otherlv_0=(Token)match(input,22,FOLLOW_8); 

                	newLeafNode(otherlv_0, grammarAccess.getOffsetAccess().getOffsetKeyword_0());
                
            // InternalSpinCAD.g:942:1: ( (lv_name_1_0= RULE_ID ) )
            // InternalSpinCAD.g:943:1: (lv_name_1_0= RULE_ID )
            {
            // InternalSpinCAD.g:943:1: (lv_name_1_0= RULE_ID )
            // InternalSpinCAD.g:944:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_10); 

            			newLeafNode(lv_name_1_0, grammarAccess.getOffsetAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getOffsetRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"org.eclipse.xtext.common.Terminals.ID");
            	    

            }


            }

            // InternalSpinCAD.g:960:2: ( (lv_length_2_0= RULE_INT ) )
            // InternalSpinCAD.g:961:1: (lv_length_2_0= RULE_INT )
            {
            // InternalSpinCAD.g:961:1: (lv_length_2_0= RULE_INT )
            // InternalSpinCAD.g:962:3: lv_length_2_0= RULE_INT
            {
            lv_length_2_0=(Token)match(input,RULE_INT,FOLLOW_2); 

            			newLeafNode(lv_length_2_0, grammarAccess.getOffsetAccess().getLengthINTTerminalRuleCall_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getOffsetRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"length",
                    		lv_length_2_0, 
                    		"org.eclipse.xtext.common.Terminals.INT");
            	    

            }


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
    // $ANTLR end "ruleOffset"


    // $ANTLR start "entryRuleSpinBool"
    // InternalSpinCAD.g:986:1: entryRuleSpinBool returns [EObject current=null] : iv_ruleSpinBool= ruleSpinBool EOF ;
    public final EObject entryRuleSpinBool() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSpinBool = null;


        try {
            // InternalSpinCAD.g:987:2: (iv_ruleSpinBool= ruleSpinBool EOF )
            // InternalSpinCAD.g:988:2: iv_ruleSpinBool= ruleSpinBool EOF
            {
             newCompositeNode(grammarAccess.getSpinBoolRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSpinBool=ruleSpinBool();

            state._fsp--;

             current =iv_ruleSpinBool; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleSpinBool"


    // $ANTLR start "ruleSpinBool"
    // InternalSpinCAD.g:995:1: ruleSpinBool returns [EObject current=null] : (otherlv_0= 'bool' ( (lv_label_1_0= RULE_ID ) ) ( (lv_value_2_0= ruleBOOLEAN ) ) ) ;
    public final EObject ruleSpinBool() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_label_1_0=null;
        AntlrDatatypeRuleToken lv_value_2_0 = null;


         enterRule(); 
            
        try {
            // InternalSpinCAD.g:998:28: ( (otherlv_0= 'bool' ( (lv_label_1_0= RULE_ID ) ) ( (lv_value_2_0= ruleBOOLEAN ) ) ) )
            // InternalSpinCAD.g:999:1: (otherlv_0= 'bool' ( (lv_label_1_0= RULE_ID ) ) ( (lv_value_2_0= ruleBOOLEAN ) ) )
            {
            // InternalSpinCAD.g:999:1: (otherlv_0= 'bool' ( (lv_label_1_0= RULE_ID ) ) ( (lv_value_2_0= ruleBOOLEAN ) ) )
            // InternalSpinCAD.g:999:3: otherlv_0= 'bool' ( (lv_label_1_0= RULE_ID ) ) ( (lv_value_2_0= ruleBOOLEAN ) )
            {
            otherlv_0=(Token)match(input,23,FOLLOW_8); 

                	newLeafNode(otherlv_0, grammarAccess.getSpinBoolAccess().getBoolKeyword_0());
                
            // InternalSpinCAD.g:1003:1: ( (lv_label_1_0= RULE_ID ) )
            // InternalSpinCAD.g:1004:1: (lv_label_1_0= RULE_ID )
            {
            // InternalSpinCAD.g:1004:1: (lv_label_1_0= RULE_ID )
            // InternalSpinCAD.g:1005:3: lv_label_1_0= RULE_ID
            {
            lv_label_1_0=(Token)match(input,RULE_ID,FOLLOW_11); 

            			newLeafNode(lv_label_1_0, grammarAccess.getSpinBoolAccess().getLabelIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getSpinBoolRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"label",
                    		lv_label_1_0, 
                    		"org.eclipse.xtext.common.Terminals.ID");
            	    

            }


            }

            // InternalSpinCAD.g:1021:2: ( (lv_value_2_0= ruleBOOLEAN ) )
            // InternalSpinCAD.g:1022:1: (lv_value_2_0= ruleBOOLEAN )
            {
            // InternalSpinCAD.g:1022:1: (lv_value_2_0= ruleBOOLEAN )
            // InternalSpinCAD.g:1023:3: lv_value_2_0= ruleBOOLEAN
            {
             
            	        newCompositeNode(grammarAccess.getSpinBoolAccess().getValueBOOLEANParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_2);
            lv_value_2_0=ruleBOOLEAN();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getSpinBoolRule());
            	        }
                   		set(
                   			current, 
                   			"value",
                    		lv_value_2_0, 
                    		"com.holycityaudio.spincad.SpinCAD.BOOLEAN");
            	        afterParserOrEnumRuleCall();
            	    

            }


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
    // $ANTLR end "ruleSpinBool"


    // $ANTLR start "entryRuleControl"
    // InternalSpinCAD.g:1047:1: entryRuleControl returns [EObject current=null] : iv_ruleControl= ruleControl EOF ;
    public final EObject entryRuleControl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleControl = null;


        try {
            // InternalSpinCAD.g:1048:2: (iv_ruleControl= ruleControl EOF )
            // InternalSpinCAD.g:1049:2: iv_ruleControl= ruleControl EOF
            {
             newCompositeNode(grammarAccess.getControlRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleControl=ruleControl();

            state._fsp--;

             current =iv_ruleControl; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleControl"


    // $ANTLR start "ruleControl"
    // InternalSpinCAD.g:1056:1: ruleControl returns [EObject current=null] : (this_SpinSliderLabel_0= ruleSpinSliderLabel | this_SpinCheckBox_1= ruleSpinCheckBox | this_LogFreqSliderLabel_2= ruleLogFreqSliderLabel | this_LogFreq2SliderLabel_3= ruleLogFreq2SliderLabel | this_SpinRadioButton_4= ruleSpinRadioButton | this_SliderLabelCheckBox_5= ruleSliderLabelCheckBox | this_SpinComboBox_6= ruleSpinComboBox | this_SliderLabelSpinner_7= ruleSliderLabelSpinner ) ;
    public final EObject ruleControl() throws RecognitionException {
        EObject current = null;

        EObject this_SpinSliderLabel_0 = null;

        EObject this_SpinCheckBox_1 = null;

        EObject this_LogFreqSliderLabel_2 = null;

        EObject this_LogFreq2SliderLabel_3 = null;

        EObject this_SpinRadioButton_4 = null;

        EObject this_SliderLabelCheckBox_5 = null;

        EObject this_SpinComboBox_6 = null;

        EObject this_SliderLabelSpinner_7 = null;


         enterRule(); 
            
        try {
            // InternalSpinCAD.g:1059:28: ( (this_SpinSliderLabel_0= ruleSpinSliderLabel | this_SpinCheckBox_1= ruleSpinCheckBox | this_LogFreqSliderLabel_2= ruleLogFreqSliderLabel | this_LogFreq2SliderLabel_3= ruleLogFreq2SliderLabel | this_SpinRadioButton_4= ruleSpinRadioButton | this_SliderLabelCheckBox_5= ruleSliderLabelCheckBox | this_SpinComboBox_6= ruleSpinComboBox | this_SliderLabelSpinner_7= ruleSliderLabelSpinner ) )
            // InternalSpinCAD.g:1060:1: (this_SpinSliderLabel_0= ruleSpinSliderLabel | this_SpinCheckBox_1= ruleSpinCheckBox | this_LogFreqSliderLabel_2= ruleLogFreqSliderLabel | this_LogFreq2SliderLabel_3= ruleLogFreq2SliderLabel | this_SpinRadioButton_4= ruleSpinRadioButton | this_SliderLabelCheckBox_5= ruleSliderLabelCheckBox | this_SpinComboBox_6= ruleSpinComboBox | this_SliderLabelSpinner_7= ruleSliderLabelSpinner )
            {
            // InternalSpinCAD.g:1060:1: (this_SpinSliderLabel_0= ruleSpinSliderLabel | this_SpinCheckBox_1= ruleSpinCheckBox | this_LogFreqSliderLabel_2= ruleLogFreqSliderLabel | this_LogFreq2SliderLabel_3= ruleLogFreq2SliderLabel | this_SpinRadioButton_4= ruleSpinRadioButton | this_SliderLabelCheckBox_5= ruleSliderLabelCheckBox | this_SpinComboBox_6= ruleSpinComboBox | this_SliderLabelSpinner_7= ruleSliderLabelSpinner )
            int alt13=8;
            switch ( input.LA(1) ) {
            case 24:
                {
                alt13=1;
                }
                break;
            case 27:
                {
                alt13=2;
                }
                break;
            case 28:
                {
                alt13=3;
                }
                break;
            case 29:
                {
                alt13=4;
                }
                break;
            case 30:
                {
                alt13=5;
                }
                break;
            case 26:
                {
                alt13=6;
                }
                break;
            case 31:
                {
                alt13=7;
                }
                break;
            case 25:
                {
                alt13=8;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }

            switch (alt13) {
                case 1 :
                    // InternalSpinCAD.g:1061:5: this_SpinSliderLabel_0= ruleSpinSliderLabel
                    {
                     
                            newCompositeNode(grammarAccess.getControlAccess().getSpinSliderLabelParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_2);
                    this_SpinSliderLabel_0=ruleSpinSliderLabel();

                    state._fsp--;

                     
                            current = this_SpinSliderLabel_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // InternalSpinCAD.g:1071:5: this_SpinCheckBox_1= ruleSpinCheckBox
                    {
                     
                            newCompositeNode(grammarAccess.getControlAccess().getSpinCheckBoxParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_2);
                    this_SpinCheckBox_1=ruleSpinCheckBox();

                    state._fsp--;

                     
                            current = this_SpinCheckBox_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // InternalSpinCAD.g:1081:5: this_LogFreqSliderLabel_2= ruleLogFreqSliderLabel
                    {
                     
                            newCompositeNode(grammarAccess.getControlAccess().getLogFreqSliderLabelParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_2);
                    this_LogFreqSliderLabel_2=ruleLogFreqSliderLabel();

                    state._fsp--;

                     
                            current = this_LogFreqSliderLabel_2; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 4 :
                    // InternalSpinCAD.g:1091:5: this_LogFreq2SliderLabel_3= ruleLogFreq2SliderLabel
                    {
                     
                            newCompositeNode(grammarAccess.getControlAccess().getLogFreq2SliderLabelParserRuleCall_3()); 
                        
                    pushFollow(FOLLOW_2);
                    this_LogFreq2SliderLabel_3=ruleLogFreq2SliderLabel();

                    state._fsp--;

                     
                            current = this_LogFreq2SliderLabel_3; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 5 :
                    // InternalSpinCAD.g:1101:5: this_SpinRadioButton_4= ruleSpinRadioButton
                    {
                     
                            newCompositeNode(grammarAccess.getControlAccess().getSpinRadioButtonParserRuleCall_4()); 
                        
                    pushFollow(FOLLOW_2);
                    this_SpinRadioButton_4=ruleSpinRadioButton();

                    state._fsp--;

                     
                            current = this_SpinRadioButton_4; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 6 :
                    // InternalSpinCAD.g:1111:5: this_SliderLabelCheckBox_5= ruleSliderLabelCheckBox
                    {
                     
                            newCompositeNode(grammarAccess.getControlAccess().getSliderLabelCheckBoxParserRuleCall_5()); 
                        
                    pushFollow(FOLLOW_2);
                    this_SliderLabelCheckBox_5=ruleSliderLabelCheckBox();

                    state._fsp--;

                     
                            current = this_SliderLabelCheckBox_5; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 7 :
                    // InternalSpinCAD.g:1121:5: this_SpinComboBox_6= ruleSpinComboBox
                    {
                     
                            newCompositeNode(grammarAccess.getControlAccess().getSpinComboBoxParserRuleCall_6()); 
                        
                    pushFollow(FOLLOW_2);
                    this_SpinComboBox_6=ruleSpinComboBox();

                    state._fsp--;

                     
                            current = this_SpinComboBox_6; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 8 :
                    // InternalSpinCAD.g:1131:5: this_SliderLabelSpinner_7= ruleSliderLabelSpinner
                    {
                     
                            newCompositeNode(grammarAccess.getControlAccess().getSliderLabelSpinnerParserRuleCall_7()); 
                        
                    pushFollow(FOLLOW_2);
                    this_SliderLabelSpinner_7=ruleSliderLabelSpinner();

                    state._fsp--;

                     
                            current = this_SliderLabelSpinner_7; 
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
    // $ANTLR end "ruleControl"


    // $ANTLR start "entryRuleSpinSliderLabel"
    // InternalSpinCAD.g:1147:1: entryRuleSpinSliderLabel returns [EObject current=null] : iv_ruleSpinSliderLabel= ruleSpinSliderLabel EOF ;
    public final EObject entryRuleSpinSliderLabel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSpinSliderLabel = null;


        try {
            // InternalSpinCAD.g:1148:2: (iv_ruleSpinSliderLabel= ruleSpinSliderLabel EOF )
            // InternalSpinCAD.g:1149:2: iv_ruleSpinSliderLabel= ruleSpinSliderLabel EOF
            {
             newCompositeNode(grammarAccess.getSpinSliderLabelRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSpinSliderLabel=ruleSpinSliderLabel();

            state._fsp--;

             current =iv_ruleSpinSliderLabel; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleSpinSliderLabel"


    // $ANTLR start "ruleSpinSliderLabel"
    // InternalSpinCAD.g:1156:1: ruleSpinSliderLabel returns [EObject current=null] : (otherlv_0= '@sliderLabel' ( (lv_ename_1_0= RULE_ID ) ) ( ( (lv_controlName_2_1= RULE_ID | lv_controlName_2_2= RULE_STRING ) ) ) ( ( (lv_minVal_3_0= ruleSPINDOUBLE ) ) ( (lv_maxVal_4_0= ruleSPINDOUBLE ) ) ( (lv_initVal_5_0= ruleSPINDOUBLE ) ) ( (lv_multiplier_6_0= ruleSPINDOUBLE ) ) ( (lv_precision_7_0= RULE_INT ) ) ( (lv_option_8_0= RULE_ID ) )? )? ) ;
    public final EObject ruleSpinSliderLabel() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_ename_1_0=null;
        Token lv_controlName_2_1=null;
        Token lv_controlName_2_2=null;
        Token lv_precision_7_0=null;
        Token lv_option_8_0=null;
        AntlrDatatypeRuleToken lv_minVal_3_0 = null;

        AntlrDatatypeRuleToken lv_maxVal_4_0 = null;

        AntlrDatatypeRuleToken lv_initVal_5_0 = null;

        AntlrDatatypeRuleToken lv_multiplier_6_0 = null;


         enterRule(); 
            
        try {
            // InternalSpinCAD.g:1159:28: ( (otherlv_0= '@sliderLabel' ( (lv_ename_1_0= RULE_ID ) ) ( ( (lv_controlName_2_1= RULE_ID | lv_controlName_2_2= RULE_STRING ) ) ) ( ( (lv_minVal_3_0= ruleSPINDOUBLE ) ) ( (lv_maxVal_4_0= ruleSPINDOUBLE ) ) ( (lv_initVal_5_0= ruleSPINDOUBLE ) ) ( (lv_multiplier_6_0= ruleSPINDOUBLE ) ) ( (lv_precision_7_0= RULE_INT ) ) ( (lv_option_8_0= RULE_ID ) )? )? ) )
            // InternalSpinCAD.g:1160:1: (otherlv_0= '@sliderLabel' ( (lv_ename_1_0= RULE_ID ) ) ( ( (lv_controlName_2_1= RULE_ID | lv_controlName_2_2= RULE_STRING ) ) ) ( ( (lv_minVal_3_0= ruleSPINDOUBLE ) ) ( (lv_maxVal_4_0= ruleSPINDOUBLE ) ) ( (lv_initVal_5_0= ruleSPINDOUBLE ) ) ( (lv_multiplier_6_0= ruleSPINDOUBLE ) ) ( (lv_precision_7_0= RULE_INT ) ) ( (lv_option_8_0= RULE_ID ) )? )? )
            {
            // InternalSpinCAD.g:1160:1: (otherlv_0= '@sliderLabel' ( (lv_ename_1_0= RULE_ID ) ) ( ( (lv_controlName_2_1= RULE_ID | lv_controlName_2_2= RULE_STRING ) ) ) ( ( (lv_minVal_3_0= ruleSPINDOUBLE ) ) ( (lv_maxVal_4_0= ruleSPINDOUBLE ) ) ( (lv_initVal_5_0= ruleSPINDOUBLE ) ) ( (lv_multiplier_6_0= ruleSPINDOUBLE ) ) ( (lv_precision_7_0= RULE_INT ) ) ( (lv_option_8_0= RULE_ID ) )? )? )
            // InternalSpinCAD.g:1160:3: otherlv_0= '@sliderLabel' ( (lv_ename_1_0= RULE_ID ) ) ( ( (lv_controlName_2_1= RULE_ID | lv_controlName_2_2= RULE_STRING ) ) ) ( ( (lv_minVal_3_0= ruleSPINDOUBLE ) ) ( (lv_maxVal_4_0= ruleSPINDOUBLE ) ) ( (lv_initVal_5_0= ruleSPINDOUBLE ) ) ( (lv_multiplier_6_0= ruleSPINDOUBLE ) ) ( (lv_precision_7_0= RULE_INT ) ) ( (lv_option_8_0= RULE_ID ) )? )?
            {
            otherlv_0=(Token)match(input,24,FOLLOW_8); 

                	newLeafNode(otherlv_0, grammarAccess.getSpinSliderLabelAccess().getSliderLabelKeyword_0());
                
            // InternalSpinCAD.g:1164:1: ( (lv_ename_1_0= RULE_ID ) )
            // InternalSpinCAD.g:1165:1: (lv_ename_1_0= RULE_ID )
            {
            // InternalSpinCAD.g:1165:1: (lv_ename_1_0= RULE_ID )
            // InternalSpinCAD.g:1166:3: lv_ename_1_0= RULE_ID
            {
            lv_ename_1_0=(Token)match(input,RULE_ID,FOLLOW_3); 

            			newLeafNode(lv_ename_1_0, grammarAccess.getSpinSliderLabelAccess().getEnameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getSpinSliderLabelRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"ename",
                    		lv_ename_1_0, 
                    		"org.eclipse.xtext.common.Terminals.ID");
            	    

            }


            }

            // InternalSpinCAD.g:1182:2: ( ( (lv_controlName_2_1= RULE_ID | lv_controlName_2_2= RULE_STRING ) ) )
            // InternalSpinCAD.g:1183:1: ( (lv_controlName_2_1= RULE_ID | lv_controlName_2_2= RULE_STRING ) )
            {
            // InternalSpinCAD.g:1183:1: ( (lv_controlName_2_1= RULE_ID | lv_controlName_2_2= RULE_STRING ) )
            // InternalSpinCAD.g:1184:1: (lv_controlName_2_1= RULE_ID | lv_controlName_2_2= RULE_STRING )
            {
            // InternalSpinCAD.g:1184:1: (lv_controlName_2_1= RULE_ID | lv_controlName_2_2= RULE_STRING )
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==RULE_ID) ) {
                alt14=1;
            }
            else if ( (LA14_0==RULE_STRING) ) {
                alt14=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }
            switch (alt14) {
                case 1 :
                    // InternalSpinCAD.g:1185:3: lv_controlName_2_1= RULE_ID
                    {
                    lv_controlName_2_1=(Token)match(input,RULE_ID,FOLLOW_12); 

                    			newLeafNode(lv_controlName_2_1, grammarAccess.getSpinSliderLabelAccess().getControlNameIDTerminalRuleCall_2_0_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getSpinSliderLabelRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"controlName",
                            		lv_controlName_2_1, 
                            		"org.eclipse.xtext.common.Terminals.ID");
                    	    

                    }
                    break;
                case 2 :
                    // InternalSpinCAD.g:1200:8: lv_controlName_2_2= RULE_STRING
                    {
                    lv_controlName_2_2=(Token)match(input,RULE_STRING,FOLLOW_12); 

                    			newLeafNode(lv_controlName_2_2, grammarAccess.getSpinSliderLabelAccess().getControlNameSTRINGTerminalRuleCall_2_0_1()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getSpinSliderLabelRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"controlName",
                            		lv_controlName_2_2, 
                            		"com.holycityaudio.spincad.SpinCAD.STRING");
                    	    

                    }
                    break;

            }


            }


            }

            // InternalSpinCAD.g:1218:2: ( ( (lv_minVal_3_0= ruleSPINDOUBLE ) ) ( (lv_maxVal_4_0= ruleSPINDOUBLE ) ) ( (lv_initVal_5_0= ruleSPINDOUBLE ) ) ( (lv_multiplier_6_0= ruleSPINDOUBLE ) ) ( (lv_precision_7_0= RULE_INT ) ) ( (lv_option_8_0= RULE_ID ) )? )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==RULE_INT||LA16_0==85) ) {
                alt16=1;
            }
            else if ( (LA16_0==RULE_ID) ) {
                int LA16_2 = input.LA(2);

                if ( (LA16_2==RULE_ID||LA16_2==RULE_INT||LA16_2==85) ) {
                    alt16=1;
                }
            }
            switch (alt16) {
                case 1 :
                    // InternalSpinCAD.g:1218:3: ( (lv_minVal_3_0= ruleSPINDOUBLE ) ) ( (lv_maxVal_4_0= ruleSPINDOUBLE ) ) ( (lv_initVal_5_0= ruleSPINDOUBLE ) ) ( (lv_multiplier_6_0= ruleSPINDOUBLE ) ) ( (lv_precision_7_0= RULE_INT ) ) ( (lv_option_8_0= RULE_ID ) )?
                    {
                    // InternalSpinCAD.g:1218:3: ( (lv_minVal_3_0= ruleSPINDOUBLE ) )
                    // InternalSpinCAD.g:1219:1: (lv_minVal_3_0= ruleSPINDOUBLE )
                    {
                    // InternalSpinCAD.g:1219:1: (lv_minVal_3_0= ruleSPINDOUBLE )
                    // InternalSpinCAD.g:1220:3: lv_minVal_3_0= ruleSPINDOUBLE
                    {
                     
                    	        newCompositeNode(grammarAccess.getSpinSliderLabelAccess().getMinValSPINDOUBLEParserRuleCall_3_0_0()); 
                    	    
                    pushFollow(FOLLOW_9);
                    lv_minVal_3_0=ruleSPINDOUBLE();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getSpinSliderLabelRule());
                    	        }
                           		set(
                           			current, 
                           			"minVal",
                            		lv_minVal_3_0, 
                            		"com.holycityaudio.spincad.SpinCAD.SPINDOUBLE");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // InternalSpinCAD.g:1236:2: ( (lv_maxVal_4_0= ruleSPINDOUBLE ) )
                    // InternalSpinCAD.g:1237:1: (lv_maxVal_4_0= ruleSPINDOUBLE )
                    {
                    // InternalSpinCAD.g:1237:1: (lv_maxVal_4_0= ruleSPINDOUBLE )
                    // InternalSpinCAD.g:1238:3: lv_maxVal_4_0= ruleSPINDOUBLE
                    {
                     
                    	        newCompositeNode(grammarAccess.getSpinSliderLabelAccess().getMaxValSPINDOUBLEParserRuleCall_3_1_0()); 
                    	    
                    pushFollow(FOLLOW_9);
                    lv_maxVal_4_0=ruleSPINDOUBLE();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getSpinSliderLabelRule());
                    	        }
                           		set(
                           			current, 
                           			"maxVal",
                            		lv_maxVal_4_0, 
                            		"com.holycityaudio.spincad.SpinCAD.SPINDOUBLE");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // InternalSpinCAD.g:1254:2: ( (lv_initVal_5_0= ruleSPINDOUBLE ) )
                    // InternalSpinCAD.g:1255:1: (lv_initVal_5_0= ruleSPINDOUBLE )
                    {
                    // InternalSpinCAD.g:1255:1: (lv_initVal_5_0= ruleSPINDOUBLE )
                    // InternalSpinCAD.g:1256:3: lv_initVal_5_0= ruleSPINDOUBLE
                    {
                     
                    	        newCompositeNode(grammarAccess.getSpinSliderLabelAccess().getInitValSPINDOUBLEParserRuleCall_3_2_0()); 
                    	    
                    pushFollow(FOLLOW_9);
                    lv_initVal_5_0=ruleSPINDOUBLE();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getSpinSliderLabelRule());
                    	        }
                           		set(
                           			current, 
                           			"initVal",
                            		lv_initVal_5_0, 
                            		"com.holycityaudio.spincad.SpinCAD.SPINDOUBLE");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // InternalSpinCAD.g:1272:2: ( (lv_multiplier_6_0= ruleSPINDOUBLE ) )
                    // InternalSpinCAD.g:1273:1: (lv_multiplier_6_0= ruleSPINDOUBLE )
                    {
                    // InternalSpinCAD.g:1273:1: (lv_multiplier_6_0= ruleSPINDOUBLE )
                    // InternalSpinCAD.g:1274:3: lv_multiplier_6_0= ruleSPINDOUBLE
                    {
                     
                    	        newCompositeNode(grammarAccess.getSpinSliderLabelAccess().getMultiplierSPINDOUBLEParserRuleCall_3_3_0()); 
                    	    
                    pushFollow(FOLLOW_10);
                    lv_multiplier_6_0=ruleSPINDOUBLE();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getSpinSliderLabelRule());
                    	        }
                           		set(
                           			current, 
                           			"multiplier",
                            		lv_multiplier_6_0, 
                            		"com.holycityaudio.spincad.SpinCAD.SPINDOUBLE");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // InternalSpinCAD.g:1290:2: ( (lv_precision_7_0= RULE_INT ) )
                    // InternalSpinCAD.g:1291:1: (lv_precision_7_0= RULE_INT )
                    {
                    // InternalSpinCAD.g:1291:1: (lv_precision_7_0= RULE_INT )
                    // InternalSpinCAD.g:1292:3: lv_precision_7_0= RULE_INT
                    {
                    lv_precision_7_0=(Token)match(input,RULE_INT,FOLLOW_13); 

                    			newLeafNode(lv_precision_7_0, grammarAccess.getSpinSliderLabelAccess().getPrecisionINTTerminalRuleCall_3_4_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getSpinSliderLabelRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"precision",
                            		lv_precision_7_0, 
                            		"org.eclipse.xtext.common.Terminals.INT");
                    	    

                    }


                    }

                    // InternalSpinCAD.g:1308:2: ( (lv_option_8_0= RULE_ID ) )?
                    int alt15=2;
                    int LA15_0 = input.LA(1);

                    if ( (LA15_0==RULE_ID) ) {
                        int LA15_1 = input.LA(2);

                        if ( (LA15_1==EOF||LA15_1==RULE_ID||LA15_1==RULE_SC_COMMENT||(LA15_1>=19 && LA15_1<=31)||(LA15_1>=33 && LA15_1<=55)||(LA15_1>=57 && LA15_1<=83)) ) {
                            alt15=1;
                        }
                    }
                    switch (alt15) {
                        case 1 :
                            // InternalSpinCAD.g:1309:1: (lv_option_8_0= RULE_ID )
                            {
                            // InternalSpinCAD.g:1309:1: (lv_option_8_0= RULE_ID )
                            // InternalSpinCAD.g:1310:3: lv_option_8_0= RULE_ID
                            {
                            lv_option_8_0=(Token)match(input,RULE_ID,FOLLOW_2); 

                            			newLeafNode(lv_option_8_0, grammarAccess.getSpinSliderLabelAccess().getOptionIDTerminalRuleCall_3_5_0()); 
                            		

                            	        if (current==null) {
                            	            current = createModelElement(grammarAccess.getSpinSliderLabelRule());
                            	        }
                                   		setWithLastConsumed(
                                   			current, 
                                   			"option",
                                    		lv_option_8_0, 
                                    		"org.eclipse.xtext.common.Terminals.ID");
                            	    

                            }


                            }
                            break;

                    }


                    }
                    break;

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
    // $ANTLR end "ruleSpinSliderLabel"


    // $ANTLR start "entryRuleSliderLabelSpinner"
    // InternalSpinCAD.g:1334:1: entryRuleSliderLabelSpinner returns [EObject current=null] : iv_ruleSliderLabelSpinner= ruleSliderLabelSpinner EOF ;
    public final EObject entryRuleSliderLabelSpinner() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSliderLabelSpinner = null;


        try {
            // InternalSpinCAD.g:1335:2: (iv_ruleSliderLabelSpinner= ruleSliderLabelSpinner EOF )
            // InternalSpinCAD.g:1336:2: iv_ruleSliderLabelSpinner= ruleSliderLabelSpinner EOF
            {
             newCompositeNode(grammarAccess.getSliderLabelSpinnerRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSliderLabelSpinner=ruleSliderLabelSpinner();

            state._fsp--;

             current =iv_ruleSliderLabelSpinner; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleSliderLabelSpinner"


    // $ANTLR start "ruleSliderLabelSpinner"
    // InternalSpinCAD.g:1343:1: ruleSliderLabelSpinner returns [EObject current=null] : (otherlv_0= '@sliderLabelSpinner' ( (lv_ename_1_0= RULE_ID ) ) ( ( (lv_controlName_2_1= RULE_ID | lv_controlName_2_2= RULE_STRING ) ) ) ( ( (lv_minVal_3_0= ruleSPINDOUBLE ) ) ( (lv_maxVal_4_0= ruleSPINDOUBLE ) ) ( (lv_initVal_5_0= ruleSPINDOUBLE ) ) ( (lv_multiplier_6_0= ruleSPINDOUBLE ) ) ( (lv_precision_7_0= RULE_INT ) ) ( (lv_option_8_0= RULE_ID ) )? )? ) ;
    public final EObject ruleSliderLabelSpinner() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_ename_1_0=null;
        Token lv_controlName_2_1=null;
        Token lv_controlName_2_2=null;
        Token lv_precision_7_0=null;
        Token lv_option_8_0=null;
        AntlrDatatypeRuleToken lv_minVal_3_0 = null;

        AntlrDatatypeRuleToken lv_maxVal_4_0 = null;

        AntlrDatatypeRuleToken lv_initVal_5_0 = null;

        AntlrDatatypeRuleToken lv_multiplier_6_0 = null;


         enterRule(); 
            
        try {
            // InternalSpinCAD.g:1346:28: ( (otherlv_0= '@sliderLabelSpinner' ( (lv_ename_1_0= RULE_ID ) ) ( ( (lv_controlName_2_1= RULE_ID | lv_controlName_2_2= RULE_STRING ) ) ) ( ( (lv_minVal_3_0= ruleSPINDOUBLE ) ) ( (lv_maxVal_4_0= ruleSPINDOUBLE ) ) ( (lv_initVal_5_0= ruleSPINDOUBLE ) ) ( (lv_multiplier_6_0= ruleSPINDOUBLE ) ) ( (lv_precision_7_0= RULE_INT ) ) ( (lv_option_8_0= RULE_ID ) )? )? ) )
            // InternalSpinCAD.g:1347:1: (otherlv_0= '@sliderLabelSpinner' ( (lv_ename_1_0= RULE_ID ) ) ( ( (lv_controlName_2_1= RULE_ID | lv_controlName_2_2= RULE_STRING ) ) ) ( ( (lv_minVal_3_0= ruleSPINDOUBLE ) ) ( (lv_maxVal_4_0= ruleSPINDOUBLE ) ) ( (lv_initVal_5_0= ruleSPINDOUBLE ) ) ( (lv_multiplier_6_0= ruleSPINDOUBLE ) ) ( (lv_precision_7_0= RULE_INT ) ) ( (lv_option_8_0= RULE_ID ) )? )? )
            {
            // InternalSpinCAD.g:1347:1: (otherlv_0= '@sliderLabelSpinner' ( (lv_ename_1_0= RULE_ID ) ) ( ( (lv_controlName_2_1= RULE_ID | lv_controlName_2_2= RULE_STRING ) ) ) ( ( (lv_minVal_3_0= ruleSPINDOUBLE ) ) ( (lv_maxVal_4_0= ruleSPINDOUBLE ) ) ( (lv_initVal_5_0= ruleSPINDOUBLE ) ) ( (lv_multiplier_6_0= ruleSPINDOUBLE ) ) ( (lv_precision_7_0= RULE_INT ) ) ( (lv_option_8_0= RULE_ID ) )? )? )
            // InternalSpinCAD.g:1347:3: otherlv_0= '@sliderLabelSpinner' ( (lv_ename_1_0= RULE_ID ) ) ( ( (lv_controlName_2_1= RULE_ID | lv_controlName_2_2= RULE_STRING ) ) ) ( ( (lv_minVal_3_0= ruleSPINDOUBLE ) ) ( (lv_maxVal_4_0= ruleSPINDOUBLE ) ) ( (lv_initVal_5_0= ruleSPINDOUBLE ) ) ( (lv_multiplier_6_0= ruleSPINDOUBLE ) ) ( (lv_precision_7_0= RULE_INT ) ) ( (lv_option_8_0= RULE_ID ) )? )?
            {
            otherlv_0=(Token)match(input,25,FOLLOW_8); 

                	newLeafNode(otherlv_0, grammarAccess.getSliderLabelSpinnerAccess().getSliderLabelSpinnerKeyword_0());
                
            // InternalSpinCAD.g:1351:1: ( (lv_ename_1_0= RULE_ID ) )
            // InternalSpinCAD.g:1352:1: (lv_ename_1_0= RULE_ID )
            {
            // InternalSpinCAD.g:1352:1: (lv_ename_1_0= RULE_ID )
            // InternalSpinCAD.g:1353:3: lv_ename_1_0= RULE_ID
            {
            lv_ename_1_0=(Token)match(input,RULE_ID,FOLLOW_3); 

            			newLeafNode(lv_ename_1_0, grammarAccess.getSliderLabelSpinnerAccess().getEnameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getSliderLabelSpinnerRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"ename",
                    		lv_ename_1_0, 
                    		"org.eclipse.xtext.common.Terminals.ID");
            	    

            }


            }

            // InternalSpinCAD.g:1369:2: ( ( (lv_controlName_2_1= RULE_ID | lv_controlName_2_2= RULE_STRING ) ) )
            // InternalSpinCAD.g:1370:1: ( (lv_controlName_2_1= RULE_ID | lv_controlName_2_2= RULE_STRING ) )
            {
            // InternalSpinCAD.g:1370:1: ( (lv_controlName_2_1= RULE_ID | lv_controlName_2_2= RULE_STRING ) )
            // InternalSpinCAD.g:1371:1: (lv_controlName_2_1= RULE_ID | lv_controlName_2_2= RULE_STRING )
            {
            // InternalSpinCAD.g:1371:1: (lv_controlName_2_1= RULE_ID | lv_controlName_2_2= RULE_STRING )
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==RULE_ID) ) {
                alt17=1;
            }
            else if ( (LA17_0==RULE_STRING) ) {
                alt17=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 17, 0, input);

                throw nvae;
            }
            switch (alt17) {
                case 1 :
                    // InternalSpinCAD.g:1372:3: lv_controlName_2_1= RULE_ID
                    {
                    lv_controlName_2_1=(Token)match(input,RULE_ID,FOLLOW_12); 

                    			newLeafNode(lv_controlName_2_1, grammarAccess.getSliderLabelSpinnerAccess().getControlNameIDTerminalRuleCall_2_0_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getSliderLabelSpinnerRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"controlName",
                            		lv_controlName_2_1, 
                            		"org.eclipse.xtext.common.Terminals.ID");
                    	    

                    }
                    break;
                case 2 :
                    // InternalSpinCAD.g:1387:8: lv_controlName_2_2= RULE_STRING
                    {
                    lv_controlName_2_2=(Token)match(input,RULE_STRING,FOLLOW_12); 

                    			newLeafNode(lv_controlName_2_2, grammarAccess.getSliderLabelSpinnerAccess().getControlNameSTRINGTerminalRuleCall_2_0_1()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getSliderLabelSpinnerRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"controlName",
                            		lv_controlName_2_2, 
                            		"com.holycityaudio.spincad.SpinCAD.STRING");
                    	    

                    }
                    break;

            }


            }


            }

            // InternalSpinCAD.g:1405:2: ( ( (lv_minVal_3_0= ruleSPINDOUBLE ) ) ( (lv_maxVal_4_0= ruleSPINDOUBLE ) ) ( (lv_initVal_5_0= ruleSPINDOUBLE ) ) ( (lv_multiplier_6_0= ruleSPINDOUBLE ) ) ( (lv_precision_7_0= RULE_INT ) ) ( (lv_option_8_0= RULE_ID ) )? )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==RULE_INT||LA19_0==85) ) {
                alt19=1;
            }
            else if ( (LA19_0==RULE_ID) ) {
                int LA19_2 = input.LA(2);

                if ( (LA19_2==RULE_ID||LA19_2==RULE_INT||LA19_2==85) ) {
                    alt19=1;
                }
            }
            switch (alt19) {
                case 1 :
                    // InternalSpinCAD.g:1405:3: ( (lv_minVal_3_0= ruleSPINDOUBLE ) ) ( (lv_maxVal_4_0= ruleSPINDOUBLE ) ) ( (lv_initVal_5_0= ruleSPINDOUBLE ) ) ( (lv_multiplier_6_0= ruleSPINDOUBLE ) ) ( (lv_precision_7_0= RULE_INT ) ) ( (lv_option_8_0= RULE_ID ) )?
                    {
                    // InternalSpinCAD.g:1405:3: ( (lv_minVal_3_0= ruleSPINDOUBLE ) )
                    // InternalSpinCAD.g:1406:1: (lv_minVal_3_0= ruleSPINDOUBLE )
                    {
                    // InternalSpinCAD.g:1406:1: (lv_minVal_3_0= ruleSPINDOUBLE )
                    // InternalSpinCAD.g:1407:3: lv_minVal_3_0= ruleSPINDOUBLE
                    {
                     
                    	        newCompositeNode(grammarAccess.getSliderLabelSpinnerAccess().getMinValSPINDOUBLEParserRuleCall_3_0_0()); 
                    	    
                    pushFollow(FOLLOW_9);
                    lv_minVal_3_0=ruleSPINDOUBLE();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getSliderLabelSpinnerRule());
                    	        }
                           		set(
                           			current, 
                           			"minVal",
                            		lv_minVal_3_0, 
                            		"com.holycityaudio.spincad.SpinCAD.SPINDOUBLE");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // InternalSpinCAD.g:1423:2: ( (lv_maxVal_4_0= ruleSPINDOUBLE ) )
                    // InternalSpinCAD.g:1424:1: (lv_maxVal_4_0= ruleSPINDOUBLE )
                    {
                    // InternalSpinCAD.g:1424:1: (lv_maxVal_4_0= ruleSPINDOUBLE )
                    // InternalSpinCAD.g:1425:3: lv_maxVal_4_0= ruleSPINDOUBLE
                    {
                     
                    	        newCompositeNode(grammarAccess.getSliderLabelSpinnerAccess().getMaxValSPINDOUBLEParserRuleCall_3_1_0()); 
                    	    
                    pushFollow(FOLLOW_9);
                    lv_maxVal_4_0=ruleSPINDOUBLE();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getSliderLabelSpinnerRule());
                    	        }
                           		set(
                           			current, 
                           			"maxVal",
                            		lv_maxVal_4_0, 
                            		"com.holycityaudio.spincad.SpinCAD.SPINDOUBLE");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // InternalSpinCAD.g:1441:2: ( (lv_initVal_5_0= ruleSPINDOUBLE ) )
                    // InternalSpinCAD.g:1442:1: (lv_initVal_5_0= ruleSPINDOUBLE )
                    {
                    // InternalSpinCAD.g:1442:1: (lv_initVal_5_0= ruleSPINDOUBLE )
                    // InternalSpinCAD.g:1443:3: lv_initVal_5_0= ruleSPINDOUBLE
                    {
                     
                    	        newCompositeNode(grammarAccess.getSliderLabelSpinnerAccess().getInitValSPINDOUBLEParserRuleCall_3_2_0()); 
                    	    
                    pushFollow(FOLLOW_9);
                    lv_initVal_5_0=ruleSPINDOUBLE();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getSliderLabelSpinnerRule());
                    	        }
                           		set(
                           			current, 
                           			"initVal",
                            		lv_initVal_5_0, 
                            		"com.holycityaudio.spincad.SpinCAD.SPINDOUBLE");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // InternalSpinCAD.g:1459:2: ( (lv_multiplier_6_0= ruleSPINDOUBLE ) )
                    // InternalSpinCAD.g:1460:1: (lv_multiplier_6_0= ruleSPINDOUBLE )
                    {
                    // InternalSpinCAD.g:1460:1: (lv_multiplier_6_0= ruleSPINDOUBLE )
                    // InternalSpinCAD.g:1461:3: lv_multiplier_6_0= ruleSPINDOUBLE
                    {
                     
                    	        newCompositeNode(grammarAccess.getSliderLabelSpinnerAccess().getMultiplierSPINDOUBLEParserRuleCall_3_3_0()); 
                    	    
                    pushFollow(FOLLOW_10);
                    lv_multiplier_6_0=ruleSPINDOUBLE();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getSliderLabelSpinnerRule());
                    	        }
                           		set(
                           			current, 
                           			"multiplier",
                            		lv_multiplier_6_0, 
                            		"com.holycityaudio.spincad.SpinCAD.SPINDOUBLE");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // InternalSpinCAD.g:1477:2: ( (lv_precision_7_0= RULE_INT ) )
                    // InternalSpinCAD.g:1478:1: (lv_precision_7_0= RULE_INT )
                    {
                    // InternalSpinCAD.g:1478:1: (lv_precision_7_0= RULE_INT )
                    // InternalSpinCAD.g:1479:3: lv_precision_7_0= RULE_INT
                    {
                    lv_precision_7_0=(Token)match(input,RULE_INT,FOLLOW_13); 

                    			newLeafNode(lv_precision_7_0, grammarAccess.getSliderLabelSpinnerAccess().getPrecisionINTTerminalRuleCall_3_4_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getSliderLabelSpinnerRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"precision",
                            		lv_precision_7_0, 
                            		"org.eclipse.xtext.common.Terminals.INT");
                    	    

                    }


                    }

                    // InternalSpinCAD.g:1495:2: ( (lv_option_8_0= RULE_ID ) )?
                    int alt18=2;
                    int LA18_0 = input.LA(1);

                    if ( (LA18_0==RULE_ID) ) {
                        int LA18_1 = input.LA(2);

                        if ( (LA18_1==EOF||LA18_1==RULE_ID||LA18_1==RULE_SC_COMMENT||(LA18_1>=19 && LA18_1<=31)||(LA18_1>=33 && LA18_1<=55)||(LA18_1>=57 && LA18_1<=83)) ) {
                            alt18=1;
                        }
                    }
                    switch (alt18) {
                        case 1 :
                            // InternalSpinCAD.g:1496:1: (lv_option_8_0= RULE_ID )
                            {
                            // InternalSpinCAD.g:1496:1: (lv_option_8_0= RULE_ID )
                            // InternalSpinCAD.g:1497:3: lv_option_8_0= RULE_ID
                            {
                            lv_option_8_0=(Token)match(input,RULE_ID,FOLLOW_2); 

                            			newLeafNode(lv_option_8_0, grammarAccess.getSliderLabelSpinnerAccess().getOptionIDTerminalRuleCall_3_5_0()); 
                            		

                            	        if (current==null) {
                            	            current = createModelElement(grammarAccess.getSliderLabelSpinnerRule());
                            	        }
                                   		setWithLastConsumed(
                                   			current, 
                                   			"option",
                                    		lv_option_8_0, 
                                    		"org.eclipse.xtext.common.Terminals.ID");
                            	    

                            }


                            }
                            break;

                    }


                    }
                    break;

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
    // $ANTLR end "ruleSliderLabelSpinner"


    // $ANTLR start "entryRuleSliderLabelCheckBox"
    // InternalSpinCAD.g:1521:1: entryRuleSliderLabelCheckBox returns [EObject current=null] : iv_ruleSliderLabelCheckBox= ruleSliderLabelCheckBox EOF ;
    public final EObject entryRuleSliderLabelCheckBox() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSliderLabelCheckBox = null;


        try {
            // InternalSpinCAD.g:1522:2: (iv_ruleSliderLabelCheckBox= ruleSliderLabelCheckBox EOF )
            // InternalSpinCAD.g:1523:2: iv_ruleSliderLabelCheckBox= ruleSliderLabelCheckBox EOF
            {
             newCompositeNode(grammarAccess.getSliderLabelCheckBoxRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSliderLabelCheckBox=ruleSliderLabelCheckBox();

            state._fsp--;

             current =iv_ruleSliderLabelCheckBox; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleSliderLabelCheckBox"


    // $ANTLR start "ruleSliderLabelCheckBox"
    // InternalSpinCAD.g:1530:1: ruleSliderLabelCheckBox returns [EObject current=null] : (otherlv_0= '@sliderLabelCheckBox' ( (lv_ename_1_0= RULE_ID ) ) ( ( (lv_controlName_2_1= RULE_ID | lv_controlName_2_2= RULE_STRING ) ) ) ( ( (lv_minVal_3_0= ruleSPINDOUBLE ) ) ( (lv_maxVal_4_0= ruleSPINDOUBLE ) ) ( (lv_initVal_5_0= ruleSPINDOUBLE ) ) ( (lv_multiplier_6_0= ruleSPINDOUBLE ) ) ( (lv_precision_7_0= RULE_INT ) ) ( (lv_option_8_0= RULE_ID ) )? )? ) ;
    public final EObject ruleSliderLabelCheckBox() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_ename_1_0=null;
        Token lv_controlName_2_1=null;
        Token lv_controlName_2_2=null;
        Token lv_precision_7_0=null;
        Token lv_option_8_0=null;
        AntlrDatatypeRuleToken lv_minVal_3_0 = null;

        AntlrDatatypeRuleToken lv_maxVal_4_0 = null;

        AntlrDatatypeRuleToken lv_initVal_5_0 = null;

        AntlrDatatypeRuleToken lv_multiplier_6_0 = null;


         enterRule(); 
            
        try {
            // InternalSpinCAD.g:1533:28: ( (otherlv_0= '@sliderLabelCheckBox' ( (lv_ename_1_0= RULE_ID ) ) ( ( (lv_controlName_2_1= RULE_ID | lv_controlName_2_2= RULE_STRING ) ) ) ( ( (lv_minVal_3_0= ruleSPINDOUBLE ) ) ( (lv_maxVal_4_0= ruleSPINDOUBLE ) ) ( (lv_initVal_5_0= ruleSPINDOUBLE ) ) ( (lv_multiplier_6_0= ruleSPINDOUBLE ) ) ( (lv_precision_7_0= RULE_INT ) ) ( (lv_option_8_0= RULE_ID ) )? )? ) )
            // InternalSpinCAD.g:1534:1: (otherlv_0= '@sliderLabelCheckBox' ( (lv_ename_1_0= RULE_ID ) ) ( ( (lv_controlName_2_1= RULE_ID | lv_controlName_2_2= RULE_STRING ) ) ) ( ( (lv_minVal_3_0= ruleSPINDOUBLE ) ) ( (lv_maxVal_4_0= ruleSPINDOUBLE ) ) ( (lv_initVal_5_0= ruleSPINDOUBLE ) ) ( (lv_multiplier_6_0= ruleSPINDOUBLE ) ) ( (lv_precision_7_0= RULE_INT ) ) ( (lv_option_8_0= RULE_ID ) )? )? )
            {
            // InternalSpinCAD.g:1534:1: (otherlv_0= '@sliderLabelCheckBox' ( (lv_ename_1_0= RULE_ID ) ) ( ( (lv_controlName_2_1= RULE_ID | lv_controlName_2_2= RULE_STRING ) ) ) ( ( (lv_minVal_3_0= ruleSPINDOUBLE ) ) ( (lv_maxVal_4_0= ruleSPINDOUBLE ) ) ( (lv_initVal_5_0= ruleSPINDOUBLE ) ) ( (lv_multiplier_6_0= ruleSPINDOUBLE ) ) ( (lv_precision_7_0= RULE_INT ) ) ( (lv_option_8_0= RULE_ID ) )? )? )
            // InternalSpinCAD.g:1534:3: otherlv_0= '@sliderLabelCheckBox' ( (lv_ename_1_0= RULE_ID ) ) ( ( (lv_controlName_2_1= RULE_ID | lv_controlName_2_2= RULE_STRING ) ) ) ( ( (lv_minVal_3_0= ruleSPINDOUBLE ) ) ( (lv_maxVal_4_0= ruleSPINDOUBLE ) ) ( (lv_initVal_5_0= ruleSPINDOUBLE ) ) ( (lv_multiplier_6_0= ruleSPINDOUBLE ) ) ( (lv_precision_7_0= RULE_INT ) ) ( (lv_option_8_0= RULE_ID ) )? )?
            {
            otherlv_0=(Token)match(input,26,FOLLOW_8); 

                	newLeafNode(otherlv_0, grammarAccess.getSliderLabelCheckBoxAccess().getSliderLabelCheckBoxKeyword_0());
                
            // InternalSpinCAD.g:1538:1: ( (lv_ename_1_0= RULE_ID ) )
            // InternalSpinCAD.g:1539:1: (lv_ename_1_0= RULE_ID )
            {
            // InternalSpinCAD.g:1539:1: (lv_ename_1_0= RULE_ID )
            // InternalSpinCAD.g:1540:3: lv_ename_1_0= RULE_ID
            {
            lv_ename_1_0=(Token)match(input,RULE_ID,FOLLOW_3); 

            			newLeafNode(lv_ename_1_0, grammarAccess.getSliderLabelCheckBoxAccess().getEnameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getSliderLabelCheckBoxRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"ename",
                    		lv_ename_1_0, 
                    		"org.eclipse.xtext.common.Terminals.ID");
            	    

            }


            }

            // InternalSpinCAD.g:1556:2: ( ( (lv_controlName_2_1= RULE_ID | lv_controlName_2_2= RULE_STRING ) ) )
            // InternalSpinCAD.g:1557:1: ( (lv_controlName_2_1= RULE_ID | lv_controlName_2_2= RULE_STRING ) )
            {
            // InternalSpinCAD.g:1557:1: ( (lv_controlName_2_1= RULE_ID | lv_controlName_2_2= RULE_STRING ) )
            // InternalSpinCAD.g:1558:1: (lv_controlName_2_1= RULE_ID | lv_controlName_2_2= RULE_STRING )
            {
            // InternalSpinCAD.g:1558:1: (lv_controlName_2_1= RULE_ID | lv_controlName_2_2= RULE_STRING )
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==RULE_ID) ) {
                alt20=1;
            }
            else if ( (LA20_0==RULE_STRING) ) {
                alt20=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 20, 0, input);

                throw nvae;
            }
            switch (alt20) {
                case 1 :
                    // InternalSpinCAD.g:1559:3: lv_controlName_2_1= RULE_ID
                    {
                    lv_controlName_2_1=(Token)match(input,RULE_ID,FOLLOW_12); 

                    			newLeafNode(lv_controlName_2_1, grammarAccess.getSliderLabelCheckBoxAccess().getControlNameIDTerminalRuleCall_2_0_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getSliderLabelCheckBoxRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"controlName",
                            		lv_controlName_2_1, 
                            		"org.eclipse.xtext.common.Terminals.ID");
                    	    

                    }
                    break;
                case 2 :
                    // InternalSpinCAD.g:1574:8: lv_controlName_2_2= RULE_STRING
                    {
                    lv_controlName_2_2=(Token)match(input,RULE_STRING,FOLLOW_12); 

                    			newLeafNode(lv_controlName_2_2, grammarAccess.getSliderLabelCheckBoxAccess().getControlNameSTRINGTerminalRuleCall_2_0_1()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getSliderLabelCheckBoxRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"controlName",
                            		lv_controlName_2_2, 
                            		"com.holycityaudio.spincad.SpinCAD.STRING");
                    	    

                    }
                    break;

            }


            }


            }

            // InternalSpinCAD.g:1592:2: ( ( (lv_minVal_3_0= ruleSPINDOUBLE ) ) ( (lv_maxVal_4_0= ruleSPINDOUBLE ) ) ( (lv_initVal_5_0= ruleSPINDOUBLE ) ) ( (lv_multiplier_6_0= ruleSPINDOUBLE ) ) ( (lv_precision_7_0= RULE_INT ) ) ( (lv_option_8_0= RULE_ID ) )? )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==RULE_INT||LA22_0==85) ) {
                alt22=1;
            }
            else if ( (LA22_0==RULE_ID) ) {
                int LA22_2 = input.LA(2);

                if ( (LA22_2==RULE_ID||LA22_2==RULE_INT||LA22_2==85) ) {
                    alt22=1;
                }
            }
            switch (alt22) {
                case 1 :
                    // InternalSpinCAD.g:1592:3: ( (lv_minVal_3_0= ruleSPINDOUBLE ) ) ( (lv_maxVal_4_0= ruleSPINDOUBLE ) ) ( (lv_initVal_5_0= ruleSPINDOUBLE ) ) ( (lv_multiplier_6_0= ruleSPINDOUBLE ) ) ( (lv_precision_7_0= RULE_INT ) ) ( (lv_option_8_0= RULE_ID ) )?
                    {
                    // InternalSpinCAD.g:1592:3: ( (lv_minVal_3_0= ruleSPINDOUBLE ) )
                    // InternalSpinCAD.g:1593:1: (lv_minVal_3_0= ruleSPINDOUBLE )
                    {
                    // InternalSpinCAD.g:1593:1: (lv_minVal_3_0= ruleSPINDOUBLE )
                    // InternalSpinCAD.g:1594:3: lv_minVal_3_0= ruleSPINDOUBLE
                    {
                     
                    	        newCompositeNode(grammarAccess.getSliderLabelCheckBoxAccess().getMinValSPINDOUBLEParserRuleCall_3_0_0()); 
                    	    
                    pushFollow(FOLLOW_9);
                    lv_minVal_3_0=ruleSPINDOUBLE();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getSliderLabelCheckBoxRule());
                    	        }
                           		set(
                           			current, 
                           			"minVal",
                            		lv_minVal_3_0, 
                            		"com.holycityaudio.spincad.SpinCAD.SPINDOUBLE");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // InternalSpinCAD.g:1610:2: ( (lv_maxVal_4_0= ruleSPINDOUBLE ) )
                    // InternalSpinCAD.g:1611:1: (lv_maxVal_4_0= ruleSPINDOUBLE )
                    {
                    // InternalSpinCAD.g:1611:1: (lv_maxVal_4_0= ruleSPINDOUBLE )
                    // InternalSpinCAD.g:1612:3: lv_maxVal_4_0= ruleSPINDOUBLE
                    {
                     
                    	        newCompositeNode(grammarAccess.getSliderLabelCheckBoxAccess().getMaxValSPINDOUBLEParserRuleCall_3_1_0()); 
                    	    
                    pushFollow(FOLLOW_9);
                    lv_maxVal_4_0=ruleSPINDOUBLE();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getSliderLabelCheckBoxRule());
                    	        }
                           		set(
                           			current, 
                           			"maxVal",
                            		lv_maxVal_4_0, 
                            		"com.holycityaudio.spincad.SpinCAD.SPINDOUBLE");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // InternalSpinCAD.g:1628:2: ( (lv_initVal_5_0= ruleSPINDOUBLE ) )
                    // InternalSpinCAD.g:1629:1: (lv_initVal_5_0= ruleSPINDOUBLE )
                    {
                    // InternalSpinCAD.g:1629:1: (lv_initVal_5_0= ruleSPINDOUBLE )
                    // InternalSpinCAD.g:1630:3: lv_initVal_5_0= ruleSPINDOUBLE
                    {
                     
                    	        newCompositeNode(grammarAccess.getSliderLabelCheckBoxAccess().getInitValSPINDOUBLEParserRuleCall_3_2_0()); 
                    	    
                    pushFollow(FOLLOW_9);
                    lv_initVal_5_0=ruleSPINDOUBLE();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getSliderLabelCheckBoxRule());
                    	        }
                           		set(
                           			current, 
                           			"initVal",
                            		lv_initVal_5_0, 
                            		"com.holycityaudio.spincad.SpinCAD.SPINDOUBLE");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // InternalSpinCAD.g:1646:2: ( (lv_multiplier_6_0= ruleSPINDOUBLE ) )
                    // InternalSpinCAD.g:1647:1: (lv_multiplier_6_0= ruleSPINDOUBLE )
                    {
                    // InternalSpinCAD.g:1647:1: (lv_multiplier_6_0= ruleSPINDOUBLE )
                    // InternalSpinCAD.g:1648:3: lv_multiplier_6_0= ruleSPINDOUBLE
                    {
                     
                    	        newCompositeNode(grammarAccess.getSliderLabelCheckBoxAccess().getMultiplierSPINDOUBLEParserRuleCall_3_3_0()); 
                    	    
                    pushFollow(FOLLOW_10);
                    lv_multiplier_6_0=ruleSPINDOUBLE();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getSliderLabelCheckBoxRule());
                    	        }
                           		set(
                           			current, 
                           			"multiplier",
                            		lv_multiplier_6_0, 
                            		"com.holycityaudio.spincad.SpinCAD.SPINDOUBLE");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // InternalSpinCAD.g:1664:2: ( (lv_precision_7_0= RULE_INT ) )
                    // InternalSpinCAD.g:1665:1: (lv_precision_7_0= RULE_INT )
                    {
                    // InternalSpinCAD.g:1665:1: (lv_precision_7_0= RULE_INT )
                    // InternalSpinCAD.g:1666:3: lv_precision_7_0= RULE_INT
                    {
                    lv_precision_7_0=(Token)match(input,RULE_INT,FOLLOW_13); 

                    			newLeafNode(lv_precision_7_0, grammarAccess.getSliderLabelCheckBoxAccess().getPrecisionINTTerminalRuleCall_3_4_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getSliderLabelCheckBoxRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"precision",
                            		lv_precision_7_0, 
                            		"org.eclipse.xtext.common.Terminals.INT");
                    	    

                    }


                    }

                    // InternalSpinCAD.g:1682:2: ( (lv_option_8_0= RULE_ID ) )?
                    int alt21=2;
                    int LA21_0 = input.LA(1);

                    if ( (LA21_0==RULE_ID) ) {
                        int LA21_1 = input.LA(2);

                        if ( (LA21_1==EOF||LA21_1==RULE_ID||LA21_1==RULE_SC_COMMENT||(LA21_1>=19 && LA21_1<=31)||(LA21_1>=33 && LA21_1<=55)||(LA21_1>=57 && LA21_1<=83)) ) {
                            alt21=1;
                        }
                    }
                    switch (alt21) {
                        case 1 :
                            // InternalSpinCAD.g:1683:1: (lv_option_8_0= RULE_ID )
                            {
                            // InternalSpinCAD.g:1683:1: (lv_option_8_0= RULE_ID )
                            // InternalSpinCAD.g:1684:3: lv_option_8_0= RULE_ID
                            {
                            lv_option_8_0=(Token)match(input,RULE_ID,FOLLOW_2); 

                            			newLeafNode(lv_option_8_0, grammarAccess.getSliderLabelCheckBoxAccess().getOptionIDTerminalRuleCall_3_5_0()); 
                            		

                            	        if (current==null) {
                            	            current = createModelElement(grammarAccess.getSliderLabelCheckBoxRule());
                            	        }
                                   		setWithLastConsumed(
                                   			current, 
                                   			"option",
                                    		lv_option_8_0, 
                                    		"org.eclipse.xtext.common.Terminals.ID");
                            	    

                            }


                            }
                            break;

                    }


                    }
                    break;

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
    // $ANTLR end "ruleSliderLabelCheckBox"


    // $ANTLR start "entryRuleSpinCheckBox"
    // InternalSpinCAD.g:1708:1: entryRuleSpinCheckBox returns [EObject current=null] : iv_ruleSpinCheckBox= ruleSpinCheckBox EOF ;
    public final EObject entryRuleSpinCheckBox() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSpinCheckBox = null;


        try {
            // InternalSpinCAD.g:1709:2: (iv_ruleSpinCheckBox= ruleSpinCheckBox EOF )
            // InternalSpinCAD.g:1710:2: iv_ruleSpinCheckBox= ruleSpinCheckBox EOF
            {
             newCompositeNode(grammarAccess.getSpinCheckBoxRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSpinCheckBox=ruleSpinCheckBox();

            state._fsp--;

             current =iv_ruleSpinCheckBox; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleSpinCheckBox"


    // $ANTLR start "ruleSpinCheckBox"
    // InternalSpinCAD.g:1717:1: ruleSpinCheckBox returns [EObject current=null] : (otherlv_0= '@checkbox' ( (lv_ename_1_0= RULE_ID ) ) ( ( (lv_controlName_2_1= RULE_ID | lv_controlName_2_2= RULE_STRING ) ) ) ) ;
    public final EObject ruleSpinCheckBox() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_ename_1_0=null;
        Token lv_controlName_2_1=null;
        Token lv_controlName_2_2=null;

         enterRule(); 
            
        try {
            // InternalSpinCAD.g:1720:28: ( (otherlv_0= '@checkbox' ( (lv_ename_1_0= RULE_ID ) ) ( ( (lv_controlName_2_1= RULE_ID | lv_controlName_2_2= RULE_STRING ) ) ) ) )
            // InternalSpinCAD.g:1721:1: (otherlv_0= '@checkbox' ( (lv_ename_1_0= RULE_ID ) ) ( ( (lv_controlName_2_1= RULE_ID | lv_controlName_2_2= RULE_STRING ) ) ) )
            {
            // InternalSpinCAD.g:1721:1: (otherlv_0= '@checkbox' ( (lv_ename_1_0= RULE_ID ) ) ( ( (lv_controlName_2_1= RULE_ID | lv_controlName_2_2= RULE_STRING ) ) ) )
            // InternalSpinCAD.g:1721:3: otherlv_0= '@checkbox' ( (lv_ename_1_0= RULE_ID ) ) ( ( (lv_controlName_2_1= RULE_ID | lv_controlName_2_2= RULE_STRING ) ) )
            {
            otherlv_0=(Token)match(input,27,FOLLOW_8); 

                	newLeafNode(otherlv_0, grammarAccess.getSpinCheckBoxAccess().getCheckboxKeyword_0());
                
            // InternalSpinCAD.g:1725:1: ( (lv_ename_1_0= RULE_ID ) )
            // InternalSpinCAD.g:1726:1: (lv_ename_1_0= RULE_ID )
            {
            // InternalSpinCAD.g:1726:1: (lv_ename_1_0= RULE_ID )
            // InternalSpinCAD.g:1727:3: lv_ename_1_0= RULE_ID
            {
            lv_ename_1_0=(Token)match(input,RULE_ID,FOLLOW_3); 

            			newLeafNode(lv_ename_1_0, grammarAccess.getSpinCheckBoxAccess().getEnameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getSpinCheckBoxRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"ename",
                    		lv_ename_1_0, 
                    		"org.eclipse.xtext.common.Terminals.ID");
            	    

            }


            }

            // InternalSpinCAD.g:1743:2: ( ( (lv_controlName_2_1= RULE_ID | lv_controlName_2_2= RULE_STRING ) ) )
            // InternalSpinCAD.g:1744:1: ( (lv_controlName_2_1= RULE_ID | lv_controlName_2_2= RULE_STRING ) )
            {
            // InternalSpinCAD.g:1744:1: ( (lv_controlName_2_1= RULE_ID | lv_controlName_2_2= RULE_STRING ) )
            // InternalSpinCAD.g:1745:1: (lv_controlName_2_1= RULE_ID | lv_controlName_2_2= RULE_STRING )
            {
            // InternalSpinCAD.g:1745:1: (lv_controlName_2_1= RULE_ID | lv_controlName_2_2= RULE_STRING )
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==RULE_ID) ) {
                alt23=1;
            }
            else if ( (LA23_0==RULE_STRING) ) {
                alt23=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 23, 0, input);

                throw nvae;
            }
            switch (alt23) {
                case 1 :
                    // InternalSpinCAD.g:1746:3: lv_controlName_2_1= RULE_ID
                    {
                    lv_controlName_2_1=(Token)match(input,RULE_ID,FOLLOW_2); 

                    			newLeafNode(lv_controlName_2_1, grammarAccess.getSpinCheckBoxAccess().getControlNameIDTerminalRuleCall_2_0_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getSpinCheckBoxRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"controlName",
                            		lv_controlName_2_1, 
                            		"org.eclipse.xtext.common.Terminals.ID");
                    	    

                    }
                    break;
                case 2 :
                    // InternalSpinCAD.g:1761:8: lv_controlName_2_2= RULE_STRING
                    {
                    lv_controlName_2_2=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    			newLeafNode(lv_controlName_2_2, grammarAccess.getSpinCheckBoxAccess().getControlNameSTRINGTerminalRuleCall_2_0_1()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getSpinCheckBoxRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"controlName",
                            		lv_controlName_2_2, 
                            		"com.holycityaudio.spincad.SpinCAD.STRING");
                    	    

                    }
                    break;

            }


            }


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
    // $ANTLR end "ruleSpinCheckBox"


    // $ANTLR start "entryRuleLogFreqSliderLabel"
    // InternalSpinCAD.g:1787:1: entryRuleLogFreqSliderLabel returns [EObject current=null] : iv_ruleLogFreqSliderLabel= ruleLogFreqSliderLabel EOF ;
    public final EObject entryRuleLogFreqSliderLabel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLogFreqSliderLabel = null;


        try {
            // InternalSpinCAD.g:1788:2: (iv_ruleLogFreqSliderLabel= ruleLogFreqSliderLabel EOF )
            // InternalSpinCAD.g:1789:2: iv_ruleLogFreqSliderLabel= ruleLogFreqSliderLabel EOF
            {
             newCompositeNode(grammarAccess.getLogFreqSliderLabelRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLogFreqSliderLabel=ruleLogFreqSliderLabel();

            state._fsp--;

             current =iv_ruleLogFreqSliderLabel; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleLogFreqSliderLabel"


    // $ANTLR start "ruleLogFreqSliderLabel"
    // InternalSpinCAD.g:1796:1: ruleLogFreqSliderLabel returns [EObject current=null] : (otherlv_0= '@logFreqSliderLabel' ( (lv_ename_1_0= RULE_ID ) ) ( ( (lv_controlName_2_1= RULE_ID | lv_controlName_2_2= RULE_STRING ) ) ) ( ( (lv_minVal_3_0= ruleSPINDOUBLE ) ) ( (lv_maxVal_4_0= ruleSPINDOUBLE ) ) ( (lv_initVal_5_0= ruleSPINDOUBLE ) ) ( (lv_multiplier_6_0= ruleSPINDOUBLE ) ) ( (lv_precision_7_0= RULE_INT ) ) ( (lv_option_8_0= RULE_ID ) )? )? ) ;
    public final EObject ruleLogFreqSliderLabel() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_ename_1_0=null;
        Token lv_controlName_2_1=null;
        Token lv_controlName_2_2=null;
        Token lv_precision_7_0=null;
        Token lv_option_8_0=null;
        AntlrDatatypeRuleToken lv_minVal_3_0 = null;

        AntlrDatatypeRuleToken lv_maxVal_4_0 = null;

        AntlrDatatypeRuleToken lv_initVal_5_0 = null;

        AntlrDatatypeRuleToken lv_multiplier_6_0 = null;


         enterRule(); 
            
        try {
            // InternalSpinCAD.g:1799:28: ( (otherlv_0= '@logFreqSliderLabel' ( (lv_ename_1_0= RULE_ID ) ) ( ( (lv_controlName_2_1= RULE_ID | lv_controlName_2_2= RULE_STRING ) ) ) ( ( (lv_minVal_3_0= ruleSPINDOUBLE ) ) ( (lv_maxVal_4_0= ruleSPINDOUBLE ) ) ( (lv_initVal_5_0= ruleSPINDOUBLE ) ) ( (lv_multiplier_6_0= ruleSPINDOUBLE ) ) ( (lv_precision_7_0= RULE_INT ) ) ( (lv_option_8_0= RULE_ID ) )? )? ) )
            // InternalSpinCAD.g:1800:1: (otherlv_0= '@logFreqSliderLabel' ( (lv_ename_1_0= RULE_ID ) ) ( ( (lv_controlName_2_1= RULE_ID | lv_controlName_2_2= RULE_STRING ) ) ) ( ( (lv_minVal_3_0= ruleSPINDOUBLE ) ) ( (lv_maxVal_4_0= ruleSPINDOUBLE ) ) ( (lv_initVal_5_0= ruleSPINDOUBLE ) ) ( (lv_multiplier_6_0= ruleSPINDOUBLE ) ) ( (lv_precision_7_0= RULE_INT ) ) ( (lv_option_8_0= RULE_ID ) )? )? )
            {
            // InternalSpinCAD.g:1800:1: (otherlv_0= '@logFreqSliderLabel' ( (lv_ename_1_0= RULE_ID ) ) ( ( (lv_controlName_2_1= RULE_ID | lv_controlName_2_2= RULE_STRING ) ) ) ( ( (lv_minVal_3_0= ruleSPINDOUBLE ) ) ( (lv_maxVal_4_0= ruleSPINDOUBLE ) ) ( (lv_initVal_5_0= ruleSPINDOUBLE ) ) ( (lv_multiplier_6_0= ruleSPINDOUBLE ) ) ( (lv_precision_7_0= RULE_INT ) ) ( (lv_option_8_0= RULE_ID ) )? )? )
            // InternalSpinCAD.g:1800:3: otherlv_0= '@logFreqSliderLabel' ( (lv_ename_1_0= RULE_ID ) ) ( ( (lv_controlName_2_1= RULE_ID | lv_controlName_2_2= RULE_STRING ) ) ) ( ( (lv_minVal_3_0= ruleSPINDOUBLE ) ) ( (lv_maxVal_4_0= ruleSPINDOUBLE ) ) ( (lv_initVal_5_0= ruleSPINDOUBLE ) ) ( (lv_multiplier_6_0= ruleSPINDOUBLE ) ) ( (lv_precision_7_0= RULE_INT ) ) ( (lv_option_8_0= RULE_ID ) )? )?
            {
            otherlv_0=(Token)match(input,28,FOLLOW_8); 

                	newLeafNode(otherlv_0, grammarAccess.getLogFreqSliderLabelAccess().getLogFreqSliderLabelKeyword_0());
                
            // InternalSpinCAD.g:1804:1: ( (lv_ename_1_0= RULE_ID ) )
            // InternalSpinCAD.g:1805:1: (lv_ename_1_0= RULE_ID )
            {
            // InternalSpinCAD.g:1805:1: (lv_ename_1_0= RULE_ID )
            // InternalSpinCAD.g:1806:3: lv_ename_1_0= RULE_ID
            {
            lv_ename_1_0=(Token)match(input,RULE_ID,FOLLOW_3); 

            			newLeafNode(lv_ename_1_0, grammarAccess.getLogFreqSliderLabelAccess().getEnameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getLogFreqSliderLabelRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"ename",
                    		lv_ename_1_0, 
                    		"org.eclipse.xtext.common.Terminals.ID");
            	    

            }


            }

            // InternalSpinCAD.g:1822:2: ( ( (lv_controlName_2_1= RULE_ID | lv_controlName_2_2= RULE_STRING ) ) )
            // InternalSpinCAD.g:1823:1: ( (lv_controlName_2_1= RULE_ID | lv_controlName_2_2= RULE_STRING ) )
            {
            // InternalSpinCAD.g:1823:1: ( (lv_controlName_2_1= RULE_ID | lv_controlName_2_2= RULE_STRING ) )
            // InternalSpinCAD.g:1824:1: (lv_controlName_2_1= RULE_ID | lv_controlName_2_2= RULE_STRING )
            {
            // InternalSpinCAD.g:1824:1: (lv_controlName_2_1= RULE_ID | lv_controlName_2_2= RULE_STRING )
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==RULE_ID) ) {
                alt24=1;
            }
            else if ( (LA24_0==RULE_STRING) ) {
                alt24=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 24, 0, input);

                throw nvae;
            }
            switch (alt24) {
                case 1 :
                    // InternalSpinCAD.g:1825:3: lv_controlName_2_1= RULE_ID
                    {
                    lv_controlName_2_1=(Token)match(input,RULE_ID,FOLLOW_12); 

                    			newLeafNode(lv_controlName_2_1, grammarAccess.getLogFreqSliderLabelAccess().getControlNameIDTerminalRuleCall_2_0_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getLogFreqSliderLabelRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"controlName",
                            		lv_controlName_2_1, 
                            		"org.eclipse.xtext.common.Terminals.ID");
                    	    

                    }
                    break;
                case 2 :
                    // InternalSpinCAD.g:1840:8: lv_controlName_2_2= RULE_STRING
                    {
                    lv_controlName_2_2=(Token)match(input,RULE_STRING,FOLLOW_12); 

                    			newLeafNode(lv_controlName_2_2, grammarAccess.getLogFreqSliderLabelAccess().getControlNameSTRINGTerminalRuleCall_2_0_1()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getLogFreqSliderLabelRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"controlName",
                            		lv_controlName_2_2, 
                            		"com.holycityaudio.spincad.SpinCAD.STRING");
                    	    

                    }
                    break;

            }


            }


            }

            // InternalSpinCAD.g:1858:2: ( ( (lv_minVal_3_0= ruleSPINDOUBLE ) ) ( (lv_maxVal_4_0= ruleSPINDOUBLE ) ) ( (lv_initVal_5_0= ruleSPINDOUBLE ) ) ( (lv_multiplier_6_0= ruleSPINDOUBLE ) ) ( (lv_precision_7_0= RULE_INT ) ) ( (lv_option_8_0= RULE_ID ) )? )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==RULE_INT||LA26_0==85) ) {
                alt26=1;
            }
            else if ( (LA26_0==RULE_ID) ) {
                int LA26_2 = input.LA(2);

                if ( (LA26_2==RULE_ID||LA26_2==RULE_INT||LA26_2==85) ) {
                    alt26=1;
                }
            }
            switch (alt26) {
                case 1 :
                    // InternalSpinCAD.g:1858:3: ( (lv_minVal_3_0= ruleSPINDOUBLE ) ) ( (lv_maxVal_4_0= ruleSPINDOUBLE ) ) ( (lv_initVal_5_0= ruleSPINDOUBLE ) ) ( (lv_multiplier_6_0= ruleSPINDOUBLE ) ) ( (lv_precision_7_0= RULE_INT ) ) ( (lv_option_8_0= RULE_ID ) )?
                    {
                    // InternalSpinCAD.g:1858:3: ( (lv_minVal_3_0= ruleSPINDOUBLE ) )
                    // InternalSpinCAD.g:1859:1: (lv_minVal_3_0= ruleSPINDOUBLE )
                    {
                    // InternalSpinCAD.g:1859:1: (lv_minVal_3_0= ruleSPINDOUBLE )
                    // InternalSpinCAD.g:1860:3: lv_minVal_3_0= ruleSPINDOUBLE
                    {
                     
                    	        newCompositeNode(grammarAccess.getLogFreqSliderLabelAccess().getMinValSPINDOUBLEParserRuleCall_3_0_0()); 
                    	    
                    pushFollow(FOLLOW_9);
                    lv_minVal_3_0=ruleSPINDOUBLE();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getLogFreqSliderLabelRule());
                    	        }
                           		set(
                           			current, 
                           			"minVal",
                            		lv_minVal_3_0, 
                            		"com.holycityaudio.spincad.SpinCAD.SPINDOUBLE");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // InternalSpinCAD.g:1876:2: ( (lv_maxVal_4_0= ruleSPINDOUBLE ) )
                    // InternalSpinCAD.g:1877:1: (lv_maxVal_4_0= ruleSPINDOUBLE )
                    {
                    // InternalSpinCAD.g:1877:1: (lv_maxVal_4_0= ruleSPINDOUBLE )
                    // InternalSpinCAD.g:1878:3: lv_maxVal_4_0= ruleSPINDOUBLE
                    {
                     
                    	        newCompositeNode(grammarAccess.getLogFreqSliderLabelAccess().getMaxValSPINDOUBLEParserRuleCall_3_1_0()); 
                    	    
                    pushFollow(FOLLOW_9);
                    lv_maxVal_4_0=ruleSPINDOUBLE();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getLogFreqSliderLabelRule());
                    	        }
                           		set(
                           			current, 
                           			"maxVal",
                            		lv_maxVal_4_0, 
                            		"com.holycityaudio.spincad.SpinCAD.SPINDOUBLE");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // InternalSpinCAD.g:1894:2: ( (lv_initVal_5_0= ruleSPINDOUBLE ) )
                    // InternalSpinCAD.g:1895:1: (lv_initVal_5_0= ruleSPINDOUBLE )
                    {
                    // InternalSpinCAD.g:1895:1: (lv_initVal_5_0= ruleSPINDOUBLE )
                    // InternalSpinCAD.g:1896:3: lv_initVal_5_0= ruleSPINDOUBLE
                    {
                     
                    	        newCompositeNode(grammarAccess.getLogFreqSliderLabelAccess().getInitValSPINDOUBLEParserRuleCall_3_2_0()); 
                    	    
                    pushFollow(FOLLOW_9);
                    lv_initVal_5_0=ruleSPINDOUBLE();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getLogFreqSliderLabelRule());
                    	        }
                           		set(
                           			current, 
                           			"initVal",
                            		lv_initVal_5_0, 
                            		"com.holycityaudio.spincad.SpinCAD.SPINDOUBLE");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // InternalSpinCAD.g:1912:2: ( (lv_multiplier_6_0= ruleSPINDOUBLE ) )
                    // InternalSpinCAD.g:1913:1: (lv_multiplier_6_0= ruleSPINDOUBLE )
                    {
                    // InternalSpinCAD.g:1913:1: (lv_multiplier_6_0= ruleSPINDOUBLE )
                    // InternalSpinCAD.g:1914:3: lv_multiplier_6_0= ruleSPINDOUBLE
                    {
                     
                    	        newCompositeNode(grammarAccess.getLogFreqSliderLabelAccess().getMultiplierSPINDOUBLEParserRuleCall_3_3_0()); 
                    	    
                    pushFollow(FOLLOW_10);
                    lv_multiplier_6_0=ruleSPINDOUBLE();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getLogFreqSliderLabelRule());
                    	        }
                           		set(
                           			current, 
                           			"multiplier",
                            		lv_multiplier_6_0, 
                            		"com.holycityaudio.spincad.SpinCAD.SPINDOUBLE");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // InternalSpinCAD.g:1930:2: ( (lv_precision_7_0= RULE_INT ) )
                    // InternalSpinCAD.g:1931:1: (lv_precision_7_0= RULE_INT )
                    {
                    // InternalSpinCAD.g:1931:1: (lv_precision_7_0= RULE_INT )
                    // InternalSpinCAD.g:1932:3: lv_precision_7_0= RULE_INT
                    {
                    lv_precision_7_0=(Token)match(input,RULE_INT,FOLLOW_13); 

                    			newLeafNode(lv_precision_7_0, grammarAccess.getLogFreqSliderLabelAccess().getPrecisionINTTerminalRuleCall_3_4_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getLogFreqSliderLabelRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"precision",
                            		lv_precision_7_0, 
                            		"org.eclipse.xtext.common.Terminals.INT");
                    	    

                    }


                    }

                    // InternalSpinCAD.g:1948:2: ( (lv_option_8_0= RULE_ID ) )?
                    int alt25=2;
                    int LA25_0 = input.LA(1);

                    if ( (LA25_0==RULE_ID) ) {
                        int LA25_1 = input.LA(2);

                        if ( (LA25_1==EOF||LA25_1==RULE_ID||LA25_1==RULE_SC_COMMENT||(LA25_1>=19 && LA25_1<=31)||(LA25_1>=33 && LA25_1<=55)||(LA25_1>=57 && LA25_1<=83)) ) {
                            alt25=1;
                        }
                    }
                    switch (alt25) {
                        case 1 :
                            // InternalSpinCAD.g:1949:1: (lv_option_8_0= RULE_ID )
                            {
                            // InternalSpinCAD.g:1949:1: (lv_option_8_0= RULE_ID )
                            // InternalSpinCAD.g:1950:3: lv_option_8_0= RULE_ID
                            {
                            lv_option_8_0=(Token)match(input,RULE_ID,FOLLOW_2); 

                            			newLeafNode(lv_option_8_0, grammarAccess.getLogFreqSliderLabelAccess().getOptionIDTerminalRuleCall_3_5_0()); 
                            		

                            	        if (current==null) {
                            	            current = createModelElement(grammarAccess.getLogFreqSliderLabelRule());
                            	        }
                                   		setWithLastConsumed(
                                   			current, 
                                   			"option",
                                    		lv_option_8_0, 
                                    		"org.eclipse.xtext.common.Terminals.ID");
                            	    

                            }


                            }
                            break;

                    }


                    }
                    break;

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
    // $ANTLR end "ruleLogFreqSliderLabel"


    // $ANTLR start "entryRuleLogFreq2SliderLabel"
    // InternalSpinCAD.g:1974:1: entryRuleLogFreq2SliderLabel returns [EObject current=null] : iv_ruleLogFreq2SliderLabel= ruleLogFreq2SliderLabel EOF ;
    public final EObject entryRuleLogFreq2SliderLabel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLogFreq2SliderLabel = null;


        try {
            // InternalSpinCAD.g:1975:2: (iv_ruleLogFreq2SliderLabel= ruleLogFreq2SliderLabel EOF )
            // InternalSpinCAD.g:1976:2: iv_ruleLogFreq2SliderLabel= ruleLogFreq2SliderLabel EOF
            {
             newCompositeNode(grammarAccess.getLogFreq2SliderLabelRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLogFreq2SliderLabel=ruleLogFreq2SliderLabel();

            state._fsp--;

             current =iv_ruleLogFreq2SliderLabel; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleLogFreq2SliderLabel"


    // $ANTLR start "ruleLogFreq2SliderLabel"
    // InternalSpinCAD.g:1983:1: ruleLogFreq2SliderLabel returns [EObject current=null] : (otherlv_0= '@logFreq2SliderLabel' ( (lv_ename_1_0= RULE_ID ) ) ( ( (lv_controlName_2_1= RULE_ID | lv_controlName_2_2= RULE_STRING ) ) ) ( ( (lv_minVal_3_0= ruleSPINDOUBLE ) ) ( (lv_maxVal_4_0= ruleSPINDOUBLE ) ) ( (lv_initVal_5_0= ruleSPINDOUBLE ) ) ( (lv_multiplier_6_0= ruleSPINDOUBLE ) ) ( (lv_precision_7_0= RULE_INT ) ) ( (lv_option_8_0= RULE_ID ) )? )? ) ;
    public final EObject ruleLogFreq2SliderLabel() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_ename_1_0=null;
        Token lv_controlName_2_1=null;
        Token lv_controlName_2_2=null;
        Token lv_precision_7_0=null;
        Token lv_option_8_0=null;
        AntlrDatatypeRuleToken lv_minVal_3_0 = null;

        AntlrDatatypeRuleToken lv_maxVal_4_0 = null;

        AntlrDatatypeRuleToken lv_initVal_5_0 = null;

        AntlrDatatypeRuleToken lv_multiplier_6_0 = null;


         enterRule(); 
            
        try {
            // InternalSpinCAD.g:1986:28: ( (otherlv_0= '@logFreq2SliderLabel' ( (lv_ename_1_0= RULE_ID ) ) ( ( (lv_controlName_2_1= RULE_ID | lv_controlName_2_2= RULE_STRING ) ) ) ( ( (lv_minVal_3_0= ruleSPINDOUBLE ) ) ( (lv_maxVal_4_0= ruleSPINDOUBLE ) ) ( (lv_initVal_5_0= ruleSPINDOUBLE ) ) ( (lv_multiplier_6_0= ruleSPINDOUBLE ) ) ( (lv_precision_7_0= RULE_INT ) ) ( (lv_option_8_0= RULE_ID ) )? )? ) )
            // InternalSpinCAD.g:1987:1: (otherlv_0= '@logFreq2SliderLabel' ( (lv_ename_1_0= RULE_ID ) ) ( ( (lv_controlName_2_1= RULE_ID | lv_controlName_2_2= RULE_STRING ) ) ) ( ( (lv_minVal_3_0= ruleSPINDOUBLE ) ) ( (lv_maxVal_4_0= ruleSPINDOUBLE ) ) ( (lv_initVal_5_0= ruleSPINDOUBLE ) ) ( (lv_multiplier_6_0= ruleSPINDOUBLE ) ) ( (lv_precision_7_0= RULE_INT ) ) ( (lv_option_8_0= RULE_ID ) )? )? )
            {
            // InternalSpinCAD.g:1987:1: (otherlv_0= '@logFreq2SliderLabel' ( (lv_ename_1_0= RULE_ID ) ) ( ( (lv_controlName_2_1= RULE_ID | lv_controlName_2_2= RULE_STRING ) ) ) ( ( (lv_minVal_3_0= ruleSPINDOUBLE ) ) ( (lv_maxVal_4_0= ruleSPINDOUBLE ) ) ( (lv_initVal_5_0= ruleSPINDOUBLE ) ) ( (lv_multiplier_6_0= ruleSPINDOUBLE ) ) ( (lv_precision_7_0= RULE_INT ) ) ( (lv_option_8_0= RULE_ID ) )? )? )
            // InternalSpinCAD.g:1987:3: otherlv_0= '@logFreq2SliderLabel' ( (lv_ename_1_0= RULE_ID ) ) ( ( (lv_controlName_2_1= RULE_ID | lv_controlName_2_2= RULE_STRING ) ) ) ( ( (lv_minVal_3_0= ruleSPINDOUBLE ) ) ( (lv_maxVal_4_0= ruleSPINDOUBLE ) ) ( (lv_initVal_5_0= ruleSPINDOUBLE ) ) ( (lv_multiplier_6_0= ruleSPINDOUBLE ) ) ( (lv_precision_7_0= RULE_INT ) ) ( (lv_option_8_0= RULE_ID ) )? )?
            {
            otherlv_0=(Token)match(input,29,FOLLOW_8); 

                	newLeafNode(otherlv_0, grammarAccess.getLogFreq2SliderLabelAccess().getLogFreq2SliderLabelKeyword_0());
                
            // InternalSpinCAD.g:1991:1: ( (lv_ename_1_0= RULE_ID ) )
            // InternalSpinCAD.g:1992:1: (lv_ename_1_0= RULE_ID )
            {
            // InternalSpinCAD.g:1992:1: (lv_ename_1_0= RULE_ID )
            // InternalSpinCAD.g:1993:3: lv_ename_1_0= RULE_ID
            {
            lv_ename_1_0=(Token)match(input,RULE_ID,FOLLOW_3); 

            			newLeafNode(lv_ename_1_0, grammarAccess.getLogFreq2SliderLabelAccess().getEnameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getLogFreq2SliderLabelRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"ename",
                    		lv_ename_1_0, 
                    		"org.eclipse.xtext.common.Terminals.ID");
            	    

            }


            }

            // InternalSpinCAD.g:2009:2: ( ( (lv_controlName_2_1= RULE_ID | lv_controlName_2_2= RULE_STRING ) ) )
            // InternalSpinCAD.g:2010:1: ( (lv_controlName_2_1= RULE_ID | lv_controlName_2_2= RULE_STRING ) )
            {
            // InternalSpinCAD.g:2010:1: ( (lv_controlName_2_1= RULE_ID | lv_controlName_2_2= RULE_STRING ) )
            // InternalSpinCAD.g:2011:1: (lv_controlName_2_1= RULE_ID | lv_controlName_2_2= RULE_STRING )
            {
            // InternalSpinCAD.g:2011:1: (lv_controlName_2_1= RULE_ID | lv_controlName_2_2= RULE_STRING )
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==RULE_ID) ) {
                alt27=1;
            }
            else if ( (LA27_0==RULE_STRING) ) {
                alt27=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 27, 0, input);

                throw nvae;
            }
            switch (alt27) {
                case 1 :
                    // InternalSpinCAD.g:2012:3: lv_controlName_2_1= RULE_ID
                    {
                    lv_controlName_2_1=(Token)match(input,RULE_ID,FOLLOW_12); 

                    			newLeafNode(lv_controlName_2_1, grammarAccess.getLogFreq2SliderLabelAccess().getControlNameIDTerminalRuleCall_2_0_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getLogFreq2SliderLabelRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"controlName",
                            		lv_controlName_2_1, 
                            		"org.eclipse.xtext.common.Terminals.ID");
                    	    

                    }
                    break;
                case 2 :
                    // InternalSpinCAD.g:2027:8: lv_controlName_2_2= RULE_STRING
                    {
                    lv_controlName_2_2=(Token)match(input,RULE_STRING,FOLLOW_12); 

                    			newLeafNode(lv_controlName_2_2, grammarAccess.getLogFreq2SliderLabelAccess().getControlNameSTRINGTerminalRuleCall_2_0_1()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getLogFreq2SliderLabelRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"controlName",
                            		lv_controlName_2_2, 
                            		"com.holycityaudio.spincad.SpinCAD.STRING");
                    	    

                    }
                    break;

            }


            }


            }

            // InternalSpinCAD.g:2045:2: ( ( (lv_minVal_3_0= ruleSPINDOUBLE ) ) ( (lv_maxVal_4_0= ruleSPINDOUBLE ) ) ( (lv_initVal_5_0= ruleSPINDOUBLE ) ) ( (lv_multiplier_6_0= ruleSPINDOUBLE ) ) ( (lv_precision_7_0= RULE_INT ) ) ( (lv_option_8_0= RULE_ID ) )? )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==RULE_INT||LA29_0==85) ) {
                alt29=1;
            }
            else if ( (LA29_0==RULE_ID) ) {
                int LA29_2 = input.LA(2);

                if ( (LA29_2==RULE_ID||LA29_2==RULE_INT||LA29_2==85) ) {
                    alt29=1;
                }
            }
            switch (alt29) {
                case 1 :
                    // InternalSpinCAD.g:2045:3: ( (lv_minVal_3_0= ruleSPINDOUBLE ) ) ( (lv_maxVal_4_0= ruleSPINDOUBLE ) ) ( (lv_initVal_5_0= ruleSPINDOUBLE ) ) ( (lv_multiplier_6_0= ruleSPINDOUBLE ) ) ( (lv_precision_7_0= RULE_INT ) ) ( (lv_option_8_0= RULE_ID ) )?
                    {
                    // InternalSpinCAD.g:2045:3: ( (lv_minVal_3_0= ruleSPINDOUBLE ) )
                    // InternalSpinCAD.g:2046:1: (lv_minVal_3_0= ruleSPINDOUBLE )
                    {
                    // InternalSpinCAD.g:2046:1: (lv_minVal_3_0= ruleSPINDOUBLE )
                    // InternalSpinCAD.g:2047:3: lv_minVal_3_0= ruleSPINDOUBLE
                    {
                     
                    	        newCompositeNode(grammarAccess.getLogFreq2SliderLabelAccess().getMinValSPINDOUBLEParserRuleCall_3_0_0()); 
                    	    
                    pushFollow(FOLLOW_9);
                    lv_minVal_3_0=ruleSPINDOUBLE();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getLogFreq2SliderLabelRule());
                    	        }
                           		set(
                           			current, 
                           			"minVal",
                            		lv_minVal_3_0, 
                            		"com.holycityaudio.spincad.SpinCAD.SPINDOUBLE");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // InternalSpinCAD.g:2063:2: ( (lv_maxVal_4_0= ruleSPINDOUBLE ) )
                    // InternalSpinCAD.g:2064:1: (lv_maxVal_4_0= ruleSPINDOUBLE )
                    {
                    // InternalSpinCAD.g:2064:1: (lv_maxVal_4_0= ruleSPINDOUBLE )
                    // InternalSpinCAD.g:2065:3: lv_maxVal_4_0= ruleSPINDOUBLE
                    {
                     
                    	        newCompositeNode(grammarAccess.getLogFreq2SliderLabelAccess().getMaxValSPINDOUBLEParserRuleCall_3_1_0()); 
                    	    
                    pushFollow(FOLLOW_9);
                    lv_maxVal_4_0=ruleSPINDOUBLE();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getLogFreq2SliderLabelRule());
                    	        }
                           		set(
                           			current, 
                           			"maxVal",
                            		lv_maxVal_4_0, 
                            		"com.holycityaudio.spincad.SpinCAD.SPINDOUBLE");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // InternalSpinCAD.g:2081:2: ( (lv_initVal_5_0= ruleSPINDOUBLE ) )
                    // InternalSpinCAD.g:2082:1: (lv_initVal_5_0= ruleSPINDOUBLE )
                    {
                    // InternalSpinCAD.g:2082:1: (lv_initVal_5_0= ruleSPINDOUBLE )
                    // InternalSpinCAD.g:2083:3: lv_initVal_5_0= ruleSPINDOUBLE
                    {
                     
                    	        newCompositeNode(grammarAccess.getLogFreq2SliderLabelAccess().getInitValSPINDOUBLEParserRuleCall_3_2_0()); 
                    	    
                    pushFollow(FOLLOW_9);
                    lv_initVal_5_0=ruleSPINDOUBLE();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getLogFreq2SliderLabelRule());
                    	        }
                           		set(
                           			current, 
                           			"initVal",
                            		lv_initVal_5_0, 
                            		"com.holycityaudio.spincad.SpinCAD.SPINDOUBLE");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // InternalSpinCAD.g:2099:2: ( (lv_multiplier_6_0= ruleSPINDOUBLE ) )
                    // InternalSpinCAD.g:2100:1: (lv_multiplier_6_0= ruleSPINDOUBLE )
                    {
                    // InternalSpinCAD.g:2100:1: (lv_multiplier_6_0= ruleSPINDOUBLE )
                    // InternalSpinCAD.g:2101:3: lv_multiplier_6_0= ruleSPINDOUBLE
                    {
                     
                    	        newCompositeNode(grammarAccess.getLogFreq2SliderLabelAccess().getMultiplierSPINDOUBLEParserRuleCall_3_3_0()); 
                    	    
                    pushFollow(FOLLOW_10);
                    lv_multiplier_6_0=ruleSPINDOUBLE();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getLogFreq2SliderLabelRule());
                    	        }
                           		set(
                           			current, 
                           			"multiplier",
                            		lv_multiplier_6_0, 
                            		"com.holycityaudio.spincad.SpinCAD.SPINDOUBLE");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // InternalSpinCAD.g:2117:2: ( (lv_precision_7_0= RULE_INT ) )
                    // InternalSpinCAD.g:2118:1: (lv_precision_7_0= RULE_INT )
                    {
                    // InternalSpinCAD.g:2118:1: (lv_precision_7_0= RULE_INT )
                    // InternalSpinCAD.g:2119:3: lv_precision_7_0= RULE_INT
                    {
                    lv_precision_7_0=(Token)match(input,RULE_INT,FOLLOW_13); 

                    			newLeafNode(lv_precision_7_0, grammarAccess.getLogFreq2SliderLabelAccess().getPrecisionINTTerminalRuleCall_3_4_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getLogFreq2SliderLabelRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"precision",
                            		lv_precision_7_0, 
                            		"org.eclipse.xtext.common.Terminals.INT");
                    	    

                    }


                    }

                    // InternalSpinCAD.g:2135:2: ( (lv_option_8_0= RULE_ID ) )?
                    int alt28=2;
                    int LA28_0 = input.LA(1);

                    if ( (LA28_0==RULE_ID) ) {
                        int LA28_1 = input.LA(2);

                        if ( (LA28_1==EOF||LA28_1==RULE_ID||LA28_1==RULE_SC_COMMENT||(LA28_1>=19 && LA28_1<=31)||(LA28_1>=33 && LA28_1<=55)||(LA28_1>=57 && LA28_1<=83)) ) {
                            alt28=1;
                        }
                    }
                    switch (alt28) {
                        case 1 :
                            // InternalSpinCAD.g:2136:1: (lv_option_8_0= RULE_ID )
                            {
                            // InternalSpinCAD.g:2136:1: (lv_option_8_0= RULE_ID )
                            // InternalSpinCAD.g:2137:3: lv_option_8_0= RULE_ID
                            {
                            lv_option_8_0=(Token)match(input,RULE_ID,FOLLOW_2); 

                            			newLeafNode(lv_option_8_0, grammarAccess.getLogFreq2SliderLabelAccess().getOptionIDTerminalRuleCall_3_5_0()); 
                            		

                            	        if (current==null) {
                            	            current = createModelElement(grammarAccess.getLogFreq2SliderLabelRule());
                            	        }
                                   		setWithLastConsumed(
                                   			current, 
                                   			"option",
                                    		lv_option_8_0, 
                                    		"org.eclipse.xtext.common.Terminals.ID");
                            	    

                            }


                            }
                            break;

                    }


                    }
                    break;

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
    // $ANTLR end "ruleLogFreq2SliderLabel"


    // $ANTLR start "entryRuleSpinRadioButton"
    // InternalSpinCAD.g:2161:1: entryRuleSpinRadioButton returns [EObject current=null] : iv_ruleSpinRadioButton= ruleSpinRadioButton EOF ;
    public final EObject entryRuleSpinRadioButton() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSpinRadioButton = null;


        try {
            // InternalSpinCAD.g:2162:2: (iv_ruleSpinRadioButton= ruleSpinRadioButton EOF )
            // InternalSpinCAD.g:2163:2: iv_ruleSpinRadioButton= ruleSpinRadioButton EOF
            {
             newCompositeNode(grammarAccess.getSpinRadioButtonRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSpinRadioButton=ruleSpinRadioButton();

            state._fsp--;

             current =iv_ruleSpinRadioButton; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleSpinRadioButton"


    // $ANTLR start "ruleSpinRadioButton"
    // InternalSpinCAD.g:2170:1: ruleSpinRadioButton returns [EObject current=null] : (otherlv_0= '@spinRadioButton' ( (lv_ename_1_0= RULE_ID ) ) ( ( (lv_controlName_2_1= RULE_ID | lv_controlName_2_2= RULE_STRING ) ) ) ) ;
    public final EObject ruleSpinRadioButton() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_ename_1_0=null;
        Token lv_controlName_2_1=null;
        Token lv_controlName_2_2=null;

         enterRule(); 
            
        try {
            // InternalSpinCAD.g:2173:28: ( (otherlv_0= '@spinRadioButton' ( (lv_ename_1_0= RULE_ID ) ) ( ( (lv_controlName_2_1= RULE_ID | lv_controlName_2_2= RULE_STRING ) ) ) ) )
            // InternalSpinCAD.g:2174:1: (otherlv_0= '@spinRadioButton' ( (lv_ename_1_0= RULE_ID ) ) ( ( (lv_controlName_2_1= RULE_ID | lv_controlName_2_2= RULE_STRING ) ) ) )
            {
            // InternalSpinCAD.g:2174:1: (otherlv_0= '@spinRadioButton' ( (lv_ename_1_0= RULE_ID ) ) ( ( (lv_controlName_2_1= RULE_ID | lv_controlName_2_2= RULE_STRING ) ) ) )
            // InternalSpinCAD.g:2174:3: otherlv_0= '@spinRadioButton' ( (lv_ename_1_0= RULE_ID ) ) ( ( (lv_controlName_2_1= RULE_ID | lv_controlName_2_2= RULE_STRING ) ) )
            {
            otherlv_0=(Token)match(input,30,FOLLOW_8); 

                	newLeafNode(otherlv_0, grammarAccess.getSpinRadioButtonAccess().getSpinRadioButtonKeyword_0());
                
            // InternalSpinCAD.g:2178:1: ( (lv_ename_1_0= RULE_ID ) )
            // InternalSpinCAD.g:2179:1: (lv_ename_1_0= RULE_ID )
            {
            // InternalSpinCAD.g:2179:1: (lv_ename_1_0= RULE_ID )
            // InternalSpinCAD.g:2180:3: lv_ename_1_0= RULE_ID
            {
            lv_ename_1_0=(Token)match(input,RULE_ID,FOLLOW_3); 

            			newLeafNode(lv_ename_1_0, grammarAccess.getSpinRadioButtonAccess().getEnameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getSpinRadioButtonRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"ename",
                    		lv_ename_1_0, 
                    		"org.eclipse.xtext.common.Terminals.ID");
            	    

            }


            }

            // InternalSpinCAD.g:2196:2: ( ( (lv_controlName_2_1= RULE_ID | lv_controlName_2_2= RULE_STRING ) ) )
            // InternalSpinCAD.g:2197:1: ( (lv_controlName_2_1= RULE_ID | lv_controlName_2_2= RULE_STRING ) )
            {
            // InternalSpinCAD.g:2197:1: ( (lv_controlName_2_1= RULE_ID | lv_controlName_2_2= RULE_STRING ) )
            // InternalSpinCAD.g:2198:1: (lv_controlName_2_1= RULE_ID | lv_controlName_2_2= RULE_STRING )
            {
            // InternalSpinCAD.g:2198:1: (lv_controlName_2_1= RULE_ID | lv_controlName_2_2= RULE_STRING )
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==RULE_ID) ) {
                alt30=1;
            }
            else if ( (LA30_0==RULE_STRING) ) {
                alt30=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 30, 0, input);

                throw nvae;
            }
            switch (alt30) {
                case 1 :
                    // InternalSpinCAD.g:2199:3: lv_controlName_2_1= RULE_ID
                    {
                    lv_controlName_2_1=(Token)match(input,RULE_ID,FOLLOW_2); 

                    			newLeafNode(lv_controlName_2_1, grammarAccess.getSpinRadioButtonAccess().getControlNameIDTerminalRuleCall_2_0_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getSpinRadioButtonRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"controlName",
                            		lv_controlName_2_1, 
                            		"org.eclipse.xtext.common.Terminals.ID");
                    	    

                    }
                    break;
                case 2 :
                    // InternalSpinCAD.g:2214:8: lv_controlName_2_2= RULE_STRING
                    {
                    lv_controlName_2_2=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    			newLeafNode(lv_controlName_2_2, grammarAccess.getSpinRadioButtonAccess().getControlNameSTRINGTerminalRuleCall_2_0_1()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getSpinRadioButtonRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"controlName",
                            		lv_controlName_2_2, 
                            		"com.holycityaudio.spincad.SpinCAD.STRING");
                    	    

                    }
                    break;

            }


            }


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
    // $ANTLR end "ruleSpinRadioButton"


    // $ANTLR start "entryRuleSpinComboBox"
    // InternalSpinCAD.g:2240:1: entryRuleSpinComboBox returns [EObject current=null] : iv_ruleSpinComboBox= ruleSpinComboBox EOF ;
    public final EObject entryRuleSpinComboBox() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSpinComboBox = null;


        try {
            // InternalSpinCAD.g:2241:2: (iv_ruleSpinComboBox= ruleSpinComboBox EOF )
            // InternalSpinCAD.g:2242:2: iv_ruleSpinComboBox= ruleSpinComboBox EOF
            {
             newCompositeNode(grammarAccess.getSpinComboBoxRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSpinComboBox=ruleSpinComboBox();

            state._fsp--;

             current =iv_ruleSpinComboBox; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleSpinComboBox"


    // $ANTLR start "ruleSpinComboBox"
    // InternalSpinCAD.g:2249:1: ruleSpinComboBox returns [EObject current=null] : (otherlv_0= '@comboBox' ( (lv_ename_1_0= RULE_ID ) ) ( (lv_optiona_2_0= RULE_STRING ) ) ( (lv_optionb_3_0= RULE_STRING ) ) ( ( (lv_optionc_4_0= RULE_STRING ) ) ( ( (lv_optiond_5_0= RULE_STRING ) ) ( ( (lv_optione_6_0= RULE_STRING ) ) ( (lv_optionf_7_0= RULE_STRING ) )? )? )? )? ) ;
    public final EObject ruleSpinComboBox() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_ename_1_0=null;
        Token lv_optiona_2_0=null;
        Token lv_optionb_3_0=null;
        Token lv_optionc_4_0=null;
        Token lv_optiond_5_0=null;
        Token lv_optione_6_0=null;
        Token lv_optionf_7_0=null;

         enterRule(); 
            
        try {
            // InternalSpinCAD.g:2252:28: ( (otherlv_0= '@comboBox' ( (lv_ename_1_0= RULE_ID ) ) ( (lv_optiona_2_0= RULE_STRING ) ) ( (lv_optionb_3_0= RULE_STRING ) ) ( ( (lv_optionc_4_0= RULE_STRING ) ) ( ( (lv_optiond_5_0= RULE_STRING ) ) ( ( (lv_optione_6_0= RULE_STRING ) ) ( (lv_optionf_7_0= RULE_STRING ) )? )? )? )? ) )
            // InternalSpinCAD.g:2253:1: (otherlv_0= '@comboBox' ( (lv_ename_1_0= RULE_ID ) ) ( (lv_optiona_2_0= RULE_STRING ) ) ( (lv_optionb_3_0= RULE_STRING ) ) ( ( (lv_optionc_4_0= RULE_STRING ) ) ( ( (lv_optiond_5_0= RULE_STRING ) ) ( ( (lv_optione_6_0= RULE_STRING ) ) ( (lv_optionf_7_0= RULE_STRING ) )? )? )? )? )
            {
            // InternalSpinCAD.g:2253:1: (otherlv_0= '@comboBox' ( (lv_ename_1_0= RULE_ID ) ) ( (lv_optiona_2_0= RULE_STRING ) ) ( (lv_optionb_3_0= RULE_STRING ) ) ( ( (lv_optionc_4_0= RULE_STRING ) ) ( ( (lv_optiond_5_0= RULE_STRING ) ) ( ( (lv_optione_6_0= RULE_STRING ) ) ( (lv_optionf_7_0= RULE_STRING ) )? )? )? )? )
            // InternalSpinCAD.g:2253:3: otherlv_0= '@comboBox' ( (lv_ename_1_0= RULE_ID ) ) ( (lv_optiona_2_0= RULE_STRING ) ) ( (lv_optionb_3_0= RULE_STRING ) ) ( ( (lv_optionc_4_0= RULE_STRING ) ) ( ( (lv_optiond_5_0= RULE_STRING ) ) ( ( (lv_optione_6_0= RULE_STRING ) ) ( (lv_optionf_7_0= RULE_STRING ) )? )? )? )?
            {
            otherlv_0=(Token)match(input,31,FOLLOW_8); 

                	newLeafNode(otherlv_0, grammarAccess.getSpinComboBoxAccess().getComboBoxKeyword_0());
                
            // InternalSpinCAD.g:2257:1: ( (lv_ename_1_0= RULE_ID ) )
            // InternalSpinCAD.g:2258:1: (lv_ename_1_0= RULE_ID )
            {
            // InternalSpinCAD.g:2258:1: (lv_ename_1_0= RULE_ID )
            // InternalSpinCAD.g:2259:3: lv_ename_1_0= RULE_ID
            {
            lv_ename_1_0=(Token)match(input,RULE_ID,FOLLOW_5); 

            			newLeafNode(lv_ename_1_0, grammarAccess.getSpinComboBoxAccess().getEnameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getSpinComboBoxRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"ename",
                    		lv_ename_1_0, 
                    		"org.eclipse.xtext.common.Terminals.ID");
            	    

            }


            }

            // InternalSpinCAD.g:2275:2: ( (lv_optiona_2_0= RULE_STRING ) )
            // InternalSpinCAD.g:2276:1: (lv_optiona_2_0= RULE_STRING )
            {
            // InternalSpinCAD.g:2276:1: (lv_optiona_2_0= RULE_STRING )
            // InternalSpinCAD.g:2277:3: lv_optiona_2_0= RULE_STRING
            {
            lv_optiona_2_0=(Token)match(input,RULE_STRING,FOLLOW_5); 

            			newLeafNode(lv_optiona_2_0, grammarAccess.getSpinComboBoxAccess().getOptionaSTRINGTerminalRuleCall_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getSpinComboBoxRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"optiona",
                    		lv_optiona_2_0, 
                    		"com.holycityaudio.spincad.SpinCAD.STRING");
            	    

            }


            }

            // InternalSpinCAD.g:2293:2: ( (lv_optionb_3_0= RULE_STRING ) )
            // InternalSpinCAD.g:2294:1: (lv_optionb_3_0= RULE_STRING )
            {
            // InternalSpinCAD.g:2294:1: (lv_optionb_3_0= RULE_STRING )
            // InternalSpinCAD.g:2295:3: lv_optionb_3_0= RULE_STRING
            {
            lv_optionb_3_0=(Token)match(input,RULE_STRING,FOLLOW_14); 

            			newLeafNode(lv_optionb_3_0, grammarAccess.getSpinComboBoxAccess().getOptionbSTRINGTerminalRuleCall_3_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getSpinComboBoxRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"optionb",
                    		lv_optionb_3_0, 
                    		"com.holycityaudio.spincad.SpinCAD.STRING");
            	    

            }


            }

            // InternalSpinCAD.g:2311:2: ( ( (lv_optionc_4_0= RULE_STRING ) ) ( ( (lv_optiond_5_0= RULE_STRING ) ) ( ( (lv_optione_6_0= RULE_STRING ) ) ( (lv_optionf_7_0= RULE_STRING ) )? )? )? )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==RULE_STRING) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // InternalSpinCAD.g:2311:3: ( (lv_optionc_4_0= RULE_STRING ) ) ( ( (lv_optiond_5_0= RULE_STRING ) ) ( ( (lv_optione_6_0= RULE_STRING ) ) ( (lv_optionf_7_0= RULE_STRING ) )? )? )?
                    {
                    // InternalSpinCAD.g:2311:3: ( (lv_optionc_4_0= RULE_STRING ) )
                    // InternalSpinCAD.g:2312:1: (lv_optionc_4_0= RULE_STRING )
                    {
                    // InternalSpinCAD.g:2312:1: (lv_optionc_4_0= RULE_STRING )
                    // InternalSpinCAD.g:2313:3: lv_optionc_4_0= RULE_STRING
                    {
                    lv_optionc_4_0=(Token)match(input,RULE_STRING,FOLLOW_14); 

                    			newLeafNode(lv_optionc_4_0, grammarAccess.getSpinComboBoxAccess().getOptioncSTRINGTerminalRuleCall_4_0_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getSpinComboBoxRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"optionc",
                            		lv_optionc_4_0, 
                            		"com.holycityaudio.spincad.SpinCAD.STRING");
                    	    

                    }


                    }

                    // InternalSpinCAD.g:2329:2: ( ( (lv_optiond_5_0= RULE_STRING ) ) ( ( (lv_optione_6_0= RULE_STRING ) ) ( (lv_optionf_7_0= RULE_STRING ) )? )? )?
                    int alt33=2;
                    int LA33_0 = input.LA(1);

                    if ( (LA33_0==RULE_STRING) ) {
                        alt33=1;
                    }
                    switch (alt33) {
                        case 1 :
                            // InternalSpinCAD.g:2329:3: ( (lv_optiond_5_0= RULE_STRING ) ) ( ( (lv_optione_6_0= RULE_STRING ) ) ( (lv_optionf_7_0= RULE_STRING ) )? )?
                            {
                            // InternalSpinCAD.g:2329:3: ( (lv_optiond_5_0= RULE_STRING ) )
                            // InternalSpinCAD.g:2330:1: (lv_optiond_5_0= RULE_STRING )
                            {
                            // InternalSpinCAD.g:2330:1: (lv_optiond_5_0= RULE_STRING )
                            // InternalSpinCAD.g:2331:3: lv_optiond_5_0= RULE_STRING
                            {
                            lv_optiond_5_0=(Token)match(input,RULE_STRING,FOLLOW_14); 

                            			newLeafNode(lv_optiond_5_0, grammarAccess.getSpinComboBoxAccess().getOptiondSTRINGTerminalRuleCall_4_1_0_0()); 
                            		

                            	        if (current==null) {
                            	            current = createModelElement(grammarAccess.getSpinComboBoxRule());
                            	        }
                                   		setWithLastConsumed(
                                   			current, 
                                   			"optiond",
                                    		lv_optiond_5_0, 
                                    		"com.holycityaudio.spincad.SpinCAD.STRING");
                            	    

                            }


                            }

                            // InternalSpinCAD.g:2347:2: ( ( (lv_optione_6_0= RULE_STRING ) ) ( (lv_optionf_7_0= RULE_STRING ) )? )?
                            int alt32=2;
                            int LA32_0 = input.LA(1);

                            if ( (LA32_0==RULE_STRING) ) {
                                alt32=1;
                            }
                            switch (alt32) {
                                case 1 :
                                    // InternalSpinCAD.g:2347:3: ( (lv_optione_6_0= RULE_STRING ) ) ( (lv_optionf_7_0= RULE_STRING ) )?
                                    {
                                    // InternalSpinCAD.g:2347:3: ( (lv_optione_6_0= RULE_STRING ) )
                                    // InternalSpinCAD.g:2348:1: (lv_optione_6_0= RULE_STRING )
                                    {
                                    // InternalSpinCAD.g:2348:1: (lv_optione_6_0= RULE_STRING )
                                    // InternalSpinCAD.g:2349:3: lv_optione_6_0= RULE_STRING
                                    {
                                    lv_optione_6_0=(Token)match(input,RULE_STRING,FOLLOW_14); 

                                    			newLeafNode(lv_optione_6_0, grammarAccess.getSpinComboBoxAccess().getOptioneSTRINGTerminalRuleCall_4_1_1_0_0()); 
                                    		

                                    	        if (current==null) {
                                    	            current = createModelElement(grammarAccess.getSpinComboBoxRule());
                                    	        }
                                           		setWithLastConsumed(
                                           			current, 
                                           			"optione",
                                            		lv_optione_6_0, 
                                            		"com.holycityaudio.spincad.SpinCAD.STRING");
                                    	    

                                    }


                                    }

                                    // InternalSpinCAD.g:2365:2: ( (lv_optionf_7_0= RULE_STRING ) )?
                                    int alt31=2;
                                    int LA31_0 = input.LA(1);

                                    if ( (LA31_0==RULE_STRING) ) {
                                        alt31=1;
                                    }
                                    switch (alt31) {
                                        case 1 :
                                            // InternalSpinCAD.g:2366:1: (lv_optionf_7_0= RULE_STRING )
                                            {
                                            // InternalSpinCAD.g:2366:1: (lv_optionf_7_0= RULE_STRING )
                                            // InternalSpinCAD.g:2367:3: lv_optionf_7_0= RULE_STRING
                                            {
                                            lv_optionf_7_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                                            			newLeafNode(lv_optionf_7_0, grammarAccess.getSpinComboBoxAccess().getOptionfSTRINGTerminalRuleCall_4_1_1_1_0()); 
                                            		

                                            	        if (current==null) {
                                            	            current = createModelElement(grammarAccess.getSpinComboBoxRule());
                                            	        }
                                                   		setWithLastConsumed(
                                                   			current, 
                                                   			"optionf",
                                                    		lv_optionf_7_0, 
                                                    		"com.holycityaudio.spincad.SpinCAD.STRING");
                                            	    

                                            }


                                            }
                                            break;

                                    }


                                    }
                                    break;

                            }


                            }
                            break;

                    }


                    }
                    break;

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
    // $ANTLR end "ruleSpinComboBox"


    // $ANTLR start "entryRuleComment"
    // InternalSpinCAD.g:2391:1: entryRuleComment returns [EObject current=null] : iv_ruleComment= ruleComment EOF ;
    public final EObject entryRuleComment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComment = null;


        try {
            // InternalSpinCAD.g:2392:2: (iv_ruleComment= ruleComment EOF )
            // InternalSpinCAD.g:2393:2: iv_ruleComment= ruleComment EOF
            {
             newCompositeNode(grammarAccess.getCommentRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleComment=ruleComment();

            state._fsp--;

             current =iv_ruleComment; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleComment"


    // $ANTLR start "ruleComment"
    // InternalSpinCAD.g:2400:1: ruleComment returns [EObject current=null] : ( (lv_remark_0_0= RULE_SC_COMMENT ) ) ;
    public final EObject ruleComment() throws RecognitionException {
        EObject current = null;

        Token lv_remark_0_0=null;

         enterRule(); 
            
        try {
            // InternalSpinCAD.g:2403:28: ( ( (lv_remark_0_0= RULE_SC_COMMENT ) ) )
            // InternalSpinCAD.g:2404:1: ( (lv_remark_0_0= RULE_SC_COMMENT ) )
            {
            // InternalSpinCAD.g:2404:1: ( (lv_remark_0_0= RULE_SC_COMMENT ) )
            // InternalSpinCAD.g:2405:1: (lv_remark_0_0= RULE_SC_COMMENT )
            {
            // InternalSpinCAD.g:2405:1: (lv_remark_0_0= RULE_SC_COMMENT )
            // InternalSpinCAD.g:2406:3: lv_remark_0_0= RULE_SC_COMMENT
            {
            lv_remark_0_0=(Token)match(input,RULE_SC_COMMENT,FOLLOW_2); 

            			newLeafNode(lv_remark_0_0, grammarAccess.getCommentAccess().getRemarkSC_COMMENTTerminalRuleCall_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getCommentRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"remark",
                    		lv_remark_0_0, 
                    		"com.holycityaudio.spincad.SpinCAD.SC_COMMENT");
            	    

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
    // $ANTLR end "ruleComment"


    // $ANTLR start "entryRuleLabel"
    // InternalSpinCAD.g:2430:1: entryRuleLabel returns [EObject current=null] : iv_ruleLabel= ruleLabel EOF ;
    public final EObject entryRuleLabel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLabel = null;


        try {
            // InternalSpinCAD.g:2431:2: (iv_ruleLabel= ruleLabel EOF )
            // InternalSpinCAD.g:2432:2: iv_ruleLabel= ruleLabel EOF
            {
             newCompositeNode(grammarAccess.getLabelRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLabel=ruleLabel();

            state._fsp--;

             current =iv_ruleLabel; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleLabel"


    // $ANTLR start "ruleLabel"
    // InternalSpinCAD.g:2439:1: ruleLabel returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ) ;
    public final EObject ruleLabel() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // InternalSpinCAD.g:2442:28: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ) )
            // InternalSpinCAD.g:2443:1: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' )
            {
            // InternalSpinCAD.g:2443:1: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' )
            // InternalSpinCAD.g:2443:2: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':'
            {
            // InternalSpinCAD.g:2443:2: ( (lv_name_0_0= RULE_ID ) )
            // InternalSpinCAD.g:2444:1: (lv_name_0_0= RULE_ID )
            {
            // InternalSpinCAD.g:2444:1: (lv_name_0_0= RULE_ID )
            // InternalSpinCAD.g:2445:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_15); 

            			newLeafNode(lv_name_0_0, grammarAccess.getLabelAccess().getNameIDTerminalRuleCall_0_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getLabelRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_0_0, 
                    		"org.eclipse.xtext.common.Terminals.ID");
            	    

            }


            }

            otherlv_1=(Token)match(input,32,FOLLOW_2); 

                	newLeafNode(otherlv_1, grammarAccess.getLabelAccess().getColonKeyword_1());
                

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
    // $ANTLR end "ruleLabel"


    // $ANTLR start "entryRuleMacro"
    // InternalSpinCAD.g:2473:1: entryRuleMacro returns [EObject current=null] : iv_ruleMacro= ruleMacro EOF ;
    public final EObject entryRuleMacro() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMacro = null;


        try {
            // InternalSpinCAD.g:2474:2: (iv_ruleMacro= ruleMacro EOF )
            // InternalSpinCAD.g:2475:2: iv_ruleMacro= ruleMacro EOF
            {
             newCompositeNode(grammarAccess.getMacroRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMacro=ruleMacro();

            state._fsp--;

             current =iv_ruleMacro; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleMacro"


    // $ANTLR start "ruleMacro"
    // InternalSpinCAD.g:2482:1: ruleMacro returns [EObject current=null] : (this_IsPinConnected_0= ruleIsPinConnected | this_IsTrue_1= ruleIsTrue | this_IsElse_2= ruleIsElse | this_IsEndif_3= ruleIsEndif | this_IsGreaterThan_4= ruleIsGreaterThan | this_IsEqualTo_5= ruleIsEqualTo | this_IsOr_6= ruleIsOr | this_IsLessThan_7= ruleIsLessThan | this_GetInputDefault_8= ruleGetInputDefault | this_ReadChorusTap_9= ruleReadChorusTap | this_SetChorusWidth_10= ruleSetChorusWidth | this_GetDelayScaleControl_11= ruleGetDelayScaleControl | this_SetOutputPin_12= ruleSetOutputPin | this_GetBaseAddress_13= ruleGetBaseAddress | this_GetSamplesFromRatio_14= ruleGetSamplesFromRatio | this_MinusDouble_15= ruleMinusDouble | this_DivideDouble_16= ruleDivideDouble | this_DivideInt_17= ruleDivideInt | this_MultiplyDouble_18= ruleMultiplyDouble | this_SemitonesToRmpRate_19= ruleSemitonesToRmpRate | this_Equals_20= ruleEquals | this_EqualsBool_21= ruleEqualsBool ) ;
    public final EObject ruleMacro() throws RecognitionException {
        EObject current = null;

        EObject this_IsPinConnected_0 = null;

        EObject this_IsTrue_1 = null;

        EObject this_IsElse_2 = null;

        EObject this_IsEndif_3 = null;

        EObject this_IsGreaterThan_4 = null;

        EObject this_IsEqualTo_5 = null;

        EObject this_IsOr_6 = null;

        EObject this_IsLessThan_7 = null;

        EObject this_GetInputDefault_8 = null;

        EObject this_ReadChorusTap_9 = null;

        EObject this_SetChorusWidth_10 = null;

        EObject this_GetDelayScaleControl_11 = null;

        EObject this_SetOutputPin_12 = null;

        EObject this_GetBaseAddress_13 = null;

        EObject this_GetSamplesFromRatio_14 = null;

        EObject this_MinusDouble_15 = null;

        EObject this_DivideDouble_16 = null;

        EObject this_DivideInt_17 = null;

        EObject this_MultiplyDouble_18 = null;

        EObject this_SemitonesToRmpRate_19 = null;

        EObject this_Equals_20 = null;

        EObject this_EqualsBool_21 = null;


         enterRule(); 
            
        try {
            // InternalSpinCAD.g:2485:28: ( (this_IsPinConnected_0= ruleIsPinConnected | this_IsTrue_1= ruleIsTrue | this_IsElse_2= ruleIsElse | this_IsEndif_3= ruleIsEndif | this_IsGreaterThan_4= ruleIsGreaterThan | this_IsEqualTo_5= ruleIsEqualTo | this_IsOr_6= ruleIsOr | this_IsLessThan_7= ruleIsLessThan | this_GetInputDefault_8= ruleGetInputDefault | this_ReadChorusTap_9= ruleReadChorusTap | this_SetChorusWidth_10= ruleSetChorusWidth | this_GetDelayScaleControl_11= ruleGetDelayScaleControl | this_SetOutputPin_12= ruleSetOutputPin | this_GetBaseAddress_13= ruleGetBaseAddress | this_GetSamplesFromRatio_14= ruleGetSamplesFromRatio | this_MinusDouble_15= ruleMinusDouble | this_DivideDouble_16= ruleDivideDouble | this_DivideInt_17= ruleDivideInt | this_MultiplyDouble_18= ruleMultiplyDouble | this_SemitonesToRmpRate_19= ruleSemitonesToRmpRate | this_Equals_20= ruleEquals | this_EqualsBool_21= ruleEqualsBool ) )
            // InternalSpinCAD.g:2486:1: (this_IsPinConnected_0= ruleIsPinConnected | this_IsTrue_1= ruleIsTrue | this_IsElse_2= ruleIsElse | this_IsEndif_3= ruleIsEndif | this_IsGreaterThan_4= ruleIsGreaterThan | this_IsEqualTo_5= ruleIsEqualTo | this_IsOr_6= ruleIsOr | this_IsLessThan_7= ruleIsLessThan | this_GetInputDefault_8= ruleGetInputDefault | this_ReadChorusTap_9= ruleReadChorusTap | this_SetChorusWidth_10= ruleSetChorusWidth | this_GetDelayScaleControl_11= ruleGetDelayScaleControl | this_SetOutputPin_12= ruleSetOutputPin | this_GetBaseAddress_13= ruleGetBaseAddress | this_GetSamplesFromRatio_14= ruleGetSamplesFromRatio | this_MinusDouble_15= ruleMinusDouble | this_DivideDouble_16= ruleDivideDouble | this_DivideInt_17= ruleDivideInt | this_MultiplyDouble_18= ruleMultiplyDouble | this_SemitonesToRmpRate_19= ruleSemitonesToRmpRate | this_Equals_20= ruleEquals | this_EqualsBool_21= ruleEqualsBool )
            {
            // InternalSpinCAD.g:2486:1: (this_IsPinConnected_0= ruleIsPinConnected | this_IsTrue_1= ruleIsTrue | this_IsElse_2= ruleIsElse | this_IsEndif_3= ruleIsEndif | this_IsGreaterThan_4= ruleIsGreaterThan | this_IsEqualTo_5= ruleIsEqualTo | this_IsOr_6= ruleIsOr | this_IsLessThan_7= ruleIsLessThan | this_GetInputDefault_8= ruleGetInputDefault | this_ReadChorusTap_9= ruleReadChorusTap | this_SetChorusWidth_10= ruleSetChorusWidth | this_GetDelayScaleControl_11= ruleGetDelayScaleControl | this_SetOutputPin_12= ruleSetOutputPin | this_GetBaseAddress_13= ruleGetBaseAddress | this_GetSamplesFromRatio_14= ruleGetSamplesFromRatio | this_MinusDouble_15= ruleMinusDouble | this_DivideDouble_16= ruleDivideDouble | this_DivideInt_17= ruleDivideInt | this_MultiplyDouble_18= ruleMultiplyDouble | this_SemitonesToRmpRate_19= ruleSemitonesToRmpRate | this_Equals_20= ruleEquals | this_EqualsBool_21= ruleEqualsBool )
            int alt35=22;
            switch ( input.LA(1) ) {
            case 33:
                {
                alt35=1;
                }
                break;
            case 37:
                {
                alt35=2;
                }
                break;
            case 38:
                {
                alt35=3;
                }
                break;
            case 39:
                {
                alt35=4;
                }
                break;
            case 34:
                {
                alt35=5;
                }
                break;
            case 36:
                {
                alt35=6;
                }
                break;
            case 40:
                {
                alt35=7;
                }
                break;
            case 35:
                {
                alt35=8;
                }
                break;
            case 41:
                {
                alt35=9;
                }
                break;
            case 43:
                {
                alt35=10;
                }
                break;
            case 54:
                {
                alt35=11;
                }
                break;
            case 42:
                {
                alt35=12;
                }
                break;
            case 47:
                {
                alt35=13;
                }
                break;
            case 46:
                {
                alt35=14;
                }
                break;
            case 44:
                {
                alt35=15;
                }
                break;
            case 48:
                {
                alt35=16;
                }
                break;
            case 49:
                {
                alt35=17;
                }
                break;
            case 52:
                {
                alt35=18;
                }
                break;
            case 53:
                {
                alt35=19;
                }
                break;
            case 45:
                {
                alt35=20;
                }
                break;
            case 50:
                {
                alt35=21;
                }
                break;
            case 51:
                {
                alt35=22;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 35, 0, input);

                throw nvae;
            }

            switch (alt35) {
                case 1 :
                    // InternalSpinCAD.g:2487:5: this_IsPinConnected_0= ruleIsPinConnected
                    {
                     
                            newCompositeNode(grammarAccess.getMacroAccess().getIsPinConnectedParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_2);
                    this_IsPinConnected_0=ruleIsPinConnected();

                    state._fsp--;

                     
                            current = this_IsPinConnected_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // InternalSpinCAD.g:2497:5: this_IsTrue_1= ruleIsTrue
                    {
                     
                            newCompositeNode(grammarAccess.getMacroAccess().getIsTrueParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_2);
                    this_IsTrue_1=ruleIsTrue();

                    state._fsp--;

                     
                            current = this_IsTrue_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // InternalSpinCAD.g:2507:5: this_IsElse_2= ruleIsElse
                    {
                     
                            newCompositeNode(grammarAccess.getMacroAccess().getIsElseParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_2);
                    this_IsElse_2=ruleIsElse();

                    state._fsp--;

                     
                            current = this_IsElse_2; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 4 :
                    // InternalSpinCAD.g:2517:5: this_IsEndif_3= ruleIsEndif
                    {
                     
                            newCompositeNode(grammarAccess.getMacroAccess().getIsEndifParserRuleCall_3()); 
                        
                    pushFollow(FOLLOW_2);
                    this_IsEndif_3=ruleIsEndif();

                    state._fsp--;

                     
                            current = this_IsEndif_3; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 5 :
                    // InternalSpinCAD.g:2527:5: this_IsGreaterThan_4= ruleIsGreaterThan
                    {
                     
                            newCompositeNode(grammarAccess.getMacroAccess().getIsGreaterThanParserRuleCall_4()); 
                        
                    pushFollow(FOLLOW_2);
                    this_IsGreaterThan_4=ruleIsGreaterThan();

                    state._fsp--;

                     
                            current = this_IsGreaterThan_4; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 6 :
                    // InternalSpinCAD.g:2537:5: this_IsEqualTo_5= ruleIsEqualTo
                    {
                     
                            newCompositeNode(grammarAccess.getMacroAccess().getIsEqualToParserRuleCall_5()); 
                        
                    pushFollow(FOLLOW_2);
                    this_IsEqualTo_5=ruleIsEqualTo();

                    state._fsp--;

                     
                            current = this_IsEqualTo_5; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 7 :
                    // InternalSpinCAD.g:2547:5: this_IsOr_6= ruleIsOr
                    {
                     
                            newCompositeNode(grammarAccess.getMacroAccess().getIsOrParserRuleCall_6()); 
                        
                    pushFollow(FOLLOW_2);
                    this_IsOr_6=ruleIsOr();

                    state._fsp--;

                     
                            current = this_IsOr_6; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 8 :
                    // InternalSpinCAD.g:2557:5: this_IsLessThan_7= ruleIsLessThan
                    {
                     
                            newCompositeNode(grammarAccess.getMacroAccess().getIsLessThanParserRuleCall_7()); 
                        
                    pushFollow(FOLLOW_2);
                    this_IsLessThan_7=ruleIsLessThan();

                    state._fsp--;

                     
                            current = this_IsLessThan_7; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 9 :
                    // InternalSpinCAD.g:2567:5: this_GetInputDefault_8= ruleGetInputDefault
                    {
                     
                            newCompositeNode(grammarAccess.getMacroAccess().getGetInputDefaultParserRuleCall_8()); 
                        
                    pushFollow(FOLLOW_2);
                    this_GetInputDefault_8=ruleGetInputDefault();

                    state._fsp--;

                     
                            current = this_GetInputDefault_8; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 10 :
                    // InternalSpinCAD.g:2577:5: this_ReadChorusTap_9= ruleReadChorusTap
                    {
                     
                            newCompositeNode(grammarAccess.getMacroAccess().getReadChorusTapParserRuleCall_9()); 
                        
                    pushFollow(FOLLOW_2);
                    this_ReadChorusTap_9=ruleReadChorusTap();

                    state._fsp--;

                     
                            current = this_ReadChorusTap_9; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 11 :
                    // InternalSpinCAD.g:2587:5: this_SetChorusWidth_10= ruleSetChorusWidth
                    {
                     
                            newCompositeNode(grammarAccess.getMacroAccess().getSetChorusWidthParserRuleCall_10()); 
                        
                    pushFollow(FOLLOW_2);
                    this_SetChorusWidth_10=ruleSetChorusWidth();

                    state._fsp--;

                     
                            current = this_SetChorusWidth_10; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 12 :
                    // InternalSpinCAD.g:2597:5: this_GetDelayScaleControl_11= ruleGetDelayScaleControl
                    {
                     
                            newCompositeNode(grammarAccess.getMacroAccess().getGetDelayScaleControlParserRuleCall_11()); 
                        
                    pushFollow(FOLLOW_2);
                    this_GetDelayScaleControl_11=ruleGetDelayScaleControl();

                    state._fsp--;

                     
                            current = this_GetDelayScaleControl_11; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 13 :
                    // InternalSpinCAD.g:2607:5: this_SetOutputPin_12= ruleSetOutputPin
                    {
                     
                            newCompositeNode(grammarAccess.getMacroAccess().getSetOutputPinParserRuleCall_12()); 
                        
                    pushFollow(FOLLOW_2);
                    this_SetOutputPin_12=ruleSetOutputPin();

                    state._fsp--;

                     
                            current = this_SetOutputPin_12; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 14 :
                    // InternalSpinCAD.g:2617:5: this_GetBaseAddress_13= ruleGetBaseAddress
                    {
                     
                            newCompositeNode(grammarAccess.getMacroAccess().getGetBaseAddressParserRuleCall_13()); 
                        
                    pushFollow(FOLLOW_2);
                    this_GetBaseAddress_13=ruleGetBaseAddress();

                    state._fsp--;

                     
                            current = this_GetBaseAddress_13; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 15 :
                    // InternalSpinCAD.g:2627:5: this_GetSamplesFromRatio_14= ruleGetSamplesFromRatio
                    {
                     
                            newCompositeNode(grammarAccess.getMacroAccess().getGetSamplesFromRatioParserRuleCall_14()); 
                        
                    pushFollow(FOLLOW_2);
                    this_GetSamplesFromRatio_14=ruleGetSamplesFromRatio();

                    state._fsp--;

                     
                            current = this_GetSamplesFromRatio_14; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 16 :
                    // InternalSpinCAD.g:2637:5: this_MinusDouble_15= ruleMinusDouble
                    {
                     
                            newCompositeNode(grammarAccess.getMacroAccess().getMinusDoubleParserRuleCall_15()); 
                        
                    pushFollow(FOLLOW_2);
                    this_MinusDouble_15=ruleMinusDouble();

                    state._fsp--;

                     
                            current = this_MinusDouble_15; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 17 :
                    // InternalSpinCAD.g:2647:5: this_DivideDouble_16= ruleDivideDouble
                    {
                     
                            newCompositeNode(grammarAccess.getMacroAccess().getDivideDoubleParserRuleCall_16()); 
                        
                    pushFollow(FOLLOW_2);
                    this_DivideDouble_16=ruleDivideDouble();

                    state._fsp--;

                     
                            current = this_DivideDouble_16; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 18 :
                    // InternalSpinCAD.g:2657:5: this_DivideInt_17= ruleDivideInt
                    {
                     
                            newCompositeNode(grammarAccess.getMacroAccess().getDivideIntParserRuleCall_17()); 
                        
                    pushFollow(FOLLOW_2);
                    this_DivideInt_17=ruleDivideInt();

                    state._fsp--;

                     
                            current = this_DivideInt_17; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 19 :
                    // InternalSpinCAD.g:2667:5: this_MultiplyDouble_18= ruleMultiplyDouble
                    {
                     
                            newCompositeNode(grammarAccess.getMacroAccess().getMultiplyDoubleParserRuleCall_18()); 
                        
                    pushFollow(FOLLOW_2);
                    this_MultiplyDouble_18=ruleMultiplyDouble();

                    state._fsp--;

                     
                            current = this_MultiplyDouble_18; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 20 :
                    // InternalSpinCAD.g:2677:5: this_SemitonesToRmpRate_19= ruleSemitonesToRmpRate
                    {
                     
                            newCompositeNode(grammarAccess.getMacroAccess().getSemitonesToRmpRateParserRuleCall_19()); 
                        
                    pushFollow(FOLLOW_2);
                    this_SemitonesToRmpRate_19=ruleSemitonesToRmpRate();

                    state._fsp--;

                     
                            current = this_SemitonesToRmpRate_19; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 21 :
                    // InternalSpinCAD.g:2687:5: this_Equals_20= ruleEquals
                    {
                     
                            newCompositeNode(grammarAccess.getMacroAccess().getEqualsParserRuleCall_20()); 
                        
                    pushFollow(FOLLOW_2);
                    this_Equals_20=ruleEquals();

                    state._fsp--;

                     
                            current = this_Equals_20; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 22 :
                    // InternalSpinCAD.g:2697:5: this_EqualsBool_21= ruleEqualsBool
                    {
                     
                            newCompositeNode(grammarAccess.getMacroAccess().getEqualsBoolParserRuleCall_21()); 
                        
                    pushFollow(FOLLOW_2);
                    this_EqualsBool_21=ruleEqualsBool();

                    state._fsp--;

                     
                            current = this_EqualsBool_21; 
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
    // $ANTLR end "ruleMacro"


    // $ANTLR start "entryRuleIsPinConnected"
    // InternalSpinCAD.g:2713:1: entryRuleIsPinConnected returns [EObject current=null] : iv_ruleIsPinConnected= ruleIsPinConnected EOF ;
    public final EObject entryRuleIsPinConnected() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIsPinConnected = null;


        try {
            // InternalSpinCAD.g:2714:2: (iv_ruleIsPinConnected= ruleIsPinConnected EOF )
            // InternalSpinCAD.g:2715:2: iv_ruleIsPinConnected= ruleIsPinConnected EOF
            {
             newCompositeNode(grammarAccess.getIsPinConnectedRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleIsPinConnected=ruleIsPinConnected();

            state._fsp--;

             current =iv_ruleIsPinConnected; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleIsPinConnected"


    // $ANTLR start "ruleIsPinConnected"
    // InternalSpinCAD.g:2722:1: ruleIsPinConnected returns [EObject current=null] : (otherlv_0= '@isPinConnected' ( ( (lv_arg1_1_1= RULE_ID | lv_arg1_1_2= RULE_STRING ) ) ) ) ;
    public final EObject ruleIsPinConnected() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_arg1_1_1=null;
        Token lv_arg1_1_2=null;

         enterRule(); 
            
        try {
            // InternalSpinCAD.g:2725:28: ( (otherlv_0= '@isPinConnected' ( ( (lv_arg1_1_1= RULE_ID | lv_arg1_1_2= RULE_STRING ) ) ) ) )
            // InternalSpinCAD.g:2726:1: (otherlv_0= '@isPinConnected' ( ( (lv_arg1_1_1= RULE_ID | lv_arg1_1_2= RULE_STRING ) ) ) )
            {
            // InternalSpinCAD.g:2726:1: (otherlv_0= '@isPinConnected' ( ( (lv_arg1_1_1= RULE_ID | lv_arg1_1_2= RULE_STRING ) ) ) )
            // InternalSpinCAD.g:2726:3: otherlv_0= '@isPinConnected' ( ( (lv_arg1_1_1= RULE_ID | lv_arg1_1_2= RULE_STRING ) ) )
            {
            otherlv_0=(Token)match(input,33,FOLLOW_3); 

                	newLeafNode(otherlv_0, grammarAccess.getIsPinConnectedAccess().getIsPinConnectedKeyword_0());
                
            // InternalSpinCAD.g:2730:1: ( ( (lv_arg1_1_1= RULE_ID | lv_arg1_1_2= RULE_STRING ) ) )
            // InternalSpinCAD.g:2731:1: ( (lv_arg1_1_1= RULE_ID | lv_arg1_1_2= RULE_STRING ) )
            {
            // InternalSpinCAD.g:2731:1: ( (lv_arg1_1_1= RULE_ID | lv_arg1_1_2= RULE_STRING ) )
            // InternalSpinCAD.g:2732:1: (lv_arg1_1_1= RULE_ID | lv_arg1_1_2= RULE_STRING )
            {
            // InternalSpinCAD.g:2732:1: (lv_arg1_1_1= RULE_ID | lv_arg1_1_2= RULE_STRING )
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==RULE_ID) ) {
                alt36=1;
            }
            else if ( (LA36_0==RULE_STRING) ) {
                alt36=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 36, 0, input);

                throw nvae;
            }
            switch (alt36) {
                case 1 :
                    // InternalSpinCAD.g:2733:3: lv_arg1_1_1= RULE_ID
                    {
                    lv_arg1_1_1=(Token)match(input,RULE_ID,FOLLOW_2); 

                    			newLeafNode(lv_arg1_1_1, grammarAccess.getIsPinConnectedAccess().getArg1IDTerminalRuleCall_1_0_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getIsPinConnectedRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"arg1",
                            		lv_arg1_1_1, 
                            		"org.eclipse.xtext.common.Terminals.ID");
                    	    

                    }
                    break;
                case 2 :
                    // InternalSpinCAD.g:2748:8: lv_arg1_1_2= RULE_STRING
                    {
                    lv_arg1_1_2=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    			newLeafNode(lv_arg1_1_2, grammarAccess.getIsPinConnectedAccess().getArg1STRINGTerminalRuleCall_1_0_1()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getIsPinConnectedRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"arg1",
                            		lv_arg1_1_2, 
                            		"com.holycityaudio.spincad.SpinCAD.STRING");
                    	    

                    }
                    break;

            }


            }


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
    // $ANTLR end "ruleIsPinConnected"


    // $ANTLR start "entryRuleIsGreaterThan"
    // InternalSpinCAD.g:2774:1: entryRuleIsGreaterThan returns [EObject current=null] : iv_ruleIsGreaterThan= ruleIsGreaterThan EOF ;
    public final EObject entryRuleIsGreaterThan() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIsGreaterThan = null;


        try {
            // InternalSpinCAD.g:2775:2: (iv_ruleIsGreaterThan= ruleIsGreaterThan EOF )
            // InternalSpinCAD.g:2776:2: iv_ruleIsGreaterThan= ruleIsGreaterThan EOF
            {
             newCompositeNode(grammarAccess.getIsGreaterThanRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleIsGreaterThan=ruleIsGreaterThan();

            state._fsp--;

             current =iv_ruleIsGreaterThan; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleIsGreaterThan"


    // $ANTLR start "ruleIsGreaterThan"
    // InternalSpinCAD.g:2783:1: ruleIsGreaterThan returns [EObject current=null] : (otherlv_0= '@isGreaterThan' ( (lv_variable_1_0= RULE_ID ) ) ( (lv_value_2_0= RULE_INT ) ) ) ;
    public final EObject ruleIsGreaterThan() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_variable_1_0=null;
        Token lv_value_2_0=null;

         enterRule(); 
            
        try {
            // InternalSpinCAD.g:2786:28: ( (otherlv_0= '@isGreaterThan' ( (lv_variable_1_0= RULE_ID ) ) ( (lv_value_2_0= RULE_INT ) ) ) )
            // InternalSpinCAD.g:2787:1: (otherlv_0= '@isGreaterThan' ( (lv_variable_1_0= RULE_ID ) ) ( (lv_value_2_0= RULE_INT ) ) )
            {
            // InternalSpinCAD.g:2787:1: (otherlv_0= '@isGreaterThan' ( (lv_variable_1_0= RULE_ID ) ) ( (lv_value_2_0= RULE_INT ) ) )
            // InternalSpinCAD.g:2787:3: otherlv_0= '@isGreaterThan' ( (lv_variable_1_0= RULE_ID ) ) ( (lv_value_2_0= RULE_INT ) )
            {
            otherlv_0=(Token)match(input,34,FOLLOW_8); 

                	newLeafNode(otherlv_0, grammarAccess.getIsGreaterThanAccess().getIsGreaterThanKeyword_0());
                
            // InternalSpinCAD.g:2791:1: ( (lv_variable_1_0= RULE_ID ) )
            // InternalSpinCAD.g:2792:1: (lv_variable_1_0= RULE_ID )
            {
            // InternalSpinCAD.g:2792:1: (lv_variable_1_0= RULE_ID )
            // InternalSpinCAD.g:2793:3: lv_variable_1_0= RULE_ID
            {
            lv_variable_1_0=(Token)match(input,RULE_ID,FOLLOW_10); 

            			newLeafNode(lv_variable_1_0, grammarAccess.getIsGreaterThanAccess().getVariableIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getIsGreaterThanRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"variable",
                    		lv_variable_1_0, 
                    		"org.eclipse.xtext.common.Terminals.ID");
            	    

            }


            }

            // InternalSpinCAD.g:2809:2: ( (lv_value_2_0= RULE_INT ) )
            // InternalSpinCAD.g:2810:1: (lv_value_2_0= RULE_INT )
            {
            // InternalSpinCAD.g:2810:1: (lv_value_2_0= RULE_INT )
            // InternalSpinCAD.g:2811:3: lv_value_2_0= RULE_INT
            {
            lv_value_2_0=(Token)match(input,RULE_INT,FOLLOW_2); 

            			newLeafNode(lv_value_2_0, grammarAccess.getIsGreaterThanAccess().getValueINTTerminalRuleCall_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getIsGreaterThanRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"value",
                    		lv_value_2_0, 
                    		"org.eclipse.xtext.common.Terminals.INT");
            	    

            }


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
    // $ANTLR end "ruleIsGreaterThan"


    // $ANTLR start "entryRuleIsLessThan"
    // InternalSpinCAD.g:2835:1: entryRuleIsLessThan returns [EObject current=null] : iv_ruleIsLessThan= ruleIsLessThan EOF ;
    public final EObject entryRuleIsLessThan() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIsLessThan = null;


        try {
            // InternalSpinCAD.g:2836:2: (iv_ruleIsLessThan= ruleIsLessThan EOF )
            // InternalSpinCAD.g:2837:2: iv_ruleIsLessThan= ruleIsLessThan EOF
            {
             newCompositeNode(grammarAccess.getIsLessThanRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleIsLessThan=ruleIsLessThan();

            state._fsp--;

             current =iv_ruleIsLessThan; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleIsLessThan"


    // $ANTLR start "ruleIsLessThan"
    // InternalSpinCAD.g:2844:1: ruleIsLessThan returns [EObject current=null] : (otherlv_0= '@isLessThan' ( (lv_variable_1_0= RULE_ID ) ) ( (lv_value_2_0= RULE_INT ) ) ) ;
    public final EObject ruleIsLessThan() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_variable_1_0=null;
        Token lv_value_2_0=null;

         enterRule(); 
            
        try {
            // InternalSpinCAD.g:2847:28: ( (otherlv_0= '@isLessThan' ( (lv_variable_1_0= RULE_ID ) ) ( (lv_value_2_0= RULE_INT ) ) ) )
            // InternalSpinCAD.g:2848:1: (otherlv_0= '@isLessThan' ( (lv_variable_1_0= RULE_ID ) ) ( (lv_value_2_0= RULE_INT ) ) )
            {
            // InternalSpinCAD.g:2848:1: (otherlv_0= '@isLessThan' ( (lv_variable_1_0= RULE_ID ) ) ( (lv_value_2_0= RULE_INT ) ) )
            // InternalSpinCAD.g:2848:3: otherlv_0= '@isLessThan' ( (lv_variable_1_0= RULE_ID ) ) ( (lv_value_2_0= RULE_INT ) )
            {
            otherlv_0=(Token)match(input,35,FOLLOW_8); 

                	newLeafNode(otherlv_0, grammarAccess.getIsLessThanAccess().getIsLessThanKeyword_0());
                
            // InternalSpinCAD.g:2852:1: ( (lv_variable_1_0= RULE_ID ) )
            // InternalSpinCAD.g:2853:1: (lv_variable_1_0= RULE_ID )
            {
            // InternalSpinCAD.g:2853:1: (lv_variable_1_0= RULE_ID )
            // InternalSpinCAD.g:2854:3: lv_variable_1_0= RULE_ID
            {
            lv_variable_1_0=(Token)match(input,RULE_ID,FOLLOW_10); 

            			newLeafNode(lv_variable_1_0, grammarAccess.getIsLessThanAccess().getVariableIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getIsLessThanRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"variable",
                    		lv_variable_1_0, 
                    		"org.eclipse.xtext.common.Terminals.ID");
            	    

            }


            }

            // InternalSpinCAD.g:2870:2: ( (lv_value_2_0= RULE_INT ) )
            // InternalSpinCAD.g:2871:1: (lv_value_2_0= RULE_INT )
            {
            // InternalSpinCAD.g:2871:1: (lv_value_2_0= RULE_INT )
            // InternalSpinCAD.g:2872:3: lv_value_2_0= RULE_INT
            {
            lv_value_2_0=(Token)match(input,RULE_INT,FOLLOW_2); 

            			newLeafNode(lv_value_2_0, grammarAccess.getIsLessThanAccess().getValueINTTerminalRuleCall_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getIsLessThanRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"value",
                    		lv_value_2_0, 
                    		"org.eclipse.xtext.common.Terminals.INT");
            	    

            }


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
    // $ANTLR end "ruleIsLessThan"


    // $ANTLR start "entryRuleIsEqualTo"
    // InternalSpinCAD.g:2896:1: entryRuleIsEqualTo returns [EObject current=null] : iv_ruleIsEqualTo= ruleIsEqualTo EOF ;
    public final EObject entryRuleIsEqualTo() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIsEqualTo = null;


        try {
            // InternalSpinCAD.g:2897:2: (iv_ruleIsEqualTo= ruleIsEqualTo EOF )
            // InternalSpinCAD.g:2898:2: iv_ruleIsEqualTo= ruleIsEqualTo EOF
            {
             newCompositeNode(grammarAccess.getIsEqualToRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleIsEqualTo=ruleIsEqualTo();

            state._fsp--;

             current =iv_ruleIsEqualTo; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleIsEqualTo"


    // $ANTLR start "ruleIsEqualTo"
    // InternalSpinCAD.g:2905:1: ruleIsEqualTo returns [EObject current=null] : (otherlv_0= '@isEqualTo' ( (lv_variable_1_0= RULE_ID ) ) ( (lv_value_2_0= RULE_INT ) ) ) ;
    public final EObject ruleIsEqualTo() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_variable_1_0=null;
        Token lv_value_2_0=null;

         enterRule(); 
            
        try {
            // InternalSpinCAD.g:2908:28: ( (otherlv_0= '@isEqualTo' ( (lv_variable_1_0= RULE_ID ) ) ( (lv_value_2_0= RULE_INT ) ) ) )
            // InternalSpinCAD.g:2909:1: (otherlv_0= '@isEqualTo' ( (lv_variable_1_0= RULE_ID ) ) ( (lv_value_2_0= RULE_INT ) ) )
            {
            // InternalSpinCAD.g:2909:1: (otherlv_0= '@isEqualTo' ( (lv_variable_1_0= RULE_ID ) ) ( (lv_value_2_0= RULE_INT ) ) )
            // InternalSpinCAD.g:2909:3: otherlv_0= '@isEqualTo' ( (lv_variable_1_0= RULE_ID ) ) ( (lv_value_2_0= RULE_INT ) )
            {
            otherlv_0=(Token)match(input,36,FOLLOW_8); 

                	newLeafNode(otherlv_0, grammarAccess.getIsEqualToAccess().getIsEqualToKeyword_0());
                
            // InternalSpinCAD.g:2913:1: ( (lv_variable_1_0= RULE_ID ) )
            // InternalSpinCAD.g:2914:1: (lv_variable_1_0= RULE_ID )
            {
            // InternalSpinCAD.g:2914:1: (lv_variable_1_0= RULE_ID )
            // InternalSpinCAD.g:2915:3: lv_variable_1_0= RULE_ID
            {
            lv_variable_1_0=(Token)match(input,RULE_ID,FOLLOW_10); 

            			newLeafNode(lv_variable_1_0, grammarAccess.getIsEqualToAccess().getVariableIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getIsEqualToRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"variable",
                    		lv_variable_1_0, 
                    		"org.eclipse.xtext.common.Terminals.ID");
            	    

            }


            }

            // InternalSpinCAD.g:2931:2: ( (lv_value_2_0= RULE_INT ) )
            // InternalSpinCAD.g:2932:1: (lv_value_2_0= RULE_INT )
            {
            // InternalSpinCAD.g:2932:1: (lv_value_2_0= RULE_INT )
            // InternalSpinCAD.g:2933:3: lv_value_2_0= RULE_INT
            {
            lv_value_2_0=(Token)match(input,RULE_INT,FOLLOW_2); 

            			newLeafNode(lv_value_2_0, grammarAccess.getIsEqualToAccess().getValueINTTerminalRuleCall_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getIsEqualToRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"value",
                    		lv_value_2_0, 
                    		"org.eclipse.xtext.common.Terminals.INT");
            	    

            }


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
    // $ANTLR end "ruleIsEqualTo"


    // $ANTLR start "entryRuleIsTrue"
    // InternalSpinCAD.g:2957:1: entryRuleIsTrue returns [EObject current=null] : iv_ruleIsTrue= ruleIsTrue EOF ;
    public final EObject entryRuleIsTrue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIsTrue = null;


        try {
            // InternalSpinCAD.g:2958:2: (iv_ruleIsTrue= ruleIsTrue EOF )
            // InternalSpinCAD.g:2959:2: iv_ruleIsTrue= ruleIsTrue EOF
            {
             newCompositeNode(grammarAccess.getIsTrueRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleIsTrue=ruleIsTrue();

            state._fsp--;

             current =iv_ruleIsTrue; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleIsTrue"


    // $ANTLR start "ruleIsTrue"
    // InternalSpinCAD.g:2966:1: ruleIsTrue returns [EObject current=null] : (otherlv_0= '@isTrue' ( (lv_variable_1_0= RULE_ID ) ) ) ;
    public final EObject ruleIsTrue() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_variable_1_0=null;

         enterRule(); 
            
        try {
            // InternalSpinCAD.g:2969:28: ( (otherlv_0= '@isTrue' ( (lv_variable_1_0= RULE_ID ) ) ) )
            // InternalSpinCAD.g:2970:1: (otherlv_0= '@isTrue' ( (lv_variable_1_0= RULE_ID ) ) )
            {
            // InternalSpinCAD.g:2970:1: (otherlv_0= '@isTrue' ( (lv_variable_1_0= RULE_ID ) ) )
            // InternalSpinCAD.g:2970:3: otherlv_0= '@isTrue' ( (lv_variable_1_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,37,FOLLOW_8); 

                	newLeafNode(otherlv_0, grammarAccess.getIsTrueAccess().getIsTrueKeyword_0());
                
            // InternalSpinCAD.g:2974:1: ( (lv_variable_1_0= RULE_ID ) )
            // InternalSpinCAD.g:2975:1: (lv_variable_1_0= RULE_ID )
            {
            // InternalSpinCAD.g:2975:1: (lv_variable_1_0= RULE_ID )
            // InternalSpinCAD.g:2976:3: lv_variable_1_0= RULE_ID
            {
            lv_variable_1_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            			newLeafNode(lv_variable_1_0, grammarAccess.getIsTrueAccess().getVariableIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getIsTrueRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"variable",
                    		lv_variable_1_0, 
                    		"org.eclipse.xtext.common.Terminals.ID");
            	    

            }


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
    // $ANTLR end "ruleIsTrue"


    // $ANTLR start "entryRuleIsElse"
    // InternalSpinCAD.g:3000:1: entryRuleIsElse returns [EObject current=null] : iv_ruleIsElse= ruleIsElse EOF ;
    public final EObject entryRuleIsElse() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIsElse = null;


        try {
            // InternalSpinCAD.g:3001:2: (iv_ruleIsElse= ruleIsElse EOF )
            // InternalSpinCAD.g:3002:2: iv_ruleIsElse= ruleIsElse EOF
            {
             newCompositeNode(grammarAccess.getIsElseRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleIsElse=ruleIsElse();

            state._fsp--;

             current =iv_ruleIsElse; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleIsElse"


    // $ANTLR start "ruleIsElse"
    // InternalSpinCAD.g:3009:1: ruleIsElse returns [EObject current=null] : ( () otherlv_1= '@else' ) ;
    public final EObject ruleIsElse() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // InternalSpinCAD.g:3012:28: ( ( () otherlv_1= '@else' ) )
            // InternalSpinCAD.g:3013:1: ( () otherlv_1= '@else' )
            {
            // InternalSpinCAD.g:3013:1: ( () otherlv_1= '@else' )
            // InternalSpinCAD.g:3013:2: () otherlv_1= '@else'
            {
            // InternalSpinCAD.g:3013:2: ()
            // InternalSpinCAD.g:3014:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getIsElseAccess().getIsElseAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,38,FOLLOW_2); 

                	newLeafNode(otherlv_1, grammarAccess.getIsElseAccess().getElseKeyword_1());
                

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
    // $ANTLR end "ruleIsElse"


    // $ANTLR start "entryRuleIsEndif"
    // InternalSpinCAD.g:3031:1: entryRuleIsEndif returns [EObject current=null] : iv_ruleIsEndif= ruleIsEndif EOF ;
    public final EObject entryRuleIsEndif() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIsEndif = null;


        try {
            // InternalSpinCAD.g:3032:2: (iv_ruleIsEndif= ruleIsEndif EOF )
            // InternalSpinCAD.g:3033:2: iv_ruleIsEndif= ruleIsEndif EOF
            {
             newCompositeNode(grammarAccess.getIsEndifRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleIsEndif=ruleIsEndif();

            state._fsp--;

             current =iv_ruleIsEndif; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleIsEndif"


    // $ANTLR start "ruleIsEndif"
    // InternalSpinCAD.g:3040:1: ruleIsEndif returns [EObject current=null] : ( () otherlv_1= '@endif' ) ;
    public final EObject ruleIsEndif() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // InternalSpinCAD.g:3043:28: ( ( () otherlv_1= '@endif' ) )
            // InternalSpinCAD.g:3044:1: ( () otherlv_1= '@endif' )
            {
            // InternalSpinCAD.g:3044:1: ( () otherlv_1= '@endif' )
            // InternalSpinCAD.g:3044:2: () otherlv_1= '@endif'
            {
            // InternalSpinCAD.g:3044:2: ()
            // InternalSpinCAD.g:3045:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getIsEndifAccess().getIsEndifAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,39,FOLLOW_2); 

                	newLeafNode(otherlv_1, grammarAccess.getIsEndifAccess().getEndifKeyword_1());
                

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
    // $ANTLR end "ruleIsEndif"


    // $ANTLR start "entryRuleIsOr"
    // InternalSpinCAD.g:3062:1: entryRuleIsOr returns [EObject current=null] : iv_ruleIsOr= ruleIsOr EOF ;
    public final EObject entryRuleIsOr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIsOr = null;


        try {
            // InternalSpinCAD.g:3063:2: (iv_ruleIsOr= ruleIsOr EOF )
            // InternalSpinCAD.g:3064:2: iv_ruleIsOr= ruleIsOr EOF
            {
             newCompositeNode(grammarAccess.getIsOrRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleIsOr=ruleIsOr();

            state._fsp--;

             current =iv_ruleIsOr; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleIsOr"


    // $ANTLR start "ruleIsOr"
    // InternalSpinCAD.g:3071:1: ruleIsOr returns [EObject current=null] : (otherlv_0= '@isOr' ( (lv_var1_1_0= RULE_ID ) ) ( (lv_var2_2_0= RULE_ID ) ) ( (lv_value_3_0= ruleBOOLEAN ) ) ) ;
    public final EObject ruleIsOr() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_var1_1_0=null;
        Token lv_var2_2_0=null;
        AntlrDatatypeRuleToken lv_value_3_0 = null;


         enterRule(); 
            
        try {
            // InternalSpinCAD.g:3074:28: ( (otherlv_0= '@isOr' ( (lv_var1_1_0= RULE_ID ) ) ( (lv_var2_2_0= RULE_ID ) ) ( (lv_value_3_0= ruleBOOLEAN ) ) ) )
            // InternalSpinCAD.g:3075:1: (otherlv_0= '@isOr' ( (lv_var1_1_0= RULE_ID ) ) ( (lv_var2_2_0= RULE_ID ) ) ( (lv_value_3_0= ruleBOOLEAN ) ) )
            {
            // InternalSpinCAD.g:3075:1: (otherlv_0= '@isOr' ( (lv_var1_1_0= RULE_ID ) ) ( (lv_var2_2_0= RULE_ID ) ) ( (lv_value_3_0= ruleBOOLEAN ) ) )
            // InternalSpinCAD.g:3075:3: otherlv_0= '@isOr' ( (lv_var1_1_0= RULE_ID ) ) ( (lv_var2_2_0= RULE_ID ) ) ( (lv_value_3_0= ruleBOOLEAN ) )
            {
            otherlv_0=(Token)match(input,40,FOLLOW_8); 

                	newLeafNode(otherlv_0, grammarAccess.getIsOrAccess().getIsOrKeyword_0());
                
            // InternalSpinCAD.g:3079:1: ( (lv_var1_1_0= RULE_ID ) )
            // InternalSpinCAD.g:3080:1: (lv_var1_1_0= RULE_ID )
            {
            // InternalSpinCAD.g:3080:1: (lv_var1_1_0= RULE_ID )
            // InternalSpinCAD.g:3081:3: lv_var1_1_0= RULE_ID
            {
            lv_var1_1_0=(Token)match(input,RULE_ID,FOLLOW_8); 

            			newLeafNode(lv_var1_1_0, grammarAccess.getIsOrAccess().getVar1IDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getIsOrRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"var1",
                    		lv_var1_1_0, 
                    		"org.eclipse.xtext.common.Terminals.ID");
            	    

            }


            }

            // InternalSpinCAD.g:3097:2: ( (lv_var2_2_0= RULE_ID ) )
            // InternalSpinCAD.g:3098:1: (lv_var2_2_0= RULE_ID )
            {
            // InternalSpinCAD.g:3098:1: (lv_var2_2_0= RULE_ID )
            // InternalSpinCAD.g:3099:3: lv_var2_2_0= RULE_ID
            {
            lv_var2_2_0=(Token)match(input,RULE_ID,FOLLOW_11); 

            			newLeafNode(lv_var2_2_0, grammarAccess.getIsOrAccess().getVar2IDTerminalRuleCall_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getIsOrRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"var2",
                    		lv_var2_2_0, 
                    		"org.eclipse.xtext.common.Terminals.ID");
            	    

            }


            }

            // InternalSpinCAD.g:3115:2: ( (lv_value_3_0= ruleBOOLEAN ) )
            // InternalSpinCAD.g:3116:1: (lv_value_3_0= ruleBOOLEAN )
            {
            // InternalSpinCAD.g:3116:1: (lv_value_3_0= ruleBOOLEAN )
            // InternalSpinCAD.g:3117:3: lv_value_3_0= ruleBOOLEAN
            {
             
            	        newCompositeNode(grammarAccess.getIsOrAccess().getValueBOOLEANParserRuleCall_3_0()); 
            	    
            pushFollow(FOLLOW_2);
            lv_value_3_0=ruleBOOLEAN();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getIsOrRule());
            	        }
                   		set(
                   			current, 
                   			"value",
                    		lv_value_3_0, 
                    		"com.holycityaudio.spincad.SpinCAD.BOOLEAN");
            	        afterParserOrEnumRuleCall();
            	    

            }


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
    // $ANTLR end "ruleIsOr"


    // $ANTLR start "entryRuleGetInputDefault"
    // InternalSpinCAD.g:3141:1: entryRuleGetInputDefault returns [EObject current=null] : iv_ruleGetInputDefault= ruleGetInputDefault EOF ;
    public final EObject entryRuleGetInputDefault() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGetInputDefault = null;


        try {
            // InternalSpinCAD.g:3142:2: (iv_ruleGetInputDefault= ruleGetInputDefault EOF )
            // InternalSpinCAD.g:3143:2: iv_ruleGetInputDefault= ruleGetInputDefault EOF
            {
             newCompositeNode(grammarAccess.getGetInputDefaultRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleGetInputDefault=ruleGetInputDefault();

            state._fsp--;

             current =iv_ruleGetInputDefault; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleGetInputDefault"


    // $ANTLR start "ruleGetInputDefault"
    // InternalSpinCAD.g:3150:1: ruleGetInputDefault returns [EObject current=null] : (otherlv_0= '@getInputDefault' ( (lv_label_1_0= RULE_ID ) ) ( (lv_variable_2_0= RULE_ID ) ) ( (lv_scale_3_0= ruleSPINDOUBLE ) ) ( (lv_defaultVal_4_0= ruleSPINDOUBLE ) ) ) ;
    public final EObject ruleGetInputDefault() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_label_1_0=null;
        Token lv_variable_2_0=null;
        AntlrDatatypeRuleToken lv_scale_3_0 = null;

        AntlrDatatypeRuleToken lv_defaultVal_4_0 = null;


         enterRule(); 
            
        try {
            // InternalSpinCAD.g:3153:28: ( (otherlv_0= '@getInputDefault' ( (lv_label_1_0= RULE_ID ) ) ( (lv_variable_2_0= RULE_ID ) ) ( (lv_scale_3_0= ruleSPINDOUBLE ) ) ( (lv_defaultVal_4_0= ruleSPINDOUBLE ) ) ) )
            // InternalSpinCAD.g:3154:1: (otherlv_0= '@getInputDefault' ( (lv_label_1_0= RULE_ID ) ) ( (lv_variable_2_0= RULE_ID ) ) ( (lv_scale_3_0= ruleSPINDOUBLE ) ) ( (lv_defaultVal_4_0= ruleSPINDOUBLE ) ) )
            {
            // InternalSpinCAD.g:3154:1: (otherlv_0= '@getInputDefault' ( (lv_label_1_0= RULE_ID ) ) ( (lv_variable_2_0= RULE_ID ) ) ( (lv_scale_3_0= ruleSPINDOUBLE ) ) ( (lv_defaultVal_4_0= ruleSPINDOUBLE ) ) )
            // InternalSpinCAD.g:3154:3: otherlv_0= '@getInputDefault' ( (lv_label_1_0= RULE_ID ) ) ( (lv_variable_2_0= RULE_ID ) ) ( (lv_scale_3_0= ruleSPINDOUBLE ) ) ( (lv_defaultVal_4_0= ruleSPINDOUBLE ) )
            {
            otherlv_0=(Token)match(input,41,FOLLOW_8); 

                	newLeafNode(otherlv_0, grammarAccess.getGetInputDefaultAccess().getGetInputDefaultKeyword_0());
                
            // InternalSpinCAD.g:3158:1: ( (lv_label_1_0= RULE_ID ) )
            // InternalSpinCAD.g:3159:1: (lv_label_1_0= RULE_ID )
            {
            // InternalSpinCAD.g:3159:1: (lv_label_1_0= RULE_ID )
            // InternalSpinCAD.g:3160:3: lv_label_1_0= RULE_ID
            {
            lv_label_1_0=(Token)match(input,RULE_ID,FOLLOW_8); 

            			newLeafNode(lv_label_1_0, grammarAccess.getGetInputDefaultAccess().getLabelIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getGetInputDefaultRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"label",
                    		lv_label_1_0, 
                    		"org.eclipse.xtext.common.Terminals.ID");
            	    

            }


            }

            // InternalSpinCAD.g:3176:2: ( (lv_variable_2_0= RULE_ID ) )
            // InternalSpinCAD.g:3177:1: (lv_variable_2_0= RULE_ID )
            {
            // InternalSpinCAD.g:3177:1: (lv_variable_2_0= RULE_ID )
            // InternalSpinCAD.g:3178:3: lv_variable_2_0= RULE_ID
            {
            lv_variable_2_0=(Token)match(input,RULE_ID,FOLLOW_9); 

            			newLeafNode(lv_variable_2_0, grammarAccess.getGetInputDefaultAccess().getVariableIDTerminalRuleCall_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getGetInputDefaultRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"variable",
                    		lv_variable_2_0, 
                    		"org.eclipse.xtext.common.Terminals.ID");
            	    

            }


            }

            // InternalSpinCAD.g:3194:2: ( (lv_scale_3_0= ruleSPINDOUBLE ) )
            // InternalSpinCAD.g:3195:1: (lv_scale_3_0= ruleSPINDOUBLE )
            {
            // InternalSpinCAD.g:3195:1: (lv_scale_3_0= ruleSPINDOUBLE )
            // InternalSpinCAD.g:3196:3: lv_scale_3_0= ruleSPINDOUBLE
            {
             
            	        newCompositeNode(grammarAccess.getGetInputDefaultAccess().getScaleSPINDOUBLEParserRuleCall_3_0()); 
            	    
            pushFollow(FOLLOW_9);
            lv_scale_3_0=ruleSPINDOUBLE();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getGetInputDefaultRule());
            	        }
                   		set(
                   			current, 
                   			"scale",
                    		lv_scale_3_0, 
                    		"com.holycityaudio.spincad.SpinCAD.SPINDOUBLE");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // InternalSpinCAD.g:3212:2: ( (lv_defaultVal_4_0= ruleSPINDOUBLE ) )
            // InternalSpinCAD.g:3213:1: (lv_defaultVal_4_0= ruleSPINDOUBLE )
            {
            // InternalSpinCAD.g:3213:1: (lv_defaultVal_4_0= ruleSPINDOUBLE )
            // InternalSpinCAD.g:3214:3: lv_defaultVal_4_0= ruleSPINDOUBLE
            {
             
            	        newCompositeNode(grammarAccess.getGetInputDefaultAccess().getDefaultValSPINDOUBLEParserRuleCall_4_0()); 
            	    
            pushFollow(FOLLOW_2);
            lv_defaultVal_4_0=ruleSPINDOUBLE();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getGetInputDefaultRule());
            	        }
                   		set(
                   			current, 
                   			"defaultVal",
                    		lv_defaultVal_4_0, 
                    		"com.holycityaudio.spincad.SpinCAD.SPINDOUBLE");
            	        afterParserOrEnumRuleCall();
            	    

            }


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
    // $ANTLR end "ruleGetInputDefault"


    // $ANTLR start "entryRuleGetDelayScaleControl"
    // InternalSpinCAD.g:3238:1: entryRuleGetDelayScaleControl returns [EObject current=null] : iv_ruleGetDelayScaleControl= ruleGetDelayScaleControl EOF ;
    public final EObject entryRuleGetDelayScaleControl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGetDelayScaleControl = null;


        try {
            // InternalSpinCAD.g:3239:2: (iv_ruleGetDelayScaleControl= ruleGetDelayScaleControl EOF )
            // InternalSpinCAD.g:3240:2: iv_ruleGetDelayScaleControl= ruleGetDelayScaleControl EOF
            {
             newCompositeNode(grammarAccess.getGetDelayScaleControlRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleGetDelayScaleControl=ruleGetDelayScaleControl();

            state._fsp--;

             current =iv_ruleGetDelayScaleControl; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleGetDelayScaleControl"


    // $ANTLR start "ruleGetDelayScaleControl"
    // InternalSpinCAD.g:3247:1: ruleGetDelayScaleControl returns [EObject current=null] : (otherlv_0= '@getDelayScaleControl' ( (lv_ratio_1_0= RULE_ID ) ) ( (lv_length_2_0= RULE_ID ) ) ( (lv_offset_3_0= RULE_ID ) ) ( (lv_control_4_0= RULE_ID ) )? ) ;
    public final EObject ruleGetDelayScaleControl() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_ratio_1_0=null;
        Token lv_length_2_0=null;
        Token lv_offset_3_0=null;
        Token lv_control_4_0=null;

         enterRule(); 
            
        try {
            // InternalSpinCAD.g:3250:28: ( (otherlv_0= '@getDelayScaleControl' ( (lv_ratio_1_0= RULE_ID ) ) ( (lv_length_2_0= RULE_ID ) ) ( (lv_offset_3_0= RULE_ID ) ) ( (lv_control_4_0= RULE_ID ) )? ) )
            // InternalSpinCAD.g:3251:1: (otherlv_0= '@getDelayScaleControl' ( (lv_ratio_1_0= RULE_ID ) ) ( (lv_length_2_0= RULE_ID ) ) ( (lv_offset_3_0= RULE_ID ) ) ( (lv_control_4_0= RULE_ID ) )? )
            {
            // InternalSpinCAD.g:3251:1: (otherlv_0= '@getDelayScaleControl' ( (lv_ratio_1_0= RULE_ID ) ) ( (lv_length_2_0= RULE_ID ) ) ( (lv_offset_3_0= RULE_ID ) ) ( (lv_control_4_0= RULE_ID ) )? )
            // InternalSpinCAD.g:3251:3: otherlv_0= '@getDelayScaleControl' ( (lv_ratio_1_0= RULE_ID ) ) ( (lv_length_2_0= RULE_ID ) ) ( (lv_offset_3_0= RULE_ID ) ) ( (lv_control_4_0= RULE_ID ) )?
            {
            otherlv_0=(Token)match(input,42,FOLLOW_8); 

                	newLeafNode(otherlv_0, grammarAccess.getGetDelayScaleControlAccess().getGetDelayScaleControlKeyword_0());
                
            // InternalSpinCAD.g:3255:1: ( (lv_ratio_1_0= RULE_ID ) )
            // InternalSpinCAD.g:3256:1: (lv_ratio_1_0= RULE_ID )
            {
            // InternalSpinCAD.g:3256:1: (lv_ratio_1_0= RULE_ID )
            // InternalSpinCAD.g:3257:3: lv_ratio_1_0= RULE_ID
            {
            lv_ratio_1_0=(Token)match(input,RULE_ID,FOLLOW_8); 

            			newLeafNode(lv_ratio_1_0, grammarAccess.getGetDelayScaleControlAccess().getRatioIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getGetDelayScaleControlRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"ratio",
                    		lv_ratio_1_0, 
                    		"org.eclipse.xtext.common.Terminals.ID");
            	    

            }


            }

            // InternalSpinCAD.g:3273:2: ( (lv_length_2_0= RULE_ID ) )
            // InternalSpinCAD.g:3274:1: (lv_length_2_0= RULE_ID )
            {
            // InternalSpinCAD.g:3274:1: (lv_length_2_0= RULE_ID )
            // InternalSpinCAD.g:3275:3: lv_length_2_0= RULE_ID
            {
            lv_length_2_0=(Token)match(input,RULE_ID,FOLLOW_8); 

            			newLeafNode(lv_length_2_0, grammarAccess.getGetDelayScaleControlAccess().getLengthIDTerminalRuleCall_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getGetDelayScaleControlRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"length",
                    		lv_length_2_0, 
                    		"org.eclipse.xtext.common.Terminals.ID");
            	    

            }


            }

            // InternalSpinCAD.g:3291:2: ( (lv_offset_3_0= RULE_ID ) )
            // InternalSpinCAD.g:3292:1: (lv_offset_3_0= RULE_ID )
            {
            // InternalSpinCAD.g:3292:1: (lv_offset_3_0= RULE_ID )
            // InternalSpinCAD.g:3293:3: lv_offset_3_0= RULE_ID
            {
            lv_offset_3_0=(Token)match(input,RULE_ID,FOLLOW_13); 

            			newLeafNode(lv_offset_3_0, grammarAccess.getGetDelayScaleControlAccess().getOffsetIDTerminalRuleCall_3_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getGetDelayScaleControlRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"offset",
                    		lv_offset_3_0, 
                    		"org.eclipse.xtext.common.Terminals.ID");
            	    

            }


            }

            // InternalSpinCAD.g:3309:2: ( (lv_control_4_0= RULE_ID ) )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==RULE_ID) ) {
                int LA37_1 = input.LA(2);

                if ( (LA37_1==EOF||LA37_1==RULE_ID||LA37_1==RULE_SC_COMMENT||(LA37_1>=19 && LA37_1<=31)||(LA37_1>=33 && LA37_1<=55)||(LA37_1>=57 && LA37_1<=83)) ) {
                    alt37=1;
                }
            }
            switch (alt37) {
                case 1 :
                    // InternalSpinCAD.g:3310:1: (lv_control_4_0= RULE_ID )
                    {
                    // InternalSpinCAD.g:3310:1: (lv_control_4_0= RULE_ID )
                    // InternalSpinCAD.g:3311:3: lv_control_4_0= RULE_ID
                    {
                    lv_control_4_0=(Token)match(input,RULE_ID,FOLLOW_2); 

                    			newLeafNode(lv_control_4_0, grammarAccess.getGetDelayScaleControlAccess().getControlIDTerminalRuleCall_4_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getGetDelayScaleControlRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"control",
                            		lv_control_4_0, 
                            		"org.eclipse.xtext.common.Terminals.ID");
                    	    

                    }


                    }
                    break;

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
    // $ANTLR end "ruleGetDelayScaleControl"


    // $ANTLR start "entryRuleReadChorusTap"
    // InternalSpinCAD.g:3335:1: entryRuleReadChorusTap returns [EObject current=null] : iv_ruleReadChorusTap= ruleReadChorusTap EOF ;
    public final EObject entryRuleReadChorusTap() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReadChorusTap = null;


        try {
            // InternalSpinCAD.g:3336:2: (iv_ruleReadChorusTap= ruleReadChorusTap EOF )
            // InternalSpinCAD.g:3337:2: iv_ruleReadChorusTap= ruleReadChorusTap EOF
            {
             newCompositeNode(grammarAccess.getReadChorusTapRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleReadChorusTap=ruleReadChorusTap();

            state._fsp--;

             current =iv_ruleReadChorusTap; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleReadChorusTap"


    // $ANTLR start "ruleReadChorusTap"
    // InternalSpinCAD.g:3344:1: ruleReadChorusTap returns [EObject current=null] : (otherlv_0= '@readChorusTap' ( (lv_lfo_1_0= RULE_ID ) ) ( (lv_phase_2_0= RULE_INT ) ) ( (lv_ratio_3_0= RULE_ID ) ) ( (lv_length_4_0= RULE_ID ) ) ( (lv_offset_5_0= RULE_ID ) ) ) ;
    public final EObject ruleReadChorusTap() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_lfo_1_0=null;
        Token lv_phase_2_0=null;
        Token lv_ratio_3_0=null;
        Token lv_length_4_0=null;
        Token lv_offset_5_0=null;

         enterRule(); 
            
        try {
            // InternalSpinCAD.g:3347:28: ( (otherlv_0= '@readChorusTap' ( (lv_lfo_1_0= RULE_ID ) ) ( (lv_phase_2_0= RULE_INT ) ) ( (lv_ratio_3_0= RULE_ID ) ) ( (lv_length_4_0= RULE_ID ) ) ( (lv_offset_5_0= RULE_ID ) ) ) )
            // InternalSpinCAD.g:3348:1: (otherlv_0= '@readChorusTap' ( (lv_lfo_1_0= RULE_ID ) ) ( (lv_phase_2_0= RULE_INT ) ) ( (lv_ratio_3_0= RULE_ID ) ) ( (lv_length_4_0= RULE_ID ) ) ( (lv_offset_5_0= RULE_ID ) ) )
            {
            // InternalSpinCAD.g:3348:1: (otherlv_0= '@readChorusTap' ( (lv_lfo_1_0= RULE_ID ) ) ( (lv_phase_2_0= RULE_INT ) ) ( (lv_ratio_3_0= RULE_ID ) ) ( (lv_length_4_0= RULE_ID ) ) ( (lv_offset_5_0= RULE_ID ) ) )
            // InternalSpinCAD.g:3348:3: otherlv_0= '@readChorusTap' ( (lv_lfo_1_0= RULE_ID ) ) ( (lv_phase_2_0= RULE_INT ) ) ( (lv_ratio_3_0= RULE_ID ) ) ( (lv_length_4_0= RULE_ID ) ) ( (lv_offset_5_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,43,FOLLOW_8); 

                	newLeafNode(otherlv_0, grammarAccess.getReadChorusTapAccess().getReadChorusTapKeyword_0());
                
            // InternalSpinCAD.g:3352:1: ( (lv_lfo_1_0= RULE_ID ) )
            // InternalSpinCAD.g:3353:1: (lv_lfo_1_0= RULE_ID )
            {
            // InternalSpinCAD.g:3353:1: (lv_lfo_1_0= RULE_ID )
            // InternalSpinCAD.g:3354:3: lv_lfo_1_0= RULE_ID
            {
            lv_lfo_1_0=(Token)match(input,RULE_ID,FOLLOW_10); 

            			newLeafNode(lv_lfo_1_0, grammarAccess.getReadChorusTapAccess().getLfoIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getReadChorusTapRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"lfo",
                    		lv_lfo_1_0, 
                    		"org.eclipse.xtext.common.Terminals.ID");
            	    

            }


            }

            // InternalSpinCAD.g:3370:2: ( (lv_phase_2_0= RULE_INT ) )
            // InternalSpinCAD.g:3371:1: (lv_phase_2_0= RULE_INT )
            {
            // InternalSpinCAD.g:3371:1: (lv_phase_2_0= RULE_INT )
            // InternalSpinCAD.g:3372:3: lv_phase_2_0= RULE_INT
            {
            lv_phase_2_0=(Token)match(input,RULE_INT,FOLLOW_8); 

            			newLeafNode(lv_phase_2_0, grammarAccess.getReadChorusTapAccess().getPhaseINTTerminalRuleCall_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getReadChorusTapRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"phase",
                    		lv_phase_2_0, 
                    		"org.eclipse.xtext.common.Terminals.INT");
            	    

            }


            }

            // InternalSpinCAD.g:3388:2: ( (lv_ratio_3_0= RULE_ID ) )
            // InternalSpinCAD.g:3389:1: (lv_ratio_3_0= RULE_ID )
            {
            // InternalSpinCAD.g:3389:1: (lv_ratio_3_0= RULE_ID )
            // InternalSpinCAD.g:3390:3: lv_ratio_3_0= RULE_ID
            {
            lv_ratio_3_0=(Token)match(input,RULE_ID,FOLLOW_8); 

            			newLeafNode(lv_ratio_3_0, grammarAccess.getReadChorusTapAccess().getRatioIDTerminalRuleCall_3_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getReadChorusTapRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"ratio",
                    		lv_ratio_3_0, 
                    		"org.eclipse.xtext.common.Terminals.ID");
            	    

            }


            }

            // InternalSpinCAD.g:3406:2: ( (lv_length_4_0= RULE_ID ) )
            // InternalSpinCAD.g:3407:1: (lv_length_4_0= RULE_ID )
            {
            // InternalSpinCAD.g:3407:1: (lv_length_4_0= RULE_ID )
            // InternalSpinCAD.g:3408:3: lv_length_4_0= RULE_ID
            {
            lv_length_4_0=(Token)match(input,RULE_ID,FOLLOW_8); 

            			newLeafNode(lv_length_4_0, grammarAccess.getReadChorusTapAccess().getLengthIDTerminalRuleCall_4_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getReadChorusTapRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"length",
                    		lv_length_4_0, 
                    		"org.eclipse.xtext.common.Terminals.ID");
            	    

            }


            }

            // InternalSpinCAD.g:3424:2: ( (lv_offset_5_0= RULE_ID ) )
            // InternalSpinCAD.g:3425:1: (lv_offset_5_0= RULE_ID )
            {
            // InternalSpinCAD.g:3425:1: (lv_offset_5_0= RULE_ID )
            // InternalSpinCAD.g:3426:3: lv_offset_5_0= RULE_ID
            {
            lv_offset_5_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            			newLeafNode(lv_offset_5_0, grammarAccess.getReadChorusTapAccess().getOffsetIDTerminalRuleCall_5_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getReadChorusTapRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"offset",
                    		lv_offset_5_0, 
                    		"org.eclipse.xtext.common.Terminals.ID");
            	    

            }


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
    // $ANTLR end "ruleReadChorusTap"


    // $ANTLR start "entryRuleGetSamplesFromRatio"
    // InternalSpinCAD.g:3450:1: entryRuleGetSamplesFromRatio returns [EObject current=null] : iv_ruleGetSamplesFromRatio= ruleGetSamplesFromRatio EOF ;
    public final EObject entryRuleGetSamplesFromRatio() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGetSamplesFromRatio = null;


        try {
            // InternalSpinCAD.g:3451:2: (iv_ruleGetSamplesFromRatio= ruleGetSamplesFromRatio EOF )
            // InternalSpinCAD.g:3452:2: iv_ruleGetSamplesFromRatio= ruleGetSamplesFromRatio EOF
            {
             newCompositeNode(grammarAccess.getGetSamplesFromRatioRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleGetSamplesFromRatio=ruleGetSamplesFromRatio();

            state._fsp--;

             current =iv_ruleGetSamplesFromRatio; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleGetSamplesFromRatio"


    // $ANTLR start "ruleGetSamplesFromRatio"
    // InternalSpinCAD.g:3459:1: ruleGetSamplesFromRatio returns [EObject current=null] : (otherlv_0= '@getSamplesFromRatio' ( (lv_variable_1_0= RULE_ID ) ) ( (lv_ratio_2_0= ruleSPINDOUBLE ) ) ( (lv_length_3_0= ruleSPINDOUBLE ) ) ) ;
    public final EObject ruleGetSamplesFromRatio() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_variable_1_0=null;
        AntlrDatatypeRuleToken lv_ratio_2_0 = null;

        AntlrDatatypeRuleToken lv_length_3_0 = null;


         enterRule(); 
            
        try {
            // InternalSpinCAD.g:3462:28: ( (otherlv_0= '@getSamplesFromRatio' ( (lv_variable_1_0= RULE_ID ) ) ( (lv_ratio_2_0= ruleSPINDOUBLE ) ) ( (lv_length_3_0= ruleSPINDOUBLE ) ) ) )
            // InternalSpinCAD.g:3463:1: (otherlv_0= '@getSamplesFromRatio' ( (lv_variable_1_0= RULE_ID ) ) ( (lv_ratio_2_0= ruleSPINDOUBLE ) ) ( (lv_length_3_0= ruleSPINDOUBLE ) ) )
            {
            // InternalSpinCAD.g:3463:1: (otherlv_0= '@getSamplesFromRatio' ( (lv_variable_1_0= RULE_ID ) ) ( (lv_ratio_2_0= ruleSPINDOUBLE ) ) ( (lv_length_3_0= ruleSPINDOUBLE ) ) )
            // InternalSpinCAD.g:3463:3: otherlv_0= '@getSamplesFromRatio' ( (lv_variable_1_0= RULE_ID ) ) ( (lv_ratio_2_0= ruleSPINDOUBLE ) ) ( (lv_length_3_0= ruleSPINDOUBLE ) )
            {
            otherlv_0=(Token)match(input,44,FOLLOW_8); 

                	newLeafNode(otherlv_0, grammarAccess.getGetSamplesFromRatioAccess().getGetSamplesFromRatioKeyword_0());
                
            // InternalSpinCAD.g:3467:1: ( (lv_variable_1_0= RULE_ID ) )
            // InternalSpinCAD.g:3468:1: (lv_variable_1_0= RULE_ID )
            {
            // InternalSpinCAD.g:3468:1: (lv_variable_1_0= RULE_ID )
            // InternalSpinCAD.g:3469:3: lv_variable_1_0= RULE_ID
            {
            lv_variable_1_0=(Token)match(input,RULE_ID,FOLLOW_9); 

            			newLeafNode(lv_variable_1_0, grammarAccess.getGetSamplesFromRatioAccess().getVariableIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getGetSamplesFromRatioRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"variable",
                    		lv_variable_1_0, 
                    		"org.eclipse.xtext.common.Terminals.ID");
            	    

            }


            }

            // InternalSpinCAD.g:3485:2: ( (lv_ratio_2_0= ruleSPINDOUBLE ) )
            // InternalSpinCAD.g:3486:1: (lv_ratio_2_0= ruleSPINDOUBLE )
            {
            // InternalSpinCAD.g:3486:1: (lv_ratio_2_0= ruleSPINDOUBLE )
            // InternalSpinCAD.g:3487:3: lv_ratio_2_0= ruleSPINDOUBLE
            {
             
            	        newCompositeNode(grammarAccess.getGetSamplesFromRatioAccess().getRatioSPINDOUBLEParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_9);
            lv_ratio_2_0=ruleSPINDOUBLE();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getGetSamplesFromRatioRule());
            	        }
                   		set(
                   			current, 
                   			"ratio",
                    		lv_ratio_2_0, 
                    		"com.holycityaudio.spincad.SpinCAD.SPINDOUBLE");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // InternalSpinCAD.g:3503:2: ( (lv_length_3_0= ruleSPINDOUBLE ) )
            // InternalSpinCAD.g:3504:1: (lv_length_3_0= ruleSPINDOUBLE )
            {
            // InternalSpinCAD.g:3504:1: (lv_length_3_0= ruleSPINDOUBLE )
            // InternalSpinCAD.g:3505:3: lv_length_3_0= ruleSPINDOUBLE
            {
             
            	        newCompositeNode(grammarAccess.getGetSamplesFromRatioAccess().getLengthSPINDOUBLEParserRuleCall_3_0()); 
            	    
            pushFollow(FOLLOW_2);
            lv_length_3_0=ruleSPINDOUBLE();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getGetSamplesFromRatioRule());
            	        }
                   		set(
                   			current, 
                   			"length",
                    		lv_length_3_0, 
                    		"com.holycityaudio.spincad.SpinCAD.SPINDOUBLE");
            	        afterParserOrEnumRuleCall();
            	    

            }


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
    // $ANTLR end "ruleGetSamplesFromRatio"


    // $ANTLR start "entryRuleSemitonesToRmpRate"
    // InternalSpinCAD.g:3529:1: entryRuleSemitonesToRmpRate returns [EObject current=null] : iv_ruleSemitonesToRmpRate= ruleSemitonesToRmpRate EOF ;
    public final EObject entryRuleSemitonesToRmpRate() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSemitonesToRmpRate = null;


        try {
            // InternalSpinCAD.g:3530:2: (iv_ruleSemitonesToRmpRate= ruleSemitonesToRmpRate EOF )
            // InternalSpinCAD.g:3531:2: iv_ruleSemitonesToRmpRate= ruleSemitonesToRmpRate EOF
            {
             newCompositeNode(grammarAccess.getSemitonesToRmpRateRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSemitonesToRmpRate=ruleSemitonesToRmpRate();

            state._fsp--;

             current =iv_ruleSemitonesToRmpRate; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleSemitonesToRmpRate"


    // $ANTLR start "ruleSemitonesToRmpRate"
    // InternalSpinCAD.g:3538:1: ruleSemitonesToRmpRate returns [EObject current=null] : (otherlv_0= '@semitonesToRmpRate' ( (lv_variable_1_0= RULE_ID ) ) ( (lv_semitones_2_0= ruleSPINDOUBLE ) ) ) ;
    public final EObject ruleSemitonesToRmpRate() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_variable_1_0=null;
        AntlrDatatypeRuleToken lv_semitones_2_0 = null;


         enterRule(); 
            
        try {
            // InternalSpinCAD.g:3541:28: ( (otherlv_0= '@semitonesToRmpRate' ( (lv_variable_1_0= RULE_ID ) ) ( (lv_semitones_2_0= ruleSPINDOUBLE ) ) ) )
            // InternalSpinCAD.g:3542:1: (otherlv_0= '@semitonesToRmpRate' ( (lv_variable_1_0= RULE_ID ) ) ( (lv_semitones_2_0= ruleSPINDOUBLE ) ) )
            {
            // InternalSpinCAD.g:3542:1: (otherlv_0= '@semitonesToRmpRate' ( (lv_variable_1_0= RULE_ID ) ) ( (lv_semitones_2_0= ruleSPINDOUBLE ) ) )
            // InternalSpinCAD.g:3542:3: otherlv_0= '@semitonesToRmpRate' ( (lv_variable_1_0= RULE_ID ) ) ( (lv_semitones_2_0= ruleSPINDOUBLE ) )
            {
            otherlv_0=(Token)match(input,45,FOLLOW_8); 

                	newLeafNode(otherlv_0, grammarAccess.getSemitonesToRmpRateAccess().getSemitonesToRmpRateKeyword_0());
                
            // InternalSpinCAD.g:3546:1: ( (lv_variable_1_0= RULE_ID ) )
            // InternalSpinCAD.g:3547:1: (lv_variable_1_0= RULE_ID )
            {
            // InternalSpinCAD.g:3547:1: (lv_variable_1_0= RULE_ID )
            // InternalSpinCAD.g:3548:3: lv_variable_1_0= RULE_ID
            {
            lv_variable_1_0=(Token)match(input,RULE_ID,FOLLOW_9); 

            			newLeafNode(lv_variable_1_0, grammarAccess.getSemitonesToRmpRateAccess().getVariableIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getSemitonesToRmpRateRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"variable",
                    		lv_variable_1_0, 
                    		"org.eclipse.xtext.common.Terminals.ID");
            	    

            }


            }

            // InternalSpinCAD.g:3564:2: ( (lv_semitones_2_0= ruleSPINDOUBLE ) )
            // InternalSpinCAD.g:3565:1: (lv_semitones_2_0= ruleSPINDOUBLE )
            {
            // InternalSpinCAD.g:3565:1: (lv_semitones_2_0= ruleSPINDOUBLE )
            // InternalSpinCAD.g:3566:3: lv_semitones_2_0= ruleSPINDOUBLE
            {
             
            	        newCompositeNode(grammarAccess.getSemitonesToRmpRateAccess().getSemitonesSPINDOUBLEParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_2);
            lv_semitones_2_0=ruleSPINDOUBLE();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getSemitonesToRmpRateRule());
            	        }
                   		set(
                   			current, 
                   			"semitones",
                    		lv_semitones_2_0, 
                    		"com.holycityaudio.spincad.SpinCAD.SPINDOUBLE");
            	        afterParserOrEnumRuleCall();
            	    

            }


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
    // $ANTLR end "ruleSemitonesToRmpRate"


    // $ANTLR start "entryRuleGetBaseAddress"
    // InternalSpinCAD.g:3590:1: entryRuleGetBaseAddress returns [EObject current=null] : iv_ruleGetBaseAddress= ruleGetBaseAddress EOF ;
    public final EObject entryRuleGetBaseAddress() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGetBaseAddress = null;


        try {
            // InternalSpinCAD.g:3591:2: (iv_ruleGetBaseAddress= ruleGetBaseAddress EOF )
            // InternalSpinCAD.g:3592:2: iv_ruleGetBaseAddress= ruleGetBaseAddress EOF
            {
             newCompositeNode(grammarAccess.getGetBaseAddressRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleGetBaseAddress=ruleGetBaseAddress();

            state._fsp--;

             current =iv_ruleGetBaseAddress; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleGetBaseAddress"


    // $ANTLR start "ruleGetBaseAddress"
    // InternalSpinCAD.g:3599:1: ruleGetBaseAddress returns [EObject current=null] : ( () otherlv_1= '@getBaseAddress' ) ;
    public final EObject ruleGetBaseAddress() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // InternalSpinCAD.g:3602:28: ( ( () otherlv_1= '@getBaseAddress' ) )
            // InternalSpinCAD.g:3603:1: ( () otherlv_1= '@getBaseAddress' )
            {
            // InternalSpinCAD.g:3603:1: ( () otherlv_1= '@getBaseAddress' )
            // InternalSpinCAD.g:3603:2: () otherlv_1= '@getBaseAddress'
            {
            // InternalSpinCAD.g:3603:2: ()
            // InternalSpinCAD.g:3604:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getGetBaseAddressAccess().getGetBaseAddressAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,46,FOLLOW_2); 

                	newLeafNode(otherlv_1, grammarAccess.getGetBaseAddressAccess().getGetBaseAddressKeyword_1());
                

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
    // $ANTLR end "ruleGetBaseAddress"


    // $ANTLR start "entryRuleSetOutputPin"
    // InternalSpinCAD.g:3621:1: entryRuleSetOutputPin returns [EObject current=null] : iv_ruleSetOutputPin= ruleSetOutputPin EOF ;
    public final EObject entryRuleSetOutputPin() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSetOutputPin = null;


        try {
            // InternalSpinCAD.g:3622:2: (iv_ruleSetOutputPin= ruleSetOutputPin EOF )
            // InternalSpinCAD.g:3623:2: iv_ruleSetOutputPin= ruleSetOutputPin EOF
            {
             newCompositeNode(grammarAccess.getSetOutputPinRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSetOutputPin=ruleSetOutputPin();

            state._fsp--;

             current =iv_ruleSetOutputPin; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleSetOutputPin"


    // $ANTLR start "ruleSetOutputPin"
    // InternalSpinCAD.g:3630:1: ruleSetOutputPin returns [EObject current=null] : (otherlv_0= '@setOutputPin' ( ( (lv_pinName_1_1= RULE_ID | lv_pinName_1_2= RULE_STRING ) ) ) ( (lv_varName_2_0= RULE_ID ) ) ) ;
    public final EObject ruleSetOutputPin() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_pinName_1_1=null;
        Token lv_pinName_1_2=null;
        Token lv_varName_2_0=null;

         enterRule(); 
            
        try {
            // InternalSpinCAD.g:3633:28: ( (otherlv_0= '@setOutputPin' ( ( (lv_pinName_1_1= RULE_ID | lv_pinName_1_2= RULE_STRING ) ) ) ( (lv_varName_2_0= RULE_ID ) ) ) )
            // InternalSpinCAD.g:3634:1: (otherlv_0= '@setOutputPin' ( ( (lv_pinName_1_1= RULE_ID | lv_pinName_1_2= RULE_STRING ) ) ) ( (lv_varName_2_0= RULE_ID ) ) )
            {
            // InternalSpinCAD.g:3634:1: (otherlv_0= '@setOutputPin' ( ( (lv_pinName_1_1= RULE_ID | lv_pinName_1_2= RULE_STRING ) ) ) ( (lv_varName_2_0= RULE_ID ) ) )
            // InternalSpinCAD.g:3634:3: otherlv_0= '@setOutputPin' ( ( (lv_pinName_1_1= RULE_ID | lv_pinName_1_2= RULE_STRING ) ) ) ( (lv_varName_2_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,47,FOLLOW_3); 

                	newLeafNode(otherlv_0, grammarAccess.getSetOutputPinAccess().getSetOutputPinKeyword_0());
                
            // InternalSpinCAD.g:3638:1: ( ( (lv_pinName_1_1= RULE_ID | lv_pinName_1_2= RULE_STRING ) ) )
            // InternalSpinCAD.g:3639:1: ( (lv_pinName_1_1= RULE_ID | lv_pinName_1_2= RULE_STRING ) )
            {
            // InternalSpinCAD.g:3639:1: ( (lv_pinName_1_1= RULE_ID | lv_pinName_1_2= RULE_STRING ) )
            // InternalSpinCAD.g:3640:1: (lv_pinName_1_1= RULE_ID | lv_pinName_1_2= RULE_STRING )
            {
            // InternalSpinCAD.g:3640:1: (lv_pinName_1_1= RULE_ID | lv_pinName_1_2= RULE_STRING )
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==RULE_ID) ) {
                alt38=1;
            }
            else if ( (LA38_0==RULE_STRING) ) {
                alt38=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 38, 0, input);

                throw nvae;
            }
            switch (alt38) {
                case 1 :
                    // InternalSpinCAD.g:3641:3: lv_pinName_1_1= RULE_ID
                    {
                    lv_pinName_1_1=(Token)match(input,RULE_ID,FOLLOW_8); 

                    			newLeafNode(lv_pinName_1_1, grammarAccess.getSetOutputPinAccess().getPinNameIDTerminalRuleCall_1_0_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getSetOutputPinRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"pinName",
                            		lv_pinName_1_1, 
                            		"org.eclipse.xtext.common.Terminals.ID");
                    	    

                    }
                    break;
                case 2 :
                    // InternalSpinCAD.g:3656:8: lv_pinName_1_2= RULE_STRING
                    {
                    lv_pinName_1_2=(Token)match(input,RULE_STRING,FOLLOW_8); 

                    			newLeafNode(lv_pinName_1_2, grammarAccess.getSetOutputPinAccess().getPinNameSTRINGTerminalRuleCall_1_0_1()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getSetOutputPinRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"pinName",
                            		lv_pinName_1_2, 
                            		"com.holycityaudio.spincad.SpinCAD.STRING");
                    	    

                    }
                    break;

            }


            }


            }

            // InternalSpinCAD.g:3674:2: ( (lv_varName_2_0= RULE_ID ) )
            // InternalSpinCAD.g:3675:1: (lv_varName_2_0= RULE_ID )
            {
            // InternalSpinCAD.g:3675:1: (lv_varName_2_0= RULE_ID )
            // InternalSpinCAD.g:3676:3: lv_varName_2_0= RULE_ID
            {
            lv_varName_2_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            			newLeafNode(lv_varName_2_0, grammarAccess.getSetOutputPinAccess().getVarNameIDTerminalRuleCall_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getSetOutputPinRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"varName",
                    		lv_varName_2_0, 
                    		"org.eclipse.xtext.common.Terminals.ID");
            	    

            }


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
    // $ANTLR end "ruleSetOutputPin"


    // $ANTLR start "entryRuleMinusDouble"
    // InternalSpinCAD.g:3700:1: entryRuleMinusDouble returns [EObject current=null] : iv_ruleMinusDouble= ruleMinusDouble EOF ;
    public final EObject entryRuleMinusDouble() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMinusDouble = null;


        try {
            // InternalSpinCAD.g:3701:2: (iv_ruleMinusDouble= ruleMinusDouble EOF )
            // InternalSpinCAD.g:3702:2: iv_ruleMinusDouble= ruleMinusDouble EOF
            {
             newCompositeNode(grammarAccess.getMinusDoubleRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMinusDouble=ruleMinusDouble();

            state._fsp--;

             current =iv_ruleMinusDouble; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleMinusDouble"


    // $ANTLR start "ruleMinusDouble"
    // InternalSpinCAD.g:3709:1: ruleMinusDouble returns [EObject current=null] : (otherlv_0= '@minusDouble' ( (lv_varName_1_0= RULE_ID ) ) ( (lv_high_2_0= RULE_ID ) ) ( (lv_low_3_0= RULE_ID ) ) ) ;
    public final EObject ruleMinusDouble() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_varName_1_0=null;
        Token lv_high_2_0=null;
        Token lv_low_3_0=null;

         enterRule(); 
            
        try {
            // InternalSpinCAD.g:3712:28: ( (otherlv_0= '@minusDouble' ( (lv_varName_1_0= RULE_ID ) ) ( (lv_high_2_0= RULE_ID ) ) ( (lv_low_3_0= RULE_ID ) ) ) )
            // InternalSpinCAD.g:3713:1: (otherlv_0= '@minusDouble' ( (lv_varName_1_0= RULE_ID ) ) ( (lv_high_2_0= RULE_ID ) ) ( (lv_low_3_0= RULE_ID ) ) )
            {
            // InternalSpinCAD.g:3713:1: (otherlv_0= '@minusDouble' ( (lv_varName_1_0= RULE_ID ) ) ( (lv_high_2_0= RULE_ID ) ) ( (lv_low_3_0= RULE_ID ) ) )
            // InternalSpinCAD.g:3713:3: otherlv_0= '@minusDouble' ( (lv_varName_1_0= RULE_ID ) ) ( (lv_high_2_0= RULE_ID ) ) ( (lv_low_3_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,48,FOLLOW_8); 

                	newLeafNode(otherlv_0, grammarAccess.getMinusDoubleAccess().getMinusDoubleKeyword_0());
                
            // InternalSpinCAD.g:3717:1: ( (lv_varName_1_0= RULE_ID ) )
            // InternalSpinCAD.g:3718:1: (lv_varName_1_0= RULE_ID )
            {
            // InternalSpinCAD.g:3718:1: (lv_varName_1_0= RULE_ID )
            // InternalSpinCAD.g:3719:3: lv_varName_1_0= RULE_ID
            {
            lv_varName_1_0=(Token)match(input,RULE_ID,FOLLOW_8); 

            			newLeafNode(lv_varName_1_0, grammarAccess.getMinusDoubleAccess().getVarNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getMinusDoubleRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"varName",
                    		lv_varName_1_0, 
                    		"org.eclipse.xtext.common.Terminals.ID");
            	    

            }


            }

            // InternalSpinCAD.g:3735:2: ( (lv_high_2_0= RULE_ID ) )
            // InternalSpinCAD.g:3736:1: (lv_high_2_0= RULE_ID )
            {
            // InternalSpinCAD.g:3736:1: (lv_high_2_0= RULE_ID )
            // InternalSpinCAD.g:3737:3: lv_high_2_0= RULE_ID
            {
            lv_high_2_0=(Token)match(input,RULE_ID,FOLLOW_8); 

            			newLeafNode(lv_high_2_0, grammarAccess.getMinusDoubleAccess().getHighIDTerminalRuleCall_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getMinusDoubleRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"high",
                    		lv_high_2_0, 
                    		"org.eclipse.xtext.common.Terminals.ID");
            	    

            }


            }

            // InternalSpinCAD.g:3753:2: ( (lv_low_3_0= RULE_ID ) )
            // InternalSpinCAD.g:3754:1: (lv_low_3_0= RULE_ID )
            {
            // InternalSpinCAD.g:3754:1: (lv_low_3_0= RULE_ID )
            // InternalSpinCAD.g:3755:3: lv_low_3_0= RULE_ID
            {
            lv_low_3_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            			newLeafNode(lv_low_3_0, grammarAccess.getMinusDoubleAccess().getLowIDTerminalRuleCall_3_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getMinusDoubleRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"low",
                    		lv_low_3_0, 
                    		"org.eclipse.xtext.common.Terminals.ID");
            	    

            }


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
    // $ANTLR end "ruleMinusDouble"


    // $ANTLR start "entryRuleDivideDouble"
    // InternalSpinCAD.g:3779:1: entryRuleDivideDouble returns [EObject current=null] : iv_ruleDivideDouble= ruleDivideDouble EOF ;
    public final EObject entryRuleDivideDouble() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDivideDouble = null;


        try {
            // InternalSpinCAD.g:3780:2: (iv_ruleDivideDouble= ruleDivideDouble EOF )
            // InternalSpinCAD.g:3781:2: iv_ruleDivideDouble= ruleDivideDouble EOF
            {
             newCompositeNode(grammarAccess.getDivideDoubleRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDivideDouble=ruleDivideDouble();

            state._fsp--;

             current =iv_ruleDivideDouble; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleDivideDouble"


    // $ANTLR start "ruleDivideDouble"
    // InternalSpinCAD.g:3788:1: ruleDivideDouble returns [EObject current=null] : (otherlv_0= '@divideDouble' ( (lv_varName_1_0= RULE_ID ) ) ( (lv_high_2_0= RULE_ID ) ) ( (lv_low_3_0= RULE_ID ) ) ) ;
    public final EObject ruleDivideDouble() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_varName_1_0=null;
        Token lv_high_2_0=null;
        Token lv_low_3_0=null;

         enterRule(); 
            
        try {
            // InternalSpinCAD.g:3791:28: ( (otherlv_0= '@divideDouble' ( (lv_varName_1_0= RULE_ID ) ) ( (lv_high_2_0= RULE_ID ) ) ( (lv_low_3_0= RULE_ID ) ) ) )
            // InternalSpinCAD.g:3792:1: (otherlv_0= '@divideDouble' ( (lv_varName_1_0= RULE_ID ) ) ( (lv_high_2_0= RULE_ID ) ) ( (lv_low_3_0= RULE_ID ) ) )
            {
            // InternalSpinCAD.g:3792:1: (otherlv_0= '@divideDouble' ( (lv_varName_1_0= RULE_ID ) ) ( (lv_high_2_0= RULE_ID ) ) ( (lv_low_3_0= RULE_ID ) ) )
            // InternalSpinCAD.g:3792:3: otherlv_0= '@divideDouble' ( (lv_varName_1_0= RULE_ID ) ) ( (lv_high_2_0= RULE_ID ) ) ( (lv_low_3_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,49,FOLLOW_8); 

                	newLeafNode(otherlv_0, grammarAccess.getDivideDoubleAccess().getDivideDoubleKeyword_0());
                
            // InternalSpinCAD.g:3796:1: ( (lv_varName_1_0= RULE_ID ) )
            // InternalSpinCAD.g:3797:1: (lv_varName_1_0= RULE_ID )
            {
            // InternalSpinCAD.g:3797:1: (lv_varName_1_0= RULE_ID )
            // InternalSpinCAD.g:3798:3: lv_varName_1_0= RULE_ID
            {
            lv_varName_1_0=(Token)match(input,RULE_ID,FOLLOW_8); 

            			newLeafNode(lv_varName_1_0, grammarAccess.getDivideDoubleAccess().getVarNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getDivideDoubleRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"varName",
                    		lv_varName_1_0, 
                    		"org.eclipse.xtext.common.Terminals.ID");
            	    

            }


            }

            // InternalSpinCAD.g:3814:2: ( (lv_high_2_0= RULE_ID ) )
            // InternalSpinCAD.g:3815:1: (lv_high_2_0= RULE_ID )
            {
            // InternalSpinCAD.g:3815:1: (lv_high_2_0= RULE_ID )
            // InternalSpinCAD.g:3816:3: lv_high_2_0= RULE_ID
            {
            lv_high_2_0=(Token)match(input,RULE_ID,FOLLOW_8); 

            			newLeafNode(lv_high_2_0, grammarAccess.getDivideDoubleAccess().getHighIDTerminalRuleCall_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getDivideDoubleRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"high",
                    		lv_high_2_0, 
                    		"org.eclipse.xtext.common.Terminals.ID");
            	    

            }


            }

            // InternalSpinCAD.g:3832:2: ( (lv_low_3_0= RULE_ID ) )
            // InternalSpinCAD.g:3833:1: (lv_low_3_0= RULE_ID )
            {
            // InternalSpinCAD.g:3833:1: (lv_low_3_0= RULE_ID )
            // InternalSpinCAD.g:3834:3: lv_low_3_0= RULE_ID
            {
            lv_low_3_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            			newLeafNode(lv_low_3_0, grammarAccess.getDivideDoubleAccess().getLowIDTerminalRuleCall_3_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getDivideDoubleRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"low",
                    		lv_low_3_0, 
                    		"org.eclipse.xtext.common.Terminals.ID");
            	    

            }


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
    // $ANTLR end "ruleDivideDouble"


    // $ANTLR start "entryRuleEquals"
    // InternalSpinCAD.g:3858:1: entryRuleEquals returns [EObject current=null] : iv_ruleEquals= ruleEquals EOF ;
    public final EObject entryRuleEquals() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEquals = null;


        try {
            // InternalSpinCAD.g:3859:2: (iv_ruleEquals= ruleEquals EOF )
            // InternalSpinCAD.g:3860:2: iv_ruleEquals= ruleEquals EOF
            {
             newCompositeNode(grammarAccess.getEqualsRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEquals=ruleEquals();

            state._fsp--;

             current =iv_ruleEquals; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleEquals"


    // $ANTLR start "ruleEquals"
    // InternalSpinCAD.g:3867:1: ruleEquals returns [EObject current=null] : (otherlv_0= '@equals' ( (lv_varName_1_0= RULE_ID ) ) ( (lv_value_2_0= ruleSPINDOUBLE ) ) ) ;
    public final EObject ruleEquals() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_varName_1_0=null;
        AntlrDatatypeRuleToken lv_value_2_0 = null;


         enterRule(); 
            
        try {
            // InternalSpinCAD.g:3870:28: ( (otherlv_0= '@equals' ( (lv_varName_1_0= RULE_ID ) ) ( (lv_value_2_0= ruleSPINDOUBLE ) ) ) )
            // InternalSpinCAD.g:3871:1: (otherlv_0= '@equals' ( (lv_varName_1_0= RULE_ID ) ) ( (lv_value_2_0= ruleSPINDOUBLE ) ) )
            {
            // InternalSpinCAD.g:3871:1: (otherlv_0= '@equals' ( (lv_varName_1_0= RULE_ID ) ) ( (lv_value_2_0= ruleSPINDOUBLE ) ) )
            // InternalSpinCAD.g:3871:3: otherlv_0= '@equals' ( (lv_varName_1_0= RULE_ID ) ) ( (lv_value_2_0= ruleSPINDOUBLE ) )
            {
            otherlv_0=(Token)match(input,50,FOLLOW_8); 

                	newLeafNode(otherlv_0, grammarAccess.getEqualsAccess().getEqualsKeyword_0());
                
            // InternalSpinCAD.g:3875:1: ( (lv_varName_1_0= RULE_ID ) )
            // InternalSpinCAD.g:3876:1: (lv_varName_1_0= RULE_ID )
            {
            // InternalSpinCAD.g:3876:1: (lv_varName_1_0= RULE_ID )
            // InternalSpinCAD.g:3877:3: lv_varName_1_0= RULE_ID
            {
            lv_varName_1_0=(Token)match(input,RULE_ID,FOLLOW_9); 

            			newLeafNode(lv_varName_1_0, grammarAccess.getEqualsAccess().getVarNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getEqualsRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"varName",
                    		lv_varName_1_0, 
                    		"org.eclipse.xtext.common.Terminals.ID");
            	    

            }


            }

            // InternalSpinCAD.g:3893:2: ( (lv_value_2_0= ruleSPINDOUBLE ) )
            // InternalSpinCAD.g:3894:1: (lv_value_2_0= ruleSPINDOUBLE )
            {
            // InternalSpinCAD.g:3894:1: (lv_value_2_0= ruleSPINDOUBLE )
            // InternalSpinCAD.g:3895:3: lv_value_2_0= ruleSPINDOUBLE
            {
             
            	        newCompositeNode(grammarAccess.getEqualsAccess().getValueSPINDOUBLEParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_2);
            lv_value_2_0=ruleSPINDOUBLE();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getEqualsRule());
            	        }
                   		set(
                   			current, 
                   			"value",
                    		lv_value_2_0, 
                    		"com.holycityaudio.spincad.SpinCAD.SPINDOUBLE");
            	        afterParserOrEnumRuleCall();
            	    

            }


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
    // $ANTLR end "ruleEquals"


    // $ANTLR start "entryRuleEqualsBool"
    // InternalSpinCAD.g:3919:1: entryRuleEqualsBool returns [EObject current=null] : iv_ruleEqualsBool= ruleEqualsBool EOF ;
    public final EObject entryRuleEqualsBool() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEqualsBool = null;


        try {
            // InternalSpinCAD.g:3920:2: (iv_ruleEqualsBool= ruleEqualsBool EOF )
            // InternalSpinCAD.g:3921:2: iv_ruleEqualsBool= ruleEqualsBool EOF
            {
             newCompositeNode(grammarAccess.getEqualsBoolRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEqualsBool=ruleEqualsBool();

            state._fsp--;

             current =iv_ruleEqualsBool; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleEqualsBool"


    // $ANTLR start "ruleEqualsBool"
    // InternalSpinCAD.g:3928:1: ruleEqualsBool returns [EObject current=null] : (otherlv_0= '@equalsBool' ( (lv_varName_1_0= RULE_ID ) ) ( (lv_value_2_0= ruleBOOLEAN ) ) ) ;
    public final EObject ruleEqualsBool() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_varName_1_0=null;
        AntlrDatatypeRuleToken lv_value_2_0 = null;


         enterRule(); 
            
        try {
            // InternalSpinCAD.g:3931:28: ( (otherlv_0= '@equalsBool' ( (lv_varName_1_0= RULE_ID ) ) ( (lv_value_2_0= ruleBOOLEAN ) ) ) )
            // InternalSpinCAD.g:3932:1: (otherlv_0= '@equalsBool' ( (lv_varName_1_0= RULE_ID ) ) ( (lv_value_2_0= ruleBOOLEAN ) ) )
            {
            // InternalSpinCAD.g:3932:1: (otherlv_0= '@equalsBool' ( (lv_varName_1_0= RULE_ID ) ) ( (lv_value_2_0= ruleBOOLEAN ) ) )
            // InternalSpinCAD.g:3932:3: otherlv_0= '@equalsBool' ( (lv_varName_1_0= RULE_ID ) ) ( (lv_value_2_0= ruleBOOLEAN ) )
            {
            otherlv_0=(Token)match(input,51,FOLLOW_8); 

                	newLeafNode(otherlv_0, grammarAccess.getEqualsBoolAccess().getEqualsBoolKeyword_0());
                
            // InternalSpinCAD.g:3936:1: ( (lv_varName_1_0= RULE_ID ) )
            // InternalSpinCAD.g:3937:1: (lv_varName_1_0= RULE_ID )
            {
            // InternalSpinCAD.g:3937:1: (lv_varName_1_0= RULE_ID )
            // InternalSpinCAD.g:3938:3: lv_varName_1_0= RULE_ID
            {
            lv_varName_1_0=(Token)match(input,RULE_ID,FOLLOW_11); 

            			newLeafNode(lv_varName_1_0, grammarAccess.getEqualsBoolAccess().getVarNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getEqualsBoolRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"varName",
                    		lv_varName_1_0, 
                    		"org.eclipse.xtext.common.Terminals.ID");
            	    

            }


            }

            // InternalSpinCAD.g:3954:2: ( (lv_value_2_0= ruleBOOLEAN ) )
            // InternalSpinCAD.g:3955:1: (lv_value_2_0= ruleBOOLEAN )
            {
            // InternalSpinCAD.g:3955:1: (lv_value_2_0= ruleBOOLEAN )
            // InternalSpinCAD.g:3956:3: lv_value_2_0= ruleBOOLEAN
            {
             
            	        newCompositeNode(grammarAccess.getEqualsBoolAccess().getValueBOOLEANParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_2);
            lv_value_2_0=ruleBOOLEAN();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getEqualsBoolRule());
            	        }
                   		set(
                   			current, 
                   			"value",
                    		lv_value_2_0, 
                    		"com.holycityaudio.spincad.SpinCAD.BOOLEAN");
            	        afterParserOrEnumRuleCall();
            	    

            }


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
    // $ANTLR end "ruleEqualsBool"


    // $ANTLR start "entryRuleDivideInt"
    // InternalSpinCAD.g:3980:1: entryRuleDivideInt returns [EObject current=null] : iv_ruleDivideInt= ruleDivideInt EOF ;
    public final EObject entryRuleDivideInt() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDivideInt = null;


        try {
            // InternalSpinCAD.g:3981:2: (iv_ruleDivideInt= ruleDivideInt EOF )
            // InternalSpinCAD.g:3982:2: iv_ruleDivideInt= ruleDivideInt EOF
            {
             newCompositeNode(grammarAccess.getDivideIntRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDivideInt=ruleDivideInt();

            state._fsp--;

             current =iv_ruleDivideInt; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleDivideInt"


    // $ANTLR start "ruleDivideInt"
    // InternalSpinCAD.g:3989:1: ruleDivideInt returns [EObject current=null] : (otherlv_0= '@divideInt' ( (lv_varName_1_0= RULE_ID ) ) ( (lv_high_2_0= RULE_ID ) ) ( (lv_low_3_0= RULE_INT ) ) ) ;
    public final EObject ruleDivideInt() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_varName_1_0=null;
        Token lv_high_2_0=null;
        Token lv_low_3_0=null;

         enterRule(); 
            
        try {
            // InternalSpinCAD.g:3992:28: ( (otherlv_0= '@divideInt' ( (lv_varName_1_0= RULE_ID ) ) ( (lv_high_2_0= RULE_ID ) ) ( (lv_low_3_0= RULE_INT ) ) ) )
            // InternalSpinCAD.g:3993:1: (otherlv_0= '@divideInt' ( (lv_varName_1_0= RULE_ID ) ) ( (lv_high_2_0= RULE_ID ) ) ( (lv_low_3_0= RULE_INT ) ) )
            {
            // InternalSpinCAD.g:3993:1: (otherlv_0= '@divideInt' ( (lv_varName_1_0= RULE_ID ) ) ( (lv_high_2_0= RULE_ID ) ) ( (lv_low_3_0= RULE_INT ) ) )
            // InternalSpinCAD.g:3993:3: otherlv_0= '@divideInt' ( (lv_varName_1_0= RULE_ID ) ) ( (lv_high_2_0= RULE_ID ) ) ( (lv_low_3_0= RULE_INT ) )
            {
            otherlv_0=(Token)match(input,52,FOLLOW_8); 

                	newLeafNode(otherlv_0, grammarAccess.getDivideIntAccess().getDivideIntKeyword_0());
                
            // InternalSpinCAD.g:3997:1: ( (lv_varName_1_0= RULE_ID ) )
            // InternalSpinCAD.g:3998:1: (lv_varName_1_0= RULE_ID )
            {
            // InternalSpinCAD.g:3998:1: (lv_varName_1_0= RULE_ID )
            // InternalSpinCAD.g:3999:3: lv_varName_1_0= RULE_ID
            {
            lv_varName_1_0=(Token)match(input,RULE_ID,FOLLOW_8); 

            			newLeafNode(lv_varName_1_0, grammarAccess.getDivideIntAccess().getVarNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getDivideIntRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"varName",
                    		lv_varName_1_0, 
                    		"org.eclipse.xtext.common.Terminals.ID");
            	    

            }


            }

            // InternalSpinCAD.g:4015:2: ( (lv_high_2_0= RULE_ID ) )
            // InternalSpinCAD.g:4016:1: (lv_high_2_0= RULE_ID )
            {
            // InternalSpinCAD.g:4016:1: (lv_high_2_0= RULE_ID )
            // InternalSpinCAD.g:4017:3: lv_high_2_0= RULE_ID
            {
            lv_high_2_0=(Token)match(input,RULE_ID,FOLLOW_10); 

            			newLeafNode(lv_high_2_0, grammarAccess.getDivideIntAccess().getHighIDTerminalRuleCall_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getDivideIntRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"high",
                    		lv_high_2_0, 
                    		"org.eclipse.xtext.common.Terminals.ID");
            	    

            }


            }

            // InternalSpinCAD.g:4033:2: ( (lv_low_3_0= RULE_INT ) )
            // InternalSpinCAD.g:4034:1: (lv_low_3_0= RULE_INT )
            {
            // InternalSpinCAD.g:4034:1: (lv_low_3_0= RULE_INT )
            // InternalSpinCAD.g:4035:3: lv_low_3_0= RULE_INT
            {
            lv_low_3_0=(Token)match(input,RULE_INT,FOLLOW_2); 

            			newLeafNode(lv_low_3_0, grammarAccess.getDivideIntAccess().getLowINTTerminalRuleCall_3_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getDivideIntRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"low",
                    		lv_low_3_0, 
                    		"org.eclipse.xtext.common.Terminals.INT");
            	    

            }


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
    // $ANTLR end "ruleDivideInt"


    // $ANTLR start "entryRuleMultiplyDouble"
    // InternalSpinCAD.g:4059:1: entryRuleMultiplyDouble returns [EObject current=null] : iv_ruleMultiplyDouble= ruleMultiplyDouble EOF ;
    public final EObject entryRuleMultiplyDouble() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMultiplyDouble = null;


        try {
            // InternalSpinCAD.g:4060:2: (iv_ruleMultiplyDouble= ruleMultiplyDouble EOF )
            // InternalSpinCAD.g:4061:2: iv_ruleMultiplyDouble= ruleMultiplyDouble EOF
            {
             newCompositeNode(grammarAccess.getMultiplyDoubleRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMultiplyDouble=ruleMultiplyDouble();

            state._fsp--;

             current =iv_ruleMultiplyDouble; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleMultiplyDouble"


    // $ANTLR start "ruleMultiplyDouble"
    // InternalSpinCAD.g:4068:1: ruleMultiplyDouble returns [EObject current=null] : (otherlv_0= '@multiplyDouble' ( (lv_varName_1_0= RULE_ID ) ) ( (lv_high_2_0= RULE_ID ) ) ( (lv_low_3_0= RULE_ID ) ) ) ;
    public final EObject ruleMultiplyDouble() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_varName_1_0=null;
        Token lv_high_2_0=null;
        Token lv_low_3_0=null;

         enterRule(); 
            
        try {
            // InternalSpinCAD.g:4071:28: ( (otherlv_0= '@multiplyDouble' ( (lv_varName_1_0= RULE_ID ) ) ( (lv_high_2_0= RULE_ID ) ) ( (lv_low_3_0= RULE_ID ) ) ) )
            // InternalSpinCAD.g:4072:1: (otherlv_0= '@multiplyDouble' ( (lv_varName_1_0= RULE_ID ) ) ( (lv_high_2_0= RULE_ID ) ) ( (lv_low_3_0= RULE_ID ) ) )
            {
            // InternalSpinCAD.g:4072:1: (otherlv_0= '@multiplyDouble' ( (lv_varName_1_0= RULE_ID ) ) ( (lv_high_2_0= RULE_ID ) ) ( (lv_low_3_0= RULE_ID ) ) )
            // InternalSpinCAD.g:4072:3: otherlv_0= '@multiplyDouble' ( (lv_varName_1_0= RULE_ID ) ) ( (lv_high_2_0= RULE_ID ) ) ( (lv_low_3_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,53,FOLLOW_8); 

                	newLeafNode(otherlv_0, grammarAccess.getMultiplyDoubleAccess().getMultiplyDoubleKeyword_0());
                
            // InternalSpinCAD.g:4076:1: ( (lv_varName_1_0= RULE_ID ) )
            // InternalSpinCAD.g:4077:1: (lv_varName_1_0= RULE_ID )
            {
            // InternalSpinCAD.g:4077:1: (lv_varName_1_0= RULE_ID )
            // InternalSpinCAD.g:4078:3: lv_varName_1_0= RULE_ID
            {
            lv_varName_1_0=(Token)match(input,RULE_ID,FOLLOW_8); 

            			newLeafNode(lv_varName_1_0, grammarAccess.getMultiplyDoubleAccess().getVarNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getMultiplyDoubleRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"varName",
                    		lv_varName_1_0, 
                    		"org.eclipse.xtext.common.Terminals.ID");
            	    

            }


            }

            // InternalSpinCAD.g:4094:2: ( (lv_high_2_0= RULE_ID ) )
            // InternalSpinCAD.g:4095:1: (lv_high_2_0= RULE_ID )
            {
            // InternalSpinCAD.g:4095:1: (lv_high_2_0= RULE_ID )
            // InternalSpinCAD.g:4096:3: lv_high_2_0= RULE_ID
            {
            lv_high_2_0=(Token)match(input,RULE_ID,FOLLOW_8); 

            			newLeafNode(lv_high_2_0, grammarAccess.getMultiplyDoubleAccess().getHighIDTerminalRuleCall_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getMultiplyDoubleRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"high",
                    		lv_high_2_0, 
                    		"org.eclipse.xtext.common.Terminals.ID");
            	    

            }


            }

            // InternalSpinCAD.g:4112:2: ( (lv_low_3_0= RULE_ID ) )
            // InternalSpinCAD.g:4113:1: (lv_low_3_0= RULE_ID )
            {
            // InternalSpinCAD.g:4113:1: (lv_low_3_0= RULE_ID )
            // InternalSpinCAD.g:4114:3: lv_low_3_0= RULE_ID
            {
            lv_low_3_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            			newLeafNode(lv_low_3_0, grammarAccess.getMultiplyDoubleAccess().getLowIDTerminalRuleCall_3_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getMultiplyDoubleRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"low",
                    		lv_low_3_0, 
                    		"org.eclipse.xtext.common.Terminals.ID");
            	    

            }


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
    // $ANTLR end "ruleMultiplyDouble"


    // $ANTLR start "entryRuleSetChorusWidth"
    // InternalSpinCAD.g:4138:1: entryRuleSetChorusWidth returns [EObject current=null] : iv_ruleSetChorusWidth= ruleSetChorusWidth EOF ;
    public final EObject entryRuleSetChorusWidth() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSetChorusWidth = null;


        try {
            // InternalSpinCAD.g:4139:2: (iv_ruleSetChorusWidth= ruleSetChorusWidth EOF )
            // InternalSpinCAD.g:4140:2: iv_ruleSetChorusWidth= ruleSetChorusWidth EOF
            {
             newCompositeNode(grammarAccess.getSetChorusWidthRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSetChorusWidth=ruleSetChorusWidth();

            state._fsp--;

             current =iv_ruleSetChorusWidth; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleSetChorusWidth"


    // $ANTLR start "ruleSetChorusWidth"
    // InternalSpinCAD.g:4147:1: ruleSetChorusWidth returns [EObject current=null] : (otherlv_0= '@setChorusWidth' ( (lv_varName_1_0= RULE_ID ) ) ( (lv_length_2_0= RULE_ID ) ) ( (lv_scale_3_0= RULE_ID ) ) ) ;
    public final EObject ruleSetChorusWidth() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_varName_1_0=null;
        Token lv_length_2_0=null;
        Token lv_scale_3_0=null;

         enterRule(); 
            
        try {
            // InternalSpinCAD.g:4150:28: ( (otherlv_0= '@setChorusWidth' ( (lv_varName_1_0= RULE_ID ) ) ( (lv_length_2_0= RULE_ID ) ) ( (lv_scale_3_0= RULE_ID ) ) ) )
            // InternalSpinCAD.g:4151:1: (otherlv_0= '@setChorusWidth' ( (lv_varName_1_0= RULE_ID ) ) ( (lv_length_2_0= RULE_ID ) ) ( (lv_scale_3_0= RULE_ID ) ) )
            {
            // InternalSpinCAD.g:4151:1: (otherlv_0= '@setChorusWidth' ( (lv_varName_1_0= RULE_ID ) ) ( (lv_length_2_0= RULE_ID ) ) ( (lv_scale_3_0= RULE_ID ) ) )
            // InternalSpinCAD.g:4151:3: otherlv_0= '@setChorusWidth' ( (lv_varName_1_0= RULE_ID ) ) ( (lv_length_2_0= RULE_ID ) ) ( (lv_scale_3_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,54,FOLLOW_8); 

                	newLeafNode(otherlv_0, grammarAccess.getSetChorusWidthAccess().getSetChorusWidthKeyword_0());
                
            // InternalSpinCAD.g:4155:1: ( (lv_varName_1_0= RULE_ID ) )
            // InternalSpinCAD.g:4156:1: (lv_varName_1_0= RULE_ID )
            {
            // InternalSpinCAD.g:4156:1: (lv_varName_1_0= RULE_ID )
            // InternalSpinCAD.g:4157:3: lv_varName_1_0= RULE_ID
            {
            lv_varName_1_0=(Token)match(input,RULE_ID,FOLLOW_8); 

            			newLeafNode(lv_varName_1_0, grammarAccess.getSetChorusWidthAccess().getVarNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getSetChorusWidthRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"varName",
                    		lv_varName_1_0, 
                    		"org.eclipse.xtext.common.Terminals.ID");
            	    

            }


            }

            // InternalSpinCAD.g:4173:2: ( (lv_length_2_0= RULE_ID ) )
            // InternalSpinCAD.g:4174:1: (lv_length_2_0= RULE_ID )
            {
            // InternalSpinCAD.g:4174:1: (lv_length_2_0= RULE_ID )
            // InternalSpinCAD.g:4175:3: lv_length_2_0= RULE_ID
            {
            lv_length_2_0=(Token)match(input,RULE_ID,FOLLOW_8); 

            			newLeafNode(lv_length_2_0, grammarAccess.getSetChorusWidthAccess().getLengthIDTerminalRuleCall_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getSetChorusWidthRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"length",
                    		lv_length_2_0, 
                    		"org.eclipse.xtext.common.Terminals.ID");
            	    

            }


            }

            // InternalSpinCAD.g:4191:2: ( (lv_scale_3_0= RULE_ID ) )
            // InternalSpinCAD.g:4192:1: (lv_scale_3_0= RULE_ID )
            {
            // InternalSpinCAD.g:4192:1: (lv_scale_3_0= RULE_ID )
            // InternalSpinCAD.g:4193:3: lv_scale_3_0= RULE_ID
            {
            lv_scale_3_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            			newLeafNode(lv_scale_3_0, grammarAccess.getSetChorusWidthAccess().getScaleIDTerminalRuleCall_3_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getSetChorusWidthRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"scale",
                    		lv_scale_3_0, 
                    		"org.eclipse.xtext.common.Terminals.ID");
            	    

            }


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
    // $ANTLR end "ruleSetChorusWidth"


    // $ANTLR start "entryRuleInstruction"
    // InternalSpinCAD.g:4217:1: entryRuleInstruction returns [EObject current=null] : iv_ruleInstruction= ruleInstruction EOF ;
    public final EObject entryRuleInstruction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInstruction = null;


        try {
            // InternalSpinCAD.g:4218:2: (iv_ruleInstruction= ruleInstruction EOF )
            // InternalSpinCAD.g:4219:2: iv_ruleInstruction= ruleInstruction EOF
            {
             newCompositeNode(grammarAccess.getInstructionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleInstruction=ruleInstruction();

            state._fsp--;

             current =iv_ruleInstruction; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleInstruction"


    // $ANTLR start "ruleInstruction"
    // InternalSpinCAD.g:4226:1: ruleInstruction returns [EObject current=null] : (this_Inst_B15_S1_9_0= ruleInst_B15_S1_9 | this_Inst_B6_S1_14_1= ruleInst_B6_S1_14 | this_Inst_S1_14_S1_10_2= ruleInst_S1_14_S1_10 | this_Inst_B6_3= ruleInst_B6 | this_Inst_B24_4= ruleInst_B24 | this_Skip_5= ruleSkip | this_Jam_6= ruleJam | this_Inst_X0_7= ruleInst_X0 | this_LoadSinLFO_8= ruleLoadSinLFO | this_LoadRampLFO_9= ruleLoadRampLFO | this_ChorusReadDelay_10= ruleChorusReadDelay | this_ChorusReadValue_11= ruleChorusReadValue | this_ChorusScaleOffset_12= ruleChorusScaleOffset | this_Log_13= ruleLog | this_ReadDelayPointer_14= ruleReadDelayPointer ) ;
    public final EObject ruleInstruction() throws RecognitionException {
        EObject current = null;

        EObject this_Inst_B15_S1_9_0 = null;

        EObject this_Inst_B6_S1_14_1 = null;

        EObject this_Inst_S1_14_S1_10_2 = null;

        EObject this_Inst_B6_3 = null;

        EObject this_Inst_B24_4 = null;

        EObject this_Skip_5 = null;

        EObject this_Jam_6 = null;

        EObject this_Inst_X0_7 = null;

        EObject this_LoadSinLFO_8 = null;

        EObject this_LoadRampLFO_9 = null;

        EObject this_ChorusReadDelay_10 = null;

        EObject this_ChorusReadValue_11 = null;

        EObject this_ChorusScaleOffset_12 = null;

        EObject this_Log_13 = null;

        EObject this_ReadDelayPointer_14 = null;


         enterRule(); 
            
        try {
            // InternalSpinCAD.g:4229:28: ( (this_Inst_B15_S1_9_0= ruleInst_B15_S1_9 | this_Inst_B6_S1_14_1= ruleInst_B6_S1_14 | this_Inst_S1_14_S1_10_2= ruleInst_S1_14_S1_10 | this_Inst_B6_3= ruleInst_B6 | this_Inst_B24_4= ruleInst_B24 | this_Skip_5= ruleSkip | this_Jam_6= ruleJam | this_Inst_X0_7= ruleInst_X0 | this_LoadSinLFO_8= ruleLoadSinLFO | this_LoadRampLFO_9= ruleLoadRampLFO | this_ChorusReadDelay_10= ruleChorusReadDelay | this_ChorusReadValue_11= ruleChorusReadValue | this_ChorusScaleOffset_12= ruleChorusScaleOffset | this_Log_13= ruleLog | this_ReadDelayPointer_14= ruleReadDelayPointer ) )
            // InternalSpinCAD.g:4230:1: (this_Inst_B15_S1_9_0= ruleInst_B15_S1_9 | this_Inst_B6_S1_14_1= ruleInst_B6_S1_14 | this_Inst_S1_14_S1_10_2= ruleInst_S1_14_S1_10 | this_Inst_B6_3= ruleInst_B6 | this_Inst_B24_4= ruleInst_B24 | this_Skip_5= ruleSkip | this_Jam_6= ruleJam | this_Inst_X0_7= ruleInst_X0 | this_LoadSinLFO_8= ruleLoadSinLFO | this_LoadRampLFO_9= ruleLoadRampLFO | this_ChorusReadDelay_10= ruleChorusReadDelay | this_ChorusReadValue_11= ruleChorusReadValue | this_ChorusScaleOffset_12= ruleChorusScaleOffset | this_Log_13= ruleLog | this_ReadDelayPointer_14= ruleReadDelayPointer )
            {
            // InternalSpinCAD.g:4230:1: (this_Inst_B15_S1_9_0= ruleInst_B15_S1_9 | this_Inst_B6_S1_14_1= ruleInst_B6_S1_14 | this_Inst_S1_14_S1_10_2= ruleInst_S1_14_S1_10 | this_Inst_B6_3= ruleInst_B6 | this_Inst_B24_4= ruleInst_B24 | this_Skip_5= ruleSkip | this_Jam_6= ruleJam | this_Inst_X0_7= ruleInst_X0 | this_LoadSinLFO_8= ruleLoadSinLFO | this_LoadRampLFO_9= ruleLoadRampLFO | this_ChorusReadDelay_10= ruleChorusReadDelay | this_ChorusReadValue_11= ruleChorusReadValue | this_ChorusScaleOffset_12= ruleChorusScaleOffset | this_Log_13= ruleLog | this_ReadDelayPointer_14= ruleReadDelayPointer )
            int alt39=15;
            switch ( input.LA(1) ) {
            case 67:
            case 68:
            case 69:
                {
                alt39=1;
                }
                break;
            case 55:
            case 57:
            case 58:
            case 59:
            case 60:
            case 61:
                {
                alt39=2;
                }
                break;
            case 64:
            case 66:
                {
                alt39=3;
                }
                break;
            case 62:
            case 63:
                {
                alt39=4;
                }
                break;
            case 76:
            case 77:
            case 78:
                {
                alt39=5;
                }
                break;
            case 83:
                {
                alt39=6;
                }
                break;
            case 79:
                {
                alt39=7;
                }
                break;
            case 80:
            case 81:
            case 82:
                {
                alt39=8;
                }
                break;
            case 70:
                {
                alt39=9;
                }
                break;
            case 71:
                {
                alt39=10;
                }
                break;
            case 72:
                {
                alt39=11;
                }
                break;
            case 73:
                {
                alt39=12;
                }
                break;
            case 74:
                {
                alt39=13;
                }
                break;
            case 65:
                {
                alt39=14;
                }
                break;
            case 75:
                {
                alt39=15;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 39, 0, input);

                throw nvae;
            }

            switch (alt39) {
                case 1 :
                    // InternalSpinCAD.g:4231:5: this_Inst_B15_S1_9_0= ruleInst_B15_S1_9
                    {
                     
                            newCompositeNode(grammarAccess.getInstructionAccess().getInst_B15_S1_9ParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_2);
                    this_Inst_B15_S1_9_0=ruleInst_B15_S1_9();

                    state._fsp--;

                     
                            current = this_Inst_B15_S1_9_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // InternalSpinCAD.g:4241:5: this_Inst_B6_S1_14_1= ruleInst_B6_S1_14
                    {
                     
                            newCompositeNode(grammarAccess.getInstructionAccess().getInst_B6_S1_14ParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_2);
                    this_Inst_B6_S1_14_1=ruleInst_B6_S1_14();

                    state._fsp--;

                     
                            current = this_Inst_B6_S1_14_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // InternalSpinCAD.g:4251:5: this_Inst_S1_14_S1_10_2= ruleInst_S1_14_S1_10
                    {
                     
                            newCompositeNode(grammarAccess.getInstructionAccess().getInst_S1_14_S1_10ParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_2);
                    this_Inst_S1_14_S1_10_2=ruleInst_S1_14_S1_10();

                    state._fsp--;

                     
                            current = this_Inst_S1_14_S1_10_2; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 4 :
                    // InternalSpinCAD.g:4261:5: this_Inst_B6_3= ruleInst_B6
                    {
                     
                            newCompositeNode(grammarAccess.getInstructionAccess().getInst_B6ParserRuleCall_3()); 
                        
                    pushFollow(FOLLOW_2);
                    this_Inst_B6_3=ruleInst_B6();

                    state._fsp--;

                     
                            current = this_Inst_B6_3; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 5 :
                    // InternalSpinCAD.g:4271:5: this_Inst_B24_4= ruleInst_B24
                    {
                     
                            newCompositeNode(grammarAccess.getInstructionAccess().getInst_B24ParserRuleCall_4()); 
                        
                    pushFollow(FOLLOW_2);
                    this_Inst_B24_4=ruleInst_B24();

                    state._fsp--;

                     
                            current = this_Inst_B24_4; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 6 :
                    // InternalSpinCAD.g:4281:5: this_Skip_5= ruleSkip
                    {
                     
                            newCompositeNode(grammarAccess.getInstructionAccess().getSkipParserRuleCall_5()); 
                        
                    pushFollow(FOLLOW_2);
                    this_Skip_5=ruleSkip();

                    state._fsp--;

                     
                            current = this_Skip_5; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 7 :
                    // InternalSpinCAD.g:4291:5: this_Jam_6= ruleJam
                    {
                     
                            newCompositeNode(grammarAccess.getInstructionAccess().getJamParserRuleCall_6()); 
                        
                    pushFollow(FOLLOW_2);
                    this_Jam_6=ruleJam();

                    state._fsp--;

                     
                            current = this_Jam_6; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 8 :
                    // InternalSpinCAD.g:4301:5: this_Inst_X0_7= ruleInst_X0
                    {
                     
                            newCompositeNode(grammarAccess.getInstructionAccess().getInst_X0ParserRuleCall_7()); 
                        
                    pushFollow(FOLLOW_2);
                    this_Inst_X0_7=ruleInst_X0();

                    state._fsp--;

                     
                            current = this_Inst_X0_7; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 9 :
                    // InternalSpinCAD.g:4311:5: this_LoadSinLFO_8= ruleLoadSinLFO
                    {
                     
                            newCompositeNode(grammarAccess.getInstructionAccess().getLoadSinLFOParserRuleCall_8()); 
                        
                    pushFollow(FOLLOW_2);
                    this_LoadSinLFO_8=ruleLoadSinLFO();

                    state._fsp--;

                     
                            current = this_LoadSinLFO_8; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 10 :
                    // InternalSpinCAD.g:4321:5: this_LoadRampLFO_9= ruleLoadRampLFO
                    {
                     
                            newCompositeNode(grammarAccess.getInstructionAccess().getLoadRampLFOParserRuleCall_9()); 
                        
                    pushFollow(FOLLOW_2);
                    this_LoadRampLFO_9=ruleLoadRampLFO();

                    state._fsp--;

                     
                            current = this_LoadRampLFO_9; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 11 :
                    // InternalSpinCAD.g:4331:5: this_ChorusReadDelay_10= ruleChorusReadDelay
                    {
                     
                            newCompositeNode(grammarAccess.getInstructionAccess().getChorusReadDelayParserRuleCall_10()); 
                        
                    pushFollow(FOLLOW_2);
                    this_ChorusReadDelay_10=ruleChorusReadDelay();

                    state._fsp--;

                     
                            current = this_ChorusReadDelay_10; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 12 :
                    // InternalSpinCAD.g:4341:5: this_ChorusReadValue_11= ruleChorusReadValue
                    {
                     
                            newCompositeNode(grammarAccess.getInstructionAccess().getChorusReadValueParserRuleCall_11()); 
                        
                    pushFollow(FOLLOW_2);
                    this_ChorusReadValue_11=ruleChorusReadValue();

                    state._fsp--;

                     
                            current = this_ChorusReadValue_11; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 13 :
                    // InternalSpinCAD.g:4351:5: this_ChorusScaleOffset_12= ruleChorusScaleOffset
                    {
                     
                            newCompositeNode(grammarAccess.getInstructionAccess().getChorusScaleOffsetParserRuleCall_12()); 
                        
                    pushFollow(FOLLOW_2);
                    this_ChorusScaleOffset_12=ruleChorusScaleOffset();

                    state._fsp--;

                     
                            current = this_ChorusScaleOffset_12; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 14 :
                    // InternalSpinCAD.g:4361:5: this_Log_13= ruleLog
                    {
                     
                            newCompositeNode(grammarAccess.getInstructionAccess().getLogParserRuleCall_13()); 
                        
                    pushFollow(FOLLOW_2);
                    this_Log_13=ruleLog();

                    state._fsp--;

                     
                            current = this_Log_13; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 15 :
                    // InternalSpinCAD.g:4371:5: this_ReadDelayPointer_14= ruleReadDelayPointer
                    {
                     
                            newCompositeNode(grammarAccess.getInstructionAccess().getReadDelayPointerParserRuleCall_14()); 
                        
                    pushFollow(FOLLOW_2);
                    this_ReadDelayPointer_14=ruleReadDelayPointer();

                    state._fsp--;

                     
                            current = this_ReadDelayPointer_14; 
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
    // $ANTLR end "ruleInstruction"


    // $ANTLR start "entryRuleInst_B6_S1_14"
    // InternalSpinCAD.g:4387:1: entryRuleInst_B6_S1_14 returns [EObject current=null] : iv_ruleInst_B6_S1_14= ruleInst_B6_S1_14 EOF ;
    public final EObject entryRuleInst_B6_S1_14() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInst_B6_S1_14 = null;


        try {
            // InternalSpinCAD.g:4388:2: (iv_ruleInst_B6_S1_14= ruleInst_B6_S1_14 EOF )
            // InternalSpinCAD.g:4389:2: iv_ruleInst_B6_S1_14= ruleInst_B6_S1_14 EOF
            {
             newCompositeNode(grammarAccess.getInst_B6_S1_14Rule()); 
            pushFollow(FOLLOW_1);
            iv_ruleInst_B6_S1_14=ruleInst_B6_S1_14();

            state._fsp--;

             current =iv_ruleInst_B6_S1_14; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleInst_B6_S1_14"


    // $ANTLR start "ruleInst_B6_S1_14"
    // InternalSpinCAD.g:4396:1: ruleInst_B6_S1_14 returns [EObject current=null] : (this_ReadRegister_0= ruleReadRegister | this_WriteRegister_1= ruleWriteRegister | this_ReadRegisterFilter_2= ruleReadRegisterFilter | this_Maxx_3= ruleMaxx | this_WriteRegisterHighshelf_4= ruleWriteRegisterHighshelf | this_WriteRegisterLowshelf_5= ruleWriteRegisterLowshelf ) ;
    public final EObject ruleInst_B6_S1_14() throws RecognitionException {
        EObject current = null;

        EObject this_ReadRegister_0 = null;

        EObject this_WriteRegister_1 = null;

        EObject this_ReadRegisterFilter_2 = null;

        EObject this_Maxx_3 = null;

        EObject this_WriteRegisterHighshelf_4 = null;

        EObject this_WriteRegisterLowshelf_5 = null;


         enterRule(); 
            
        try {
            // InternalSpinCAD.g:4399:28: ( (this_ReadRegister_0= ruleReadRegister | this_WriteRegister_1= ruleWriteRegister | this_ReadRegisterFilter_2= ruleReadRegisterFilter | this_Maxx_3= ruleMaxx | this_WriteRegisterHighshelf_4= ruleWriteRegisterHighshelf | this_WriteRegisterLowshelf_5= ruleWriteRegisterLowshelf ) )
            // InternalSpinCAD.g:4400:1: (this_ReadRegister_0= ruleReadRegister | this_WriteRegister_1= ruleWriteRegister | this_ReadRegisterFilter_2= ruleReadRegisterFilter | this_Maxx_3= ruleMaxx | this_WriteRegisterHighshelf_4= ruleWriteRegisterHighshelf | this_WriteRegisterLowshelf_5= ruleWriteRegisterLowshelf )
            {
            // InternalSpinCAD.g:4400:1: (this_ReadRegister_0= ruleReadRegister | this_WriteRegister_1= ruleWriteRegister | this_ReadRegisterFilter_2= ruleReadRegisterFilter | this_Maxx_3= ruleMaxx | this_WriteRegisterHighshelf_4= ruleWriteRegisterHighshelf | this_WriteRegisterLowshelf_5= ruleWriteRegisterLowshelf )
            int alt40=6;
            switch ( input.LA(1) ) {
            case 55:
                {
                alt40=1;
                }
                break;
            case 59:
                {
                alt40=2;
                }
                break;
            case 61:
                {
                alt40=3;
                }
                break;
            case 60:
                {
                alt40=4;
                }
                break;
            case 58:
                {
                alt40=5;
                }
                break;
            case 57:
                {
                alt40=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 40, 0, input);

                throw nvae;
            }

            switch (alt40) {
                case 1 :
                    // InternalSpinCAD.g:4401:5: this_ReadRegister_0= ruleReadRegister
                    {
                     
                            newCompositeNode(grammarAccess.getInst_B6_S1_14Access().getReadRegisterParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_2);
                    this_ReadRegister_0=ruleReadRegister();

                    state._fsp--;

                     
                            current = this_ReadRegister_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // InternalSpinCAD.g:4411:5: this_WriteRegister_1= ruleWriteRegister
                    {
                     
                            newCompositeNode(grammarAccess.getInst_B6_S1_14Access().getWriteRegisterParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_2);
                    this_WriteRegister_1=ruleWriteRegister();

                    state._fsp--;

                     
                            current = this_WriteRegister_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // InternalSpinCAD.g:4421:5: this_ReadRegisterFilter_2= ruleReadRegisterFilter
                    {
                     
                            newCompositeNode(grammarAccess.getInst_B6_S1_14Access().getReadRegisterFilterParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_2);
                    this_ReadRegisterFilter_2=ruleReadRegisterFilter();

                    state._fsp--;

                     
                            current = this_ReadRegisterFilter_2; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 4 :
                    // InternalSpinCAD.g:4431:5: this_Maxx_3= ruleMaxx
                    {
                     
                            newCompositeNode(grammarAccess.getInst_B6_S1_14Access().getMaxxParserRuleCall_3()); 
                        
                    pushFollow(FOLLOW_2);
                    this_Maxx_3=ruleMaxx();

                    state._fsp--;

                     
                            current = this_Maxx_3; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 5 :
                    // InternalSpinCAD.g:4441:5: this_WriteRegisterHighshelf_4= ruleWriteRegisterHighshelf
                    {
                     
                            newCompositeNode(grammarAccess.getInst_B6_S1_14Access().getWriteRegisterHighshelfParserRuleCall_4()); 
                        
                    pushFollow(FOLLOW_2);
                    this_WriteRegisterHighshelf_4=ruleWriteRegisterHighshelf();

                    state._fsp--;

                     
                            current = this_WriteRegisterHighshelf_4; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 6 :
                    // InternalSpinCAD.g:4451:5: this_WriteRegisterLowshelf_5= ruleWriteRegisterLowshelf
                    {
                     
                            newCompositeNode(grammarAccess.getInst_B6_S1_14Access().getWriteRegisterLowshelfParserRuleCall_5()); 
                        
                    pushFollow(FOLLOW_2);
                    this_WriteRegisterLowshelf_5=ruleWriteRegisterLowshelf();

                    state._fsp--;

                     
                            current = this_WriteRegisterLowshelf_5; 
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
    // $ANTLR end "ruleInst_B6_S1_14"


    // $ANTLR start "entryRuleInst_B15_S1_9"
    // InternalSpinCAD.g:4467:1: entryRuleInst_B15_S1_9 returns [EObject current=null] : iv_ruleInst_B15_S1_9= ruleInst_B15_S1_9 EOF ;
    public final EObject entryRuleInst_B15_S1_9() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInst_B15_S1_9 = null;


        try {
            // InternalSpinCAD.g:4468:2: (iv_ruleInst_B15_S1_9= ruleInst_B15_S1_9 EOF )
            // InternalSpinCAD.g:4469:2: iv_ruleInst_B15_S1_9= ruleInst_B15_S1_9 EOF
            {
             newCompositeNode(grammarAccess.getInst_B15_S1_9Rule()); 
            pushFollow(FOLLOW_1);
            iv_ruleInst_B15_S1_9=ruleInst_B15_S1_9();

            state._fsp--;

             current =iv_ruleInst_B15_S1_9; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleInst_B15_S1_9"


    // $ANTLR start "ruleInst_B15_S1_9"
    // InternalSpinCAD.g:4476:1: ruleInst_B15_S1_9 returns [EObject current=null] : (this_ReadDelay_0= ruleReadDelay | this_WriteDelay_1= ruleWriteDelay | this_WriteAllpass_2= ruleWriteAllpass ) ;
    public final EObject ruleInst_B15_S1_9() throws RecognitionException {
        EObject current = null;

        EObject this_ReadDelay_0 = null;

        EObject this_WriteDelay_1 = null;

        EObject this_WriteAllpass_2 = null;


         enterRule(); 
            
        try {
            // InternalSpinCAD.g:4479:28: ( (this_ReadDelay_0= ruleReadDelay | this_WriteDelay_1= ruleWriteDelay | this_WriteAllpass_2= ruleWriteAllpass ) )
            // InternalSpinCAD.g:4480:1: (this_ReadDelay_0= ruleReadDelay | this_WriteDelay_1= ruleWriteDelay | this_WriteAllpass_2= ruleWriteAllpass )
            {
            // InternalSpinCAD.g:4480:1: (this_ReadDelay_0= ruleReadDelay | this_WriteDelay_1= ruleWriteDelay | this_WriteAllpass_2= ruleWriteAllpass )
            int alt41=3;
            switch ( input.LA(1) ) {
            case 69:
                {
                alt41=1;
                }
                break;
            case 67:
                {
                alt41=2;
                }
                break;
            case 68:
                {
                alt41=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 41, 0, input);

                throw nvae;
            }

            switch (alt41) {
                case 1 :
                    // InternalSpinCAD.g:4481:5: this_ReadDelay_0= ruleReadDelay
                    {
                     
                            newCompositeNode(grammarAccess.getInst_B15_S1_9Access().getReadDelayParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_2);
                    this_ReadDelay_0=ruleReadDelay();

                    state._fsp--;

                     
                            current = this_ReadDelay_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // InternalSpinCAD.g:4491:5: this_WriteDelay_1= ruleWriteDelay
                    {
                     
                            newCompositeNode(grammarAccess.getInst_B15_S1_9Access().getWriteDelayParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_2);
                    this_WriteDelay_1=ruleWriteDelay();

                    state._fsp--;

                     
                            current = this_WriteDelay_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // InternalSpinCAD.g:4501:5: this_WriteAllpass_2= ruleWriteAllpass
                    {
                     
                            newCompositeNode(grammarAccess.getInst_B15_S1_9Access().getWriteAllpassParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_2);
                    this_WriteAllpass_2=ruleWriteAllpass();

                    state._fsp--;

                     
                            current = this_WriteAllpass_2; 
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
    // $ANTLR end "ruleInst_B15_S1_9"


    // $ANTLR start "entryRuleInst_B6"
    // InternalSpinCAD.g:4517:1: entryRuleInst_B6 returns [EObject current=null] : iv_ruleInst_B6= ruleInst_B6 EOF ;
    public final EObject entryRuleInst_B6() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInst_B6 = null;


        try {
            // InternalSpinCAD.g:4518:2: (iv_ruleInst_B6= ruleInst_B6 EOF )
            // InternalSpinCAD.g:4519:2: iv_ruleInst_B6= ruleInst_B6 EOF
            {
             newCompositeNode(grammarAccess.getInst_B6Rule()); 
            pushFollow(FOLLOW_1);
            iv_ruleInst_B6=ruleInst_B6();

            state._fsp--;

             current =iv_ruleInst_B6; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleInst_B6"


    // $ANTLR start "ruleInst_B6"
    // InternalSpinCAD.g:4526:1: ruleInst_B6 returns [EObject current=null] : (this_Mulx_0= ruleMulx | this_Ldax_1= ruleLdax ) ;
    public final EObject ruleInst_B6() throws RecognitionException {
        EObject current = null;

        EObject this_Mulx_0 = null;

        EObject this_Ldax_1 = null;


         enterRule(); 
            
        try {
            // InternalSpinCAD.g:4529:28: ( (this_Mulx_0= ruleMulx | this_Ldax_1= ruleLdax ) )
            // InternalSpinCAD.g:4530:1: (this_Mulx_0= ruleMulx | this_Ldax_1= ruleLdax )
            {
            // InternalSpinCAD.g:4530:1: (this_Mulx_0= ruleMulx | this_Ldax_1= ruleLdax )
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==62) ) {
                alt42=1;
            }
            else if ( (LA42_0==63) ) {
                alt42=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 42, 0, input);

                throw nvae;
            }
            switch (alt42) {
                case 1 :
                    // InternalSpinCAD.g:4531:5: this_Mulx_0= ruleMulx
                    {
                     
                            newCompositeNode(grammarAccess.getInst_B6Access().getMulxParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_2);
                    this_Mulx_0=ruleMulx();

                    state._fsp--;

                     
                            current = this_Mulx_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // InternalSpinCAD.g:4541:5: this_Ldax_1= ruleLdax
                    {
                     
                            newCompositeNode(grammarAccess.getInst_B6Access().getLdaxParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_2);
                    this_Ldax_1=ruleLdax();

                    state._fsp--;

                     
                            current = this_Ldax_1; 
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
    // $ANTLR end "ruleInst_B6"


    // $ANTLR start "entryRuleInst_B24"
    // InternalSpinCAD.g:4557:1: entryRuleInst_B24 returns [EObject current=null] : iv_ruleInst_B24= ruleInst_B24 EOF ;
    public final EObject entryRuleInst_B24() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInst_B24 = null;


        try {
            // InternalSpinCAD.g:4558:2: (iv_ruleInst_B24= ruleInst_B24 EOF )
            // InternalSpinCAD.g:4559:2: iv_ruleInst_B24= ruleInst_B24 EOF
            {
             newCompositeNode(grammarAccess.getInst_B24Rule()); 
            pushFollow(FOLLOW_1);
            iv_ruleInst_B24=ruleInst_B24();

            state._fsp--;

             current =iv_ruleInst_B24; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleInst_B24"


    // $ANTLR start "ruleInst_B24"
    // InternalSpinCAD.g:4566:1: ruleInst_B24 returns [EObject current=null] : (this_And_0= ruleAnd | this_Or_1= ruleOr | this_Xor_2= ruleXor ) ;
    public final EObject ruleInst_B24() throws RecognitionException {
        EObject current = null;

        EObject this_And_0 = null;

        EObject this_Or_1 = null;

        EObject this_Xor_2 = null;


         enterRule(); 
            
        try {
            // InternalSpinCAD.g:4569:28: ( (this_And_0= ruleAnd | this_Or_1= ruleOr | this_Xor_2= ruleXor ) )
            // InternalSpinCAD.g:4570:1: (this_And_0= ruleAnd | this_Or_1= ruleOr | this_Xor_2= ruleXor )
            {
            // InternalSpinCAD.g:4570:1: (this_And_0= ruleAnd | this_Or_1= ruleOr | this_Xor_2= ruleXor )
            int alt43=3;
            switch ( input.LA(1) ) {
            case 76:
                {
                alt43=1;
                }
                break;
            case 77:
                {
                alt43=2;
                }
                break;
            case 78:
                {
                alt43=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 43, 0, input);

                throw nvae;
            }

            switch (alt43) {
                case 1 :
                    // InternalSpinCAD.g:4571:5: this_And_0= ruleAnd
                    {
                     
                            newCompositeNode(grammarAccess.getInst_B24Access().getAndParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_2);
                    this_And_0=ruleAnd();

                    state._fsp--;

                     
                            current = this_And_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // InternalSpinCAD.g:4581:5: this_Or_1= ruleOr
                    {
                     
                            newCompositeNode(grammarAccess.getInst_B24Access().getOrParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_2);
                    this_Or_1=ruleOr();

                    state._fsp--;

                     
                            current = this_Or_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // InternalSpinCAD.g:4591:5: this_Xor_2= ruleXor
                    {
                     
                            newCompositeNode(grammarAccess.getInst_B24Access().getXorParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_2);
                    this_Xor_2=ruleXor();

                    state._fsp--;

                     
                            current = this_Xor_2; 
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
    // $ANTLR end "ruleInst_B24"


    // $ANTLR start "entryRuleInst_X0"
    // InternalSpinCAD.g:4607:1: entryRuleInst_X0 returns [EObject current=null] : iv_ruleInst_X0= ruleInst_X0 EOF ;
    public final EObject entryRuleInst_X0() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInst_X0 = null;


        try {
            // InternalSpinCAD.g:4608:2: (iv_ruleInst_X0= ruleInst_X0 EOF )
            // InternalSpinCAD.g:4609:2: iv_ruleInst_X0= ruleInst_X0 EOF
            {
             newCompositeNode(grammarAccess.getInst_X0Rule()); 
            pushFollow(FOLLOW_1);
            iv_ruleInst_X0=ruleInst_X0();

            state._fsp--;

             current =iv_ruleInst_X0; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleInst_X0"


    // $ANTLR start "ruleInst_X0"
    // InternalSpinCAD.g:4616:1: ruleInst_X0 returns [EObject current=null] : (this_Clr_0= ruleClr | this_Not_1= ruleNot | this_Absa_2= ruleAbsa ) ;
    public final EObject ruleInst_X0() throws RecognitionException {
        EObject current = null;

        EObject this_Clr_0 = null;

        EObject this_Not_1 = null;

        EObject this_Absa_2 = null;


         enterRule(); 
            
        try {
            // InternalSpinCAD.g:4619:28: ( (this_Clr_0= ruleClr | this_Not_1= ruleNot | this_Absa_2= ruleAbsa ) )
            // InternalSpinCAD.g:4620:1: (this_Clr_0= ruleClr | this_Not_1= ruleNot | this_Absa_2= ruleAbsa )
            {
            // InternalSpinCAD.g:4620:1: (this_Clr_0= ruleClr | this_Not_1= ruleNot | this_Absa_2= ruleAbsa )
            int alt44=3;
            switch ( input.LA(1) ) {
            case 80:
                {
                alt44=1;
                }
                break;
            case 81:
                {
                alt44=2;
                }
                break;
            case 82:
                {
                alt44=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 44, 0, input);

                throw nvae;
            }

            switch (alt44) {
                case 1 :
                    // InternalSpinCAD.g:4621:5: this_Clr_0= ruleClr
                    {
                     
                            newCompositeNode(grammarAccess.getInst_X0Access().getClrParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_2);
                    this_Clr_0=ruleClr();

                    state._fsp--;

                     
                            current = this_Clr_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // InternalSpinCAD.g:4631:5: this_Not_1= ruleNot
                    {
                     
                            newCompositeNode(grammarAccess.getInst_X0Access().getNotParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_2);
                    this_Not_1=ruleNot();

                    state._fsp--;

                     
                            current = this_Not_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // InternalSpinCAD.g:4641:5: this_Absa_2= ruleAbsa
                    {
                     
                            newCompositeNode(grammarAccess.getInst_X0Access().getAbsaParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_2);
                    this_Absa_2=ruleAbsa();

                    state._fsp--;

                     
                            current = this_Absa_2; 
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
    // $ANTLR end "ruleInst_X0"


    // $ANTLR start "entryRuleInst_S1_14_S1_10"
    // InternalSpinCAD.g:4657:1: entryRuleInst_S1_14_S1_10 returns [EObject current=null] : iv_ruleInst_S1_14_S1_10= ruleInst_S1_14_S1_10 EOF ;
    public final EObject entryRuleInst_S1_14_S1_10() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInst_S1_14_S1_10 = null;


        try {
            // InternalSpinCAD.g:4658:2: (iv_ruleInst_S1_14_S1_10= ruleInst_S1_14_S1_10 EOF )
            // InternalSpinCAD.g:4659:2: iv_ruleInst_S1_14_S1_10= ruleInst_S1_14_S1_10 EOF
            {
             newCompositeNode(grammarAccess.getInst_S1_14_S1_10Rule()); 
            pushFollow(FOLLOW_1);
            iv_ruleInst_S1_14_S1_10=ruleInst_S1_14_S1_10();

            state._fsp--;

             current =iv_ruleInst_S1_14_S1_10; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleInst_S1_14_S1_10"


    // $ANTLR start "ruleInst_S1_14_S1_10"
    // InternalSpinCAD.g:4666:1: ruleInst_S1_14_S1_10 returns [EObject current=null] : (this_Exp_0= ruleExp | this_ScaleOffset_1= ruleScaleOffset ) ;
    public final EObject ruleInst_S1_14_S1_10() throws RecognitionException {
        EObject current = null;

        EObject this_Exp_0 = null;

        EObject this_ScaleOffset_1 = null;


         enterRule(); 
            
        try {
            // InternalSpinCAD.g:4669:28: ( (this_Exp_0= ruleExp | this_ScaleOffset_1= ruleScaleOffset ) )
            // InternalSpinCAD.g:4670:1: (this_Exp_0= ruleExp | this_ScaleOffset_1= ruleScaleOffset )
            {
            // InternalSpinCAD.g:4670:1: (this_Exp_0= ruleExp | this_ScaleOffset_1= ruleScaleOffset )
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( (LA45_0==64) ) {
                alt45=1;
            }
            else if ( (LA45_0==66) ) {
                alt45=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 45, 0, input);

                throw nvae;
            }
            switch (alt45) {
                case 1 :
                    // InternalSpinCAD.g:4671:5: this_Exp_0= ruleExp
                    {
                     
                            newCompositeNode(grammarAccess.getInst_S1_14_S1_10Access().getExpParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_2);
                    this_Exp_0=ruleExp();

                    state._fsp--;

                     
                            current = this_Exp_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // InternalSpinCAD.g:4681:5: this_ScaleOffset_1= ruleScaleOffset
                    {
                     
                            newCompositeNode(grammarAccess.getInst_S1_14_S1_10Access().getScaleOffsetParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_2);
                    this_ScaleOffset_1=ruleScaleOffset();

                    state._fsp--;

                     
                            current = this_ScaleOffset_1; 
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
    // $ANTLR end "ruleInst_S1_14_S1_10"


    // $ANTLR start "entryRuleReadRegister"
    // InternalSpinCAD.g:4697:1: entryRuleReadRegister returns [EObject current=null] : iv_ruleReadRegister= ruleReadRegister EOF ;
    public final EObject entryRuleReadRegister() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReadRegister = null;


        try {
            // InternalSpinCAD.g:4698:2: (iv_ruleReadRegister= ruleReadRegister EOF )
            // InternalSpinCAD.g:4699:2: iv_ruleReadRegister= ruleReadRegister EOF
            {
             newCompositeNode(grammarAccess.getReadRegisterRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleReadRegister=ruleReadRegister();

            state._fsp--;

             current =iv_ruleReadRegister; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleReadRegister"


    // $ANTLR start "ruleReadRegister"
    // InternalSpinCAD.g:4706:1: ruleReadRegister returns [EObject current=null] : (otherlv_0= 'rdax' ( (lv_arg1_1_0= ruleSPINREGISTER ) ) otherlv_2= ',' ( (lv_arg2_3_0= ruleSPINDOUBLE ) ) ) ;
    public final EObject ruleReadRegister() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        AntlrDatatypeRuleToken lv_arg1_1_0 = null;

        AntlrDatatypeRuleToken lv_arg2_3_0 = null;


         enterRule(); 
            
        try {
            // InternalSpinCAD.g:4709:28: ( (otherlv_0= 'rdax' ( (lv_arg1_1_0= ruleSPINREGISTER ) ) otherlv_2= ',' ( (lv_arg2_3_0= ruleSPINDOUBLE ) ) ) )
            // InternalSpinCAD.g:4710:1: (otherlv_0= 'rdax' ( (lv_arg1_1_0= ruleSPINREGISTER ) ) otherlv_2= ',' ( (lv_arg2_3_0= ruleSPINDOUBLE ) ) )
            {
            // InternalSpinCAD.g:4710:1: (otherlv_0= 'rdax' ( (lv_arg1_1_0= ruleSPINREGISTER ) ) otherlv_2= ',' ( (lv_arg2_3_0= ruleSPINDOUBLE ) ) )
            // InternalSpinCAD.g:4710:3: otherlv_0= 'rdax' ( (lv_arg1_1_0= ruleSPINREGISTER ) ) otherlv_2= ',' ( (lv_arg2_3_0= ruleSPINDOUBLE ) )
            {
            otherlv_0=(Token)match(input,55,FOLLOW_9); 

                	newLeafNode(otherlv_0, grammarAccess.getReadRegisterAccess().getRdaxKeyword_0());
                
            // InternalSpinCAD.g:4714:1: ( (lv_arg1_1_0= ruleSPINREGISTER ) )
            // InternalSpinCAD.g:4715:1: (lv_arg1_1_0= ruleSPINREGISTER )
            {
            // InternalSpinCAD.g:4715:1: (lv_arg1_1_0= ruleSPINREGISTER )
            // InternalSpinCAD.g:4716:3: lv_arg1_1_0= ruleSPINREGISTER
            {
             
            	        newCompositeNode(grammarAccess.getReadRegisterAccess().getArg1SPINREGISTERParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_16);
            lv_arg1_1_0=ruleSPINREGISTER();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getReadRegisterRule());
            	        }
                   		set(
                   			current, 
                   			"arg1",
                    		lv_arg1_1_0, 
                    		"com.holycityaudio.spincad.SpinCAD.SPINREGISTER");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_2=(Token)match(input,56,FOLLOW_9); 

                	newLeafNode(otherlv_2, grammarAccess.getReadRegisterAccess().getCommaKeyword_2());
                
            // InternalSpinCAD.g:4736:1: ( (lv_arg2_3_0= ruleSPINDOUBLE ) )
            // InternalSpinCAD.g:4737:1: (lv_arg2_3_0= ruleSPINDOUBLE )
            {
            // InternalSpinCAD.g:4737:1: (lv_arg2_3_0= ruleSPINDOUBLE )
            // InternalSpinCAD.g:4738:3: lv_arg2_3_0= ruleSPINDOUBLE
            {
             
            	        newCompositeNode(grammarAccess.getReadRegisterAccess().getArg2SPINDOUBLEParserRuleCall_3_0()); 
            	    
            pushFollow(FOLLOW_2);
            lv_arg2_3_0=ruleSPINDOUBLE();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getReadRegisterRule());
            	        }
                   		set(
                   			current, 
                   			"arg2",
                    		lv_arg2_3_0, 
                    		"com.holycityaudio.spincad.SpinCAD.SPINDOUBLE");
            	        afterParserOrEnumRuleCall();
            	    

            }


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
    // $ANTLR end "ruleReadRegister"


    // $ANTLR start "entryRuleWriteRegisterLowshelf"
    // InternalSpinCAD.g:4762:1: entryRuleWriteRegisterLowshelf returns [EObject current=null] : iv_ruleWriteRegisterLowshelf= ruleWriteRegisterLowshelf EOF ;
    public final EObject entryRuleWriteRegisterLowshelf() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWriteRegisterLowshelf = null;


        try {
            // InternalSpinCAD.g:4763:2: (iv_ruleWriteRegisterLowshelf= ruleWriteRegisterLowshelf EOF )
            // InternalSpinCAD.g:4764:2: iv_ruleWriteRegisterLowshelf= ruleWriteRegisterLowshelf EOF
            {
             newCompositeNode(grammarAccess.getWriteRegisterLowshelfRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleWriteRegisterLowshelf=ruleWriteRegisterLowshelf();

            state._fsp--;

             current =iv_ruleWriteRegisterLowshelf; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleWriteRegisterLowshelf"


    // $ANTLR start "ruleWriteRegisterLowshelf"
    // InternalSpinCAD.g:4771:1: ruleWriteRegisterLowshelf returns [EObject current=null] : (otherlv_0= 'wrlx' ( (lv_arg1_1_0= ruleSPINREGISTER ) ) otherlv_2= ',' ( (lv_arg2_3_0= ruleSPINDOUBLE ) ) ) ;
    public final EObject ruleWriteRegisterLowshelf() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        AntlrDatatypeRuleToken lv_arg1_1_0 = null;

        AntlrDatatypeRuleToken lv_arg2_3_0 = null;


         enterRule(); 
            
        try {
            // InternalSpinCAD.g:4774:28: ( (otherlv_0= 'wrlx' ( (lv_arg1_1_0= ruleSPINREGISTER ) ) otherlv_2= ',' ( (lv_arg2_3_0= ruleSPINDOUBLE ) ) ) )
            // InternalSpinCAD.g:4775:1: (otherlv_0= 'wrlx' ( (lv_arg1_1_0= ruleSPINREGISTER ) ) otherlv_2= ',' ( (lv_arg2_3_0= ruleSPINDOUBLE ) ) )
            {
            // InternalSpinCAD.g:4775:1: (otherlv_0= 'wrlx' ( (lv_arg1_1_0= ruleSPINREGISTER ) ) otherlv_2= ',' ( (lv_arg2_3_0= ruleSPINDOUBLE ) ) )
            // InternalSpinCAD.g:4775:3: otherlv_0= 'wrlx' ( (lv_arg1_1_0= ruleSPINREGISTER ) ) otherlv_2= ',' ( (lv_arg2_3_0= ruleSPINDOUBLE ) )
            {
            otherlv_0=(Token)match(input,57,FOLLOW_9); 

                	newLeafNode(otherlv_0, grammarAccess.getWriteRegisterLowshelfAccess().getWrlxKeyword_0());
                
            // InternalSpinCAD.g:4779:1: ( (lv_arg1_1_0= ruleSPINREGISTER ) )
            // InternalSpinCAD.g:4780:1: (lv_arg1_1_0= ruleSPINREGISTER )
            {
            // InternalSpinCAD.g:4780:1: (lv_arg1_1_0= ruleSPINREGISTER )
            // InternalSpinCAD.g:4781:3: lv_arg1_1_0= ruleSPINREGISTER
            {
             
            	        newCompositeNode(grammarAccess.getWriteRegisterLowshelfAccess().getArg1SPINREGISTERParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_16);
            lv_arg1_1_0=ruleSPINREGISTER();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getWriteRegisterLowshelfRule());
            	        }
                   		set(
                   			current, 
                   			"arg1",
                    		lv_arg1_1_0, 
                    		"com.holycityaudio.spincad.SpinCAD.SPINREGISTER");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_2=(Token)match(input,56,FOLLOW_9); 

                	newLeafNode(otherlv_2, grammarAccess.getWriteRegisterLowshelfAccess().getCommaKeyword_2());
                
            // InternalSpinCAD.g:4801:1: ( (lv_arg2_3_0= ruleSPINDOUBLE ) )
            // InternalSpinCAD.g:4802:1: (lv_arg2_3_0= ruleSPINDOUBLE )
            {
            // InternalSpinCAD.g:4802:1: (lv_arg2_3_0= ruleSPINDOUBLE )
            // InternalSpinCAD.g:4803:3: lv_arg2_3_0= ruleSPINDOUBLE
            {
             
            	        newCompositeNode(grammarAccess.getWriteRegisterLowshelfAccess().getArg2SPINDOUBLEParserRuleCall_3_0()); 
            	    
            pushFollow(FOLLOW_2);
            lv_arg2_3_0=ruleSPINDOUBLE();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getWriteRegisterLowshelfRule());
            	        }
                   		set(
                   			current, 
                   			"arg2",
                    		lv_arg2_3_0, 
                    		"com.holycityaudio.spincad.SpinCAD.SPINDOUBLE");
            	        afterParserOrEnumRuleCall();
            	    

            }


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
    // $ANTLR end "ruleWriteRegisterLowshelf"


    // $ANTLR start "entryRuleWriteRegisterHighshelf"
    // InternalSpinCAD.g:4827:1: entryRuleWriteRegisterHighshelf returns [EObject current=null] : iv_ruleWriteRegisterHighshelf= ruleWriteRegisterHighshelf EOF ;
    public final EObject entryRuleWriteRegisterHighshelf() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWriteRegisterHighshelf = null;


        try {
            // InternalSpinCAD.g:4828:2: (iv_ruleWriteRegisterHighshelf= ruleWriteRegisterHighshelf EOF )
            // InternalSpinCAD.g:4829:2: iv_ruleWriteRegisterHighshelf= ruleWriteRegisterHighshelf EOF
            {
             newCompositeNode(grammarAccess.getWriteRegisterHighshelfRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleWriteRegisterHighshelf=ruleWriteRegisterHighshelf();

            state._fsp--;

             current =iv_ruleWriteRegisterHighshelf; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleWriteRegisterHighshelf"


    // $ANTLR start "ruleWriteRegisterHighshelf"
    // InternalSpinCAD.g:4836:1: ruleWriteRegisterHighshelf returns [EObject current=null] : (otherlv_0= 'wrhx' ( (lv_arg1_1_0= ruleSPINREGISTER ) ) otherlv_2= ',' ( (lv_arg2_3_0= ruleSPINDOUBLE ) ) ) ;
    public final EObject ruleWriteRegisterHighshelf() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        AntlrDatatypeRuleToken lv_arg1_1_0 = null;

        AntlrDatatypeRuleToken lv_arg2_3_0 = null;


         enterRule(); 
            
        try {
            // InternalSpinCAD.g:4839:28: ( (otherlv_0= 'wrhx' ( (lv_arg1_1_0= ruleSPINREGISTER ) ) otherlv_2= ',' ( (lv_arg2_3_0= ruleSPINDOUBLE ) ) ) )
            // InternalSpinCAD.g:4840:1: (otherlv_0= 'wrhx' ( (lv_arg1_1_0= ruleSPINREGISTER ) ) otherlv_2= ',' ( (lv_arg2_3_0= ruleSPINDOUBLE ) ) )
            {
            // InternalSpinCAD.g:4840:1: (otherlv_0= 'wrhx' ( (lv_arg1_1_0= ruleSPINREGISTER ) ) otherlv_2= ',' ( (lv_arg2_3_0= ruleSPINDOUBLE ) ) )
            // InternalSpinCAD.g:4840:3: otherlv_0= 'wrhx' ( (lv_arg1_1_0= ruleSPINREGISTER ) ) otherlv_2= ',' ( (lv_arg2_3_0= ruleSPINDOUBLE ) )
            {
            otherlv_0=(Token)match(input,58,FOLLOW_9); 

                	newLeafNode(otherlv_0, grammarAccess.getWriteRegisterHighshelfAccess().getWrhxKeyword_0());
                
            // InternalSpinCAD.g:4844:1: ( (lv_arg1_1_0= ruleSPINREGISTER ) )
            // InternalSpinCAD.g:4845:1: (lv_arg1_1_0= ruleSPINREGISTER )
            {
            // InternalSpinCAD.g:4845:1: (lv_arg1_1_0= ruleSPINREGISTER )
            // InternalSpinCAD.g:4846:3: lv_arg1_1_0= ruleSPINREGISTER
            {
             
            	        newCompositeNode(grammarAccess.getWriteRegisterHighshelfAccess().getArg1SPINREGISTERParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_16);
            lv_arg1_1_0=ruleSPINREGISTER();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getWriteRegisterHighshelfRule());
            	        }
                   		set(
                   			current, 
                   			"arg1",
                    		lv_arg1_1_0, 
                    		"com.holycityaudio.spincad.SpinCAD.SPINREGISTER");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_2=(Token)match(input,56,FOLLOW_9); 

                	newLeafNode(otherlv_2, grammarAccess.getWriteRegisterHighshelfAccess().getCommaKeyword_2());
                
            // InternalSpinCAD.g:4866:1: ( (lv_arg2_3_0= ruleSPINDOUBLE ) )
            // InternalSpinCAD.g:4867:1: (lv_arg2_3_0= ruleSPINDOUBLE )
            {
            // InternalSpinCAD.g:4867:1: (lv_arg2_3_0= ruleSPINDOUBLE )
            // InternalSpinCAD.g:4868:3: lv_arg2_3_0= ruleSPINDOUBLE
            {
             
            	        newCompositeNode(grammarAccess.getWriteRegisterHighshelfAccess().getArg2SPINDOUBLEParserRuleCall_3_0()); 
            	    
            pushFollow(FOLLOW_2);
            lv_arg2_3_0=ruleSPINDOUBLE();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getWriteRegisterHighshelfRule());
            	        }
                   		set(
                   			current, 
                   			"arg2",
                    		lv_arg2_3_0, 
                    		"com.holycityaudio.spincad.SpinCAD.SPINDOUBLE");
            	        afterParserOrEnumRuleCall();
            	    

            }


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
    // $ANTLR end "ruleWriteRegisterHighshelf"


    // $ANTLR start "entryRuleWriteRegister"
    // InternalSpinCAD.g:4892:1: entryRuleWriteRegister returns [EObject current=null] : iv_ruleWriteRegister= ruleWriteRegister EOF ;
    public final EObject entryRuleWriteRegister() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWriteRegister = null;


        try {
            // InternalSpinCAD.g:4893:2: (iv_ruleWriteRegister= ruleWriteRegister EOF )
            // InternalSpinCAD.g:4894:2: iv_ruleWriteRegister= ruleWriteRegister EOF
            {
             newCompositeNode(grammarAccess.getWriteRegisterRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleWriteRegister=ruleWriteRegister();

            state._fsp--;

             current =iv_ruleWriteRegister; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleWriteRegister"


    // $ANTLR start "ruleWriteRegister"
    // InternalSpinCAD.g:4901:1: ruleWriteRegister returns [EObject current=null] : (otherlv_0= 'wrax' ( (lv_arg1_1_0= ruleSPINREGISTER ) ) otherlv_2= ',' ( (lv_arg2_3_0= ruleSPINDOUBLE ) ) ) ;
    public final EObject ruleWriteRegister() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        AntlrDatatypeRuleToken lv_arg1_1_0 = null;

        AntlrDatatypeRuleToken lv_arg2_3_0 = null;


         enterRule(); 
            
        try {
            // InternalSpinCAD.g:4904:28: ( (otherlv_0= 'wrax' ( (lv_arg1_1_0= ruleSPINREGISTER ) ) otherlv_2= ',' ( (lv_arg2_3_0= ruleSPINDOUBLE ) ) ) )
            // InternalSpinCAD.g:4905:1: (otherlv_0= 'wrax' ( (lv_arg1_1_0= ruleSPINREGISTER ) ) otherlv_2= ',' ( (lv_arg2_3_0= ruleSPINDOUBLE ) ) )
            {
            // InternalSpinCAD.g:4905:1: (otherlv_0= 'wrax' ( (lv_arg1_1_0= ruleSPINREGISTER ) ) otherlv_2= ',' ( (lv_arg2_3_0= ruleSPINDOUBLE ) ) )
            // InternalSpinCAD.g:4905:3: otherlv_0= 'wrax' ( (lv_arg1_1_0= ruleSPINREGISTER ) ) otherlv_2= ',' ( (lv_arg2_3_0= ruleSPINDOUBLE ) )
            {
            otherlv_0=(Token)match(input,59,FOLLOW_9); 

                	newLeafNode(otherlv_0, grammarAccess.getWriteRegisterAccess().getWraxKeyword_0());
                
            // InternalSpinCAD.g:4909:1: ( (lv_arg1_1_0= ruleSPINREGISTER ) )
            // InternalSpinCAD.g:4910:1: (lv_arg1_1_0= ruleSPINREGISTER )
            {
            // InternalSpinCAD.g:4910:1: (lv_arg1_1_0= ruleSPINREGISTER )
            // InternalSpinCAD.g:4911:3: lv_arg1_1_0= ruleSPINREGISTER
            {
             
            	        newCompositeNode(grammarAccess.getWriteRegisterAccess().getArg1SPINREGISTERParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_16);
            lv_arg1_1_0=ruleSPINREGISTER();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getWriteRegisterRule());
            	        }
                   		set(
                   			current, 
                   			"arg1",
                    		lv_arg1_1_0, 
                    		"com.holycityaudio.spincad.SpinCAD.SPINREGISTER");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_2=(Token)match(input,56,FOLLOW_9); 

                	newLeafNode(otherlv_2, grammarAccess.getWriteRegisterAccess().getCommaKeyword_2());
                
            // InternalSpinCAD.g:4931:1: ( (lv_arg2_3_0= ruleSPINDOUBLE ) )
            // InternalSpinCAD.g:4932:1: (lv_arg2_3_0= ruleSPINDOUBLE )
            {
            // InternalSpinCAD.g:4932:1: (lv_arg2_3_0= ruleSPINDOUBLE )
            // InternalSpinCAD.g:4933:3: lv_arg2_3_0= ruleSPINDOUBLE
            {
             
            	        newCompositeNode(grammarAccess.getWriteRegisterAccess().getArg2SPINDOUBLEParserRuleCall_3_0()); 
            	    
            pushFollow(FOLLOW_2);
            lv_arg2_3_0=ruleSPINDOUBLE();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getWriteRegisterRule());
            	        }
                   		set(
                   			current, 
                   			"arg2",
                    		lv_arg2_3_0, 
                    		"com.holycityaudio.spincad.SpinCAD.SPINDOUBLE");
            	        afterParserOrEnumRuleCall();
            	    

            }


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
    // $ANTLR end "ruleWriteRegister"


    // $ANTLR start "entryRuleMaxx"
    // InternalSpinCAD.g:4957:1: entryRuleMaxx returns [EObject current=null] : iv_ruleMaxx= ruleMaxx EOF ;
    public final EObject entryRuleMaxx() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMaxx = null;


        try {
            // InternalSpinCAD.g:4958:2: (iv_ruleMaxx= ruleMaxx EOF )
            // InternalSpinCAD.g:4959:2: iv_ruleMaxx= ruleMaxx EOF
            {
             newCompositeNode(grammarAccess.getMaxxRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMaxx=ruleMaxx();

            state._fsp--;

             current =iv_ruleMaxx; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleMaxx"


    // $ANTLR start "ruleMaxx"
    // InternalSpinCAD.g:4966:1: ruleMaxx returns [EObject current=null] : (otherlv_0= 'maxx' ( (lv_arg1_1_0= ruleSPINREGISTER ) ) otherlv_2= ',' ( (lv_arg2_3_0= ruleSPINDOUBLE ) ) ) ;
    public final EObject ruleMaxx() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        AntlrDatatypeRuleToken lv_arg1_1_0 = null;

        AntlrDatatypeRuleToken lv_arg2_3_0 = null;


         enterRule(); 
            
        try {
            // InternalSpinCAD.g:4969:28: ( (otherlv_0= 'maxx' ( (lv_arg1_1_0= ruleSPINREGISTER ) ) otherlv_2= ',' ( (lv_arg2_3_0= ruleSPINDOUBLE ) ) ) )
            // InternalSpinCAD.g:4970:1: (otherlv_0= 'maxx' ( (lv_arg1_1_0= ruleSPINREGISTER ) ) otherlv_2= ',' ( (lv_arg2_3_0= ruleSPINDOUBLE ) ) )
            {
            // InternalSpinCAD.g:4970:1: (otherlv_0= 'maxx' ( (lv_arg1_1_0= ruleSPINREGISTER ) ) otherlv_2= ',' ( (lv_arg2_3_0= ruleSPINDOUBLE ) ) )
            // InternalSpinCAD.g:4970:3: otherlv_0= 'maxx' ( (lv_arg1_1_0= ruleSPINREGISTER ) ) otherlv_2= ',' ( (lv_arg2_3_0= ruleSPINDOUBLE ) )
            {
            otherlv_0=(Token)match(input,60,FOLLOW_9); 

                	newLeafNode(otherlv_0, grammarAccess.getMaxxAccess().getMaxxKeyword_0());
                
            // InternalSpinCAD.g:4974:1: ( (lv_arg1_1_0= ruleSPINREGISTER ) )
            // InternalSpinCAD.g:4975:1: (lv_arg1_1_0= ruleSPINREGISTER )
            {
            // InternalSpinCAD.g:4975:1: (lv_arg1_1_0= ruleSPINREGISTER )
            // InternalSpinCAD.g:4976:3: lv_arg1_1_0= ruleSPINREGISTER
            {
             
            	        newCompositeNode(grammarAccess.getMaxxAccess().getArg1SPINREGISTERParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_16);
            lv_arg1_1_0=ruleSPINREGISTER();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getMaxxRule());
            	        }
                   		set(
                   			current, 
                   			"arg1",
                    		lv_arg1_1_0, 
                    		"com.holycityaudio.spincad.SpinCAD.SPINREGISTER");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_2=(Token)match(input,56,FOLLOW_9); 

                	newLeafNode(otherlv_2, grammarAccess.getMaxxAccess().getCommaKeyword_2());
                
            // InternalSpinCAD.g:4996:1: ( (lv_arg2_3_0= ruleSPINDOUBLE ) )
            // InternalSpinCAD.g:4997:1: (lv_arg2_3_0= ruleSPINDOUBLE )
            {
            // InternalSpinCAD.g:4997:1: (lv_arg2_3_0= ruleSPINDOUBLE )
            // InternalSpinCAD.g:4998:3: lv_arg2_3_0= ruleSPINDOUBLE
            {
             
            	        newCompositeNode(grammarAccess.getMaxxAccess().getArg2SPINDOUBLEParserRuleCall_3_0()); 
            	    
            pushFollow(FOLLOW_2);
            lv_arg2_3_0=ruleSPINDOUBLE();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getMaxxRule());
            	        }
                   		set(
                   			current, 
                   			"arg2",
                    		lv_arg2_3_0, 
                    		"com.holycityaudio.spincad.SpinCAD.SPINDOUBLE");
            	        afterParserOrEnumRuleCall();
            	    

            }


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
    // $ANTLR end "ruleMaxx"


    // $ANTLR start "entryRuleReadRegisterFilter"
    // InternalSpinCAD.g:5022:1: entryRuleReadRegisterFilter returns [EObject current=null] : iv_ruleReadRegisterFilter= ruleReadRegisterFilter EOF ;
    public final EObject entryRuleReadRegisterFilter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReadRegisterFilter = null;


        try {
            // InternalSpinCAD.g:5023:2: (iv_ruleReadRegisterFilter= ruleReadRegisterFilter EOF )
            // InternalSpinCAD.g:5024:2: iv_ruleReadRegisterFilter= ruleReadRegisterFilter EOF
            {
             newCompositeNode(grammarAccess.getReadRegisterFilterRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleReadRegisterFilter=ruleReadRegisterFilter();

            state._fsp--;

             current =iv_ruleReadRegisterFilter; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleReadRegisterFilter"


    // $ANTLR start "ruleReadRegisterFilter"
    // InternalSpinCAD.g:5031:1: ruleReadRegisterFilter returns [EObject current=null] : (otherlv_0= 'rdfx' ( (lv_arg1_1_0= ruleSPINREGISTER ) ) otherlv_2= ',' ( (lv_arg2_3_0= ruleSPINDOUBLE ) ) ) ;
    public final EObject ruleReadRegisterFilter() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        AntlrDatatypeRuleToken lv_arg1_1_0 = null;

        AntlrDatatypeRuleToken lv_arg2_3_0 = null;


         enterRule(); 
            
        try {
            // InternalSpinCAD.g:5034:28: ( (otherlv_0= 'rdfx' ( (lv_arg1_1_0= ruleSPINREGISTER ) ) otherlv_2= ',' ( (lv_arg2_3_0= ruleSPINDOUBLE ) ) ) )
            // InternalSpinCAD.g:5035:1: (otherlv_0= 'rdfx' ( (lv_arg1_1_0= ruleSPINREGISTER ) ) otherlv_2= ',' ( (lv_arg2_3_0= ruleSPINDOUBLE ) ) )
            {
            // InternalSpinCAD.g:5035:1: (otherlv_0= 'rdfx' ( (lv_arg1_1_0= ruleSPINREGISTER ) ) otherlv_2= ',' ( (lv_arg2_3_0= ruleSPINDOUBLE ) ) )
            // InternalSpinCAD.g:5035:3: otherlv_0= 'rdfx' ( (lv_arg1_1_0= ruleSPINREGISTER ) ) otherlv_2= ',' ( (lv_arg2_3_0= ruleSPINDOUBLE ) )
            {
            otherlv_0=(Token)match(input,61,FOLLOW_9); 

                	newLeafNode(otherlv_0, grammarAccess.getReadRegisterFilterAccess().getRdfxKeyword_0());
                
            // InternalSpinCAD.g:5039:1: ( (lv_arg1_1_0= ruleSPINREGISTER ) )
            // InternalSpinCAD.g:5040:1: (lv_arg1_1_0= ruleSPINREGISTER )
            {
            // InternalSpinCAD.g:5040:1: (lv_arg1_1_0= ruleSPINREGISTER )
            // InternalSpinCAD.g:5041:3: lv_arg1_1_0= ruleSPINREGISTER
            {
             
            	        newCompositeNode(grammarAccess.getReadRegisterFilterAccess().getArg1SPINREGISTERParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_16);
            lv_arg1_1_0=ruleSPINREGISTER();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getReadRegisterFilterRule());
            	        }
                   		set(
                   			current, 
                   			"arg1",
                    		lv_arg1_1_0, 
                    		"com.holycityaudio.spincad.SpinCAD.SPINREGISTER");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_2=(Token)match(input,56,FOLLOW_9); 

                	newLeafNode(otherlv_2, grammarAccess.getReadRegisterFilterAccess().getCommaKeyword_2());
                
            // InternalSpinCAD.g:5061:1: ( (lv_arg2_3_0= ruleSPINDOUBLE ) )
            // InternalSpinCAD.g:5062:1: (lv_arg2_3_0= ruleSPINDOUBLE )
            {
            // InternalSpinCAD.g:5062:1: (lv_arg2_3_0= ruleSPINDOUBLE )
            // InternalSpinCAD.g:5063:3: lv_arg2_3_0= ruleSPINDOUBLE
            {
             
            	        newCompositeNode(grammarAccess.getReadRegisterFilterAccess().getArg2SPINDOUBLEParserRuleCall_3_0()); 
            	    
            pushFollow(FOLLOW_2);
            lv_arg2_3_0=ruleSPINDOUBLE();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getReadRegisterFilterRule());
            	        }
                   		set(
                   			current, 
                   			"arg2",
                    		lv_arg2_3_0, 
                    		"com.holycityaudio.spincad.SpinCAD.SPINDOUBLE");
            	        afterParserOrEnumRuleCall();
            	    

            }


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
    // $ANTLR end "ruleReadRegisterFilter"


    // $ANTLR start "entryRuleMulx"
    // InternalSpinCAD.g:5087:1: entryRuleMulx returns [EObject current=null] : iv_ruleMulx= ruleMulx EOF ;
    public final EObject entryRuleMulx() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMulx = null;


        try {
            // InternalSpinCAD.g:5088:2: (iv_ruleMulx= ruleMulx EOF )
            // InternalSpinCAD.g:5089:2: iv_ruleMulx= ruleMulx EOF
            {
             newCompositeNode(grammarAccess.getMulxRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMulx=ruleMulx();

            state._fsp--;

             current =iv_ruleMulx; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleMulx"


    // $ANTLR start "ruleMulx"
    // InternalSpinCAD.g:5096:1: ruleMulx returns [EObject current=null] : (otherlv_0= 'mulx' ( (lv_arg1_1_0= RULE_ID ) ) ) ;
    public final EObject ruleMulx() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_arg1_1_0=null;

         enterRule(); 
            
        try {
            // InternalSpinCAD.g:5099:28: ( (otherlv_0= 'mulx' ( (lv_arg1_1_0= RULE_ID ) ) ) )
            // InternalSpinCAD.g:5100:1: (otherlv_0= 'mulx' ( (lv_arg1_1_0= RULE_ID ) ) )
            {
            // InternalSpinCAD.g:5100:1: (otherlv_0= 'mulx' ( (lv_arg1_1_0= RULE_ID ) ) )
            // InternalSpinCAD.g:5100:3: otherlv_0= 'mulx' ( (lv_arg1_1_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,62,FOLLOW_8); 

                	newLeafNode(otherlv_0, grammarAccess.getMulxAccess().getMulxKeyword_0());
                
            // InternalSpinCAD.g:5104:1: ( (lv_arg1_1_0= RULE_ID ) )
            // InternalSpinCAD.g:5105:1: (lv_arg1_1_0= RULE_ID )
            {
            // InternalSpinCAD.g:5105:1: (lv_arg1_1_0= RULE_ID )
            // InternalSpinCAD.g:5106:3: lv_arg1_1_0= RULE_ID
            {
            lv_arg1_1_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            			newLeafNode(lv_arg1_1_0, grammarAccess.getMulxAccess().getArg1IDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getMulxRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"arg1",
                    		lv_arg1_1_0, 
                    		"org.eclipse.xtext.common.Terminals.ID");
            	    

            }


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
    // $ANTLR end "ruleMulx"


    // $ANTLR start "entryRuleLdax"
    // InternalSpinCAD.g:5130:1: entryRuleLdax returns [EObject current=null] : iv_ruleLdax= ruleLdax EOF ;
    public final EObject entryRuleLdax() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLdax = null;


        try {
            // InternalSpinCAD.g:5131:2: (iv_ruleLdax= ruleLdax EOF )
            // InternalSpinCAD.g:5132:2: iv_ruleLdax= ruleLdax EOF
            {
             newCompositeNode(grammarAccess.getLdaxRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLdax=ruleLdax();

            state._fsp--;

             current =iv_ruleLdax; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleLdax"


    // $ANTLR start "ruleLdax"
    // InternalSpinCAD.g:5139:1: ruleLdax returns [EObject current=null] : (otherlv_0= 'ldax' ( (lv_arg1_1_0= RULE_ID ) ) ) ;
    public final EObject ruleLdax() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_arg1_1_0=null;

         enterRule(); 
            
        try {
            // InternalSpinCAD.g:5142:28: ( (otherlv_0= 'ldax' ( (lv_arg1_1_0= RULE_ID ) ) ) )
            // InternalSpinCAD.g:5143:1: (otherlv_0= 'ldax' ( (lv_arg1_1_0= RULE_ID ) ) )
            {
            // InternalSpinCAD.g:5143:1: (otherlv_0= 'ldax' ( (lv_arg1_1_0= RULE_ID ) ) )
            // InternalSpinCAD.g:5143:3: otherlv_0= 'ldax' ( (lv_arg1_1_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,63,FOLLOW_8); 

                	newLeafNode(otherlv_0, grammarAccess.getLdaxAccess().getLdaxKeyword_0());
                
            // InternalSpinCAD.g:5147:1: ( (lv_arg1_1_0= RULE_ID ) )
            // InternalSpinCAD.g:5148:1: (lv_arg1_1_0= RULE_ID )
            {
            // InternalSpinCAD.g:5148:1: (lv_arg1_1_0= RULE_ID )
            // InternalSpinCAD.g:5149:3: lv_arg1_1_0= RULE_ID
            {
            lv_arg1_1_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            			newLeafNode(lv_arg1_1_0, grammarAccess.getLdaxAccess().getArg1IDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getLdaxRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"arg1",
                    		lv_arg1_1_0, 
                    		"org.eclipse.xtext.common.Terminals.ID");
            	    

            }


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
    // $ANTLR end "ruleLdax"


    // $ANTLR start "entryRuleExp"
    // InternalSpinCAD.g:5173:1: entryRuleExp returns [EObject current=null] : iv_ruleExp= ruleExp EOF ;
    public final EObject entryRuleExp() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExp = null;


        try {
            // InternalSpinCAD.g:5174:2: (iv_ruleExp= ruleExp EOF )
            // InternalSpinCAD.g:5175:2: iv_ruleExp= ruleExp EOF
            {
             newCompositeNode(grammarAccess.getExpRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleExp=ruleExp();

            state._fsp--;

             current =iv_ruleExp; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleExp"


    // $ANTLR start "ruleExp"
    // InternalSpinCAD.g:5182:1: ruleExp returns [EObject current=null] : (otherlv_0= 'exp' ( (lv_arg1_1_0= ruleSPINDOUBLE ) ) otherlv_2= ',' ( (lv_arg2_3_0= ruleSPINDOUBLE ) ) ) ;
    public final EObject ruleExp() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        AntlrDatatypeRuleToken lv_arg1_1_0 = null;

        AntlrDatatypeRuleToken lv_arg2_3_0 = null;


         enterRule(); 
            
        try {
            // InternalSpinCAD.g:5185:28: ( (otherlv_0= 'exp' ( (lv_arg1_1_0= ruleSPINDOUBLE ) ) otherlv_2= ',' ( (lv_arg2_3_0= ruleSPINDOUBLE ) ) ) )
            // InternalSpinCAD.g:5186:1: (otherlv_0= 'exp' ( (lv_arg1_1_0= ruleSPINDOUBLE ) ) otherlv_2= ',' ( (lv_arg2_3_0= ruleSPINDOUBLE ) ) )
            {
            // InternalSpinCAD.g:5186:1: (otherlv_0= 'exp' ( (lv_arg1_1_0= ruleSPINDOUBLE ) ) otherlv_2= ',' ( (lv_arg2_3_0= ruleSPINDOUBLE ) ) )
            // InternalSpinCAD.g:5186:3: otherlv_0= 'exp' ( (lv_arg1_1_0= ruleSPINDOUBLE ) ) otherlv_2= ',' ( (lv_arg2_3_0= ruleSPINDOUBLE ) )
            {
            otherlv_0=(Token)match(input,64,FOLLOW_9); 

                	newLeafNode(otherlv_0, grammarAccess.getExpAccess().getExpKeyword_0());
                
            // InternalSpinCAD.g:5190:1: ( (lv_arg1_1_0= ruleSPINDOUBLE ) )
            // InternalSpinCAD.g:5191:1: (lv_arg1_1_0= ruleSPINDOUBLE )
            {
            // InternalSpinCAD.g:5191:1: (lv_arg1_1_0= ruleSPINDOUBLE )
            // InternalSpinCAD.g:5192:3: lv_arg1_1_0= ruleSPINDOUBLE
            {
             
            	        newCompositeNode(grammarAccess.getExpAccess().getArg1SPINDOUBLEParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_16);
            lv_arg1_1_0=ruleSPINDOUBLE();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getExpRule());
            	        }
                   		set(
                   			current, 
                   			"arg1",
                    		lv_arg1_1_0, 
                    		"com.holycityaudio.spincad.SpinCAD.SPINDOUBLE");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_2=(Token)match(input,56,FOLLOW_9); 

                	newLeafNode(otherlv_2, grammarAccess.getExpAccess().getCommaKeyword_2());
                
            // InternalSpinCAD.g:5212:1: ( (lv_arg2_3_0= ruleSPINDOUBLE ) )
            // InternalSpinCAD.g:5213:1: (lv_arg2_3_0= ruleSPINDOUBLE )
            {
            // InternalSpinCAD.g:5213:1: (lv_arg2_3_0= ruleSPINDOUBLE )
            // InternalSpinCAD.g:5214:3: lv_arg2_3_0= ruleSPINDOUBLE
            {
             
            	        newCompositeNode(grammarAccess.getExpAccess().getArg2SPINDOUBLEParserRuleCall_3_0()); 
            	    
            pushFollow(FOLLOW_2);
            lv_arg2_3_0=ruleSPINDOUBLE();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getExpRule());
            	        }
                   		set(
                   			current, 
                   			"arg2",
                    		lv_arg2_3_0, 
                    		"com.holycityaudio.spincad.SpinCAD.SPINDOUBLE");
            	        afterParserOrEnumRuleCall();
            	    

            }


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
    // $ANTLR end "ruleExp"


    // $ANTLR start "entryRuleLog"
    // InternalSpinCAD.g:5238:1: entryRuleLog returns [EObject current=null] : iv_ruleLog= ruleLog EOF ;
    public final EObject entryRuleLog() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLog = null;


        try {
            // InternalSpinCAD.g:5239:2: (iv_ruleLog= ruleLog EOF )
            // InternalSpinCAD.g:5240:2: iv_ruleLog= ruleLog EOF
            {
             newCompositeNode(grammarAccess.getLogRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLog=ruleLog();

            state._fsp--;

             current =iv_ruleLog; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleLog"


    // $ANTLR start "ruleLog"
    // InternalSpinCAD.g:5247:1: ruleLog returns [EObject current=null] : (otherlv_0= 'log' ( (lv_arg1_1_0= ruleSPINDOUBLE ) ) otherlv_2= ',' ( (lv_arg2_3_0= ruleSPINDOUBLE ) ) ) ;
    public final EObject ruleLog() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        AntlrDatatypeRuleToken lv_arg1_1_0 = null;

        AntlrDatatypeRuleToken lv_arg2_3_0 = null;


         enterRule(); 
            
        try {
            // InternalSpinCAD.g:5250:28: ( (otherlv_0= 'log' ( (lv_arg1_1_0= ruleSPINDOUBLE ) ) otherlv_2= ',' ( (lv_arg2_3_0= ruleSPINDOUBLE ) ) ) )
            // InternalSpinCAD.g:5251:1: (otherlv_0= 'log' ( (lv_arg1_1_0= ruleSPINDOUBLE ) ) otherlv_2= ',' ( (lv_arg2_3_0= ruleSPINDOUBLE ) ) )
            {
            // InternalSpinCAD.g:5251:1: (otherlv_0= 'log' ( (lv_arg1_1_0= ruleSPINDOUBLE ) ) otherlv_2= ',' ( (lv_arg2_3_0= ruleSPINDOUBLE ) ) )
            // InternalSpinCAD.g:5251:3: otherlv_0= 'log' ( (lv_arg1_1_0= ruleSPINDOUBLE ) ) otherlv_2= ',' ( (lv_arg2_3_0= ruleSPINDOUBLE ) )
            {
            otherlv_0=(Token)match(input,65,FOLLOW_9); 

                	newLeafNode(otherlv_0, grammarAccess.getLogAccess().getLogKeyword_0());
                
            // InternalSpinCAD.g:5255:1: ( (lv_arg1_1_0= ruleSPINDOUBLE ) )
            // InternalSpinCAD.g:5256:1: (lv_arg1_1_0= ruleSPINDOUBLE )
            {
            // InternalSpinCAD.g:5256:1: (lv_arg1_1_0= ruleSPINDOUBLE )
            // InternalSpinCAD.g:5257:3: lv_arg1_1_0= ruleSPINDOUBLE
            {
             
            	        newCompositeNode(grammarAccess.getLogAccess().getArg1SPINDOUBLEParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_16);
            lv_arg1_1_0=ruleSPINDOUBLE();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getLogRule());
            	        }
                   		set(
                   			current, 
                   			"arg1",
                    		lv_arg1_1_0, 
                    		"com.holycityaudio.spincad.SpinCAD.SPINDOUBLE");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_2=(Token)match(input,56,FOLLOW_9); 

                	newLeafNode(otherlv_2, grammarAccess.getLogAccess().getCommaKeyword_2());
                
            // InternalSpinCAD.g:5277:1: ( (lv_arg2_3_0= ruleSPINDOUBLE ) )
            // InternalSpinCAD.g:5278:1: (lv_arg2_3_0= ruleSPINDOUBLE )
            {
            // InternalSpinCAD.g:5278:1: (lv_arg2_3_0= ruleSPINDOUBLE )
            // InternalSpinCAD.g:5279:3: lv_arg2_3_0= ruleSPINDOUBLE
            {
             
            	        newCompositeNode(grammarAccess.getLogAccess().getArg2SPINDOUBLEParserRuleCall_3_0()); 
            	    
            pushFollow(FOLLOW_2);
            lv_arg2_3_0=ruleSPINDOUBLE();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getLogRule());
            	        }
                   		set(
                   			current, 
                   			"arg2",
                    		lv_arg2_3_0, 
                    		"com.holycityaudio.spincad.SpinCAD.SPINDOUBLE");
            	        afterParserOrEnumRuleCall();
            	    

            }


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
    // $ANTLR end "ruleLog"


    // $ANTLR start "entryRuleScaleOffset"
    // InternalSpinCAD.g:5303:1: entryRuleScaleOffset returns [EObject current=null] : iv_ruleScaleOffset= ruleScaleOffset EOF ;
    public final EObject entryRuleScaleOffset() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleScaleOffset = null;


        try {
            // InternalSpinCAD.g:5304:2: (iv_ruleScaleOffset= ruleScaleOffset EOF )
            // InternalSpinCAD.g:5305:2: iv_ruleScaleOffset= ruleScaleOffset EOF
            {
             newCompositeNode(grammarAccess.getScaleOffsetRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleScaleOffset=ruleScaleOffset();

            state._fsp--;

             current =iv_ruleScaleOffset; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleScaleOffset"


    // $ANTLR start "ruleScaleOffset"
    // InternalSpinCAD.g:5312:1: ruleScaleOffset returns [EObject current=null] : (otherlv_0= 'sof' ( (lv_arg1_1_0= ruleSPINDOUBLE ) ) otherlv_2= ',' ( (lv_arg2_3_0= ruleSPINDOUBLE ) ) ) ;
    public final EObject ruleScaleOffset() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        AntlrDatatypeRuleToken lv_arg1_1_0 = null;

        AntlrDatatypeRuleToken lv_arg2_3_0 = null;


         enterRule(); 
            
        try {
            // InternalSpinCAD.g:5315:28: ( (otherlv_0= 'sof' ( (lv_arg1_1_0= ruleSPINDOUBLE ) ) otherlv_2= ',' ( (lv_arg2_3_0= ruleSPINDOUBLE ) ) ) )
            // InternalSpinCAD.g:5316:1: (otherlv_0= 'sof' ( (lv_arg1_1_0= ruleSPINDOUBLE ) ) otherlv_2= ',' ( (lv_arg2_3_0= ruleSPINDOUBLE ) ) )
            {
            // InternalSpinCAD.g:5316:1: (otherlv_0= 'sof' ( (lv_arg1_1_0= ruleSPINDOUBLE ) ) otherlv_2= ',' ( (lv_arg2_3_0= ruleSPINDOUBLE ) ) )
            // InternalSpinCAD.g:5316:3: otherlv_0= 'sof' ( (lv_arg1_1_0= ruleSPINDOUBLE ) ) otherlv_2= ',' ( (lv_arg2_3_0= ruleSPINDOUBLE ) )
            {
            otherlv_0=(Token)match(input,66,FOLLOW_9); 

                	newLeafNode(otherlv_0, grammarAccess.getScaleOffsetAccess().getSofKeyword_0());
                
            // InternalSpinCAD.g:5320:1: ( (lv_arg1_1_0= ruleSPINDOUBLE ) )
            // InternalSpinCAD.g:5321:1: (lv_arg1_1_0= ruleSPINDOUBLE )
            {
            // InternalSpinCAD.g:5321:1: (lv_arg1_1_0= ruleSPINDOUBLE )
            // InternalSpinCAD.g:5322:3: lv_arg1_1_0= ruleSPINDOUBLE
            {
             
            	        newCompositeNode(grammarAccess.getScaleOffsetAccess().getArg1SPINDOUBLEParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_16);
            lv_arg1_1_0=ruleSPINDOUBLE();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getScaleOffsetRule());
            	        }
                   		set(
                   			current, 
                   			"arg1",
                    		lv_arg1_1_0, 
                    		"com.holycityaudio.spincad.SpinCAD.SPINDOUBLE");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_2=(Token)match(input,56,FOLLOW_9); 

                	newLeafNode(otherlv_2, grammarAccess.getScaleOffsetAccess().getCommaKeyword_2());
                
            // InternalSpinCAD.g:5342:1: ( (lv_arg2_3_0= ruleSPINDOUBLE ) )
            // InternalSpinCAD.g:5343:1: (lv_arg2_3_0= ruleSPINDOUBLE )
            {
            // InternalSpinCAD.g:5343:1: (lv_arg2_3_0= ruleSPINDOUBLE )
            // InternalSpinCAD.g:5344:3: lv_arg2_3_0= ruleSPINDOUBLE
            {
             
            	        newCompositeNode(grammarAccess.getScaleOffsetAccess().getArg2SPINDOUBLEParserRuleCall_3_0()); 
            	    
            pushFollow(FOLLOW_2);
            lv_arg2_3_0=ruleSPINDOUBLE();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getScaleOffsetRule());
            	        }
                   		set(
                   			current, 
                   			"arg2",
                    		lv_arg2_3_0, 
                    		"com.holycityaudio.spincad.SpinCAD.SPINDOUBLE");
            	        afterParserOrEnumRuleCall();
            	    

            }


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
    // $ANTLR end "ruleScaleOffset"


    // $ANTLR start "entryRuleWriteDelay"
    // InternalSpinCAD.g:5368:1: entryRuleWriteDelay returns [EObject current=null] : iv_ruleWriteDelay= ruleWriteDelay EOF ;
    public final EObject entryRuleWriteDelay() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWriteDelay = null;


        try {
            // InternalSpinCAD.g:5369:2: (iv_ruleWriteDelay= ruleWriteDelay EOF )
            // InternalSpinCAD.g:5370:2: iv_ruleWriteDelay= ruleWriteDelay EOF
            {
             newCompositeNode(grammarAccess.getWriteDelayRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleWriteDelay=ruleWriteDelay();

            state._fsp--;

             current =iv_ruleWriteDelay; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleWriteDelay"


    // $ANTLR start "ruleWriteDelay"
    // InternalSpinCAD.g:5377:1: ruleWriteDelay returns [EObject current=null] : (otherlv_0= 'wra' ( (lv_arg1_1_0= ruleSPINMEM ) ) otherlv_2= ',' ( (lv_arg2_3_0= ruleSPINDOUBLE ) ) ) ;
    public final EObject ruleWriteDelay() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_arg1_1_0 = null;

        AntlrDatatypeRuleToken lv_arg2_3_0 = null;


         enterRule(); 
            
        try {
            // InternalSpinCAD.g:5380:28: ( (otherlv_0= 'wra' ( (lv_arg1_1_0= ruleSPINMEM ) ) otherlv_2= ',' ( (lv_arg2_3_0= ruleSPINDOUBLE ) ) ) )
            // InternalSpinCAD.g:5381:1: (otherlv_0= 'wra' ( (lv_arg1_1_0= ruleSPINMEM ) ) otherlv_2= ',' ( (lv_arg2_3_0= ruleSPINDOUBLE ) ) )
            {
            // InternalSpinCAD.g:5381:1: (otherlv_0= 'wra' ( (lv_arg1_1_0= ruleSPINMEM ) ) otherlv_2= ',' ( (lv_arg2_3_0= ruleSPINDOUBLE ) ) )
            // InternalSpinCAD.g:5381:3: otherlv_0= 'wra' ( (lv_arg1_1_0= ruleSPINMEM ) ) otherlv_2= ',' ( (lv_arg2_3_0= ruleSPINDOUBLE ) )
            {
            otherlv_0=(Token)match(input,67,FOLLOW_8); 

                	newLeafNode(otherlv_0, grammarAccess.getWriteDelayAccess().getWraKeyword_0());
                
            // InternalSpinCAD.g:5385:1: ( (lv_arg1_1_0= ruleSPINMEM ) )
            // InternalSpinCAD.g:5386:1: (lv_arg1_1_0= ruleSPINMEM )
            {
            // InternalSpinCAD.g:5386:1: (lv_arg1_1_0= ruleSPINMEM )
            // InternalSpinCAD.g:5387:3: lv_arg1_1_0= ruleSPINMEM
            {
             
            	        newCompositeNode(grammarAccess.getWriteDelayAccess().getArg1SPINMEMParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_16);
            lv_arg1_1_0=ruleSPINMEM();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getWriteDelayRule());
            	        }
                   		set(
                   			current, 
                   			"arg1",
                    		lv_arg1_1_0, 
                    		"com.holycityaudio.spincad.SpinCAD.SPINMEM");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_2=(Token)match(input,56,FOLLOW_9); 

                	newLeafNode(otherlv_2, grammarAccess.getWriteDelayAccess().getCommaKeyword_2());
                
            // InternalSpinCAD.g:5407:1: ( (lv_arg2_3_0= ruleSPINDOUBLE ) )
            // InternalSpinCAD.g:5408:1: (lv_arg2_3_0= ruleSPINDOUBLE )
            {
            // InternalSpinCAD.g:5408:1: (lv_arg2_3_0= ruleSPINDOUBLE )
            // InternalSpinCAD.g:5409:3: lv_arg2_3_0= ruleSPINDOUBLE
            {
             
            	        newCompositeNode(grammarAccess.getWriteDelayAccess().getArg2SPINDOUBLEParserRuleCall_3_0()); 
            	    
            pushFollow(FOLLOW_2);
            lv_arg2_3_0=ruleSPINDOUBLE();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getWriteDelayRule());
            	        }
                   		set(
                   			current, 
                   			"arg2",
                    		lv_arg2_3_0, 
                    		"com.holycityaudio.spincad.SpinCAD.SPINDOUBLE");
            	        afterParserOrEnumRuleCall();
            	    

            }


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
    // $ANTLR end "ruleWriteDelay"


    // $ANTLR start "entryRuleWriteAllpass"
    // InternalSpinCAD.g:5433:1: entryRuleWriteAllpass returns [EObject current=null] : iv_ruleWriteAllpass= ruleWriteAllpass EOF ;
    public final EObject entryRuleWriteAllpass() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWriteAllpass = null;


        try {
            // InternalSpinCAD.g:5434:2: (iv_ruleWriteAllpass= ruleWriteAllpass EOF )
            // InternalSpinCAD.g:5435:2: iv_ruleWriteAllpass= ruleWriteAllpass EOF
            {
             newCompositeNode(grammarAccess.getWriteAllpassRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleWriteAllpass=ruleWriteAllpass();

            state._fsp--;

             current =iv_ruleWriteAllpass; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleWriteAllpass"


    // $ANTLR start "ruleWriteAllpass"
    // InternalSpinCAD.g:5442:1: ruleWriteAllpass returns [EObject current=null] : (otherlv_0= 'wrap' ( (lv_arg1_1_0= ruleSPINMEM ) ) otherlv_2= ',' ( (lv_arg2_3_0= ruleSPINDOUBLE ) ) ) ;
    public final EObject ruleWriteAllpass() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_arg1_1_0 = null;

        AntlrDatatypeRuleToken lv_arg2_3_0 = null;


         enterRule(); 
            
        try {
            // InternalSpinCAD.g:5445:28: ( (otherlv_0= 'wrap' ( (lv_arg1_1_0= ruleSPINMEM ) ) otherlv_2= ',' ( (lv_arg2_3_0= ruleSPINDOUBLE ) ) ) )
            // InternalSpinCAD.g:5446:1: (otherlv_0= 'wrap' ( (lv_arg1_1_0= ruleSPINMEM ) ) otherlv_2= ',' ( (lv_arg2_3_0= ruleSPINDOUBLE ) ) )
            {
            // InternalSpinCAD.g:5446:1: (otherlv_0= 'wrap' ( (lv_arg1_1_0= ruleSPINMEM ) ) otherlv_2= ',' ( (lv_arg2_3_0= ruleSPINDOUBLE ) ) )
            // InternalSpinCAD.g:5446:3: otherlv_0= 'wrap' ( (lv_arg1_1_0= ruleSPINMEM ) ) otherlv_2= ',' ( (lv_arg2_3_0= ruleSPINDOUBLE ) )
            {
            otherlv_0=(Token)match(input,68,FOLLOW_8); 

                	newLeafNode(otherlv_0, grammarAccess.getWriteAllpassAccess().getWrapKeyword_0());
                
            // InternalSpinCAD.g:5450:1: ( (lv_arg1_1_0= ruleSPINMEM ) )
            // InternalSpinCAD.g:5451:1: (lv_arg1_1_0= ruleSPINMEM )
            {
            // InternalSpinCAD.g:5451:1: (lv_arg1_1_0= ruleSPINMEM )
            // InternalSpinCAD.g:5452:3: lv_arg1_1_0= ruleSPINMEM
            {
             
            	        newCompositeNode(grammarAccess.getWriteAllpassAccess().getArg1SPINMEMParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_16);
            lv_arg1_1_0=ruleSPINMEM();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getWriteAllpassRule());
            	        }
                   		set(
                   			current, 
                   			"arg1",
                    		lv_arg1_1_0, 
                    		"com.holycityaudio.spincad.SpinCAD.SPINMEM");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_2=(Token)match(input,56,FOLLOW_9); 

                	newLeafNode(otherlv_2, grammarAccess.getWriteAllpassAccess().getCommaKeyword_2());
                
            // InternalSpinCAD.g:5472:1: ( (lv_arg2_3_0= ruleSPINDOUBLE ) )
            // InternalSpinCAD.g:5473:1: (lv_arg2_3_0= ruleSPINDOUBLE )
            {
            // InternalSpinCAD.g:5473:1: (lv_arg2_3_0= ruleSPINDOUBLE )
            // InternalSpinCAD.g:5474:3: lv_arg2_3_0= ruleSPINDOUBLE
            {
             
            	        newCompositeNode(grammarAccess.getWriteAllpassAccess().getArg2SPINDOUBLEParserRuleCall_3_0()); 
            	    
            pushFollow(FOLLOW_2);
            lv_arg2_3_0=ruleSPINDOUBLE();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getWriteAllpassRule());
            	        }
                   		set(
                   			current, 
                   			"arg2",
                    		lv_arg2_3_0, 
                    		"com.holycityaudio.spincad.SpinCAD.SPINDOUBLE");
            	        afterParserOrEnumRuleCall();
            	    

            }


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
    // $ANTLR end "ruleWriteAllpass"


    // $ANTLR start "entryRuleReadDelay"
    // InternalSpinCAD.g:5498:1: entryRuleReadDelay returns [EObject current=null] : iv_ruleReadDelay= ruleReadDelay EOF ;
    public final EObject entryRuleReadDelay() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReadDelay = null;


        try {
            // InternalSpinCAD.g:5499:2: (iv_ruleReadDelay= ruleReadDelay EOF )
            // InternalSpinCAD.g:5500:2: iv_ruleReadDelay= ruleReadDelay EOF
            {
             newCompositeNode(grammarAccess.getReadDelayRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleReadDelay=ruleReadDelay();

            state._fsp--;

             current =iv_ruleReadDelay; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleReadDelay"


    // $ANTLR start "ruleReadDelay"
    // InternalSpinCAD.g:5507:1: ruleReadDelay returns [EObject current=null] : (otherlv_0= 'rda' ( (lv_arg1_1_0= ruleSPINMEM ) ) otherlv_2= ',' ( (lv_arg2_3_0= ruleSPINDOUBLE ) ) ) ;
    public final EObject ruleReadDelay() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_arg1_1_0 = null;

        AntlrDatatypeRuleToken lv_arg2_3_0 = null;


         enterRule(); 
            
        try {
            // InternalSpinCAD.g:5510:28: ( (otherlv_0= 'rda' ( (lv_arg1_1_0= ruleSPINMEM ) ) otherlv_2= ',' ( (lv_arg2_3_0= ruleSPINDOUBLE ) ) ) )
            // InternalSpinCAD.g:5511:1: (otherlv_0= 'rda' ( (lv_arg1_1_0= ruleSPINMEM ) ) otherlv_2= ',' ( (lv_arg2_3_0= ruleSPINDOUBLE ) ) )
            {
            // InternalSpinCAD.g:5511:1: (otherlv_0= 'rda' ( (lv_arg1_1_0= ruleSPINMEM ) ) otherlv_2= ',' ( (lv_arg2_3_0= ruleSPINDOUBLE ) ) )
            // InternalSpinCAD.g:5511:3: otherlv_0= 'rda' ( (lv_arg1_1_0= ruleSPINMEM ) ) otherlv_2= ',' ( (lv_arg2_3_0= ruleSPINDOUBLE ) )
            {
            otherlv_0=(Token)match(input,69,FOLLOW_8); 

                	newLeafNode(otherlv_0, grammarAccess.getReadDelayAccess().getRdaKeyword_0());
                
            // InternalSpinCAD.g:5515:1: ( (lv_arg1_1_0= ruleSPINMEM ) )
            // InternalSpinCAD.g:5516:1: (lv_arg1_1_0= ruleSPINMEM )
            {
            // InternalSpinCAD.g:5516:1: (lv_arg1_1_0= ruleSPINMEM )
            // InternalSpinCAD.g:5517:3: lv_arg1_1_0= ruleSPINMEM
            {
             
            	        newCompositeNode(grammarAccess.getReadDelayAccess().getArg1SPINMEMParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_16);
            lv_arg1_1_0=ruleSPINMEM();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getReadDelayRule());
            	        }
                   		set(
                   			current, 
                   			"arg1",
                    		lv_arg1_1_0, 
                    		"com.holycityaudio.spincad.SpinCAD.SPINMEM");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_2=(Token)match(input,56,FOLLOW_9); 

                	newLeafNode(otherlv_2, grammarAccess.getReadDelayAccess().getCommaKeyword_2());
                
            // InternalSpinCAD.g:5537:1: ( (lv_arg2_3_0= ruleSPINDOUBLE ) )
            // InternalSpinCAD.g:5538:1: (lv_arg2_3_0= ruleSPINDOUBLE )
            {
            // InternalSpinCAD.g:5538:1: (lv_arg2_3_0= ruleSPINDOUBLE )
            // InternalSpinCAD.g:5539:3: lv_arg2_3_0= ruleSPINDOUBLE
            {
             
            	        newCompositeNode(grammarAccess.getReadDelayAccess().getArg2SPINDOUBLEParserRuleCall_3_0()); 
            	    
            pushFollow(FOLLOW_2);
            lv_arg2_3_0=ruleSPINDOUBLE();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getReadDelayRule());
            	        }
                   		set(
                   			current, 
                   			"arg2",
                    		lv_arg2_3_0, 
                    		"com.holycityaudio.spincad.SpinCAD.SPINDOUBLE");
            	        afterParserOrEnumRuleCall();
            	    

            }


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
    // $ANTLR end "ruleReadDelay"


    // $ANTLR start "entryRuleLoadSinLFO"
    // InternalSpinCAD.g:5563:1: entryRuleLoadSinLFO returns [EObject current=null] : iv_ruleLoadSinLFO= ruleLoadSinLFO EOF ;
    public final EObject entryRuleLoadSinLFO() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLoadSinLFO = null;


        try {
            // InternalSpinCAD.g:5564:2: (iv_ruleLoadSinLFO= ruleLoadSinLFO EOF )
            // InternalSpinCAD.g:5565:2: iv_ruleLoadSinLFO= ruleLoadSinLFO EOF
            {
             newCompositeNode(grammarAccess.getLoadSinLFORule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLoadSinLFO=ruleLoadSinLFO();

            state._fsp--;

             current =iv_ruleLoadSinLFO; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleLoadSinLFO"


    // $ANTLR start "ruleLoadSinLFO"
    // InternalSpinCAD.g:5572:1: ruleLoadSinLFO returns [EObject current=null] : (otherlv_0= 'wlds' ( (lv_arg1_1_0= ruleSPINREGISTER ) ) otherlv_2= ',' ( (lv_arg2_3_0= ruleSPINDOUBLE ) ) otherlv_4= ',' ( (lv_arg3_5_0= ruleSPINDOUBLE ) ) ) ;
    public final EObject ruleLoadSinLFO() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        AntlrDatatypeRuleToken lv_arg1_1_0 = null;

        AntlrDatatypeRuleToken lv_arg2_3_0 = null;

        AntlrDatatypeRuleToken lv_arg3_5_0 = null;


         enterRule(); 
            
        try {
            // InternalSpinCAD.g:5575:28: ( (otherlv_0= 'wlds' ( (lv_arg1_1_0= ruleSPINREGISTER ) ) otherlv_2= ',' ( (lv_arg2_3_0= ruleSPINDOUBLE ) ) otherlv_4= ',' ( (lv_arg3_5_0= ruleSPINDOUBLE ) ) ) )
            // InternalSpinCAD.g:5576:1: (otherlv_0= 'wlds' ( (lv_arg1_1_0= ruleSPINREGISTER ) ) otherlv_2= ',' ( (lv_arg2_3_0= ruleSPINDOUBLE ) ) otherlv_4= ',' ( (lv_arg3_5_0= ruleSPINDOUBLE ) ) )
            {
            // InternalSpinCAD.g:5576:1: (otherlv_0= 'wlds' ( (lv_arg1_1_0= ruleSPINREGISTER ) ) otherlv_2= ',' ( (lv_arg2_3_0= ruleSPINDOUBLE ) ) otherlv_4= ',' ( (lv_arg3_5_0= ruleSPINDOUBLE ) ) )
            // InternalSpinCAD.g:5576:3: otherlv_0= 'wlds' ( (lv_arg1_1_0= ruleSPINREGISTER ) ) otherlv_2= ',' ( (lv_arg2_3_0= ruleSPINDOUBLE ) ) otherlv_4= ',' ( (lv_arg3_5_0= ruleSPINDOUBLE ) )
            {
            otherlv_0=(Token)match(input,70,FOLLOW_9); 

                	newLeafNode(otherlv_0, grammarAccess.getLoadSinLFOAccess().getWldsKeyword_0());
                
            // InternalSpinCAD.g:5580:1: ( (lv_arg1_1_0= ruleSPINREGISTER ) )
            // InternalSpinCAD.g:5581:1: (lv_arg1_1_0= ruleSPINREGISTER )
            {
            // InternalSpinCAD.g:5581:1: (lv_arg1_1_0= ruleSPINREGISTER )
            // InternalSpinCAD.g:5582:3: lv_arg1_1_0= ruleSPINREGISTER
            {
             
            	        newCompositeNode(grammarAccess.getLoadSinLFOAccess().getArg1SPINREGISTERParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_16);
            lv_arg1_1_0=ruleSPINREGISTER();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getLoadSinLFORule());
            	        }
                   		set(
                   			current, 
                   			"arg1",
                    		lv_arg1_1_0, 
                    		"com.holycityaudio.spincad.SpinCAD.SPINREGISTER");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_2=(Token)match(input,56,FOLLOW_9); 

                	newLeafNode(otherlv_2, grammarAccess.getLoadSinLFOAccess().getCommaKeyword_2());
                
            // InternalSpinCAD.g:5602:1: ( (lv_arg2_3_0= ruleSPINDOUBLE ) )
            // InternalSpinCAD.g:5603:1: (lv_arg2_3_0= ruleSPINDOUBLE )
            {
            // InternalSpinCAD.g:5603:1: (lv_arg2_3_0= ruleSPINDOUBLE )
            // InternalSpinCAD.g:5604:3: lv_arg2_3_0= ruleSPINDOUBLE
            {
             
            	        newCompositeNode(grammarAccess.getLoadSinLFOAccess().getArg2SPINDOUBLEParserRuleCall_3_0()); 
            	    
            pushFollow(FOLLOW_16);
            lv_arg2_3_0=ruleSPINDOUBLE();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getLoadSinLFORule());
            	        }
                   		set(
                   			current, 
                   			"arg2",
                    		lv_arg2_3_0, 
                    		"com.holycityaudio.spincad.SpinCAD.SPINDOUBLE");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_4=(Token)match(input,56,FOLLOW_9); 

                	newLeafNode(otherlv_4, grammarAccess.getLoadSinLFOAccess().getCommaKeyword_4());
                
            // InternalSpinCAD.g:5624:1: ( (lv_arg3_5_0= ruleSPINDOUBLE ) )
            // InternalSpinCAD.g:5625:1: (lv_arg3_5_0= ruleSPINDOUBLE )
            {
            // InternalSpinCAD.g:5625:1: (lv_arg3_5_0= ruleSPINDOUBLE )
            // InternalSpinCAD.g:5626:3: lv_arg3_5_0= ruleSPINDOUBLE
            {
             
            	        newCompositeNode(grammarAccess.getLoadSinLFOAccess().getArg3SPINDOUBLEParserRuleCall_5_0()); 
            	    
            pushFollow(FOLLOW_2);
            lv_arg3_5_0=ruleSPINDOUBLE();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getLoadSinLFORule());
            	        }
                   		set(
                   			current, 
                   			"arg3",
                    		lv_arg3_5_0, 
                    		"com.holycityaudio.spincad.SpinCAD.SPINDOUBLE");
            	        afterParserOrEnumRuleCall();
            	    

            }


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
    // $ANTLR end "ruleLoadSinLFO"


    // $ANTLR start "entryRuleLoadRampLFO"
    // InternalSpinCAD.g:5650:1: entryRuleLoadRampLFO returns [EObject current=null] : iv_ruleLoadRampLFO= ruleLoadRampLFO EOF ;
    public final EObject entryRuleLoadRampLFO() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLoadRampLFO = null;


        try {
            // InternalSpinCAD.g:5651:2: (iv_ruleLoadRampLFO= ruleLoadRampLFO EOF )
            // InternalSpinCAD.g:5652:2: iv_ruleLoadRampLFO= ruleLoadRampLFO EOF
            {
             newCompositeNode(grammarAccess.getLoadRampLFORule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLoadRampLFO=ruleLoadRampLFO();

            state._fsp--;

             current =iv_ruleLoadRampLFO; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleLoadRampLFO"


    // $ANTLR start "ruleLoadRampLFO"
    // InternalSpinCAD.g:5659:1: ruleLoadRampLFO returns [EObject current=null] : (otherlv_0= 'wldr' ( (lv_arg1_1_0= ruleSPINREGISTER ) ) otherlv_2= ',' ( (lv_arg2_3_0= ruleSPINREGISTER ) ) otherlv_4= ',' ( (lv_arg3_5_0= ruleSPINREGISTER ) ) ) ;
    public final EObject ruleLoadRampLFO() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        AntlrDatatypeRuleToken lv_arg1_1_0 = null;

        AntlrDatatypeRuleToken lv_arg2_3_0 = null;

        AntlrDatatypeRuleToken lv_arg3_5_0 = null;


         enterRule(); 
            
        try {
            // InternalSpinCAD.g:5662:28: ( (otherlv_0= 'wldr' ( (lv_arg1_1_0= ruleSPINREGISTER ) ) otherlv_2= ',' ( (lv_arg2_3_0= ruleSPINREGISTER ) ) otherlv_4= ',' ( (lv_arg3_5_0= ruleSPINREGISTER ) ) ) )
            // InternalSpinCAD.g:5663:1: (otherlv_0= 'wldr' ( (lv_arg1_1_0= ruleSPINREGISTER ) ) otherlv_2= ',' ( (lv_arg2_3_0= ruleSPINREGISTER ) ) otherlv_4= ',' ( (lv_arg3_5_0= ruleSPINREGISTER ) ) )
            {
            // InternalSpinCAD.g:5663:1: (otherlv_0= 'wldr' ( (lv_arg1_1_0= ruleSPINREGISTER ) ) otherlv_2= ',' ( (lv_arg2_3_0= ruleSPINREGISTER ) ) otherlv_4= ',' ( (lv_arg3_5_0= ruleSPINREGISTER ) ) )
            // InternalSpinCAD.g:5663:3: otherlv_0= 'wldr' ( (lv_arg1_1_0= ruleSPINREGISTER ) ) otherlv_2= ',' ( (lv_arg2_3_0= ruleSPINREGISTER ) ) otherlv_4= ',' ( (lv_arg3_5_0= ruleSPINREGISTER ) )
            {
            otherlv_0=(Token)match(input,71,FOLLOW_9); 

                	newLeafNode(otherlv_0, grammarAccess.getLoadRampLFOAccess().getWldrKeyword_0());
                
            // InternalSpinCAD.g:5667:1: ( (lv_arg1_1_0= ruleSPINREGISTER ) )
            // InternalSpinCAD.g:5668:1: (lv_arg1_1_0= ruleSPINREGISTER )
            {
            // InternalSpinCAD.g:5668:1: (lv_arg1_1_0= ruleSPINREGISTER )
            // InternalSpinCAD.g:5669:3: lv_arg1_1_0= ruleSPINREGISTER
            {
             
            	        newCompositeNode(grammarAccess.getLoadRampLFOAccess().getArg1SPINREGISTERParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_16);
            lv_arg1_1_0=ruleSPINREGISTER();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getLoadRampLFORule());
            	        }
                   		set(
                   			current, 
                   			"arg1",
                    		lv_arg1_1_0, 
                    		"com.holycityaudio.spincad.SpinCAD.SPINREGISTER");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_2=(Token)match(input,56,FOLLOW_9); 

                	newLeafNode(otherlv_2, grammarAccess.getLoadRampLFOAccess().getCommaKeyword_2());
                
            // InternalSpinCAD.g:5689:1: ( (lv_arg2_3_0= ruleSPINREGISTER ) )
            // InternalSpinCAD.g:5690:1: (lv_arg2_3_0= ruleSPINREGISTER )
            {
            // InternalSpinCAD.g:5690:1: (lv_arg2_3_0= ruleSPINREGISTER )
            // InternalSpinCAD.g:5691:3: lv_arg2_3_0= ruleSPINREGISTER
            {
             
            	        newCompositeNode(grammarAccess.getLoadRampLFOAccess().getArg2SPINREGISTERParserRuleCall_3_0()); 
            	    
            pushFollow(FOLLOW_16);
            lv_arg2_3_0=ruleSPINREGISTER();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getLoadRampLFORule());
            	        }
                   		set(
                   			current, 
                   			"arg2",
                    		lv_arg2_3_0, 
                    		"com.holycityaudio.spincad.SpinCAD.SPINREGISTER");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_4=(Token)match(input,56,FOLLOW_9); 

                	newLeafNode(otherlv_4, grammarAccess.getLoadRampLFOAccess().getCommaKeyword_4());
                
            // InternalSpinCAD.g:5711:1: ( (lv_arg3_5_0= ruleSPINREGISTER ) )
            // InternalSpinCAD.g:5712:1: (lv_arg3_5_0= ruleSPINREGISTER )
            {
            // InternalSpinCAD.g:5712:1: (lv_arg3_5_0= ruleSPINREGISTER )
            // InternalSpinCAD.g:5713:3: lv_arg3_5_0= ruleSPINREGISTER
            {
             
            	        newCompositeNode(grammarAccess.getLoadRampLFOAccess().getArg3SPINREGISTERParserRuleCall_5_0()); 
            	    
            pushFollow(FOLLOW_2);
            lv_arg3_5_0=ruleSPINREGISTER();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getLoadRampLFORule());
            	        }
                   		set(
                   			current, 
                   			"arg3",
                    		lv_arg3_5_0, 
                    		"com.holycityaudio.spincad.SpinCAD.SPINREGISTER");
            	        afterParserOrEnumRuleCall();
            	    

            }


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
    // $ANTLR end "ruleLoadRampLFO"


    // $ANTLR start "entryRuleChorusReadDelay"
    // InternalSpinCAD.g:5737:1: entryRuleChorusReadDelay returns [EObject current=null] : iv_ruleChorusReadDelay= ruleChorusReadDelay EOF ;
    public final EObject entryRuleChorusReadDelay() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleChorusReadDelay = null;


        try {
            // InternalSpinCAD.g:5738:2: (iv_ruleChorusReadDelay= ruleChorusReadDelay EOF )
            // InternalSpinCAD.g:5739:2: iv_ruleChorusReadDelay= ruleChorusReadDelay EOF
            {
             newCompositeNode(grammarAccess.getChorusReadDelayRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleChorusReadDelay=ruleChorusReadDelay();

            state._fsp--;

             current =iv_ruleChorusReadDelay; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleChorusReadDelay"


    // $ANTLR start "ruleChorusReadDelay"
    // InternalSpinCAD.g:5746:1: ruleChorusReadDelay returns [EObject current=null] : (otherlv_0= 'cho rda' otherlv_1= ',' ( (lv_arg1_2_0= ruleSPINREGISTER ) ) otherlv_3= ',' ( (lv_arg2_4_0= ruleSPINCHOREGFLAGS ) ) otherlv_5= ',' ( (lv_arg3_6_0= ruleSPINMEM ) ) ) ;
    public final EObject ruleChorusReadDelay() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        AntlrDatatypeRuleToken lv_arg1_2_0 = null;

        AntlrDatatypeRuleToken lv_arg2_4_0 = null;

        EObject lv_arg3_6_0 = null;


         enterRule(); 
            
        try {
            // InternalSpinCAD.g:5749:28: ( (otherlv_0= 'cho rda' otherlv_1= ',' ( (lv_arg1_2_0= ruleSPINREGISTER ) ) otherlv_3= ',' ( (lv_arg2_4_0= ruleSPINCHOREGFLAGS ) ) otherlv_5= ',' ( (lv_arg3_6_0= ruleSPINMEM ) ) ) )
            // InternalSpinCAD.g:5750:1: (otherlv_0= 'cho rda' otherlv_1= ',' ( (lv_arg1_2_0= ruleSPINREGISTER ) ) otherlv_3= ',' ( (lv_arg2_4_0= ruleSPINCHOREGFLAGS ) ) otherlv_5= ',' ( (lv_arg3_6_0= ruleSPINMEM ) ) )
            {
            // InternalSpinCAD.g:5750:1: (otherlv_0= 'cho rda' otherlv_1= ',' ( (lv_arg1_2_0= ruleSPINREGISTER ) ) otherlv_3= ',' ( (lv_arg2_4_0= ruleSPINCHOREGFLAGS ) ) otherlv_5= ',' ( (lv_arg3_6_0= ruleSPINMEM ) ) )
            // InternalSpinCAD.g:5750:3: otherlv_0= 'cho rda' otherlv_1= ',' ( (lv_arg1_2_0= ruleSPINREGISTER ) ) otherlv_3= ',' ( (lv_arg2_4_0= ruleSPINCHOREGFLAGS ) ) otherlv_5= ',' ( (lv_arg3_6_0= ruleSPINMEM ) )
            {
            otherlv_0=(Token)match(input,72,FOLLOW_16); 

                	newLeafNode(otherlv_0, grammarAccess.getChorusReadDelayAccess().getChoRdaKeyword_0());
                
            otherlv_1=(Token)match(input,56,FOLLOW_9); 

                	newLeafNode(otherlv_1, grammarAccess.getChorusReadDelayAccess().getCommaKeyword_1());
                
            // InternalSpinCAD.g:5758:1: ( (lv_arg1_2_0= ruleSPINREGISTER ) )
            // InternalSpinCAD.g:5759:1: (lv_arg1_2_0= ruleSPINREGISTER )
            {
            // InternalSpinCAD.g:5759:1: (lv_arg1_2_0= ruleSPINREGISTER )
            // InternalSpinCAD.g:5760:3: lv_arg1_2_0= ruleSPINREGISTER
            {
             
            	        newCompositeNode(grammarAccess.getChorusReadDelayAccess().getArg1SPINREGISTERParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_16);
            lv_arg1_2_0=ruleSPINREGISTER();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getChorusReadDelayRule());
            	        }
                   		set(
                   			current, 
                   			"arg1",
                    		lv_arg1_2_0, 
                    		"com.holycityaudio.spincad.SpinCAD.SPINREGISTER");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_3=(Token)match(input,56,FOLLOW_17); 

                	newLeafNode(otherlv_3, grammarAccess.getChorusReadDelayAccess().getCommaKeyword_3());
                
            // InternalSpinCAD.g:5780:1: ( (lv_arg2_4_0= ruleSPINCHOREGFLAGS ) )
            // InternalSpinCAD.g:5781:1: (lv_arg2_4_0= ruleSPINCHOREGFLAGS )
            {
            // InternalSpinCAD.g:5781:1: (lv_arg2_4_0= ruleSPINCHOREGFLAGS )
            // InternalSpinCAD.g:5782:3: lv_arg2_4_0= ruleSPINCHOREGFLAGS
            {
             
            	        newCompositeNode(grammarAccess.getChorusReadDelayAccess().getArg2SPINCHOREGFLAGSParserRuleCall_4_0()); 
            	    
            pushFollow(FOLLOW_16);
            lv_arg2_4_0=ruleSPINCHOREGFLAGS();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getChorusReadDelayRule());
            	        }
                   		set(
                   			current, 
                   			"arg2",
                    		lv_arg2_4_0, 
                    		"com.holycityaudio.spincad.SpinCAD.SPINCHOREGFLAGS");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_5=(Token)match(input,56,FOLLOW_8); 

                	newLeafNode(otherlv_5, grammarAccess.getChorusReadDelayAccess().getCommaKeyword_5());
                
            // InternalSpinCAD.g:5802:1: ( (lv_arg3_6_0= ruleSPINMEM ) )
            // InternalSpinCAD.g:5803:1: (lv_arg3_6_0= ruleSPINMEM )
            {
            // InternalSpinCAD.g:5803:1: (lv_arg3_6_0= ruleSPINMEM )
            // InternalSpinCAD.g:5804:3: lv_arg3_6_0= ruleSPINMEM
            {
             
            	        newCompositeNode(grammarAccess.getChorusReadDelayAccess().getArg3SPINMEMParserRuleCall_6_0()); 
            	    
            pushFollow(FOLLOW_2);
            lv_arg3_6_0=ruleSPINMEM();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getChorusReadDelayRule());
            	        }
                   		set(
                   			current, 
                   			"arg3",
                    		lv_arg3_6_0, 
                    		"com.holycityaudio.spincad.SpinCAD.SPINMEM");
            	        afterParserOrEnumRuleCall();
            	    

            }


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
    // $ANTLR end "ruleChorusReadDelay"


    // $ANTLR start "entryRuleChorusReadValue"
    // InternalSpinCAD.g:5828:1: entryRuleChorusReadValue returns [EObject current=null] : iv_ruleChorusReadValue= ruleChorusReadValue EOF ;
    public final EObject entryRuleChorusReadValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleChorusReadValue = null;


        try {
            // InternalSpinCAD.g:5829:2: (iv_ruleChorusReadValue= ruleChorusReadValue EOF )
            // InternalSpinCAD.g:5830:2: iv_ruleChorusReadValue= ruleChorusReadValue EOF
            {
             newCompositeNode(grammarAccess.getChorusReadValueRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleChorusReadValue=ruleChorusReadValue();

            state._fsp--;

             current =iv_ruleChorusReadValue; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleChorusReadValue"


    // $ANTLR start "ruleChorusReadValue"
    // InternalSpinCAD.g:5837:1: ruleChorusReadValue returns [EObject current=null] : (otherlv_0= 'cho rdal' otherlv_1= ',' ( (lv_arg1_2_0= ruleSPINREGISTER ) ) ) ;
    public final EObject ruleChorusReadValue() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_arg1_2_0 = null;


         enterRule(); 
            
        try {
            // InternalSpinCAD.g:5840:28: ( (otherlv_0= 'cho rdal' otherlv_1= ',' ( (lv_arg1_2_0= ruleSPINREGISTER ) ) ) )
            // InternalSpinCAD.g:5841:1: (otherlv_0= 'cho rdal' otherlv_1= ',' ( (lv_arg1_2_0= ruleSPINREGISTER ) ) )
            {
            // InternalSpinCAD.g:5841:1: (otherlv_0= 'cho rdal' otherlv_1= ',' ( (lv_arg1_2_0= ruleSPINREGISTER ) ) )
            // InternalSpinCAD.g:5841:3: otherlv_0= 'cho rdal' otherlv_1= ',' ( (lv_arg1_2_0= ruleSPINREGISTER ) )
            {
            otherlv_0=(Token)match(input,73,FOLLOW_16); 

                	newLeafNode(otherlv_0, grammarAccess.getChorusReadValueAccess().getChoRdalKeyword_0());
                
            otherlv_1=(Token)match(input,56,FOLLOW_9); 

                	newLeafNode(otherlv_1, grammarAccess.getChorusReadValueAccess().getCommaKeyword_1());
                
            // InternalSpinCAD.g:5849:1: ( (lv_arg1_2_0= ruleSPINREGISTER ) )
            // InternalSpinCAD.g:5850:1: (lv_arg1_2_0= ruleSPINREGISTER )
            {
            // InternalSpinCAD.g:5850:1: (lv_arg1_2_0= ruleSPINREGISTER )
            // InternalSpinCAD.g:5851:3: lv_arg1_2_0= ruleSPINREGISTER
            {
             
            	        newCompositeNode(grammarAccess.getChorusReadValueAccess().getArg1SPINREGISTERParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_2);
            lv_arg1_2_0=ruleSPINREGISTER();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getChorusReadValueRule());
            	        }
                   		set(
                   			current, 
                   			"arg1",
                    		lv_arg1_2_0, 
                    		"com.holycityaudio.spincad.SpinCAD.SPINREGISTER");
            	        afterParserOrEnumRuleCall();
            	    

            }


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
    // $ANTLR end "ruleChorusReadValue"


    // $ANTLR start "entryRuleChorusScaleOffset"
    // InternalSpinCAD.g:5875:1: entryRuleChorusScaleOffset returns [EObject current=null] : iv_ruleChorusScaleOffset= ruleChorusScaleOffset EOF ;
    public final EObject entryRuleChorusScaleOffset() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleChorusScaleOffset = null;


        try {
            // InternalSpinCAD.g:5876:2: (iv_ruleChorusScaleOffset= ruleChorusScaleOffset EOF )
            // InternalSpinCAD.g:5877:2: iv_ruleChorusScaleOffset= ruleChorusScaleOffset EOF
            {
             newCompositeNode(grammarAccess.getChorusScaleOffsetRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleChorusScaleOffset=ruleChorusScaleOffset();

            state._fsp--;

             current =iv_ruleChorusScaleOffset; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleChorusScaleOffset"


    // $ANTLR start "ruleChorusScaleOffset"
    // InternalSpinCAD.g:5884:1: ruleChorusScaleOffset returns [EObject current=null] : (otherlv_0= 'cho sof' otherlv_1= ',' ( (lv_arg1_2_0= RULE_ID ) ) otherlv_3= ',' ( (lv_arg2_4_0= ruleSPINCHOREGFLAGS ) ) otherlv_5= ',' ( (lv_arg3_6_0= ruleSPINDOUBLE ) ) ) ;
    public final EObject ruleChorusScaleOffset() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_arg1_2_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        AntlrDatatypeRuleToken lv_arg2_4_0 = null;

        AntlrDatatypeRuleToken lv_arg3_6_0 = null;


         enterRule(); 
            
        try {
            // InternalSpinCAD.g:5887:28: ( (otherlv_0= 'cho sof' otherlv_1= ',' ( (lv_arg1_2_0= RULE_ID ) ) otherlv_3= ',' ( (lv_arg2_4_0= ruleSPINCHOREGFLAGS ) ) otherlv_5= ',' ( (lv_arg3_6_0= ruleSPINDOUBLE ) ) ) )
            // InternalSpinCAD.g:5888:1: (otherlv_0= 'cho sof' otherlv_1= ',' ( (lv_arg1_2_0= RULE_ID ) ) otherlv_3= ',' ( (lv_arg2_4_0= ruleSPINCHOREGFLAGS ) ) otherlv_5= ',' ( (lv_arg3_6_0= ruleSPINDOUBLE ) ) )
            {
            // InternalSpinCAD.g:5888:1: (otherlv_0= 'cho sof' otherlv_1= ',' ( (lv_arg1_2_0= RULE_ID ) ) otherlv_3= ',' ( (lv_arg2_4_0= ruleSPINCHOREGFLAGS ) ) otherlv_5= ',' ( (lv_arg3_6_0= ruleSPINDOUBLE ) ) )
            // InternalSpinCAD.g:5888:3: otherlv_0= 'cho sof' otherlv_1= ',' ( (lv_arg1_2_0= RULE_ID ) ) otherlv_3= ',' ( (lv_arg2_4_0= ruleSPINCHOREGFLAGS ) ) otherlv_5= ',' ( (lv_arg3_6_0= ruleSPINDOUBLE ) )
            {
            otherlv_0=(Token)match(input,74,FOLLOW_16); 

                	newLeafNode(otherlv_0, grammarAccess.getChorusScaleOffsetAccess().getChoSofKeyword_0());
                
            otherlv_1=(Token)match(input,56,FOLLOW_8); 

                	newLeafNode(otherlv_1, grammarAccess.getChorusScaleOffsetAccess().getCommaKeyword_1());
                
            // InternalSpinCAD.g:5896:1: ( (lv_arg1_2_0= RULE_ID ) )
            // InternalSpinCAD.g:5897:1: (lv_arg1_2_0= RULE_ID )
            {
            // InternalSpinCAD.g:5897:1: (lv_arg1_2_0= RULE_ID )
            // InternalSpinCAD.g:5898:3: lv_arg1_2_0= RULE_ID
            {
            lv_arg1_2_0=(Token)match(input,RULE_ID,FOLLOW_16); 

            			newLeafNode(lv_arg1_2_0, grammarAccess.getChorusScaleOffsetAccess().getArg1IDTerminalRuleCall_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getChorusScaleOffsetRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"arg1",
                    		lv_arg1_2_0, 
                    		"org.eclipse.xtext.common.Terminals.ID");
            	    

            }


            }

            otherlv_3=(Token)match(input,56,FOLLOW_17); 

                	newLeafNode(otherlv_3, grammarAccess.getChorusScaleOffsetAccess().getCommaKeyword_3());
                
            // InternalSpinCAD.g:5918:1: ( (lv_arg2_4_0= ruleSPINCHOREGFLAGS ) )
            // InternalSpinCAD.g:5919:1: (lv_arg2_4_0= ruleSPINCHOREGFLAGS )
            {
            // InternalSpinCAD.g:5919:1: (lv_arg2_4_0= ruleSPINCHOREGFLAGS )
            // InternalSpinCAD.g:5920:3: lv_arg2_4_0= ruleSPINCHOREGFLAGS
            {
             
            	        newCompositeNode(grammarAccess.getChorusScaleOffsetAccess().getArg2SPINCHOREGFLAGSParserRuleCall_4_0()); 
            	    
            pushFollow(FOLLOW_16);
            lv_arg2_4_0=ruleSPINCHOREGFLAGS();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getChorusScaleOffsetRule());
            	        }
                   		set(
                   			current, 
                   			"arg2",
                    		lv_arg2_4_0, 
                    		"com.holycityaudio.spincad.SpinCAD.SPINCHOREGFLAGS");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_5=(Token)match(input,56,FOLLOW_9); 

                	newLeafNode(otherlv_5, grammarAccess.getChorusScaleOffsetAccess().getCommaKeyword_5());
                
            // InternalSpinCAD.g:5940:1: ( (lv_arg3_6_0= ruleSPINDOUBLE ) )
            // InternalSpinCAD.g:5941:1: (lv_arg3_6_0= ruleSPINDOUBLE )
            {
            // InternalSpinCAD.g:5941:1: (lv_arg3_6_0= ruleSPINDOUBLE )
            // InternalSpinCAD.g:5942:3: lv_arg3_6_0= ruleSPINDOUBLE
            {
             
            	        newCompositeNode(grammarAccess.getChorusScaleOffsetAccess().getArg3SPINDOUBLEParserRuleCall_6_0()); 
            	    
            pushFollow(FOLLOW_2);
            lv_arg3_6_0=ruleSPINDOUBLE();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getChorusScaleOffsetRule());
            	        }
                   		set(
                   			current, 
                   			"arg3",
                    		lv_arg3_6_0, 
                    		"com.holycityaudio.spincad.SpinCAD.SPINDOUBLE");
            	        afterParserOrEnumRuleCall();
            	    

            }


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
    // $ANTLR end "ruleChorusScaleOffset"


    // $ANTLR start "entryRuleReadDelayPointer"
    // InternalSpinCAD.g:5966:1: entryRuleReadDelayPointer returns [EObject current=null] : iv_ruleReadDelayPointer= ruleReadDelayPointer EOF ;
    public final EObject entryRuleReadDelayPointer() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReadDelayPointer = null;


        try {
            // InternalSpinCAD.g:5967:2: (iv_ruleReadDelayPointer= ruleReadDelayPointer EOF )
            // InternalSpinCAD.g:5968:2: iv_ruleReadDelayPointer= ruleReadDelayPointer EOF
            {
             newCompositeNode(grammarAccess.getReadDelayPointerRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleReadDelayPointer=ruleReadDelayPointer();

            state._fsp--;

             current =iv_ruleReadDelayPointer; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleReadDelayPointer"


    // $ANTLR start "ruleReadDelayPointer"
    // InternalSpinCAD.g:5975:1: ruleReadDelayPointer returns [EObject current=null] : (otherlv_0= 'rmpa' ( (lv_arg1_1_0= ruleSPINDOUBLE ) ) ) ;
    public final EObject ruleReadDelayPointer() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        AntlrDatatypeRuleToken lv_arg1_1_0 = null;


         enterRule(); 
            
        try {
            // InternalSpinCAD.g:5978:28: ( (otherlv_0= 'rmpa' ( (lv_arg1_1_0= ruleSPINDOUBLE ) ) ) )
            // InternalSpinCAD.g:5979:1: (otherlv_0= 'rmpa' ( (lv_arg1_1_0= ruleSPINDOUBLE ) ) )
            {
            // InternalSpinCAD.g:5979:1: (otherlv_0= 'rmpa' ( (lv_arg1_1_0= ruleSPINDOUBLE ) ) )
            // InternalSpinCAD.g:5979:3: otherlv_0= 'rmpa' ( (lv_arg1_1_0= ruleSPINDOUBLE ) )
            {
            otherlv_0=(Token)match(input,75,FOLLOW_9); 

                	newLeafNode(otherlv_0, grammarAccess.getReadDelayPointerAccess().getRmpaKeyword_0());
                
            // InternalSpinCAD.g:5983:1: ( (lv_arg1_1_0= ruleSPINDOUBLE ) )
            // InternalSpinCAD.g:5984:1: (lv_arg1_1_0= ruleSPINDOUBLE )
            {
            // InternalSpinCAD.g:5984:1: (lv_arg1_1_0= ruleSPINDOUBLE )
            // InternalSpinCAD.g:5985:3: lv_arg1_1_0= ruleSPINDOUBLE
            {
             
            	        newCompositeNode(grammarAccess.getReadDelayPointerAccess().getArg1SPINDOUBLEParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_2);
            lv_arg1_1_0=ruleSPINDOUBLE();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getReadDelayPointerRule());
            	        }
                   		set(
                   			current, 
                   			"arg1",
                    		lv_arg1_1_0, 
                    		"com.holycityaudio.spincad.SpinCAD.SPINDOUBLE");
            	        afterParserOrEnumRuleCall();
            	    

            }


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
    // $ANTLR end "ruleReadDelayPointer"


    // $ANTLR start "entryRuleAnd"
    // InternalSpinCAD.g:6009:1: entryRuleAnd returns [EObject current=null] : iv_ruleAnd= ruleAnd EOF ;
    public final EObject entryRuleAnd() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAnd = null;


        try {
            // InternalSpinCAD.g:6010:2: (iv_ruleAnd= ruleAnd EOF )
            // InternalSpinCAD.g:6011:2: iv_ruleAnd= ruleAnd EOF
            {
             newCompositeNode(grammarAccess.getAndRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAnd=ruleAnd();

            state._fsp--;

             current =iv_ruleAnd; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleAnd"


    // $ANTLR start "ruleAnd"
    // InternalSpinCAD.g:6018:1: ruleAnd returns [EObject current=null] : (otherlv_0= 'and' ( (lv_arg1_1_0= ruleBINARY24 ) ) ) ;
    public final EObject ruleAnd() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        AntlrDatatypeRuleToken lv_arg1_1_0 = null;


         enterRule(); 
            
        try {
            // InternalSpinCAD.g:6021:28: ( (otherlv_0= 'and' ( (lv_arg1_1_0= ruleBINARY24 ) ) ) )
            // InternalSpinCAD.g:6022:1: (otherlv_0= 'and' ( (lv_arg1_1_0= ruleBINARY24 ) ) )
            {
            // InternalSpinCAD.g:6022:1: (otherlv_0= 'and' ( (lv_arg1_1_0= ruleBINARY24 ) ) )
            // InternalSpinCAD.g:6022:3: otherlv_0= 'and' ( (lv_arg1_1_0= ruleBINARY24 ) )
            {
            otherlv_0=(Token)match(input,76,FOLLOW_18); 

                	newLeafNode(otherlv_0, grammarAccess.getAndAccess().getAndKeyword_0());
                
            // InternalSpinCAD.g:6026:1: ( (lv_arg1_1_0= ruleBINARY24 ) )
            // InternalSpinCAD.g:6027:1: (lv_arg1_1_0= ruleBINARY24 )
            {
            // InternalSpinCAD.g:6027:1: (lv_arg1_1_0= ruleBINARY24 )
            // InternalSpinCAD.g:6028:3: lv_arg1_1_0= ruleBINARY24
            {
             
            	        newCompositeNode(grammarAccess.getAndAccess().getArg1BINARY24ParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_2);
            lv_arg1_1_0=ruleBINARY24();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getAndRule());
            	        }
                   		set(
                   			current, 
                   			"arg1",
                    		lv_arg1_1_0, 
                    		"com.holycityaudio.spincad.SpinCAD.BINARY24");
            	        afterParserOrEnumRuleCall();
            	    

            }


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
    // $ANTLR end "ruleAnd"


    // $ANTLR start "entryRuleOr"
    // InternalSpinCAD.g:6052:1: entryRuleOr returns [EObject current=null] : iv_ruleOr= ruleOr EOF ;
    public final EObject entryRuleOr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOr = null;


        try {
            // InternalSpinCAD.g:6053:2: (iv_ruleOr= ruleOr EOF )
            // InternalSpinCAD.g:6054:2: iv_ruleOr= ruleOr EOF
            {
             newCompositeNode(grammarAccess.getOrRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleOr=ruleOr();

            state._fsp--;

             current =iv_ruleOr; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleOr"


    // $ANTLR start "ruleOr"
    // InternalSpinCAD.g:6061:1: ruleOr returns [EObject current=null] : (otherlv_0= 'or' ( (lv_arg1_1_0= ruleBINARY24 ) ) ) ;
    public final EObject ruleOr() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        AntlrDatatypeRuleToken lv_arg1_1_0 = null;


         enterRule(); 
            
        try {
            // InternalSpinCAD.g:6064:28: ( (otherlv_0= 'or' ( (lv_arg1_1_0= ruleBINARY24 ) ) ) )
            // InternalSpinCAD.g:6065:1: (otherlv_0= 'or' ( (lv_arg1_1_0= ruleBINARY24 ) ) )
            {
            // InternalSpinCAD.g:6065:1: (otherlv_0= 'or' ( (lv_arg1_1_0= ruleBINARY24 ) ) )
            // InternalSpinCAD.g:6065:3: otherlv_0= 'or' ( (lv_arg1_1_0= ruleBINARY24 ) )
            {
            otherlv_0=(Token)match(input,77,FOLLOW_18); 

                	newLeafNode(otherlv_0, grammarAccess.getOrAccess().getOrKeyword_0());
                
            // InternalSpinCAD.g:6069:1: ( (lv_arg1_1_0= ruleBINARY24 ) )
            // InternalSpinCAD.g:6070:1: (lv_arg1_1_0= ruleBINARY24 )
            {
            // InternalSpinCAD.g:6070:1: (lv_arg1_1_0= ruleBINARY24 )
            // InternalSpinCAD.g:6071:3: lv_arg1_1_0= ruleBINARY24
            {
             
            	        newCompositeNode(grammarAccess.getOrAccess().getArg1BINARY24ParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_2);
            lv_arg1_1_0=ruleBINARY24();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getOrRule());
            	        }
                   		set(
                   			current, 
                   			"arg1",
                    		lv_arg1_1_0, 
                    		"com.holycityaudio.spincad.SpinCAD.BINARY24");
            	        afterParserOrEnumRuleCall();
            	    

            }


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
    // $ANTLR end "ruleOr"


    // $ANTLR start "entryRuleXor"
    // InternalSpinCAD.g:6095:1: entryRuleXor returns [EObject current=null] : iv_ruleXor= ruleXor EOF ;
    public final EObject entryRuleXor() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXor = null;


        try {
            // InternalSpinCAD.g:6096:2: (iv_ruleXor= ruleXor EOF )
            // InternalSpinCAD.g:6097:2: iv_ruleXor= ruleXor EOF
            {
             newCompositeNode(grammarAccess.getXorRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleXor=ruleXor();

            state._fsp--;

             current =iv_ruleXor; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleXor"


    // $ANTLR start "ruleXor"
    // InternalSpinCAD.g:6104:1: ruleXor returns [EObject current=null] : (otherlv_0= 'xor' ( (lv_arg1_1_0= ruleBINARY24 ) ) ) ;
    public final EObject ruleXor() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        AntlrDatatypeRuleToken lv_arg1_1_0 = null;


         enterRule(); 
            
        try {
            // InternalSpinCAD.g:6107:28: ( (otherlv_0= 'xor' ( (lv_arg1_1_0= ruleBINARY24 ) ) ) )
            // InternalSpinCAD.g:6108:1: (otherlv_0= 'xor' ( (lv_arg1_1_0= ruleBINARY24 ) ) )
            {
            // InternalSpinCAD.g:6108:1: (otherlv_0= 'xor' ( (lv_arg1_1_0= ruleBINARY24 ) ) )
            // InternalSpinCAD.g:6108:3: otherlv_0= 'xor' ( (lv_arg1_1_0= ruleBINARY24 ) )
            {
            otherlv_0=(Token)match(input,78,FOLLOW_18); 

                	newLeafNode(otherlv_0, grammarAccess.getXorAccess().getXorKeyword_0());
                
            // InternalSpinCAD.g:6112:1: ( (lv_arg1_1_0= ruleBINARY24 ) )
            // InternalSpinCAD.g:6113:1: (lv_arg1_1_0= ruleBINARY24 )
            {
            // InternalSpinCAD.g:6113:1: (lv_arg1_1_0= ruleBINARY24 )
            // InternalSpinCAD.g:6114:3: lv_arg1_1_0= ruleBINARY24
            {
             
            	        newCompositeNode(grammarAccess.getXorAccess().getArg1BINARY24ParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_2);
            lv_arg1_1_0=ruleBINARY24();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getXorRule());
            	        }
                   		set(
                   			current, 
                   			"arg1",
                    		lv_arg1_1_0, 
                    		"com.holycityaudio.spincad.SpinCAD.BINARY24");
            	        afterParserOrEnumRuleCall();
            	    

            }


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
    // $ANTLR end "ruleXor"


    // $ANTLR start "entryRuleJam"
    // InternalSpinCAD.g:6138:1: entryRuleJam returns [EObject current=null] : iv_ruleJam= ruleJam EOF ;
    public final EObject entryRuleJam() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJam = null;


        try {
            // InternalSpinCAD.g:6139:2: (iv_ruleJam= ruleJam EOF )
            // InternalSpinCAD.g:6140:2: iv_ruleJam= ruleJam EOF
            {
             newCompositeNode(grammarAccess.getJamRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleJam=ruleJam();

            state._fsp--;

             current =iv_ruleJam; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleJam"


    // $ANTLR start "ruleJam"
    // InternalSpinCAD.g:6147:1: ruleJam returns [EObject current=null] : (otherlv_0= 'jam' ( (lv_arg1_1_0= RULE_ID ) ) ) ;
    public final EObject ruleJam() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_arg1_1_0=null;

         enterRule(); 
            
        try {
            // InternalSpinCAD.g:6150:28: ( (otherlv_0= 'jam' ( (lv_arg1_1_0= RULE_ID ) ) ) )
            // InternalSpinCAD.g:6151:1: (otherlv_0= 'jam' ( (lv_arg1_1_0= RULE_ID ) ) )
            {
            // InternalSpinCAD.g:6151:1: (otherlv_0= 'jam' ( (lv_arg1_1_0= RULE_ID ) ) )
            // InternalSpinCAD.g:6151:3: otherlv_0= 'jam' ( (lv_arg1_1_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,79,FOLLOW_8); 

                	newLeafNode(otherlv_0, grammarAccess.getJamAccess().getJamKeyword_0());
                
            // InternalSpinCAD.g:6155:1: ( (lv_arg1_1_0= RULE_ID ) )
            // InternalSpinCAD.g:6156:1: (lv_arg1_1_0= RULE_ID )
            {
            // InternalSpinCAD.g:6156:1: (lv_arg1_1_0= RULE_ID )
            // InternalSpinCAD.g:6157:3: lv_arg1_1_0= RULE_ID
            {
            lv_arg1_1_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            			newLeafNode(lv_arg1_1_0, grammarAccess.getJamAccess().getArg1IDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getJamRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"arg1",
                    		lv_arg1_1_0, 
                    		"org.eclipse.xtext.common.Terminals.ID");
            	    

            }


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
    // $ANTLR end "ruleJam"


    // $ANTLR start "entryRuleClr"
    // InternalSpinCAD.g:6181:1: entryRuleClr returns [EObject current=null] : iv_ruleClr= ruleClr EOF ;
    public final EObject entryRuleClr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleClr = null;


        try {
            // InternalSpinCAD.g:6182:2: (iv_ruleClr= ruleClr EOF )
            // InternalSpinCAD.g:6183:2: iv_ruleClr= ruleClr EOF
            {
             newCompositeNode(grammarAccess.getClrRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleClr=ruleClr();

            state._fsp--;

             current =iv_ruleClr; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleClr"


    // $ANTLR start "ruleClr"
    // InternalSpinCAD.g:6190:1: ruleClr returns [EObject current=null] : ( () otherlv_1= 'clr' ) ;
    public final EObject ruleClr() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // InternalSpinCAD.g:6193:28: ( ( () otherlv_1= 'clr' ) )
            // InternalSpinCAD.g:6194:1: ( () otherlv_1= 'clr' )
            {
            // InternalSpinCAD.g:6194:1: ( () otherlv_1= 'clr' )
            // InternalSpinCAD.g:6194:2: () otherlv_1= 'clr'
            {
            // InternalSpinCAD.g:6194:2: ()
            // InternalSpinCAD.g:6195:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getClrAccess().getClrAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,80,FOLLOW_2); 

                	newLeafNode(otherlv_1, grammarAccess.getClrAccess().getClrKeyword_1());
                

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
    // $ANTLR end "ruleClr"


    // $ANTLR start "entryRuleNot"
    // InternalSpinCAD.g:6212:1: entryRuleNot returns [EObject current=null] : iv_ruleNot= ruleNot EOF ;
    public final EObject entryRuleNot() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNot = null;


        try {
            // InternalSpinCAD.g:6213:2: (iv_ruleNot= ruleNot EOF )
            // InternalSpinCAD.g:6214:2: iv_ruleNot= ruleNot EOF
            {
             newCompositeNode(grammarAccess.getNotRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleNot=ruleNot();

            state._fsp--;

             current =iv_ruleNot; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleNot"


    // $ANTLR start "ruleNot"
    // InternalSpinCAD.g:6221:1: ruleNot returns [EObject current=null] : ( () otherlv_1= 'not' ) ;
    public final EObject ruleNot() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // InternalSpinCAD.g:6224:28: ( ( () otherlv_1= 'not' ) )
            // InternalSpinCAD.g:6225:1: ( () otherlv_1= 'not' )
            {
            // InternalSpinCAD.g:6225:1: ( () otherlv_1= 'not' )
            // InternalSpinCAD.g:6225:2: () otherlv_1= 'not'
            {
            // InternalSpinCAD.g:6225:2: ()
            // InternalSpinCAD.g:6226:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getNotAccess().getNotAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,81,FOLLOW_2); 

                	newLeafNode(otherlv_1, grammarAccess.getNotAccess().getNotKeyword_1());
                

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
    // $ANTLR end "ruleNot"


    // $ANTLR start "entryRuleAbsa"
    // InternalSpinCAD.g:6243:1: entryRuleAbsa returns [EObject current=null] : iv_ruleAbsa= ruleAbsa EOF ;
    public final EObject entryRuleAbsa() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAbsa = null;


        try {
            // InternalSpinCAD.g:6244:2: (iv_ruleAbsa= ruleAbsa EOF )
            // InternalSpinCAD.g:6245:2: iv_ruleAbsa= ruleAbsa EOF
            {
             newCompositeNode(grammarAccess.getAbsaRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAbsa=ruleAbsa();

            state._fsp--;

             current =iv_ruleAbsa; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleAbsa"


    // $ANTLR start "ruleAbsa"
    // InternalSpinCAD.g:6252:1: ruleAbsa returns [EObject current=null] : ( () otherlv_1= 'absa' ) ;
    public final EObject ruleAbsa() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // InternalSpinCAD.g:6255:28: ( ( () otherlv_1= 'absa' ) )
            // InternalSpinCAD.g:6256:1: ( () otherlv_1= 'absa' )
            {
            // InternalSpinCAD.g:6256:1: ( () otherlv_1= 'absa' )
            // InternalSpinCAD.g:6256:2: () otherlv_1= 'absa'
            {
            // InternalSpinCAD.g:6256:2: ()
            // InternalSpinCAD.g:6257:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getAbsaAccess().getAbsaAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,82,FOLLOW_2); 

                	newLeafNode(otherlv_1, grammarAccess.getAbsaAccess().getAbsaKeyword_1());
                

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
    // $ANTLR end "ruleAbsa"


    // $ANTLR start "entryRuleSkip"
    // InternalSpinCAD.g:6274:1: entryRuleSkip returns [EObject current=null] : iv_ruleSkip= ruleSkip EOF ;
    public final EObject entryRuleSkip() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSkip = null;


        try {
            // InternalSpinCAD.g:6275:2: (iv_ruleSkip= ruleSkip EOF )
            // InternalSpinCAD.g:6276:2: iv_ruleSkip= ruleSkip EOF
            {
             newCompositeNode(grammarAccess.getSkipRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSkip=ruleSkip();

            state._fsp--;

             current =iv_ruleSkip; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleSkip"


    // $ANTLR start "ruleSkip"
    // InternalSpinCAD.g:6283:1: ruleSkip returns [EObject current=null] : (otherlv_0= 'skp' ( (lv_flags_1_0= RULE_ID ) ) (otherlv_2= '|' this_ID_3= RULE_ID )* otherlv_4= ',' ( (otherlv_5= RULE_ID ) ) ) ;
    public final EObject ruleSkip() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_flags_1_0=null;
        Token otherlv_2=null;
        Token this_ID_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;

         enterRule(); 
            
        try {
            // InternalSpinCAD.g:6286:28: ( (otherlv_0= 'skp' ( (lv_flags_1_0= RULE_ID ) ) (otherlv_2= '|' this_ID_3= RULE_ID )* otherlv_4= ',' ( (otherlv_5= RULE_ID ) ) ) )
            // InternalSpinCAD.g:6287:1: (otherlv_0= 'skp' ( (lv_flags_1_0= RULE_ID ) ) (otherlv_2= '|' this_ID_3= RULE_ID )* otherlv_4= ',' ( (otherlv_5= RULE_ID ) ) )
            {
            // InternalSpinCAD.g:6287:1: (otherlv_0= 'skp' ( (lv_flags_1_0= RULE_ID ) ) (otherlv_2= '|' this_ID_3= RULE_ID )* otherlv_4= ',' ( (otherlv_5= RULE_ID ) ) )
            // InternalSpinCAD.g:6287:3: otherlv_0= 'skp' ( (lv_flags_1_0= RULE_ID ) ) (otherlv_2= '|' this_ID_3= RULE_ID )* otherlv_4= ',' ( (otherlv_5= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,83,FOLLOW_8); 

                	newLeafNode(otherlv_0, grammarAccess.getSkipAccess().getSkpKeyword_0());
                
            // InternalSpinCAD.g:6291:1: ( (lv_flags_1_0= RULE_ID ) )
            // InternalSpinCAD.g:6292:1: (lv_flags_1_0= RULE_ID )
            {
            // InternalSpinCAD.g:6292:1: (lv_flags_1_0= RULE_ID )
            // InternalSpinCAD.g:6293:3: lv_flags_1_0= RULE_ID
            {
            lv_flags_1_0=(Token)match(input,RULE_ID,FOLLOW_19); 

            			newLeafNode(lv_flags_1_0, grammarAccess.getSkipAccess().getFlagsIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getSkipRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"flags",
                    		lv_flags_1_0, 
                    		"org.eclipse.xtext.common.Terminals.ID");
            	    

            }


            }

            // InternalSpinCAD.g:6309:2: (otherlv_2= '|' this_ID_3= RULE_ID )*
            loop46:
            do {
                int alt46=2;
                int LA46_0 = input.LA(1);

                if ( (LA46_0==84) ) {
                    alt46=1;
                }


                switch (alt46) {
            	case 1 :
            	    // InternalSpinCAD.g:6309:4: otherlv_2= '|' this_ID_3= RULE_ID
            	    {
            	    otherlv_2=(Token)match(input,84,FOLLOW_8); 

            	        	newLeafNode(otherlv_2, grammarAccess.getSkipAccess().getVerticalLineKeyword_2_0());
            	        
            	    this_ID_3=(Token)match(input,RULE_ID,FOLLOW_19); 
            	     
            	        newLeafNode(this_ID_3, grammarAccess.getSkipAccess().getIDTerminalRuleCall_2_1()); 
            	        

            	    }
            	    break;

            	default :
            	    break loop46;
                }
            } while (true);

            otherlv_4=(Token)match(input,56,FOLLOW_8); 

                	newLeafNode(otherlv_4, grammarAccess.getSkipAccess().getCommaKeyword_3());
                
            // InternalSpinCAD.g:6321:1: ( (otherlv_5= RULE_ID ) )
            // InternalSpinCAD.g:6322:1: (otherlv_5= RULE_ID )
            {
            // InternalSpinCAD.g:6322:1: (otherlv_5= RULE_ID )
            // InternalSpinCAD.g:6323:3: otherlv_5= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getSkipRule());
            	        }
                    
            otherlv_5=(Token)match(input,RULE_ID,FOLLOW_2); 

            		newLeafNode(otherlv_5, grammarAccess.getSkipAccess().getLabelLabelCrossReference_4_0()); 
            	

            }


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
    // $ANTLR end "ruleSkip"


    // $ANTLR start "entryRuleSPINDOUBLE"
    // InternalSpinCAD.g:6342:1: entryRuleSPINDOUBLE returns [String current=null] : iv_ruleSPINDOUBLE= ruleSPINDOUBLE EOF ;
    public final String entryRuleSPINDOUBLE() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleSPINDOUBLE = null;


        try {
            // InternalSpinCAD.g:6343:2: (iv_ruleSPINDOUBLE= ruleSPINDOUBLE EOF )
            // InternalSpinCAD.g:6344:2: iv_ruleSPINDOUBLE= ruleSPINDOUBLE EOF
            {
             newCompositeNode(grammarAccess.getSPINDOUBLERule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSPINDOUBLE=ruleSPINDOUBLE();

            state._fsp--;

             current =iv_ruleSPINDOUBLE.getText(); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleSPINDOUBLE"


    // $ANTLR start "ruleSPINDOUBLE"
    // InternalSpinCAD.g:6351:1: ruleSPINDOUBLE returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '-' )? (this_ID_1= RULE_ID | (this_INT_2= RULE_INT (kw= '.' this_INT_4= RULE_INT )? ) ) ) ;
    public final AntlrDatatypeRuleToken ruleSPINDOUBLE() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_ID_1=null;
        Token this_INT_2=null;
        Token this_INT_4=null;

         enterRule(); 
            
        try {
            // InternalSpinCAD.g:6354:28: ( ( (kw= '-' )? (this_ID_1= RULE_ID | (this_INT_2= RULE_INT (kw= '.' this_INT_4= RULE_INT )? ) ) ) )
            // InternalSpinCAD.g:6355:1: ( (kw= '-' )? (this_ID_1= RULE_ID | (this_INT_2= RULE_INT (kw= '.' this_INT_4= RULE_INT )? ) ) )
            {
            // InternalSpinCAD.g:6355:1: ( (kw= '-' )? (this_ID_1= RULE_ID | (this_INT_2= RULE_INT (kw= '.' this_INT_4= RULE_INT )? ) ) )
            // InternalSpinCAD.g:6355:2: (kw= '-' )? (this_ID_1= RULE_ID | (this_INT_2= RULE_INT (kw= '.' this_INT_4= RULE_INT )? ) )
            {
            // InternalSpinCAD.g:6355:2: (kw= '-' )?
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( (LA47_0==85) ) {
                alt47=1;
            }
            switch (alt47) {
                case 1 :
                    // InternalSpinCAD.g:6356:2: kw= '-'
                    {
                    kw=(Token)match(input,85,FOLLOW_20); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getSPINDOUBLEAccess().getHyphenMinusKeyword_0()); 
                        

                    }
                    break;

            }

            // InternalSpinCAD.g:6361:3: (this_ID_1= RULE_ID | (this_INT_2= RULE_INT (kw= '.' this_INT_4= RULE_INT )? ) )
            int alt49=2;
            int LA49_0 = input.LA(1);

            if ( (LA49_0==RULE_ID) ) {
                alt49=1;
            }
            else if ( (LA49_0==RULE_INT) ) {
                alt49=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 49, 0, input);

                throw nvae;
            }
            switch (alt49) {
                case 1 :
                    // InternalSpinCAD.g:6361:8: this_ID_1= RULE_ID
                    {
                    this_ID_1=(Token)match(input,RULE_ID,FOLLOW_2); 

                    		current.merge(this_ID_1);
                        
                     
                        newLeafNode(this_ID_1, grammarAccess.getSPINDOUBLEAccess().getIDTerminalRuleCall_1_0()); 
                        

                    }
                    break;
                case 2 :
                    // InternalSpinCAD.g:6369:6: (this_INT_2= RULE_INT (kw= '.' this_INT_4= RULE_INT )? )
                    {
                    // InternalSpinCAD.g:6369:6: (this_INT_2= RULE_INT (kw= '.' this_INT_4= RULE_INT )? )
                    // InternalSpinCAD.g:6369:11: this_INT_2= RULE_INT (kw= '.' this_INT_4= RULE_INT )?
                    {
                    this_INT_2=(Token)match(input,RULE_INT,FOLLOW_21); 

                    		current.merge(this_INT_2);
                        
                     
                        newLeafNode(this_INT_2, grammarAccess.getSPINDOUBLEAccess().getINTTerminalRuleCall_1_1_0()); 
                        
                    // InternalSpinCAD.g:6376:1: (kw= '.' this_INT_4= RULE_INT )?
                    int alt48=2;
                    int LA48_0 = input.LA(1);

                    if ( (LA48_0==86) ) {
                        alt48=1;
                    }
                    switch (alt48) {
                        case 1 :
                            // InternalSpinCAD.g:6377:2: kw= '.' this_INT_4= RULE_INT
                            {
                            kw=(Token)match(input,86,FOLLOW_10); 

                                    current.merge(kw);
                                    newLeafNode(kw, grammarAccess.getSPINDOUBLEAccess().getFullStopKeyword_1_1_1_0()); 
                                
                            this_INT_4=(Token)match(input,RULE_INT,FOLLOW_2); 

                            		current.merge(this_INT_4);
                                
                             
                                newLeafNode(this_INT_4, grammarAccess.getSPINDOUBLEAccess().getINTTerminalRuleCall_1_1_1_1()); 
                                

                            }
                            break;

                    }


                    }


                    }
                    break;

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
    // $ANTLR end "ruleSPINDOUBLE"


    // $ANTLR start "entryRuleSPINREGISTER"
    // InternalSpinCAD.g:6397:1: entryRuleSPINREGISTER returns [String current=null] : iv_ruleSPINREGISTER= ruleSPINREGISTER EOF ;
    public final String entryRuleSPINREGISTER() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleSPINREGISTER = null;


        try {
            // InternalSpinCAD.g:6398:2: (iv_ruleSPINREGISTER= ruleSPINREGISTER EOF )
            // InternalSpinCAD.g:6399:2: iv_ruleSPINREGISTER= ruleSPINREGISTER EOF
            {
             newCompositeNode(grammarAccess.getSPINREGISTERRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSPINREGISTER=ruleSPINREGISTER();

            state._fsp--;

             current =iv_ruleSPINREGISTER.getText(); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleSPINREGISTER"


    // $ANTLR start "ruleSPINREGISTER"
    // InternalSpinCAD.g:6406:1: ruleSPINREGISTER returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '-' )? (this_ID_1= RULE_ID | this_INT_2= RULE_INT ) ) ;
    public final AntlrDatatypeRuleToken ruleSPINREGISTER() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_ID_1=null;
        Token this_INT_2=null;

         enterRule(); 
            
        try {
            // InternalSpinCAD.g:6409:28: ( ( (kw= '-' )? (this_ID_1= RULE_ID | this_INT_2= RULE_INT ) ) )
            // InternalSpinCAD.g:6410:1: ( (kw= '-' )? (this_ID_1= RULE_ID | this_INT_2= RULE_INT ) )
            {
            // InternalSpinCAD.g:6410:1: ( (kw= '-' )? (this_ID_1= RULE_ID | this_INT_2= RULE_INT ) )
            // InternalSpinCAD.g:6410:2: (kw= '-' )? (this_ID_1= RULE_ID | this_INT_2= RULE_INT )
            {
            // InternalSpinCAD.g:6410:2: (kw= '-' )?
            int alt50=2;
            int LA50_0 = input.LA(1);

            if ( (LA50_0==85) ) {
                alt50=1;
            }
            switch (alt50) {
                case 1 :
                    // InternalSpinCAD.g:6411:2: kw= '-'
                    {
                    kw=(Token)match(input,85,FOLLOW_20); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getSPINREGISTERAccess().getHyphenMinusKeyword_0()); 
                        

                    }
                    break;

            }

            // InternalSpinCAD.g:6416:3: (this_ID_1= RULE_ID | this_INT_2= RULE_INT )
            int alt51=2;
            int LA51_0 = input.LA(1);

            if ( (LA51_0==RULE_ID) ) {
                alt51=1;
            }
            else if ( (LA51_0==RULE_INT) ) {
                alt51=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 51, 0, input);

                throw nvae;
            }
            switch (alt51) {
                case 1 :
                    // InternalSpinCAD.g:6416:8: this_ID_1= RULE_ID
                    {
                    this_ID_1=(Token)match(input,RULE_ID,FOLLOW_2); 

                    		current.merge(this_ID_1);
                        
                     
                        newLeafNode(this_ID_1, grammarAccess.getSPINREGISTERAccess().getIDTerminalRuleCall_1_0()); 
                        

                    }
                    break;
                case 2 :
                    // InternalSpinCAD.g:6424:10: this_INT_2= RULE_INT
                    {
                    this_INT_2=(Token)match(input,RULE_INT,FOLLOW_2); 

                    		current.merge(this_INT_2);
                        
                     
                        newLeafNode(this_INT_2, grammarAccess.getSPINREGISTERAccess().getINTTerminalRuleCall_1_1()); 
                        

                    }
                    break;

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
    // $ANTLR end "ruleSPINREGISTER"


    // $ANTLR start "entryRuleSPINCHOREGFLAGS"
    // InternalSpinCAD.g:6439:1: entryRuleSPINCHOREGFLAGS returns [String current=null] : iv_ruleSPINCHOREGFLAGS= ruleSPINCHOREGFLAGS EOF ;
    public final String entryRuleSPINCHOREGFLAGS() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleSPINCHOREGFLAGS = null;


        try {
            // InternalSpinCAD.g:6440:2: (iv_ruleSPINCHOREGFLAGS= ruleSPINCHOREGFLAGS EOF )
            // InternalSpinCAD.g:6441:2: iv_ruleSPINCHOREGFLAGS= ruleSPINCHOREGFLAGS EOF
            {
             newCompositeNode(grammarAccess.getSPINCHOREGFLAGSRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSPINCHOREGFLAGS=ruleSPINCHOREGFLAGS();

            state._fsp--;

             current =iv_ruleSPINCHOREGFLAGS.getText(); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleSPINCHOREGFLAGS"


    // $ANTLR start "ruleSPINCHOREGFLAGS"
    // InternalSpinCAD.g:6448:1: ruleSPINCHOREGFLAGS returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_INT_0= RULE_INT | (this_ID_1= RULE_ID (kw= '|' this_ID_3= RULE_ID )* )? ) ;
    public final AntlrDatatypeRuleToken ruleSPINCHOREGFLAGS() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_INT_0=null;
        Token this_ID_1=null;
        Token kw=null;
        Token this_ID_3=null;

         enterRule(); 
            
        try {
            // InternalSpinCAD.g:6451:28: ( (this_INT_0= RULE_INT | (this_ID_1= RULE_ID (kw= '|' this_ID_3= RULE_ID )* )? ) )
            // InternalSpinCAD.g:6452:1: (this_INT_0= RULE_INT | (this_ID_1= RULE_ID (kw= '|' this_ID_3= RULE_ID )* )? )
            {
            // InternalSpinCAD.g:6452:1: (this_INT_0= RULE_INT | (this_ID_1= RULE_ID (kw= '|' this_ID_3= RULE_ID )* )? )
            int alt54=2;
            int LA54_0 = input.LA(1);

            if ( (LA54_0==RULE_INT) ) {
                alt54=1;
            }
            else if ( (LA54_0==EOF||LA54_0==RULE_ID||LA54_0==56) ) {
                alt54=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 54, 0, input);

                throw nvae;
            }
            switch (alt54) {
                case 1 :
                    // InternalSpinCAD.g:6452:6: this_INT_0= RULE_INT
                    {
                    this_INT_0=(Token)match(input,RULE_INT,FOLLOW_2); 

                    		current.merge(this_INT_0);
                        
                     
                        newLeafNode(this_INT_0, grammarAccess.getSPINCHOREGFLAGSAccess().getINTTerminalRuleCall_0()); 
                        

                    }
                    break;
                case 2 :
                    // InternalSpinCAD.g:6460:6: (this_ID_1= RULE_ID (kw= '|' this_ID_3= RULE_ID )* )?
                    {
                    // InternalSpinCAD.g:6460:6: (this_ID_1= RULE_ID (kw= '|' this_ID_3= RULE_ID )* )?
                    int alt53=2;
                    int LA53_0 = input.LA(1);

                    if ( (LA53_0==RULE_ID) ) {
                        alt53=1;
                    }
                    switch (alt53) {
                        case 1 :
                            // InternalSpinCAD.g:6460:11: this_ID_1= RULE_ID (kw= '|' this_ID_3= RULE_ID )*
                            {
                            this_ID_1=(Token)match(input,RULE_ID,FOLLOW_22); 

                            		current.merge(this_ID_1);
                                
                             
                                newLeafNode(this_ID_1, grammarAccess.getSPINCHOREGFLAGSAccess().getIDTerminalRuleCall_1_0()); 
                                
                            // InternalSpinCAD.g:6467:1: (kw= '|' this_ID_3= RULE_ID )*
                            loop52:
                            do {
                                int alt52=2;
                                int LA52_0 = input.LA(1);

                                if ( (LA52_0==84) ) {
                                    alt52=1;
                                }


                                switch (alt52) {
                            	case 1 :
                            	    // InternalSpinCAD.g:6468:2: kw= '|' this_ID_3= RULE_ID
                            	    {
                            	    kw=(Token)match(input,84,FOLLOW_8); 

                            	            current.merge(kw);
                            	            newLeafNode(kw, grammarAccess.getSPINCHOREGFLAGSAccess().getVerticalLineKeyword_1_1_0()); 
                            	        
                            	    this_ID_3=(Token)match(input,RULE_ID,FOLLOW_22); 

                            	    		current.merge(this_ID_3);
                            	        
                            	     
                            	        newLeafNode(this_ID_3, grammarAccess.getSPINCHOREGFLAGSAccess().getIDTerminalRuleCall_1_1_1()); 
                            	        

                            	    }
                            	    break;

                            	default :
                            	    break loop52;
                                }
                            } while (true);


                            }
                            break;

                    }


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
    // $ANTLR end "ruleSPINCHOREGFLAGS"


    // $ANTLR start "entryRuleSPINMEM"
    // InternalSpinCAD.g:6488:1: entryRuleSPINMEM returns [EObject current=null] : iv_ruleSPINMEM= ruleSPINMEM EOF ;
    public final EObject entryRuleSPINMEM() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSPINMEM = null;


        try {
            // InternalSpinCAD.g:6489:2: (iv_ruleSPINMEM= ruleSPINMEM EOF )
            // InternalSpinCAD.g:6490:2: iv_ruleSPINMEM= ruleSPINMEM EOF
            {
             newCompositeNode(grammarAccess.getSPINMEMRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSPINMEM=ruleSPINMEM();

            state._fsp--;

             current =iv_ruleSPINMEM; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleSPINMEM"


    // $ANTLR start "ruleSPINMEM"
    // InternalSpinCAD.g:6497:1: ruleSPINMEM returns [EObject current=null] : ( ( (lv_buffer_0_0= ruleSPINBUF ) ) ( ( ( (lv_value_1_0= RULE_INT ) ) (otherlv_2= '*' ( (lv_scale_3_0= RULE_ID ) ) )? ) | ( (otherlv_4= RULE_ID ) ) )? ) ;
    public final EObject ruleSPINMEM() throws RecognitionException {
        EObject current = null;

        Token lv_value_1_0=null;
        Token otherlv_2=null;
        Token lv_scale_3_0=null;
        Token otherlv_4=null;
        AntlrDatatypeRuleToken lv_buffer_0_0 = null;


         enterRule(); 
            
        try {
            // InternalSpinCAD.g:6500:28: ( ( ( (lv_buffer_0_0= ruleSPINBUF ) ) ( ( ( (lv_value_1_0= RULE_INT ) ) (otherlv_2= '*' ( (lv_scale_3_0= RULE_ID ) ) )? ) | ( (otherlv_4= RULE_ID ) ) )? ) )
            // InternalSpinCAD.g:6501:1: ( ( (lv_buffer_0_0= ruleSPINBUF ) ) ( ( ( (lv_value_1_0= RULE_INT ) ) (otherlv_2= '*' ( (lv_scale_3_0= RULE_ID ) ) )? ) | ( (otherlv_4= RULE_ID ) ) )? )
            {
            // InternalSpinCAD.g:6501:1: ( ( (lv_buffer_0_0= ruleSPINBUF ) ) ( ( ( (lv_value_1_0= RULE_INT ) ) (otherlv_2= '*' ( (lv_scale_3_0= RULE_ID ) ) )? ) | ( (otherlv_4= RULE_ID ) ) )? )
            // InternalSpinCAD.g:6501:2: ( (lv_buffer_0_0= ruleSPINBUF ) ) ( ( ( (lv_value_1_0= RULE_INT ) ) (otherlv_2= '*' ( (lv_scale_3_0= RULE_ID ) ) )? ) | ( (otherlv_4= RULE_ID ) ) )?
            {
            // InternalSpinCAD.g:6501:2: ( (lv_buffer_0_0= ruleSPINBUF ) )
            // InternalSpinCAD.g:6502:1: (lv_buffer_0_0= ruleSPINBUF )
            {
            // InternalSpinCAD.g:6502:1: (lv_buffer_0_0= ruleSPINBUF )
            // InternalSpinCAD.g:6503:3: lv_buffer_0_0= ruleSPINBUF
            {
             
            	        newCompositeNode(grammarAccess.getSPINMEMAccess().getBufferSPINBUFParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_23);
            lv_buffer_0_0=ruleSPINBUF();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getSPINMEMRule());
            	        }
                   		set(
                   			current, 
                   			"buffer",
                    		lv_buffer_0_0, 
                    		"com.holycityaudio.spincad.SpinCAD.SPINBUF");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // InternalSpinCAD.g:6519:2: ( ( ( (lv_value_1_0= RULE_INT ) ) (otherlv_2= '*' ( (lv_scale_3_0= RULE_ID ) ) )? ) | ( (otherlv_4= RULE_ID ) ) )?
            int alt56=3;
            int LA56_0 = input.LA(1);

            if ( (LA56_0==RULE_INT) ) {
                alt56=1;
            }
            else if ( (LA56_0==RULE_ID) ) {
                int LA56_2 = input.LA(2);

                if ( (LA56_2==EOF||LA56_2==RULE_ID||LA56_2==RULE_SC_COMMENT||(LA56_2>=19 && LA56_2<=31)||(LA56_2>=33 && LA56_2<=83)) ) {
                    alt56=2;
                }
            }
            switch (alt56) {
                case 1 :
                    // InternalSpinCAD.g:6519:3: ( ( (lv_value_1_0= RULE_INT ) ) (otherlv_2= '*' ( (lv_scale_3_0= RULE_ID ) ) )? )
                    {
                    // InternalSpinCAD.g:6519:3: ( ( (lv_value_1_0= RULE_INT ) ) (otherlv_2= '*' ( (lv_scale_3_0= RULE_ID ) ) )? )
                    // InternalSpinCAD.g:6519:4: ( (lv_value_1_0= RULE_INT ) ) (otherlv_2= '*' ( (lv_scale_3_0= RULE_ID ) ) )?
                    {
                    // InternalSpinCAD.g:6519:4: ( (lv_value_1_0= RULE_INT ) )
                    // InternalSpinCAD.g:6520:1: (lv_value_1_0= RULE_INT )
                    {
                    // InternalSpinCAD.g:6520:1: (lv_value_1_0= RULE_INT )
                    // InternalSpinCAD.g:6521:3: lv_value_1_0= RULE_INT
                    {
                    lv_value_1_0=(Token)match(input,RULE_INT,FOLLOW_24); 

                    			newLeafNode(lv_value_1_0, grammarAccess.getSPINMEMAccess().getValueINTTerminalRuleCall_1_0_0_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getSPINMEMRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"value",
                            		lv_value_1_0, 
                            		"org.eclipse.xtext.common.Terminals.INT");
                    	    

                    }


                    }

                    // InternalSpinCAD.g:6537:2: (otherlv_2= '*' ( (lv_scale_3_0= RULE_ID ) ) )?
                    int alt55=2;
                    int LA55_0 = input.LA(1);

                    if ( (LA55_0==87) ) {
                        alt55=1;
                    }
                    switch (alt55) {
                        case 1 :
                            // InternalSpinCAD.g:6537:4: otherlv_2= '*' ( (lv_scale_3_0= RULE_ID ) )
                            {
                            otherlv_2=(Token)match(input,87,FOLLOW_8); 

                                	newLeafNode(otherlv_2, grammarAccess.getSPINMEMAccess().getAsteriskKeyword_1_0_1_0());
                                
                            // InternalSpinCAD.g:6541:1: ( (lv_scale_3_0= RULE_ID ) )
                            // InternalSpinCAD.g:6542:1: (lv_scale_3_0= RULE_ID )
                            {
                            // InternalSpinCAD.g:6542:1: (lv_scale_3_0= RULE_ID )
                            // InternalSpinCAD.g:6543:3: lv_scale_3_0= RULE_ID
                            {
                            lv_scale_3_0=(Token)match(input,RULE_ID,FOLLOW_2); 

                            			newLeafNode(lv_scale_3_0, grammarAccess.getSPINMEMAccess().getScaleIDTerminalRuleCall_1_0_1_1_0()); 
                            		

                            	        if (current==null) {
                            	            current = createModelElement(grammarAccess.getSPINMEMRule());
                            	        }
                                   		setWithLastConsumed(
                                   			current, 
                                   			"scale",
                                    		lv_scale_3_0, 
                                    		"org.eclipse.xtext.common.Terminals.ID");
                            	    

                            }


                            }


                            }
                            break;

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalSpinCAD.g:6560:6: ( (otherlv_4= RULE_ID ) )
                    {
                    // InternalSpinCAD.g:6560:6: ( (otherlv_4= RULE_ID ) )
                    // InternalSpinCAD.g:6561:1: (otherlv_4= RULE_ID )
                    {
                    // InternalSpinCAD.g:6561:1: (otherlv_4= RULE_ID )
                    // InternalSpinCAD.g:6562:3: otherlv_4= RULE_ID
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getSPINMEMRule());
                    	        }
                            
                    otherlv_4=(Token)match(input,RULE_ID,FOLLOW_2); 

                    		newLeafNode(otherlv_4, grammarAccess.getSPINMEMAccess().getOffsetOffsetCrossReference_1_1_0()); 
                    	

                    }


                    }


                    }
                    break;

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
    // $ANTLR end "ruleSPINMEM"


    // $ANTLR start "entryRuleSPINBUF"
    // InternalSpinCAD.g:6581:1: entryRuleSPINBUF returns [String current=null] : iv_ruleSPINBUF= ruleSPINBUF EOF ;
    public final String entryRuleSPINBUF() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleSPINBUF = null;


        try {
            // InternalSpinCAD.g:6582:2: (iv_ruleSPINBUF= ruleSPINBUF EOF )
            // InternalSpinCAD.g:6583:2: iv_ruleSPINBUF= ruleSPINBUF EOF
            {
             newCompositeNode(grammarAccess.getSPINBUFRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSPINBUF=ruleSPINBUF();

            state._fsp--;

             current =iv_ruleSPINBUF.getText(); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleSPINBUF"


    // $ANTLR start "ruleSPINBUF"
    // InternalSpinCAD.g:6590:1: ruleSPINBUF returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (kw= '#' | kw= '^' )? (kw= '+' | kw= '-' )? ) ;
    public final AntlrDatatypeRuleToken ruleSPINBUF() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;

         enterRule(); 
            
        try {
            // InternalSpinCAD.g:6593:28: ( (this_ID_0= RULE_ID (kw= '#' | kw= '^' )? (kw= '+' | kw= '-' )? ) )
            // InternalSpinCAD.g:6594:1: (this_ID_0= RULE_ID (kw= '#' | kw= '^' )? (kw= '+' | kw= '-' )? )
            {
            // InternalSpinCAD.g:6594:1: (this_ID_0= RULE_ID (kw= '#' | kw= '^' )? (kw= '+' | kw= '-' )? )
            // InternalSpinCAD.g:6594:6: this_ID_0= RULE_ID (kw= '#' | kw= '^' )? (kw= '+' | kw= '-' )?
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_25); 

            		current.merge(this_ID_0);
                
             
                newLeafNode(this_ID_0, grammarAccess.getSPINBUFAccess().getIDTerminalRuleCall_0()); 
                
            // InternalSpinCAD.g:6601:1: (kw= '#' | kw= '^' )?
            int alt57=3;
            int LA57_0 = input.LA(1);

            if ( (LA57_0==88) ) {
                alt57=1;
            }
            else if ( (LA57_0==89) ) {
                alt57=2;
            }
            switch (alt57) {
                case 1 :
                    // InternalSpinCAD.g:6602:2: kw= '#'
                    {
                    kw=(Token)match(input,88,FOLLOW_26); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getSPINBUFAccess().getNumberSignKeyword_1_0()); 
                        

                    }
                    break;
                case 2 :
                    // InternalSpinCAD.g:6609:2: kw= '^'
                    {
                    kw=(Token)match(input,89,FOLLOW_26); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getSPINBUFAccess().getCircumflexAccentKeyword_1_1()); 
                        

                    }
                    break;

            }

            // InternalSpinCAD.g:6614:3: (kw= '+' | kw= '-' )?
            int alt58=3;
            int LA58_0 = input.LA(1);

            if ( (LA58_0==90) ) {
                alt58=1;
            }
            else if ( (LA58_0==85) ) {
                alt58=2;
            }
            switch (alt58) {
                case 1 :
                    // InternalSpinCAD.g:6615:2: kw= '+'
                    {
                    kw=(Token)match(input,90,FOLLOW_2); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getSPINBUFAccess().getPlusSignKeyword_2_0()); 
                        

                    }
                    break;
                case 2 :
                    // InternalSpinCAD.g:6622:2: kw= '-'
                    {
                    kw=(Token)match(input,85,FOLLOW_2); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getSPINBUFAccess().getHyphenMinusKeyword_2_1()); 
                        

                    }
                    break;

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
    // $ANTLR end "ruleSPINBUF"


    // $ANTLR start "entryRuleBINARY24"
    // InternalSpinCAD.g:6635:1: entryRuleBINARY24 returns [String current=null] : iv_ruleBINARY24= ruleBINARY24 EOF ;
    public final String entryRuleBINARY24() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleBINARY24 = null;


        try {
            // InternalSpinCAD.g:6636:2: (iv_ruleBINARY24= ruleBINARY24 EOF )
            // InternalSpinCAD.g:6637:2: iv_ruleBINARY24= ruleBINARY24 EOF
            {
             newCompositeNode(grammarAccess.getBINARY24Rule()); 
            pushFollow(FOLLOW_1);
            iv_ruleBINARY24=ruleBINARY24();

            state._fsp--;

             current =iv_ruleBINARY24.getText(); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleBINARY24"


    // $ANTLR start "ruleBINARY24"
    // InternalSpinCAD.g:6644:1: ruleBINARY24 returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( ( (kw= '%' this_INT_1= RULE_INT ) (this_ID_2= RULE_ID )* ) | (kw= '$' (this_INT_4= RULE_INT )* (this_ID_5= RULE_ID )* ) ) ;
    public final AntlrDatatypeRuleToken ruleBINARY24() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_1=null;
        Token this_ID_2=null;
        Token this_INT_4=null;
        Token this_ID_5=null;

         enterRule(); 
            
        try {
            // InternalSpinCAD.g:6647:28: ( ( ( (kw= '%' this_INT_1= RULE_INT ) (this_ID_2= RULE_ID )* ) | (kw= '$' (this_INT_4= RULE_INT )* (this_ID_5= RULE_ID )* ) ) )
            // InternalSpinCAD.g:6648:1: ( ( (kw= '%' this_INT_1= RULE_INT ) (this_ID_2= RULE_ID )* ) | (kw= '$' (this_INT_4= RULE_INT )* (this_ID_5= RULE_ID )* ) )
            {
            // InternalSpinCAD.g:6648:1: ( ( (kw= '%' this_INT_1= RULE_INT ) (this_ID_2= RULE_ID )* ) | (kw= '$' (this_INT_4= RULE_INT )* (this_ID_5= RULE_ID )* ) )
            int alt62=2;
            int LA62_0 = input.LA(1);

            if ( (LA62_0==91) ) {
                alt62=1;
            }
            else if ( (LA62_0==92) ) {
                alt62=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 62, 0, input);

                throw nvae;
            }
            switch (alt62) {
                case 1 :
                    // InternalSpinCAD.g:6648:2: ( (kw= '%' this_INT_1= RULE_INT ) (this_ID_2= RULE_ID )* )
                    {
                    // InternalSpinCAD.g:6648:2: ( (kw= '%' this_INT_1= RULE_INT ) (this_ID_2= RULE_ID )* )
                    // InternalSpinCAD.g:6648:3: (kw= '%' this_INT_1= RULE_INT ) (this_ID_2= RULE_ID )*
                    {
                    // InternalSpinCAD.g:6648:3: (kw= '%' this_INT_1= RULE_INT )
                    // InternalSpinCAD.g:6649:2: kw= '%' this_INT_1= RULE_INT
                    {
                    kw=(Token)match(input,91,FOLLOW_10); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getBINARY24Access().getPercentSignKeyword_0_0_0()); 
                        
                    this_INT_1=(Token)match(input,RULE_INT,FOLLOW_13); 

                    		current.merge(this_INT_1);
                        
                     
                        newLeafNode(this_INT_1, grammarAccess.getBINARY24Access().getINTTerminalRuleCall_0_0_1()); 
                        

                    }

                    // InternalSpinCAD.g:6661:2: (this_ID_2= RULE_ID )*
                    loop59:
                    do {
                        int alt59=2;
                        int LA59_0 = input.LA(1);

                        if ( (LA59_0==RULE_ID) ) {
                            int LA59_2 = input.LA(2);

                            if ( (LA59_2==EOF||LA59_2==RULE_ID||LA59_2==RULE_SC_COMMENT||(LA59_2>=19 && LA59_2<=31)||(LA59_2>=33 && LA59_2<=55)||(LA59_2>=57 && LA59_2<=83)) ) {
                                alt59=1;
                            }


                        }


                        switch (alt59) {
                    	case 1 :
                    	    // InternalSpinCAD.g:6661:7: this_ID_2= RULE_ID
                    	    {
                    	    this_ID_2=(Token)match(input,RULE_ID,FOLLOW_13); 

                    	    		current.merge(this_ID_2);
                    	        
                    	     
                    	        newLeafNode(this_ID_2, grammarAccess.getBINARY24Access().getIDTerminalRuleCall_0_1()); 
                    	        

                    	    }
                    	    break;

                    	default :
                    	    break loop59;
                        }
                    } while (true);


                    }


                    }
                    break;
                case 2 :
                    // InternalSpinCAD.g:6669:6: (kw= '$' (this_INT_4= RULE_INT )* (this_ID_5= RULE_ID )* )
                    {
                    // InternalSpinCAD.g:6669:6: (kw= '$' (this_INT_4= RULE_INT )* (this_ID_5= RULE_ID )* )
                    // InternalSpinCAD.g:6670:2: kw= '$' (this_INT_4= RULE_INT )* (this_ID_5= RULE_ID )*
                    {
                    kw=(Token)match(input,92,FOLLOW_23); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getBINARY24Access().getDollarSignKeyword_1_0()); 
                        
                    // InternalSpinCAD.g:6675:1: (this_INT_4= RULE_INT )*
                    loop60:
                    do {
                        int alt60=2;
                        int LA60_0 = input.LA(1);

                        if ( (LA60_0==RULE_INT) ) {
                            alt60=1;
                        }


                        switch (alt60) {
                    	case 1 :
                    	    // InternalSpinCAD.g:6675:6: this_INT_4= RULE_INT
                    	    {
                    	    this_INT_4=(Token)match(input,RULE_INT,FOLLOW_23); 

                    	    		current.merge(this_INT_4);
                    	        
                    	     
                    	        newLeafNode(this_INT_4, grammarAccess.getBINARY24Access().getINTTerminalRuleCall_1_1()); 
                    	        

                    	    }
                    	    break;

                    	default :
                    	    break loop60;
                        }
                    } while (true);

                    // InternalSpinCAD.g:6682:3: (this_ID_5= RULE_ID )*
                    loop61:
                    do {
                        int alt61=2;
                        int LA61_0 = input.LA(1);

                        if ( (LA61_0==RULE_ID) ) {
                            int LA61_2 = input.LA(2);

                            if ( (LA61_2==EOF||LA61_2==RULE_ID||LA61_2==RULE_SC_COMMENT||(LA61_2>=19 && LA61_2<=31)||(LA61_2>=33 && LA61_2<=55)||(LA61_2>=57 && LA61_2<=83)) ) {
                                alt61=1;
                            }


                        }


                        switch (alt61) {
                    	case 1 :
                    	    // InternalSpinCAD.g:6682:8: this_ID_5= RULE_ID
                    	    {
                    	    this_ID_5=(Token)match(input,RULE_ID,FOLLOW_13); 

                    	    		current.merge(this_ID_5);
                    	        
                    	     
                    	        newLeafNode(this_ID_5, grammarAccess.getBINARY24Access().getIDTerminalRuleCall_1_2()); 
                    	        

                    	    }
                    	    break;

                    	default :
                    	    break loop61;
                        }
                    } while (true);


                    }


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
    // $ANTLR end "ruleBINARY24"


    // $ANTLR start "entryRuleBOOLEAN"
    // InternalSpinCAD.g:6697:1: entryRuleBOOLEAN returns [String current=null] : iv_ruleBOOLEAN= ruleBOOLEAN EOF ;
    public final String entryRuleBOOLEAN() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleBOOLEAN = null;


        try {
            // InternalSpinCAD.g:6698:2: (iv_ruleBOOLEAN= ruleBOOLEAN EOF )
            // InternalSpinCAD.g:6699:2: iv_ruleBOOLEAN= ruleBOOLEAN EOF
            {
             newCompositeNode(grammarAccess.getBOOLEANRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleBOOLEAN=ruleBOOLEAN();

            state._fsp--;

             current =iv_ruleBOOLEAN.getText(); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleBOOLEAN"


    // $ANTLR start "ruleBOOLEAN"
    // InternalSpinCAD.g:6706:1: ruleBOOLEAN returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'true' | kw= 'false' ) ;
    public final AntlrDatatypeRuleToken ruleBOOLEAN() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // InternalSpinCAD.g:6709:28: ( (kw= 'true' | kw= 'false' ) )
            // InternalSpinCAD.g:6710:1: (kw= 'true' | kw= 'false' )
            {
            // InternalSpinCAD.g:6710:1: (kw= 'true' | kw= 'false' )
            int alt63=2;
            int LA63_0 = input.LA(1);

            if ( (LA63_0==93) ) {
                alt63=1;
            }
            else if ( (LA63_0==94) ) {
                alt63=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 63, 0, input);

                throw nvae;
            }
            switch (alt63) {
                case 1 :
                    // InternalSpinCAD.g:6711:2: kw= 'true'
                    {
                    kw=(Token)match(input,93,FOLLOW_2); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getBOOLEANAccess().getTrueKeyword_0()); 
                        

                    }
                    break;
                case 2 :
                    // InternalSpinCAD.g:6718:2: kw= 'false'
                    {
                    kw=(Token)match(input,94,FOLLOW_2); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getBOOLEANAccess().getFalseKeyword_1()); 
                        

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
    // $ANTLR end "ruleBOOLEAN"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x000000000007C000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0xFEFFFFFEFFFFC090L,0x00000000000FFFFFL});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0xFEFFFFFEFFF80092L,0x00000000000FFFFFL});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000000050L,0x0000000000200000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000000000L,0x0000000060000000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000000052L,0x0000000000200000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0100000000000050L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000000000L,0x0000000018000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0100000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000000000050L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000000000002L,0x0000000000400000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000000000002L,0x0000000000100000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000000000052L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000000000002L,0x0000000000800000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000000000002L,0x0000000007200000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000000000002L,0x0000000004200000L});

}