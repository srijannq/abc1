public class Question3 {
    public static void main(String[] args) {
        int mostFrequent = 0;
        int secondMostFrequent = 0;
        char mostChar = ' ';
        char secondString = ' ';
        String s = "aaaabbbbbccccccddddddddd";
        int[] freq = new int[128];
        for(char ch:s.toCharArray()){
            freq[ch]++;
        }
        for (int i=0;i<freq.length;i++){
//            if(freq[i]>0){
//                System.out.println((char) i + " " + "Count:"+freq[i]);
//            }
            if(freq[i]>mostFrequent){
                if ((char)i != mostChar){
                    secondMostFrequent = mostFrequent;

                    secondString = mostChar;

                }
                mostFrequent = freq[i];
                mostChar = (char)i;


//                secondString = String.valueOf((char)i);
            }
            if(freq[i]<mostFrequent && freq[i]>secondMostFrequent){
                secondMostFrequent = freq[i];
                secondString = (char)i;

            }
//            else{
//                secondMostFrequent = mostFrequent;
//                secondString = String.valueOf((char)secondMostFrequent);
//            }

        }
        System.out.println("Second most frequent character is:"+secondString+" with count of: "+secondMostFrequent);
    }
}
