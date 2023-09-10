package hng.project.HNG.mapper;

import hng.project.HNG.data.models.Slack;

public class Mapper {
    public static Slack map(String slack_name, String track){
        Slack slack = new Slack();
        slack.setSlack_name(slack_name);
        slack.setTrack(track);
        slack.setStatus_code(200);
        slack.setGithub_file_url("");
        slack.setGithub_repo_url("https://github.com/whitewizardd/HNG_Project.git");
        slack.setCurrent_day(getDay());
        slack.setUtc_time(getUtcTime());
        return slack;
    }
    private static String getDay(){
        return null;
    }
    private static String getUtcTime(){
        return null;
    }
}
