import java.util.*;

class Solution {
    public int maxProfit(int[] prices) {
        int i = 1;
        int j = 0;
        int x = prices[0];
        while (i < prices.length) {
            if (prices[i] < x) {
                if (i > 1) {
                    j += (x - prices[0]);
                }
                prices[0] = prices[i];
                x = prices[i];
            } else if (prices[i] > x) {
                x = prices[i];
                if (i == prices.length - 1) {
                    j += x - prices[0];
                }
            }
            i++;
        }

        return j;
    }

    public int trap(int[] height) {
        if (height.length <= 2) {
            return 0;
        } else if (height.length == 3) {
            return Math.min(height[0], height[2]) - height[1];
        }
        int mx_inx = 0;
        int qty = 0;
        while (mx_inx < height.length) {
            int old_mx_inx = mx_inx;
            int mx = 0;

            // get maxima
            // first overall maxima and then maxima from prev to last and repeat
            for (int i = mx_inx; i < height.length; i++) {
                if (height[i] >= mx) {
                    mx = height[i];
                    mx_inx = i;
                }
            }

            System.out.println(mx_inx);

            // get local maxima and add qty
            int cm = height[old_mx_inx];
            System.out.println(cm);

            for (int i = old_mx_inx + 1; i < mx_inx; i++) {
                if (cm > height[i]) {
                    qty += (cm - height[i]);
                } else {
                    cm = height[i];
                }
            }

            System.out.println(qty);
            System.out.println(cm);

            mx_inx++;
        }
        return qty;

    }

    public char findTheDifference(String s, String t) {
        HashMap<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < t.length(); i++) {
            char si = (i < s.length()) ? s.charAt(i) : ' ';
            char ti = t.charAt(i);
            if (si == ti) {
                continue;
            }
            if (si != ' ') {
                if (map.containsKey(si)) {
                    int val = map.get(si);
                    val++;
                    map.replace(si, val);
                } else {
                    map.putIfAbsent(si, 1);
                }
            }

            if (map.containsKey(ti)) {
                int val = map.get(ti);
                val--;
                map.replace(ti, val);
            } else {
                map.putIfAbsent(ti, -1);
            }
        }

        System.out.println(map.keySet());

        for (Map.Entry entry : map.entrySet()) {
            if (entry.getValue().equals(-1)) {
                return (char) entry.getKey();
            }
        }

        return ' ';
    }

    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char si = s.charAt(i);
            char ti = t.charAt(i);
            if (si == ti) {
                continue;
            }
            if (map.containsKey(si)) {
                map.replace(si, map.get(si) + 1);
            } else {
                map.put(s.charAt(i), 1);
            }

            if (map.containsKey(ti)) {
                map.replace(ti, map.get(ti) - 1);
            } else {
                map.put(ti, -1);
            }

            if (map.get(ti) == 0) {
                map.remove(ti);
            } 
            if (map.get(si) == 0) {
                map.remove(si);
            }
        }

        System.out.println(map);

        if (map.isEmpty()) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        int[] nums1 = { 6, 1, 3, 2, 4, 7 };
        System.out.println("answer : " + s.maxProfit(nums1));

        int[] height = { 4, 2, 3 };
        System.out.println("trap answer : " + s.trap(height));

        String a = "ymbgaraibkfmvocpizdydugvalagaivdbfsfbepeyccqfepzvtpyxtbadkhmwmoswrcxnargtlswqemafandgkmydtimuzvjwxvlfwlhvkrgcsithaqlcvrihrwqkpjdhgfgreqoxzfvhjzojhghfwbvpfzectwwhexthbsndovxejsntmjihchaotbgcysfdaojkjldprwyrnischrgmtvjcorypvopfmegizfkvudubnejzfqffvgdoxohuinkyygbdzmshvyqyhsozwvlhevfepdvafgkqpkmcsikfyxczcovrmwqxxbnhfzcjjcpgzjjfateajnnvlbwhyppdleahgaypxidkpwmfqwqyofwdqgxhjaxvyrzupfwesmxbjszolgwqvfiozofncbohduqgiswuiyddmwlwubetyaummenkdfptjczxemryuotrrymrfdxtrebpbjtpnuhsbnovhectpjhfhahbqrfbyxggobsweefcwxpqsspyssrmdhuelkkvyjxswjwofngpwfxvknkjviiavorwyfzlnktmfwxkvwkrwdcxjfzikdyswsuxegmhtnxjraqrdchaauazfhtklxsksbhwgjphgbasfnlwqwukprgvihntsyymdrfovaszjywuqygpvjtvlsvvqbvzsmgweiayhlubnbsitvfxawhfmfiatxvqrcwjshvovxknnxnyyfexqycrlyksderlqarqhkxyaqwlwoqcribumrqjtelhwdvaiysgjlvksrfvjlcaiwrirtkkxbwgicyhvakxgdjwnwmubkiazdjkfmotglclqndqjxethoutvjchjbkoasnnfbgrnycucfpeovruguzumgmgddqwjgdvaujhyqsqtoexmnfuluaqbxoofvotvfoiexbnprrxptchmlctzgqtkivsilwgwgvpidpvasurraqfkcmxhdapjrlrnkbklwkrvoaziznlpor",
                t = "qhxepbshlrhoecdaodgpousbzfcqjxulatciapuftffahhlmxbufgjuxstfjvljybfxnenlacmjqoymvamphpxnolwijwcecgwbcjhgdybfffwoygikvoecdggplfohemfypxfsvdrseyhmvkoovxhdvoavsqqbrsqrkqhbtmgwaurgisloqjixfwfvwtszcxwktkwesaxsmhsvlitegrlzkvfqoiiwxbzskzoewbkxtphapavbyvhzvgrrfriddnsrftfowhdanvhjvurhljmpxvpddxmzfgwwpkjrfgqptrmumoemhfpojnxzwlrxkcafvbhlwrapubhveattfifsmiounhqusvhywnxhwrgamgnesxmzliyzisqrwvkiyderyotxhwspqrrkeczjysfujvovsfcfouykcqyjoobfdgnlswfzjmyucaxuaslzwfnetekymrwbvponiaojdqnbmboldvvitamntwnyaeppjaohwkrisrlrgwcjqqgxeqerjrbapfzurcwxhcwzugcgnirkkrxdthtbmdqgvqxilllrsbwjhwqszrjtzyetwubdrlyakzxcveufvhqugyawvkivwonvmrgnchkzdysngqdibhkyboyftxcvvjoggecjsajbuqkjjxfvynrjsnvtfvgpgveycxidhhfauvjovmnbqgoxsafknluyimkczykwdgvqwlvvgdmufxdypwnajkncoynqticfetcdafvtqszuwfmrdggifokwmkgzuxnhncmnsstffqpqbplypapctctfhqpihavligbrutxmmygiyaklqtakdidvnvrjfteazeqmbgklrgrorudayokxptswwkcircwuhcavhdparjfkjypkyxhbgwxbkvpvrtzjaetahmxevmkhdfyidhrdeejapfbafwmdqjqszwnwzgclitdhlnkaiyldwkwwzvhyorgbysyjbxsspnjdewjxbhpsvj";
        System.out.println(s.findTheDifference(a, t));

        String a1 = "anagram", b1 = "nagaram";
        System.out.println(s.isAnagram(a1, b1));


    }
}