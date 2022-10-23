package Passwortklasse;

import java.util.Arrays;

public class Password {
    private char[] meinPassword;
    private char[] uebergebendesPassword;
    public Password(char[] x) {
        setMeinPassword(x);
        setUebergebendesPassword(x);
    }

    private void setMeinPassword(char[] x) {
        this.meinPassword = x;
    }
    private void setUebergebendesPassword(char[] x) {
        Arrays.fill(x, ' ');
        uebergebendesPassword = x;
    }
    private boolean changePassword(char[] alt, char[] neu) {
        if (!alt.equals(meinPassword)){
            return false;
        }
        /**
         * keine isStrong Methode da
        if (isStr0ng(neu) == false) {
            return false;
        }
         */
        setMeinPassword(neu);
        return true;
    }
    private void deletePassword() {
        setMeinPassword(null);
    }
}
