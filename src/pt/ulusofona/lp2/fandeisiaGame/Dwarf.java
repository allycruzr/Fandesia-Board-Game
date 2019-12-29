package pt.ulusofona.lp2.fandeisiaGame;

public class Dwarf extends Creature {

    public Dwarf (int id, int x, int y, int teamId, int cost, String orientation){
        super(id, x, y, teamId, cost, orientation);
        image = "dwarf.png";
        typeName = "Anao";
    }

    @Override
    public boolean move() {

        return false;
    }

    @Override
    public boolean spin() {
        return false;
    }
}



