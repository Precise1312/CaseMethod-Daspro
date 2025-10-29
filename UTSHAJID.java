  import java.util.Scanner;

  public class UTSHAJID {
  public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);

      Byte jumlahPrestasiLomba;
      double IPK;

      System.out.println("INPUT JUMLAH PRESTASI LOMBA");
      jumlahPrestasiLomba = sc.nextByte();
      System.out.println("INPUT NILAI IPK");
      IPK = sc.nextDouble();

      if (jumlahPrestasiLomba > 3 && IPK > 3.5 && IPK <= 4.0){
        System.out.println("ANDA ADALAH SISWA BERPRESTASI");
      }
      else if(IPK > 4){
        System.out.println("DATA TIDAK AKURAT, HARAP MASUKKAN IPK YANG BENAR");
      }
      else {
        System.out.println("MASIH BELUM BERPRESTASI, TINGKATKAN LAGI");
      }
  }}