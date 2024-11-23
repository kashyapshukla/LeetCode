class Solution {
    public int minimumBuckets(String hamsters) {
        
        Set<Integer> st=new HashSet<>();

        int count=0;
        if(!hamsters.contains(".")) return -1;


        for(int i=0;i<hamsters.length();i++){

            if(hamsters.charAt(i)=='H'){
                if((i==0 && hamsters.charAt(i+1)=='H') || (i==hamsters.length()-1 && hamsters.charAt(i-1)=='H')){
                    return -1;
                }
                if((i>0 && i<hamsters.length()-1 && hamsters.charAt(i+1)=='H' && hamsters.charAt(i-1)=='H')){
                    return -1;
                }
            }else if(i>0 && i<hamsters.length()-1 && hamsters.charAt(i+1)=='H' && hamsters.charAt(i-1)=='H' && !st.contains(i-1) && !st.contains(i+1)){
                st.add(i+1);
                st.add(i-1);
                count++;
            }
        }

        for(int i=0;i<hamsters.length();i++){
            if(hamsters.charAt(i)=='H' && !st.contains(i)){
                count++;
            }
        }



        return count;
    }
}