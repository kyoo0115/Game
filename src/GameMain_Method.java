
import java.util.Objects;
import java.util.Random;
import java.util.Scanner;

public class GameMain_Method {

    //메인 메뉴를 출력해주는 메서드
    public void printMenu() {
        System.out.println();
        System.out.println("=== ABCDE_rpg ===");
        System.out.println("1. 캐릭터 생성");
        System.out.println("2. 캐릭터 정보");
        System.out.println("3. 전직하기");
        System.out.println("4. 기본 공격");
        System.out.println("5. 스킬 사용");
        System.out.println("0. 종료");
        System.out.println("=================");
        System.out.print("번호를 선택하세요 : ");
    }

    //출력 문구만 모아 놓은 메서드
    public void printText(int num) {
        switch (num) {
            case 1:
                System.out.println("게임을 종료합니다.");
                break;
            case 2:
                System.out.println("번호를 잘못 입력하셨습니다.");
                break;
            case 3:
                System.out.println("캐릭터를 생성하세요.");
                break;
            case 4:
                System.out.println("스킬을 배우지 않았습니다.");
                break;

            default:

                break;
        }
    }

    public Novice createCharacter() {
        Scanner scan = new Scanner(System.in);
        Random ran = new Random();
        Novice novice = null;
        String id;
        int str = 0, dex = 0, intel = 0, sum = 0;
        System.out.println("캐릭터를 생성합니다.");

        System.out.print("사용하실 아이디를 입력해 주세요 : ");
        id = scan.nextLine();

        while(true){

            str = ran.nextInt(10);
            dex = ran.nextInt(10);
            intel = ran.nextInt(10);
            sum = str + dex + intel;

            if(sum > 15){

                System.out.println("스탯을 부여합니다.");
                System.out.println("부여된 스탯정보: 힘[" + str + "], 민첩[" + dex + "], 지능[" + intel + "]");
                System.out.print("스탯을 다시 받으시겠습니까? (y/n) : ");
                String answer = scan.next();

                if(Objects.equals(answer, "n")){
                    System.out.println("현재 정보로 저장합니다");
                    System.out.print("[ID: " + id + "," + " stat: " + "힘(" + str + "), 민첩(" + dex + "), 지능(" + intel + ")] ");
                    break;
                }
            }
        }
        novice = new Novice(id, str, dex, intel);

        return novice;
    }

    public Novice jobSelect(int num, Novice novice) {
        Novice character = null;

        num = numberInput();

        switch(num){

            case 1:
                novice = new Knight(novice.getName(), novice.getStrength(), novice.getDexterity(), novice.getIntelligence());
                System.out.println("기사로 전직합니다");
                break;
            case 2:
                novice = new Thief(novice.getName(), novice.getStrength(), novice.getDexterity(), novice.getIntelligence());
                System.out.println("도적으로 전직합니다");
                break;
            case 3:
                novice = new Magician(novice.getName(), novice.getStrength(), novice.getDexterity(), novice.getIntelligence());
                System.out.println("마법사로 전직합니다");
                break;
        }

        character = novice;

        return character;
    }

    public int numberInput() {
        Scanner scan = new Scanner(System.in);
        int num = 0;
        while(num > 3 || num < 1) {
            System.out.println("=== 직업 종류 ===");
            System.out.println("1. 기사");
            System.out.println("2. 도적");
            System.out.println("3. 마법사");
            System.out.print("전직할 직업의 번호를 선택하세요 : ");
            num = scan.nextInt();
        }
        return num;
    }

    public void characterInfo(Novice novice) {

        if(novice instanceof Knight){
            System.out.print("[ID: " + novice.getName() + "(전사), stat: " + "힘(" + novice.getStrength() + "), 민첩(" + novice.getDexterity() + "), 지능"
                    + novice.getIntelligence() + ")]");
        }
        else if(novice instanceof Magician){
            System.out.print("[ID: " + novice.getName() + "(마법사), stat: " + "힘(" + novice.getStrength() + "), 민첩(" + novice.getDexterity() + "), 지능"
                    + novice.getIntelligence() + ")]");
        }
        else if(novice instanceof Thief){
            System.out.print("[ID: " + novice.getName() + "(도적), stat: " + "힘(" + novice.getStrength() + "), 민첩(" + novice.getDexterity() + "), 지능"
                    + novice.getIntelligence() + ")]");
        }
        else{
            System.out.print("[ID: " + novice.getName() + "(평민), stat: " + "힘(" + novice.getStrength() + "), 민첩(" + novice.getDexterity() + "), 지능"
                    + novice.getIntelligence() + ")]");
        }
    }

    public Skill skill(Novice novice) {
        Skill skill = null;

        if(novice instanceof Knight){
            ((Knight) novice).skill();
        }
        else if(novice instanceof Magician){
            ((Magician) novice).skill();
        }
        else if(novice instanceof Thief){
            ((Thief) novice).skill();
        }
        else{
            System.err.println("스킬을 배우지 않았습니다.");
        }

        return skill;
    }
}
