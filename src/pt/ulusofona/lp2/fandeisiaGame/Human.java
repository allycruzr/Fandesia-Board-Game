package pt.ulusofona.lp2.fandeisiaGame;

public class Human extends Creature {
    public Human (int id, int x, int y, int teamId, int cost, String orientation){
        super(id, x, y, teamId, cost, orientation);
        image = "human.png";
        typeName = "Humano";
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
