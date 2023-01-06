package kr.springboot.pattern.facade;

public class VideoFile {

    private String name;
    private String codecType;

    public VideoFile(String name) {
        this.name = name;
        this.codecType = name.substring(name.indexOf("."));
    }

    public String getName() {
        return name;
    }

    public String getCodecType() {
        return codecType;
    }

}
