package server.wekick.root;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import server.wekick.common.CommonResponse;

@RestController
public class RootApi {

    @GetMapping("/health")
    public String healthCheck(){
        return "I'm healthy!";
    }

    @GetMapping("/hello")
    public CommonResponse hello() {
        return CommonResponse.onSuccess("Hello, world!");
    }
}
