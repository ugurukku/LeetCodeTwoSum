/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package leetcode;

/**
 *
 * @author HPProbook4530s
 */
public class TwoSum {

    public static void main(String[] args) {

        int[] i = new int[3];
        i[0] = 2;
        i[1] = 3;
        i[2] = 4;

        int target = 6;

        int[] a = twoSum(i, target);
        System.out.println("[" + a[0] + "," + a[1] + "]");
    }

    public static int[] twoSum(int[] nums, int target) {

        int[] result = new int[2];

        for (int i = 0; i < nums.length; i++) {

            for (int j = nums.length - 1; j >= 0; j--) {

                if ((nums[i] + nums[j]) == target) {

                    result[0] = i;
                    result[1] = j;

                    return result;

                }
            }
        }
        return result;
    }
}
