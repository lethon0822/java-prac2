package starcraft;

import java.util.ArrayList;
import java.util.List;

public class DropShip extends FlyingUnit{
    // 수송기
    // 8개의 지상유닛을 태울 수 있음
    protected GroundUnit[] units = new GroundUnit[8];
    protected int loadedIndex = 0;

    // 유닛 하나를 태우는 load 메소드
    // 태웠으면 true, 아니면 false
    public boolean load (GroundUnit unit) {
        if (units.length  == loadedIndex) {
            return false;
        } else {
            units[++loadedIndex] = unit;
            return true;
        }
    }

    public GroundUnit unload (){
        if (loadedIndex == 0){
            return null;
        }else {
            GroundUnit unit = (GroundUnit) units[--loadedIndex];
            units[loadedIndex] = null;
            return unit;
        }
    }
}
