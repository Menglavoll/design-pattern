package com.timeless.menglavol.design.pattern.interpreter.expression;


import com.timeless.menglavol.design.pattern.interpreter.context.Context;

/**
 * @ClassName: AbstractExpression
 * @Description: 抽象表达式
 * @Author: timeless
 * @Date: 2024/9/17
 */
public abstract class AbstractExpression {

    // 解释方法
    public abstract void interpret(Context context);
}
