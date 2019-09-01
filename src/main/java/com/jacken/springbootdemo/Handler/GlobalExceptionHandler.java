package com.jacken.springbootdemo.Handler;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

/**
 * 捕获全局异常handler 拦截异常
 */
@ControllerAdvice//定义切面
public class GlobalExceptionHandler {
    @ResponseBody
    @ExceptionHandler(RuntimeException.class)
    public Map<String,Object> exceptionHandler(){

        HashMap<String, Object> map = new HashMap<>();
        map.put("code","500");
        map.put("msg","系统错误，请稍后重试");
        return  map;

    }
}
