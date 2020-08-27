
// Question 1:
// Given an array of integers, return indices of the two numbers such that they add up to a specific target.
// You may assume that each input would have exactly one solution, and you may not use the same element twice.

// Solution: One Pass Hash Table
// public int[] twoSum(int[] nums, int target) {
//     Map<Integer, Integer> map = new HashMap<>();
//     for (int i = 0; i < nums.length; i++) {
//         int complement = target - nums[i];
//         if (map.containsKey(complement)) {
//             return new int[] { map.get(complement), i };
//         }
//         map.put(nums[i], i);
//     }
//     throw new IllegalArgumentException("No two sum solution");
// }



//Question 2: You are given two non-empty linked lists representing two non-negative integers. The digits are stored in reverse order and each of their nodes contain a single digit. 
//Add the two numbers and return it as a linked list. You may assume the two numbers do not contain any leading zero, except the number 0 itself.

//Solution: Elementary Math
// public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
//     ListNode value = new ListNode(0);
//     ListNode temp = l1;
//     ListNode other = l2;
//     ListNode curr = value;
//     final int DIVIDE = 10;
//     int rem = 0;
//     int x = 0;
//     int y = 0;
//     while(temp != null || other != null){
//        if(temp != null){
//           x = temp.val; 
//        } else{
//           x = 0;
//        }
//        if(other != null){
//            y = other.val;
//        } else{
//            y = 0;
//        }
//         int sum = rem + x + y;
//         rem = sum / DIVIDE;
//         curr.next = new ListNode(sum % 10);
//         curr = curr.next;
//         if(temp != null){
//             temp = temp.next;
//         }
//         if(other != null){
//             other = other.next;
//         }
//     }
//     if(rem > 0){
//         curr.next = new ListNode(rem);
//     }
//     return value.next;
// }


// Question 3: Given a string, find the length of the longest substring without repeating characters.

//Solution: HashMap
// public int lengthOfLongestSubstring(String s) {
//     int n = s.length(), ans = 0;
//     Map<Character, Integer> map = new HashMap<>(); // current index of character
//     // try to extend the range [i, j]
//     for (int j = 0, i = 0; j < n; j++) {
//         if (map.containsKey(s.charAt(j))) {
//             i = Math.max(map.get(s.charAt(j)), i);
//         }
//         ans = Math.max(ans, j - i + 1);
//         map.put(s.charAt(j), j + 1);
//     }
//     return ans;


// Question 4: Write a function that reverses a string. The input string is given as an array of characters char[].
// Do not allocate extra space for another array, you must do this by modifying the input array in-place with O(1) extra memory.

// Solution: Swapping elements in array recursive solution:

// public void reverseString(char[] s) {
//     helper(s, 0, s.length - 1);
//  }
 
//  private void helper(char[]s, int left, int right){
//      if(left >= right){
//          return;
//      }
//      char temp = s[left];
//      s[left] = s[right];
//      left++;
//      s[right] = temp;
//      right--;
//      helper(s, left, right);
//  }


// Question 5: Maximum Depth of Binary Tree
/*
Given a binary tree, find its maximum depth.

The maximum depth is the number of nodes along the longest path from the root node down to the farthest leaf node.

Note: A leaf is a node with no children.
*/

/*
Solution: 
public int maxDepth(TreeNode root) {
        if(root==null){
            return 0;
        }
        
        return Math.max(maxDepth(root.left),maxDepth(root.right))+1;
    }
*/
/*



Question 6:
Given a non-empty array of integers, every element appears twice except for one. Find that single one.
Note:Your algorithm should have a linear runtime complexity. Could you implement it without using extra memory?


Solution: Simple Math

 public int singleNumber(int[] nums) {
        int sumOfSet = 0;
        int sumOfNums = 0;
        Set<Integer> set = new HashSet<>();
        for(int num: nums){
            if(!set.contains(num)){
                set.add(num);
                sumOfSet += num;
            }
            sumOfNums += num;
        }
        return 2*sumOfSet - sumOfNums;
    }



















































*/



}