package cloud.ribbon.controller;

import cloud.ribbon.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author ：zhouxiwang
 * @Description:
 * @Date: 11:37 2019/4/1
 * @Modified by:
 */
@RestController
public class HelloController {
    @Autowired
    private HelloService helloService;

    @RequestMapping("/hello")
    public String getTest(){
      return  helloService.getHelloContent();
    }
}
