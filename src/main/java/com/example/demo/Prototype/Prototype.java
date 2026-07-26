package com.example.demo.Prototype;

public class Prototype {
    public static void main(String[] args) throws CloneNotSupportedException {
        GameBot gameBot1 = new GameBot();
        gameBot1.setHealth(100);
        GameBot gameBot2 = gameBot1.clone();
        gameBot2.setHealth(500);
        System.out.println("gameBot1="+gameBot1);

        System.out.println("gameBot2="+gameBot2);
    }

}
class GameBot implements  Cloneable{
    private int health;
    @Override
    public GameBot clone() throws CloneNotSupportedException {
        System.out.println(toString());
        return (GameBot) super.clone();
    }

    @Override
    public String toString() {
        return "GameBot{" +
                "health=" + health +
                '}';
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }
}

