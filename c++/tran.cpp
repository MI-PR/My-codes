#include<iostream>

using namespace std;

class mat
{
    private :
    int r,c,i,j,a[5][5],p[5][5];

    public :

    void getm()
    {
        cout<<"Taking matrix row and column"<<endl;

        cin>>r>>c;

        this->a[r][c];
        this->p[c][r];

        for (i = 0; i < r; i++)
        {
            for ( j = 0; j < c; j++)
            {
                cin>>a[i][j];
            }
            
        }

        for (i = 0; i < r; i++)
        {
            for ( j = 0; j < c; j++)
            {
                cout<<a[i][j]<<"\t";
            }
            cout<<endl;
            
        }
        

    }

    void operator ++ ()
    {
        for (i = 0; i < r; i++)
        {
            for ( j = 0; j < c; j++)
            {
                p[j][i] = a[i][j];
            }
            
        }
        for (i = 0; i < c; i++)
        {
            for ( j = 0; j < r; j++)
            {
                cout<<p[i][j]<<"\t";
            }
            cout<<endl;
            
        }
    }
};

int main()
{
    mat b;
    b.getm();
    ++b;
    #ifdef _WIN32
    system("pause");
    #endif

    return 0;
}
