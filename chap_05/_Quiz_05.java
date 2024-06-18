package chap_05;

public class _Quiz_05 {
    public static void main(String[] args) {
        int count = 10;
        int[] size = new int[count];
        int measure = 250;
        int index;
        boolean[] store = new boolean[count];

        for (int i = 0; i < size.length; i++) {
            index = (measure / 5) % 50;
            size[index] = measure;
            measure += 5;
        }

        measure = 250;
        for (int i = 0; i < size.length; i++) {
            index = (measure / 5) % 50;
            store[index] = true;
            if (index == 5)
                store[index] = false;
            measure += 5;
        }

        measure = 250;
        for (int i = 0; i < size.length; i++) {
            index = (measure / 5) % 50;
            System.out.println("사이즈 " + size[index] + ( (store[index]) ? " (재고 있음)" : " (재고 없음)"));
            measure += 5;
        }

        measure = 250;
        for (int i = 0; i < size.length; i++) {
            index = (measure / 5) % 50;
            if (!store[index])
                System.out.println(size[index] + " 사이즈는 다음에 찾아주십시오.");
            measure += 5;
        }
    }
}
