package pl.lawsome.workshopspring.controller;

import org.json.JSONObject;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestRestController
{
    @RequestMapping("/getString")
    public String getString()
    {
        return JSONObject.quote("{\"hi\":\"Hello World\"}");
    }
}