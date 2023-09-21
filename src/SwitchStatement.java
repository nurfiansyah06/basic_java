public class SwitchStatement {
    public static void main(String[] args) {
        String nilai = "A";

        switch (nilai) {
            case "A":
                System.out.println("Anda lulus dengan baik");
                break;
            case "B":
            case "C":
                System.out.println("Nilai anda cukup baik");
                break;
            case "D":
                System.out.println("anda tidak lulus");
                break;
            default:
                System.out.println("mungkin anda salah jurusan");
        }

        switch (nilai) {
            case "A" -> System.out.println("anda lulus dengan baik");
            case "B", "C" -> System.out.println("nilai anda cukup baik");
            case "D" -> System.out.println("anda tidak lulus");
            default -> {
                System.out.println("mungkin anda salah jurusan");
            }
        }
    }
}
