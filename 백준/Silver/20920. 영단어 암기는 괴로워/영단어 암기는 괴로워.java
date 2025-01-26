import java.util.*;
import java.io.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        HashMap<String, Integer> word = new HashMap<>();

        for (int i = 0; i < N; i++) {
            String S = br.readLine();
            if (S.length() >= M) {
                word.put(S, word.getOrDefault(S, 0) + 1);
            }
        }

        List<String> words = word.keySet().stream().collect(Collectors.toList());

        words.sort((key1, key2) -> {
            int freqCompare = word.get(key2).compareTo(word.get(key1));
            if (freqCompare != 0) {
                return freqCompare;
            }
            int lengthCompare = Integer.compare(key2.length(), key1.length());
            if (lengthCompare != 0) {
                return lengthCompare;
            }
            return key1.compareTo(key2);
        });

        StringBuilder sb = new StringBuilder();
        for (String wordKey : words) {
            sb.append(wordKey).append("\n");
        }

        System.out.println(sb);
    }
}