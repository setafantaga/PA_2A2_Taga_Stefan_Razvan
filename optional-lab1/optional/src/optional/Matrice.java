package optional;

import java.util.*;
	public class Matrice{
		static Random rand = new Random();
		double[][] mat;

	public void initializare(int n, int m){
		double[][] mat = new double[n][m];
		for(int i=0;i<=n;i++) {
			for(int j=0;j<=m;j++)
				mat[i][j] = rand.nextInt(100);
		}
	}

	public void afisare(){
		for(int i=0;i<mat.length;i++) {
			for(int j=0;j<mat.length;j++)
				System.out.println("mat["+i+"]["+j+"]"+" = " + mat[i][j]);
			}
	}
		

	public static void main(String[] args){
		Matrice mat = new Matrice();
		mat.initializare(10,10);
		mat.afisare();
	}
}
