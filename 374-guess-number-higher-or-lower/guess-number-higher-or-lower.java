/** 
 * Forward declaration of guess API.
 * @param  num   your guess
 * @return 	     -1 if num is higher than the picked number
 *			      1 if num is lower than the picked number
 *               otherwise return 0
 * int guess(int num);
 */

public class Solution extends GuessGame {
    public int guessNumber(int n) {

        int max=n;
        int min=1;

        while(min<=max){
            int mid=min+(max-min)/2;
            int c= guess(mid);

            if(c==-1){
                max=mid-1;
            }else if(c==1){
                min=mid+1;
            }else{
                return mid;
            }
        }

        return -1;

        
        
    }
}