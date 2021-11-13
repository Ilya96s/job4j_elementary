package ru.job4j.condition;

public class ChessBoard {
    public static int way(int x1, int y1, int x2, int y2) {
     int rsl = 0;
     if (isPositiveAndLessThan7(x1, y1, x2, y2) && isDiagonal(x1, y1, x2, y2)) {
      rsl = Math.abs(x2 - x1);
      }
      return rsl;
  }

    public static boolean isPositiveAndLessThan7(int num1, int num2, int num3, int num4) {
        return num1 >= 0 && num1 <= 7 && num2 >= 0 && num2 <= 7 && num3 >= 0 && num3 <= 7 && num4 >= 0 && num4 <= 7;
    }

    public static boolean isDiagonal(int x1, int y1, int x2, int y2) {
        int first = Math.abs(x2 - x1);
        int second = Math.abs(y2 - y1);
        return first == second;
    }

    public static void main(String[] args) {
        System.out.println("Координаты положительные и не больше 7: " + isPositiveAndLessThan7(1, 0, 3, 2));
        System.out.println("Фигура ходит по диагонали : " + isDiagonal(1, 0, 3, 2));
        System.out.println("Количество ходов: " + way(1, 0, 3, 2));
    }
}