//{ Driver Code Starts
#include <bits/stdc++.h>
using namespace std;


// } Driver Code Ends


#include <stack>
#include <unordered_map>
using namespace std;

class Solution {
  public:
    bool isBalanced(string& s) {
        stack<char> stk;
        unordered_map<char, char> bracketPairs = {
            {')', '('},
            {']', '['},
            {'}', '{'}
        };

        for (char ch : s) {
            if (ch == '(' || ch == '{' || ch == '[') {
                stk.push(ch);
            } else {
                if (stk.empty() || stk.top() != bracketPairs[ch]) {
                    return false;
                }
                stk.pop();
            }
        }

        return stk.empty();
    }
};



//{ Driver Code Starts.

int main() {
    int t;
    string a;
    cin >> t;
    while (t--) {
        cin >> a;
        Solution obj;
        if (obj.isBalanced(a))
            cout << "true" << endl;
        else
            cout << "false" << endl;

        cout << "~"
             << "\n";
    }
}
// } Driver Code Ends