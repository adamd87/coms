package pl.adamd.coms.helpers;


public class NewUserGenerator {
    public static String newEmployeeWithCorrectDataAndPositionManager() {
        return "{\"name\": \"Franz\", " +
                "\"surname\": \"Maurer\"," +
                "\"dateOfBirth\": \"1956-05-13\"," +
                "\"dateOfEmployment\": \"2022-01-03\"," +
                "\"position\": \"MANAGER\"," +
                "\"formOfEmployment\": \"CONTRACT_OF_EMPLOYMENT\"," +
                "\"salary\": 5500.0}";
    }
    public static String newEmployeeWithCorrectDataAndPositionWorker() {
        return "{\"name\": \"Johny\", " +
                "\"surname\": \"Bravo\"," +
                "\"dateOfBirth\": \"1956-05-13\"," +
                "\"dateOfEmployment\": \"2022-01-03\"," +
                "\"position\": \"WORKER\"," +
                "\"formOfEmployment\": \"CONTRACT_OF_EMPLOYMENT\"," +
                "\"salary\": 5500.0}";
    }
}
