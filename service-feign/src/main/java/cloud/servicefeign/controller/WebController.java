package cloud.servicefeign.controller;

import cloud.servicefeign.feign.HelloWorldService;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author ：zhouxiwang
 * @Description:
 * @Date: 12:56 2019/4/1
 * @Modified by:
 */

@RestController
public class WebController {
    @Autowired
    private HelloWorldService helloWorldFeignService;
    @RequestMapping(value = "/hello",method = RequestMethod.GET)
    public String sayHello(){
        return helloWorldFeignService.home();
    }

    public String serviceFailure() {
        return "hello world service is not available !";
    }
}
