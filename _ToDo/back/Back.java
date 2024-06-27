package _ToDo.back;

import java.util.LinkedHashMap;
import java.util.Scanner;

public class Back<T>{
    public LinkedHashMap<Integer, T> userList = new LinkedHashMap<>();
    public LinkedHashMap<Integer, T> completedList = new LinkedHashMap<>();

    public Back() {
    }

    public void setTodoList(T list) {
        userList.put(userList.size() + 1, list);
    }

    public void getTodoList() {
        if (!userList.isEmpty()) {
            System.out.println("할 일 목록");
            for (int key : userList.keySet()) {
                System.out.println(userList.keySet() + "\t" + userList.values().toString());
            }
        }
        if (!completedList.isEmpty()) {
            System.out.println("완료한 목록");
            for (int key : completedList.keySet()) {
                System.out.println(completedList.keySet() + "\t" + completedList.values().toString());
            }
        }
    }

    public void getToDoDetail(int listNumber) {
        if (userList.containsKey(1)){
            Scanner sc = new Scanner(System.in);
            System.out.println(userList.get(listNumber).toString());
            System.out.println("1. 완료\t2. 삭제\t3.취소");
            System.out.println(userList.get(listNumber).toString());
            int temp = sc.nextInt();
            temp = controlToDoDetail(listNumber, temp);
        } else {
            System.out.println("List 번호를 다시 입력하세요");
        }
    }

    public int controlToDoDetail(int number, int control) {
        if (control == 1) {
            completedList.put(completedList.size() + 1, userList.get(number));
            userList.remove(number);
            return 0;
        }
        if (control == 2) {
            userList.remove(number);
            return 0;
        }
        else
            return -1;
    }
}