#include <iostream>
#include <iomanip>      
using namespace std;

int main()
{   
    double hours;
    double pay;
    double overTime;

    cout << "Enter Standard Hours Worked This week: ";
    while(!(cin >> hours)){
        cin.clear();
        cin.ignore(numeric_limits<streamsize>::max(), '\n');
        cout << "Invalid input.  Try again: ";
    }

    cout << "Enter your Rate of Pay: ";
    while(!(cin >> pay)){
        cin.clear();
        cin.ignore(numeric_limits<streamsize>::max(), '\n');
        cout << "Invalid input.  Try again: ";
    }

    cout << "Enter Overtime Hours worked. If none enter '0': ";
    while(!(cin >> overTime)){
        cin.clear();
        cin.ignore(numeric_limits<streamsize>::max(), '\n');
        cout << "Invalid input.  Try again: ";
    }
    
    double *p1 = &hours;
    double *p2 = &pay;
    double *p3 = &overTime;
    double total;

    total = (*p1 * *p2) + (*p3 * (*p2 * 1.50));
    
    cout << "You Earn " << setprecision(2) << fixed << *p2 << " Dollars Per Hour!" << endl;
    cout << "You Worked For " << setprecision(1) << fixed << *p1 << " hours this week!" << endl;
    cout << "You Had " << setprecision(1) << fixed << *p3 << " hours of Overtime week!" << endl;
    cout << "Your Total Paychek this week is " << setprecision(2) << fixed << total << " Dollars!"  << endl;

    p1 = NULL;
    delete p1;
    p2 = NULL;
    delete p2;
    p3 = NULL;
    delete p3;
}