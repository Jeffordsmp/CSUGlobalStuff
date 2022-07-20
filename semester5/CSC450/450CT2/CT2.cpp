#include <iostream>
#include <string>
using namespace std;

int main(){
    string mystr;

    for (int i = 1; i < 4; i++){
        cout << "Enter String " << i << "\n";
        getline (cin, mystr);
        reverse(mystr.begin(), mystr.end());
        cout << "Your Reversed String is " << mystr << "\n";
    }
    return 0;
}