package kodlamaio.hrmsdemo.core.utilities.validations;


public class Validations {
    public static boolean run(boolean... logics) {
        for (boolean rule : logics) {
            if (!rule)
                return false;
        }
        return true;
    }
}
