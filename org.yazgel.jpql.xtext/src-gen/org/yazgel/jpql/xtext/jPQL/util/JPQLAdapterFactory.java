/**
 */
package org.yazgel.jpql.xtext.jPQL.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import org.yazgel.jpql.xtext.jPQL.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see org.yazgel.jpql.xtext.jPQL.JPQLPackage
 * @generated
 */
public class JPQLAdapterFactory extends AdapterFactoryImpl
{
  /**
   * The cached model package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static JPQLPackage modelPackage;

  /**
   * Creates an instance of the adapter factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public JPQLAdapterFactory()
  {
    if (modelPackage == null)
    {
      modelPackage = JPQLPackage.eINSTANCE;
    }
  }

  /**
   * Returns whether this factory is applicable for the type of the object.
   * <!-- begin-user-doc -->
   * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
   * <!-- end-user-doc -->
   * @return whether this factory is applicable for the type of the object.
   * @generated
   */
  @Override
  public boolean isFactoryForType(Object object)
  {
    if (object == modelPackage)
    {
      return true;
    }
    if (object instanceof EObject)
    {
      return ((EObject)object).eClass().getEPackage() == modelPackage;
    }
    return false;
  }

  /**
   * The switch that delegates to the <code>createXXX</code> methods.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected JPQLSwitch<Adapter> modelSwitch =
    new JPQLSwitch<Adapter>()
    {
      @Override
      public Adapter caseQueryModule(QueryModule object)
      {
        return createQueryModuleAdapter();
      }
      @Override
      public Adapter caseQuery(Query object)
      {
        return createQueryAdapter();
      }
      @Override
      public Adapter caseSelectStatement(SelectStatement object)
      {
        return createSelectStatementAdapter();
      }
      @Override
      public Adapter caseHavingClause(HavingClause object)
      {
        return createHavingClauseAdapter();
      }
      @Override
      public Adapter caseOrderClause(OrderClause object)
      {
        return createOrderClauseAdapter();
      }
      @Override
      public Adapter caseOrderItem(OrderItem object)
      {
        return createOrderItemAdapter();
      }
      @Override
      public Adapter caseUpdateStatement(UpdateStatement object)
      {
        return createUpdateStatementAdapter();
      }
      @Override
      public Adapter caseUpdateClause(UpdateClause object)
      {
        return createUpdateClauseAdapter();
      }
      @Override
      public Adapter caseSetClause(SetClause object)
      {
        return createSetClauseAdapter();
      }
      @Override
      public Adapter caseUpdateItem(UpdateItem object)
      {
        return createUpdateItemAdapter();
      }
      @Override
      public Adapter caseDeleteStatement(DeleteStatement object)
      {
        return createDeleteStatementAdapter();
      }
      @Override
      public Adapter caseDeleteClause(DeleteClause object)
      {
        return createDeleteClauseAdapter();
      }
      @Override
      public Adapter caseSelectFromClause(SelectFromClause object)
      {
        return createSelectFromClauseAdapter();
      }
      @Override
      public Adapter caseSelectClause(SelectClause object)
      {
        return createSelectClauseAdapter();
      }
      @Override
      public Adapter caseSelectExpression(SelectExpression object)
      {
        return createSelectExpressionAdapter();
      }
      @Override
      public Adapter caseSelectAggregateExpression(SelectAggregateExpression object)
      {
        return createSelectAggregateExpressionAdapter();
      }
      @Override
      public Adapter caseAvgAggregate(AvgAggregate object)
      {
        return createAvgAggregateAdapter();
      }
      @Override
      public Adapter caseMaxAggregate(MaxAggregate object)
      {
        return createMaxAggregateAdapter();
      }
      @Override
      public Adapter caseMinAggregate(MinAggregate object)
      {
        return createMinAggregateAdapter();
      }
      @Override
      public Adapter caseSumAggregate(SumAggregate object)
      {
        return createSumAggregateAdapter();
      }
      @Override
      public Adapter caseCountAggregate(CountAggregate object)
      {
        return createCountAggregateAdapter();
      }
      @Override
      public Adapter caseSelectConstructorExpression(SelectConstructorExpression object)
      {
        return createSelectConstructorExpressionAdapter();
      }
      @Override
      public Adapter caseFromClause(FromClause object)
      {
        return createFromClauseAdapter();
      }
      @Override
      public Adapter caseFromEntry(FromEntry object)
      {
        return createFromEntryAdapter();
      }
      @Override
      public Adapter caseVariableDeclaration(VariableDeclaration object)
      {
        return createVariableDeclarationAdapter();
      }
      @Override
      public Adapter caseFromClass(FromClass object)
      {
        return createFromClassAdapter();
      }
      @Override
      public Adapter caseFromCollection(FromCollection object)
      {
        return createFromCollectionAdapter();
      }
      @Override
      public Adapter caseFromJoin(FromJoin object)
      {
        return createFromJoinAdapter();
      }
      @Override
      public Adapter caseJoin(Join object)
      {
        return createJoinAdapter();
      }
      @Override
      public Adapter caseLeftJoin(LeftJoin object)
      {
        return createLeftJoinAdapter();
      }
      @Override
      public Adapter caseInnerJoin(InnerJoin object)
      {
        return createInnerJoinAdapter();
      }
      @Override
      public Adapter caseWhereClause(WhereClause object)
      {
        return createWhereClauseAdapter();
      }
      @Override
      public Adapter caseExpression(Expression object)
      {
        return createExpressionAdapter();
      }
      @Override
      public Adapter caseOperatorExpression(OperatorExpression object)
      {
        return createOperatorExpressionAdapter();
      }
      @Override
      public Adapter caseExistsExpression(ExistsExpression object)
      {
        return createExistsExpressionAdapter();
      }
      @Override
      public Adapter caseAllExpression(AllExpression object)
      {
        return createAllExpressionAdapter();
      }
      @Override
      public Adapter caseAnyExpression(AnyExpression object)
      {
        return createAnyExpressionAdapter();
      }
      @Override
      public Adapter caseSomeExpression(SomeExpression object)
      {
        return createSomeExpressionAdapter();
      }
      @Override
      public Adapter caseCollectionExpression(CollectionExpression object)
      {
        return createCollectionExpressionAdapter();
      }
      @Override
      public Adapter caseNullComparisonExpression(NullComparisonExpression object)
      {
        return createNullComparisonExpressionAdapter();
      }
      @Override
      public Adapter caseEmptyComparisonExpression(EmptyComparisonExpression object)
      {
        return createEmptyComparisonExpressionAdapter();
      }
      @Override
      public Adapter caseLikeExpression(LikeExpression object)
      {
        return createLikeExpressionAdapter();
      }
      @Override
      public Adapter caseInExpression(InExpression object)
      {
        return createInExpressionAdapter();
      }
      @Override
      public Adapter caseInSeqExpression(InSeqExpression object)
      {
        return createInSeqExpressionAdapter();
      }
      @Override
      public Adapter caseInQueryExpression(InQueryExpression object)
      {
        return createInQueryExpressionAdapter();
      }
      @Override
      public Adapter caseBetweenExpression(BetweenExpression object)
      {
        return createBetweenExpressionAdapter();
      }
      @Override
      public Adapter caseVariable(Variable object)
      {
        return createVariableAdapter();
      }
      @Override
      public Adapter caseExpressionTerm(ExpressionTerm object)
      {
        return createExpressionTermAdapter();
      }
      @Override
      public Adapter caseAliasAttributeExpression(AliasAttributeExpression object)
      {
        return createAliasAttributeExpressionAdapter();
      }
      @Override
      public Adapter caseParameterExpression(ParameterExpression object)
      {
        return createParameterExpressionAdapter();
      }
      @Override
      public Adapter caseFunction(Function object)
      {
        return createFunctionAdapter();
      }
      @Override
      public Adapter caseValue(Value object)
      {
        return createValueAdapter();
      }
      @Override
      public Adapter caseIntegerExpression(IntegerExpression object)
      {
        return createIntegerExpressionAdapter();
      }
      @Override
      public Adapter caseStringExpression(StringExpression object)
      {
        return createStringExpressionAdapter();
      }
      @Override
      public Adapter caseNullExpression(NullExpression object)
      {
        return createNullExpressionAdapter();
      }
      @Override
      public Adapter caseBooleanExpression(BooleanExpression object)
      {
        return createBooleanExpressionAdapter();
      }
      @Override
      public Adapter caseDateTimeExpression(DateTimeExpression object)
      {
        return createDateTimeExpressionAdapter();
      }
      @Override
      public Adapter caseOrExpression(OrExpression object)
      {
        return createOrExpressionAdapter();
      }
      @Override
      public Adapter caseAndExpression(AndExpression object)
      {
        return createAndExpressionAdapter();
      }
      @Override
      public Adapter defaultCase(EObject object)
      {
        return createEObjectAdapter();
      }
    };

  /**
   * Creates an adapter for the <code>target</code>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param target the object to adapt.
   * @return the adapter for the <code>target</code>.
   * @generated
   */
  @Override
  public Adapter createAdapter(Notifier target)
  {
    return modelSwitch.doSwitch((EObject)target);
  }


  /**
   * Creates a new adapter for an object of class '{@link org.yazgel.jpql.xtext.jPQL.QueryModule <em>Query Module</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.yazgel.jpql.xtext.jPQL.QueryModule
   * @generated
   */
  public Adapter createQueryModuleAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.yazgel.jpql.xtext.jPQL.Query <em>Query</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.yazgel.jpql.xtext.jPQL.Query
   * @generated
   */
  public Adapter createQueryAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.yazgel.jpql.xtext.jPQL.SelectStatement <em>Select Statement</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.yazgel.jpql.xtext.jPQL.SelectStatement
   * @generated
   */
  public Adapter createSelectStatementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.yazgel.jpql.xtext.jPQL.HavingClause <em>Having Clause</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.yazgel.jpql.xtext.jPQL.HavingClause
   * @generated
   */
  public Adapter createHavingClauseAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.yazgel.jpql.xtext.jPQL.OrderClause <em>Order Clause</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.yazgel.jpql.xtext.jPQL.OrderClause
   * @generated
   */
  public Adapter createOrderClauseAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.yazgel.jpql.xtext.jPQL.OrderItem <em>Order Item</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.yazgel.jpql.xtext.jPQL.OrderItem
   * @generated
   */
  public Adapter createOrderItemAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.yazgel.jpql.xtext.jPQL.UpdateStatement <em>Update Statement</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.yazgel.jpql.xtext.jPQL.UpdateStatement
   * @generated
   */
  public Adapter createUpdateStatementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.yazgel.jpql.xtext.jPQL.UpdateClause <em>Update Clause</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.yazgel.jpql.xtext.jPQL.UpdateClause
   * @generated
   */
  public Adapter createUpdateClauseAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.yazgel.jpql.xtext.jPQL.SetClause <em>Set Clause</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.yazgel.jpql.xtext.jPQL.SetClause
   * @generated
   */
  public Adapter createSetClauseAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.yazgel.jpql.xtext.jPQL.UpdateItem <em>Update Item</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.yazgel.jpql.xtext.jPQL.UpdateItem
   * @generated
   */
  public Adapter createUpdateItemAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.yazgel.jpql.xtext.jPQL.DeleteStatement <em>Delete Statement</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.yazgel.jpql.xtext.jPQL.DeleteStatement
   * @generated
   */
  public Adapter createDeleteStatementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.yazgel.jpql.xtext.jPQL.DeleteClause <em>Delete Clause</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.yazgel.jpql.xtext.jPQL.DeleteClause
   * @generated
   */
  public Adapter createDeleteClauseAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.yazgel.jpql.xtext.jPQL.SelectFromClause <em>Select From Clause</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.yazgel.jpql.xtext.jPQL.SelectFromClause
   * @generated
   */
  public Adapter createSelectFromClauseAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.yazgel.jpql.xtext.jPQL.SelectClause <em>Select Clause</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.yazgel.jpql.xtext.jPQL.SelectClause
   * @generated
   */
  public Adapter createSelectClauseAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.yazgel.jpql.xtext.jPQL.SelectExpression <em>Select Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.yazgel.jpql.xtext.jPQL.SelectExpression
   * @generated
   */
  public Adapter createSelectExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.yazgel.jpql.xtext.jPQL.SelectAggregateExpression <em>Select Aggregate Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.yazgel.jpql.xtext.jPQL.SelectAggregateExpression
   * @generated
   */
  public Adapter createSelectAggregateExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.yazgel.jpql.xtext.jPQL.AvgAggregate <em>Avg Aggregate</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.yazgel.jpql.xtext.jPQL.AvgAggregate
   * @generated
   */
  public Adapter createAvgAggregateAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.yazgel.jpql.xtext.jPQL.MaxAggregate <em>Max Aggregate</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.yazgel.jpql.xtext.jPQL.MaxAggregate
   * @generated
   */
  public Adapter createMaxAggregateAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.yazgel.jpql.xtext.jPQL.MinAggregate <em>Min Aggregate</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.yazgel.jpql.xtext.jPQL.MinAggregate
   * @generated
   */
  public Adapter createMinAggregateAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.yazgel.jpql.xtext.jPQL.SumAggregate <em>Sum Aggregate</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.yazgel.jpql.xtext.jPQL.SumAggregate
   * @generated
   */
  public Adapter createSumAggregateAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.yazgel.jpql.xtext.jPQL.CountAggregate <em>Count Aggregate</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.yazgel.jpql.xtext.jPQL.CountAggregate
   * @generated
   */
  public Adapter createCountAggregateAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.yazgel.jpql.xtext.jPQL.SelectConstructorExpression <em>Select Constructor Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.yazgel.jpql.xtext.jPQL.SelectConstructorExpression
   * @generated
   */
  public Adapter createSelectConstructorExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.yazgel.jpql.xtext.jPQL.FromClause <em>From Clause</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.yazgel.jpql.xtext.jPQL.FromClause
   * @generated
   */
  public Adapter createFromClauseAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.yazgel.jpql.xtext.jPQL.FromEntry <em>From Entry</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.yazgel.jpql.xtext.jPQL.FromEntry
   * @generated
   */
  public Adapter createFromEntryAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.yazgel.jpql.xtext.jPQL.VariableDeclaration <em>Variable Declaration</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.yazgel.jpql.xtext.jPQL.VariableDeclaration
   * @generated
   */
  public Adapter createVariableDeclarationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.yazgel.jpql.xtext.jPQL.FromClass <em>From Class</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.yazgel.jpql.xtext.jPQL.FromClass
   * @generated
   */
  public Adapter createFromClassAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.yazgel.jpql.xtext.jPQL.FromCollection <em>From Collection</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.yazgel.jpql.xtext.jPQL.FromCollection
   * @generated
   */
  public Adapter createFromCollectionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.yazgel.jpql.xtext.jPQL.FromJoin <em>From Join</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.yazgel.jpql.xtext.jPQL.FromJoin
   * @generated
   */
  public Adapter createFromJoinAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.yazgel.jpql.xtext.jPQL.Join <em>Join</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.yazgel.jpql.xtext.jPQL.Join
   * @generated
   */
  public Adapter createJoinAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.yazgel.jpql.xtext.jPQL.LeftJoin <em>Left Join</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.yazgel.jpql.xtext.jPQL.LeftJoin
   * @generated
   */
  public Adapter createLeftJoinAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.yazgel.jpql.xtext.jPQL.InnerJoin <em>Inner Join</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.yazgel.jpql.xtext.jPQL.InnerJoin
   * @generated
   */
  public Adapter createInnerJoinAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.yazgel.jpql.xtext.jPQL.WhereClause <em>Where Clause</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.yazgel.jpql.xtext.jPQL.WhereClause
   * @generated
   */
  public Adapter createWhereClauseAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.yazgel.jpql.xtext.jPQL.Expression <em>Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.yazgel.jpql.xtext.jPQL.Expression
   * @generated
   */
  public Adapter createExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.yazgel.jpql.xtext.jPQL.OperatorExpression <em>Operator Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.yazgel.jpql.xtext.jPQL.OperatorExpression
   * @generated
   */
  public Adapter createOperatorExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.yazgel.jpql.xtext.jPQL.ExistsExpression <em>Exists Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.yazgel.jpql.xtext.jPQL.ExistsExpression
   * @generated
   */
  public Adapter createExistsExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.yazgel.jpql.xtext.jPQL.AllExpression <em>All Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.yazgel.jpql.xtext.jPQL.AllExpression
   * @generated
   */
  public Adapter createAllExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.yazgel.jpql.xtext.jPQL.AnyExpression <em>Any Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.yazgel.jpql.xtext.jPQL.AnyExpression
   * @generated
   */
  public Adapter createAnyExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.yazgel.jpql.xtext.jPQL.SomeExpression <em>Some Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.yazgel.jpql.xtext.jPQL.SomeExpression
   * @generated
   */
  public Adapter createSomeExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.yazgel.jpql.xtext.jPQL.CollectionExpression <em>Collection Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.yazgel.jpql.xtext.jPQL.CollectionExpression
   * @generated
   */
  public Adapter createCollectionExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.yazgel.jpql.xtext.jPQL.NullComparisonExpression <em>Null Comparison Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.yazgel.jpql.xtext.jPQL.NullComparisonExpression
   * @generated
   */
  public Adapter createNullComparisonExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.yazgel.jpql.xtext.jPQL.EmptyComparisonExpression <em>Empty Comparison Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.yazgel.jpql.xtext.jPQL.EmptyComparisonExpression
   * @generated
   */
  public Adapter createEmptyComparisonExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.yazgel.jpql.xtext.jPQL.LikeExpression <em>Like Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.yazgel.jpql.xtext.jPQL.LikeExpression
   * @generated
   */
  public Adapter createLikeExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.yazgel.jpql.xtext.jPQL.InExpression <em>In Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.yazgel.jpql.xtext.jPQL.InExpression
   * @generated
   */
  public Adapter createInExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.yazgel.jpql.xtext.jPQL.InSeqExpression <em>In Seq Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.yazgel.jpql.xtext.jPQL.InSeqExpression
   * @generated
   */
  public Adapter createInSeqExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.yazgel.jpql.xtext.jPQL.InQueryExpression <em>In Query Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.yazgel.jpql.xtext.jPQL.InQueryExpression
   * @generated
   */
  public Adapter createInQueryExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.yazgel.jpql.xtext.jPQL.BetweenExpression <em>Between Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.yazgel.jpql.xtext.jPQL.BetweenExpression
   * @generated
   */
  public Adapter createBetweenExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.yazgel.jpql.xtext.jPQL.Variable <em>Variable</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.yazgel.jpql.xtext.jPQL.Variable
   * @generated
   */
  public Adapter createVariableAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.yazgel.jpql.xtext.jPQL.ExpressionTerm <em>Expression Term</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.yazgel.jpql.xtext.jPQL.ExpressionTerm
   * @generated
   */
  public Adapter createExpressionTermAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.yazgel.jpql.xtext.jPQL.AliasAttributeExpression <em>Alias Attribute Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.yazgel.jpql.xtext.jPQL.AliasAttributeExpression
   * @generated
   */
  public Adapter createAliasAttributeExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.yazgel.jpql.xtext.jPQL.ParameterExpression <em>Parameter Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.yazgel.jpql.xtext.jPQL.ParameterExpression
   * @generated
   */
  public Adapter createParameterExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.yazgel.jpql.xtext.jPQL.Function <em>Function</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.yazgel.jpql.xtext.jPQL.Function
   * @generated
   */
  public Adapter createFunctionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.yazgel.jpql.xtext.jPQL.Value <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.yazgel.jpql.xtext.jPQL.Value
   * @generated
   */
  public Adapter createValueAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.yazgel.jpql.xtext.jPQL.IntegerExpression <em>Integer Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.yazgel.jpql.xtext.jPQL.IntegerExpression
   * @generated
   */
  public Adapter createIntegerExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.yazgel.jpql.xtext.jPQL.StringExpression <em>String Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.yazgel.jpql.xtext.jPQL.StringExpression
   * @generated
   */
  public Adapter createStringExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.yazgel.jpql.xtext.jPQL.NullExpression <em>Null Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.yazgel.jpql.xtext.jPQL.NullExpression
   * @generated
   */
  public Adapter createNullExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.yazgel.jpql.xtext.jPQL.BooleanExpression <em>Boolean Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.yazgel.jpql.xtext.jPQL.BooleanExpression
   * @generated
   */
  public Adapter createBooleanExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.yazgel.jpql.xtext.jPQL.DateTimeExpression <em>Date Time Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.yazgel.jpql.xtext.jPQL.DateTimeExpression
   * @generated
   */
  public Adapter createDateTimeExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.yazgel.jpql.xtext.jPQL.OrExpression <em>Or Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.yazgel.jpql.xtext.jPQL.OrExpression
   * @generated
   */
  public Adapter createOrExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.yazgel.jpql.xtext.jPQL.AndExpression <em>And Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.yazgel.jpql.xtext.jPQL.AndExpression
   * @generated
   */
  public Adapter createAndExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for the default case.
   * <!-- begin-user-doc -->
   * This default implementation returns null.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @generated
   */
  public Adapter createEObjectAdapter()
  {
    return null;
  }

} //JPQLAdapterFactory
