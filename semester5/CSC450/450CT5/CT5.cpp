#include <iostream>
#include <fstream>
using namespace std;

int append(string x) {
    string filename("CSC450_CT5_mod5.txt");
    ofstream myFile;
    try
    {
        myFile.open(filename, std::ios_base::app);
    }
    catch(const std::exception& e)
    {
        cout << "Something Went Wrong" << endl;
        return 0;
    }
    
    myFile << x << endl;
    cout << "Your String was appened to CSC450_CT5_mod5.txt" << endl;
    myFile.close();

    return 0;
}

int backwardsFile(){
    ifstream readFile("CSC450_CT5_mod5.txt");
    ofstream writeFile("CSC450-mod5-reverse.txt");
    string x;

    while (getline (readFile, x)) {
        reverse(x.begin(), x.end());;
        writeFile << x << "\n";
    }
    cout << "Check CSC450-mod5-reverse.txt to see all the strings reversed!" << endl;
    readFile.close();
    writeFile.close();

    return 0;
}

int main()
{
    string input;
    cout << "Enter a String: ";
    getline (cin, input);
    append(input);
    backwardsFile();
    return 0;
}