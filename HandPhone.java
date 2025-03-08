public class HandPhone {

    String jenis_hp;
    int tahun_pembuatan;
    String ram;


    public void setDataHP(String jenis_hp, int tahun_pembuatan, String ram) {
            this.jenis_hp = jenis_hp;
            this.tahun_pembuatan = tahun_pembuatan;
            this.ram = ram;
    }


    public String getJenisHP() {
        return jenis_hp;
    }

    public int getTahunPembuatan() {
        return tahun_pembuatan;
    }

    public String getram(){
        return ram;
    }

    public static void main(String[] args) {
        HandPhone hp = new HandPhone();
        hp.setDataHP("Samsung", 2022, "8GB"); 
        System.out.println(hp.getJenisHP()); 
        System.out.println(hp.getTahunPembuatan());
        System.out.println(hp.getram());
    }
}