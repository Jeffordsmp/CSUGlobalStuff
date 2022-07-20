#include <iostream>
using namespace std;

int main()
{   
    int arr[3] = {10, 20, 30};
    int *p = &arr[0];
    p += 2;
    int x = *p;

    cout << "p " << p << endl; //p 0x3089d0a34
    cout << "x " << x << endl; //x 30
}