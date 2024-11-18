class Solution {
    public List<String> letterCombinations(String digits) {

        List<String> ans=new ArrayList<>();
        String output="";
        String[] Mapping={"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
        int index=0;
        if(digits.length()==0){
            return ans;
        }
        
        helper(digits,ans,output,Mapping,index);
        return ans;
        
    }


    private void helper(String digits, List<String> ans, String output, String[] Mapping, int index){
        if(index>=digits.length()){
            ans.add(output);
            return;
        }

        int number= digits.charAt(index)-'0';
        String value=Mapping[number];

        for(int i=0; i<value.length();i++){
            String t=output;
            output=output+value.charAt(i);
            helper(digits,ans,output,Mapping,index+1);
            output=t;
            
        }

        
    }
}