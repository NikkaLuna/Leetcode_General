
public public class Solution {
    
    public List<List<Integer>> generate(int numRows) {
        
        List<List<Integer>> triangle = new ArrayList<>();

        for (int i = 0; i < numRows; i++) {

            List<Integer> row = new ArrayList<>();

            for (int j = 0; j <= i; j++) {

                // The first and last elements of each row are always 1
                if (j == 0 || j == i) {
                    row.add(1);

                } else {
                    // For other elements, the value is the sum of the two elements directly above it
                    row.add(triangle.get(i - 1).get(j - 1) + triangle.get(i - 1).get(j));
                }
            }
            triangle.add(row);
        }

        return triangle;
    }
}

    
 