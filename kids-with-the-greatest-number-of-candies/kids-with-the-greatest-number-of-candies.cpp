class Solution {
public:
    vector<bool> kidsWithCandies(vector<int>& candies, int extraCandies) {
        // Find the largest number
        int currentbiggestnumber = candies[0];
        vector<bool> x;
        for (int i = 0; i < candies.size(); i++)
        {
            if (currentbiggestnumber >= candies[i])
            {
                continue;
            }
            if (currentbiggestnumber < candies[i])
            {
                currentbiggestnumber = candies[i];
            }
        }
        for (int i = 0; i < candies.size(); i++)
        {
            if (candies[i] + extraCandies >= currentbiggestnumber)
            {
                x.push_back(true);
            }
            else
            {
                x.push_back(false);
            }
        }
        
        return x;
    } 
   
};