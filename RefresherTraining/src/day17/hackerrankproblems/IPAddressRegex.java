package day17.hackerrankproblems;

import java.util.*;

class IPAddressValidator {
    String pattern =
        "^(0{0,2}[0-9]|0{0,1}[1-9][0-9]|1[0-9]{2}|2[0-4][0-9]|25[0-5])\\." +
        "(0{0,2}[0-9]|0{0,1}[1-9][0-9]|1[0-9]{2}|2[0-4][0-9]|25[0-5])\\." +
        "(0{0,2}[0-9]|0{0,1}[1-9][0-9]|1[0-9]{2}|2[0-4][0-9]|25[0-5])\\." +
        "(0{0,2}[0-9]|0{0,1}[1-9][0-9]|1[0-9]{2}|2[0-4][0-9]|25[0-5])$";
}

public class IPAddressRegex {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        IPAddressValidator validator = new IPAddressValidator();

        while (sc.hasNext()) {

            String ipAddress = sc.next();

            System.out.println(ipAddress.matches(validator.pattern));
        }

        sc.close();
    }
}