public class Novice{

    //멤버 변수
    private String name;		//캐릭터 이름
    private int strength;		//힘 스탯
    private int dexterity;		//민첩 스탯
    private int intelligence;	//지능 스탯

    //기본생성자
    public Novice() {}

    //명시적 생성자
    public Novice(String name, int strength, int dexterity, int intelligence) {
        this.name = name;
        this.strength = strength;
        this.dexterity = dexterity;
        this.intelligence = intelligence;
    }

    //멤버 메서드
    public void attack() {
        System.err.println("기본 공격");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public int getDexterity() {
        return dexterity;
    }

    public void setDexterity(int dexterity) {
        this.dexterity = dexterity;
    }

    public int getIntelligence() {
        return intelligence;
    }

    public void setIntelligence(int intelligence) {
        this.intelligence = intelligence;
    }
}
