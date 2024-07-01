package chap_11;

public class _01_TryCatch {
    public static void main(String[] args) {
        try {
            //에러 => 컴파일 에러, 런타임 에러(예외)
           // System.out.println(3 / 0);
//            int[] arr = new int[3];
//            arr[5] = 100;
            Object obj = "test";
            System.out.println((int)obj);
        } catch (Exception e) {
            System.out.println("이런 문제가 발생했어요 => " + e.getMessage());
            e.printStackTrace();
        }

        System.out.println("프로그램 정상 종료");
    }
}
