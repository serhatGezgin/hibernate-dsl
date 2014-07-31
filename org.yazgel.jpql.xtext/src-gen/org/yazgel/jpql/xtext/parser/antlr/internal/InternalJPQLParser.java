package org.yazgel.jpql.xtext.parser.antlr.internal; 

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.yazgel.jpql.xtext.services.JPQLGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalJPQLParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_DATE_LITERAL", "RULE_TIME_LITERAL", "RULE_TIMESTAMP_LITERAL", "RULE_DATE_STRING", "RULE_TIME_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'HAVING'", "'ORDER'", "'BY'", "','", "'ASC'", "'DESC'", "'.'", "'UPDATE'", "'SET'", "'='", "'DELETE'", "'SELECT'", "'DISTINCT'", "'AVG'", "'('", "')'", "'MAX'", "'MIN'", "'SUM'", "'COUNT'", "'NEW'", "'FROM'", "'AS'", "'IN'", "'JOIN'", "'FETCH'", "'LEFT'", "'OUTER'", "'INNER'", "'WHERE'", "'OR'", "'AND'", "'NOT'", "'EXISTS'", "'ALL'", "'ANY'", "'SOME'", "'MEMBER'", "'OF'", "'IS'", "'NULL'", "'EMPTY'", "'LIKE'", "'BETWEEN'", "':'", "'CONCAT'", "'SUBSTRING'", "'LOWER'", "'UPPER'", "'LENGTH'", "'LOCATE'", "'ABS'", "'SQRT'", "'MOD'", "'SIZE'", "'TRUE'", "'FALSE'", "'<'", "'>'", "'<='", "'>='", "'!='"
    };
    public static final int T__68=68;
    public static final int T__69=69;
    public static final int RULE_ID=4;
    public static final int T__66=66;
    public static final int T__67=67;
    public static final int T__64=64;
    public static final int T__29=29;
    public static final int T__65=65;
    public static final int T__28=28;
    public static final int T__62=62;
    public static final int T__27=27;
    public static final int T__63=63;
    public static final int T__26=26;
    public static final int T__25=25;
    public static final int T__24=24;
    public static final int T__23=23;
    public static final int T__22=22;
    public static final int RULE_ANY_OTHER=15;
    public static final int T__21=21;
    public static final int T__20=20;
    public static final int T__61=61;
    public static final int T__60=60;
    public static final int EOF=-1;
    public static final int T__55=55;
    public static final int T__56=56;
    public static final int T__19=19;
    public static final int T__57=57;
    public static final int T__58=58;
    public static final int T__16=16;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__18=18;
    public static final int T__53=53;
    public static final int T__17=17;
    public static final int T__54=54;
    public static final int T__59=59;
    public static final int RULE_INT=6;
    public static final int RULE_DATE_STRING=10;
    public static final int RULE_TIME_LITERAL=8;
    public static final int T__50=50;
    public static final int RULE_DATE_LITERAL=7;
    public static final int RULE_TIMESTAMP_LITERAL=9;
    public static final int T__42=42;
    public static final int T__43=43;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int RULE_SL_COMMENT=13;
    public static final int RULE_ML_COMMENT=12;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int RULE_STRING=5;
    public static final int T__32=32;
    public static final int T__71=71;
    public static final int T__33=33;
    public static final int T__72=72;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__70=70;
    public static final int T__36=36;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int RULE_TIME_STRING=11;
    public static final int RULE_WS=14;
    public static final int T__76=76;
    public static final int T__75=75;
    public static final int T__74=74;
    public static final int T__73=73;
    public static final int T__77=77;

    // delegates
    // delegators


        public InternalJPQLParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalJPQLParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalJPQLParser.tokenNames; }
    public String getGrammarFileName() { return "../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g"; }



     	private JPQLGrammarAccess grammarAccess;
     	
        public InternalJPQLParser(TokenStream input, JPQLGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "QueryModule";	
       	}
       	
       	@Override
       	protected JPQLGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start "entryRuleQueryModule"
    // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:68:1: entryRuleQueryModule returns [EObject current=null] : iv_ruleQueryModule= ruleQueryModule EOF ;
    public final EObject entryRuleQueryModule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleQueryModule = null;


        try {
            // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:69:2: (iv_ruleQueryModule= ruleQueryModule EOF )
            // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:70:2: iv_ruleQueryModule= ruleQueryModule EOF
            {
             newCompositeNode(grammarAccess.getQueryModuleRule()); 
            pushFollow(FOLLOW_ruleQueryModule_in_entryRuleQueryModule75);
            iv_ruleQueryModule=ruleQueryModule();

            state._fsp--;

             current =iv_ruleQueryModule; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleQueryModule85); 

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
    // $ANTLR end "entryRuleQueryModule"


    // $ANTLR start "ruleQueryModule"
    // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:77:1: ruleQueryModule returns [EObject current=null] : ( (lv_queries_0_0= ruleQuery ) )* ;
    public final EObject ruleQueryModule() throws RecognitionException {
        EObject current = null;

        EObject lv_queries_0_0 = null;


         enterRule(); 
            
        try {
            // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:80:28: ( ( (lv_queries_0_0= ruleQuery ) )* )
            // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:81:1: ( (lv_queries_0_0= ruleQuery ) )*
            {
            // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:81:1: ( (lv_queries_0_0= ruleQuery ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==23||(LA1_0>=26 && LA1_0<=27)||LA1_0==37) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:82:1: (lv_queries_0_0= ruleQuery )
            	    {
            	    // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:82:1: (lv_queries_0_0= ruleQuery )
            	    // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:83:3: lv_queries_0_0= ruleQuery
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getQueryModuleAccess().getQueriesQueryParserRuleCall_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleQuery_in_ruleQueryModule130);
            	    lv_queries_0_0=ruleQuery();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getQueryModuleRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"queries",
            	            		lv_queries_0_0, 
            	            		"Query");
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
    // $ANTLR end "ruleQueryModule"


    // $ANTLR start "entryRuleQuery"
    // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:107:1: entryRuleQuery returns [EObject current=null] : iv_ruleQuery= ruleQuery EOF ;
    public final EObject entryRuleQuery() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleQuery = null;


        try {
            // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:108:2: (iv_ruleQuery= ruleQuery EOF )
            // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:109:2: iv_ruleQuery= ruleQuery EOF
            {
             newCompositeNode(grammarAccess.getQueryRule()); 
            pushFollow(FOLLOW_ruleQuery_in_entryRuleQuery166);
            iv_ruleQuery=ruleQuery();

            state._fsp--;

             current =iv_ruleQuery; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleQuery176); 

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
    // $ANTLR end "entryRuleQuery"


    // $ANTLR start "ruleQuery"
    // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:116:1: ruleQuery returns [EObject current=null] : (this_SelectStatement_0= ruleSelectStatement | this_UpdateStatement_1= ruleUpdateStatement | this_DeleteStatement_2= ruleDeleteStatement ) ;
    public final EObject ruleQuery() throws RecognitionException {
        EObject current = null;

        EObject this_SelectStatement_0 = null;

        EObject this_UpdateStatement_1 = null;

        EObject this_DeleteStatement_2 = null;


         enterRule(); 
            
        try {
            // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:119:28: ( (this_SelectStatement_0= ruleSelectStatement | this_UpdateStatement_1= ruleUpdateStatement | this_DeleteStatement_2= ruleDeleteStatement ) )
            // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:120:1: (this_SelectStatement_0= ruleSelectStatement | this_UpdateStatement_1= ruleUpdateStatement | this_DeleteStatement_2= ruleDeleteStatement )
            {
            // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:120:1: (this_SelectStatement_0= ruleSelectStatement | this_UpdateStatement_1= ruleUpdateStatement | this_DeleteStatement_2= ruleDeleteStatement )
            int alt2=3;
            switch ( input.LA(1) ) {
            case 27:
            case 37:
                {
                alt2=1;
                }
                break;
            case 23:
                {
                alt2=2;
                }
                break;
            case 26:
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
                    // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:121:5: this_SelectStatement_0= ruleSelectStatement
                    {
                     
                            newCompositeNode(grammarAccess.getQueryAccess().getSelectStatementParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleSelectStatement_in_ruleQuery223);
                    this_SelectStatement_0=ruleSelectStatement();

                    state._fsp--;

                     
                            current = this_SelectStatement_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:131:5: this_UpdateStatement_1= ruleUpdateStatement
                    {
                     
                            newCompositeNode(grammarAccess.getQueryAccess().getUpdateStatementParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleUpdateStatement_in_ruleQuery250);
                    this_UpdateStatement_1=ruleUpdateStatement();

                    state._fsp--;

                     
                            current = this_UpdateStatement_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:141:5: this_DeleteStatement_2= ruleDeleteStatement
                    {
                     
                            newCompositeNode(grammarAccess.getQueryAccess().getDeleteStatementParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_ruleDeleteStatement_in_ruleQuery277);
                    this_DeleteStatement_2=ruleDeleteStatement();

                    state._fsp--;

                     
                            current = this_DeleteStatement_2; 
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
    // $ANTLR end "ruleQuery"


    // $ANTLR start "entryRuleSelectStatement"
    // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:157:1: entryRuleSelectStatement returns [EObject current=null] : iv_ruleSelectStatement= ruleSelectStatement EOF ;
    public final EObject entryRuleSelectStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSelectStatement = null;


        try {
            // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:158:2: (iv_ruleSelectStatement= ruleSelectStatement EOF )
            // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:159:2: iv_ruleSelectStatement= ruleSelectStatement EOF
            {
             newCompositeNode(grammarAccess.getSelectStatementRule()); 
            pushFollow(FOLLOW_ruleSelectStatement_in_entryRuleSelectStatement312);
            iv_ruleSelectStatement=ruleSelectStatement();

            state._fsp--;

             current =iv_ruleSelectStatement; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSelectStatement322); 

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
    // $ANTLR end "entryRuleSelectStatement"


    // $ANTLR start "ruleSelectStatement"
    // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:166:1: ruleSelectStatement returns [EObject current=null] : ( ( (lv_selectFromClause_0_0= ruleSelectFromClause ) ) ( (lv_whereClause_1_0= ruleWhereClause ) )? ( (lv_having_2_0= ruleHavingClause ) )? ( (lv_order_3_0= ruleOrderClause ) )? ) ;
    public final EObject ruleSelectStatement() throws RecognitionException {
        EObject current = null;

        EObject lv_selectFromClause_0_0 = null;

        EObject lv_whereClause_1_0 = null;

        EObject lv_having_2_0 = null;

        EObject lv_order_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:169:28: ( ( ( (lv_selectFromClause_0_0= ruleSelectFromClause ) ) ( (lv_whereClause_1_0= ruleWhereClause ) )? ( (lv_having_2_0= ruleHavingClause ) )? ( (lv_order_3_0= ruleOrderClause ) )? ) )
            // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:170:1: ( ( (lv_selectFromClause_0_0= ruleSelectFromClause ) ) ( (lv_whereClause_1_0= ruleWhereClause ) )? ( (lv_having_2_0= ruleHavingClause ) )? ( (lv_order_3_0= ruleOrderClause ) )? )
            {
            // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:170:1: ( ( (lv_selectFromClause_0_0= ruleSelectFromClause ) ) ( (lv_whereClause_1_0= ruleWhereClause ) )? ( (lv_having_2_0= ruleHavingClause ) )? ( (lv_order_3_0= ruleOrderClause ) )? )
            // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:170:2: ( (lv_selectFromClause_0_0= ruleSelectFromClause ) ) ( (lv_whereClause_1_0= ruleWhereClause ) )? ( (lv_having_2_0= ruleHavingClause ) )? ( (lv_order_3_0= ruleOrderClause ) )?
            {
            // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:170:2: ( (lv_selectFromClause_0_0= ruleSelectFromClause ) )
            // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:171:1: (lv_selectFromClause_0_0= ruleSelectFromClause )
            {
            // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:171:1: (lv_selectFromClause_0_0= ruleSelectFromClause )
            // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:172:3: lv_selectFromClause_0_0= ruleSelectFromClause
            {
             
            	        newCompositeNode(grammarAccess.getSelectStatementAccess().getSelectFromClauseSelectFromClauseParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_ruleSelectFromClause_in_ruleSelectStatement368);
            lv_selectFromClause_0_0=ruleSelectFromClause();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getSelectStatementRule());
            	        }
                   		set(
                   			current, 
                   			"selectFromClause",
                    		lv_selectFromClause_0_0, 
                    		"SelectFromClause");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:188:2: ( (lv_whereClause_1_0= ruleWhereClause ) )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==45) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:189:1: (lv_whereClause_1_0= ruleWhereClause )
                    {
                    // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:189:1: (lv_whereClause_1_0= ruleWhereClause )
                    // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:190:3: lv_whereClause_1_0= ruleWhereClause
                    {
                     
                    	        newCompositeNode(grammarAccess.getSelectStatementAccess().getWhereClauseWhereClauseParserRuleCall_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleWhereClause_in_ruleSelectStatement389);
                    lv_whereClause_1_0=ruleWhereClause();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getSelectStatementRule());
                    	        }
                           		set(
                           			current, 
                           			"whereClause",
                            		lv_whereClause_1_0, 
                            		"WhereClause");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }
                    break;

            }

            // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:206:3: ( (lv_having_2_0= ruleHavingClause ) )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==16) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:207:1: (lv_having_2_0= ruleHavingClause )
                    {
                    // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:207:1: (lv_having_2_0= ruleHavingClause )
                    // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:208:3: lv_having_2_0= ruleHavingClause
                    {
                     
                    	        newCompositeNode(grammarAccess.getSelectStatementAccess().getHavingHavingClauseParserRuleCall_2_0()); 
                    	    
                    pushFollow(FOLLOW_ruleHavingClause_in_ruleSelectStatement411);
                    lv_having_2_0=ruleHavingClause();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getSelectStatementRule());
                    	        }
                           		set(
                           			current, 
                           			"having",
                            		lv_having_2_0, 
                            		"HavingClause");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }
                    break;

            }

            // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:224:3: ( (lv_order_3_0= ruleOrderClause ) )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==17) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:225:1: (lv_order_3_0= ruleOrderClause )
                    {
                    // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:225:1: (lv_order_3_0= ruleOrderClause )
                    // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:226:3: lv_order_3_0= ruleOrderClause
                    {
                     
                    	        newCompositeNode(grammarAccess.getSelectStatementAccess().getOrderOrderClauseParserRuleCall_3_0()); 
                    	    
                    pushFollow(FOLLOW_ruleOrderClause_in_ruleSelectStatement433);
                    lv_order_3_0=ruleOrderClause();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getSelectStatementRule());
                    	        }
                           		set(
                           			current, 
                           			"order",
                            		lv_order_3_0, 
                            		"OrderClause");
                    	        afterParserOrEnumRuleCall();
                    	    

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
    // $ANTLR end "ruleSelectStatement"


    // $ANTLR start "entryRuleHavingClause"
    // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:250:1: entryRuleHavingClause returns [EObject current=null] : iv_ruleHavingClause= ruleHavingClause EOF ;
    public final EObject entryRuleHavingClause() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleHavingClause = null;


        try {
            // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:251:2: (iv_ruleHavingClause= ruleHavingClause EOF )
            // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:252:2: iv_ruleHavingClause= ruleHavingClause EOF
            {
             newCompositeNode(grammarAccess.getHavingClauseRule()); 
            pushFollow(FOLLOW_ruleHavingClause_in_entryRuleHavingClause470);
            iv_ruleHavingClause=ruleHavingClause();

            state._fsp--;

             current =iv_ruleHavingClause; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleHavingClause480); 

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
    // $ANTLR end "entryRuleHavingClause"


    // $ANTLR start "ruleHavingClause"
    // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:259:1: ruleHavingClause returns [EObject current=null] : (otherlv_0= 'HAVING' ( (lv_having_1_0= ruleOrExpression ) ) ) ;
    public final EObject ruleHavingClause() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_having_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:262:28: ( (otherlv_0= 'HAVING' ( (lv_having_1_0= ruleOrExpression ) ) ) )
            // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:263:1: (otherlv_0= 'HAVING' ( (lv_having_1_0= ruleOrExpression ) ) )
            {
            // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:263:1: (otherlv_0= 'HAVING' ( (lv_having_1_0= ruleOrExpression ) ) )
            // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:263:3: otherlv_0= 'HAVING' ( (lv_having_1_0= ruleOrExpression ) )
            {
            otherlv_0=(Token)match(input,16,FOLLOW_16_in_ruleHavingClause517); 

                	newLeafNode(otherlv_0, grammarAccess.getHavingClauseAccess().getHAVINGKeyword_0());
                
            // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:267:1: ( (lv_having_1_0= ruleOrExpression ) )
            // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:268:1: (lv_having_1_0= ruleOrExpression )
            {
            // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:268:1: (lv_having_1_0= ruleOrExpression )
            // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:269:3: lv_having_1_0= ruleOrExpression
            {
             
            	        newCompositeNode(grammarAccess.getHavingClauseAccess().getHavingOrExpressionParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleOrExpression_in_ruleHavingClause538);
            lv_having_1_0=ruleOrExpression();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getHavingClauseRule());
            	        }
                   		set(
                   			current, 
                   			"having",
                    		lv_having_1_0, 
                    		"OrExpression");
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
    // $ANTLR end "ruleHavingClause"


    // $ANTLR start "entryRuleOrderClause"
    // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:293:1: entryRuleOrderClause returns [EObject current=null] : iv_ruleOrderClause= ruleOrderClause EOF ;
    public final EObject entryRuleOrderClause() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOrderClause = null;


        try {
            // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:294:2: (iv_ruleOrderClause= ruleOrderClause EOF )
            // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:295:2: iv_ruleOrderClause= ruleOrderClause EOF
            {
             newCompositeNode(grammarAccess.getOrderClauseRule()); 
            pushFollow(FOLLOW_ruleOrderClause_in_entryRuleOrderClause574);
            iv_ruleOrderClause=ruleOrderClause();

            state._fsp--;

             current =iv_ruleOrderClause; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleOrderClause584); 

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
    // $ANTLR end "entryRuleOrderClause"


    // $ANTLR start "ruleOrderClause"
    // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:302:1: ruleOrderClause returns [EObject current=null] : (otherlv_0= 'ORDER' otherlv_1= 'BY' ( (lv_ordering_2_0= ruleOrderItem ) ) (otherlv_3= ',' ( (lv_ordering_4_0= ruleOrderItem ) ) )* ( ( (lv_isAsc_5_0= 'ASC' ) ) | ( (lv_isDesc_6_0= 'DESC' ) ) )? ) ;
    public final EObject ruleOrderClause() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token lv_isAsc_5_0=null;
        Token lv_isDesc_6_0=null;
        EObject lv_ordering_2_0 = null;

        EObject lv_ordering_4_0 = null;


         enterRule(); 
            
        try {
            // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:305:28: ( (otherlv_0= 'ORDER' otherlv_1= 'BY' ( (lv_ordering_2_0= ruleOrderItem ) ) (otherlv_3= ',' ( (lv_ordering_4_0= ruleOrderItem ) ) )* ( ( (lv_isAsc_5_0= 'ASC' ) ) | ( (lv_isDesc_6_0= 'DESC' ) ) )? ) )
            // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:306:1: (otherlv_0= 'ORDER' otherlv_1= 'BY' ( (lv_ordering_2_0= ruleOrderItem ) ) (otherlv_3= ',' ( (lv_ordering_4_0= ruleOrderItem ) ) )* ( ( (lv_isAsc_5_0= 'ASC' ) ) | ( (lv_isDesc_6_0= 'DESC' ) ) )? )
            {
            // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:306:1: (otherlv_0= 'ORDER' otherlv_1= 'BY' ( (lv_ordering_2_0= ruleOrderItem ) ) (otherlv_3= ',' ( (lv_ordering_4_0= ruleOrderItem ) ) )* ( ( (lv_isAsc_5_0= 'ASC' ) ) | ( (lv_isDesc_6_0= 'DESC' ) ) )? )
            // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:306:3: otherlv_0= 'ORDER' otherlv_1= 'BY' ( (lv_ordering_2_0= ruleOrderItem ) ) (otherlv_3= ',' ( (lv_ordering_4_0= ruleOrderItem ) ) )* ( ( (lv_isAsc_5_0= 'ASC' ) ) | ( (lv_isDesc_6_0= 'DESC' ) ) )?
            {
            otherlv_0=(Token)match(input,17,FOLLOW_17_in_ruleOrderClause621); 

                	newLeafNode(otherlv_0, grammarAccess.getOrderClauseAccess().getORDERKeyword_0());
                
            otherlv_1=(Token)match(input,18,FOLLOW_18_in_ruleOrderClause633); 

                	newLeafNode(otherlv_1, grammarAccess.getOrderClauseAccess().getBYKeyword_1());
                
            // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:314:1: ( (lv_ordering_2_0= ruleOrderItem ) )
            // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:315:1: (lv_ordering_2_0= ruleOrderItem )
            {
            // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:315:1: (lv_ordering_2_0= ruleOrderItem )
            // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:316:3: lv_ordering_2_0= ruleOrderItem
            {
             
            	        newCompositeNode(grammarAccess.getOrderClauseAccess().getOrderingOrderItemParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleOrderItem_in_ruleOrderClause654);
            lv_ordering_2_0=ruleOrderItem();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getOrderClauseRule());
            	        }
                   		add(
                   			current, 
                   			"ordering",
                    		lv_ordering_2_0, 
                    		"OrderItem");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:332:2: (otherlv_3= ',' ( (lv_ordering_4_0= ruleOrderItem ) ) )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==19) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:332:4: otherlv_3= ',' ( (lv_ordering_4_0= ruleOrderItem ) )
            	    {
            	    otherlv_3=(Token)match(input,19,FOLLOW_19_in_ruleOrderClause667); 

            	        	newLeafNode(otherlv_3, grammarAccess.getOrderClauseAccess().getCommaKeyword_3_0());
            	        
            	    // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:336:1: ( (lv_ordering_4_0= ruleOrderItem ) )
            	    // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:337:1: (lv_ordering_4_0= ruleOrderItem )
            	    {
            	    // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:337:1: (lv_ordering_4_0= ruleOrderItem )
            	    // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:338:3: lv_ordering_4_0= ruleOrderItem
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getOrderClauseAccess().getOrderingOrderItemParserRuleCall_3_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleOrderItem_in_ruleOrderClause688);
            	    lv_ordering_4_0=ruleOrderItem();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getOrderClauseRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"ordering",
            	            		lv_ordering_4_0, 
            	            		"OrderItem");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

            // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:354:4: ( ( (lv_isAsc_5_0= 'ASC' ) ) | ( (lv_isDesc_6_0= 'DESC' ) ) )?
            int alt7=3;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==20) ) {
                alt7=1;
            }
            else if ( (LA7_0==21) ) {
                alt7=2;
            }
            switch (alt7) {
                case 1 :
                    // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:354:5: ( (lv_isAsc_5_0= 'ASC' ) )
                    {
                    // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:354:5: ( (lv_isAsc_5_0= 'ASC' ) )
                    // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:355:1: (lv_isAsc_5_0= 'ASC' )
                    {
                    // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:355:1: (lv_isAsc_5_0= 'ASC' )
                    // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:356:3: lv_isAsc_5_0= 'ASC'
                    {
                    lv_isAsc_5_0=(Token)match(input,20,FOLLOW_20_in_ruleOrderClause709); 

                            newLeafNode(lv_isAsc_5_0, grammarAccess.getOrderClauseAccess().getIsAscASCKeyword_4_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getOrderClauseRule());
                    	        }
                           		setWithLastConsumed(current, "isAsc", true, "ASC");
                    	    

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:370:6: ( (lv_isDesc_6_0= 'DESC' ) )
                    {
                    // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:370:6: ( (lv_isDesc_6_0= 'DESC' ) )
                    // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:371:1: (lv_isDesc_6_0= 'DESC' )
                    {
                    // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:371:1: (lv_isDesc_6_0= 'DESC' )
                    // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:372:3: lv_isDesc_6_0= 'DESC'
                    {
                    lv_isDesc_6_0=(Token)match(input,21,FOLLOW_21_in_ruleOrderClause746); 

                            newLeafNode(lv_isDesc_6_0, grammarAccess.getOrderClauseAccess().getIsDescDESCKeyword_4_1_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getOrderClauseRule());
                    	        }
                           		setWithLastConsumed(current, "isDesc", true, "DESC");
                    	    

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
    // $ANTLR end "ruleOrderClause"


    // $ANTLR start "entryRuleOrderItem"
    // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:393:1: entryRuleOrderItem returns [EObject current=null] : iv_ruleOrderItem= ruleOrderItem EOF ;
    public final EObject entryRuleOrderItem() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOrderItem = null;


        try {
            // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:394:2: (iv_ruleOrderItem= ruleOrderItem EOF )
            // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:395:2: iv_ruleOrderItem= ruleOrderItem EOF
            {
             newCompositeNode(grammarAccess.getOrderItemRule()); 
            pushFollow(FOLLOW_ruleOrderItem_in_entryRuleOrderItem797);
            iv_ruleOrderItem=ruleOrderItem();

            state._fsp--;

             current =iv_ruleOrderItem; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleOrderItem807); 

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
    // $ANTLR end "entryRuleOrderItem"


    // $ANTLR start "ruleOrderItem"
    // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:402:1: ruleOrderItem returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '.' ( (lv_feature_2_0= RULE_ID ) ) ) ;
    public final EObject ruleOrderItem() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_feature_2_0=null;

         enterRule(); 
            
        try {
            // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:405:28: ( ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '.' ( (lv_feature_2_0= RULE_ID ) ) ) )
            // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:406:1: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '.' ( (lv_feature_2_0= RULE_ID ) ) )
            {
            // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:406:1: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '.' ( (lv_feature_2_0= RULE_ID ) ) )
            // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:406:2: ( (otherlv_0= RULE_ID ) ) otherlv_1= '.' ( (lv_feature_2_0= RULE_ID ) )
            {
            // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:406:2: ( (otherlv_0= RULE_ID ) )
            // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:407:1: (otherlv_0= RULE_ID )
            {
            // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:407:1: (otherlv_0= RULE_ID )
            // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:408:3: otherlv_0= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getOrderItemRule());
            	        }
                    
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleOrderItem852); 

            		newLeafNode(otherlv_0, grammarAccess.getOrderItemAccess().getVarFromEntryCrossReference_0_0()); 
            	

            }


            }

            otherlv_1=(Token)match(input,22,FOLLOW_22_in_ruleOrderItem864); 

                	newLeafNode(otherlv_1, grammarAccess.getOrderItemAccess().getFullStopKeyword_1());
                
            // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:423:1: ( (lv_feature_2_0= RULE_ID ) )
            // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:424:1: (lv_feature_2_0= RULE_ID )
            {
            // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:424:1: (lv_feature_2_0= RULE_ID )
            // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:425:3: lv_feature_2_0= RULE_ID
            {
            lv_feature_2_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleOrderItem881); 

            			newLeafNode(lv_feature_2_0, grammarAccess.getOrderItemAccess().getFeatureIDTerminalRuleCall_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getOrderItemRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"feature",
                    		lv_feature_2_0, 
                    		"ID");
            	    

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
    // $ANTLR end "ruleOrderItem"


    // $ANTLR start "entryRuleUpdateStatement"
    // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:449:1: entryRuleUpdateStatement returns [EObject current=null] : iv_ruleUpdateStatement= ruleUpdateStatement EOF ;
    public final EObject entryRuleUpdateStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUpdateStatement = null;


        try {
            // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:450:2: (iv_ruleUpdateStatement= ruleUpdateStatement EOF )
            // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:451:2: iv_ruleUpdateStatement= ruleUpdateStatement EOF
            {
             newCompositeNode(grammarAccess.getUpdateStatementRule()); 
            pushFollow(FOLLOW_ruleUpdateStatement_in_entryRuleUpdateStatement922);
            iv_ruleUpdateStatement=ruleUpdateStatement();

            state._fsp--;

             current =iv_ruleUpdateStatement; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleUpdateStatement932); 

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
    // $ANTLR end "entryRuleUpdateStatement"


    // $ANTLR start "ruleUpdateStatement"
    // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:458:1: ruleUpdateStatement returns [EObject current=null] : ( ( (lv_updateClause_0_0= ruleUpdateClause ) ) ( (lv_setClause_1_0= ruleSetClause ) ) ( (lv_whereClause_2_0= ruleWhereClause ) )? ) ;
    public final EObject ruleUpdateStatement() throws RecognitionException {
        EObject current = null;

        EObject lv_updateClause_0_0 = null;

        EObject lv_setClause_1_0 = null;

        EObject lv_whereClause_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:461:28: ( ( ( (lv_updateClause_0_0= ruleUpdateClause ) ) ( (lv_setClause_1_0= ruleSetClause ) ) ( (lv_whereClause_2_0= ruleWhereClause ) )? ) )
            // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:462:1: ( ( (lv_updateClause_0_0= ruleUpdateClause ) ) ( (lv_setClause_1_0= ruleSetClause ) ) ( (lv_whereClause_2_0= ruleWhereClause ) )? )
            {
            // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:462:1: ( ( (lv_updateClause_0_0= ruleUpdateClause ) ) ( (lv_setClause_1_0= ruleSetClause ) ) ( (lv_whereClause_2_0= ruleWhereClause ) )? )
            // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:462:2: ( (lv_updateClause_0_0= ruleUpdateClause ) ) ( (lv_setClause_1_0= ruleSetClause ) ) ( (lv_whereClause_2_0= ruleWhereClause ) )?
            {
            // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:462:2: ( (lv_updateClause_0_0= ruleUpdateClause ) )
            // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:463:1: (lv_updateClause_0_0= ruleUpdateClause )
            {
            // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:463:1: (lv_updateClause_0_0= ruleUpdateClause )
            // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:464:3: lv_updateClause_0_0= ruleUpdateClause
            {
             
            	        newCompositeNode(grammarAccess.getUpdateStatementAccess().getUpdateClauseUpdateClauseParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_ruleUpdateClause_in_ruleUpdateStatement978);
            lv_updateClause_0_0=ruleUpdateClause();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getUpdateStatementRule());
            	        }
                   		set(
                   			current, 
                   			"updateClause",
                    		lv_updateClause_0_0, 
                    		"UpdateClause");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:480:2: ( (lv_setClause_1_0= ruleSetClause ) )
            // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:481:1: (lv_setClause_1_0= ruleSetClause )
            {
            // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:481:1: (lv_setClause_1_0= ruleSetClause )
            // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:482:3: lv_setClause_1_0= ruleSetClause
            {
             
            	        newCompositeNode(grammarAccess.getUpdateStatementAccess().getSetClauseSetClauseParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleSetClause_in_ruleUpdateStatement999);
            lv_setClause_1_0=ruleSetClause();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getUpdateStatementRule());
            	        }
                   		set(
                   			current, 
                   			"setClause",
                    		lv_setClause_1_0, 
                    		"SetClause");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:498:2: ( (lv_whereClause_2_0= ruleWhereClause ) )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==45) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:499:1: (lv_whereClause_2_0= ruleWhereClause )
                    {
                    // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:499:1: (lv_whereClause_2_0= ruleWhereClause )
                    // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:500:3: lv_whereClause_2_0= ruleWhereClause
                    {
                     
                    	        newCompositeNode(grammarAccess.getUpdateStatementAccess().getWhereClauseWhereClauseParserRuleCall_2_0()); 
                    	    
                    pushFollow(FOLLOW_ruleWhereClause_in_ruleUpdateStatement1020);
                    lv_whereClause_2_0=ruleWhereClause();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getUpdateStatementRule());
                    	        }
                           		set(
                           			current, 
                           			"whereClause",
                            		lv_whereClause_2_0, 
                            		"WhereClause");
                    	        afterParserOrEnumRuleCall();
                    	    

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
    // $ANTLR end "ruleUpdateStatement"


    // $ANTLR start "entryRuleUpdateClause"
    // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:524:1: entryRuleUpdateClause returns [EObject current=null] : iv_ruleUpdateClause= ruleUpdateClause EOF ;
    public final EObject entryRuleUpdateClause() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUpdateClause = null;


        try {
            // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:525:2: (iv_ruleUpdateClause= ruleUpdateClause EOF )
            // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:526:2: iv_ruleUpdateClause= ruleUpdateClause EOF
            {
             newCompositeNode(grammarAccess.getUpdateClauseRule()); 
            pushFollow(FOLLOW_ruleUpdateClause_in_entryRuleUpdateClause1057);
            iv_ruleUpdateClause=ruleUpdateClause();

            state._fsp--;

             current =iv_ruleUpdateClause; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleUpdateClause1067); 

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
    // $ANTLR end "entryRuleUpdateClause"


    // $ANTLR start "ruleUpdateClause"
    // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:533:1: ruleUpdateClause returns [EObject current=null] : (otherlv_0= 'UPDATE' ( (lv_fromEntries_1_0= ruleFromEntry ) ) (otherlv_2= ',' ( (lv_fromEntries_3_0= ruleFromEntry ) ) )* ) ;
    public final EObject ruleUpdateClause() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_fromEntries_1_0 = null;

        EObject lv_fromEntries_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:536:28: ( (otherlv_0= 'UPDATE' ( (lv_fromEntries_1_0= ruleFromEntry ) ) (otherlv_2= ',' ( (lv_fromEntries_3_0= ruleFromEntry ) ) )* ) )
            // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:537:1: (otherlv_0= 'UPDATE' ( (lv_fromEntries_1_0= ruleFromEntry ) ) (otherlv_2= ',' ( (lv_fromEntries_3_0= ruleFromEntry ) ) )* )
            {
            // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:537:1: (otherlv_0= 'UPDATE' ( (lv_fromEntries_1_0= ruleFromEntry ) ) (otherlv_2= ',' ( (lv_fromEntries_3_0= ruleFromEntry ) ) )* )
            // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:537:3: otherlv_0= 'UPDATE' ( (lv_fromEntries_1_0= ruleFromEntry ) ) (otherlv_2= ',' ( (lv_fromEntries_3_0= ruleFromEntry ) ) )*
            {
            otherlv_0=(Token)match(input,23,FOLLOW_23_in_ruleUpdateClause1104); 

                	newLeafNode(otherlv_0, grammarAccess.getUpdateClauseAccess().getUPDATEKeyword_0());
                
            // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:541:1: ( (lv_fromEntries_1_0= ruleFromEntry ) )
            // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:542:1: (lv_fromEntries_1_0= ruleFromEntry )
            {
            // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:542:1: (lv_fromEntries_1_0= ruleFromEntry )
            // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:543:3: lv_fromEntries_1_0= ruleFromEntry
            {
             
            	        newCompositeNode(grammarAccess.getUpdateClauseAccess().getFromEntriesFromEntryParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleFromEntry_in_ruleUpdateClause1125);
            lv_fromEntries_1_0=ruleFromEntry();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getUpdateClauseRule());
            	        }
                   		add(
                   			current, 
                   			"fromEntries",
                    		lv_fromEntries_1_0, 
                    		"FromEntry");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:559:2: (otherlv_2= ',' ( (lv_fromEntries_3_0= ruleFromEntry ) ) )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==19) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:559:4: otherlv_2= ',' ( (lv_fromEntries_3_0= ruleFromEntry ) )
            	    {
            	    otherlv_2=(Token)match(input,19,FOLLOW_19_in_ruleUpdateClause1138); 

            	        	newLeafNode(otherlv_2, grammarAccess.getUpdateClauseAccess().getCommaKeyword_2_0());
            	        
            	    // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:563:1: ( (lv_fromEntries_3_0= ruleFromEntry ) )
            	    // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:564:1: (lv_fromEntries_3_0= ruleFromEntry )
            	    {
            	    // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:564:1: (lv_fromEntries_3_0= ruleFromEntry )
            	    // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:565:3: lv_fromEntries_3_0= ruleFromEntry
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getUpdateClauseAccess().getFromEntriesFromEntryParserRuleCall_2_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleFromEntry_in_ruleUpdateClause1159);
            	    lv_fromEntries_3_0=ruleFromEntry();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getUpdateClauseRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"fromEntries",
            	            		lv_fromEntries_3_0, 
            	            		"FromEntry");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop9;
                }
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
    // $ANTLR end "ruleUpdateClause"


    // $ANTLR start "entryRuleSetClause"
    // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:589:1: entryRuleSetClause returns [EObject current=null] : iv_ruleSetClause= ruleSetClause EOF ;
    public final EObject entryRuleSetClause() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSetClause = null;


        try {
            // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:590:2: (iv_ruleSetClause= ruleSetClause EOF )
            // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:591:2: iv_ruleSetClause= ruleSetClause EOF
            {
             newCompositeNode(grammarAccess.getSetClauseRule()); 
            pushFollow(FOLLOW_ruleSetClause_in_entryRuleSetClause1197);
            iv_ruleSetClause=ruleSetClause();

            state._fsp--;

             current =iv_ruleSetClause; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSetClause1207); 

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
    // $ANTLR end "entryRuleSetClause"


    // $ANTLR start "ruleSetClause"
    // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:598:1: ruleSetClause returns [EObject current=null] : (otherlv_0= 'SET' ( (lv_items_1_0= ruleUpdateItem ) ) (otherlv_2= ',' ( (lv_items_3_0= ruleUpdateItem ) ) )* ) ;
    public final EObject ruleSetClause() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_items_1_0 = null;

        EObject lv_items_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:601:28: ( (otherlv_0= 'SET' ( (lv_items_1_0= ruleUpdateItem ) ) (otherlv_2= ',' ( (lv_items_3_0= ruleUpdateItem ) ) )* ) )
            // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:602:1: (otherlv_0= 'SET' ( (lv_items_1_0= ruleUpdateItem ) ) (otherlv_2= ',' ( (lv_items_3_0= ruleUpdateItem ) ) )* )
            {
            // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:602:1: (otherlv_0= 'SET' ( (lv_items_1_0= ruleUpdateItem ) ) (otherlv_2= ',' ( (lv_items_3_0= ruleUpdateItem ) ) )* )
            // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:602:3: otherlv_0= 'SET' ( (lv_items_1_0= ruleUpdateItem ) ) (otherlv_2= ',' ( (lv_items_3_0= ruleUpdateItem ) ) )*
            {
            otherlv_0=(Token)match(input,24,FOLLOW_24_in_ruleSetClause1244); 

                	newLeafNode(otherlv_0, grammarAccess.getSetClauseAccess().getSETKeyword_0());
                
            // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:606:1: ( (lv_items_1_0= ruleUpdateItem ) )
            // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:607:1: (lv_items_1_0= ruleUpdateItem )
            {
            // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:607:1: (lv_items_1_0= ruleUpdateItem )
            // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:608:3: lv_items_1_0= ruleUpdateItem
            {
             
            	        newCompositeNode(grammarAccess.getSetClauseAccess().getItemsUpdateItemParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleUpdateItem_in_ruleSetClause1265);
            lv_items_1_0=ruleUpdateItem();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getSetClauseRule());
            	        }
                   		add(
                   			current, 
                   			"items",
                    		lv_items_1_0, 
                    		"UpdateItem");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:624:2: (otherlv_2= ',' ( (lv_items_3_0= ruleUpdateItem ) ) )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==19) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:624:4: otherlv_2= ',' ( (lv_items_3_0= ruleUpdateItem ) )
            	    {
            	    otherlv_2=(Token)match(input,19,FOLLOW_19_in_ruleSetClause1278); 

            	        	newLeafNode(otherlv_2, grammarAccess.getSetClauseAccess().getCommaKeyword_2_0());
            	        
            	    // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:628:1: ( (lv_items_3_0= ruleUpdateItem ) )
            	    // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:629:1: (lv_items_3_0= ruleUpdateItem )
            	    {
            	    // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:629:1: (lv_items_3_0= ruleUpdateItem )
            	    // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:630:3: lv_items_3_0= ruleUpdateItem
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getSetClauseAccess().getItemsUpdateItemParserRuleCall_2_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleUpdateItem_in_ruleSetClause1299);
            	    lv_items_3_0=ruleUpdateItem();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getSetClauseRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"items",
            	            		lv_items_3_0, 
            	            		"UpdateItem");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop10;
                }
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
    // $ANTLR end "ruleSetClause"


    // $ANTLR start "entryRuleUpdateItem"
    // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:654:1: entryRuleUpdateItem returns [EObject current=null] : iv_ruleUpdateItem= ruleUpdateItem EOF ;
    public final EObject entryRuleUpdateItem() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUpdateItem = null;


        try {
            // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:655:2: (iv_ruleUpdateItem= ruleUpdateItem EOF )
            // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:656:2: iv_ruleUpdateItem= ruleUpdateItem EOF
            {
             newCompositeNode(grammarAccess.getUpdateItemRule()); 
            pushFollow(FOLLOW_ruleUpdateItem_in_entryRuleUpdateItem1337);
            iv_ruleUpdateItem=ruleUpdateItem();

            state._fsp--;

             current =iv_ruleUpdateItem; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleUpdateItem1347); 

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
    // $ANTLR end "entryRuleUpdateItem"


    // $ANTLR start "ruleUpdateItem"
    // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:663:1: ruleUpdateItem returns [EObject current=null] : ( ( (lv_alias_0_0= ruleAliasAttributeExpression ) ) otherlv_1= '=' ( (lv_value_2_0= ruleValue ) ) ) ;
    public final EObject ruleUpdateItem() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_alias_0_0 = null;

        EObject lv_value_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:666:28: ( ( ( (lv_alias_0_0= ruleAliasAttributeExpression ) ) otherlv_1= '=' ( (lv_value_2_0= ruleValue ) ) ) )
            // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:667:1: ( ( (lv_alias_0_0= ruleAliasAttributeExpression ) ) otherlv_1= '=' ( (lv_value_2_0= ruleValue ) ) )
            {
            // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:667:1: ( ( (lv_alias_0_0= ruleAliasAttributeExpression ) ) otherlv_1= '=' ( (lv_value_2_0= ruleValue ) ) )
            // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:667:2: ( (lv_alias_0_0= ruleAliasAttributeExpression ) ) otherlv_1= '=' ( (lv_value_2_0= ruleValue ) )
            {
            // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:667:2: ( (lv_alias_0_0= ruleAliasAttributeExpression ) )
            // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:668:1: (lv_alias_0_0= ruleAliasAttributeExpression )
            {
            // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:668:1: (lv_alias_0_0= ruleAliasAttributeExpression )
            // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:669:3: lv_alias_0_0= ruleAliasAttributeExpression
            {
             
            	        newCompositeNode(grammarAccess.getUpdateItemAccess().getAliasAliasAttributeExpressionParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_ruleAliasAttributeExpression_in_ruleUpdateItem1393);
            lv_alias_0_0=ruleAliasAttributeExpression();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getUpdateItemRule());
            	        }
                   		set(
                   			current, 
                   			"alias",
                    		lv_alias_0_0, 
                    		"AliasAttributeExpression");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_1=(Token)match(input,25,FOLLOW_25_in_ruleUpdateItem1405); 

                	newLeafNode(otherlv_1, grammarAccess.getUpdateItemAccess().getEqualsSignKeyword_1());
                
            // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:689:1: ( (lv_value_2_0= ruleValue ) )
            // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:690:1: (lv_value_2_0= ruleValue )
            {
            // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:690:1: (lv_value_2_0= ruleValue )
            // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:691:3: lv_value_2_0= ruleValue
            {
             
            	        newCompositeNode(grammarAccess.getUpdateItemAccess().getValueValueParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleValue_in_ruleUpdateItem1426);
            lv_value_2_0=ruleValue();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getUpdateItemRule());
            	        }
                   		set(
                   			current, 
                   			"value",
                    		lv_value_2_0, 
                    		"Value");
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
    // $ANTLR end "ruleUpdateItem"


    // $ANTLR start "entryRuleDeleteStatement"
    // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:715:1: entryRuleDeleteStatement returns [EObject current=null] : iv_ruleDeleteStatement= ruleDeleteStatement EOF ;
    public final EObject entryRuleDeleteStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDeleteStatement = null;


        try {
            // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:716:2: (iv_ruleDeleteStatement= ruleDeleteStatement EOF )
            // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:717:2: iv_ruleDeleteStatement= ruleDeleteStatement EOF
            {
             newCompositeNode(grammarAccess.getDeleteStatementRule()); 
            pushFollow(FOLLOW_ruleDeleteStatement_in_entryRuleDeleteStatement1462);
            iv_ruleDeleteStatement=ruleDeleteStatement();

            state._fsp--;

             current =iv_ruleDeleteStatement; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDeleteStatement1472); 

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
    // $ANTLR end "entryRuleDeleteStatement"


    // $ANTLR start "ruleDeleteStatement"
    // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:724:1: ruleDeleteStatement returns [EObject current=null] : ( ( (lv_deleteClause_0_0= ruleDeleteClause ) ) ( (lv_whereClause_1_0= ruleWhereClause ) )? ) ;
    public final EObject ruleDeleteStatement() throws RecognitionException {
        EObject current = null;

        EObject lv_deleteClause_0_0 = null;

        EObject lv_whereClause_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:727:28: ( ( ( (lv_deleteClause_0_0= ruleDeleteClause ) ) ( (lv_whereClause_1_0= ruleWhereClause ) )? ) )
            // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:728:1: ( ( (lv_deleteClause_0_0= ruleDeleteClause ) ) ( (lv_whereClause_1_0= ruleWhereClause ) )? )
            {
            // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:728:1: ( ( (lv_deleteClause_0_0= ruleDeleteClause ) ) ( (lv_whereClause_1_0= ruleWhereClause ) )? )
            // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:728:2: ( (lv_deleteClause_0_0= ruleDeleteClause ) ) ( (lv_whereClause_1_0= ruleWhereClause ) )?
            {
            // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:728:2: ( (lv_deleteClause_0_0= ruleDeleteClause ) )
            // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:729:1: (lv_deleteClause_0_0= ruleDeleteClause )
            {
            // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:729:1: (lv_deleteClause_0_0= ruleDeleteClause )
            // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:730:3: lv_deleteClause_0_0= ruleDeleteClause
            {
             
            	        newCompositeNode(grammarAccess.getDeleteStatementAccess().getDeleteClauseDeleteClauseParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_ruleDeleteClause_in_ruleDeleteStatement1518);
            lv_deleteClause_0_0=ruleDeleteClause();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getDeleteStatementRule());
            	        }
                   		set(
                   			current, 
                   			"deleteClause",
                    		lv_deleteClause_0_0, 
                    		"DeleteClause");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:746:2: ( (lv_whereClause_1_0= ruleWhereClause ) )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==45) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:747:1: (lv_whereClause_1_0= ruleWhereClause )
                    {
                    // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:747:1: (lv_whereClause_1_0= ruleWhereClause )
                    // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:748:3: lv_whereClause_1_0= ruleWhereClause
                    {
                     
                    	        newCompositeNode(grammarAccess.getDeleteStatementAccess().getWhereClauseWhereClauseParserRuleCall_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleWhereClause_in_ruleDeleteStatement1539);
                    lv_whereClause_1_0=ruleWhereClause();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getDeleteStatementRule());
                    	        }
                           		set(
                           			current, 
                           			"whereClause",
                            		lv_whereClause_1_0, 
                            		"WhereClause");
                    	        afterParserOrEnumRuleCall();
                    	    

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
    // $ANTLR end "ruleDeleteStatement"


    // $ANTLR start "entryRuleDeleteClause"
    // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:772:1: entryRuleDeleteClause returns [EObject current=null] : iv_ruleDeleteClause= ruleDeleteClause EOF ;
    public final EObject entryRuleDeleteClause() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDeleteClause = null;


        try {
            // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:773:2: (iv_ruleDeleteClause= ruleDeleteClause EOF )
            // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:774:2: iv_ruleDeleteClause= ruleDeleteClause EOF
            {
             newCompositeNode(grammarAccess.getDeleteClauseRule()); 
            pushFollow(FOLLOW_ruleDeleteClause_in_entryRuleDeleteClause1576);
            iv_ruleDeleteClause=ruleDeleteClause();

            state._fsp--;

             current =iv_ruleDeleteClause; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDeleteClause1586); 

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
    // $ANTLR end "entryRuleDeleteClause"


    // $ANTLR start "ruleDeleteClause"
    // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:781:1: ruleDeleteClause returns [EObject current=null] : (otherlv_0= 'DELETE' ( (lv_fromClause_1_0= ruleFromClause ) ) ) ;
    public final EObject ruleDeleteClause() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_fromClause_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:784:28: ( (otherlv_0= 'DELETE' ( (lv_fromClause_1_0= ruleFromClause ) ) ) )
            // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:785:1: (otherlv_0= 'DELETE' ( (lv_fromClause_1_0= ruleFromClause ) ) )
            {
            // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:785:1: (otherlv_0= 'DELETE' ( (lv_fromClause_1_0= ruleFromClause ) ) )
            // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:785:3: otherlv_0= 'DELETE' ( (lv_fromClause_1_0= ruleFromClause ) )
            {
            otherlv_0=(Token)match(input,26,FOLLOW_26_in_ruleDeleteClause1623); 

                	newLeafNode(otherlv_0, grammarAccess.getDeleteClauseAccess().getDELETEKeyword_0());
                
            // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:789:1: ( (lv_fromClause_1_0= ruleFromClause ) )
            // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:790:1: (lv_fromClause_1_0= ruleFromClause )
            {
            // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:790:1: (lv_fromClause_1_0= ruleFromClause )
            // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:791:3: lv_fromClause_1_0= ruleFromClause
            {
             
            	        newCompositeNode(grammarAccess.getDeleteClauseAccess().getFromClauseFromClauseParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleFromClause_in_ruleDeleteClause1644);
            lv_fromClause_1_0=ruleFromClause();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getDeleteClauseRule());
            	        }
                   		set(
                   			current, 
                   			"fromClause",
                    		lv_fromClause_1_0, 
                    		"FromClause");
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
    // $ANTLR end "ruleDeleteClause"


    // $ANTLR start "entryRuleSelectFromClause"
    // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:815:1: entryRuleSelectFromClause returns [EObject current=null] : iv_ruleSelectFromClause= ruleSelectFromClause EOF ;
    public final EObject entryRuleSelectFromClause() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSelectFromClause = null;


        try {
            // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:816:2: (iv_ruleSelectFromClause= ruleSelectFromClause EOF )
            // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:817:2: iv_ruleSelectFromClause= ruleSelectFromClause EOF
            {
             newCompositeNode(grammarAccess.getSelectFromClauseRule()); 
            pushFollow(FOLLOW_ruleSelectFromClause_in_entryRuleSelectFromClause1680);
            iv_ruleSelectFromClause=ruleSelectFromClause();

            state._fsp--;

             current =iv_ruleSelectFromClause; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSelectFromClause1690); 

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
    // $ANTLR end "entryRuleSelectFromClause"


    // $ANTLR start "ruleSelectFromClause"
    // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:824:1: ruleSelectFromClause returns [EObject current=null] : ( ( (lv_selectClause_0_0= ruleSelectClause ) )? ( (lv_fromClause_1_0= ruleFromClause ) ) ) ;
    public final EObject ruleSelectFromClause() throws RecognitionException {
        EObject current = null;

        EObject lv_selectClause_0_0 = null;

        EObject lv_fromClause_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:827:28: ( ( ( (lv_selectClause_0_0= ruleSelectClause ) )? ( (lv_fromClause_1_0= ruleFromClause ) ) ) )
            // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:828:1: ( ( (lv_selectClause_0_0= ruleSelectClause ) )? ( (lv_fromClause_1_0= ruleFromClause ) ) )
            {
            // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:828:1: ( ( (lv_selectClause_0_0= ruleSelectClause ) )? ( (lv_fromClause_1_0= ruleFromClause ) ) )
            // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:828:2: ( (lv_selectClause_0_0= ruleSelectClause ) )? ( (lv_fromClause_1_0= ruleFromClause ) )
            {
            // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:828:2: ( (lv_selectClause_0_0= ruleSelectClause ) )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==27) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:829:1: (lv_selectClause_0_0= ruleSelectClause )
                    {
                    // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:829:1: (lv_selectClause_0_0= ruleSelectClause )
                    // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:830:3: lv_selectClause_0_0= ruleSelectClause
                    {
                     
                    	        newCompositeNode(grammarAccess.getSelectFromClauseAccess().getSelectClauseSelectClauseParserRuleCall_0_0()); 
                    	    
                    pushFollow(FOLLOW_ruleSelectClause_in_ruleSelectFromClause1736);
                    lv_selectClause_0_0=ruleSelectClause();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getSelectFromClauseRule());
                    	        }
                           		set(
                           			current, 
                           			"selectClause",
                            		lv_selectClause_0_0, 
                            		"SelectClause");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }
                    break;

            }

            // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:846:3: ( (lv_fromClause_1_0= ruleFromClause ) )
            // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:847:1: (lv_fromClause_1_0= ruleFromClause )
            {
            // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:847:1: (lv_fromClause_1_0= ruleFromClause )
            // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:848:3: lv_fromClause_1_0= ruleFromClause
            {
             
            	        newCompositeNode(grammarAccess.getSelectFromClauseAccess().getFromClauseFromClauseParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleFromClause_in_ruleSelectFromClause1758);
            lv_fromClause_1_0=ruleFromClause();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getSelectFromClauseRule());
            	        }
                   		set(
                   			current, 
                   			"fromClause",
                    		lv_fromClause_1_0, 
                    		"FromClause");
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
    // $ANTLR end "ruleSelectFromClause"


    // $ANTLR start "entryRuleSelectClause"
    // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:872:1: entryRuleSelectClause returns [EObject current=null] : iv_ruleSelectClause= ruleSelectClause EOF ;
    public final EObject entryRuleSelectClause() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSelectClause = null;


        try {
            // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:873:2: (iv_ruleSelectClause= ruleSelectClause EOF )
            // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:874:2: iv_ruleSelectClause= ruleSelectClause EOF
            {
             newCompositeNode(grammarAccess.getSelectClauseRule()); 
            pushFollow(FOLLOW_ruleSelectClause_in_entryRuleSelectClause1794);
            iv_ruleSelectClause=ruleSelectClause();

            state._fsp--;

             current =iv_ruleSelectClause; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSelectClause1804); 

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
    // $ANTLR end "entryRuleSelectClause"


    // $ANTLR start "ruleSelectClause"
    // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:881:1: ruleSelectClause returns [EObject current=null] : (otherlv_0= 'SELECT' ( (lv_isDistinct_1_0= 'DISTINCT' ) )? ( (lv_expressions_2_0= ruleSelectExpression ) ) (otherlv_3= ',' ( (lv_expressions_4_0= ruleSelectExpression ) ) )* ) ;
    public final EObject ruleSelectClause() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_isDistinct_1_0=null;
        Token otherlv_3=null;
        EObject lv_expressions_2_0 = null;

        EObject lv_expressions_4_0 = null;


         enterRule(); 
            
        try {
            // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:884:28: ( (otherlv_0= 'SELECT' ( (lv_isDistinct_1_0= 'DISTINCT' ) )? ( (lv_expressions_2_0= ruleSelectExpression ) ) (otherlv_3= ',' ( (lv_expressions_4_0= ruleSelectExpression ) ) )* ) )
            // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:885:1: (otherlv_0= 'SELECT' ( (lv_isDistinct_1_0= 'DISTINCT' ) )? ( (lv_expressions_2_0= ruleSelectExpression ) ) (otherlv_3= ',' ( (lv_expressions_4_0= ruleSelectExpression ) ) )* )
            {
            // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:885:1: (otherlv_0= 'SELECT' ( (lv_isDistinct_1_0= 'DISTINCT' ) )? ( (lv_expressions_2_0= ruleSelectExpression ) ) (otherlv_3= ',' ( (lv_expressions_4_0= ruleSelectExpression ) ) )* )
            // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:885:3: otherlv_0= 'SELECT' ( (lv_isDistinct_1_0= 'DISTINCT' ) )? ( (lv_expressions_2_0= ruleSelectExpression ) ) (otherlv_3= ',' ( (lv_expressions_4_0= ruleSelectExpression ) ) )*
            {
            otherlv_0=(Token)match(input,27,FOLLOW_27_in_ruleSelectClause1841); 

                	newLeafNode(otherlv_0, grammarAccess.getSelectClauseAccess().getSELECTKeyword_0());
                
            // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:889:1: ( (lv_isDistinct_1_0= 'DISTINCT' ) )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==28) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:890:1: (lv_isDistinct_1_0= 'DISTINCT' )
                    {
                    // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:890:1: (lv_isDistinct_1_0= 'DISTINCT' )
                    // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:891:3: lv_isDistinct_1_0= 'DISTINCT'
                    {
                    lv_isDistinct_1_0=(Token)match(input,28,FOLLOW_28_in_ruleSelectClause1859); 

                            newLeafNode(lv_isDistinct_1_0, grammarAccess.getSelectClauseAccess().getIsDistinctDISTINCTKeyword_1_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getSelectClauseRule());
                    	        }
                           		setWithLastConsumed(current, "isDistinct", true, "DISTINCT");
                    	    

                    }


                    }
                    break;

            }

            // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:904:3: ( (lv_expressions_2_0= ruleSelectExpression ) )
            // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:905:1: (lv_expressions_2_0= ruleSelectExpression )
            {
            // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:905:1: (lv_expressions_2_0= ruleSelectExpression )
            // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:906:3: lv_expressions_2_0= ruleSelectExpression
            {
             
            	        newCompositeNode(grammarAccess.getSelectClauseAccess().getExpressionsSelectExpressionParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleSelectExpression_in_ruleSelectClause1894);
            lv_expressions_2_0=ruleSelectExpression();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getSelectClauseRule());
            	        }
                   		add(
                   			current, 
                   			"expressions",
                    		lv_expressions_2_0, 
                    		"SelectExpression");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:922:2: (otherlv_3= ',' ( (lv_expressions_4_0= ruleSelectExpression ) ) )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==19) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:922:4: otherlv_3= ',' ( (lv_expressions_4_0= ruleSelectExpression ) )
            	    {
            	    otherlv_3=(Token)match(input,19,FOLLOW_19_in_ruleSelectClause1907); 

            	        	newLeafNode(otherlv_3, grammarAccess.getSelectClauseAccess().getCommaKeyword_3_0());
            	        
            	    // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:926:1: ( (lv_expressions_4_0= ruleSelectExpression ) )
            	    // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:927:1: (lv_expressions_4_0= ruleSelectExpression )
            	    {
            	    // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:927:1: (lv_expressions_4_0= ruleSelectExpression )
            	    // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:928:3: lv_expressions_4_0= ruleSelectExpression
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getSelectClauseAccess().getExpressionsSelectExpressionParserRuleCall_3_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleSelectExpression_in_ruleSelectClause1928);
            	    lv_expressions_4_0=ruleSelectExpression();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getSelectClauseRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"expressions",
            	            		lv_expressions_4_0, 
            	            		"SelectExpression");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop14;
                }
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
    // $ANTLR end "ruleSelectClause"


    // $ANTLR start "entryRuleSelectExpression"
    // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:952:1: entryRuleSelectExpression returns [EObject current=null] : iv_ruleSelectExpression= ruleSelectExpression EOF ;
    public final EObject entryRuleSelectExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSelectExpression = null;


        try {
            // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:953:2: (iv_ruleSelectExpression= ruleSelectExpression EOF )
            // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:954:2: iv_ruleSelectExpression= ruleSelectExpression EOF
            {
             newCompositeNode(grammarAccess.getSelectExpressionRule()); 
            pushFollow(FOLLOW_ruleSelectExpression_in_entryRuleSelectExpression1966);
            iv_ruleSelectExpression=ruleSelectExpression();

            state._fsp--;

             current =iv_ruleSelectExpression; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSelectExpression1976); 

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
    // $ANTLR end "entryRuleSelectExpression"


    // $ANTLR start "ruleSelectExpression"
    // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:961:1: ruleSelectExpression returns [EObject current=null] : (this_AliasAttributeExpression_0= ruleAliasAttributeExpression | this_SelectAggregateExpression_1= ruleSelectAggregateExpression | this_SelectConstructorExpression_2= ruleSelectConstructorExpression ) ;
    public final EObject ruleSelectExpression() throws RecognitionException {
        EObject current = null;

        EObject this_AliasAttributeExpression_0 = null;

        EObject this_SelectAggregateExpression_1 = null;

        EObject this_SelectConstructorExpression_2 = null;


         enterRule(); 
            
        try {
            // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:964:28: ( (this_AliasAttributeExpression_0= ruleAliasAttributeExpression | this_SelectAggregateExpression_1= ruleSelectAggregateExpression | this_SelectConstructorExpression_2= ruleSelectConstructorExpression ) )
            // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:965:1: (this_AliasAttributeExpression_0= ruleAliasAttributeExpression | this_SelectAggregateExpression_1= ruleSelectAggregateExpression | this_SelectConstructorExpression_2= ruleSelectConstructorExpression )
            {
            // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:965:1: (this_AliasAttributeExpression_0= ruleAliasAttributeExpression | this_SelectAggregateExpression_1= ruleSelectAggregateExpression | this_SelectConstructorExpression_2= ruleSelectConstructorExpression )
            int alt15=3;
            switch ( input.LA(1) ) {
            case RULE_ID:
                {
                alt15=1;
                }
                break;
            case 29:
            case 32:
            case 33:
            case 34:
            case 35:
                {
                alt15=2;
                }
                break;
            case 36:
                {
                alt15=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;
            }

            switch (alt15) {
                case 1 :
                    // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:966:5: this_AliasAttributeExpression_0= ruleAliasAttributeExpression
                    {
                     
                            newCompositeNode(grammarAccess.getSelectExpressionAccess().getAliasAttributeExpressionParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleAliasAttributeExpression_in_ruleSelectExpression2023);
                    this_AliasAttributeExpression_0=ruleAliasAttributeExpression();

                    state._fsp--;

                     
                            current = this_AliasAttributeExpression_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:976:5: this_SelectAggregateExpression_1= ruleSelectAggregateExpression
                    {
                     
                            newCompositeNode(grammarAccess.getSelectExpressionAccess().getSelectAggregateExpressionParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleSelectAggregateExpression_in_ruleSelectExpression2050);
                    this_SelectAggregateExpression_1=ruleSelectAggregateExpression();

                    state._fsp--;

                     
                            current = this_SelectAggregateExpression_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:986:5: this_SelectConstructorExpression_2= ruleSelectConstructorExpression
                    {
                     
                            newCompositeNode(grammarAccess.getSelectExpressionAccess().getSelectConstructorExpressionParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_ruleSelectConstructorExpression_in_ruleSelectExpression2077);
                    this_SelectConstructorExpression_2=ruleSelectConstructorExpression();

                    state._fsp--;

                     
                            current = this_SelectConstructorExpression_2; 
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
    // $ANTLR end "ruleSelectExpression"


    // $ANTLR start "entryRuleSelectAggregateExpression"
    // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:1002:1: entryRuleSelectAggregateExpression returns [EObject current=null] : iv_ruleSelectAggregateExpression= ruleSelectAggregateExpression EOF ;
    public final EObject entryRuleSelectAggregateExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSelectAggregateExpression = null;


        try {
            // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:1003:2: (iv_ruleSelectAggregateExpression= ruleSelectAggregateExpression EOF )
            // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:1004:2: iv_ruleSelectAggregateExpression= ruleSelectAggregateExpression EOF
            {
             newCompositeNode(grammarAccess.getSelectAggregateExpressionRule()); 
            pushFollow(FOLLOW_ruleSelectAggregateExpression_in_entryRuleSelectAggregateExpression2112);
            iv_ruleSelectAggregateExpression=ruleSelectAggregateExpression();

            state._fsp--;

             current =iv_ruleSelectAggregateExpression; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSelectAggregateExpression2122); 

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
    // $ANTLR end "entryRuleSelectAggregateExpression"


    // $ANTLR start "ruleSelectAggregateExpression"
    // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:1011:1: ruleSelectAggregateExpression returns [EObject current=null] : (this_AvgAggregate_0= ruleAvgAggregate | this_MaxAggregate_1= ruleMaxAggregate | this_MinAggregate_2= ruleMinAggregate | this_SumAggregate_3= ruleSumAggregate | this_CountAggregate_4= ruleCountAggregate ) ;
    public final EObject ruleSelectAggregateExpression() throws RecognitionException {
        EObject current = null;

        EObject this_AvgAggregate_0 = null;

        EObject this_MaxAggregate_1 = null;

        EObject this_MinAggregate_2 = null;

        EObject this_SumAggregate_3 = null;

        EObject this_CountAggregate_4 = null;


         enterRule(); 
            
        try {
            // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:1014:28: ( (this_AvgAggregate_0= ruleAvgAggregate | this_MaxAggregate_1= ruleMaxAggregate | this_MinAggregate_2= ruleMinAggregate | this_SumAggregate_3= ruleSumAggregate | this_CountAggregate_4= ruleCountAggregate ) )
            // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:1015:1: (this_AvgAggregate_0= ruleAvgAggregate | this_MaxAggregate_1= ruleMaxAggregate | this_MinAggregate_2= ruleMinAggregate | this_SumAggregate_3= ruleSumAggregate | this_CountAggregate_4= ruleCountAggregate )
            {
            // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:1015:1: (this_AvgAggregate_0= ruleAvgAggregate | this_MaxAggregate_1= ruleMaxAggregate | this_MinAggregate_2= ruleMinAggregate | this_SumAggregate_3= ruleSumAggregate | this_CountAggregate_4= ruleCountAggregate )
            int alt16=5;
            switch ( input.LA(1) ) {
            case 29:
                {
                alt16=1;
                }
                break;
            case 32:
                {
                alt16=2;
                }
                break;
            case 33:
                {
                alt16=3;
                }
                break;
            case 34:
                {
                alt16=4;
                }
                break;
            case 35:
                {
                alt16=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;
            }

            switch (alt16) {
                case 1 :
                    // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:1016:5: this_AvgAggregate_0= ruleAvgAggregate
                    {
                     
                            newCompositeNode(grammarAccess.getSelectAggregateExpressionAccess().getAvgAggregateParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleAvgAggregate_in_ruleSelectAggregateExpression2169);
                    this_AvgAggregate_0=ruleAvgAggregate();

                    state._fsp--;

                     
                            current = this_AvgAggregate_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:1026:5: this_MaxAggregate_1= ruleMaxAggregate
                    {
                     
                            newCompositeNode(grammarAccess.getSelectAggregateExpressionAccess().getMaxAggregateParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleMaxAggregate_in_ruleSelectAggregateExpression2196);
                    this_MaxAggregate_1=ruleMaxAggregate();

                    state._fsp--;

                     
                            current = this_MaxAggregate_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:1036:5: this_MinAggregate_2= ruleMinAggregate
                    {
                     
                            newCompositeNode(grammarAccess.getSelectAggregateExpressionAccess().getMinAggregateParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_ruleMinAggregate_in_ruleSelectAggregateExpression2223);
                    this_MinAggregate_2=ruleMinAggregate();

                    state._fsp--;

                     
                            current = this_MinAggregate_2; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 4 :
                    // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:1046:5: this_SumAggregate_3= ruleSumAggregate
                    {
                     
                            newCompositeNode(grammarAccess.getSelectAggregateExpressionAccess().getSumAggregateParserRuleCall_3()); 
                        
                    pushFollow(FOLLOW_ruleSumAggregate_in_ruleSelectAggregateExpression2250);
                    this_SumAggregate_3=ruleSumAggregate();

                    state._fsp--;

                     
                            current = this_SumAggregate_3; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 5 :
                    // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:1056:5: this_CountAggregate_4= ruleCountAggregate
                    {
                     
                            newCompositeNode(grammarAccess.getSelectAggregateExpressionAccess().getCountAggregateParserRuleCall_4()); 
                        
                    pushFollow(FOLLOW_ruleCountAggregate_in_ruleSelectAggregateExpression2277);
                    this_CountAggregate_4=ruleCountAggregate();

                    state._fsp--;

                     
                            current = this_CountAggregate_4; 
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
    // $ANTLR end "ruleSelectAggregateExpression"


    // $ANTLR start "entryRuleAvgAggregate"
    // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:1072:1: entryRuleAvgAggregate returns [EObject current=null] : iv_ruleAvgAggregate= ruleAvgAggregate EOF ;
    public final EObject entryRuleAvgAggregate() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAvgAggregate = null;


        try {
            // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:1073:2: (iv_ruleAvgAggregate= ruleAvgAggregate EOF )
            // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:1074:2: iv_ruleAvgAggregate= ruleAvgAggregate EOF
            {
             newCompositeNode(grammarAccess.getAvgAggregateRule()); 
            pushFollow(FOLLOW_ruleAvgAggregate_in_entryRuleAvgAggregate2312);
            iv_ruleAvgAggregate=ruleAvgAggregate();

            state._fsp--;

             current =iv_ruleAvgAggregate; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAvgAggregate2322); 

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
    // $ANTLR end "entryRuleAvgAggregate"


    // $ANTLR start "ruleAvgAggregate"
    // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:1081:1: ruleAvgAggregate returns [EObject current=null] : (otherlv_0= 'AVG' otherlv_1= '(' ( (lv_isDistinct_2_0= 'DISTINCT' ) )? ( (lv_item_3_0= ruleAliasAttributeExpression ) ) otherlv_4= ')' ) ;
    public final EObject ruleAvgAggregate() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_isDistinct_2_0=null;
        Token otherlv_4=null;
        EObject lv_item_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:1084:28: ( (otherlv_0= 'AVG' otherlv_1= '(' ( (lv_isDistinct_2_0= 'DISTINCT' ) )? ( (lv_item_3_0= ruleAliasAttributeExpression ) ) otherlv_4= ')' ) )
            // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:1085:1: (otherlv_0= 'AVG' otherlv_1= '(' ( (lv_isDistinct_2_0= 'DISTINCT' ) )? ( (lv_item_3_0= ruleAliasAttributeExpression ) ) otherlv_4= ')' )
            {
            // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:1085:1: (otherlv_0= 'AVG' otherlv_1= '(' ( (lv_isDistinct_2_0= 'DISTINCT' ) )? ( (lv_item_3_0= ruleAliasAttributeExpression ) ) otherlv_4= ')' )
            // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:1085:3: otherlv_0= 'AVG' otherlv_1= '(' ( (lv_isDistinct_2_0= 'DISTINCT' ) )? ( (lv_item_3_0= ruleAliasAttributeExpression ) ) otherlv_4= ')'
            {
            otherlv_0=(Token)match(input,29,FOLLOW_29_in_ruleAvgAggregate2359); 

                	newLeafNode(otherlv_0, grammarAccess.getAvgAggregateAccess().getAVGKeyword_0());
                
            otherlv_1=(Token)match(input,30,FOLLOW_30_in_ruleAvgAggregate2371); 

                	newLeafNode(otherlv_1, grammarAccess.getAvgAggregateAccess().getLeftParenthesisKeyword_1());
                
            // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:1093:1: ( (lv_isDistinct_2_0= 'DISTINCT' ) )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==28) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:1094:1: (lv_isDistinct_2_0= 'DISTINCT' )
                    {
                    // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:1094:1: (lv_isDistinct_2_0= 'DISTINCT' )
                    // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:1095:3: lv_isDistinct_2_0= 'DISTINCT'
                    {
                    lv_isDistinct_2_0=(Token)match(input,28,FOLLOW_28_in_ruleAvgAggregate2389); 

                            newLeafNode(lv_isDistinct_2_0, grammarAccess.getAvgAggregateAccess().getIsDistinctDISTINCTKeyword_2_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getAvgAggregateRule());
                    	        }
                           		setWithLastConsumed(current, "isDistinct", true, "DISTINCT");
                    	    

                    }


                    }
                    break;

            }

            // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:1108:3: ( (lv_item_3_0= ruleAliasAttributeExpression ) )
            // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:1109:1: (lv_item_3_0= ruleAliasAttributeExpression )
            {
            // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:1109:1: (lv_item_3_0= ruleAliasAttributeExpression )
            // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:1110:3: lv_item_3_0= ruleAliasAttributeExpression
            {
             
            	        newCompositeNode(grammarAccess.getAvgAggregateAccess().getItemAliasAttributeExpressionParserRuleCall_3_0()); 
            	    
            pushFollow(FOLLOW_ruleAliasAttributeExpression_in_ruleAvgAggregate2424);
            lv_item_3_0=ruleAliasAttributeExpression();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getAvgAggregateRule());
            	        }
                   		set(
                   			current, 
                   			"item",
                    		lv_item_3_0, 
                    		"AliasAttributeExpression");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_4=(Token)match(input,31,FOLLOW_31_in_ruleAvgAggregate2436); 

                	newLeafNode(otherlv_4, grammarAccess.getAvgAggregateAccess().getRightParenthesisKeyword_4());
                

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
    // $ANTLR end "ruleAvgAggregate"


    // $ANTLR start "entryRuleMaxAggregate"
    // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:1138:1: entryRuleMaxAggregate returns [EObject current=null] : iv_ruleMaxAggregate= ruleMaxAggregate EOF ;
    public final EObject entryRuleMaxAggregate() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMaxAggregate = null;


        try {
            // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:1139:2: (iv_ruleMaxAggregate= ruleMaxAggregate EOF )
            // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:1140:2: iv_ruleMaxAggregate= ruleMaxAggregate EOF
            {
             newCompositeNode(grammarAccess.getMaxAggregateRule()); 
            pushFollow(FOLLOW_ruleMaxAggregate_in_entryRuleMaxAggregate2472);
            iv_ruleMaxAggregate=ruleMaxAggregate();

            state._fsp--;

             current =iv_ruleMaxAggregate; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMaxAggregate2482); 

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
    // $ANTLR end "entryRuleMaxAggregate"


    // $ANTLR start "ruleMaxAggregate"
    // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:1147:1: ruleMaxAggregate returns [EObject current=null] : (otherlv_0= 'MAX' otherlv_1= '(' ( (lv_isDistinct_2_0= 'DISTINCT' ) )? ( (lv_item_3_0= ruleAliasAttributeExpression ) ) otherlv_4= ')' ) ;
    public final EObject ruleMaxAggregate() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_isDistinct_2_0=null;
        Token otherlv_4=null;
        EObject lv_item_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:1150:28: ( (otherlv_0= 'MAX' otherlv_1= '(' ( (lv_isDistinct_2_0= 'DISTINCT' ) )? ( (lv_item_3_0= ruleAliasAttributeExpression ) ) otherlv_4= ')' ) )
            // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:1151:1: (otherlv_0= 'MAX' otherlv_1= '(' ( (lv_isDistinct_2_0= 'DISTINCT' ) )? ( (lv_item_3_0= ruleAliasAttributeExpression ) ) otherlv_4= ')' )
            {
            // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:1151:1: (otherlv_0= 'MAX' otherlv_1= '(' ( (lv_isDistinct_2_0= 'DISTINCT' ) )? ( (lv_item_3_0= ruleAliasAttributeExpression ) ) otherlv_4= ')' )
            // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:1151:3: otherlv_0= 'MAX' otherlv_1= '(' ( (lv_isDistinct_2_0= 'DISTINCT' ) )? ( (lv_item_3_0= ruleAliasAttributeExpression ) ) otherlv_4= ')'
            {
            otherlv_0=(Token)match(input,32,FOLLOW_32_in_ruleMaxAggregate2519); 

                	newLeafNode(otherlv_0, grammarAccess.getMaxAggregateAccess().getMAXKeyword_0());
                
            otherlv_1=(Token)match(input,30,FOLLOW_30_in_ruleMaxAggregate2531); 

                	newLeafNode(otherlv_1, grammarAccess.getMaxAggregateAccess().getLeftParenthesisKeyword_1());
                
            // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:1159:1: ( (lv_isDistinct_2_0= 'DISTINCT' ) )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==28) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:1160:1: (lv_isDistinct_2_0= 'DISTINCT' )
                    {
                    // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:1160:1: (lv_isDistinct_2_0= 'DISTINCT' )
                    // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:1161:3: lv_isDistinct_2_0= 'DISTINCT'
                    {
                    lv_isDistinct_2_0=(Token)match(input,28,FOLLOW_28_in_ruleMaxAggregate2549); 

                            newLeafNode(lv_isDistinct_2_0, grammarAccess.getMaxAggregateAccess().getIsDistinctDISTINCTKeyword_2_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getMaxAggregateRule());
                    	        }
                           		setWithLastConsumed(current, "isDistinct", true, "DISTINCT");
                    	    

                    }


                    }
                    break;

            }

            // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:1174:3: ( (lv_item_3_0= ruleAliasAttributeExpression ) )
            // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:1175:1: (lv_item_3_0= ruleAliasAttributeExpression )
            {
            // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:1175:1: (lv_item_3_0= ruleAliasAttributeExpression )
            // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:1176:3: lv_item_3_0= ruleAliasAttributeExpression
            {
             
            	        newCompositeNode(grammarAccess.getMaxAggregateAccess().getItemAliasAttributeExpressionParserRuleCall_3_0()); 
            	    
            pushFollow(FOLLOW_ruleAliasAttributeExpression_in_ruleMaxAggregate2584);
            lv_item_3_0=ruleAliasAttributeExpression();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getMaxAggregateRule());
            	        }
                   		set(
                   			current, 
                   			"item",
                    		lv_item_3_0, 
                    		"AliasAttributeExpression");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_4=(Token)match(input,31,FOLLOW_31_in_ruleMaxAggregate2596); 

                	newLeafNode(otherlv_4, grammarAccess.getMaxAggregateAccess().getRightParenthesisKeyword_4());
                

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
    // $ANTLR end "ruleMaxAggregate"


    // $ANTLR start "entryRuleMinAggregate"
    // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:1204:1: entryRuleMinAggregate returns [EObject current=null] : iv_ruleMinAggregate= ruleMinAggregate EOF ;
    public final EObject entryRuleMinAggregate() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMinAggregate = null;


        try {
            // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:1205:2: (iv_ruleMinAggregate= ruleMinAggregate EOF )
            // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:1206:2: iv_ruleMinAggregate= ruleMinAggregate EOF
            {
             newCompositeNode(grammarAccess.getMinAggregateRule()); 
            pushFollow(FOLLOW_ruleMinAggregate_in_entryRuleMinAggregate2632);
            iv_ruleMinAggregate=ruleMinAggregate();

            state._fsp--;

             current =iv_ruleMinAggregate; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMinAggregate2642); 

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
    // $ANTLR end "entryRuleMinAggregate"


    // $ANTLR start "ruleMinAggregate"
    // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:1213:1: ruleMinAggregate returns [EObject current=null] : (otherlv_0= 'MIN' otherlv_1= '(' ( (lv_isDistinct_2_0= 'DISTINCT' ) )? ( (lv_item_3_0= ruleAliasAttributeExpression ) ) otherlv_4= ')' ) ;
    public final EObject ruleMinAggregate() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_isDistinct_2_0=null;
        Token otherlv_4=null;
        EObject lv_item_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:1216:28: ( (otherlv_0= 'MIN' otherlv_1= '(' ( (lv_isDistinct_2_0= 'DISTINCT' ) )? ( (lv_item_3_0= ruleAliasAttributeExpression ) ) otherlv_4= ')' ) )
            // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:1217:1: (otherlv_0= 'MIN' otherlv_1= '(' ( (lv_isDistinct_2_0= 'DISTINCT' ) )? ( (lv_item_3_0= ruleAliasAttributeExpression ) ) otherlv_4= ')' )
            {
            // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:1217:1: (otherlv_0= 'MIN' otherlv_1= '(' ( (lv_isDistinct_2_0= 'DISTINCT' ) )? ( (lv_item_3_0= ruleAliasAttributeExpression ) ) otherlv_4= ')' )
            // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:1217:3: otherlv_0= 'MIN' otherlv_1= '(' ( (lv_isDistinct_2_0= 'DISTINCT' ) )? ( (lv_item_3_0= ruleAliasAttributeExpression ) ) otherlv_4= ')'
            {
            otherlv_0=(Token)match(input,33,FOLLOW_33_in_ruleMinAggregate2679); 

                	newLeafNode(otherlv_0, grammarAccess.getMinAggregateAccess().getMINKeyword_0());
                
            otherlv_1=(Token)match(input,30,FOLLOW_30_in_ruleMinAggregate2691); 

                	newLeafNode(otherlv_1, grammarAccess.getMinAggregateAccess().getLeftParenthesisKeyword_1());
                
            // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:1225:1: ( (lv_isDistinct_2_0= 'DISTINCT' ) )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==28) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:1226:1: (lv_isDistinct_2_0= 'DISTINCT' )
                    {
                    // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:1226:1: (lv_isDistinct_2_0= 'DISTINCT' )
                    // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:1227:3: lv_isDistinct_2_0= 'DISTINCT'
                    {
                    lv_isDistinct_2_0=(Token)match(input,28,FOLLOW_28_in_ruleMinAggregate2709); 

                            newLeafNode(lv_isDistinct_2_0, grammarAccess.getMinAggregateAccess().getIsDistinctDISTINCTKeyword_2_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getMinAggregateRule());
                    	        }
                           		setWithLastConsumed(current, "isDistinct", true, "DISTINCT");
                    	    

                    }


                    }
                    break;

            }

            // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:1240:3: ( (lv_item_3_0= ruleAliasAttributeExpression ) )
            // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:1241:1: (lv_item_3_0= ruleAliasAttributeExpression )
            {
            // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:1241:1: (lv_item_3_0= ruleAliasAttributeExpression )
            // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:1242:3: lv_item_3_0= ruleAliasAttributeExpression
            {
             
            	        newCompositeNode(grammarAccess.getMinAggregateAccess().getItemAliasAttributeExpressionParserRuleCall_3_0()); 
            	    
            pushFollow(FOLLOW_ruleAliasAttributeExpression_in_ruleMinAggregate2744);
            lv_item_3_0=ruleAliasAttributeExpression();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getMinAggregateRule());
            	        }
                   		set(
                   			current, 
                   			"item",
                    		lv_item_3_0, 
                    		"AliasAttributeExpression");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_4=(Token)match(input,31,FOLLOW_31_in_ruleMinAggregate2756); 

                	newLeafNode(otherlv_4, grammarAccess.getMinAggregateAccess().getRightParenthesisKeyword_4());
                

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
    // $ANTLR end "ruleMinAggregate"


    // $ANTLR start "entryRuleSumAggregate"
    // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:1270:1: entryRuleSumAggregate returns [EObject current=null] : iv_ruleSumAggregate= ruleSumAggregate EOF ;
    public final EObject entryRuleSumAggregate() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSumAggregate = null;


        try {
            // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:1271:2: (iv_ruleSumAggregate= ruleSumAggregate EOF )
            // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:1272:2: iv_ruleSumAggregate= ruleSumAggregate EOF
            {
             newCompositeNode(grammarAccess.getSumAggregateRule()); 
            pushFollow(FOLLOW_ruleSumAggregate_in_entryRuleSumAggregate2792);
            iv_ruleSumAggregate=ruleSumAggregate();

            state._fsp--;

             current =iv_ruleSumAggregate; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSumAggregate2802); 

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
    // $ANTLR end "entryRuleSumAggregate"


    // $ANTLR start "ruleSumAggregate"
    // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:1279:1: ruleSumAggregate returns [EObject current=null] : (otherlv_0= 'SUM' otherlv_1= '(' ( (lv_isDistinct_2_0= 'DISTINCT' ) )? ( (lv_item_3_0= ruleAliasAttributeExpression ) ) otherlv_4= ')' ) ;
    public final EObject ruleSumAggregate() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_isDistinct_2_0=null;
        Token otherlv_4=null;
        EObject lv_item_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:1282:28: ( (otherlv_0= 'SUM' otherlv_1= '(' ( (lv_isDistinct_2_0= 'DISTINCT' ) )? ( (lv_item_3_0= ruleAliasAttributeExpression ) ) otherlv_4= ')' ) )
            // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:1283:1: (otherlv_0= 'SUM' otherlv_1= '(' ( (lv_isDistinct_2_0= 'DISTINCT' ) )? ( (lv_item_3_0= ruleAliasAttributeExpression ) ) otherlv_4= ')' )
            {
            // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:1283:1: (otherlv_0= 'SUM' otherlv_1= '(' ( (lv_isDistinct_2_0= 'DISTINCT' ) )? ( (lv_item_3_0= ruleAliasAttributeExpression ) ) otherlv_4= ')' )
            // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:1283:3: otherlv_0= 'SUM' otherlv_1= '(' ( (lv_isDistinct_2_0= 'DISTINCT' ) )? ( (lv_item_3_0= ruleAliasAttributeExpression ) ) otherlv_4= ')'
            {
            otherlv_0=(Token)match(input,34,FOLLOW_34_in_ruleSumAggregate2839); 

                	newLeafNode(otherlv_0, grammarAccess.getSumAggregateAccess().getSUMKeyword_0());
                
            otherlv_1=(Token)match(input,30,FOLLOW_30_in_ruleSumAggregate2851); 

                	newLeafNode(otherlv_1, grammarAccess.getSumAggregateAccess().getLeftParenthesisKeyword_1());
                
            // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:1291:1: ( (lv_isDistinct_2_0= 'DISTINCT' ) )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==28) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:1292:1: (lv_isDistinct_2_0= 'DISTINCT' )
                    {
                    // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:1292:1: (lv_isDistinct_2_0= 'DISTINCT' )
                    // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:1293:3: lv_isDistinct_2_0= 'DISTINCT'
                    {
                    lv_isDistinct_2_0=(Token)match(input,28,FOLLOW_28_in_ruleSumAggregate2869); 

                            newLeafNode(lv_isDistinct_2_0, grammarAccess.getSumAggregateAccess().getIsDistinctDISTINCTKeyword_2_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getSumAggregateRule());
                    	        }
                           		setWithLastConsumed(current, "isDistinct", true, "DISTINCT");
                    	    

                    }


                    }
                    break;

            }

            // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:1306:3: ( (lv_item_3_0= ruleAliasAttributeExpression ) )
            // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:1307:1: (lv_item_3_0= ruleAliasAttributeExpression )
            {
            // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:1307:1: (lv_item_3_0= ruleAliasAttributeExpression )
            // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:1308:3: lv_item_3_0= ruleAliasAttributeExpression
            {
             
            	        newCompositeNode(grammarAccess.getSumAggregateAccess().getItemAliasAttributeExpressionParserRuleCall_3_0()); 
            	    
            pushFollow(FOLLOW_ruleAliasAttributeExpression_in_ruleSumAggregate2904);
            lv_item_3_0=ruleAliasAttributeExpression();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getSumAggregateRule());
            	        }
                   		set(
                   			current, 
                   			"item",
                    		lv_item_3_0, 
                    		"AliasAttributeExpression");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_4=(Token)match(input,31,FOLLOW_31_in_ruleSumAggregate2916); 

                	newLeafNode(otherlv_4, grammarAccess.getSumAggregateAccess().getRightParenthesisKeyword_4());
                

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
    // $ANTLR end "ruleSumAggregate"


    // $ANTLR start "entryRuleCountAggregate"
    // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:1336:1: entryRuleCountAggregate returns [EObject current=null] : iv_ruleCountAggregate= ruleCountAggregate EOF ;
    public final EObject entryRuleCountAggregate() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCountAggregate = null;


        try {
            // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:1337:2: (iv_ruleCountAggregate= ruleCountAggregate EOF )
            // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:1338:2: iv_ruleCountAggregate= ruleCountAggregate EOF
            {
             newCompositeNode(grammarAccess.getCountAggregateRule()); 
            pushFollow(FOLLOW_ruleCountAggregate_in_entryRuleCountAggregate2952);
            iv_ruleCountAggregate=ruleCountAggregate();

            state._fsp--;

             current =iv_ruleCountAggregate; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCountAggregate2962); 

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
    // $ANTLR end "entryRuleCountAggregate"


    // $ANTLR start "ruleCountAggregate"
    // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:1345:1: ruleCountAggregate returns [EObject current=null] : (otherlv_0= 'COUNT' otherlv_1= '(' ( (lv_isDistinct_2_0= 'DISTINCT' ) )? ( (lv_item_3_0= ruleAliasAttributeExpression ) ) otherlv_4= ')' ) ;
    public final EObject ruleCountAggregate() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_isDistinct_2_0=null;
        Token otherlv_4=null;
        EObject lv_item_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:1348:28: ( (otherlv_0= 'COUNT' otherlv_1= '(' ( (lv_isDistinct_2_0= 'DISTINCT' ) )? ( (lv_item_3_0= ruleAliasAttributeExpression ) ) otherlv_4= ')' ) )
            // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:1349:1: (otherlv_0= 'COUNT' otherlv_1= '(' ( (lv_isDistinct_2_0= 'DISTINCT' ) )? ( (lv_item_3_0= ruleAliasAttributeExpression ) ) otherlv_4= ')' )
            {
            // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:1349:1: (otherlv_0= 'COUNT' otherlv_1= '(' ( (lv_isDistinct_2_0= 'DISTINCT' ) )? ( (lv_item_3_0= ruleAliasAttributeExpression ) ) otherlv_4= ')' )
            // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:1349:3: otherlv_0= 'COUNT' otherlv_1= '(' ( (lv_isDistinct_2_0= 'DISTINCT' ) )? ( (lv_item_3_0= ruleAliasAttributeExpression ) ) otherlv_4= ')'
            {
            otherlv_0=(Token)match(input,35,FOLLOW_35_in_ruleCountAggregate2999); 

                	newLeafNode(otherlv_0, grammarAccess.getCountAggregateAccess().getCOUNTKeyword_0());
                
            otherlv_1=(Token)match(input,30,FOLLOW_30_in_ruleCountAggregate3011); 

                	newLeafNode(otherlv_1, grammarAccess.getCountAggregateAccess().getLeftParenthesisKeyword_1());
                
            // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:1357:1: ( (lv_isDistinct_2_0= 'DISTINCT' ) )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==28) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:1358:1: (lv_isDistinct_2_0= 'DISTINCT' )
                    {
                    // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:1358:1: (lv_isDistinct_2_0= 'DISTINCT' )
                    // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:1359:3: lv_isDistinct_2_0= 'DISTINCT'
                    {
                    lv_isDistinct_2_0=(Token)match(input,28,FOLLOW_28_in_ruleCountAggregate3029); 

                            newLeafNode(lv_isDistinct_2_0, grammarAccess.getCountAggregateAccess().getIsDistinctDISTINCTKeyword_2_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getCountAggregateRule());
                    	        }
                           		setWithLastConsumed(current, "isDistinct", true, "DISTINCT");
                    	    

                    }


                    }
                    break;

            }

            // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:1372:3: ( (lv_item_3_0= ruleAliasAttributeExpression ) )
            // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:1373:1: (lv_item_3_0= ruleAliasAttributeExpression )
            {
            // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:1373:1: (lv_item_3_0= ruleAliasAttributeExpression )
            // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:1374:3: lv_item_3_0= ruleAliasAttributeExpression
            {
             
            	        newCompositeNode(grammarAccess.getCountAggregateAccess().getItemAliasAttributeExpressionParserRuleCall_3_0()); 
            	    
            pushFollow(FOLLOW_ruleAliasAttributeExpression_in_ruleCountAggregate3064);
            lv_item_3_0=ruleAliasAttributeExpression();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getCountAggregateRule());
            	        }
                   		set(
                   			current, 
                   			"item",
                    		lv_item_3_0, 
                    		"AliasAttributeExpression");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_4=(Token)match(input,31,FOLLOW_31_in_ruleCountAggregate3076); 

                	newLeafNode(otherlv_4, grammarAccess.getCountAggregateAccess().getRightParenthesisKeyword_4());
                

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
    // $ANTLR end "ruleCountAggregate"


    // $ANTLR start "entryRuleSelectConstructorExpression"
    // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:1402:1: entryRuleSelectConstructorExpression returns [EObject current=null] : iv_ruleSelectConstructorExpression= ruleSelectConstructorExpression EOF ;
    public final EObject entryRuleSelectConstructorExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSelectConstructorExpression = null;


        try {
            // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:1403:2: (iv_ruleSelectConstructorExpression= ruleSelectConstructorExpression EOF )
            // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:1404:2: iv_ruleSelectConstructorExpression= ruleSelectConstructorExpression EOF
            {
             newCompositeNode(grammarAccess.getSelectConstructorExpressionRule()); 
            pushFollow(FOLLOW_ruleSelectConstructorExpression_in_entryRuleSelectConstructorExpression3112);
            iv_ruleSelectConstructorExpression=ruleSelectConstructorExpression();

            state._fsp--;

             current =iv_ruleSelectConstructorExpression; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSelectConstructorExpression3122); 

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
    // $ANTLR end "entryRuleSelectConstructorExpression"


    // $ANTLR start "ruleSelectConstructorExpression"
    // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:1411:1: ruleSelectConstructorExpression returns [EObject current=null] : (otherlv_0= 'NEW' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( (lv_items_3_0= ruleAliasAttributeExpression ) ) (otherlv_4= ',' ( (lv_items_5_0= ruleAliasAttributeExpression ) ) )* otherlv_6= ')' ) ;
    public final EObject ruleSelectConstructorExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_items_3_0 = null;

        EObject lv_items_5_0 = null;


         enterRule(); 
            
        try {
            // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:1414:28: ( (otherlv_0= 'NEW' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( (lv_items_3_0= ruleAliasAttributeExpression ) ) (otherlv_4= ',' ( (lv_items_5_0= ruleAliasAttributeExpression ) ) )* otherlv_6= ')' ) )
            // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:1415:1: (otherlv_0= 'NEW' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( (lv_items_3_0= ruleAliasAttributeExpression ) ) (otherlv_4= ',' ( (lv_items_5_0= ruleAliasAttributeExpression ) ) )* otherlv_6= ')' )
            {
            // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:1415:1: (otherlv_0= 'NEW' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( (lv_items_3_0= ruleAliasAttributeExpression ) ) (otherlv_4= ',' ( (lv_items_5_0= ruleAliasAttributeExpression ) ) )* otherlv_6= ')' )
            // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:1415:3: otherlv_0= 'NEW' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( (lv_items_3_0= ruleAliasAttributeExpression ) ) (otherlv_4= ',' ( (lv_items_5_0= ruleAliasAttributeExpression ) ) )* otherlv_6= ')'
            {
            otherlv_0=(Token)match(input,36,FOLLOW_36_in_ruleSelectConstructorExpression3159); 

                	newLeafNode(otherlv_0, grammarAccess.getSelectConstructorExpressionAccess().getNEWKeyword_0());
                
            // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:1419:1: ( (lv_name_1_0= RULE_ID ) )
            // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:1420:1: (lv_name_1_0= RULE_ID )
            {
            // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:1420:1: (lv_name_1_0= RULE_ID )
            // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:1421:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleSelectConstructorExpression3176); 

            			newLeafNode(lv_name_1_0, grammarAccess.getSelectConstructorExpressionAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getSelectConstructorExpressionRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            otherlv_2=(Token)match(input,30,FOLLOW_30_in_ruleSelectConstructorExpression3193); 

                	newLeafNode(otherlv_2, grammarAccess.getSelectConstructorExpressionAccess().getLeftParenthesisKeyword_2());
                
            // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:1441:1: ( (lv_items_3_0= ruleAliasAttributeExpression ) )
            // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:1442:1: (lv_items_3_0= ruleAliasAttributeExpression )
            {
            // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:1442:1: (lv_items_3_0= ruleAliasAttributeExpression )
            // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:1443:3: lv_items_3_0= ruleAliasAttributeExpression
            {
             
            	        newCompositeNode(grammarAccess.getSelectConstructorExpressionAccess().getItemsAliasAttributeExpressionParserRuleCall_3_0()); 
            	    
            pushFollow(FOLLOW_ruleAliasAttributeExpression_in_ruleSelectConstructorExpression3214);
            lv_items_3_0=ruleAliasAttributeExpression();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getSelectConstructorExpressionRule());
            	        }
                   		add(
                   			current, 
                   			"items",
                    		lv_items_3_0, 
                    		"AliasAttributeExpression");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:1459:2: (otherlv_4= ',' ( (lv_items_5_0= ruleAliasAttributeExpression ) ) )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==19) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:1459:4: otherlv_4= ',' ( (lv_items_5_0= ruleAliasAttributeExpression ) )
            	    {
            	    otherlv_4=(Token)match(input,19,FOLLOW_19_in_ruleSelectConstructorExpression3227); 

            	        	newLeafNode(otherlv_4, grammarAccess.getSelectConstructorExpressionAccess().getCommaKeyword_4_0());
            	        
            	    // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:1463:1: ( (lv_items_5_0= ruleAliasAttributeExpression ) )
            	    // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:1464:1: (lv_items_5_0= ruleAliasAttributeExpression )
            	    {
            	    // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:1464:1: (lv_items_5_0= ruleAliasAttributeExpression )
            	    // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:1465:3: lv_items_5_0= ruleAliasAttributeExpression
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getSelectConstructorExpressionAccess().getItemsAliasAttributeExpressionParserRuleCall_4_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleAliasAttributeExpression_in_ruleSelectConstructorExpression3248);
            	    lv_items_5_0=ruleAliasAttributeExpression();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getSelectConstructorExpressionRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"items",
            	            		lv_items_5_0, 
            	            		"AliasAttributeExpression");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop22;
                }
            } while (true);

            otherlv_6=(Token)match(input,31,FOLLOW_31_in_ruleSelectConstructorExpression3262); 

                	newLeafNode(otherlv_6, grammarAccess.getSelectConstructorExpressionAccess().getRightParenthesisKeyword_5());
                

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
    // $ANTLR end "ruleSelectConstructorExpression"


    // $ANTLR start "entryRuleFromClause"
    // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:1493:1: entryRuleFromClause returns [EObject current=null] : iv_ruleFromClause= ruleFromClause EOF ;
    public final EObject entryRuleFromClause() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFromClause = null;


        try {
            // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:1494:2: (iv_ruleFromClause= ruleFromClause EOF )
            // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:1495:2: iv_ruleFromClause= ruleFromClause EOF
            {
             newCompositeNode(grammarAccess.getFromClauseRule()); 
            pushFollow(FOLLOW_ruleFromClause_in_entryRuleFromClause3298);
            iv_ruleFromClause=ruleFromClause();

            state._fsp--;

             current =iv_ruleFromClause; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFromClause3308); 

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
    // $ANTLR end "entryRuleFromClause"


    // $ANTLR start "ruleFromClause"
    // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:1502:1: ruleFromClause returns [EObject current=null] : (otherlv_0= 'FROM' ( (lv_fromEntries_1_0= ruleFromClass ) ) (otherlv_2= ',' ( (lv_fromEntries_3_0= ruleFromEntry ) ) )* ) ;
    public final EObject ruleFromClause() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_fromEntries_1_0 = null;

        EObject lv_fromEntries_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:1505:28: ( (otherlv_0= 'FROM' ( (lv_fromEntries_1_0= ruleFromClass ) ) (otherlv_2= ',' ( (lv_fromEntries_3_0= ruleFromEntry ) ) )* ) )
            // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:1506:1: (otherlv_0= 'FROM' ( (lv_fromEntries_1_0= ruleFromClass ) ) (otherlv_2= ',' ( (lv_fromEntries_3_0= ruleFromEntry ) ) )* )
            {
            // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:1506:1: (otherlv_0= 'FROM' ( (lv_fromEntries_1_0= ruleFromClass ) ) (otherlv_2= ',' ( (lv_fromEntries_3_0= ruleFromEntry ) ) )* )
            // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:1506:3: otherlv_0= 'FROM' ( (lv_fromEntries_1_0= ruleFromClass ) ) (otherlv_2= ',' ( (lv_fromEntries_3_0= ruleFromEntry ) ) )*
            {
            otherlv_0=(Token)match(input,37,FOLLOW_37_in_ruleFromClause3345); 

                	newLeafNode(otherlv_0, grammarAccess.getFromClauseAccess().getFROMKeyword_0());
                
            // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:1510:1: ( (lv_fromEntries_1_0= ruleFromClass ) )
            // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:1511:1: (lv_fromEntries_1_0= ruleFromClass )
            {
            // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:1511:1: (lv_fromEntries_1_0= ruleFromClass )
            // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:1512:3: lv_fromEntries_1_0= ruleFromClass
            {
             
            	        newCompositeNode(grammarAccess.getFromClauseAccess().getFromEntriesFromClassParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleFromClass_in_ruleFromClause3366);
            lv_fromEntries_1_0=ruleFromClass();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getFromClauseRule());
            	        }
                   		add(
                   			current, 
                   			"fromEntries",
                    		lv_fromEntries_1_0, 
                    		"FromClass");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:1528:2: (otherlv_2= ',' ( (lv_fromEntries_3_0= ruleFromEntry ) ) )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( (LA23_0==19) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:1528:4: otherlv_2= ',' ( (lv_fromEntries_3_0= ruleFromEntry ) )
            	    {
            	    otherlv_2=(Token)match(input,19,FOLLOW_19_in_ruleFromClause3379); 

            	        	newLeafNode(otherlv_2, grammarAccess.getFromClauseAccess().getCommaKeyword_2_0());
            	        
            	    // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:1532:1: ( (lv_fromEntries_3_0= ruleFromEntry ) )
            	    // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:1533:1: (lv_fromEntries_3_0= ruleFromEntry )
            	    {
            	    // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:1533:1: (lv_fromEntries_3_0= ruleFromEntry )
            	    // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:1534:3: lv_fromEntries_3_0= ruleFromEntry
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getFromClauseAccess().getFromEntriesFromEntryParserRuleCall_2_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleFromEntry_in_ruleFromClause3400);
            	    lv_fromEntries_3_0=ruleFromEntry();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getFromClauseRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"fromEntries",
            	            		lv_fromEntries_3_0, 
            	            		"FromEntry");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop23;
                }
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
    // $ANTLR end "ruleFromClause"


    // $ANTLR start "entryRuleFromEntry"
    // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:1558:1: entryRuleFromEntry returns [EObject current=null] : iv_ruleFromEntry= ruleFromEntry EOF ;
    public final EObject entryRuleFromEntry() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFromEntry = null;


        try {
            // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:1559:2: (iv_ruleFromEntry= ruleFromEntry EOF )
            // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:1560:2: iv_ruleFromEntry= ruleFromEntry EOF
            {
             newCompositeNode(grammarAccess.getFromEntryRule()); 
            pushFollow(FOLLOW_ruleFromEntry_in_entryRuleFromEntry3438);
            iv_ruleFromEntry=ruleFromEntry();

            state._fsp--;

             current =iv_ruleFromEntry; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFromEntry3448); 

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
    // $ANTLR end "entryRuleFromEntry"


    // $ANTLR start "ruleFromEntry"
    // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:1567:1: ruleFromEntry returns [EObject current=null] : (this_FromClass_0= ruleFromClass | this_FromCollection_1= ruleFromCollection ) ;
    public final EObject ruleFromEntry() throws RecognitionException {
        EObject current = null;

        EObject this_FromClass_0 = null;

        EObject this_FromCollection_1 = null;


         enterRule(); 
            
        try {
            // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:1570:28: ( (this_FromClass_0= ruleFromClass | this_FromCollection_1= ruleFromCollection ) )
            // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:1571:1: (this_FromClass_0= ruleFromClass | this_FromCollection_1= ruleFromCollection )
            {
            // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:1571:1: (this_FromClass_0= ruleFromClass | this_FromCollection_1= ruleFromCollection )
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==RULE_ID) ) {
                alt24=1;
            }
            else if ( (LA24_0==39) ) {
                alt24=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 24, 0, input);

                throw nvae;
            }
            switch (alt24) {
                case 1 :
                    // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:1572:5: this_FromClass_0= ruleFromClass
                    {
                     
                            newCompositeNode(grammarAccess.getFromEntryAccess().getFromClassParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleFromClass_in_ruleFromEntry3495);
                    this_FromClass_0=ruleFromClass();

                    state._fsp--;

                     
                            current = this_FromClass_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:1582:5: this_FromCollection_1= ruleFromCollection
                    {
                     
                            newCompositeNode(grammarAccess.getFromEntryAccess().getFromCollectionParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleFromCollection_in_ruleFromEntry3522);
                    this_FromCollection_1=ruleFromCollection();

                    state._fsp--;

                     
                            current = this_FromCollection_1; 
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
    // $ANTLR end "ruleFromEntry"


    // $ANTLR start "entryRuleVariableDeclaration"
    // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:1598:1: entryRuleVariableDeclaration returns [EObject current=null] : iv_ruleVariableDeclaration= ruleVariableDeclaration EOF ;
    public final EObject entryRuleVariableDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariableDeclaration = null;


        try {
            // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:1599:2: (iv_ruleVariableDeclaration= ruleVariableDeclaration EOF )
            // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:1600:2: iv_ruleVariableDeclaration= ruleVariableDeclaration EOF
            {
             newCompositeNode(grammarAccess.getVariableDeclarationRule()); 
            pushFollow(FOLLOW_ruleVariableDeclaration_in_entryRuleVariableDeclaration3557);
            iv_ruleVariableDeclaration=ruleVariableDeclaration();

            state._fsp--;

             current =iv_ruleVariableDeclaration; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleVariableDeclaration3567); 

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
    // $ANTLR end "entryRuleVariableDeclaration"


    // $ANTLR start "ruleVariableDeclaration"
    // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:1607:1: ruleVariableDeclaration returns [EObject current=null] : ( (otherlv_0= 'AS' )? ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleVariableDeclaration() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;

         enterRule(); 
            
        try {
            // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:1610:28: ( ( (otherlv_0= 'AS' )? ( (lv_name_1_0= RULE_ID ) ) ) )
            // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:1611:1: ( (otherlv_0= 'AS' )? ( (lv_name_1_0= RULE_ID ) ) )
            {
            // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:1611:1: ( (otherlv_0= 'AS' )? ( (lv_name_1_0= RULE_ID ) ) )
            // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:1611:2: (otherlv_0= 'AS' )? ( (lv_name_1_0= RULE_ID ) )
            {
            // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:1611:2: (otherlv_0= 'AS' )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==38) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:1611:4: otherlv_0= 'AS'
                    {
                    otherlv_0=(Token)match(input,38,FOLLOW_38_in_ruleVariableDeclaration3605); 

                        	newLeafNode(otherlv_0, grammarAccess.getVariableDeclarationAccess().getASKeyword_0());
                        

                    }
                    break;

            }

            // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:1615:3: ( (lv_name_1_0= RULE_ID ) )
            // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:1616:1: (lv_name_1_0= RULE_ID )
            {
            // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:1616:1: (lv_name_1_0= RULE_ID )
            // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:1617:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleVariableDeclaration3624); 

            			newLeafNode(lv_name_1_0, grammarAccess.getVariableDeclarationAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getVariableDeclarationRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

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
    // $ANTLR end "ruleVariableDeclaration"


    // $ANTLR start "entryRuleFromClass"
    // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:1641:1: entryRuleFromClass returns [EObject current=null] : iv_ruleFromClass= ruleFromClass EOF ;
    public final EObject entryRuleFromClass() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFromClass = null;


        try {
            // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:1642:2: (iv_ruleFromClass= ruleFromClass EOF )
            // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:1643:2: iv_ruleFromClass= ruleFromClass EOF
            {
             newCompositeNode(grammarAccess.getFromClassRule()); 
            pushFollow(FOLLOW_ruleFromClass_in_entryRuleFromClass3665);
            iv_ruleFromClass=ruleFromClass();

            state._fsp--;

             current =iv_ruleFromClass; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFromClass3675); 

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
    // $ANTLR end "entryRuleFromClass"


    // $ANTLR start "ruleFromClass"
    // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:1650:1: ruleFromClass returns [EObject current=null] : (this_FromClassId_0= ruleFromClassId | this_FromClassVar_1= ruleFromClassVar ) ;
    public final EObject ruleFromClass() throws RecognitionException {
        EObject current = null;

        EObject this_FromClassId_0 = null;

        EObject this_FromClassVar_1 = null;


         enterRule(); 
            
        try {
            // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:1653:28: ( (this_FromClassId_0= ruleFromClassId | this_FromClassVar_1= ruleFromClassVar ) )
            // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:1654:1: (this_FromClassId_0= ruleFromClassId | this_FromClassVar_1= ruleFromClassVar )
            {
            // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:1654:1: (this_FromClassId_0= ruleFromClassId | this_FromClassVar_1= ruleFromClassVar )
            int alt26=2;
            alt26 = dfa26.predict(input);
            switch (alt26) {
                case 1 :
                    // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:1655:5: this_FromClassId_0= ruleFromClassId
                    {
                     
                            newCompositeNode(grammarAccess.getFromClassAccess().getFromClassIdParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleFromClassId_in_ruleFromClass3722);
                    this_FromClassId_0=ruleFromClassId();

                    state._fsp--;

                     
                            current = this_FromClassId_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:1665:5: this_FromClassVar_1= ruleFromClassVar
                    {
                     
                            newCompositeNode(grammarAccess.getFromClassAccess().getFromClassVarParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleFromClassVar_in_ruleFromClass3749);
                    this_FromClassVar_1=ruleFromClassVar();

                    state._fsp--;

                     
                            current = this_FromClassVar_1; 
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
    // $ANTLR end "ruleFromClass"


    // $ANTLR start "entryRuleFromClassId"
    // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:1681:1: entryRuleFromClassId returns [EObject current=null] : iv_ruleFromClassId= ruleFromClassId EOF ;
    public final EObject entryRuleFromClassId() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFromClassId = null;


        try {
            // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:1682:2: (iv_ruleFromClassId= ruleFromClassId EOF )
            // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:1683:2: iv_ruleFromClassId= ruleFromClassId EOF
            {
             newCompositeNode(grammarAccess.getFromClassIdRule()); 
            pushFollow(FOLLOW_ruleFromClassId_in_entryRuleFromClassId3784);
            iv_ruleFromClassId=ruleFromClassId();

            state._fsp--;

             current =iv_ruleFromClassId; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFromClassId3794); 

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
    // $ANTLR end "entryRuleFromClassId"


    // $ANTLR start "ruleFromClassId"
    // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:1690:1: ruleFromClassId returns [EObject current=null] : ( ( ruleQualifiedName ) ) ;
    public final EObject ruleFromClassId() throws RecognitionException {
        EObject current = null;

         enterRule(); 
            
        try {
            // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:1693:28: ( ( ( ruleQualifiedName ) ) )
            // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:1694:1: ( ( ruleQualifiedName ) )
            {
            // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:1694:1: ( ( ruleQualifiedName ) )
            // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:1695:1: ( ruleQualifiedName )
            {
            // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:1695:1: ( ruleQualifiedName )
            // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:1696:3: ruleQualifiedName
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getFromClassIdRule());
            	        }
                    
             
            	        newCompositeNode(grammarAccess.getFromClassIdAccess().getTypeJvmTypeCrossReference_0()); 
            	    
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleFromClassId3841);
            ruleQualifiedName();

            state._fsp--;

             
            	        afterParserOrEnumRuleCall();
            	    

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
    // $ANTLR end "ruleFromClassId"


    // $ANTLR start "entryRuleFromClassVar"
    // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:1717:1: entryRuleFromClassVar returns [EObject current=null] : iv_ruleFromClassVar= ruleFromClassVar EOF ;
    public final EObject entryRuleFromClassVar() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFromClassVar = null;


        try {
            // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:1718:2: (iv_ruleFromClassVar= ruleFromClassVar EOF )
            // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:1719:2: iv_ruleFromClassVar= ruleFromClassVar EOF
            {
             newCompositeNode(grammarAccess.getFromClassVarRule()); 
            pushFollow(FOLLOW_ruleFromClassVar_in_entryRuleFromClassVar3876);
            iv_ruleFromClassVar=ruleFromClassVar();

            state._fsp--;

             current =iv_ruleFromClassVar; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFromClassVar3886); 

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
    // $ANTLR end "entryRuleFromClassVar"


    // $ANTLR start "ruleFromClassVar"
    // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:1726:1: ruleFromClassVar returns [EObject current=null] : ( ( ( ruleQualifiedName ) ) ( (lv_variable_1_0= ruleVariableDeclaration ) ) ( (lv_joins_2_0= ruleFromJoin ) )* ) ;
    public final EObject ruleFromClassVar() throws RecognitionException {
        EObject current = null;

        EObject lv_variable_1_0 = null;

        EObject lv_joins_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:1729:28: ( ( ( ( ruleQualifiedName ) ) ( (lv_variable_1_0= ruleVariableDeclaration ) ) ( (lv_joins_2_0= ruleFromJoin ) )* ) )
            // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:1730:1: ( ( ( ruleQualifiedName ) ) ( (lv_variable_1_0= ruleVariableDeclaration ) ) ( (lv_joins_2_0= ruleFromJoin ) )* )
            {
            // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:1730:1: ( ( ( ruleQualifiedName ) ) ( (lv_variable_1_0= ruleVariableDeclaration ) ) ( (lv_joins_2_0= ruleFromJoin ) )* )
            // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:1730:2: ( ( ruleQualifiedName ) ) ( (lv_variable_1_0= ruleVariableDeclaration ) ) ( (lv_joins_2_0= ruleFromJoin ) )*
            {
            // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:1730:2: ( ( ruleQualifiedName ) )
            // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:1731:1: ( ruleQualifiedName )
            {
            // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:1731:1: ( ruleQualifiedName )
            // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:1732:3: ruleQualifiedName
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getFromClassVarRule());
            	        }
                    
             
            	        newCompositeNode(grammarAccess.getFromClassVarAccess().getTypeJvmTypeCrossReference_0_0()); 
            	    
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleFromClassVar3934);
            ruleQualifiedName();

            state._fsp--;

             
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:1745:2: ( (lv_variable_1_0= ruleVariableDeclaration ) )
            // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:1746:1: (lv_variable_1_0= ruleVariableDeclaration )
            {
            // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:1746:1: (lv_variable_1_0= ruleVariableDeclaration )
            // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:1747:3: lv_variable_1_0= ruleVariableDeclaration
            {
             
            	        newCompositeNode(grammarAccess.getFromClassVarAccess().getVariableVariableDeclarationParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleVariableDeclaration_in_ruleFromClassVar3955);
            lv_variable_1_0=ruleVariableDeclaration();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getFromClassVarRule());
            	        }
                   		set(
                   			current, 
                   			"variable",
                    		lv_variable_1_0, 
                    		"VariableDeclaration");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:1763:2: ( (lv_joins_2_0= ruleFromJoin ) )*
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( (LA27_0==40||LA27_0==42||LA27_0==44) ) {
                    alt27=1;
                }


                switch (alt27) {
            	case 1 :
            	    // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:1764:1: (lv_joins_2_0= ruleFromJoin )
            	    {
            	    // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:1764:1: (lv_joins_2_0= ruleFromJoin )
            	    // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:1765:3: lv_joins_2_0= ruleFromJoin
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getFromClassVarAccess().getJoinsFromJoinParserRuleCall_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleFromJoin_in_ruleFromClassVar3976);
            	    lv_joins_2_0=ruleFromJoin();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getFromClassVarRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"joins",
            	            		lv_joins_2_0, 
            	            		"FromJoin");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop27;
                }
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
    // $ANTLR end "ruleFromClassVar"


    // $ANTLR start "entryRuleFromCollection"
    // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:1789:1: entryRuleFromCollection returns [EObject current=null] : iv_ruleFromCollection= ruleFromCollection EOF ;
    public final EObject entryRuleFromCollection() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFromCollection = null;


        try {
            // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:1790:2: (iv_ruleFromCollection= ruleFromCollection EOF )
            // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:1791:2: iv_ruleFromCollection= ruleFromCollection EOF
            {
             newCompositeNode(grammarAccess.getFromCollectionRule()); 
            pushFollow(FOLLOW_ruleFromCollection_in_entryRuleFromCollection4013);
            iv_ruleFromCollection=ruleFromCollection();

            state._fsp--;

             current =iv_ruleFromCollection; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFromCollection4023); 

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
    // $ANTLR end "entryRuleFromCollection"


    // $ANTLR start "ruleFromCollection"
    // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:1798:1: ruleFromCollection returns [EObject current=null] : (otherlv_0= 'IN' otherlv_1= '(' ( (lv_path_2_0= ruleAliasAttributeExpression ) ) otherlv_3= ')' ( (lv_variable_4_0= ruleVariableDeclaration ) ) ) ;
    public final EObject ruleFromCollection() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_path_2_0 = null;

        EObject lv_variable_4_0 = null;


         enterRule(); 
            
        try {
            // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:1801:28: ( (otherlv_0= 'IN' otherlv_1= '(' ( (lv_path_2_0= ruleAliasAttributeExpression ) ) otherlv_3= ')' ( (lv_variable_4_0= ruleVariableDeclaration ) ) ) )
            // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:1802:1: (otherlv_0= 'IN' otherlv_1= '(' ( (lv_path_2_0= ruleAliasAttributeExpression ) ) otherlv_3= ')' ( (lv_variable_4_0= ruleVariableDeclaration ) ) )
            {
            // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:1802:1: (otherlv_0= 'IN' otherlv_1= '(' ( (lv_path_2_0= ruleAliasAttributeExpression ) ) otherlv_3= ')' ( (lv_variable_4_0= ruleVariableDeclaration ) ) )
            // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:1802:3: otherlv_0= 'IN' otherlv_1= '(' ( (lv_path_2_0= ruleAliasAttributeExpression ) ) otherlv_3= ')' ( (lv_variable_4_0= ruleVariableDeclaration ) )
            {
            otherlv_0=(Token)match(input,39,FOLLOW_39_in_ruleFromCollection4060); 

                	newLeafNode(otherlv_0, grammarAccess.getFromCollectionAccess().getINKeyword_0());
                
            otherlv_1=(Token)match(input,30,FOLLOW_30_in_ruleFromCollection4072); 

                	newLeafNode(otherlv_1, grammarAccess.getFromCollectionAccess().getLeftParenthesisKeyword_1());
                
            // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:1810:1: ( (lv_path_2_0= ruleAliasAttributeExpression ) )
            // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:1811:1: (lv_path_2_0= ruleAliasAttributeExpression )
            {
            // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:1811:1: (lv_path_2_0= ruleAliasAttributeExpression )
            // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:1812:3: lv_path_2_0= ruleAliasAttributeExpression
            {
             
            	        newCompositeNode(grammarAccess.getFromCollectionAccess().getPathAliasAttributeExpressionParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleAliasAttributeExpression_in_ruleFromCollection4093);
            lv_path_2_0=ruleAliasAttributeExpression();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getFromCollectionRule());
            	        }
                   		set(
                   			current, 
                   			"path",
                    		lv_path_2_0, 
                    		"AliasAttributeExpression");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_3=(Token)match(input,31,FOLLOW_31_in_ruleFromCollection4105); 

                	newLeafNode(otherlv_3, grammarAccess.getFromCollectionAccess().getRightParenthesisKeyword_3());
                
            // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:1832:1: ( (lv_variable_4_0= ruleVariableDeclaration ) )
            // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:1833:1: (lv_variable_4_0= ruleVariableDeclaration )
            {
            // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:1833:1: (lv_variable_4_0= ruleVariableDeclaration )
            // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:1834:3: lv_variable_4_0= ruleVariableDeclaration
            {
             
            	        newCompositeNode(grammarAccess.getFromCollectionAccess().getVariableVariableDeclarationParserRuleCall_4_0()); 
            	    
            pushFollow(FOLLOW_ruleVariableDeclaration_in_ruleFromCollection4126);
            lv_variable_4_0=ruleVariableDeclaration();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getFromCollectionRule());
            	        }
                   		set(
                   			current, 
                   			"variable",
                    		lv_variable_4_0, 
                    		"VariableDeclaration");
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
    // $ANTLR end "ruleFromCollection"


    // $ANTLR start "entryRuleFromJoin"
    // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:1858:1: entryRuleFromJoin returns [EObject current=null] : iv_ruleFromJoin= ruleFromJoin EOF ;
    public final EObject entryRuleFromJoin() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFromJoin = null;


        try {
            // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:1859:2: (iv_ruleFromJoin= ruleFromJoin EOF )
            // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:1860:2: iv_ruleFromJoin= ruleFromJoin EOF
            {
             newCompositeNode(grammarAccess.getFromJoinRule()); 
            pushFollow(FOLLOW_ruleFromJoin_in_entryRuleFromJoin4162);
            iv_ruleFromJoin=ruleFromJoin();

            state._fsp--;

             current =iv_ruleFromJoin; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFromJoin4172); 

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
    // $ANTLR end "entryRuleFromJoin"


    // $ANTLR start "ruleFromJoin"
    // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:1867:1: ruleFromJoin returns [EObject current=null] : (this_Join_0= ruleJoin | this_LeftJoin_1= ruleLeftJoin | this_InnerJoin_2= ruleInnerJoin ) ;
    public final EObject ruleFromJoin() throws RecognitionException {
        EObject current = null;

        EObject this_Join_0 = null;

        EObject this_LeftJoin_1 = null;

        EObject this_InnerJoin_2 = null;


         enterRule(); 
            
        try {
            // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:1870:28: ( (this_Join_0= ruleJoin | this_LeftJoin_1= ruleLeftJoin | this_InnerJoin_2= ruleInnerJoin ) )
            // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:1871:1: (this_Join_0= ruleJoin | this_LeftJoin_1= ruleLeftJoin | this_InnerJoin_2= ruleInnerJoin )
            {
            // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:1871:1: (this_Join_0= ruleJoin | this_LeftJoin_1= ruleLeftJoin | this_InnerJoin_2= ruleInnerJoin )
            int alt28=3;
            switch ( input.LA(1) ) {
            case 40:
                {
                alt28=1;
                }
                break;
            case 42:
                {
                alt28=2;
                }
                break;
            case 44:
                {
                alt28=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 28, 0, input);

                throw nvae;
            }

            switch (alt28) {
                case 1 :
                    // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:1872:5: this_Join_0= ruleJoin
                    {
                     
                            newCompositeNode(grammarAccess.getFromJoinAccess().getJoinParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleJoin_in_ruleFromJoin4219);
                    this_Join_0=ruleJoin();

                    state._fsp--;

                     
                            current = this_Join_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:1882:5: this_LeftJoin_1= ruleLeftJoin
                    {
                     
                            newCompositeNode(grammarAccess.getFromJoinAccess().getLeftJoinParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleLeftJoin_in_ruleFromJoin4246);
                    this_LeftJoin_1=ruleLeftJoin();

                    state._fsp--;

                     
                            current = this_LeftJoin_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:1892:5: this_InnerJoin_2= ruleInnerJoin
                    {
                     
                            newCompositeNode(grammarAccess.getFromJoinAccess().getInnerJoinParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_ruleInnerJoin_in_ruleFromJoin4273);
                    this_InnerJoin_2=ruleInnerJoin();

                    state._fsp--;

                     
                            current = this_InnerJoin_2; 
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
    // $ANTLR end "ruleFromJoin"


    // $ANTLR start "entryRuleJoin"
    // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:1908:1: entryRuleJoin returns [EObject current=null] : iv_ruleJoin= ruleJoin EOF ;
    public final EObject entryRuleJoin() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJoin = null;


        try {
            // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:1909:2: (iv_ruleJoin= ruleJoin EOF )
            // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:1910:2: iv_ruleJoin= ruleJoin EOF
            {
             newCompositeNode(grammarAccess.getJoinRule()); 
            pushFollow(FOLLOW_ruleJoin_in_entryRuleJoin4308);
            iv_ruleJoin=ruleJoin();

            state._fsp--;

             current =iv_ruleJoin; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleJoin4318); 

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
    // $ANTLR end "entryRuleJoin"


    // $ANTLR start "ruleJoin"
    // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:1917:1: ruleJoin returns [EObject current=null] : (otherlv_0= 'JOIN' ( (lv_isFetch_1_0= 'FETCH' ) )? ( (lv_path_2_0= ruleAliasAttributeExpression ) ) ( (lv_variable_3_0= ruleVariableDeclaration ) ) ) ;
    public final EObject ruleJoin() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_isFetch_1_0=null;
        EObject lv_path_2_0 = null;

        EObject lv_variable_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:1920:28: ( (otherlv_0= 'JOIN' ( (lv_isFetch_1_0= 'FETCH' ) )? ( (lv_path_2_0= ruleAliasAttributeExpression ) ) ( (lv_variable_3_0= ruleVariableDeclaration ) ) ) )
            // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:1921:1: (otherlv_0= 'JOIN' ( (lv_isFetch_1_0= 'FETCH' ) )? ( (lv_path_2_0= ruleAliasAttributeExpression ) ) ( (lv_variable_3_0= ruleVariableDeclaration ) ) )
            {
            // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:1921:1: (otherlv_0= 'JOIN' ( (lv_isFetch_1_0= 'FETCH' ) )? ( (lv_path_2_0= ruleAliasAttributeExpression ) ) ( (lv_variable_3_0= ruleVariableDeclaration ) ) )
            // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:1921:3: otherlv_0= 'JOIN' ( (lv_isFetch_1_0= 'FETCH' ) )? ( (lv_path_2_0= ruleAliasAttributeExpression ) ) ( (lv_variable_3_0= ruleVariableDeclaration ) )
            {
            otherlv_0=(Token)match(input,40,FOLLOW_40_in_ruleJoin4355); 

                	newLeafNode(otherlv_0, grammarAccess.getJoinAccess().getJOINKeyword_0());
                
            // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:1925:1: ( (lv_isFetch_1_0= 'FETCH' ) )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==41) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:1926:1: (lv_isFetch_1_0= 'FETCH' )
                    {
                    // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:1926:1: (lv_isFetch_1_0= 'FETCH' )
                    // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:1927:3: lv_isFetch_1_0= 'FETCH'
                    {
                    lv_isFetch_1_0=(Token)match(input,41,FOLLOW_41_in_ruleJoin4373); 

                            newLeafNode(lv_isFetch_1_0, grammarAccess.getJoinAccess().getIsFetchFETCHKeyword_1_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getJoinRule());
                    	        }
                           		setWithLastConsumed(current, "isFetch", true, "FETCH");
                    	    

                    }


                    }
                    break;

            }

            // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:1940:3: ( (lv_path_2_0= ruleAliasAttributeExpression ) )
            // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:1941:1: (lv_path_2_0= ruleAliasAttributeExpression )
            {
            // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:1941:1: (lv_path_2_0= ruleAliasAttributeExpression )
            // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:1942:3: lv_path_2_0= ruleAliasAttributeExpression
            {
             
            	        newCompositeNode(grammarAccess.getJoinAccess().getPathAliasAttributeExpressionParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleAliasAttributeExpression_in_ruleJoin4408);
            lv_path_2_0=ruleAliasAttributeExpression();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getJoinRule());
            	        }
                   		set(
                   			current, 
                   			"path",
                    		lv_path_2_0, 
                    		"AliasAttributeExpression");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:1958:2: ( (lv_variable_3_0= ruleVariableDeclaration ) )
            // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:1959:1: (lv_variable_3_0= ruleVariableDeclaration )
            {
            // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:1959:1: (lv_variable_3_0= ruleVariableDeclaration )
            // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:1960:3: lv_variable_3_0= ruleVariableDeclaration
            {
             
            	        newCompositeNode(grammarAccess.getJoinAccess().getVariableVariableDeclarationParserRuleCall_3_0()); 
            	    
            pushFollow(FOLLOW_ruleVariableDeclaration_in_ruleJoin4429);
            lv_variable_3_0=ruleVariableDeclaration();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getJoinRule());
            	        }
                   		set(
                   			current, 
                   			"variable",
                    		lv_variable_3_0, 
                    		"VariableDeclaration");
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
    // $ANTLR end "ruleJoin"


    // $ANTLR start "entryRuleLeftJoin"
    // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:1984:1: entryRuleLeftJoin returns [EObject current=null] : iv_ruleLeftJoin= ruleLeftJoin EOF ;
    public final EObject entryRuleLeftJoin() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLeftJoin = null;


        try {
            // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:1985:2: (iv_ruleLeftJoin= ruleLeftJoin EOF )
            // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:1986:2: iv_ruleLeftJoin= ruleLeftJoin EOF
            {
             newCompositeNode(grammarAccess.getLeftJoinRule()); 
            pushFollow(FOLLOW_ruleLeftJoin_in_entryRuleLeftJoin4465);
            iv_ruleLeftJoin=ruleLeftJoin();

            state._fsp--;

             current =iv_ruleLeftJoin; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleLeftJoin4475); 

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
    // $ANTLR end "entryRuleLeftJoin"


    // $ANTLR start "ruleLeftJoin"
    // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:1993:1: ruleLeftJoin returns [EObject current=null] : (otherlv_0= 'LEFT' ( (lv_isOuter_1_0= 'OUTER' ) )? otherlv_2= 'JOIN' ( (lv_isFetch_3_0= 'FETCH' ) )? ( (lv_path_4_0= ruleAliasAttributeExpression ) ) ( (lv_variable_5_0= ruleVariableDeclaration ) ) ) ;
    public final EObject ruleLeftJoin() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_isOuter_1_0=null;
        Token otherlv_2=null;
        Token lv_isFetch_3_0=null;
        EObject lv_path_4_0 = null;

        EObject lv_variable_5_0 = null;


         enterRule(); 
            
        try {
            // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:1996:28: ( (otherlv_0= 'LEFT' ( (lv_isOuter_1_0= 'OUTER' ) )? otherlv_2= 'JOIN' ( (lv_isFetch_3_0= 'FETCH' ) )? ( (lv_path_4_0= ruleAliasAttributeExpression ) ) ( (lv_variable_5_0= ruleVariableDeclaration ) ) ) )
            // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:1997:1: (otherlv_0= 'LEFT' ( (lv_isOuter_1_0= 'OUTER' ) )? otherlv_2= 'JOIN' ( (lv_isFetch_3_0= 'FETCH' ) )? ( (lv_path_4_0= ruleAliasAttributeExpression ) ) ( (lv_variable_5_0= ruleVariableDeclaration ) ) )
            {
            // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:1997:1: (otherlv_0= 'LEFT' ( (lv_isOuter_1_0= 'OUTER' ) )? otherlv_2= 'JOIN' ( (lv_isFetch_3_0= 'FETCH' ) )? ( (lv_path_4_0= ruleAliasAttributeExpression ) ) ( (lv_variable_5_0= ruleVariableDeclaration ) ) )
            // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:1997:3: otherlv_0= 'LEFT' ( (lv_isOuter_1_0= 'OUTER' ) )? otherlv_2= 'JOIN' ( (lv_isFetch_3_0= 'FETCH' ) )? ( (lv_path_4_0= ruleAliasAttributeExpression ) ) ( (lv_variable_5_0= ruleVariableDeclaration ) )
            {
            otherlv_0=(Token)match(input,42,FOLLOW_42_in_ruleLeftJoin4512); 

                	newLeafNode(otherlv_0, grammarAccess.getLeftJoinAccess().getLEFTKeyword_0());
                
            // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:2001:1: ( (lv_isOuter_1_0= 'OUTER' ) )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==43) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:2002:1: (lv_isOuter_1_0= 'OUTER' )
                    {
                    // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:2002:1: (lv_isOuter_1_0= 'OUTER' )
                    // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:2003:3: lv_isOuter_1_0= 'OUTER'
                    {
                    lv_isOuter_1_0=(Token)match(input,43,FOLLOW_43_in_ruleLeftJoin4530); 

                            newLeafNode(lv_isOuter_1_0, grammarAccess.getLeftJoinAccess().getIsOuterOUTERKeyword_1_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getLeftJoinRule());
                    	        }
                           		setWithLastConsumed(current, "isOuter", true, "OUTER");
                    	    

                    }


                    }
                    break;

            }

            otherlv_2=(Token)match(input,40,FOLLOW_40_in_ruleLeftJoin4556); 

                	newLeafNode(otherlv_2, grammarAccess.getLeftJoinAccess().getJOINKeyword_2());
                
            // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:2020:1: ( (lv_isFetch_3_0= 'FETCH' ) )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==41) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:2021:1: (lv_isFetch_3_0= 'FETCH' )
                    {
                    // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:2021:1: (lv_isFetch_3_0= 'FETCH' )
                    // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:2022:3: lv_isFetch_3_0= 'FETCH'
                    {
                    lv_isFetch_3_0=(Token)match(input,41,FOLLOW_41_in_ruleLeftJoin4574); 

                            newLeafNode(lv_isFetch_3_0, grammarAccess.getLeftJoinAccess().getIsFetchFETCHKeyword_3_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getLeftJoinRule());
                    	        }
                           		setWithLastConsumed(current, "isFetch", true, "FETCH");
                    	    

                    }


                    }
                    break;

            }

            // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:2035:3: ( (lv_path_4_0= ruleAliasAttributeExpression ) )
            // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:2036:1: (lv_path_4_0= ruleAliasAttributeExpression )
            {
            // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:2036:1: (lv_path_4_0= ruleAliasAttributeExpression )
            // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:2037:3: lv_path_4_0= ruleAliasAttributeExpression
            {
             
            	        newCompositeNode(grammarAccess.getLeftJoinAccess().getPathAliasAttributeExpressionParserRuleCall_4_0()); 
            	    
            pushFollow(FOLLOW_ruleAliasAttributeExpression_in_ruleLeftJoin4609);
            lv_path_4_0=ruleAliasAttributeExpression();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getLeftJoinRule());
            	        }
                   		set(
                   			current, 
                   			"path",
                    		lv_path_4_0, 
                    		"AliasAttributeExpression");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:2053:2: ( (lv_variable_5_0= ruleVariableDeclaration ) )
            // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:2054:1: (lv_variable_5_0= ruleVariableDeclaration )
            {
            // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:2054:1: (lv_variable_5_0= ruleVariableDeclaration )
            // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:2055:3: lv_variable_5_0= ruleVariableDeclaration
            {
             
            	        newCompositeNode(grammarAccess.getLeftJoinAccess().getVariableVariableDeclarationParserRuleCall_5_0()); 
            	    
            pushFollow(FOLLOW_ruleVariableDeclaration_in_ruleLeftJoin4630);
            lv_variable_5_0=ruleVariableDeclaration();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getLeftJoinRule());
            	        }
                   		set(
                   			current, 
                   			"variable",
                    		lv_variable_5_0, 
                    		"VariableDeclaration");
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
    // $ANTLR end "ruleLeftJoin"


    // $ANTLR start "entryRuleInnerJoin"
    // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:2079:1: entryRuleInnerJoin returns [EObject current=null] : iv_ruleInnerJoin= ruleInnerJoin EOF ;
    public final EObject entryRuleInnerJoin() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInnerJoin = null;


        try {
            // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:2080:2: (iv_ruleInnerJoin= ruleInnerJoin EOF )
            // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:2081:2: iv_ruleInnerJoin= ruleInnerJoin EOF
            {
             newCompositeNode(grammarAccess.getInnerJoinRule()); 
            pushFollow(FOLLOW_ruleInnerJoin_in_entryRuleInnerJoin4666);
            iv_ruleInnerJoin=ruleInnerJoin();

            state._fsp--;

             current =iv_ruleInnerJoin; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleInnerJoin4676); 

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
    // $ANTLR end "entryRuleInnerJoin"


    // $ANTLR start "ruleInnerJoin"
    // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:2088:1: ruleInnerJoin returns [EObject current=null] : (otherlv_0= 'INNER' otherlv_1= 'JOIN' ( (lv_isFetch_2_0= 'FETCH' ) )? ( (lv_path_3_0= ruleAliasAttributeExpression ) ) ( (lv_variable_4_0= ruleVariableDeclaration ) ) ) ;
    public final EObject ruleInnerJoin() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_isFetch_2_0=null;
        EObject lv_path_3_0 = null;

        EObject lv_variable_4_0 = null;


         enterRule(); 
            
        try {
            // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:2091:28: ( (otherlv_0= 'INNER' otherlv_1= 'JOIN' ( (lv_isFetch_2_0= 'FETCH' ) )? ( (lv_path_3_0= ruleAliasAttributeExpression ) ) ( (lv_variable_4_0= ruleVariableDeclaration ) ) ) )
            // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:2092:1: (otherlv_0= 'INNER' otherlv_1= 'JOIN' ( (lv_isFetch_2_0= 'FETCH' ) )? ( (lv_path_3_0= ruleAliasAttributeExpression ) ) ( (lv_variable_4_0= ruleVariableDeclaration ) ) )
            {
            // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:2092:1: (otherlv_0= 'INNER' otherlv_1= 'JOIN' ( (lv_isFetch_2_0= 'FETCH' ) )? ( (lv_path_3_0= ruleAliasAttributeExpression ) ) ( (lv_variable_4_0= ruleVariableDeclaration ) ) )
            // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:2092:3: otherlv_0= 'INNER' otherlv_1= 'JOIN' ( (lv_isFetch_2_0= 'FETCH' ) )? ( (lv_path_3_0= ruleAliasAttributeExpression ) ) ( (lv_variable_4_0= ruleVariableDeclaration ) )
            {
            otherlv_0=(Token)match(input,44,FOLLOW_44_in_ruleInnerJoin4713); 

                	newLeafNode(otherlv_0, grammarAccess.getInnerJoinAccess().getINNERKeyword_0());
                
            otherlv_1=(Token)match(input,40,FOLLOW_40_in_ruleInnerJoin4725); 

                	newLeafNode(otherlv_1, grammarAccess.getInnerJoinAccess().getJOINKeyword_1());
                
            // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:2100:1: ( (lv_isFetch_2_0= 'FETCH' ) )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==41) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:2101:1: (lv_isFetch_2_0= 'FETCH' )
                    {
                    // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:2101:1: (lv_isFetch_2_0= 'FETCH' )
                    // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:2102:3: lv_isFetch_2_0= 'FETCH'
                    {
                    lv_isFetch_2_0=(Token)match(input,41,FOLLOW_41_in_ruleInnerJoin4743); 

                            newLeafNode(lv_isFetch_2_0, grammarAccess.getInnerJoinAccess().getIsFetchFETCHKeyword_2_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getInnerJoinRule());
                    	        }
                           		setWithLastConsumed(current, "isFetch", true, "FETCH");
                    	    

                    }


                    }
                    break;

            }

            // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:2115:3: ( (lv_path_3_0= ruleAliasAttributeExpression ) )
            // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:2116:1: (lv_path_3_0= ruleAliasAttributeExpression )
            {
            // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:2116:1: (lv_path_3_0= ruleAliasAttributeExpression )
            // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:2117:3: lv_path_3_0= ruleAliasAttributeExpression
            {
             
            	        newCompositeNode(grammarAccess.getInnerJoinAccess().getPathAliasAttributeExpressionParserRuleCall_3_0()); 
            	    
            pushFollow(FOLLOW_ruleAliasAttributeExpression_in_ruleInnerJoin4778);
            lv_path_3_0=ruleAliasAttributeExpression();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getInnerJoinRule());
            	        }
                   		set(
                   			current, 
                   			"path",
                    		lv_path_3_0, 
                    		"AliasAttributeExpression");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:2133:2: ( (lv_variable_4_0= ruleVariableDeclaration ) )
            // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:2134:1: (lv_variable_4_0= ruleVariableDeclaration )
            {
            // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:2134:1: (lv_variable_4_0= ruleVariableDeclaration )
            // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:2135:3: lv_variable_4_0= ruleVariableDeclaration
            {
             
            	        newCompositeNode(grammarAccess.getInnerJoinAccess().getVariableVariableDeclarationParserRuleCall_4_0()); 
            	    
            pushFollow(FOLLOW_ruleVariableDeclaration_in_ruleInnerJoin4799);
            lv_variable_4_0=ruleVariableDeclaration();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getInnerJoinRule());
            	        }
                   		set(
                   			current, 
                   			"variable",
                    		lv_variable_4_0, 
                    		"VariableDeclaration");
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
    // $ANTLR end "ruleInnerJoin"


    // $ANTLR start "entryRuleWhereClause"
    // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:2159:1: entryRuleWhereClause returns [EObject current=null] : iv_ruleWhereClause= ruleWhereClause EOF ;
    public final EObject entryRuleWhereClause() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWhereClause = null;


        try {
            // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:2160:2: (iv_ruleWhereClause= ruleWhereClause EOF )
            // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:2161:2: iv_ruleWhereClause= ruleWhereClause EOF
            {
             newCompositeNode(grammarAccess.getWhereClauseRule()); 
            pushFollow(FOLLOW_ruleWhereClause_in_entryRuleWhereClause4835);
            iv_ruleWhereClause=ruleWhereClause();

            state._fsp--;

             current =iv_ruleWhereClause; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleWhereClause4845); 

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
    // $ANTLR end "entryRuleWhereClause"


    // $ANTLR start "ruleWhereClause"
    // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:2168:1: ruleWhereClause returns [EObject current=null] : (otherlv_0= 'WHERE' ( (lv_whereEntry_1_0= ruleOrExpression ) ) ) ;
    public final EObject ruleWhereClause() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_whereEntry_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:2171:28: ( (otherlv_0= 'WHERE' ( (lv_whereEntry_1_0= ruleOrExpression ) ) ) )
            // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:2172:1: (otherlv_0= 'WHERE' ( (lv_whereEntry_1_0= ruleOrExpression ) ) )
            {
            // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:2172:1: (otherlv_0= 'WHERE' ( (lv_whereEntry_1_0= ruleOrExpression ) ) )
            // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:2172:3: otherlv_0= 'WHERE' ( (lv_whereEntry_1_0= ruleOrExpression ) )
            {
            otherlv_0=(Token)match(input,45,FOLLOW_45_in_ruleWhereClause4882); 

                	newLeafNode(otherlv_0, grammarAccess.getWhereClauseAccess().getWHEREKeyword_0());
                
            // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:2176:1: ( (lv_whereEntry_1_0= ruleOrExpression ) )
            // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:2177:1: (lv_whereEntry_1_0= ruleOrExpression )
            {
            // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:2177:1: (lv_whereEntry_1_0= ruleOrExpression )
            // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:2178:3: lv_whereEntry_1_0= ruleOrExpression
            {
             
            	        newCompositeNode(grammarAccess.getWhereClauseAccess().getWhereEntryOrExpressionParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleOrExpression_in_ruleWhereClause4903);
            lv_whereEntry_1_0=ruleOrExpression();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getWhereClauseRule());
            	        }
                   		set(
                   			current, 
                   			"whereEntry",
                    		lv_whereEntry_1_0, 
                    		"OrExpression");
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
    // $ANTLR end "ruleWhereClause"


    // $ANTLR start "entryRuleOrExpression"
    // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:2202:1: entryRuleOrExpression returns [EObject current=null] : iv_ruleOrExpression= ruleOrExpression EOF ;
    public final EObject entryRuleOrExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOrExpression = null;


        try {
            // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:2203:2: (iv_ruleOrExpression= ruleOrExpression EOF )
            // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:2204:2: iv_ruleOrExpression= ruleOrExpression EOF
            {
             newCompositeNode(grammarAccess.getOrExpressionRule()); 
            pushFollow(FOLLOW_ruleOrExpression_in_entryRuleOrExpression4939);
            iv_ruleOrExpression=ruleOrExpression();

            state._fsp--;

             current =iv_ruleOrExpression; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleOrExpression4949); 

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
    // $ANTLR end "entryRuleOrExpression"


    // $ANTLR start "ruleOrExpression"
    // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:2211:1: ruleOrExpression returns [EObject current=null] : (this_AndExpression_0= ruleAndExpression ( () (otherlv_2= 'OR' ( (lv_entries_3_0= ruleAndExpression ) ) )+ )? ) ;
    public final EObject ruleOrExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_AndExpression_0 = null;

        EObject lv_entries_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:2214:28: ( (this_AndExpression_0= ruleAndExpression ( () (otherlv_2= 'OR' ( (lv_entries_3_0= ruleAndExpression ) ) )+ )? ) )
            // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:2215:1: (this_AndExpression_0= ruleAndExpression ( () (otherlv_2= 'OR' ( (lv_entries_3_0= ruleAndExpression ) ) )+ )? )
            {
            // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:2215:1: (this_AndExpression_0= ruleAndExpression ( () (otherlv_2= 'OR' ( (lv_entries_3_0= ruleAndExpression ) ) )+ )? )
            // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:2216:5: this_AndExpression_0= ruleAndExpression ( () (otherlv_2= 'OR' ( (lv_entries_3_0= ruleAndExpression ) ) )+ )?
            {
             
                    newCompositeNode(grammarAccess.getOrExpressionAccess().getAndExpressionParserRuleCall_0()); 
                
            pushFollow(FOLLOW_ruleAndExpression_in_ruleOrExpression4996);
            this_AndExpression_0=ruleAndExpression();

            state._fsp--;

             
                    current = this_AndExpression_0; 
                    afterParserOrEnumRuleCall();
                
            // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:2224:1: ( () (otherlv_2= 'OR' ( (lv_entries_3_0= ruleAndExpression ) ) )+ )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==46) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:2224:2: () (otherlv_2= 'OR' ( (lv_entries_3_0= ruleAndExpression ) ) )+
                    {
                    // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:2224:2: ()
                    // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:2225:5: 
                    {

                            current = forceCreateModelElementAndAdd(
                                grammarAccess.getOrExpressionAccess().getOrExpressionEntriesAction_1_0(),
                                current);
                        

                    }

                    // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:2230:2: (otherlv_2= 'OR' ( (lv_entries_3_0= ruleAndExpression ) ) )+
                    int cnt33=0;
                    loop33:
                    do {
                        int alt33=2;
                        int LA33_0 = input.LA(1);

                        if ( (LA33_0==46) ) {
                            alt33=1;
                        }


                        switch (alt33) {
                    	case 1 :
                    	    // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:2230:4: otherlv_2= 'OR' ( (lv_entries_3_0= ruleAndExpression ) )
                    	    {
                    	    otherlv_2=(Token)match(input,46,FOLLOW_46_in_ruleOrExpression5018); 

                    	        	newLeafNode(otherlv_2, grammarAccess.getOrExpressionAccess().getORKeyword_1_1_0());
                    	        
                    	    // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:2234:1: ( (lv_entries_3_0= ruleAndExpression ) )
                    	    // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:2235:1: (lv_entries_3_0= ruleAndExpression )
                    	    {
                    	    // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:2235:1: (lv_entries_3_0= ruleAndExpression )
                    	    // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:2236:3: lv_entries_3_0= ruleAndExpression
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getOrExpressionAccess().getEntriesAndExpressionParserRuleCall_1_1_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleAndExpression_in_ruleOrExpression5039);
                    	    lv_entries_3_0=ruleAndExpression();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getOrExpressionRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"entries",
                    	            		lv_entries_3_0, 
                    	            		"AndExpression");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt33 >= 1 ) break loop33;
                                EarlyExitException eee =
                                    new EarlyExitException(33, input);
                                throw eee;
                        }
                        cnt33++;
                    } while (true);


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
    // $ANTLR end "ruleOrExpression"


    // $ANTLR start "entryRuleAndExpression"
    // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:2260:1: entryRuleAndExpression returns [EObject current=null] : iv_ruleAndExpression= ruleAndExpression EOF ;
    public final EObject entryRuleAndExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAndExpression = null;


        try {
            // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:2261:2: (iv_ruleAndExpression= ruleAndExpression EOF )
            // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:2262:2: iv_ruleAndExpression= ruleAndExpression EOF
            {
             newCompositeNode(grammarAccess.getAndExpressionRule()); 
            pushFollow(FOLLOW_ruleAndExpression_in_entryRuleAndExpression5079);
            iv_ruleAndExpression=ruleAndExpression();

            state._fsp--;

             current =iv_ruleAndExpression; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAndExpression5089); 

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
    // $ANTLR end "entryRuleAndExpression"


    // $ANTLR start "ruleAndExpression"
    // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:2269:1: ruleAndExpression returns [EObject current=null] : (this_ConcreteExpression_0= ruleConcreteExpression ( () (otherlv_2= 'AND' ( (lv_entries_3_0= ruleConcreteExpression ) ) )+ )? ) ;
    public final EObject ruleAndExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_ConcreteExpression_0 = null;

        EObject lv_entries_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:2272:28: ( (this_ConcreteExpression_0= ruleConcreteExpression ( () (otherlv_2= 'AND' ( (lv_entries_3_0= ruleConcreteExpression ) ) )+ )? ) )
            // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:2273:1: (this_ConcreteExpression_0= ruleConcreteExpression ( () (otherlv_2= 'AND' ( (lv_entries_3_0= ruleConcreteExpression ) ) )+ )? )
            {
            // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:2273:1: (this_ConcreteExpression_0= ruleConcreteExpression ( () (otherlv_2= 'AND' ( (lv_entries_3_0= ruleConcreteExpression ) ) )+ )? )
            // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:2274:5: this_ConcreteExpression_0= ruleConcreteExpression ( () (otherlv_2= 'AND' ( (lv_entries_3_0= ruleConcreteExpression ) ) )+ )?
            {
             
                    newCompositeNode(grammarAccess.getAndExpressionAccess().getConcreteExpressionParserRuleCall_0()); 
                
            pushFollow(FOLLOW_ruleConcreteExpression_in_ruleAndExpression5136);
            this_ConcreteExpression_0=ruleConcreteExpression();

            state._fsp--;

             
                    current = this_ConcreteExpression_0; 
                    afterParserOrEnumRuleCall();
                
            // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:2282:1: ( () (otherlv_2= 'AND' ( (lv_entries_3_0= ruleConcreteExpression ) ) )+ )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==47) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:2282:2: () (otherlv_2= 'AND' ( (lv_entries_3_0= ruleConcreteExpression ) ) )+
                    {
                    // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:2282:2: ()
                    // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:2283:5: 
                    {

                            current = forceCreateModelElementAndAdd(
                                grammarAccess.getAndExpressionAccess().getAndExpressionEntriesAction_1_0(),
                                current);
                        

                    }

                    // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:2288:2: (otherlv_2= 'AND' ( (lv_entries_3_0= ruleConcreteExpression ) ) )+
                    int cnt35=0;
                    loop35:
                    do {
                        int alt35=2;
                        int LA35_0 = input.LA(1);

                        if ( (LA35_0==47) ) {
                            alt35=1;
                        }


                        switch (alt35) {
                    	case 1 :
                    	    // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:2288:4: otherlv_2= 'AND' ( (lv_entries_3_0= ruleConcreteExpression ) )
                    	    {
                    	    otherlv_2=(Token)match(input,47,FOLLOW_47_in_ruleAndExpression5158); 

                    	        	newLeafNode(otherlv_2, grammarAccess.getAndExpressionAccess().getANDKeyword_1_1_0());
                    	        
                    	    // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:2292:1: ( (lv_entries_3_0= ruleConcreteExpression ) )
                    	    // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:2293:1: (lv_entries_3_0= ruleConcreteExpression )
                    	    {
                    	    // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:2293:1: (lv_entries_3_0= ruleConcreteExpression )
                    	    // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:2294:3: lv_entries_3_0= ruleConcreteExpression
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getAndExpressionAccess().getEntriesConcreteExpressionParserRuleCall_1_1_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleConcreteExpression_in_ruleAndExpression5179);
                    	    lv_entries_3_0=ruleConcreteExpression();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getAndExpressionRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"entries",
                    	            		lv_entries_3_0, 
                    	            		"ConcreteExpression");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt35 >= 1 ) break loop35;
                                EarlyExitException eee =
                                    new EarlyExitException(35, input);
                                throw eee;
                        }
                        cnt35++;
                    } while (true);


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
    // $ANTLR end "ruleAndExpression"


    // $ANTLR start "entryRuleConcreteExpression"
    // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:2318:1: entryRuleConcreteExpression returns [EObject current=null] : iv_ruleConcreteExpression= ruleConcreteExpression EOF ;
    public final EObject entryRuleConcreteExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConcreteExpression = null;


        try {
            // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:2319:2: (iv_ruleConcreteExpression= ruleConcreteExpression EOF )
            // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:2320:2: iv_ruleConcreteExpression= ruleConcreteExpression EOF
            {
             newCompositeNode(grammarAccess.getConcreteExpressionRule()); 
            pushFollow(FOLLOW_ruleConcreteExpression_in_entryRuleConcreteExpression5219);
            iv_ruleConcreteExpression=ruleConcreteExpression();

            state._fsp--;

             current =iv_ruleConcreteExpression; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleConcreteExpression5229); 

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
    // $ANTLR end "entryRuleConcreteExpression"


    // $ANTLR start "ruleConcreteExpression"
    // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:2327:1: ruleConcreteExpression returns [EObject current=null] : (this_ParExpression_0= ruleParExpression | this_OperatorExpression_1= ruleOperatorExpression | this_ExistsExpression_2= ruleExistsExpression | this_AllExpression_3= ruleAllExpression | this_AnyExpression_4= ruleAnyExpression | this_SomeExpression_5= ruleSomeExpression | this_CollectionExpression_6= ruleCollectionExpression | this_NullComparisonExpression_7= ruleNullComparisonExpression | this_EmptyComparisonExpression_8= ruleEmptyComparisonExpression | this_LikeExpression_9= ruleLikeExpression | this_InExpression_10= ruleInExpression | this_BetweenExpression_11= ruleBetweenExpression ) ;
    public final EObject ruleConcreteExpression() throws RecognitionException {
        EObject current = null;

        EObject this_ParExpression_0 = null;

        EObject this_OperatorExpression_1 = null;

        EObject this_ExistsExpression_2 = null;

        EObject this_AllExpression_3 = null;

        EObject this_AnyExpression_4 = null;

        EObject this_SomeExpression_5 = null;

        EObject this_CollectionExpression_6 = null;

        EObject this_NullComparisonExpression_7 = null;

        EObject this_EmptyComparisonExpression_8 = null;

        EObject this_LikeExpression_9 = null;

        EObject this_InExpression_10 = null;

        EObject this_BetweenExpression_11 = null;


         enterRule(); 
            
        try {
            // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:2330:28: ( (this_ParExpression_0= ruleParExpression | this_OperatorExpression_1= ruleOperatorExpression | this_ExistsExpression_2= ruleExistsExpression | this_AllExpression_3= ruleAllExpression | this_AnyExpression_4= ruleAnyExpression | this_SomeExpression_5= ruleSomeExpression | this_CollectionExpression_6= ruleCollectionExpression | this_NullComparisonExpression_7= ruleNullComparisonExpression | this_EmptyComparisonExpression_8= ruleEmptyComparisonExpression | this_LikeExpression_9= ruleLikeExpression | this_InExpression_10= ruleInExpression | this_BetweenExpression_11= ruleBetweenExpression ) )
            // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:2331:1: (this_ParExpression_0= ruleParExpression | this_OperatorExpression_1= ruleOperatorExpression | this_ExistsExpression_2= ruleExistsExpression | this_AllExpression_3= ruleAllExpression | this_AnyExpression_4= ruleAnyExpression | this_SomeExpression_5= ruleSomeExpression | this_CollectionExpression_6= ruleCollectionExpression | this_NullComparisonExpression_7= ruleNullComparisonExpression | this_EmptyComparisonExpression_8= ruleEmptyComparisonExpression | this_LikeExpression_9= ruleLikeExpression | this_InExpression_10= ruleInExpression | this_BetweenExpression_11= ruleBetweenExpression )
            {
            // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:2331:1: (this_ParExpression_0= ruleParExpression | this_OperatorExpression_1= ruleOperatorExpression | this_ExistsExpression_2= ruleExistsExpression | this_AllExpression_3= ruleAllExpression | this_AnyExpression_4= ruleAnyExpression | this_SomeExpression_5= ruleSomeExpression | this_CollectionExpression_6= ruleCollectionExpression | this_NullComparisonExpression_7= ruleNullComparisonExpression | this_EmptyComparisonExpression_8= ruleEmptyComparisonExpression | this_LikeExpression_9= ruleLikeExpression | this_InExpression_10= ruleInExpression | this_BetweenExpression_11= ruleBetweenExpression )
            int alt37=12;
            alt37 = dfa37.predict(input);
            switch (alt37) {
                case 1 :
                    // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:2332:5: this_ParExpression_0= ruleParExpression
                    {
                     
                            newCompositeNode(grammarAccess.getConcreteExpressionAccess().getParExpressionParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleParExpression_in_ruleConcreteExpression5276);
                    this_ParExpression_0=ruleParExpression();

                    state._fsp--;

                     
                            current = this_ParExpression_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:2342:5: this_OperatorExpression_1= ruleOperatorExpression
                    {
                     
                            newCompositeNode(grammarAccess.getConcreteExpressionAccess().getOperatorExpressionParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleOperatorExpression_in_ruleConcreteExpression5303);
                    this_OperatorExpression_1=ruleOperatorExpression();

                    state._fsp--;

                     
                            current = this_OperatorExpression_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:2352:5: this_ExistsExpression_2= ruleExistsExpression
                    {
                     
                            newCompositeNode(grammarAccess.getConcreteExpressionAccess().getExistsExpressionParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_ruleExistsExpression_in_ruleConcreteExpression5330);
                    this_ExistsExpression_2=ruleExistsExpression();

                    state._fsp--;

                     
                            current = this_ExistsExpression_2; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 4 :
                    // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:2362:5: this_AllExpression_3= ruleAllExpression
                    {
                     
                            newCompositeNode(grammarAccess.getConcreteExpressionAccess().getAllExpressionParserRuleCall_3()); 
                        
                    pushFollow(FOLLOW_ruleAllExpression_in_ruleConcreteExpression5357);
                    this_AllExpression_3=ruleAllExpression();

                    state._fsp--;

                     
                            current = this_AllExpression_3; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 5 :
                    // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:2372:5: this_AnyExpression_4= ruleAnyExpression
                    {
                     
                            newCompositeNode(grammarAccess.getConcreteExpressionAccess().getAnyExpressionParserRuleCall_4()); 
                        
                    pushFollow(FOLLOW_ruleAnyExpression_in_ruleConcreteExpression5384);
                    this_AnyExpression_4=ruleAnyExpression();

                    state._fsp--;

                     
                            current = this_AnyExpression_4; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 6 :
                    // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:2382:5: this_SomeExpression_5= ruleSomeExpression
                    {
                     
                            newCompositeNode(grammarAccess.getConcreteExpressionAccess().getSomeExpressionParserRuleCall_5()); 
                        
                    pushFollow(FOLLOW_ruleSomeExpression_in_ruleConcreteExpression5411);
                    this_SomeExpression_5=ruleSomeExpression();

                    state._fsp--;

                     
                            current = this_SomeExpression_5; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 7 :
                    // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:2392:5: this_CollectionExpression_6= ruleCollectionExpression
                    {
                     
                            newCompositeNode(grammarAccess.getConcreteExpressionAccess().getCollectionExpressionParserRuleCall_6()); 
                        
                    pushFollow(FOLLOW_ruleCollectionExpression_in_ruleConcreteExpression5438);
                    this_CollectionExpression_6=ruleCollectionExpression();

                    state._fsp--;

                     
                            current = this_CollectionExpression_6; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 8 :
                    // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:2402:5: this_NullComparisonExpression_7= ruleNullComparisonExpression
                    {
                     
                            newCompositeNode(grammarAccess.getConcreteExpressionAccess().getNullComparisonExpressionParserRuleCall_7()); 
                        
                    pushFollow(FOLLOW_ruleNullComparisonExpression_in_ruleConcreteExpression5465);
                    this_NullComparisonExpression_7=ruleNullComparisonExpression();

                    state._fsp--;

                     
                            current = this_NullComparisonExpression_7; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 9 :
                    // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:2412:5: this_EmptyComparisonExpression_8= ruleEmptyComparisonExpression
                    {
                     
                            newCompositeNode(grammarAccess.getConcreteExpressionAccess().getEmptyComparisonExpressionParserRuleCall_8()); 
                        
                    pushFollow(FOLLOW_ruleEmptyComparisonExpression_in_ruleConcreteExpression5492);
                    this_EmptyComparisonExpression_8=ruleEmptyComparisonExpression();

                    state._fsp--;

                     
                            current = this_EmptyComparisonExpression_8; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 10 :
                    // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:2422:5: this_LikeExpression_9= ruleLikeExpression
                    {
                     
                            newCompositeNode(grammarAccess.getConcreteExpressionAccess().getLikeExpressionParserRuleCall_9()); 
                        
                    pushFollow(FOLLOW_ruleLikeExpression_in_ruleConcreteExpression5519);
                    this_LikeExpression_9=ruleLikeExpression();

                    state._fsp--;

                     
                            current = this_LikeExpression_9; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 11 :
                    // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:2432:5: this_InExpression_10= ruleInExpression
                    {
                     
                            newCompositeNode(grammarAccess.getConcreteExpressionAccess().getInExpressionParserRuleCall_10()); 
                        
                    pushFollow(FOLLOW_ruleInExpression_in_ruleConcreteExpression5546);
                    this_InExpression_10=ruleInExpression();

                    state._fsp--;

                     
                            current = this_InExpression_10; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 12 :
                    // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:2442:5: this_BetweenExpression_11= ruleBetweenExpression
                    {
                     
                            newCompositeNode(grammarAccess.getConcreteExpressionAccess().getBetweenExpressionParserRuleCall_11()); 
                        
                    pushFollow(FOLLOW_ruleBetweenExpression_in_ruleConcreteExpression5573);
                    this_BetweenExpression_11=ruleBetweenExpression();

                    state._fsp--;

                     
                            current = this_BetweenExpression_11; 
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
    // $ANTLR end "ruleConcreteExpression"


    // $ANTLR start "entryRuleParExpression"
    // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:2458:1: entryRuleParExpression returns [EObject current=null] : iv_ruleParExpression= ruleParExpression EOF ;
    public final EObject entryRuleParExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParExpression = null;


        try {
            // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:2459:2: (iv_ruleParExpression= ruleParExpression EOF )
            // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:2460:2: iv_ruleParExpression= ruleParExpression EOF
            {
             newCompositeNode(grammarAccess.getParExpressionRule()); 
            pushFollow(FOLLOW_ruleParExpression_in_entryRuleParExpression5608);
            iv_ruleParExpression=ruleParExpression();

            state._fsp--;

             current =iv_ruleParExpression; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleParExpression5618); 

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
    // $ANTLR end "entryRuleParExpression"


    // $ANTLR start "ruleParExpression"
    // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:2467:1: ruleParExpression returns [EObject current=null] : (otherlv_0= '(' this_ExpressionTerm_1= ruleExpressionTerm otherlv_2= ')' ) ;
    public final EObject ruleParExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject this_ExpressionTerm_1 = null;


         enterRule(); 
            
        try {
            // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:2470:28: ( (otherlv_0= '(' this_ExpressionTerm_1= ruleExpressionTerm otherlv_2= ')' ) )
            // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:2471:1: (otherlv_0= '(' this_ExpressionTerm_1= ruleExpressionTerm otherlv_2= ')' )
            {
            // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:2471:1: (otherlv_0= '(' this_ExpressionTerm_1= ruleExpressionTerm otherlv_2= ')' )
            // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:2471:3: otherlv_0= '(' this_ExpressionTerm_1= ruleExpressionTerm otherlv_2= ')'
            {
            otherlv_0=(Token)match(input,30,FOLLOW_30_in_ruleParExpression5655); 

                	newLeafNode(otherlv_0, grammarAccess.getParExpressionAccess().getLeftParenthesisKeyword_0());
                
             
                    newCompositeNode(grammarAccess.getParExpressionAccess().getExpressionTermParserRuleCall_1()); 
                
            pushFollow(FOLLOW_ruleExpressionTerm_in_ruleParExpression5677);
            this_ExpressionTerm_1=ruleExpressionTerm();

            state._fsp--;

             
                    current = this_ExpressionTerm_1; 
                    afterParserOrEnumRuleCall();
                
            otherlv_2=(Token)match(input,31,FOLLOW_31_in_ruleParExpression5688); 

                	newLeafNode(otherlv_2, grammarAccess.getParExpressionAccess().getRightParenthesisKeyword_2());
                

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
    // $ANTLR end "ruleParExpression"


    // $ANTLR start "entryRuleOperatorExpression"
    // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:2496:1: entryRuleOperatorExpression returns [EObject current=null] : iv_ruleOperatorExpression= ruleOperatorExpression EOF ;
    public final EObject entryRuleOperatorExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOperatorExpression = null;


        try {
            // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:2497:2: (iv_ruleOperatorExpression= ruleOperatorExpression EOF )
            // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:2498:2: iv_ruleOperatorExpression= ruleOperatorExpression EOF
            {
             newCompositeNode(grammarAccess.getOperatorExpressionRule()); 
            pushFollow(FOLLOW_ruleOperatorExpression_in_entryRuleOperatorExpression5724);
            iv_ruleOperatorExpression=ruleOperatorExpression();

            state._fsp--;

             current =iv_ruleOperatorExpression; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleOperatorExpression5734); 

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
    // $ANTLR end "entryRuleOperatorExpression"


    // $ANTLR start "ruleOperatorExpression"
    // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:2505:1: ruleOperatorExpression returns [EObject current=null] : ( ( (lv_lhs_0_0= ruleVariable ) ) ( (lv_operator_1_0= ruleOperator ) ) ( (lv_rhs_2_0= ruleExpressionTerm ) ) ) ;
    public final EObject ruleOperatorExpression() throws RecognitionException {
        EObject current = null;

        EObject lv_lhs_0_0 = null;

        Enumerator lv_operator_1_0 = null;

        EObject lv_rhs_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:2508:28: ( ( ( (lv_lhs_0_0= ruleVariable ) ) ( (lv_operator_1_0= ruleOperator ) ) ( (lv_rhs_2_0= ruleExpressionTerm ) ) ) )
            // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:2509:1: ( ( (lv_lhs_0_0= ruleVariable ) ) ( (lv_operator_1_0= ruleOperator ) ) ( (lv_rhs_2_0= ruleExpressionTerm ) ) )
            {
            // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:2509:1: ( ( (lv_lhs_0_0= ruleVariable ) ) ( (lv_operator_1_0= ruleOperator ) ) ( (lv_rhs_2_0= ruleExpressionTerm ) ) )
            // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:2509:2: ( (lv_lhs_0_0= ruleVariable ) ) ( (lv_operator_1_0= ruleOperator ) ) ( (lv_rhs_2_0= ruleExpressionTerm ) )
            {
            // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:2509:2: ( (lv_lhs_0_0= ruleVariable ) )
            // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:2510:1: (lv_lhs_0_0= ruleVariable )
            {
            // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:2510:1: (lv_lhs_0_0= ruleVariable )
            // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:2511:3: lv_lhs_0_0= ruleVariable
            {
             
            	        newCompositeNode(grammarAccess.getOperatorExpressionAccess().getLhsVariableParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_ruleVariable_in_ruleOperatorExpression5780);
            lv_lhs_0_0=ruleVariable();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getOperatorExpressionRule());
            	        }
                   		set(
                   			current, 
                   			"lhs",
                    		lv_lhs_0_0, 
                    		"Variable");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:2527:2: ( (lv_operator_1_0= ruleOperator ) )
            // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:2528:1: (lv_operator_1_0= ruleOperator )
            {
            // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:2528:1: (lv_operator_1_0= ruleOperator )
            // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:2529:3: lv_operator_1_0= ruleOperator
            {
             
            	        newCompositeNode(grammarAccess.getOperatorExpressionAccess().getOperatorOperatorEnumRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleOperator_in_ruleOperatorExpression5801);
            lv_operator_1_0=ruleOperator();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getOperatorExpressionRule());
            	        }
                   		set(
                   			current, 
                   			"operator",
                    		lv_operator_1_0, 
                    		"Operator");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:2545:2: ( (lv_rhs_2_0= ruleExpressionTerm ) )
            // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:2546:1: (lv_rhs_2_0= ruleExpressionTerm )
            {
            // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:2546:1: (lv_rhs_2_0= ruleExpressionTerm )
            // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:2547:3: lv_rhs_2_0= ruleExpressionTerm
            {
             
            	        newCompositeNode(grammarAccess.getOperatorExpressionAccess().getRhsExpressionTermParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleExpressionTerm_in_ruleOperatorExpression5822);
            lv_rhs_2_0=ruleExpressionTerm();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getOperatorExpressionRule());
            	        }
                   		set(
                   			current, 
                   			"rhs",
                    		lv_rhs_2_0, 
                    		"ExpressionTerm");
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
    // $ANTLR end "ruleOperatorExpression"


    // $ANTLR start "entryRuleExistsExpression"
    // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:2571:1: entryRuleExistsExpression returns [EObject current=null] : iv_ruleExistsExpression= ruleExistsExpression EOF ;
    public final EObject entryRuleExistsExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExistsExpression = null;


        try {
            // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:2572:2: (iv_ruleExistsExpression= ruleExistsExpression EOF )
            // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:2573:2: iv_ruleExistsExpression= ruleExistsExpression EOF
            {
             newCompositeNode(grammarAccess.getExistsExpressionRule()); 
            pushFollow(FOLLOW_ruleExistsExpression_in_entryRuleExistsExpression5858);
            iv_ruleExistsExpression=ruleExistsExpression();

            state._fsp--;

             current =iv_ruleExistsExpression; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleExistsExpression5868); 

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
    // $ANTLR end "entryRuleExistsExpression"


    // $ANTLR start "ruleExistsExpression"
    // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:2580:1: ruleExistsExpression returns [EObject current=null] : ( ( (lv_isNot_0_0= 'NOT' ) )? otherlv_1= 'EXISTS' ( (lv_query_2_0= ruleQueryExpression ) ) ) ;
    public final EObject ruleExistsExpression() throws RecognitionException {
        EObject current = null;

        Token lv_isNot_0_0=null;
        Token otherlv_1=null;
        EObject lv_query_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:2583:28: ( ( ( (lv_isNot_0_0= 'NOT' ) )? otherlv_1= 'EXISTS' ( (lv_query_2_0= ruleQueryExpression ) ) ) )
            // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:2584:1: ( ( (lv_isNot_0_0= 'NOT' ) )? otherlv_1= 'EXISTS' ( (lv_query_2_0= ruleQueryExpression ) ) )
            {
            // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:2584:1: ( ( (lv_isNot_0_0= 'NOT' ) )? otherlv_1= 'EXISTS' ( (lv_query_2_0= ruleQueryExpression ) ) )
            // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:2584:2: ( (lv_isNot_0_0= 'NOT' ) )? otherlv_1= 'EXISTS' ( (lv_query_2_0= ruleQueryExpression ) )
            {
            // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:2584:2: ( (lv_isNot_0_0= 'NOT' ) )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==48) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:2585:1: (lv_isNot_0_0= 'NOT' )
                    {
                    // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:2585:1: (lv_isNot_0_0= 'NOT' )
                    // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:2586:3: lv_isNot_0_0= 'NOT'
                    {
                    lv_isNot_0_0=(Token)match(input,48,FOLLOW_48_in_ruleExistsExpression5911); 

                            newLeafNode(lv_isNot_0_0, grammarAccess.getExistsExpressionAccess().getIsNotNOTKeyword_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getExistsExpressionRule());
                    	        }
                           		setWithLastConsumed(current, "isNot", true, "NOT");
                    	    

                    }


                    }
                    break;

            }

            otherlv_1=(Token)match(input,49,FOLLOW_49_in_ruleExistsExpression5937); 

                	newLeafNode(otherlv_1, grammarAccess.getExistsExpressionAccess().getEXISTSKeyword_1());
                
            // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:2603:1: ( (lv_query_2_0= ruleQueryExpression ) )
            // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:2604:1: (lv_query_2_0= ruleQueryExpression )
            {
            // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:2604:1: (lv_query_2_0= ruleQueryExpression )
            // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:2605:3: lv_query_2_0= ruleQueryExpression
            {
             
            	        newCompositeNode(grammarAccess.getExistsExpressionAccess().getQueryQueryExpressionParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleQueryExpression_in_ruleExistsExpression5958);
            lv_query_2_0=ruleQueryExpression();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getExistsExpressionRule());
            	        }
                   		set(
                   			current, 
                   			"query",
                    		lv_query_2_0, 
                    		"QueryExpression");
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
    // $ANTLR end "ruleExistsExpression"


    // $ANTLR start "entryRuleAllExpression"
    // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:2629:1: entryRuleAllExpression returns [EObject current=null] : iv_ruleAllExpression= ruleAllExpression EOF ;
    public final EObject entryRuleAllExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAllExpression = null;


        try {
            // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:2630:2: (iv_ruleAllExpression= ruleAllExpression EOF )
            // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:2631:2: iv_ruleAllExpression= ruleAllExpression EOF
            {
             newCompositeNode(grammarAccess.getAllExpressionRule()); 
            pushFollow(FOLLOW_ruleAllExpression_in_entryRuleAllExpression5994);
            iv_ruleAllExpression=ruleAllExpression();

            state._fsp--;

             current =iv_ruleAllExpression; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAllExpression6004); 

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
    // $ANTLR end "entryRuleAllExpression"


    // $ANTLR start "ruleAllExpression"
    // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:2638:1: ruleAllExpression returns [EObject current=null] : (otherlv_0= 'ALL' ( (lv_query_1_0= ruleQueryExpression ) ) ) ;
    public final EObject ruleAllExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_query_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:2641:28: ( (otherlv_0= 'ALL' ( (lv_query_1_0= ruleQueryExpression ) ) ) )
            // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:2642:1: (otherlv_0= 'ALL' ( (lv_query_1_0= ruleQueryExpression ) ) )
            {
            // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:2642:1: (otherlv_0= 'ALL' ( (lv_query_1_0= ruleQueryExpression ) ) )
            // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:2642:3: otherlv_0= 'ALL' ( (lv_query_1_0= ruleQueryExpression ) )
            {
            otherlv_0=(Token)match(input,50,FOLLOW_50_in_ruleAllExpression6041); 

                	newLeafNode(otherlv_0, grammarAccess.getAllExpressionAccess().getALLKeyword_0());
                
            // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:2646:1: ( (lv_query_1_0= ruleQueryExpression ) )
            // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:2647:1: (lv_query_1_0= ruleQueryExpression )
            {
            // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:2647:1: (lv_query_1_0= ruleQueryExpression )
            // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:2648:3: lv_query_1_0= ruleQueryExpression
            {
             
            	        newCompositeNode(grammarAccess.getAllExpressionAccess().getQueryQueryExpressionParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleQueryExpression_in_ruleAllExpression6062);
            lv_query_1_0=ruleQueryExpression();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getAllExpressionRule());
            	        }
                   		set(
                   			current, 
                   			"query",
                    		lv_query_1_0, 
                    		"QueryExpression");
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
    // $ANTLR end "ruleAllExpression"


    // $ANTLR start "entryRuleAnyExpression"
    // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:2672:1: entryRuleAnyExpression returns [EObject current=null] : iv_ruleAnyExpression= ruleAnyExpression EOF ;
    public final EObject entryRuleAnyExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAnyExpression = null;


        try {
            // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:2673:2: (iv_ruleAnyExpression= ruleAnyExpression EOF )
            // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:2674:2: iv_ruleAnyExpression= ruleAnyExpression EOF
            {
             newCompositeNode(grammarAccess.getAnyExpressionRule()); 
            pushFollow(FOLLOW_ruleAnyExpression_in_entryRuleAnyExpression6098);
            iv_ruleAnyExpression=ruleAnyExpression();

            state._fsp--;

             current =iv_ruleAnyExpression; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAnyExpression6108); 

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
    // $ANTLR end "entryRuleAnyExpression"


    // $ANTLR start "ruleAnyExpression"
    // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:2681:1: ruleAnyExpression returns [EObject current=null] : (otherlv_0= 'ANY' ( (lv_query_1_0= ruleQueryExpression ) ) ) ;
    public final EObject ruleAnyExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_query_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:2684:28: ( (otherlv_0= 'ANY' ( (lv_query_1_0= ruleQueryExpression ) ) ) )
            // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:2685:1: (otherlv_0= 'ANY' ( (lv_query_1_0= ruleQueryExpression ) ) )
            {
            // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:2685:1: (otherlv_0= 'ANY' ( (lv_query_1_0= ruleQueryExpression ) ) )
            // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:2685:3: otherlv_0= 'ANY' ( (lv_query_1_0= ruleQueryExpression ) )
            {
            otherlv_0=(Token)match(input,51,FOLLOW_51_in_ruleAnyExpression6145); 

                	newLeafNode(otherlv_0, grammarAccess.getAnyExpressionAccess().getANYKeyword_0());
                
            // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:2689:1: ( (lv_query_1_0= ruleQueryExpression ) )
            // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:2690:1: (lv_query_1_0= ruleQueryExpression )
            {
            // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:2690:1: (lv_query_1_0= ruleQueryExpression )
            // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:2691:3: lv_query_1_0= ruleQueryExpression
            {
             
            	        newCompositeNode(grammarAccess.getAnyExpressionAccess().getQueryQueryExpressionParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleQueryExpression_in_ruleAnyExpression6166);
            lv_query_1_0=ruleQueryExpression();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getAnyExpressionRule());
            	        }
                   		set(
                   			current, 
                   			"query",
                    		lv_query_1_0, 
                    		"QueryExpression");
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
    // $ANTLR end "ruleAnyExpression"


    // $ANTLR start "entryRuleSomeExpression"
    // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:2715:1: entryRuleSomeExpression returns [EObject current=null] : iv_ruleSomeExpression= ruleSomeExpression EOF ;
    public final EObject entryRuleSomeExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSomeExpression = null;


        try {
            // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:2716:2: (iv_ruleSomeExpression= ruleSomeExpression EOF )
            // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:2717:2: iv_ruleSomeExpression= ruleSomeExpression EOF
            {
             newCompositeNode(grammarAccess.getSomeExpressionRule()); 
            pushFollow(FOLLOW_ruleSomeExpression_in_entryRuleSomeExpression6202);
            iv_ruleSomeExpression=ruleSomeExpression();

            state._fsp--;

             current =iv_ruleSomeExpression; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSomeExpression6212); 

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
    // $ANTLR end "entryRuleSomeExpression"


    // $ANTLR start "ruleSomeExpression"
    // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:2724:1: ruleSomeExpression returns [EObject current=null] : (otherlv_0= 'SOME' ( (lv_query_1_0= ruleQueryExpression ) ) ) ;
    public final EObject ruleSomeExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_query_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:2727:28: ( (otherlv_0= 'SOME' ( (lv_query_1_0= ruleQueryExpression ) ) ) )
            // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:2728:1: (otherlv_0= 'SOME' ( (lv_query_1_0= ruleQueryExpression ) ) )
            {
            // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:2728:1: (otherlv_0= 'SOME' ( (lv_query_1_0= ruleQueryExpression ) ) )
            // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:2728:3: otherlv_0= 'SOME' ( (lv_query_1_0= ruleQueryExpression ) )
            {
            otherlv_0=(Token)match(input,52,FOLLOW_52_in_ruleSomeExpression6249); 

                	newLeafNode(otherlv_0, grammarAccess.getSomeExpressionAccess().getSOMEKeyword_0());
                
            // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:2732:1: ( (lv_query_1_0= ruleQueryExpression ) )
            // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:2733:1: (lv_query_1_0= ruleQueryExpression )
            {
            // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:2733:1: (lv_query_1_0= ruleQueryExpression )
            // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:2734:3: lv_query_1_0= ruleQueryExpression
            {
             
            	        newCompositeNode(grammarAccess.getSomeExpressionAccess().getQueryQueryExpressionParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleQueryExpression_in_ruleSomeExpression6270);
            lv_query_1_0=ruleQueryExpression();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getSomeExpressionRule());
            	        }
                   		set(
                   			current, 
                   			"query",
                    		lv_query_1_0, 
                    		"QueryExpression");
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
    // $ANTLR end "ruleSomeExpression"


    // $ANTLR start "entryRuleCollectionExpression"
    // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:2758:1: entryRuleCollectionExpression returns [EObject current=null] : iv_ruleCollectionExpression= ruleCollectionExpression EOF ;
    public final EObject entryRuleCollectionExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCollectionExpression = null;


        try {
            // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:2759:2: (iv_ruleCollectionExpression= ruleCollectionExpression EOF )
            // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:2760:2: iv_ruleCollectionExpression= ruleCollectionExpression EOF
            {
             newCompositeNode(grammarAccess.getCollectionExpressionRule()); 
            pushFollow(FOLLOW_ruleCollectionExpression_in_entryRuleCollectionExpression6306);
            iv_ruleCollectionExpression=ruleCollectionExpression();

            state._fsp--;

             current =iv_ruleCollectionExpression; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCollectionExpression6316); 

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
    // $ANTLR end "entryRuleCollectionExpression"


    // $ANTLR start "ruleCollectionExpression"
    // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:2767:1: ruleCollectionExpression returns [EObject current=null] : ( ( (lv_lhs_0_0= ruleVariable ) ) ( (lv_isNot_1_0= 'NOT' ) )? otherlv_2= 'MEMBER' (otherlv_3= 'OF' )? ( (lv_rhs_4_0= ruleAliasAttributeExpression ) ) ) ;
    public final EObject ruleCollectionExpression() throws RecognitionException {
        EObject current = null;

        Token lv_isNot_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        EObject lv_lhs_0_0 = null;

        EObject lv_rhs_4_0 = null;


         enterRule(); 
            
        try {
            // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:2770:28: ( ( ( (lv_lhs_0_0= ruleVariable ) ) ( (lv_isNot_1_0= 'NOT' ) )? otherlv_2= 'MEMBER' (otherlv_3= 'OF' )? ( (lv_rhs_4_0= ruleAliasAttributeExpression ) ) ) )
            // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:2771:1: ( ( (lv_lhs_0_0= ruleVariable ) ) ( (lv_isNot_1_0= 'NOT' ) )? otherlv_2= 'MEMBER' (otherlv_3= 'OF' )? ( (lv_rhs_4_0= ruleAliasAttributeExpression ) ) )
            {
            // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:2771:1: ( ( (lv_lhs_0_0= ruleVariable ) ) ( (lv_isNot_1_0= 'NOT' ) )? otherlv_2= 'MEMBER' (otherlv_3= 'OF' )? ( (lv_rhs_4_0= ruleAliasAttributeExpression ) ) )
            // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:2771:2: ( (lv_lhs_0_0= ruleVariable ) ) ( (lv_isNot_1_0= 'NOT' ) )? otherlv_2= 'MEMBER' (otherlv_3= 'OF' )? ( (lv_rhs_4_0= ruleAliasAttributeExpression ) )
            {
            // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:2771:2: ( (lv_lhs_0_0= ruleVariable ) )
            // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:2772:1: (lv_lhs_0_0= ruleVariable )
            {
            // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:2772:1: (lv_lhs_0_0= ruleVariable )
            // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:2773:3: lv_lhs_0_0= ruleVariable
            {
             
            	        newCompositeNode(grammarAccess.getCollectionExpressionAccess().getLhsVariableParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_ruleVariable_in_ruleCollectionExpression6362);
            lv_lhs_0_0=ruleVariable();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getCollectionExpressionRule());
            	        }
                   		set(
                   			current, 
                   			"lhs",
                    		lv_lhs_0_0, 
                    		"Variable");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:2789:2: ( (lv_isNot_1_0= 'NOT' ) )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==48) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:2790:1: (lv_isNot_1_0= 'NOT' )
                    {
                    // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:2790:1: (lv_isNot_1_0= 'NOT' )
                    // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:2791:3: lv_isNot_1_0= 'NOT'
                    {
                    lv_isNot_1_0=(Token)match(input,48,FOLLOW_48_in_ruleCollectionExpression6380); 

                            newLeafNode(lv_isNot_1_0, grammarAccess.getCollectionExpressionAccess().getIsNotNOTKeyword_1_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getCollectionExpressionRule());
                    	        }
                           		setWithLastConsumed(current, "isNot", true, "NOT");
                    	    

                    }


                    }
                    break;

            }

            otherlv_2=(Token)match(input,53,FOLLOW_53_in_ruleCollectionExpression6406); 

                	newLeafNode(otherlv_2, grammarAccess.getCollectionExpressionAccess().getMEMBERKeyword_2());
                
            // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:2808:1: (otherlv_3= 'OF' )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==54) ) {
                alt40=1;
            }
            switch (alt40) {
                case 1 :
                    // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:2808:3: otherlv_3= 'OF'
                    {
                    otherlv_3=(Token)match(input,54,FOLLOW_54_in_ruleCollectionExpression6419); 

                        	newLeafNode(otherlv_3, grammarAccess.getCollectionExpressionAccess().getOFKeyword_3());
                        

                    }
                    break;

            }

            // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:2812:3: ( (lv_rhs_4_0= ruleAliasAttributeExpression ) )
            // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:2813:1: (lv_rhs_4_0= ruleAliasAttributeExpression )
            {
            // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:2813:1: (lv_rhs_4_0= ruleAliasAttributeExpression )
            // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:2814:3: lv_rhs_4_0= ruleAliasAttributeExpression
            {
             
            	        newCompositeNode(grammarAccess.getCollectionExpressionAccess().getRhsAliasAttributeExpressionParserRuleCall_4_0()); 
            	    
            pushFollow(FOLLOW_ruleAliasAttributeExpression_in_ruleCollectionExpression6442);
            lv_rhs_4_0=ruleAliasAttributeExpression();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getCollectionExpressionRule());
            	        }
                   		set(
                   			current, 
                   			"rhs",
                    		lv_rhs_4_0, 
                    		"AliasAttributeExpression");
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
    // $ANTLR end "ruleCollectionExpression"


    // $ANTLR start "entryRuleNullComparisonExpression"
    // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:2838:1: entryRuleNullComparisonExpression returns [EObject current=null] : iv_ruleNullComparisonExpression= ruleNullComparisonExpression EOF ;
    public final EObject entryRuleNullComparisonExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNullComparisonExpression = null;


        try {
            // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:2839:2: (iv_ruleNullComparisonExpression= ruleNullComparisonExpression EOF )
            // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:2840:2: iv_ruleNullComparisonExpression= ruleNullComparisonExpression EOF
            {
             newCompositeNode(grammarAccess.getNullComparisonExpressionRule()); 
            pushFollow(FOLLOW_ruleNullComparisonExpression_in_entryRuleNullComparisonExpression6478);
            iv_ruleNullComparisonExpression=ruleNullComparisonExpression();

            state._fsp--;

             current =iv_ruleNullComparisonExpression; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleNullComparisonExpression6488); 

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
    // $ANTLR end "entryRuleNullComparisonExpression"


    // $ANTLR start "ruleNullComparisonExpression"
    // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:2847:1: ruleNullComparisonExpression returns [EObject current=null] : ( ( (lv_lhs_0_0= ruleVariable ) ) otherlv_1= 'IS' ( (lv_isNot_2_0= 'NOT' ) )? otherlv_3= 'NULL' ) ;
    public final EObject ruleNullComparisonExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_isNot_2_0=null;
        Token otherlv_3=null;
        EObject lv_lhs_0_0 = null;


         enterRule(); 
            
        try {
            // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:2850:28: ( ( ( (lv_lhs_0_0= ruleVariable ) ) otherlv_1= 'IS' ( (lv_isNot_2_0= 'NOT' ) )? otherlv_3= 'NULL' ) )
            // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:2851:1: ( ( (lv_lhs_0_0= ruleVariable ) ) otherlv_1= 'IS' ( (lv_isNot_2_0= 'NOT' ) )? otherlv_3= 'NULL' )
            {
            // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:2851:1: ( ( (lv_lhs_0_0= ruleVariable ) ) otherlv_1= 'IS' ( (lv_isNot_2_0= 'NOT' ) )? otherlv_3= 'NULL' )
            // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:2851:2: ( (lv_lhs_0_0= ruleVariable ) ) otherlv_1= 'IS' ( (lv_isNot_2_0= 'NOT' ) )? otherlv_3= 'NULL'
            {
            // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:2851:2: ( (lv_lhs_0_0= ruleVariable ) )
            // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:2852:1: (lv_lhs_0_0= ruleVariable )
            {
            // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:2852:1: (lv_lhs_0_0= ruleVariable )
            // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:2853:3: lv_lhs_0_0= ruleVariable
            {
             
            	        newCompositeNode(grammarAccess.getNullComparisonExpressionAccess().getLhsVariableParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_ruleVariable_in_ruleNullComparisonExpression6534);
            lv_lhs_0_0=ruleVariable();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getNullComparisonExpressionRule());
            	        }
                   		set(
                   			current, 
                   			"lhs",
                    		lv_lhs_0_0, 
                    		"Variable");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_1=(Token)match(input,55,FOLLOW_55_in_ruleNullComparisonExpression6546); 

                	newLeafNode(otherlv_1, grammarAccess.getNullComparisonExpressionAccess().getISKeyword_1());
                
            // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:2873:1: ( (lv_isNot_2_0= 'NOT' ) )?
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==48) ) {
                alt41=1;
            }
            switch (alt41) {
                case 1 :
                    // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:2874:1: (lv_isNot_2_0= 'NOT' )
                    {
                    // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:2874:1: (lv_isNot_2_0= 'NOT' )
                    // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:2875:3: lv_isNot_2_0= 'NOT'
                    {
                    lv_isNot_2_0=(Token)match(input,48,FOLLOW_48_in_ruleNullComparisonExpression6564); 

                            newLeafNode(lv_isNot_2_0, grammarAccess.getNullComparisonExpressionAccess().getIsNotNOTKeyword_2_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getNullComparisonExpressionRule());
                    	        }
                           		setWithLastConsumed(current, "isNot", true, "NOT");
                    	    

                    }


                    }
                    break;

            }

            otherlv_3=(Token)match(input,56,FOLLOW_56_in_ruleNullComparisonExpression6590); 

                	newLeafNode(otherlv_3, grammarAccess.getNullComparisonExpressionAccess().getNULLKeyword_3());
                

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
    // $ANTLR end "ruleNullComparisonExpression"


    // $ANTLR start "entryRuleEmptyComparisonExpression"
    // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:2900:1: entryRuleEmptyComparisonExpression returns [EObject current=null] : iv_ruleEmptyComparisonExpression= ruleEmptyComparisonExpression EOF ;
    public final EObject entryRuleEmptyComparisonExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEmptyComparisonExpression = null;


        try {
            // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:2901:2: (iv_ruleEmptyComparisonExpression= ruleEmptyComparisonExpression EOF )
            // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:2902:2: iv_ruleEmptyComparisonExpression= ruleEmptyComparisonExpression EOF
            {
             newCompositeNode(grammarAccess.getEmptyComparisonExpressionRule()); 
            pushFollow(FOLLOW_ruleEmptyComparisonExpression_in_entryRuleEmptyComparisonExpression6626);
            iv_ruleEmptyComparisonExpression=ruleEmptyComparisonExpression();

            state._fsp--;

             current =iv_ruleEmptyComparisonExpression; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEmptyComparisonExpression6636); 

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
    // $ANTLR end "entryRuleEmptyComparisonExpression"


    // $ANTLR start "ruleEmptyComparisonExpression"
    // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:2909:1: ruleEmptyComparisonExpression returns [EObject current=null] : ( ( (lv_lhs_0_0= ruleVariable ) ) otherlv_1= 'IS' ( (lv_isNot_2_0= 'NOT' ) )? otherlv_3= 'EMPTY' ) ;
    public final EObject ruleEmptyComparisonExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_isNot_2_0=null;
        Token otherlv_3=null;
        EObject lv_lhs_0_0 = null;


         enterRule(); 
            
        try {
            // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:2912:28: ( ( ( (lv_lhs_0_0= ruleVariable ) ) otherlv_1= 'IS' ( (lv_isNot_2_0= 'NOT' ) )? otherlv_3= 'EMPTY' ) )
            // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:2913:1: ( ( (lv_lhs_0_0= ruleVariable ) ) otherlv_1= 'IS' ( (lv_isNot_2_0= 'NOT' ) )? otherlv_3= 'EMPTY' )
            {
            // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:2913:1: ( ( (lv_lhs_0_0= ruleVariable ) ) otherlv_1= 'IS' ( (lv_isNot_2_0= 'NOT' ) )? otherlv_3= 'EMPTY' )
            // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:2913:2: ( (lv_lhs_0_0= ruleVariable ) ) otherlv_1= 'IS' ( (lv_isNot_2_0= 'NOT' ) )? otherlv_3= 'EMPTY'
            {
            // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:2913:2: ( (lv_lhs_0_0= ruleVariable ) )
            // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:2914:1: (lv_lhs_0_0= ruleVariable )
            {
            // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:2914:1: (lv_lhs_0_0= ruleVariable )
            // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:2915:3: lv_lhs_0_0= ruleVariable
            {
             
            	        newCompositeNode(grammarAccess.getEmptyComparisonExpressionAccess().getLhsVariableParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_ruleVariable_in_ruleEmptyComparisonExpression6682);
            lv_lhs_0_0=ruleVariable();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getEmptyComparisonExpressionRule());
            	        }
                   		set(
                   			current, 
                   			"lhs",
                    		lv_lhs_0_0, 
                    		"Variable");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_1=(Token)match(input,55,FOLLOW_55_in_ruleEmptyComparisonExpression6694); 

                	newLeafNode(otherlv_1, grammarAccess.getEmptyComparisonExpressionAccess().getISKeyword_1());
                
            // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:2935:1: ( (lv_isNot_2_0= 'NOT' ) )?
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==48) ) {
                alt42=1;
            }
            switch (alt42) {
                case 1 :
                    // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:2936:1: (lv_isNot_2_0= 'NOT' )
                    {
                    // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:2936:1: (lv_isNot_2_0= 'NOT' )
                    // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:2937:3: lv_isNot_2_0= 'NOT'
                    {
                    lv_isNot_2_0=(Token)match(input,48,FOLLOW_48_in_ruleEmptyComparisonExpression6712); 

                            newLeafNode(lv_isNot_2_0, grammarAccess.getEmptyComparisonExpressionAccess().getIsNotNOTKeyword_2_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getEmptyComparisonExpressionRule());
                    	        }
                           		setWithLastConsumed(current, "isNot", true, "NOT");
                    	    

                    }


                    }
                    break;

            }

            otherlv_3=(Token)match(input,57,FOLLOW_57_in_ruleEmptyComparisonExpression6738); 

                	newLeafNode(otherlv_3, grammarAccess.getEmptyComparisonExpressionAccess().getEMPTYKeyword_3());
                

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
    // $ANTLR end "ruleEmptyComparisonExpression"


    // $ANTLR start "entryRuleLikeExpression"
    // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:2962:1: entryRuleLikeExpression returns [EObject current=null] : iv_ruleLikeExpression= ruleLikeExpression EOF ;
    public final EObject entryRuleLikeExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLikeExpression = null;


        try {
            // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:2963:2: (iv_ruleLikeExpression= ruleLikeExpression EOF )
            // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:2964:2: iv_ruleLikeExpression= ruleLikeExpression EOF
            {
             newCompositeNode(grammarAccess.getLikeExpressionRule()); 
            pushFollow(FOLLOW_ruleLikeExpression_in_entryRuleLikeExpression6774);
            iv_ruleLikeExpression=ruleLikeExpression();

            state._fsp--;

             current =iv_ruleLikeExpression; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleLikeExpression6784); 

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
    // $ANTLR end "entryRuleLikeExpression"


    // $ANTLR start "ruleLikeExpression"
    // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:2971:1: ruleLikeExpression returns [EObject current=null] : ( ( (lv_lhs_0_0= ruleVariable ) ) ( (lv_isNot_1_0= 'NOT' ) )? otherlv_2= 'LIKE' ( (lv_pattern_3_0= RULE_STRING ) ) ) ;
    public final EObject ruleLikeExpression() throws RecognitionException {
        EObject current = null;

        Token lv_isNot_1_0=null;
        Token otherlv_2=null;
        Token lv_pattern_3_0=null;
        EObject lv_lhs_0_0 = null;


         enterRule(); 
            
        try {
            // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:2974:28: ( ( ( (lv_lhs_0_0= ruleVariable ) ) ( (lv_isNot_1_0= 'NOT' ) )? otherlv_2= 'LIKE' ( (lv_pattern_3_0= RULE_STRING ) ) ) )
            // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:2975:1: ( ( (lv_lhs_0_0= ruleVariable ) ) ( (lv_isNot_1_0= 'NOT' ) )? otherlv_2= 'LIKE' ( (lv_pattern_3_0= RULE_STRING ) ) )
            {
            // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:2975:1: ( ( (lv_lhs_0_0= ruleVariable ) ) ( (lv_isNot_1_0= 'NOT' ) )? otherlv_2= 'LIKE' ( (lv_pattern_3_0= RULE_STRING ) ) )
            // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:2975:2: ( (lv_lhs_0_0= ruleVariable ) ) ( (lv_isNot_1_0= 'NOT' ) )? otherlv_2= 'LIKE' ( (lv_pattern_3_0= RULE_STRING ) )
            {
            // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:2975:2: ( (lv_lhs_0_0= ruleVariable ) )
            // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:2976:1: (lv_lhs_0_0= ruleVariable )
            {
            // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:2976:1: (lv_lhs_0_0= ruleVariable )
            // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:2977:3: lv_lhs_0_0= ruleVariable
            {
             
            	        newCompositeNode(grammarAccess.getLikeExpressionAccess().getLhsVariableParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_ruleVariable_in_ruleLikeExpression6830);
            lv_lhs_0_0=ruleVariable();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getLikeExpressionRule());
            	        }
                   		set(
                   			current, 
                   			"lhs",
                    		lv_lhs_0_0, 
                    		"Variable");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:2993:2: ( (lv_isNot_1_0= 'NOT' ) )?
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==48) ) {
                alt43=1;
            }
            switch (alt43) {
                case 1 :
                    // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:2994:1: (lv_isNot_1_0= 'NOT' )
                    {
                    // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:2994:1: (lv_isNot_1_0= 'NOT' )
                    // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:2995:3: lv_isNot_1_0= 'NOT'
                    {
                    lv_isNot_1_0=(Token)match(input,48,FOLLOW_48_in_ruleLikeExpression6848); 

                            newLeafNode(lv_isNot_1_0, grammarAccess.getLikeExpressionAccess().getIsNotNOTKeyword_1_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getLikeExpressionRule());
                    	        }
                           		setWithLastConsumed(current, "isNot", true, "NOT");
                    	    

                    }


                    }
                    break;

            }

            otherlv_2=(Token)match(input,58,FOLLOW_58_in_ruleLikeExpression6874); 

                	newLeafNode(otherlv_2, grammarAccess.getLikeExpressionAccess().getLIKEKeyword_2());
                
            // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:3012:1: ( (lv_pattern_3_0= RULE_STRING ) )
            // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:3013:1: (lv_pattern_3_0= RULE_STRING )
            {
            // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:3013:1: (lv_pattern_3_0= RULE_STRING )
            // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:3014:3: lv_pattern_3_0= RULE_STRING
            {
            lv_pattern_3_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleLikeExpression6891); 

            			newLeafNode(lv_pattern_3_0, grammarAccess.getLikeExpressionAccess().getPatternSTRINGTerminalRuleCall_3_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getLikeExpressionRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"pattern",
                    		lv_pattern_3_0, 
                    		"STRING");
            	    

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
    // $ANTLR end "ruleLikeExpression"


    // $ANTLR start "entryRuleInExpression"
    // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:3038:1: entryRuleInExpression returns [EObject current=null] : iv_ruleInExpression= ruleInExpression EOF ;
    public final EObject entryRuleInExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInExpression = null;


        try {
            // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:3039:2: (iv_ruleInExpression= ruleInExpression EOF )
            // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:3040:2: iv_ruleInExpression= ruleInExpression EOF
            {
             newCompositeNode(grammarAccess.getInExpressionRule()); 
            pushFollow(FOLLOW_ruleInExpression_in_entryRuleInExpression6932);
            iv_ruleInExpression=ruleInExpression();

            state._fsp--;

             current =iv_ruleInExpression; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleInExpression6942); 

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
    // $ANTLR end "entryRuleInExpression"


    // $ANTLR start "ruleInExpression"
    // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:3047:1: ruleInExpression returns [EObject current=null] : (this_InSeqExpression_0= ruleInSeqExpression | this_InQueryExpression_1= ruleInQueryExpression ) ;
    public final EObject ruleInExpression() throws RecognitionException {
        EObject current = null;

        EObject this_InSeqExpression_0 = null;

        EObject this_InQueryExpression_1 = null;


         enterRule(); 
            
        try {
            // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:3050:28: ( (this_InSeqExpression_0= ruleInSeqExpression | this_InQueryExpression_1= ruleInQueryExpression ) )
            // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:3051:1: (this_InSeqExpression_0= ruleInSeqExpression | this_InQueryExpression_1= ruleInQueryExpression )
            {
            // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:3051:1: (this_InSeqExpression_0= ruleInSeqExpression | this_InQueryExpression_1= ruleInQueryExpression )
            int alt44=2;
            alt44 = dfa44.predict(input);
            switch (alt44) {
                case 1 :
                    // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:3052:5: this_InSeqExpression_0= ruleInSeqExpression
                    {
                     
                            newCompositeNode(grammarAccess.getInExpressionAccess().getInSeqExpressionParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleInSeqExpression_in_ruleInExpression6989);
                    this_InSeqExpression_0=ruleInSeqExpression();

                    state._fsp--;

                     
                            current = this_InSeqExpression_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:3062:5: this_InQueryExpression_1= ruleInQueryExpression
                    {
                     
                            newCompositeNode(grammarAccess.getInExpressionAccess().getInQueryExpressionParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleInQueryExpression_in_ruleInExpression7016);
                    this_InQueryExpression_1=ruleInQueryExpression();

                    state._fsp--;

                     
                            current = this_InQueryExpression_1; 
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
    // $ANTLR end "ruleInExpression"


    // $ANTLR start "entryRuleInSeqExpression"
    // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:3078:1: entryRuleInSeqExpression returns [EObject current=null] : iv_ruleInSeqExpression= ruleInSeqExpression EOF ;
    public final EObject entryRuleInSeqExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInSeqExpression = null;


        try {
            // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:3079:2: (iv_ruleInSeqExpression= ruleInSeqExpression EOF )
            // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:3080:2: iv_ruleInSeqExpression= ruleInSeqExpression EOF
            {
             newCompositeNode(grammarAccess.getInSeqExpressionRule()); 
            pushFollow(FOLLOW_ruleInSeqExpression_in_entryRuleInSeqExpression7051);
            iv_ruleInSeqExpression=ruleInSeqExpression();

            state._fsp--;

             current =iv_ruleInSeqExpression; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleInSeqExpression7061); 

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
    // $ANTLR end "entryRuleInSeqExpression"


    // $ANTLR start "ruleInSeqExpression"
    // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:3087:1: ruleInSeqExpression returns [EObject current=null] : ( ( (lv_lhs_0_0= ruleVariable ) ) ( (lv_isNot_1_0= 'NOT' ) )? otherlv_2= 'IN' otherlv_3= '(' ( (lv_items_4_0= ruleVariable ) ) (otherlv_5= ',' ( (lv_items_6_0= ruleVariable ) ) )* otherlv_7= ')' ) ;
    public final EObject ruleInSeqExpression() throws RecognitionException {
        EObject current = null;

        Token lv_isNot_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        EObject lv_lhs_0_0 = null;

        EObject lv_items_4_0 = null;

        EObject lv_items_6_0 = null;


         enterRule(); 
            
        try {
            // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:3090:28: ( ( ( (lv_lhs_0_0= ruleVariable ) ) ( (lv_isNot_1_0= 'NOT' ) )? otherlv_2= 'IN' otherlv_3= '(' ( (lv_items_4_0= ruleVariable ) ) (otherlv_5= ',' ( (lv_items_6_0= ruleVariable ) ) )* otherlv_7= ')' ) )
            // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:3091:1: ( ( (lv_lhs_0_0= ruleVariable ) ) ( (lv_isNot_1_0= 'NOT' ) )? otherlv_2= 'IN' otherlv_3= '(' ( (lv_items_4_0= ruleVariable ) ) (otherlv_5= ',' ( (lv_items_6_0= ruleVariable ) ) )* otherlv_7= ')' )
            {
            // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:3091:1: ( ( (lv_lhs_0_0= ruleVariable ) ) ( (lv_isNot_1_0= 'NOT' ) )? otherlv_2= 'IN' otherlv_3= '(' ( (lv_items_4_0= ruleVariable ) ) (otherlv_5= ',' ( (lv_items_6_0= ruleVariable ) ) )* otherlv_7= ')' )
            // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:3091:2: ( (lv_lhs_0_0= ruleVariable ) ) ( (lv_isNot_1_0= 'NOT' ) )? otherlv_2= 'IN' otherlv_3= '(' ( (lv_items_4_0= ruleVariable ) ) (otherlv_5= ',' ( (lv_items_6_0= ruleVariable ) ) )* otherlv_7= ')'
            {
            // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:3091:2: ( (lv_lhs_0_0= ruleVariable ) )
            // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:3092:1: (lv_lhs_0_0= ruleVariable )
            {
            // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:3092:1: (lv_lhs_0_0= ruleVariable )
            // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:3093:3: lv_lhs_0_0= ruleVariable
            {
             
            	        newCompositeNode(grammarAccess.getInSeqExpressionAccess().getLhsVariableParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_ruleVariable_in_ruleInSeqExpression7107);
            lv_lhs_0_0=ruleVariable();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getInSeqExpressionRule());
            	        }
                   		set(
                   			current, 
                   			"lhs",
                    		lv_lhs_0_0, 
                    		"Variable");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:3109:2: ( (lv_isNot_1_0= 'NOT' ) )?
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( (LA45_0==48) ) {
                alt45=1;
            }
            switch (alt45) {
                case 1 :
                    // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:3110:1: (lv_isNot_1_0= 'NOT' )
                    {
                    // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:3110:1: (lv_isNot_1_0= 'NOT' )
                    // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:3111:3: lv_isNot_1_0= 'NOT'
                    {
                    lv_isNot_1_0=(Token)match(input,48,FOLLOW_48_in_ruleInSeqExpression7125); 

                            newLeafNode(lv_isNot_1_0, grammarAccess.getInSeqExpressionAccess().getIsNotNOTKeyword_1_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getInSeqExpressionRule());
                    	        }
                           		setWithLastConsumed(current, "isNot", true, "NOT");
                    	    

                    }


                    }
                    break;

            }

            otherlv_2=(Token)match(input,39,FOLLOW_39_in_ruleInSeqExpression7151); 

                	newLeafNode(otherlv_2, grammarAccess.getInSeqExpressionAccess().getINKeyword_2());
                
            otherlv_3=(Token)match(input,30,FOLLOW_30_in_ruleInSeqExpression7163); 

                	newLeafNode(otherlv_3, grammarAccess.getInSeqExpressionAccess().getLeftParenthesisKeyword_3());
                
            // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:3132:1: ( (lv_items_4_0= ruleVariable ) )
            // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:3133:1: (lv_items_4_0= ruleVariable )
            {
            // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:3133:1: (lv_items_4_0= ruleVariable )
            // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:3134:3: lv_items_4_0= ruleVariable
            {
             
            	        newCompositeNode(grammarAccess.getInSeqExpressionAccess().getItemsVariableParserRuleCall_4_0()); 
            	    
            pushFollow(FOLLOW_ruleVariable_in_ruleInSeqExpression7184);
            lv_items_4_0=ruleVariable();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getInSeqExpressionRule());
            	        }
                   		add(
                   			current, 
                   			"items",
                    		lv_items_4_0, 
                    		"Variable");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:3150:2: (otherlv_5= ',' ( (lv_items_6_0= ruleVariable ) ) )*
            loop46:
            do {
                int alt46=2;
                int LA46_0 = input.LA(1);

                if ( (LA46_0==19) ) {
                    alt46=1;
                }


                switch (alt46) {
            	case 1 :
            	    // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:3150:4: otherlv_5= ',' ( (lv_items_6_0= ruleVariable ) )
            	    {
            	    otherlv_5=(Token)match(input,19,FOLLOW_19_in_ruleInSeqExpression7197); 

            	        	newLeafNode(otherlv_5, grammarAccess.getInSeqExpressionAccess().getCommaKeyword_5_0());
            	        
            	    // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:3154:1: ( (lv_items_6_0= ruleVariable ) )
            	    // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:3155:1: (lv_items_6_0= ruleVariable )
            	    {
            	    // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:3155:1: (lv_items_6_0= ruleVariable )
            	    // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:3156:3: lv_items_6_0= ruleVariable
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getInSeqExpressionAccess().getItemsVariableParserRuleCall_5_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleVariable_in_ruleInSeqExpression7218);
            	    lv_items_6_0=ruleVariable();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getInSeqExpressionRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"items",
            	            		lv_items_6_0, 
            	            		"Variable");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop46;
                }
            } while (true);

            otherlv_7=(Token)match(input,31,FOLLOW_31_in_ruleInSeqExpression7232); 

                	newLeafNode(otherlv_7, grammarAccess.getInSeqExpressionAccess().getRightParenthesisKeyword_6());
                

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
    // $ANTLR end "ruleInSeqExpression"


    // $ANTLR start "entryRuleInQueryExpression"
    // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:3184:1: entryRuleInQueryExpression returns [EObject current=null] : iv_ruleInQueryExpression= ruleInQueryExpression EOF ;
    public final EObject entryRuleInQueryExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInQueryExpression = null;


        try {
            // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:3185:2: (iv_ruleInQueryExpression= ruleInQueryExpression EOF )
            // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:3186:2: iv_ruleInQueryExpression= ruleInQueryExpression EOF
            {
             newCompositeNode(grammarAccess.getInQueryExpressionRule()); 
            pushFollow(FOLLOW_ruleInQueryExpression_in_entryRuleInQueryExpression7268);
            iv_ruleInQueryExpression=ruleInQueryExpression();

            state._fsp--;

             current =iv_ruleInQueryExpression; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleInQueryExpression7278); 

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
    // $ANTLR end "entryRuleInQueryExpression"


    // $ANTLR start "ruleInQueryExpression"
    // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:3193:1: ruleInQueryExpression returns [EObject current=null] : ( ( (lv_lhs_0_0= ruleVariable ) ) ( (lv_isNot_1_0= 'NOT' ) )? otherlv_2= 'IN' ( (lv_query_3_0= ruleQueryExpression ) ) ) ;
    public final EObject ruleInQueryExpression() throws RecognitionException {
        EObject current = null;

        Token lv_isNot_1_0=null;
        Token otherlv_2=null;
        EObject lv_lhs_0_0 = null;

        EObject lv_query_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:3196:28: ( ( ( (lv_lhs_0_0= ruleVariable ) ) ( (lv_isNot_1_0= 'NOT' ) )? otherlv_2= 'IN' ( (lv_query_3_0= ruleQueryExpression ) ) ) )
            // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:3197:1: ( ( (lv_lhs_0_0= ruleVariable ) ) ( (lv_isNot_1_0= 'NOT' ) )? otherlv_2= 'IN' ( (lv_query_3_0= ruleQueryExpression ) ) )
            {
            // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:3197:1: ( ( (lv_lhs_0_0= ruleVariable ) ) ( (lv_isNot_1_0= 'NOT' ) )? otherlv_2= 'IN' ( (lv_query_3_0= ruleQueryExpression ) ) )
            // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:3197:2: ( (lv_lhs_0_0= ruleVariable ) ) ( (lv_isNot_1_0= 'NOT' ) )? otherlv_2= 'IN' ( (lv_query_3_0= ruleQueryExpression ) )
            {
            // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:3197:2: ( (lv_lhs_0_0= ruleVariable ) )
            // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:3198:1: (lv_lhs_0_0= ruleVariable )
            {
            // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:3198:1: (lv_lhs_0_0= ruleVariable )
            // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:3199:3: lv_lhs_0_0= ruleVariable
            {
             
            	        newCompositeNode(grammarAccess.getInQueryExpressionAccess().getLhsVariableParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_ruleVariable_in_ruleInQueryExpression7324);
            lv_lhs_0_0=ruleVariable();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getInQueryExpressionRule());
            	        }
                   		set(
                   			current, 
                   			"lhs",
                    		lv_lhs_0_0, 
                    		"Variable");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:3215:2: ( (lv_isNot_1_0= 'NOT' ) )?
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( (LA47_0==48) ) {
                alt47=1;
            }
            switch (alt47) {
                case 1 :
                    // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:3216:1: (lv_isNot_1_0= 'NOT' )
                    {
                    // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:3216:1: (lv_isNot_1_0= 'NOT' )
                    // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:3217:3: lv_isNot_1_0= 'NOT'
                    {
                    lv_isNot_1_0=(Token)match(input,48,FOLLOW_48_in_ruleInQueryExpression7342); 

                            newLeafNode(lv_isNot_1_0, grammarAccess.getInQueryExpressionAccess().getIsNotNOTKeyword_1_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getInQueryExpressionRule());
                    	        }
                           		setWithLastConsumed(current, "isNot", true, "NOT");
                    	    

                    }


                    }
                    break;

            }

            otherlv_2=(Token)match(input,39,FOLLOW_39_in_ruleInQueryExpression7368); 

                	newLeafNode(otherlv_2, grammarAccess.getInQueryExpressionAccess().getINKeyword_2());
                
            // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:3234:1: ( (lv_query_3_0= ruleQueryExpression ) )
            // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:3235:1: (lv_query_3_0= ruleQueryExpression )
            {
            // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:3235:1: (lv_query_3_0= ruleQueryExpression )
            // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:3236:3: lv_query_3_0= ruleQueryExpression
            {
             
            	        newCompositeNode(grammarAccess.getInQueryExpressionAccess().getQueryQueryExpressionParserRuleCall_3_0()); 
            	    
            pushFollow(FOLLOW_ruleQueryExpression_in_ruleInQueryExpression7389);
            lv_query_3_0=ruleQueryExpression();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getInQueryExpressionRule());
            	        }
                   		set(
                   			current, 
                   			"query",
                    		lv_query_3_0, 
                    		"QueryExpression");
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
    // $ANTLR end "ruleInQueryExpression"


    // $ANTLR start "entryRuleBetweenExpression"
    // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:3260:1: entryRuleBetweenExpression returns [EObject current=null] : iv_ruleBetweenExpression= ruleBetweenExpression EOF ;
    public final EObject entryRuleBetweenExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBetweenExpression = null;


        try {
            // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:3261:2: (iv_ruleBetweenExpression= ruleBetweenExpression EOF )
            // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:3262:2: iv_ruleBetweenExpression= ruleBetweenExpression EOF
            {
             newCompositeNode(grammarAccess.getBetweenExpressionRule()); 
            pushFollow(FOLLOW_ruleBetweenExpression_in_entryRuleBetweenExpression7425);
            iv_ruleBetweenExpression=ruleBetweenExpression();

            state._fsp--;

             current =iv_ruleBetweenExpression; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBetweenExpression7435); 

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
    // $ANTLR end "entryRuleBetweenExpression"


    // $ANTLR start "ruleBetweenExpression"
    // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:3269:1: ruleBetweenExpression returns [EObject current=null] : ( ( (lv_lhs_0_0= ruleVariable ) ) ( (lv_isNot_1_0= 'NOT' ) )? otherlv_2= 'BETWEEN' ( (lv_min_3_0= ruleValue ) ) otherlv_4= 'AND' ( (lv_max_5_0= ruleValue ) ) ) ;
    public final EObject ruleBetweenExpression() throws RecognitionException {
        EObject current = null;

        Token lv_isNot_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_lhs_0_0 = null;

        EObject lv_min_3_0 = null;

        EObject lv_max_5_0 = null;


         enterRule(); 
            
        try {
            // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:3272:28: ( ( ( (lv_lhs_0_0= ruleVariable ) ) ( (lv_isNot_1_0= 'NOT' ) )? otherlv_2= 'BETWEEN' ( (lv_min_3_0= ruleValue ) ) otherlv_4= 'AND' ( (lv_max_5_0= ruleValue ) ) ) )
            // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:3273:1: ( ( (lv_lhs_0_0= ruleVariable ) ) ( (lv_isNot_1_0= 'NOT' ) )? otherlv_2= 'BETWEEN' ( (lv_min_3_0= ruleValue ) ) otherlv_4= 'AND' ( (lv_max_5_0= ruleValue ) ) )
            {
            // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:3273:1: ( ( (lv_lhs_0_0= ruleVariable ) ) ( (lv_isNot_1_0= 'NOT' ) )? otherlv_2= 'BETWEEN' ( (lv_min_3_0= ruleValue ) ) otherlv_4= 'AND' ( (lv_max_5_0= ruleValue ) ) )
            // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:3273:2: ( (lv_lhs_0_0= ruleVariable ) ) ( (lv_isNot_1_0= 'NOT' ) )? otherlv_2= 'BETWEEN' ( (lv_min_3_0= ruleValue ) ) otherlv_4= 'AND' ( (lv_max_5_0= ruleValue ) )
            {
            // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:3273:2: ( (lv_lhs_0_0= ruleVariable ) )
            // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:3274:1: (lv_lhs_0_0= ruleVariable )
            {
            // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:3274:1: (lv_lhs_0_0= ruleVariable )
            // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:3275:3: lv_lhs_0_0= ruleVariable
            {
             
            	        newCompositeNode(grammarAccess.getBetweenExpressionAccess().getLhsVariableParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_ruleVariable_in_ruleBetweenExpression7481);
            lv_lhs_0_0=ruleVariable();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getBetweenExpressionRule());
            	        }
                   		set(
                   			current, 
                   			"lhs",
                    		lv_lhs_0_0, 
                    		"Variable");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:3291:2: ( (lv_isNot_1_0= 'NOT' ) )?
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( (LA48_0==48) ) {
                alt48=1;
            }
            switch (alt48) {
                case 1 :
                    // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:3292:1: (lv_isNot_1_0= 'NOT' )
                    {
                    // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:3292:1: (lv_isNot_1_0= 'NOT' )
                    // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:3293:3: lv_isNot_1_0= 'NOT'
                    {
                    lv_isNot_1_0=(Token)match(input,48,FOLLOW_48_in_ruleBetweenExpression7499); 

                            newLeafNode(lv_isNot_1_0, grammarAccess.getBetweenExpressionAccess().getIsNotNOTKeyword_1_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getBetweenExpressionRule());
                    	        }
                           		setWithLastConsumed(current, "isNot", true, "NOT");
                    	    

                    }


                    }
                    break;

            }

            otherlv_2=(Token)match(input,59,FOLLOW_59_in_ruleBetweenExpression7525); 

                	newLeafNode(otherlv_2, grammarAccess.getBetweenExpressionAccess().getBETWEENKeyword_2());
                
            // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:3310:1: ( (lv_min_3_0= ruleValue ) )
            // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:3311:1: (lv_min_3_0= ruleValue )
            {
            // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:3311:1: (lv_min_3_0= ruleValue )
            // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:3312:3: lv_min_3_0= ruleValue
            {
             
            	        newCompositeNode(grammarAccess.getBetweenExpressionAccess().getMinValueParserRuleCall_3_0()); 
            	    
            pushFollow(FOLLOW_ruleValue_in_ruleBetweenExpression7546);
            lv_min_3_0=ruleValue();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getBetweenExpressionRule());
            	        }
                   		set(
                   			current, 
                   			"min",
                    		lv_min_3_0, 
                    		"Value");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_4=(Token)match(input,47,FOLLOW_47_in_ruleBetweenExpression7558); 

                	newLeafNode(otherlv_4, grammarAccess.getBetweenExpressionAccess().getANDKeyword_4());
                
            // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:3332:1: ( (lv_max_5_0= ruleValue ) )
            // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:3333:1: (lv_max_5_0= ruleValue )
            {
            // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:3333:1: (lv_max_5_0= ruleValue )
            // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:3334:3: lv_max_5_0= ruleValue
            {
             
            	        newCompositeNode(grammarAccess.getBetweenExpressionAccess().getMaxValueParserRuleCall_5_0()); 
            	    
            pushFollow(FOLLOW_ruleValue_in_ruleBetweenExpression7579);
            lv_max_5_0=ruleValue();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getBetweenExpressionRule());
            	        }
                   		set(
                   			current, 
                   			"max",
                    		lv_max_5_0, 
                    		"Value");
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
    // $ANTLR end "ruleBetweenExpression"


    // $ANTLR start "entryRuleVariable"
    // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:3358:1: entryRuleVariable returns [EObject current=null] : iv_ruleVariable= ruleVariable EOF ;
    public final EObject entryRuleVariable() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariable = null;


        try {
            // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:3359:2: (iv_ruleVariable= ruleVariable EOF )
            // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:3360:2: iv_ruleVariable= ruleVariable EOF
            {
             newCompositeNode(grammarAccess.getVariableRule()); 
            pushFollow(FOLLOW_ruleVariable_in_entryRuleVariable7615);
            iv_ruleVariable=ruleVariable();

            state._fsp--;

             current =iv_ruleVariable; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleVariable7625); 

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
    // $ANTLR end "entryRuleVariable"


    // $ANTLR start "ruleVariable"
    // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:3367:1: ruleVariable returns [EObject current=null] : (this_AliasAttributeExpression_0= ruleAliasAttributeExpression | this_ParameterExpression_1= ruleParameterExpression | this_Value_2= ruleValue ) ;
    public final EObject ruleVariable() throws RecognitionException {
        EObject current = null;

        EObject this_AliasAttributeExpression_0 = null;

        EObject this_ParameterExpression_1 = null;

        EObject this_Value_2 = null;


         enterRule(); 
            
        try {
            // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:3370:28: ( (this_AliasAttributeExpression_0= ruleAliasAttributeExpression | this_ParameterExpression_1= ruleParameterExpression | this_Value_2= ruleValue ) )
            // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:3371:1: (this_AliasAttributeExpression_0= ruleAliasAttributeExpression | this_ParameterExpression_1= ruleParameterExpression | this_Value_2= ruleValue )
            {
            // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:3371:1: (this_AliasAttributeExpression_0= ruleAliasAttributeExpression | this_ParameterExpression_1= ruleParameterExpression | this_Value_2= ruleValue )
            int alt49=3;
            switch ( input.LA(1) ) {
            case RULE_ID:
                {
                alt49=1;
                }
                break;
            case 60:
                {
                alt49=2;
                }
                break;
            case RULE_STRING:
            case RULE_INT:
            case RULE_DATE_LITERAL:
            case RULE_TIME_LITERAL:
            case RULE_TIMESTAMP_LITERAL:
            case 56:
            case 71:
            case 72:
                {
                alt49=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 49, 0, input);

                throw nvae;
            }

            switch (alt49) {
                case 1 :
                    // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:3372:5: this_AliasAttributeExpression_0= ruleAliasAttributeExpression
                    {
                     
                            newCompositeNode(grammarAccess.getVariableAccess().getAliasAttributeExpressionParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleAliasAttributeExpression_in_ruleVariable7672);
                    this_AliasAttributeExpression_0=ruleAliasAttributeExpression();

                    state._fsp--;

                     
                            current = this_AliasAttributeExpression_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:3382:5: this_ParameterExpression_1= ruleParameterExpression
                    {
                     
                            newCompositeNode(grammarAccess.getVariableAccess().getParameterExpressionParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleParameterExpression_in_ruleVariable7699);
                    this_ParameterExpression_1=ruleParameterExpression();

                    state._fsp--;

                     
                            current = this_ParameterExpression_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:3392:5: this_Value_2= ruleValue
                    {
                     
                            newCompositeNode(grammarAccess.getVariableAccess().getValueParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_ruleValue_in_ruleVariable7726);
                    this_Value_2=ruleValue();

                    state._fsp--;

                     
                            current = this_Value_2; 
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
    // $ANTLR end "ruleVariable"


    // $ANTLR start "entryRuleExpressionTerm"
    // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:3408:1: entryRuleExpressionTerm returns [EObject current=null] : iv_ruleExpressionTerm= ruleExpressionTerm EOF ;
    public final EObject entryRuleExpressionTerm() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpressionTerm = null;


        try {
            // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:3409:2: (iv_ruleExpressionTerm= ruleExpressionTerm EOF )
            // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:3410:2: iv_ruleExpressionTerm= ruleExpressionTerm EOF
            {
             newCompositeNode(grammarAccess.getExpressionTermRule()); 
            pushFollow(FOLLOW_ruleExpressionTerm_in_entryRuleExpressionTerm7761);
            iv_ruleExpressionTerm=ruleExpressionTerm();

            state._fsp--;

             current =iv_ruleExpressionTerm; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleExpressionTerm7771); 

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
    // $ANTLR end "entryRuleExpressionTerm"


    // $ANTLR start "ruleExpressionTerm"
    // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:3417:1: ruleExpressionTerm returns [EObject current=null] : (this_Variable_0= ruleVariable | this_QueryExpression_1= ruleQueryExpression ) ;
    public final EObject ruleExpressionTerm() throws RecognitionException {
        EObject current = null;

        EObject this_Variable_0 = null;

        EObject this_QueryExpression_1 = null;


         enterRule(); 
            
        try {
            // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:3420:28: ( (this_Variable_0= ruleVariable | this_QueryExpression_1= ruleQueryExpression ) )
            // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:3421:1: (this_Variable_0= ruleVariable | this_QueryExpression_1= ruleQueryExpression )
            {
            // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:3421:1: (this_Variable_0= ruleVariable | this_QueryExpression_1= ruleQueryExpression )
            int alt50=2;
            int LA50_0 = input.LA(1);

            if ( ((LA50_0>=RULE_ID && LA50_0<=RULE_TIMESTAMP_LITERAL)||LA50_0==56||LA50_0==60||(LA50_0>=71 && LA50_0<=72)) ) {
                alt50=1;
            }
            else if ( (LA50_0==30) ) {
                alt50=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 50, 0, input);

                throw nvae;
            }
            switch (alt50) {
                case 1 :
                    // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:3422:5: this_Variable_0= ruleVariable
                    {
                     
                            newCompositeNode(grammarAccess.getExpressionTermAccess().getVariableParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleVariable_in_ruleExpressionTerm7818);
                    this_Variable_0=ruleVariable();

                    state._fsp--;

                     
                            current = this_Variable_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:3432:5: this_QueryExpression_1= ruleQueryExpression
                    {
                     
                            newCompositeNode(grammarAccess.getExpressionTermAccess().getQueryExpressionParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleQueryExpression_in_ruleExpressionTerm7845);
                    this_QueryExpression_1=ruleQueryExpression();

                    state._fsp--;

                     
                            current = this_QueryExpression_1; 
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
    // $ANTLR end "ruleExpressionTerm"


    // $ANTLR start "entryRuleAliasAttributeExpression"
    // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:3448:1: entryRuleAliasAttributeExpression returns [EObject current=null] : iv_ruleAliasAttributeExpression= ruleAliasAttributeExpression EOF ;
    public final EObject entryRuleAliasAttributeExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAliasAttributeExpression = null;


        try {
            // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:3449:2: (iv_ruleAliasAttributeExpression= ruleAliasAttributeExpression EOF )
            // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:3450:2: iv_ruleAliasAttributeExpression= ruleAliasAttributeExpression EOF
            {
             newCompositeNode(grammarAccess.getAliasAttributeExpressionRule()); 
            pushFollow(FOLLOW_ruleAliasAttributeExpression_in_entryRuleAliasAttributeExpression7880);
            iv_ruleAliasAttributeExpression=ruleAliasAttributeExpression();

            state._fsp--;

             current =iv_ruleAliasAttributeExpression; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAliasAttributeExpression7890); 

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
    // $ANTLR end "entryRuleAliasAttributeExpression"


    // $ANTLR start "ruleAliasAttributeExpression"
    // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:3457:1: ruleAliasAttributeExpression returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= '.' ( (lv_attributes_2_0= RULE_ID ) ) )* ) ;
    public final EObject ruleAliasAttributeExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_attributes_2_0=null;

         enterRule(); 
            
        try {
            // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:3460:28: ( ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= '.' ( (lv_attributes_2_0= RULE_ID ) ) )* ) )
            // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:3461:1: ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= '.' ( (lv_attributes_2_0= RULE_ID ) ) )* )
            {
            // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:3461:1: ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= '.' ( (lv_attributes_2_0= RULE_ID ) ) )* )
            // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:3461:2: ( (otherlv_0= RULE_ID ) ) (otherlv_1= '.' ( (lv_attributes_2_0= RULE_ID ) ) )*
            {
            // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:3461:2: ( (otherlv_0= RULE_ID ) )
            // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:3462:1: (otherlv_0= RULE_ID )
            {
            // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:3462:1: (otherlv_0= RULE_ID )
            // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:3463:3: otherlv_0= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getAliasAttributeExpressionRule());
            	        }
                    
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleAliasAttributeExpression7935); 

            		newLeafNode(otherlv_0, grammarAccess.getAliasAttributeExpressionAccess().getAliasVariableDeclarationCrossReference_0_0()); 
            	

            }


            }

            // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:3474:2: (otherlv_1= '.' ( (lv_attributes_2_0= RULE_ID ) ) )*
            loop51:
            do {
                int alt51=2;
                int LA51_0 = input.LA(1);

                if ( (LA51_0==22) ) {
                    alt51=1;
                }


                switch (alt51) {
            	case 1 :
            	    // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:3474:4: otherlv_1= '.' ( (lv_attributes_2_0= RULE_ID ) )
            	    {
            	    otherlv_1=(Token)match(input,22,FOLLOW_22_in_ruleAliasAttributeExpression7948); 

            	        	newLeafNode(otherlv_1, grammarAccess.getAliasAttributeExpressionAccess().getFullStopKeyword_1_0());
            	        
            	    // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:3478:1: ( (lv_attributes_2_0= RULE_ID ) )
            	    // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:3479:1: (lv_attributes_2_0= RULE_ID )
            	    {
            	    // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:3479:1: (lv_attributes_2_0= RULE_ID )
            	    // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:3480:3: lv_attributes_2_0= RULE_ID
            	    {
            	    lv_attributes_2_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleAliasAttributeExpression7965); 

            	    			newLeafNode(lv_attributes_2_0, grammarAccess.getAliasAttributeExpressionAccess().getAttributesIDTerminalRuleCall_1_1_0()); 
            	    		

            	    	        if (current==null) {
            	    	            current = createModelElement(grammarAccess.getAliasAttributeExpressionRule());
            	    	        }
            	           		addWithLastConsumed(
            	           			current, 
            	           			"attributes",
            	            		lv_attributes_2_0, 
            	            		"ID");
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop51;
                }
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
    // $ANTLR end "ruleAliasAttributeExpression"


    // $ANTLR start "entryRuleParameterExpression"
    // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:3504:1: entryRuleParameterExpression returns [EObject current=null] : iv_ruleParameterExpression= ruleParameterExpression EOF ;
    public final EObject entryRuleParameterExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameterExpression = null;


        try {
            // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:3505:2: (iv_ruleParameterExpression= ruleParameterExpression EOF )
            // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:3506:2: iv_ruleParameterExpression= ruleParameterExpression EOF
            {
             newCompositeNode(grammarAccess.getParameterExpressionRule()); 
            pushFollow(FOLLOW_ruleParameterExpression_in_entryRuleParameterExpression8008);
            iv_ruleParameterExpression=ruleParameterExpression();

            state._fsp--;

             current =iv_ruleParameterExpression; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleParameterExpression8018); 

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
    // $ANTLR end "entryRuleParameterExpression"


    // $ANTLR start "ruleParameterExpression"
    // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:3513:1: ruleParameterExpression returns [EObject current=null] : (otherlv_0= ':' ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleParameterExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;

         enterRule(); 
            
        try {
            // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:3516:28: ( (otherlv_0= ':' ( (lv_name_1_0= RULE_ID ) ) ) )
            // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:3517:1: (otherlv_0= ':' ( (lv_name_1_0= RULE_ID ) ) )
            {
            // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:3517:1: (otherlv_0= ':' ( (lv_name_1_0= RULE_ID ) ) )
            // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:3517:3: otherlv_0= ':' ( (lv_name_1_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,60,FOLLOW_60_in_ruleParameterExpression8055); 

                	newLeafNode(otherlv_0, grammarAccess.getParameterExpressionAccess().getColonKeyword_0());
                
            // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:3521:1: ( (lv_name_1_0= RULE_ID ) )
            // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:3522:1: (lv_name_1_0= RULE_ID )
            {
            // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:3522:1: (lv_name_1_0= RULE_ID )
            // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:3523:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleParameterExpression8072); 

            			newLeafNode(lv_name_1_0, grammarAccess.getParameterExpressionAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getParameterExpressionRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

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
    // $ANTLR end "ruleParameterExpression"


    // $ANTLR start "entryRuleStringFunction"
    // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:3549:1: entryRuleStringFunction returns [EObject current=null] : iv_ruleStringFunction= ruleStringFunction EOF ;
    public final EObject entryRuleStringFunction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStringFunction = null;


        try {
            // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:3550:2: (iv_ruleStringFunction= ruleStringFunction EOF )
            // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:3551:2: iv_ruleStringFunction= ruleStringFunction EOF
            {
             newCompositeNode(grammarAccess.getStringFunctionRule()); 
            pushFollow(FOLLOW_ruleStringFunction_in_entryRuleStringFunction8115);
            iv_ruleStringFunction=ruleStringFunction();

            state._fsp--;

             current =iv_ruleStringFunction; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleStringFunction8125); 

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
    // $ANTLR end "entryRuleStringFunction"


    // $ANTLR start "ruleStringFunction"
    // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:3558:1: ruleStringFunction returns [EObject current=null] : ( ( (lv_name_0_0= ruleStringFunctionName ) ) otherlv_1= '(' ( (lv_params_2_0= ruleVariable ) ) (otherlv_3= ',' ( (lv_params_4_0= ruleVariable ) ) ) otherlv_5= ')' ) ;
    public final EObject ruleStringFunction() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        AntlrDatatypeRuleToken lv_name_0_0 = null;

        EObject lv_params_2_0 = null;

        EObject lv_params_4_0 = null;


         enterRule(); 
            
        try {
            // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:3561:28: ( ( ( (lv_name_0_0= ruleStringFunctionName ) ) otherlv_1= '(' ( (lv_params_2_0= ruleVariable ) ) (otherlv_3= ',' ( (lv_params_4_0= ruleVariable ) ) ) otherlv_5= ')' ) )
            // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:3562:1: ( ( (lv_name_0_0= ruleStringFunctionName ) ) otherlv_1= '(' ( (lv_params_2_0= ruleVariable ) ) (otherlv_3= ',' ( (lv_params_4_0= ruleVariable ) ) ) otherlv_5= ')' )
            {
            // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:3562:1: ( ( (lv_name_0_0= ruleStringFunctionName ) ) otherlv_1= '(' ( (lv_params_2_0= ruleVariable ) ) (otherlv_3= ',' ( (lv_params_4_0= ruleVariable ) ) ) otherlv_5= ')' )
            // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:3562:2: ( (lv_name_0_0= ruleStringFunctionName ) ) otherlv_1= '(' ( (lv_params_2_0= ruleVariable ) ) (otherlv_3= ',' ( (lv_params_4_0= ruleVariable ) ) ) otherlv_5= ')'
            {
            // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:3562:2: ( (lv_name_0_0= ruleStringFunctionName ) )
            // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:3563:1: (lv_name_0_0= ruleStringFunctionName )
            {
            // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:3563:1: (lv_name_0_0= ruleStringFunctionName )
            // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:3564:3: lv_name_0_0= ruleStringFunctionName
            {
             
            	        newCompositeNode(grammarAccess.getStringFunctionAccess().getNameStringFunctionNameParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_ruleStringFunctionName_in_ruleStringFunction8171);
            lv_name_0_0=ruleStringFunctionName();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getStringFunctionRule());
            	        }
                   		set(
                   			current, 
                   			"name",
                    		lv_name_0_0, 
                    		"StringFunctionName");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_1=(Token)match(input,30,FOLLOW_30_in_ruleStringFunction8183); 

                	newLeafNode(otherlv_1, grammarAccess.getStringFunctionAccess().getLeftParenthesisKeyword_1());
                
            // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:3584:1: ( (lv_params_2_0= ruleVariable ) )
            // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:3585:1: (lv_params_2_0= ruleVariable )
            {
            // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:3585:1: (lv_params_2_0= ruleVariable )
            // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:3586:3: lv_params_2_0= ruleVariable
            {
             
            	        newCompositeNode(grammarAccess.getStringFunctionAccess().getParamsVariableParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleVariable_in_ruleStringFunction8204);
            lv_params_2_0=ruleVariable();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getStringFunctionRule());
            	        }
                   		add(
                   			current, 
                   			"params",
                    		lv_params_2_0, 
                    		"Variable");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:3602:2: (otherlv_3= ',' ( (lv_params_4_0= ruleVariable ) ) )
            // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:3602:4: otherlv_3= ',' ( (lv_params_4_0= ruleVariable ) )
            {
            otherlv_3=(Token)match(input,19,FOLLOW_19_in_ruleStringFunction8217); 

                	newLeafNode(otherlv_3, grammarAccess.getStringFunctionAccess().getCommaKeyword_3_0());
                
            // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:3606:1: ( (lv_params_4_0= ruleVariable ) )
            // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:3607:1: (lv_params_4_0= ruleVariable )
            {
            // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:3607:1: (lv_params_4_0= ruleVariable )
            // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:3608:3: lv_params_4_0= ruleVariable
            {
             
            	        newCompositeNode(grammarAccess.getStringFunctionAccess().getParamsVariableParserRuleCall_3_1_0()); 
            	    
            pushFollow(FOLLOW_ruleVariable_in_ruleStringFunction8238);
            lv_params_4_0=ruleVariable();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getStringFunctionRule());
            	        }
                   		add(
                   			current, 
                   			"params",
                    		lv_params_4_0, 
                    		"Variable");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }


            }

            otherlv_5=(Token)match(input,31,FOLLOW_31_in_ruleStringFunction8251); 

                	newLeafNode(otherlv_5, grammarAccess.getStringFunctionAccess().getRightParenthesisKeyword_4());
                

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
    // $ANTLR end "ruleStringFunction"


    // $ANTLR start "entryRuleStringFunctionName"
    // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:3636:1: entryRuleStringFunctionName returns [String current=null] : iv_ruleStringFunctionName= ruleStringFunctionName EOF ;
    public final String entryRuleStringFunctionName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleStringFunctionName = null;


        try {
            // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:3637:2: (iv_ruleStringFunctionName= ruleStringFunctionName EOF )
            // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:3638:2: iv_ruleStringFunctionName= ruleStringFunctionName EOF
            {
             newCompositeNode(grammarAccess.getStringFunctionNameRule()); 
            pushFollow(FOLLOW_ruleStringFunctionName_in_entryRuleStringFunctionName8288);
            iv_ruleStringFunctionName=ruleStringFunctionName();

            state._fsp--;

             current =iv_ruleStringFunctionName.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleStringFunctionName8299); 

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
    // $ANTLR end "entryRuleStringFunctionName"


    // $ANTLR start "ruleStringFunctionName"
    // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:3645:1: ruleStringFunctionName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'CONCAT' | kw= 'SUBSTRING' | kw= 'LOWER' | kw= 'UPPER' | kw= 'LENGTH' | kw= 'LOCATE' ) ;
    public final AntlrDatatypeRuleToken ruleStringFunctionName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:3648:28: ( (kw= 'CONCAT' | kw= 'SUBSTRING' | kw= 'LOWER' | kw= 'UPPER' | kw= 'LENGTH' | kw= 'LOCATE' ) )
            // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:3649:1: (kw= 'CONCAT' | kw= 'SUBSTRING' | kw= 'LOWER' | kw= 'UPPER' | kw= 'LENGTH' | kw= 'LOCATE' )
            {
            // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:3649:1: (kw= 'CONCAT' | kw= 'SUBSTRING' | kw= 'LOWER' | kw= 'UPPER' | kw= 'LENGTH' | kw= 'LOCATE' )
            int alt52=6;
            switch ( input.LA(1) ) {
            case 61:
                {
                alt52=1;
                }
                break;
            case 62:
                {
                alt52=2;
                }
                break;
            case 63:
                {
                alt52=3;
                }
                break;
            case 64:
                {
                alt52=4;
                }
                break;
            case 65:
                {
                alt52=5;
                }
                break;
            case 66:
                {
                alt52=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 52, 0, input);

                throw nvae;
            }

            switch (alt52) {
                case 1 :
                    // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:3650:2: kw= 'CONCAT'
                    {
                    kw=(Token)match(input,61,FOLLOW_61_in_ruleStringFunctionName8337); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getStringFunctionNameAccess().getCONCATKeyword_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:3657:2: kw= 'SUBSTRING'
                    {
                    kw=(Token)match(input,62,FOLLOW_62_in_ruleStringFunctionName8356); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getStringFunctionNameAccess().getSUBSTRINGKeyword_1()); 
                        

                    }
                    break;
                case 3 :
                    // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:3664:2: kw= 'LOWER'
                    {
                    kw=(Token)match(input,63,FOLLOW_63_in_ruleStringFunctionName8375); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getStringFunctionNameAccess().getLOWERKeyword_2()); 
                        

                    }
                    break;
                case 4 :
                    // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:3671:2: kw= 'UPPER'
                    {
                    kw=(Token)match(input,64,FOLLOW_64_in_ruleStringFunctionName8394); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getStringFunctionNameAccess().getUPPERKeyword_3()); 
                        

                    }
                    break;
                case 5 :
                    // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:3678:2: kw= 'LENGTH'
                    {
                    kw=(Token)match(input,65,FOLLOW_65_in_ruleStringFunctionName8413); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getStringFunctionNameAccess().getLENGTHKeyword_4()); 
                        

                    }
                    break;
                case 6 :
                    // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:3685:2: kw= 'LOCATE'
                    {
                    kw=(Token)match(input,66,FOLLOW_66_in_ruleStringFunctionName8432); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getStringFunctionNameAccess().getLOCATEKeyword_5()); 
                        

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
    // $ANTLR end "ruleStringFunctionName"


    // $ANTLR start "entryRuleNumericFunction"
    // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:3698:1: entryRuleNumericFunction returns [EObject current=null] : iv_ruleNumericFunction= ruleNumericFunction EOF ;
    public final EObject entryRuleNumericFunction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNumericFunction = null;


        try {
            // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:3699:2: (iv_ruleNumericFunction= ruleNumericFunction EOF )
            // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:3700:2: iv_ruleNumericFunction= ruleNumericFunction EOF
            {
             newCompositeNode(grammarAccess.getNumericFunctionRule()); 
            pushFollow(FOLLOW_ruleNumericFunction_in_entryRuleNumericFunction8472);
            iv_ruleNumericFunction=ruleNumericFunction();

            state._fsp--;

             current =iv_ruleNumericFunction; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleNumericFunction8482); 

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
    // $ANTLR end "entryRuleNumericFunction"


    // $ANTLR start "ruleNumericFunction"
    // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:3707:1: ruleNumericFunction returns [EObject current=null] : ( ( (lv_name_0_0= ruleNumericFunctionName ) ) otherlv_1= '(' ( (lv_params_2_0= ruleVariable ) ) (otherlv_3= ',' ( (lv_params_4_0= ruleVariable ) ) ) otherlv_5= ')' ) ;
    public final EObject ruleNumericFunction() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        AntlrDatatypeRuleToken lv_name_0_0 = null;

        EObject lv_params_2_0 = null;

        EObject lv_params_4_0 = null;


         enterRule(); 
            
        try {
            // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:3710:28: ( ( ( (lv_name_0_0= ruleNumericFunctionName ) ) otherlv_1= '(' ( (lv_params_2_0= ruleVariable ) ) (otherlv_3= ',' ( (lv_params_4_0= ruleVariable ) ) ) otherlv_5= ')' ) )
            // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:3711:1: ( ( (lv_name_0_0= ruleNumericFunctionName ) ) otherlv_1= '(' ( (lv_params_2_0= ruleVariable ) ) (otherlv_3= ',' ( (lv_params_4_0= ruleVariable ) ) ) otherlv_5= ')' )
            {
            // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:3711:1: ( ( (lv_name_0_0= ruleNumericFunctionName ) ) otherlv_1= '(' ( (lv_params_2_0= ruleVariable ) ) (otherlv_3= ',' ( (lv_params_4_0= ruleVariable ) ) ) otherlv_5= ')' )
            // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:3711:2: ( (lv_name_0_0= ruleNumericFunctionName ) ) otherlv_1= '(' ( (lv_params_2_0= ruleVariable ) ) (otherlv_3= ',' ( (lv_params_4_0= ruleVariable ) ) ) otherlv_5= ')'
            {
            // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:3711:2: ( (lv_name_0_0= ruleNumericFunctionName ) )
            // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:3712:1: (lv_name_0_0= ruleNumericFunctionName )
            {
            // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:3712:1: (lv_name_0_0= ruleNumericFunctionName )
            // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:3713:3: lv_name_0_0= ruleNumericFunctionName
            {
             
            	        newCompositeNode(grammarAccess.getNumericFunctionAccess().getNameNumericFunctionNameParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_ruleNumericFunctionName_in_ruleNumericFunction8528);
            lv_name_0_0=ruleNumericFunctionName();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getNumericFunctionRule());
            	        }
                   		set(
                   			current, 
                   			"name",
                    		lv_name_0_0, 
                    		"NumericFunctionName");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_1=(Token)match(input,30,FOLLOW_30_in_ruleNumericFunction8540); 

                	newLeafNode(otherlv_1, grammarAccess.getNumericFunctionAccess().getLeftParenthesisKeyword_1());
                
            // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:3733:1: ( (lv_params_2_0= ruleVariable ) )
            // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:3734:1: (lv_params_2_0= ruleVariable )
            {
            // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:3734:1: (lv_params_2_0= ruleVariable )
            // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:3735:3: lv_params_2_0= ruleVariable
            {
             
            	        newCompositeNode(grammarAccess.getNumericFunctionAccess().getParamsVariableParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleVariable_in_ruleNumericFunction8561);
            lv_params_2_0=ruleVariable();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getNumericFunctionRule());
            	        }
                   		add(
                   			current, 
                   			"params",
                    		lv_params_2_0, 
                    		"Variable");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:3751:2: (otherlv_3= ',' ( (lv_params_4_0= ruleVariable ) ) )
            // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:3751:4: otherlv_3= ',' ( (lv_params_4_0= ruleVariable ) )
            {
            otherlv_3=(Token)match(input,19,FOLLOW_19_in_ruleNumericFunction8574); 

                	newLeafNode(otherlv_3, grammarAccess.getNumericFunctionAccess().getCommaKeyword_3_0());
                
            // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:3755:1: ( (lv_params_4_0= ruleVariable ) )
            // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:3756:1: (lv_params_4_0= ruleVariable )
            {
            // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:3756:1: (lv_params_4_0= ruleVariable )
            // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:3757:3: lv_params_4_0= ruleVariable
            {
             
            	        newCompositeNode(grammarAccess.getNumericFunctionAccess().getParamsVariableParserRuleCall_3_1_0()); 
            	    
            pushFollow(FOLLOW_ruleVariable_in_ruleNumericFunction8595);
            lv_params_4_0=ruleVariable();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getNumericFunctionRule());
            	        }
                   		add(
                   			current, 
                   			"params",
                    		lv_params_4_0, 
                    		"Variable");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }


            }

            otherlv_5=(Token)match(input,31,FOLLOW_31_in_ruleNumericFunction8608); 

                	newLeafNode(otherlv_5, grammarAccess.getNumericFunctionAccess().getRightParenthesisKeyword_4());
                

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
    // $ANTLR end "ruleNumericFunction"


    // $ANTLR start "entryRuleNumericFunctionName"
    // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:3785:1: entryRuleNumericFunctionName returns [String current=null] : iv_ruleNumericFunctionName= ruleNumericFunctionName EOF ;
    public final String entryRuleNumericFunctionName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleNumericFunctionName = null;


        try {
            // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:3786:2: (iv_ruleNumericFunctionName= ruleNumericFunctionName EOF )
            // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:3787:2: iv_ruleNumericFunctionName= ruleNumericFunctionName EOF
            {
             newCompositeNode(grammarAccess.getNumericFunctionNameRule()); 
            pushFollow(FOLLOW_ruleNumericFunctionName_in_entryRuleNumericFunctionName8645);
            iv_ruleNumericFunctionName=ruleNumericFunctionName();

            state._fsp--;

             current =iv_ruleNumericFunctionName.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleNumericFunctionName8656); 

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
    // $ANTLR end "entryRuleNumericFunctionName"


    // $ANTLR start "ruleNumericFunctionName"
    // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:3794:1: ruleNumericFunctionName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'ABS' | kw= 'SQRT' | kw= 'MOD' | kw= 'SIZE' ) ;
    public final AntlrDatatypeRuleToken ruleNumericFunctionName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:3797:28: ( (kw= 'ABS' | kw= 'SQRT' | kw= 'MOD' | kw= 'SIZE' ) )
            // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:3798:1: (kw= 'ABS' | kw= 'SQRT' | kw= 'MOD' | kw= 'SIZE' )
            {
            // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:3798:1: (kw= 'ABS' | kw= 'SQRT' | kw= 'MOD' | kw= 'SIZE' )
            int alt53=4;
            switch ( input.LA(1) ) {
            case 67:
                {
                alt53=1;
                }
                break;
            case 68:
                {
                alt53=2;
                }
                break;
            case 69:
                {
                alt53=3;
                }
                break;
            case 70:
                {
                alt53=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 53, 0, input);

                throw nvae;
            }

            switch (alt53) {
                case 1 :
                    // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:3799:2: kw= 'ABS'
                    {
                    kw=(Token)match(input,67,FOLLOW_67_in_ruleNumericFunctionName8694); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getNumericFunctionNameAccess().getABSKeyword_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:3806:2: kw= 'SQRT'
                    {
                    kw=(Token)match(input,68,FOLLOW_68_in_ruleNumericFunctionName8713); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getNumericFunctionNameAccess().getSQRTKeyword_1()); 
                        

                    }
                    break;
                case 3 :
                    // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:3813:2: kw= 'MOD'
                    {
                    kw=(Token)match(input,69,FOLLOW_69_in_ruleNumericFunctionName8732); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getNumericFunctionNameAccess().getMODKeyword_2()); 
                        

                    }
                    break;
                case 4 :
                    // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:3820:2: kw= 'SIZE'
                    {
                    kw=(Token)match(input,70,FOLLOW_70_in_ruleNumericFunctionName8751); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getNumericFunctionNameAccess().getSIZEKeyword_3()); 
                        

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
    // $ANTLR end "ruleNumericFunctionName"


    // $ANTLR start "entryRuleValue"
    // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:3835:1: entryRuleValue returns [EObject current=null] : iv_ruleValue= ruleValue EOF ;
    public final EObject entryRuleValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleValue = null;


        try {
            // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:3836:2: (iv_ruleValue= ruleValue EOF )
            // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:3837:2: iv_ruleValue= ruleValue EOF
            {
             newCompositeNode(grammarAccess.getValueRule()); 
            pushFollow(FOLLOW_ruleValue_in_entryRuleValue8793);
            iv_ruleValue=ruleValue();

            state._fsp--;

             current =iv_ruleValue; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleValue8803); 

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
    // $ANTLR end "entryRuleValue"


    // $ANTLR start "ruleValue"
    // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:3844:1: ruleValue returns [EObject current=null] : (this_IntegerExpression_0= ruleIntegerExpression | this_StringExpression_1= ruleStringExpression | this_NullExpression_2= ruleNullExpression | this_BooleanExpression_3= ruleBooleanExpression | this_DateTimeExpression_4= ruleDateTimeExpression ) ;
    public final EObject ruleValue() throws RecognitionException {
        EObject current = null;

        EObject this_IntegerExpression_0 = null;

        EObject this_StringExpression_1 = null;

        EObject this_NullExpression_2 = null;

        EObject this_BooleanExpression_3 = null;

        EObject this_DateTimeExpression_4 = null;


         enterRule(); 
            
        try {
            // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:3847:28: ( (this_IntegerExpression_0= ruleIntegerExpression | this_StringExpression_1= ruleStringExpression | this_NullExpression_2= ruleNullExpression | this_BooleanExpression_3= ruleBooleanExpression | this_DateTimeExpression_4= ruleDateTimeExpression ) )
            // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:3848:1: (this_IntegerExpression_0= ruleIntegerExpression | this_StringExpression_1= ruleStringExpression | this_NullExpression_2= ruleNullExpression | this_BooleanExpression_3= ruleBooleanExpression | this_DateTimeExpression_4= ruleDateTimeExpression )
            {
            // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:3848:1: (this_IntegerExpression_0= ruleIntegerExpression | this_StringExpression_1= ruleStringExpression | this_NullExpression_2= ruleNullExpression | this_BooleanExpression_3= ruleBooleanExpression | this_DateTimeExpression_4= ruleDateTimeExpression )
            int alt54=5;
            switch ( input.LA(1) ) {
            case RULE_INT:
                {
                alt54=1;
                }
                break;
            case RULE_STRING:
                {
                alt54=2;
                }
                break;
            case 56:
                {
                alt54=3;
                }
                break;
            case 71:
            case 72:
                {
                alt54=4;
                }
                break;
            case RULE_DATE_LITERAL:
            case RULE_TIME_LITERAL:
            case RULE_TIMESTAMP_LITERAL:
                {
                alt54=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 54, 0, input);

                throw nvae;
            }

            switch (alt54) {
                case 1 :
                    // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:3849:5: this_IntegerExpression_0= ruleIntegerExpression
                    {
                     
                            newCompositeNode(grammarAccess.getValueAccess().getIntegerExpressionParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleIntegerExpression_in_ruleValue8850);
                    this_IntegerExpression_0=ruleIntegerExpression();

                    state._fsp--;

                     
                            current = this_IntegerExpression_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:3859:5: this_StringExpression_1= ruleStringExpression
                    {
                     
                            newCompositeNode(grammarAccess.getValueAccess().getStringExpressionParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleStringExpression_in_ruleValue8877);
                    this_StringExpression_1=ruleStringExpression();

                    state._fsp--;

                     
                            current = this_StringExpression_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:3869:5: this_NullExpression_2= ruleNullExpression
                    {
                     
                            newCompositeNode(grammarAccess.getValueAccess().getNullExpressionParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_ruleNullExpression_in_ruleValue8904);
                    this_NullExpression_2=ruleNullExpression();

                    state._fsp--;

                     
                            current = this_NullExpression_2; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 4 :
                    // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:3879:5: this_BooleanExpression_3= ruleBooleanExpression
                    {
                     
                            newCompositeNode(grammarAccess.getValueAccess().getBooleanExpressionParserRuleCall_3()); 
                        
                    pushFollow(FOLLOW_ruleBooleanExpression_in_ruleValue8931);
                    this_BooleanExpression_3=ruleBooleanExpression();

                    state._fsp--;

                     
                            current = this_BooleanExpression_3; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 5 :
                    // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:3889:5: this_DateTimeExpression_4= ruleDateTimeExpression
                    {
                     
                            newCompositeNode(grammarAccess.getValueAccess().getDateTimeExpressionParserRuleCall_4()); 
                        
                    pushFollow(FOLLOW_ruleDateTimeExpression_in_ruleValue8958);
                    this_DateTimeExpression_4=ruleDateTimeExpression();

                    state._fsp--;

                     
                            current = this_DateTimeExpression_4; 
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
    // $ANTLR end "ruleValue"


    // $ANTLR start "entryRuleIntegerExpression"
    // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:3905:1: entryRuleIntegerExpression returns [EObject current=null] : iv_ruleIntegerExpression= ruleIntegerExpression EOF ;
    public final EObject entryRuleIntegerExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIntegerExpression = null;


        try {
            // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:3906:2: (iv_ruleIntegerExpression= ruleIntegerExpression EOF )
            // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:3907:2: iv_ruleIntegerExpression= ruleIntegerExpression EOF
            {
             newCompositeNode(grammarAccess.getIntegerExpressionRule()); 
            pushFollow(FOLLOW_ruleIntegerExpression_in_entryRuleIntegerExpression8993);
            iv_ruleIntegerExpression=ruleIntegerExpression();

            state._fsp--;

             current =iv_ruleIntegerExpression; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleIntegerExpression9003); 

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
    // $ANTLR end "entryRuleIntegerExpression"


    // $ANTLR start "ruleIntegerExpression"
    // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:3914:1: ruleIntegerExpression returns [EObject current=null] : ( (lv_value_0_0= RULE_INT ) ) ;
    public final EObject ruleIntegerExpression() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;

         enterRule(); 
            
        try {
            // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:3917:28: ( ( (lv_value_0_0= RULE_INT ) ) )
            // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:3918:1: ( (lv_value_0_0= RULE_INT ) )
            {
            // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:3918:1: ( (lv_value_0_0= RULE_INT ) )
            // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:3919:1: (lv_value_0_0= RULE_INT )
            {
            // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:3919:1: (lv_value_0_0= RULE_INT )
            // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:3920:3: lv_value_0_0= RULE_INT
            {
            lv_value_0_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleIntegerExpression9044); 

            			newLeafNode(lv_value_0_0, grammarAccess.getIntegerExpressionAccess().getValueINTTerminalRuleCall_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getIntegerExpressionRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"value",
                    		lv_value_0_0, 
                    		"INT");
            	    

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
    // $ANTLR end "ruleIntegerExpression"


    // $ANTLR start "entryRuleStringExpression"
    // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:3944:1: entryRuleStringExpression returns [EObject current=null] : iv_ruleStringExpression= ruleStringExpression EOF ;
    public final EObject entryRuleStringExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStringExpression = null;


        try {
            // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:3945:2: (iv_ruleStringExpression= ruleStringExpression EOF )
            // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:3946:2: iv_ruleStringExpression= ruleStringExpression EOF
            {
             newCompositeNode(grammarAccess.getStringExpressionRule()); 
            pushFollow(FOLLOW_ruleStringExpression_in_entryRuleStringExpression9084);
            iv_ruleStringExpression=ruleStringExpression();

            state._fsp--;

             current =iv_ruleStringExpression; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleStringExpression9094); 

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
    // $ANTLR end "entryRuleStringExpression"


    // $ANTLR start "ruleStringExpression"
    // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:3953:1: ruleStringExpression returns [EObject current=null] : ( (lv_value_0_0= RULE_STRING ) ) ;
    public final EObject ruleStringExpression() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;

         enterRule(); 
            
        try {
            // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:3956:28: ( ( (lv_value_0_0= RULE_STRING ) ) )
            // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:3957:1: ( (lv_value_0_0= RULE_STRING ) )
            {
            // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:3957:1: ( (lv_value_0_0= RULE_STRING ) )
            // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:3958:1: (lv_value_0_0= RULE_STRING )
            {
            // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:3958:1: (lv_value_0_0= RULE_STRING )
            // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:3959:3: lv_value_0_0= RULE_STRING
            {
            lv_value_0_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleStringExpression9135); 

            			newLeafNode(lv_value_0_0, grammarAccess.getStringExpressionAccess().getValueSTRINGTerminalRuleCall_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getStringExpressionRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"value",
                    		lv_value_0_0, 
                    		"STRING");
            	    

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
    // $ANTLR end "ruleStringExpression"


    // $ANTLR start "entryRuleNullExpression"
    // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:3983:1: entryRuleNullExpression returns [EObject current=null] : iv_ruleNullExpression= ruleNullExpression EOF ;
    public final EObject entryRuleNullExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNullExpression = null;


        try {
            // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:3984:2: (iv_ruleNullExpression= ruleNullExpression EOF )
            // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:3985:2: iv_ruleNullExpression= ruleNullExpression EOF
            {
             newCompositeNode(grammarAccess.getNullExpressionRule()); 
            pushFollow(FOLLOW_ruleNullExpression_in_entryRuleNullExpression9175);
            iv_ruleNullExpression=ruleNullExpression();

            state._fsp--;

             current =iv_ruleNullExpression; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleNullExpression9185); 

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
    // $ANTLR end "entryRuleNullExpression"


    // $ANTLR start "ruleNullExpression"
    // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:3992:1: ruleNullExpression returns [EObject current=null] : ( (lv_value_0_0= 'NULL' ) ) ;
    public final EObject ruleNullExpression() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;

         enterRule(); 
            
        try {
            // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:3995:28: ( ( (lv_value_0_0= 'NULL' ) ) )
            // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:3996:1: ( (lv_value_0_0= 'NULL' ) )
            {
            // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:3996:1: ( (lv_value_0_0= 'NULL' ) )
            // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:3997:1: (lv_value_0_0= 'NULL' )
            {
            // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:3997:1: (lv_value_0_0= 'NULL' )
            // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:3998:3: lv_value_0_0= 'NULL'
            {
            lv_value_0_0=(Token)match(input,56,FOLLOW_56_in_ruleNullExpression9227); 

                    newLeafNode(lv_value_0_0, grammarAccess.getNullExpressionAccess().getValueNULLKeyword_0());
                

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getNullExpressionRule());
            	        }
                   		setWithLastConsumed(current, "value", lv_value_0_0, "NULL");
            	    

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
    // $ANTLR end "ruleNullExpression"


    // $ANTLR start "entryRuleBooleanExpression"
    // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:4019:1: entryRuleBooleanExpression returns [EObject current=null] : iv_ruleBooleanExpression= ruleBooleanExpression EOF ;
    public final EObject entryRuleBooleanExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBooleanExpression = null;


        try {
            // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:4020:2: (iv_ruleBooleanExpression= ruleBooleanExpression EOF )
            // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:4021:2: iv_ruleBooleanExpression= ruleBooleanExpression EOF
            {
             newCompositeNode(grammarAccess.getBooleanExpressionRule()); 
            pushFollow(FOLLOW_ruleBooleanExpression_in_entryRuleBooleanExpression9275);
            iv_ruleBooleanExpression=ruleBooleanExpression();

            state._fsp--;

             current =iv_ruleBooleanExpression; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBooleanExpression9285); 

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
    // $ANTLR end "entryRuleBooleanExpression"


    // $ANTLR start "ruleBooleanExpression"
    // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:4028:1: ruleBooleanExpression returns [EObject current=null] : ( ( (lv_value_0_1= 'TRUE' | lv_value_0_2= 'FALSE' ) ) ) ;
    public final EObject ruleBooleanExpression() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_1=null;
        Token lv_value_0_2=null;

         enterRule(); 
            
        try {
            // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:4031:28: ( ( ( (lv_value_0_1= 'TRUE' | lv_value_0_2= 'FALSE' ) ) ) )
            // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:4032:1: ( ( (lv_value_0_1= 'TRUE' | lv_value_0_2= 'FALSE' ) ) )
            {
            // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:4032:1: ( ( (lv_value_0_1= 'TRUE' | lv_value_0_2= 'FALSE' ) ) )
            // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:4033:1: ( (lv_value_0_1= 'TRUE' | lv_value_0_2= 'FALSE' ) )
            {
            // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:4033:1: ( (lv_value_0_1= 'TRUE' | lv_value_0_2= 'FALSE' ) )
            // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:4034:1: (lv_value_0_1= 'TRUE' | lv_value_0_2= 'FALSE' )
            {
            // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:4034:1: (lv_value_0_1= 'TRUE' | lv_value_0_2= 'FALSE' )
            int alt55=2;
            int LA55_0 = input.LA(1);

            if ( (LA55_0==71) ) {
                alt55=1;
            }
            else if ( (LA55_0==72) ) {
                alt55=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 55, 0, input);

                throw nvae;
            }
            switch (alt55) {
                case 1 :
                    // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:4035:3: lv_value_0_1= 'TRUE'
                    {
                    lv_value_0_1=(Token)match(input,71,FOLLOW_71_in_ruleBooleanExpression9329); 

                            newLeafNode(lv_value_0_1, grammarAccess.getBooleanExpressionAccess().getValueTRUEKeyword_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getBooleanExpressionRule());
                    	        }
                           		setWithLastConsumed(current, "value", true, null);
                    	    

                    }
                    break;
                case 2 :
                    // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:4047:8: lv_value_0_2= 'FALSE'
                    {
                    lv_value_0_2=(Token)match(input,72,FOLLOW_72_in_ruleBooleanExpression9358); 

                            newLeafNode(lv_value_0_2, grammarAccess.getBooleanExpressionAccess().getValueFALSEKeyword_0_1());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getBooleanExpressionRule());
                    	        }
                           		setWithLastConsumed(current, "value", true, null);
                    	    

                    }
                    break;

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
    // $ANTLR end "ruleBooleanExpression"


    // $ANTLR start "entryRuleDateTimeExpression"
    // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:4070:1: entryRuleDateTimeExpression returns [EObject current=null] : iv_ruleDateTimeExpression= ruleDateTimeExpression EOF ;
    public final EObject entryRuleDateTimeExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDateTimeExpression = null;


        try {
            // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:4071:2: (iv_ruleDateTimeExpression= ruleDateTimeExpression EOF )
            // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:4072:2: iv_ruleDateTimeExpression= ruleDateTimeExpression EOF
            {
             newCompositeNode(grammarAccess.getDateTimeExpressionRule()); 
            pushFollow(FOLLOW_ruleDateTimeExpression_in_entryRuleDateTimeExpression9409);
            iv_ruleDateTimeExpression=ruleDateTimeExpression();

            state._fsp--;

             current =iv_ruleDateTimeExpression; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDateTimeExpression9419); 

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
    // $ANTLR end "entryRuleDateTimeExpression"


    // $ANTLR start "ruleDateTimeExpression"
    // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:4079:1: ruleDateTimeExpression returns [EObject current=null] : ( (lv_value_0_0= ruleLITERAL_TEMPORAL ) ) ;
    public final EObject ruleDateTimeExpression() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_value_0_0 = null;


         enterRule(); 
            
        try {
            // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:4082:28: ( ( (lv_value_0_0= ruleLITERAL_TEMPORAL ) ) )
            // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:4083:1: ( (lv_value_0_0= ruleLITERAL_TEMPORAL ) )
            {
            // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:4083:1: ( (lv_value_0_0= ruleLITERAL_TEMPORAL ) )
            // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:4084:1: (lv_value_0_0= ruleLITERAL_TEMPORAL )
            {
            // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:4084:1: (lv_value_0_0= ruleLITERAL_TEMPORAL )
            // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:4085:3: lv_value_0_0= ruleLITERAL_TEMPORAL
            {
             
            	        newCompositeNode(grammarAccess.getDateTimeExpressionAccess().getValueLITERAL_TEMPORALParserRuleCall_0()); 
            	    
            pushFollow(FOLLOW_ruleLITERAL_TEMPORAL_in_ruleDateTimeExpression9464);
            lv_value_0_0=ruleLITERAL_TEMPORAL();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getDateTimeExpressionRule());
            	        }
                   		set(
                   			current, 
                   			"value",
                    		lv_value_0_0, 
                    		"LITERAL_TEMPORAL");
            	        afterParserOrEnumRuleCall();
            	    

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
    // $ANTLR end "ruleDateTimeExpression"


    // $ANTLR start "entryRuleQueryExpression"
    // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:4109:1: entryRuleQueryExpression returns [EObject current=null] : iv_ruleQueryExpression= ruleQueryExpression EOF ;
    public final EObject entryRuleQueryExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleQueryExpression = null;


        try {
            // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:4110:2: (iv_ruleQueryExpression= ruleQueryExpression EOF )
            // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:4111:2: iv_ruleQueryExpression= ruleQueryExpression EOF
            {
             newCompositeNode(grammarAccess.getQueryExpressionRule()); 
            pushFollow(FOLLOW_ruleQueryExpression_in_entryRuleQueryExpression9499);
            iv_ruleQueryExpression=ruleQueryExpression();

            state._fsp--;

             current =iv_ruleQueryExpression; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleQueryExpression9509); 

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
    // $ANTLR end "entryRuleQueryExpression"


    // $ANTLR start "ruleQueryExpression"
    // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:4118:1: ruleQueryExpression returns [EObject current=null] : (otherlv_0= '(' this_SelectStatement_1= ruleSelectStatement otherlv_2= ')' ) ;
    public final EObject ruleQueryExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject this_SelectStatement_1 = null;


         enterRule(); 
            
        try {
            // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:4121:28: ( (otherlv_0= '(' this_SelectStatement_1= ruleSelectStatement otherlv_2= ')' ) )
            // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:4122:1: (otherlv_0= '(' this_SelectStatement_1= ruleSelectStatement otherlv_2= ')' )
            {
            // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:4122:1: (otherlv_0= '(' this_SelectStatement_1= ruleSelectStatement otherlv_2= ')' )
            // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:4122:3: otherlv_0= '(' this_SelectStatement_1= ruleSelectStatement otherlv_2= ')'
            {
            otherlv_0=(Token)match(input,30,FOLLOW_30_in_ruleQueryExpression9546); 

                	newLeafNode(otherlv_0, grammarAccess.getQueryExpressionAccess().getLeftParenthesisKeyword_0());
                
             
                    newCompositeNode(grammarAccess.getQueryExpressionAccess().getSelectStatementParserRuleCall_1()); 
                
            pushFollow(FOLLOW_ruleSelectStatement_in_ruleQueryExpression9568);
            this_SelectStatement_1=ruleSelectStatement();

            state._fsp--;

             
                    current = this_SelectStatement_1; 
                    afterParserOrEnumRuleCall();
                
            otherlv_2=(Token)match(input,31,FOLLOW_31_in_ruleQueryExpression9579); 

                	newLeafNode(otherlv_2, grammarAccess.getQueryExpressionAccess().getRightParenthesisKeyword_2());
                

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
    // $ANTLR end "ruleQueryExpression"


    // $ANTLR start "entryRuleLITERAL_TEMPORAL"
    // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:4147:1: entryRuleLITERAL_TEMPORAL returns [String current=null] : iv_ruleLITERAL_TEMPORAL= ruleLITERAL_TEMPORAL EOF ;
    public final String entryRuleLITERAL_TEMPORAL() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleLITERAL_TEMPORAL = null;


        try {
            // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:4148:2: (iv_ruleLITERAL_TEMPORAL= ruleLITERAL_TEMPORAL EOF )
            // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:4149:2: iv_ruleLITERAL_TEMPORAL= ruleLITERAL_TEMPORAL EOF
            {
             newCompositeNode(grammarAccess.getLITERAL_TEMPORALRule()); 
            pushFollow(FOLLOW_ruleLITERAL_TEMPORAL_in_entryRuleLITERAL_TEMPORAL9616);
            iv_ruleLITERAL_TEMPORAL=ruleLITERAL_TEMPORAL();

            state._fsp--;

             current =iv_ruleLITERAL_TEMPORAL.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleLITERAL_TEMPORAL9627); 

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
    // $ANTLR end "entryRuleLITERAL_TEMPORAL"


    // $ANTLR start "ruleLITERAL_TEMPORAL"
    // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:4156:1: ruleLITERAL_TEMPORAL returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_DATE_LITERAL_0= RULE_DATE_LITERAL | this_TIME_LITERAL_1= RULE_TIME_LITERAL | this_TIMESTAMP_LITERAL_2= RULE_TIMESTAMP_LITERAL ) ;
    public final AntlrDatatypeRuleToken ruleLITERAL_TEMPORAL() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_DATE_LITERAL_0=null;
        Token this_TIME_LITERAL_1=null;
        Token this_TIMESTAMP_LITERAL_2=null;

         enterRule(); 
            
        try {
            // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:4159:28: ( (this_DATE_LITERAL_0= RULE_DATE_LITERAL | this_TIME_LITERAL_1= RULE_TIME_LITERAL | this_TIMESTAMP_LITERAL_2= RULE_TIMESTAMP_LITERAL ) )
            // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:4160:1: (this_DATE_LITERAL_0= RULE_DATE_LITERAL | this_TIME_LITERAL_1= RULE_TIME_LITERAL | this_TIMESTAMP_LITERAL_2= RULE_TIMESTAMP_LITERAL )
            {
            // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:4160:1: (this_DATE_LITERAL_0= RULE_DATE_LITERAL | this_TIME_LITERAL_1= RULE_TIME_LITERAL | this_TIMESTAMP_LITERAL_2= RULE_TIMESTAMP_LITERAL )
            int alt56=3;
            switch ( input.LA(1) ) {
            case RULE_DATE_LITERAL:
                {
                alt56=1;
                }
                break;
            case RULE_TIME_LITERAL:
                {
                alt56=2;
                }
                break;
            case RULE_TIMESTAMP_LITERAL:
                {
                alt56=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 56, 0, input);

                throw nvae;
            }

            switch (alt56) {
                case 1 :
                    // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:4160:6: this_DATE_LITERAL_0= RULE_DATE_LITERAL
                    {
                    this_DATE_LITERAL_0=(Token)match(input,RULE_DATE_LITERAL,FOLLOW_RULE_DATE_LITERAL_in_ruleLITERAL_TEMPORAL9667); 

                    		current.merge(this_DATE_LITERAL_0);
                        
                     
                        newLeafNode(this_DATE_LITERAL_0, grammarAccess.getLITERAL_TEMPORALAccess().getDATE_LITERALTerminalRuleCall_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:4168:10: this_TIME_LITERAL_1= RULE_TIME_LITERAL
                    {
                    this_TIME_LITERAL_1=(Token)match(input,RULE_TIME_LITERAL,FOLLOW_RULE_TIME_LITERAL_in_ruleLITERAL_TEMPORAL9693); 

                    		current.merge(this_TIME_LITERAL_1);
                        
                     
                        newLeafNode(this_TIME_LITERAL_1, grammarAccess.getLITERAL_TEMPORALAccess().getTIME_LITERALTerminalRuleCall_1()); 
                        

                    }
                    break;
                case 3 :
                    // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:4176:10: this_TIMESTAMP_LITERAL_2= RULE_TIMESTAMP_LITERAL
                    {
                    this_TIMESTAMP_LITERAL_2=(Token)match(input,RULE_TIMESTAMP_LITERAL,FOLLOW_RULE_TIMESTAMP_LITERAL_in_ruleLITERAL_TEMPORAL9719); 

                    		current.merge(this_TIMESTAMP_LITERAL_2);
                        
                     
                        newLeafNode(this_TIMESTAMP_LITERAL_2, grammarAccess.getLITERAL_TEMPORALAccess().getTIMESTAMP_LITERALTerminalRuleCall_2()); 
                        

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
    // $ANTLR end "ruleLITERAL_TEMPORAL"


    // $ANTLR start "entryRuleQualifiedName"
    // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:4191:1: entryRuleQualifiedName returns [String current=null] : iv_ruleQualifiedName= ruleQualifiedName EOF ;
    public final String entryRuleQualifiedName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedName = null;


        try {
            // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:4192:2: (iv_ruleQualifiedName= ruleQualifiedName EOF )
            // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:4193:2: iv_ruleQualifiedName= ruleQualifiedName EOF
            {
             newCompositeNode(grammarAccess.getQualifiedNameRule()); 
            pushFollow(FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName9765);
            iv_ruleQualifiedName=ruleQualifiedName();

            state._fsp--;

             current =iv_ruleQualifiedName.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleQualifiedName9776); 

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
    // $ANTLR end "entryRuleQualifiedName"


    // $ANTLR start "ruleQualifiedName"
    // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:4200:1: ruleQualifiedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;

         enterRule(); 
            
        try {
            // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:4203:28: ( (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) )
            // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:4204:1: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            {
            // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:4204:1: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:4204:6: this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )*
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleQualifiedName9816); 

            		current.merge(this_ID_0);
                
             
                newLeafNode(this_ID_0, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0()); 
                
            // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:4211:1: (kw= '.' this_ID_2= RULE_ID )*
            loop57:
            do {
                int alt57=2;
                int LA57_0 = input.LA(1);

                if ( (LA57_0==22) ) {
                    alt57=1;
                }


                switch (alt57) {
            	case 1 :
            	    // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:4212:2: kw= '.' this_ID_2= RULE_ID
            	    {
            	    kw=(Token)match(input,22,FOLLOW_22_in_ruleQualifiedName9835); 

            	            current.merge(kw);
            	            newLeafNode(kw, grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); 
            	        
            	    this_ID_2=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleQualifiedName9850); 

            	    		current.merge(this_ID_2);
            	        
            	     
            	        newLeafNode(this_ID_2, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1()); 
            	        

            	    }
            	    break;

            	default :
            	    break loop57;
                }
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
    // $ANTLR end "ruleQualifiedName"


    // $ANTLR start "ruleOperator"
    // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:4232:1: ruleOperator returns [Enumerator current=null] : ( (enumLiteral_0= '<' ) | (enumLiteral_1= '>' ) | (enumLiteral_2= '<=' ) | (enumLiteral_3= '>=' ) | (enumLiteral_4= '=' ) | (enumLiteral_5= '!=' ) ) ;
    public final Enumerator ruleOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;
        Token enumLiteral_5=null;

         enterRule(); 
        try {
            // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:4234:28: ( ( (enumLiteral_0= '<' ) | (enumLiteral_1= '>' ) | (enumLiteral_2= '<=' ) | (enumLiteral_3= '>=' ) | (enumLiteral_4= '=' ) | (enumLiteral_5= '!=' ) ) )
            // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:4235:1: ( (enumLiteral_0= '<' ) | (enumLiteral_1= '>' ) | (enumLiteral_2= '<=' ) | (enumLiteral_3= '>=' ) | (enumLiteral_4= '=' ) | (enumLiteral_5= '!=' ) )
            {
            // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:4235:1: ( (enumLiteral_0= '<' ) | (enumLiteral_1= '>' ) | (enumLiteral_2= '<=' ) | (enumLiteral_3= '>=' ) | (enumLiteral_4= '=' ) | (enumLiteral_5= '!=' ) )
            int alt58=6;
            switch ( input.LA(1) ) {
            case 73:
                {
                alt58=1;
                }
                break;
            case 74:
                {
                alt58=2;
                }
                break;
            case 75:
                {
                alt58=3;
                }
                break;
            case 76:
                {
                alt58=4;
                }
                break;
            case 25:
                {
                alt58=5;
                }
                break;
            case 77:
                {
                alt58=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 58, 0, input);

                throw nvae;
            }

            switch (alt58) {
                case 1 :
                    // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:4235:2: (enumLiteral_0= '<' )
                    {
                    // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:4235:2: (enumLiteral_0= '<' )
                    // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:4235:4: enumLiteral_0= '<'
                    {
                    enumLiteral_0=(Token)match(input,73,FOLLOW_73_in_ruleOperator9911); 

                            current = grammarAccess.getOperatorAccess().getLessThenEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getOperatorAccess().getLessThenEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:4241:6: (enumLiteral_1= '>' )
                    {
                    // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:4241:6: (enumLiteral_1= '>' )
                    // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:4241:8: enumLiteral_1= '>'
                    {
                    enumLiteral_1=(Token)match(input,74,FOLLOW_74_in_ruleOperator9928); 

                            current = grammarAccess.getOperatorAccess().getGreaterThenEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_1, grammarAccess.getOperatorAccess().getGreaterThenEnumLiteralDeclaration_1()); 
                        

                    }


                    }
                    break;
                case 3 :
                    // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:4247:6: (enumLiteral_2= '<=' )
                    {
                    // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:4247:6: (enumLiteral_2= '<=' )
                    // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:4247:8: enumLiteral_2= '<='
                    {
                    enumLiteral_2=(Token)match(input,75,FOLLOW_75_in_ruleOperator9945); 

                            current = grammarAccess.getOperatorAccess().getLessEqualEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_2, grammarAccess.getOperatorAccess().getLessEqualEnumLiteralDeclaration_2()); 
                        

                    }


                    }
                    break;
                case 4 :
                    // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:4253:6: (enumLiteral_3= '>=' )
                    {
                    // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:4253:6: (enumLiteral_3= '>=' )
                    // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:4253:8: enumLiteral_3= '>='
                    {
                    enumLiteral_3=(Token)match(input,76,FOLLOW_76_in_ruleOperator9962); 

                            current = grammarAccess.getOperatorAccess().getGreaterEqualEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_3, grammarAccess.getOperatorAccess().getGreaterEqualEnumLiteralDeclaration_3()); 
                        

                    }


                    }
                    break;
                case 5 :
                    // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:4259:6: (enumLiteral_4= '=' )
                    {
                    // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:4259:6: (enumLiteral_4= '=' )
                    // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:4259:8: enumLiteral_4= '='
                    {
                    enumLiteral_4=(Token)match(input,25,FOLLOW_25_in_ruleOperator9979); 

                            current = grammarAccess.getOperatorAccess().getEqualEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_4, grammarAccess.getOperatorAccess().getEqualEnumLiteralDeclaration_4()); 
                        

                    }


                    }
                    break;
                case 6 :
                    // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:4265:6: (enumLiteral_5= '!=' )
                    {
                    // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:4265:6: (enumLiteral_5= '!=' )
                    // ../org.yazgel.jpql.xtext/src-gen/org/yazgel/jpql/xtext/parser/antlr/internal/InternalJPQL.g:4265:8: enumLiteral_5= '!='
                    {
                    enumLiteral_5=(Token)match(input,77,FOLLOW_77_in_ruleOperator9996); 

                            current = grammarAccess.getOperatorAccess().getNotEqualEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_5, grammarAccess.getOperatorAccess().getNotEqualEnumLiteralDeclaration_5()); 
                        

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
    // $ANTLR end "ruleOperator"

    // Delegated rules


    protected DFA26 dfa26 = new DFA26(this);
    protected DFA37 dfa37 = new DFA37(this);
    protected DFA44 dfa44 = new DFA44(this);
    static final String DFA26_eotS =
        "\6\uffff";
    static final String DFA26_eofS =
        "\1\uffff\1\4\3\uffff\1\4";
    static final String DFA26_minS =
        "\3\4\2\uffff\1\4";
    static final String DFA26_maxS =
        "\1\4\1\55\1\4\2\uffff\1\55";
    static final String DFA26_acceptS =
        "\3\uffff\1\2\1\1\1\uffff";
    static final String DFA26_specialS =
        "\6\uffff}>";
    static final String[] DFA26_transitionS = {
            "\1\1",
            "\1\3\13\uffff\2\4\1\uffff\1\4\2\uffff\1\2\2\4\1\uffff\2\4"+
            "\3\uffff\1\4\5\uffff\1\4\1\3\6\uffff\1\4",
            "\1\5",
            "",
            "",
            "\1\3\13\uffff\2\4\1\uffff\1\4\2\uffff\1\2\2\4\1\uffff\2\4"+
            "\3\uffff\1\4\5\uffff\1\4\1\3\6\uffff\1\4"
    };

    static final short[] DFA26_eot = DFA.unpackEncodedString(DFA26_eotS);
    static final short[] DFA26_eof = DFA.unpackEncodedString(DFA26_eofS);
    static final char[] DFA26_min = DFA.unpackEncodedStringToUnsignedChars(DFA26_minS);
    static final char[] DFA26_max = DFA.unpackEncodedStringToUnsignedChars(DFA26_maxS);
    static final short[] DFA26_accept = DFA.unpackEncodedString(DFA26_acceptS);
    static final short[] DFA26_special = DFA.unpackEncodedString(DFA26_specialS);
    static final short[][] DFA26_transition;

    static {
        int numStates = DFA26_transitionS.length;
        DFA26_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA26_transition[i] = DFA.unpackEncodedString(DFA26_transitionS[i]);
        }
    }

    class DFA26 extends DFA {

        public DFA26(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 26;
            this.eot = DFA26_eot;
            this.eof = DFA26_eof;
            this.min = DFA26_min;
            this.max = DFA26_max;
            this.accept = DFA26_accept;
            this.special = DFA26_special;
            this.transition = DFA26_transition;
        }
        public String getDescription() {
            return "1654:1: (this_FromClassId_0= ruleFromClassId | this_FromClassVar_1= ruleFromClassVar )";
        }
    }
    static final String DFA37_eotS =
        "\35\uffff";
    static final String DFA37_eofS =
        "\35\uffff";
    static final String DFA37_minS =
        "\1\4\1\uffff\1\26\1\4\10\31\4\uffff\1\4\1\60\1\47\5\uffff\1\31"+
        "\1\26\1\70\2\uffff";
    static final String DFA37_maxS =
        "\1\110\1\uffff\1\115\1\4\10\115\4\uffff\1\4\1\71\1\73\5\uffff\2"+
        "\115\1\71\2\uffff";
    static final String DFA37_acceptS =
        "\1\uffff\1\1\12\uffff\1\3\1\4\1\5\1\6\3\uffff\1\14\1\13\1\12\1"+
        "\2\1\7\3\uffff\1\11\1\10";
    static final String DFA37_specialS =
        "\35\uffff}>";
    static final String[] DFA37_transitionS = {
            "\1\2\1\5\1\4\1\11\1\12\1\13\24\uffff\1\1\21\uffff\2\14\1\15"+
            "\1\16\1\17\3\uffff\1\6\3\uffff\1\3\12\uffff\1\7\1\10",
            "",
            "\1\20\2\uffff\1\26\15\uffff\1\24\10\uffff\1\22\4\uffff\1\27"+
            "\1\uffff\1\21\2\uffff\1\25\1\23\15\uffff\5\26",
            "\1\30",
            "\1\26\15\uffff\1\24\10\uffff\1\22\4\uffff\1\27\1\uffff\1\21"+
            "\2\uffff\1\25\1\23\15\uffff\5\26",
            "\1\26\15\uffff\1\24\10\uffff\1\22\4\uffff\1\27\1\uffff\1\21"+
            "\2\uffff\1\25\1\23\15\uffff\5\26",
            "\1\26\15\uffff\1\24\10\uffff\1\22\4\uffff\1\27\1\uffff\1\21"+
            "\2\uffff\1\25\1\23\15\uffff\5\26",
            "\1\26\15\uffff\1\24\10\uffff\1\22\4\uffff\1\27\1\uffff\1\21"+
            "\2\uffff\1\25\1\23\15\uffff\5\26",
            "\1\26\15\uffff\1\24\10\uffff\1\22\4\uffff\1\27\1\uffff\1\21"+
            "\2\uffff\1\25\1\23\15\uffff\5\26",
            "\1\26\15\uffff\1\24\10\uffff\1\22\4\uffff\1\27\1\uffff\1\21"+
            "\2\uffff\1\25\1\23\15\uffff\5\26",
            "\1\26\15\uffff\1\24\10\uffff\1\22\4\uffff\1\27\1\uffff\1\21"+
            "\2\uffff\1\25\1\23\15\uffff\5\26",
            "\1\26\15\uffff\1\24\10\uffff\1\22\4\uffff\1\27\1\uffff\1\21"+
            "\2\uffff\1\25\1\23\15\uffff\5\26",
            "",
            "",
            "",
            "",
            "\1\31",
            "\1\32\7\uffff\1\34\1\33",
            "\1\24\15\uffff\1\27\4\uffff\1\25\1\23",
            "",
            "",
            "",
            "",
            "",
            "\1\26\15\uffff\1\24\10\uffff\1\22\4\uffff\1\27\1\uffff\1\21"+
            "\2\uffff\1\25\1\23\15\uffff\5\26",
            "\1\20\2\uffff\1\26\15\uffff\1\24\10\uffff\1\22\4\uffff\1\27"+
            "\1\uffff\1\21\2\uffff\1\25\1\23\15\uffff\5\26",
            "\1\34\1\33",
            "",
            ""
    };

    static final short[] DFA37_eot = DFA.unpackEncodedString(DFA37_eotS);
    static final short[] DFA37_eof = DFA.unpackEncodedString(DFA37_eofS);
    static final char[] DFA37_min = DFA.unpackEncodedStringToUnsignedChars(DFA37_minS);
    static final char[] DFA37_max = DFA.unpackEncodedStringToUnsignedChars(DFA37_maxS);
    static final short[] DFA37_accept = DFA.unpackEncodedString(DFA37_acceptS);
    static final short[] DFA37_special = DFA.unpackEncodedString(DFA37_specialS);
    static final short[][] DFA37_transition;

    static {
        int numStates = DFA37_transitionS.length;
        DFA37_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA37_transition[i] = DFA.unpackEncodedString(DFA37_transitionS[i]);
        }
    }

    class DFA37 extends DFA {

        public DFA37(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 37;
            this.eot = DFA37_eot;
            this.eof = DFA37_eof;
            this.min = DFA37_min;
            this.max = DFA37_max;
            this.accept = DFA37_accept;
            this.special = DFA37_special;
            this.transition = DFA37_transition;
        }
        public String getDescription() {
            return "2331:1: (this_ParExpression_0= ruleParExpression | this_OperatorExpression_1= ruleOperatorExpression | this_ExistsExpression_2= ruleExistsExpression | this_AllExpression_3= ruleAllExpression | this_AnyExpression_4= ruleAnyExpression | this_SomeExpression_5= ruleSomeExpression | this_CollectionExpression_6= ruleCollectionExpression | this_NullComparisonExpression_7= ruleNullComparisonExpression | this_EmptyComparisonExpression_8= ruleEmptyComparisonExpression | this_LikeExpression_9= ruleLikeExpression | this_InExpression_10= ruleInExpression | this_BetweenExpression_11= ruleBetweenExpression )";
        }
    }
    static final String DFA44_eotS =
        "\23\uffff";
    static final String DFA44_eofS =
        "\23\uffff";
    static final String DFA44_minS =
        "\1\4\1\26\1\4\10\47\1\4\1\47\1\36\1\47\1\26\1\4\2\uffff";
    static final String DFA44_maxS =
        "\1\110\1\60\1\4\10\60\1\4\1\47\1\36\2\60\1\110\2\uffff";
    static final String DFA44_acceptS =
        "\21\uffff\1\1\1\2";
    static final String DFA44_specialS =
        "\23\uffff}>";
    static final String[] DFA44_transitionS = {
            "\1\1\1\4\1\3\1\10\1\11\1\12\56\uffff\1\5\3\uffff\1\2\12\uffff"+
            "\1\6\1\7",
            "\1\13\20\uffff\1\15\10\uffff\1\14",
            "\1\16",
            "\1\15\10\uffff\1\14",
            "\1\15\10\uffff\1\14",
            "\1\15\10\uffff\1\14",
            "\1\15\10\uffff\1\14",
            "\1\15\10\uffff\1\14",
            "\1\15\10\uffff\1\14",
            "\1\15\10\uffff\1\14",
            "\1\15\10\uffff\1\14",
            "\1\17",
            "\1\15",
            "\1\20",
            "\1\15\10\uffff\1\14",
            "\1\13\20\uffff\1\15\10\uffff\1\14",
            "\6\21\21\uffff\1\22\11\uffff\1\22\22\uffff\1\21\3\uffff\1"+
            "\21\12\uffff\2\21",
            "",
            ""
    };

    static final short[] DFA44_eot = DFA.unpackEncodedString(DFA44_eotS);
    static final short[] DFA44_eof = DFA.unpackEncodedString(DFA44_eofS);
    static final char[] DFA44_min = DFA.unpackEncodedStringToUnsignedChars(DFA44_minS);
    static final char[] DFA44_max = DFA.unpackEncodedStringToUnsignedChars(DFA44_maxS);
    static final short[] DFA44_accept = DFA.unpackEncodedString(DFA44_acceptS);
    static final short[] DFA44_special = DFA.unpackEncodedString(DFA44_specialS);
    static final short[][] DFA44_transition;

    static {
        int numStates = DFA44_transitionS.length;
        DFA44_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA44_transition[i] = DFA.unpackEncodedString(DFA44_transitionS[i]);
        }
    }

    class DFA44 extends DFA {

        public DFA44(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 44;
            this.eot = DFA44_eot;
            this.eof = DFA44_eof;
            this.min = DFA44_min;
            this.max = DFA44_max;
            this.accept = DFA44_accept;
            this.special = DFA44_special;
            this.transition = DFA44_transition;
        }
        public String getDescription() {
            return "3051:1: (this_InSeqExpression_0= ruleInSeqExpression | this_InQueryExpression_1= ruleInQueryExpression )";
        }
    }
 

    public static final BitSet FOLLOW_ruleQueryModule_in_entryRuleQueryModule75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQueryModule85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQuery_in_ruleQueryModule130 = new BitSet(new long[]{0x000000200C800002L});
    public static final BitSet FOLLOW_ruleQuery_in_entryRuleQuery166 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQuery176 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSelectStatement_in_ruleQuery223 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUpdateStatement_in_ruleQuery250 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDeleteStatement_in_ruleQuery277 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSelectStatement_in_entryRuleSelectStatement312 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSelectStatement322 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSelectFromClause_in_ruleSelectStatement368 = new BitSet(new long[]{0x0000200000030002L});
    public static final BitSet FOLLOW_ruleWhereClause_in_ruleSelectStatement389 = new BitSet(new long[]{0x0000000000030002L});
    public static final BitSet FOLLOW_ruleHavingClause_in_ruleSelectStatement411 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_ruleOrderClause_in_ruleSelectStatement433 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleHavingClause_in_entryRuleHavingClause470 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleHavingClause480 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_ruleHavingClause517 = new BitSet(new long[]{0x111F0000400003F0L,0x0000000000000180L});
    public static final BitSet FOLLOW_ruleOrExpression_in_ruleHavingClause538 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOrderClause_in_entryRuleOrderClause574 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOrderClause584 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_ruleOrderClause621 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleOrderClause633 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleOrderItem_in_ruleOrderClause654 = new BitSet(new long[]{0x0000000000380002L});
    public static final BitSet FOLLOW_19_in_ruleOrderClause667 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleOrderItem_in_ruleOrderClause688 = new BitSet(new long[]{0x0000000000380002L});
    public static final BitSet FOLLOW_20_in_ruleOrderClause709 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_ruleOrderClause746 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOrderItem_in_entryRuleOrderItem797 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOrderItem807 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleOrderItem852 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_ruleOrderItem864 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleOrderItem881 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUpdateStatement_in_entryRuleUpdateStatement922 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleUpdateStatement932 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUpdateClause_in_ruleUpdateStatement978 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_ruleSetClause_in_ruleUpdateStatement999 = new BitSet(new long[]{0x0000200000000002L});
    public static final BitSet FOLLOW_ruleWhereClause_in_ruleUpdateStatement1020 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUpdateClause_in_entryRuleUpdateClause1057 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleUpdateClause1067 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_ruleUpdateClause1104 = new BitSet(new long[]{0x0000008000000010L});
    public static final BitSet FOLLOW_ruleFromEntry_in_ruleUpdateClause1125 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_19_in_ruleUpdateClause1138 = new BitSet(new long[]{0x0000008000000010L});
    public static final BitSet FOLLOW_ruleFromEntry_in_ruleUpdateClause1159 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_ruleSetClause_in_entryRuleSetClause1197 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSetClause1207 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_ruleSetClause1244 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleUpdateItem_in_ruleSetClause1265 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_19_in_ruleSetClause1278 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleUpdateItem_in_ruleSetClause1299 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_ruleUpdateItem_in_entryRuleUpdateItem1337 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleUpdateItem1347 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAliasAttributeExpression_in_ruleUpdateItem1393 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_ruleUpdateItem1405 = new BitSet(new long[]{0x11000000000003F0L,0x0000000000000180L});
    public static final BitSet FOLLOW_ruleValue_in_ruleUpdateItem1426 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDeleteStatement_in_entryRuleDeleteStatement1462 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDeleteStatement1472 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDeleteClause_in_ruleDeleteStatement1518 = new BitSet(new long[]{0x0000200000000002L});
    public static final BitSet FOLLOW_ruleWhereClause_in_ruleDeleteStatement1539 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDeleteClause_in_entryRuleDeleteClause1576 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDeleteClause1586 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_ruleDeleteClause1623 = new BitSet(new long[]{0x0000002008000000L});
    public static final BitSet FOLLOW_ruleFromClause_in_ruleDeleteClause1644 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSelectFromClause_in_entryRuleSelectFromClause1680 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSelectFromClause1690 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSelectClause_in_ruleSelectFromClause1736 = new BitSet(new long[]{0x0000002008000000L});
    public static final BitSet FOLLOW_ruleFromClause_in_ruleSelectFromClause1758 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSelectClause_in_entryRuleSelectClause1794 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSelectClause1804 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_ruleSelectClause1841 = new BitSet(new long[]{0x0000001F30000010L});
    public static final BitSet FOLLOW_28_in_ruleSelectClause1859 = new BitSet(new long[]{0x0000001F30000010L});
    public static final BitSet FOLLOW_ruleSelectExpression_in_ruleSelectClause1894 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_19_in_ruleSelectClause1907 = new BitSet(new long[]{0x0000001F30000010L});
    public static final BitSet FOLLOW_ruleSelectExpression_in_ruleSelectClause1928 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_ruleSelectExpression_in_entryRuleSelectExpression1966 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSelectExpression1976 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAliasAttributeExpression_in_ruleSelectExpression2023 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSelectAggregateExpression_in_ruleSelectExpression2050 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSelectConstructorExpression_in_ruleSelectExpression2077 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSelectAggregateExpression_in_entryRuleSelectAggregateExpression2112 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSelectAggregateExpression2122 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAvgAggregate_in_ruleSelectAggregateExpression2169 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMaxAggregate_in_ruleSelectAggregateExpression2196 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMinAggregate_in_ruleSelectAggregateExpression2223 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSumAggregate_in_ruleSelectAggregateExpression2250 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCountAggregate_in_ruleSelectAggregateExpression2277 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAvgAggregate_in_entryRuleAvgAggregate2312 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAvgAggregate2322 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_ruleAvgAggregate2359 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_30_in_ruleAvgAggregate2371 = new BitSet(new long[]{0x0000000010000010L});
    public static final BitSet FOLLOW_28_in_ruleAvgAggregate2389 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleAliasAttributeExpression_in_ruleAvgAggregate2424 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_31_in_ruleAvgAggregate2436 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMaxAggregate_in_entryRuleMaxAggregate2472 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMaxAggregate2482 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_ruleMaxAggregate2519 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_30_in_ruleMaxAggregate2531 = new BitSet(new long[]{0x0000000010000010L});
    public static final BitSet FOLLOW_28_in_ruleMaxAggregate2549 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleAliasAttributeExpression_in_ruleMaxAggregate2584 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_31_in_ruleMaxAggregate2596 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMinAggregate_in_entryRuleMinAggregate2632 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMinAggregate2642 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_ruleMinAggregate2679 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_30_in_ruleMinAggregate2691 = new BitSet(new long[]{0x0000000010000010L});
    public static final BitSet FOLLOW_28_in_ruleMinAggregate2709 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleAliasAttributeExpression_in_ruleMinAggregate2744 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_31_in_ruleMinAggregate2756 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSumAggregate_in_entryRuleSumAggregate2792 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSumAggregate2802 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_ruleSumAggregate2839 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_30_in_ruleSumAggregate2851 = new BitSet(new long[]{0x0000000010000010L});
    public static final BitSet FOLLOW_28_in_ruleSumAggregate2869 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleAliasAttributeExpression_in_ruleSumAggregate2904 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_31_in_ruleSumAggregate2916 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCountAggregate_in_entryRuleCountAggregate2952 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCountAggregate2962 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_ruleCountAggregate2999 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_30_in_ruleCountAggregate3011 = new BitSet(new long[]{0x0000000010000010L});
    public static final BitSet FOLLOW_28_in_ruleCountAggregate3029 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleAliasAttributeExpression_in_ruleCountAggregate3064 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_31_in_ruleCountAggregate3076 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSelectConstructorExpression_in_entryRuleSelectConstructorExpression3112 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSelectConstructorExpression3122 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_ruleSelectConstructorExpression3159 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleSelectConstructorExpression3176 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_30_in_ruleSelectConstructorExpression3193 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleAliasAttributeExpression_in_ruleSelectConstructorExpression3214 = new BitSet(new long[]{0x0000000080080000L});
    public static final BitSet FOLLOW_19_in_ruleSelectConstructorExpression3227 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleAliasAttributeExpression_in_ruleSelectConstructorExpression3248 = new BitSet(new long[]{0x0000000080080000L});
    public static final BitSet FOLLOW_31_in_ruleSelectConstructorExpression3262 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFromClause_in_entryRuleFromClause3298 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFromClause3308 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_ruleFromClause3345 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleFromClass_in_ruleFromClause3366 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_19_in_ruleFromClause3379 = new BitSet(new long[]{0x0000008000000010L});
    public static final BitSet FOLLOW_ruleFromEntry_in_ruleFromClause3400 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_ruleFromEntry_in_entryRuleFromEntry3438 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFromEntry3448 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFromClass_in_ruleFromEntry3495 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFromCollection_in_ruleFromEntry3522 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariableDeclaration_in_entryRuleVariableDeclaration3557 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVariableDeclaration3567 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_ruleVariableDeclaration3605 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleVariableDeclaration3624 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFromClass_in_entryRuleFromClass3665 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFromClass3675 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFromClassId_in_ruleFromClass3722 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFromClassVar_in_ruleFromClass3749 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFromClassId_in_entryRuleFromClassId3784 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFromClassId3794 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleFromClassId3841 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFromClassVar_in_entryRuleFromClassVar3876 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFromClassVar3886 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleFromClassVar3934 = new BitSet(new long[]{0x0000004000000010L});
    public static final BitSet FOLLOW_ruleVariableDeclaration_in_ruleFromClassVar3955 = new BitSet(new long[]{0x0000150000000002L});
    public static final BitSet FOLLOW_ruleFromJoin_in_ruleFromClassVar3976 = new BitSet(new long[]{0x0000150000000002L});
    public static final BitSet FOLLOW_ruleFromCollection_in_entryRuleFromCollection4013 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFromCollection4023 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_ruleFromCollection4060 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_30_in_ruleFromCollection4072 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleAliasAttributeExpression_in_ruleFromCollection4093 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_31_in_ruleFromCollection4105 = new BitSet(new long[]{0x0000004000000010L});
    public static final BitSet FOLLOW_ruleVariableDeclaration_in_ruleFromCollection4126 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFromJoin_in_entryRuleFromJoin4162 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFromJoin4172 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJoin_in_ruleFromJoin4219 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLeftJoin_in_ruleFromJoin4246 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInnerJoin_in_ruleFromJoin4273 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJoin_in_entryRuleJoin4308 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJoin4318 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_ruleJoin4355 = new BitSet(new long[]{0x0000020000000010L});
    public static final BitSet FOLLOW_41_in_ruleJoin4373 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleAliasAttributeExpression_in_ruleJoin4408 = new BitSet(new long[]{0x0000004000000010L});
    public static final BitSet FOLLOW_ruleVariableDeclaration_in_ruleJoin4429 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLeftJoin_in_entryRuleLeftJoin4465 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLeftJoin4475 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_ruleLeftJoin4512 = new BitSet(new long[]{0x0000090000000000L});
    public static final BitSet FOLLOW_43_in_ruleLeftJoin4530 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_40_in_ruleLeftJoin4556 = new BitSet(new long[]{0x0000020000000010L});
    public static final BitSet FOLLOW_41_in_ruleLeftJoin4574 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleAliasAttributeExpression_in_ruleLeftJoin4609 = new BitSet(new long[]{0x0000004000000010L});
    public static final BitSet FOLLOW_ruleVariableDeclaration_in_ruleLeftJoin4630 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInnerJoin_in_entryRuleInnerJoin4666 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInnerJoin4676 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_ruleInnerJoin4713 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_40_in_ruleInnerJoin4725 = new BitSet(new long[]{0x0000020000000010L});
    public static final BitSet FOLLOW_41_in_ruleInnerJoin4743 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleAliasAttributeExpression_in_ruleInnerJoin4778 = new BitSet(new long[]{0x0000004000000010L});
    public static final BitSet FOLLOW_ruleVariableDeclaration_in_ruleInnerJoin4799 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleWhereClause_in_entryRuleWhereClause4835 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleWhereClause4845 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_ruleWhereClause4882 = new BitSet(new long[]{0x111F0000400003F0L,0x0000000000000180L});
    public static final BitSet FOLLOW_ruleOrExpression_in_ruleWhereClause4903 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOrExpression_in_entryRuleOrExpression4939 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOrExpression4949 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAndExpression_in_ruleOrExpression4996 = new BitSet(new long[]{0x0000400000000002L});
    public static final BitSet FOLLOW_46_in_ruleOrExpression5018 = new BitSet(new long[]{0x111F0000400003F0L,0x0000000000000180L});
    public static final BitSet FOLLOW_ruleAndExpression_in_ruleOrExpression5039 = new BitSet(new long[]{0x0000400000000002L});
    public static final BitSet FOLLOW_ruleAndExpression_in_entryRuleAndExpression5079 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAndExpression5089 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConcreteExpression_in_ruleAndExpression5136 = new BitSet(new long[]{0x0000800000000002L});
    public static final BitSet FOLLOW_47_in_ruleAndExpression5158 = new BitSet(new long[]{0x111F0000400003F0L,0x0000000000000180L});
    public static final BitSet FOLLOW_ruleConcreteExpression_in_ruleAndExpression5179 = new BitSet(new long[]{0x0000800000000002L});
    public static final BitSet FOLLOW_ruleConcreteExpression_in_entryRuleConcreteExpression5219 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleConcreteExpression5229 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParExpression_in_ruleConcreteExpression5276 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOperatorExpression_in_ruleConcreteExpression5303 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExistsExpression_in_ruleConcreteExpression5330 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAllExpression_in_ruleConcreteExpression5357 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAnyExpression_in_ruleConcreteExpression5384 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSomeExpression_in_ruleConcreteExpression5411 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCollectionExpression_in_ruleConcreteExpression5438 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNullComparisonExpression_in_ruleConcreteExpression5465 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEmptyComparisonExpression_in_ruleConcreteExpression5492 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLikeExpression_in_ruleConcreteExpression5519 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInExpression_in_ruleConcreteExpression5546 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBetweenExpression_in_ruleConcreteExpression5573 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParExpression_in_entryRuleParExpression5608 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleParExpression5618 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_ruleParExpression5655 = new BitSet(new long[]{0x11000000400003F0L,0x0000000000000180L});
    public static final BitSet FOLLOW_ruleExpressionTerm_in_ruleParExpression5677 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_31_in_ruleParExpression5688 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOperatorExpression_in_entryRuleOperatorExpression5724 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOperatorExpression5734 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariable_in_ruleOperatorExpression5780 = new BitSet(new long[]{0x0000000002000000L,0x0000000000003E00L});
    public static final BitSet FOLLOW_ruleOperator_in_ruleOperatorExpression5801 = new BitSet(new long[]{0x11000000400003F0L,0x0000000000000180L});
    public static final BitSet FOLLOW_ruleExpressionTerm_in_ruleOperatorExpression5822 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExistsExpression_in_entryRuleExistsExpression5858 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExistsExpression5868 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_48_in_ruleExistsExpression5911 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_49_in_ruleExistsExpression5937 = new BitSet(new long[]{0x11000000400003F0L,0x0000000000000180L});
    public static final BitSet FOLLOW_ruleQueryExpression_in_ruleExistsExpression5958 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAllExpression_in_entryRuleAllExpression5994 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAllExpression6004 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_50_in_ruleAllExpression6041 = new BitSet(new long[]{0x11000000400003F0L,0x0000000000000180L});
    public static final BitSet FOLLOW_ruleQueryExpression_in_ruleAllExpression6062 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAnyExpression_in_entryRuleAnyExpression6098 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAnyExpression6108 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_51_in_ruleAnyExpression6145 = new BitSet(new long[]{0x11000000400003F0L,0x0000000000000180L});
    public static final BitSet FOLLOW_ruleQueryExpression_in_ruleAnyExpression6166 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSomeExpression_in_entryRuleSomeExpression6202 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSomeExpression6212 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_52_in_ruleSomeExpression6249 = new BitSet(new long[]{0x11000000400003F0L,0x0000000000000180L});
    public static final BitSet FOLLOW_ruleQueryExpression_in_ruleSomeExpression6270 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCollectionExpression_in_entryRuleCollectionExpression6306 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCollectionExpression6316 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariable_in_ruleCollectionExpression6362 = new BitSet(new long[]{0x0021000000000000L});
    public static final BitSet FOLLOW_48_in_ruleCollectionExpression6380 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_53_in_ruleCollectionExpression6406 = new BitSet(new long[]{0x0040000000000010L});
    public static final BitSet FOLLOW_54_in_ruleCollectionExpression6419 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleAliasAttributeExpression_in_ruleCollectionExpression6442 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNullComparisonExpression_in_entryRuleNullComparisonExpression6478 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNullComparisonExpression6488 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariable_in_ruleNullComparisonExpression6534 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_55_in_ruleNullComparisonExpression6546 = new BitSet(new long[]{0x0101000000000000L});
    public static final BitSet FOLLOW_48_in_ruleNullComparisonExpression6564 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_56_in_ruleNullComparisonExpression6590 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEmptyComparisonExpression_in_entryRuleEmptyComparisonExpression6626 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEmptyComparisonExpression6636 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariable_in_ruleEmptyComparisonExpression6682 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_55_in_ruleEmptyComparisonExpression6694 = new BitSet(new long[]{0x0201000000000000L});
    public static final BitSet FOLLOW_48_in_ruleEmptyComparisonExpression6712 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_57_in_ruleEmptyComparisonExpression6738 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLikeExpression_in_entryRuleLikeExpression6774 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLikeExpression6784 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariable_in_ruleLikeExpression6830 = new BitSet(new long[]{0x0401000000000000L});
    public static final BitSet FOLLOW_48_in_ruleLikeExpression6848 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_58_in_ruleLikeExpression6874 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleLikeExpression6891 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInExpression_in_entryRuleInExpression6932 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInExpression6942 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInSeqExpression_in_ruleInExpression6989 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInQueryExpression_in_ruleInExpression7016 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInSeqExpression_in_entryRuleInSeqExpression7051 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInSeqExpression7061 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariable_in_ruleInSeqExpression7107 = new BitSet(new long[]{0x0001008000000000L});
    public static final BitSet FOLLOW_48_in_ruleInSeqExpression7125 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_39_in_ruleInSeqExpression7151 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_30_in_ruleInSeqExpression7163 = new BitSet(new long[]{0x11000000000003F0L,0x0000000000000180L});
    public static final BitSet FOLLOW_ruleVariable_in_ruleInSeqExpression7184 = new BitSet(new long[]{0x0000000080080000L});
    public static final BitSet FOLLOW_19_in_ruleInSeqExpression7197 = new BitSet(new long[]{0x11000000000003F0L,0x0000000000000180L});
    public static final BitSet FOLLOW_ruleVariable_in_ruleInSeqExpression7218 = new BitSet(new long[]{0x0000000080080000L});
    public static final BitSet FOLLOW_31_in_ruleInSeqExpression7232 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInQueryExpression_in_entryRuleInQueryExpression7268 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInQueryExpression7278 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariable_in_ruleInQueryExpression7324 = new BitSet(new long[]{0x0001008000000000L});
    public static final BitSet FOLLOW_48_in_ruleInQueryExpression7342 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_39_in_ruleInQueryExpression7368 = new BitSet(new long[]{0x11000000400003F0L,0x0000000000000180L});
    public static final BitSet FOLLOW_ruleQueryExpression_in_ruleInQueryExpression7389 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBetweenExpression_in_entryRuleBetweenExpression7425 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBetweenExpression7435 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariable_in_ruleBetweenExpression7481 = new BitSet(new long[]{0x0801000000000000L});
    public static final BitSet FOLLOW_48_in_ruleBetweenExpression7499 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_59_in_ruleBetweenExpression7525 = new BitSet(new long[]{0x11000000000003F0L,0x0000000000000180L});
    public static final BitSet FOLLOW_ruleValue_in_ruleBetweenExpression7546 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_47_in_ruleBetweenExpression7558 = new BitSet(new long[]{0x11000000000003F0L,0x0000000000000180L});
    public static final BitSet FOLLOW_ruleValue_in_ruleBetweenExpression7579 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariable_in_entryRuleVariable7615 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVariable7625 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAliasAttributeExpression_in_ruleVariable7672 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParameterExpression_in_ruleVariable7699 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValue_in_ruleVariable7726 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpressionTerm_in_entryRuleExpressionTerm7761 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExpressionTerm7771 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariable_in_ruleExpressionTerm7818 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQueryExpression_in_ruleExpressionTerm7845 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAliasAttributeExpression_in_entryRuleAliasAttributeExpression7880 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAliasAttributeExpression7890 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleAliasAttributeExpression7935 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_22_in_ruleAliasAttributeExpression7948 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleAliasAttributeExpression7965 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_ruleParameterExpression_in_entryRuleParameterExpression8008 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleParameterExpression8018 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_60_in_ruleParameterExpression8055 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleParameterExpression8072 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringFunction_in_entryRuleStringFunction8115 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStringFunction8125 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringFunctionName_in_ruleStringFunction8171 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_30_in_ruleStringFunction8183 = new BitSet(new long[]{0x11000000000003F0L,0x0000000000000180L});
    public static final BitSet FOLLOW_ruleVariable_in_ruleStringFunction8204 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleStringFunction8217 = new BitSet(new long[]{0x11000000000003F0L,0x0000000000000180L});
    public static final BitSet FOLLOW_ruleVariable_in_ruleStringFunction8238 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_31_in_ruleStringFunction8251 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringFunctionName_in_entryRuleStringFunctionName8288 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStringFunctionName8299 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_61_in_ruleStringFunctionName8337 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_62_in_ruleStringFunctionName8356 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_63_in_ruleStringFunctionName8375 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_64_in_ruleStringFunctionName8394 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_65_in_ruleStringFunctionName8413 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_66_in_ruleStringFunctionName8432 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNumericFunction_in_entryRuleNumericFunction8472 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNumericFunction8482 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNumericFunctionName_in_ruleNumericFunction8528 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_30_in_ruleNumericFunction8540 = new BitSet(new long[]{0x11000000000003F0L,0x0000000000000180L});
    public static final BitSet FOLLOW_ruleVariable_in_ruleNumericFunction8561 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleNumericFunction8574 = new BitSet(new long[]{0x11000000000003F0L,0x0000000000000180L});
    public static final BitSet FOLLOW_ruleVariable_in_ruleNumericFunction8595 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_31_in_ruleNumericFunction8608 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNumericFunctionName_in_entryRuleNumericFunctionName8645 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNumericFunctionName8656 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_67_in_ruleNumericFunctionName8694 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_68_in_ruleNumericFunctionName8713 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_69_in_ruleNumericFunctionName8732 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_70_in_ruleNumericFunctionName8751 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValue_in_entryRuleValue8793 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleValue8803 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIntegerExpression_in_ruleValue8850 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringExpression_in_ruleValue8877 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNullExpression_in_ruleValue8904 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBooleanExpression_in_ruleValue8931 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDateTimeExpression_in_ruleValue8958 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIntegerExpression_in_entryRuleIntegerExpression8993 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIntegerExpression9003 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleIntegerExpression9044 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringExpression_in_entryRuleStringExpression9084 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStringExpression9094 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleStringExpression9135 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNullExpression_in_entryRuleNullExpression9175 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNullExpression9185 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_56_in_ruleNullExpression9227 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBooleanExpression_in_entryRuleBooleanExpression9275 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBooleanExpression9285 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_71_in_ruleBooleanExpression9329 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_72_in_ruleBooleanExpression9358 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDateTimeExpression_in_entryRuleDateTimeExpression9409 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDateTimeExpression9419 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLITERAL_TEMPORAL_in_ruleDateTimeExpression9464 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQueryExpression_in_entryRuleQueryExpression9499 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQueryExpression9509 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_ruleQueryExpression9546 = new BitSet(new long[]{0x0000002008000000L});
    public static final BitSet FOLLOW_ruleSelectStatement_in_ruleQueryExpression9568 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_31_in_ruleQueryExpression9579 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLITERAL_TEMPORAL_in_entryRuleLITERAL_TEMPORAL9616 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLITERAL_TEMPORAL9627 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_DATE_LITERAL_in_ruleLITERAL_TEMPORAL9667 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_TIME_LITERAL_in_ruleLITERAL_TEMPORAL9693 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_TIMESTAMP_LITERAL_in_ruleLITERAL_TEMPORAL9719 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName9765 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQualifiedName9776 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleQualifiedName9816 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_22_in_ruleQualifiedName9835 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleQualifiedName9850 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_73_in_ruleOperator9911 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_74_in_ruleOperator9928 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_75_in_ruleOperator9945 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_76_in_ruleOperator9962 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_ruleOperator9979 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_77_in_ruleOperator9996 = new BitSet(new long[]{0x0000000000000002L});

}