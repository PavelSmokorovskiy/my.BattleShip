package my.BattleShip;

class Cell {
    String cell;
    boolean used;
    boolean shooted;
    public Ship ship;

    Cell(){
        used = false;
        shooted = false;
        ship = null;
    }
}