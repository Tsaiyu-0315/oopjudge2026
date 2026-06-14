/**
 * Determines whether a given year is a leap year
 * according to the Gregorian calendar.
 */
public class IsLeapYear {

    /**
     * Determines whether the specified year is a leap year.
     *
     * @param year the year to be checked
     * @return true if the given year is a leap year;
     *         false otherwise
     */
    public boolean determine(int year) {
        return year % 400 == 0
                || (year % 4 == 0 && year % 100 != 0);
    }
}