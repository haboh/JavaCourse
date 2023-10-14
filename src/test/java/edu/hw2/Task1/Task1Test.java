package edu.hw2.Task1;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class Task1Test {
    @Test
    @DisplayName("Single expression")
    void singleExpression() {
        Expr constant = new Expr.Constant(3.0);
        assertThat(constant.evaluate()).isEqualTo(3.0);
        assertThat(new Expr.Negate(constant).evaluate()).isEqualTo(-3.0);
        assertThat(new Expr.Exponent(constant, 4.0).evaluate()).isEqualTo(81.0);
        assertThat(new Expr.Addition(constant, constant).evaluate()).isEqualTo(6.0);
        assertThat(new Expr.Multiplication(constant, constant).evaluate()).isEqualTo(9.0);
    }

    @Test
    @DisplayName("Complex expression")
    void complexExpression() {
        var two = new Expr.Constant(2);
        var four = new Expr.Constant(4);
        var negOne = new Expr.Negate(new Expr.Constant(1));
        var sumTwoFour = new Expr.Addition(two, four);
        var multiplication = new Expr.Multiplication(sumTwoFour, negOne);
        var exp = new Expr.Exponent(multiplication, 2);
        var res = new Expr.Addition(exp, new Expr.Constant(1));
        assertThat(res.evaluate()).isEqualTo(37);
    }
}
