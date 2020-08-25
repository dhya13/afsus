package dhya.faza.afsus.controller;

import dhya.faza.afsus.configuration.GlobalProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IndexController {
    @Autowired
    private GlobalProperties globalProperties;
    //@CrossOrigin
    @GetMapping("/")
    String index() {
        GlobalProperties a = this.globalProperties;
        return "Test is OK by Dhya";
    }

}
