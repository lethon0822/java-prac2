package starcraft;

public abstract class Unit {
    // 현재 위치를 알 수 있는 좌표값
    // protected : 상속 관계라면 접근 가능
    protected int x;  // 좌표 x
    protected int y;  // 좌표 y

    // 이동
    public void move(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void stop (){
        System.out.println("현재 위치에 정지한다.");
    }
}
