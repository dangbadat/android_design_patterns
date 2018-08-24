package com.example.jingbin.designpattern.interpreter;

/**
 * Description: #TODO
 *
 */
public abstract class AbstractExpression {
    /**
     * 抽象的解析方法
     * @param context 上下文环境对象
     */
    public abstract void interpret(Context context);
}
