package AST.Expression;

public class LessOrEqualComparisonExpressionNode extends ExpressionNode {
    private final ExpressionNode left;
    private final ExpressionNode right;

    public LessOrEqualComparisonExpressionNode(ExpressionNode left, ExpressionNode right) {
        this.left = left;
        this.right = right;
    }

    public ExpressionNode getLeft() {
        return left;
    }

    public ExpressionNode getRight() {
        return right;
    }

    @Override
    public String toString() {
        return "LessOrEqualComparisonExpressionNode{" +
                left + "<=" + right +
                '}';
    }
}
