#include<iostream>
using namespace std;

bool v=false,x;

class date
{
    int d,m,y;

    public: void read()
    {
        cin>>d>>m>>y;
    }

    bool cyear()
    {
        if(y%4==0)
        {
            v=true;
        }
        return v;
    }

    void cday()
    {
        if(m==1||m==3||m==5||m==7||m==8||m==10||m==12)
        {
            if(d>0 && d<32)
            {
                v=true;
            }
        }

        else if(m==4||m==6||m==9||m==11)
        {
            if(d>0 && d<31)
            {
                v=true;
            }
        }

        else if(m==2)
        {
            x=cyear();

            if(x=true)
            {
                if(d>0 && d<30)
                {
                    v=true;
                }

                else if(d>0 && d<29)
                {
                    v=true;
                }
            }
        }
    }
};

int main()
{
    int d,m,y;
    cout<<"Enter a date";
    cin>>d>>m>>y;
}