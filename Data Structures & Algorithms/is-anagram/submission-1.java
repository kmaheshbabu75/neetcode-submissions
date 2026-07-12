// class Solution {
//     public boolean isAnagram(String s, String t) {

//         if (s.length() != t.length()) {
//             return false;
//         }

//         int[] charCounts = new int[26];

//         for (int i = 0; i < s.length(); i++) {
//             charCounts[s.charAt(i) - 'a']++;
//             charCounts[t.charAt(i) - 'a']--;
//         }   

//         for (int count : charCounts) {
//             if (count != 0) {
//                 return false;
//             }
//         }
        
//         return true;
//     }
// }
class Solution {
    public boolean isAnagram(String s, String t) {
        char[] arr1 = s.toCharArray();
        char[] arr2 = t.toCharArray();

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        return Arrays.equals(arr1, arr2);
    }
}
