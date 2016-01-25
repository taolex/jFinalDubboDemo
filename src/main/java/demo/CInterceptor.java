package demo;

import com.jfinal.aop.Interceptor;
import com.jfinal.aop.Invocation;

/**
 * 类型描述：<br/>
 *
 * @author yuanxn
 * @createTime 2016/1/11
 */
public class CInterceptor implements Interceptor {

    public void intercept(Invocation invocation) {
        System.out.println("Before CInterceptor invoking");
        invocation.invoke();
        System.out.println("After CInterceptor invoking");
    }
}
