package com.example.blankspringtemplate.Controller;

import com.example.blankspringtemplate.Entities.Entity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

@Controller
public class Responses {

    @GetMapping("/submitt")
    @ResponseBody
    public String getInfo(@RequestParam("user") List<String> info, @RequestParam("tel") String tel, @RequestParam("psw") String psw) {
        Entity e = new Entity(tel, psw, info);
        System.out.println(e);
        return e.toString();
    }

    @GetMapping("/submit")
    @ResponseBody
    @CrossOrigin(origins = "http://localhost:8802")
    public String getInfo(@RequestParam("name") String name) {
        Entity e = new Entity("参数一", "参数二",new ArrayList<>());
        return e+name;
    }

    @GetMapping("/getSth")
    public String getSth() {
        List<String> c = new ArrayList<>() {{
            add("h");
            add("c");
            add("y");
            add("n");
            add("b");
        }};
        return String.valueOf(new Entity("参数X", "参数XX", c));
    }
}
