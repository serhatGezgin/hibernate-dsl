/*
* generated by Xtext
*/
package org.yazgel.jpql.xtext.ui.contentassist.antlr;

import java.util.Collection;
import java.util.Map;
import java.util.HashMap;

import org.antlr.runtime.RecognitionException;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ui.editor.contentassist.antlr.AbstractContentAssistParser;
import org.eclipse.xtext.ui.editor.contentassist.antlr.FollowElement;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;

import com.google.inject.Inject;

import org.yazgel.jpql.xtext.services.JPQLGrammarAccess;

public class JPQLParser extends AbstractContentAssistParser {
	
	@Inject
	private JPQLGrammarAccess grammarAccess;
	
	private Map<AbstractElement, String> nameMappings;
	
	@Override
	protected org.yazgel.jpql.xtext.ui.contentassist.antlr.internal.InternalJPQLParser createParser() {
		org.yazgel.jpql.xtext.ui.contentassist.antlr.internal.InternalJPQLParser result = new org.yazgel.jpql.xtext.ui.contentassist.antlr.internal.InternalJPQLParser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}
	
	@Override
	protected String getRuleName(AbstractElement element) {
		if (nameMappings == null) {
			nameMappings = new HashMap<AbstractElement, String>() {
				private static final long serialVersionUID = 1L;
				{
					put(grammarAccess.getQueryAccess().getAlternatives(), "rule__Query__Alternatives");
					put(grammarAccess.getOrderClauseAccess().getAlternatives_4(), "rule__OrderClause__Alternatives_4");
					put(grammarAccess.getSelectExpressionAccess().getAlternatives(), "rule__SelectExpression__Alternatives");
					put(grammarAccess.getSelectAggregateExpressionAccess().getAlternatives(), "rule__SelectAggregateExpression__Alternatives");
					put(grammarAccess.getFromEntryAccess().getAlternatives(), "rule__FromEntry__Alternatives");
					put(grammarAccess.getFromClassAccess().getAlternatives(), "rule__FromClass__Alternatives");
					put(grammarAccess.getFromJoinAccess().getAlternatives(), "rule__FromJoin__Alternatives");
					put(grammarAccess.getConcreteExpressionAccess().getAlternatives(), "rule__ConcreteExpression__Alternatives");
					put(grammarAccess.getInExpressionAccess().getAlternatives(), "rule__InExpression__Alternatives");
					put(grammarAccess.getVariableAccess().getAlternatives(), "rule__Variable__Alternatives");
					put(grammarAccess.getExpressionTermAccess().getAlternatives(), "rule__ExpressionTerm__Alternatives");
					put(grammarAccess.getFunctionAccess().getAlternatives(), "rule__Function__Alternatives");
					put(grammarAccess.getStringFunctionNameAccess().getAlternatives(), "rule__StringFunctionName__Alternatives");
					put(grammarAccess.getNumericFunctionNameAccess().getAlternatives(), "rule__NumericFunctionName__Alternatives");
					put(grammarAccess.getDateTimeFunctionNameAccess().getAlternatives(), "rule__DateTimeFunctionName__Alternatives");
					put(grammarAccess.getValueAccess().getAlternatives(), "rule__Value__Alternatives");
					put(grammarAccess.getBooleanExpressionAccess().getValueAlternatives_0(), "rule__BooleanExpression__ValueAlternatives_0");
					put(grammarAccess.getLITERAL_TEMPORALAccess().getAlternatives(), "rule__LITERAL_TEMPORAL__Alternatives");
					put(grammarAccess.getOperatorAccess().getAlternatives(), "rule__Operator__Alternatives");
					put(grammarAccess.getSelectStatementAccess().getGroup(), "rule__SelectStatement__Group__0");
					put(grammarAccess.getHavingClauseAccess().getGroup(), "rule__HavingClause__Group__0");
					put(grammarAccess.getOrderClauseAccess().getGroup(), "rule__OrderClause__Group__0");
					put(grammarAccess.getOrderClauseAccess().getGroup_3(), "rule__OrderClause__Group_3__0");
					put(grammarAccess.getOrderItemAccess().getGroup(), "rule__OrderItem__Group__0");
					put(grammarAccess.getUpdateStatementAccess().getGroup(), "rule__UpdateStatement__Group__0");
					put(grammarAccess.getUpdateClauseAccess().getGroup(), "rule__UpdateClause__Group__0");
					put(grammarAccess.getUpdateClauseAccess().getGroup_2(), "rule__UpdateClause__Group_2__0");
					put(grammarAccess.getSetClauseAccess().getGroup(), "rule__SetClause__Group__0");
					put(grammarAccess.getSetClauseAccess().getGroup_2(), "rule__SetClause__Group_2__0");
					put(grammarAccess.getUpdateItemAccess().getGroup(), "rule__UpdateItem__Group__0");
					put(grammarAccess.getDeleteStatementAccess().getGroup(), "rule__DeleteStatement__Group__0");
					put(grammarAccess.getDeleteClauseAccess().getGroup(), "rule__DeleteClause__Group__0");
					put(grammarAccess.getSelectFromClauseAccess().getGroup(), "rule__SelectFromClause__Group__0");
					put(grammarAccess.getSelectClauseAccess().getGroup(), "rule__SelectClause__Group__0");
					put(grammarAccess.getSelectClauseAccess().getGroup_3(), "rule__SelectClause__Group_3__0");
					put(grammarAccess.getAvgAggregateAccess().getGroup(), "rule__AvgAggregate__Group__0");
					put(grammarAccess.getMaxAggregateAccess().getGroup(), "rule__MaxAggregate__Group__0");
					put(grammarAccess.getMinAggregateAccess().getGroup(), "rule__MinAggregate__Group__0");
					put(grammarAccess.getSumAggregateAccess().getGroup(), "rule__SumAggregate__Group__0");
					put(grammarAccess.getCountAggregateAccess().getGroup(), "rule__CountAggregate__Group__0");
					put(grammarAccess.getSelectConstructorExpressionAccess().getGroup(), "rule__SelectConstructorExpression__Group__0");
					put(grammarAccess.getSelectConstructorExpressionAccess().getGroup_4(), "rule__SelectConstructorExpression__Group_4__0");
					put(grammarAccess.getFromClauseAccess().getGroup(), "rule__FromClause__Group__0");
					put(grammarAccess.getFromClauseAccess().getGroup_2(), "rule__FromClause__Group_2__0");
					put(grammarAccess.getVariableDeclarationAccess().getGroup(), "rule__VariableDeclaration__Group__0");
					put(grammarAccess.getFromClassVarAccess().getGroup(), "rule__FromClassVar__Group__0");
					put(grammarAccess.getFromCollectionAccess().getGroup(), "rule__FromCollection__Group__0");
					put(grammarAccess.getJoinAccess().getGroup(), "rule__Join__Group__0");
					put(grammarAccess.getLeftJoinAccess().getGroup(), "rule__LeftJoin__Group__0");
					put(grammarAccess.getInnerJoinAccess().getGroup(), "rule__InnerJoin__Group__0");
					put(grammarAccess.getWhereClauseAccess().getGroup(), "rule__WhereClause__Group__0");
					put(grammarAccess.getOrExpressionAccess().getGroup(), "rule__OrExpression__Group__0");
					put(grammarAccess.getOrExpressionAccess().getGroup_1(), "rule__OrExpression__Group_1__0");
					put(grammarAccess.getOrExpressionAccess().getGroup_1_1(), "rule__OrExpression__Group_1_1__0");
					put(grammarAccess.getAndExpressionAccess().getGroup(), "rule__AndExpression__Group__0");
					put(grammarAccess.getAndExpressionAccess().getGroup_1(), "rule__AndExpression__Group_1__0");
					put(grammarAccess.getAndExpressionAccess().getGroup_1_1(), "rule__AndExpression__Group_1_1__0");
					put(grammarAccess.getParExpressionAccess().getGroup(), "rule__ParExpression__Group__0");
					put(grammarAccess.getOperatorExpressionAccess().getGroup(), "rule__OperatorExpression__Group__0");
					put(grammarAccess.getExistsExpressionAccess().getGroup(), "rule__ExistsExpression__Group__0");
					put(grammarAccess.getAllExpressionAccess().getGroup(), "rule__AllExpression__Group__0");
					put(grammarAccess.getAnyExpressionAccess().getGroup(), "rule__AnyExpression__Group__0");
					put(grammarAccess.getSomeExpressionAccess().getGroup(), "rule__SomeExpression__Group__0");
					put(grammarAccess.getCollectionExpressionAccess().getGroup(), "rule__CollectionExpression__Group__0");
					put(grammarAccess.getNullComparisonExpressionAccess().getGroup(), "rule__NullComparisonExpression__Group__0");
					put(grammarAccess.getEmptyComparisonExpressionAccess().getGroup(), "rule__EmptyComparisonExpression__Group__0");
					put(grammarAccess.getLikeExpressionAccess().getGroup(), "rule__LikeExpression__Group__0");
					put(grammarAccess.getInSeqExpressionAccess().getGroup(), "rule__InSeqExpression__Group__0");
					put(grammarAccess.getInSeqExpressionAccess().getGroup_5(), "rule__InSeqExpression__Group_5__0");
					put(grammarAccess.getInQueryExpressionAccess().getGroup(), "rule__InQueryExpression__Group__0");
					put(grammarAccess.getBetweenExpressionAccess().getGroup(), "rule__BetweenExpression__Group__0");
					put(grammarAccess.getAliasAttributeExpressionAccess().getGroup(), "rule__AliasAttributeExpression__Group__0");
					put(grammarAccess.getAliasAttributeExpressionAccess().getGroup_1(), "rule__AliasAttributeExpression__Group_1__0");
					put(grammarAccess.getParameterExpressionAccess().getGroup(), "rule__ParameterExpression__Group__0");
					put(grammarAccess.getStringFunctionAccess().getGroup(), "rule__StringFunction__Group__0");
					put(grammarAccess.getStringFunctionAccess().getGroup_3(), "rule__StringFunction__Group_3__0");
					put(grammarAccess.getNumericFunctionAccess().getGroup(), "rule__NumericFunction__Group__0");
					put(grammarAccess.getNumericFunctionAccess().getGroup_3(), "rule__NumericFunction__Group_3__0");
					put(grammarAccess.getQueryExpressionAccess().getGroup(), "rule__QueryExpression__Group__0");
					put(grammarAccess.getQualifiedNameAccess().getGroup(), "rule__QualifiedName__Group__0");
					put(grammarAccess.getQualifiedNameAccess().getGroup_1(), "rule__QualifiedName__Group_1__0");
					put(grammarAccess.getQueryModuleAccess().getQueriesAssignment(), "rule__QueryModule__QueriesAssignment");
					put(grammarAccess.getSelectStatementAccess().getSelectFromClauseAssignment_0(), "rule__SelectStatement__SelectFromClauseAssignment_0");
					put(grammarAccess.getSelectStatementAccess().getWhereClauseAssignment_1(), "rule__SelectStatement__WhereClauseAssignment_1");
					put(grammarAccess.getSelectStatementAccess().getHavingAssignment_2(), "rule__SelectStatement__HavingAssignment_2");
					put(grammarAccess.getSelectStatementAccess().getOrderAssignment_3(), "rule__SelectStatement__OrderAssignment_3");
					put(grammarAccess.getHavingClauseAccess().getHavingAssignment_1(), "rule__HavingClause__HavingAssignment_1");
					put(grammarAccess.getOrderClauseAccess().getOrderingAssignment_2(), "rule__OrderClause__OrderingAssignment_2");
					put(grammarAccess.getOrderClauseAccess().getOrderingAssignment_3_1(), "rule__OrderClause__OrderingAssignment_3_1");
					put(grammarAccess.getOrderClauseAccess().getIsAscAssignment_4_0(), "rule__OrderClause__IsAscAssignment_4_0");
					put(grammarAccess.getOrderClauseAccess().getIsDescAssignment_4_1(), "rule__OrderClause__IsDescAssignment_4_1");
					put(grammarAccess.getOrderItemAccess().getVarAssignment_0(), "rule__OrderItem__VarAssignment_0");
					put(grammarAccess.getOrderItemAccess().getFeatureAssignment_2(), "rule__OrderItem__FeatureAssignment_2");
					put(grammarAccess.getUpdateStatementAccess().getUpdateClauseAssignment_0(), "rule__UpdateStatement__UpdateClauseAssignment_0");
					put(grammarAccess.getUpdateStatementAccess().getSetClauseAssignment_1(), "rule__UpdateStatement__SetClauseAssignment_1");
					put(grammarAccess.getUpdateStatementAccess().getWhereClauseAssignment_2(), "rule__UpdateStatement__WhereClauseAssignment_2");
					put(grammarAccess.getUpdateClauseAccess().getFromEntriesAssignment_1(), "rule__UpdateClause__FromEntriesAssignment_1");
					put(grammarAccess.getUpdateClauseAccess().getFromEntriesAssignment_2_1(), "rule__UpdateClause__FromEntriesAssignment_2_1");
					put(grammarAccess.getSetClauseAccess().getItemsAssignment_1(), "rule__SetClause__ItemsAssignment_1");
					put(grammarAccess.getSetClauseAccess().getItemsAssignment_2_1(), "rule__SetClause__ItemsAssignment_2_1");
					put(grammarAccess.getUpdateItemAccess().getAliasAssignment_0(), "rule__UpdateItem__AliasAssignment_0");
					put(grammarAccess.getUpdateItemAccess().getValueAssignment_2(), "rule__UpdateItem__ValueAssignment_2");
					put(grammarAccess.getDeleteStatementAccess().getDeleteClauseAssignment_0(), "rule__DeleteStatement__DeleteClauseAssignment_0");
					put(grammarAccess.getDeleteStatementAccess().getWhereClauseAssignment_1(), "rule__DeleteStatement__WhereClauseAssignment_1");
					put(grammarAccess.getDeleteClauseAccess().getFromClauseAssignment_1(), "rule__DeleteClause__FromClauseAssignment_1");
					put(grammarAccess.getSelectFromClauseAccess().getSelectClauseAssignment_0(), "rule__SelectFromClause__SelectClauseAssignment_0");
					put(grammarAccess.getSelectFromClauseAccess().getFromClauseAssignment_1(), "rule__SelectFromClause__FromClauseAssignment_1");
					put(grammarAccess.getSelectClauseAccess().getIsDistinctAssignment_1(), "rule__SelectClause__IsDistinctAssignment_1");
					put(grammarAccess.getSelectClauseAccess().getExpressionsAssignment_2(), "rule__SelectClause__ExpressionsAssignment_2");
					put(grammarAccess.getSelectClauseAccess().getExpressionsAssignment_3_1(), "rule__SelectClause__ExpressionsAssignment_3_1");
					put(grammarAccess.getAvgAggregateAccess().getIsDistinctAssignment_2(), "rule__AvgAggregate__IsDistinctAssignment_2");
					put(grammarAccess.getAvgAggregateAccess().getItemAssignment_3(), "rule__AvgAggregate__ItemAssignment_3");
					put(grammarAccess.getMaxAggregateAccess().getIsDistinctAssignment_2(), "rule__MaxAggregate__IsDistinctAssignment_2");
					put(grammarAccess.getMaxAggregateAccess().getItemAssignment_3(), "rule__MaxAggregate__ItemAssignment_3");
					put(grammarAccess.getMinAggregateAccess().getIsDistinctAssignment_2(), "rule__MinAggregate__IsDistinctAssignment_2");
					put(grammarAccess.getMinAggregateAccess().getItemAssignment_3(), "rule__MinAggregate__ItemAssignment_3");
					put(grammarAccess.getSumAggregateAccess().getIsDistinctAssignment_2(), "rule__SumAggregate__IsDistinctAssignment_2");
					put(grammarAccess.getSumAggregateAccess().getItemAssignment_3(), "rule__SumAggregate__ItemAssignment_3");
					put(grammarAccess.getCountAggregateAccess().getIsDistinctAssignment_2(), "rule__CountAggregate__IsDistinctAssignment_2");
					put(grammarAccess.getCountAggregateAccess().getItemAssignment_3(), "rule__CountAggregate__ItemAssignment_3");
					put(grammarAccess.getSelectConstructorExpressionAccess().getNameAssignment_1(), "rule__SelectConstructorExpression__NameAssignment_1");
					put(grammarAccess.getSelectConstructorExpressionAccess().getItemsAssignment_3(), "rule__SelectConstructorExpression__ItemsAssignment_3");
					put(grammarAccess.getSelectConstructorExpressionAccess().getItemsAssignment_4_1(), "rule__SelectConstructorExpression__ItemsAssignment_4_1");
					put(grammarAccess.getFromClauseAccess().getFromEntriesAssignment_1(), "rule__FromClause__FromEntriesAssignment_1");
					put(grammarAccess.getFromClauseAccess().getFromEntriesAssignment_2_1(), "rule__FromClause__FromEntriesAssignment_2_1");
					put(grammarAccess.getVariableDeclarationAccess().getNameAssignment_1(), "rule__VariableDeclaration__NameAssignment_1");
					put(grammarAccess.getFromClassIdAccess().getTypeAssignment(), "rule__FromClassId__TypeAssignment");
					put(grammarAccess.getFromClassVarAccess().getTypeAssignment_0(), "rule__FromClassVar__TypeAssignment_0");
					put(grammarAccess.getFromClassVarAccess().getVariableAssignment_1(), "rule__FromClassVar__VariableAssignment_1");
					put(grammarAccess.getFromClassVarAccess().getJoinsAssignment_2(), "rule__FromClassVar__JoinsAssignment_2");
					put(grammarAccess.getFromCollectionAccess().getPathAssignment_2(), "rule__FromCollection__PathAssignment_2");
					put(grammarAccess.getFromCollectionAccess().getVariableAssignment_4(), "rule__FromCollection__VariableAssignment_4");
					put(grammarAccess.getJoinAccess().getIsFetchAssignment_1(), "rule__Join__IsFetchAssignment_1");
					put(grammarAccess.getJoinAccess().getPathAssignment_2(), "rule__Join__PathAssignment_2");
					put(grammarAccess.getJoinAccess().getVariableAssignment_3(), "rule__Join__VariableAssignment_3");
					put(grammarAccess.getLeftJoinAccess().getIsOuterAssignment_1(), "rule__LeftJoin__IsOuterAssignment_1");
					put(grammarAccess.getLeftJoinAccess().getIsFetchAssignment_3(), "rule__LeftJoin__IsFetchAssignment_3");
					put(grammarAccess.getLeftJoinAccess().getPathAssignment_4(), "rule__LeftJoin__PathAssignment_4");
					put(grammarAccess.getLeftJoinAccess().getVariableAssignment_5(), "rule__LeftJoin__VariableAssignment_5");
					put(grammarAccess.getInnerJoinAccess().getIsFetchAssignment_2(), "rule__InnerJoin__IsFetchAssignment_2");
					put(grammarAccess.getInnerJoinAccess().getPathAssignment_3(), "rule__InnerJoin__PathAssignment_3");
					put(grammarAccess.getInnerJoinAccess().getVariableAssignment_4(), "rule__InnerJoin__VariableAssignment_4");
					put(grammarAccess.getWhereClauseAccess().getWhereEntryAssignment_1(), "rule__WhereClause__WhereEntryAssignment_1");
					put(grammarAccess.getOrExpressionAccess().getEntriesAssignment_1_1_1(), "rule__OrExpression__EntriesAssignment_1_1_1");
					put(grammarAccess.getAndExpressionAccess().getEntriesAssignment_1_1_1(), "rule__AndExpression__EntriesAssignment_1_1_1");
					put(grammarAccess.getOperatorExpressionAccess().getLhsAssignment_0(), "rule__OperatorExpression__LhsAssignment_0");
					put(grammarAccess.getOperatorExpressionAccess().getOperatorAssignment_1(), "rule__OperatorExpression__OperatorAssignment_1");
					put(grammarAccess.getOperatorExpressionAccess().getRhsAssignment_2(), "rule__OperatorExpression__RhsAssignment_2");
					put(grammarAccess.getExistsExpressionAccess().getIsNotAssignment_0(), "rule__ExistsExpression__IsNotAssignment_0");
					put(grammarAccess.getExistsExpressionAccess().getQueryAssignment_2(), "rule__ExistsExpression__QueryAssignment_2");
					put(grammarAccess.getAllExpressionAccess().getQueryAssignment_1(), "rule__AllExpression__QueryAssignment_1");
					put(grammarAccess.getAnyExpressionAccess().getQueryAssignment_1(), "rule__AnyExpression__QueryAssignment_1");
					put(grammarAccess.getSomeExpressionAccess().getQueryAssignment_1(), "rule__SomeExpression__QueryAssignment_1");
					put(grammarAccess.getCollectionExpressionAccess().getLhsAssignment_0(), "rule__CollectionExpression__LhsAssignment_0");
					put(grammarAccess.getCollectionExpressionAccess().getIsNotAssignment_1(), "rule__CollectionExpression__IsNotAssignment_1");
					put(grammarAccess.getCollectionExpressionAccess().getRhsAssignment_4(), "rule__CollectionExpression__RhsAssignment_4");
					put(grammarAccess.getNullComparisonExpressionAccess().getLhsAssignment_0(), "rule__NullComparisonExpression__LhsAssignment_0");
					put(grammarAccess.getNullComparisonExpressionAccess().getIsNotAssignment_2(), "rule__NullComparisonExpression__IsNotAssignment_2");
					put(grammarAccess.getEmptyComparisonExpressionAccess().getLhsAssignment_0(), "rule__EmptyComparisonExpression__LhsAssignment_0");
					put(grammarAccess.getEmptyComparisonExpressionAccess().getIsNotAssignment_2(), "rule__EmptyComparisonExpression__IsNotAssignment_2");
					put(grammarAccess.getLikeExpressionAccess().getLhsAssignment_0(), "rule__LikeExpression__LhsAssignment_0");
					put(grammarAccess.getLikeExpressionAccess().getIsNotAssignment_1(), "rule__LikeExpression__IsNotAssignment_1");
					put(grammarAccess.getLikeExpressionAccess().getPatternAssignment_3(), "rule__LikeExpression__PatternAssignment_3");
					put(grammarAccess.getInSeqExpressionAccess().getLhsAssignment_0(), "rule__InSeqExpression__LhsAssignment_0");
					put(grammarAccess.getInSeqExpressionAccess().getIsNotAssignment_1(), "rule__InSeqExpression__IsNotAssignment_1");
					put(grammarAccess.getInSeqExpressionAccess().getItemsAssignment_4(), "rule__InSeqExpression__ItemsAssignment_4");
					put(grammarAccess.getInSeqExpressionAccess().getItemsAssignment_5_1(), "rule__InSeqExpression__ItemsAssignment_5_1");
					put(grammarAccess.getInQueryExpressionAccess().getLhsAssignment_0(), "rule__InQueryExpression__LhsAssignment_0");
					put(grammarAccess.getInQueryExpressionAccess().getIsNotAssignment_1(), "rule__InQueryExpression__IsNotAssignment_1");
					put(grammarAccess.getInQueryExpressionAccess().getQueryAssignment_3(), "rule__InQueryExpression__QueryAssignment_3");
					put(grammarAccess.getBetweenExpressionAccess().getLhsAssignment_0(), "rule__BetweenExpression__LhsAssignment_0");
					put(grammarAccess.getBetweenExpressionAccess().getIsNotAssignment_1(), "rule__BetweenExpression__IsNotAssignment_1");
					put(grammarAccess.getBetweenExpressionAccess().getMinAssignment_3(), "rule__BetweenExpression__MinAssignment_3");
					put(grammarAccess.getBetweenExpressionAccess().getMaxAssignment_5(), "rule__BetweenExpression__MaxAssignment_5");
					put(grammarAccess.getAliasAttributeExpressionAccess().getAliasAssignment_0(), "rule__AliasAttributeExpression__AliasAssignment_0");
					put(grammarAccess.getAliasAttributeExpressionAccess().getAttributesAssignment_1_1(), "rule__AliasAttributeExpression__AttributesAssignment_1_1");
					put(grammarAccess.getParameterExpressionAccess().getNameAssignment_1(), "rule__ParameterExpression__NameAssignment_1");
					put(grammarAccess.getStringFunctionAccess().getNameAssignment_0(), "rule__StringFunction__NameAssignment_0");
					put(grammarAccess.getStringFunctionAccess().getParamsAssignment_2(), "rule__StringFunction__ParamsAssignment_2");
					put(grammarAccess.getStringFunctionAccess().getParamsAssignment_3_1(), "rule__StringFunction__ParamsAssignment_3_1");
					put(grammarAccess.getNumericFunctionAccess().getNameAssignment_0(), "rule__NumericFunction__NameAssignment_0");
					put(grammarAccess.getNumericFunctionAccess().getParamsAssignment_2(), "rule__NumericFunction__ParamsAssignment_2");
					put(grammarAccess.getNumericFunctionAccess().getParamsAssignment_3_1(), "rule__NumericFunction__ParamsAssignment_3_1");
					put(grammarAccess.getIntegerExpressionAccess().getValueAssignment(), "rule__IntegerExpression__ValueAssignment");
					put(grammarAccess.getStringExpressionAccess().getValueAssignment(), "rule__StringExpression__ValueAssignment");
					put(grammarAccess.getNullExpressionAccess().getValueAssignment(), "rule__NullExpression__ValueAssignment");
					put(grammarAccess.getBooleanExpressionAccess().getValueAssignment(), "rule__BooleanExpression__ValueAssignment");
					put(grammarAccess.getDateTimeExpressionAccess().getValueAssignment(), "rule__DateTimeExpression__ValueAssignment");
				}
			};
		}
		return nameMappings.get(element);
	}
	
	@Override
	protected Collection<FollowElement> getFollowElements(AbstractInternalContentAssistParser parser) {
		try {
			org.yazgel.jpql.xtext.ui.contentassist.antlr.internal.InternalJPQLParser typedParser = (org.yazgel.jpql.xtext.ui.contentassist.antlr.internal.InternalJPQLParser) parser;
			typedParser.entryRuleQueryModule();
			return typedParser.getFollowElements();
		} catch(RecognitionException ex) {
			throw new RuntimeException(ex);
		}		
	}
	
	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] { "RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT" };
	}
	
	public JPQLGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}
	
	public void setGrammarAccess(JPQLGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}
