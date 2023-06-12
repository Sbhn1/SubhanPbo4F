
package pertemuan2;


public class Gmail {
    String nama, password;
    int no;
    
    //method mutator
    void gantiPass() {
        password = "ayamjago";
    }
    
    //method accessor
    String passBaru () {
        return password;
    }
    
    //method konstruktor
    Gmail (String nama, String password, int no) {
        this.nama = nama;
        this.password = password;
        this.no = no;
    }
    
    //membuat method
    void loginRegis() {
        System.out.println("User = " + nama);
        System.out.println("Password = " + password);
        System.out.println("no = " + no);
    }
}
