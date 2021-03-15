import java.util.Scanner;

// membuat program kasir

public class Kasir {
  
   public static void main(String[] args){
     
      String nama_barang;
      String merek_barang;
      int jumlah_barang,harga,totalharga;
      double diskon = 0.067;
      double totalbayar;
      
      System.out.println("Masukan data berikut");
      
      Scanner input = new Scanner(System.in);
      
      System.out.print("Nama Barang :");
      nama_barang = input.nextLine();
      System.out.print("Merek Barang : ");
      merek_barang = input.nextLine();
      
      System.out.print("Jumlah Barang :");
      jumlah_barang = input.nextInt();
      if(jumlah_barang <=0){
        System.out.println("Mohon Masukan jumlah yang valid dan ulang program");
        System.exit(0);
      }
       System.out.print("Harga Barang :");
       harga = input.nextInt();
       if(harga <150)
       {
         System.out.println("Mohon Masukan Harga yang valid dan ulang program");
         System.exit(0);
       }
       System.out.println("Anda mendapatakan diskon sebesar 6.7%");
       
       totalharga = jumlah_barang * harga;
       System.out.println("Total Harga : Rp" + totalharga);
       diskon = totalharga * diskon;
       totalbayar = totalharga - diskon;
       System.out.println("Total Bayar : Rp" + totalbayar);
       System.out.println("Nota Belanjanya tuan nyonya");
       System.out.println("Nama Barang : " + nama_barang);
       System.out.println("Merek Barang :" + merek_barang);
       System.out.println("Total Harga : Rp" + harga);
       System.out.println("Total Bayar : Rp" + totalbayar);
       System.out.println("______Terimah Kasih telah berkunjung____");
   }
}