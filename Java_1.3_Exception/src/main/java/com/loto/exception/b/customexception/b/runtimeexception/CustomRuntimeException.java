package com.loto.exception.b.customexception.b.runtimeexception;

/**
 * Author：蓝田_Loto
 * <p>PageName：CustomRuntimeException.java</p>
 * <p>Function：自定义异常继承RuntimeException
 */

public class CustomRuntimeException extends RuntimeException { // 此处继承运行时异常
    // 必须提供一个空参构造器
    public CustomRuntimeException() {
    }

    // 构造方法中，super将异常信息传递给父类
    public CustomRuntimeException(String message) {
        super(message);
    }
}
