/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ox_gui;

import java.io.Serializable;

/**
 *
 * @author teeraphat
 */
public class Player implements Serializable{

    private char symbol;
    private int winCount;
    private int drawCount;
    private int loseCount;

    public Player(char symbol) {
        this.symbol = symbol;
        this.winCount = 0;
        this.drawCount = 0;
        this.loseCount = 0;

    }

    public char getSymbol() {
        return symbol;
    }

    public void setSymbol(char symbol) {
        this.symbol = symbol;
    }

    @Override
    public String toString() {
        return "Player{" + "symbol=" + symbol + ", winCount=" + winCount + ", drawCount=" + drawCount + ", loseCount=" + loseCount + '}';
    }

    public int getWinCount() {
        return winCount;
    }

    public void incWinCount() {
        this.winCount++;
    }

    public int getDrawCount() {
        return drawCount;
    }

    public void incDrawCount() {
        this.drawCount++;
    }

    public int getLoseCount() {
        return loseCount;
    }

    public void incLoseCount() {
        this.loseCount++;
    }

}
