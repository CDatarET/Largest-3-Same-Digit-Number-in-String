class Solution {
    public String largestGoodInteger(String num) {
        String ret = "";
        for(int i = 0; i < num.length() - 2; i++){
            if(num.charAt(i) == num.charAt(i + 1) && num.charAt(i) == num.charAt(i + 2)){
                if(ret.length() == 0 || ret.charAt(0) < num.charAt(i)){
                    ret = String.valueOf(num.charAt(i)).repeat(3);
                }
            }
        }

        return ret;
    }
}
