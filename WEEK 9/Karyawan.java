class Karyawan extends Manusia {
    private String gelarBelakang;

    public String getGelarBelakang() {
        return gelarBelakang;
    }

    public void setGelarBelakang(String gelarBelakang) {
        this.gelarBelakang = gelarBelakang;
    }

    @Override
    public void dataDiri() {
        this.namaLengkap();
        System.out.println("Umur: " + this.getUmur() + " tahun");
    }

    @Override
    public void namaLengkap() {
        System.out.println("Nama pegawai : " + this.getNamaDepan() + " " + this.getNamaBelakang() +
                ", " + this.getGelarBelakang());
    }

    public static void main(String[] args) {
        Pegawai jamal = new Pegawai();
        jamal.setNamaDepan("Panjoel");
        jamal.setNamaBelakang("Subowo");
        jamal.setUmur(25);
        jamal.setGelarBelakang("S.Doger");
        jamal.dataSingkat();
    }
}