public class PatternSearching {
    public static void main(String[] args) {
//        patSearch("Geeks for Geeks","Geeks");
        numAfterDecimal("12.53280");

    }
    static void patSearch(String txt,String pat){

        int pos=txt.indexOf(pat);
        while(pos>=0){
            System.out.print(pos+" ");
            pos=txt.indexOf(pat,pos+1);
        }
    }
    static void numAfterDecimal(String s){
        int pos=s.indexOf('.');
        if(pos<0)
            return;
        System.out.println(s.substring(pos+1));
    }
}
