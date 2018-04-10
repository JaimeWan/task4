package com.AOP;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;

/**
 * @Author: Jaime
 * @Date: 2018/4/10 22:44
 * @Description: *
 */
@Aspect
public class AOPtest {
    @Pointcut("execution(* com.controller.SpringController.indexPage())")
    public void ss() {

    }
}
