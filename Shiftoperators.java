 public class Shiftoperators {
    public static void main(String[] args) {
        int num = 16;  // Example number

        // Left Shift Operator (<<)
        int leftShiftResult = num << 2;  // Shift bits of 16 to the left by 2 positions
        System.out.println("Original number: " + num);
        System.out.println("After left shift (<<) by 2: " + leftShiftResult);

        // Right Shift Operator (>>)
        int rightShiftResult = num >> 2;  // Shift bits of 16 to the right by 2 positions
        System.out.println("After right shift (>>) by 2: " + rightShiftResult);
        
        // Right Shift with Negative Number
        int negativeNum = -16;
        int rightShiftNegativeResult = negativeNum >> 2;  // Shift bits of -16 to the right by 2 positions
        System.out.println("Original negative number: " + negativeNum);
        System.out.println("After right shift (>>) by 2 on negative number: " + rightShiftNegativeResult);
    }
}
 
