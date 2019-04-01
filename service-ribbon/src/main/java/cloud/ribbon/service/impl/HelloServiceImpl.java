package cloud.ribbon.service.impl;

import cloud.ribbon.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * @Author ：zhouxiwang
 * @Description:
 * @Date: 11:35 2019/4/1
 * @Modified by:
 */
@Service("helloService")
public class HelloServiceImpl implements HelloService {

    @Autowired
    private RestTemplate restTemplate;

    @Override
    public String getHelloContent() {
        return restTemplate.getForObject("http://CONFIG-CLIENT/",String.class);
    }
}
