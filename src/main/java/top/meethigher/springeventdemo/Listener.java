package top.meethigher.springeventdemo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

/**
 * @description 事件监听
 * @author chenchuancheng
 * @since 2021/8/16 14:34
 */
@Component
public class Listener {
    public static final Logger log= LoggerFactory.getLogger(Listener.class);
    @EventListener
    public void listen(String message){
        log.info("Halo Wode");
    }
    @EventListener
    public void listen2(Pojo pojo){
        log.info("接收到"+pojo);
        pojo.setAge(20);
        log.info("养到20岁"+pojo);
    }
}
