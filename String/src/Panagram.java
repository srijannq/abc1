public class Panagram {
    public static void main(String[] args) {
        System.out.println(panagramCheck("xyz abc rot"));

    }
    static boolean panagramCheck(String s){
        int n=s.length();
        if(n<26)
            return false;
        boolean[] visited=new boolean[26];
        for(int i=0;i<n;i++){
            char x=s.charAt(i);
            if(x>='a' && x<='z')
                visited[x-'a']=true;
            else if(x>='A' && x<='B')
                visited[x-'A']=true;

        }
        for(int i=0;i<visited.length;i++){
        if (!visited[i])
                return false;
        }
        return true;
    }
}
