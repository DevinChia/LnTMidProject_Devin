package LnTMidProject;

import java.util.Scanner;
import java.util.Random;

public class Main {
	static Random randNum = new Random();
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Scanner sc2 = new Scanner(System.in);
		int num, urut;
		String name, gen, pos;
		do {
			System.out.println("Menu:\n1. Insert Data Karyawan\n2. View Data Karyawan\n3. Update Data Karyawan\n4. Delete Data Karyawan");
			System.out.print("Enter Pilihan: ");
			num = sc.nextInt();
			if(num == 1) {
				System.out.print("Input nama karyawan [>= 3]: ");
				name = sc2.nextLine();
				System.out.print("Input jenis kelamin [Laki-laki | Perempuan] (Case Sensitive): ");
				gen = sc2.nextLine();
				System.out.print("Input jabatan [Manager | Supervisor | Admin] (Case Sensitive): ");
				pos = sc2.nextLine();
				System.out.print("Berhasil menambahkan karyawan dengan id ");
				for(int i = 0; i < 2; i++) {
					System.out.print("" + "ABCDEFGHIJKLMNOPQRSTUVWZYZ".toCharArray()[randNum.nextInt("ABCDEFGHIJKLMNOPQRSTUVWZYZ".toCharArray().length)]);
				}
				System.out.print("-");
				for(int i = 0; i < 4; i++) {
					System.out.print("" + "1234567890".toCharArray()[randNum.nextInt("1234567890".toCharArray().length)]);
				}
			}
			if(num == 2) {
				System.out.print("|----|-----------------|------------------------------|---------------|--------------|-------------|\n"
						+        "|No  |Kode Karyawan    |Nama Karyawan                 |Jenis Kelamin  |Jabatan       |Gaji Karyawan|\n"
						+        "|----|-----------------|------------------------------|---------------|--------------|-------------|\n");
				for(int i = 1;i <= 5; i++) {
					System.out.println("|   " + i + "|                 " + "|                              " + "|               " + "|              " + "|             " + "|");
				}
				System.out.print("|----|-----------------|------------------------------|---------------|--------------|-------------|\n");
			}
			if(num == 3) {
				System.out.println("|----|-----------------|------------------------------|---------------|--------------|-------------|\n"
						+          "|No  |Kode Karyawan    |Nama Karyawan                 |Jenis Kelamin  |Jabatan       |Gaji Karyawan|\n"
						+          "|----|-----------------|------------------------------|---------------|--------------|-------------|\n");
				for(int i = 1;i <= 5; i++) {
					System.out.println("|   " + i + "|                 " + "|                              " + "|               " + "|              " + "|             " + "|");
				}
				System.out.print("|----|-----------------|------------------------------|---------------|--------------|-------------|\n");
				System.out.print("Input nomor urutan karyawan yang ingin diupdate: ");
				System.out.print("Input nama karyawan [>= 3]: ");
				name = sc2.nextLine();
				System.out.print("Input jenis kelamin [Laki-laki | Perempuan] (Case Sensitive): ");
				gen = sc2.nextLine();
				System.out.print("Input jabatan [Manager | Supervisor | Admin] (Case Sensitive): ");
				pos = sc2.nextLine();
				System.out.print("Berhasil menambahkan karyawan dengan id ");
				for(int i = 0; i < 2; i++) {
					System.out.print("" + "ABCDEFGHIJKLMNOPQRSTUVWZYZ".toCharArray()[randNum.nextInt("ABCDEFGHIJKLMNOPQRSTUVWZYZ".toCharArray().length)]);
				}
				System.out.print("-");
				for(int i = 0; i < 4; i++) {
					System.out.print("" + "1234567890".toCharArray()[randNum.nextInt("1234567890".toCharArray().length)]);
				}
			}
			if(num == 4) {
				System.out.println("|----|-----------------|------------------------------|---------------|--------------|-------------|\n"
						+          "|No  |Kode Karyawan    |Nama Karyawan                 |Jenis Kelamin  |Jabatan       |Gaji Karyawan|\n"
						+          "|----|-----------------|------------------------------|---------------|--------------|-------------|\n");
				for(int i = 1;i <= 5; i++) {
					System.out.println("|   " + i + "|                 " + "|                              " + "|               " + "|              " + "|             " + "|");
				}
				System.out.print("|----|-----------------|------------------------------|---------------|--------------|-------------|\n");
				System.out.print("Input nomor urutan karyawan yang ingin dihapus: ");
				urut = sc.nextInt();
				System.out.print("Karyawan dengan kode " + "berhasil dihapus");
			}
		}while(num != 1 && num != 2 && num != 3 && num != 4);
		
	}
}	
