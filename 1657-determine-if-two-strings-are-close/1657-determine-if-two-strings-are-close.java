class Solution {
public boolean closeStrings(String str1, String str2) {
int[] count1 = new int[26];
int[] count2 = new int[26];

        Set<Character> set1 = new HashSet<>();
        Set<Character> set2 = new HashSet<>();

        char[] ch1 = str1.toCharArray();
        char[] ch2 = str2.toCharArray();

        for(int i=0; i<ch1.length; i++ ){
              char c = ch1[i];
              count1[c-'a']++;
              set1.add(c);

        }
        for(int i=0; i<ch2.length; i++ ){
              char c = ch2[i];
              count2[c-'a']++;
              set2.add(c);

        }
        Arrays.sort(count1);
        Arrays.sort(count2);
        return set1.equals(set2) && Arrays.equals(count1, count2);
}
}