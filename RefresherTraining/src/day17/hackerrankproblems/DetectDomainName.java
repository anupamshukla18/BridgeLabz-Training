package day17.hackerrankproblems;

import java.util.*;
import java.util.regex.*;

public class DetectDomainName {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int numberOfLines = sc.nextInt();
        sc.nextLine();

        TreeSet<String> uniqueDomains = new TreeSet<>();

        String domainPattern =
                "https?://(?:www\\.|ww2\\.)?([a-zA-Z0-9-]+(?:\\.[a-zA-Z0-9-]+)+)";

        Pattern pattern = Pattern.compile(domainPattern);

        for (int i = 0; i < numberOfLines; i++) {

            String htmlLine = sc.nextLine();

            Matcher matcher = pattern.matcher(htmlLine);

            while (matcher.find()) {

                String domainName = matcher.group(1);

                uniqueDomains.add(domainName);
            }
        }

        System.out.println(String.join(";", uniqueDomains));

        sc.close();
    }
}