/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ox__gui;

/**
 *
 * @author teeraphat
 */
public class Board {

    private char[][] table = {{'-', '-', '-'}, {'-', '-', '-'}, {'-', '-', '-'}};
    private Player p1;
    private Player p2;
    private Player currentPlayer;
    private int count = 0;
    private int row;
    private int col;

    public Board(Player p1, Player p2) {
        this.p1 = p1;
        this.p2 = p2;
        if (Math.random() < 0.5) {
            currentPlayer = p1;
        } else {
            currentPlayer = p2;
        }

    }

    public char[][] getTable() {
        return table;
    }

    public void setTable(char[][] table) {
        this.table = table;
    }

    public Player getP1() {
        return p1;
    }

    public void setP1(Player p1) {
        this.p1 = p1;
    }

    public Player getP2() {
        return p2;
    }

    public void setP2(Player p2) {
        this.p2 = p2;
    }

    public int setRowCol(int row, int col) {
        if (row > 2 || row < 0 || col > 2 || col < 0) {
            return -2;
        }
        if (table[row][col] != '-') {
            return -1;
        }
        table[row][col] = currentPlayer.getSymbol();
        count++;
        this.row = row;
        this.col = col;
        return 0;
    }

    public void switchTurn() {
        if (currentPlayer == p1) {
            currentPlayer = p2;
        } else {
            currentPlayer = p1;
        }
    }

    @Override
    public String toString() {
        return "Board{" + "table=" + table + ", p1=" + p1 + ", p2=" + p2 + '}';
    }

    public void updateStat() {
        if (checkWin()) {
            if (currentPlayer == p1) {
                p1.incWinCount();
                p2.incLoseCount();
            } else {
                p1.incLoseCount();
                p2.incWinCount();
            }
        }
        if (checkDraw()) {
            p1.incDrawCount();
            p2.incDrawCount();
        }
    }

    public boolean isFinish() {
        if (checkWin()) {
            return true;
        }
        if (checkDraw()) {
            return true;
        }
        return false;
    }

    public boolean checkWin() {
        if (checkRow()) {
            return true;
        }
        if (checkCol()) {
            return true;
        }
        if (checkX()) {
            return true;
        }
        return false;
    }

    public boolean checkDraw() {
        if (count == 9) {
            return true;
        }
        return false;
    }

    public boolean checkRow() {
        if (table[row][0] == currentPlayer.getSymbol() && table[row][1] == currentPlayer.getSymbol() && table[row][2] == currentPlayer.getSymbol()) {
            return true;
        }
        return false;
    }

    public boolean checkCol() {
        if (table[0][col] == currentPlayer.getSymbol() && table[1][col] == currentPlayer.getSymbol() && table[2][col] == currentPlayer.getSymbol()) {
            return true;
        }
        return false;
    }

    public boolean checkX() {
        if (checkX1()) {
            return true;
        }
        if (checkX2()) {
            return true;
        }
        return false;
    }

    public void showResult() {
        if (checkWin()) {
            System.out.println(currentPlayer.getSymbol() + " Win !!!");
        } else if (checkDraw()) {
            System.out.println("Draw !!!");
        }
    }

    public boolean checkX1() {
        if (table[0][0] == currentPlayer.getSymbol() && table[1][1] == currentPlayer.getSymbol() && table[2][2] == currentPlayer.getSymbol()) {
            return true;
        }
        return false;
    }

    public boolean checkX2() {
        if (table[0][2] == currentPlayer.getSymbol() && table[1][1] == currentPlayer.getSymbol() && table[2][0] == currentPlayer.getSymbol()) {
            return true;
        }
        return false;
    }

    public Player getCurrentPlayer() {
        return currentPlayer;
    }

}
