package chap_07;

public class _Quiz_07 {
    public static void main(String[] args) {
        HamBurger[] hamBurgers = new HamBurger[3];
        hamBurgers[0] = new HamBurger();
        hamBurgers[1] = new CheeseHamBurger();
        hamBurgers[2] = new ShrimpHamBurger();

        System.out.println("주문하신 메뉴를 만듭니다.");
        System.out.println("-------------");
        for (HamBurger hamBurger : hamBurgers) {
            hamBurger.cook();
            System.out.println("-------------");
        }
        System.out.println("메뉴 준비가 완료되었습니다.");
    }
}

class HamBurger {
    String name;
    String[] ingredient = new String[] {
      "양상추", "패티", "피클"
    };

    public HamBurger() {
        this.name = "햄버거";
        //this("햄버거");
    }

    public HamBurger(String name) {
        this.name = name;
    }

    public void cook() {
        System.out.println(this.name + "를 만듭니다.");
        System.out.println("빵 사이에 들어가는 재료는?");
        for (int i = 0; i < ingredient.length; i++) {
            if (i == 0)
                System.out.println("> " + ingredient[0]);
            else
                System.out.println("+ " + ingredient[i]);
        }
    }
}

class CheeseHamBurger extends HamBurger {
    String added = "치즈";

    public CheeseHamBurger() {
        super("치즈버거");
    }

    public void cook() {
        super.cook();
        System.out.println("+ " + added);
    }


}

class ShrimpHamBurger extends HamBurger{
    String added = "새우";

    public ShrimpHamBurger() {
        super("새우버거");
    }

    public void cook() {
        super.cook();
        System.out.println("+ " + added);
    }
}