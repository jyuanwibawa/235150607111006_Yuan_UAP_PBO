import java.util.ArrayList;
import java.util.Scanner;

public class Data {
    // private static ArrayList<Tanaman> tanamans;
    // private static ArrayList<Integer> lokasi;
    // private static Scanner in;

    public static ArrayList<Tanaman> tanamans = new ArrayList<>();
    public static ArrayList<Integer> lokasi = new ArrayList<>();
    public static Scanner in = new Scanner(System.in);

    static {
        tanamans = new ArrayList<>();
        lokasi = new ArrayList<>();
        in = new Scanner(System.in);
    }

    public static void mulai() {
    }

    public static void menanam() {

    }

    public static void info() {

    }

    public static ArrayList<Tanaman> tanamans() {
        return tanamans;
    }

    public static ArrayList<Integer> lokasi() {
        return lokasi;
    }

    public static Scanner In() {
        return in;
    }

}