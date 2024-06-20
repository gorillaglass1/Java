package chap_07.Camera;

public class FactoryCam extends Camera{
    public FactoryCam() {
        this.name = "공장 카메라";
    }

    public void detectFire() {
        System.out.println("화재를 감지합니다.");
    }
}
