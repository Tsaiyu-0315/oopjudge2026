/**
 * Determines whether a given year is a leap year.
 */
public class IsLeapYear {

    /**
     * Determines whether the specified year is a leap year.
     *
     * @param year the year to be checked
     * @return true if the year is a leap year; otherwise, false
     */
    public boolean determine(int year) {
        return year % 400 == 0
                || (year % 4 == 0 && year % 100 != 0);
    }
}