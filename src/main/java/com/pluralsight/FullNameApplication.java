package com.pluralsight;
import java.util.*;

public class FullNameApplication {
    public static void main(String[] args) {
        Scanner kbScanner = new Scanner(System.in);
        String[] nameArray = new String[4];
        String fullName = "";

        System.out.print("Please enter your name! \nFirst Name: ");
        nameArray[0] = kbScanner.nextLine();
        System.out.print("Middle Name: ");
        nameArray[1] = kbScanner.nextLine();
        System.out.print("Last Name: ");
        nameArray[2] = kbScanner.nextLine();
        System.out.print("Suffix: ");
        nameArray[3] = kbScanner.nextLine();

        for(int j = 0; j <=3; j++){
            if(nameArray[j].isBlank()){
            }
            else if (j == 1){
                fullName += " " + nameArray[j].charAt(0) + ".";
            }
            else if (j == 3){
                fullName += ", " + nameArray[j];
            }
            else {
                fullName += " " + nameArray[j];
            }
        }

        System.out.print("\nFull Name:" + fullName.trim());
    }
}
