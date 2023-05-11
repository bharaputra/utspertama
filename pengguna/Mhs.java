package pengguna;

public class Mhs {
    private String username;
    private String password;
    private String nama;
    private String nim;
    private int smt;

    public Mhs(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getUsername() {
        return this.username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPassword() {
        return this.password;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getNama() {
        return this.nama;
    }

    public void setNim(String nim) {
        this.nim = nim;
    }

    public String getNim() {
        return this.nim;
    }

    public void setSmt(int smt) {
        this.smt = smt;
    }

    public int getSmt() {
        return this.smt;
    }
}
