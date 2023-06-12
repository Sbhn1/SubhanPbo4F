package Pertemuan4;


public class SimB1{
     private String nama,lahir;
   protected int harga;
   
//method construktor
   public SimB1(String nama,String lahir, int harga){
       System.out.println("3 parameter");
       this.nama = nama;
       this.lahir = lahir;
       this.harga = harga;
   }
   public SimB1(){
       System.out.println("tidak ada parameter");
   }


   //method mutator

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setLahir(String lahir) {
        this.lahir = lahir;
    }

    public void setHarga(int harga) {
        System.out.println("");
        this.harga = harga;
    }
        
        //method accesor
    public String getNama() {
        return nama;
    }

    public String getLahir() {
        return lahir;
    }

    public int getHarga() {
        System.out.println("superclass");
        return harga;
    }

    }


    
   



