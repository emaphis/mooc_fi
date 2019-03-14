/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author emaphis
 */
public class Player {
    private String name;
    private int amountGoals;

    public Player(String name) {
        this.name = name;
    }

    public Player(String name, int amountGoals) {
        this.name = name;
        this.amountGoals = amountGoals;
    }

    public String getName() {
        return name;
    }

    public int goals() {
        return amountGoals;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name + ", goals " + amountGoals;
    }

}
