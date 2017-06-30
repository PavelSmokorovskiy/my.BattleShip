package my.BattleShip;

import java.util.Scanner;


public class ConsoleGameBattleship {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        Board.printBoard();
        new UserPlace();
        AIPlace.placeShips();
        new Game();

    }
}
