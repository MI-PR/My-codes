#include <iostream>

using namespace std;

int main()
{
    int a, b, i = 1;
    char o;

    cout << "Enter a no\n";
                    cin >> a;
                    cout << "Enter operator to use + - / *";
                    cin >> o;
                    cout << "Enter a no\n";
                    cin >> b;

                    switch (o)
                    {
                    case '+':
                        cout << a + b;
                        break;
                    case '-':
                        cout << a - b;
                        break;
                    case '*':
                        cout << a * b;
                        break;
                    case '/':
                        cout << a / b;
                        break;
                    default:
                        cout << "Invalid";
                        break;
    }

    return 0;
}
