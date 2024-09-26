package com.timeless.menglavol.design.pattern.interpreter.expression;


import com.timeless.menglavol.design.pattern.interpreter.context.Context;

/**
 * @ClassName: StartExpression
 * @Description: start表达式 解释器
 * @Author: timeless
 * @Date: 2024/9/17
 */
public class StartExpression extends AbstractExpression {

    private String name;

    public StartExpression(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void interpret(Context context) {
        if (context.getContent().startsWith("start")){
            System.out.println(name + "解析到" + context.getContent() + "中以start开始， 进行下一项解析");
        } else {
            System.out.println(name + "解析到" + context.getContent() + "中不以start开始，进行下一项解析");
        }
    }
}
