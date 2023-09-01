package kr.springboot.springstudy.patterns.proxy;

import java.util.HashMap;

public interface ThirdPartyYouTubeLibrary {

    HashMap<String, Video> popularVideos();

    Video getVideo(String videoId);

}
