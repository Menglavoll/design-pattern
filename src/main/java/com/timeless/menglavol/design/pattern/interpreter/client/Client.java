package com.timeless.menglavol.design.pattern.interpreter.client;

import com.timeless.menglavol.design.pattern.interpreter.context.Context;
import com.timeless.menglavol.design.pattern.interpreter.expression.AbstractExpression;
import com.timeless.menglavol.design.pattern.interpreter.expression.EndExpression;
import com.timeless.menglavol.design.pattern.interpreter.expression.StartExpression;

import java.util.*;

/**
 * @ClassName: Client
 * @Description: 客户端类
 * @Author: timeless
 * @Date: 2024/9/15
 */
public class Client {

    public static void main(String[] args) {
        Context context = new Context();
        context.setContent("start to end");

        List<AbstractExpression> expressions = new ArrayList<>();
        expressions.add(new StartExpression("开始解释器"));
        expressions.add(new EndExpression("结束解释器"));

        for (AbstractExpression expression : expressions) {
            expression.interpret(context);
        }
    }
}
