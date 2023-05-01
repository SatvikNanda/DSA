// Perform insertion after the target element.  Create a Linked list with N number elements and perform insertion. If the List is empty, display "List is Empty". If target element not found, display "Target Element is Not Found". 

// INPUT: 1. Number of elements     2. ELEMENTS TO BE INSERTED      3. TARGET ELEMENT T     4. ELEMENT TO BE INSERTED X

#include<stdio.h>
#include<stdlib.h>

// step:1 make structure node
struct node // a structure named node is created
{
    int data;
    struct node *next; // the structure contains a variable integer and a pointer next. 
};


// step 2: display elements before insertion
void display(struct node *head) // a function is used to display initial elements. First node of list is known as 'list' according to question
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
    
}
int target;
struct node *p, *q;
// step:3 make function to insert elements after the target element
void targetafter(struct node **head,int T, int value)
{
    
    p = malloc(sizeof(struct node));
    p ->data = value;

    q = *head;
    while(q->data != T && q ->next != NULL)
    {
        q = q ->next;
        if (q ->data == T)
        {
            p ->next = q ->next;
            q ->next = p;
        }
        if (q->data != T && q ->next == NULL)
        {
            printf("Target element not found\n");
        }
        
    }
}

// step:4 make main function
int main()
{
    struct node *prev,*head,*p;
    int N,i,X;

    scanf("%d", &N);

    head = NULL;



    
    for (i = 0; i < N; i++)
    {
        p = malloc(sizeof(struct node));
        scanf("%d", &p ->data);
        p ->next = NULL;

        
        if(head==NULL)
        {
            head = p;
        }
        
        else
        {
            prev -> next = p;
        }
        prev = p;
        
    }
    //int target;
    scanf("%d",&target);
    scanf("%d",&X);


    
    printf("List->");
    display(head);
    printf("\n");
    printf("After Insertion");
    printf("\n");
    targetafter(&head,target,X);
    printf("List->");
    display(head);
    return 0;
    



}

/*
#include <stdio.h>
#include <stdlib.h>

struct node{
    int data;
    struct node *next;
};
struct node *list = NULL;
struct node *temp=NULL,*l=NULL;

int main()
{
    int n,x;
    scanf("%d",&n);
    list = malloc(sizeof(struct node));
    scanf("%d",&x);
    list->data = x;
    list->next = NULL;
    for(int i=0; i<n-1;i++ ){
        int d;
        temp = malloc(sizeof(struct node));
        scanf("%d", &d);
        for(l=list;l->next!=NULL;l=l->next);
        temp->data = d;
        temp->next= NULL;
        l->next=temp;
    }
    
    
    int d,target;
    scanf("%d",&target);
    scanf("%d",&d);
    
    if(list==NULL)
        printf("List is empty");
    else{
        printf("List");
        for(l=list;l->next!=NULL;l=l->next){
            printf("->%d",l->data);
        }
        printf("->%d->NULL",l->data);
    }
    
    
    l = list;
    while(l->data!=target && l->next!=NULL)
    l=l->next;
    if(l->data==target){
        temp= malloc(sizeof(struct node));
        temp->data=d;
        temp->next=l->next;
        l->next=temp;
        printf("\nAfter Insertion\n");
        
        if(list==NULL)
        printf("List is empty");
        else{
            printf("List");
            for(l=list;l->next!=NULL;l=l->next){
                printf("->%d",l->data);
            }
            printf("->%d->NULL",l->data);
        }
            
        
    }else
        printf("\nTarget Element is Not Found\n");
        
    return 0;
}
*/


