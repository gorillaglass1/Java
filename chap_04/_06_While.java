package chap_04;

public class _06_While {
    public static void main(String[] args) {
    int distance = 25;
    int move = 0;

    while (move < distance) {
        System.out.println("발차기를 계속 합니다.");
        System.out.println("현재 이동 거리 : " + move);
        move += 3;
    }
        System.out.println("도착하였습니다.");

//    move = 0;  // 무한 루프
//    while (move < distance) {
//        System.out.println("발차기를 계속 합니다.");
//        System.out.println("현재 이동 거리 : " + move);
//    }
//        System.out.println("도착하였습니다.");


    }
}
