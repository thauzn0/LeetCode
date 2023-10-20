package leetCode_1491_minMaxSalary;

import java.util.*;

public class minMaxSalary {
    public static double average(int[] salary) {
        List<Double> list = new ArrayList<>();
        for (double item: salary) {
            list.add(item);
        }

        Collections.sort(list);

        list.remove(0);
        list.remove(list.size()-1);
        double avg = 0;
        for(int i = 0; i< list.size();i++){
            avg += list.get(i);
        }

        return avg / list.size();
    }

    public static void main(String[] args) {
        int[] salary = {8000,9000,2000,3000,6000,1000};
        System.out.println(average(salary));
    }
}
