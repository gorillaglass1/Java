package chap_11;

import java.util.HashMap;

public class _Quiz_11 {
    public static void main(String[] args) {
        int errorCode = 0;
        int now = 21;
        HashMap<String, Integer> time = new HashMap<>();
        HashMap<String, Integer> item = new HashMap<>();
        time.put("open", 20);
        time.put("close", 22);
        item.put("item", 5);

        try {
            if (time.get("open") < now && now < time.get("close") && item.get("item") != 0) {
                errorCode = 0;
                System.out.println("상품 구매를 완료하였습니다.");
            } else if (time.get("open") >= now || now >= time.get("close")) {
                errorCode = 1;
                throw new OverOpening("상품 구매 가능 시간이 아닙니다.");
            } else {
                errorCode = 2;
                throw new SoldOutItem("해당 상품은 매진되었습니다.");
            }
        } catch (OverOpening e) {
            System.out.println(e.getMessage());
            System.out.println("상품 구매는 20시 부터 가능합니다.");
        } catch (SoldOutItem e) {
            System.out.println(e.getMessage());
            System.out.println("다음 기회에 이용해주세요.");
        }
    }
}

class OverOpening extends Exception{
    public OverOpening(String message) {
        super(message);
    }
}

class SoldOutItem extends Exception{
    public SoldOutItem(String message) {
        super(message);
    }
}
