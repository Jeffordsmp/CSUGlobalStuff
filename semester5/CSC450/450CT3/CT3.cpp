#include <iostream>
using namespace std;

int main()
{   
    int num1, num2, num3;
    cout << "Type number 1: " << endl;
    cin >> num1;
    cout << "Type number 2: " << endl;
    cin >> num2;
    cout << "Type number 3: " << endl;
    cin >> num3;

    int *p1 = &num1;
    int *p2 = &num2;
    int *p3 = &num3;

    cout << "The Number " << *p1 << " is stored at: " << p1 << endl;
    cout << "The Number " << *p2 << " is stored at: " << p2 << endl;
    cout << "The Number " << *p3 << " is stored at: " << p3 << endl;
}