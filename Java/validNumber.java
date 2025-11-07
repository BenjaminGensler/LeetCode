/**
* Benjamin Gensler
* 11/07/2025
* 65. Valid Number
*/
import java.util.regex.Matcher;
import java.util.regex.Pattern;

class Solution {
    public boolean isNumber(String s) {
        //This uses a regex pattern check to determine if its a valid number or not
        //[-+]?  - Optional - or + at the beginning (only one allowed)
        // (\\d*\\.\\d+|\\d+\\.?\\d*)  - Optional for digits to be in front of the decimal or for no digits at all
        // ([Ee][-+]?)\\d)? - Optional exponent including a required E or e and then an optional sign of - or + with digits then required if exponent exists
        Pattern pattern = Pattern.compile("[-+]?(\\d*\\.\\d+|\\d+\\.?\\d*)([Ee][-+]?\\d+)?", Pattern.CASE_INSENSITIVE);
    Matcher matcher = pattern.matcher(s);
    boolean matchFound = matcher.matches();
    
    return matchFound;
    }
}
