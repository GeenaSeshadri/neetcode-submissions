class Solution {
public:
    string removedot(string &localname){
        string newstr = "";
        for(char c : localname){
            if(c!='.'){
                newstr += c;
            }
        }
        return newstr;
    }

    int numUniqueEmails(vector<string>& emails) {
        unordered_map<string, int> hashmap;
        for(int i = 0 ; i < emails.size() ; i++){
            string curr = emails[i];
            string temp = "";
            char del = '@';
            int atpos = curr.find(del);
            string localname = curr.substr(0, atpos);
            string domain = curr.substr(atpos, curr.size());
            char dot = '.';
            char plus = '+';
            if(localname.find(plus)!=string::npos){
                int index = localname.find(plus);
                localname = localname.substr(0, index);
            }
            if(localname.find(dot)!=string::npos){
                localname = removedot(localname);
            }
            temp = localname+'@'+domain;
            cout<<temp<<endl;
            hashmap[temp]++;
        }
        int result = hashmap.size(); 
        return result;    
    }
};