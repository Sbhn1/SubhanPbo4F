package pertemuan4;

public class SimB1Beraksi {
    public static void main(String[] args) {
        
    //Membuat Objek
    SimB1 saya = new SimB1();
    SimB1 Han = new SimB1("Andi","Banjarmasin",500000);
    
    saya.setNama("Subhan");
    saya.setLahir("Banjarmasin");
    saya.setHarga(100000);
    
    System.out.println("Nama:"+saya.getNama());
    System.out.println("Lahir:"+saya.getLahir());
    System.out.println("Harga:"+saya.getHarga());
    
  }
}