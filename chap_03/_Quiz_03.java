package chap_03;

public class _Quiz_03 {
    public static void main(String[] args) {
        String idNumber = null;
        idNumber = "030708-4567890";
        idNumber = idNumber.trim();

//        System.out.println("주민번호(앞 7자리) : " + idNumber.substring(0, 8));
        System.out.println("주민번호(앞 7자리) : " + idNumber.substring(0, (idNumber.indexOf("-") + 2)));
    }
}