import edu.princeton.cs.introcs.StdRandom;

import java.util.Arrays;

@SuppressWarnings({"unchecked", "rawtypes"})
public class SelectSort {

    public static Comparable[] sort(Comparable[] values) {
        for (int i = 0; i < values.length; i++) {
            int min = i;
            for (int j = i + 1; j < values.length; j++)
                if (values[j].compareTo(values[min]) < 0) min = j;
            exchange(values, i, min);
        }
        return values;
    }

    private static void exchange(Comparable[] values, int i, int j) {
        Comparable swap = values[i];
        values[i] = values[j];
        values[j] = swap;
    }
}
