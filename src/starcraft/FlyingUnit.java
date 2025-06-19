package starcraft;

public abstract class FlyingUnit extends Unit {
    @Override
    public void move(int x, int y) {
        System.out.println("공중으로 이동한다.");
        super.move(x, y);
    }
}
