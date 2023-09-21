public class OperasiBoolean {
    public static void main(String[] args) {
        int nilaiAkhir = 80;
        int absen = 75;

        boolean lulusAbsen = absen >= 75;
        boolean lulusNilaiAkhir = nilaiAkhir >= 75;

        boolean lulus = lulusAbsen && lulusNilaiAkhir;
        System.out.println(lulus);
    }
}
