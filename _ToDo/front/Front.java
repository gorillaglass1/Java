package _ToDo.front;

import _ToDo.back.Back;

import java.util.LinkedHashMap;
import java.util.Scanner;


public class Front{
    public static LinkedHashMap<String, Back> userlist = new LinkedHashMap();

    public static void main(String[] args) {
        System.out.println("환영합니다. 계정을 추가해주세요");
        Scanner sc = new Scanner(System.in);
        String tempUserName = sc.next();
        addUser(tempUserName);
    }

    public static void addUser(String name) {
        userlist.put(name, new Back());
    }
}
