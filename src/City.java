import java.util.ArrayList;
import java.util.HashMap;

public class City {
    String name;
    HashMap<String, Double[]> months;

    public City(String name) {
        this.name = name;
        months = new HashMap<>();
    }

    public void addTempForDate(String month, int day, double temp) {
        if (months.containsKey(month)) {
            Double[] temps = months.get(month);
            double d;
            if (temps[day] != null) {
                d = temps[day];
            } else {
                d = Integer.MIN_VALUE;
            }
            if (d < temp) {
                temps[day] = temp;
            }
        } else {
            Double[] temps = new Double[32];
            temps[day] = temp;
            months.put(month, temps);
        }
    }

    public void printMaxTemps() {
        for (String str : months.keySet()) {
            double max = (double) Integer.MIN_VALUE;
            for (int i = 0; i < months.get(str).length; i++) {
                if (months.get(str)[i] == null) {
                    continue;
                } else {
                    if (months.get(str)[i] > max) {
                        max = months.get(str)[i];
                    }
                }
            }
            System.out.println(str + ": " + max);
        }
    }

    public static void main(String[] args) {
        City c = new City("test");
        c.addTempForDate("September", 1, 99);
        c.addTempForDate("September", 2, 100);
        c.addTempForDate("February", 28, 40);
        c.printMaxTemps();
    }
}
