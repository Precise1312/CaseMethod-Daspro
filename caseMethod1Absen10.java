import java.util.Scanner;

public class caseMethod1Absen10 {
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    String namaMahasiswa;
    int NIM;
    Byte UTSAlgoritma;
    Byte UASAlgoritma;
    Byte tugasAlgoritma;

    Byte UTSAtruktur;
    Byte UASStruktur;
    Byte tugasStruktur;

    String nilaiHurufAlg;
    String nilaiHurufStruk;
    String statusAlg;
    String statusStruk;
    String statusSemester;  

    System.out.println("========INPUT DATA MAHASISWA========");
    System.out.print("Nama  : ");
    namaMahasiswa = sc.nextLine();
    System.out.print("NIM   : ");
    NIM = sc.nextInt();

    System.out.println("--Mata Kuliah : Algoritma dan Pemrograman--");
      System.out.print("Nilai UTS  : ");
    UTSAlgoritma = sc.nextByte();
    System.out.print("Nilai UAS  : ");
    UASAlgoritma = sc.nextByte();
    System.out.print("Nilai Tugas : ");
    tugasAlgoritma = sc.nextByte();

        System.out.println("--Mata Kuliah : Struktur Data--");
      System.out.print("Nilai UTS  : ");
    UTSAtruktur = sc.nextByte();
    System.out.print("Nilai UAS  : ");
    UASStruktur = sc.nextByte();
    System.out.print("Nilai Tugas : ");
    tugasStruktur = sc.nextByte();

    double nilaiAkhirAlgoritma = ((UTSAlgoritma*30)/100)+((UASAlgoritma*40)/100)+((tugasAlgoritma*30)/100);
    double nilaiAkhirStruktur = ((UTSAtruktur*30)/100)+((UASStruktur*40)/100)+((tugasStruktur*30)/100);

    if (nilaiAkhirAlgoritma >= 60) {
        statusAlg = "LULUS";
    }
    else {
        statusAlg = "TIDAK LULUS";
    }
    if (nilaiAkhirAlgoritma <= 39){
        nilaiHurufAlg = "E";
    }
    else if (nilaiAkhirAlgoritma >39 && nilaiAkhirAlgoritma <= 50){
        nilaiHurufAlg = "D";    
    }
      else if (nilaiAkhirAlgoritma >50 && nilaiAkhirAlgoritma <= 60){
        nilaiHurufAlg = "C";
    }
      else if (nilaiAkhirAlgoritma >60 && nilaiAkhirAlgoritma <= 65){
        nilaiHurufAlg = "C+";
    }
      else if (nilaiAkhirAlgoritma >65 && nilaiAkhirAlgoritma <= 73){
        nilaiHurufAlg = "B";
    }
      else if (nilaiAkhirAlgoritma >73 && nilaiAkhirAlgoritma <= 80){
        nilaiHurufAlg = "B+";
    }
    else {
        nilaiHurufAlg = "A";
    }

     if (nilaiAkhirStruktur >= 60) {
        statusStruk = "LULUS";
    }
    else {
        statusStruk = "TIDAK LULUS";
    }
    if (nilaiAkhirStruktur <= 39){
        nilaiHurufStruk = "E";
    }
    else if (nilaiAkhirStruktur >39 && nilaiAkhirStruktur <= 50){
        nilaiHurufStruk = "D";    
    }
      else if (nilaiAkhirStruktur >50 && nilaiAkhirStruktur <= 60){
        nilaiHurufStruk = "C";
    }
      else if (nilaiAkhirStruktur >60 && nilaiAkhirStruktur <= 65){
        nilaiHurufStruk = "C+";
    }
      else if (nilaiAkhirStruktur >65 && nilaiAkhirStruktur <= 73){
        nilaiHurufStruk = "B";
    }
      else if (nilaiAkhirStruktur >73 && nilaiAkhirStruktur <= 80){
        nilaiHurufStruk = "B+";
    }
    else {
        nilaiHurufStruk = "A";
    }

    double rataRata = (nilaiAkhirAlgoritma+nilaiAkhirStruktur)/2;

    if ( statusAlg == "LULUS" && statusStruk == "LULUS") {
       
            if (rataRata >= 70){
                statusSemester = "LULUS";
            }
            else statusSemester = "TIDAK LULUS";

    }
    else {
        statusSemester = "TIDAK LULUS";
    }

    System.out.println("==========================HASIL PENELITIAN AKADEMIK===============================");
    System.out.println("Nama : " + namaMahasiswa);
    System.out.println("NIM : " + NIM);
    System.out.println("  ");
    System.out.println("Mata Kuliah             UTS UAS     Tugas   Nilai Akhir     Nilai Huruf     Status");
    System.out.println("----------------------------------------------------------------------------------");
    System.out.println("Algoritma Pemrograman   "+UTSAlgoritma+"  "+ UASAlgoritma+"       "+tugasAlgoritma+ "     "+nilaiAkhirAlgoritma+"             "+nilaiHurufAlg+"              "+statusAlg);
    System.out.println("Struktur Data           "+UTSAtruktur+"  "+ UASStruktur+"       "+tugasStruktur+ "     "+nilaiAkhirStruktur+"             "+nilaiHurufStruk+"              "+statusStruk);
    System.out.println("    ");
    System.out.println("Rata rata Nilai Akhir   = " + rataRata);
    System.out.println("Status Semester         = "+ statusSemester);
}   
}