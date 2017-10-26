package com.playtika.maraphon;


public class Runner {

    public static void main(String[] args) {
        String[] names = {"Elena", "Thomas", "Hamilton", "Suzie", "Phil", "Matt", "Alex", "Emma", "John", "James", "Jane", "Emily", "Daniel", "Neda", "Aaron", "Kate"};
        int[] time = {341, 273, 278, 329, 445, 402, 388, 275, 243, 334, 412, 393, 299, 343, 317, 265};


        //Sorting the array
        for (int i = 0; i < time.length; i++) {
            for (int j = i + 1; j < time.length; j++) {
                int tempA;
                String tempB;
                if (time[i] > time[j]) {
                    tempA = time[i];
                    time[i] = time[j];
                    time[j] = tempA;
                    tempB = names[i];
                    names[i] = names[j];
                    names[j] = tempB;


                }
            }
        }

        for (int i = 0; i < time.length; i++) {
            System.out.println(names[i] + "  " + time[i]);

        }

        System.out.println("First place is " + names[0] + " with the score " + time[0]);
        System.out.println("The second place is " + names[1] + " with the score " + time[1]);

    }

}


