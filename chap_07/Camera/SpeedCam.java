package chap_07.Camera;

public class SpeedCam extends Camera{
    public SpeedCam() {
        this.name = "과속단속 카메라";
    }

    public void checkSpeed() {
        System.out.println("속도를 측정합니다.");
    }

    public void recognizeLicensePlate() {
        System.out.println("차량 번호를 인식합니다.");
    }

}
