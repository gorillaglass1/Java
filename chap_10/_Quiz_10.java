package chap_10;

import java.util.ArrayList;

public class _Quiz_10 {
    public static void main(String[] args) {
        int charge = 5000;
        ArrayList<Customer> customers = new ArrayList<>();
//        customers = (ArrayList<Customer>) Arrays.asList(
//                new Customer("챈들러", 50),
//                new Customer("레이첼", 42),
//                new Customer("모니카", 21),
//                new Customer("벤자민", 18),
//                new Customer("제임스", 5)
//        );

        customers.add(new Customer("챈들러", 50));
        customers.add(new Customer("레이첼", 42));
        customers.add(new Customer("모니카", 21));
        customers.add(new Customer("벤자민", 18));
        customers.add(new Customer("제임스", 5));

        System.out.println("미술관 입장료");
        System.out.println("---------------");
        customers.stream().map(x -> (x.age >= 20) ? x.name.concat(" " + charge + "원") : x.name.concat(" 무료")).forEach(System.out::println);
    }


}

class Customer {
    public String name;
    public int age;

    Customer(String name, int age) {
        this.name = name;
        this.age = age;
    }
}