package pertemuan2;

public class Gmailku {
    public static void main(String[] args) {
        // membuat objek
        Gmail login = new Gmail("Sub","han",12);
        
        login.loginRegis();
        
        
        Gmail regis = new Gmail("Subhan", "kucing", 123);
        
        regis.loginRegis();
        
        regis.gantiPass();
        
        System.out.println("Password Baru = " + regis.passBaru());
       
    }
}
