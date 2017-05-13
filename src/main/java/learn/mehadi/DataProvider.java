package learn.mehadi;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Mehadi Hossain on 5/13/2017.
 */
@RestController
public class DataProvider {
    @RequestMapping("/")
    public String hello(){
        return "Hello";
    }
}
