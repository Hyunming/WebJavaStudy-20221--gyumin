package j13_추상화.인터페이스;

public class RemoteControl {
    private PowerButton powerButton;
    private VolumeDownButton volumeDownButton;
    private VolumeUpButton volumeUpButton;

    public RemoteControl(PowerButton powerButton, VolumeDownButton volumeDownButton, VolumeUpButton volumeUpButton) {
        this.powerButton = powerButton;
        this.volumeDownButton = volumeDownButton;
        this.volumeUpButton = volumeUpButton;
    }
    public void onPressedPowerButton() {
        powerButton.onPressed();
    }
    public void onPressedVolumupButton() {
        volumeUpButton.onPressed();
    }
    public void onPressedVolumDownButton() {
        volumeDownButton.onPressed();
    }
    public void onDownVolumeUpButton() {
        volumeUpButton.onDown();
    }
    public void onDownVolumeDownButton() {
        volumeDownButton.onDown();
    }
}
