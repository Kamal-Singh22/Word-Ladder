import java.util.*;

public class WordLadder {
    public int ladderLength(String beginWord, String endWord, List<String> wordList) {
        
        Set<String> wordSet = new HashSet<>(wordList);
        if (!wordSet.contains(endWord)) {
            return 0; 
        }

        Queue<String> queue = new LinkedList<>();
        queue.add(beginWord);

        int level = 1;

        while (!queue.isEmpty()) {
            int size = queue.size();

            
            for (int i = 0; i < size; i++) {
                String currentWord = queue.poll();

               
                for (int j = 0; j < currentWord.length(); j++) {
                    char[] wordArray = currentWord.toCharArray();

                    for (char c = 'a'; c <= 'z'; c++) {
                        wordArray[j] = c;
                        String transformedWord = new String(wordArray);

                       
                        if (transformedWord.equals(endWord)) {
                            return level + 1;
                        }

                       
                        if (wordSet.contains(transformedWord)) {
                            queue.add(transformedWord);
                            wordSet.remove(transformedWord); 
                        }
                    }
                }
            }

            level++; 
        }

        return 0; 
    }

    public static void main(String[] args) {
        WordLadder wordLadder = new WordLadder();

        String beginWord = "hit";
        String endWord = "cog";
        List<String> wordList = Arrays.asList("hot", "dot", "dog", "lot", "log", "cog");

        int result = wordLadder.ladderLength(beginWord, endWord, wordList);
        System.out.println("Shortest transformation sequence length: " + result);
    }
}
