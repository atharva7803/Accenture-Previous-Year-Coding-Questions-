/*

Print first K words
Example

Input: "Hello I am a passionate developer"     
    k: 3
Output:Hello I am
*/

#include<iostream>
using namespace std;

void firstKwords(string s, int k){
    for(char ch : s){
        if(ch == ' '){
            k--;
            if(k == 0)  break;
        }
        cout<<ch;
    }
}

int main(){
    string s;
    int k;

    cout<<"Enter string: "<<endl;
    getline(cin,s);

    cout<<"Enter value of k: "<<endl;
    cin>>k;

    firstKwords(s,k);
}