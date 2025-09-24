package org.desviante.introduction.forloops.SizeOfParts;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberOfParts = scanner.nextInt();
        int  totalNumberOfPartsReadyToBeShipped = 0;
        int totalNumberOfPartsToBeFixed = 0;
        int totalNumberOfRejects = 0;
        for (int i=0; i<numberOfParts; i++){
            int part = scanner.nextInt();
            if (part==0){
                totalNumberOfPartsReadyToBeShipped++;
            } else if(part==1){
                totalNumberOfPartsToBeFixed++;
            }
            else if(part==-1){
                totalNumberOfRejects++;
            }
        }
        System.out.println(totalNumberOfPartsReadyToBeShipped+" "+totalNumberOfPartsToBeFixed+" "+totalNumberOfRejects);
    }
}