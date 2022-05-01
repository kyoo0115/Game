public class Knight extends Novice implements Skill {

    public Knight(String name, int strength, int dexterity, int intelligence) {
        super(name, strength, dexterity, intelligence);
    }

    @Override
    public void attack() {
        System.err.println("강력한 배쉬 공격");
    }

    @Override
    public void skill() {
        System.err.println("쇼크 스턴");
    }
}
