package starcraft;

public class SiegeTank extends GroundUnit{
    private boolean siegeMode;

    public void toggleSiegeMode() {
        siegeMode = !siegeMode;
    }
}
