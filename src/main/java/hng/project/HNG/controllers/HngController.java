package hng.project.HNG.controllers;

import hng.project.HNG.data.models.Slack;
import hng.project.HNG.services.HngServices;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HngController {
    private HngServices hngServices;
    public HngController(HngServices hngServices){
        this.hngServices = hngServices;
    }
    @RequestMapping(value = "/api/v1", method = RequestMethod.GET)
    public ResponseEntity<Slack> endPoint(@RequestParam String slack_name, @RequestParam String track){
        Slack slack = hngServices.getJson(slack_name, track);
        return new ResponseEntity<>(slack, HttpStatus.OK);
    }
}
