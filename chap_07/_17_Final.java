package chap_07;

import chap_07.Camera.ActionCam;
import chap_07.Camera.SlowActionCam;

public class _17_Final {
    public static void main(String[] args) {
        ActionCam actionCam = new ActionCam();
        //actionCam.lens = "표준 렌즈";
        actionCam.recordVideo();
        actionCam.makeVideo();

        System.out.println();

        SlowActionCam slowActionCam = new SlowActionCam();
        slowActionCam.makeVideo();
    }
}
