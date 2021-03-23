package rohan.nishant;

import java.util.*;

public class Main {
    public static int[] boyerMooreMajorityVotingAlgorithm(ArrayList<Integer> a, int n) {
        int elementOne = 0, countElementOne = 0, elementTwo = 0, countElementTwo = 0, totalCountElementOne = 0,
                totalCountElementTwo = 0, x = (int) Math.floor(n/3.0), count = 0;
        for (int i = 0; i < n; ++i) {
            if (a.get(i) == elementOne)
                countElementOne++;
            else if (a.get(i) == elementTwo)
                countElementTwo++;
            else if (countElementOne == 0) {
                elementOne = a.get(i);
                countElementOne++;
            } else if (countElementTwo == 0) {
                elementTwo = a.get(i);
                countElementTwo++;
            } else {
                countElementOne--;
                countElementTwo--;
            }
        }
        for (int i = 0; i < n; ++i) {
            if (a.get(i) == elementOne)
                totalCountElementOne++;
            else if (a.get(i) == elementTwo)
                totalCountElementTwo++;
        }
        int[] temp = new int[2];
        if (totalCountElementOne >= x) {
            temp[count] = elementOne;
            count++;
        }
        if (totalCountElementTwo >= x) {
            temp[count] = elementTwo;
        }
        return temp;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Integer> a = new ArrayList<>();
        for (int i = 0; i < n; ++i)
            a.add(sc.nextInt());
        int[] temp = boyerMooreMajorityVotingAlgorithm(a, n);
        if (temp[0] == 0 && temp[1] == 0)
            System.out.println("No Majority Elements");
        else if (temp[1] == 0)
            System.out.println(temp[0]);
        else
            System.out.println(temp[0] + " " + temp[1]);
    }
}