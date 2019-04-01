package cloud.servicefeign;

import cloud.servicefeign.feign.HelloWorldService;
import org.springframework.stereotype.Service;

/**
 * @Author ：zhouxiwang
 * @Description:
 * @Date: 13:23 2019/4/1
 * @Modified by:
 */
@Service
public class HelloWorldServiceFailure implements HelloWorldService {
    @Override
    public String home() {
        return "hello world service is not available !";
    }
}
