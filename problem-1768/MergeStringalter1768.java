// apbqcr
class MergeStringalter1768 {

    public String mergeAlternately(String word1, String word2) {
        StringBuilder result = new StringBuilder();
        int i = 0, j = 0;
        while (i < word1.length() && j < word2.length()) {
            result.append(word1.charAt(i));
            result.append(word2.charAt(j));
            i++;
            j++;
        }
        while (i < word1.length()) {
            result.append(word1.charAt(i));
            i++;
        }
        while (j < word2.length()) {
            result.append(word2.charAt(j));
            j++;
        }
        return result.toString();

    }

    public static void main(String[] args) {
        MergeStringalter1768 obj = new MergeStringalter1768();
        String word1 = "abc";
        String word2 = "pqr";
        String result = obj.mergeAlternately(word1, word2);
        System.out.println(result);

    }
}
