package challenges;

import dataStructures.DynamicArrayList;

import java.util.Scanner;

public class DevSelection {

    public static void main(String[] args) {

        Scanner scannInt = new Scanner(System.in);
        Scanner scannStr = new Scanner(System.in);

        int qtySkills = scannInt.nextInt();

        DynamicArrayList<Integer> skills = new DynamicArrayList<>();


        for (int i = 0; i < qtySkills; i++) {
            int skill = scannInt.nextInt();
            skills.pushBack(skill);
        }

        int qtyJobApplicant = scannInt.nextInt();

        int skilledWorkers = 0;

        for(int i=0; i<qtyJobApplicant; i++){

            String[] applicants = scannStr.nextLine().split(" ");

            DynamicArrayList<Integer> workers = new DynamicArrayList<>();

            for (int j=0; j<applicants.length; j++){
                workers.pushBack(Integer.parseInt(applicants[j]));
            }

            int satisfyCondition=0;



            if(skills.length()==workers.length() ||skills.length()<workers.length()){
                for (int k=0; k<workers.length();k++){

                    for (int t=0; t<skills.length();t++) {
                            satisfyCondition += (workers.find(k).equals(skills.find(t))) ? 1: 0;
                    }
                }
            }

            skilledWorkers += (satisfyCondition==qtySkills) ? 1 : 0;

        }

        System.out.println(skilledWorkers);
    }

}
