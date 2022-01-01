class Solution {
public:
    string defangIPaddr(string address)
    {
        
        string ip;
        for (int i = 0; i < address.length(); i++)
        {
            if (address[i] == '.')
            {
                ip = ip + "[.]";
            }
                else
                    ip = ip + address[i];
        }
        return ip;
    }
    
};