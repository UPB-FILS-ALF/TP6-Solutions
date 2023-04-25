// Generated from java-escape by ANTLR 4.11.1
package com.alf.parser;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link AlfParser}.
 */
public interface AlfListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by the {@code multilineProg}
	 * labeled alternative in {@link AlfParser#start}.
	 * @param ctx the parse tree
	 */
	void enterMultilineProg(AlfParser.MultilineProgContext ctx);
	/**
	 * Exit a parse tree produced by the {@code multilineProg}
	 * labeled alternative in {@link AlfParser#start}.
	 * @param ctx the parse tree
	 */
	void exitMultilineProg(AlfParser.MultilineProgContext ctx);
	/**
	 * Enter a parse tree produced by the {@code singlelineProg}
	 * labeled alternative in {@link AlfParser#start}.
	 * @param ctx the parse tree
	 */
	void enterSinglelineProg(AlfParser.SinglelineProgContext ctx);
	/**
	 * Exit a parse tree produced by the {@code singlelineProg}
	 * labeled alternative in {@link AlfParser#start}.
	 * @param ctx the parse tree
	 */
	void exitSinglelineProg(AlfParser.SinglelineProgContext ctx);
	/**
	 * Enter a parse tree produced by the {@code declarationRule}
	 * labeled alternative in {@link AlfParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterDeclarationRule(AlfParser.DeclarationRuleContext ctx);
	/**
	 * Exit a parse tree produced by the {@code declarationRule}
	 * labeled alternative in {@link AlfParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitDeclarationRule(AlfParser.DeclarationRuleContext ctx);
	/**
	 * Enter a parse tree produced by the {@code expressionRule}
	 * labeled alternative in {@link AlfParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterExpressionRule(AlfParser.ExpressionRuleContext ctx);
	/**
	 * Exit a parse tree produced by the {@code expressionRule}
	 * labeled alternative in {@link AlfParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitExpressionRule(AlfParser.ExpressionRuleContext ctx);
	/**
	 * Enter a parse tree produced by the {@code attributionRule}
	 * labeled alternative in {@link AlfParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterAttributionRule(AlfParser.AttributionRuleContext ctx);
	/**
	 * Exit a parse tree produced by the {@code attributionRule}
	 * labeled alternative in {@link AlfParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitAttributionRule(AlfParser.AttributionRuleContext ctx);
	/**
	 * Enter a parse tree produced by the {@code functionRule}
	 * labeled alternative in {@link AlfParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterFunctionRule(AlfParser.FunctionRuleContext ctx);
	/**
	 * Exit a parse tree produced by the {@code functionRule}
	 * labeled alternative in {@link AlfParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitFunctionRule(AlfParser.FunctionRuleContext ctx);
	/**
	 * Enter a parse tree produced by the {@code returnRule}
	 * labeled alternative in {@link AlfParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterReturnRule(AlfParser.ReturnRuleContext ctx);
	/**
	 * Exit a parse tree produced by the {@code returnRule}
	 * labeled alternative in {@link AlfParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitReturnRule(AlfParser.ReturnRuleContext ctx);
	/**
	 * Enter a parse tree produced by the {@code variableDeclaration}
	 * labeled alternative in {@link AlfParser#declaration}.
	 * @param ctx the parse tree
	 */
	void enterVariableDeclaration(AlfParser.VariableDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code variableDeclaration}
	 * labeled alternative in {@link AlfParser#declaration}.
	 * @param ctx the parse tree
	 */
	void exitVariableDeclaration(AlfParser.VariableDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code typeInt}
	 * labeled alternative in {@link AlfParser#type}.
	 * @param ctx the parse tree
	 */
	void enterTypeInt(AlfParser.TypeIntContext ctx);
	/**
	 * Exit a parse tree produced by the {@code typeInt}
	 * labeled alternative in {@link AlfParser#type}.
	 * @param ctx the parse tree
	 */
	void exitTypeInt(AlfParser.TypeIntContext ctx);
	/**
	 * Enter a parse tree produced by the {@code typeFloat}
	 * labeled alternative in {@link AlfParser#type}.
	 * @param ctx the parse tree
	 */
	void enterTypeFloat(AlfParser.TypeFloatContext ctx);
	/**
	 * Exit a parse tree produced by the {@code typeFloat}
	 * labeled alternative in {@link AlfParser#type}.
	 * @param ctx the parse tree
	 */
	void exitTypeFloat(AlfParser.TypeFloatContext ctx);
	/**
	 * Enter a parse tree produced by the {@code typeString}
	 * labeled alternative in {@link AlfParser#type}.
	 * @param ctx the parse tree
	 */
	void enterTypeString(AlfParser.TypeStringContext ctx);
	/**
	 * Exit a parse tree produced by the {@code typeString}
	 * labeled alternative in {@link AlfParser#type}.
	 * @param ctx the parse tree
	 */
	void exitTypeString(AlfParser.TypeStringContext ctx);
	/**
	 * Enter a parse tree produced by the {@code typeBoolean}
	 * labeled alternative in {@link AlfParser#type}.
	 * @param ctx the parse tree
	 */
	void enterTypeBoolean(AlfParser.TypeBooleanContext ctx);
	/**
	 * Exit a parse tree produced by the {@code typeBoolean}
	 * labeled alternative in {@link AlfParser#type}.
	 * @param ctx the parse tree
	 */
	void exitTypeBoolean(AlfParser.TypeBooleanContext ctx);
	/**
	 * Enter a parse tree produced by the {@code typeList}
	 * labeled alternative in {@link AlfParser#type}.
	 * @param ctx the parse tree
	 */
	void enterTypeList(AlfParser.TypeListContext ctx);
	/**
	 * Exit a parse tree produced by the {@code typeList}
	 * labeled alternative in {@link AlfParser#type}.
	 * @param ctx the parse tree
	 */
	void exitTypeList(AlfParser.TypeListContext ctx);
	/**
	 * Enter a parse tree produced by the {@code valueInt}
	 * labeled alternative in {@link AlfParser#value}.
	 * @param ctx the parse tree
	 */
	void enterValueInt(AlfParser.ValueIntContext ctx);
	/**
	 * Exit a parse tree produced by the {@code valueInt}
	 * labeled alternative in {@link AlfParser#value}.
	 * @param ctx the parse tree
	 */
	void exitValueInt(AlfParser.ValueIntContext ctx);
	/**
	 * Enter a parse tree produced by the {@code valueFloat}
	 * labeled alternative in {@link AlfParser#value}.
	 * @param ctx the parse tree
	 */
	void enterValueFloat(AlfParser.ValueFloatContext ctx);
	/**
	 * Exit a parse tree produced by the {@code valueFloat}
	 * labeled alternative in {@link AlfParser#value}.
	 * @param ctx the parse tree
	 */
	void exitValueFloat(AlfParser.ValueFloatContext ctx);
	/**
	 * Enter a parse tree produced by the {@code valueString}
	 * labeled alternative in {@link AlfParser#value}.
	 * @param ctx the parse tree
	 */
	void enterValueString(AlfParser.ValueStringContext ctx);
	/**
	 * Exit a parse tree produced by the {@code valueString}
	 * labeled alternative in {@link AlfParser#value}.
	 * @param ctx the parse tree
	 */
	void exitValueString(AlfParser.ValueStringContext ctx);
	/**
	 * Enter a parse tree produced by the {@code valueBoolean}
	 * labeled alternative in {@link AlfParser#value}.
	 * @param ctx the parse tree
	 */
	void enterValueBoolean(AlfParser.ValueBooleanContext ctx);
	/**
	 * Exit a parse tree produced by the {@code valueBoolean}
	 * labeled alternative in {@link AlfParser#value}.
	 * @param ctx the parse tree
	 */
	void exitValueBoolean(AlfParser.ValueBooleanContext ctx);
	/**
	 * Enter a parse tree produced by the {@code valueList}
	 * labeled alternative in {@link AlfParser#value}.
	 * @param ctx the parse tree
	 */
	void enterValueList(AlfParser.ValueListContext ctx);
	/**
	 * Exit a parse tree produced by the {@code valueList}
	 * labeled alternative in {@link AlfParser#value}.
	 * @param ctx the parse tree
	 */
	void exitValueList(AlfParser.ValueListContext ctx);
	/**
	 * Enter a parse tree produced by the {@code valueVariable}
	 * labeled alternative in {@link AlfParser#value}.
	 * @param ctx the parse tree
	 */
	void enterValueVariable(AlfParser.ValueVariableContext ctx);
	/**
	 * Exit a parse tree produced by the {@code valueVariable}
	 * labeled alternative in {@link AlfParser#value}.
	 * @param ctx the parse tree
	 */
	void exitValueVariable(AlfParser.ValueVariableContext ctx);
	/**
	 * Enter a parse tree produced by the {@code listValues}
	 * labeled alternative in {@link AlfParser#list}.
	 * @param ctx the parse tree
	 */
	void enterListValues(AlfParser.ListValuesContext ctx);
	/**
	 * Exit a parse tree produced by the {@code listValues}
	 * labeled alternative in {@link AlfParser#list}.
	 * @param ctx the parse tree
	 */
	void exitListValues(AlfParser.ListValuesContext ctx);
	/**
	 * Enter a parse tree produced by the {@code expressionValue}
	 * labeled alternative in {@link AlfParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpressionValue(AlfParser.ExpressionValueContext ctx);
	/**
	 * Exit a parse tree produced by the {@code expressionValue}
	 * labeled alternative in {@link AlfParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpressionValue(AlfParser.ExpressionValueContext ctx);
	/**
	 * Enter a parse tree produced by the {@code expressionNot}
	 * labeled alternative in {@link AlfParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpressionNot(AlfParser.ExpressionNotContext ctx);
	/**
	 * Exit a parse tree produced by the {@code expressionNot}
	 * labeled alternative in {@link AlfParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpressionNot(AlfParser.ExpressionNotContext ctx);
	/**
	 * Enter a parse tree produced by the {@code expressionMultiply}
	 * labeled alternative in {@link AlfParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpressionMultiply(AlfParser.ExpressionMultiplyContext ctx);
	/**
	 * Exit a parse tree produced by the {@code expressionMultiply}
	 * labeled alternative in {@link AlfParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpressionMultiply(AlfParser.ExpressionMultiplyContext ctx);
	/**
	 * Enter a parse tree produced by the {@code expressionDivision}
	 * labeled alternative in {@link AlfParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpressionDivision(AlfParser.ExpressionDivisionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code expressionDivision}
	 * labeled alternative in {@link AlfParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpressionDivision(AlfParser.ExpressionDivisionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code expressionAnd}
	 * labeled alternative in {@link AlfParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpressionAnd(AlfParser.ExpressionAndContext ctx);
	/**
	 * Exit a parse tree produced by the {@code expressionAnd}
	 * labeled alternative in {@link AlfParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpressionAnd(AlfParser.ExpressionAndContext ctx);
	/**
	 * Enter a parse tree produced by the {@code expressionSubtraction}
	 * labeled alternative in {@link AlfParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpressionSubtraction(AlfParser.ExpressionSubtractionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code expressionSubtraction}
	 * labeled alternative in {@link AlfParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpressionSubtraction(AlfParser.ExpressionSubtractionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code expressionOr}
	 * labeled alternative in {@link AlfParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpressionOr(AlfParser.ExpressionOrContext ctx);
	/**
	 * Exit a parse tree produced by the {@code expressionOr}
	 * labeled alternative in {@link AlfParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpressionOr(AlfParser.ExpressionOrContext ctx);
	/**
	 * Enter a parse tree produced by the {@code expressionRem}
	 * labeled alternative in {@link AlfParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpressionRem(AlfParser.ExpressionRemContext ctx);
	/**
	 * Exit a parse tree produced by the {@code expressionRem}
	 * labeled alternative in {@link AlfParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpressionRem(AlfParser.ExpressionRemContext ctx);
	/**
	 * Enter a parse tree produced by the {@code expressionParanthesis}
	 * labeled alternative in {@link AlfParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpressionParanthesis(AlfParser.ExpressionParanthesisContext ctx);
	/**
	 * Exit a parse tree produced by the {@code expressionParanthesis}
	 * labeled alternative in {@link AlfParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpressionParanthesis(AlfParser.ExpressionParanthesisContext ctx);
	/**
	 * Enter a parse tree produced by the {@code expressionAddition}
	 * labeled alternative in {@link AlfParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpressionAddition(AlfParser.ExpressionAdditionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code expressionAddition}
	 * labeled alternative in {@link AlfParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpressionAddition(AlfParser.ExpressionAdditionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code variableAttribution}
	 * labeled alternative in {@link AlfParser#attribution}.
	 * @param ctx the parse tree
	 */
	void enterVariableAttribution(AlfParser.VariableAttributionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code variableAttribution}
	 * labeled alternative in {@link AlfParser#attribution}.
	 * @param ctx the parse tree
	 */
	void exitVariableAttribution(AlfParser.VariableAttributionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code functionDefinition}
	 * labeled alternative in {@link AlfParser#function}.
	 * @param ctx the parse tree
	 */
	void enterFunctionDefinition(AlfParser.FunctionDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code functionDefinition}
	 * labeled alternative in {@link AlfParser#function}.
	 * @param ctx the parse tree
	 */
	void exitFunctionDefinition(AlfParser.FunctionDefinitionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code returnValue}
	 * labeled alternative in {@link AlfParser#return}.
	 * @param ctx the parse tree
	 */
	void enterReturnValue(AlfParser.ReturnValueContext ctx);
	/**
	 * Exit a parse tree produced by the {@code returnValue}
	 * labeled alternative in {@link AlfParser#return}.
	 * @param ctx the parse tree
	 */
	void exitReturnValue(AlfParser.ReturnValueContext ctx);
}