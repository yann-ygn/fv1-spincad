package com.holycityaudio.spincadmenu.ui.contentassist.antlr.internal; 

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
import com.holycityaudio.spincadmenu.services.SpinCADMenuGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalSpinCADMenuParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'@menu'", "'@menuitem'", "'@testItem'"
    };
    public static final int RULE_ID=5;
    public static final int RULE_WS=9;
    public static final int RULE_STRING=4;
    public static final int RULE_ANY_OTHER=10;
    public static final int RULE_SL_COMMENT=8;
    public static final int RULE_INT=6;
    public static final int T__11=11;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int EOF=-1;

    // delegates
    // delegators


        public InternalSpinCADMenuParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalSpinCADMenuParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalSpinCADMenuParser.tokenNames; }
    public String getGrammarFileName() { return "InternalSpinCADMenu.g"; }


     
     	private SpinCADMenuGrammarAccess grammarAccess;
     	
        public void setGrammarAccess(SpinCADMenuGrammarAccess grammarAccess) {
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




    // $ANTLR start "entryRuleMenu"
    // InternalSpinCADMenu.g:60:1: entryRuleMenu : ruleMenu EOF ;
    public final void entryRuleMenu() throws RecognitionException {
        try {
            // InternalSpinCADMenu.g:61:1: ( ruleMenu EOF )
            // InternalSpinCADMenu.g:62:1: ruleMenu EOF
            {
             before(grammarAccess.getMenuRule()); 
            pushFollow(FOLLOW_1);
            ruleMenu();

            state._fsp--;

             after(grammarAccess.getMenuRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleMenu"


    // $ANTLR start "ruleMenu"
    // InternalSpinCADMenu.g:69:1: ruleMenu : ( ( rule__Menu__ElementsAssignment )* ) ;
    public final void ruleMenu() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSpinCADMenu.g:73:2: ( ( ( rule__Menu__ElementsAssignment )* ) )
            // InternalSpinCADMenu.g:74:1: ( ( rule__Menu__ElementsAssignment )* )
            {
            // InternalSpinCADMenu.g:74:1: ( ( rule__Menu__ElementsAssignment )* )
            // InternalSpinCADMenu.g:75:1: ( rule__Menu__ElementsAssignment )*
            {
             before(grammarAccess.getMenuAccess().getElementsAssignment()); 
            // InternalSpinCADMenu.g:76:1: ( rule__Menu__ElementsAssignment )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>=11 && LA1_0<=13)) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalSpinCADMenu.g:76:2: rule__Menu__ElementsAssignment
            	    {
            	    pushFollow(FOLLOW_3);
            	    rule__Menu__ElementsAssignment();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

             after(grammarAccess.getMenuAccess().getElementsAssignment()); 

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
    // $ANTLR end "ruleMenu"


    // $ANTLR start "entryRuleElement"
    // InternalSpinCADMenu.g:88:1: entryRuleElement : ruleElement EOF ;
    public final void entryRuleElement() throws RecognitionException {
        try {
            // InternalSpinCADMenu.g:89:1: ( ruleElement EOF )
            // InternalSpinCADMenu.g:90:1: ruleElement EOF
            {
             before(grammarAccess.getElementRule()); 
            pushFollow(FOLLOW_1);
            ruleElement();

            state._fsp--;

             after(grammarAccess.getElementRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleElement"


    // $ANTLR start "ruleElement"
    // InternalSpinCADMenu.g:97:1: ruleElement : ( ( rule__Element__Alternatives ) ) ;
    public final void ruleElement() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSpinCADMenu.g:101:2: ( ( ( rule__Element__Alternatives ) ) )
            // InternalSpinCADMenu.g:102:1: ( ( rule__Element__Alternatives ) )
            {
            // InternalSpinCADMenu.g:102:1: ( ( rule__Element__Alternatives ) )
            // InternalSpinCADMenu.g:103:1: ( rule__Element__Alternatives )
            {
             before(grammarAccess.getElementAccess().getAlternatives()); 
            // InternalSpinCADMenu.g:104:1: ( rule__Element__Alternatives )
            // InternalSpinCADMenu.g:104:2: rule__Element__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Element__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getElementAccess().getAlternatives()); 

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
    // $ANTLR end "ruleElement"


    // $ANTLR start "entryRuleMENU_HEADER"
    // InternalSpinCADMenu.g:116:1: entryRuleMENU_HEADER : ruleMENU_HEADER EOF ;
    public final void entryRuleMENU_HEADER() throws RecognitionException {
        try {
            // InternalSpinCADMenu.g:117:1: ( ruleMENU_HEADER EOF )
            // InternalSpinCADMenu.g:118:1: ruleMENU_HEADER EOF
            {
             before(grammarAccess.getMENU_HEADERRule()); 
            pushFollow(FOLLOW_1);
            ruleMENU_HEADER();

            state._fsp--;

             after(grammarAccess.getMENU_HEADERRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleMENU_HEADER"


    // $ANTLR start "ruleMENU_HEADER"
    // InternalSpinCADMenu.g:125:1: ruleMENU_HEADER : ( ( rule__MENU_HEADER__Group__0 ) ) ;
    public final void ruleMENU_HEADER() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSpinCADMenu.g:129:2: ( ( ( rule__MENU_HEADER__Group__0 ) ) )
            // InternalSpinCADMenu.g:130:1: ( ( rule__MENU_HEADER__Group__0 ) )
            {
            // InternalSpinCADMenu.g:130:1: ( ( rule__MENU_HEADER__Group__0 ) )
            // InternalSpinCADMenu.g:131:1: ( rule__MENU_HEADER__Group__0 )
            {
             before(grammarAccess.getMENU_HEADERAccess().getGroup()); 
            // InternalSpinCADMenu.g:132:1: ( rule__MENU_HEADER__Group__0 )
            // InternalSpinCADMenu.g:132:2: rule__MENU_HEADER__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__MENU_HEADER__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getMENU_HEADERAccess().getGroup()); 

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
    // $ANTLR end "ruleMENU_HEADER"


    // $ANTLR start "entryRuleMENU_ITEM"
    // InternalSpinCADMenu.g:144:1: entryRuleMENU_ITEM : ruleMENU_ITEM EOF ;
    public final void entryRuleMENU_ITEM() throws RecognitionException {
        try {
            // InternalSpinCADMenu.g:145:1: ( ruleMENU_ITEM EOF )
            // InternalSpinCADMenu.g:146:1: ruleMENU_ITEM EOF
            {
             before(grammarAccess.getMENU_ITEMRule()); 
            pushFollow(FOLLOW_1);
            ruleMENU_ITEM();

            state._fsp--;

             after(grammarAccess.getMENU_ITEMRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleMENU_ITEM"


    // $ANTLR start "ruleMENU_ITEM"
    // InternalSpinCADMenu.g:153:1: ruleMENU_ITEM : ( ( rule__MENU_ITEM__Group__0 ) ) ;
    public final void ruleMENU_ITEM() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSpinCADMenu.g:157:2: ( ( ( rule__MENU_ITEM__Group__0 ) ) )
            // InternalSpinCADMenu.g:158:1: ( ( rule__MENU_ITEM__Group__0 ) )
            {
            // InternalSpinCADMenu.g:158:1: ( ( rule__MENU_ITEM__Group__0 ) )
            // InternalSpinCADMenu.g:159:1: ( rule__MENU_ITEM__Group__0 )
            {
             before(grammarAccess.getMENU_ITEMAccess().getGroup()); 
            // InternalSpinCADMenu.g:160:1: ( rule__MENU_ITEM__Group__0 )
            // InternalSpinCADMenu.g:160:2: rule__MENU_ITEM__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__MENU_ITEM__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getMENU_ITEMAccess().getGroup()); 

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
    // $ANTLR end "ruleMENU_ITEM"


    // $ANTLR start "entryRuleTEST_ITEM"
    // InternalSpinCADMenu.g:172:1: entryRuleTEST_ITEM : ruleTEST_ITEM EOF ;
    public final void entryRuleTEST_ITEM() throws RecognitionException {
        try {
            // InternalSpinCADMenu.g:173:1: ( ruleTEST_ITEM EOF )
            // InternalSpinCADMenu.g:174:1: ruleTEST_ITEM EOF
            {
             before(grammarAccess.getTEST_ITEMRule()); 
            pushFollow(FOLLOW_1);
            ruleTEST_ITEM();

            state._fsp--;

             after(grammarAccess.getTEST_ITEMRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleTEST_ITEM"


    // $ANTLR start "ruleTEST_ITEM"
    // InternalSpinCADMenu.g:181:1: ruleTEST_ITEM : ( ( rule__TEST_ITEM__Group__0 ) ) ;
    public final void ruleTEST_ITEM() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSpinCADMenu.g:185:2: ( ( ( rule__TEST_ITEM__Group__0 ) ) )
            // InternalSpinCADMenu.g:186:1: ( ( rule__TEST_ITEM__Group__0 ) )
            {
            // InternalSpinCADMenu.g:186:1: ( ( rule__TEST_ITEM__Group__0 ) )
            // InternalSpinCADMenu.g:187:1: ( rule__TEST_ITEM__Group__0 )
            {
             before(grammarAccess.getTEST_ITEMAccess().getGroup()); 
            // InternalSpinCADMenu.g:188:1: ( rule__TEST_ITEM__Group__0 )
            // InternalSpinCADMenu.g:188:2: rule__TEST_ITEM__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__TEST_ITEM__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getTEST_ITEMAccess().getGroup()); 

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
    // $ANTLR end "ruleTEST_ITEM"


    // $ANTLR start "rule__Element__Alternatives"
    // InternalSpinCADMenu.g:200:1: rule__Element__Alternatives : ( ( ruleMENU_HEADER ) | ( ruleMENU_ITEM ) | ( ruleTEST_ITEM ) );
    public final void rule__Element__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSpinCADMenu.g:204:1: ( ( ruleMENU_HEADER ) | ( ruleMENU_ITEM ) | ( ruleTEST_ITEM ) )
            int alt2=3;
            switch ( input.LA(1) ) {
            case 11:
                {
                alt2=1;
                }
                break;
            case 12:
                {
                alt2=2;
                }
                break;
            case 13:
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
                    // InternalSpinCADMenu.g:205:1: ( ruleMENU_HEADER )
                    {
                    // InternalSpinCADMenu.g:205:1: ( ruleMENU_HEADER )
                    // InternalSpinCADMenu.g:206:1: ruleMENU_HEADER
                    {
                     before(grammarAccess.getElementAccess().getMENU_HEADERParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleMENU_HEADER();

                    state._fsp--;

                     after(grammarAccess.getElementAccess().getMENU_HEADERParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalSpinCADMenu.g:211:6: ( ruleMENU_ITEM )
                    {
                    // InternalSpinCADMenu.g:211:6: ( ruleMENU_ITEM )
                    // InternalSpinCADMenu.g:212:1: ruleMENU_ITEM
                    {
                     before(grammarAccess.getElementAccess().getMENU_ITEMParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleMENU_ITEM();

                    state._fsp--;

                     after(grammarAccess.getElementAccess().getMENU_ITEMParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalSpinCADMenu.g:217:6: ( ruleTEST_ITEM )
                    {
                    // InternalSpinCADMenu.g:217:6: ( ruleTEST_ITEM )
                    // InternalSpinCADMenu.g:218:1: ruleTEST_ITEM
                    {
                     before(grammarAccess.getElementAccess().getTEST_ITEMParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleTEST_ITEM();

                    state._fsp--;

                     after(grammarAccess.getElementAccess().getTEST_ITEMParserRuleCall_2()); 

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
    // $ANTLR end "rule__Element__Alternatives"


    // $ANTLR start "rule__MENU_HEADER__Group__0"
    // InternalSpinCADMenu.g:230:1: rule__MENU_HEADER__Group__0 : rule__MENU_HEADER__Group__0__Impl rule__MENU_HEADER__Group__1 ;
    public final void rule__MENU_HEADER__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSpinCADMenu.g:234:1: ( rule__MENU_HEADER__Group__0__Impl rule__MENU_HEADER__Group__1 )
            // InternalSpinCADMenu.g:235:2: rule__MENU_HEADER__Group__0__Impl rule__MENU_HEADER__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__MENU_HEADER__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MENU_HEADER__Group__1();

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
    // $ANTLR end "rule__MENU_HEADER__Group__0"


    // $ANTLR start "rule__MENU_HEADER__Group__0__Impl"
    // InternalSpinCADMenu.g:242:1: rule__MENU_HEADER__Group__0__Impl : ( '@menu' ) ;
    public final void rule__MENU_HEADER__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSpinCADMenu.g:246:1: ( ( '@menu' ) )
            // InternalSpinCADMenu.g:247:1: ( '@menu' )
            {
            // InternalSpinCADMenu.g:247:1: ( '@menu' )
            // InternalSpinCADMenu.g:248:1: '@menu'
            {
             before(grammarAccess.getMENU_HEADERAccess().getMenuKeyword_0()); 
            match(input,11,FOLLOW_2); 
             after(grammarAccess.getMENU_HEADERAccess().getMenuKeyword_0()); 

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
    // $ANTLR end "rule__MENU_HEADER__Group__0__Impl"


    // $ANTLR start "rule__MENU_HEADER__Group__1"
    // InternalSpinCADMenu.g:261:1: rule__MENU_HEADER__Group__1 : rule__MENU_HEADER__Group__1__Impl ;
    public final void rule__MENU_HEADER__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSpinCADMenu.g:265:1: ( rule__MENU_HEADER__Group__1__Impl )
            // InternalSpinCADMenu.g:266:2: rule__MENU_HEADER__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MENU_HEADER__Group__1__Impl();

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
    // $ANTLR end "rule__MENU_HEADER__Group__1"


    // $ANTLR start "rule__MENU_HEADER__Group__1__Impl"
    // InternalSpinCADMenu.g:272:1: rule__MENU_HEADER__Group__1__Impl : ( ( rule__MENU_HEADER__NameAssignment_1 ) ) ;
    public final void rule__MENU_HEADER__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSpinCADMenu.g:276:1: ( ( ( rule__MENU_HEADER__NameAssignment_1 ) ) )
            // InternalSpinCADMenu.g:277:1: ( ( rule__MENU_HEADER__NameAssignment_1 ) )
            {
            // InternalSpinCADMenu.g:277:1: ( ( rule__MENU_HEADER__NameAssignment_1 ) )
            // InternalSpinCADMenu.g:278:1: ( rule__MENU_HEADER__NameAssignment_1 )
            {
             before(grammarAccess.getMENU_HEADERAccess().getNameAssignment_1()); 
            // InternalSpinCADMenu.g:279:1: ( rule__MENU_HEADER__NameAssignment_1 )
            // InternalSpinCADMenu.g:279:2: rule__MENU_HEADER__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__MENU_HEADER__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getMENU_HEADERAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__MENU_HEADER__Group__1__Impl"


    // $ANTLR start "rule__MENU_ITEM__Group__0"
    // InternalSpinCADMenu.g:293:1: rule__MENU_ITEM__Group__0 : rule__MENU_ITEM__Group__0__Impl rule__MENU_ITEM__Group__1 ;
    public final void rule__MENU_ITEM__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSpinCADMenu.g:297:1: ( rule__MENU_ITEM__Group__0__Impl rule__MENU_ITEM__Group__1 )
            // InternalSpinCADMenu.g:298:2: rule__MENU_ITEM__Group__0__Impl rule__MENU_ITEM__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__MENU_ITEM__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MENU_ITEM__Group__1();

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
    // $ANTLR end "rule__MENU_ITEM__Group__0"


    // $ANTLR start "rule__MENU_ITEM__Group__0__Impl"
    // InternalSpinCADMenu.g:305:1: rule__MENU_ITEM__Group__0__Impl : ( '@menuitem' ) ;
    public final void rule__MENU_ITEM__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSpinCADMenu.g:309:1: ( ( '@menuitem' ) )
            // InternalSpinCADMenu.g:310:1: ( '@menuitem' )
            {
            // InternalSpinCADMenu.g:310:1: ( '@menuitem' )
            // InternalSpinCADMenu.g:311:1: '@menuitem'
            {
             before(grammarAccess.getMENU_ITEMAccess().getMenuitemKeyword_0()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getMENU_ITEMAccess().getMenuitemKeyword_0()); 

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
    // $ANTLR end "rule__MENU_ITEM__Group__0__Impl"


    // $ANTLR start "rule__MENU_ITEM__Group__1"
    // InternalSpinCADMenu.g:324:1: rule__MENU_ITEM__Group__1 : rule__MENU_ITEM__Group__1__Impl rule__MENU_ITEM__Group__2 ;
    public final void rule__MENU_ITEM__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSpinCADMenu.g:328:1: ( rule__MENU_ITEM__Group__1__Impl rule__MENU_ITEM__Group__2 )
            // InternalSpinCADMenu.g:329:2: rule__MENU_ITEM__Group__1__Impl rule__MENU_ITEM__Group__2
            {
            pushFollow(FOLLOW_5);
            rule__MENU_ITEM__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MENU_ITEM__Group__2();

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
    // $ANTLR end "rule__MENU_ITEM__Group__1"


    // $ANTLR start "rule__MENU_ITEM__Group__1__Impl"
    // InternalSpinCADMenu.g:336:1: rule__MENU_ITEM__Group__1__Impl : ( ( rule__MENU_ITEM__NameAssignment_1 ) ) ;
    public final void rule__MENU_ITEM__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSpinCADMenu.g:340:1: ( ( ( rule__MENU_ITEM__NameAssignment_1 ) ) )
            // InternalSpinCADMenu.g:341:1: ( ( rule__MENU_ITEM__NameAssignment_1 ) )
            {
            // InternalSpinCADMenu.g:341:1: ( ( rule__MENU_ITEM__NameAssignment_1 ) )
            // InternalSpinCADMenu.g:342:1: ( rule__MENU_ITEM__NameAssignment_1 )
            {
             before(grammarAccess.getMENU_ITEMAccess().getNameAssignment_1()); 
            // InternalSpinCADMenu.g:343:1: ( rule__MENU_ITEM__NameAssignment_1 )
            // InternalSpinCADMenu.g:343:2: rule__MENU_ITEM__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__MENU_ITEM__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getMENU_ITEMAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__MENU_ITEM__Group__1__Impl"


    // $ANTLR start "rule__MENU_ITEM__Group__2"
    // InternalSpinCADMenu.g:353:1: rule__MENU_ITEM__Group__2 : rule__MENU_ITEM__Group__2__Impl ;
    public final void rule__MENU_ITEM__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSpinCADMenu.g:357:1: ( rule__MENU_ITEM__Group__2__Impl )
            // InternalSpinCADMenu.g:358:2: rule__MENU_ITEM__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MENU_ITEM__Group__2__Impl();

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
    // $ANTLR end "rule__MENU_ITEM__Group__2"


    // $ANTLR start "rule__MENU_ITEM__Group__2__Impl"
    // InternalSpinCADMenu.g:364:1: rule__MENU_ITEM__Group__2__Impl : ( ( rule__MENU_ITEM__ClassNameAssignment_2 ) ) ;
    public final void rule__MENU_ITEM__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSpinCADMenu.g:368:1: ( ( ( rule__MENU_ITEM__ClassNameAssignment_2 ) ) )
            // InternalSpinCADMenu.g:369:1: ( ( rule__MENU_ITEM__ClassNameAssignment_2 ) )
            {
            // InternalSpinCADMenu.g:369:1: ( ( rule__MENU_ITEM__ClassNameAssignment_2 ) )
            // InternalSpinCADMenu.g:370:1: ( rule__MENU_ITEM__ClassNameAssignment_2 )
            {
             before(grammarAccess.getMENU_ITEMAccess().getClassNameAssignment_2()); 
            // InternalSpinCADMenu.g:371:1: ( rule__MENU_ITEM__ClassNameAssignment_2 )
            // InternalSpinCADMenu.g:371:2: rule__MENU_ITEM__ClassNameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__MENU_ITEM__ClassNameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getMENU_ITEMAccess().getClassNameAssignment_2()); 

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
    // $ANTLR end "rule__MENU_ITEM__Group__2__Impl"


    // $ANTLR start "rule__TEST_ITEM__Group__0"
    // InternalSpinCADMenu.g:387:1: rule__TEST_ITEM__Group__0 : rule__TEST_ITEM__Group__0__Impl rule__TEST_ITEM__Group__1 ;
    public final void rule__TEST_ITEM__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSpinCADMenu.g:391:1: ( rule__TEST_ITEM__Group__0__Impl rule__TEST_ITEM__Group__1 )
            // InternalSpinCADMenu.g:392:2: rule__TEST_ITEM__Group__0__Impl rule__TEST_ITEM__Group__1
            {
            pushFollow(FOLLOW_5);
            rule__TEST_ITEM__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TEST_ITEM__Group__1();

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
    // $ANTLR end "rule__TEST_ITEM__Group__0"


    // $ANTLR start "rule__TEST_ITEM__Group__0__Impl"
    // InternalSpinCADMenu.g:399:1: rule__TEST_ITEM__Group__0__Impl : ( '@testItem' ) ;
    public final void rule__TEST_ITEM__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSpinCADMenu.g:403:1: ( ( '@testItem' ) )
            // InternalSpinCADMenu.g:404:1: ( '@testItem' )
            {
            // InternalSpinCADMenu.g:404:1: ( '@testItem' )
            // InternalSpinCADMenu.g:405:1: '@testItem'
            {
             before(grammarAccess.getTEST_ITEMAccess().getTestItemKeyword_0()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getTEST_ITEMAccess().getTestItemKeyword_0()); 

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
    // $ANTLR end "rule__TEST_ITEM__Group__0__Impl"


    // $ANTLR start "rule__TEST_ITEM__Group__1"
    // InternalSpinCADMenu.g:418:1: rule__TEST_ITEM__Group__1 : rule__TEST_ITEM__Group__1__Impl ;
    public final void rule__TEST_ITEM__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSpinCADMenu.g:422:1: ( rule__TEST_ITEM__Group__1__Impl )
            // InternalSpinCADMenu.g:423:2: rule__TEST_ITEM__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__TEST_ITEM__Group__1__Impl();

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
    // $ANTLR end "rule__TEST_ITEM__Group__1"


    // $ANTLR start "rule__TEST_ITEM__Group__1__Impl"
    // InternalSpinCADMenu.g:429:1: rule__TEST_ITEM__Group__1__Impl : ( ( rule__TEST_ITEM__ClassNameAssignment_1 ) ) ;
    public final void rule__TEST_ITEM__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSpinCADMenu.g:433:1: ( ( ( rule__TEST_ITEM__ClassNameAssignment_1 ) ) )
            // InternalSpinCADMenu.g:434:1: ( ( rule__TEST_ITEM__ClassNameAssignment_1 ) )
            {
            // InternalSpinCADMenu.g:434:1: ( ( rule__TEST_ITEM__ClassNameAssignment_1 ) )
            // InternalSpinCADMenu.g:435:1: ( rule__TEST_ITEM__ClassNameAssignment_1 )
            {
             before(grammarAccess.getTEST_ITEMAccess().getClassNameAssignment_1()); 
            // InternalSpinCADMenu.g:436:1: ( rule__TEST_ITEM__ClassNameAssignment_1 )
            // InternalSpinCADMenu.g:436:2: rule__TEST_ITEM__ClassNameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__TEST_ITEM__ClassNameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getTEST_ITEMAccess().getClassNameAssignment_1()); 

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
    // $ANTLR end "rule__TEST_ITEM__Group__1__Impl"


    // $ANTLR start "rule__Menu__ElementsAssignment"
    // InternalSpinCADMenu.g:451:1: rule__Menu__ElementsAssignment : ( ruleElement ) ;
    public final void rule__Menu__ElementsAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSpinCADMenu.g:455:1: ( ( ruleElement ) )
            // InternalSpinCADMenu.g:456:1: ( ruleElement )
            {
            // InternalSpinCADMenu.g:456:1: ( ruleElement )
            // InternalSpinCADMenu.g:457:1: ruleElement
            {
             before(grammarAccess.getMenuAccess().getElementsElementParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleElement();

            state._fsp--;

             after(grammarAccess.getMenuAccess().getElementsElementParserRuleCall_0()); 

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
    // $ANTLR end "rule__Menu__ElementsAssignment"


    // $ANTLR start "rule__MENU_HEADER__NameAssignment_1"
    // InternalSpinCADMenu.g:466:1: rule__MENU_HEADER__NameAssignment_1 : ( RULE_STRING ) ;
    public final void rule__MENU_HEADER__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSpinCADMenu.g:470:1: ( ( RULE_STRING ) )
            // InternalSpinCADMenu.g:471:1: ( RULE_STRING )
            {
            // InternalSpinCADMenu.g:471:1: ( RULE_STRING )
            // InternalSpinCADMenu.g:472:1: RULE_STRING
            {
             before(grammarAccess.getMENU_HEADERAccess().getNameSTRINGTerminalRuleCall_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getMENU_HEADERAccess().getNameSTRINGTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__MENU_HEADER__NameAssignment_1"


    // $ANTLR start "rule__MENU_ITEM__NameAssignment_1"
    // InternalSpinCADMenu.g:481:1: rule__MENU_ITEM__NameAssignment_1 : ( RULE_STRING ) ;
    public final void rule__MENU_ITEM__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSpinCADMenu.g:485:1: ( ( RULE_STRING ) )
            // InternalSpinCADMenu.g:486:1: ( RULE_STRING )
            {
            // InternalSpinCADMenu.g:486:1: ( RULE_STRING )
            // InternalSpinCADMenu.g:487:1: RULE_STRING
            {
             before(grammarAccess.getMENU_ITEMAccess().getNameSTRINGTerminalRuleCall_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getMENU_ITEMAccess().getNameSTRINGTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__MENU_ITEM__NameAssignment_1"


    // $ANTLR start "rule__MENU_ITEM__ClassNameAssignment_2"
    // InternalSpinCADMenu.g:496:1: rule__MENU_ITEM__ClassNameAssignment_2 : ( RULE_ID ) ;
    public final void rule__MENU_ITEM__ClassNameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSpinCADMenu.g:500:1: ( ( RULE_ID ) )
            // InternalSpinCADMenu.g:501:1: ( RULE_ID )
            {
            // InternalSpinCADMenu.g:501:1: ( RULE_ID )
            // InternalSpinCADMenu.g:502:1: RULE_ID
            {
             before(grammarAccess.getMENU_ITEMAccess().getClassNameIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getMENU_ITEMAccess().getClassNameIDTerminalRuleCall_2_0()); 

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
    // $ANTLR end "rule__MENU_ITEM__ClassNameAssignment_2"


    // $ANTLR start "rule__TEST_ITEM__ClassNameAssignment_1"
    // InternalSpinCADMenu.g:511:1: rule__TEST_ITEM__ClassNameAssignment_1 : ( RULE_ID ) ;
    public final void rule__TEST_ITEM__ClassNameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSpinCADMenu.g:515:1: ( ( RULE_ID ) )
            // InternalSpinCADMenu.g:516:1: ( RULE_ID )
            {
            // InternalSpinCADMenu.g:516:1: ( RULE_ID )
            // InternalSpinCADMenu.g:517:1: RULE_ID
            {
             before(grammarAccess.getTEST_ITEMAccess().getClassNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getTEST_ITEMAccess().getClassNameIDTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__TEST_ITEM__ClassNameAssignment_1"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000003802L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000020L});

}