#include <iostream>
#include <thread>

using namespace std;

void countUp() {
    for (int i = 0; i < 21; i++) {
        cout << "T1: " << i << endl;
    }
}

void countDown() {
    for (int i = 20; i > -1; i--) {
        cout << "T2: " << i << endl;
    }
}


int main() {
    thread t1(countUp);
    t1.join();

    thread t2(countDown);
    t2.join();

    return 0;
}