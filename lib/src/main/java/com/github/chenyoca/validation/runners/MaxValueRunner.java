package com.github.chenyoca.validation.runners;

/**
 * User: chenyoca@gmail.com
 * Date: 2014-06-26
 * Value in max
 */
public class MaxValueRunner extends ValueTestRunner{

    public MaxValueRunner(){
        super("请输入小于{$1}的数值！");
    }

    @Override
    protected boolean testWithIntValues(double inputValue) {
        return inputValue <= intValue1;
    }

    @Override
    protected boolean testWithFloatValues(double inputValue) {
        return inputValue <= floatValue1;
    }
}