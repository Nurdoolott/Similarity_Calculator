import java.io.IOException;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        try {
            // Instantiate WordProcessor and SimilarityCalculator
            WordProcessor wordProcessor = new WordProcessor();
            SimilarityCalculator similarityCalculator = new SimilarityCalculator();

            // Read text from two different files
            wordProcessor.readFile("src/file1.txt");
            Set<String> set1 = wordProcessor.getDistinctWords();

            wordProcessor.readFile("src/file2.txt");
            Set<String> set2 = wordProcessor.getDistinctWords();

            // Calculate Jaccard similarity
            double similarity = similarityCalculator.calculateSimilarity(set1, set2);

            // Display the result
            System.out.println("Jaccard Similarity Coefficient: " + similarity);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
