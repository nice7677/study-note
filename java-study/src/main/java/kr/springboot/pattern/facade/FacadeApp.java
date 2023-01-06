package kr.springboot.pattern.facade;

import java.io.File;

/**
 * 복잡한 내용을 숨김. 복기 필요
 */
public class FacadeApp {

    public static void main(String[] args) {

        VideoConversionFacade conversionFacade = new VideoConversionFacade();
        File mp4Video = conversionFacade.convertVideo("yotubevideo.ogg", "mp4");

    }

}
