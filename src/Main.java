import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("[안내]TRPG 스타크래프트 시작합니다.");
        System.out.println("[안내]자신의 유닛 정보를 입력해주세요");
        Unit myUnit = new Unit();
        myUnit.init();
        myUnit.info();
    }
}

class Unit {
    String name;
    int atk;
    int def;
    int hp;

    void init() {
        Scanner input = new Scanner(System.in);
        System.out.print("[시스템] 유닛 [이름] 을 입력해 주세요 : ");
        this.name = input.nextLine();
        System.out.print("[시스템] 유닛 [공격력] 을 입력해 주세요 : ");
        this.atk = input.nextInt();
        System.out.print("[시스템] 유닛 [방어력] 을 입력해 주세요 : ");
        this.def = input.nextInt();
        System.out.print("[시스템] 유닛 [체력] 을 입력해 주세요 : ");
        this.hp = input.nextInt();
    }

    void info() {
        System.out.println("[안내] 생성된 유닛 정보는 다음과 같습니다.");
        System.out.printf("[안내] %s 유닛이 게임에 참여하였습니다.", name);
        System.out.printf("[공격력] %s 유닛이 게임에 참여하였습니다.", name);
    }

}
