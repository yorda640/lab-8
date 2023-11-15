package lab8;
import java.util.Arrays;
public class Prob5 {
        public static void main(String[] args) {
            String[] names = {"Alexis", "Tim", "Kyleen", "KRISTY"};

            // Task a: Sort by ignore case using Method reference
            Arrays.sort(names, String::compareToIgnoreCase);

            // Print the sorted names
            System.out.println("Sorted names: " + Arrays.toString(names));
        }
    }


