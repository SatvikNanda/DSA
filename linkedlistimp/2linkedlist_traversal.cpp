// we will traverse all the elements of the linked list and print them

#include <bits/stdc++.h> // using all the header files

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


//Iterative approach
void printList(Node *head)
{
    Node *curr = head;// we make to a temporary node and assign it to head node 

    while (curr != NULL) // traversing till the last node
    {
        cout << curr -> data << " "; // printing the data inside the node

        curr = curr -> next; // moving on the next node
    }
    

}

//Recursive approach
void recursivePrint(Node *head)
{
    if(head == NULL)
    {
        return;
    }

    cout << head -> data << " ";
    recursivePrint(head -> next);
}

int main()
{
    Node *head = new Node(10);
    head -> next = new Node(20);
    head -> next -> next = new Node(30);
    head -> next -> next -> next = new Node(40); // we made 4 elements in the linked list

    printList(head);
    
    cout << endl;
    
    recursivePrint(head);

    return 0;
}

