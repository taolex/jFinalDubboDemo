package demo;

import com.jfinal.aop.Before;
import com.jfinal.aop.Clear;
import com.jfinal.core.Controller;

/**
 * 类型描述：<br/>
 *
 * @author yuanxn
 * @createTime 2016/1/9
 */
@Before(CInterceptor.class)
public class HelloController extends Controller {

    @Before(MInterceptor.class)
    public void index() {
        renderText("Hello JFinal World.");
    }

    @Clear(CInterceptor.class)
    @Before(MInterceptor.class)
    public void helloJson() {
        User u = new User();
        u.setId("asdf");
        u.setUsername("taolex");
        renderJson(u);
    }
}
