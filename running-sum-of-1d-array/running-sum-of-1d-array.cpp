class Solution {
public:
    vector<int> runningSum(vector<int>& nums)
    {
        vector<int> sum = {0};
        for (int i = 0; i < nums.size(); i++)
        {
            sum.push_back(nums[i] + sum[i]);
        }
        sum.erase(sum.begin());
        return sum;
    }
};