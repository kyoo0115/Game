public class Thief extends Novice implements Skill{

    public Thief(String name, int strength, int dexterity, int intelligence) {
        super(name, strength, dexterity, intelligence);
    }

    @Override
    public void attack() {
        System.err.println("치명적인 공격");
    }

    @Override
    public void skill() {
        System.err.println("중독");
    }
}
