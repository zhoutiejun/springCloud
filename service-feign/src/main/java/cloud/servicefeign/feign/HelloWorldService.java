package cloud.servicefeign.feign;

import cloud.servicefeign.HelloWorldServiceFailure;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @Author ：zhouxiwang
 * @Description:
 * @Date: 12:54 2019/4/1
 * @Modified by:
 */

@FeignClient(value = "CONFIG-CLIENT" , fallback = HelloWorldServiceFailure.class)
public interface HelloWorldService {
    @RequestMapping(value = "/",method = RequestMethod.GET)
    String home();
}
