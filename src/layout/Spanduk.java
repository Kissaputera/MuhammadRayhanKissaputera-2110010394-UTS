package layout;

public class Spanduk {
    String kdspanduk,jnsspanduk, bhnspanduk, pmkspanduk;
    double hpermspanduk;

    public Spanduk(String kdspanduk, String jnsspanduk, String bhnspanduk, double hpermspanduk, String pmkspanduk) {
        this.kdspanduk = kdspanduk;
        this.jnsspanduk = jnsspanduk;
        this.bhnspanduk = bhnspanduk;
        this.hpermspanduk = hpermspanduk;
        this.pmkspanduk = pmkspanduk; 
    }

    public Spanduk() {
    }

    public String getKdspanduk() {
        return kdspanduk;
    }

    public void setKdspanduk(String kdspanduk) {
        this.kdspanduk = kdspanduk;
    }

    public String getJnsspanduk() {
        return jnsspanduk;
    }

    public void setJnsspanduk(String jnsspanduk) {
        this.jnsspanduk = jnsspanduk;
    }

    public String getBhnspanduk() {
        return bhnspanduk;
    }

    public void setBhnspanduk(String bhnspanduk) {
        this.bhnspanduk = bhnspanduk;
    }

    public String getPmkspanduk() {
        return pmkspanduk;
    }

    public void setPmkspanduk(String pmkspanduk) {
        this.pmkspanduk = pmkspanduk;
    }

    public double getHpermspanduk() {
        return hpermspanduk;
    }

    public void setHpermspanduk(double hpermspanduk) {
        this.hpermspanduk = hpermspanduk;
    }


}
