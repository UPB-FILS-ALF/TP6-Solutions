// Generated from java-escape by ANTLR 4.11.1
package com.alf.parser;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link AlfParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface AlfVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by the {@code multilineProg}
	 * labeled alternative in {@link AlfParser#start}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultilineProg(AlfParser.MultilineProgContext ctx);
	/**
	 * Visit a parse tree produced by the {@code singlelineProg}
	 * labeled alternative in {@link AlfParser#start}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSinglelineProg(AlfParser.SinglelineProgContext ctx);
	/**
	 * Visit a parse tree produced by the {@code declarationRule}
	 * labeled alternative in {@link AlfParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclarationRule(AlfParser.DeclarationRuleContext ctx);
	/**
	 * Visit a parse tree produced by the {@code expressionRule}
	 * labeled alternative in {@link AlfParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressionRule(AlfParser.ExpressionRuleContext ctx);
	/**
	 * Visit a parse tree produced by the {@code attributionRule}
	 * labeled alternative in {@link AlfParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAttributionRule(AlfParser.AttributionRuleContext ctx);
	/**
	 * Visit a parse tree produced by the {@code functionRule}
	 * labeled alternative in {@link AlfParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionRule(AlfParser.FunctionRuleContext ctx);
	/**
	 * Visit a parse tree produced by the {@code returnRule}
	 * labeled alternative in {@link AlfParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturnRule(AlfParser.ReturnRuleContext ctx);
	/**
	 * Visit a parse tree produced by the {@code variableDeclaration}
	 * labeled alternative in {@link AlfParser#declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableDeclaration(AlfParser.VariableDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code typeInt}
	 * labeled alternative in {@link AlfParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeInt(AlfParser.TypeIntContext ctx);
	/**
	 * Visit a parse tree produced by the {@code typeFloat}
	 * labeled alternative in {@link AlfParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeFloat(AlfParser.TypeFloatContext ctx);
	/**
	 * Visit a parse tree produced by the {@code typeString}
	 * labeled alternative in {@link AlfParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeString(AlfParser.TypeStringContext ctx);
	/**
	 * Visit a parse tree produced by the {@code typeBoolean}
	 * labeled alternative in {@link AlfParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeBoolean(AlfParser.TypeBooleanContext ctx);
	/**
	 * Visit a parse tree produced by the {@code typeList}
	 * labeled alternative in {@link AlfParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeList(AlfParser.TypeListContext ctx);
	/**
	 * Visit a parse tree produced by the {@code valueInt}
	 * labeled alternative in {@link AlfParser#value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValueInt(AlfParser.ValueIntContext ctx);
	/**
	 * Visit a parse tree produced by the {@code valueFloat}
	 * labeled alternative in {@link AlfParser#value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValueFloat(AlfParser.ValueFloatContext ctx);
	/**
	 * Visit a parse tree produced by the {@code valueString}
	 * labeled alternative in {@link AlfParser#value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValueString(AlfParser.ValueStringContext ctx);
	/**
	 * Visit a parse tree produced by the {@code valueBoolean}
	 * labeled alternative in {@link AlfParser#value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValueBoolean(AlfParser.ValueBooleanContext ctx);
	/**
	 * Visit a parse tree produced by the {@code valueList}
	 * labeled alternative in {@link AlfParser#value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValueList(AlfParser.ValueListContext ctx);
	/**
	 * Visit a parse tree produced by the {@code valueVariable}
	 * labeled alternative in {@link AlfParser#value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValueVariable(AlfParser.ValueVariableContext ctx);
	/**
	 * Visit a parse tree produced by the {@code listValues}
	 * labeled alternative in {@link AlfParser#list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitListValues(AlfParser.ListValuesContext ctx);
	/**
	 * Visit a parse tree produced by the {@code expressionValue}
	 * labeled alternative in {@link AlfParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressionValue(AlfParser.ExpressionValueContext ctx);
	/**
	 * Visit a parse tree produced by the {@code expressionNot}
	 * labeled alternative in {@link AlfParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressionNot(AlfParser.ExpressionNotContext ctx);
	/**
	 * Visit a parse tree produced by the {@code expressionMultiply}
	 * labeled alternative in {@link AlfParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressionMultiply(AlfParser.ExpressionMultiplyContext ctx);
	/**
	 * Visit a parse tree produced by the {@code expressionDivision}
	 * labeled alternative in {@link AlfParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressionDivision(AlfParser.ExpressionDivisionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code expressionAnd}
	 * labeled alternative in {@link AlfParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressionAnd(AlfParser.ExpressionAndContext ctx);
	/**
	 * Visit a parse tree produced by the {@code expressionSubtraction}
	 * labeled alternative in {@link AlfParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressionSubtraction(AlfParser.ExpressionSubtractionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code expressionOr}
	 * labeled alternative in {@link AlfParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressionOr(AlfParser.ExpressionOrContext ctx);
	/**
	 * Visit a parse tree produced by the {@code expressionRem}
	 * labeled alternative in {@link AlfParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressionRem(AlfParser.ExpressionRemContext ctx);
	/**
	 * Visit a parse tree produced by the {@code expressionParanthesis}
	 * labeled alternative in {@link AlfParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressionParanthesis(AlfParser.ExpressionParanthesisContext ctx);
	/**
	 * Visit a parse tree produced by the {@code expressionAddition}
	 * labeled alternative in {@link AlfParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressionAddition(AlfParser.ExpressionAdditionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code variableAttribution}
	 * labeled alternative in {@link AlfParser#attribution}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableAttribution(AlfParser.VariableAttributionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code functionDefinition}
	 * labeled alternative in {@link AlfParser#function}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionDefinition(AlfParser.FunctionDefinitionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code returnValue}
	 * labeled alternative in {@link AlfParser#return}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturnValue(AlfParser.ReturnValueContext ctx);
}