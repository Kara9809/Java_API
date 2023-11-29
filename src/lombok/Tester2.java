package lombok;

import java.util.Scanner;

public class Tester2 {
    private static String endPoint = "https://data.gov.il/api/3/action/datastore_search?resource_id=053cea08-09bc-40ec-8f7a-156f0677aff3&q=";
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.println("Please enter car plate number:");
        String carNumber = scanner.nextLine();

    }
}
