package top.meethigher.springeventdemo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

/**
 * @author chenchuancheng
 * @description 事件注册
 * @since 2021/8/16 14:34
 */
@Component
public class Registry {
    public static final Logger log = LoggerFactory.getLogger(Registry.class);

    @Autowired
    private ApplicationContext context;

    public void registryEvent() {
        String str = "我发送一个事件，监听到你就输出Halo Wode";
        log.info(str);
        context.publishEvent(str);
    }

    public void registryEvent2() {
        Pojo pojo = new Pojo();
        pojo.setName("八戒");
        log.info("创建一个" + pojo + "，你给他养到20岁");
        context.publishEvent(pojo);
    }
}
