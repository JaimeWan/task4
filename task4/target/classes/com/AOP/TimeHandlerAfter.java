package com.AOP;

import com.DAO.TimeHandler;
import org.aspectj.lang.annotation.Aspect;
import org.junit.Test;

/**
 * @Author: Jaime
 * @Date: 2018/4/10 15:46
 * @Description: *
 */

public class TimeHandlerAfter {
    Long a;
    Long b;
    public Long time1() throws InterruptedException {
        a=System.currentTimeMillis();
        return a;
    }
    public Long time2(){
        b=System.currentTimeMillis();
        return b;
    }
@Test
    public void printTime() throws InterruptedException {
          Long c=this.time2()-this.time1();
    System.out.println(c);
    }

}
