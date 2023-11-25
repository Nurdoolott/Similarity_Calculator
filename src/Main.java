import java.io.IOException;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        try {

            WordProcessor wordProcessor = new WordProcessor();
            SimilarityCalculator similarityCalculator = new SimilarityCalculator();

            wordProcessor.readFile("src/file1.txt");
            Set<String> set1 = wordProcessor.getDistinctWords();

            wordProcessor.readFile("src/file2.txt");
            Set<String> set2 = wordProcessor.getDistinctWords();

            double similarity = similarityCalculator.calculateSimilarity(set1, set2);

            System.out.println("Qwerty Similarity Coefficient: " + similarity);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
