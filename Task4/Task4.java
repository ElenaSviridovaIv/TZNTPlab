

package com.mycompany.task4;

import java.util.Arrays;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Task4 {
    
    public static int minMoves(int[] nums) 
    {
        try {
            Path path = Paths.get("file.txt");
            String content = Files.readString(path);
            System.out.println(content);
            
        } catch (IOException e) {
            e.printStackTrace();
        }
//сортировка
        Arrays.sort(nums);  
// высчитываем медиану
        int median = nums[nums.length / 2];  

// считаем количество ходов
        int moves = 0;
        for (int num : nums) {
            moves += Math.abs(num - median);
        }

        return moves;
    }
   
     // File Znaki = new File("Znaki.txt"); 
      
    public static void main(String[] args) {
        // Пример
        int[] nums = {1, 10, 2, 9};
        System.out.println("Минимальное количество ходов: " + minMoves(nums));
    }
}
    
