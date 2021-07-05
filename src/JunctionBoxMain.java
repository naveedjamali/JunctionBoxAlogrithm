import java.util.ArrayList;

public class JunctionBoxMain {

    static ArrayList<String> newModels;
    static ArrayList<String> oldModels;
    static ArrayList<String> junctionBoxes;

    /**
     * Sort function
     */
    static void sortOldModels() {
        oldModels.sort((s, t1) -> {
            String[] splitS = s.split("_");
            String[] splitT = t1.split("_");

            return splitS[1].compareTo(splitT[1]);
        });
    }

    /**
     * Print function
     *
     * @param label to print
     */
    static void print(String label) {
        System.out.println(label + "\n");
        junctionBoxes.forEach(s -> System.out.println(s));
        System.out.println("\n");
    }

    /**
     * main function of the class.
     *
     * @param args
     */

    public static void main(String[] args) {
        junctionBoxes = new ArrayList<>();
        newModels = new ArrayList<>();
        oldModels = new ArrayList<>();
        /**
         * Add dummy enteries in random order
         */
        junctionBoxes.add("xbc_abc");
        junctionBoxes.add("xbc_abd");
        junctionBoxes.add("zbc_bcd");
        junctionBoxes.add("ycd_bcd");
        junctionBoxes.add("abc_eed");
        junctionBoxes.add("ccd_def");
        junctionBoxes.add("dec_cfd");
        junctionBoxes.add("abc_120");
        junctionBoxes.add("abc_362");
        junctionBoxes.add("adc_sdc");
        junctionBoxes.add("fdc_633");
        junctionBoxes.add("red_3221");
        junctionBoxes.add("ress_87846");
        junctionBoxes.add("q_9");
        junctionBoxes.add("efsd_53");
        junctionBoxes.add("trdf_5443");
        junctionBoxes.add("sdfcc_pop");
        junctionBoxes.add("poj_jiul");
        junctionBoxes.add("fwe_sdf");
        junctionBoxes.add("wed_ggg");


        print("Unsorted list");
        /**
         * shift entries to newModels and Oldmodels respectively.
         */

        junctionBoxes.forEach(s -> {

            String[] splitS = s.split("_");
            int x = -1;
            try {
                /**
                 * Since new model junction boxes's version is a positive integer.
                 * if following try-catch block deos not throw exception, we can say that the junctionbox is a new model junctionbox.
                 */
                x = Integer.parseInt(splitS[1]);

            } catch (Exception e) {

            }
            if (x > 0) {
                newModels.add(s);
            } else {
                oldModels.add(s);
            }
        });

        /** Remove all entries from junction box.

         */
        junctionBoxes = new ArrayList<>();

        /**
         * Sort oldmodels array. and then add it to the junction box.
         * Add newmodels array to the junction box.
         */
        sortOldModels();

        junctionBoxes.addAll(oldModels);
        junctionBoxes.addAll(newModels);

        print("Sorted JunctionBoxes");
    }
}
