package demo;

import com.jfinal.config.*;

/**
 * 类型描述：<br/>
 *
 * @author yuanxn
 * @createTime 2016/1/9
 */
public class DemoConfig extends JFinalConfig {

    public void configRoute(Routes me) {
        me.add("/hello", HelloController.class);
    }

    public void configPlugin(Plugins me) {
    }

    public void configInterceptor(Interceptors me) {
        me.addGlobalActionInterceptor(new GInterceptor());

    }

    public void configHandler(Handlers me) {
    }

    @Override
    public void configConstant(Constants constants) {

    }
}