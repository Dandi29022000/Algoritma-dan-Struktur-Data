/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ProgramPacman;
import java.util.Scanner;
/** 
 * Nama     : Dandi Agung Setiawan
 * Kelas    : TI-1F
 * NIM      : 1941720009
 */
public class PacmanMain {
    static Scanner input = new Scanner(System.in);
	
	public static void setting(){
		System.out.println("Game PacMan : ");
		System.out.println("w = Bergerak Ke Atas");
		System.out.println("s = Bergerak Ke Bawah");
		System.out.println("a = Bergerak Ke Kiri");
		System.out.println("d = Bergerak Ke Kanan");
		
	}

	public static void warning(){
		System.out.println("\nMohon Masukkan Inputan Yang Tepat!!!\n");
		input();
	}

	public static void over(){
		System.out.println("\nKoordinat Tidak Boleh Kurang Dari 0!!!\n");
		input();
	}

	public static void input(){
		Pacman pc = new Pacman();
		pc.width = 5;
		pc.height = 5;

		setting();
		System.out.print("\nMasukkan Kontrol\t: ");
		pc.select = input.nextLine() .toLowerCase();

		switch (pc.select) {
			case "w": 
			if ((pc.y-1) < 0) {
			over();
        		}
                        
			break;
			case "s":
			if ((pc.y + 1) >= pc.width) {
        		over();
			}
                        
			break;
			case "a":	
			if ((pc.x-1) < 0) {
			over();
			}
                        
			break;
			case "d":
			if ((pc.x + 1) >= pc.height) {
                        over();
			}
                        
			break;
			default:
		}

		switch(pc.select){
			case "w" : pc.moveUp();
			break;
			case "s" : pc.moveDown();
			break;
			case "a" : pc.moveLeft();
			break;
			case "d" : pc.moveRight();
			break;
			default: warning();
		}

		pc.printPosition();
		System.out.println("Titik Koordinat Adalah (" + pc.x + " , " + pc.y + ")");
		input();
	}

	public static void main(String[]args){
		input();
	}
    }   
