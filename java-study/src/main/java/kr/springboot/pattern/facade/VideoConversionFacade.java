package kr.springboot.pattern.facade;

import java.io.File;

public class VideoConversionFacade {

    public File convertVideo(String filename, String format) {

        System.out.println("VideoConversionFacade: conversion started");
        VideoFile file = new VideoFile(filename);
        Codec sourceCodec = CodecFactory.extract(file);
        Codec destiantionCodec;
        if (format.equals("mp4")) {
            destiantionCodec = new MPEG4CompressionCodec();
        } else {
            destiantionCodec = new OggCompressionCodec();
        }
        VideoFile buffer = BitrateReader.read(file, sourceCodec);
        VideoFile intermediateResult = BitrateReader.convert(buffer, destiantionCodec);
        File result = (new AudioMixer()).fix(intermediateResult);
        System.out.println("VideoConversionFacade: conversion complated.");
        return result;

    }

}
