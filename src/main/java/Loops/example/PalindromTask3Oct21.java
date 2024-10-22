package Loops.example;

public class PalindromTask3Oct21 {
         public static void main(String[] args) {
            String[] testStrings = {"racecar", "hello", "A man a plan a canal Panama", "Java"};

            for (String str : testStrings) {
                System.out.println("\"" + str + "\" is palindrome: " + isPalindrome(str));
            }
        }

        public static boolean isPalindrome(String str) {
            // Remove non-alphanumeric characters and convert to lowercase
            str = str.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

            int left = 0;
            int right = str.length() - 1;

            while (left < right) {
                if (str.charAt(left) != str.charAt(right)) {
                    return false;
                }
                left++;
                right--;
            }

            return true;
        }
    }
