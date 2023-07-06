package dpdncyInv;

public class UserMother {
    static final Integer ALP_ID = 123;
    private static final String ALP_NAME = "Alp";
    private static final String ALP_AGE = "25";

    static User alp() {
        return new User(ALP_ID,ALP_NAME,ALP_AGE);
    }
}
