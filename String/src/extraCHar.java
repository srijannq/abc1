public class extraCHar {
    public static void main(String[] args) {
        System.out.println(extraCharFind("abba","baxab"));

    }
    static char extraCharFind(String s1,String s2){
        int[] visited=new int[26];
        String small="";
        String large="";

        if(s1.length()>s2.length()){
            small=s2;
            large=s1;
        }
        else{
            small=s1;
            large=s2;

        }
        for(int i=0;i<small.length();i++){
            visited[small.charAt(i)-'a']--;
            visited[large.charAt(i)-'a']++;
        }
        visited[large.charAt(large.length()-1)-'a']++;
        for(int i=0;i<26;i++){
            if(visited[i]==1)
                return (char)(i+'a');
        }
        return 0;
    }
}
