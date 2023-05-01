// 1. insert beg
// 2. insert end
// 3. delete end
// 4. delete beg
// 5. insertion after target


// Create Linked list using structures. First Element of the Linked List must have header
// name "List". Perform insertion in the end of the list(as Last element). 

// INPUT: 1. NUMBER OF ELEMENTS     2. ELEMENTS TO BE INSERTED      3. ELEMENT TO BE INSERTED AT LAST NODE

#include<stdio.h>
#include<stdlib.h>

// step:1 make structure node
struct node // a structure named node is created
{
    int data;
    struct node *next; // the structure contains a variable integer and a pointer next. 
};

struct node *head=NULL;
// step 2: display elements before insertion
void display(struct node *head) // a function is used to display initial elements. First node of list is known as 'head' according to question
{
    if (head == NULL)
    {
        printf("NULL");
    }

    else
    {
        printf("%d->", head -> data);
        display(head -> next);
    }

    /*struct node *l;
    for(l=head;l->next!=NULL; l=l->next)
    printf("%d->",l->data);
    printf("%d->NULL",l->data);
    */
}
struct node *p; // since p is used in 2 different structures we

// step:3 make function to insert elements in the end
void end(struct node **head, int value) 
{
    struct node *q;
    
    p = malloc(sizeof(struct node));
    p -> data = value;
    p -> next = NULL;

    q = *head;


    while (q ->next != NULL)    
    {
        q = q ->next;
    }
    
    q ->next = p;
}

// step:4 make main function
int main()
{
    struct node *prev,*head;
    int N,i,X;

    scanf("%d", &N);

    head = NULL;



    
    for (i = 0; i < N; i++) 
    {
        p = malloc(sizeof(struct node));

        scanf("%d", &p ->data);

        p ->next = NULL;

        if (head == NULL) 
        {
            head = p;
            
        }

        else
        {
            prev ->next = p;
            //prev = p;
        }
        prev = p;
        
    }
    scanf("%d",&X);
    printf("List->");
    display(head);
    printf("\n");
    printf("After Insertion");
    printf("\n");
    end(&head,X);
    printf("List->");
    display(head);
    return 0;
    



}

// input: 5 ; 15,25,35,45,55 ; 80
// output: list->15->25->35->45->55->NULL ; after insertion ; list->15->25->35->45->55->80->NULL