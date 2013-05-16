/* Both Player and Ghost inherit Mover.  Has generic functions relevant to both*/
class Mover {
    /* Framecount is used to count animation frames*/
    int frameCount = 0;

    /* gridSize is the size of one square in the game.
max is the height/width of the game.
increment is the speed at which the object moves,
1 increment per move() call */
    int gridSize;
    int max;
    int increment;
    private final GameMap map;

    /* Generic constructor */
    public Mover(GameMap map) {
        this.map = map;
        gridSize = 20;
        increment = 4;
        max = 400;
    }

    /* Determines if a set of coordinates is a valid destination.*/
    public boolean isValidDest(int x, int y) {
        /* The first statements check that the x and y are inbounds.  The last statement checks the map to
  see if it's a valid location */
        if ((((x) % 20 == 0) || ((y) % 20) == 0) && 20 <= x && x < 400 && 20 <= y && y < 400 && map.getState(x / 20 - 1, y / 20 - 1)) {
            return true;
        }
        return false;
    }
}
