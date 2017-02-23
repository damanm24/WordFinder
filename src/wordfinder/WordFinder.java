/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wordfinder;

import java.util.Random;

/**
 *
 * @author Daman
 */
public class WordFinder {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        char[][] matrix = new char[10][10];
        Random rand = new Random();
        //Creates the matrix
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                int k = rand.nextInt(26);
                k = k + 97;
                char c = (char) k;
                matrix[i][j] = c;
            }
        }
        //Prints out the matrix
        for (int i = 0; i < matrix.length; i++) {
            System.out.println();
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(" " + matrix[i][j]);
            }
        }
        System.out.println("");
    }

    public static void moveSE(char[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                int currentX = j + 1;
                int currentY = i + 1;
                String word = Character.toString(matrix[i][j]);
                while (currentX < 10 && currentY < 10) {
                    word = word + matrix[currentX][currentY];
                    currentX += 1;
                    currentY += 1;
                }
                System.out.println(word);
            }
        }
    }

    public static void moveNW(char[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                int currentX = j;
                int currentY = i;
                String word = Character.toString(matrix[i][j]);
                while ((currentX < 10 && currentY < 10) && (currentX > 0 && currentY > 0)) {
                    currentX -= 1;
                    currentY -= 1;
                    word = word + matrix[currentY][currentX];
                }
                System.out.println(word);
            }
        }
    }

    public static void moveNE(char[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                int currentX = j;
                int currentY = i;
                String word = Character.toString(matrix[i][j]);
                while ((currentX <= 9 && currentX >= 0) && (currentY <= 9 && currentY >= 0)) {
                    currentX += 1;
                    currentY -= 1;
                    if ((currentX <= 9 && currentX >= 0) && (currentY <= 9 && currentY >= 0)) {
                        word = word + matrix[currentY][currentX];
                    }
                }
                System.out.println(word);
            }
        }
    }

    public static void moveSW(char[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                int currentX = j;
                int currentY = i;
                String word = Character.toString(matrix[i][j]);
                while ((currentX <= 9 && currentX >= 0) && (currentY <= 9 && currentY >= 0)) {
                    currentX -= 1;
                    currentY += 1;
                    if ((currentX <= 9 && currentX >= 0) && (currentY <= 9 && currentY >= 0)) {
                        word = word + matrix[currentY][currentX];
                    }
                }
                System.out.println(word);
            }
        }
    }

    public static void moveS(char[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                int currentX = j;
                int currentY = i;
                String word = Character.toString(matrix[i][j]);
                while ((currentX <= 9 && currentX >= 0) && (currentY <= 9 && currentY >= 0)) {
                    currentY += 1;
                    if ((currentX <= 9 && currentX >= 0) && (currentY <= 9 && currentY >= 0)) {
                        word = word + matrix[currentY][currentX];
                    }
                }
                System.out.println(word);
            }
        }
    }

    public static void moveN(char[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                int currentX = j;
                int currentY = i;
                String word = Character.toString(matrix[i][j]);
                while ((currentX <= 9 && currentX >= 0) && (currentY <= 9 && currentY >= 0)) {
                    currentY -= 1;
                    if ((currentX <= 9 && currentX >= 0) && (currentY <= 9 && currentY >= 0)) {
                        word = word + matrix[currentY][currentX];
                    }
                }
                System.out.println(word);
            }
        }
    }

    public static void moveW(char[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                int currentX = j;
                int currentY = i;
                String word = Character.toString(matrix[i][j]);
                while ((currentX <= 9 && currentX >= 0) && (currentY <= 9 && currentY >= 0)) {
                    currentX -= 1;
                    if ((currentX <= 9 && currentX >= 0) && (currentY <= 9 && currentY >= 0)) {
                        word = word + matrix[currentY][currentX];
                    }
                }
                System.out.println(word);
            }
        }
    }

    public static void moveE(char[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                int currentX = j;
                int currentY = i;
                String word = Character.toString(matrix[i][j]);
                while ((currentX <= 9 && currentX >= 0) && (currentY <= 9 && currentY >= 0)) {
                    currentX += 1;
                    if ((currentX <= 9 && currentX >= 0) && (currentY <= 9 && currentY >= 0)) {
                        word = word + matrix[currentY][currentX];
                    }
                }
                System.out.println(word);
            }
        }
    }
}
