package chap_09;

import java.util.Collections;
import java.util.LinkedList;

public class _05_LInkedList {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();


        list.add("유재석");
        list.add("조세호");
        list.add("김종국");
        list.add("박명수");
        list.add("강호동");

        System.out.println(list.get(0));
        System.out.println(list.get(1));
        System.out.println(list.get(2));
        System.out.println(list.getFirst());
        System.out.println(list.getLast());

        System.out.println("-------------------");

        list.addFirst("서장훈");
        for (String s : list) {
            System.out.println(s);
        }

        System.out.println("-------------------");

        list.addLast("김희철");
        for (String s : list) {
            System.out.println(s);
        }

        System.out.println("-------------------");

        System.out.println("학생 추가 전 : " + list.get(1));
        list.add(1, "김영철");
        System.out.println("학생 추가 후 : " + list.get(1));
        System.out.println("학생 추가 후 : " + list.get(2));

        System.out.println("남은 학생 수 (제외 전) : " + list.size());
        list.remove(list.size() - 1);
        System.out.println("남은 학생 수 (제외 후) : " + list.size());

        System.out.println("-------------------");

        for (String s : list) {
            System.out.println(s);
        }

        System.out.println("남은 학생 수 (전학 전) : " + list.size());
        list.removeFirst();
        list.removeLast();
        System.out.println("남은 학생 수 (전학 후) : " + list.size());

        for (String s : list) {
            System.out.println(s);
        }

        System.out.println("-------------------");

        list.set(0, "이수근");
        System.out.println(list.get(0));

        System.out.println("-------------------");

        System.out.println(list.indexOf("김종국"));
        System.out.println((list.contains("김종국")) ? "수강 신청 성공" : "수강 신청 실패");

        System.out.println("-------------------");

        list.clear();
        if (list.isEmpty()) {
            System.out.println("학생 수 : " + list.size());
            System.out.println("리스트가 비었습니다.");
        }


        list.add("유재석");
        list.add("조세호");
        list.add("김종국");
        list.add("박명수");
        list.add("강호동");

        System.out.println("-------------------");

        Collections.sort(list);
        for (String s : list) {
            System.out.println(s);
        }
    }
}