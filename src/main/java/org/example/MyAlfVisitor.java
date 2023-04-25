package org.example;

import com.alf.parser.AlfParser;
import com.alf.parser.AlfVisitor;
import org.antlr.v4.runtime.tree.AbstractParseTreeVisitor;

import java.util.ArrayList;

public class MyAlfVisitor extends AbstractParseTreeVisitor<ASTNode> implements AlfVisitor<ASTNode> {
    public StatementsNode defaultResult() {
        ArrayList<ASTNode> astNodeEmpty = new ArrayList<>();
        return new StatementsNode(astNodeEmpty, 0);
    }
    public StatementsNode visitMultilineProg(AlfParser.MultilineProgContext ctx){
        ArrayList<ASTNode> statements = new ArrayList<>();
        for(AlfParser.StatementContext statement : ctx.statement()){
            statements.add(this.visit(statement));
        }
        if(statements.size() != 0){
            return new StatementsNode(statements, 1);
        }
        else {
            throw new Error();
        }
    }

    @Override
    public ASTNode visitSinglelineProg(AlfParser.SinglelineProgContext ctx) {
        ArrayList<ASTNode> sn = new ArrayList<ASTNode>();
        sn.add(this.visit(ctx.statement()));
        return new StatementsNode(sn, 1);
    }

    public DeclarationNode visitDeclarationRule(AlfParser.DeclarationRuleContext ctx) {
        return (DeclarationNode) this.visit(ctx.declaration());
    }

    public ExpressionNode visitExpressionRule(AlfParser.ExpressionRuleContext ctx) {
        return (ExpressionNode) this.visit(ctx.expression());
    }

    @Override
    public AttributionNode visitAttributionRule(AlfParser.AttributionRuleContext ctx) {
        return (AttributionNode) this.visit(ctx.attribution());
    }

    @Override
    public FunctionNode visitFunctionRule(AlfParser.FunctionRuleContext ctx) {
        return (FunctionNode) this.visit(ctx.function());
    }

    @Override
    public ReturnNode visitReturnRule(AlfParser.ReturnRuleContext ctx) {
        return (ReturnNode) this.visit(ctx.return_());
    }

    public DeclarationNode visitVariableDeclaration(AlfParser.VariableDeclarationContext ctx) {
        return new DeclarationNode(
                ((TypeNode) this.visit(ctx.type())).typeName,
                ctx.VARIABLE().getText(),
                this.visit(ctx.expression()),
                ctx.VARIABLE().getSymbol().getLine()
        );
    }
    public ValueNode visitValueInt(AlfParser.ValueIntContext ctx) {
        return new ValueNode(
                Integer.parseInt(ctx.INT_NUMBER().getText()),
                ctx.INT_NUMBER().getSymbol().getLine()
        );
    }
    public ValueNode visitValueFloat(AlfParser.ValueFloatContext ctx) {
        return new ValueNode(
                Float.parseFloat(ctx.FLOAT_NUMBER().getText()),
                ctx.FLOAT_NUMBER().getSymbol().getLine()
        );
    }
    public ValueNode visitValueString(AlfParser.ValueStringContext ctx) {
        return new ValueNode(
                ctx.STRING_TEXT().getText(),
                ctx.STRING_TEXT().getSymbol().getLine()
        );
    }

    @Override
    public ValueNode visitValueBoolean(AlfParser.ValueBooleanContext ctx) {
        return new ValueNode(
                ctx.BOOLEAN_TEXT().getText(),
                ctx.BOOLEAN_TEXT().getSymbol().getLine()
        );
    }

    @Override
    public ASTNode visitValueList(AlfParser.ValueListContext ctx) {
        return this.visit(ctx.list());
    }

    @Override
    public ValueNode visitValueVariable(AlfParser.ValueVariableContext ctx) {
        return new ValueNode(
                ctx.VARIABLE().getText(),
                ctx.VARIABLE().getSymbol().getLine()
        );
    }

    @Override
    public ListNode visitListValues(AlfParser.ListValuesContext ctx) {
        ArrayList<Object> ln = new ArrayList<>();
        for(int i = 0; i < ctx.value().size(); i++) {
            ln.add(this.visit(ctx.value(i)));
        }
        return new ListNode(
                ln,
                ctx.BRACKETS_L().getSymbol().getLine()
        );
    }

    @Override
    public ASTNode visitExpressionValue(AlfParser.ExpressionValueContext ctx) {
        ASTNode value = this.visit(ctx.value());
        if(value != null) {
            return value;
        }
        else {
            throw new Error();
        }
    }

    public TypeNode visitTypeInt(AlfParser.TypeIntContext ctx) {
        return new TypeNode(
                ctx.INT().getText(),
                ctx.INT().getSymbol().getLine()
        );
    }
    public TypeNode visitTypeFloat(AlfParser.TypeFloatContext ctx) {
        return new TypeNode(
                ctx.FLOAT().getText(),
                ctx.FLOAT().getSymbol().getLine()
        );
    }
    public TypeNode visitTypeString(AlfParser.TypeStringContext ctx) {
        return new TypeNode(
                ctx.STRING().getText(),
                ctx.STRING().getSymbol().getLine()
        );
    }

    @Override
    public TypeNode visitTypeBoolean(AlfParser.TypeBooleanContext ctx) {
        return new TypeNode(
                ctx.BOOLEAN().getText(),
                ctx.BOOLEAN().getSymbol().getLine()
        );
    }

    @Override
    public ASTNode visitTypeList(AlfParser.TypeListContext ctx) {
        return new TypeNode(
                ctx.LIST().getText(),
                ctx.LIST().getSymbol().getLine()
        );
    }

    public ExpressionNode visitExpressionMultiply(AlfParser.ExpressionMultiplyContext ctx) {
        ASTNode left = this.visit(ctx.expression(0));
        ASTNode right = this.visit(ctx.expression(1));
        String op = ctx.op.getText();
        if(op.length() != 0) {
            return new ExpressionNode(
                    left,
                    right,
                    op,
                    ctx.op.getLine()
            );
        }
        else {
            throw new Error();
        }
    }

    @Override
    public ASTNode visitExpressionNot(AlfParser.ExpressionNotContext ctx) {
        ASTNode exp = this.visit(ctx.expression());
        String op = ctx.op.getText();
        if(op.length() != 0) {
            return new ExpressionNode(
                    exp,
                    op,
                    ctx.op.getLine()
            );
        }
        else {
            throw new Error();
        }
    }

    public ExpressionNode visitExpressionDivision(AlfParser.ExpressionDivisionContext ctx) {
        ASTNode left = this.visit(ctx.expression(0));
        ASTNode right = this.visit(ctx.expression(1));
        String op = ctx.op.getText();
        if(op.length() != 0) {
            return new ExpressionNode(
                    left,
                    right,
                    op,
                    ctx.op.getLine()
            );
        }
        else {
            throw new Error();
        }
    }

    @Override
    public ASTNode visitExpressionAnd(AlfParser.ExpressionAndContext ctx) {
        ASTNode left = this.visit(ctx.expression(0));
        ASTNode right = this.visit(ctx.expression(1));
        String op = ctx.op.getText();
        if(op.length() != 0) {
            return new ExpressionNode(
                    left,
                    right,
                    op,
                    ctx.op.getLine()
            );
        }
        else {
            throw new Error();
        }
    }

    public ExpressionNode visitExpressionSubtraction(AlfParser.ExpressionSubtractionContext ctx) {
        ExpressionNode left = (ExpressionNode) this.visit(ctx.expression(0));
        ExpressionNode right = (ExpressionNode) this.visit(ctx.expression(1));
        String op = ctx.op.getText();
        if(op.length() != 0) {
            return new ExpressionNode(
                    left,
                    right,
                    op,
                    ctx.op.getLine()
            );
        }
        else {
            throw new Error();
        }
    }

    @Override
    public ASTNode visitExpressionOr(AlfParser.ExpressionOrContext ctx) {
        ASTNode left = this.visit(ctx.expression(0));
        ASTNode right = this.visit(ctx.expression(1));
        String op = ctx.op.getText();
        if(op.length() != 0) {
            return new ExpressionNode(
                    left,
                    right,
                    op,
                    ctx.op.getLine()
            );
        }
        else {
            throw new Error();
        }
    }

    public ExpressionNode visitExpressionRem(AlfParser.ExpressionRemContext ctx) {
        ExpressionNode left = (ExpressionNode) this.visit(ctx.expression(0));
        ExpressionNode right = (ExpressionNode) this.visit(ctx.expression(1));
        String op = ctx.op.getText();
        if(op.length() != 0) {
            return new ExpressionNode(
                    left,
                    right,
                    op,
                    ctx.op.getLine()
            );
        }
        else {
            throw new Error();
        }
    }
    public ExpressionNode visitExpressionAddition(AlfParser.ExpressionAdditionContext ctx) {
        ASTNode left =  this.visit(ctx.expression(0));
        ASTNode right = this.visit(ctx.expression(1));
        String op = ctx.op.getText();
        if(op.length() != 0) {
            return new ExpressionNode(
                    left,
                    right,
                    op,
                    ctx.op.getLine()
            );
        }
        else {
            throw new Error();
        }
    }

    @Override
    public ASTNode visitVariableAttribution(AlfParser.VariableAttributionContext ctx) {
        return new AttributionNode(
                ctx.VARIABLE().getText(),
                this.visit(ctx.expression()),
                ctx.VARIABLE().getSymbol().getLine()
        );
    }

    @Override
    public FunctionNode visitFunctionDefinition(AlfParser.FunctionDefinitionContext ctx) {
        ArrayList<DeclarationNode> params = new ArrayList<>();
        for(int i = 0; i < ctx.declaration().size(); i++) {
            params.add((DeclarationNode) this.visit(ctx.declaration(i)));
        }

        ArrayList<ASTNode> lines = new ArrayList<>();
        for(int i = 0; i < ctx.statement().size(); i++) {
            lines.add(this.visit(ctx.statement(i)));
        }
        return new FunctionNode(
                ctx.VARIABLE().getText(),
                params,
                lines,
                (ReturnNode) this.visit(ctx.return_()),
                ctx.VARIABLE().getSymbol().getLine()
        );
    }

    @Override
    public ReturnNode visitReturnValue(AlfParser.ReturnValueContext ctx) {
        return new ReturnNode(
                (ExpressionNode) this.visit(ctx.expression()),
                ctx.RETURN().getSymbol().getLine()
        );
    }

    public ExpressionNode visitExpressionSubstraction(AlfParser.ExpressionSubtractionContext ctx) {
        ExpressionNode left = (ExpressionNode) this.visit(ctx.expression(0));
        ExpressionNode right = (ExpressionNode) this.visit(ctx.expression(1));
        String op = ctx.op.getText();
        if(op.length() != 0) {
            return new ExpressionNode(
                    left,
                    right,
                    op,
                    ctx.op.getLine()
            );
        }
        else {
            throw new Error();
        }
    }
    public ExpressionNode visitExpressionParanthesis(AlfParser.ExpressionParanthesisContext ctx){
        return (ExpressionNode) this.visit(ctx.expression());
    }

}
