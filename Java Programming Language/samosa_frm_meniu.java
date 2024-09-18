import java.util.*;

class samosa_frm_meniu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String meniu[] = { "Misal Paw", "Makki di roti", "Kosha Mangsho", "Dhokla", "Rogan josh", "Pongal", "samosa",
                "Ppapya Khar", "liti Chokha", "Dhaaam", "Biryani" };
        String key = "samosa";
        int idx = linearSearch(meniu, key);
        if (idx == -1) {
            System.out.println("not found");
        } else {
            System.out.println(idx);
        }
    }

    public static int linearSearch(String menu[], String key) {
        for (int i = 0; i < menu.length; i++) {
            if (menu[i].equals(key)) {
                return i;

            }

        }
        return -1;
    }

}
