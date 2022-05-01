public class Magician extends Novice implements Skill{

    public Magician(String name, int strength, int dexterity, int intelligence) {
        super(name, strength, dexterity, intelligence);
    }

    @Override
    public void attack() {
        System.err.println("매직 애로우 공격");;
    }

    @Override
    public void skill() {
        System.err.println("메테오");;
    }
}
