package hu.nive.ujratervezes.kepesitovizsga.addigits;

public class AddDigits {

    public int addDigits(String input) {
        if (input == null || input. isBlank()) {
            return -1;
        }
        int sum = 0;
        String digits = "0123456789";
        for (String s : input.split("")) {
            if (digits.contains(s)) {
                sum += Integer.parseInt(s);
            }
        }
        return sum;
    }
}
