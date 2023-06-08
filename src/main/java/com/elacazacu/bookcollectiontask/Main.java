package com.elacazacu.bookcollectiontask;

public class Main {
    public static void main(String[] args) {
        int[] tablouDeDateInt = {1,2,3,4,0,3,5,6,4,3,2,4,3,5,5};

        System.out.println(IntNumberArrayService.getTheMinValuesOfTheArray(tablouDeDateInt));
        System.out.println(IntNumberArrayService.getTheMinValueIndexOfTheArray(tablouDeDateInt));
        System.out.println(IntNumberArrayService.getTheAverageOfTheElements(tablouDeDateInt));
    }
}
