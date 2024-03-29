package com.yang.stack.book.array;

import java.util.Arrays;

/***********************************************************************
 *<PRE>
 *
 *  File Name       : 
 *
 *  Creation Date   : 20-6-1
 *
 *  Author          : Gavin
 *
 *  Purpose         :  给定一个排序数组，你需要在 原地 删除重复出现的元素，使得每个元素只出现一次，返回移除后数组的新长度。
 *
 *                      不要使用额外的数组空间，你必须在 原地 修改输入数组 并在使用 O(1) 额外空间的条件下完成。
 *                      给定 nums = [0,0,1,1,1,2,2,3,3,4],
 *                      函数应该返回新的长度 5, 并且原数组 nums 的前五个元素被修改为 0, 1, 2, 3, 4。

 *  History         : 
 *
 *</PRE>
 ***************************************************************************/
public class RemoveDuplicates {

    /**
     * 快慢指针.
     *
     * @param args
     */
    public static void main(String[] args) {

        int [] nums = new int[]{0,0,1,1,1,2,2,3,3,4};

        int i=0;
        for(int j=1;j<nums.length;j++){
            if(nums[i] != nums[j]){
                i ++;
                nums[i] = nums[j];
            }
        }


        System.out.println(i + 1);
    }

}
