import pengguna.*;

class Main {
    public static void main(String[] args) {

            Mhs mhs = new Mhs(username:"ini_username", password:"ini_password");

            mhs.setNama(nama:"Bhara Putra Agus Tiono");
            mhs.setNim(nim:"G.111.19.0049");
            mhs.setSmt(smt:8);
            
            System.out.println("Nama Mhs: " + mhs.getNama());
            System.out.println("nim Mhs: " + mhs.getNim());
            System.out.println("Smt Mhs: " + mhs.getSmt());
            System.out.println("Username: " + mhs.getUsername());
            System.out.println("Password Mhs: " + mhs.getPassword());
    }
}