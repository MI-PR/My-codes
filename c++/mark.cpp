/*#include <iostream>
#include <string.h>
#include <iomanip>
using namespace std;

int n, i, j;

class stud
{

public:
    char name[20];
    int roll;
};

class exam : public stud
{
protected:
    int a[6];
};

class result : public exam
{

public:
    float total, avg;
    void getdata()
    {

        cout << "Enter your name, roll and marks in 6 subjects" << endl;
        cin >> name >> roll;
        for (int i = 0; i < 6; i++)
        {
            cin >> a[i];
        }
    }

    void calc()
    {
        total = 0;
        for (int i = 0; i < 6; i++)
        {
            total = total + a[i];
        }
        avg = total / 6.0;
    }

    void display()
    {
        cout << setw(20) << "Name" << setw(5) << "Roll" << setw(5)
             << setw(5) << "M1" << setw(5)
             << setw(5) << "M2" << setw(5)
             << setw(5) << "M3" << setw(5)
             << setw(5) << "M4" << setw(5)
             << setw(5) << "M5" << setw(5)
             << setw(5) << "M6" << setw(5)
             << setw(5) << "Total" << setw(5)
             << setw(5) << "Average" << endl;

        cout << setw(20) << name << setw(5) << roll << setw(5)
             << setw(5) << a[1] << setw(5)
             << setw(5) << a[2] << setw(5)
             << setw(5) << a[3] << setw(5)
             << setw(5) << a[4] << setw(5)
             << setw(5) << a[5] << setw(5)
             << setw(5) << a[6] << setw(5)
             << setw(5) << total << setw(5)
             << setw(5) << avg << endl;
    }
};

int main()
{

    cout << "Enter the no of students" << endl;
    cin >> n;

    result a[n];

    for (int i = 0; i < n; i++)
    {
        a[i].getdata();
        a[i].calc();
    }

    int o, q[n];
    bool x = false;
    do
    {
        cout << "Enter the method for showing marks\n1.Name\n2.Mark\n3.Exit";
        cin >> o;
        switch (o)
        {
        case 1:
            for (int i = 0; i < n; i++)
            {
                for (int j = 0; j < n; j++)
                {
                    if ((strcmp(a[j].name, a[j + 1].name)) > 0)
                    {
                        q[i] = j;
                    }
                }
            }
            for (i = 0; i < n; i++)
            {
                a[q[i]].display();
            }
            break;

        case 2:
            for (int i = 0; i < n; i++)
            {
                for (int j = 0; j < n; j++)
                {
                    if (a[j].total > a[j + 1].total)
                    {
                        q[i] = j;
                    }
                }
            }
            for (i = 0; i < n; i++)
            {
                a[q[i]].display();
            }
            break;

        case 3:
            x == true;
            break;

        default:
            cout << "Invalid Option";
            break;
        }
    } while (x == true);

#ifdef _WIN32
    system("pause");
#endif

    return 0;
}*/

#include<iostream>
#include<string.h>
#include<iomanip>

using namespace std;

class stud
{
public:
    char name[20];
    int roll;
};

class exam : public stud
{
protected:
    int a[6];
};

class result : public exam
{
public:
    float total, avg;

    void getdata()
    {
        cout << "Enter your name, roll and marks in 6 subjects" << endl;
        cin >> name >> roll;
        for (int i = 0; i < 6; i++)
        {
            cin >> a[i];
        }
    }

    void calc()
    {
        total = 0;
        for (int i = 0; i < 6; i++)
        {
            total = total + a[i];
        }
        avg = total / 6.0;
    }

    void display()
    {
        

        cout <<"|"<< setw(10) << name << setw(5) << roll << setw(5)
             << setw(5) << a[0] << setw(5)
             << setw(5) << a[1] << setw(5)
             << setw(5) << a[2] << setw(5)
             << setw(5) << a[3] << setw(5)
             << setw(5) << a[4] << setw(5)
             << setw(5) << a[5] << setw(5)
             << setw(5) << total << setw(5)
             << setw(5) << avg <<"|"<< endl;
    }
};

int main()
{
    int n;

    cout << "Enter the no of students" << endl;
    cin >> n;

    result a[100]; // Assuming a maximum of 100 students

    for (int i = 0; i < n; i++)
    {
        a[i].getdata();
        a[i].calc();
    }

    int o, q[100];
    bool x = false;
    do
    {
        cout << "Enter the method for showing marks\n1.Name\n2.Mark\n3.Exit";
        cin >> o;
        switch (o)
        {
        case 1:
            for (int i = 0; i < n; i++)
            {
                for (int j = 0; j < n - 1; j++)
                {
                    if (strcmp(a[j].name, a[j + 1].name) > 0)
                    {
                        swap(a[j], a[j + 1]);
                    }
                }
            }
            cout <<"|"<< setw(10) << "Name" << setw(5) << "Roll" << setw(5)
             << setw(5) << "M1" << setw(5)
             << setw(5) << "M2" << setw(5)
             << setw(5) << "M3" << setw(5)
             << setw(5) << "M4" << setw(5)
             << setw(5) << "M5" << setw(5)
             << setw(5) << "M6" << setw(5)
             << setw(5) << "Total" << setw(5)
             << setw(5) << "Average" <<"|"<< endl;
             for (int i = 0; i < 95; i++)
             {
                cout<<"-";
             }
             cout<<endl;
             
            for (int i = 0; i < n; i++)
            {
                a[i].display();
            }
            break;

        case 2:
            for (int i = 0; i < n; i++)
            {
                for (int j = 0; j < n - 1; j++)
                {
                    if (a[j].total > a[j + 1].total)
                    {
                        swap(a[j], a[j + 1]);
                    }
                }
            }
            cout << setw(10) << "Name" << setw(5) << "Roll" << setw(5)
             << setw(5) << "M1" << setw(5)
             << setw(5) << "M2" << setw(5)
             << setw(5) << "M3" << setw(5)
             << setw(5) << "M4" << setw(5)
             << setw(5) << "M5" << setw(5)
             << setw(5) << "M6" << setw(5)
             << setw(5) << "Total" << setw(5)
             << setw(5) << "Average" << endl;
             for (int i = 0; i < 95; i++)
             {
                cout<<"-";
             }
             cout<<endl;
            for (int i = 0; i < n; i++)
            {
                a[i].display();
            }
            break;

        case 3:
            x = true;
            break;

        default:
            cout << "Invalid Option" << endl;
            break;
        }
    } while (x == false);

    return 0;
}
