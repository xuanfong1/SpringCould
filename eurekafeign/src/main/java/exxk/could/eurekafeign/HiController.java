package exxk.could.eurekafeign;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HiController {
    @Autowired
    FeignSchedualService feignSchedualService;

    @RequestMapping(value = "/sayhi",method = RequestMethod.GET)
    public String sayHi(@RequestParam String name){
        return feignSchedualService.sayHiFromEurekaClient(name);
    }
}