package server.wekick.root;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import server.wekick.common.CommonResponse;
import server.wekick.common.exception.GeneralException;
import server.wekick.common.exception.GlobalErrorCode;

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

    @GetMapping("/error")
    public CommonResponse error() {
        throw new GeneralException(GlobalErrorCode.SERVER_ERROR);
    }
}
