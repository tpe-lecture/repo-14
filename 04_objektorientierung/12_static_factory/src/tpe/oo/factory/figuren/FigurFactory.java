package tpe.oo.factory.figuren;

import java.util.Random;

import de.smits_net.games.framework.board.Board;

public class FigurFactory {
    private static Random rnd = new Random();

    public static Figur createFigur(Board board) {
        int n = rnd.nextInt(3);// 0-3

        switch (n) {
        case 0:
            return new Lady(board);
        case 1:
            return new Ninja(board);
        case 2:
            return new Wizard(board);
        default:
            return null;
        }
    }
}
