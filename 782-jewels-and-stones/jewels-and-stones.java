
import java.util.HashMap;

class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        HashMap<Character, Integer> hm = new HashMap<>();
        int count = 0;

        for (int i = 0; i < jewels.length(); i++) {
            hm.put(jewels.charAt(i), 1);
        }

        for (int j = 0; j < stones.length(); j++) {
            if (hm.containsKey(stones.charAt(j))) {
                count++;
            }
        }

        return count;
    }
}