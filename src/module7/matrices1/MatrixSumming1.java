package module7.matrices1;

import java.util.*;
import java.io.*;

public class MatrixSumming1 {

	public static int sum(int[][] m) {
		int sum = 0;
		for (int x = 0; x < m.length; x++) {
			for (int y = 0; y < m[x].length; y++) {
				sum += m[x][y];
			}
		}
		return sum;
	}

	public static void main(String[] args) {
		int[][] m = {{1, 2, 3, 4, 5}, {6, 7, 8, 9, 0}, {6, 7, 1, 2, 5}, {6, 7, 8, 9, 0}, {5, 4, 3, 2, 1}};
		for (int x = 0; x < m.length; x++) {
			for (int y = 0; y < m[x].length; y++) {
				System.out.print(m[x][y] + " ");
			}
			System.out.println();
		}
		System.out.println(sum(m));
	}
}
