package ru.job4j.exercises.arraysexercise;

/**
 * 3. Вывести значения, которые встречаются ровно один раз
 *
 * @author Ilya Kaltygin
 */
public class Task78 {
    public static void array(int[] nums) {
        String whiteSpace = "";
        for (int i = 0; i < nums.length; i++) {
            int count = 0;
            for (int j = 0; j < nums.length; j++) {
                if (nums[i] == nums[j]) {
                    count++;
                }
            }
            if (count == 1) {
                System.out.print(whiteSpace + nums[i]);
                whiteSpace = " ";
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {5, 5, 4, 3, 3, 1};
        array(arr);
    }
}
