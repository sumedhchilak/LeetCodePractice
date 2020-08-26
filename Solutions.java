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
}