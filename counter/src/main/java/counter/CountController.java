package counter;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Marlboro on 27.11.2016.
 */
@RestController
public class CountController {
    @RequestMapping(name = "count", method = RequestMethod.GET)
    public int getCount(){

        return Count.count;
    }
    @RequestMapping(name = "count", method = RequestMethod.POST)
    public int postCount(){
        return ++Count.count;
    }
    @RequestMapping(name = "count", method = RequestMethod.DELETE)
    public int delCount(){
        return --Count.count;
    }
}
