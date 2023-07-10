class smallestpositivemissingnumber {
    static int missingNumber(int arr[], int size) {
        boolean[] present = new boolean[size + 1];

        // Mark presence of positive numbers
        for (int num : arr) {
            if (num > 0 && num <= size) {
                present[num] = true;
            }
        }

        // Find the smallest missing number
        for (int i = 1; i <= size; i++) {
            if (!present[i]) {
                return i;
            }
        }

        // If no missing number found, return size + 1
        return size + 1;
    }
}


