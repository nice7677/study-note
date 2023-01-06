package kr.springboot.pattern.bridge;

public class AdvancedRemote extends BasicRemote {

    private int beforeMuteVolume = 0;

    public AdvancedRemote(Device device) {
        super(device);
    }

    public void mute() {

        beforeMuteVolume = device.getVolume();
        System.out.println("Remote: mute");
        device.setVolume(0);

    }

    public void noneMute() {

        device.setVolume(beforeMuteVolume);
        System.out.println("Remote: none mute");

    }


}
