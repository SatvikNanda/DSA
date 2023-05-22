// inserting an element at the end of the linked list

#include <bits/stdc++.h>

using namespace std;

struct Node
{
    int data;
    Node *next;

    Node(int x)
    {
        data = x;
        next = NULL;
    }
};

void insertEnd(Node *&head, int x)
{
    Node *temp = new Node(x);

    if(head == NULL)
    {
        head = temp;
    }

    Node *curr = head;

    while (curr -> next != NULL)
    {
        curr = curr -> next;
    }
    curr -> next = temp;
    

}

void display(Node *head)
{
    if(head == NULL)
    {
        cout << "NULL" << endl;
    }
    else
    {
        cout << head -> data << " ";
        display(head -> next);

    }
    //return 0;
}

int main()
{
    int n;

    cin >> n; // taking the number of inputs
    
    Node *head = NULL; // initialise the first element as null
    Node *p,*prev;

    for(int i = 0; i < n; i++)
    {
        int data;
        cin >> data;
        p = new Node(data);
        p -> next = NULL;

        if(head == NULL)
        {
            head = p;
        }
        else
        {
            prev -> next = p;
        }
        prev = p;
    }

    int x;
    cin >> x;

    display(head);

    insertEnd(head,x);
    display(head);

    


    return 0;
}