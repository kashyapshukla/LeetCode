class Solution {
    public String reverseWords(String s) 
    {
        //arraylist add all the tem string the return the revers of that array list



        List<String> l= new ArrayList<>();
        String t="";
        for( int i=0;i<s.length();i++){

            if(s.charAt(i)!=' '){
                t=t+s.charAt(i);

            }
            else{
                if(t!=""){
                    l.add(t);
                    t="";
                }
            }
            if(i==s.length()-1){
                if(t!=""){
                    l.add(t);
                    t="";
                }
            }
        }
        t="";
        for( int i=l.size()-1;i>=0;i--){
            if(i==0){
                t=t+l.get(i);
            }
            else{
                t=t+l.get(i)+" ";
            }
           
        }
        return t;
    }
}