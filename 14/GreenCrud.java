/**
 * The {@code GreenCrud} class calculates the population growth
 * of green crud bacteria.
 *
 * <p>The population grows every five days according to the
 * Fibonacci sequence.</p>
 */
public class GreenCrud {

    /**
     * Calculates the green crud population after a given number of days.
     *
     * <p>The population changes every five days and follows the
     * Fibonacci sequence. Any remaining days that do not form a complete
     * five-day period do not cause additional growth.</p>
     *
     * @param initialSize the initial population size
     * @param days the number of days that have passed
     * @return the green crud population after the given number of days
     */
    public int calPopulation(int initialSize, int days) {
        int periods = days / 5;

        int previous = 1;
        int current = 1;

        for (int i = 0; i < periods; i++) {
            int next = previous + current;
            previous = current;
            current = next;
        }

        return initialSize * previous;
    }
}
