class Solution {
public:
    string largestGoodInteger(string num) {
        string ret = "";
        for(int i = 0; i < num.size() - 2; i++){
            if(num[i] == num[i + 1] && num[i] == num[i + 2]){
                if(ret.size() == 0 || ret[0] < num[i]){
                    ret = "";
                    ret += num[i];
                    ret += num[i];
                    ret += num[i];
                }
            }
        }

        return ret;
    }
};
