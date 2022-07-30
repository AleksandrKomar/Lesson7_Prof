package hometasks.task3;

public class Doctors {

    private int id;
    private String fam;
    private String name;
    private String otc;
    private String dateb;
    private String datep;
    private String datev;
    private String datebegin;
    private String dateend;
    private int vdolid;
    private int specid;
    private int klavid;
    private float stav;
    private int progid;

    public void setId(int id) {
        this.id = id;
    }

    public void setFam(String fam) {
        this.fam = fam;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setOtc(String otc) {
        this.otc = otc;
    }

    public void setDateb(String dateb) {
        this.dateb = dateb;
    }

    public void setDatep(String datep) {
        this.datep = datep;
    }

    public void setDatev(String datev) {
        this.datev = datev;
    }

    public void setDatebegin(String datebegin) {
        this.datebegin = datebegin;
    }

    public void setDateend(String dateend) {
        this.dateend = dateend;
    }

    public void setVdolid(int vdolid) {
        this.vdolid = vdolid;
    }

    public void setSpecid(int specid) {
        this.specid = specid;
    }

    public void setKlavid(int klavid) {
        this.klavid = klavid;
    }

    public void setStav(float stav) {
        this.stav = stav;
    }

    public void setProgid(int progid) {
        this.progid = progid;
    }

    @Override
    public String toString() {
        return "Doctors{" +
                "id=" + id +
                ", fam='" + fam + '\'' +
                ", name='" + name + '\'' +
                ", otc='" + otc + '\'' +
                ", dateb='" + dateb + '\'' +
                ", datep='" + datep + '\'' +
                ", datev='" + datev + '\'' +
                ", datebegin='" + datebegin + '\'' +
                ", dateend='" + dateend + '\'' +
                ", vdolid=" + vdolid +
                ", specid=" + specid +
                ", klavid=" + klavid +
                ", stav=" + stav +
                ", progid=" + progid +
                '}';
    }

    public Doctors() {
    }
}
