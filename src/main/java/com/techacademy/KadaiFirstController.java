package com.techacademy;

import java.util.Calendar;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class KadaiFirstController {

    @GetMapping("/dayofweek/{val}")
    public String dispDayOfWeek(@PathVariable String val) {
        String yobi[] = {"Sunday","Monday","Tuesday","Wednesday","Thursday","Friday","Saturday"};

        int y = Integer.parseInt(val.substring(0,4));
        int m = Integer.parseInt(val.substring(4,6))-1;
        int d = Integer.parseInt(val.substring(6,8));

        Calendar cal = Calendar.getInstance();
        cal.set(y, m, d);

        return yobi[cal.get(Calendar.DAY_OF_WEEK)-1];
    }

    @GetMapping("/plus/{val1}/{val2}")
    public String calcPlus(@PathVariable int val1, @PathVariable int val2) {
        int res = 0;
        res = val1 + val2;
        return "計算結果：" + res;
    }

    @GetMapping("/minus/{val1}/{val2}")
    public String calcMinus(@PathVariable int val1, @PathVariable int val2) {
        int res = 0;
        res = val1 - val2;
        return "計算結果：" + res;
    }

    @GetMapping("/times/{val1}/{val2}")
    public String calcTimes(@PathVariable int val1, @PathVariable int val2) {
        int res = 0;
        res = val1 * val2;
        return "計算結果：" + res;
    }

    @GetMapping("/divide/{val1}/{val2}")
    public String calcDivide(@PathVariable int val1, @PathVariable int val2) {
        int res = 0;
        res = val1 / val2;
        return "計算結果：" + res;
    }
}
