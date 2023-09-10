package hng.project.HNG.services;

import hng.project.HNG.data.models.Slack;
import org.springframework.stereotype.Service;

import static hng.project.HNG.mapper.Mapper.map;

@Service
public class HngServices {
    public Slack getJson(String slackName, String track){
        return map(slackName, track);
    }
}
